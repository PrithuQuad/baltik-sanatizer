package imageconverter;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscoderOutput;
import org.apache.batik.transcoder.image.PNGTranscoder;
import org.apache.batik.util.CleanerThread;

public class Base64ToImage {

    /**
     * Detects SVG vs. raster, and always produces a PNG.
     *
     * @param base64Data full Base64 string, with or without "data:...;base64," prefix
     * @param outputPng  path ending in ".png"
     */
   public static String saveAsPng(String base64Data, String outputPng) throws IOException {
        // 1) Strip optional prefix
        String data = base64Data.contains(",")
            ? base64Data.substring(base64Data.indexOf(',') + 1)
            : base64Data;

        byte[] bytes = Base64.getDecoder().decode(data);

        // 2) Quick check: is this SVG XML?
        String header = new String(bytes, 0, Math.min(bytes.length, 100)).trim();
        boolean isSvg = header.startsWith("<svg") || header.contains("<svg");

        // 3) Ensure output folder exists
        Path outPath = Paths.get(outputPng);
        if (outPath.getParent() != null) {
            Files.createDirectories(outPath.getParent());
        }

        if (isSvg) {
            rasterizeSvgToPng(bytes, outPath); // You’ll need to implement this method
        } else {
            Files.write(outPath, bytes); // Write raster image directly
        }

        // 4) Return Base64 of final PNG image
        byte[] pngBytes = Files.readAllBytes(outPath);
        return Base64.getEncoder().encodeToString(pngBytes);
    }

    private static void rasterizeSvgToPng(byte[] svgBytes, Path outPath) throws IOException {
        try (ByteArrayInputStream svgStream = new ByteArrayInputStream(svgBytes);
             OutputStream pngOut = Files.newOutputStream(outPath)) {

            TranscoderInput input = new TranscoderInput(svgStream);
            TranscoderOutput output = new TranscoderOutput(pngOut);

            PNGTranscoder transcoder = new PNGTranscoder();
            // Optional: set width/height hints
            // transcoder.addTranscodingHint(PNGTranscoder.KEY_WIDTH, 500f);
            transcoder.transcode(input, output);

            pngOut.flush();
            pngOut.close();
            // CleanerThread.dumpStack();

        } catch (Exception e) {
            throw new IOException("SVG→PNG conversion failed: " + e.getMessage(), e);
        }
    }

    // Demo
    // public static void main(String[] args) throws IOException {
    //     String svgBase64 = "PHN2ZyB4bWxucz0iaH...";  // truncated
    //     saveAsPng(svgBase64, "output/image.png");
    //     System.out.println("PNG generated at output/image.png");
    // }
}

