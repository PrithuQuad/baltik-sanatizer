package imageconverter;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.StringReader;
import java.io.StringWriter;
import org.xml.sax.InputSource;

public class SvgStringFixer {

    public static String fixSvgOffsets(String svgInput) throws Exception {
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        dbFactory.setNamespaceAware(true); // Required for xlink
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(new InputSource(new StringReader(svgInput)));

        // ✅ Fix missing offset attributes in <stop> elements
        NodeList stops = doc.getElementsByTagName("stop");
        for (int i = 0; i < stops.getLength(); i++) {
            Element stop = (Element) stops.item(i);
            if (!stop.hasAttribute("offset")) {
                stop.setAttribute("offset", "0");
            }
        }

        // 🔁 Convert href → xlink:href on all elements
        NodeList allElements = doc.getElementsByTagName("*");
        for (int i = 0; i < allElements.getLength(); i++) {
            Element elem = (Element) allElements.item(i);
            if (elem.hasAttribute("href")) {
                String hrefValue = elem.getAttribute("href");
                elem.setAttributeNS("http://www.w3.org/1999/xlink", "xlink:href", hrefValue);
                elem.removeAttribute("href");
            }
        }

        // 🌐 Transform DOM back to string
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");

        StringWriter writer = new StringWriter();
        transformer.transform(new DOMSource(doc), new StreamResult(writer));

        return writer.toString();
    }
    
    

    // public static void main(String[] args) throws Exception {
    //     String inputSvg = """
    //         <svg xmlns="http://www.w3.org/2000/svg">
    //           <defs>
    //             <linearGradient id="grad">
    //               <stop stop-color="#fff"/>
    //               <stop offset="1" stop-color="#000"/>
    //             </linearGradient>
    //           </defs>
    //         </svg>
    //     """;

    //     String fixedSvg = fixSvgOffsets(inputSvg);
    //     System.out.println("Fixed SVG:\n" + fixedSvg);
    // }
}
