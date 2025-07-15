package imageconverter;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String svgContent= readSvgFileAsString("assets/hey.svg");
        // String svgContentutf16="<?xml version=\"1.0\" encoding=\"utf-16\"?><svg id=\"SvgGraphics1\" width=\"100%\" height=\"100%\" viewBox=\"0 -462 1240 1702\" LeftOffsetValue=\"120\" RightOffsetValue=\"120\" TopOffsetValue=\"120\" BottomOffsetValue=\"120\" xmlns=\"http://www.w3.org/2000/svg\"><defs><marker id=\"r-Arrow\" refX=\"5.5\" refY=\"5.5\" markerUnits=\"strokeWidth\" markerWidth=\"11\" markerHeight=\"11\" orient=\"auto-start-reverse\"><path stroke=\"#F00\" stroke-width=\".3mm\" d=\"M5.5,-5.5V11M5.5,5.5 2,1.6M5.5,5.5 2,9.4\" /></marker><marker id=\"g-Arrow\" refX=\"5.5\" refY=\"5.5\" markerUnits=\"strokeWidth\" markerWidth=\"11\" markerHeight=\"11\" orient=\"auto-start-reverse\"><path stroke=\"#555\" stroke-width=\".3mm\" d=\"M5.5,-5.5V11M5.5,5.5 2,1.6M5.5,5.5 2,9.4\" /></marker><radialGradient id=\"radialGradInSide99540\" cx=\"20%\" cy=\"20%\" r=\"70%\" fx=\"5%\" fy=\"5%\"><stop offset=\"0\" stop-color=\"#9ACBCE\" stop-opacity=\"0\" /><stop offset=\"1\" stop-color=\"powderblue\" stop-opacity=\"1\" /></radialGradient><radialGradient id=\"radialGradOutSide99540\" cx=\"20%\" cy=\"20%\" r=\"70%\" fx=\"5%\" fy=\"5%\"><stop offset=\"0\" stop-color=\"#9ACBCE\" stop-opacity=\"0\" /><stop offset=\"1\" stop-color=\"#4CC9F0\" stop-opacity=\"1\" /></radialGradient></defs><g id=\"ViewFromInside\" visibility=\"visible\" opacity=\"1\"><g id=\"ViewFromInside_HorDims\" visibility=\"visible\" transform=\"translate(120,60) scale(1)\"><line id=\"S-D-H3\" x1=\"0\" y1=\"0\" x2=\"190\" y2=\"0\" stroke=\"#F00\" stroke-width=\".4mm\" marker-start=\"url(#r-Arrow)\" vector-effect=\"non-scaling-stroke\" /><line id=\"E-D-H5\" x1=\"310\" y1=\"0\" x2=\"500\" y2=\"0\" stroke=\"#F00\" stroke-width=\".4mm\" marker-end=\"url(#r-Arrow)\" vector-effect=\"non-scaling-stroke\" /><line id=\"S-D-H13\" x1=\"500\" y1=\"0\" x2=\"690\" y2=\"0\" stroke=\"#F00\" stroke-width=\".4mm\" marker-start=\"url(#r-Arrow)\" vector-effect=\"non-scaling-stroke\" /><line id=\"E-D-H15\" x1=\"810\" y1=\"0\" x2=\"1000\" y2=\"0\" stroke=\"#F00\" stroke-width=\".4mm\" marker-end=\"url(#r-Arrow)\" vector-effect=\"non-scaling-stroke\" /></g><g transform=\"translate(120,60) scale(1)\"><text id=\"ViewFromInside-INT-H-0\" font-family=\"Poppins, sans-serif\" font-size=\"2em\" text-anchor=\"middle\" x=\"250\" y=\"0\" alignment-baseline=\"central\">500</text></g><g transform=\"translate(120,60) scale(1)\"><text id=\"ViewFromInside-INT-H-1\" font-family=\"Poppins, sans-serif\" font-size=\"2em\" text-anchor=\"middle\" x=\"750\" y=\"0\" alignment-baseline=\"central\">500</text></g><g id=\"ViewFromInside_VerDims\" visibility=\"visible\" transform=\"translate(60,120) scale(1)\"><line id=\"S-D-V23\" x1=\"0\" y1=\"0\" x2=\"0\" y2=\"420\" stroke=\"#F00\" stroke-width=\".4mm\" marker-start=\"url(#r-Arrow)\" vector-effect=\"non-scaling-stroke\" /><line id=\"E-D-V25\" x1=\"0\" y1=\"580\" x2=\"0\" y2=\"1000\" stroke=\"#F00\" stroke-width=\".4mm\" marker-end=\"url(#r-Arrow)\" vector-effect=\"non-scaling-stroke\" /></g><g transform=\"translate(60,120) scale(1)\"><text id=\"ViewFromInside-INT-V-0\" transform=\"rotate(-90 0,500)\" font-family=\"Poppins, sans-serif\" font-size=\"2em\" text-anchor=\"middle\" x=\"0\" y=\"500\" alignment-baseline=\"central\">1000</text></g><g id=\"ViewFromInside_SalesLineItem\" visibility=\"visible\" transform=\"translate(120,120) scale(1)\"><polygon id=\"polygon0\" fill=\"#FFF\" fill-opacity=\"1\" stroke=\"#000\" stroke-width=\"1mm\" points=\"0,1000 0,0 500,0 500,0 1000,0 1000,0 1000,1000 500,1000 500,1000 0,1000\" /><polygon id=\"whiteBG_2\" fill=\"white\" fill-opacity=\"1\" stroke=\"#000\" stroke-width=\"1mm\" points=\"32,968 32,32 468,32 532,32 968,32 968,32 968,968 532,968 468,968 32,968\" /><polygon id=\"Glass-Gradient1\" fill=\"url(#radialGradInSide99540)\" fill-opacity=\"1\" stroke=\"#000\" stroke-width=\"1mm\" points=\"32,968 32,32 468,32 532,32 968,32 968,32 968,968 532,968 468,968 32,968\" /></g><g id=\"ViewFromInside_FrameGroup\" visibility=\"visible\" transform=\"translate(120,120) scale(1)\"><polygon id=\"Profile3\" fill=\"#FFF\" fill-opacity=\"1\" stroke=\"#000\" stroke-width=\"1mm\" points=\"0,0 1000,0 942,58 58,58\" wmtt=\"S65PF3-PW\" wmpc=\"~~~51~F^A \" /><polygon id=\"Profile5\" fill=\"#FFF\" fill-opacity=\"1\" stroke=\"#000\" stroke-width=\"1mm\" points=\"0,1000 1000,1000 942,942 58,942\" wmtt=\"S65PF3-WOT-PW\" wmpc=\"~~~54~F_A \" /><polygon id=\"Profile7\" fill=\"#FFF\" fill-opacity=\"1\" stroke=\"#000\" stroke-width=\"1mm\" points=\"0,1000 0,0 58,58 58,942\" wmtt=\"S65PF3-PW\" wmpc=\"~~~1~F&lt;1 \" /><polygon id=\"Profile9\" fill=\"#FFF\" fill-opacity=\"1\" stroke=\"#000\" stroke-width=\"1mm\" points=\"1000,1000 1000,0 942,58 942,942\" wmtt=\"S65PF3-PW\" wmpc=\"~~~3~F&gt;1 \" /><polygon id=\"Glass_11\" fill=\"#0FF\" fill-opacity=\"0\" stroke=\"#000\" stroke-width=\"0mm\" points=\"532,875 532,125 875,125 875,875\" wmtt=\"SG CLEAR 8MM\" wmpc=\"~2~2~~\" /><polygon id=\"Profile13\" fill=\"#FFF\" fill-opacity=\"1\" stroke=\"#000\" stroke-width=\"1mm\" points=\"457,50 950,50 860,140 547,140\" wmtt=\"S65PS1-PW\" wmpc=\"~2~~52~S^B1\" /><polygon id=\"Profile15\" fill=\"#FFF\" fill-opacity=\"1\" stroke=\"#000\" stroke-width=\"1mm\" points=\"457,950 950,950 860,860 547,860\" wmtt=\"S65PS1-PW\" wmpc=\"~2~~55~S_B1\" /><polygon id=\"Profile17\" fill=\"#FFF\" fill-opacity=\"1\" stroke=\"#000\" stroke-width=\"1mm\" points=\"457,950 457,50 547,140 547,860\" wmtt=\"S65PS1-PW\" wmpc=\"~2~~2~S&lt;B1\" /><polygon id=\"Profile19\" fill=\"#FFF\" fill-opacity=\"1\" stroke=\"#000\" stroke-width=\"1mm\" points=\"950,950 950,50 860,140 860,860\" wmtt=\"S65PS1-PW\" wmpc=\"~2~~3~S&gt;B1\" /><polygon id=\"Profile21\" fill=\"#FFF\" fill-opacity=\"1\" stroke=\"#000\" stroke-width=\"1mm\" points=\"527,120 880,120 860,140 547,140\" wmtt=\"A65PB1-BGR3-PW\" wmpc=\"~2~~52~G^B1\" /><polygon id=\"Profile23\" fill=\"#FFF\" fill-opacity=\"1\" stroke=\"#000\" stroke-width=\"1mm\" points=\"527,880 880,880 860,860 547,860\" wmtt=\"A65PB1-BGR3-PW\" wmpc=\"~2~~55~G_B1\" /><polygon id=\"Profile25\" fill=\"#FFF\" fill-opacity=\"1\" stroke=\"#000\" stroke-width=\"1mm\" points=\"527,880 527,120 547,140 547,860\" wmtt=\"A65PB1-BGR3-PW\" wmpc=\"~2~~2~G&lt;B1\" /><polygon id=\"Profile27\" fill=\"#FFF\" fill-opacity=\"1\" stroke=\"#000\" stroke-width=\"1mm\" points=\"880,880 880,120 860,140 860,860\" wmtt=\"A65PB1-BGR3-PW\" wmpc=\"~2~~3~G&gt;B1\" /><polygon id=\"Glass_29\" fill=\"#0FF\" fill-opacity=\"0\" stroke=\"#000\" stroke-width=\"0mm\" points=\"125,875 125,125 468,125 468,875\" wmtt=\"SG CLEAR 8MM\" wmpc=\"~1~1~~\" /><polygon id=\"Profile31\" fill=\"#FFF\" fill-opacity=\"1\" stroke=\"#000\" stroke-width=\"1mm\" points=\"50,50 543,50 453,140 140,140\" wmtt=\"S65PS1-PW\" wmpc=\"~1~~51~S^A1\" /><polygon id=\"Profile33\" fill=\"#FFF\" fill-opacity=\"1\" stroke=\"#000\" stroke-width=\"1mm\" points=\"50,950 543,950 453,860 140,860\" wmtt=\"S65PS1-PW\" wmpc=\"~1~~54~S_A1\" /><polygon id=\"Profile35\" fill=\"#FFF\" fill-opacity=\"1\" stroke=\"#000\" stroke-width=\"1mm\" points=\"50,950 50,50 140,140 140,860\" wmtt=\"S65PS1-PW\" wmpc=\"~1~~1~S&lt;A1\" /><polygon id=\"Profile37\" fill=\"#FFF\" fill-opacity=\"1\" stroke=\"#000\" stroke-width=\"1mm\" points=\"543,950 543,50 453,140 453,860\" wmtt=\"S65PS1-PW\" wmpc=\"~1~~2~S&gt;A1\" /><polygon id=\"Profile39\" fill=\"#FFF\" fill-opacity=\"1\" stroke=\"#000\" stroke-width=\"1mm\" points=\"120,120 473,120 453,140 140,140\" wmtt=\"A65PB1-BGR3-PW\" wmpc=\"~1~~51~G^A1\" /><polygon id=\"Profile41\" fill=\"#FFF\" fill-opacity=\"1\" stroke=\"#000\" stroke-width=\"1mm\" points=\"120,880 473,880 453,860 140,860\" wmtt=\"A65PB1-BGR3-PW\" wmpc=\"~1~~54~G_A1\" /><polygon id=\"Profile43\" fill=\"#FFF\" fill-opacity=\"1\" stroke=\"#000\" stroke-width=\"1mm\" points=\"120,880 120,120 140,140 140,860\" wmtt=\"A65PB1-BGR3-PW\" wmpc=\"~1~~1~G&lt;A1\" /><polygon id=\"Profile45\" fill=\"#FFF\" fill-opacity=\"1\" stroke=\"#000\" stroke-width=\"1mm\" points=\"473,880 473,120 453,140 453,860\" wmtt=\"A65PB1-BGR3-PW\" wmpc=\"~1~~2~G&gt;A1\" /><image x=\"154\" y=\"-462\" width=\"692\" height=\"130\" preserveAspectRatio=\"none\" href=\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAArQAAACCCAYAAAC3gltDAAAACXBIWXMAAA7DAAAOwwHHb6hkAAAC8UlEQVR4nO3dQWoDMRAAQRn2/1+e5Bgck4MJWK2teoFOopnDzDXfFgAARF0LAADCBC0AAGmCFgCANEELAECaoAUAIE3QAgCQJmgBAEgTtAAApAlaAADSBC0AAGmCFgCANEELAECaoAUAIE3QAgCQJmgBAEgTtAAApAlaAADSBC0AAGmCFiDi8XgsgJ3MzNqBoAUAIE3QAgCQJmgBAEgTtAAApAlaAADSBC0AAGmCFgCANEELcIhd9kEC56jsvxa0AACkCVoAANIELQAAaYIWAIA0QQsAQJqgBQAgTdACAJAmaAEASBO0AAC8ZZfDC9cjcgECAABeMaEFACBN0AIAkCZoAQBIE7QAAKQJWgAA0gQtAABpghYAgLfMzNrBtctDAPibveEAr5nQAgCQJmgBAEgTtAAApAlaAADSBC0AAGmCFgCANEELAECaoAUAIE3QAgCQJmgBDuGSGHBXghYAgDRBCwBAmqAFACBN0AIAkCZoAQBIE7QAAKQJWgAA0gQtQMTMLAB+E7QAAKSlgtYVHGA3pqYAn5cKWgAAeCZoAQBIE7QAAKQJWgAA0gQtAABpghYAgDRBCwBA2lFBax8k8N/svwbY31FBCwDA/QhaAADSBC0AAGmCFgCANEELAECaoAUAIE3QAgCQJmgBAEi7LA0HeJ8/FODzTGgBAEgTtAAApAlaAADSBC0AAGmCFgCANEELAECaoAUAIO2amVVh3yOwm9IfCnAqE1oAANIELQAAaYIWAIA0QQsAQJqgBQAgTdACAJAmaAEASBO0AACkCVoAANIELQAAaUcFrdO4AAD3c1TQAgBwP4IWAIA0QQsAQJqgBQAgTdACAJAmaAEASBO0AACkpYJ2ZhYAAPyUCloAAHgmaAEASBO0AACkCVoAANIELQAAaYIWAIA0QQsAQJqgBQAgTdACAJAmaAEASBO0AACkCVoAANIELQAAaYIWAIA0QQsAQJqgBQAgTdACAJAmaAEASBO0AACkCVoAANK+AFz5JAsS2kYFAAAAAElFTkSuQmCC\" /><image x=\"59\" y=\"411\" width=\"42\" height=\"178\" preserveAspectRatio=\"none\" href=\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACoAAACyCAYAAAA09l11AAAACXBIWXMAAA7DAAAOwwHHb6hkAAABbElEQVR4nO3dQQqDMBQA0Qje/8oWF4LYKOZnNEbnLYviENMuBH/HlNKUOjCmThhKM5RmKC0bOk1tf1qHYfj7rO8VfSJDaYbSDKUZSjOUZijNUJqhNENphtIMpRlKM5RmKM1Q2rdCc0+IF9TT63DoUdzecTXRodCzkbnzorHv3aPb1TyzQutzoqtataJnLzgfF90ui6LQ2ovVaLJHI7c/HFp6odrb/95vfSuG0gylGUozlGYozVCaoTRDaYbSDKUZSjOUZijNUJqhNENphtIMpRlKM5RmKM1QmqE0Q2mG0gylGUozlGYozVCaoTRDaYbSDKUZSjOUZijNUJqhNENphtIMpX0vNPfOJzkZtjr06KVU6t362eWDAKLHb31vj17NUJqhNENpRaHEdIyoJit6+5ySOxWH1t5+Z+nkRFf19jFK24s+ejDV2h3/8fDuPdqCoTRDaYbSDKUZSsuGthzkt6fvFX0iQ2mG0gyl/QCgOkXLPOtxjAAAAABJRU5ErkJggg==\" /><line id=\"Line30\" x1=\"173\" y1=\"500\" x2=\"420\" y2=\"500\" stroke=\"#000\" stroke-width=\"1mm\" /><line id=\"Line31\" x1=\"420\" y1=\"500\" x2=\"389\" y2=\"556\" stroke=\"#000\" stroke-width=\"1mm\" /><line id=\"Line32\" x1=\"389\" y1=\"556\" x2=\"420\" y2=\"500\" stroke=\"#000\" stroke-width=\"1mm\" /><line id=\"Line33\" x1=\"420\" y1=\"500\" x2=\"389\" y2=\"444\" stroke=\"#000\" stroke-width=\"1mm\" /><line id=\"Line34\" x1=\"389\" y1=\"444\" x2=\"420\" y2=\"500\" stroke=\"#000\" stroke-width=\"1mm\" /></g><g transform=\"translate(120,120) scale(1)\"><text id=\"text3\" font-family=\"Poppins, sans-serif\" font-size=\"2em\" text-anchor=\"middle\" x=\"296\" y=\"500\" alignment-baseline=\"central\">--&gt;</text></g><g transform=\"translate(120,120) scale(1)\"><text id=\"text4\" font-family=\"Poppins, sans-serif\" font-size=\"2em\" text-anchor=\"middle\" x=\"703\" y=\"500\" alignment-baseline=\"central\">SL.FIX</text></g><g id=\"ViewFromInside_ViewFromText\" visibility=\"visible\" transform=\"translate(1,1) scale(1)\"><text id=\"text5\" font-family=\"Poppins, sans-serif\" font-size=\"2em\" text-anchor=\"middle\" x=\"620\" y=\"1235\" fill=\"blue\">Viewed from Inside</text></g></g><defs id=\"ClippingRegionDefs\"><clipPath id=\"ClippingRegion9d1f81c5-a050-4d42-8ed1-d4d91d3bba93\"><polygon points=\"32,968 32,32 468,32 532,32 968,32 968,32 968,968 532,968 468,968 32,968\" /></clipPath><clipPath id=\"ClippingRegion5a41781b-bd7d-4a51-b9b2-274336ea3cc3\"><polygon points=\"32,968 32,32 468,32 532,32 968,32 968,32 968,968 532,968 468,968 32,968\" /></clipPath></defs><g id=\"ViewFromOutside\" visibility=\"hidden\" opacity=\"0\"><g id=\"ViewFromOutside_HorDims\" visibility=\"visible\" transform=\"translate(1120,60) scale(-1,1)\"><line id=\"S-D-H38\" x1=\"0\" y1=\"0\" x2=\"190\" y2=\"0\" stroke=\"#F00\" stroke-width=\".4mm\" marker-start=\"url(#r-Arrow)\" vector-effect=\"non-scaling-stroke\" /><line id=\"E-D-H40\" x1=\"310\" y1=\"0\" x2=\"500\" y2=\"0\" stroke=\"#F00\" stroke-width=\".4mm\" marker-end=\"url(#r-Arrow)\" vector-effect=\"non-scaling-stroke\" /><line id=\"S-D-H48\" x1=\"500\" y1=\"0\" x2=\"690\" y2=\"0\" stroke=\"#F00\" stroke-width=\".4mm\" marker-start=\"url(#r-Arrow)\" vector-effect=\"non-scaling-stroke\" /><line id=\"E-D-H50\" x1=\"810\" y1=\"0\" x2=\"1000\" y2=\"0\" stroke=\"#F00\" stroke-width=\".4mm\" marker-end=\"url(#r-Arrow)\" vector-effect=\"non-scaling-stroke\" /></g><g transform=\"translate(120,60) scale(1)\"><text id=\"ViewFromOutside-INT-H-0\" font-family=\"Poppins, sans-serif\" font-size=\"2em\" text-anchor=\"middle\" x=\"750\" y=\"0\" alignment-baseline=\"central\">500</text></g><g transform=\"translate(120,60) scale(1)\"><text id=\"ViewFromOutside-INT-H-1\" font-family=\"Poppins, sans-serif\" font-size=\"2em\" text-anchor=\"middle\" x=\"250\" y=\"0\" alignment-baseline=\"central\">500</text></g><g id=\"ViewFromOutside_VerDims\" visibility=\"visible\" transform=\"translate(60,120) scale(1)\"><line id=\"S-D-V58\" x1=\"0\" y1=\"0\" x2=\"0\" y2=\"420\" stroke=\"#F00\" stroke-width=\".4mm\" marker-start=\"url(#r-Arrow)\" vector-effect=\"non-scaling-stroke\" /><line id=\"E-D-V60\" x1=\"0\" y1=\"580\" x2=\"0\" y2=\"1000\" stroke=\"#F00\" stroke-width=\".4mm\" marker-end=\"url(#r-Arrow)\" vector-effect=\"non-scaling-stroke\" /></g><g transform=\"translate(60,120) scale(1)\"><text id=\"ViewFromOutside-INT-V-0\" transform=\"rotate(-90 0,500)\" font-family=\"Poppins, sans-serif\" font-size=\"2em\" text-anchor=\"middle\" x=\"0\" y=\"500\" alignment-baseline=\"central\">1000</text></g><g id=\"ViewFromOutside_SalesLineItem\" visibility=\"visible\" transform=\"translate(1120,120) scale(-1,1)\"><polygon id=\"polygon47\" fill=\"#FFF\" fill-opacity=\"1\" stroke=\"#000\" stroke-width=\"1mm\" points=\"0,1000 0,0 500,0 500,0 1000,0 1000,0 1000,1000 500,1000 500,1000 0,1000\" /><polygon id=\"whiteBG_49\" fill=\"white\" fill-opacity=\"1\" stroke=\"#000\" stroke-width=\"1mm\" points=\"32,968 32,32 468,32 532,32 968,32 968,32 968,968 532,968 468,968 32,968\" /><polygon id=\"Glass-Gradient48\" fill=\"url(#radialGradOutSide99540)\" fill-opacity=\"1\" stroke=\"#000\" stroke-width=\"1mm\" points=\"32,968 32,32 468,32 532,32 968,32 968,32 968,968 532,968 468,968 32,968\" /></g><g id=\"ViewFromOutside_FrameGroup\" visibility=\"visible\" transform=\"translate(1120,120) scale(-1,1)\"><polygon id=\"Glass_50\" fill=\"#00BFFF\" fill-opacity=\"0\" stroke=\"#000\" stroke-width=\"0mm\" points=\"125,875 125,125 468,125 468,875\" wmtt=\"SG CLEAR 8MM\" wmpc=\"~1~1~~\" /><polygon id=\"Profile52\" fill=\"#FFF\" fill-opacity=\"1\" stroke=\"#000\" stroke-width=\"1mm\" points=\"50,50 543,50 453,140 140,140\" wmtt=\"S65PS1-PW\" wmpc=\"~1~~51~S^A1\" /><polygon id=\"Profile54\" fill=\"#FFF\" fill-opacity=\"1\" stroke=\"#000\" stroke-width=\"1mm\" points=\"50,950 543,950 453,860 140,860\" wmtt=\"S65PS1-PW\" wmpc=\"~1~~54~S_A1\" /><polygon id=\"Profile56\" fill=\"#FFF\" fill-opacity=\"1\" stroke=\"#000\" stroke-width=\"1mm\" points=\"50,950 50,50 140,140 140,860\" wmtt=\"S65PS1-PW\" wmpc=\"~1~~1~S&lt;A1\" /><polygon id=\"Profile58\" fill=\"#FFF\" fill-opacity=\"1\" stroke=\"#000\" stroke-width=\"1mm\" points=\"543,950 543,50 453,140 453,860\" wmtt=\"S65PS1-PW\" wmpc=\"~1~~2~S&gt;A1\" /><polygon id=\"Glass_60\" fill=\"#00BFFF\" fill-opacity=\"0\" stroke=\"#000\" stroke-width=\"0mm\" points=\"532,875 532,125 875,125 875,875\" wmtt=\"SG CLEAR 8MM\" wmpc=\"~2~2~~\" /><polygon id=\"Profile62\" fill=\"#FFF\" fill-opacity=\"1\" stroke=\"#000\" stroke-width=\"1mm\" points=\"457,50 950,50 860,140 547,140\" wmtt=\"S65PS1-PW\" wmpc=\"~2~~52~S^B1\" /><polygon id=\"Profile64\" fill=\"#FFF\" fill-opacity=\"1\" stroke=\"#000\" stroke-width=\"1mm\" points=\"457,950 950,950 860,860 547,860\" wmtt=\"S65PS1-PW\" wmpc=\"~2~~55~S_B1\" /><polygon id=\"Profile66\" fill=\"#FFF\" fill-opacity=\"1\" stroke=\"#000\" stroke-width=\"1mm\" points=\"457,950 457,50 547,140 547,860\" wmtt=\"S65PS1-PW\" wmpc=\"~2~~2~S&lt;B1\" /><polygon id=\"Profile68\" fill=\"#FFF\" fill-opacity=\"1\" stroke=\"#000\" stroke-width=\"1mm\" points=\"950,950 950,50 860,140 860,860\" wmtt=\"S65PS1-PW\" wmpc=\"~2~~3~S&gt;B1\" /><polygon id=\"Profile70\" fill=\"#FFF\" fill-opacity=\"1\" stroke=\"#000\" stroke-width=\"1mm\" points=\"0,0 1000,0 942,58 58,58\" wmtt=\"S65PF3-PW\" wmpc=\"~~~51~F^A \" /><polygon id=\"Profile72\" fill=\"#FFF\" fill-opacity=\"1\" stroke=\"#000\" stroke-width=\"1mm\" points=\"0,1000 1000,1000 942,942 58,942\" wmtt=\"S65PF3-WOT-PW\" wmpc=\"~~~54~F_A \" /><polygon id=\"Profile74\" fill=\"#FFF\" fill-opacity=\"1\" stroke=\"#000\" stroke-width=\"1mm\" points=\"0,1000 0,0 58,58 58,942\" wmtt=\"S65PF3-PW\" wmpc=\"~~~1~F&lt;1 \" /><polygon id=\"Profile76\" fill=\"#FFF\" fill-opacity=\"1\" stroke=\"#000\" stroke-width=\"1mm\" points=\"1000,1000 1000,0 942,58 942,942\" wmtt=\"S65PF3-PW\" wmpc=\"~~~3~F&gt;1 \" /><image x=\"154\" y=\"-462\" width=\"692\" height=\"130\" preserveAspectRatio=\"none\" href=\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAArQAAACCCAYAAAC3gltDAAAACXBIWXMAAA7DAAAOwwHHb6hkAAAC8UlEQVR4nO3dQWoDMRAAQRn2/1+e5Bgck4MJWK2teoFOopnDzDXfFgAARF0LAADCBC0AAGmCFgCANEELAECaoAUAIE3QAgCQJmgBAEgTtAAApAlaAADSBC0AAGmCFgCANEELAECaoAUAIE3QAgCQJmgBAEgTtAAApAlaAADSBC0AAGmCFiDi8XgsgJ3MzNqBoAUAIE3QAgCQJmgBAEgTtAAApAlaAADSBC0AAGmCFgCANEELcIhd9kEC56jsvxa0AACkCVoAANIELQAAaYIWAIA0QQsAQJqgBQAgTdACAJAmaAEASBO0AAC8ZZfDC9cjcgECAABeMaEFACBN0AIAkCZoAQBIE7QAAKQJWgAA0gQtAABpghYAgLfMzNrBtctDAPibveEAr5nQAgCQJmgBAEgTtAAApAlaAADSBC0AAGmCFgCANEELAECaoAUAIE3QAgCQJmgBDuGSGHBXghYAgDRBCwBAmqAFACBN0AIAkCZoAQBIE7QAAKQJWgAA0gQtQMTMLAB+E7QAAKSlgtYVHGA3pqYAn5cKWgAAeCZoAQBIE7QAAKQJWgAA0gQtAABpghYAgDRBCwBA2lFBax8k8N/svwbY31FBCwDA/QhaAADSBC0AAGmCFgCANEELAECaoAUAIE3QAgCQJmgBAEi7LA0HeJ8/FODzTGgBAEgTtAAApAlaAADSBC0AAGmCFgCANEELAECaoAUAIO2amVVh3yOwm9IfCnAqE1oAANIELQAAaYIWAIA0QQsAQJqgBQAgTdACAJAmaAEASBO0AACkCVoAANIELQAAaUcFrdO4AAD3c1TQAgBwP4IWAIA0QQsAQJqgBQAgTdACAJAmaAEASBO0AACkpYJ2ZhYAAPyUCloAAHgmaAEASBO0AACkCVoAANIELQAAaYIWAIA0QQsAQJqgBQAgTdACAJAmaAEASBO0AACkCVoAANIELQAAaYIWAIA0QQsAQJqgBQAgTdACAJAmaAEASBO0AACkCVoAANK+AFz5JAsS2kYFAAAAAElFTkSuQmCC\" /><line id=\"Line65\" x1=\"173\" y1=\"500\" x2=\"420\" y2=\"500\" stroke=\"#000\" stroke-width=\"1mm\" /><line id=\"Line66\" x1=\"420\" y1=\"500\" x2=\"389\" y2=\"556\" stroke=\"#000\" stroke-width=\"1mm\" /><line id=\"Line67\" x1=\"389\" y1=\"556\" x2=\"420\" y2=\"500\" stroke=\"#000\" stroke-width=\"1mm\" /><line id=\"Line68\" x1=\"420\" y1=\"500\" x2=\"389\" y2=\"444\" stroke=\"#000\" stroke-width=\"1mm\" /><line id=\"Line69\" x1=\"389\" y1=\"444\" x2=\"420\" y2=\"500\" stroke=\"#000\" stroke-width=\"1mm\" /></g><g transform=\"translate(120,120) scale(1)\"><text id=\"text9\" font-family=\"Poppins, sans-serif\" font-size=\"2em\" text-anchor=\"middle\" x=\"704\" y=\"500\" alignment-baseline=\"central\">--&gt;</text></g><g transform=\"translate(120,120) scale(1)\"><text id=\"text10\" font-family=\"Poppins, sans-serif\" font-size=\"2em\" text-anchor=\"middle\" x=\"297\" y=\"500\" alignment-baseline=\"central\">SL.FIX</text></g><g id=\"ViewFromOutside_ViewFromText\" visibility=\"visible\" transform=\"translate(1,1) scale(1)\"><text id=\"text11\" font-family=\"Poppins, sans-serif\" font-size=\"2em\" text-anchor=\"middle\" x=\"620\" y=\"1235\" fill=\"blue\">Viewed from Outside</text></g></g></svg>";
       
        // String svgContentutf16="<?xml version=\"1.0\" encoding=\"UTF-16\"?>\n" + //
        //                 "<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"100\" height=\"100\">\n" + //
        //                 "  <circle cx=\"50\" cy=\"50\" r=\"40\" stroke=\"black\" stroke-width=\"2\" fill=\"red\" />\n" + //
        //                 "</svg>\n" + //
        //                 "";

     String finalUtf8String=utf8Converter(svgContent);
        // String svgContent=convertUtf16SvgToUtf8("assets/img4.svg");
        
        try {
            // reencodeSvg(Paths.get("assets/img2.svg"),Paths.get("utf8img.svg"));
            System.out.println("jello");
            String outputPath = "output.png";
            System.out.println(svgContent);
            String svgContentFixed = SvgStringFixer.fixSvgOffsets(finalUtf8String);

            String base64String = svgStringToBase64(svgContentFixed);
            System.out.println(base64String);

            String finalBase64=Base64ToImage.saveAsPng(base64String, outputPath);
            System.out.println(finalBase64 + " finally");
        } catch (Exception e) {
            System.out.println(e + "error error");

           
        }

        // System.out.println(base64String);
        // ConvertImage.convertSvgToPng(svgContent, outputPath);
        // ImageConverter.convertSvgToPng(svgContent, outputPath);
        // ConvertImageToPng();
    }

    public static String svgStringToBase64(String svgContent) {
        byte[] svgBytes = svgContent.getBytes(StandardCharsets.UTF_8);
        return Base64.getEncoder().encodeToString(svgBytes);
    }

    public static String svgFileToBase64(String filePath) {
        try {
            Path path = Paths.get(filePath);
            byte[] svgBytes = Files.readAllBytes(path);
            return Base64.getEncoder().encodeToString(svgBytes);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    // public static String utf8Converter(String svgContentUtf16) {
    //     if (svgContentUtf16 == null || svgContentUtf16.isEmpty()) {
    //         return "";
    //     }

    //     // Step 1: Normalize encoding declaration to UTF-8 (case-insensitive)
    //     String updatedSvgContent = svgContentUtf16.replaceAll("(?i)encoding=\"utf-16\"", "encoding=\"UTF-8\"");

    //     // Step 2: Remove unsupported attributes for Batik
    //     updatedSvgContent = updatedSvgContent
    //             .replaceAll("(?i)\\s*auto-start-reverse\\s*=\\s*\"[^\"]*\"", "") // remove 'auto-start-reverse' attribute
    //             .replaceAll("(?i)\\s+xmlns:xlink\\s*=\\s*\"[^\"]*\"", "") // remove xlink namespace if unused
    //             .replaceAll("(?i)xlink:href\\s*=\\s*\"[^\"]*\"", "") // remove xlink:href links
    //             .replaceAll("(?i)style\\s*=\\s*\"[^\"]*expression\\([^\"]*\\)[^\"]*\"", "") // remove CSS expressions
    //             .replaceAll("(?i)\\s+on\\w+\\s*=\\s*\"[^\"]*\"", ""); // remove inline event handlers

    //     // Step 3: Remove auto-start-reverse from marker elements (Batik does not support it)
    //     updatedSvgContent = updatedSvgContent.replaceAll(
    //             "(<marker[^>]*)(\\s+orient\\s*=\\s*\"auto-start-reverse\")([^>]*>)",
    //             "$1$3"
    //     );
    //     // Also remove any remaining auto-start-reverse in orient attribute
    //     updatedSvgContent = updatedSvgContent.replaceAll(
    //             "(<marker[^>]*orient\\s*=\\s*\")auto-start-reverse(\"[^>]*>)",
    //             "$1auto$2"
    //     );

    //     // Step 4: Convert to UTF-8 bytes
    //     byte[] utf8Bytes = updatedSvgContent.getBytes(StandardCharsets.UTF_8);

    //     // Step 5: Reconstruct the string
    //     String svgContentUtf8 = new String(utf8Bytes, StandardCharsets.UTF_8);

    //     System.out.println("Sanitized & UTF-8 Encoded SVG:\n" + svgContentUtf8);
    //     return svgContentUtf8;
    // }



// public static String utf8Converter(String svgContentUtf16) {
//     if (svgContentUtf16 == null || svgContentUtf16.isEmpty()) {
//         return "";
//     }

//     String updatedSvgContent = svgContentUtf16;

//     // Step 1: Normalize encoding declaration to UTF-8 (case-insensitive)
//     updatedSvgContent = updatedSvgContent.replaceAll("(?i)encoding\\s*=\\s*[\"']utf-16[\"']", "encoding=\"UTF-8\"");

//     // Step 2: Remove unsupported attributes for Batik
//     updatedSvgContent = updatedSvgContent
//             .replaceAll("(?i)\\s*auto-start-reverse\\s*=\\s*[\"'][^\"']*[\"']", "") // remove 'auto-start-reverse' attribute
//             .replaceAll("(?i)\\s+xmlns:xlink\\s*=\\s*[\"'][^\"']*[\"']", "") // remove xlink namespace if unused
//             .replaceAll("(?i)xlink:href\\s*=\\s*[\"']([^\"']*)[\"']", "href=\"$1\"") // convert xlink:href to href properly
//             .replaceAll("(?i)style\\s*=\\s*[\"'][^\"']*expression\\([^\"']*\\)[^\"']*[\"']", "") // remove CSS expressions
//             .replaceAll("(?i)\\s+on\\w+\\s*=\\s*[\"'][^\"']*[\"']", "") // remove inline event handlers
//             .replaceAll("(?i)\\s+alignment-baseline\\s*=\\s*[\"']central[\"']", " alignment-baseline=\"middle\"") // fix central alignment-baseline
//             .replaceAll("(?i)\\s+alignment-baseline\\s*=\\s*[\"']mathematical[\"']", " alignment-baseline=\"middle\"") // fix mathematical alignment-baseline
//             .replaceAll("(?i)\\s+alignment-baseline\\s*=\\s*[\"']text-before-edge[\"']", " alignment-baseline=\"text-top\"") // fix text-before-edge
//             .replaceAll("(?i)\\s+alignment-baseline\\s*=\\s*[\"']text-after-edge[\"']", " alignment-baseline=\"text-bottom\"") // fix text-after-edge
//             .replaceAll("(?i)\\s+alignment-baseline\\s*=\\s*[\"']ideographic[\"']", " alignment-baseline=\"baseline\"") // fix ideographic
//             .replaceAll("(?i)\\s+alignment-baseline\\s*=\\s*[\"']hanging[\"']", " alignment-baseline=\"text-top\""); // fix hanging

//     // Step 3: Remove auto-start-reverse from marker elements (Batik does not support it)
//     updatedSvgContent = updatedSvgContent.replaceAll(
//             "(<marker[^>]*)(\\s+orient\\s*=\\s*[\"']auto-start-reverse[\"'])([^>]*>)",
//             "$1$3"
//     );
//     // Also replace any remaining auto-start-reverse in orient attribute with auto
//     updatedSvgContent = updatedSvgContent.replaceAll(
//             "(<marker[^>]*orient\\s*=\\s*[\"'])auto-start-reverse([\"'][^>]*>)",
//             "$1auto$2"
//     );

//     // Step 4: Remove elements that might cause issues with Batik
//     updatedSvgContent = updatedSvgContent
//             .replaceAll("(?i)<(animateMotion|animateTransform|animateColor)[^>]*>[^<]*</\\1>", "") // remove unsupported animations
//             .replaceAll("(?i)<foreignObject[^>]*>.*?</foreignObject>", "") // remove foreignObject elements
//             .replaceAll("(?i)<switch[^>]*>.*?</switch>", "") // remove switch elements
//             .replaceAll("(?i)<script[^>]*>.*?</script>", "") // remove script elements
//             .replaceAll("(?i)<style[^>]*>[^<]*javascript[^<]*</style>", ""); // remove styles with javascript

//     // Step 5: Fix common namespace issues and ensure xlink namespace is preserved for image elements
//     // First, check if we have image elements that need xlink:href
//     if (updatedSvgContent.contains("<image") && !updatedSvgContent.contains("xmlns:xlink")) {
//         // Add xlink namespace to svg root element if needed
//         updatedSvgContent = updatedSvgContent.replaceAll(
//             "(<svg[^>]*)(>)",
//             "$1 xmlns:xlink=\"http://www.w3.org/1999/xlink\"$2"
//         );
//     }
    
//     updatedSvgContent = updatedSvgContent
//             .replaceAll("(?i)\\s+xml:space\\s*=\\s*[\"']preserve[\"']", ""); // remove xml:space preserve (often problematic)

//     // Step 6: Ensure proper SVG structure
//     if (!updatedSvgContent.trim().startsWith("<?xml")) {
//         updatedSvgContent = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + updatedSvgContent;
//     }

//     // Step 7: Fix viewport and viewBox issues that can cause Batik problems
//     updatedSvgContent = updatedSvgContent
//             .replaceAll("(?i)width\\s*=\\s*[\"'][^\"']*%[\"']", "width=\"100%\"") // normalize percentage widths
//             .replaceAll("(?i)height\\s*=\\s*[\"'][^\"']*%[\"']", "height=\"100%\"") // normalize percentage heights
//             .replaceAll("(?i)\\s+preserveAspectRatio\\s*=\\s*[\"']none[\"']", ""); // remove problematic aspect ratio

//     // Step 8: Remove any remaining problematic CSS and fix alignment-baseline in style attributes
//     updatedSvgContent = updatedSvgContent
//             .replaceAll("(?i)style\\s*=\\s*[\"'][^\"']*url\\([^)]*javascript[^)]*\\)[^\"']*[\"']", "") // remove javascript URLs in CSS
//             .replaceAll("(?i)fill\\s*=\\s*[\"']url\\([^)]*javascript[^)]*\\)[\"']", "") // remove javascript URLs in fill
//             .replaceAll("(?i)stroke\\s*=\\s*[\"']url\\([^)]*javascript[^)]*\\)[\"']", "") // remove javascript URLs in stroke
//             .replaceAll("(?i)(style\\s*=\\s*[\"'][^\"']*alignment-baseline\\s*:\\s*)central([^\"']*[\"'])", "$1middle$2") // fix central in style
//             .replaceAll("(?i)(style\\s*=\\s*[\"'][^\"']*alignment-baseline\\s*:\\s*)mathematical([^\"']*[\"'])", "$1middle$2") // fix mathematical in style
//             .replaceAll("(?i)(style\\s*=\\s*[\"'][^\"']*alignment-baseline\\s*:\\s*)text-before-edge([^\"']*[\"'])", "$1text-top$2") // fix text-before-edge in style
//             .replaceAll("(?i)(style\\s*=\\s*[\"'][^\"']*alignment-baseline\\s*:\\s*)text-after-edge([^\"']*[\"'])", "$1text-bottom$2") // fix text-after-edge in style
//             .replaceAll("(?i)(style\\s*=\\s*[\"'][^\"']*alignment-baseline\\s*:\\s*)ideographic([^\"']*[\"'])", "$1baseline$2") // fix ideographic in style
//             .replaceAll("(?i)(style\\s*=\\s*[\"'][^\"']*alignment-baseline\\s*:\\s*)hanging([^\"']*[\"'])", "$1text-top$2"); // fix hanging in style

//     // Step 9: Fix text elements that might cause issues
//     updatedSvgContent = updatedSvgContent
//             .replaceAll("(?i)<text[^>]*\\s+xml:space\\s*=\\s*[\"']preserve[\"'][^>]*>", "<text>") // simplify text elements
//             .replaceAll("(?i)\\s+textLength\\s*=\\s*[\"'][^\"']*[\"']", "") // remove textLength (can cause issues)
//             .replaceAll("(?i)\\s+lengthAdjust\\s*=\\s*[\"'][^\"']*[\"']", ""); // remove lengthAdjust

//     // Step 10: Convert to UTF-8 bytes and reconstruct
//     byte[] utf8Bytes = updatedSvgContent.getBytes(StandardCharsets.UTF_8);
//     String svgContentUtf8 = new String(utf8Bytes, StandardCharsets.UTF_8);

//     // Step 11: Final cleanup - remove any duplicate spaces or empty attributes
//     svgContentUtf8 = svgContentUtf8
//             .replaceAll("\\s+", " ") // normalize whitespace
//             .replaceAll("\\s*=\\s*[\"'][\"']", "") // remove empty attributes
//             .replaceAll("\\s+>", ">") // clean up spaces before closing brackets
//             .replaceAll("<\\s+", "<"); // clean up spaces after opening brackets

//     System.out.println("Sanitized & UTF-8 Encoded SVG for Batik:\n" + svgContentUtf8);
//     return svgContentUtf8;
// }

// public static String utf8Converter(String svgContentUtf16) {
//     if (svgContentUtf16 == null || svgContentUtf16.isEmpty()) {
//         return "";
//     }

//     String updatedSvgContent = svgContentUtf16;

//     // Step 1: Normalize encoding declaration to UTF-8 (case-insensitive)
//     updatedSvgContent = updatedSvgContent.replaceAll("(?i)encoding\\s*=\\s*[\"']utf-16[\"']", "encoding=\"UTF-8\"");

//     // Step 2: Remove unsupported attributes for Batik (but preserve xlink:href for image elements)
//     updatedSvgContent = updatedSvgContent
//             .replaceAll("(?i)\\s*auto-start-reverse\\s*=\\s*[\"'][^\"']*[\"']", "") // remove 'auto-start-reverse' attribute
//             .replaceAll("(?i)style\\s*=\\s*[\"'][^\"']*expression\\([^\"']*\\)[^\"']*[\"']", "") // remove CSS expressions
//             .replaceAll("(?i)\\s+on\\w+\\s*=\\s*[\"'][^\"']*[\"']", "") // remove inline event handlers
//             .replaceAll("(?i)\\s+alignment-baseline\\s*=\\s*[\"']central[\"']", " alignment-baseline=\"middle\"") // fix central alignment-baseline
//             .replaceAll("(?i)\\s+alignment-baseline\\s*=\\s*[\"']mathematical[\"']", " alignment-baseline=\"middle\"") // fix mathematical alignment-baseline
//             .replaceAll("(?i)\\s+alignment-baseline\\s*=\\s*[\"']text-before-edge[\"']", " alignment-baseline=\"text-top\"") // fix text-before-edge
//             .replaceAll("(?i)\\s+alignment-baseline\\s*=\\s*[\"']text-after-edge[\"']", " alignment-baseline=\"text-bottom\"") // fix text-after-edge
//             .replaceAll("(?i)\\s+alignment-baseline\\s*=\\s*[\"']ideographic[\"']", " alignment-baseline=\"baseline\"") // fix ideographic
//             .replaceAll("(?i)\\s+alignment-baseline\\s*=\\s*[\"']hanging[\"']", " alignment-baseline=\"text-top\""); // fix hanging

//     // Step 2a: Convert xlink:href to href for non-image elements only
//     // Use a more comprehensive pattern to match image elements with any attributes
//     updatedSvgContent = updatedSvgContent.replaceAll("(?i)(<image[^>]*?)(xlink:href)", "$1TEMP_XLINK_HREF");
//     // Convert remaining xlink:href to href
//     updatedSvgContent = updatedSvgContent.replaceAll("(?i)xlink:href\\s*=\\s*[\"']([^\"']*)[\"']", "href=\"$1\"");
//     // Restore xlink:href for image elements
//     updatedSvgContent = updatedSvgContent.replaceAll("TEMP_XLINK_HREF", "xlink:href");

//     // Step 3: Remove auto-start-reverse from marker elements (Batik does not support it)
//     updatedSvgContent = updatedSvgContent.replaceAll(
//             "(<marker[^>]*)(\\s+orient\\s*=\\s*[\"']auto-start-reverse[\"'])([^>]*>)",
//             "$1$3"
//     );
//     // Also replace any remaining auto-start-reverse in orient attribute with auto
//     updatedSvgContent = updatedSvgContent.replaceAll(
//             "(<marker[^>]*orient\\s*=\\s*[\"'])auto-start-reverse([\"'][^>]*>)",
//             "$1auto$2"
//     );

//     // Step 4: Remove elements that might cause issues with Batik
//     updatedSvgContent = updatedSvgContent
//             .replaceAll("(?i)<(animateMotion|animateTransform|animateColor)[^>]*>[^<]*</\\1>", "") // remove unsupported animations
//             .replaceAll("(?i)<foreignObject[^>]*>.*?</foreignObject>", "") // remove foreignObject elements
//             .replaceAll("(?i)<switch[^>]*>.*?</switch>", "") // remove switch elements
//             .replaceAll("(?i)<script[^>]*>.*?</script>", "") // remove script elements
//             .replaceAll("(?i)<style[^>]*>[^<]*javascript[^<]*</style>", ""); // remove styles with javascript

//     // Step 5: Fix common namespace issues and ensure xlink namespace is preserved for image elements
//     // Always ensure xlink namespace is present if we have image elements or xlink:href
//     if (updatedSvgContent.contains("<image") || updatedSvgContent.contains("xlink:href")) {
//         // Add xlink namespace to svg root element if not present
//         if (!updatedSvgContent.contains("xmlns:xlink")) {
//             updatedSvgContent = updatedSvgContent.replaceAll(
//                 "(<svg[^>]*?)(>)",
//                 "$1 xmlns:xlink=\"http://www.w3.org/1999/xlink\"$2"
//             );
//         }
//     } else {
//         // Only remove unused xlink namespace if no image elements
//         updatedSvgContent = updatedSvgContent.replaceAll("(?i)\\s+xmlns:xlink\\s*=\\s*[\"'][^\"']*[\"']", "");
//     }
    
//     updatedSvgContent = updatedSvgContent
//             .replaceAll("(?i)\\s+xml:space\\s*=\\s*[\"']preserve[\"']", ""); // remove xml:space preserve (often problematic)

//     // Step 6: Ensure proper SVG structure
//     if (!updatedSvgContent.trim().startsWith("<?xml")) {
//         updatedSvgContent = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + updatedSvgContent;
//     }

//     // Step 7: Fix viewport and viewBox issues that can cause Batik problems
//     updatedSvgContent = updatedSvgContent
//             .replaceAll("(?i)width\\s*=\\s*[\"'][^\"']*%[\"']", "width=\"100%\"") // normalize percentage widths
//             .replaceAll("(?i)height\\s*=\\s*[\"'][^\"']*%[\"']", "height=\"100%\"") // normalize percentage heights
//             .replaceAll("(?i)\\s+preserveAspectRatio\\s*=\\s*[\"']none[\"']", ""); // remove problematic aspect ratio

//     // Step 8: Remove any remaining problematic CSS and fix alignment-baseline in style attributes
//     updatedSvgContent = updatedSvgContent
//             .replaceAll("(?i)style\\s*=\\s*[\"'][^\"']*url\\([^)]*javascript[^)]*\\)[^\"']*[\"']", "") // remove javascript URLs in CSS
//             .replaceAll("(?i)fill\\s*=\\s*[\"']url\\([^)]*javascript[^)]*\\)[\"']", "") // remove javascript URLs in fill
//             .replaceAll("(?i)stroke\\s*=\\s*[\"']url\\([^)]*javascript[^)]*\\)[\"']", "") // remove javascript URLs in stroke
//             .replaceAll("(?i)(style\\s*=\\s*[\"'][^\"']*alignment-baseline\\s*:\\s*)central([^\"']*[\"'])", "$1middle$2") // fix central in style
//             .replaceAll("(?i)(style\\s*=\\s*[\"'][^\"']*alignment-baseline\\s*:\\s*)mathematical([^\"']*[\"'])", "$1middle$2") // fix mathematical in style
//             .replaceAll("(?i)(style\\s*=\\s*[\"'][^\"']*alignment-baseline\\s*:\\s*)text-before-edge([^\"']*[\"'])", "$1text-top$2") // fix text-before-edge in style
//             .replaceAll("(?i)(style\\s*=\\s*[\"'][^\"']*alignment-baseline\\s*:\\s*)text-after-edge([^\"']*[\"'])", "$1text-bottom$2") // fix text-after-edge in style
//             .replaceAll("(?i)(style\\s*=\\s*[\"'][^\"']*alignment-baseline\\s*:\\s*)ideographic([^\"']*[\"'])", "$1baseline$2") // fix ideographic in style
//             .replaceAll("(?i)(style\\s*=\\s*[\"'][^\"']*alignment-baseline\\s*:\\s*)hanging([^\"']*[\"'])", "$1text-top$2"); // fix hanging in style

//     // Step 9: Fix text elements that might cause issues
//     updatedSvgContent = updatedSvgContent
//             .replaceAll("(?i)<text[^>]*\\s+xml:space\\s*=\\s*[\"']preserve[\"'][^>]*>", "<text>") // simplify text elements
//             .replaceAll("(?i)\\s+textLength\\s*=\\s*[\"'][^\"']*[\"']", "") // remove textLength (can cause issues)
//             .replaceAll("(?i)\\s+lengthAdjust\\s*=\\s*[\"'][^\"']*[\"']", ""); // remove lengthAdjust

//     // Step 10: Convert to UTF-8 bytes and reconstruct
//     byte[] utf8Bytes = updatedSvgContent.getBytes(StandardCharsets.UTF_8);
//     String svgContentUtf8 = new String(utf8Bytes, StandardCharsets.UTF_8);

//     // Step 11: Final cleanup - remove any duplicate spaces or empty attributes
//     svgContentUtf8 = svgContentUtf8
//             .replaceAll("\\s+", " ") // normalize whitespace
//             .replaceAll("\\s*=\\s*[\"'][\"']", "") // remove empty attributes
//             .replaceAll("\\s+>", ">") // clean up spaces before closing brackets
//             .replaceAll("<\\s+", "<"); // clean up spaces after opening brackets

//     System.out.println("Sanitized & UTF-8 Encoded SVG for Batik:\n" + svgContentUtf8);
//     return svgContentUtf8;
// }

// public static String utf8Converter(String svgContentUtf16) {
//     if (svgContentUtf16 == null || svgContentUtf16.isEmpty()) {
//         return "";
//     }

//     String updatedSvgContent = svgContentUtf16;

//     // Step 1: Normalize encoding declaration to UTF-8 (case-insensitive)
//     updatedSvgContent = updatedSvgContent.replaceAll("(?i)encoding\\s*=\\s*[\"']utf-16[\"']", "encoding=\"UTF-8\"");

//     // Step 2: Remove unsupported attributes for Batik (but preserve xlink:href for image elements)
//     updatedSvgContent = updatedSvgContent
//             .replaceAll("(?i)\\s*auto-start-reverse\\s*=\\s*[\"'][^\"']*[\"']", "") // remove 'auto-start-reverse' attribute
//             .replaceAll("(?i)style\\s*=\\s*[\"'][^\"']*expression\\([^\"']*\\)[^\"']*[\"']", "") // remove CSS expressions
//             .replaceAll("(?i)\\s+on\\w+\\s*=\\s*[\"'][^\"']*[\"']", "") // remove inline event handlers
//             .replaceAll("(?i)\\s+alignment-baseline\\s*=\\s*[\"']central[\"']", " alignment-baseline=\"middle\"") // fix central alignment-baseline
//             .replaceAll("(?i)\\s+alignment-baseline\\s*=\\s*[\"']mathematical[\"']", " alignment-baseline=\"middle\"") // fix mathematical alignment-baseline
//             .replaceAll("(?i)\\s+alignment-baseline\\s*=\\s*[\"']text-before-edge[\"']", " alignment-baseline=\"text-top\"") // fix text-before-edge
//             .replaceAll("(?i)\\s+alignment-baseline\\s*=\\s*[\"']text-after-edge[\"']", " alignment-baseline=\"text-bottom\"") // fix text-after-edge
//             .replaceAll("(?i)\\s+alignment-baseline\\s*=\\s*[\"']ideographic[\"']", " alignment-baseline=\"baseline\"") // fix ideographic
//             .replaceAll("(?i)\\s+alignment-baseline\\s*=\\s*[\"']hanging[\"']", " alignment-baseline=\"text-top\""); // fix hanging

//     // Step 2a: Convert xlink:href to href for non-image elements only
//     // First preserve image elements by temporarily marking them
//     updatedSvgContent = updatedSvgContent.replaceAll("(?i)(<image[^>]*)(xlink:href)", "$1TEMP_XLINK_HREF");
//     // Convert remaining xlink:href to href
//     updatedSvgContent = updatedSvgContent.replaceAll("(?i)xlink:href\\s*=\\s*[\"']([^\"']*)[\"']", "href=\"$1\"");
//     // Restore xlink:href for image elements
//     updatedSvgContent = updatedSvgContent.replaceAll("TEMP_XLINK_HREF", "xlink:href");

//     // Step 3: Remove auto-start-reverse from marker elements (Batik does not support it)
//     updatedSvgContent = updatedSvgContent.replaceAll(
//             "(<marker[^>]*)(\\s+orient\\s*=\\s*[\"']auto-start-reverse[\"'])([^>]*>)",
//             "$1$3"
//     );
//     // Also replace any remaining auto-start-reverse in orient attribute with auto
//     updatedSvgContent = updatedSvgContent.replaceAll(
//             "(<marker[^>]*orient\\s*=\\s*[\"'])auto-start-reverse([\"'][^>]*>)",
//             "$1auto$2"
//     );

//     // Step 4: Remove elements that might cause issues with Batik
//     updatedSvgContent = updatedSvgContent
//             .replaceAll("(?i)<(animateMotion|animateTransform|animateColor)[^>]*>[^<]*</\\1>", "") // remove unsupported animations
//             .replaceAll("(?i)<foreignObject[^>]*>.*?</foreignObject>", "") // remove foreignObject elements
//             .replaceAll("(?i)<switch[^>]*>.*?</switch>", "") // remove switch elements
//             .replaceAll("(?i)<script[^>]*>.*?</script>", "") // remove script elements
//             .replaceAll("(?i)<style[^>]*>[^<]*javascript[^<]*</style>", ""); // remove styles with javascript

//     // Step 5: Fix common namespace issues and ensure xlink namespace is preserved for image elements
//     // Always ensure xlink namespace is present if we have image elements or xlink:href
//     if (updatedSvgContent.contains("<image") || updatedSvgContent.contains("xlink:href")) {
//         // Add xlink namespace to svg root element if not present
//         if (!updatedSvgContent.contains("xmlns:xlink")) {
//             updatedSvgContent = updatedSvgContent.replaceAll(
//                 "(<svg[^>]*)(>)",
//                 "$1 xmlns:xlink=\"http://www.w3.org/1999/xlink\"$2"
//             );
//         }
//     } else {
//         // Only remove unused xlink namespace if no image elements
//         updatedSvgContent = updatedSvgContent.replaceAll("(?i)\\s+xmlns:xlink\\s*=\\s*[\"'][^\"']*[\"']", "");
//     }
    
//     updatedSvgContent = updatedSvgContent
//             .replaceAll("(?i)\\s+xml:space\\s*=\\s*[\"']preserve[\"']", ""); // remove xml:space preserve (often problematic)

//     // Step 6: Ensure proper SVG structure
//     if (!updatedSvgContent.trim().startsWith("<?xml")) {
//         updatedSvgContent = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + updatedSvgContent;
//     }

//     // Step 7: Fix viewport and viewBox issues that can cause Batik problems
//     updatedSvgContent = updatedSvgContent
//             .replaceAll("(?i)width\\s*=\\s*[\"'][^\"']*%[\"']", "width=\"100%\"") // normalize percentage widths
//             .replaceAll("(?i)height\\s*=\\s*[\"'][^\"']*%[\"']", "height=\"100%\"") // normalize percentage heights
//             .replaceAll("(?i)\\s+preserveAspectRatio\\s*=\\s*[\"']none[\"']", ""); // remove problematic aspect ratio

//     // Step 8: Remove any remaining problematic CSS and fix alignment-baseline in style attributes
//     updatedSvgContent = updatedSvgContent
//             .replaceAll("(?i)style\\s*=\\s*[\"'][^\"']*url\\([^)]*javascript[^)]*\\)[^\"']*[\"']", "") // remove javascript URLs in CSS
//             .replaceAll("(?i)fill\\s*=\\s*[\"']url\\([^)]*javascript[^)]*\\)[\"']", "") // remove javascript URLs in fill
//             .replaceAll("(?i)stroke\\s*=\\s*[\"']url\\([^)]*javascript[^)]*\\)[\"']", "") // remove javascript URLs in stroke
//             .replaceAll("(?i)(style\\s*=\\s*[\"'][^\"']*alignment-baseline\\s*:\\s*)central([^\"']*[\"'])", "$1middle$2") // fix central in style
//             .replaceAll("(?i)(style\\s*=\\s*[\"'][^\"']*alignment-baseline\\s*:\\s*)mathematical([^\"']*[\"'])", "$1middle$2") // fix mathematical in style
//             .replaceAll("(?i)(style\\s*=\\s*[\"'][^\"']*alignment-baseline\\s*:\\s*)text-before-edge([^\"']*[\"'])", "$1text-top$2") // fix text-before-edge in style
//             .replaceAll("(?i)(style\\s*=\\s*[\"'][^\"']*alignment-baseline\\s*:\\s*)text-after-edge([^\"']*[\"'])", "$1text-bottom$2") // fix text-after-edge in style
//             .replaceAll("(?i)(style\\s*=\\s*[\"'][^\"']*alignment-baseline\\s*:\\s*)ideographic([^\"']*[\"'])", "$1baseline$2") // fix ideographic in style
//             .replaceAll("(?i)(style\\s*=\\s*[\"'][^\"']*alignment-baseline\\s*:\\s*)hanging([^\"']*[\"'])", "$1text-top$2"); // fix hanging in style

//     // Step 9: Fix text elements that might cause issues
//     updatedSvgContent = updatedSvgContent
//             .replaceAll("(?i)<text[^>]*\\s+xml:space\\s*=\\s*[\"']preserve[\"'][^>]*>", "<text>") // simplify text elements
//             .replaceAll("(?i)\\s+textLength\\s*=\\s*[\"'][^\"']*[\"']", "") // remove textLength (can cause issues)
//             .replaceAll("(?i)\\s+lengthAdjust\\s*=\\s*[\"'][^\"']*[\"']", ""); // remove lengthAdjust

//     // Step 10: Convert to UTF-8 bytes and reconstruct
//     byte[] utf8Bytes = updatedSvgContent.getBytes(StandardCharsets.UTF_8);
//     String svgContentUtf8 = new String(utf8Bytes, StandardCharsets.UTF_8);

//     // Step 11: Final cleanup - remove any duplicate spaces or empty attributes
//     svgContentUtf8 = svgContentUtf8
//             .replaceAll("\\s+", " ") // normalize whitespace
//             .replaceAll("\\s*=\\s*[\"'][\"']", "") // remove empty attributes
//             .replaceAll("\\s+>", ">") // clean up spaces before closing brackets
//             .replaceAll("<\\s+", "<"); // clean up spaces after opening brackets

//     System.out.println("Sanitized & UTF-8 Encoded SVG for Batik:\n" + svgContentUtf8);
//     return svgContentUtf8;
// }


public static String utf8Converter(String svgContentUtf16) {
    if (svgContentUtf16 == null || svgContentUtf16.isEmpty()) {
        return "";
    }

    String updatedSvgContent = svgContentUtf16;

    // Step 1: Normalize encoding declaration to UTF-8 (case-insensitive)
    updatedSvgContent = updatedSvgContent.replaceAll("(?i)encoding\\s*=\\s*[\"']utf-16[\"']", "encoding=\"UTF-8\"");

    // Step 2: Remove unsupported attributes for Batik (but preserve xlink:href for image elements)
    updatedSvgContent = updatedSvgContent
            .replaceAll("(?i)\\s*auto-start-reverse\\s*=\\s*[\"'][^\"']*[\"']", "") // remove 'auto-start-reverse' attribute
            .replaceAll("(?i)style\\s*=\\s*[\"'][^\"']*expression\\([^\"']*\\)[^\"']*[\"']", "") // remove CSS expressions
            .replaceAll("(?i)\\s+on\\w+\\s*=\\s*[\"'][^\"']*[\"']", "") // remove inline event handlers
            .replaceAll("(?i)\\s+alignment-baseline\\s*=\\s*[\"']central[\"']", " alignment-baseline=\"middle\"") // fix central alignment-baseline
            .replaceAll("(?i)\\s+alignment-baseline\\s*=\\s*[\"']mathematical[\"']", " alignment-baseline=\"middle\"") // fix mathematical alignment-baseline
            .replaceAll("(?i)\\s+alignment-baseline\\s*=\\s*[\"']text-before-edge[\"']", " alignment-baseline=\"text-top\"") // fix text-before-edge
            .replaceAll("(?i)\\s+alignment-baseline\\s*=\\s*[\"']text-after-edge[\"']", " alignment-baseline=\"text-bottom\"") // fix text-after-edge
            .replaceAll("(?i)\\s+alignment-baseline\\s*=\\s*[\"']ideographic[\"']", " alignment-baseline=\"baseline\"") // fix ideographic
            .replaceAll("(?i)\\s+alignment-baseline\\s*=\\s*[\"']hanging[\"']", " alignment-baseline=\"text-top\""); // fix hanging

    // Step 2a: Convert xlink:href to href for non-image elements only
    // Use a more comprehensive pattern to match image elements with any attributes
    updatedSvgContent = updatedSvgContent.replaceAll("(?i)(<image[^>]*?)(xlink:href)", "$1TEMP_XLINK_HREF");
    // Convert remaining xlink:href to href
    updatedSvgContent = updatedSvgContent.replaceAll("(?i)xlink:href\\s*=\\s*[\"']([^\"']*)[\"']", "href=\"$1\"");
    // Restore xlink:href for image elements
    updatedSvgContent = updatedSvgContent.replaceAll("TEMP_XLINK_HREF", "xlink:href");

    // Step 3: Remove auto-start-reverse from marker elements (Batik does not support it)
    updatedSvgContent = updatedSvgContent.replaceAll(
            "(<marker[^>]*)(\\s+orient\\s*=\\s*[\"']auto-start-reverse[\"'])([^>]*>)",
            "$1$3"
    );
    // Also replace any remaining auto-start-reverse in orient attribute with auto
    updatedSvgContent = updatedSvgContent.replaceAll(
            "(<marker[^>]*orient\\s*=\\s*[\"'])auto-start-reverse([\"'][^>]*>)",
            "$1auto$2"
    );

    // Step 4: Remove elements that might cause issues with Batik
    updatedSvgContent = updatedSvgContent
            .replaceAll("(?i)<(animateMotion|animateTransform|animateColor)[^>]*>[^<]*</\\1>", "") // remove unsupported animations
            .replaceAll("(?i)<foreignObject[^>]*>.*?</foreignObject>", "") // remove foreignObject elements
            .replaceAll("(?i)<switch[^>]*>.*?</switch>", "") // remove switch elements
            .replaceAll("(?i)<script[^>]*>.*?</script>", "") // remove script elements
            .replaceAll("(?i)<style[^>]*>[^<]*javascript[^<]*</style>", ""); // remove styles with javascript

    // Step 4a: Remove unsupported filter elements that cause Batik errors
    updatedSvgContent = updatedSvgContent
            .replaceAll("(?i)<feDropShadow[^>]*/>", "") // remove self-closing feDropShadow elements
            .replaceAll("(?i)<feDropShadow[^>]*>.*?</feDropShadow>", "") // remove feDropShadow elements with content
            .replaceAll("(?i)<feFlood[^>]*flood-color\\s*=\\s*[\"']rgba\\([^)]*\\)[\"'][^>]*/>", "") // remove feFlood with rgba colors
            .replaceAll("(?i)<feFlood[^>]*flood-color\\s*=\\s*[\"']rgba\\([^)]*\\)[\"'][^>]*>.*?</feFlood>", "") // remove feFlood with rgba colors
            .replaceAll("(?i)<feBlend[^>]*mode\\s*=\\s*[\"'](multiply|screen|overlay|darken|lighten|color-dodge|color-burn|hard-light|soft-light|difference|exclusion|hue|saturation|color|luminosity)[\"'][^>]*/>", "") // remove advanced blend modes
            .replaceAll("(?i)<feBlend[^>]*mode\\s*=\\s*[\"'](multiply|screen|overlay|darken|lighten|color-dodge|color-burn|hard-light|soft-light|difference|exclusion|hue|saturation|color|luminosity)[\"'][^>]*>.*?</feBlend>", "") // remove advanced blend modes
            .replaceAll("(?i)<feColorMatrix[^>]*type\\s*=\\s*[\"']hueRotate[\"'][^>]*/>", "") // remove hueRotate color matrix
            .replaceAll("(?i)<feColorMatrix[^>]*type\\s*=\\s*[\"']hueRotate[\"'][^>]*>.*?</feColorMatrix>", "") // remove hueRotate color matrix
            .replaceAll("(?i)<feTurbulence[^>]*/>", "") // remove feTurbulence elements
            .replaceAll("(?i)<feTurbulence[^>]*>.*?</feTurbulence>", "") // remove feTurbulence elements
            .replaceAll("(?i)<feConvolveMatrix[^>]*/>", "") // remove feConvolveMatrix elements
            .replaceAll("(?i)<feConvolveMatrix[^>]*>.*?</feConvolveMatrix>", "") // remove feConvolveMatrix elements
            .replaceAll("(?i)<feMorphology[^>]*/>", "") // remove feMorphology elements
            .replaceAll("(?i)<feMorphology[^>]*>.*?</feMorphology>", ""); // remove feMorphology elements

    // Step 4b: Clean up empty filter elements after removing unsupported children
    updatedSvgContent = updatedSvgContent
            .replaceAll("(?i)<filter[^>]*>\\s*</filter>", "") // remove empty filter elements
            .replaceAll("(?i)<filter[^>]*/>", "") // remove self-closing empty filter elements
            .replaceAll("(?i)<defs[^>]*>\\s*</defs>", "") // remove empty defs elements
            .replaceAll("(?i)<defs[^>]*/>", ""); // remove self-closing empty defs elements

    // Step 4c: Remove filter references from elements if the filter was removed
    updatedSvgContent = updatedSvgContent
            .replaceAll("(?i)\\s+filter\\s*=\\s*[\"']url\\(#[^)]*\\)[\"']", "") // remove filter references
            .replaceAll("(?i)(style\\s*=\\s*[\"'][^\"']*?)filter\\s*:\\s*url\\([^)]*\\);?([^\"']*[\"'])", "$1$2"); // remove filter from style attributes

    // Step 5: Fix common namespace issues and ensure xlink namespace is preserved for image elements
    // Always ensure xlink namespace is present if we have image elements or xlink:href
    if (updatedSvgContent.contains("<image") || updatedSvgContent.contains("xlink:href")) {
        // Add xlink namespace to svg root element if not present
        if (!updatedSvgContent.contains("xmlns:xlink")) {
            updatedSvgContent = updatedSvgContent.replaceAll(
                "(<svg[^>]*?)(>)",
                "$1 xmlns:xlink=\"http://www.w3.org/1999/xlink\"$2"
            );
        }
    } else {
        // Only remove unused xlink namespace if no image elements
        updatedSvgContent = updatedSvgContent.replaceAll("(?i)\\s+xmlns:xlink\\s*=\\s*[\"'][^\"']*[\"']", "");
    }
    
    updatedSvgContent = updatedSvgContent
            .replaceAll("(?i)\\s+xml:space\\s*=\\s*[\"']preserve[\"']", ""); // remove xml:space preserve (often problematic)

    // Step 6: Ensure proper SVG structure
    if (!updatedSvgContent.trim().startsWith("<?xml")) {
        updatedSvgContent = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + updatedSvgContent;
    }

    // Step 7: Fix viewport and viewBox issues that can cause Batik problems
    updatedSvgContent = updatedSvgContent
            .replaceAll("(?i)width\\s*=\\s*[\"'][^\"']*%[\"']", "width=\"100%\"") // normalize percentage widths
            .replaceAll("(?i)height\\s*=\\s*[\"'][^\"']*%[\"']", "height=\"100%\"") // normalize percentage heights
            .replaceAll("(?i)\\s+preserveAspectRatio\\s*=\\s*[\"']none[\"']", ""); // remove problematic aspect ratio

    // Step 8: Remove any remaining problematic CSS and fix alignment-baseline in style attributes
    updatedSvgContent = updatedSvgContent
            .replaceAll("(?i)style\\s*=\\s*[\"'][^\"']*url\\([^)]*javascript[^)]*\\)[^\"']*[\"']", "") // remove javascript URLs in CSS
            .replaceAll("(?i)fill\\s*=\\s*[\"']url\\([^)]*javascript[^)]*\\)[\"']", "") // remove javascript URLs in fill
            .replaceAll("(?i)stroke\\s*=\\s*[\"']url\\([^)]*javascript[^)]*\\)[\"']", "") // remove javascript URLs in stroke
            .replaceAll("(?i)(style\\s*=\\s*[\"'][^\"']*alignment-baseline\\s*:\\s*)central([^\"']*[\"'])", "$1middle$2") // fix central in style
            .replaceAll("(?i)(style\\s*=\\s*[\"'][^\"']*alignment-baseline\\s*:\\s*)mathematical([^\"']*[\"'])", "$1middle$2") // fix mathematical in style
            .replaceAll("(?i)(style\\s*=\\s*[\"'][^\"']*alignment-baseline\\s*:\\s*)text-before-edge([^\"']*[\"'])", "$1text-top$2") // fix text-before-edge in style
            .replaceAll("(?i)(style\\s*=\\s*[\"'][^\"']*alignment-baseline\\s*:\\s*)text-after-edge([^\"']*[\"'])", "$1text-bottom$2") // fix text-after-edge in style
            .replaceAll("(?i)(style\\s*=\\s*[\"'][^\"']*alignment-baseline\\s*:\\s*)ideographic([^\"']*[\"'])", "$1baseline$2") // fix ideographic in style
            .replaceAll("(?i)(style\\s*=\\s*[\"'][^\"']*alignment-baseline\\s*:\\s*)hanging([^\"']*[\"'])", "$1text-top$2"); // fix hanging in style

    // Step 8a: Remove CSS animations and transforms that Batik doesn't support
    updatedSvgContent = updatedSvgContent
            .replaceAll("(?i)<style[^>]*>[^<]*@keyframes[^<]*</style>", "") // remove CSS keyframes
            .replaceAll("(?i)<style[^>]*>[^<]*animation[^<]*</style>", "") // remove CSS animations
            .replaceAll("(?i)(style\\s*=\\s*[\"'][^\"']*?)animation[^;]*;?([^\"']*[\"'])", "$1$2") // remove animation from style
            .replaceAll("(?i)(style\\s*=\\s*[\"'][^\"']*?)transform[^;]*;?([^\"']*[\"'])", "$1$2") // remove transform from style
            .replaceAll("(?i)\\s+class\\s*=\\s*[\"'][^\"']*[\"']", ""); // remove class attributes as CSS classes might not work

    // Step 9: Fix text elements that might cause issues
    updatedSvgContent = updatedSvgContent
            .replaceAll("(?i)<text[^>]*\\s+xml:space\\s*=\\s*[\"']preserve[\"'][^>]*>", "<text>") // simplify text elements
            .replaceAll("(?i)\\s+textLength\\s*=\\s*[\"'][^\"']*[\"']", "") // remove textLength (can cause issues)
            .replaceAll("(?i)\\s+lengthAdjust\\s*=\\s*[\"'][^\"']*[\"']", ""); // remove lengthAdjust

    // Step 10: Convert to UTF-8 bytes and reconstruct
    byte[] utf8Bytes = updatedSvgContent.getBytes(StandardCharsets.UTF_8);
    String svgContentUtf8 = new String(utf8Bytes, StandardCharsets.UTF_8);

    // Step 11: Final cleanup - remove any duplicate spaces or empty attributes
    svgContentUtf8 = svgContentUtf8
            .replaceAll("\\s+", " ") // normalize whitespace
            .replaceAll("\\s*=\\s*[\"'][\"']", "") // remove empty attributes
            .replaceAll("\\s+>", ">") // clean up spaces before closing brackets
            .replaceAll("<\\s+", "<"); // clean up spaces after opening brackets

    System.out.println("Sanitized & UTF-8 Encoded SVG for Batik:\n" + svgContentUtf8);
    return svgContentUtf8;
}
    public static String convertUtf16SvgToUtf8(String filePath) {
        try {
            byte[] rawBytes = Files.readAllBytes(Paths.get(filePath));
            String utf16Content = new String(rawBytes, StandardCharsets.UTF_16);
           System.out.println(utf16Content);

            // Re-encode as UTF-8
            byte[] utf8Bytes = utf16Content.getBytes(StandardCharsets.UTF_8);
            return new String(utf8Bytes, StandardCharsets.UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public static void reencodeSvg(Path source, Path target) throws Exception {
    // 1. Read the entire file as UTF-16
    Charset utf16 = StandardCharsets.UTF_16;
    String xml = Files.readString(source, utf16);

    // 2. Prepend correct XML header, then write as UTF-8 (no BOM)
    String header = "<?xml version=\"1.0\" encoding=\"utf-8\"?>";
    byte[] utf8Bytes = (header + xml).getBytes(StandardCharsets.UTF_8);

    Files.write(target, utf8Bytes);
}
    
    public static String readSvgFileAsString(String filePath) {
        try {
            Path path = Paths.get(filePath);
            byte[] svgBytes = Files.readAllBytes(path);
            return new String(svgBytes, StandardCharsets.UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String cleanSvgContent(String filePath) {
        try {
            byte[] rawBytes = Files.readAllBytes(Paths.get(filePath));
            String rawContent = new String(rawBytes, StandardCharsets.UTF_8);

            // Remove BOM and any non-XML characters before the prolog
            String cleaned = rawContent.trim().replaceFirst("^([\\W]+)<", "<");
            return cleaned;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void saveImageFromBase64(String base64Image, String outputPath) throws IOException {
        // Strip off the data URI prefix if present (e.g. "data:image/png;base64,")
        String[] parts = base64Image.split(",");
        String imageData = parts.length > 1 ? parts[1] : parts[0];

        // Decode Base64 to raw bytes
        byte[] imageBytes = Base64.getDecoder().decode(imageData);

        // Ensure parent directories exist
        Path path = Paths.get(outputPath);
        if (path.getParent() != null) {
            Files.createDirectories(path.getParent());
        }

        // Write bytes to file
        Files.write(path, imageBytes);
    }

}
// public class ImageConverter {

// // public static void main(String[] args) {
// // String svgContent = "<svg width=\"200\" height=\"100\">" +
// // "<rect width=\"200\" height=\"100\"
// style=\"fill:rgb(0,0,255);stroke-width:3;stroke:rgb(0,0,0)\"/>" +
// // "</svg>";
// // String outputPath = "output.png";

// // convertSvgToPng(svgContent, outputPath);
// // }
// }
