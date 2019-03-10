package regression;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
class ErrorTest0 {

    static boolean debug = false;

    @Test
    void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        com.lowagie.text.Font font1 = null;
        com.lowagie.text.Footnote footnote2 = new com.lowagie.text.Footnote("", font1);
        com.lowagie.text.HeaderFooter headerFooter4 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote2, true);
        headerFooter4.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle7 = headerFooter4.rotate();
        com.lowagie.text.pdf.PdfShadingPattern pdfShadingPattern8 = null;
        com.lowagie.text.pdf.ShadingColor shadingColor9 = new com.lowagie.text.pdf.ShadingColor(pdfShadingPattern8);
        headerFooter4.setBorderColorRight((java.awt.Color) shadingColor9);
        headerFooter4.setBorderWidthRight((float) 23);
        assertTrue(shadingColor9.equals(shadingColor9) ? shadingColor9.hashCode() == shadingColor9.hashCode() : true, "Contract failed: equals-hashcode on shadingColor9 and shadingColor9");
    }

    @Test
    void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.lowagie.text.pdf.BidiLine bidiLine0 = new com.lowagie.text.pdf.BidiLine();
        float f3 = bidiLine0.getWidth((int) 'È', (-56509343));
        float f6 = bidiLine0.getWidth(3, 16384);
    }

    @Test
    void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper0 = new com.lowagie.text.pdf.PdfPageEventHelper();
        java.io.OutputStream outputStream1 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields3 = new com.lowagie.text.pdf.PdfCopyFields(outputStream1, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter4 = pdfCopyFields3.getWriter();
        com.lowagie.text.Font font6 = null;
        com.lowagie.text.Footnote footnote7 = new com.lowagie.text.Footnote("", font6);
        com.lowagie.text.HeaderFooter headerFooter9 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote7, true);
        headerFooter9.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle12 = headerFooter9.rotate();
        com.lowagie.text.Rectangle rectangle13 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter9);
        com.lowagie.text.Document document14 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter9);
        boolean b16 = document14.setMarginMirroringTopBottom(true);
        com.lowagie.text.Font font20 = null;
        com.lowagie.text.Footnote footnote21 = new com.lowagie.text.Footnote("", font20);
        com.lowagie.text.HeaderFooter headerFooter23 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote21, true);
        headerFooter23.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph26 = headerFooter23.paragraph();
        pdfPageEventHelper0.onSection(pdfWriter4, document14, (float) 7, 262144, paragraph26);
        pdfWriter4.setStrictImageSequence(false);
        pdfWriter4.setEncryption(false, "true", "bottom", 1336);
        com.lowagie.text.pdf.PdfName pdfName35 = com.lowagie.text.pdf.PdfName.NONE;
        com.lowagie.text.pdf.PdfName pdfName36 = com.lowagie.text.pdf.PdfName.XREF;
        pdfWriter4.setDefaultColorspace(pdfName35, (com.lowagie.text.pdf.PdfObject) pdfName36);
        com.lowagie.text.Font font39 = null;
        com.lowagie.text.Footnote footnote40 = new com.lowagie.text.Footnote("", font39);
        com.lowagie.text.HeaderFooter headerFooter42 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote40, true);
        headerFooter42.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle45 = headerFooter42.rotate();
        com.lowagie.text.pdf.PdfShadingPattern pdfShadingPattern46 = null;
        com.lowagie.text.pdf.ShadingColor shadingColor47 = new com.lowagie.text.pdf.ShadingColor(pdfShadingPattern46);
        headerFooter42.setBorderColorRight((java.awt.Color) shadingColor47);
        pdfWriter4.setFooter(headerFooter42);
        assertTrue(shadingColor47.equals(shadingColor47) ? shadingColor47.hashCode() == shadingColor47.hashCode() : true, "Contract failed: equals-hashcode on shadingColor47 and shadingColor47");
    }

    @Test
    void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.lowagie.text.Chapter chapter1 = new com.lowagie.text.Chapter((int) (short) -1);
        com.lowagie.text.MarkedSection markedSection2 = chapter1.addMarkedSection();
        markedSection2.setIndentation((float) (byte) -1);
        markedSection2.setIndentationRight((float) (byte) 10);
        java.util.ArrayList arrayList7 = markedSection2.getChunks();
        com.lowagie.text.MarkedObject markedObject8 = markedSection2.getTitle();
    }

    @Test
    void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.lowagie.text.FontFactoryImp fontFactoryImp0 = new com.lowagie.text.FontFactoryImp();
        com.lowagie.text.Font font4 = null;
        com.lowagie.text.Footnote footnote5 = new com.lowagie.text.Footnote("", font4);
        com.lowagie.text.HeaderFooter headerFooter7 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote5, true);
        headerFooter7.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle10 = headerFooter7.rotate();
        com.lowagie.text.pdf.PdfShadingPattern pdfShadingPattern11 = null;
        com.lowagie.text.pdf.ShadingColor shadingColor12 = new com.lowagie.text.pdf.ShadingColor(pdfShadingPattern11);
        headerFooter7.setBorderColorRight((java.awt.Color) shadingColor12);
        com.lowagie.text.pdf.PdfShadingPattern pdfShadingPattern14 = shadingColor12.getPdfShadingPattern();
        com.lowagie.text.Font font15 = fontFactoryImp0.getFont("pdf:Producer", (float) 8196, (java.awt.Color) shadingColor12);
        com.lowagie.text.Font font19 = fontFactoryImp0.getFont("xmpMM:VersionID", (float) (short) -1, 1048576);
        assertTrue(shadingColor12.equals(shadingColor12) ? shadingColor12.hashCode() == shadingColor12.hashCode() : true, "Contract failed: equals-hashcode on shadingColor12 and shadingColor12");
    }

    @Test
    void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        float f3 = pdfPCell2.getIndent();
        float f4 = pdfPCell2.getExtraParagraphSpace();
        com.lowagie.text.pdf.CMYKColor cMYKColor9 = new com.lowagie.text.pdf.CMYKColor((float) (short) 100, (float) 1, 100.0f, (float) 0);
        java.awt.Color color10 = cMYKColor9.darker();
        pdfPCell2.setBorderColorLeft((java.awt.Color) cMYKColor9);
        com.lowagie.text.RectangleReadOnly rectangleReadOnly12 = new com.lowagie.text.RectangleReadOnly((com.lowagie.text.Rectangle) pdfPCell2);
        assertEquals(color10.equals(cMYKColor9), cMYKColor9.equals(color10), "Contract failed: equals-symmetric on color10 and cMYKColor9.");
    }

    @Test
    void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.lowagie.text.Font font1 = null;
        com.lowagie.text.Footnote footnote2 = new com.lowagie.text.Footnote("", font1);
        int[] i_array7 = new int[]{(short) 1, 1785737760, 8, 100};
        com.lowagie.text.pdf.SimpleBookmark.eliminatePages((java.util.List) footnote2, i_array7);
        int[] i_array15 = new int[]{(short) -1, 0, 'a', 10, 3, (byte) 100};
        com.lowagie.text.pdf.internal.PolylineShape polylineShape17 = new com.lowagie.text.pdf.internal.PolylineShape(i_array7, i_array15, 4);
        boolean b22 = polylineShape17.intersects((double) (byte) 60, (double) (short) 1, (double) 8.0f, (double) 13);
        com.lowagie.text.pdf.PdfShadingPattern pdfShadingPattern23 = null;
        com.lowagie.text.pdf.ShadingColor shadingColor24 = new com.lowagie.text.pdf.ShadingColor(pdfShadingPattern23);
        java.awt.image.ColorModel colorModel25 = null;
        com.lowagie.text.Font font27 = null;
        com.lowagie.text.Footnote footnote28 = new com.lowagie.text.Footnote("", font27);
        int[] i_array33 = new int[]{(short) 1, 1785737760, 8, 100};
        com.lowagie.text.pdf.SimpleBookmark.eliminatePages((java.util.List) footnote28, i_array33);
        int[] i_array41 = new int[]{(short) -1, 0, 'a', 10, 3, (byte) 100};
        com.lowagie.text.pdf.internal.PolylineShape polylineShape43 = new com.lowagie.text.pdf.internal.PolylineShape(i_array33, i_array41, 4);
        java.awt.Rectangle rectangle44 = polylineShape43.getBounds();
        com.lowagie.text.Font font46 = null;
        com.lowagie.text.Footnote footnote47 = new com.lowagie.text.Footnote("", font46);
        int[] i_array52 = new int[]{(short) 1, 1785737760, 8, 100};
        com.lowagie.text.pdf.SimpleBookmark.eliminatePages((java.util.List) footnote47, i_array52);
        int[] i_array60 = new int[]{(short) -1, 0, 'a', 10, 3, (byte) 100};
        com.lowagie.text.pdf.internal.PolylineShape polylineShape62 = new com.lowagie.text.pdf.internal.PolylineShape(i_array52, i_array60, 4);
        java.awt.Rectangle rectangle63 = polylineShape62.getBounds();
        java.awt.geom.AffineTransform affineTransform64 = null;
        java.awt.RenderingHints renderingHints65 = null;
        java.awt.PaintContext paintContext66 = shadingColor24.createContext(colorModel25, rectangle44, (java.awt.geom.Rectangle2D) rectangle63, affineTransform64, renderingHints65);
        boolean b67 = polylineShape17.intersects((java.awt.geom.Rectangle2D) rectangle63);
        assertTrue(shadingColor24.equals(shadingColor24) ? shadingColor24.hashCode() == shadingColor24.hashCode() : true, "Contract failed: equals-hashcode on shadingColor24 and shadingColor24");
    }

    @Test
    void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.lowagie.text.FontFactoryImp fontFactoryImp0 = new com.lowagie.text.FontFactoryImp();
        com.lowagie.text.Font font4 = null;
        com.lowagie.text.Footnote footnote5 = new com.lowagie.text.Footnote("", font4);
        com.lowagie.text.HeaderFooter headerFooter7 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote5, true);
        headerFooter7.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle10 = headerFooter7.rotate();
        com.lowagie.text.pdf.PdfShadingPattern pdfShadingPattern11 = null;
        com.lowagie.text.pdf.ShadingColor shadingColor12 = new com.lowagie.text.pdf.ShadingColor(pdfShadingPattern11);
        headerFooter7.setBorderColorRight((java.awt.Color) shadingColor12);
        com.lowagie.text.pdf.PdfShadingPattern pdfShadingPattern14 = shadingColor12.getPdfShadingPattern();
        com.lowagie.text.Font font15 = fontFactoryImp0.getFont("pdf:Producer", (float) 8196, (java.awt.Color) shadingColor12);
        java.lang.String str16 = fontFactoryImp0.defaultEncoding;
        assertTrue(shadingColor12.equals(shadingColor12) ? shadingColor12.hashCode() == shadingColor12.hashCode() : true, "Contract failed: equals-hashcode on shadingColor12 and shadingColor12");
    }

    @Test
    void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.lowagie.text.pdf.BidiLine bidiLine0 = new com.lowagie.text.pdf.BidiLine();
        int i3 = bidiLine0.trimLeftEx((int) (byte) 9, 96);
    }

    @Test
    void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.lowagie.text.pdf.PdfEncryption pdfEncryption0 = new com.lowagie.text.pdf.PdfEncryption();
        com.lowagie.text.pdf.PdfDictionary pdfDictionary1 = pdfEncryption0.getEncryptionDictionary();
        com.lowagie.text.pdf.PdfObject pdfObject2 = pdfEncryption0.getFileID();
    }

    @Test
    void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.lowagie.text.ImgJBIG2 imgJBIG2_0 = new com.lowagie.text.ImgJBIG2();
    }
}

