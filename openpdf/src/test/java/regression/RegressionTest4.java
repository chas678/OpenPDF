package regression;

import com.lowagie.text.alignment.HorizontalAlignment;
import com.lowagie.text.alignment.VerticalAlignment;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
class RegressionTest4 {

    static boolean debug = false;

    @Test
    void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test001");
        com.lowagie.text.pdf.PdfEncodings.clearCmap("rdf:Alt");
    }

    @Test
    void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test002");
        com.lowagie.text.pdf.PdfLiteral pdfLiteral1 = new com.lowagie.text.pdf.PdfLiteral(25610);
    }

    @Test
    void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test003");
        char char0 = com.lowagie.text.pdf.PdfWriter.VERSION_1_5;
        assertEquals('5', char0);
    }

    @Test
    void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test004");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ACTUALTEXT;
        assertNotNull(pdfName0);
    }

    @Test
    void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test005");
        java.awt.Color color2 = java.awt.Color.orange;
        com.lowagie.text.Font font3 = com.lowagie.text.FontFactory.getFont("hi!", (float) (byte) 47, color2);
        com.lowagie.text.pdf.BaseFont baseFont5 = font3.getCalculatedBaseFont(false);
        baseFont5.correctArabicAdvance();
        int[] i_array7 = baseFont5.getWidths();
        int i9 = baseFont5.getUnicodeEquivalent((int) (short) 25610);
        assertNotNull(color2);
        assertNotNull(font3);
        assertNotNull(baseFont5);
        assertNotNull(i_array7);
        assertEquals(25610, i9);
    }

    @Test
    void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test006");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfDictionary.CATALOG;
        assertNotNull(pdfName0);
    }

    @Test
    void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test007");
        java.io.OutputStream outputStream0 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields2 = new com.lowagie.text.pdf.PdfCopyFields(outputStream0, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = pdfCopyFields2.getWriter();
        int i4 = pdfWriter3.getCurrentPageNumber();
        com.lowagie.text.Chapter chapter6 = new com.lowagie.text.Chapter((int) (short) -1);
        pdfWriter3.setOutlines((java.util.List) chapter6);
        com.lowagie.text.Chapter chapter9 = new com.lowagie.text.Chapter((int) (short) -1);
        com.lowagie.text.MarkedSection markedSection10 = chapter9.addMarkedSection();
        chapter9.setComplete(false);
        int i13 = chapter9.getNumberStyle();
        pdfWriter3.setOutlines((java.util.List) chapter9);
        int i15 = chapter9.getDepth();
        assertNotNull(pdfWriter3);
        assertEquals(1, i4);
        assertNotNull(markedSection10);
        assertEquals(0, i13);
        assertEquals(1, i15);
    }

    @Test
    void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test008");
        com.lowagie.text.pdf.events.FieldPositioningEvents fieldPositioningEvents0 = new com.lowagie.text.pdf.events.FieldPositioningEvents();
        java.io.OutputStream outputStream1 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields3 = new com.lowagie.text.pdf.PdfCopyFields(outputStream1, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter4 = pdfCopyFields3.getWriter();
        pdfWriter4.setFullCompression();
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper6 = new com.lowagie.text.pdf.PdfPageEventHelper();
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper7 = new com.lowagie.text.pdf.PdfPageEventHelper();
        java.io.OutputStream outputStream8 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields10 = new com.lowagie.text.pdf.PdfCopyFields(outputStream8, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter11 = pdfCopyFields10.getWriter();
        com.lowagie.text.Font font13 = null;
        com.lowagie.text.Footnote footnote14 = new com.lowagie.text.Footnote("", font13);
        com.lowagie.text.HeaderFooter headerFooter16 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote14, true);
        headerFooter16.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle19 = headerFooter16.rotate();
        com.lowagie.text.Rectangle rectangle20 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter16);
        com.lowagie.text.Document document21 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter16);
        boolean b23 = document21.setMarginMirroringTopBottom(true);
        com.lowagie.text.Font font27 = null;
        com.lowagie.text.Footnote footnote28 = new com.lowagie.text.Footnote("", font27);
        com.lowagie.text.HeaderFooter headerFooter30 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote28, true);
        headerFooter30.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph33 = headerFooter30.paragraph();
        pdfPageEventHelper7.onSection(pdfWriter11, document21, (float) 7, 262144, paragraph33);
        pdfWriter11.setStrictImageSequence(false);
        pdfWriter11.setEncryption(false, "true", "bottom", 1336);
        com.lowagie.text.Font font43 = null;
        com.lowagie.text.Footnote footnote44 = new com.lowagie.text.Footnote("", font43);
        com.lowagie.text.HeaderFooter headerFooter46 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote44, true);
        headerFooter46.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle49 = headerFooter46.rotate();
        com.lowagie.text.Rectangle rectangle50 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter46);
        com.lowagie.text.Document document51 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter46);
        boolean b53 = document51.setMarginMirroringTopBottom(true);
        float f55 = document51.bottom((float) 100L);
        boolean b57 = document51.setMarginMirroringTopBottom(false);
        byte[] byte_array60 = null;
        com.lowagie.text.pdf.PdfReader pdfReader61 = null;
        byte[] byte_array66 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream67 = new com.lowagie.text.pdf.PRStream(pdfReader61, byte_array66);
        com.lowagie.text.pdf.PdfReader pdfReader68 = null;
        byte[] byte_array73 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream74 = new com.lowagie.text.pdf.PRStream(pdfReader68, byte_array73);
        pRStream67.setData(byte_array73, false, (int) (byte) 100);
        com.lowagie.text.ImgJBIG2 imgJBIG2_78 = new com.lowagie.text.ImgJBIG2(4, 1564, byte_array60, byte_array73);
        int i79 = imgJBIG2_78.getDpiY();
        int[] i_array80 = imgJBIG2_78.getTransparency();
        pdfPageEventHelper6.onGenericTag(pdfWriter11, document51, (com.lowagie.text.Rectangle) imgJBIG2_78, "xxiv");
        fieldPositioningEvents0.onEndPage(pdfWriter4, document51);
        float f85 = document51.left((float) 40);
        assertNotNull(pdfWriter4);
        assertNotNull(pdfWriter11);
        assertNotNull(rectangle19);
        assertEquals(true, b23);
        assertNotNull(paragraph33);
        assertNotNull(rectangle49);
        assertEquals(true, b53);
        assertEquals(136.0f, f55);
        assertEquals(true, b57);
        assertNotNull(byte_array66);
        assertNotNull(byte_array73);
        assertEquals(0, i79);
        assertNull(i_array80);
        assertEquals(76.0f, f85);
    }

    @Test
    void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test009");
        int i0 = com.lowagie.text.pdf.PdfWriter.SIGNATURE_APPEND_ONLY;
        assertEquals(2, i0);
    }

    @Test
    void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test010");
        com.lowagie.text.pdf.BaseFont baseFont0 = null;
        com.lowagie.text.Font font3 = new com.lowagie.text.Font(baseFont0, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont5 = font3.getCalculatedBaseFont(false);
        boolean b8 = baseFont5.setCharAdvance(9, 0);
        int i9 = baseFont5.getCompressionLevel();
        boolean b10 = baseFont5.isSubset();
        float f13 = baseFont5.getWidthPoint("STSong-Light", 0.0f);
        boolean b14 = baseFont5.isForceWidthsOutput();
        int i16 = baseFont5.getCidCode(2097152);
        assertNotNull(baseFont5);
        assertEquals(true, b8);
        assertEquals(i9, (-1));
        assertEquals(true, b10);
        assertEquals(0.0f, f13);
        assertEquals(false, b14);
        assertEquals(2097152, i16);
    }

    @Test
    void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test011");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        com.lowagie.text.pdf.ByteBuffer byteBuffer2 = new com.lowagie.text.pdf.ByteBuffer(1564);
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields4 = new com.lowagie.text.pdf.PdfCopyFields((java.io.OutputStream) byteBuffer2, 'Ã');
        com.lowagie.text.pdf.ByteBuffer byteBuffer6 = byteBuffer2.append(24);
        com.lowagie.text.pdf.PdfReader pdfReader11 = null;
        byte[] byte_array16 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream17 = new com.lowagie.text.pdf.PRStream(pdfReader11, byte_array16);
        com.lowagie.text.pdf.PdfReader pdfReader18 = null;
        byte[] byte_array23 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream24 = new com.lowagie.text.pdf.PRStream(pdfReader18, byte_array23);
        pRStream17.setData(byte_array23, false, (int) (byte) 100);
        byte[] byte_array28 = pRStream17.getBytes();
        com.lowagie.text.pdf.PdfReader pdfReader29 = null;
        byte[] byte_array34 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream35 = new com.lowagie.text.pdf.PRStream(pdfReader29, byte_array34);
        com.lowagie.text.pdf.PdfReader pdfReader36 = null;
        byte[] byte_array41 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream42 = new com.lowagie.text.pdf.PRStream(pdfReader36, byte_array41);
        pRStream35.setData(byte_array41, false, (int) (byte) 100);
        byte[] byte_array46 = pRStream35.getBytes();
        pRStream17.setData(byte_array46);
        byte[] byte_array49 = com.lowagie.text.pdf.crypto.IVGenerator.getIV(0);
        com.lowagie.text.pdf.PRTokeniser pRTokeniser50 = new com.lowagie.text.pdf.PRTokeniser(byte_array49);
        com.lowagie.text.pdf.BaseFont baseFont53 = com.lowagie.text.pdf.BaseFont.createFont("xmp:Thumbnails", "widths", true, false, byte_array46, byte_array49, true, false);
        byteBuffer2.write(byte_array49);
        byteBuffer2.reset();
        try {
            com.lowagie.text.pdf.PdfEncryptor.encrypt(pdfReader0, (java.io.OutputStream) byteBuffer2, (int) (byte) 0, "top", "title", (int) (byte) 1);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(byteBuffer6);
        assertNotNull(byte_array16);
        assertNotNull(byte_array23);
        assertNotNull(byte_array28);
        assertNotNull(byte_array34);
        assertNotNull(byte_array41);
        assertNotNull(byte_array46);
        assertNotNull(byte_array49);
        assertNull(baseFont53);
    }

    @Test
    void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test012");
        com.lowagie.text.Table table2 = new com.lowagie.text.Table(13, 1791);
        com.lowagie.text.Font font4 = null;
        com.lowagie.text.Footnote footnote5 = new com.lowagie.text.Footnote("", font4);
        com.lowagie.text.HeaderFooter headerFooter7 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote5, true);
        headerFooter7.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle10 = headerFooter7.rotate();
        com.lowagie.text.Rectangle rectangle11 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter7);
        com.lowagie.text.Document document12 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter7);
        java.io.OutputStream outputStream13 = null;
        com.lowagie.text.pdf.PdfCopy pdfCopy14 = new com.lowagie.text.pdf.PdfCopy(document12, outputStream13);
        boolean b15 = table2.process((com.lowagie.text.ElementListener) pdfCopy14);
        com.lowagie.text.pdf.events.IndexEvents indexEvents16 = new com.lowagie.text.pdf.events.IndexEvents();
        pdfCopy14.setPageEvent((com.lowagie.text.pdf.PdfPageEvent) indexEvents16);
        com.lowagie.text.pdf.PdfReader pdfReader18 = null;
        pdfCopy14.freeReader(pdfReader18);
        assertNotNull(rectangle10);
        assertEquals(false, b15);
    }

    @Test
    void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test013");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TM;
        assertNotNull(pdfName0);
    }

    @Test
    void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test014");
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
        java.lang.String[] str_array44 = new java.lang.String[]{"bottom", "grayfill", "Helvetica-Oblique", "<?xpacket end=\"r\"?>", "sybp"};
        com.lowagie.text.pdf.PdfFormField pdfFormField46 = com.lowagie.text.pdf.PdfFormField.createCombo(pdfWriter4, false, str_array44, 1078);
        pdfWriter4.setFullCompression();
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertNotNull(pdfName35);
        assertNotNull(pdfName36);
        assertNotNull(str_array44);
        assertNotNull(pdfFormField46);
    }

    @Test
    void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test015");
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper1 = new com.lowagie.text.pdf.PdfPageEventHelper();
        com.lowagie.text.pdf.PdfWriter pdfWriter2 = null;
        com.lowagie.text.Document document3 = null;
        pdfPageEventHelper1.onChapterEnd(pdfWriter2, document3, (float) 262144);
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper6 = new com.lowagie.text.pdf.PdfPageEventHelper();
        java.io.OutputStream outputStream7 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields9 = new com.lowagie.text.pdf.PdfCopyFields(outputStream7, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter10 = pdfCopyFields9.getWriter();
        com.lowagie.text.Font font12 = null;
        com.lowagie.text.Footnote footnote13 = new com.lowagie.text.Footnote("", font12);
        com.lowagie.text.HeaderFooter headerFooter15 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote13, true);
        headerFooter15.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle18 = headerFooter15.rotate();
        com.lowagie.text.Rectangle rectangle19 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter15);
        com.lowagie.text.Document document20 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter15);
        boolean b22 = document20.setMarginMirroringTopBottom(true);
        com.lowagie.text.Font font26 = null;
        com.lowagie.text.Footnote footnote27 = new com.lowagie.text.Footnote("", font26);
        com.lowagie.text.HeaderFooter headerFooter29 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote27, true);
        headerFooter29.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph32 = headerFooter29.paragraph();
        pdfPageEventHelper6.onSection(pdfWriter10, document20, (float) 7, 262144, paragraph32);
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper34 = new com.lowagie.text.pdf.PdfPageEventHelper();
        java.io.OutputStream outputStream35 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields37 = new com.lowagie.text.pdf.PdfCopyFields(outputStream35, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter38 = pdfCopyFields37.getWriter();
        com.lowagie.text.Font font40 = null;
        com.lowagie.text.Footnote footnote41 = new com.lowagie.text.Footnote("", font40);
        com.lowagie.text.HeaderFooter headerFooter43 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote41, true);
        headerFooter43.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle46 = headerFooter43.rotate();
        com.lowagie.text.Rectangle rectangle47 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter43);
        com.lowagie.text.Document document48 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter43);
        boolean b50 = document48.setMarginMirroringTopBottom(true);
        com.lowagie.text.Font font54 = null;
        com.lowagie.text.Footnote footnote55 = new com.lowagie.text.Footnote("", font54);
        com.lowagie.text.HeaderFooter headerFooter57 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote55, true);
        headerFooter57.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph60 = headerFooter57.paragraph();
        pdfPageEventHelper34.onSection(pdfWriter38, document48, (float) 7, 262144, paragraph60);
        java.io.OutputStream outputStream62 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields64 = new com.lowagie.text.pdf.PdfCopyFields(outputStream62, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter65 = pdfCopyFields64.getWriter();
        int i66 = pdfWriter65.getCurrentPageNumber();
        com.lowagie.text.Font font68 = null;
        com.lowagie.text.Footnote footnote69 = new com.lowagie.text.Footnote("", font68);
        com.lowagie.text.HeaderFooter headerFooter71 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote69, true);
        headerFooter71.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle74 = headerFooter71.rotate();
        com.lowagie.text.Rectangle rectangle75 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter71);
        com.lowagie.text.Document document76 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter71);
        boolean b78 = document76.setMarginMirroringTopBottom(true);
        com.lowagie.text.Rectangle rectangle79 = com.lowagie.text.PageSize.A4;
        pdfPageEventHelper34.onGenericTag(pdfWriter65, document76, rectangle79, "com/lowagie/text/pdf/fonts/");
        com.lowagie.text.Font font84 = null;
        com.lowagie.text.Footnote footnote85 = new com.lowagie.text.Footnote("", font84);
        com.lowagie.text.HeaderFooter headerFooter87 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote85, true);
        headerFooter87.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph90 = headerFooter87.paragraph();
        pdfPageEventHelper1.onChapter(pdfWriter10, document76, (float) 526, paragraph90);
        com.lowagie.text.Rectangle rectangle92 = pdfWriter10.getPageSize();
        pdfWriter10.setPageCount(15);
        com.lowagie.text.pdf.PdfAction pdfAction95 = com.lowagie.text.pdf.PdfAction.javaScript("size", pdfWriter10);
        assertNotNull(pdfWriter10);
        assertNotNull(rectangle18);
        assertEquals(true, b22);
        assertNotNull(paragraph32);
        assertNotNull(pdfWriter38);
        assertNotNull(rectangle46);
        assertEquals(true, b50);
        assertNotNull(paragraph60);
        assertNotNull(pdfWriter65);
        assertEquals(1, i66);
        assertNotNull(rectangle74);
        assertEquals(true, b78);
        assertNotNull(rectangle79);
        assertNotNull(paragraph90);
        assertNotNull(rectangle92);
        assertNotNull(pdfAction95);
    }

    @Test
    void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test016");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        try {
            com.lowagie.text.pdf.XfaForm xfaForm1 = new com.lowagie.text.pdf.XfaForm(pdfReader0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test017");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        byte[] byte_array5 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream6 = new com.lowagie.text.pdf.PRStream(pdfReader0, byte_array5);
        com.lowagie.text.pdf.PdfReader pdfReader7 = null;
        byte[] byte_array12 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream13 = new com.lowagie.text.pdf.PRStream(pdfReader7, byte_array12);
        pRStream6.setData(byte_array12, false, (int) (byte) 100);
        byte[] byte_array17 = pRStream6.getBytes();
        com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray18 = new com.lowagie.text.pdf.RandomAccessFileOrArray(byte_array17);
        short s19 = randomAccessFileOrArray18.readShortLE();
        assertNotNull(byte_array5);
        assertNotNull(byte_array12);
        assertNotNull(byte_array17);
        assertEquals(s19, (short) 2561);
    }

    @Test
    void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test018");
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
        pdfWriter4.setAtLeastPdfVersion('È');
        com.lowagie.text.pdf.PdfFormField pdfFormField41 = com.lowagie.text.pdf.PdfFormField.createRadioButton(pdfWriter4, true);
        com.lowagie.text.pdf.PdfPTable pdfPTable43 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell44 = pdfPTable43.getDefaultCell();
        float f45 = pdfPCell44.getIndent();
        float f46 = pdfPCell44.getRightIndent();
        pdfPCell44.setIndent((float) 302);
        com.lowagie.text.pdf.RadioCheckField radioCheckField51 = new com.lowagie.text.pdf.RadioCheckField(pdfWriter4, (com.lowagie.text.Rectangle) pdfPCell44, "pdf", "operation");
        radioCheckField51.setBorderStyle(0);
        radioCheckField51.setText("http://www.aiim.org/pdfa/ns/id/");
        float f56 = radioCheckField51.getFontSize();
        radioCheckField51.setAlignment((int) 'Ë');
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertNotNull(pdfName35);
        assertNotNull(pdfName36);
        assertNotNull(pdfFormField41);
        assertNotNull(pdfPCell44);
        assertEquals(0.0f, f45);
        assertEquals(0.0f, f46);
        assertEquals(0.0f, f56);
    }

    @Test
    void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test019");
        java.io.OutputStream outputStream0 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields2 = new com.lowagie.text.pdf.PdfCopyFields(outputStream0, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = pdfCopyFields2.getWriter();
        int i4 = pdfWriter3.getCurrentPageNumber();
        pdfWriter3.setLinearPageMode();
        com.lowagie.text.pdf.PdfWriter pdfWriter6 = null;
        char[] char_array9 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font11 = new com.lowagie.text.pdf.Type3Font(pdfWriter6, char_array9, true);
        com.lowagie.text.pdf.Type3Font type3Font13 = new com.lowagie.text.pdf.Type3Font(pdfWriter3, char_array9, false);
        com.lowagie.text.pdf.PdfFormField pdfFormField14 = com.lowagie.text.pdf.PdfFormField.createPushButton(pdfWriter3);
        assertNotNull(pdfWriter3);
        assertEquals(1, i4);
        assertNotNull(char_array9);
        assertNotNull(pdfFormField14);
    }

    @Test
    void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test020");
        com.lowagie.text.Cell cell1 = new com.lowagie.text.Cell(true);
        int i2 = cell1.getRowspan();
        assertEquals(1, i2);
    }

    @Test
    void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test021");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaState.TA_RIGHT;
        assertEquals(2, i0);
    }

    @Test
    void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test022");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte12 = type3Font5.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte12.rectangle((float) (-3), (float) 'a', (float) (-1), (float) (byte) 0);
        com.lowagie.text.pdf.PdfWriter pdfWriter18 = pdfContentByte12.getPdfWriter();
        pdfContentByte12.fill();
        com.lowagie.text.pdf.PdfName pdfName20 = com.lowagie.text.pdf.PdfName.SOUND;
        com.lowagie.text.pdf.PdfSigGenericPKCS.PPKLite pPKLite21 = new com.lowagie.text.pdf.PdfSigGenericPKCS.PPKLite();
        byte[] byte_array24 = null;
        com.lowagie.text.pdf.PdfReader pdfReader25 = null;
        byte[] byte_array30 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream31 = new com.lowagie.text.pdf.PRStream(pdfReader25, byte_array30);
        com.lowagie.text.pdf.PdfReader pdfReader32 = null;
        byte[] byte_array37 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream38 = new com.lowagie.text.pdf.PRStream(pdfReader32, byte_array37);
        pRStream31.setData(byte_array37, false, (int) (byte) 100);
        com.lowagie.text.ImgJBIG2 imgJBIG2_42 = new com.lowagie.text.ImgJBIG2(4, 1564, byte_array24, byte_array37);
        pPKLite21.setCert(byte_array24);
        pdfContentByte12.setDefaultColorspace(pdfName20, (com.lowagie.text.pdf.PdfObject) pPKLite21);
        float f45 = pdfContentByte12.getYTLM();
        assertNotNull(char_array3);
        assertNotNull(pdfContentByte12);
        assertNull(pdfWriter18);
        assertNotNull(pdfName20);
        assertNotNull(byte_array30);
        assertNotNull(byte_array37);
        assertEquals(0.0f, f45);
    }

    @Test
    void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test023");
        int i0 = com.lowagie.text.pdf.PdfSignatureAppearance.CERTIFIED_FORM_FILLING_AND_ANNOTATIONS;
        assertEquals(3, i0);
    }

    @Test
    void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test024");
        com.lowagie.text.pdf.BarcodePDF417 barcodePDF417_0 = new com.lowagie.text.pdf.BarcodePDF417();
        java.awt.Color color1 = java.awt.Color.cyan;
        com.lowagie.text.Font font3 = null;
        com.lowagie.text.Footnote footnote4 = new com.lowagie.text.Footnote("", font3);
        com.lowagie.text.HeaderFooter headerFooter6 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote4, true);
        headerFooter6.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle9 = headerFooter6.rotate();
        com.lowagie.text.Rectangle rectangle10 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter6);
        java.awt.Color color11 = java.awt.Color.GREEN;
        float[] f_array12 = com.lowagie.text.pdf.PdfShading.getColorArray(color11);
        java.awt.Color color13 = color11.darker();
        headerFooter6.setBorderColor(color11);
        java.awt.Image image15 = barcodePDF417_0.createAwtImage(color1, color11);
        int i16 = barcodePDF417_0.getErrorLevel();
        barcodePDF417_0.paintCode();
        assertNotNull(color1);
        assertNotNull(rectangle9);
        assertNotNull(color11);
        assertNotNull(f_array12);
        assertNotNull(color13);
        assertNotNull(image15);
        assertEquals(2, i16);
    }

    @Test
    void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test025");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Cell cell5 = com.lowagie.text.factories.ElementFactory.getCell(properties1);
        boolean b6 = cell5.isUseBorderPadding();
        int i7 = cell5.getMaxLines();
        cell5.setRotation((-56509343));
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(cell5);
        assertEquals(false, b6);
        assertEquals(2147483647, i7);
    }

    @Test
    void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test026");
        com.lowagie.text.Table table2 = new com.lowagie.text.Table(13, 1791);
        com.lowagie.text.Font font4 = null;
        com.lowagie.text.Footnote footnote5 = new com.lowagie.text.Footnote("", font4);
        com.lowagie.text.HeaderFooter headerFooter7 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote5, true);
        headerFooter7.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle10 = headerFooter7.rotate();
        com.lowagie.text.Rectangle rectangle11 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter7);
        com.lowagie.text.Document document12 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter7);
        java.io.OutputStream outputStream13 = null;
        com.lowagie.text.pdf.PdfCopy pdfCopy14 = new com.lowagie.text.pdf.PdfCopy(document12, outputStream13);
        boolean b15 = table2.process((com.lowagie.text.ElementListener) pdfCopy14);
        com.lowagie.text.pdf.events.IndexEvents indexEvents16 = new com.lowagie.text.pdf.events.IndexEvents();
        pdfCopy14.setPageEvent((com.lowagie.text.pdf.PdfPageEvent) indexEvents16);
        boolean b18 = pdfCopy14.isPaused();
        assertNotNull(rectangle10);
        assertEquals(false, b15);
        assertEquals(false, b18);
    }

    @Test
    void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test027");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_CREATEPATTERNBRUSH;
        assertEquals(505, i0);
    }

    @Test
    void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test028");
        com.lowagie.text.RectangleReadOnly rectangleReadOnly4 = new com.lowagie.text.RectangleReadOnly((float) 32768, (float) 259, (float) 258, (float) 'd');
        try {
            rectangleReadOnly4.disableBorderSide(4);
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
    }

    @Test
    void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test029");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        float f3 = pdfPTable1.getRowHeight(1785737760);
        boolean b5 = pdfPTable1.isExtendLastRow(true);
        com.lowagie.text.pdf.PdfPTable pdfPTable7 = new com.lowagie.text.pdf.PdfPTable(1);
        pdfPTable1.addCell(pdfPTable7);
        com.lowagie.text.pdf.PdfPTable pdfPTable10 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell11 = pdfPTable10.getDefaultCell();
        float f12 = pdfPCell11.getIndent();
        float f13 = pdfPCell11.getFollowingIndent();
        com.lowagie.text.pdf.PdfPTable pdfPTable15 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell16 = pdfPTable15.getDefaultCell();
        float f17 = pdfPCell16.getIndent();
        com.lowagie.text.pdf.PdfPTable pdfPTable18 = pdfPCell16.getTable();
        pdfPCell11.softCloneNonPositionParameters((com.lowagie.text.Rectangle) pdfPCell16);
        com.lowagie.text.pdf.PdfPCell pdfPCell20 = new com.lowagie.text.pdf.PdfPCell(pdfPTable1, pdfPCell11);
        com.lowagie.text.pdf.PdfPTable pdfPTable22 = new com.lowagie.text.pdf.PdfPTable(1);
        float f24 = pdfPTable22.getRowHeight(1785737760);
        com.lowagie.text.pdf.PdfPCell pdfPCell25 = new com.lowagie.text.pdf.PdfPCell(pdfPTable22);
        pdfPTable1.addCell(pdfPTable22);
        java.util.ArrayList arrayList29 = pdfPTable22.getRows(764, 764);
        java.util.ListIterator<java.lang.String> listiterator_str30 = arrayList29.listIterator();
        assertEquals(0.0f, f3);
        assertEquals(false, b5);
        assertNotNull(pdfPCell11);
        assertEquals(0.0f, f12);
        assertEquals(0.0f, f13);
        assertNotNull(pdfPCell16);
        assertEquals(0.0f, f17);
        assertNull(pdfPTable18);
        assertEquals(0.0f, f24);
        assertNotNull(arrayList29);
        assertNotNull(listiterator_str30);
    }

    @Test
    void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test030");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        float f3 = pdfPTable1.getTotalHeight();
        byte[] byte_array6 = null;
        com.lowagie.text.pdf.PdfReader pdfReader7 = null;
        byte[] byte_array12 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream13 = new com.lowagie.text.pdf.PRStream(pdfReader7, byte_array12);
        com.lowagie.text.pdf.PdfReader pdfReader14 = null;
        byte[] byte_array19 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream20 = new com.lowagie.text.pdf.PRStream(pdfReader14, byte_array19);
        pRStream13.setData(byte_array19, false, (int) (byte) 100);
        com.lowagie.text.ImgJBIG2 imgJBIG2_24 = new com.lowagie.text.ImgJBIG2(4, 1564, byte_array6, byte_array19);
        int i25 = imgJBIG2_24.getDpiY();
        int[] i_array26 = imgJBIG2_24.getTransparency();
        float f27 = imgJBIG2_24.getScaledWidth();
        imgJBIG2_24.makeMask();
        java.io.OutputStream outputStream30 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields32 = new com.lowagie.text.pdf.PdfCopyFields(outputStream30, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter33 = pdfCopyFields32.getWriter();
        int i34 = pdfWriter33.getCurrentPageNumber();
        pdfWriter33.setLinearPageMode();
        com.lowagie.text.pdf.PdfLayer pdfLayer36 = com.lowagie.text.pdf.PdfLayer.createTitle("title", pdfWriter33);
        imgJBIG2_24.setLayer((com.lowagie.text.pdf.PdfOCG) pdfLayer36);
        imgJBIG2_24.setIndentationLeft((float) 100);
        pdfPTable1.addCell((com.lowagie.text.Image) imgJBIG2_24);
        imgJBIG2_24.setSpacingBefore((float) (byte) 0);
        assertNotNull(pdfPCell2);
        assertEquals(0.0f, f3);
        assertNotNull(byte_array12);
        assertNotNull(byte_array19);
        assertEquals(0, i25);
        assertNull(i_array26);
        assertEquals(4.0f, f27);
        assertNotNull(pdfWriter33);
        assertEquals(1, i34);
        assertNotNull(pdfLayer36);
    }

    @Test
    void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test031");
        com.lowagie.text.Font font1 = null;
        com.lowagie.text.Footnote footnote2 = new com.lowagie.text.Footnote("", font1);
        com.lowagie.text.HeaderFooter headerFooter4 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote2, true);
        headerFooter4.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle7 = headerFooter4.rotate();
        com.lowagie.text.Rectangle rectangle8 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter4);
        com.lowagie.text.Document document9 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter4);
        java.io.OutputStream outputStream10 = null;
        com.lowagie.text.pdf.PdfCopy pdfCopy11 = new com.lowagie.text.pdf.PdfCopy(document9, outputStream10);
        com.lowagie.text.pdf.PdfFormField pdfFormField12 = com.lowagie.text.pdf.PdfFormField.createEmpty((com.lowagie.text.pdf.PdfWriter) pdfCopy11);
        com.lowagie.text.pdf.PdfOutline pdfOutline13 = null;
        com.lowagie.text.pdf.PdfIndirectReference pdfIndirectReference14 = pdfCopy11.add(pdfOutline13);
        assertNotNull(rectangle7);
        assertNotNull(pdfFormField12);
        assertNull(pdfIndirectReference14);
    }

    @Test
    void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test032");
        java.io.OutputStream outputStream0 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields2 = new com.lowagie.text.pdf.PdfCopyFields(outputStream0, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = pdfCopyFields2.getWriter();
        int i4 = pdfWriter3.getCurrentPageNumber();
        com.lowagie.text.Chapter chapter6 = new com.lowagie.text.Chapter((int) (short) -1);
        pdfWriter3.setOutlines((java.util.List) chapter6);
        pdfWriter3.setTagged();
        pdfWriter3.setViewerPreferences(25610);
        assertNotNull(pdfWriter3);
        assertEquals(1, i4);
    }

    @Test
    void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test033");
        java.lang.String[] str_array10 = new java.lang.String[]{"text-align", "listitem", "listitem", "listitem", "listitem", "hi!", "HeiseiKakuGo-W5", "UnicodeBig", "hi!", "xmp:Nickname"};
        java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str11, str_array10);
        java.util.stream.Stream<java.lang.String> stream_str13 = arraylist_str11.parallelStream();
        arraylist_str11.add(0, "absolutex");
        java.util.ListIterator<java.lang.String> listiterator_str18 = arraylist_str11.listIterator(8);
        boolean b19 = arraylist_str11.isEmpty();
        com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS pPKMS20 = new com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS();
        com.lowagie.text.pdf.PdfReader pdfReader21 = null;
        byte[] byte_array26 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream27 = new com.lowagie.text.pdf.PRStream(pdfReader21, byte_array26);
        pPKMS20.setCert(byte_array26);
        com.lowagie.text.Font font30 = null;
        com.lowagie.text.Footnote footnote31 = new com.lowagie.text.Footnote("", font30);
        int[] i_array36 = new int[]{(short) 1, 1785737760, 8, 100};
        com.lowagie.text.pdf.SimpleBookmark.eliminatePages((java.util.List) footnote31, i_array36);
        int[] i_array44 = new int[]{(short) -1, 0, 'a', 10, 3, (byte) 100};
        com.lowagie.text.pdf.internal.PolylineShape polylineShape46 = new com.lowagie.text.pdf.internal.PolylineShape(i_array36, i_array44, 4);
        pPKMS20.setByteRange(i_array36);
        com.lowagie.text.pdf.BaseFont baseFont48 = null;
        com.lowagie.text.Font font51 = new com.lowagie.text.Font(baseFont48, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont53 = font51.getCalculatedBaseFont(false);
        boolean b56 = baseFont53.setCharAdvance(9, 0);
        int i57 = baseFont53.getCompressionLevel();
        int[] i_array58 = baseFont53.getWidths();
        pPKMS20.setByteRange(i_array58);
        int i60 = arraylist_str11.indexOf((java.lang.Object) pPKMS20);
        assertNotNull(str_array10);
        assertEquals(true, b12);
        assertNotNull(stream_str13);
        assertNotNull(listiterator_str18);
        assertEquals(false, b19);
        assertNotNull(byte_array26);
        assertNotNull(i_array36);
        assertNotNull(i_array44);
        assertNotNull(baseFont53);
        assertEquals(true, b56);
        assertEquals(i57, (-1));
        assertNotNull(i_array58);
        assertEquals(i60, (-1));
    }

    @Test
    void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test034");
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
        com.lowagie.text.pdf.PdfName pdfName30 = com.lowagie.text.pdf.PdfName.FIT;
        pdfWriter4.setPdfVersion(pdfName30);
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertNotNull(pdfName30);
    }

    @Test
    void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test035");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfWriter pdfWriter5 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField6 = com.lowagie.text.pdf.PdfFormField.createCheckBox(pdfWriter5);
        com.lowagie.text.pdf.PdfAction pdfAction8 = new com.lowagie.text.pdf.PdfAction("Cp1250");
        pdfFormField6.setAction(pdfAction8);
        com.lowagie.text.pdf.PdfFormField pdfFormField10 = new com.lowagie.text.pdf.PdfFormField(pdfWriter0, (float) 7, (float) 1L, (float) 'a', (float) 30, pdfAction8);
        pdfFormField10.setMKTextPosition((int) (byte) 100);
        com.lowagie.text.pdf.PdfWriter pdfWriter13 = null;
        char[] char_array16 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font18 = new com.lowagie.text.pdf.Type3Font(pdfWriter13, char_array16, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte25 = type3Font18.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte25.rectangle((float) (-3), (float) 'a', (float) (-1), (float) (byte) 0);
        com.lowagie.text.pdf.PdfWriter pdfWriter31 = pdfContentByte25.getPdfWriter();
        pdfContentByte25.fill();
        pdfFormField10.setDefaultAppearanceString(pdfContentByte25);
        com.lowagie.text.pdf.PdfPSXObject pdfPSXObject34 = null;
        try {
            pdfContentByte25.addPSXObject(pdfPSXObject34);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfFormField6);
        assertNotNull(char_array16);
        assertNotNull(pdfContentByte25);
        assertNull(pdfWriter31);
    }

    @Test
    void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test036");
        int i0 = com.lowagie.text.pdf.PdfTransition.SPLITVIN;
        assertEquals(3, i0);
    }

    @Test
    void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test037");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.LAST;
        com.lowagie.text.pdf.PdfName pdfName1 = com.lowagie.text.pdf.PdfName.KEYWORDS;
        com.lowagie.text.pdf.PdfDeveloperExtension pdfDeveloperExtension3 = new com.lowagie.text.pdf.PdfDeveloperExtension(pdfName0, pdfName1, (int) (short) 10);
        com.lowagie.text.pdf.PdfName pdfName4 = pdfDeveloperExtension3.getPrefix();
        assertNotNull(pdfName0);
        assertNotNull(pdfName1);
        assertNotNull(pdfName4);
    }

    @Test
    void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test038");
        java.lang.String str0 = com.lowagie.text.ElementTags.WIDTH;
        assertEquals("width", str0, "'" + str0 + "' != '" + "width" + "'");
    }

    @Test
    void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test039");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.FILTER;
        assertNotNull(pdfName0);
    }

    @Test
    void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test040");
        com.lowagie.text.SimpleCell simpleCell1 = new com.lowagie.text.SimpleCell(true);
        simpleCell1.setSpacing_top((float) 226);
        int i4 = simpleCell1.type();
        float f5 = simpleCell1.getPadding_right();
        com.lowagie.text.SimpleCell simpleCell7 = new com.lowagie.text.SimpleCell(true);
        com.lowagie.text.SimpleCell simpleCell9 = new com.lowagie.text.SimpleCell(true);
        simpleCell9.setSpacing_top((float) 226);
        int i12 = simpleCell9.type();
        com.lowagie.text.Cell cell13 = simpleCell7.createCell(simpleCell9);
        com.lowagie.text.Cell cell14 = simpleCell1.createCell(simpleCell9);
        try {
            boolean b16 = cell14.add((java.lang.Object) "symbolindent");
            fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        assertEquals(20, i4);
        assertEquals((float) f5, Float.NaN, 0);
        assertEquals(20, i12);
        assertNotNull(cell13);
        assertNotNull(cell14);
    }

    @Test
    void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test041");
        int i0 = com.lowagie.text.pdf.PdfWriter.PDFXNONE;
        assertEquals(0, i0);
    }

    @Test
    void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test042");
        byte[] byte_array2 = null;
        com.lowagie.text.pdf.PdfReader pdfReader3 = null;
        byte[] byte_array8 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream9 = new com.lowagie.text.pdf.PRStream(pdfReader3, byte_array8);
        com.lowagie.text.pdf.PdfReader pdfReader10 = null;
        byte[] byte_array15 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream16 = new com.lowagie.text.pdf.PRStream(pdfReader10, byte_array15);
        pRStream9.setData(byte_array15, false, (int) (byte) 100);
        com.lowagie.text.ImgJBIG2 imgJBIG2_20 = new com.lowagie.text.ImgJBIG2(4, 1564, byte_array2, byte_array15);
        int i21 = imgJBIG2_20.getAlignment();
        float f22 = imgJBIG2_20.getSpacingBefore();
        com.lowagie.text.pdf.PdfRectangle pdfRectangle23 = new com.lowagie.text.pdf.PdfRectangle((com.lowagie.text.Rectangle) imgJBIG2_20);
        com.lowagie.text.pdf.PdfName pdfName24 = com.lowagie.text.pdf.PdfName.H6;
        boolean b25 = pdfRectangle23.contains((com.lowagie.text.pdf.PdfObject) pdfName24);
        assertNotNull(byte_array8);
        assertNotNull(byte_array15);
        assertEquals(0, i21);
        assertEquals(0.0f, f22);
        assertNotNull(pdfName24);
        assertEquals(false, b25);
    }

    @Test
    void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test043");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Paragraph paragraph5 = com.lowagie.text.factories.ElementFactory.getParagraph(properties1);
        paragraph5.setSpacingAfter((float) 256);
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(paragraph5);
    }

    @Test
    void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test044");
        char char0 = com.lowagie.text.pdf.Barcode128.START_A;
        assertEquals('g', char0);
    }

    @Test
    void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test045");
        com.lowagie.text.Font font1 = null;
        com.lowagie.text.Footnote footnote2 = new com.lowagie.text.Footnote("", font1);
        com.lowagie.text.HeaderFooter headerFooter4 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote2, true);
        headerFooter4.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle7 = headerFooter4.rotate();
        com.lowagie.text.Rectangle rectangle8 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter4);
        com.lowagie.text.Document document9 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter4);
        java.io.OutputStream outputStream10 = null;
        com.lowagie.text.pdf.PdfCopy pdfCopy11 = new com.lowagie.text.pdf.PdfCopy(document9, outputStream10);
        pdfCopy11.open();
        boolean b17 = pdfCopy11.setMargins((float) 505, (float) 4, (float) 0L, (float) 55);
        assertNotNull(rectangle7);
        assertEquals(false, b17);
    }

    @Test
    void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test046");
        com.lowagie.text.pdf.BaseFont baseFont0 = null;
        com.lowagie.text.Font font3 = new com.lowagie.text.Font(baseFont0, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont5 = font3.getCalculatedBaseFont(false);
        boolean b8 = baseFont5.setCharAdvance(9, 0);
        java.awt.Color color14 = java.awt.Color.getHSBColor(100.0f, (float) (short) 1, 100.0f);
        int i15 = com.lowagie.text.pdf.ExtendedColor.getType(color14);
        com.lowagie.text.Font font16 = new com.lowagie.text.Font(baseFont5, (float) (-1), (int) 'Ã', color14);
        float f19 = baseFont5.getDescentPoint("*****", (float) 3907);
        assertNotNull(baseFont5);
        assertEquals(true, b8);
        assertNotNull(color14);
        assertEquals(0, i15);
        assertEquals(0.0f, f19);
    }

    @Test
    void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test047");
        com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS pPKMS1 = new com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS("right");
    }

    @Test
    void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test048");
        com.lowagie.text.pdf.BidiLine bidiLine0 = new com.lowagie.text.pdf.BidiLine();
        com.lowagie.text.pdf.PdfChunk pdfChunk1 = null;
        bidiLine0.addChunk(pdfChunk1);
        try {
            float f5 = bidiLine0.getWidth((int) (byte) 61, 525);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test049");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField1 = com.lowagie.text.pdf.PdfFormField.createCheckBox(pdfWriter0);
        pdfFormField1.setQuadding((int) (byte) 100);
        pdfFormField1.setMKTextPosition(30);
        pdfFormField1.setUserName("af");
        assertNotNull(pdfFormField1);
    }

    @Test
    void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test050");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        float f3 = pdfPCell2.getIndent();
        com.lowagie.text.pdf.ColumnText columnText4 = null;
        pdfPCell2.setColumn(columnText4);
        boolean b6 = pdfPCell2.isUseDescender();
        assertNotNull(pdfPCell2);
        assertEquals(0.0f, f3);
        assertEquals(false, b6);
    }

    @Test
    void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test051");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte12 = type3Font5.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte12.fillStroke();
        com.lowagie.text.pdf.FontMapper fontMapper16 = null;
        java.awt.print.PrinterJob printerJob19 = null;
        java.awt.Graphics2D graphics2D20 = pdfContentByte12.createPrinterGraphics((-1.0f), (float) (-1), fontMapper16, true, (float) (byte) 1, printerJob19);
        com.lowagie.text.pdf.FontMapper fontMapper23 = null;
        java.awt.Graphics2D graphics2D24 = pdfContentByte12.createGraphics(29.0f, (float) 526, fontMapper23);
        java.lang.String str25 = graphics2D24.toString();
        assertNotNull(char_array3);
        assertNotNull(pdfContentByte12);
        assertNotNull(graphics2D20);
        assertNotNull(graphics2D24);
        assertEquals("com.lowagie.text.pdf.PdfGraphics2D[font=java.awt.Font[family=Dialog,name=sanserif,style=plain,size=12],color=java.awt.Color[r=0,g=0,b=0]]", str25, "'" + str25 + "' != '" + "com.lowagie.text.pdf.PdfGraphics2D[font=java.awt.Font[family=Dialog,name=sanserif,style=plain,size=12],color=java.awt.Color[r=0,g=0,b=0]]" + "'");
    }

    @Test
    void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test052");
        com.lowagie.text.pdf.PdfName pdfName2 = new com.lowagie.text.pdf.PdfName("xmp:ModifyDate", false);
        int i3 = pdfName2.length();
        assertEquals(15, i3);
    }

    @Test
    void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test053");
        com.lowagie.text.Font font5 = com.lowagie.text.FontFactory.getFont("", "<?xpacket begin=\"﻿\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?>\n", false, (float) (byte) 10, 1065);
        assertNotNull(font5);
    }

    @Test
    void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test054");
        int i0 = com.lowagie.text.pdf.PdfObject.NULL;
        assertEquals(8, i0);
    }

    @Test
    void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test055");
        int i0 = com.lowagie.text.pdf.PdfAnnotation.FLAGS_NOVIEW;
        assertEquals(32, i0);
    }

    @Test
    void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test056");
        java.awt.Color color0 = java.awt.Color.white;
        assertNotNull(color0);
    }

    @Test
    void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test057");
        com.lowagie.text.pdf.events.IndexEvents indexEvents0 = new com.lowagie.text.pdf.events.IndexEvents();
        java.util.Comparator comparator1 = null;
        indexEvents0.setComparator(comparator1);
    }

    @Test
    void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test058");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Paragraph paragraph5 = com.lowagie.text.factories.ElementFactory.getParagraph(properties1);
        int i6 = properties1.size();
        com.lowagie.text.Table table7 = com.lowagie.text.factories.ElementFactory.getTable(properties1);
        table7.setNotAddedYet(false);
        boolean b10 = table7.isComplete();
        int i11 = table7.getAlignment();
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(paragraph5);
        assertEquals(0, i6);
        assertNotNull(table7);
        assertEquals(true, b10);
        assertEquals(1, i11);
    }

    @Test
    void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test059");
        com.lowagie.text.pdf.PdfContentByte pdfContentByte0 = null;
        com.lowagie.text.pdf.ColumnText columnText1 = new com.lowagie.text.pdf.ColumnText(pdfContentByte0);
        float f2 = columnText1.getFilledWidth();
        com.lowagie.text.pdf.PdfContentByte pdfContentByte3 = null;
        com.lowagie.text.pdf.ColumnText columnText4 = new com.lowagie.text.pdf.ColumnText(pdfContentByte3);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte5 = null;
        columnText4.setCanvas(pdfContentByte5);
        com.lowagie.text.pdf.PdfContentByte[] pdfContentByte_array7 = columnText4.getCanvases();
        columnText4.setSpaceCharRatio(0.0f);
        com.lowagie.text.pdf.ColumnText columnText10 = columnText1.setACopy(columnText4);
        boolean b11 = columnText4.zeroHeightElement();
        com.lowagie.text.pdf.PdfContentByte pdfContentByte12 = columnText4.getCanvas();
        assertEquals(0.0f, f2);
        assertNull(pdfContentByte_array7);
        assertNotNull(columnText10);
        assertEquals(false, b11);
        assertNull(pdfContentByte12);
    }

    @Test
    void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test060");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte12 = type3Font5.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte12.fillStroke();
        com.lowagie.text.pdf.FontMapper fontMapper16 = null;
        java.awt.print.PrinterJob printerJob19 = null;
        java.awt.Graphics2D graphics2D20 = pdfContentByte12.createPrinterGraphics((-1.0f), (float) (-1), fontMapper16, true, (float) (byte) 1, printerJob19);
        com.lowagie.text.pdf.FontMapper fontMapper23 = null;
        java.awt.Graphics2D graphics2D24 = pdfContentByte12.createGraphics(29.0f, (float) 526, fontMapper23);
        pdfContentByte12.reset(false);
        assertNotNull(char_array3);
        assertNotNull(pdfContentByte12);
        assertNotNull(graphics2D20);
        assertNotNull(graphics2D24);
    }

    @Test
    void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test061");
        com.lowagie.text.pdf.PdfRectangle pdfRectangle3 = new com.lowagie.text.pdf.PdfRectangle((float) 34, (float) '翿', 8196);
        float f4 = pdfRectangle3.top();
        assertEquals(32767.0f, f4);
    }

    @Test
    void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test062");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.CENTERWINDOW;
        assertNotNull(pdfName0);
    }

    @Test
    void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test063");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        float f3 = pdfPTable1.getRowHeight(1785737760);
        boolean b5 = pdfPTable1.isExtendLastRow(true);
        com.lowagie.text.pdf.PdfPTable pdfPTable7 = new com.lowagie.text.pdf.PdfPTable(1);
        pdfPTable1.addCell(pdfPTable7);
        com.lowagie.text.pdf.PdfPTable pdfPTable10 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell11 = pdfPTable10.getDefaultCell();
        float f12 = pdfPCell11.getIndent();
        float f13 = pdfPCell11.getFollowingIndent();
        com.lowagie.text.pdf.PdfPTable pdfPTable15 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell16 = pdfPTable15.getDefaultCell();
        float f17 = pdfPCell16.getIndent();
        com.lowagie.text.pdf.PdfPTable pdfPTable18 = pdfPCell16.getTable();
        pdfPCell11.softCloneNonPositionParameters((com.lowagie.text.Rectangle) pdfPCell16);
        com.lowagie.text.pdf.PdfPCell pdfPCell20 = new com.lowagie.text.pdf.PdfPCell(pdfPTable1, pdfPCell11);
        com.lowagie.text.pdf.PdfPTable pdfPTable22 = new com.lowagie.text.pdf.PdfPTable(1);
        float f24 = pdfPTable22.getRowHeight(1785737760);
        com.lowagie.text.pdf.PdfPCell pdfPCell25 = new com.lowagie.text.pdf.PdfPCell(pdfPTable22);
        pdfPTable1.addCell(pdfPTable22);
        pdfPTable1.setComplete(true);
        pdfPTable1.setLockedWidth(false);
        pdfPTable1.setComplete(true);
        assertEquals(0.0f, f3);
        assertEquals(false, b5);
        assertNotNull(pdfPCell11);
        assertEquals(0.0f, f12);
        assertEquals(0.0f, f13);
        assertNotNull(pdfPCell16);
        assertEquals(0.0f, f17);
        assertNull(pdfPTable18);
        assertEquals(0.0f, f24);
    }

    @Test
    void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test064");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.FORM;
        assertNotNull(pdfName0);
    }

    @Test
    void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test065");
        com.lowagie.text.ZapfDingbatsList zapfDingbatsList2 = new com.lowagie.text.ZapfDingbatsList(2, 2368);
        zapfDingbatsList2.setAutoindent(false);
        com.lowagie.text.pdf.PdfName pdfName5 = com.lowagie.text.pdf.PdfName.BS;
        boolean b6 = zapfDingbatsList2.add((java.lang.Object) pdfName5);
        assertNotNull(pdfName5);
        assertEquals(false, b6);
    }

    @Test
    void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test066");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        java.io.PrintWriter printWriter2 = null;
        try {
            com.lowagie.text.pdf.parser.PdfContentReaderTool.listContentStreamForPage(pdfReader0, 299, printWriter2);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test067");
        java.lang.String str0 = com.lowagie.text.Chunk.ACTION;
        assertEquals("ACTION", str0, "'" + str0 + "' != '" + "ACTION" + "'");
    }

    @Test
    void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test068");
        java.lang.String str0 = com.lowagie.text.ElementTags.NUMBERED;
        assertEquals("numbered", str0, "'" + str0 + "' != '" + "numbered" + "'");
    }

    @Test
    void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test069");
        com.lowagie.text.pdf.PdfPublicKeySecurityHandler pdfPublicKeySecurityHandler0 = new com.lowagie.text.pdf.PdfPublicKeySecurityHandler();
        com.lowagie.text.pdf.PdfArray pdfArray1 = pdfPublicKeySecurityHandler0.getEncodedRecipients();
        java.security.cert.Certificate certificate2 = null;
        com.lowagie.text.pdf.PdfPublicKeyRecipient pdfPublicKeyRecipient4 = new com.lowagie.text.pdf.PdfPublicKeyRecipient(certificate2, (int) (byte) 100);
        pdfPublicKeySecurityHandler0.addRecipient(pdfPublicKeyRecipient4);
        assertNotNull(pdfArray1);
    }

    @Test
    void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test071");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TX;
        assertNotNull(pdfName0);
    }

    @Test
    void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test072");
        com.lowagie.text.pdf.hyphenation.SimplePatternParser simplePatternParser0 = new com.lowagie.text.pdf.hyphenation.SimplePatternParser();
        com.lowagie.text.Font font3 = null;
        com.lowagie.text.Footnote footnote4 = new com.lowagie.text.Footnote("", font3);
        com.lowagie.text.HeaderFooter headerFooter6 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote4, true);
        headerFooter6.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph9 = headerFooter6.paragraph();
        com.lowagie.text.ChapterAutoNumber chapterAutoNumber10 = new com.lowagie.text.ChapterAutoNumber(paragraph9);
        com.lowagie.text.Chapter chapter12 = new com.lowagie.text.Chapter(paragraph9, 262);
        simplePatternParser0.addException("Stream", (java.util.ArrayList) paragraph9);
        java.io.InputStream inputStream14 = null;
        try {
            com.lowagie.text.xml.simpleparser.SimpleXMLParser.parse((com.lowagie.text.xml.simpleparser.SimpleXMLDocHandler) simplePatternParser0, inputStream14);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(paragraph9);
    }

    @Test
    void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test073");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TYPE0;
        assertNotNull(pdfName0);
    }

    @Test
    void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test074");
        java.security.cert.Certificate certificate0 = null;
        com.lowagie.text.pdf.PdfPublicKeyRecipient pdfPublicKeyRecipient2 = new com.lowagie.text.pdf.PdfPublicKeyRecipient(certificate0, 0);
    }

    @Test
    void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test075");
        com.lowagie.text.pdf.XfaForm xfaForm0 = new com.lowagie.text.pdf.XfaForm();
        com.lowagie.text.pdf.XfaForm.Xml2SomDatasets xml2SomDatasets1 = null;
        xfaForm0.setDatasetsSom(xml2SomDatasets1);
        com.lowagie.text.pdf.XfaForm.Xml2SomDatasets xml2SomDatasets3 = xfaForm0.getDatasetsSom();
        boolean b4 = xfaForm0.isXfaPresent();
        org.xml.sax.InputSource inputSource5 = null;
        try {
            xfaForm0.fillXfaForm(inputSource5);
            fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        assertNull(xml2SomDatasets3);
        assertEquals(false, b4);
    }

    @Test
    void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test076");
        java.lang.String str1 = com.lowagie.text.factories.GreekAlphabetFactory.getLowerCaseString(4096);
        assertEquals("hbp", str1, "'" + str1 + "' != '" + "hbp" + "'");
    }

    @Test
    void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test077");
        byte[] byte_array2 = null;
        com.lowagie.text.pdf.PdfReader pdfReader3 = null;
        byte[] byte_array8 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream9 = new com.lowagie.text.pdf.PRStream(pdfReader3, byte_array8);
        com.lowagie.text.pdf.PdfReader pdfReader10 = null;
        byte[] byte_array15 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream16 = new com.lowagie.text.pdf.PRStream(pdfReader10, byte_array15);
        pRStream9.setData(byte_array15, false, (int) (byte) 100);
        com.lowagie.text.ImgJBIG2 imgJBIG2_20 = new com.lowagie.text.ImgJBIG2(4, 1564, byte_array2, byte_array15);
        int i21 = imgJBIG2_20.getCompressionLevel();
        imgJBIG2_20.setBorderWidthTop(136.0f);
        com.lowagie.text.pdf.PdfReader pdfReader24 = null;
        byte[] byte_array29 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream30 = new com.lowagie.text.pdf.PRStream(pdfReader24, byte_array29);
        com.lowagie.text.pdf.PdfReader pdfReader31 = null;
        byte[] byte_array36 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream37 = new com.lowagie.text.pdf.PRStream(pdfReader31, byte_array36);
        pRStream30.setData(byte_array36, false, (int) (byte) 100);
        imgJBIG2_20.setOriginalData(byte_array36);
        assertNotNull(byte_array8);
        assertNotNull(byte_array15);
        assertEquals(i21, (-1));
        assertNotNull(byte_array29);
        assertNotNull(byte_array36);
    }

    @Test
    void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test078");
        com.lowagie.text.pdf.PdfSigGenericPKCS.PPKLite pPKLite1 = new com.lowagie.text.pdf.PdfSigGenericPKCS.PPKLite("UniJIS-UCS2-HW-H");
    }

    @Test
    void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test079");
        com.lowagie.text.alignment.VerticalAlignment verticalAlignment0 = com.lowagie.text.alignment.VerticalAlignment.UNDEFINED;
        assertEquals(verticalAlignment0, VerticalAlignment.UNDEFINED, "'" + verticalAlignment0 + "' != '" + VerticalAlignment.UNDEFINED + "'");
    }

    @Test
    void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test080");
        com.lowagie.text.Font font4 = com.lowagie.text.FontFactory.getFont("page-break-after", "face", (float) 30);
        com.lowagie.text.ListItem listItem5 = new com.lowagie.text.ListItem("border-bottom-width", font4);
        listItem5.setMultipliedLeading((float) (byte) -1);
        assertNotNull(font4);
    }

    @Test
    void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test081");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte12 = type3Font5.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte12.fillStroke();
        com.lowagie.text.pdf.FontMapper fontMapper16 = null;
        java.awt.print.PrinterJob printerJob19 = null;
        java.awt.Graphics2D graphics2D20 = pdfContentByte12.createPrinterGraphics((-1.0f), (float) (-1), fontMapper16, true, (float) (byte) 1, printerJob19);
        com.lowagie.text.pdf.FontMapper fontMapper23 = null;
        java.awt.Graphics2D graphics2D24 = pdfContentByte12.createGraphics(29.0f, (float) 526, fontMapper23);
        byte[] byte_array27 = null;
        com.lowagie.text.pdf.PdfReader pdfReader28 = null;
        byte[] byte_array33 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream34 = new com.lowagie.text.pdf.PRStream(pdfReader28, byte_array33);
        com.lowagie.text.pdf.PdfReader pdfReader35 = null;
        byte[] byte_array40 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream41 = new com.lowagie.text.pdf.PRStream(pdfReader35, byte_array40);
        pRStream34.setData(byte_array40, false, (int) (byte) 100);
        com.lowagie.text.ImgJBIG2 imgJBIG2_45 = new com.lowagie.text.ImgJBIG2(4, 1564, byte_array27, byte_array40);
        int i46 = imgJBIG2_45.getCompressionLevel();
        pdfContentByte12.rectangle((com.lowagie.text.Rectangle) imgJBIG2_45);
        java.awt.Color color49 = java.awt.Color.lightGray;
        com.lowagie.text.pdf.PdfSpotColor pdfSpotColor50 = new com.lowagie.text.pdf.PdfSpotColor("url", color49);
        try {
            pdfContentByte12.setColorFill(pdfSpotColor50, (float) '搊');
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(char_array3);
        assertNotNull(pdfContentByte12);
        assertNotNull(graphics2D20);
        assertNotNull(graphics2D24);
        assertNotNull(byte_array33);
        assertNotNull(byte_array40);
        assertEquals(i46, (-1));
        assertNotNull(color49);
    }

    @Test
    void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test082");
        com.lowagie.text.pdf.hyphenation.Hyphenator hyphenator4 = new com.lowagie.text.pdf.hyphenation.Hyphenator("named", "Allowed: Modify contents", 224, 1);
        java.io.OutputStream outputStream5 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields7 = new com.lowagie.text.pdf.PdfCopyFields(outputStream5, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter8 = pdfCopyFields7.getWriter();
        int i9 = pdfWriter8.getCurrentPageNumber();
        pdfWriter8.setLinearPageMode();
        com.lowagie.text.pdf.PdfWriter pdfWriter11 = null;
        char[] char_array14 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font16 = new com.lowagie.text.pdf.Type3Font(pdfWriter11, char_array14, true);
        com.lowagie.text.pdf.Type3Font type3Font18 = new com.lowagie.text.pdf.Type3Font(pdfWriter8, char_array14, false);
        com.lowagie.text.pdf.hyphenation.Hyphenation hyphenation21 = hyphenator4.hyphenate(char_array14, 50, 29);
        com.lowagie.text.pdf.hyphenation.Hyphenation hyphenation23 = hyphenator4.hyphenate("symbolindent");
        assertNotNull(pdfWriter8);
        assertEquals(1, i9);
        assertNotNull(char_array14);
        assertNull(hyphenation21);
        assertNull(hyphenation23);
    }

    @Test
    void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test083");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.RICHMEDIACOMMAND;
        assertNotNull(pdfName0);
    }

    @Test
    void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test084");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Cell cell5 = com.lowagie.text.factories.ElementFactory.getCell(properties1);
        com.lowagie.text.Paragraph paragraph6 = com.lowagie.text.factories.ElementFactory.getParagraph(properties1);
        com.lowagie.text.Anchor anchor7 = com.lowagie.text.factories.ElementFactory.getAnchor(properties1);
        java.net.URL uRL8 = anchor7.getUrl();
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(cell5);
        assertNotNull(paragraph6);
        assertNotNull(anchor7);
        assertNull(uRL8);
    }

    @Test
    void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test085");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte12 = type3Font5.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte12.rectangle((float) (-3), (float) 'a', (float) (-1), (float) (byte) 0);
        com.lowagie.text.pdf.PdfWriter pdfWriter18 = pdfContentByte12.getPdfWriter();
        pdfContentByte12.fill();
        com.lowagie.text.pdf.PdfTextArray pdfTextArray21 = new com.lowagie.text.pdf.PdfTextArray("border-bottom-width");
        try {
            pdfContentByte12.showText(pdfTextArray21);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(char_array3);
        assertNotNull(pdfContentByte12);
        assertNull(pdfWriter18);
    }

    @Test
    void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test086");
        com.lowagie.text.pdf.codec.wmf.MetaState metaState0 = new com.lowagie.text.pdf.codec.wmf.MetaState();
        float f1 = metaState0.scalingY;
        try {
            metaState0.deleteMetaObject(100);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        assertEquals(0.0f, f1);
    }

    @Test
    void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test087");
        com.lowagie.text.pdf.draw.DottedLineSeparator dottedLineSeparator0 = new com.lowagie.text.pdf.draw.DottedLineSeparator();
        dottedLineSeparator0.setLineWidth((float) (byte) 61);
    }

    @Test
    void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test088");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        float f3 = pdfPCell2.getPaddingRight();
        int i4 = pdfPCell2.getHorizontalAlignment();
        assertNotNull(pdfPCell2);
        assertEquals(2.0f, f3);
        assertEquals(0, i4);
    }

    @Test
    void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test089");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfAcroForm pdfAcroForm1 = new com.lowagie.text.pdf.PdfAcroForm(pdfWriter0);
        pdfAcroForm1.setNeedAppearances(true);
        boolean b4 = pdfAcroForm1.isDictionary();
        boolean b5 = pdfAcroForm1.isCatalog();
        java.lang.String str6 = pdfAcroForm1.toString();
        com.lowagie.text.pdf.BaseFont baseFont9 = null;
        com.lowagie.text.Font font12 = new com.lowagie.text.Font(baseFont9, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont14 = font12.getCalculatedBaseFont(false);
        boolean b17 = baseFont14.setCharAdvance(9, 0);
        int i18 = baseFont14.getCompressionLevel();
        java.lang.String[] str_array19 = baseFont14.getCodePagesSupported();
        try {
            com.lowagie.text.pdf.PdfFormField pdfFormField25 = pdfAcroForm1.addSingleLineTextField("pdf:keywords", "xmpMM:RenditionParams", baseFont14, (float) 1565, (float) 1970433056, (float) (short) 2660, (float) 32768, 0.0f);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertEquals(true, b4);
        assertEquals(false, b5);
        assertEquals("Dictionary", str6, "'" + str6 + "' != '" + "Dictionary" + "'");
        assertNotNull(baseFont14);
        assertEquals(true, b17);
        assertEquals(i18, (-1));
        assertNotNull(str_array19);
    }

    @Test
    void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test090");
        com.lowagie.text.pdf.PdfPCell pdfPCell0 = new com.lowagie.text.pdf.PdfPCell();
        pdfPCell0.setExtraParagraphSpace((float) 25610);
    }

    @Test
    void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test091");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_ARC;
        assertEquals(2071, i0);
    }

    @Test
    void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test092");
        com.lowagie.text.DocumentException documentException1 = new com.lowagie.text.DocumentException("xmp:ModifyDate");
    }

    @Test
    void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test093");
        java.io.OutputStream outputStream0 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields2 = new com.lowagie.text.pdf.PdfCopyFields(outputStream0, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = pdfCopyFields2.getWriter();
        int i4 = pdfWriter3.getCurrentPageNumber();
        pdfWriter3.setLinearPageMode();
        int i6 = pdfWriter3.getPageNumber();
        pdfWriter3.setStrictImageSequence(true);
        pdfWriter3.clearTextWrap();
        com.lowagie.text.pdf.PdfFormField pdfFormField10 = com.lowagie.text.pdf.PdfFormField.createCheckBox(pdfWriter3);
        com.lowagie.text.pdf.PdfWriter pdfWriter11 = null;
        char[] char_array14 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font16 = new com.lowagie.text.pdf.Type3Font(pdfWriter11, char_array14, true);
        java.lang.String[][] str_array_array17 = type3Font16.getAllNameEntries();
        com.lowagie.text.pdf.PdfFormField pdfFormField19 = com.lowagie.text.pdf.PdfFormField.createList(pdfWriter3, str_array_array17, 0);
        com.lowagie.text.pdf.PdfIndirectReference pdfIndirectReference20 = null;
        com.lowagie.text.pdf.PdfPTable pdfPTable22 = new com.lowagie.text.pdf.PdfPTable(1);
        float f24 = pdfPTable22.getRowHeight(1785737760);
        boolean b26 = pdfPTable22.isExtendLastRow(true);
        com.lowagie.text.pdf.PdfPTable pdfPTable28 = new com.lowagie.text.pdf.PdfPTable(1);
        pdfPTable22.addCell(pdfPTable28);
        com.lowagie.text.pdf.PdfPTable pdfPTable31 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell32 = pdfPTable31.getDefaultCell();
        float f33 = pdfPCell32.getIndent();
        float f34 = pdfPCell32.getFollowingIndent();
        com.lowagie.text.pdf.PdfPTable pdfPTable36 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell37 = pdfPTable36.getDefaultCell();
        float f38 = pdfPCell37.getIndent();
        com.lowagie.text.pdf.PdfPTable pdfPTable39 = pdfPCell37.getTable();
        pdfPCell32.softCloneNonPositionParameters((com.lowagie.text.Rectangle) pdfPCell37);
        com.lowagie.text.pdf.PdfPCell pdfPCell41 = new com.lowagie.text.pdf.PdfPCell(pdfPTable22, pdfPCell32);
        com.lowagie.text.pdf.PdfPTable pdfPTable43 = new com.lowagie.text.pdf.PdfPTable(1);
        float f45 = pdfPTable43.getRowHeight(1785737760);
        com.lowagie.text.pdf.PdfPCell pdfPCell46 = new com.lowagie.text.pdf.PdfPCell(pdfPTable43);
        pdfPTable22.addCell(pdfPTable43);
        java.util.ArrayList arrayList50 = pdfPTable43.getRows(764, 764);
        try {
            java.lang.Object[] obj_array52 = com.lowagie.text.pdf.SimpleBookmark.iterateOutlines(pdfWriter3, pdfIndirectReference20, (java.util.List) arrayList50, false);
            fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        assertNotNull(pdfWriter3);
        assertEquals(1, i4);
        assertEquals(0, i6);
        assertNotNull(pdfFormField10);
        assertNotNull(char_array14);
        assertNotNull(str_array_array17);
        assertNotNull(pdfFormField19);
        assertEquals(0.0f, f24);
        assertEquals(false, b26);
        assertNotNull(pdfPCell32);
        assertEquals(0.0f, f33);
        assertEquals(0.0f, f34);
        assertNotNull(pdfPCell37);
        assertEquals(0.0f, f38);
        assertNull(pdfPTable39);
        assertEquals(0.0f, f45);
        assertNotNull(arrayList50);
    }

    @Test
    void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test094");
        java.io.InputStream inputStream0 = null;
        com.lowagie.text.pdf.PdfContentByte pdfContentByte1 = null;
        com.lowagie.text.pdf.codec.wmf.MetaDo metaDo2 = new com.lowagie.text.pdf.codec.wmf.MetaDo(inputStream0, pdfContentByte1);
        java.io.InputStream inputStream3 = null;
        com.lowagie.text.pdf.codec.wmf.InputMeta inputMeta4 = new com.lowagie.text.pdf.codec.wmf.InputMeta(inputStream3);
        int i5 = inputMeta4.getLength();
        metaDo2.in = inputMeta4;
        java.io.InputStream inputStream7 = null;
        com.lowagie.text.pdf.PdfContentByte pdfContentByte8 = null;
        com.lowagie.text.pdf.codec.wmf.MetaDo metaDo9 = new com.lowagie.text.pdf.codec.wmf.MetaDo(inputStream7, pdfContentByte8);
        java.io.InputStream inputStream10 = null;
        com.lowagie.text.pdf.codec.wmf.InputMeta inputMeta11 = new com.lowagie.text.pdf.codec.wmf.InputMeta(inputStream10);
        int i12 = inputMeta11.getLength();
        metaDo9.in = inputMeta11;
        metaDo2.in = inputMeta11;
        assertEquals(0, i5);
        assertEquals(0, i12);
    }

    @Test
    void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test095");
        java.lang.String str0 = com.lowagie.text.Document.getProduct();
        assertEquals("OpenPDF", str0, "'" + str0 + "' != '" + "OpenPDF" + "'");
    }

    @Test
    void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test096");
        java.lang.String[] str_array10 = new java.lang.String[]{"text-align", "listitem", "listitem", "listitem", "listitem", "hi!", "HeiseiKakuGo-W5", "UnicodeBig", "hi!", "xmp:Nickname"};
        java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str11, str_array10);
        java.util.stream.Stream<java.lang.String> stream_str13 = arraylist_str11.parallelStream();
        arraylist_str11.add(0, "absolutex");
        boolean b17 = arraylist_str11.isEmpty();
        java.util.stream.Stream<java.lang.String> stream_str18 = arraylist_str11.stream();
        assertNotNull(str_array10);
        assertEquals(true, b12);
        assertNotNull(stream_str13);
        assertEquals(false, b17);
        assertNotNull(stream_str18);
    }

    @Test
    void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test097");
        java.lang.String[] str_array10 = new java.lang.String[]{"text-align", "listitem", "listitem", "listitem", "listitem", "hi!", "HeiseiKakuGo-W5", "UnicodeBig", "hi!", "xmp:Nickname"};
        java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str11, str_array10);
        java.util.stream.Stream<java.lang.String> stream_str13 = arraylist_str11.parallelStream();
        arraylist_str11.add(0, "absolutex");
        java.util.ListIterator<java.lang.String> listiterator_str18 = arraylist_str11.listIterator(8);
        java.util.stream.Stream<java.lang.String> stream_str19 = arraylist_str11.stream();
        java.util.Iterator<java.lang.String> iterator_str20 = arraylist_str11.iterator();
        assertNotNull(str_array10);
        assertEquals(true, b12);
        assertNotNull(stream_str13);
        assertNotNull(listiterator_str18);
        assertNotNull(stream_str19);
        assertNotNull(iterator_str20);
    }

    @Test
    void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test098");
        com.lowagie.text.pdf.PdfRectangle pdfRectangle3 = new com.lowagie.text.pdf.PdfRectangle((float) (short) -1, (float) '4', (int) (short) 1);
        float f5 = pdfRectangle3.bottom((int) 'Ë');
        int i6 = pdfRectangle3.size();
        assertEquals(203.0f, f5);
        assertEquals(4, i6);
    }

    @Test
    void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test099");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte12 = type3Font5.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte12.rectangle((float) (-3), (float) 'a', (float) (-1), (float) (byte) 0);
        com.lowagie.text.pdf.PdfWriter pdfWriter18 = pdfContentByte12.getPdfWriter();
        pdfContentByte12.ellipse((-1048577.0f), (float) 258, (float) 11, 69.411f);
        pdfContentByte12.closePathStroke();
        assertNotNull(char_array3);
        assertNotNull(pdfContentByte12);
        assertNull(pdfWriter18);
    }

    @Test
    void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test100");
        java.lang.String str0 = com.lowagie.text.Annotation.PAGE;
        assertEquals("page", str0, "'" + str0 + "' != '" + "page" + "'");
    }

    @Test
    void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test101");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Paragraph paragraph5 = com.lowagie.text.factories.ElementFactory.getParagraph(properties1);
        int i6 = properties1.size();
        com.lowagie.text.Table table7 = com.lowagie.text.factories.ElementFactory.getTable(properties1);
        table7.setNotAddedYet(false);
        table7.setOffset(0.0f);
        com.lowagie.text.Table table12 = null;
        try {
            table7.insertTable(table12, 1565, 531);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(paragraph5);
        assertEquals(0, i6);
        assertNotNull(table7);
    }

    @Test
    void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test102");
        com.lowagie.text.pdf.Barcode128 barcode128_0 = new com.lowagie.text.pdf.Barcode128();
        com.lowagie.text.pdf.Barcode39 barcode39_1 = new com.lowagie.text.pdf.Barcode39();
        barcode39_1.setCodeType(0);
        com.lowagie.text.pdf.BarcodeEANSUPP barcodeEANSUPP4 = new com.lowagie.text.pdf.BarcodeEANSUPP((com.lowagie.text.pdf.Barcode) barcode128_0, (com.lowagie.text.pdf.Barcode) barcode39_1);
        barcodeEANSUPP4.setGuardBars(true);
        barcodeEANSUPP4.setSize(100.0f);
        boolean b9 = barcodeEANSUPP4.isGuardBars();
        barcodeEANSUPP4.setSize((float) 10);
        barcodeEANSUPP4.setSize((float) 2048);
        barcodeEANSUPP4.setInkSpreading((float) 1564);
        int i16 = barcodeEANSUPP4.getTextAlignment();
        assertEquals(true, b9);
        assertEquals(0, i16);
    }

    @Test
    void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test103");
        com.lowagie.text.Chunk chunk0 = new com.lowagie.text.Chunk();
        com.lowagie.text.Image image1 = chunk0.getImage();
        com.lowagie.text.Chunk chunk3 = chunk0.setLocalGoto("text-align");
        com.lowagie.text.MarkedObject markedObject4 = new com.lowagie.text.MarkedObject((com.lowagie.text.Element) chunk3);
        com.lowagie.text.Chunk chunk7 = chunk3.setSkew((float) 2338, (float) (byte) 60);
        assertNull(image1);
        assertNotNull(chunk3);
        assertNotNull(chunk7);
    }

    @Test
    void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test104");
        com.lowagie.text.pdf.IntHashtable intHashtable0 = new com.lowagie.text.pdf.IntHashtable();
        boolean b2 = intHashtable0.containsValue(1785737760);
        int[] i_array3 = intHashtable0.getKeys();
        int i5 = intHashtable0.get(737);
        assertEquals(false, b2);
        assertNotNull(i_array3);
        assertEquals(0, i5);
    }

    @Test
    void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test105");
        com.lowagie.text.pdf.PdfEncryption pdfEncryption0 = new com.lowagie.text.pdf.PdfEncryption();
        int i1 = pdfEncryption0.getCryptoMode();
        assertEquals(0, i1);
    }

    @Test
    void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test106");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfAcroForm pdfAcroForm1 = new com.lowagie.text.pdf.PdfAcroForm(pdfWriter0);
        pdfAcroForm1.setNeedAppearances(true);
        boolean b4 = pdfAcroForm1.isDictionary();
        boolean b5 = pdfAcroForm1.isCatalog();
        com.lowagie.text.pdf.PdfWriter pdfWriter6 = null;
        com.lowagie.text.pdf.PdfWriter pdfWriter11 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField12 = com.lowagie.text.pdf.PdfFormField.createCheckBox(pdfWriter11);
        com.lowagie.text.pdf.PdfAction pdfAction14 = new com.lowagie.text.pdf.PdfAction("Cp1250");
        pdfFormField12.setAction(pdfAction14);
        com.lowagie.text.pdf.PdfFormField pdfFormField16 = new com.lowagie.text.pdf.PdfFormField(pdfWriter6, (float) 7, (float) 1L, (float) 'a', (float) 30, pdfAction14);
        pdfFormField16.setMappingName("LOCALGOTO");
        pdfFormField16.setUserName("");
        com.lowagie.text.pdf.BaseFont baseFont22 = null;
        com.lowagie.text.Font font25 = new com.lowagie.text.Font(baseFont22, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont27 = font25.getCalculatedBaseFont(false);
        boolean b30 = baseFont27.setCharAdvance(9, 0);
        int i31 = baseFont27.getCompressionLevel();
        boolean b32 = baseFont27.isSubset();
        float f35 = baseFont27.getWidthPoint("STSong-Light", 0.0f);
        float f38 = baseFont27.getWidthPoint((int) (short) 10, (float) 10);
        try {
            pdfAcroForm1.drawSingleLineOfText(pdfFormField16, "entity", baseFont27, (float) (short) 100, 36.0f, (float) 1L, (float) 522, (float) 2338);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertEquals(true, b4);
        assertEquals(false, b5);
        assertNotNull(pdfFormField12);
        assertNotNull(baseFont27);
        assertEquals(true, b30);
        assertEquals(i31, (-1));
        assertEquals(true, b32);
        assertEquals(0.0f, f35);
        assertEquals(0.0f, f38);
    }

    @Test
    void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test107");
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper1 = new com.lowagie.text.pdf.PdfPageEventHelper();
        java.io.OutputStream outputStream2 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields4 = new com.lowagie.text.pdf.PdfCopyFields(outputStream2, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter5 = pdfCopyFields4.getWriter();
        com.lowagie.text.Font font7 = null;
        com.lowagie.text.Footnote footnote8 = new com.lowagie.text.Footnote("", font7);
        com.lowagie.text.HeaderFooter headerFooter10 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote8, true);
        headerFooter10.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle13 = headerFooter10.rotate();
        com.lowagie.text.Rectangle rectangle14 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter10);
        com.lowagie.text.Document document15 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter10);
        boolean b17 = document15.setMarginMirroringTopBottom(true);
        com.lowagie.text.Font font21 = null;
        com.lowagie.text.Footnote footnote22 = new com.lowagie.text.Footnote("", font21);
        com.lowagie.text.HeaderFooter headerFooter24 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote22, true);
        headerFooter24.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph27 = headerFooter24.paragraph();
        pdfPageEventHelper1.onSection(pdfWriter5, document15, (float) 7, 262144, paragraph27);
        pdfWriter5.setStrictImageSequence(false);
        pdfWriter5.setEncryption(false, "true", "bottom", 1336);
        com.lowagie.text.pdf.PdfName pdfName36 = com.lowagie.text.pdf.PdfName.NONE;
        com.lowagie.text.pdf.PdfName pdfName37 = com.lowagie.text.pdf.PdfName.XREF;
        pdfWriter5.setDefaultColorspace(pdfName36, (com.lowagie.text.pdf.PdfObject) pdfName37);
        pdfWriter5.setAtLeastPdfVersion('È');
        com.lowagie.text.pdf.PdfFormField pdfFormField42 = com.lowagie.text.pdf.PdfFormField.createRadioButton(pdfWriter5, true);
        com.lowagie.text.pdf.PdfLayer pdfLayer43 = com.lowagie.text.pdf.PdfLayer.createTitle("JustifyAll", pdfWriter5);
        com.lowagie.text.pdf.PdfObject pdfObject44 = pdfLayer43.getPdfObject();
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper46 = new com.lowagie.text.pdf.PdfPageEventHelper();
        java.io.OutputStream outputStream47 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields49 = new com.lowagie.text.pdf.PdfCopyFields(outputStream47, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter50 = pdfCopyFields49.getWriter();
        com.lowagie.text.Font font52 = null;
        com.lowagie.text.Footnote footnote53 = new com.lowagie.text.Footnote("", font52);
        com.lowagie.text.HeaderFooter headerFooter55 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote53, true);
        headerFooter55.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle58 = headerFooter55.rotate();
        com.lowagie.text.Rectangle rectangle59 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter55);
        com.lowagie.text.Document document60 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter55);
        boolean b62 = document60.setMarginMirroringTopBottom(true);
        com.lowagie.text.Font font66 = null;
        com.lowagie.text.Footnote footnote67 = new com.lowagie.text.Footnote("", font66);
        com.lowagie.text.HeaderFooter headerFooter69 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote67, true);
        headerFooter69.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph72 = headerFooter69.paragraph();
        pdfPageEventHelper46.onSection(pdfWriter50, document60, (float) 7, 262144, paragraph72);
        pdfWriter50.setStrictImageSequence(false);
        pdfWriter50.setEncryption(false, "true", "bottom", 1336);
        com.lowagie.text.pdf.PdfName pdfName81 = com.lowagie.text.pdf.PdfName.NONE;
        com.lowagie.text.pdf.PdfName pdfName82 = com.lowagie.text.pdf.PdfName.XREF;
        pdfWriter50.setDefaultColorspace(pdfName81, (com.lowagie.text.pdf.PdfObject) pdfName82);
        pdfWriter50.setAtLeastPdfVersion('È');
        com.lowagie.text.pdf.PdfFormField pdfFormField87 = com.lowagie.text.pdf.PdfFormField.createRadioButton(pdfWriter50, true);
        com.lowagie.text.pdf.PdfLayer pdfLayer88 = com.lowagie.text.pdf.PdfLayer.createTitle("JustifyAll", pdfWriter50);
        com.lowagie.text.pdf.PdfObject pdfObject89 = pdfLayer88.getPdfObject();
        pdfLayer43.addChild(pdfLayer88);
        pdfLayer43.setZoom((float) 262144, (float) 258);
        assertNotNull(pdfWriter5);
        assertNotNull(rectangle13);
        assertEquals(true, b17);
        assertNotNull(paragraph27);
        assertNotNull(pdfName36);
        assertNotNull(pdfName37);
        assertNotNull(pdfFormField42);
        assertNotNull(pdfLayer43);
        assertNotNull(pdfObject44);
        assertNotNull(pdfWriter50);
        assertNotNull(rectangle58);
        assertEquals(true, b62);
        assertNotNull(paragraph72);
        assertNotNull(pdfName81);
        assertNotNull(pdfName82);
        assertNotNull(pdfFormField87);
        assertNotNull(pdfLayer88);
        assertNotNull(pdfObject89);
    }

    @Test
    void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test108");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ANNOTS;
        assertNotNull(pdfName0);
    }

    @Test
    void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test109");
        com.lowagie.text.Font font3 = new com.lowagie.text.Font(8, (float) ' ');
        com.lowagie.text.Chunk chunk4 = new com.lowagie.text.Chunk('Æ', font3);
        font3.setFamily("inline");
    }

    @Test
    void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test110");
        com.lowagie.text.pdf.PdfReader pdfReader4 = null;
        byte[] byte_array9 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream10 = new com.lowagie.text.pdf.PRStream(pdfReader4, byte_array9);
        com.lowagie.text.pdf.PdfReader pdfReader11 = null;
        byte[] byte_array16 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream17 = new com.lowagie.text.pdf.PRStream(pdfReader11, byte_array16);
        pRStream10.setData(byte_array16, false, (int) (byte) 100);
        byte[] byte_array21 = pRStream10.getBytes();
        com.lowagie.text.pdf.PdfReader pdfReader22 = null;
        byte[] byte_array27 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream28 = new com.lowagie.text.pdf.PRStream(pdfReader22, byte_array27);
        com.lowagie.text.pdf.PdfReader pdfReader29 = null;
        byte[] byte_array34 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream35 = new com.lowagie.text.pdf.PRStream(pdfReader29, byte_array34);
        pRStream28.setData(byte_array34, false, (int) (byte) 100);
        byte[] byte_array39 = pRStream28.getBytes();
        pRStream10.setData(byte_array39);
        byte[] byte_array42 = com.lowagie.text.pdf.crypto.IVGenerator.getIV(0);
        com.lowagie.text.pdf.PRTokeniser pRTokeniser43 = new com.lowagie.text.pdf.PRTokeniser(byte_array42);
        com.lowagie.text.pdf.BaseFont baseFont46 = com.lowagie.text.pdf.BaseFont.createFont("xmp:Thumbnails", "widths", true, false, byte_array39, byte_array42, true, false);
        com.lowagie.text.pdf.PdfString pdfString47 = new com.lowagie.text.pdf.PdfString();
        java.lang.String str48 = pdfString47.toUnicodeString();
        byte[] byte_array49 = pdfString47.getOriginalBytes();
        try {
            com.lowagie.text.pdf.PdfReader pdfReader50 = new com.lowagie.text.pdf.PdfReader(byte_array39, byte_array49);
            fail("Expected exception of type com.lowagie.text.exceptions.InvalidPdfException");
        } catch (com.lowagie.text.exceptions.InvalidPdfException e) {
        }
        assertNotNull(byte_array9);
        assertNotNull(byte_array16);
        assertNotNull(byte_array21);
        assertNotNull(byte_array27);
        assertNotNull(byte_array34);
        assertNotNull(byte_array39);
        assertNotNull(byte_array42);
        assertNull(baseFont46);
        assertEquals("", str48, "'" + str48 + "' != '" + "" + "'");
        assertNotNull(byte_array49);
    }

    @Test
    void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test111");
        com.lowagie.text.Cell cell1 = new com.lowagie.text.Cell(false);
        cell1.setColspan(1040);
        cell1.setUseAscender(false);
        try {
            float f6 = cell1.getTop();
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
    }

    @Test
    void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test112");
        int i0 = com.lowagie.text.pdf.BarcodePDF417.PDF417_USE_RAW_CODEWORDS;
        assertEquals(64, i0);
    }

    @Test
    void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test113");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte12 = type3Font5.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        java.awt.Color color13 = null;
        try {
            pdfContentByte12.setColorStroke(color13);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(char_array3);
        assertNotNull(pdfContentByte12);
    }

    @Test
    void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test114");
        com.lowagie.text.ZapfDingbatsList zapfDingbatsList2 = new com.lowagie.text.ZapfDingbatsList(2, 2368);
        boolean b3 = zapfDingbatsList2.isLowercase();
        float f4 = zapfDingbatsList2.getIndentationRight();
        zapfDingbatsList2.setPostSymbol("content");
        boolean b7 = zapfDingbatsList2.isNestable();
        assertEquals(false, b3);
        assertEquals(0.0f, f4);
        assertEquals(true, b7);
    }

    @Test
    void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test115");
        com.lowagie.text.Header header2 = new com.lowagie.text.Header("bgblue", "list");
    }

    @Test
    void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test116");
        int i0 = com.lowagie.text.pdf.ColumnText.DIGITS_EN2AN_INIT_LR;
        assertEquals(96, i0);
    }

    @Test
    void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test117");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        pdfPTable1.setFooterRows((-1));
        pdfPTable1.setSpacingBefore((float) 20);
        pdfPTable1.setExtendLastRow(false, true);
        pdfPTable1.addCell("com/lowagie/text/pdf/fonts/");
        pdfPTable1.setWidthPercentage(29.0f);
        assertNotNull(pdfPCell2);
    }

    @Test
    void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test118");
        int i0 = com.lowagie.text.Jpeg2000.JP2_DBTL;
        assertEquals(1685348972, i0);
    }

    @Test
    void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test119");
        try {
            byte[] byte_array1 = com.lowagie.text.pdf.BarcodeCodabar.getBarsCodabar("bottom");
            fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test120");
        byte[] byte_array2 = null;
        com.lowagie.text.pdf.PdfReader pdfReader3 = null;
        byte[] byte_array8 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream9 = new com.lowagie.text.pdf.PRStream(pdfReader3, byte_array8);
        com.lowagie.text.pdf.PdfReader pdfReader10 = null;
        byte[] byte_array15 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream16 = new com.lowagie.text.pdf.PRStream(pdfReader10, byte_array15);
        pRStream9.setData(byte_array15, false, (int) (byte) 100);
        com.lowagie.text.ImgJBIG2 imgJBIG2_20 = new com.lowagie.text.ImgJBIG2(4, 1564, byte_array2, byte_array15);
        int i21 = imgJBIG2_20.getDpiY();
        int[] i_array22 = imgJBIG2_20.getTransparency();
        float f23 = imgJBIG2_20.getScaledWidth();
        imgJBIG2_20.makeMask();
        java.io.OutputStream outputStream26 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields28 = new com.lowagie.text.pdf.PdfCopyFields(outputStream26, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter29 = pdfCopyFields28.getWriter();
        int i30 = pdfWriter29.getCurrentPageNumber();
        pdfWriter29.setLinearPageMode();
        com.lowagie.text.pdf.PdfLayer pdfLayer32 = com.lowagie.text.pdf.PdfLayer.createTitle("title", pdfWriter29);
        imgJBIG2_20.setLayer((com.lowagie.text.pdf.PdfOCG) pdfLayer32);
        imgJBIG2_20.setIndentationLeft((float) 100);
        int i36 = imgJBIG2_20.type();
        float f37 = imgJBIG2_20.getInitialRotation();
        assertNotNull(byte_array8);
        assertNotNull(byte_array15);
        assertEquals(0, i21);
        assertNull(i_array22);
        assertEquals(4.0f, f23);
        assertNotNull(pdfWriter29);
        assertEquals(1, i30);
        assertNotNull(pdfLayer32);
        assertEquals(36, i36);
        assertEquals(0.0f, f37);
    }

    @Test
    void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test121");
        java.io.OutputStream outputStream0 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields2 = new com.lowagie.text.pdf.PdfCopyFields(outputStream0, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = pdfCopyFields2.getWriter();
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        try {
            pdfWriter3.addNamedDestinations(map_str_str4, 1046);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfWriter3);
    }

    @Test
    void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test122");
        com.lowagie.text.xml.xmp.DublinCoreSchema dublinCoreSchema0 = new com.lowagie.text.xml.xmp.DublinCoreSchema();
        dublinCoreSchema0.addDescription("left");
        java.lang.Object obj5 = dublinCoreSchema0.setProperty("page-break-after", "OpenPDF 1.2.12.SNAPSHOT");
        assertNull(obj5);
    }

    @Test
    void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test123");
        com.lowagie.text.pdf.FontSelector fontSelector0 = new com.lowagie.text.pdf.FontSelector();
        try {
            com.lowagie.text.Phrase phrase2 = fontSelector0.process("");
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
    }

    @Test
    void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test124");
        com.lowagie.text.Chapter chapter1 = new com.lowagie.text.Chapter((int) (short) -1);
        com.lowagie.text.MarkedSection markedSection2 = chapter1.addMarkedSection();
        markedSection2.setIndentation((float) (byte) -1);
        markedSection2.setIndentationRight((float) (byte) 10);
        java.util.ArrayList arrayList7 = markedSection2.getChunks();
        markedSection2.setIndentationLeft((float) '#');
        assertNotNull(markedSection2);
        assertNotNull(arrayList7);
    }

    @Test
    void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test125");
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper4 = new com.lowagie.text.pdf.PdfPageEventHelper();
        java.io.OutputStream outputStream5 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields7 = new com.lowagie.text.pdf.PdfCopyFields(outputStream5, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter8 = pdfCopyFields7.getWriter();
        com.lowagie.text.Font font10 = null;
        com.lowagie.text.Footnote footnote11 = new com.lowagie.text.Footnote("", font10);
        com.lowagie.text.HeaderFooter headerFooter13 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote11, true);
        headerFooter13.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle16 = headerFooter13.rotate();
        com.lowagie.text.Rectangle rectangle17 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter13);
        com.lowagie.text.Document document18 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter13);
        boolean b20 = document18.setMarginMirroringTopBottom(true);
        com.lowagie.text.Font font24 = null;
        com.lowagie.text.Footnote footnote25 = new com.lowagie.text.Footnote("", font24);
        com.lowagie.text.HeaderFooter headerFooter27 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote25, true);
        headerFooter27.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph30 = headerFooter27.paragraph();
        pdfPageEventHelper4.onSection(pdfWriter8, document18, (float) 7, 262144, paragraph30);
        pdfWriter8.setStrictImageSequence(false);
        pdfWriter8.setEncryption(false, "true", "bottom", 1336);
        com.lowagie.text.pdf.PdfName pdfName39 = com.lowagie.text.pdf.PdfName.RENDITION;
        pdfWriter8.setTabs(pdfName39);
        byte[] byte_array41 = null;
        com.lowagie.text.pdf.PdfReader pdfReader42 = null;
        byte[] byte_array47 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream48 = new com.lowagie.text.pdf.PRStream(pdfReader42, byte_array47);
        com.lowagie.text.pdf.PdfReader pdfReader49 = null;
        byte[] byte_array54 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream55 = new com.lowagie.text.pdf.PRStream(pdfReader49, byte_array54);
        pRStream48.setData(byte_array54, false, (int) (byte) 100);
        byte[] byte_array59 = pRStream48.getBytes();
        pdfWriter8.setEncryption(byte_array41, byte_array59, 32768, true);
        try {
            com.lowagie.text.ImgRaw imgRaw63 = new com.lowagie.text.ImgRaw(12, 260, 40, 1785737827, byte_array41);
            fail("Expected exception of type com.lowagie.text.BadElementException");
        } catch (com.lowagie.text.BadElementException e) {
        }
        assertNotNull(pdfWriter8);
        assertNotNull(rectangle16);
        assertEquals(true, b20);
        assertNotNull(paragraph30);
        assertNotNull(pdfName39);
        assertNotNull(byte_array47);
        assertNotNull(byte_array54);
        assertNotNull(byte_array59);
    }

    @Test
    void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test126");
        com.lowagie.text.pdf.PdfDashPattern pdfDashPattern2 = new com.lowagie.text.pdf.PdfDashPattern((float) 55, (float) 40);
    }

    @Test
    void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test127");
        com.lowagie.text.pdf.MultiColumnText multiColumnText0 = new com.lowagie.text.pdf.MultiColumnText();
        boolean b1 = multiColumnText0.isNestable();
        multiColumnText0.setArabicOptions(247);
        try {
            multiColumnText0.setRunDirection(737);
            fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        assertEquals(false, b1);
    }

    @Test
    void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test128");
        com.lowagie.text.pdf.IntHashtable intHashtable0 = new com.lowagie.text.pdf.IntHashtable();
        boolean b2 = intHashtable0.containsValue(1785737760);
        int[] i_array3 = intHashtable0.getKeys();
        int[] i_array4 = intHashtable0.getKeys();
        int i6 = intHashtable0.get(9);
        int i8 = intHashtable0.remove((int) 'Ã');
        int[] i_array9 = intHashtable0.getKeys();
        int[] i_array10 = intHashtable0.toOrderedKeys();
        int[] i_array11 = intHashtable0.toOrderedKeys();
        boolean b13 = intHashtable0.containsKey(40);
        assertEquals(false, b2);
        assertNotNull(i_array3);
        assertNotNull(i_array4);
        assertEquals(0, i6);
        assertEquals(0, i8);
        assertNotNull(i_array9);
        assertNotNull(i_array10);
        assertNotNull(i_array11);
        assertEquals(false, b13);
    }

    @Test
    void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test129");
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
        int i28 = paragraph26.getAlignment();
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertEquals(0, i28);
    }

    @Test
    void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test130");
        com.lowagie.text.SimpleCell simpleCell1 = new com.lowagie.text.SimpleCell(true);
        simpleCell1.setSpacing_top((float) 226);
        simpleCell1.setWidth(12.0f);
        int i6 = simpleCell1.type();
        assertEquals(20, i6);
    }

    @Test
    void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test131");
        java.lang.String str0 = com.lowagie.text.html.Markup.CSS_KEY_BORDERWIDTH;
        assertEquals("border-width", str0, "'" + str0 + "' != '" + "border-width" + "'");
    }

    @Test
    void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test132");
        byte[] byte_array2 = null;
        com.lowagie.text.pdf.PdfReader pdfReader3 = null;
        byte[] byte_array8 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream9 = new com.lowagie.text.pdf.PRStream(pdfReader3, byte_array8);
        com.lowagie.text.pdf.PdfReader pdfReader10 = null;
        byte[] byte_array15 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream16 = new com.lowagie.text.pdf.PRStream(pdfReader10, byte_array15);
        pRStream9.setData(byte_array15, false, (int) (byte) 100);
        com.lowagie.text.ImgJBIG2 imgJBIG2_20 = new com.lowagie.text.ImgJBIG2(4, 1564, byte_array2, byte_array15);
        int i21 = imgJBIG2_20.getCompressionLevel();
        java.lang.String str22 = imgJBIG2_20.getAlt();
        imgJBIG2_20.setSmask(true);
        com.lowagie.text.pdf.PdfPCell pdfPCell25 = new com.lowagie.text.pdf.PdfPCell((com.lowagie.text.Image) imgJBIG2_20);
        imgJBIG2_20.makeMask();
        boolean b27 = imgJBIG2_20.isInverted();
        assertNotNull(byte_array8);
        assertNotNull(byte_array15);
        assertEquals(i21, (-1));
        assertNull(str22);
        assertEquals(false, b27);
    }

    @Test
    void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test133");
        com.lowagie.text.pdf.draw.VerticalPositionMark verticalPositionMark0 = new com.lowagie.text.pdf.draw.VerticalPositionMark();
    }

    @Test
    void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test134");
        java.lang.String str0 = com.lowagie.text.FontFactory.HELVETICA;
        assertEquals("Helvetica", str0, "'" + str0 + "' != '" + "Helvetica" + "'");
    }

    @Test
    void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test135");
        java.lang.String str0 = com.lowagie.text.html.Markup.HTML_TAG_LINK;
        assertEquals("link", str0, "'" + str0 + "' != '" + "link" + "'");
    }

    @Test
    void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test136");
        com.lowagie.text.pdf.ByteBuffer byteBuffer1 = new com.lowagie.text.pdf.ByteBuffer(1564);
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields3 = new com.lowagie.text.pdf.PdfCopyFields((java.io.OutputStream) byteBuffer1, 'Ã');
        com.lowagie.text.pdf.ByteBuffer byteBuffer5 = byteBuffer1.append(24);
        com.lowagie.text.pdf.ByteBuffer byteBuffer7 = byteBuffer1.append((byte) 100);
        com.lowagie.text.pdf.ByteBuffer byteBuffer9 = byteBuffer1.appendHex((byte) 9);
        com.lowagie.text.pdf.PdfDictionary pdfDictionary10 = null;
        com.lowagie.text.xml.xmp.XmpWriter xmpWriter12 = new com.lowagie.text.xml.xmp.XmpWriter((java.io.OutputStream) byteBuffer1, pdfDictionary10, 1042);
        int i13 = byteBuffer1.size();
        assertNotNull(byteBuffer5);
        assertNotNull(byteBuffer7);
        assertNotNull(byteBuffer9);
        assertEquals(5, i13);
    }

    @Test
    void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test137");
        com.lowagie.text.Table table2 = new com.lowagie.text.Table(13, 1791);
        com.lowagie.text.Font font4 = null;
        com.lowagie.text.Footnote footnote5 = new com.lowagie.text.Footnote("", font4);
        com.lowagie.text.HeaderFooter headerFooter7 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote5, true);
        headerFooter7.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle10 = headerFooter7.rotate();
        com.lowagie.text.Rectangle rectangle11 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter7);
        com.lowagie.text.Document document12 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter7);
        java.io.OutputStream outputStream13 = null;
        com.lowagie.text.pdf.PdfCopy pdfCopy14 = new com.lowagie.text.pdf.PdfCopy(document12, outputStream13);
        boolean b15 = table2.process((com.lowagie.text.ElementListener) pdfCopy14);
        float f16 = pdfCopy14.getUserunit();
        boolean b17 = pdfCopy14.isTagged();
        assertNotNull(rectangle10);
        assertEquals(false, b15);
        assertEquals(0.0f, f16);
        assertEquals(false, b17);
    }

    @Test
    void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test138");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte12 = type3Font5.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte12.fillStroke();
        pdfContentByte12.setLineDash((float) 'c', 2.0f);
        com.lowagie.text.pdf.PdfDocument pdfDocument17 = pdfContentByte12.getPdfDocument();
        com.lowagie.text.pdf.PdfStructureElement pdfStructureElement18 = null;
        try {
            pdfContentByte12.beginMarkedContentSequence(pdfStructureElement18);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(char_array3);
        assertNotNull(pdfContentByte12);
        assertNull(pdfDocument17);
    }

    @Test
    void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test139");
        com.lowagie.text.Anchor anchor1 = new com.lowagie.text.Anchor("");
    }

    @Test
    void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test140");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField1 = com.lowagie.text.pdf.PdfFormField.createCheckBox(pdfWriter0);
        pdfFormField1.setValueAsName("SKEW");
        com.lowagie.text.pdf.PdfName pdfName4 = com.lowagie.text.pdf.PdfName.U;
        com.lowagie.text.pdf.PdfObject pdfObject5 = com.lowagie.text.pdf.PdfReader.getPdfObjectRelease((com.lowagie.text.pdf.PdfObject) pdfFormField1, (com.lowagie.text.pdf.PdfObject) pdfName4);
        try {
            com.lowagie.text.pdf.PdfIndirectReference pdfIndirectReference6 = pdfFormField1.getIndirectReference();
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfFormField1);
        assertNotNull(pdfName4);
        assertNotNull(pdfObject5);
    }

    @Test
    void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test141");
        java.io.OutputStream outputStream0 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields2 = new com.lowagie.text.pdf.PdfCopyFields(outputStream0, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = pdfCopyFields2.getWriter();
        int i4 = pdfWriter3.getCurrentPageNumber();
        pdfWriter3.setLinearPageMode();
        com.lowagie.text.pdf.PdfWriter pdfWriter6 = null;
        char[] char_array9 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font11 = new com.lowagie.text.pdf.Type3Font(pdfWriter6, char_array9, true);
        com.lowagie.text.pdf.Type3Font type3Font13 = new com.lowagie.text.pdf.Type3Font(pdfWriter3, char_array9, false);
        com.lowagie.text.pdf.PdfStream pdfStream14 = type3Font13.getFullFontStream();
        assertNotNull(pdfWriter3);
        assertEquals(1, i4);
        assertNotNull(char_array9);
        assertNull(pdfStream14);
    }

    @Test
    void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test142");
        com.lowagie.text.pdf.collection.PdfCollectionField pdfCollectionField2 = new com.lowagie.text.pdf.collection.PdfCollectionField("ZapfDingbats", (int) '#');
        boolean b3 = pdfCollectionField2.isCollectionItem();
        pdfCollectionField2.setEditable(false);
        assertEquals(false, b3);
    }

    @Test
    void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test143");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte12 = type3Font5.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte12.fillStroke();
        com.lowagie.text.pdf.FontMapper fontMapper16 = null;
        java.awt.print.PrinterJob printerJob19 = null;
        java.awt.Graphics2D graphics2D20 = pdfContentByte12.createPrinterGraphics((-1.0f), (float) (-1), fontMapper16, true, (float) (byte) 1, printerJob19);
        com.lowagie.text.pdf.FontMapper fontMapper23 = null;
        java.awt.Graphics2D graphics2D24 = pdfContentByte12.createGraphics(29.0f, (float) 526, fontMapper23);
        graphics2D24.fill3DRect((int) (byte) 10, 40, 34, 25610, true);
        assertNotNull(char_array3);
        assertNotNull(pdfContentByte12);
        assertNotNull(graphics2D20);
        assertNotNull(graphics2D24);
    }

    @Test
    void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test144");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Paragraph paragraph5 = com.lowagie.text.factories.ElementFactory.getParagraph(properties1);
        int i6 = properties1.size();
        com.lowagie.text.Table table7 = com.lowagie.text.factories.ElementFactory.getTable(properties1);
        boolean b8 = table7.isLocked();
        try {
            java.lang.Object obj11 = table7.getElement(1785737827, (int) 'e');
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(paragraph5);
        assertEquals(0, i6);
        assertNotNull(table7);
        assertEquals(false, b8);
    }

    @Test
    void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test145");
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
        pdfWriter4.setAtLeastPdfVersion('È');
        com.lowagie.text.pdf.PdfFormField pdfFormField41 = com.lowagie.text.pdf.PdfFormField.createRadioButton(pdfWriter4, true);
        com.lowagie.text.pdf.PdfPTable pdfPTable43 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell44 = pdfPTable43.getDefaultCell();
        float f45 = pdfPCell44.getIndent();
        float f46 = pdfPCell44.getRightIndent();
        pdfPCell44.setIndent((float) 302);
        com.lowagie.text.pdf.RadioCheckField radioCheckField51 = new com.lowagie.text.pdf.RadioCheckField(pdfWriter4, (com.lowagie.text.Rectangle) pdfPCell44, "pdf", "operation");
        radioCheckField51.setBorderStyle(0);
        radioCheckField51.setText("http://www.aiim.org/pdfa/ns/id/");
        com.lowagie.text.pdf.BaseFont baseFont56 = radioCheckField51.getFont();
        radioCheckField51.setMaxCharacterLength(8);
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertNotNull(pdfName35);
        assertNotNull(pdfName36);
        assertNotNull(pdfFormField41);
        assertNotNull(pdfPCell44);
        assertEquals(0.0f, f45);
        assertEquals(0.0f, f46);
        assertNotNull(baseFont56);
    }

    @Test
    void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test146");
        com.lowagie.text.pdf.PdfArray pdfArray0 = new com.lowagie.text.pdf.PdfArray();
    }

    @Test
    void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test147");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte12 = type3Font5.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte12.fillStroke();
        com.lowagie.text.pdf.FontMapper fontMapper16 = null;
        java.awt.print.PrinterJob printerJob19 = null;
        java.awt.Graphics2D graphics2D20 = pdfContentByte12.createPrinterGraphics((-1.0f), (float) (-1), fontMapper16, true, (float) (byte) 1, printerJob19);
        com.lowagie.text.pdf.FontMapper fontMapper23 = null;
        java.awt.Graphics2D graphics2D24 = pdfContentByte12.createGraphics(29.0f, (float) 526, fontMapper23);
        java.awt.Color color29 = java.awt.Color.cyan;
        try {
            com.lowagie.text.pdf.PdfPatternPainter pdfPatternPainter30 = pdfContentByte12.createPattern((float) 'a', (float) 'a', 4.0f, (float) 2, color29);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(char_array3);
        assertNotNull(pdfContentByte12);
        assertNotNull(graphics2D20);
        assertNotNull(graphics2D24);
        assertNotNull(color29);
    }

    @Test
    void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test148");
        int i0 = com.lowagie.text.pdf.PdfWriter.HideWindowUI;
        assertEquals(16384, i0);
    }

    @Test
    void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test149");
        int i0 = java.awt.geom.PathIterator.SEG_CUBICTO;
        assertEquals(3, i0);
    }

    @Test
    void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test150");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        float f3 = pdfPTable1.getRowHeight(1785737760);
        boolean b5 = pdfPTable1.isExtendLastRow(true);
        com.lowagie.text.pdf.PdfPTable pdfPTable7 = new com.lowagie.text.pdf.PdfPTable(1);
        pdfPTable1.addCell(pdfPTable7);
        com.lowagie.text.pdf.PdfPTable pdfPTable10 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell11 = pdfPTable10.getDefaultCell();
        float f12 = pdfPCell11.getIndent();
        float f13 = pdfPCell11.getFollowingIndent();
        com.lowagie.text.pdf.PdfPTable pdfPTable15 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell16 = pdfPTable15.getDefaultCell();
        float f17 = pdfPCell16.getIndent();
        com.lowagie.text.pdf.PdfPTable pdfPTable18 = pdfPCell16.getTable();
        pdfPCell11.softCloneNonPositionParameters((com.lowagie.text.Rectangle) pdfPCell16);
        com.lowagie.text.pdf.PdfPCell pdfPCell20 = new com.lowagie.text.pdf.PdfPCell(pdfPTable1, pdfPCell11);
        pdfPCell11.setUseAscender(true);
        java.awt.Color color23 = pdfPCell11.getBorderColorRight();
        assertEquals(0.0f, f3);
        assertEquals(false, b5);
        assertNotNull(pdfPCell11);
        assertEquals(0.0f, f12);
        assertEquals(0.0f, f13);
        assertNotNull(pdfPCell16);
        assertEquals(0.0f, f17);
        assertNull(pdfPTable18);
        assertNull(color23);
    }

    @Test
    void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test151");
        com.lowagie.text.pdf.MultiColumnText multiColumnText0 = new com.lowagie.text.pdf.MultiColumnText();
        boolean b1 = multiColumnText0.isNestable();
        multiColumnText0.setArabicOptions(247);
        multiColumnText0.setSpaceCharRatio((-1048577.0f));
        assertEquals(false, b1);
    }

    @Test
    void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test152");
        com.lowagie.text.pdf.PdfReader pdfReader4 = null;
        byte[] byte_array9 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream10 = new com.lowagie.text.pdf.PRStream(pdfReader4, byte_array9);
        com.lowagie.text.pdf.PdfReader pdfReader11 = null;
        byte[] byte_array16 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream17 = new com.lowagie.text.pdf.PRStream(pdfReader11, byte_array16);
        pRStream10.setData(byte_array16, false, (int) (byte) 100);
        byte[] byte_array21 = pRStream10.getBytes();
        com.lowagie.text.pdf.PdfReader pdfReader22 = null;
        byte[] byte_array27 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream28 = new com.lowagie.text.pdf.PRStream(pdfReader22, byte_array27);
        com.lowagie.text.pdf.PdfReader pdfReader29 = null;
        byte[] byte_array34 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream35 = new com.lowagie.text.pdf.PRStream(pdfReader29, byte_array34);
        pRStream28.setData(byte_array34, false, (int) (byte) 100);
        byte[] byte_array39 = pRStream28.getBytes();
        pRStream10.setData(byte_array39);
        byte[] byte_array42 = com.lowagie.text.pdf.crypto.IVGenerator.getIV(0);
        com.lowagie.text.pdf.PdfName pdfName43 = com.lowagie.text.pdf.PdfName.Q;
        byte[] byte_array44 = com.lowagie.text.pdf.PdfReader.decodePredictor(byte_array42, (com.lowagie.text.pdf.PdfObject) pdfName43);
        try {
            com.lowagie.text.pdf.BaseFont baseFont45 = com.lowagie.text.pdf.BaseFont.createFont("pdf:Producer", "padding-left", false, false, byte_array39, byte_array42);
            fail("Expected exception of type com.lowagie.text.DocumentException");
        } catch (com.lowagie.text.DocumentException e) {
        }
        assertNotNull(byte_array9);
        assertNotNull(byte_array16);
        assertNotNull(byte_array21);
        assertNotNull(byte_array27);
        assertNotNull(byte_array34);
        assertNotNull(byte_array39);
        assertNotNull(byte_array42);
        assertNotNull(pdfName43);
        assertNotNull(byte_array44);
    }

    @Test
    void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test153");
        byte[] byte_array2 = null;
        com.lowagie.text.pdf.PdfReader pdfReader3 = null;
        byte[] byte_array8 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream9 = new com.lowagie.text.pdf.PRStream(pdfReader3, byte_array8);
        com.lowagie.text.pdf.PdfReader pdfReader10 = null;
        byte[] byte_array15 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream16 = new com.lowagie.text.pdf.PRStream(pdfReader10, byte_array15);
        pRStream9.setData(byte_array15, false, (int) (byte) 100);
        com.lowagie.text.ImgJBIG2 imgJBIG2_20 = new com.lowagie.text.ImgJBIG2(4, 1564, byte_array2, byte_array15);
        int i21 = imgJBIG2_20.getCompressionLevel();
        java.lang.String str22 = imgJBIG2_20.getAlt();
        imgJBIG2_20.setSmask(true);
        com.lowagie.text.pdf.PdfPCell pdfPCell25 = new com.lowagie.text.pdf.PdfPCell((com.lowagie.text.Image) imgJBIG2_20);
        com.lowagie.text.Annotation annotation32 = new com.lowagie.text.Annotation("Times-Roman", "leading", (float) 262, (float) 8, (float) (short) 100, 10.0f);
        imgJBIG2_20.setAnnotation(annotation32);
        assertNotNull(byte_array8);
        assertNotNull(byte_array15);
        assertEquals(i21, (-1));
        assertNull(str22);
    }

    @Test
    void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test154");
        com.lowagie.text.pdf.Barcode128 barcode128_0 = new com.lowagie.text.pdf.Barcode128();
        com.lowagie.text.pdf.Barcode39 barcode39_1 = new com.lowagie.text.pdf.Barcode39();
        barcode39_1.setCodeType(0);
        com.lowagie.text.pdf.BarcodeEANSUPP barcodeEANSUPP4 = new com.lowagie.text.pdf.BarcodeEANSUPP((com.lowagie.text.pdf.Barcode) barcode128_0, (com.lowagie.text.pdf.Barcode) barcode39_1);
        barcodeEANSUPP4.setGuardBars(true);
        barcodeEANSUPP4.setSize(100.0f);
        boolean b9 = barcodeEANSUPP4.isGuardBars();
        barcodeEANSUPP4.setSize((float) 10);
        barcodeEANSUPP4.setBaseline((float) 12);
        barcodeEANSUPP4.setCode("xmpMM:ManageUI");
        assertEquals(true, b9);
    }

    @Test
    void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test155");
        com.lowagie.text.pdf.PdfString pdfString0 = new com.lowagie.text.pdf.PdfString();
        byte[] byte_array1 = pdfString0.getOriginalBytes();
        java.lang.String str2 = pdfString0.toUnicodeString();
        assertNotNull(byte_array1);
        assertEquals("", str2, "'" + str2 + "' != '" + "" + "'");
    }

    @Test
    void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test156");
        com.lowagie.text.pdf.draw.DrawInterface drawInterface0 = null;
        com.lowagie.text.pdf.draw.VerticalPositionMark verticalPositionMark2 = new com.lowagie.text.pdf.draw.VerticalPositionMark(drawInterface0, (float) (short) 10);
        com.lowagie.text.Chunk chunk5 = new com.lowagie.text.Chunk(drawInterface0, (float) 1024, false);
        com.lowagie.text.Font font11 = com.lowagie.text.FontFactory.getFont("top", "absolutex", (float) (-1), 6);
        com.lowagie.text.Chunk chunk12 = com.lowagie.text.SpecialSymbol.get(' ', font11);
        com.lowagie.text.pdf.PdfWriter pdfWriter13 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField14 = com.lowagie.text.pdf.PdfFormField.createCheckBox(pdfWriter13);
        com.lowagie.text.pdf.PdfAction pdfAction16 = new com.lowagie.text.pdf.PdfAction("Cp1250");
        pdfFormField14.setAction(pdfAction16);
        com.lowagie.text.Chunk chunk18 = chunk12.setAction(pdfAction16);
        com.lowagie.text.pdf.DefaultSplitCharacter defaultSplitCharacter19 = new com.lowagie.text.pdf.DefaultSplitCharacter();
        com.lowagie.text.Chunk chunk20 = chunk18.setSplitCharacter((com.lowagie.text.SplitCharacter) defaultSplitCharacter19);
        com.lowagie.text.Chunk chunk21 = chunk5.setSplitCharacter((com.lowagie.text.SplitCharacter) defaultSplitCharacter19);
        assertNotNull(font11);
        assertNotNull(chunk12);
        assertNotNull(pdfFormField14);
        assertNotNull(chunk18);
        assertNotNull(chunk20);
        assertNotNull(chunk21);
    }

    @Test
    void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test157");
        int i0 = com.lowagie.text.Element.CCITT_BLACKIS1;
        assertEquals(1, i0);
    }

    @Test
    void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test158");
        java.io.InputStream inputStream0 = null;
        com.lowagie.text.pdf.PdfContentByte pdfContentByte1 = null;
        com.lowagie.text.pdf.codec.wmf.MetaDo metaDo2 = new com.lowagie.text.pdf.codec.wmf.MetaDo(inputStream0, pdfContentByte1);
        java.io.InputStream inputStream3 = null;
        com.lowagie.text.pdf.codec.wmf.InputMeta inputMeta4 = new com.lowagie.text.pdf.codec.wmf.InputMeta(inputStream3);
        int i5 = inputMeta4.getLength();
        metaDo2.in = inputMeta4;
        com.lowagie.text.pdf.PdfWriter pdfWriter7 = null;
        char[] char_array10 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font12 = new com.lowagie.text.pdf.Type3Font(pdfWriter7, char_array10, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte19 = type3Font12.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte19.fillStroke();
        pdfContentByte19.setLineDash((float) 'c', 2.0f);
        metaDo2.cb = pdfContentByte19;
        try {
            pdfContentByte19.showTextAlignedKerned(15, "itext", 1.0E7f, (float) (short) 1, (float) '#');
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertEquals(0, i5);
        assertNotNull(char_array10);
        assertNotNull(pdfContentByte19);
    }

    @Test
    void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test159");
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper0 = new com.lowagie.text.pdf.PdfPageEventHelper();
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper1 = new com.lowagie.text.pdf.PdfPageEventHelper();
        java.io.OutputStream outputStream2 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields4 = new com.lowagie.text.pdf.PdfCopyFields(outputStream2, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter5 = pdfCopyFields4.getWriter();
        com.lowagie.text.Font font7 = null;
        com.lowagie.text.Footnote footnote8 = new com.lowagie.text.Footnote("", font7);
        com.lowagie.text.HeaderFooter headerFooter10 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote8, true);
        headerFooter10.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle13 = headerFooter10.rotate();
        com.lowagie.text.Rectangle rectangle14 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter10);
        com.lowagie.text.Document document15 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter10);
        boolean b17 = document15.setMarginMirroringTopBottom(true);
        com.lowagie.text.Font font21 = null;
        com.lowagie.text.Footnote footnote22 = new com.lowagie.text.Footnote("", font21);
        com.lowagie.text.HeaderFooter headerFooter24 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote22, true);
        headerFooter24.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph27 = headerFooter24.paragraph();
        pdfPageEventHelper1.onSection(pdfWriter5, document15, (float) 7, 262144, paragraph27);
        pdfWriter5.setStrictImageSequence(false);
        pdfWriter5.setEncryption(false, "true", "bottom", 1336);
        com.lowagie.text.Font font37 = null;
        com.lowagie.text.Footnote footnote38 = new com.lowagie.text.Footnote("", font37);
        com.lowagie.text.HeaderFooter headerFooter40 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote38, true);
        headerFooter40.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle43 = headerFooter40.rotate();
        com.lowagie.text.Rectangle rectangle44 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter40);
        com.lowagie.text.Document document45 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter40);
        boolean b47 = document45.setMarginMirroringTopBottom(true);
        float f49 = document45.bottom((float) 100L);
        boolean b51 = document45.setMarginMirroringTopBottom(false);
        byte[] byte_array54 = null;
        com.lowagie.text.pdf.PdfReader pdfReader55 = null;
        byte[] byte_array60 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream61 = new com.lowagie.text.pdf.PRStream(pdfReader55, byte_array60);
        com.lowagie.text.pdf.PdfReader pdfReader62 = null;
        byte[] byte_array67 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream68 = new com.lowagie.text.pdf.PRStream(pdfReader62, byte_array67);
        pRStream61.setData(byte_array67, false, (int) (byte) 100);
        com.lowagie.text.ImgJBIG2 imgJBIG2_72 = new com.lowagie.text.ImgJBIG2(4, 1564, byte_array54, byte_array67);
        int i73 = imgJBIG2_72.getDpiY();
        int[] i_array74 = imgJBIG2_72.getTransparency();
        pdfPageEventHelper0.onGenericTag(pdfWriter5, document45, (com.lowagie.text.Rectangle) imgJBIG2_72, "xxiv");
        java.awt.Color color77 = imgJBIG2_72.getBorderColorBottom();
        assertNotNull(pdfWriter5);
        assertNotNull(rectangle13);
        assertEquals(true, b17);
        assertNotNull(paragraph27);
        assertNotNull(rectangle43);
        assertEquals(true, b47);
        assertEquals(136.0f, f49);
        assertEquals(true, b51);
        assertNotNull(byte_array60);
        assertNotNull(byte_array67);
        assertEquals(0, i73);
        assertNull(i_array74);
        assertNull(color77);
    }

    @Test
    void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test160");
        com.lowagie.text.ElementTags elementTags0 = new com.lowagie.text.ElementTags();
    }

    @Test
    void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test161");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.NEXTPAGE;
        assertNotNull(pdfName0);
    }

    @Test
    void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test162");
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
        pdfWriter4.setAtLeastPdfVersion('È');
        com.lowagie.text.pdf.PdfFormField pdfFormField41 = com.lowagie.text.pdf.PdfFormField.createRadioButton(pdfWriter4, true);
        com.lowagie.text.pdf.PdfPTable pdfPTable43 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell44 = pdfPTable43.getDefaultCell();
        float f45 = pdfPCell44.getIndent();
        float f46 = pdfPCell44.getRightIndent();
        pdfPCell44.setIndent((float) 302);
        com.lowagie.text.pdf.RadioCheckField radioCheckField51 = new com.lowagie.text.pdf.RadioCheckField(pdfWriter4, (com.lowagie.text.Rectangle) pdfPCell44, "pdf", "operation");
        radioCheckField51.setBorderStyle(0);
        radioCheckField51.setText("http://www.aiim.org/pdfa/ns/id/");
        float f56 = radioCheckField51.getFontSize();
        radioCheckField51.setBorderStyle((int) '4');
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertNotNull(pdfName35);
        assertNotNull(pdfName36);
        assertNotNull(pdfFormField41);
        assertNotNull(pdfPCell44);
        assertEquals(0.0f, f45);
        assertEquals(0.0f, f46);
        assertEquals(0.0f, f56);
    }

    @Test
    void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test163");
        com.lowagie.text.pdf.ByteBuffer byteBuffer1 = new com.lowagie.text.pdf.ByteBuffer(1564);
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields3 = new com.lowagie.text.pdf.PdfCopyFields((java.io.OutputStream) byteBuffer1, 'Ã');
        com.lowagie.text.pdf.ByteBuffer byteBuffer5 = byteBuffer1.append(24);
        com.lowagie.text.pdf.PdfReader pdfReader10 = null;
        byte[] byte_array15 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream16 = new com.lowagie.text.pdf.PRStream(pdfReader10, byte_array15);
        com.lowagie.text.pdf.PdfReader pdfReader17 = null;
        byte[] byte_array22 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream23 = new com.lowagie.text.pdf.PRStream(pdfReader17, byte_array22);
        pRStream16.setData(byte_array22, false, (int) (byte) 100);
        byte[] byte_array27 = pRStream16.getBytes();
        com.lowagie.text.pdf.PdfReader pdfReader28 = null;
        byte[] byte_array33 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream34 = new com.lowagie.text.pdf.PRStream(pdfReader28, byte_array33);
        com.lowagie.text.pdf.PdfReader pdfReader35 = null;
        byte[] byte_array40 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream41 = new com.lowagie.text.pdf.PRStream(pdfReader35, byte_array40);
        pRStream34.setData(byte_array40, false, (int) (byte) 100);
        byte[] byte_array45 = pRStream34.getBytes();
        pRStream16.setData(byte_array45);
        byte[] byte_array48 = com.lowagie.text.pdf.crypto.IVGenerator.getIV(0);
        com.lowagie.text.pdf.PRTokeniser pRTokeniser49 = new com.lowagie.text.pdf.PRTokeniser(byte_array48);
        com.lowagie.text.pdf.BaseFont baseFont52 = com.lowagie.text.pdf.BaseFont.createFont("xmp:Thumbnails", "widths", true, false, byte_array45, byte_array48, true, false);
        byteBuffer1.write(byte_array48);
        byteBuffer1.reset();
        java.lang.String str55 = byteBuffer1.toString();
        assertNotNull(byteBuffer5);
        assertNotNull(byte_array15);
        assertNotNull(byte_array22);
        assertNotNull(byte_array27);
        assertNotNull(byte_array33);
        assertNotNull(byte_array40);
        assertNotNull(byte_array45);
        assertNotNull(byte_array48);
        assertNull(baseFont52);
        assertEquals("", str55, "'" + str55 + "' != '" + "" + "'");
    }

    @Test
    void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test164");
        java.lang.String str0 = com.lowagie.text.pdf.BaseFont.SYMBOL;
        assertEquals("Symbol", str0, "'" + str0 + "' != '" + "Symbol" + "'");
    }

    @Test
    void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test165");
        com.lowagie.text.pdf.collection.PdfTargetDictionary pdfTargetDictionary2 = new com.lowagie.text.pdf.collection.PdfTargetDictionary(false);
        pdfTargetDictionary2.setFileAttachmentPage(0);
        com.lowagie.text.pdf.PdfName pdfName6 = new com.lowagie.text.pdf.PdfName("xmpMM:ManageUI");
        com.lowagie.text.pdf.PdfAction pdfAction8 = com.lowagie.text.pdf.PdfAction.gotoEmbedded("hi!", pdfTargetDictionary2, (com.lowagie.text.pdf.PdfObject) pdfName6, true);
        assertNotNull(pdfAction8);
    }

    @Test
    void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test166");
        com.lowagie.text.Font font3 = new com.lowagie.text.Font(8, (float) ' ');
        com.lowagie.text.Chunk chunk4 = new com.lowagie.text.Chunk('Æ', font3);
        float f5 = font3.getSize();
        boolean b6 = font3.isStrikethru();
        assertEquals(32.0f, f5);
        assertEquals(false, b6);
    }

    @Test
    void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test167");
        com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS pPKMS4 = new com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS();
        com.lowagie.text.pdf.PdfReader pdfReader5 = null;
        byte[] byte_array10 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream11 = new com.lowagie.text.pdf.PRStream(pdfReader5, byte_array10);
        pPKMS4.setCert(byte_array10);
        com.lowagie.text.pdf.PdfName pdfName13 = com.lowagie.text.pdf.PdfName.MIN_LOWER_CASE;
        com.lowagie.text.pdf.PdfNumber pdfNumber14 = pPKMS4.getAsNumber(pdfName13);
        byte[] byte_array17 = null;
        com.lowagie.text.pdf.PdfReader pdfReader18 = null;
        byte[] byte_array23 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream24 = new com.lowagie.text.pdf.PRStream(pdfReader18, byte_array23);
        com.lowagie.text.pdf.PdfReader pdfReader25 = null;
        byte[] byte_array30 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream31 = new com.lowagie.text.pdf.PRStream(pdfReader25, byte_array30);
        pRStream24.setData(byte_array30, false, (int) (byte) 100);
        com.lowagie.text.ImgJBIG2 imgJBIG2_35 = new com.lowagie.text.ImgJBIG2(4, 1564, byte_array17, byte_array30);
        pPKMS4.setCert(byte_array30);
        byte[] byte_array38 = com.lowagie.text.pdf.PdfName.encodeName("Center");
        byte[] byte_array39 = com.lowagie.text.pdf.PdfReader.ASCII85Decode(byte_array38);
        try {
            com.lowagie.text.pdf.BaseFont baseFont41 = com.lowagie.text.pdf.BaseFont.createFont("padding-top", "SEPARATOR", true, true, byte_array30, byte_array38, true);
            fail("Expected exception of type com.lowagie.text.DocumentException");
        } catch (com.lowagie.text.DocumentException e) {
        }
        assertNotNull(byte_array10);
        assertNotNull(pdfName13);
        assertNull(pdfNumber14);
        assertNotNull(byte_array23);
        assertNotNull(byte_array30);
        assertNotNull(byte_array38);
        assertNotNull(byte_array39);
    }

    @Test
    void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test168");
        com.lowagie.text.pdf.MultiColumnText multiColumnText0 = new com.lowagie.text.pdf.MultiColumnText();
        boolean b1 = multiColumnText0.isNestable();
        java.util.ArrayList arrayList2 = multiColumnText0.getChunks();
        int i3 = multiColumnText0.type();
        multiColumnText0.addSimpleColumn((float) 1565, 4.0f);
        multiColumnText0.nextColumn();
        assertEquals(false, b1);
        assertNull(arrayList2);
        assertEquals(40, i3);
    }

    @Test
    void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test169");
        com.lowagie.text.pdf.parser.Matrix matrix6 = new com.lowagie.text.pdf.parser.Matrix(2.5f, 806.0f, (float) 'È', 100.0f, (float) ' ', (float) 'g');
    }

    @Test
    void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test170");
        java.io.OutputStream outputStream1 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields3 = new com.lowagie.text.pdf.PdfCopyFields(outputStream1, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter4 = pdfCopyFields3.getWriter();
        int i5 = pdfWriter4.getCurrentPageNumber();
        pdfWriter4.setLinearPageMode();
        com.lowagie.text.pdf.PdfLayer pdfLayer7 = com.lowagie.text.pdf.PdfLayer.createTitle("title", pdfWriter4);
        java.io.OutputStream outputStream9 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields11 = new com.lowagie.text.pdf.PdfCopyFields(outputStream9, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter12 = pdfCopyFields11.getWriter();
        int i13 = pdfWriter12.getCurrentPageNumber();
        pdfWriter12.setLinearPageMode();
        com.lowagie.text.pdf.PdfLayer pdfLayer15 = com.lowagie.text.pdf.PdfLayer.createTitle("title", pdfWriter12);
        pdfLayer7.addChild(pdfLayer15);
        java.io.OutputStream outputStream18 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields20 = new com.lowagie.text.pdf.PdfCopyFields(outputStream18, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter21 = pdfCopyFields20.getWriter();
        int i22 = pdfWriter21.getCurrentPageNumber();
        pdfWriter21.setLinearPageMode();
        com.lowagie.text.pdf.PdfLayer pdfLayer24 = com.lowagie.text.pdf.PdfLayer.createTitle("title", pdfWriter21);
        pdfLayer15.addChild(pdfLayer24);
        pdfLayer15.setView(false);
        assertNotNull(pdfWriter4);
        assertEquals(1, i5);
        assertNotNull(pdfLayer7);
        assertNotNull(pdfWriter12);
        assertEquals(1, i13);
        assertNotNull(pdfLayer15);
        assertNotNull(pdfWriter21);
        assertEquals(1, i22);
        assertNotNull(pdfLayer24);
    }

    @Test
    void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test171");
        java.io.InputStream inputStream0 = null;
        com.lowagie.text.pdf.PdfContentByte pdfContentByte1 = null;
        com.lowagie.text.pdf.codec.wmf.MetaDo metaDo2 = new com.lowagie.text.pdf.codec.wmf.MetaDo(inputStream0, pdfContentByte1);
        java.io.InputStream inputStream3 = null;
        com.lowagie.text.pdf.codec.wmf.InputMeta inputMeta4 = new com.lowagie.text.pdf.codec.wmf.InputMeta(inputStream3);
        int i5 = inputMeta4.getLength();
        metaDo2.in = inputMeta4;
        boolean b8 = metaDo2.isNullStrokeFill(false);
        assertEquals(0, i5);
        assertEquals(false, b8);
    }

    @Test
    void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test172");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        float f3 = pdfPTable1.getRowHeight(1785737760);
        boolean b5 = pdfPTable1.isExtendLastRow(true);
        com.lowagie.text.pdf.PdfPTable pdfPTable7 = new com.lowagie.text.pdf.PdfPTable(1);
        pdfPTable1.addCell(pdfPTable7);
        com.lowagie.text.pdf.PdfPTable pdfPTable10 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell11 = pdfPTable10.getDefaultCell();
        float f12 = pdfPCell11.getIndent();
        float f13 = pdfPCell11.getFollowingIndent();
        com.lowagie.text.pdf.PdfPTable pdfPTable15 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell16 = pdfPTable15.getDefaultCell();
        float f17 = pdfPCell16.getIndent();
        com.lowagie.text.pdf.PdfPTable pdfPTable18 = pdfPCell16.getTable();
        pdfPCell11.softCloneNonPositionParameters((com.lowagie.text.Rectangle) pdfPCell16);
        com.lowagie.text.pdf.PdfPCell pdfPCell20 = new com.lowagie.text.pdf.PdfPCell(pdfPTable1, pdfPCell11);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte21 = null;
        com.lowagie.text.pdf.ColumnText columnText22 = new com.lowagie.text.pdf.ColumnText(pdfContentByte21);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte23 = null;
        columnText22.setCanvas(pdfContentByte23);
        com.lowagie.text.pdf.PdfContentByte[] pdfContentByte_array25 = columnText22.getCanvases();
        pdfPCell20.setColumn(columnText22);
        float f27 = columnText22.getFilledWidth();
        float f28 = columnText22.getLeading();
        assertEquals(0.0f, f3);
        assertEquals(false, b5);
        assertNotNull(pdfPCell11);
        assertEquals(0.0f, f12);
        assertEquals(0.0f, f13);
        assertNotNull(pdfPCell16);
        assertEquals(0.0f, f17);
        assertNull(pdfPTable18);
        assertNull(pdfContentByte_array25);
        assertEquals(0.0f, f27);
        assertEquals(16.0f, f28);
    }

    @Test
    void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test173");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.VERSION;
        assertNotNull(pdfName0);
    }

    @Test
    void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test174");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.SPAN;
        assertNotNull(pdfName0);
    }

    @Test
    void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test175");
        int i0 = com.lowagie.text.pdf.ArabicLigaturizer.ar_lig;
        assertEquals(8, i0);
    }

    @Test
    void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test176");
        com.lowagie.text.RectangleReadOnly rectangleReadOnly4 = new com.lowagie.text.RectangleReadOnly((float) (byte) 100, (float) 1336, (float) 'Ë', (float) 9);
        java.awt.Color color12 = java.awt.Color.GREEN;
        java.awt.Color color13 = java.awt.Color.getColor("UnicodeBig", color12);
        com.lowagie.text.Font font14 = new com.lowagie.text.Font(1, (float) (byte) -1, (-1), color13);
        com.lowagie.text.Font font15 = new com.lowagie.text.Font(20, 1.0f, 55, color13);
        try {
            rectangleReadOnly4.setBorderColorBottom(color13);
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        assertNotNull(color12);
        assertNotNull(color13);
    }

    @Test
    void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test177");
        com.lowagie.text.Font font1 = null;
        com.lowagie.text.Footnote footnote2 = new com.lowagie.text.Footnote("", font1);
        com.lowagie.text.HeaderFooter headerFooter4 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote2, true);
        headerFooter4.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph7 = headerFooter4.paragraph();
        com.lowagie.text.ChapterAutoNumber chapterAutoNumber8 = new com.lowagie.text.ChapterAutoNumber(paragraph7);
        float f9 = paragraph7.getSpacingBefore();
        assertNotNull(paragraph7);
        assertEquals(0.0f, f9);
    }

    @Test
    void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test178");
        com.lowagie.text.pdf.crypto.ARCFOUREncryption aRCFOUREncryption0 = new com.lowagie.text.pdf.crypto.ARCFOUREncryption();
        com.lowagie.text.pdf.PdfReader pdfReader3 = null;
        byte[] byte_array8 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream9 = new com.lowagie.text.pdf.PRStream(pdfReader3, byte_array8);
        com.lowagie.text.pdf.PdfReader pdfReader10 = null;
        byte[] byte_array15 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream16 = new com.lowagie.text.pdf.PRStream(pdfReader10, byte_array15);
        pRStream9.setData(byte_array15, false, (int) (byte) 100);
        int[] i_array20 = com.lowagie.text.pdf.PRTokeniser.checkObjectStart(byte_array15);
        com.lowagie.text.pdf.PdfReader pdfReader21 = null;
        byte[] byte_array26 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream27 = new com.lowagie.text.pdf.PRStream(pdfReader21, byte_array26);
        com.lowagie.text.pdf.PdfReader pdfReader28 = null;
        byte[] byte_array33 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream34 = new com.lowagie.text.pdf.PRStream(pdfReader28, byte_array33);
        pRStream27.setData(byte_array33, false, (int) (byte) 100);
        com.lowagie.text.Image image38 = com.lowagie.text.Image.getInstance(4194304, 0, byte_array15, byte_array33);
        byte[] byte_array41 = new byte[]{(byte) 100, (byte) 10};
        com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray42 = new com.lowagie.text.pdf.RandomAccessFileOrArray(byte_array41);
        try {
            aRCFOUREncryption0.encryptARCFOUR(byte_array33, byte_array41);
            fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        assertNotNull(byte_array8);
        assertNotNull(byte_array15);
        assertNull(i_array20);
        assertNotNull(byte_array26);
        assertNotNull(byte_array33);
        assertNotNull(image38);
        assertNotNull(byte_array41);
    }

    @Test
    void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test179");
        java.net.URL uRL0 = null;
        try {
            com.lowagie.text.Image image1 = com.lowagie.text.ImageLoader.getJpeg2000Image(uRL0);
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (com.lowagie.text.ExceptionConverter e) {
        }
    }

    @Test
    void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test180");
        com.lowagie.text.pdf.parser.TextAssembler textAssembler0 = null;
        com.lowagie.text.pdf.parser.PdfContentStreamHandler pdfContentStreamHandler1 = new com.lowagie.text.pdf.parser.PdfContentStreamHandler(textAssembler0);
        java.util.Map<java.lang.String, com.lowagie.text.pdf.parser.ContentOperator> map_str_contentOperator2 = null;
        pdfContentStreamHandler1.operators = map_str_contentOperator2;
        com.lowagie.text.pdf.parser.Matrix matrix4 = pdfContentStreamHandler1.textMatrix;
        try {
            com.lowagie.text.pdf.parser.ContentOperator contentOperator6 = pdfContentStreamHandler1.lookupOperator("xmpMM:History");
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNull(matrix4);
    }

    @Test
    void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test181");
        com.lowagie.text.pdf.PdfName pdfName2 = new com.lowagie.text.pdf.PdfName("dc:language", true);
    }

    @Test
    void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test182");
        int i0 = com.lowagie.text.pdf.PdfAnnotation.FLAGS_NOROTATE;
        assertEquals(16, i0);
    }

    @Test
    void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test183");
        com.lowagie.text.Chapter chapter1 = new com.lowagie.text.Chapter((int) (short) -1);
        com.lowagie.text.MarkedSection markedSection2 = chapter1.addMarkedSection();
        markedSection2.setIndentation((float) (byte) -1);
        markedSection2.setIndentation((float) (byte) 9);
        boolean b7 = markedSection2.isContent();
        assertNotNull(markedSection2);
        assertEquals(true, b7);
    }

    @Test
    void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test184");
        boolean b1 = com.lowagie.text.FontFactory.contains("plainwidth");
        assertEquals(false, b1);
    }

    @Test
    void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test185");
        java.lang.String str2 = com.lowagie.text.factories.RomanAlphabetFactory.getString(8196, true);
        assertEquals("lcf", str2, "'" + str2 + "' != '" + "lcf" + "'");
    }

    @Test
    void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test186");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PERCEPTUAL;
        com.lowagie.text.pdf.PRIndirectReference pRIndirectReference1 = null;
        pdfName0.setIndRef(pRIndirectReference1);
        assertNotNull(pdfName0);
    }

    @Test
    void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test187");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaObject.META_NOT_SUPPORTED;
        assertEquals(0, i0);
    }

    @Test
    void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test188");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        byte[] byte_array5 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream6 = new com.lowagie.text.pdf.PRStream(pdfReader0, byte_array5);
        com.lowagie.text.pdf.PdfReader pdfReader7 = null;
        byte[] byte_array12 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream13 = new com.lowagie.text.pdf.PRStream(pdfReader7, byte_array12);
        pRStream6.setData(byte_array12, false, (int) (byte) 100);
        com.lowagie.text.pdf.PdfWriter pdfWriter17 = null;
        com.lowagie.text.Font font19 = null;
        com.lowagie.text.Footnote footnote20 = new com.lowagie.text.Footnote("", font19);
        com.lowagie.text.HeaderFooter headerFooter22 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote20, true);
        headerFooter22.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle25 = headerFooter22.rotate();
        float[][] f_array_array27 = new float[][]{};
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation28 = com.lowagie.text.pdf.PdfAnnotation.createInk(pdfWriter17, (com.lowagie.text.Rectangle) headerFooter22, "widths", f_array_array27);
        boolean b29 = pdfAnnotation28.isOutlineTree();
        int i30 = pdfAnnotation28.getPlaceInPage();
        com.lowagie.text.pdf.PRStream pRStream31 = new com.lowagie.text.pdf.PRStream(pRStream6, (com.lowagie.text.pdf.PdfDictionary) pdfAnnotation28);
        com.lowagie.text.pdf.PdfName pdfName32 = com.lowagie.text.pdf.PdfName.PG;
        boolean b33 = pdfName32.isBoolean();
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper34 = new com.lowagie.text.pdf.PdfPageEventHelper();
        java.io.OutputStream outputStream35 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields37 = new com.lowagie.text.pdf.PdfCopyFields(outputStream35, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter38 = pdfCopyFields37.getWriter();
        com.lowagie.text.Font font40 = null;
        com.lowagie.text.Footnote footnote41 = new com.lowagie.text.Footnote("", font40);
        com.lowagie.text.HeaderFooter headerFooter43 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote41, true);
        headerFooter43.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle46 = headerFooter43.rotate();
        com.lowagie.text.Rectangle rectangle47 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter43);
        com.lowagie.text.Document document48 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter43);
        boolean b50 = document48.setMarginMirroringTopBottom(true);
        com.lowagie.text.Font font54 = null;
        com.lowagie.text.Footnote footnote55 = new com.lowagie.text.Footnote("", font54);
        com.lowagie.text.HeaderFooter headerFooter57 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote55, true);
        headerFooter57.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph60 = headerFooter57.paragraph();
        pdfPageEventHelper34.onSection(pdfWriter38, document48, (float) 7, 262144, paragraph60);
        pdfWriter38.setStrictImageSequence(false);
        pdfWriter38.setEncryption(false, "true", "bottom", 1336);
        com.lowagie.text.pdf.PdfName pdfName69 = com.lowagie.text.pdf.PdfName.NONE;
        com.lowagie.text.pdf.PdfName pdfName70 = com.lowagie.text.pdf.PdfName.XREF;
        pdfWriter38.setDefaultColorspace(pdfName69, (com.lowagie.text.pdf.PdfObject) pdfName70);
        java.lang.String[] str_array78 = new java.lang.String[]{"bottom", "grayfill", "Helvetica-Oblique", "<?xpacket end=\"r\"?>", "sybp"};
        com.lowagie.text.pdf.PdfFormField pdfFormField80 = com.lowagie.text.pdf.PdfFormField.createCombo(pdfWriter38, false, str_array78, 1078);
        pdfAnnotation28.put(pdfName32, (com.lowagie.text.pdf.PdfObject) pdfFormField80);
        com.lowagie.text.pdf.PdfName pdfName82 = com.lowagie.text.pdf.PdfName.PDF;
        pdfAnnotation28.setHighlighting(pdfName82);
        assertNotNull(byte_array5);
        assertNotNull(byte_array12);
        assertNotNull(rectangle25);
        assertNotNull(f_array_array27);
        assertNotNull(pdfAnnotation28);
        assertEquals(false, b29);
        assertEquals(i30, (-1));
        assertNotNull(pdfName32);
        assertEquals(false, b33);
        assertNotNull(pdfWriter38);
        assertNotNull(rectangle46);
        assertEquals(true, b50);
        assertNotNull(paragraph60);
        assertNotNull(pdfName69);
        assertNotNull(pdfName70);
        assertNotNull(str_array78);
        assertNotNull(pdfFormField80);
        assertNotNull(pdfName82);
    }

    @Test
    void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test189");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField1 = com.lowagie.text.pdf.PdfFormField.createCheckBox(pdfWriter0);
        pdfFormField1.setQuadding((int) (byte) 100);
        com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS pPKMS5 = new com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS("border-bottom-width");
        pdfFormField1.setValue((com.lowagie.text.pdf.PdfSignature) pPKMS5);
        boolean b7 = pPKMS5.isPages();
        assertNotNull(pdfFormField1);
        assertEquals(false, b7);
    }

    @Test
    void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test190");
        java.lang.String str0 = com.lowagie.text.Chunk.REMOTEGOTO;
        assertEquals("REMOTEGOTO", str0, "'" + str0 + "' != '" + "REMOTEGOTO" + "'");
    }

    @Test
    void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test191");
        com.lowagie.text.pdf.PdfName pdfName1 = new com.lowagie.text.pdf.PdfName("list");
    }

    @Test
    void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test192");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        byte[] byte_array5 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream6 = new com.lowagie.text.pdf.PRStream(pdfReader0, byte_array5);
        com.lowagie.text.pdf.PdfReader pdfReader7 = null;
        byte[] byte_array12 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream13 = new com.lowagie.text.pdf.PRStream(pdfReader7, byte_array12);
        pRStream6.setData(byte_array12, false, (int) (byte) 100);
        com.lowagie.text.pdf.PdfWriter pdfWriter17 = null;
        com.lowagie.text.Font font19 = null;
        com.lowagie.text.Footnote footnote20 = new com.lowagie.text.Footnote("", font19);
        com.lowagie.text.HeaderFooter headerFooter22 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote20, true);
        headerFooter22.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle25 = headerFooter22.rotate();
        float[][] f_array_array27 = new float[][]{};
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation28 = com.lowagie.text.pdf.PdfAnnotation.createInk(pdfWriter17, (com.lowagie.text.Rectangle) headerFooter22, "widths", f_array_array27);
        boolean b29 = pdfAnnotation28.isOutlineTree();
        int i30 = pdfAnnotation28.getPlaceInPage();
        com.lowagie.text.pdf.PRStream pRStream31 = new com.lowagie.text.pdf.PRStream(pRStream6, (com.lowagie.text.pdf.PdfDictionary) pdfAnnotation28);
        com.lowagie.text.pdf.PdfName pdfName32 = com.lowagie.text.pdf.PdfName.COLLECTIONSUBITEM;
        com.lowagie.text.pdf.PdfStream pdfStream33 = pRStream31.getAsStream(pdfName32);
        com.lowagie.text.pdf.ByteBuffer byteBuffer35 = new com.lowagie.text.pdf.ByteBuffer(1564);
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields37 = new com.lowagie.text.pdf.PdfCopyFields((java.io.OutputStream) byteBuffer35, 'Ã');
        com.lowagie.text.pdf.ByteBuffer byteBuffer39 = byteBuffer35.append(24);
        com.lowagie.text.pdf.PdfReader pdfReader44 = null;
        byte[] byte_array49 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream50 = new com.lowagie.text.pdf.PRStream(pdfReader44, byte_array49);
        com.lowagie.text.pdf.PdfReader pdfReader51 = null;
        byte[] byte_array56 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream57 = new com.lowagie.text.pdf.PRStream(pdfReader51, byte_array56);
        pRStream50.setData(byte_array56, false, (int) (byte) 100);
        byte[] byte_array61 = pRStream50.getBytes();
        com.lowagie.text.pdf.PdfReader pdfReader62 = null;
        byte[] byte_array67 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream68 = new com.lowagie.text.pdf.PRStream(pdfReader62, byte_array67);
        com.lowagie.text.pdf.PdfReader pdfReader69 = null;
        byte[] byte_array74 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream75 = new com.lowagie.text.pdf.PRStream(pdfReader69, byte_array74);
        pRStream68.setData(byte_array74, false, (int) (byte) 100);
        byte[] byte_array79 = pRStream68.getBytes();
        pRStream50.setData(byte_array79);
        byte[] byte_array82 = com.lowagie.text.pdf.crypto.IVGenerator.getIV(0);
        com.lowagie.text.pdf.PRTokeniser pRTokeniser83 = new com.lowagie.text.pdf.PRTokeniser(byte_array82);
        com.lowagie.text.pdf.BaseFont baseFont86 = com.lowagie.text.pdf.BaseFont.createFont("xmp:Thumbnails", "widths", true, false, byte_array79, byte_array82, true, false);
        byteBuffer35.write(byte_array82);
        pRStream31.writeContent((java.io.OutputStream) byteBuffer35);
        assertNotNull(byte_array5);
        assertNotNull(byte_array12);
        assertNotNull(rectangle25);
        assertNotNull(f_array_array27);
        assertNotNull(pdfAnnotation28);
        assertEquals(false, b29);
        assertEquals(i30, (-1));
        assertNotNull(pdfName32);
        assertNull(pdfStream33);
        assertNotNull(byteBuffer39);
        assertNotNull(byte_array49);
        assertNotNull(byte_array56);
        assertNotNull(byte_array61);
        assertNotNull(byte_array67);
        assertNotNull(byte_array74);
        assertNotNull(byte_array79);
        assertNotNull(byte_array82);
        assertNull(baseFont86);
    }

    @Test
    void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test193");
        com.lowagie.text.pdf.PdfOutline pdfOutline0 = null;
        com.lowagie.text.Font font6 = com.lowagie.text.FontFactory.getFont("top", "absolutex", (float) (-1), 6);
        com.lowagie.text.Chunk chunk7 = com.lowagie.text.SpecialSymbol.get(' ', font6);
        com.lowagie.text.pdf.PdfWriter pdfWriter8 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField9 = com.lowagie.text.pdf.PdfFormField.createCheckBox(pdfWriter8);
        com.lowagie.text.pdf.PdfAction pdfAction11 = new com.lowagie.text.pdf.PdfAction("Cp1250");
        pdfFormField9.setAction(pdfAction11);
        com.lowagie.text.Chunk chunk13 = chunk7.setAction(pdfAction11);
        com.lowagie.text.pdf.PdfString pdfString14 = new com.lowagie.text.pdf.PdfString();
        boolean b15 = pdfString14.isHexWriting();
        try {
            com.lowagie.text.pdf.PdfOutline pdfOutline17 = new com.lowagie.text.pdf.PdfOutline(pdfOutline0, pdfAction11, pdfString14, true);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(font6);
        assertNotNull(chunk7);
        assertNotNull(pdfFormField9);
        assertNotNull(chunk13);
        assertEquals(false, b15);
    }

    @Test
    void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test194");
        try {
            com.lowagie.text.Rectangle rectangle1 = com.lowagie.text.PageSize.getRectangle("Ā");
            fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test195");
        com.lowagie.text.pdf.draw.LineSeparator lineSeparator0 = new com.lowagie.text.pdf.draw.LineSeparator();
    }

    @Test
    void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test196");
        byte[] byte_array2 = null;
        com.lowagie.text.pdf.PdfReader pdfReader3 = null;
        byte[] byte_array8 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream9 = new com.lowagie.text.pdf.PRStream(pdfReader3, byte_array8);
        com.lowagie.text.pdf.PdfReader pdfReader10 = null;
        byte[] byte_array15 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream16 = new com.lowagie.text.pdf.PRStream(pdfReader10, byte_array15);
        pRStream9.setData(byte_array15, false, (int) (byte) 100);
        com.lowagie.text.ImgJBIG2 imgJBIG2_20 = new com.lowagie.text.ImgJBIG2(4, 1564, byte_array2, byte_array15);
        int i21 = imgJBIG2_20.getCompressionLevel();
        java.lang.String str22 = imgJBIG2_20.getAlt();
        imgJBIG2_20.setOriginalType((int) 'Ë');
        imgJBIG2_20.setAlt("xmp:Identifier");
        boolean b27 = imgJBIG2_20.isImgTemplate();
        assertNotNull(byte_array8);
        assertNotNull(byte_array15);
        assertEquals(i21, (-1));
        assertNull(str22);
        assertEquals(false, b27);
    }

    @Test
    void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test197");
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper0 = new com.lowagie.text.pdf.PdfPageEventHelper();
        com.lowagie.text.pdf.PdfWriter pdfWriter1 = null;
        com.lowagie.text.Document document2 = null;
        pdfPageEventHelper0.onChapterEnd(pdfWriter1, document2, (float) 262144);
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper5 = new com.lowagie.text.pdf.PdfPageEventHelper();
        java.io.OutputStream outputStream6 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields8 = new com.lowagie.text.pdf.PdfCopyFields(outputStream6, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter9 = pdfCopyFields8.getWriter();
        com.lowagie.text.Font font11 = null;
        com.lowagie.text.Footnote footnote12 = new com.lowagie.text.Footnote("", font11);
        com.lowagie.text.HeaderFooter headerFooter14 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote12, true);
        headerFooter14.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle17 = headerFooter14.rotate();
        com.lowagie.text.Rectangle rectangle18 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter14);
        com.lowagie.text.Document document19 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter14);
        boolean b21 = document19.setMarginMirroringTopBottom(true);
        com.lowagie.text.Font font25 = null;
        com.lowagie.text.Footnote footnote26 = new com.lowagie.text.Footnote("", font25);
        com.lowagie.text.HeaderFooter headerFooter28 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote26, true);
        headerFooter28.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph31 = headerFooter28.paragraph();
        pdfPageEventHelper5.onSection(pdfWriter9, document19, (float) 7, 262144, paragraph31);
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper33 = new com.lowagie.text.pdf.PdfPageEventHelper();
        java.io.OutputStream outputStream34 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields36 = new com.lowagie.text.pdf.PdfCopyFields(outputStream34, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter37 = pdfCopyFields36.getWriter();
        com.lowagie.text.Font font39 = null;
        com.lowagie.text.Footnote footnote40 = new com.lowagie.text.Footnote("", font39);
        com.lowagie.text.HeaderFooter headerFooter42 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote40, true);
        headerFooter42.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle45 = headerFooter42.rotate();
        com.lowagie.text.Rectangle rectangle46 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter42);
        com.lowagie.text.Document document47 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter42);
        boolean b49 = document47.setMarginMirroringTopBottom(true);
        com.lowagie.text.Font font53 = null;
        com.lowagie.text.Footnote footnote54 = new com.lowagie.text.Footnote("", font53);
        com.lowagie.text.HeaderFooter headerFooter56 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote54, true);
        headerFooter56.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph59 = headerFooter56.paragraph();
        pdfPageEventHelper33.onSection(pdfWriter37, document47, (float) 7, 262144, paragraph59);
        java.io.OutputStream outputStream61 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields63 = new com.lowagie.text.pdf.PdfCopyFields(outputStream61, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter64 = pdfCopyFields63.getWriter();
        int i65 = pdfWriter64.getCurrentPageNumber();
        com.lowagie.text.Font font67 = null;
        com.lowagie.text.Footnote footnote68 = new com.lowagie.text.Footnote("", font67);
        com.lowagie.text.HeaderFooter headerFooter70 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote68, true);
        headerFooter70.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle73 = headerFooter70.rotate();
        com.lowagie.text.Rectangle rectangle74 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter70);
        com.lowagie.text.Document document75 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter70);
        boolean b77 = document75.setMarginMirroringTopBottom(true);
        com.lowagie.text.Rectangle rectangle78 = com.lowagie.text.PageSize.A4;
        pdfPageEventHelper33.onGenericTag(pdfWriter64, document75, rectangle78, "com/lowagie/text/pdf/fonts/");
        com.lowagie.text.Font font83 = null;
        com.lowagie.text.Footnote footnote84 = new com.lowagie.text.Footnote("", font83);
        com.lowagie.text.HeaderFooter headerFooter86 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote84, true);
        headerFooter86.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph89 = headerFooter86.paragraph();
        pdfPageEventHelper0.onChapter(pdfWriter9, document75, (float) 526, paragraph89);
        com.lowagie.text.pdf.PdfPageLabels pdfPageLabels91 = null;
        pdfWriter9.setPageLabels(pdfPageLabels91);
        assertNotNull(pdfWriter9);
        assertNotNull(rectangle17);
        assertEquals(true, b21);
        assertNotNull(paragraph31);
        assertNotNull(pdfWriter37);
        assertNotNull(rectangle45);
        assertEquals(true, b49);
        assertNotNull(paragraph59);
        assertNotNull(pdfWriter64);
        assertEquals(1, i65);
        assertNotNull(rectangle73);
        assertEquals(true, b77);
        assertNotNull(rectangle78);
        assertNotNull(paragraph89);
    }

    @Test
    void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test198");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField1 = com.lowagie.text.pdf.PdfFormField.createCheckBox(pdfWriter0);
        pdfFormField1.setValueAsName("SKEW");
        com.lowagie.text.pdf.PdfName pdfName4 = com.lowagie.text.pdf.PdfName.U;
        com.lowagie.text.pdf.PdfObject pdfObject5 = com.lowagie.text.pdf.PdfReader.getPdfObjectRelease((com.lowagie.text.pdf.PdfObject) pdfFormField1, (com.lowagie.text.pdf.PdfObject) pdfName4);
        com.lowagie.text.pdf.PdfName pdfName6 = com.lowagie.text.pdf.PdfName.FORMULA;
        com.lowagie.text.pdf.PdfTemplate pdfTemplate7 = null;
        try {
            pdfFormField1.setAppearance(pdfName6, pdfTemplate7);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfFormField1);
        assertNotNull(pdfName4);
        assertNotNull(pdfObject5);
        assertNotNull(pdfName6);
    }

    @Test
    void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test199");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.INSTANCES;
        assertNotNull(pdfName0);
    }

    @Test
    void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test200");
        com.lowagie.text.FontFactory.register("Courier-BoldOblique");
    }

    @Test
    void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test201");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.GOTOR;
        com.lowagie.text.pdf.PdfObject pdfObject1 = com.lowagie.text.pdf.PdfReader.getPdfObjectRelease((com.lowagie.text.pdf.PdfObject) pdfName0);
        assertNotNull(pdfName0);
        assertNotNull(pdfObject1);
    }

    @Test
    void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test202");
        com.lowagie.text.FontFactoryImp fontFactoryImp0 = new com.lowagie.text.FontFactoryImp();
        fontFactoryImp0.register("underline");
        fontFactoryImp0.defaultEmbedding = true;
        com.lowagie.text.Font font10 = fontFactoryImp0.getFont("author", "(/Filter=/Adobe.PPKMS, /Type=/Sig, /SubFilter=/adbe.pkcs7.sha1)", false, (float) 16, 16384);
        assertNotNull(font10);
    }

    @Test
    void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test203");
        java.lang.String str0 = com.lowagie.text.html.Markup.CSS_VALUE_TABLE;
        assertEquals("table", str0, "'" + str0 + "' != '" + "table" + "'");
    }

    @Test
    void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test204");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfAcroForm pdfAcroForm1 = new com.lowagie.text.pdf.PdfAcroForm(pdfWriter0);
        pdfAcroForm1.setNeedAppearances(true);
        com.lowagie.text.pdf.PdfFormField pdfFormField7 = pdfAcroForm1.getRadioGroup("top", "UTF-16", true);
        com.lowagie.text.pdf.PdfFormField pdfFormField8 = null;
        try {
            pdfAcroForm1.setCheckBoxParams(pdfFormField8, "grayfill", "<?xpacket begin=\"﻿\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?>\n", false, (float) (byte) 61, (-1.0f), (float) (byte) -1, (float) 1768449138);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfFormField7);
    }

    @Test
    void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test205");
        com.lowagie.text.pdf.hyphenation.HyphenationTree hyphenationTree1 = com.lowagie.text.pdf.hyphenation.Hyphenator.getFileHyphenationTree("lettered");
        assertNull(hyphenationTree1);
    }

    @Test
    void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test206");
        int i0 = com.lowagie.text.pdf.PdfPTable.LINECANVAS;
        assertEquals(2, i0);
    }

    @Test
    void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test207");
        com.lowagie.text.xml.xmp.DublinCoreSchema dublinCoreSchema0 = new com.lowagie.text.xml.xmp.DublinCoreSchema();
        dublinCoreSchema0.addDescription("left");
        java.lang.Object obj5 = dublinCoreSchema0.addProperty("border-right-width", "pdf:Producer");
        assertNull(obj5);
    }

    @Test
    void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test208");
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
        java.io.OutputStream outputStream28 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields30 = new com.lowagie.text.pdf.PdfCopyFields(outputStream28, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter31 = pdfCopyFields30.getWriter();
        int i32 = pdfWriter31.getCurrentPageNumber();
        com.lowagie.text.Font font34 = null;
        com.lowagie.text.Footnote footnote35 = new com.lowagie.text.Footnote("", font34);
        com.lowagie.text.HeaderFooter headerFooter37 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote35, true);
        headerFooter37.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle40 = headerFooter37.rotate();
        com.lowagie.text.Rectangle rectangle41 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter37);
        com.lowagie.text.Document document42 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter37);
        boolean b44 = document42.setMarginMirroringTopBottom(true);
        com.lowagie.text.Rectangle rectangle45 = com.lowagie.text.PageSize.A4;
        pdfPageEventHelper0.onGenericTag(pdfWriter31, document42, rectangle45, "com/lowagie/text/pdf/fonts/");
        com.lowagie.text.pdf.PdfFileSpecification pdfFileSpecification49 = com.lowagie.text.pdf.PdfFileSpecification.fileExtern(pdfWriter31, "OpenPDF 1.2.12.SNAPSHOT");
        pdfFileSpecification49.setVolatile(false);
        byte[] byte_array53 = com.lowagie.text.pdf.crypto.IVGenerator.getIV(0);
        com.lowagie.text.pdf.PRTokeniser pRTokeniser54 = new com.lowagie.text.pdf.PRTokeniser(byte_array53);
        pdfFileSpecification49.setMultiByteFileName(byte_array53);
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertNotNull(pdfWriter31);
        assertEquals(1, i32);
        assertNotNull(rectangle40);
        assertEquals(true, b44);
        assertNotNull(rectangle45);
        assertNotNull(pdfFileSpecification49);
        assertNotNull(byte_array53);
    }

    @Test
    void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test209");
        com.lowagie.text.Chapter chapter1 = new com.lowagie.text.Chapter((int) (short) -1);
        com.lowagie.text.MarkedSection markedSection2 = chapter1.addMarkedSection();
        chapter1.setComplete(false);
        chapter1.setIndentationLeft((float) 1565);
        int i7 = chapter1.type();
        assertNotNull(markedSection2);
        assertEquals(16, i7);
    }

    @Test
    void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test210");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        float f3 = pdfPTable1.getTotalHeight();
        byte[] byte_array6 = null;
        com.lowagie.text.pdf.PdfReader pdfReader7 = null;
        byte[] byte_array12 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream13 = new com.lowagie.text.pdf.PRStream(pdfReader7, byte_array12);
        com.lowagie.text.pdf.PdfReader pdfReader14 = null;
        byte[] byte_array19 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream20 = new com.lowagie.text.pdf.PRStream(pdfReader14, byte_array19);
        pRStream13.setData(byte_array19, false, (int) (byte) 100);
        com.lowagie.text.ImgJBIG2 imgJBIG2_24 = new com.lowagie.text.ImgJBIG2(4, 1564, byte_array6, byte_array19);
        int i25 = imgJBIG2_24.getDpiY();
        int[] i_array26 = imgJBIG2_24.getTransparency();
        float f27 = imgJBIG2_24.getScaledWidth();
        imgJBIG2_24.makeMask();
        java.io.OutputStream outputStream30 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields32 = new com.lowagie.text.pdf.PdfCopyFields(outputStream30, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter33 = pdfCopyFields32.getWriter();
        int i34 = pdfWriter33.getCurrentPageNumber();
        pdfWriter33.setLinearPageMode();
        com.lowagie.text.pdf.PdfLayer pdfLayer36 = com.lowagie.text.pdf.PdfLayer.createTitle("title", pdfWriter33);
        imgJBIG2_24.setLayer((com.lowagie.text.pdf.PdfOCG) pdfLayer36);
        imgJBIG2_24.setIndentationLeft((float) 100);
        pdfPTable1.addCell((com.lowagie.text.Image) imgJBIG2_24);
        pdfPTable1.setSpacingAfter((float) 298);
        assertNotNull(pdfPCell2);
        assertEquals(0.0f, f3);
        assertNotNull(byte_array12);
        assertNotNull(byte_array19);
        assertEquals(0, i25);
        assertNull(i_array26);
        assertEquals(4.0f, f27);
        assertNotNull(pdfWriter33);
        assertEquals(1, i34);
        assertNotNull(pdfLayer36);
    }

    @Test
    void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test211");
        com.lowagie.text.pdf.Barcode128 barcode128_0 = new com.lowagie.text.pdf.Barcode128();
        com.lowagie.text.pdf.Barcode39 barcode39_1 = new com.lowagie.text.pdf.Barcode39();
        barcode39_1.setCodeType(0);
        com.lowagie.text.pdf.BarcodeEANSUPP barcodeEANSUPP4 = new com.lowagie.text.pdf.BarcodeEANSUPP((com.lowagie.text.pdf.Barcode) barcode128_0, (com.lowagie.text.pdf.Barcode) barcode39_1);
        barcodeEANSUPP4.setGuardBars(true);
        barcodeEANSUPP4.setBarHeight(52.0f);
    }

    @Test
    void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test212");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Cell cell5 = com.lowagie.text.factories.ElementFactory.getCell(properties1);
        cell5.setMaxLines(50);
        cell5.setGroupChange(true);
        java.io.OutputStream outputStream10 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields12 = new com.lowagie.text.pdf.PdfCopyFields(outputStream10, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter13 = pdfCopyFields12.getWriter();
        int i14 = pdfWriter13.getCurrentPageNumber();
        pdfWriter13.setLinearPageMode();
        com.lowagie.text.Annotation annotation24 = new com.lowagie.text.Annotation((float) '4', (float) 1, (float) '4', (float) 29, "listitem", "absolutey", "hi!", "ZapfDingbats");
        com.lowagie.text.pdf.PdfPTable pdfPTable26 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell27 = pdfPTable26.getDefaultCell();
        com.lowagie.text.pdf.ColumnText columnText28 = null;
        pdfPCell27.setColumn(columnText28);
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation30 = com.lowagie.text.pdf.internal.PdfAnnotationsImp.convertAnnotation(pdfWriter13, annotation24, (com.lowagie.text.Rectangle) pdfPCell27);
        pdfWriter13.setSigFlags(513);
        boolean b33 = cell5.process((com.lowagie.text.ElementListener) pdfWriter13);
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(cell5);
        assertNotNull(pdfWriter13);
        assertEquals(1, i14);
        assertNotNull(pdfPCell27);
        assertNotNull(pdfAnnotation30);
        assertEquals(false, b33);
    }

    @Test
    void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test213");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.WIDGET;
        assertNotNull(pdfName0);
    }

    @Test
    void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test214");
        com.lowagie.text.Annotation annotation6 = new com.lowagie.text.Annotation("UnicodeBig", "UnicodeBig", (float) (short) 0, (float) (short) 10, 0.0f, (float) 32);
        boolean b7 = annotation6.isContent();
        float f8 = annotation6.lly();
        assertEquals(true, b7);
        assertEquals(10.0f, f8);
    }

    @Test
    void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test215");
        java.io.OutputStream outputStream1 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields3 = new com.lowagie.text.pdf.PdfCopyFields(outputStream1, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter4 = pdfCopyFields3.getWriter();
        int i5 = pdfWriter4.getCurrentPageNumber();
        pdfWriter4.setLinearPageMode();
        com.lowagie.text.pdf.PdfLayer pdfLayer7 = com.lowagie.text.pdf.PdfLayer.createTitle("title", pdfWriter4);
        java.io.OutputStream outputStream9 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields11 = new com.lowagie.text.pdf.PdfCopyFields(outputStream9, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter12 = pdfCopyFields11.getWriter();
        int i13 = pdfWriter12.getCurrentPageNumber();
        pdfWriter12.setLinearPageMode();
        com.lowagie.text.pdf.PdfLayer pdfLayer15 = com.lowagie.text.pdf.PdfLayer.createTitle("title", pdfWriter12);
        pdfLayer7.addChild(pdfLayer15);
        com.lowagie.text.pdf.PdfIndirectReference pdfIndirectReference17 = pdfLayer7.getRef();
        assertNotNull(pdfWriter4);
        assertEquals(1, i5);
        assertNotNull(pdfLayer7);
        assertNotNull(pdfWriter12);
        assertEquals(1, i13);
        assertNotNull(pdfLayer15);
        assertNull(pdfIndirectReference17);
    }

    @Test
    void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test216");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Cell cell5 = com.lowagie.text.factories.ElementFactory.getCell(properties1);
        boolean b6 = cell5.isUseBorderPadding();
        cell5.setHorizontalAlignment("Times-Bold");
        int i9 = cell5.getColspan();
        boolean b10 = cell5.getGroupChange();
        com.lowagie.text.alignment.HorizontalAlignment horizontalAlignment11 = com.lowagie.text.alignment.HorizontalAlignment.UNDEFINED;
        cell5.setHorizontalAlignment(horizontalAlignment11);
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(cell5);
        assertEquals(false, b6);
        assertEquals(1, i9);
        assertEquals(true, b10);
        assertEquals(horizontalAlignment11, HorizontalAlignment.UNDEFINED, "'" + horizontalAlignment11 + "' != '" + HorizontalAlignment.UNDEFINED + "'");
    }

    @Test
    void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test217");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        float f3 = pdfPTable1.getRowHeight(1785737760);
        boolean b5 = pdfPTable1.isExtendLastRow(true);
        com.lowagie.text.pdf.PdfPTable pdfPTable7 = new com.lowagie.text.pdf.PdfPTable(1);
        pdfPTable1.addCell(pdfPTable7);
        com.lowagie.text.pdf.PdfPTable pdfPTable10 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell11 = pdfPTable10.getDefaultCell();
        float f12 = pdfPCell11.getIndent();
        float f13 = pdfPCell11.getFollowingIndent();
        com.lowagie.text.pdf.PdfPTable pdfPTable15 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell16 = pdfPTable15.getDefaultCell();
        float f17 = pdfPCell16.getIndent();
        com.lowagie.text.pdf.PdfPTable pdfPTable18 = pdfPCell16.getTable();
        pdfPCell11.softCloneNonPositionParameters((com.lowagie.text.Rectangle) pdfPCell16);
        com.lowagie.text.pdf.PdfPCell pdfPCell20 = new com.lowagie.text.pdf.PdfPCell(pdfPTable1, pdfPCell11);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte21 = null;
        com.lowagie.text.pdf.ColumnText columnText22 = new com.lowagie.text.pdf.ColumnText(pdfContentByte21);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte23 = null;
        columnText22.setCanvas(pdfContentByte23);
        com.lowagie.text.pdf.PdfContentByte[] pdfContentByte_array25 = columnText22.getCanvases();
        pdfPCell20.setColumn(columnText22);
        float f27 = columnText22.getFilledWidth();
        float f28 = columnText22.getMultipliedLeading();
        columnText22.setRunDirection((int) (byte) 1);
        assertEquals(0.0f, f3);
        assertEquals(false, b5);
        assertNotNull(pdfPCell11);
        assertEquals(0.0f, f12);
        assertEquals(0.0f, f13);
        assertNotNull(pdfPCell16);
        assertEquals(0.0f, f17);
        assertNull(pdfPTable18);
        assertNull(pdfContentByte_array25);
        assertEquals(0.0f, f27);
        assertEquals(0.0f, f28);
    }

    @Test
    void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test218");
        java.awt.Color color2 = java.awt.Color.cyan;
        com.lowagie.text.Font font3 = com.lowagie.text.FontFactory.getFont("lettered", (float) 1, color2);
        assertNotNull(color2);
        assertNotNull(font3);
    }

    @Test
    void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test219");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TP;
        assertNotNull(pdfName0);
    }

    @Test
    void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test220");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte12 = type3Font5.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte12.fillStroke();
        com.lowagie.text.pdf.FontMapper fontMapper16 = null;
        java.awt.print.PrinterJob printerJob19 = null;
        java.awt.Graphics2D graphics2D20 = pdfContentByte12.createPrinterGraphics((-1.0f), (float) (-1), fontMapper16, true, (float) (byte) 1, printerJob19);
        com.lowagie.text.pdf.VerticalText verticalText21 = new com.lowagie.text.pdf.VerticalText(pdfContentByte12);
        verticalText21.setOrigin((float) 561, (float) 2097152);
        com.lowagie.text.Chunk chunk25 = new com.lowagie.text.Chunk();
        com.lowagie.text.Image image26 = chunk25.getImage();
        float f27 = chunk25.getCharacterSpacing();
        com.lowagie.text.pdf.PdfAction pdfAction29 = new com.lowagie.text.pdf.PdfAction("Cp1250");
        com.lowagie.text.Chunk chunk30 = chunk25.setAction(pdfAction29);
        java.lang.StringBuffer stringBuffer32 = chunk30.append("xmpMM:Versions");
        com.lowagie.text.Chunk chunk33 = chunk30.setNewPage();
        verticalText21.addText(chunk30);
        verticalText21.setOrigin((float) 2048, (float) '#');
        assertNotNull(char_array3);
        assertNotNull(pdfContentByte12);
        assertNotNull(graphics2D20);
        assertNull(image26);
        assertEquals(0.0f, f27);
        assertNotNull(chunk30);
        assertNotNull(stringBuffer32);
        assertNotNull(chunk33);
    }

    @Test
    void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test221");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        byte[] byte_array2 = com.lowagie.text.pdf.PdfName.encodeName("COLOR");
        com.lowagie.text.pdf.PRStream pRStream3 = new com.lowagie.text.pdf.PRStream(pdfReader0, byte_array2);
        com.lowagie.text.pdf.PdfName pdfName4 = com.lowagie.text.pdf.PdfName.CREATORINFO;
        com.lowagie.text.pdf.PdfName pdfName5 = com.lowagie.text.pdf.PdfName.FUNCTION;
        pRStream3.putEx(pdfName4, (com.lowagie.text.pdf.PdfObject) pdfName5);
        com.lowagie.text.pdf.PdfName pdfName7 = com.lowagie.text.pdf.PdfSignatureAppearance.SELF_SIGNED;
        com.lowagie.text.pdf.PdfNumber pdfNumber8 = pRStream3.getAsNumber(pdfName7);
        assertNotNull(byte_array2);
        assertNotNull(pdfName4);
        assertNotNull(pdfName5);
        assertNotNull(pdfName7);
        assertNull(pdfNumber8);
    }

    @Test
    void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test222");
        com.lowagie.text.RomanList romanList1 = new com.lowagie.text.RomanList(1651532643);
        float f2 = romanList1.getSymbolIndent();
        com.lowagie.text.Chunk chunk3 = romanList1.getSymbol();
        romanList1.normalizeIndentation();
        assertEquals(1.65153267E9f, f2);
        assertNotNull(chunk3);
    }

    @Test
    void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test223");
        com.lowagie.text.xml.xmp.DublinCoreSchema dublinCoreSchema0 = new com.lowagie.text.xml.xmp.DublinCoreSchema();
        dublinCoreSchema0.addDescription("left");
        java.lang.Object obj5 = dublinCoreSchema0.setProperty("UniKS-UCS2-H", "title");
        java.lang.Object obj8 = dublinCoreSchema0.setProperty("lettered", "");
        assertNull(obj5);
        assertNull(obj8);
    }

    @Test
    void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test224");
        com.lowagie.text.pdf.PdfWriter.PdfBody.PdfCrossReference pdfCrossReference3 = new com.lowagie.text.pdf.PdfWriter.PdfBody.PdfCrossReference(2, 7, 36);
        com.lowagie.text.pdf.PdfWriter.PdfBody.PdfCrossReference pdfCrossReference6 = new com.lowagie.text.pdf.PdfWriter.PdfBody.PdfCrossReference(0, (int) (short) 2660);
        com.lowagie.text.pdf.ByteBuffer byteBuffer9 = new com.lowagie.text.pdf.ByteBuffer(1564);
        com.lowagie.text.pdf.ByteBuffer byteBuffer11 = byteBuffer9.append((double) 8192);
        pdfCrossReference6.toPdf(496, (java.io.OutputStream) byteBuffer11);
        pdfCrossReference3.toPdf((java.io.OutputStream) byteBuffer11);
        assertNotNull(byteBuffer11);
    }

    @Test
    void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test225");
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
        pdfWriter4.setAtLeastPdfVersion('È');
        com.lowagie.text.pdf.PdfFormField pdfFormField41 = com.lowagie.text.pdf.PdfFormField.createRadioButton(pdfWriter4, true);
        pdfWriter4.createXmpMetadata();
        com.lowagie.text.pdf.PdfName pdfName43 = pdfWriter4.getTabs();
        java.io.OutputStream outputStream44 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields46 = new com.lowagie.text.pdf.PdfCopyFields(outputStream44, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter47 = pdfCopyFields46.getWriter();
        int i48 = pdfWriter47.getCurrentPageNumber();
        pdfWriter47.setLinearPageMode();
        int i50 = pdfWriter47.getPageNumber();
        pdfWriter47.setStrictImageSequence(true);
        pdfWriter47.clearTextWrap();
        com.lowagie.text.Table table56 = new com.lowagie.text.Table(13, 1791);
        boolean b57 = pdfWriter47.fitsPage(table56);
        float f58 = table56.getOffset();
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation61 = com.lowagie.text.pdf.PdfAnnotation.createSquareCircle(pdfWriter4, (com.lowagie.text.Rectangle) table56, "pdf:keywords", true);
        com.lowagie.text.pdf.internal.PdfAnnotationsImp pdfAnnotationsImp62 = new com.lowagie.text.pdf.internal.PdfAnnotationsImp(pdfWriter4);
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertNotNull(pdfName35);
        assertNotNull(pdfName36);
        assertNotNull(pdfFormField41);
        assertNull(pdfName43);
        assertNotNull(pdfWriter47);
        assertEquals(1, i48);
        assertEquals(0, i50);
        assertEquals(true, b57);
        assertEquals((float) f58, Float.NaN, 0);
        assertNotNull(pdfAnnotation61);
    }

    @Test
    void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test226");
        com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS pPKMS0 = new com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS();
        com.lowagie.text.pdf.PdfReader pdfReader1 = null;
        byte[] byte_array6 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream7 = new com.lowagie.text.pdf.PRStream(pdfReader1, byte_array6);
        pPKMS0.setCert(byte_array6);
        com.lowagie.text.pdf.PdfName pdfName9 = com.lowagie.text.pdf.PdfName.XFA;
        com.lowagie.text.pdf.PdfObject pdfObject10 = pPKMS0.get(pdfName9);
        com.lowagie.text.pdf.internal.PdfViewerPreferencesImp pdfViewerPreferencesImp11 = com.lowagie.text.pdf.internal.PdfViewerPreferencesImp.getViewerPreferences((com.lowagie.text.pdf.PdfDictionary) pPKMS0);
        int i12 = pdfViewerPreferencesImp11.getPageLayoutAndMode();
        com.lowagie.text.pdf.PdfDictionary pdfDictionary13 = pdfViewerPreferencesImp11.getViewerPreferences();
        assertNotNull(byte_array6);
        assertNotNull(pdfName9);
        assertNull(pdfObject10);
        assertNotNull(pdfViewerPreferencesImp11);
        assertEquals(0, i12);
        assertNotNull(pdfDictionary13);
    }

    @Test
    void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test227");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte12 = type3Font5.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte12.fillStroke();
        com.lowagie.text.pdf.FontMapper fontMapper16 = null;
        java.awt.print.PrinterJob printerJob19 = null;
        java.awt.Graphics2D graphics2D20 = pdfContentByte12.createPrinterGraphics((-1.0f), (float) (-1), fontMapper16, true, (float) (byte) 1, printerJob19);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte21 = pdfContentByte12.getDuplicate();
        pdfContentByte12.closePathStroke();
        assertNotNull(char_array3);
        assertNotNull(pdfContentByte12);
        assertNotNull(graphics2D20);
        assertNotNull(pdfContentByte21);
    }

    @Test
    void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test228");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        float f3 = pdfPCell2.getIndent();
        float f4 = pdfPCell2.getRightIndent();
        pdfPCell2.setVerticalAlignment(522);
        pdfPCell2.enableBorderSide(259);
        pdfPCell2.setFollowingIndent(1.65153267E9f);
        assertNotNull(pdfPCell2);
        assertEquals(0.0f, f3);
        assertEquals(0.0f, f4);
    }

    @Test
    void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test229");
        com.lowagie.text.pdf.hyphenation.HyphenationException hyphenationException1 = new com.lowagie.text.pdf.hyphenation.HyphenationException("ZapfDingbats");
        com.lowagie.text.BadElementException badElementException2 = new com.lowagie.text.BadElementException((java.lang.Exception) hyphenationException1);
        com.lowagie.text.ExceptionConverter exceptionConverter3 = new com.lowagie.text.ExceptionConverter((java.lang.Exception) badElementException2);
        java.lang.Exception exception4 = exceptionConverter3.getException();
        java.lang.Exception exception5 = exceptionConverter3.getException();
        assertNotNull(exception4);
        assertNotNull(exception5);
    }

    @Test
    void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test230");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        byte[] byte_array5 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream6 = new com.lowagie.text.pdf.PRStream(pdfReader0, byte_array5);
        com.lowagie.text.pdf.PdfReader pdfReader7 = null;
        byte[] byte_array12 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream13 = new com.lowagie.text.pdf.PRStream(pdfReader7, byte_array12);
        pRStream6.setData(byte_array12, false, (int) (byte) 100);
        byte[] byte_array17 = pRStream6.getBytes();
        boolean b18 = pRStream6.isPages();
        com.lowagie.text.pdf.PdfReader pdfReader19 = null;
        byte[] byte_array24 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream25 = new com.lowagie.text.pdf.PRStream(pdfReader19, byte_array24);
        com.lowagie.text.pdf.PdfReader pdfReader26 = null;
        byte[] byte_array31 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream32 = new com.lowagie.text.pdf.PRStream(pdfReader26, byte_array31);
        pRStream25.setData(byte_array31, false, (int) (byte) 100);
        byte[] byte_array36 = pRStream25.getBytes();
        pRStream6.setData(byte_array36);
        byte[] byte_array40 = new byte[]{(byte) 100, (byte) 10};
        com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray41 = new com.lowagie.text.pdf.RandomAccessFileOrArray(byte_array40);
        byte[] byte_array42 = com.lowagie.text.pdf.PdfReader.getStreamBytes(pRStream6, randomAccessFileOrArray41);
        com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray43 = new com.lowagie.text.pdf.RandomAccessFileOrArray(byte_array42);
        randomAccessFileOrArray43.pushBack((byte) 100);
        char char46 = randomAccessFileOrArray43.readChar();
        assertNotNull(byte_array5);
        assertNotNull(byte_array12);
        assertNotNull(byte_array17);
        assertEquals(false, b18);
        assertNotNull(byte_array24);
        assertNotNull(byte_array31);
        assertNotNull(byte_array36);
        assertNotNull(byte_array40);
        assertNotNull(byte_array42);
        assertEquals('搁', char46);
    }

    @Test
    void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test231");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        java.io.OutputStream outputStream1 = null;
        byte[] byte_array4 = new byte[]{(byte) 100, (byte) 10};
        com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray5 = new com.lowagie.text.pdf.RandomAccessFileOrArray(byte_array4);
        com.lowagie.text.pdf.OutputStreamEncryption outputStreamEncryption7 = new com.lowagie.text.pdf.OutputStreamEncryption(outputStream1, byte_array4, (int) (byte) -1);
        try {
            com.lowagie.text.pdf.PdfStamper pdfStamper10 = new com.lowagie.text.pdf.PdfStamper(pdfReader0, (java.io.OutputStream) outputStreamEncryption7, 'e', true);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(byte_array4);
    }

    @Test
    void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test232");
        java.lang.String str0 = com.lowagie.text.ElementTags.PAGE_SIZE;
        assertEquals("pagesize", str0, "'" + str0 + "' != '" + "pagesize" + "'");
    }

    @Test
    void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test233");
        try {
            byte[] byte_array1 = com.lowagie.text.pdf.Barcode39.getBarsCode39("w");
            fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test234");
        com.lowagie.text.Paragraph paragraph0 = null;
        com.lowagie.text.Chapter chapter2 = new com.lowagie.text.Chapter((int) (short) -1);
        com.lowagie.text.MarkedSection markedSection3 = chapter2.addMarkedSection();
        com.lowagie.text.Font font9 = com.lowagie.text.FontFactory.getFont("page-break-after", "face", (float) 30);
        com.lowagie.text.ListItem listItem10 = new com.lowagie.text.ListItem("border-bottom-width", font9);
        float f11 = listItem10.getIndentationRight();
        com.lowagie.text.Section section12 = chapter2.addSection((float) 302, (com.lowagie.text.Paragraph) listItem10);
        com.lowagie.text.Paragraph paragraph15 = com.lowagie.text.Section.constructTitle(paragraph0, (java.util.ArrayList) section12, (int) (byte) 47, 24);
        float f16 = section12.getIndentationRight();
        assertNotNull(markedSection3);
        assertNotNull(font9);
        assertEquals(0.0f, f11);
        assertNotNull(section12);
        assertNull(paragraph15);
        assertEquals(0.0f, f16);
    }

    @Test
    void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test235");
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
        document14.resetHeader();
        float f29 = document14.leftMargin();
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertEquals(36.0f, f29);
    }

    @Test
    void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test236");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte12 = type3Font5.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte12.fillStroke();
        pdfContentByte12.setLineDash((float) 'c', 2.0f);
        java.util.Properties properties18 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b19 = properties18.isEmpty();
        boolean b21 = properties18.contains((java.lang.Object) 14);
        com.lowagie.text.Paragraph paragraph22 = com.lowagie.text.factories.ElementFactory.getParagraph(properties18);
        int i23 = properties18.size();
        com.lowagie.text.Table table24 = com.lowagie.text.factories.ElementFactory.getTable(properties18);
        boolean b25 = table24.isLocked();
        pdfContentByte12.rectangle((com.lowagie.text.Rectangle) table24);
        assertNotNull(char_array3);
        assertNotNull(pdfContentByte12);
        assertNotNull(properties18);
        assertEquals(true, b19);
        assertEquals(false, b21);
        assertNotNull(paragraph22);
        assertEquals(0, i23);
        assertNotNull(table24);
        assertEquals(false, b25);
    }

    @Test
    void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test237");
        com.lowagie.text.pdf.XfaForm xfaForm0 = new com.lowagie.text.pdf.XfaForm();
        com.lowagie.text.pdf.XfaForm.Xml2SomDatasets xml2SomDatasets1 = null;
        xfaForm0.setDatasetsSom(xml2SomDatasets1);
        com.lowagie.text.pdf.XfaForm.Xml2SomDatasets xml2SomDatasets3 = xfaForm0.getDatasetsSom();
        java.io.InputStream inputStream4 = null;
        try {
            xfaForm0.fillXfaForm(inputStream4);
            fail("Expected exception of type java.net.MalformedURLException");
        } catch (java.net.MalformedURLException e) {
        }
        assertNull(xml2SomDatasets3);
    }

    @Test
    void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test238");
        int i0 = com.lowagie.text.pdf.PdfStream.NO_COMPRESSION;
        assertEquals(0, i0);
    }

    @Test
    void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test239");
        com.lowagie.text.Meta meta2 = new com.lowagie.text.Meta("xmp:ModifyDate", "convert2pdfp");
        java.lang.String str3 = meta2.getName();
        assertEquals("unknown", str3, "'" + str3 + "' != '" + "unknown" + "'");
    }

    @Test
    void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test240");
        int[] i_array1 = com.lowagie.text.pdf.GlyphList.nameToUnicode("pdf:keywords");
        assertNull(i_array1);
    }

    @Test
    void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test241");
        com.lowagie.text.pdf.PdfDashPattern pdfDashPattern4 = new com.lowagie.text.pdf.PdfDashPattern((float) 0L, (float) 8);
        int i5 = pdfDashPattern4.size();
        try {
            com.lowagie.text.pdf.PdfBorderDictionary pdfBorderDictionary6 = new com.lowagie.text.pdf.PdfBorderDictionary((float) 1046, 25610, pdfDashPattern4);
            fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        assertEquals(2, i5);
    }

    @Test
    void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test242");
        java.lang.String str0 = com.lowagie.text.ElementTags.LLY;
        assertEquals("lly", str0, "'" + str0 + "' != '" + "lly" + "'");
    }

    @Test
    void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test243");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ROOT;
        assertNotNull(pdfName0);
    }

    @Test
    void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test244");
        java.io.OutputStream outputStream0 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields2 = new com.lowagie.text.pdf.PdfCopyFields(outputStream0, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = pdfCopyFields2.getWriter();
        int i4 = pdfWriter3.getCurrentPageNumber();
        pdfWriter3.setLinearPageMode();
        com.lowagie.text.Annotation annotation14 = new com.lowagie.text.Annotation((float) '4', (float) 1, (float) '4', (float) 29, "listitem", "absolutey", "hi!", "ZapfDingbats");
        com.lowagie.text.pdf.PdfPTable pdfPTable16 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell17 = pdfPTable16.getDefaultCell();
        com.lowagie.text.pdf.ColumnText columnText18 = null;
        pdfPCell17.setColumn(columnText18);
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation20 = com.lowagie.text.pdf.internal.PdfAnnotationsImp.convertAnnotation(pdfWriter3, annotation14, (com.lowagie.text.Rectangle) pdfPCell17);
        float f21 = annotation14.lly();
        assertNotNull(pdfWriter3);
        assertEquals(1, i4);
        assertNotNull(pdfPCell17);
        assertNotNull(pdfAnnotation20);
        assertEquals(1.0f, f21);
    }

    @Test
    void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test245");
        com.lowagie.text.RomanList romanList0 = new com.lowagie.text.RomanList();
        romanList0.normalizeIndentation();
    }

    @Test
    void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test246");
        try {
            byte[] byte_array2 = com.lowagie.text.pdf.PdfEncodings.convertToBytes('c', "always");
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (com.lowagie.text.ExceptionConverter e) {
        }
    }

    @Test
    void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test247");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        pdfPTable1.setSpacingBefore((float) 15);
        com.lowagie.text.pdf.PdfPTable pdfPTable5 = new com.lowagie.text.pdf.PdfPTable(pdfPTable1);
        float f6 = pdfPTable5.getHeaderHeight();
        pdfPTable5.setRunDirection(0);
        pdfPTable5.setSpacingBefore((float) 32768);
        assertNotNull(pdfPCell2);
        assertEquals(0.0f, f6);
    }

    @Test
    void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test248");
        com.lowagie.text.FontFactoryImp fontFactoryImp0 = new com.lowagie.text.FontFactoryImp();
        int i2 = fontFactoryImp0.registerDirectory("UnicodeBig");
        fontFactoryImp0.registerFamily("listitem", "LOCALGOTO", "NEWPAGE");
        java.util.Set set7 = fontFactoryImp0.getRegisteredFamilies();
        assertEquals(0, i2);
        assertNotNull(set7);
    }

    @Test
    void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test249");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte12 = type3Font5.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte12.fillStroke();
        com.lowagie.text.pdf.FontMapper fontMapper16 = null;
        java.awt.print.PrinterJob printerJob19 = null;
        java.awt.Graphics2D graphics2D20 = pdfContentByte12.createPrinterGraphics((-1.0f), (float) (-1), fontMapper16, true, (float) (byte) 1, printerJob19);
        com.lowagie.text.pdf.VerticalText verticalText21 = new com.lowagie.text.pdf.VerticalText(pdfContentByte12);
        try {
            pdfContentByte12.endLayer();
            fail("Expected exception of type com.lowagie.text.exceptions.IllegalPdfSyntaxException");
        } catch (com.lowagie.text.exceptions.IllegalPdfSyntaxException e) {
        }
        assertNotNull(char_array3);
        assertNotNull(pdfContentByte12);
        assertNotNull(graphics2D20);
    }

    @Test
    void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test250");
        com.lowagie.text.BadElementException badElementException1 = new com.lowagie.text.BadElementException("top");
    }

    @Test
    void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test251");
        boolean b1 = com.lowagie.text.pdf.PRTokeniser.isDelimiterWhitespace(2);
        assertEquals(false, b1);
    }

    @Test
    void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test252");
        com.lowagie.text.RectangleReadOnly rectangleReadOnly4 = new com.lowagie.text.RectangleReadOnly((float) (byte) 100, (float) 1336, (float) 'Ë', (float) 9);
        com.lowagie.text.pdf.BaseFont baseFont10 = null;
        com.lowagie.text.Font font13 = new com.lowagie.text.Font(baseFont10, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont15 = font13.getCalculatedBaseFont(false);
        boolean b18 = baseFont15.setCharAdvance(9, 0);
        java.awt.Color color24 = java.awt.Color.getHSBColor(100.0f, (float) (short) 1, 100.0f);
        int i25 = com.lowagie.text.pdf.ExtendedColor.getType(color24);
        com.lowagie.text.Font font26 = new com.lowagie.text.Font(baseFont15, (float) (-1), (int) 'Ã', color24);
        int i27 = color24.getGreen();
        com.lowagie.text.Font font29 = com.lowagie.text.FontFactory.getFont("dc:date", "href", false, (float) 'a', (-3), color24, false);
        try {
            rectangleReadOnly4.setBorderColor(color24);
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        assertNotNull(baseFont15);
        assertEquals(true, b18);
        assertNotNull(color24);
        assertEquals(0, i25);
        assertEquals(0, i27);
        assertNotNull(font29);
    }

    @Test
    void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test253");
        com.lowagie.text.pdf.PdfPCell[] pdfPCell_array0 = new com.lowagie.text.pdf.PdfPCell[]{};
        com.lowagie.text.pdf.PdfPRow pdfPRow1 = new com.lowagie.text.pdf.PdfPRow(pdfPCell_array0);
        com.lowagie.text.pdf.PdfAction pdfAction3 = com.lowagie.text.pdf.PdfAction.createHide((java.lang.Object[]) pdfPCell_array0, true);
        java.util.Set<com.lowagie.text.pdf.PdfName> set_pdfName4 = pdfAction3.getKeys();
        assertNotNull(pdfPCell_array0);
        assertNotNull(pdfAction3);
        assertNotNull(set_pdfName4);
    }

    @Test
    void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test254");
        com.lowagie.text.ZapfDingbatsList zapfDingbatsList2 = new com.lowagie.text.ZapfDingbatsList(40, (int) (short) 2660);
    }

    @Test
    void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test255");
        com.lowagie.text.GreekList greekList0 = new com.lowagie.text.GreekList();
        greekList0.setPostSymbol("dc:title");
        int i3 = greekList0.getFirst();
        assertEquals(1, i3);
    }

    @Test
    void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test256");
        com.lowagie.text.pdf.draw.DrawInterface drawInterface0 = null;
        com.lowagie.text.Chunk chunk2 = new com.lowagie.text.Chunk(drawInterface0, (float) 2368);
        com.lowagie.text.Chunk chunk4 = chunk2.setTextRise((float) 'Ã');
        java.lang.String str5 = chunk4.getContent();
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper6 = new com.lowagie.text.pdf.PdfPageEventHelper();
        java.io.OutputStream outputStream7 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields9 = new com.lowagie.text.pdf.PdfCopyFields(outputStream7, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter10 = pdfCopyFields9.getWriter();
        com.lowagie.text.Font font12 = null;
        com.lowagie.text.Footnote footnote13 = new com.lowagie.text.Footnote("", font12);
        com.lowagie.text.HeaderFooter headerFooter15 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote13, true);
        headerFooter15.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle18 = headerFooter15.rotate();
        com.lowagie.text.Rectangle rectangle19 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter15);
        com.lowagie.text.Document document20 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter15);
        boolean b22 = document20.setMarginMirroringTopBottom(true);
        com.lowagie.text.Font font26 = null;
        com.lowagie.text.Footnote footnote27 = new com.lowagie.text.Footnote("", font26);
        com.lowagie.text.HeaderFooter headerFooter29 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote27, true);
        headerFooter29.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph32 = headerFooter29.paragraph();
        pdfPageEventHelper6.onSection(pdfWriter10, document20, (float) 7, 262144, paragraph32);
        pdfWriter10.setStrictImageSequence(false);
        pdfWriter10.setEncryption(false, "true", "bottom", 1336);
        com.lowagie.text.pdf.PdfName pdfName41 = com.lowagie.text.pdf.PdfName.NONE;
        com.lowagie.text.pdf.PdfName pdfName42 = com.lowagie.text.pdf.PdfName.XREF;
        pdfWriter10.setDefaultColorspace(pdfName41, (com.lowagie.text.pdf.PdfObject) pdfName42);
        java.lang.String[] str_array50 = new java.lang.String[]{"bottom", "grayfill", "Helvetica-Oblique", "<?xpacket end=\"r\"?>", "sybp"};
        com.lowagie.text.pdf.PdfFormField pdfFormField52 = com.lowagie.text.pdf.PdfFormField.createCombo(pdfWriter10, false, str_array50, 1078);
        int i53 = pdfFormField52.size();
        com.lowagie.text.Chunk chunk54 = chunk4.setAnnotation((com.lowagie.text.pdf.PdfAnnotation) pdfFormField52);
        com.lowagie.text.Chunk chunk57 = chunk4.setRemoteGoto("", 258);
        assertNotNull(chunk4);
        assertEquals("￼", str5, "'" + str5 + "' != '" + "￼" + "'");
        assertNotNull(pdfWriter10);
        assertNotNull(rectangle18);
        assertEquals(true, b22);
        assertNotNull(paragraph32);
        assertNotNull(pdfName41);
        assertNotNull(pdfName42);
        assertNotNull(str_array50);
        assertNotNull(pdfFormField52);
        assertEquals(4, i53);
        assertNotNull(chunk54);
        assertNotNull(chunk57);
    }

    @Test
    void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test257");
        com.lowagie.text.Font font1 = null;
        com.lowagie.text.Footnote footnote2 = new com.lowagie.text.Footnote("", font1);
        int[] i_array7 = new int[]{(short) 1, 1785737760, 8, 100};
        com.lowagie.text.pdf.SimpleBookmark.eliminatePages((java.util.List) footnote2, i_array7);
        int[] i_array15 = new int[]{(short) -1, 0, 'a', 10, 3, (byte) 100};
        com.lowagie.text.pdf.internal.PolylineShape polylineShape17 = new com.lowagie.text.pdf.internal.PolylineShape(i_array7, i_array15, 4);
        boolean b22 = polylineShape17.intersects((double) (byte) 60, (double) (short) 1, (double) 8.0f, (double) 13);
        boolean b27 = polylineShape17.intersects((double) 1668246642, (double) 2368, (double) 32767.0f, (double) 1065);
        assertNotNull(i_array7);
        assertNotNull(i_array15);
        assertEquals(false, b22);
        assertEquals(false, b27);
    }

    @Test
    void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test258");
        com.lowagie.text.Chapter chapter2 = new com.lowagie.text.Chapter("inline", 262);
    }

    @Test
    void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test259");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField1 = com.lowagie.text.pdf.PdfFormField.createCheckBox(pdfWriter0);
        pdfFormField1.setQuadding((int) (byte) 100);
        pdfFormField1.setMKTextPosition(30);
        pdfFormField1.setButton(1668246642);
        assertNotNull(pdfFormField1);
    }

    @Test
    void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test260");
        byte[] byte_array1 = com.lowagie.text.pdf.crypto.IVGenerator.getIV(0);
        com.lowagie.text.pdf.PRTokeniser pRTokeniser2 = new com.lowagie.text.pdf.PRTokeniser(byte_array1);
        int i3 = pRTokeniser2.length();
        int i4 = pRTokeniser2.getFilePointer();
        pRTokeniser2.close();
        pRTokeniser2.backOnePosition((int) 'c');
        pRTokeniser2.seek(3);
        try {
            int i10 = pRTokeniser2.getStartxref();
            fail("Expected exception of type com.lowagie.text.exceptions.InvalidPdfException");
        } catch (com.lowagie.text.exceptions.InvalidPdfException e) {
        }
        assertNotNull(byte_array1);
        assertEquals(0, i3);
        assertEquals(0, i4);
    }

    @Test
    void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test261");
        int i0 = com.lowagie.text.pdf.PdfFormField.FF_COMBO;
        assertEquals(131072, i0);
    }

    @Test
    void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test262");
        com.lowagie.text.SimpleCell simpleCell1 = new com.lowagie.text.SimpleCell(true);
        com.lowagie.text.SimpleCell simpleCell3 = new com.lowagie.text.SimpleCell(true);
        simpleCell3.setSpacing_top((float) 226);
        int i6 = simpleCell3.type();
        com.lowagie.text.Cell cell7 = simpleCell1.createCell(simpleCell3);
        simpleCell3.setPadding_top((float) 1564);
        boolean b10 = simpleCell3.isUseBorderPadding();
        assertEquals(20, i6);
        assertNotNull(cell7);
        assertEquals(false, b10);
    }

    @Test
    void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test263");
        com.lowagie.text.Font font1 = null;
        com.lowagie.text.Footnote footnote2 = new com.lowagie.text.Footnote("", font1);
        com.lowagie.text.HeaderFooter headerFooter4 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote2, true);
        com.lowagie.text.pdf.HyphenationAuto hyphenationAuto9 = new com.lowagie.text.pdf.HyphenationAuto("Default", "creationdate", (-1), 1785737760);
        footnote2.setHyphenation((com.lowagie.text.pdf.HyphenationEvent) hyphenationAuto9);
        com.lowagie.text.Font font11 = footnote2.getFont();
        float f12 = com.lowagie.text.pdf.ColumnText.getWidth((com.lowagie.text.Phrase) footnote2);
        assertNull(font11);
        assertEquals(0.0f, f12);
    }

    @Test
    void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test264");
        com.lowagie.text.Chunk chunk0 = new com.lowagie.text.Chunk();
        com.lowagie.text.Image image1 = chunk0.getImage();
        com.lowagie.text.Chunk chunk3 = chunk0.setLocalGoto("text-align");
        boolean b4 = chunk0.isEmpty();
        assertNull(image1);
        assertNotNull(chunk3);
        assertEquals(false, b4);
    }

    @Test
    void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test265");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        float[] f_array7 = new float[]{100.0f, 8, 3, 7, 100.0f, 'a'};
        float[] f_array9 = new float[]{(byte) 10};
        float[] f_array15 = new float[]{64, 64, 100.0f, 4, 29};
        com.lowagie.text.pdf.PdfWriter pdfWriter16 = null;
        com.lowagie.text.Font font18 = null;
        com.lowagie.text.Footnote footnote19 = new com.lowagie.text.Footnote("", font18);
        com.lowagie.text.HeaderFooter headerFooter21 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote19, true);
        headerFooter21.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle24 = headerFooter21.rotate();
        float[] f_array29 = new float[]{6, 9};
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation30 = com.lowagie.text.pdf.PdfAnnotation.createMarkup(pdfWriter16, rectangle24, "Stream", 3, f_array29);
        com.lowagie.text.pdf.PdfFunction pdfFunction32 = com.lowagie.text.pdf.PdfFunction.type2(pdfWriter0, f_array7, f_array9, f_array15, f_array29, 561.0f);
        com.lowagie.text.pdf.PdfPTable pdfPTable33 = new com.lowagie.text.pdf.PdfPTable(f_array7);
        boolean b34 = pdfPTable33.isHeadersInEvent();
        assertNotNull(f_array7);
        assertNotNull(f_array9);
        assertNotNull(f_array15);
        assertNotNull(rectangle24);
        assertNotNull(f_array29);
        assertNotNull(pdfAnnotation30);
        assertNotNull(pdfFunction32);
        assertEquals(false, b34);
    }

    @Test
    void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test266");
        com.lowagie.text.Font font1 = null;
        com.lowagie.text.Footnote footnote2 = new com.lowagie.text.Footnote("", font1);
        int[] i_array7 = new int[]{(short) 1, 1785737760, 8, 100};
        com.lowagie.text.pdf.SimpleBookmark.eliminatePages((java.util.List) footnote2, i_array7);
        int[] i_array15 = new int[]{(short) -1, 0, 'a', 10, 3, (byte) 100};
        com.lowagie.text.pdf.internal.PolylineShape polylineShape17 = new com.lowagie.text.pdf.internal.PolylineShape(i_array7, i_array15, 4);
        java.awt.geom.AffineTransform affineTransform18 = null;
        java.awt.geom.PathIterator pathIterator19 = polylineShape17.getPathIterator(affineTransform18);
        assertNotNull(i_array7);
        assertNotNull(i_array15);
        assertNotNull(pathIterator19);
    }

    @Test
    void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test267");
        com.lowagie.text.pdf.hyphenation.HyphenationException hyphenationException1 = new com.lowagie.text.pdf.hyphenation.HyphenationException("ZapfDingbats");
        com.lowagie.text.BadElementException badElementException2 = new com.lowagie.text.BadElementException((java.lang.Exception) hyphenationException1);
        com.lowagie.text.ExceptionConverter exceptionConverter3 = new com.lowagie.text.ExceptionConverter((java.lang.Exception) badElementException2);
        java.lang.String str4 = badElementException2.toString();
        assertEquals("com.lowagie.text.BadElementException: com.lowagie.text.pdf.hyphenation.HyphenationException: ZapfDingbats", str4, "'" + str4 + "' != '" + "com.lowagie.text.BadElementException: com.lowagie.text.pdf.hyphenation.HyphenationException: ZapfDingbats" + "'");
    }

    @Test
    void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test268");
        com.lowagie.text.Cell cell0 = new com.lowagie.text.Cell();
        cell0.setUseBorderPadding(false);
    }

    @Test
    void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test269");
        java.lang.String str0 = com.lowagie.text.ElementTags.GENERICTAG;
        assertEquals("generictag", str0, "'" + str0 + "' != '" + "generictag" + "'");
    }

    @Test
    void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test270");
        java.lang.String str1 = com.lowagie.text.pdf.TextField.obfuscatePassword("Default");
        assertEquals("*******", str1, "'" + str1 + "' != '" + "*******" + "'");
    }

    @Test
    void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test271");
        com.lowagie.text.pdf.codec.wmf.MetaBrush metaBrush0 = new com.lowagie.text.pdf.codec.wmf.MetaBrush();
        java.awt.Color color1 = metaBrush0.getColor();
        assertNotNull(color1);
    }

    @Test
    void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test272");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Paragraph paragraph5 = com.lowagie.text.factories.ElementFactory.getParagraph(properties1);
        int i6 = properties1.size();
        com.lowagie.text.Table table7 = com.lowagie.text.factories.ElementFactory.getTable(properties1);
        boolean b8 = table7.isLocked();
        table7.setWidth((float) 200);
        try {
            table7.deleteColumn(32);
            fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(paragraph5);
        assertEquals(0, i6);
        assertNotNull(table7);
        assertEquals(false, b8);
    }

    @Test
    void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test273");
        int i0 = com.lowagie.text.pdf.PdfWriter.ENCRYPTION_AES_128;
        assertEquals(2, i0);
    }

    @Test
    void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test274");
        try {
            byte[] byte_array1 = com.lowagie.text.pdf.BarcodeEAN.getBarsSupplemental2("No message found for xmpMM:ManageUI");
            fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test275");
        java.awt.Color color2 = java.awt.Color.orange;
        com.lowagie.text.Font font3 = com.lowagie.text.FontFactory.getFont("hi!", (float) (byte) 47, color2);
        com.lowagie.text.pdf.BaseFont baseFont5 = font3.getCalculatedBaseFont(false);
        baseFont5.correctArabicAdvance();
        float f9 = baseFont5.getWidthPointKerned("Helvetica-BoldOblique", 34.0f);
        assertNotNull(color2);
        assertNotNull(font3);
        assertNotNull(baseFont5);
        assertEquals(334.798f, f9);
    }

    @Test
    void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test276");
        com.lowagie.text.RomanList romanList2 = new com.lowagie.text.RomanList(true, 247);
        boolean b3 = romanList2.isLowercase();
        assertEquals(true, b3);
    }

    @Test
    void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test277");
        com.lowagie.text.pdf.ByteBuffer byteBuffer1 = new com.lowagie.text.pdf.ByteBuffer(1564);
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields3 = new com.lowagie.text.pdf.PdfCopyFields((java.io.OutputStream) byteBuffer1, 'Ã');
        com.lowagie.text.pdf.ByteBuffer byteBuffer5 = byteBuffer1.append('4');
        com.lowagie.text.pdf.ByteBuffer byteBuffer7 = new com.lowagie.text.pdf.ByteBuffer(1564);
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields9 = new com.lowagie.text.pdf.PdfCopyFields((java.io.OutputStream) byteBuffer7, 'Ã');
        com.lowagie.text.pdf.ByteBuffer byteBuffer11 = byteBuffer7.append(24);
        com.lowagie.text.pdf.ByteBuffer byteBuffer13 = byteBuffer7.append((byte) 100);
        com.lowagie.text.pdf.codec.wmf.MetaDo.writeDWord((java.io.OutputStream) byteBuffer13, 4096);
        com.lowagie.text.pdf.ByteBuffer byteBuffer16 = byteBuffer5.append(byteBuffer13);
        try {
            com.lowagie.text.xml.xmp.XmpWriter xmpWriter19 = new com.lowagie.text.xml.xmp.XmpWriter((java.io.OutputStream) byteBuffer16, "SEPARATOR", 2338);
            fail("Expected exception of type java.io.UnsupportedEncodingException");
        } catch (java.io.UnsupportedEncodingException e) {
        }
        assertNotNull(byteBuffer5);
        assertNotNull(byteBuffer11);
        assertNotNull(byteBuffer13);
        assertNotNull(byteBuffer16);
    }

    @Test
    void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test278");
        com.lowagie.text.Table table2 = new com.lowagie.text.Table(13, 1791);
        com.lowagie.text.Font font4 = null;
        com.lowagie.text.Footnote footnote5 = new com.lowagie.text.Footnote("", font4);
        com.lowagie.text.HeaderFooter headerFooter7 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote5, true);
        headerFooter7.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle10 = headerFooter7.rotate();
        com.lowagie.text.Rectangle rectangle11 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter7);
        com.lowagie.text.Document document12 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter7);
        java.io.OutputStream outputStream13 = null;
        com.lowagie.text.pdf.PdfCopy pdfCopy14 = new com.lowagie.text.pdf.PdfCopy(document12, outputStream13);
        boolean b15 = table2.process((com.lowagie.text.ElementListener) pdfCopy14);
        float f16 = pdfCopy14.getUserunit();
        pdfCopy14.setSpaceCharRatio((float) 11);
        com.lowagie.text.pdf.PdfReader pdfReader19 = null;
        pdfCopy14.freeReader(pdfReader19);
        assertNotNull(rectangle10);
        assertEquals(false, b15);
        assertEquals(0.0f, f16);
    }

    @Test
    void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test279");
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
        pdfWriter4.setAtLeastPdfVersion('È');
        com.lowagie.text.pdf.PdfFormField pdfFormField41 = com.lowagie.text.pdf.PdfFormField.createRadioButton(pdfWriter4, true);
        pdfWriter4.createXmpMetadata();
        com.lowagie.text.pdf.PdfName pdfName43 = pdfWriter4.getTabs();
        java.io.OutputStream outputStream44 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields46 = new com.lowagie.text.pdf.PdfCopyFields(outputStream44, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter47 = pdfCopyFields46.getWriter();
        int i48 = pdfWriter47.getCurrentPageNumber();
        pdfWriter47.setLinearPageMode();
        int i50 = pdfWriter47.getPageNumber();
        pdfWriter47.setStrictImageSequence(true);
        pdfWriter47.clearTextWrap();
        com.lowagie.text.Table table56 = new com.lowagie.text.Table(13, 1791);
        boolean b57 = pdfWriter47.fitsPage(table56);
        float f58 = table56.getOffset();
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation61 = com.lowagie.text.pdf.PdfAnnotation.createSquareCircle(pdfWriter4, (com.lowagie.text.Rectangle) table56, "pdf:keywords", true);
        table56.setCellsFitPage(false);
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertNotNull(pdfName35);
        assertNotNull(pdfName36);
        assertNotNull(pdfFormField41);
        assertNull(pdfName43);
        assertNotNull(pdfWriter47);
        assertEquals(1, i48);
        assertEquals(0, i50);
        assertEquals(true, b57);
        assertEquals((float) f58, Float.NaN, 0);
        assertNotNull(pdfAnnotation61);
    }

    @Test
    void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test280");
        java.io.OutputStream outputStream0 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields2 = new com.lowagie.text.pdf.PdfCopyFields(outputStream0, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = pdfCopyFields2.getWriter();
        int i4 = pdfWriter3.getCurrentPageNumber();
        pdfWriter3.setLinearPageMode();
        int i6 = pdfWriter3.getPageNumber();
        pdfWriter3.setStrictImageSequence(true);
        pdfWriter3.clearTextWrap();
        com.lowagie.text.Table table12 = new com.lowagie.text.Table(13, 1791);
        boolean b13 = pdfWriter3.fitsPage(table12);
        java.io.OutputStream outputStream14 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields16 = new com.lowagie.text.pdf.PdfCopyFields(outputStream14, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter17 = pdfCopyFields16.getWriter();
        int i18 = pdfWriter17.getCurrentPageNumber();
        pdfWriter17.setLinearPageMode();
        int i20 = pdfWriter17.getPageNumber();
        pdfWriter17.setStrictImageSequence(true);
        pdfWriter17.clearTextWrap();
        com.lowagie.text.Table table26 = new com.lowagie.text.Table(13, 1791);
        boolean b27 = pdfWriter17.fitsPage(table26);
        float f28 = table26.getOffset();
        table12.insertTable(table26);
        boolean b30 = table26.isLocked();
        assertNotNull(pdfWriter3);
        assertEquals(1, i4);
        assertEquals(0, i6);
        assertEquals(true, b13);
        assertNotNull(pdfWriter17);
        assertEquals(1, i18);
        assertEquals(0, i20);
        assertEquals(true, b27);
        assertEquals((float) f28, Float.NaN, 0);
        assertEquals(false, b30);
    }

    @Test
    void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test281");
        com.lowagie.text.Rectangle rectangle0 = com.lowagie.text.PageSize.ARCH_B;
        assertNotNull(rectangle0);
    }

    @Test
    void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test282");
        com.lowagie.text.xml.xmp.DublinCoreSchema dublinCoreSchema0 = new com.lowagie.text.xml.xmp.DublinCoreSchema();
        dublinCoreSchema0.addDescription("left");
        java.lang.Object obj5 = dublinCoreSchema0.setProperty("UniKS-UCS2-H", "title");
        com.lowagie.text.pdf.events.FieldPositioningEvents fieldPositioningEvents6 = new com.lowagie.text.pdf.events.FieldPositioningEvents();
        java.io.OutputStream outputStream7 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields9 = new com.lowagie.text.pdf.PdfCopyFields(outputStream7, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter10 = pdfCopyFields9.getWriter();
        pdfWriter10.setFullCompression();
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper12 = new com.lowagie.text.pdf.PdfPageEventHelper();
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper13 = new com.lowagie.text.pdf.PdfPageEventHelper();
        java.io.OutputStream outputStream14 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields16 = new com.lowagie.text.pdf.PdfCopyFields(outputStream14, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter17 = pdfCopyFields16.getWriter();
        com.lowagie.text.Font font19 = null;
        com.lowagie.text.Footnote footnote20 = new com.lowagie.text.Footnote("", font19);
        com.lowagie.text.HeaderFooter headerFooter22 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote20, true);
        headerFooter22.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle25 = headerFooter22.rotate();
        com.lowagie.text.Rectangle rectangle26 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter22);
        com.lowagie.text.Document document27 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter22);
        boolean b29 = document27.setMarginMirroringTopBottom(true);
        com.lowagie.text.Font font33 = null;
        com.lowagie.text.Footnote footnote34 = new com.lowagie.text.Footnote("", font33);
        com.lowagie.text.HeaderFooter headerFooter36 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote34, true);
        headerFooter36.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph39 = headerFooter36.paragraph();
        pdfPageEventHelper13.onSection(pdfWriter17, document27, (float) 7, 262144, paragraph39);
        pdfWriter17.setStrictImageSequence(false);
        pdfWriter17.setEncryption(false, "true", "bottom", 1336);
        com.lowagie.text.Font font49 = null;
        com.lowagie.text.Footnote footnote50 = new com.lowagie.text.Footnote("", font49);
        com.lowagie.text.HeaderFooter headerFooter52 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote50, true);
        headerFooter52.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle55 = headerFooter52.rotate();
        com.lowagie.text.Rectangle rectangle56 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter52);
        com.lowagie.text.Document document57 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter52);
        boolean b59 = document57.setMarginMirroringTopBottom(true);
        float f61 = document57.bottom((float) 100L);
        boolean b63 = document57.setMarginMirroringTopBottom(false);
        byte[] byte_array66 = null;
        com.lowagie.text.pdf.PdfReader pdfReader67 = null;
        byte[] byte_array72 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream73 = new com.lowagie.text.pdf.PRStream(pdfReader67, byte_array72);
        com.lowagie.text.pdf.PdfReader pdfReader74 = null;
        byte[] byte_array79 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream80 = new com.lowagie.text.pdf.PRStream(pdfReader74, byte_array79);
        pRStream73.setData(byte_array79, false, (int) (byte) 100);
        com.lowagie.text.ImgJBIG2 imgJBIG2_84 = new com.lowagie.text.ImgJBIG2(4, 1564, byte_array66, byte_array79);
        int i85 = imgJBIG2_84.getDpiY();
        int[] i_array86 = imgJBIG2_84.getTransparency();
        pdfPageEventHelper12.onGenericTag(pdfWriter17, document57, (com.lowagie.text.Rectangle) imgJBIG2_84, "xxiv");
        fieldPositioningEvents6.onEndPage(pdfWriter10, document57);
        try {
            com.lowagie.text.pdf.PdfDictionary pdfDictionary90 = com.lowagie.text.pdf.PdfNumberTree.writeTree((java.util.Map) dublinCoreSchema0, pdfWriter10);
            fail("Expected exception of type java.lang.ArrayStoreException");
        } catch (java.lang.ArrayStoreException e) {
        }
        assertNull(obj5);
        assertNotNull(pdfWriter10);
        assertNotNull(pdfWriter17);
        assertNotNull(rectangle25);
        assertEquals(true, b29);
        assertNotNull(paragraph39);
        assertNotNull(rectangle55);
        assertEquals(true, b59);
        assertEquals(136.0f, f61);
        assertEquals(true, b63);
        assertNotNull(byte_array72);
        assertNotNull(byte_array79);
        assertEquals(0, i85);
        assertNull(i_array86);
    }

    @Test
    void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test283");
        byte[] byte_array2 = new byte[]{(byte) 100, (byte) 10};
        com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray3 = new com.lowagie.text.pdf.RandomAccessFileOrArray(byte_array2);
        randomAccessFileOrArray3.setStartOffset((int) '#');
        char char6 = randomAccessFileOrArray3.readChar();
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper7 = new com.lowagie.text.pdf.PdfPageEventHelper();
        java.io.OutputStream outputStream8 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields10 = new com.lowagie.text.pdf.PdfCopyFields(outputStream8, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter11 = pdfCopyFields10.getWriter();
        com.lowagie.text.Font font13 = null;
        com.lowagie.text.Footnote footnote14 = new com.lowagie.text.Footnote("", font13);
        com.lowagie.text.HeaderFooter headerFooter16 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote14, true);
        headerFooter16.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle19 = headerFooter16.rotate();
        com.lowagie.text.Rectangle rectangle20 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter16);
        com.lowagie.text.Document document21 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter16);
        boolean b23 = document21.setMarginMirroringTopBottom(true);
        com.lowagie.text.Font font27 = null;
        com.lowagie.text.Footnote footnote28 = new com.lowagie.text.Footnote("", font27);
        com.lowagie.text.HeaderFooter headerFooter30 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote28, true);
        headerFooter30.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph33 = headerFooter30.paragraph();
        pdfPageEventHelper7.onSection(pdfWriter11, document21, (float) 7, 262144, paragraph33);
        pdfWriter11.setStrictImageSequence(false);
        pdfWriter11.setEncryption(false, "true", "bottom", 1336);
        com.lowagie.text.pdf.PdfName pdfName42 = com.lowagie.text.pdf.PdfName.RENDITION;
        pdfWriter11.setTabs(pdfName42);
        byte[] byte_array44 = null;
        com.lowagie.text.pdf.PdfReader pdfReader45 = null;
        byte[] byte_array50 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream51 = new com.lowagie.text.pdf.PRStream(pdfReader45, byte_array50);
        com.lowagie.text.pdf.PdfReader pdfReader52 = null;
        byte[] byte_array57 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream58 = new com.lowagie.text.pdf.PRStream(pdfReader52, byte_array57);
        pRStream51.setData(byte_array57, false, (int) (byte) 100);
        byte[] byte_array62 = pRStream51.getBytes();
        pdfWriter11.setEncryption(byte_array44, byte_array62, 32768, true);
        int i68 = randomAccessFileOrArray3.read(byte_array44, (int) (short) -1, 298);
        assertNotNull(byte_array2);
        assertEquals('搊', char6);
        assertNotNull(pdfWriter11);
        assertNotNull(rectangle19);
        assertEquals(true, b23);
        assertNotNull(paragraph33);
        assertNotNull(pdfName42);
        assertNotNull(byte_array50);
        assertNotNull(byte_array57);
        assertNotNull(byte_array62);
        assertEquals(i68, (-1));
    }

    @Test
    void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test284");
        java.io.OutputStream outputStream0 = null;
        byte[] byte_array3 = new byte[]{(byte) 100, (byte) 10};
        com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray4 = new com.lowagie.text.pdf.RandomAccessFileOrArray(byte_array3);
        com.lowagie.text.pdf.OutputStreamEncryption outputStreamEncryption6 = new com.lowagie.text.pdf.OutputStreamEncryption(outputStream0, byte_array3, (int) (byte) -1);
        com.lowagie.text.pdf.ByteBuffer byteBuffer8 = new com.lowagie.text.pdf.ByteBuffer(1564);
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields10 = new com.lowagie.text.pdf.PdfCopyFields((java.io.OutputStream) byteBuffer8, 'Ã');
        com.lowagie.text.pdf.ByteBuffer byteBuffer12 = byteBuffer8.append(24);
        com.lowagie.text.pdf.PdfReader pdfReader17 = null;
        byte[] byte_array22 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream23 = new com.lowagie.text.pdf.PRStream(pdfReader17, byte_array22);
        com.lowagie.text.pdf.PdfReader pdfReader24 = null;
        byte[] byte_array29 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream30 = new com.lowagie.text.pdf.PRStream(pdfReader24, byte_array29);
        pRStream23.setData(byte_array29, false, (int) (byte) 100);
        byte[] byte_array34 = pRStream23.getBytes();
        com.lowagie.text.pdf.PdfReader pdfReader35 = null;
        byte[] byte_array40 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream41 = new com.lowagie.text.pdf.PRStream(pdfReader35, byte_array40);
        com.lowagie.text.pdf.PdfReader pdfReader42 = null;
        byte[] byte_array47 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream48 = new com.lowagie.text.pdf.PRStream(pdfReader42, byte_array47);
        pRStream41.setData(byte_array47, false, (int) (byte) 100);
        byte[] byte_array52 = pRStream41.getBytes();
        pRStream23.setData(byte_array52);
        byte[] byte_array55 = com.lowagie.text.pdf.crypto.IVGenerator.getIV(0);
        com.lowagie.text.pdf.PRTokeniser pRTokeniser56 = new com.lowagie.text.pdf.PRTokeniser(byte_array55);
        com.lowagie.text.pdf.BaseFont baseFont59 = com.lowagie.text.pdf.BaseFont.createFont("xmp:Thumbnails", "widths", true, false, byte_array52, byte_array55, true, false);
        byteBuffer8.write(byte_array55);
        try {
            outputStreamEncryption6.write(byte_array55, (int) 'È', (int) (short) 25610);
            fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        assertNotNull(byte_array3);
        assertNotNull(byteBuffer12);
        assertNotNull(byte_array22);
        assertNotNull(byte_array29);
        assertNotNull(byte_array34);
        assertNotNull(byte_array40);
        assertNotNull(byte_array47);
        assertNotNull(byte_array52);
        assertNotNull(byte_array55);
        assertNull(baseFont59);
    }

    @Test
    void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test285");
        int i0 = com.lowagie.text.Font.ZAPFDINGBATS;
        assertEquals(4, i0);
    }

    @Test
    void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test286");
        boolean b1 = com.lowagie.text.pdf.PdfEncodings.isPdfDocEncoding("HYGoThic-Medium");
        assertEquals(true, b1);
    }

    @Test
    void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test287");
        com.lowagie.text.pdf.PdfEncryption pdfEncryption0 = new com.lowagie.text.pdf.PdfEncryption();
        java.security.cert.Certificate certificate1 = null;
        pdfEncryption0.addRecipient(certificate1, 1970433056);
    }

    @Test
    void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test288");
        com.lowagie.text.pdf.PdfPCell[] pdfPCell_array0 = new com.lowagie.text.pdf.PdfPCell[]{};
        com.lowagie.text.pdf.PdfPRow pdfPRow1 = new com.lowagie.text.pdf.PdfPRow(pdfPCell_array0);
        float f2 = pdfPRow1.getMaxHeights();
        com.lowagie.text.pdf.PdfPTable pdfPTable4 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell5 = pdfPTable4.getDefaultCell();
        pdfPTable4.setFooterRows((-1));
        pdfPTable4.setSpacingBefore((float) 20);
        com.lowagie.text.pdf.PdfPTable pdfPTable10 = com.lowagie.text.pdf.PdfPTable.shallowCopy(pdfPTable4);
        com.lowagie.text.pdf.PdfPRow pdfPRow13 = pdfPRow1.splitRow(pdfPTable10, (int) (byte) 1, (float) 34);
        assertNotNull(pdfPCell_array0);
        assertEquals(0.0f, f2);
        assertNotNull(pdfPCell5);
        assertNotNull(pdfPTable10);
        assertNull(pdfPRow13);
    }

    @Test
    void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test289");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        float f3 = pdfPTable1.getRowHeight(1785737760);
        boolean b5 = pdfPTable1.isExtendLastRow(true);
        com.lowagie.text.pdf.PdfPTable pdfPTable7 = new com.lowagie.text.pdf.PdfPTable(1);
        pdfPTable1.addCell(pdfPTable7);
        boolean b9 = pdfPTable7.isContent();
        assertEquals(0.0f, f3);
        assertEquals(false, b5);
        assertEquals(true, b9);
    }

    @Test
    void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test290");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfAnnotation.HIGHLIGHT_OUTLINE;
        assertNotNull(pdfName0);
    }

    @Test
    void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test291");
        com.lowagie.text.exceptions.UnsupportedPdfException unsupportedPdfException1 = new com.lowagie.text.exceptions.UnsupportedPdfException("-");
    }

    @Test
    void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test292");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.LAST;
        com.lowagie.text.pdf.PdfName pdfName1 = com.lowagie.text.pdf.PdfName.KEYWORDS;
        com.lowagie.text.pdf.PdfDeveloperExtension pdfDeveloperExtension3 = new com.lowagie.text.pdf.PdfDeveloperExtension(pdfName0, pdfName1, (int) (short) 10);
        com.lowagie.text.pdf.PdfDictionary pdfDictionary4 = pdfDeveloperExtension3.getDeveloperExtensions();
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper5 = new com.lowagie.text.pdf.PdfPageEventHelper();
        java.io.OutputStream outputStream6 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields8 = new com.lowagie.text.pdf.PdfCopyFields(outputStream6, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter9 = pdfCopyFields8.getWriter();
        com.lowagie.text.Font font11 = null;
        com.lowagie.text.Footnote footnote12 = new com.lowagie.text.Footnote("", font11);
        com.lowagie.text.HeaderFooter headerFooter14 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote12, true);
        headerFooter14.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle17 = headerFooter14.rotate();
        com.lowagie.text.Rectangle rectangle18 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter14);
        com.lowagie.text.Document document19 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter14);
        boolean b21 = document19.setMarginMirroringTopBottom(true);
        com.lowagie.text.Font font25 = null;
        com.lowagie.text.Footnote footnote26 = new com.lowagie.text.Footnote("", font25);
        com.lowagie.text.HeaderFooter headerFooter28 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote26, true);
        headerFooter28.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph31 = headerFooter28.paragraph();
        pdfPageEventHelper5.onSection(pdfWriter9, document19, (float) 7, 262144, paragraph31);
        pdfWriter9.setStrictImageSequence(false);
        pdfWriter9.setEncryption(false, "true", "bottom", 1336);
        com.lowagie.text.pdf.PdfName pdfName40 = com.lowagie.text.pdf.PdfName.NONE;
        com.lowagie.text.pdf.PdfName pdfName41 = com.lowagie.text.pdf.PdfName.XREF;
        pdfWriter9.setDefaultColorspace(pdfName40, (com.lowagie.text.pdf.PdfObject) pdfName41);
        pdfWriter9.setAtLeastPdfVersion('È');
        com.lowagie.text.pdf.PdfFormField pdfFormField46 = com.lowagie.text.pdf.PdfFormField.createRadioButton(pdfWriter9, true);
        pdfWriter9.createXmpMetadata();
        com.lowagie.text.pdf.PdfName pdfName48 = pdfWriter9.getTabs();
        java.io.OutputStream outputStream49 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields51 = new com.lowagie.text.pdf.PdfCopyFields(outputStream49, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter52 = pdfCopyFields51.getWriter();
        int i53 = pdfWriter52.getCurrentPageNumber();
        pdfWriter52.setLinearPageMode();
        int i55 = pdfWriter52.getPageNumber();
        pdfWriter52.setStrictImageSequence(true);
        pdfWriter52.clearTextWrap();
        com.lowagie.text.Table table61 = new com.lowagie.text.Table(13, 1791);
        boolean b62 = pdfWriter52.fitsPage(table61);
        float f63 = table61.getOffset();
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation66 = com.lowagie.text.pdf.PdfAnnotation.createSquareCircle(pdfWriter9, (com.lowagie.text.Rectangle) table61, "pdf:keywords", true);
        com.lowagie.text.pdf.BaseField.moveFields(pdfDictionary4, (com.lowagie.text.pdf.PdfDictionary) pdfAnnotation66);
        assertNotNull(pdfName0);
        assertNotNull(pdfName1);
        assertNotNull(pdfDictionary4);
        assertNotNull(pdfWriter9);
        assertNotNull(rectangle17);
        assertEquals(true, b21);
        assertNotNull(paragraph31);
        assertNotNull(pdfName40);
        assertNotNull(pdfName41);
        assertNotNull(pdfFormField46);
        assertNull(pdfName48);
        assertNotNull(pdfWriter52);
        assertEquals(1, i53);
        assertEquals(0, i55);
        assertEquals(true, b62);
        assertEquals((float) f63, Float.NaN, 0);
        assertNotNull(pdfAnnotation66);
    }

    @Test
    void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test293");
        byte[] byte_array5 = null;
        com.lowagie.text.pdf.BarcodePDF417 barcodePDF417_6 = new com.lowagie.text.pdf.BarcodePDF417();
        int i7 = barcodePDF417_6.getBitColumns();
        int i8 = barcodePDF417_6.getCodeRows();
        int[] i_array9 = barcodePDF417_6.getCodewords();
        try {
            com.lowagie.text.Image image10 = com.lowagie.text.Image.getInstance(9, (int) 'ਁ', false, 0, 1718909296, byte_array5, i_array9);
            fail("Expected exception of type com.lowagie.text.BadElementException");
        } catch (com.lowagie.text.BadElementException e) {
        }
        assertEquals(0, i7);
        assertEquals(0, i8);
        assertNotNull(i_array9);
    }

    @Test
    void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test294");
        com.lowagie.text.Table table2 = new com.lowagie.text.Table(13, 1791);
        float[] f_array5 = table2.getWidths((float) 804, (float) 1065);
        com.lowagie.text.pdf.PdfPTable pdfPTable6 = new com.lowagie.text.pdf.PdfPTable(f_array5);
        pdfPTable6.setHeadersInEvent(false);
        int i9 = pdfPTable6.getHeaderRows();
        assertNotNull(f_array5);
        assertEquals(0, i9);
    }

    @Test
    void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test295");
        byte[] byte_array2 = null;
        com.lowagie.text.pdf.PdfReader pdfReader3 = null;
        byte[] byte_array8 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream9 = new com.lowagie.text.pdf.PRStream(pdfReader3, byte_array8);
        com.lowagie.text.pdf.PdfReader pdfReader10 = null;
        byte[] byte_array15 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream16 = new com.lowagie.text.pdf.PRStream(pdfReader10, byte_array15);
        pRStream9.setData(byte_array15, false, (int) (byte) 100);
        com.lowagie.text.ImgJBIG2 imgJBIG2_20 = new com.lowagie.text.ImgJBIG2(4, 1564, byte_array2, byte_array15);
        int i21 = imgJBIG2_20.getAlignment();
        com.lowagie.text.pdf.PdfDictionary pdfDictionary22 = null;
        imgJBIG2_20.setAdditional(pdfDictionary22);
        java.net.URL uRL24 = imgJBIG2_20.getUrl();
        java.awt.color.ICC_Profile iCC_Profile25 = imgJBIG2_20.getICCProfile();
        assertNotNull(byte_array8);
        assertNotNull(byte_array15);
        assertEquals(0, i21);
        assertNull(uRL24);
        assertNull(iCC_Profile25);
    }

    @Test
    void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test296");
        com.lowagie.text.pdf.collection.PdfCollectionField pdfCollectionField2 = new com.lowagie.text.pdf.collection.PdfCollectionField("ZapfDingbats", (int) '#');
        com.lowagie.text.pdf.PdfName pdfName3 = com.lowagie.text.pdf.PdfName.USAGE;
        com.lowagie.text.pdf.PdfStream pdfStream4 = pdfCollectionField2.getAsStream(pdfName3);
        assertNotNull(pdfName3);
        assertNull(pdfStream4);
    }

    @Test
    void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test297");
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper0 = new com.lowagie.text.pdf.PdfPageEventHelper();
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper1 = new com.lowagie.text.pdf.PdfPageEventHelper();
        java.io.OutputStream outputStream2 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields4 = new com.lowagie.text.pdf.PdfCopyFields(outputStream2, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter5 = pdfCopyFields4.getWriter();
        com.lowagie.text.Font font7 = null;
        com.lowagie.text.Footnote footnote8 = new com.lowagie.text.Footnote("", font7);
        com.lowagie.text.HeaderFooter headerFooter10 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote8, true);
        headerFooter10.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle13 = headerFooter10.rotate();
        com.lowagie.text.Rectangle rectangle14 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter10);
        com.lowagie.text.Document document15 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter10);
        boolean b17 = document15.setMarginMirroringTopBottom(true);
        com.lowagie.text.Font font21 = null;
        com.lowagie.text.Footnote footnote22 = new com.lowagie.text.Footnote("", font21);
        com.lowagie.text.HeaderFooter headerFooter24 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote22, true);
        headerFooter24.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph27 = headerFooter24.paragraph();
        pdfPageEventHelper1.onSection(pdfWriter5, document15, (float) 7, 262144, paragraph27);
        pdfWriter5.setStrictImageSequence(false);
        pdfWriter5.setEncryption(false, "true", "bottom", 1336);
        com.lowagie.text.Font font37 = null;
        com.lowagie.text.Footnote footnote38 = new com.lowagie.text.Footnote("", font37);
        com.lowagie.text.HeaderFooter headerFooter40 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote38, true);
        headerFooter40.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle43 = headerFooter40.rotate();
        com.lowagie.text.Rectangle rectangle44 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter40);
        com.lowagie.text.Document document45 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter40);
        boolean b47 = document45.setMarginMirroringTopBottom(true);
        float f49 = document45.bottom((float) 100L);
        boolean b51 = document45.setMarginMirroringTopBottom(false);
        byte[] byte_array54 = null;
        com.lowagie.text.pdf.PdfReader pdfReader55 = null;
        byte[] byte_array60 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream61 = new com.lowagie.text.pdf.PRStream(pdfReader55, byte_array60);
        com.lowagie.text.pdf.PdfReader pdfReader62 = null;
        byte[] byte_array67 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream68 = new com.lowagie.text.pdf.PRStream(pdfReader62, byte_array67);
        pRStream61.setData(byte_array67, false, (int) (byte) 100);
        com.lowagie.text.ImgJBIG2 imgJBIG2_72 = new com.lowagie.text.ImgJBIG2(4, 1564, byte_array54, byte_array67);
        int i73 = imgJBIG2_72.getDpiY();
        int[] i_array74 = imgJBIG2_72.getTransparency();
        pdfPageEventHelper0.onGenericTag(pdfWriter5, document45, (com.lowagie.text.Rectangle) imgJBIG2_72, "xxiv");
        document45.setJavaScript_onLoad("Dictionary");
        assertNotNull(pdfWriter5);
        assertNotNull(rectangle13);
        assertEquals(true, b17);
        assertNotNull(paragraph27);
        assertNotNull(rectangle43);
        assertEquals(true, b47);
        assertEquals(136.0f, f49);
        assertEquals(true, b51);
        assertNotNull(byte_array60);
        assertNotNull(byte_array67);
        assertEquals(0, i73);
        assertNull(i_array74);
    }

    @Test
    void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test298");
        com.lowagie.text.pdf.ByteBuffer byteBuffer1 = new com.lowagie.text.pdf.ByteBuffer(1564);
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields3 = new com.lowagie.text.pdf.PdfCopyFields((java.io.OutputStream) byteBuffer1, 'Ã');
        com.lowagie.text.pdf.ByteBuffer byteBuffer5 = byteBuffer1.append(24);
        com.lowagie.text.pdf.ByteBuffer byteBuffer7 = byteBuffer1.append((byte) 100);
        com.lowagie.text.pdf.ByteBuffer byteBuffer9 = byteBuffer1.appendHex((byte) 9);
        byte[] byte_array11 = com.lowagie.text.pdf.crypto.IVGenerator.getIV(0);
        com.lowagie.text.pdf.PRTokeniser pRTokeniser12 = new com.lowagie.text.pdf.PRTokeniser(byte_array11);
        int i13 = pRTokeniser12.length();
        int i14 = pRTokeniser12.getFilePointer();
        pRTokeniser12.close();
        com.lowagie.text.pdf.PdfReader pdfReader20 = null;
        byte[] byte_array25 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream26 = new com.lowagie.text.pdf.PRStream(pdfReader20, byte_array25);
        com.lowagie.text.pdf.PdfReader pdfReader27 = null;
        byte[] byte_array32 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream33 = new com.lowagie.text.pdf.PRStream(pdfReader27, byte_array32);
        pRStream26.setData(byte_array32, false, (int) (byte) 100);
        byte[] byte_array37 = pRStream26.getBytes();
        com.lowagie.text.pdf.PdfReader pdfReader38 = null;
        byte[] byte_array43 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream44 = new com.lowagie.text.pdf.PRStream(pdfReader38, byte_array43);
        com.lowagie.text.pdf.PdfReader pdfReader45 = null;
        byte[] byte_array50 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream51 = new com.lowagie.text.pdf.PRStream(pdfReader45, byte_array50);
        pRStream44.setData(byte_array50, false, (int) (byte) 100);
        byte[] byte_array55 = pRStream44.getBytes();
        pRStream26.setData(byte_array55);
        byte[] byte_array58 = com.lowagie.text.pdf.crypto.IVGenerator.getIV(0);
        com.lowagie.text.pdf.PRTokeniser pRTokeniser59 = new com.lowagie.text.pdf.PRTokeniser(byte_array58);
        com.lowagie.text.pdf.BaseFont baseFont62 = com.lowagie.text.pdf.BaseFont.createFont("xmp:Thumbnails", "widths", true, false, byte_array55, byte_array58, true, false);
        boolean b63 = pRTokeniser12.readLineSegment(byte_array58);
        byteBuffer9.write(byte_array58);
        byteBuffer9.flush();
        assertNotNull(byteBuffer5);
        assertNotNull(byteBuffer7);
        assertNotNull(byteBuffer9);
        assertNotNull(byte_array11);
        assertEquals(0, i13);
        assertEquals(0, i14);
        assertNotNull(byte_array25);
        assertNotNull(byte_array32);
        assertNotNull(byte_array37);
        assertNotNull(byte_array43);
        assertNotNull(byte_array50);
        assertNotNull(byte_array55);
        assertNotNull(byte_array58);
        assertNull(baseFont62);
        assertEquals(false, b63);
    }

    @Test
    void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test299");
        int i0 = com.lowagie.text.pdf.PdfWriter.PageModeUseNone;
        assertEquals(64, i0);
    }

    @Test
    void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test300");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        try {
            java.util.List list1 = com.lowagie.text.pdf.SimpleBookmark.getBookmark(pdfReader0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test301");
        com.lowagie.text.pdf.PdfEncryption pdfEncryption0 = new com.lowagie.text.pdf.PdfEncryption();
        com.lowagie.text.pdf.PdfDictionary pdfDictionary1 = pdfEncryption0.getEncryptionDictionary();
        com.lowagie.text.pdf.fonts.cmaps.CodespaceRange codespaceRange2 = new com.lowagie.text.pdf.fonts.cmaps.CodespaceRange();
        com.lowagie.text.pdf.ByteBuffer byteBuffer4 = new com.lowagie.text.pdf.ByteBuffer(1564);
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields6 = new com.lowagie.text.pdf.PdfCopyFields((java.io.OutputStream) byteBuffer4, 'Ã');
        com.lowagie.text.pdf.PdfReader pdfReader8 = null;
        byte[] byte_array13 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream14 = new com.lowagie.text.pdf.PRStream(pdfReader8, byte_array13);
        com.lowagie.text.pdf.PdfReader pdfReader15 = null;
        byte[] byte_array20 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream21 = new com.lowagie.text.pdf.PRStream(pdfReader15, byte_array20);
        pRStream14.setData(byte_array20, false, (int) (byte) 100);
        byte[] byte_array25 = pRStream14.getBytes();
        com.lowagie.text.pdf.PdfReader pdfReader26 = null;
        byte[] byte_array31 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream32 = new com.lowagie.text.pdf.PRStream(pdfReader26, byte_array31);
        com.lowagie.text.pdf.PdfReader pdfReader33 = null;
        byte[] byte_array38 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream39 = new com.lowagie.text.pdf.PRStream(pdfReader33, byte_array38);
        pRStream32.setData(byte_array38, false, (int) (byte) 100);
        byte[] byte_array43 = pRStream32.getBytes();
        pRStream14.setData(byte_array43);
        com.lowagie.text.pdf.PdfName pdfName45 = com.lowagie.text.pdf.PdfName.FIRSTCHAR;
        java.lang.String str46 = com.lowagie.text.error_messages.MessageLocalization.getComposedMessage("listitem", (java.lang.Object) byte_array43, (java.lang.Object) pdfName45);
        byteBuffer4.write(byte_array43);
        codespaceRange2.setEnd(byte_array43);
        byte[] byte_array51 = com.lowagie.text.pdf.PdfEncodings.convertToBytes("", "UTF-16BE");
        codespaceRange2.setStart(byte_array51);
        try {
            byte[] byte_array53 = pdfEncryption0.encryptByteArray(byte_array51);
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (com.lowagie.text.ExceptionConverter e) {
        }
        assertNotNull(pdfDictionary1);
        assertNotNull(byte_array13);
        assertNotNull(byte_array20);
        assertNotNull(byte_array25);
        assertNotNull(byte_array31);
        assertNotNull(byte_array38);
        assertNotNull(byte_array43);
        assertNotNull(pdfName45);
        assertEquals("No message found for listitem", str46, "'" + str46 + "' != '" + "No message found for listitem" + "'");
        assertNotNull(byte_array51);
    }

    @Test
    void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test302");
        java.awt.Color color0 = java.awt.Color.pink;
        int i1 = color0.getRed();
        assertNotNull(color0);
        assertEquals(255, i1);
    }

    @Test
    void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test303");
        com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS pPKMS0 = new com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS();
        com.lowagie.text.pdf.PdfReader pdfReader1 = null;
        byte[] byte_array6 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream7 = new com.lowagie.text.pdf.PRStream(pdfReader1, byte_array6);
        pPKMS0.setCert(byte_array6);
        com.lowagie.text.pdf.PdfName pdfName9 = com.lowagie.text.pdf.PdfName.XFA;
        com.lowagie.text.pdf.PdfObject pdfObject10 = pPKMS0.get(pdfName9);
        com.lowagie.text.pdf.PdfWriter pdfWriter11 = null;
        com.lowagie.text.Font font13 = null;
        com.lowagie.text.Footnote footnote14 = new com.lowagie.text.Footnote("", font13);
        com.lowagie.text.HeaderFooter headerFooter16 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote14, true);
        headerFooter16.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle19 = headerFooter16.rotate();
        float[][] f_array_array21 = new float[][]{};
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation22 = com.lowagie.text.pdf.PdfAnnotation.createInk(pdfWriter11, (com.lowagie.text.Rectangle) headerFooter16, "widths", f_array_array21);
        boolean b23 = pdfAnnotation22.isOutlineTree();
        int i24 = pdfAnnotation22.getPlaceInPage();
        com.lowagie.text.pdf.BaseField.moveFields((com.lowagie.text.pdf.PdfDictionary) pPKMS0, (com.lowagie.text.pdf.PdfDictionary) pdfAnnotation22);
        com.lowagie.text.pdf.PdfName pdfName26 = com.lowagie.text.pdf.PdfName.INFO;
        com.lowagie.text.pdf.PdfTemplate pdfTemplate27 = null;
        try {
            pdfAnnotation22.setAppearance(pdfName26, pdfTemplate27);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(byte_array6);
        assertNotNull(pdfName9);
        assertNull(pdfObject10);
        assertNotNull(rectangle19);
        assertNotNull(f_array_array21);
        assertNotNull(pdfAnnotation22);
        assertEquals(false, b23);
        assertEquals(i24, (-1));
        assertNotNull(pdfName26);
    }

    @Test
    void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test304");
        com.lowagie.text.SimpleCell simpleCell1 = new com.lowagie.text.SimpleCell(true);
        simpleCell1.setSpacing_top((float) 226);
        boolean b4 = simpleCell1.isUseAscender();
        simpleCell1.setHorizontalAlignment(1791);
        assertEquals(false, b4);
    }

    @Test
    void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test305");
        com.lowagie.text.pdf.codec.wmf.MetaFont metaFont0 = new com.lowagie.text.pdf.codec.wmf.MetaFont();
        float f1 = metaFont0.getAngle();
        com.lowagie.text.pdf.BaseFont baseFont2 = metaFont0.getFont();
        assertEquals(0.0f, f1);
        assertNotNull(baseFont2);
    }

    @Test
    void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test306");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Cell cell5 = com.lowagie.text.factories.ElementFactory.getCell(properties1);
        com.lowagie.text.pdf.PdfPCell[] pdfPCell_array6 = new com.lowagie.text.pdf.PdfPCell[]{};
        com.lowagie.text.pdf.PdfPRow pdfPRow7 = new com.lowagie.text.pdf.PdfPRow(pdfPCell_array6);
        java.util.Properties properties9 = com.lowagie.text.html.Markup.parseAttributes("image");
        java.util.Enumeration<java.lang.Object> enumeration_obj10 = properties9.elements();
        java.lang.Object obj11 = properties1.put((java.lang.Object) pdfPCell_array6, (java.lang.Object) enumeration_obj10);
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> set_entry_obj_obj12 = properties1.entrySet();
        com.lowagie.text.Font font13 = com.lowagie.text.FontFactory.getFont(properties1);
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(cell5);
        assertNotNull(pdfPCell_array6);
        assertNotNull(properties9);
        assertNotNull(enumeration_obj10);
        assertNull(obj11);
        assertNotNull(set_entry_obj_obj12);
        assertNotNull(font13);
    }

    @Test
    void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test307");
        com.lowagie.text.SimpleCell simpleCell1 = new com.lowagie.text.SimpleCell(true);
        simpleCell1.setSpacing_top((float) 226);
        simpleCell1.setWidth(12.0f);
        java.awt.Color color6 = simpleCell1.getBorderColorTop();
        assertNull(color6);
    }

    @Test
    void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test308");
        java.lang.String str1 = com.lowagie.text.pdf.Barcode128.removeFNC1("url");
        assertEquals("url", str1, "'" + str1 + "' != '" + "url" + "'");
    }

    @Test
    void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test309");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.OBJR;
        assertNotNull(pdfName0);
    }

    @Test
    void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test310");
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
        float f31 = pdfWriter4.getVerticalPosition(true);
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertEquals(806.0f, f31);
    }

    @Test
    void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test311");
        int i0 = com.lowagie.text.pdf.PdfWriter.PDFX32002;
        assertEquals(2, i0);
    }

    @Test
    void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test312");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Paragraph paragraph5 = com.lowagie.text.factories.ElementFactory.getParagraph(properties1);
        int i6 = properties1.size();
        com.lowagie.text.Table table7 = com.lowagie.text.factories.ElementFactory.getTable(properties1);
        table7.setNotAddedYet(false);
        boolean b10 = table7.isComplete();
        float[] f_array11 = table7.getProportionalWidths();
        com.lowagie.text.pdf.PdfArray pdfArray12 = new com.lowagie.text.pdf.PdfArray(f_array11);
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(paragraph5);
        assertEquals(0, i6);
        assertNotNull(table7);
        assertEquals(true, b10);
        assertNotNull(f_array11);
    }

    @Test
    void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test313");
        com.lowagie.text.pdf.codec.wmf.MetaState metaState0 = new com.lowagie.text.pdf.codec.wmf.MetaState();
        float f2 = metaState0.transformAngle(227.64f);
        boolean b3 = metaState0.getLineNeutral();
        assertEquals(227.64f, f2);
        assertEquals(false, b3);
    }

    @Test
    void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test314");
        java.lang.String str0 = com.lowagie.text.xml.xmp.XmpBasicSchema.METADATADATE;
        assertEquals("xmp:MetadataDate", str0, "'" + str0 + "' != '" + "xmp:MetadataDate" + "'");
    }

    @Test
    void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test315");
        java.lang.String str0 = com.lowagie.text.pdf.PdfSignatureAppearance.questionMark;
        assertEquals("% DSUnknown\nq\n1 G\n1 g\n0.1 0 0 0.1 9 0 cm\n0 J 0 j 4 M []0 d\n1 i \n0 g\n313 292 m\n313 404 325 453 432 529 c\n478 561 504 597 504 645 c\n504 736 440 760 391 760 c\n286 760 271 681 265 626 c\n265 625 l\n100 625 l\n100 828 253 898 381 898 c\n451 898 679 878 679 650 c\n679 555 628 499 538 435 c\n488 399 467 376 467 292 c\n313 292 l\nh\n308 214 170 -164 re\nf\n0.44 G\n1.2 w\n1 1 0.4 rg\n287 318 m\n287 430 299 479 406 555 c\n451 587 478 623 478 671 c\n478 762 414 786 365 786 c\n260 786 245 707 239 652 c\n239 651 l\n74 651 l\n74 854 227 924 355 924 c\n425 924 653 904 653 676 c\n653 581 602 525 512 461 c\n462 425 441 402 441 318 c\n287 318 l\nh\n282 240 170 -164 re\nB\nQ\n", str0, "'" + str0 + "' != '" + "% DSUnknown\nq\n1 G\n1 g\n0.1 0 0 0.1 9 0 cm\n0 J 0 j 4 M []0 d\n1 i \n0 g\n313 292 m\n313 404 325 453 432 529 c\n478 561 504 597 504 645 c\n504 736 440 760 391 760 c\n286 760 271 681 265 626 c\n265 625 l\n100 625 l\n100 828 253 898 381 898 c\n451 898 679 878 679 650 c\n679 555 628 499 538 435 c\n488 399 467 376 467 292 c\n313 292 l\nh\n308 214 170 -164 re\nf\n0.44 G\n1.2 w\n1 1 0.4 rg\n287 318 m\n287 430 299 479 406 555 c\n451 587 478 623 478 671 c\n478 762 414 786 365 786 c\n260 786 245 707 239 652 c\n239 651 l\n74 651 l\n74 854 227 924 355 924 c\n425 924 653 904 653 676 c\n653 581 602 525 512 461 c\n462 425 441 402 441 318 c\n287 318 l\nh\n282 240 170 -164 re\nB\nQ\n" + "'");
    }

    @Test
    void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test316");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ENCRYPTMETADATA;
        assertNotNull(pdfName0);
    }

    @Test
    void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test317");
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
        boolean b35 = pdfWriter4.newPage();
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertEquals(false, b35);
    }

    @Test
    void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test318");
        byte[] byte_array2 = null;
        com.lowagie.text.pdf.PdfReader pdfReader3 = null;
        byte[] byte_array8 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream9 = new com.lowagie.text.pdf.PRStream(pdfReader3, byte_array8);
        com.lowagie.text.pdf.PdfReader pdfReader10 = null;
        byte[] byte_array15 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream16 = new com.lowagie.text.pdf.PRStream(pdfReader10, byte_array15);
        pRStream9.setData(byte_array15, false, (int) (byte) 100);
        com.lowagie.text.ImgJBIG2 imgJBIG2_20 = new com.lowagie.text.ImgJBIG2(4, 1564, byte_array2, byte_array15);
        int i21 = imgJBIG2_20.getCompressionLevel();
        java.lang.String str22 = imgJBIG2_20.getAlt();
        imgJBIG2_20.setSmask(true);
        com.lowagie.text.pdf.PdfPCell pdfPCell25 = new com.lowagie.text.pdf.PdfPCell((com.lowagie.text.Image) imgJBIG2_20);
        boolean b26 = pdfPCell25.isNoWrap();
        com.lowagie.text.SimpleCell simpleCell28 = new com.lowagie.text.SimpleCell(true);
        simpleCell28.setSpacing_top((float) 226);
        simpleCell28.setVerticalAlignment((int) (short) 0);
        simpleCell28.setPadding_top((float) (-3));
        pdfPCell25.setCellEvent((com.lowagie.text.pdf.PdfPCellEvent) simpleCell28);
        assertNotNull(byte_array8);
        assertNotNull(byte_array15);
        assertEquals(i21, (-1));
        assertNull(str22);
        assertEquals(false, b26);
    }

    @Test
    void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test319");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        float f3 = pdfPCell2.getMaxHeight();
        float f4 = pdfPCell2.getMinimumHeight();
        java.awt.Color color5 = java.awt.Color.RED;
        pdfPCell2.setBackgroundColor(color5);
        java.awt.color.ColorSpace colorSpace7 = null;
        com.lowagie.text.Table table10 = new com.lowagie.text.Table(13, 1791);
        float[] f_array13 = table10.getWidths((float) 804, (float) 1065);
        com.lowagie.text.pdf.PdfPTable pdfPTable14 = new com.lowagie.text.pdf.PdfPTable(f_array13);
        try {
            float[] f_array15 = color5.getComponents(colorSpace7, f_array13);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfPCell2);
        assertEquals(4.0f, f3);
        assertEquals(0.0f, f4);
        assertNotNull(color5);
        assertNotNull(f_array13);
    }

    @Test
    void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test320");
        int i0 = com.lowagie.text.pdf.PdfWriter.PDFA1B;
        assertEquals(4, i0);
    }

    @Test
    void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test321");
        int i0 = com.lowagie.text.pdf.PdfContentByte.TEXT_RENDER_MODE_FILL_STROKE_CLIP;
        assertEquals(6, i0);
    }

    @Test
    void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test322");
        int i0 = com.lowagie.text.pdf.PdfStream.BEST_COMPRESSION;
        assertEquals(9, i0);
    }

    @Test
    void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test323");
        com.lowagie.text.pdf.BidiLine bidiLine0 = new com.lowagie.text.pdf.BidiLine();
        com.lowagie.text.pdf.PdfLine pdfLine6 = bidiLine0.processLine((-1.6777006E7f), (float) 16384, (int) (byte) 9, 32768, (int) ' ');
        boolean b7 = bidiLine0.isEmpty();
        bidiLine0.restore();
        boolean b9 = bidiLine0.isEmpty();
        assertNull(pdfLine6);
        assertEquals(true, b7);
        assertEquals(true, b9);
    }

    @Test
    void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test324");
        byte[] byte_array2 = null;
        com.lowagie.text.pdf.PdfReader pdfReader3 = null;
        byte[] byte_array8 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream9 = new com.lowagie.text.pdf.PRStream(pdfReader3, byte_array8);
        com.lowagie.text.pdf.PdfReader pdfReader10 = null;
        byte[] byte_array15 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream16 = new com.lowagie.text.pdf.PRStream(pdfReader10, byte_array15);
        pRStream9.setData(byte_array15, false, (int) (byte) 100);
        com.lowagie.text.ImgJBIG2 imgJBIG2_20 = new com.lowagie.text.ImgJBIG2(4, 1564, byte_array2, byte_array15);
        boolean b21 = imgJBIG2_20.isImgRaw();
        imgJBIG2_20.setRotationDegrees((float) 29);
        boolean b24 = imgJBIG2_20.isImgRaw();
        com.lowagie.text.pdf.PdfTemplate pdfTemplate25 = null;
        imgJBIG2_20.setTemplateData(pdfTemplate25);
        imgJBIG2_20.setInitialRotation(227.64f);
        assertNotNull(byte_array8);
        assertNotNull(byte_array15);
        assertEquals(false, b21);
        assertEquals(false, b24);
    }

    @Test
    void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test325");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte12 = type3Font5.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte12.fillStroke();
        pdfContentByte12.circle((float) 2052, (float) 226, 1700.2241f);
        pdfContentByte12.setLineWidth((float) 472);
        assertNotNull(char_array3);
        assertNotNull(pdfContentByte12);
    }

    @Test
    void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test326");
        int i0 = com.lowagie.text.pdf.PRTokeniser.TK_OTHER;
        assertEquals(10, i0);
    }

    @Test
    void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test327");
        int i0 = com.lowagie.text.pdf.BaseFont.FONT_TYPE_CJK;
        assertEquals(2, i0);
    }

    @Test
    void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test328");
        com.lowagie.text.Footnote footnote0 = new com.lowagie.text.Footnote();
        com.lowagie.text.pdf.PdfPCell pdfPCell1 = new com.lowagie.text.pdf.PdfPCell((com.lowagie.text.Phrase) footnote0);
        com.lowagie.text.Phrase phrase2 = new com.lowagie.text.Phrase((com.lowagie.text.Phrase) footnote0);
        footnote0.setLeading((-1.6777006E7f));
    }

    @Test
    void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test329");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Cell cell5 = com.lowagie.text.factories.ElementFactory.getCell(properties1);
        cell5.setUseVariableBorders(true);
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(cell5);
    }

    @Test
    void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test330");
        com.lowagie.text.GreekList greekList0 = new com.lowagie.text.GreekList();
        greekList0.setAutoindent(false);
    }

    @Test
    void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test331");
        com.lowagie.text.Table table2 = new com.lowagie.text.Table(13, 1791);
        com.lowagie.text.Font font4 = null;
        com.lowagie.text.Footnote footnote5 = new com.lowagie.text.Footnote("", font4);
        com.lowagie.text.HeaderFooter headerFooter7 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote5, true);
        headerFooter7.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle10 = headerFooter7.rotate();
        com.lowagie.text.Rectangle rectangle11 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter7);
        com.lowagie.text.Document document12 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter7);
        java.io.OutputStream outputStream13 = null;
        com.lowagie.text.pdf.PdfCopy pdfCopy14 = new com.lowagie.text.pdf.PdfCopy(document12, outputStream13);
        boolean b15 = table2.process((com.lowagie.text.ElementListener) pdfCopy14);
        com.lowagie.text.pdf.MultiColumnText multiColumnText16 = new com.lowagie.text.pdf.MultiColumnText();
        multiColumnText16.setArabicOptions(1564);
        com.lowagie.text.pdf.PdfWriter pdfWriter19 = null;
        com.lowagie.text.Font font21 = null;
        com.lowagie.text.Footnote footnote22 = new com.lowagie.text.Footnote("", font21);
        com.lowagie.text.HeaderFooter headerFooter24 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote22, true);
        headerFooter24.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle27 = headerFooter24.rotate();
        float[] f_array32 = new float[]{6, 9};
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation33 = com.lowagie.text.pdf.PdfAnnotation.createMarkup(pdfWriter19, rectangle27, "Stream", 3, f_array32);
        com.lowagie.text.pdf.PdfWriter pdfWriter34 = null;
        com.lowagie.text.Font font36 = null;
        com.lowagie.text.Footnote footnote37 = new com.lowagie.text.Footnote("", font36);
        com.lowagie.text.HeaderFooter headerFooter39 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote37, true);
        headerFooter39.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle42 = headerFooter39.rotate();
        float[] f_array47 = new float[]{6, 9};
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation48 = com.lowagie.text.pdf.PdfAnnotation.createMarkup(pdfWriter34, rectangle42, "Stream", 3, f_array47);
        multiColumnText16.addColumn(f_array32, f_array47);
        float[] f_array50 = null;
        try {
            com.lowagie.text.pdf.PdfFunction pdfFunction52 = com.lowagie.text.pdf.PdfFunction.type4((com.lowagie.text.pdf.PdfWriter) pdfCopy14, f_array32, f_array50, "http://purl.org/dc/elements/1.1/");
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(rectangle10);
        assertEquals(false, b15);
        assertNotNull(rectangle27);
        assertNotNull(f_array32);
        assertNotNull(pdfAnnotation33);
        assertNotNull(rectangle42);
        assertNotNull(f_array47);
        assertNotNull(pdfAnnotation48);
    }

    @Test
    void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test332");
        java.io.OutputStream outputStream0 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields2 = new com.lowagie.text.pdf.PdfCopyFields(outputStream0, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = pdfCopyFields2.getWriter();
        int i4 = pdfWriter3.getCurrentPageNumber();
        com.lowagie.text.Chapter chapter6 = new com.lowagie.text.Chapter((int) (short) -1);
        pdfWriter3.setOutlines((java.util.List) chapter6);
        com.lowagie.text.Chapter chapter9 = new com.lowagie.text.Chapter((int) (short) -1);
        com.lowagie.text.MarkedSection markedSection10 = chapter9.addMarkedSection();
        chapter9.setComplete(false);
        int i13 = chapter9.getNumberStyle();
        pdfWriter3.setOutlines((java.util.List) chapter9);
        com.lowagie.text.pdf.PdfWriter.PdfBody.PdfCrossReference pdfCrossReference18 = new com.lowagie.text.pdf.PdfWriter.PdfBody.PdfCrossReference(0, 32, 64);
        try {
            boolean b19 = chapter9.add((java.lang.Object) pdfCrossReference18);
            fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        assertNotNull(pdfWriter3);
        assertEquals(1, i4);
        assertNotNull(markedSection10);
        assertEquals(0, i13);
    }

    @Test
    void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test333");
        com.lowagie.text.pdf.BidiLine bidiLine0 = new com.lowagie.text.pdf.BidiLine();
        com.lowagie.text.pdf.PdfChunk pdfChunk1 = null;
        bidiLine0.addChunk(pdfChunk1);
        bidiLine0.doArabicShapping();
    }

    @Test
    void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test334");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        float f3 = pdfPTable1.getRowHeight(1785737760);
        boolean b5 = pdfPTable1.isExtendLastRow(true);
        com.lowagie.text.pdf.PdfPTable pdfPTable7 = new com.lowagie.text.pdf.PdfPTable(1);
        pdfPTable1.addCell(pdfPTable7);
        java.util.ArrayList arrayList11 = pdfPTable7.getRows(23, 50);
        pdfPTable7.setHorizontalAlignment(0);
        assertEquals(0.0f, f3);
        assertEquals(false, b5);
        assertNotNull(arrayList11);
    }

    @Test
    void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test335");
        com.lowagie.text.pdf.ByteBuffer byteBuffer1 = new com.lowagie.text.pdf.ByteBuffer(1564);
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields3 = new com.lowagie.text.pdf.PdfCopyFields((java.io.OutputStream) byteBuffer1, 'Ã');
        com.lowagie.text.pdf.ByteBuffer byteBuffer5 = byteBuffer1.append(24);
        com.lowagie.text.pdf.ByteBuffer byteBuffer7 = byteBuffer1.append((byte) 100);
        com.lowagie.text.pdf.codec.wmf.MetaDo.writeDWord((java.io.OutputStream) byteBuffer7, 4096);
        byteBuffer7.setSize((int) (short) 1);
        byteBuffer7.flush();
        assertNotNull(byteBuffer5);
        assertNotNull(byteBuffer7);
    }

    @Test
    void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test336");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        float f3 = pdfPCell2.getIndent();
        float f4 = pdfPCell2.getFollowingIndent();
        com.lowagie.text.pdf.PdfPTable pdfPTable6 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell7 = pdfPTable6.getDefaultCell();
        float f8 = pdfPCell7.getIndent();
        com.lowagie.text.pdf.PdfPTable pdfPTable9 = pdfPCell7.getTable();
        pdfPCell2.softCloneNonPositionParameters((com.lowagie.text.Rectangle) pdfPCell7);
        pdfPCell7.setPaddingBottom(33.360004f);
        float f13 = pdfPCell7.getFollowingIndent();
        assertNotNull(pdfPCell2);
        assertEquals(0.0f, f3);
        assertEquals(0.0f, f4);
        assertNotNull(pdfPCell7);
        assertEquals(0.0f, f8);
        assertNull(pdfPTable9);
        assertEquals(0.0f, f13);
    }

    @Test
    void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test337");
        com.lowagie.text.pdf.BarcodeInter25 barcodeInter25_0 = new com.lowagie.text.pdf.BarcodeInter25();
        com.lowagie.text.pdf.Barcode128 barcode128_1 = new com.lowagie.text.pdf.Barcode128();
        com.lowagie.text.pdf.BaseFont baseFont2 = barcode128_1.getFont();
        java.awt.Color color4 = java.awt.Color.GREEN;
        java.awt.Color color5 = java.awt.Color.getColor("UnicodeBig", color4);
        java.awt.Color color9 = java.awt.Color.getHSBColor(100.0f, (float) (short) 1, 100.0f);
        int i10 = com.lowagie.text.pdf.ExtendedColor.getType(color9);
        com.lowagie.text.pdf.PdfArray pdfArray11 = com.lowagie.text.pdf.PdfAnnotation.getMKColor(color9);
        java.awt.Image image12 = barcode128_1.createAwtImage(color4, color9);
        java.lang.String[] str_array23 = new java.lang.String[]{"dc:date", "Identity-V", "convert2pdfp", "widths", "class", "", "Right", "xmp:ModifyDate", "Right", "UnicodeBig"};
        java.util.ArrayList<java.lang.String> arraylist_str24 = new java.util.ArrayList<java.lang.String>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str24, str_array23);
        com.lowagie.text.pdf.PdfReader pdfReader26 = null;
        byte[] byte_array31 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream32 = new com.lowagie.text.pdf.PRStream(pdfReader26, byte_array31);
        com.lowagie.text.pdf.PdfReader pdfReader33 = null;
        byte[] byte_array38 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream39 = new com.lowagie.text.pdf.PRStream(pdfReader33, byte_array38);
        pRStream32.setData(byte_array38, false, (int) (byte) 100);
        java.lang.String str43 = pRStream32.toString();
        boolean b44 = arraylist_str24.contains((java.lang.Object) str43);
        com.lowagie.text.pdf.BaseFont baseFont45 = null;
        com.lowagie.text.Font font48 = new com.lowagie.text.Font(baseFont45, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont50 = font48.getCalculatedBaseFont(false);
        boolean b53 = baseFont50.setCharAdvance(9, 0);
        java.awt.Color color59 = java.awt.Color.getHSBColor(100.0f, (float) (short) 1, 100.0f);
        int i60 = com.lowagie.text.pdf.ExtendedColor.getType(color59);
        com.lowagie.text.Font font61 = new com.lowagie.text.Font(baseFont50, (float) (-1), (int) 'Ã', color59);
        int i62 = arraylist_str24.indexOf((java.lang.Object) color59);
        com.lowagie.text.pdf.PdfArray pdfArray63 = com.lowagie.text.pdf.PdfAnnotation.getMKColor(color59);
        java.awt.Color color64 = java.awt.Color.orange;
        com.lowagie.text.pdf.PdfShading.checkCompatibleColors(color59, color64);
        java.awt.Image image66 = barcodeInter25_0.createAwtImage(color4, color59);
        java.awt.color.ColorSpace colorSpace67 = color59.getColorSpace();
        assertNotNull(baseFont2);
        assertNotNull(color4);
        assertNotNull(color5);
        assertNotNull(color9);
        assertEquals(0, i10);
        assertNotNull(pdfArray11);
        assertNotNull(image12);
        assertNotNull(str_array23);
        assertEquals(true, b25);
        assertNotNull(byte_array31);
        assertNotNull(byte_array38);
        assertEquals("Stream", str43, "'" + str43 + "' != '" + "Stream" + "'");
        assertEquals(false, b44);
        assertNotNull(baseFont50);
        assertEquals(true, b53);
        assertNotNull(color59);
        assertEquals(0, i60);
        assertEquals(i62, (-1));
        assertNotNull(pdfArray63);
        assertNotNull(color64);
        assertNotNull(image66);
        assertNotNull(colorSpace67);
    }

    @Test
    void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test338");
        com.lowagie.text.pdf.PdfDashPattern pdfDashPattern1 = new com.lowagie.text.pdf.PdfDashPattern((float) 11);
    }

    @Test
    void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test339");
        com.lowagie.text.pdf.CMYKColor cMYKColor4 = new com.lowagie.text.pdf.CMYKColor(25610, (int) (byte) 60, 299, 24);
        com.lowagie.text.Chapter chapter6 = new com.lowagie.text.Chapter((int) (short) -1);
        boolean b7 = cMYKColor4.equals((java.lang.Object) chapter6);
        boolean b8 = chapter6.isContent();
        assertEquals(false, b7);
        assertEquals(true, b8);
    }

    @Test
    void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test340");
        byte[] byte_array2 = null;
        com.lowagie.text.pdf.PdfReader pdfReader3 = null;
        byte[] byte_array8 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream9 = new com.lowagie.text.pdf.PRStream(pdfReader3, byte_array8);
        com.lowagie.text.pdf.PdfReader pdfReader10 = null;
        byte[] byte_array15 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream16 = new com.lowagie.text.pdf.PRStream(pdfReader10, byte_array15);
        pRStream9.setData(byte_array15, false, (int) (byte) 100);
        com.lowagie.text.ImgJBIG2 imgJBIG2_20 = new com.lowagie.text.ImgJBIG2(4, 1564, byte_array2, byte_array15);
        int i21 = imgJBIG2_20.getAlignment();
        float f22 = imgJBIG2_20.getSpacingBefore();
        com.lowagie.text.pdf.PdfRectangle pdfRectangle23 = new com.lowagie.text.pdf.PdfRectangle((com.lowagie.text.Rectangle) imgJBIG2_20);
        imgJBIG2_20.setAlt("COLOR");
        float[] f_array26 = imgJBIG2_20.matrix();
        assertNotNull(byte_array8);
        assertNotNull(byte_array15);
        assertEquals(0, i21);
        assertEquals(0.0f, f22);
        assertNotNull(f_array26);
    }

    @Test
    void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test341");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        byte[] byte_array5 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream6 = new com.lowagie.text.pdf.PRStream(pdfReader0, byte_array5);
        com.lowagie.text.pdf.PdfReader pdfReader7 = null;
        byte[] byte_array12 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream13 = new com.lowagie.text.pdf.PRStream(pdfReader7, byte_array12);
        pRStream6.setData(byte_array12, false, (int) (byte) 100);
        byte[] byte_array17 = pRStream6.getBytes();
        boolean b18 = pRStream6.isPages();
        com.lowagie.text.pdf.PdfReader pdfReader19 = null;
        byte[] byte_array24 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream25 = new com.lowagie.text.pdf.PRStream(pdfReader19, byte_array24);
        com.lowagie.text.pdf.PdfReader pdfReader26 = null;
        byte[] byte_array31 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream32 = new com.lowagie.text.pdf.PRStream(pdfReader26, byte_array31);
        pRStream25.setData(byte_array31, false, (int) (byte) 100);
        byte[] byte_array36 = pRStream25.getBytes();
        pRStream6.setData(byte_array36);
        byte[] byte_array40 = new byte[]{(byte) 100, (byte) 10};
        com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray41 = new com.lowagie.text.pdf.RandomAccessFileOrArray(byte_array40);
        byte[] byte_array42 = com.lowagie.text.pdf.PdfReader.getStreamBytes(pRStream6, randomAccessFileOrArray41);
        com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray43 = new com.lowagie.text.pdf.RandomAccessFileOrArray(byte_array42);
        byte byte44 = randomAccessFileOrArray43.readByte();
        try {
            java.lang.String str45 = randomAccessFileOrArray43.readUTF();
            fail("Expected exception of type java.io.EOFException");
        } catch (java.io.EOFException e) {
        }
        assertNotNull(byte_array5);
        assertNotNull(byte_array12);
        assertNotNull(byte_array17);
        assertEquals(false, b18);
        assertNotNull(byte_array24);
        assertNotNull(byte_array31);
        assertNotNull(byte_array36);
        assertNotNull(byte_array40);
        assertNotNull(byte_array42);
        assertEquals(byte44, (byte) 1);
    }

    @Test
    void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test342");
        com.lowagie.text.Utilities utilities0 = new com.lowagie.text.Utilities();
    }

    @Test
    void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test343");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        float f3 = pdfPCell2.getPaddingRight();
        com.lowagie.text.Phrase phrase4 = pdfPCell2.getPhrase();
        pdfPCell2.setLeft((float) (short) 0);
        java.lang.String[] str_array17 = new java.lang.String[]{"dc:date", "Identity-V", "convert2pdfp", "widths", "class", "", "Right", "xmp:ModifyDate", "Right", "UnicodeBig"};
        java.util.ArrayList<java.lang.String> arraylist_str18 = new java.util.ArrayList<java.lang.String>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str18, str_array17);
        com.lowagie.text.pdf.PdfReader pdfReader20 = null;
        byte[] byte_array25 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream26 = new com.lowagie.text.pdf.PRStream(pdfReader20, byte_array25);
        com.lowagie.text.pdf.PdfReader pdfReader27 = null;
        byte[] byte_array32 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream33 = new com.lowagie.text.pdf.PRStream(pdfReader27, byte_array32);
        pRStream26.setData(byte_array32, false, (int) (byte) 100);
        java.lang.String str37 = pRStream26.toString();
        boolean b38 = arraylist_str18.contains((java.lang.Object) str37);
        com.lowagie.text.pdf.BaseFont baseFont39 = null;
        com.lowagie.text.Font font42 = new com.lowagie.text.Font(baseFont39, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont44 = font42.getCalculatedBaseFont(false);
        boolean b47 = baseFont44.setCharAdvance(9, 0);
        java.awt.Color color53 = java.awt.Color.getHSBColor(100.0f, (float) (short) 1, 100.0f);
        int i54 = com.lowagie.text.pdf.ExtendedColor.getType(color53);
        com.lowagie.text.Font font55 = new com.lowagie.text.Font(baseFont44, (float) (-1), (int) 'Ã', color53);
        int i56 = arraylist_str18.indexOf((java.lang.Object) color53);
        pdfPCell2.setBackgroundColor(color53);
        assertNotNull(pdfPCell2);
        assertEquals(2.0f, f3);
        assertNull(phrase4);
        assertNotNull(str_array17);
        assertEquals(true, b19);
        assertNotNull(byte_array25);
        assertNotNull(byte_array32);
        assertEquals("Stream", str37, "'" + str37 + "' != '" + "Stream" + "'");
        assertEquals(false, b38);
        assertNotNull(baseFont44);
        assertEquals(true, b47);
        assertNotNull(color53);
        assertEquals(0, i54);
        assertEquals(i56, (-1));
    }

    @Test
    void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test344");
        com.lowagie.text.pdf.events.FieldPositioningEvents fieldPositioningEvents0 = new com.lowagie.text.pdf.events.FieldPositioningEvents();
        fieldPositioningEvents0.padding = 14;
        float f3 = fieldPositioningEvents0.padding;
        java.io.OutputStream outputStream5 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields7 = new com.lowagie.text.pdf.PdfCopyFields(outputStream5, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter8 = pdfCopyFields7.getWriter();
        int i9 = pdfWriter8.getCurrentPageNumber();
        pdfWriter8.setLinearPageMode();
        int i11 = pdfWriter8.getPageNumber();
        pdfWriter8.setStrictImageSequence(true);
        pdfWriter8.clearTextWrap();
        com.lowagie.text.Table table17 = new com.lowagie.text.Table(13, 1791);
        boolean b18 = pdfWriter8.fitsPage(table17);
        pdfWriter8.setOpenAction("rel");
        com.lowagie.text.pdf.PdfAction pdfAction21 = com.lowagie.text.pdf.PdfAction.javaScript("HYPHENATION", pdfWriter8);
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper22 = new com.lowagie.text.pdf.PdfPageEventHelper();
        java.io.OutputStream outputStream23 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields25 = new com.lowagie.text.pdf.PdfCopyFields(outputStream23, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter26 = pdfCopyFields25.getWriter();
        com.lowagie.text.Font font28 = null;
        com.lowagie.text.Footnote footnote29 = new com.lowagie.text.Footnote("", font28);
        com.lowagie.text.HeaderFooter headerFooter31 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote29, true);
        headerFooter31.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle34 = headerFooter31.rotate();
        com.lowagie.text.Rectangle rectangle35 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter31);
        com.lowagie.text.Document document36 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter31);
        boolean b38 = document36.setMarginMirroringTopBottom(true);
        com.lowagie.text.Font font42 = null;
        com.lowagie.text.Footnote footnote43 = new com.lowagie.text.Footnote("", font42);
        com.lowagie.text.HeaderFooter headerFooter45 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote43, true);
        headerFooter45.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph48 = headerFooter45.paragraph();
        pdfPageEventHelper22.onSection(pdfWriter26, document36, (float) 7, 262144, paragraph48);
        fieldPositioningEvents0.onOpenDocument(pdfWriter8, document36);
        assertEquals(14.0f, f3);
        assertNotNull(pdfWriter8);
        assertEquals(1, i9);
        assertEquals(0, i11);
        assertEquals(true, b18);
        assertNotNull(pdfAction21);
        assertNotNull(pdfWriter26);
        assertNotNull(rectangle34);
        assertEquals(true, b38);
        assertNotNull(paragraph48);
    }

    @Test
    void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test345");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        java.util.Enumeration<?> enumeration_wildcard5 = properties1.propertyNames();
        com.lowagie.text.pdf.PdfName pdfName6 = com.lowagie.text.pdf.PdfName.BIBENTRY;
        boolean b7 = properties1.containsValue((java.lang.Object) pdfName6);
        com.lowagie.text.pdf.AcroFields.Item item8 = new com.lowagie.text.pdf.AcroFields.Item();
        com.lowagie.text.Font font10 = null;
        com.lowagie.text.Footnote footnote11 = new com.lowagie.text.Footnote("", font10);
        com.lowagie.text.HeaderFooter headerFooter13 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote11, true);
        com.lowagie.text.pdf.HyphenationAuto hyphenationAuto18 = new com.lowagie.text.pdf.HyphenationAuto("Default", "creationdate", (-1), 1785737760);
        footnote11.setHyphenation((com.lowagie.text.pdf.HyphenationEvent) hyphenationAuto18);
        item8.widgets = footnote11;
        com.lowagie.text.Font font27 = com.lowagie.text.FontFactory.getFont("top", "absolutex", (float) (-1), 6);
        com.lowagie.text.Chunk chunk28 = com.lowagie.text.SpecialSymbol.get(' ', font27);
        com.lowagie.text.ListItem listItem29 = new com.lowagie.text.ListItem("application", font27);
        item8.widget_refs = listItem29;
        boolean b31 = properties1.equals((java.lang.Object) listItem29);
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(enumeration_wildcard5);
        assertNotNull(pdfName6);
        assertEquals(false, b7);
        assertNotNull(font27);
        assertNotNull(chunk28);
        assertEquals(false, b31);
    }

    @Test
    void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test346");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.H3;
        assertNotNull(pdfName0);
    }

    @Test
    void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test347");
        com.lowagie.text.pdf.BaseFont baseFont0 = null;
        com.lowagie.text.Font font3 = new com.lowagie.text.Font(baseFont0, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont5 = font3.getCalculatedBaseFont(false);
        boolean b8 = baseFont5.setCharAdvance(9, 0);
        java.lang.String[] str_array9 = baseFont5.getCodePagesSupported();
        com.lowagie.text.Font font10 = new com.lowagie.text.Font(baseFont5);
        com.lowagie.text.pdf.BaseFont baseFont11 = font10.getBaseFont();
        assertNotNull(baseFont5);
        assertEquals(true, b8);
        assertNotNull(str_array9);
        assertNotNull(baseFont11);
    }

    @Test
    void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test348");
        com.lowagie.text.pdf.PdfContentByte pdfContentByte0 = null;
        com.lowagie.text.pdf.ColumnText columnText1 = new com.lowagie.text.pdf.ColumnText(pdfContentByte0);
        float f2 = columnText1.getFilledWidth();
        com.lowagie.text.pdf.PdfContentByte pdfContentByte3 = null;
        com.lowagie.text.pdf.ColumnText columnText4 = new com.lowagie.text.pdf.ColumnText(pdfContentByte3);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte5 = null;
        columnText4.setCanvas(pdfContentByte5);
        com.lowagie.text.pdf.PdfContentByte[] pdfContentByte_array7 = columnText4.getCanvases();
        columnText4.setSpaceCharRatio(0.0f);
        com.lowagie.text.pdf.ColumnText columnText10 = columnText1.setACopy(columnText4);
        columnText4.setIndent((float) '搊');
        assertEquals(0.0f, f2);
        assertNull(pdfContentByte_array7);
        assertNotNull(columnText10);
    }

    @Test
    void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test349");
        com.lowagie.text.pdf.parser.GraphicsState graphicsState0 = null;
        try {
            com.lowagie.text.pdf.parser.GraphicsState graphicsState1 = new com.lowagie.text.pdf.parser.GraphicsState(graphicsState0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test350");
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
        java.lang.String[] str_array44 = new java.lang.String[]{"bottom", "grayfill", "Helvetica-Oblique", "<?xpacket end=\"r\"?>", "sybp"};
        com.lowagie.text.pdf.PdfFormField pdfFormField46 = com.lowagie.text.pdf.PdfFormField.createCombo(pdfWriter4, false, str_array44, 1078);
        int i47 = pdfFormField46.size();
        boolean b48 = pdfFormField46.isCatalog();
        com.lowagie.text.pdf.PdfWriter pdfWriter49 = null;
        char[] char_array52 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font54 = new com.lowagie.text.pdf.Type3Font(pdfWriter49, char_array52, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte61 = type3Font54.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte61.fillStroke();
        com.lowagie.text.pdf.FontMapper fontMapper65 = null;
        java.awt.print.PrinterJob printerJob68 = null;
        java.awt.Graphics2D graphics2D69 = pdfContentByte61.createPrinterGraphics((-1.0f), (float) (-1), fontMapper65, true, (float) (byte) 1, printerJob68);
        com.lowagie.text.pdf.VerticalText verticalText70 = new com.lowagie.text.pdf.VerticalText(pdfContentByte61);
        pdfFormField46.setDefaultAppearanceString(pdfContentByte61);
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertNotNull(pdfName35);
        assertNotNull(pdfName36);
        assertNotNull(str_array44);
        assertNotNull(pdfFormField46);
        assertEquals(4, i47);
        assertEquals(false, b48);
        assertNotNull(char_array52);
        assertNotNull(pdfContentByte61);
        assertNotNull(graphics2D69);
    }

    @Test
    void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test351");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        byte[] byte_array5 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream6 = new com.lowagie.text.pdf.PRStream(pdfReader0, byte_array5);
        com.lowagie.text.pdf.PdfReader pdfReader7 = null;
        byte[] byte_array12 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream13 = new com.lowagie.text.pdf.PRStream(pdfReader7, byte_array12);
        pRStream6.setData(byte_array12, false, (int) (byte) 100);
        byte[] byte_array17 = pRStream6.getBytes();
        boolean b18 = pRStream6.isPages();
        com.lowagie.text.pdf.PdfReader pdfReader19 = null;
        byte[] byte_array24 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream25 = new com.lowagie.text.pdf.PRStream(pdfReader19, byte_array24);
        com.lowagie.text.pdf.PdfReader pdfReader26 = null;
        byte[] byte_array31 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream32 = new com.lowagie.text.pdf.PRStream(pdfReader26, byte_array31);
        pRStream25.setData(byte_array31, false, (int) (byte) 100);
        byte[] byte_array36 = pRStream25.getBytes();
        pRStream6.setData(byte_array36);
        byte[] byte_array40 = new byte[]{(byte) 100, (byte) 10};
        com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray41 = new com.lowagie.text.pdf.RandomAccessFileOrArray(byte_array40);
        byte[] byte_array42 = com.lowagie.text.pdf.PdfReader.getStreamBytes(pRStream6, randomAccessFileOrArray41);
        com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray43 = new com.lowagie.text.pdf.RandomAccessFileOrArray(byte_array42);
        char char44 = randomAccessFileOrArray43.readCharLE();
        int i45 = randomAccessFileOrArray43.readUnsignedShort();
        randomAccessFileOrArray43.pushBack((byte) 0);
        try {
            java.lang.String str48 = randomAccessFileOrArray43.readUTF();
            fail("Expected exception of type java.io.EOFException");
        } catch (java.io.EOFException e) {
        }
        assertNotNull(byte_array5);
        assertNotNull(byte_array12);
        assertNotNull(byte_array17);
        assertEquals(false, b18);
        assertNotNull(byte_array24);
        assertNotNull(byte_array31);
        assertNotNull(byte_array36);
        assertNotNull(byte_array40);
        assertNotNull(byte_array42);
        assertEquals('ਁ', char44);
        assertEquals(65535, i45);
    }

    @Test
    void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test352");
        java.util.HashMap hashMap0 = com.lowagie.text.xml.simpleparser.EntitiesToSymbol.map;
        com.lowagie.text.pdf.PdfWriter pdfWriter1 = null;
        com.lowagie.text.pdf.PdfDictionary pdfDictionary2 = com.lowagie.text.pdf.SimpleNamedDestination.outputNamedDestinationAsNames(hashMap0, pdfWriter1);
        com.lowagie.text.pdf.PdfPKCS7.X509Name.DefaultSymbols = hashMap0;
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper4 = new com.lowagie.text.pdf.PdfPageEventHelper();
        com.lowagie.text.pdf.PdfWriter pdfWriter5 = null;
        com.lowagie.text.Document document6 = null;
        pdfPageEventHelper4.onChapterEnd(pdfWriter5, document6, (float) 262144);
        java.io.OutputStream outputStream9 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields11 = new com.lowagie.text.pdf.PdfCopyFields(outputStream9, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter12 = pdfCopyFields11.getWriter();
        int i13 = pdfWriter12.getCurrentPageNumber();
        com.lowagie.text.Font font15 = null;
        com.lowagie.text.Footnote footnote16 = new com.lowagie.text.Footnote("", font15);
        com.lowagie.text.HeaderFooter headerFooter18 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote16, true);
        headerFooter18.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle21 = headerFooter18.rotate();
        com.lowagie.text.Rectangle rectangle22 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter18);
        com.lowagie.text.Document document23 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter18);
        boolean b25 = document23.setMarginMirroringTopBottom(true);
        pdfPageEventHelper4.onParagraphEnd(pdfWriter12, document23, 0.0f);
        pdfWriter12.resetFooter();
        com.lowagie.text.pdf.PdfPTable pdfPTable30 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell31 = pdfPTable30.getDefaultCell();
        float f32 = pdfPCell31.getIndent();
        com.lowagie.text.pdf.PdfPTable pdfPTable33 = pdfPCell31.getTable();
        com.lowagie.text.pdf.PdfPCellEvent pdfPCellEvent34 = pdfPCell31.getCellEvent();
        boolean b35 = pdfWriter12.setPageSize((com.lowagie.text.Rectangle) pdfPCell31);
        com.lowagie.text.pdf.PdfPageLabels pdfPageLabels36 = null;
        pdfWriter12.setPageLabels(pdfPageLabels36);
        com.lowagie.text.pdf.PdfDictionary pdfDictionary38 = com.lowagie.text.pdf.SimpleNamedDestination.outputNamedDestinationAsNames(hashMap0, pdfWriter12);
        com.lowagie.text.pdf.PdfAcroForm pdfAcroForm39 = new com.lowagie.text.pdf.PdfAcroForm(pdfWriter12);
        assertNotNull(hashMap0);
        assertNotNull(pdfDictionary2);
        assertNotNull(pdfWriter12);
        assertEquals(1, i13);
        assertNotNull(rectangle21);
        assertEquals(true, b25);
        assertNotNull(pdfPCell31);
        assertEquals(0.0f, f32);
        assertNull(pdfPTable33);
        assertNull(pdfPCellEvent34);
        assertEquals(true, b35);
        assertNotNull(pdfDictionary38);
    }

    @Test
    void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test353");
        com.lowagie.text.pdf.BidiLine bidiLine0 = new com.lowagie.text.pdf.BidiLine();
        float f3 = bidiLine0.getWidth((int) 'È', (-56509343));
        boolean b5 = bidiLine0.getParagraph(20);
        bidiLine0.flip(0, 53);
        assertEquals(0.0f, f3);
        assertEquals(false, b5);
    }

    @Test
    void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test354");
        byte byte0 = com.lowagie.text.pdf.ByteBuffer.ZERO;
        assertEquals(byte0, (byte) 48);
    }

    @Test
    void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test355");
        java.security.cert.Certificate[] certificate_array0 = new java.security.cert.Certificate[]{};
        java.security.KeyStore keyStore1 = com.lowagie.text.pdf.PdfPKCS7.loadCacertsKeyStore();
        com.lowagie.text.ListItem listItem4 = new com.lowagie.text.ListItem(52.0f, "Allowed: Modify contents");
        java.util.Calendar calendar5 = null;
        java.lang.Object[] obj_array6 = com.lowagie.text.pdf.PdfPKCS7.verifyCertificates(certificate_array0, keyStore1, (java.util.Collection) listItem4, calendar5);
        assertNotNull(certificate_array0);
        assertNotNull(keyStore1);
        assertNotNull(obj_array6);
    }

    @Test
    void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test356");
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
        pdfWriter4.setAtLeastPdfVersion('È');
        com.lowagie.text.pdf.PdfFormField pdfFormField41 = com.lowagie.text.pdf.PdfFormField.createRadioButton(pdfWriter4, true);
        com.lowagie.text.pdf.PdfPTable pdfPTable43 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell44 = pdfPTable43.getDefaultCell();
        float f45 = pdfPCell44.getIndent();
        float f46 = pdfPCell44.getRightIndent();
        pdfPCell44.setIndent((float) 302);
        com.lowagie.text.pdf.RadioCheckField radioCheckField51 = new com.lowagie.text.pdf.RadioCheckField(pdfWriter4, (com.lowagie.text.Rectangle) pdfPCell44, "pdf", "operation");
        int i52 = radioCheckField51.getCheckType();
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertNotNull(pdfName35);
        assertNotNull(pdfName36);
        assertNotNull(pdfFormField41);
        assertNotNull(pdfPCell44);
        assertEquals(0.0f, f45);
        assertEquals(0.0f, f46);
        assertEquals(1, i52);
    }

    @Test
    void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test357");
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper1 = new com.lowagie.text.pdf.PdfPageEventHelper();
        java.io.OutputStream outputStream2 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields4 = new com.lowagie.text.pdf.PdfCopyFields(outputStream2, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter5 = pdfCopyFields4.getWriter();
        com.lowagie.text.Font font7 = null;
        com.lowagie.text.Footnote footnote8 = new com.lowagie.text.Footnote("", font7);
        com.lowagie.text.HeaderFooter headerFooter10 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote8, true);
        headerFooter10.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle13 = headerFooter10.rotate();
        com.lowagie.text.Rectangle rectangle14 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter10);
        com.lowagie.text.Document document15 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter10);
        boolean b17 = document15.setMarginMirroringTopBottom(true);
        com.lowagie.text.Font font21 = null;
        com.lowagie.text.Footnote footnote22 = new com.lowagie.text.Footnote("", font21);
        com.lowagie.text.HeaderFooter headerFooter24 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote22, true);
        headerFooter24.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph27 = headerFooter24.paragraph();
        pdfPageEventHelper1.onSection(pdfWriter5, document15, (float) 7, 262144, paragraph27);
        pdfWriter5.setStrictImageSequence(false);
        pdfWriter5.setEncryption(false, "true", "bottom", 1336);
        com.lowagie.text.pdf.PdfName pdfName36 = com.lowagie.text.pdf.PdfName.NONE;
        com.lowagie.text.pdf.PdfName pdfName37 = com.lowagie.text.pdf.PdfName.XREF;
        pdfWriter5.setDefaultColorspace(pdfName36, (com.lowagie.text.pdf.PdfObject) pdfName37);
        pdfWriter5.setAtLeastPdfVersion('È');
        com.lowagie.text.pdf.PdfFormField pdfFormField42 = com.lowagie.text.pdf.PdfFormField.createRadioButton(pdfWriter5, true);
        com.lowagie.text.pdf.PdfLayer pdfLayer43 = com.lowagie.text.pdf.PdfLayer.createTitle("JustifyAll", pdfWriter5);
        com.lowagie.text.pdf.PdfObject pdfObject44 = pdfLayer43.getPdfObject();
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper46 = new com.lowagie.text.pdf.PdfPageEventHelper();
        java.io.OutputStream outputStream47 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields49 = new com.lowagie.text.pdf.PdfCopyFields(outputStream47, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter50 = pdfCopyFields49.getWriter();
        com.lowagie.text.Font font52 = null;
        com.lowagie.text.Footnote footnote53 = new com.lowagie.text.Footnote("", font52);
        com.lowagie.text.HeaderFooter headerFooter55 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote53, true);
        headerFooter55.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle58 = headerFooter55.rotate();
        com.lowagie.text.Rectangle rectangle59 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter55);
        com.lowagie.text.Document document60 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter55);
        boolean b62 = document60.setMarginMirroringTopBottom(true);
        com.lowagie.text.Font font66 = null;
        com.lowagie.text.Footnote footnote67 = new com.lowagie.text.Footnote("", font66);
        com.lowagie.text.HeaderFooter headerFooter69 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote67, true);
        headerFooter69.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph72 = headerFooter69.paragraph();
        pdfPageEventHelper46.onSection(pdfWriter50, document60, (float) 7, 262144, paragraph72);
        pdfWriter50.setStrictImageSequence(false);
        pdfWriter50.setEncryption(false, "true", "bottom", 1336);
        com.lowagie.text.pdf.PdfName pdfName81 = com.lowagie.text.pdf.PdfName.NONE;
        com.lowagie.text.pdf.PdfName pdfName82 = com.lowagie.text.pdf.PdfName.XREF;
        pdfWriter50.setDefaultColorspace(pdfName81, (com.lowagie.text.pdf.PdfObject) pdfName82);
        pdfWriter50.setAtLeastPdfVersion('È');
        com.lowagie.text.pdf.PdfFormField pdfFormField87 = com.lowagie.text.pdf.PdfFormField.createRadioButton(pdfWriter50, true);
        com.lowagie.text.pdf.PdfLayer pdfLayer88 = com.lowagie.text.pdf.PdfLayer.createTitle("JustifyAll", pdfWriter50);
        com.lowagie.text.pdf.PdfObject pdfObject89 = pdfLayer88.getPdfObject();
        pdfLayer43.addChild(pdfLayer88);
        pdfLayer43.setView(true);
        assertNotNull(pdfWriter5);
        assertNotNull(rectangle13);
        assertEquals(true, b17);
        assertNotNull(paragraph27);
        assertNotNull(pdfName36);
        assertNotNull(pdfName37);
        assertNotNull(pdfFormField42);
        assertNotNull(pdfLayer43);
        assertNotNull(pdfObject44);
        assertNotNull(pdfWriter50);
        assertNotNull(rectangle58);
        assertEquals(true, b62);
        assertNotNull(paragraph72);
        assertNotNull(pdfName81);
        assertNotNull(pdfName82);
        assertNotNull(pdfFormField87);
        assertNotNull(pdfLayer88);
        assertNotNull(pdfObject89);
    }

    @Test
    void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test358");
        byte[] byte_array1 = com.lowagie.text.pdf.crypto.IVGenerator.getIV(0);
        com.lowagie.text.pdf.PRTokeniser pRTokeniser2 = new com.lowagie.text.pdf.PRTokeniser(byte_array1);
        int i3 = pRTokeniser2.length();
        int i4 = pRTokeniser2.getFilePointer();
        pRTokeniser2.close();
        pRTokeniser2.backOnePosition((int) 'c');
        pRTokeniser2.seek(3);
        int i10 = pRTokeniser2.getReference();
        assertNotNull(byte_array1);
        assertEquals(0, i3);
        assertEquals(0, i4);
        assertEquals(0, i10);
    }

    @Test
    void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test359");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        byte[] byte_array5 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream6 = new com.lowagie.text.pdf.PRStream(pdfReader0, byte_array5);
        com.lowagie.text.pdf.PdfReader pdfReader7 = null;
        byte[] byte_array12 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream13 = new com.lowagie.text.pdf.PRStream(pdfReader7, byte_array12);
        pRStream6.setData(byte_array12, false, (int) (byte) 100);
        byte[] byte_array17 = pRStream6.getBytes();
        boolean b18 = pRStream6.isPages();
        com.lowagie.text.pdf.PdfReader pdfReader19 = null;
        byte[] byte_array24 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream25 = new com.lowagie.text.pdf.PRStream(pdfReader19, byte_array24);
        com.lowagie.text.pdf.PdfReader pdfReader26 = null;
        byte[] byte_array31 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream32 = new com.lowagie.text.pdf.PRStream(pdfReader26, byte_array31);
        pRStream25.setData(byte_array31, false, (int) (byte) 100);
        byte[] byte_array36 = pRStream25.getBytes();
        pRStream6.setData(byte_array36);
        byte[] byte_array40 = new byte[]{(byte) 100, (byte) 10};
        com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray41 = new com.lowagie.text.pdf.RandomAccessFileOrArray(byte_array40);
        byte[] byte_array42 = com.lowagie.text.pdf.PdfReader.getStreamBytes(pRStream6, randomAccessFileOrArray41);
        com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray43 = new com.lowagie.text.pdf.RandomAccessFileOrArray(byte_array42);
        randomAccessFileOrArray43.pushBack((byte) 100);
        randomAccessFileOrArray43.pushBack((byte) 61);
        randomAccessFileOrArray43.setStartOffset((int) (byte) 48);
        assertNotNull(byte_array5);
        assertNotNull(byte_array12);
        assertNotNull(byte_array17);
        assertEquals(false, b18);
        assertNotNull(byte_array24);
        assertNotNull(byte_array31);
        assertNotNull(byte_array36);
        assertNotNull(byte_array40);
        assertNotNull(byte_array42);
    }

    @Test
    void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test360");
        com.lowagie.text.Image image0 = null;
        com.lowagie.text.pdf.PdfIndirectReference pdfIndirectReference2 = null;
        try {
            com.lowagie.text.pdf.PdfImage pdfImage3 = new com.lowagie.text.pdf.PdfImage(image0, "numbered", pdfIndirectReference2);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test361");
        com.lowagie.text.pdf.ByteBuffer byteBuffer1 = new com.lowagie.text.pdf.ByteBuffer(1564);
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields3 = new com.lowagie.text.pdf.PdfCopyFields((java.io.OutputStream) byteBuffer1, 'Ã');
        com.lowagie.text.pdf.ByteBuffer byteBuffer5 = byteBuffer1.append(24);
        com.lowagie.text.pdf.ByteBuffer byteBuffer7 = byteBuffer1.append((byte) 100);
        com.lowagie.text.pdf.codec.wmf.MetaDo.writeDWord((java.io.OutputStream) byteBuffer7, 4096);
        try {
            byteBuffer7.setSize(16);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        assertNotNull(byteBuffer5);
        assertNotNull(byteBuffer7);
    }

    @Test
    void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test362");
        com.lowagie.text.Font font1 = null;
        com.lowagie.text.Footnote footnote2 = new com.lowagie.text.Footnote("", font1);
        com.lowagie.text.HeaderFooter headerFooter4 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote2, true);
        headerFooter4.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph7 = headerFooter4.paragraph();
        com.lowagie.text.ChapterAutoNumber chapterAutoNumber8 = new com.lowagie.text.ChapterAutoNumber(paragraph7);
        com.lowagie.text.Chapter chapter10 = new com.lowagie.text.Chapter(paragraph7, 262);
        com.lowagie.text.pdf.XfaForm.AcroFieldsSearch acroFieldsSearch11 = new com.lowagie.text.pdf.XfaForm.AcroFieldsSearch((java.util.Collection) chapter10);
        java.util.HashMap hashMap12 = null;
        acroFieldsSearch11.setAcroShort2LongName(hashMap12);
        assertNotNull(paragraph7);
    }

    @Test
    void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test363");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DS;
        assertNotNull(pdfName0);
    }

    @Test
    void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test364");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte12 = type3Font5.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte12.fillStroke();
        com.lowagie.text.pdf.FontMapper fontMapper16 = null;
        java.awt.print.PrinterJob printerJob19 = null;
        java.awt.Graphics2D graphics2D20 = pdfContentByte12.createPrinterGraphics((-1.0f), (float) (-1), fontMapper16, true, (float) (byte) 1, printerJob19);
        com.lowagie.text.pdf.FontMapper fontMapper23 = null;
        java.awt.Graphics2D graphics2D24 = pdfContentByte12.createGraphics(29.0f, (float) 526, fontMapper23);
        pdfContentByte12.eoFillStroke();
        assertNotNull(char_array3);
        assertNotNull(pdfContentByte12);
        assertNotNull(graphics2D20);
        assertNotNull(graphics2D24);
    }

    @Test
    void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test365");
        com.lowagie.text.Font font5 = com.lowagie.text.FontFactory.getFont("top", "absolutex", (float) (-1), 6);
        com.lowagie.text.Chunk chunk6 = com.lowagie.text.SpecialSymbol.get(' ', font5);
        com.lowagie.text.pdf.PdfWriter pdfWriter7 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField8 = com.lowagie.text.pdf.PdfFormField.createCheckBox(pdfWriter7);
        com.lowagie.text.pdf.PdfAction pdfAction10 = new com.lowagie.text.pdf.PdfAction("Cp1250");
        pdfFormField8.setAction(pdfAction10);
        com.lowagie.text.Chunk chunk12 = chunk6.setAction(pdfAction10);
        com.lowagie.text.pdf.DefaultSplitCharacter defaultSplitCharacter13 = new com.lowagie.text.pdf.DefaultSplitCharacter();
        com.lowagie.text.Chunk chunk14 = chunk12.setSplitCharacter((com.lowagie.text.SplitCharacter) defaultSplitCharacter13);
        com.lowagie.text.pdf.BaseFont baseFont15 = null;
        com.lowagie.text.Font font18 = new com.lowagie.text.Font(baseFont15, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont20 = font18.getCalculatedBaseFont(false);
        boolean b21 = font18.isBold();
        chunk12.setFont(font18);
        float f23 = chunk12.getWidthPoint();
        assertNotNull(font5);
        assertNotNull(chunk6);
        assertNotNull(pdfFormField8);
        assertNotNull(chunk12);
        assertNotNull(chunk14);
        assertNotNull(baseFont20);
        assertEquals(false, b21);
        assertEquals(0.27800003f, f23);
    }

    @Test
    void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test366");
        com.lowagie.text.pdf.collection.PdfCollectionField pdfCollectionField2 = new com.lowagie.text.pdf.collection.PdfCollectionField("ZapfDingbats", (int) '#');
        boolean b3 = pdfCollectionField2.isCollectionItem();
        pdfCollectionField2.setOrder((int) (short) 10);
        assertEquals(false, b3);
    }

    @Test
    void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test367");
        com.lowagie.text.pdf.draw.DrawInterface drawInterface0 = null;
        com.lowagie.text.Chunk chunk3 = new com.lowagie.text.Chunk(drawInterface0, (float) 10L, false);
        java.awt.Color color7 = java.awt.Color.getHSBColor(100.0f, (float) (short) 1, 100.0f);
        int i8 = com.lowagie.text.pdf.ExtendedColor.getType(color7);
        com.lowagie.text.Chunk chunk13 = chunk3.setBackground(color7, (float) 1565, 4.0f, (float) 55, (float) 1791);
        int i14 = color7.getGreen();
        assertNotNull(color7);
        assertEquals(0, i8);
        assertNotNull(chunk13);
        assertEquals(0, i14);
    }

    @Test
    void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test368");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        byte[] byte_array5 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream6 = new com.lowagie.text.pdf.PRStream(pdfReader0, byte_array5);
        com.lowagie.text.pdf.PdfReader pdfReader7 = null;
        byte[] byte_array12 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream13 = new com.lowagie.text.pdf.PRStream(pdfReader7, byte_array12);
        pRStream6.setData(byte_array12, false, (int) (byte) 100);
        byte[] byte_array17 = pRStream6.getBytes();
        try {
            com.lowagie.text.pdf.StandardDecryption standardDecryption21 = new com.lowagie.text.pdf.StandardDecryption(byte_array17, (int) (byte) 47, 505, 1651532643);
            fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        assertNotNull(byte_array5);
        assertNotNull(byte_array12);
        assertNotNull(byte_array17);
    }

    @Test
    void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test369");
        int i0 = com.lowagie.text.pdf.PdfTransition.TBGLITTER;
        assertEquals(15, i0);
    }

    @Test
    void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test370");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        float f3 = pdfPTable1.getRowHeight(1785737760);
        boolean b5 = pdfPTable1.isExtendLastRow(true);
        com.lowagie.text.pdf.PdfPTable pdfPTable7 = new com.lowagie.text.pdf.PdfPTable(1);
        pdfPTable1.addCell(pdfPTable7);
        com.lowagie.text.pdf.PdfPTable pdfPTable10 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell11 = pdfPTable10.getDefaultCell();
        float f12 = pdfPCell11.getIndent();
        float f13 = pdfPCell11.getFollowingIndent();
        com.lowagie.text.pdf.PdfPTable pdfPTable15 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell16 = pdfPTable15.getDefaultCell();
        float f17 = pdfPCell16.getIndent();
        com.lowagie.text.pdf.PdfPTable pdfPTable18 = pdfPCell16.getTable();
        pdfPCell11.softCloneNonPositionParameters((com.lowagie.text.Rectangle) pdfPCell16);
        com.lowagie.text.pdf.PdfPCell pdfPCell20 = new com.lowagie.text.pdf.PdfPCell(pdfPTable1, pdfPCell11);
        com.lowagie.text.pdf.PdfPTable pdfPTable22 = new com.lowagie.text.pdf.PdfPTable(1);
        float f24 = pdfPTable22.getRowHeight(1785737760);
        com.lowagie.text.pdf.PdfPCell pdfPCell25 = new com.lowagie.text.pdf.PdfPCell(pdfPTable22);
        pdfPTable1.addCell(pdfPTable22);
        pdfPTable1.setComplete(true);
        float f30 = pdfPTable1.calculateHeights(false);
        assertEquals(0.0f, f3);
        assertEquals(false, b5);
        assertNotNull(pdfPCell11);
        assertEquals(0.0f, f12);
        assertEquals(0.0f, f13);
        assertNotNull(pdfPCell16);
        assertEquals(0.0f, f17);
        assertNull(pdfPTable18);
        assertEquals(0.0f, f24);
        assertEquals(0.0f, f30);
    }

    @Test
    void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test371");
        com.lowagie.text.pdf.IntHashtable intHashtable0 = new com.lowagie.text.pdf.IntHashtable();
        boolean b2 = intHashtable0.containsValue(1785737760);
        int i4 = intHashtable0.get(1785737760);
        boolean b6 = intHashtable0.containsKey(2368);
        assertEquals(false, b2);
        assertEquals(0, i4);
        assertEquals(false, b6);
    }

    @Test
    void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test372");
        byte[] byte_array2 = null;
        com.lowagie.text.pdf.PdfReader pdfReader3 = null;
        byte[] byte_array8 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream9 = new com.lowagie.text.pdf.PRStream(pdfReader3, byte_array8);
        com.lowagie.text.pdf.PdfReader pdfReader10 = null;
        byte[] byte_array15 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream16 = new com.lowagie.text.pdf.PRStream(pdfReader10, byte_array15);
        pRStream9.setData(byte_array15, false, (int) (byte) 100);
        com.lowagie.text.ImgJBIG2 imgJBIG2_20 = new com.lowagie.text.ImgJBIG2(4, 1564, byte_array2, byte_array15);
        int i21 = imgJBIG2_20.getDpiY();
        int[] i_array22 = imgJBIG2_20.getTransparency();
        float f23 = imgJBIG2_20.getScaledWidth();
        imgJBIG2_20.setAlignment((int) (short) -1);
        imgJBIG2_20.setInterpolation(true);
        assertNotNull(byte_array8);
        assertNotNull(byte_array15);
        assertEquals(0, i21);
        assertNull(i_array22);
        assertEquals(4.0f, f23);
    }

    @Test
    void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test373");
        java.awt.Color color0 = java.awt.Color.CYAN;
        assertNotNull(color0);
    }

    @Test
    void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test374");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.WHITEPOINT;
        assertNotNull(pdfName0);
    }

    @Test
    void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test375");
        com.lowagie.text.pdf.PdfDestination pdfDestination1 = new com.lowagie.text.pdf.PdfDestination("anchor");
        boolean b2 = pdfDestination1.hasPage();
        assertEquals(false, b2);
    }

    @Test
    void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test376");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        float f3 = pdfPTable1.getRowHeight(1785737760);
        boolean b5 = pdfPTable1.isExtendLastRow(true);
        com.lowagie.text.pdf.PdfPTable pdfPTable7 = new com.lowagie.text.pdf.PdfPTable(1);
        pdfPTable1.addCell(pdfPTable7);
        com.lowagie.text.pdf.PdfPTable pdfPTable10 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell11 = pdfPTable10.getDefaultCell();
        float f12 = pdfPCell11.getIndent();
        float f13 = pdfPCell11.getFollowingIndent();
        com.lowagie.text.pdf.PdfPTable pdfPTable15 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell16 = pdfPTable15.getDefaultCell();
        float f17 = pdfPCell16.getIndent();
        com.lowagie.text.pdf.PdfPTable pdfPTable18 = pdfPCell16.getTable();
        pdfPCell11.softCloneNonPositionParameters((com.lowagie.text.Rectangle) pdfPCell16);
        com.lowagie.text.pdf.PdfPCell pdfPCell20 = new com.lowagie.text.pdf.PdfPCell(pdfPTable1, pdfPCell11);
        com.lowagie.text.pdf.PdfPTable pdfPTable22 = new com.lowagie.text.pdf.PdfPTable(1);
        float f24 = pdfPTable22.getRowHeight(1785737760);
        com.lowagie.text.pdf.PdfPCell pdfPCell25 = new com.lowagie.text.pdf.PdfPCell(pdfPTable22);
        pdfPTable1.addCell(pdfPTable22);
        boolean b27 = pdfPTable22.isSkipLastFooter();
        assertEquals(0.0f, f3);
        assertEquals(false, b5);
        assertNotNull(pdfPCell11);
        assertEquals(0.0f, f12);
        assertEquals(0.0f, f13);
        assertNotNull(pdfPCell16);
        assertEquals(0.0f, f17);
        assertNull(pdfPTable18);
        assertEquals(0.0f, f24);
        assertEquals(false, b27);
    }

    @Test
    void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test377");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Phrase phrase5 = com.lowagie.text.factories.ElementFactory.getPhrase(properties1);
        java.util.Set set6 = com.lowagie.text.Utilities.getKeySet((java.util.Hashtable) properties1);
        java.util.Enumeration<?> enumeration_wildcard7 = properties1.propertyNames();
        com.lowagie.text.List list8 = com.lowagie.text.factories.ElementFactory.getList(properties1);
        java.util.Collection<java.lang.Object> collection_obj9 = properties1.values();
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(phrase5);
        assertNotNull(set6);
        assertNotNull(enumeration_wildcard7);
        assertNotNull(list8);
        assertNotNull(collection_obj9);
    }

    @Test
    void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test378");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte12 = type3Font5.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte12.rectangle((float) (-3), (float) 'a', (float) (-1), (float) (byte) 0);
        com.lowagie.text.pdf.PdfWriter pdfWriter18 = pdfContentByte12.getPdfWriter();
        pdfContentByte12.ellipse((-1048577.0f), (float) 258, (float) 11, 69.411f);
        com.lowagie.text.pdf.BaseFont baseFont29 = null;
        com.lowagie.text.Font font32 = new com.lowagie.text.Font(baseFont29, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont34 = font32.getCalculatedBaseFont(false);
        boolean b37 = baseFont34.setCharAdvance(9, 0);
        java.lang.String[] str_array38 = baseFont34.getCodePagesSupported();
        com.lowagie.text.Font font39 = new com.lowagie.text.Font(baseFont34);
        try {
            pdfContentByte12.drawButton((float) (byte) 10, (float) 10, (float) 264, (float) '翿', "UniKS-UCS2-V", baseFont34, (float) 1000);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(char_array3);
        assertNotNull(pdfContentByte12);
        assertNull(pdfWriter18);
        assertNotNull(baseFont34);
        assertEquals(true, b37);
        assertNotNull(str_array38);
    }

    @Test
    void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test379");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaState.TA_UPDATECP;
        assertEquals(1, i0);
    }

    @Test
    void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test380");
        com.lowagie.text.pdf.PdfName[] pdfName_array0 = com.lowagie.text.pdf.internal.PdfViewerPreferencesImp.PAGE_BOUNDARIES;
        assertNotNull(pdfName_array0);
    }

    @Test
    void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test381");
        com.lowagie.text.Annotation annotation6 = new com.lowagie.text.Annotation("Times-Roman", "leading", (float) 262, (float) 8, (float) (short) 100, 10.0f);
        com.lowagie.text.Annotation annotation7 = new com.lowagie.text.Annotation(annotation6);
        boolean b8 = annotation6.isNestable();
        assertEquals(true, b8);
    }

    @Test
    void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test382");
        java.lang.String[] str_array10 = new java.lang.String[]{"text-align", "listitem", "listitem", "listitem", "listitem", "hi!", "HeiseiKakuGo-W5", "UnicodeBig", "hi!", "xmp:Nickname"};
        java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str11, str_array10);
        java.util.stream.Stream<java.lang.String> stream_str13 = arraylist_str11.parallelStream();
        arraylist_str11.add(0, "absolutex");
        java.util.ListIterator<java.lang.String> listiterator_str18 = arraylist_str11.listIterator(8);
        java.util.Iterator<java.lang.String> iterator_str19 = arraylist_str11.iterator();
        assertNotNull(str_array10);
        assertEquals(true, b12);
        assertNotNull(stream_str13);
        assertNotNull(listiterator_str18);
        assertNotNull(iterator_str19);
    }

    @Test
    void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test383");
        com.lowagie.text.SimpleCell simpleCell1 = new com.lowagie.text.SimpleCell(true);
        com.lowagie.text.SimpleCell simpleCell3 = new com.lowagie.text.SimpleCell(true);
        simpleCell3.setSpacing_top((float) 226);
        int i6 = simpleCell3.type();
        com.lowagie.text.Cell cell7 = simpleCell1.createCell(simpleCell3);
        simpleCell1.enableBorderSide((int) (short) 25610);
        simpleCell1.setVerticalAlignment(1078);
        assertEquals(20, i6);
        assertNotNull(cell7);
    }

    @Test
    void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test384");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        float f3 = pdfPTable1.getRowHeight(1785737760);
        boolean b5 = pdfPTable1.isExtendLastRow(true);
        com.lowagie.text.pdf.PdfPTable pdfPTable7 = new com.lowagie.text.pdf.PdfPTable(1);
        pdfPTable1.addCell(pdfPTable7);
        com.lowagie.text.pdf.PdfPTable pdfPTable10 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell11 = pdfPTable10.getDefaultCell();
        float f12 = pdfPCell11.getIndent();
        float f13 = pdfPCell11.getFollowingIndent();
        com.lowagie.text.pdf.PdfPTable pdfPTable15 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell16 = pdfPTable15.getDefaultCell();
        float f17 = pdfPCell16.getIndent();
        com.lowagie.text.pdf.PdfPTable pdfPTable18 = pdfPCell16.getTable();
        pdfPCell11.softCloneNonPositionParameters((com.lowagie.text.Rectangle) pdfPCell16);
        com.lowagie.text.pdf.PdfPCell pdfPCell20 = new com.lowagie.text.pdf.PdfPCell(pdfPTable1, pdfPCell11);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte21 = null;
        com.lowagie.text.pdf.ColumnText columnText22 = new com.lowagie.text.pdf.ColumnText(pdfContentByte21);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte23 = null;
        columnText22.setCanvas(pdfContentByte23);
        com.lowagie.text.pdf.PdfContentByte[] pdfContentByte_array25 = columnText22.getCanvases();
        pdfPCell20.setColumn(columnText22);
        columnText22.setExtraParagraphSpace((float) 64);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte29 = columnText22.getCanvas();
        int i30 = columnText22.getLinesWritten();
        com.lowagie.text.Font font32 = null;
        com.lowagie.text.Footnote footnote33 = new com.lowagie.text.Footnote("", font32);
        com.lowagie.text.HeaderFooter headerFooter35 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote33, true);
        com.lowagie.text.pdf.HyphenationAuto hyphenationAuto40 = new com.lowagie.text.pdf.HyphenationAuto("Default", "creationdate", (-1), 1785737760);
        footnote33.setHyphenation((com.lowagie.text.pdf.HyphenationEvent) hyphenationAuto40);
        footnote33.setLeading((float) 1651532643);
        columnText22.setSimpleColumn((com.lowagie.text.Phrase) footnote33, (float) 2147483647, 609.6f, 14.0f, (float) 16777216, 4.0f, 1785737760);
        assertEquals(0.0f, f3);
        assertEquals(false, b5);
        assertNotNull(pdfPCell11);
        assertEquals(0.0f, f12);
        assertEquals(0.0f, f13);
        assertNotNull(pdfPCell16);
        assertEquals(0.0f, f17);
        assertNull(pdfPTable18);
        assertNull(pdfContentByte_array25);
        assertNull(pdfContentByte29);
        assertEquals(0, i30);
    }

    @Test
    void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test385");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Cell cell5 = com.lowagie.text.factories.ElementFactory.getCell(properties1);
        boolean b6 = cell5.isUseBorderPadding();
        cell5.setUseAscender(false);
        cell5.setVerticalAlignment("xmp:CreatorTool");
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(cell5);
        assertEquals(false, b6);
    }

    @Test
    void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test386");
        com.lowagie.text.RectangleReadOnly rectangleReadOnly4 = new com.lowagie.text.RectangleReadOnly((float) 32768, (float) 259, (float) 258, (float) 'd');
        try {
            rectangleReadOnly4.setRight(0.0f);
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
    }

    @Test
    void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test387");
        java.io.OutputStream outputStream0 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields2 = new com.lowagie.text.pdf.PdfCopyFields(outputStream0, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = pdfCopyFields2.getWriter();
        int i4 = pdfWriter3.getCurrentPageNumber();
        pdfWriter3.setLinearPageMode();
        int i6 = pdfWriter3.getPageNumber();
        pdfWriter3.setStrictImageSequence(true);
        pdfWriter3.clearTextWrap();
        com.lowagie.text.pdf.PdfFormField pdfFormField10 = com.lowagie.text.pdf.PdfFormField.createCheckBox(pdfWriter3);
        pdfWriter3.setRgbTransparencyBlending(false);
        assertNotNull(pdfWriter3);
        assertEquals(1, i4);
        assertEquals(0, i6);
        assertNotNull(pdfFormField10);
    }

    @Test
    void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test388");
        int i0 = com.lowagie.text.pdf.parser.Matrix.I22;
        assertEquals(4, i0);
    }

    @Test
    void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test389");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte12 = type3Font5.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte12.rectangle((float) (-3), (float) 'a', (float) (-1), (float) (byte) 0);
        com.lowagie.text.pdf.PdfWriter pdfWriter18 = pdfContentByte12.getPdfWriter();
        pdfContentByte12.ellipse((-1048577.0f), (float) 258, (float) 11, 69.411f);
        pdfContentByte12.curveTo((float) '6', (float) 2338, (float) 24, (float) 496, (float) 0, 1.0f);
        assertNotNull(char_array3);
        assertNotNull(pdfContentByte12);
        assertNull(pdfWriter18);
    }

    @Test
    void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test390");
        com.lowagie.text.Chunk chunk0 = new com.lowagie.text.Chunk();
        com.lowagie.text.Image image1 = chunk0.getImage();
        float f2 = chunk0.getCharacterSpacing();
        com.lowagie.text.pdf.PdfAction pdfAction4 = new com.lowagie.text.pdf.PdfAction("Cp1250");
        com.lowagie.text.Chunk chunk5 = chunk0.setAction(pdfAction4);
        com.lowagie.text.pdf.PdfAction pdfAction8 = new com.lowagie.text.pdf.PdfAction("none", false);
        com.lowagie.text.Chunk chunk9 = chunk0.setAction(pdfAction8);
        boolean b10 = chunk0.isNestable();
        com.lowagie.text.Chunk chunk12 = chunk0.setCharacterSpacing((float) 2);
        assertNull(image1);
        assertEquals(0.0f, f2);
        assertNotNull(chunk5);
        assertNotNull(chunk9);
        assertEquals(true, b10);
        assertNotNull(chunk12);
    }

    @Test
    void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test391");
        com.lowagie.text.pdf.ByteBuffer byteBuffer1 = new com.lowagie.text.pdf.ByteBuffer(1564);
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields3 = new com.lowagie.text.pdf.PdfCopyFields((java.io.OutputStream) byteBuffer1, 'Ã');
        com.lowagie.text.pdf.ByteBuffer byteBuffer5 = byteBuffer1.append(24);
        com.lowagie.text.pdf.ByteBuffer byteBuffer7 = byteBuffer1.append((byte) 100);
        com.lowagie.text.pdf.ByteBuffer byteBuffer9 = byteBuffer1.appendHex((byte) 9);
        byte[] byte_array11 = com.lowagie.text.pdf.crypto.IVGenerator.getIV(0);
        com.lowagie.text.pdf.PRTokeniser pRTokeniser12 = new com.lowagie.text.pdf.PRTokeniser(byte_array11);
        int i13 = pRTokeniser12.length();
        int i14 = pRTokeniser12.getFilePointer();
        pRTokeniser12.close();
        com.lowagie.text.pdf.PdfReader pdfReader20 = null;
        byte[] byte_array25 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream26 = new com.lowagie.text.pdf.PRStream(pdfReader20, byte_array25);
        com.lowagie.text.pdf.PdfReader pdfReader27 = null;
        byte[] byte_array32 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream33 = new com.lowagie.text.pdf.PRStream(pdfReader27, byte_array32);
        pRStream26.setData(byte_array32, false, (int) (byte) 100);
        byte[] byte_array37 = pRStream26.getBytes();
        com.lowagie.text.pdf.PdfReader pdfReader38 = null;
        byte[] byte_array43 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream44 = new com.lowagie.text.pdf.PRStream(pdfReader38, byte_array43);
        com.lowagie.text.pdf.PdfReader pdfReader45 = null;
        byte[] byte_array50 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream51 = new com.lowagie.text.pdf.PRStream(pdfReader45, byte_array50);
        pRStream44.setData(byte_array50, false, (int) (byte) 100);
        byte[] byte_array55 = pRStream44.getBytes();
        pRStream26.setData(byte_array55);
        byte[] byte_array58 = com.lowagie.text.pdf.crypto.IVGenerator.getIV(0);
        com.lowagie.text.pdf.PRTokeniser pRTokeniser59 = new com.lowagie.text.pdf.PRTokeniser(byte_array58);
        com.lowagie.text.pdf.BaseFont baseFont62 = com.lowagie.text.pdf.BaseFont.createFont("xmp:Thumbnails", "widths", true, false, byte_array55, byte_array58, true, false);
        boolean b63 = pRTokeniser12.readLineSegment(byte_array58);
        byteBuffer9.write(byte_array58);
        byte[] byte_array67 = new byte[]{(byte) 100, (byte) 10};
        com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray68 = new com.lowagie.text.pdf.RandomAccessFileOrArray(byte_array67);
        byteBuffer9.write(byte_array67, (int) (byte) 32, 299);
        assertNotNull(byteBuffer5);
        assertNotNull(byteBuffer7);
        assertNotNull(byteBuffer9);
        assertNotNull(byte_array11);
        assertEquals(0, i13);
        assertEquals(0, i14);
        assertNotNull(byte_array25);
        assertNotNull(byte_array32);
        assertNotNull(byte_array37);
        assertNotNull(byte_array43);
        assertNotNull(byte_array50);
        assertNotNull(byte_array55);
        assertNotNull(byte_array58);
        assertNull(baseFont62);
        assertEquals(false, b63);
        assertNotNull(byte_array67);
    }

    @Test
    void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test392");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.STEMV;
        assertNotNull(pdfName0);
    }

    @Test
    void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test393");
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
        com.lowagie.text.pdf.PdfName pdfName30 = com.lowagie.text.pdf.PdfName.WARICHU;
        pdfWriter4.setTabs(pdfName30);
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertNotNull(pdfName30);
    }

    @Test
    void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test394");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte12 = type3Font5.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte12.rectangle((float) (-3), (float) 'a', (float) (-1), (float) (byte) 0);
        com.lowagie.text.pdf.PdfWriter pdfWriter18 = pdfContentByte12.getPdfWriter();
        pdfContentByte12.fill();
        com.lowagie.text.pdf.PdfName pdfName20 = com.lowagie.text.pdf.PdfName.SOUND;
        com.lowagie.text.pdf.PdfSigGenericPKCS.PPKLite pPKLite21 = new com.lowagie.text.pdf.PdfSigGenericPKCS.PPKLite();
        byte[] byte_array24 = null;
        com.lowagie.text.pdf.PdfReader pdfReader25 = null;
        byte[] byte_array30 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream31 = new com.lowagie.text.pdf.PRStream(pdfReader25, byte_array30);
        com.lowagie.text.pdf.PdfReader pdfReader32 = null;
        byte[] byte_array37 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream38 = new com.lowagie.text.pdf.PRStream(pdfReader32, byte_array37);
        pRStream31.setData(byte_array37, false, (int) (byte) 100);
        com.lowagie.text.ImgJBIG2 imgJBIG2_42 = new com.lowagie.text.ImgJBIG2(4, 1564, byte_array24, byte_array37);
        pPKLite21.setCert(byte_array24);
        pdfContentByte12.setDefaultColorspace(pdfName20, (com.lowagie.text.pdf.PdfObject) pPKLite21);
        com.lowagie.text.pdf.PdfPatternPainter pdfPatternPainter45 = null;
        com.lowagie.text.Font font47 = null;
        com.lowagie.text.Footnote footnote48 = new com.lowagie.text.Footnote("", font47);
        com.lowagie.text.HeaderFooter headerFooter50 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote48, true);
        headerFooter50.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle53 = headerFooter50.rotate();
        com.lowagie.text.pdf.PdfShadingPattern pdfShadingPattern54 = null;
        com.lowagie.text.pdf.ShadingColor shadingColor55 = new com.lowagie.text.pdf.ShadingColor(pdfShadingPattern54);
        headerFooter50.setBorderColorRight((java.awt.Color) shadingColor55);
        try {
            pdfContentByte12.setPatternStroke(pdfPatternPainter45, (java.awt.Color) shadingColor55);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(char_array3);
        assertNotNull(pdfContentByte12);
        assertNull(pdfWriter18);
        assertNotNull(pdfName20);
        assertNotNull(byte_array30);
        assertNotNull(byte_array37);
        assertNotNull(rectangle53);
    }

    @Test
    void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test395");
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
        pdfWriter4.setAtLeastPdfVersion('È');
        com.lowagie.text.pdf.PdfFormField pdfFormField41 = com.lowagie.text.pdf.PdfFormField.createRadioButton(pdfWriter4, true);
        float f42 = pdfWriter4.getSpaceCharRatio();
        pdfWriter4.resetPageCount();
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertNotNull(pdfName35);
        assertNotNull(pdfName36);
        assertNotNull(pdfFormField41);
        assertEquals(2.5f, f42);
    }

    @Test
    void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test396");
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
        pdfWriter4.setAtLeastPdfVersion('È');
        com.lowagie.text.pdf.PdfFormField pdfFormField41 = com.lowagie.text.pdf.PdfFormField.createRadioButton(pdfWriter4, true);
        com.lowagie.text.pdf.PdfPTable pdfPTable43 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell44 = pdfPTable43.getDefaultCell();
        float f45 = pdfPCell44.getIndent();
        float f46 = pdfPCell44.getRightIndent();
        pdfPCell44.setIndent((float) 302);
        com.lowagie.text.pdf.RadioCheckField radioCheckField51 = new com.lowagie.text.pdf.RadioCheckField(pdfWriter4, (com.lowagie.text.Rectangle) pdfPCell44, "pdf", "operation");
        radioCheckField51.setMaxCharacterLength(1768449138);
        int i54 = radioCheckField51.getCheckType();
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertNotNull(pdfName35);
        assertNotNull(pdfName36);
        assertNotNull(pdfFormField41);
        assertNotNull(pdfPCell44);
        assertEquals(0.0f, f45);
        assertEquals(0.0f, f46);
        assertEquals(1, i54);
    }

    @Test
    void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test397");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPTable pdfPTable3 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell4 = pdfPTable3.getDefaultCell();
        pdfPTable3.setSpacingBefore((float) 15);
        com.lowagie.text.pdf.PdfPCell pdfPCell7 = new com.lowagie.text.pdf.PdfPCell(pdfPTable3);
        pdfPTable1.addCell(pdfPTable3);
        assertNotNull(pdfPCell4);
    }

    @Test
    void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test398");
        com.lowagie.text.pdf.hyphenation.SimplePatternParser simplePatternParser0 = new com.lowagie.text.pdf.hyphenation.SimplePatternParser();
        simplePatternParser0.endDocument();
        simplePatternParser0.endElement("Times-Roman");
        simplePatternParser0.startDocument();
    }

    @Test
    void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test399");
        com.lowagie.text.Chapter chapter1 = new com.lowagie.text.Chapter((int) (short) -1);
        com.lowagie.text.MarkedSection markedSection2 = chapter1.addMarkedSection();
        com.lowagie.text.Font font8 = com.lowagie.text.FontFactory.getFont("page-break-after", "face", (float) 30);
        com.lowagie.text.ListItem listItem9 = new com.lowagie.text.ListItem("border-bottom-width", font8);
        float f10 = listItem9.getIndentationRight();
        com.lowagie.text.Section section11 = chapter1.addSection((float) 302, (com.lowagie.text.Paragraph) listItem9);
        listItem9.setExtraParagraphSpace((float) 2052);
        listItem9.setFirstLineIndent((float) 4096);
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper16 = new com.lowagie.text.pdf.PdfPageEventHelper();
        java.io.OutputStream outputStream17 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields19 = new com.lowagie.text.pdf.PdfCopyFields(outputStream17, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter20 = pdfCopyFields19.getWriter();
        com.lowagie.text.Font font22 = null;
        com.lowagie.text.Footnote footnote23 = new com.lowagie.text.Footnote("", font22);
        com.lowagie.text.HeaderFooter headerFooter25 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote23, true);
        headerFooter25.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle28 = headerFooter25.rotate();
        com.lowagie.text.Rectangle rectangle29 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter25);
        com.lowagie.text.Document document30 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter25);
        boolean b32 = document30.setMarginMirroringTopBottom(true);
        com.lowagie.text.Font font36 = null;
        com.lowagie.text.Footnote footnote37 = new com.lowagie.text.Footnote("", font36);
        com.lowagie.text.HeaderFooter headerFooter39 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote37, true);
        headerFooter39.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph42 = headerFooter39.paragraph();
        pdfPageEventHelper16.onSection(pdfWriter20, document30, (float) 7, 262144, paragraph42);
        pdfWriter20.setStrictImageSequence(false);
        pdfWriter20.setEncryption(false, "true", "bottom", 1336);
        com.lowagie.text.pdf.PdfName pdfName51 = com.lowagie.text.pdf.PdfName.NONE;
        com.lowagie.text.pdf.PdfName pdfName52 = com.lowagie.text.pdf.PdfName.XREF;
        pdfWriter20.setDefaultColorspace(pdfName51, (com.lowagie.text.pdf.PdfObject) pdfName52);
        java.lang.String[] str_array60 = new java.lang.String[]{"bottom", "grayfill", "Helvetica-Oblique", "<?xpacket end=\"r\"?>", "sybp"};
        com.lowagie.text.pdf.PdfFormField pdfFormField62 = com.lowagie.text.pdf.PdfFormField.createCombo(pdfWriter20, false, str_array60, 1078);
        int i63 = pdfFormField62.size();
        try {
            boolean b64 = listItem9.add((java.lang.Object) i63);
            fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        assertNotNull(markedSection2);
        assertNotNull(font8);
        assertEquals(0.0f, f10);
        assertNotNull(section11);
        assertNotNull(pdfWriter20);
        assertNotNull(rectangle28);
        assertEquals(true, b32);
        assertNotNull(paragraph42);
        assertNotNull(pdfName51);
        assertNotNull(pdfName52);
        assertNotNull(str_array60);
        assertNotNull(pdfFormField62);
        assertEquals(4, i63);
    }

    @Test
    void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test400");
        com.lowagie.text.Paragraph paragraph2 = new com.lowagie.text.Paragraph((float) '5', "true");
    }

    @Test
    void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test401");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PAGEMODE;
        assertNotNull(pdfName0);
    }

    @Test
    void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test402");
        int i0 = com.lowagie.text.pdf.BaseField.REQUIRED;
        assertEquals(2, i0);
    }

    @Test
    void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test403");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte12 = type3Font5.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte12.fillStroke();
        com.lowagie.text.pdf.FontMapper fontMapper16 = null;
        java.awt.print.PrinterJob printerJob19 = null;
        java.awt.Graphics2D graphics2D20 = pdfContentByte12.createPrinterGraphics((-1.0f), (float) (-1), fontMapper16, true, (float) (byte) 1, printerJob19);
        com.lowagie.text.pdf.FontMapper fontMapper23 = null;
        java.awt.Graphics2D graphics2D24 = pdfContentByte12.createGraphics(29.0f, (float) 526, fontMapper23);
        byte[] byte_array27 = null;
        com.lowagie.text.pdf.PdfReader pdfReader28 = null;
        byte[] byte_array33 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream34 = new com.lowagie.text.pdf.PRStream(pdfReader28, byte_array33);
        com.lowagie.text.pdf.PdfReader pdfReader35 = null;
        byte[] byte_array40 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream41 = new com.lowagie.text.pdf.PRStream(pdfReader35, byte_array40);
        pRStream34.setData(byte_array40, false, (int) (byte) 100);
        com.lowagie.text.ImgJBIG2 imgJBIG2_45 = new com.lowagie.text.ImgJBIG2(4, 1564, byte_array27, byte_array40);
        int i46 = imgJBIG2_45.getCompressionLevel();
        pdfContentByte12.rectangle((com.lowagie.text.Rectangle) imgJBIG2_45);
        com.lowagie.text.pdf.PdfWriter pdfWriter48 = pdfContentByte12.getPdfWriter();
        byte[] byte_array51 = null;
        com.lowagie.text.pdf.PdfReader pdfReader52 = null;
        byte[] byte_array57 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream58 = new com.lowagie.text.pdf.PRStream(pdfReader52, byte_array57);
        com.lowagie.text.pdf.PdfReader pdfReader59 = null;
        byte[] byte_array64 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream65 = new com.lowagie.text.pdf.PRStream(pdfReader59, byte_array64);
        pRStream58.setData(byte_array64, false, (int) (byte) 100);
        com.lowagie.text.ImgJBIG2 imgJBIG2_69 = new com.lowagie.text.ImgJBIG2(4, 1564, byte_array51, byte_array64);
        int i70 = imgJBIG2_69.getDpiY();
        int[] i_array71 = imgJBIG2_69.getTransparency();
        float f72 = imgJBIG2_69.getScaledWidth();
        imgJBIG2_69.makeMask();
        java.io.OutputStream outputStream75 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields77 = new com.lowagie.text.pdf.PdfCopyFields(outputStream75, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter78 = pdfCopyFields77.getWriter();
        int i79 = pdfWriter78.getCurrentPageNumber();
        pdfWriter78.setLinearPageMode();
        com.lowagie.text.pdf.PdfLayer pdfLayer81 = com.lowagie.text.pdf.PdfLayer.createTitle("title", pdfWriter78);
        imgJBIG2_69.setLayer((com.lowagie.text.pdf.PdfOCG) pdfLayer81);
        imgJBIG2_69.setIndentationLeft((float) 100);
        int i85 = imgJBIG2_69.type();
        byte[] byte_array87 = new byte[]{(byte) 32};
        byte[] byte_array88 = com.lowagie.text.pdf.PdfReader.LZWDecode(byte_array87);
        imgJBIG2_69.setOriginalData(byte_array88);
        try {
            pdfContentByte12.addImage((com.lowagie.text.Image) imgJBIG2_69, (float) 1040, (float) 10L, (float) 24, (float) (short) 1, (float) 24, (float) (-1), false);
            fail("Expected exception of type com.lowagie.text.DocumentException");
        } catch (com.lowagie.text.DocumentException e) {
        }
        assertNotNull(char_array3);
        assertNotNull(pdfContentByte12);
        assertNotNull(graphics2D20);
        assertNotNull(graphics2D24);
        assertNotNull(byte_array33);
        assertNotNull(byte_array40);
        assertEquals(i46, (-1));
        assertNull(pdfWriter48);
        assertNotNull(byte_array57);
        assertNotNull(byte_array64);
        assertEquals(0, i70);
        assertNull(i_array71);
        assertEquals(4.0f, f72);
        assertNotNull(pdfWriter78);
        assertEquals(1, i79);
        assertNotNull(pdfLayer81);
        assertEquals(36, i85);
        assertNotNull(byte_array87);
        assertNotNull(byte_array88);
    }

   

    @Test
    void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test405");
        com.lowagie.text.pdf.XfaForm xfaForm0 = new com.lowagie.text.pdf.XfaForm();
        com.lowagie.text.pdf.XfaForm.Xml2SomDatasets xml2SomDatasets1 = null;
        xfaForm0.setDatasetsSom(xml2SomDatasets1);
        com.lowagie.text.pdf.XfaForm.Xml2SomDatasets xml2SomDatasets3 = xfaForm0.getDatasetsSom();
        com.lowagie.text.pdf.XfaForm.Xml2SomDatasets xml2SomDatasets4 = null;
        xfaForm0.setDatasetsSom(xml2SomDatasets4);
        assertNull(xml2SomDatasets3);
    }

    @Test
    void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test406");
        boolean b1 = com.lowagie.text.FontFactory.contains("No message found for xmpMM:ManageUI");
        assertEquals(false, b1);
    }

    @Test
    void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test407");
        java.io.OutputStream outputStream0 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields2 = new com.lowagie.text.pdf.PdfCopyFields(outputStream0, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = pdfCopyFields2.getWriter();
        int i4 = pdfWriter3.getCurrentPageNumber();
        pdfWriter3.setLinearPageMode();
        com.lowagie.text.pdf.PdfPTable pdfPTable7 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell8 = pdfPTable7.getDefaultCell();
        float f9 = pdfPCell8.getIndent();
        float f10 = pdfPCell8.getExtraParagraphSpace();
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation11 = new com.lowagie.text.pdf.PdfAnnotation(pdfWriter3, (com.lowagie.text.Rectangle) pdfPCell8);
        com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS pPKMS12 = new com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS();
        com.lowagie.text.pdf.PdfReader pdfReader13 = null;
        byte[] byte_array18 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream19 = new com.lowagie.text.pdf.PRStream(pdfReader13, byte_array18);
        pPKMS12.setCert(byte_array18);
        com.lowagie.text.pdf.PdfName pdfName21 = com.lowagie.text.pdf.PdfName.XFA;
        com.lowagie.text.pdf.PdfObject pdfObject22 = pPKMS12.get(pdfName21);
        com.lowagie.text.pdf.internal.PdfViewerPreferencesImp pdfViewerPreferencesImp23 = com.lowagie.text.pdf.internal.PdfViewerPreferencesImp.getViewerPreferences((com.lowagie.text.pdf.PdfDictionary) pPKMS12);
        boolean b24 = pPKMS12.isOutlineTree();
        pdfAnnotation11.mergeDifferent((com.lowagie.text.pdf.PdfDictionary) pPKMS12);
        assertNotNull(pdfWriter3);
        assertEquals(1, i4);
        assertNotNull(pdfPCell8);
        assertEquals(0.0f, f9);
        assertEquals(0.0f, f10);
        assertNotNull(byte_array18);
        assertNotNull(pdfName21);
        assertNull(pdfObject22);
        assertNotNull(pdfViewerPreferencesImp23);
        assertEquals(false, b24);
    }

    @Test
    void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test408");
        byte[] byte_array2 = null;
        com.lowagie.text.pdf.PdfReader pdfReader3 = null;
        byte[] byte_array8 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream9 = new com.lowagie.text.pdf.PRStream(pdfReader3, byte_array8);
        com.lowagie.text.pdf.PdfReader pdfReader10 = null;
        byte[] byte_array15 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream16 = new com.lowagie.text.pdf.PRStream(pdfReader10, byte_array15);
        pRStream9.setData(byte_array15, false, (int) (byte) 100);
        com.lowagie.text.ImgJBIG2 imgJBIG2_20 = new com.lowagie.text.ImgJBIG2(4, 1564, byte_array2, byte_array15);
        int i21 = imgJBIG2_20.getAlignment();
        float f22 = imgJBIG2_20.getSpacingBefore();
        com.lowagie.text.pdf.PdfRectangle pdfRectangle23 = new com.lowagie.text.pdf.PdfRectangle((com.lowagie.text.Rectangle) imgJBIG2_20);
        com.lowagie.text.pdf.PdfWriter pdfWriter24 = null;
        float[] f_array31 = new float[]{100.0f, 8, 3, 7, 100.0f, 'a'};
        float[] f_array33 = new float[]{(byte) 10};
        float[] f_array39 = new float[]{64, 64, 100.0f, 4, 29};
        com.lowagie.text.pdf.PdfWriter pdfWriter40 = null;
        com.lowagie.text.Font font42 = null;
        com.lowagie.text.Footnote footnote43 = new com.lowagie.text.Footnote("", font42);
        com.lowagie.text.HeaderFooter headerFooter45 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote43, true);
        headerFooter45.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle48 = headerFooter45.rotate();
        float[] f_array53 = new float[]{6, 9};
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation54 = com.lowagie.text.pdf.PdfAnnotation.createMarkup(pdfWriter40, rectangle48, "Stream", 3, f_array53);
        com.lowagie.text.pdf.PdfFunction pdfFunction56 = com.lowagie.text.pdf.PdfFunction.type2(pdfWriter24, f_array31, f_array33, f_array39, f_array53, 561.0f);
        boolean b57 = pdfRectangle23.add(f_array31);
        float f59 = pdfRectangle23.bottom((int) ' ');
        assertNotNull(byte_array8);
        assertNotNull(byte_array15);
        assertEquals(0, i21);
        assertEquals(0.0f, f22);
        assertNotNull(f_array31);
        assertNotNull(f_array33);
        assertNotNull(f_array39);
        assertNotNull(rectangle48);
        assertNotNull(f_array53);
        assertNotNull(pdfAnnotation54);
        assertNotNull(pdfFunction56);
        assertEquals(false, b57);
        assertEquals(32.0f, f59);
    }

    @Test
    void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test409");
        com.lowagie.text.pdf.PdfPageLabels.PdfPageLabelFormat pdfPageLabelFormat4 = new com.lowagie.text.pdf.PdfPageLabels.PdfPageLabelFormat(6, (-3), "margin", 526);
        pdfPageLabelFormat4.logicalPage = 25610;
        int i7 = pdfPageLabelFormat4.logicalPage;
        assertEquals(25610, i7);
    }

    @Test
    void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test410");
        byte[] byte_array1 = com.lowagie.text.pdf.BarcodeInter25.getBarsInter25("(/Filter=/Adobe.PPKMS, /Type=/Sig, /SubFilter=/adbe.pkcs7.sha1)");
        byte[] byte_array3 = com.lowagie.text.pdf.PdfReader.FlateDecode(byte_array1, true);
        assertNotNull(byte_array1);
        assertNull(byte_array3);
    }

    @Test
    void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test411");
        java.io.OutputStream outputStream0 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields2 = new com.lowagie.text.pdf.PdfCopyFields(outputStream0, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = pdfCopyFields2.getWriter();
        int i4 = pdfWriter3.getCurrentPageNumber();
        pdfWriter3.setLinearPageMode();
        com.lowagie.text.pdf.PdfWriter pdfWriter6 = null;
        char[] char_array9 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font11 = new com.lowagie.text.pdf.Type3Font(pdfWriter6, char_array9, true);
        com.lowagie.text.pdf.Type3Font type3Font13 = new com.lowagie.text.pdf.Type3Font(pdfWriter3, char_array9, false);
        java.lang.String str14 = type3Font13.getPostscriptFontName();
        assertNotNull(pdfWriter3);
        assertEquals(1, i4);
        assertNotNull(char_array9);
        assertEquals("", str14, "'" + str14 + "' != '" + "" + "'");
    }

    @Test
    void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test412");
        java.awt.Color color3 = java.awt.Color.getHSBColor(100.0f, (float) (short) 1, 100.0f);
        int i4 = com.lowagie.text.pdf.ExtendedColor.getType(color3);
        com.lowagie.text.pdf.PdfArray pdfArray5 = com.lowagie.text.pdf.PdfAnnotation.getMKColor(color3);
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper6 = new com.lowagie.text.pdf.PdfPageEventHelper();
        java.io.OutputStream outputStream7 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields9 = new com.lowagie.text.pdf.PdfCopyFields(outputStream7, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter10 = pdfCopyFields9.getWriter();
        com.lowagie.text.Font font12 = null;
        com.lowagie.text.Footnote footnote13 = new com.lowagie.text.Footnote("", font12);
        com.lowagie.text.HeaderFooter headerFooter15 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote13, true);
        headerFooter15.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle18 = headerFooter15.rotate();
        com.lowagie.text.Rectangle rectangle19 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter15);
        com.lowagie.text.Document document20 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter15);
        boolean b22 = document20.setMarginMirroringTopBottom(true);
        com.lowagie.text.Font font26 = null;
        com.lowagie.text.Footnote footnote27 = new com.lowagie.text.Footnote("", font26);
        com.lowagie.text.HeaderFooter headerFooter29 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote27, true);
        headerFooter29.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph32 = headerFooter29.paragraph();
        pdfPageEventHelper6.onSection(pdfWriter10, document20, (float) 7, 262144, paragraph32);
        com.lowagie.text.Font font35 = null;
        com.lowagie.text.Footnote footnote36 = new com.lowagie.text.Footnote("", font35);
        com.lowagie.text.HeaderFooter headerFooter38 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote36, true);
        headerFooter38.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle41 = headerFooter38.rotate();
        com.lowagie.text.Rectangle rectangle42 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter38);
        com.lowagie.text.Document document43 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter38);
        com.lowagie.text.pdf.PdfName pdfName44 = com.lowagie.text.pdf.PdfName.TIME;
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation46 = com.lowagie.text.pdf.PdfAnnotation.createLink(pdfWriter10, (com.lowagie.text.Rectangle) headerFooter38, pdfName44, "<?xpacket end=\"r\"?>");
        com.lowagie.text.pdf.PdfName pdfName47 = com.lowagie.text.pdf.PdfName.RANGE;
        com.lowagie.text.pdf.PdfObject pdfObject48 = com.lowagie.text.pdf.PdfReader.getPdfObjectRelease((com.lowagie.text.pdf.PdfObject) pdfAnnotation46, (com.lowagie.text.pdf.PdfObject) pdfName47);
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation49 = com.lowagie.text.pdf.PdfFormField.shallowDuplicate(pdfAnnotation46);
        boolean b50 = pdfArray5.contains((com.lowagie.text.pdf.PdfObject) pdfAnnotation46);
        assertNotNull(color3);
        assertEquals(0, i4);
        assertNotNull(pdfArray5);
        assertNotNull(pdfWriter10);
        assertNotNull(rectangle18);
        assertEquals(true, b22);
        assertNotNull(paragraph32);
        assertNotNull(rectangle41);
        assertNotNull(pdfName44);
        assertNotNull(pdfAnnotation46);
        assertNotNull(pdfName47);
        assertNotNull(pdfObject48);
        assertNotNull(pdfAnnotation49);
        assertEquals(false, b50);
    }

    @Test
    void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test413");
        com.lowagie.text.ListItem listItem0 = new com.lowagie.text.ListItem();
        listItem0.setLeading((float) 804);
        com.lowagie.text.Chapter chapter4 = new com.lowagie.text.Chapter((com.lowagie.text.Paragraph) listItem0, 262);
        com.lowagie.text.Section section7 = chapter4.addSection("UniCNS-UCS2-V", 259);
        com.lowagie.text.Section section11 = section7.addSection((float) (byte) 48, "UniCNS-UCS2-H", 9);
        assertNotNull(section7);
        assertNotNull(section11);
    }

    @Test
    void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test414");
        com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS pPKMS0 = new com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS();
        com.lowagie.text.pdf.PdfReader pdfReader1 = null;
        byte[] byte_array6 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream7 = new com.lowagie.text.pdf.PRStream(pdfReader1, byte_array6);
        pPKMS0.setCert(byte_array6);
        com.lowagie.text.pdf.PdfName pdfName9 = com.lowagie.text.pdf.PdfName.XFA;
        com.lowagie.text.pdf.PdfObject pdfObject10 = pPKMS0.get(pdfName9);
        com.lowagie.text.pdf.PdfRectangle pdfRectangle14 = new com.lowagie.text.pdf.PdfRectangle((float) (short) -1, (float) '4', (int) (short) 1);
        float f16 = pdfRectangle14.top(224);
        com.lowagie.text.pdf.PdfObject pdfObject17 = com.lowagie.text.pdf.PdfReader.getPdfObject(pdfObject10, (com.lowagie.text.pdf.PdfObject) pdfRectangle14);
        com.lowagie.text.pdf.PdfName pdfName18 = com.lowagie.text.pdf.PdfName.H;
        boolean b19 = pdfRectangle14.add((com.lowagie.text.pdf.PdfObject) pdfName18);
        assertNotNull(byte_array6);
        assertNotNull(pdfName9);
        assertNull(pdfObject10);
        assertEquals(f16, (-172.0f));
        assertNull(pdfObject17);
        assertNotNull(pdfName18);
        assertEquals(false, b19);
    }

    @Test
    void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test415");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TRUETYPE;
        assertNotNull(pdfName0);
    }

    @Test
    void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test416");
        com.lowagie.text.pdf.events.FieldPositioningEvents fieldPositioningEvents0 = new com.lowagie.text.pdf.events.FieldPositioningEvents();
        java.io.OutputStream outputStream1 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields3 = new com.lowagie.text.pdf.PdfCopyFields(outputStream1, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter4 = pdfCopyFields3.getWriter();
        pdfWriter4.setFullCompression();
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper6 = new com.lowagie.text.pdf.PdfPageEventHelper();
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper7 = new com.lowagie.text.pdf.PdfPageEventHelper();
        java.io.OutputStream outputStream8 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields10 = new com.lowagie.text.pdf.PdfCopyFields(outputStream8, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter11 = pdfCopyFields10.getWriter();
        com.lowagie.text.Font font13 = null;
        com.lowagie.text.Footnote footnote14 = new com.lowagie.text.Footnote("", font13);
        com.lowagie.text.HeaderFooter headerFooter16 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote14, true);
        headerFooter16.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle19 = headerFooter16.rotate();
        com.lowagie.text.Rectangle rectangle20 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter16);
        com.lowagie.text.Document document21 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter16);
        boolean b23 = document21.setMarginMirroringTopBottom(true);
        com.lowagie.text.Font font27 = null;
        com.lowagie.text.Footnote footnote28 = new com.lowagie.text.Footnote("", font27);
        com.lowagie.text.HeaderFooter headerFooter30 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote28, true);
        headerFooter30.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph33 = headerFooter30.paragraph();
        pdfPageEventHelper7.onSection(pdfWriter11, document21, (float) 7, 262144, paragraph33);
        pdfWriter11.setStrictImageSequence(false);
        pdfWriter11.setEncryption(false, "true", "bottom", 1336);
        com.lowagie.text.Font font43 = null;
        com.lowagie.text.Footnote footnote44 = new com.lowagie.text.Footnote("", font43);
        com.lowagie.text.HeaderFooter headerFooter46 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote44, true);
        headerFooter46.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle49 = headerFooter46.rotate();
        com.lowagie.text.Rectangle rectangle50 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter46);
        com.lowagie.text.Document document51 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter46);
        boolean b53 = document51.setMarginMirroringTopBottom(true);
        float f55 = document51.bottom((float) 100L);
        boolean b57 = document51.setMarginMirroringTopBottom(false);
        byte[] byte_array60 = null;
        com.lowagie.text.pdf.PdfReader pdfReader61 = null;
        byte[] byte_array66 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream67 = new com.lowagie.text.pdf.PRStream(pdfReader61, byte_array66);
        com.lowagie.text.pdf.PdfReader pdfReader68 = null;
        byte[] byte_array73 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream74 = new com.lowagie.text.pdf.PRStream(pdfReader68, byte_array73);
        pRStream67.setData(byte_array73, false, (int) (byte) 100);
        com.lowagie.text.ImgJBIG2 imgJBIG2_78 = new com.lowagie.text.ImgJBIG2(4, 1564, byte_array60, byte_array73);
        int i79 = imgJBIG2_78.getDpiY();
        int[] i_array80 = imgJBIG2_78.getTransparency();
        pdfPageEventHelper6.onGenericTag(pdfWriter11, document51, (com.lowagie.text.Rectangle) imgJBIG2_78, "xxiv");
        fieldPositioningEvents0.onEndPage(pdfWriter4, document51);
        float f84 = fieldPositioningEvents0.padding;
        assertNotNull(pdfWriter4);
        assertNotNull(pdfWriter11);
        assertNotNull(rectangle19);
        assertEquals(true, b23);
        assertNotNull(paragraph33);
        assertNotNull(rectangle49);
        assertEquals(true, b53);
        assertEquals(136.0f, f55);
        assertEquals(true, b57);
        assertNotNull(byte_array66);
        assertNotNull(byte_array73);
        assertEquals(0, i79);
        assertNull(i_array80);
        assertEquals(0.0f, f84);
    }

    @Test
    void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test417");
        com.lowagie.text.pdf.BidiLine bidiLine0 = new com.lowagie.text.pdf.BidiLine();
        try {
            bidiLine0.flip(522, 2338);
            fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test418");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TEXT;
        assertNotNull(pdfName0);
    }

    @Test
    void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test419");
        com.lowagie.text.FontFactoryImp fontFactoryImp1 = new com.lowagie.text.FontFactoryImp();
        com.lowagie.text.Font font5 = null;
        com.lowagie.text.Footnote footnote6 = new com.lowagie.text.Footnote("", font5);
        com.lowagie.text.HeaderFooter headerFooter8 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote6, true);
        headerFooter8.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle11 = headerFooter8.rotate();
        com.lowagie.text.pdf.PdfShadingPattern pdfShadingPattern12 = null;
        com.lowagie.text.pdf.ShadingColor shadingColor13 = new com.lowagie.text.pdf.ShadingColor(pdfShadingPattern12);
        headerFooter8.setBorderColorRight((java.awt.Color) shadingColor13);
        com.lowagie.text.pdf.PdfShadingPattern pdfShadingPattern15 = shadingColor13.getPdfShadingPattern();
        com.lowagie.text.Font font16 = fontFactoryImp1.getFont("pdf:Producer", (float) 8196, (java.awt.Color) shadingColor13);
        com.lowagie.text.pdf.PdfSpotColor pdfSpotColor17 = new com.lowagie.text.pdf.PdfSpotColor("com.lowagie.text.pdf.hyphenation.HyphenationException: ZapfDingbats", (java.awt.Color) shadingColor13);
        assertNotNull(rectangle11);
        assertNull(pdfShadingPattern15);
        assertNotNull(font16);
    }

    @Test
    void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test420");
        java.net.URL uRL0 = null;
        byte[] byte_array1 = com.lowagie.text.Jpeg.JFIF_ID;
        try {
            com.lowagie.text.pdf.PdfReader pdfReader2 = new com.lowagie.text.pdf.PdfReader(uRL0, byte_array1);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(byte_array1);
    }

    @Test
    void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test421");
        com.lowagie.text.SimpleCell simpleCell1 = new com.lowagie.text.SimpleCell(false);
    }

    @Test
    void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test422");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_OFFSETWINDOWORG;
        assertEquals(527, i0);
    }

    @Test
    void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test423");
        com.lowagie.text.SimpleCell simpleCell1 = new com.lowagie.text.SimpleCell(true);
        simpleCell1.setSpacing_top((float) 226);
        int i4 = simpleCell1.type();
        boolean b5 = simpleCell1.isUseBorderPadding();
        simpleCell1.setColspan(1048576);
        assertEquals(20, i4);
        assertEquals(false, b5);
    }

    @Test
    void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test424");
        com.lowagie.text.pdf.PdfTransition pdfTransition2 = new com.lowagie.text.pdf.PdfTransition(7, (int) 'Ã');
        int i3 = pdfTransition2.getType();
        int i4 = pdfTransition2.getType();
        assertEquals(7, i3);
        assertEquals(7, i4);
    }

    @Test
    void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test425");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.SimpleCell simpleCell2 = new com.lowagie.text.SimpleCell(true);
        simpleCell2.setSpacing_top((float) 226);
        simpleCell2.setVerticalAlignment((int) (short) 0);
        simpleCell2.setPadding_top((float) (-3));
        float[] f_array12 = new float[]{2368, 8.0f};
        float[][] f_array_array13 = new float[][]{f_array12};
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation14 = com.lowagie.text.pdf.PdfAnnotation.createInk(pdfWriter0, (com.lowagie.text.Rectangle) simpleCell2, "itext", f_array_array13);
        assertNotNull(f_array12);
        assertNotNull(f_array_array13);
        assertNotNull(pdfAnnotation14);
    }

    @Test
    void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test426");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte12 = type3Font5.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte12.fillStroke();
        pdfContentByte12.setLineDash((float) 'c', 2.0f);
        com.lowagie.text.pdf.PdfDocument pdfDocument17 = pdfContentByte12.getPdfDocument();
        java.awt.Color color19 = java.awt.Color.lightGray;
        com.lowagie.text.pdf.PdfSpotColor pdfSpotColor20 = new com.lowagie.text.pdf.PdfSpotColor("url", color19);
        com.lowagie.text.pdf.PdfName pdfName21 = pdfSpotColor20.name;
        try {
            pdfContentByte12.setColorStroke(pdfSpotColor20, (float) 32);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(char_array3);
        assertNotNull(pdfContentByte12);
        assertNull(pdfDocument17);
        assertNotNull(color19);
        assertNotNull(pdfName21);
    }

    @Test
    void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test427");
        com.lowagie.text.pdf.parser.TextAssembler textAssembler0 = null;
        com.lowagie.text.pdf.parser.PdfContentStreamHandler pdfContentStreamHandler1 = new com.lowagie.text.pdf.parser.PdfContentStreamHandler(textAssembler0);
        com.lowagie.text.pdf.PdfLiteral pdfLiteral2 = com.lowagie.text.pdf.PdfFormXObject.MATRIX;
        com.lowagie.text.pdf.AcroFields.Item item3 = new com.lowagie.text.pdf.AcroFields.Item();
        com.lowagie.text.Font font5 = null;
        com.lowagie.text.Footnote footnote6 = new com.lowagie.text.Footnote("", font5);
        com.lowagie.text.HeaderFooter headerFooter8 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote6, true);
        com.lowagie.text.pdf.HyphenationAuto hyphenationAuto13 = new com.lowagie.text.pdf.HyphenationAuto("Default", "creationdate", (-1), 1785737760);
        footnote6.setHyphenation((com.lowagie.text.pdf.HyphenationEvent) hyphenationAuto13);
        item3.widgets = footnote6;
        com.lowagie.text.Phrase phrase17 = new com.lowagie.text.Phrase("border-bottom-width");
        item3.merged = phrase17;
        com.lowagie.text.Font font20 = null;
        com.lowagie.text.Footnote footnote21 = new com.lowagie.text.Footnote("", font20);
        item3.tabOrder = footnote21;
        java.util.ArrayList arrayList23 = item3.page;
        java.io.OutputStream outputStream24 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields26 = new com.lowagie.text.pdf.PdfCopyFields(outputStream24, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter27 = pdfCopyFields26.getWriter();
        int i28 = pdfWriter27.getCurrentPageNumber();
        pdfWriter27.setLinearPageMode();
        int i30 = pdfWriter27.getPageNumber();
        pdfWriter27.setStrictImageSequence(true);
        pdfWriter27.clearTextWrap();
        com.lowagie.text.pdf.PdfFormField pdfFormField34 = com.lowagie.text.pdf.PdfFormField.createCheckBox(pdfWriter27);
        java.io.OutputStream outputStream35 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields37 = new com.lowagie.text.pdf.PdfCopyFields(outputStream35, ' ');
        com.lowagie.text.pdf.PdfName pdfName38 = com.lowagie.text.pdf.PdfName.SHADING;
        com.lowagie.text.pdf.PdfWriter pdfWriter39 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField40 = com.lowagie.text.pdf.PdfFormField.createCheckBox(pdfWriter39);
        pdfFormField40.setQuadding((int) (byte) 100);
        int i44 = pdfFormField40.setFieldFlags((-56509343));
        pdfCopyFields37.addViewerPreference(pdfName38, (com.lowagie.text.pdf.PdfObject) pdfFormField40);
        pdfFormField40.setMKNormalCaption("page-break-before");
        com.lowagie.text.pdf.events.FieldPositioningEvents fieldPositioningEvents48 = new com.lowagie.text.pdf.events.FieldPositioningEvents(pdfFormField34, pdfFormField40);
        pdfContentStreamHandler1.invokeOperator(pdfLiteral2, (java.util.ArrayList<com.lowagie.text.pdf.PdfObject>) arrayList23, (com.lowagie.text.pdf.PdfDictionary) pdfFormField34);
        com.lowagie.text.pdf.CMapAwareDocumentFont cMapAwareDocumentFont50 = pdfContentStreamHandler1.getCurrentFont();
        assertNotNull(pdfLiteral2);
        assertNotNull(arrayList23);
        assertNotNull(pdfWriter27);
        assertEquals(1, i28);
        assertEquals(0, i30);
        assertNotNull(pdfFormField34);
        assertNotNull(pdfName38);
        assertNotNull(pdfFormField40);
        assertEquals(0, i44);
        assertNull(cMapAwareDocumentFont50);
    }

    @Test
    void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test428");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte12 = type3Font5.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte12.rectangle((float) (-3), (float) 'a', (float) (-1), (float) (byte) 0);
        com.lowagie.text.pdf.PdfWriter pdfWriter18 = pdfContentByte12.getPdfWriter();
        pdfContentByte12.fill();
        pdfContentByte12.fill();
        assertNotNull(char_array3);
        assertNotNull(pdfContentByte12);
        assertNull(pdfWriter18);
    }

    @Test
    void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test429");
        java.lang.String str0 = com.lowagie.text.ElementTags.EMBEDDED;
        assertEquals("embedded", str0, "'" + str0 + "' != '" + "embedded" + "'");
    }

    @Test
    void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test430");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.LANGUAGE;
        assertNotNull(pdfName0);
    }

    @Test
    void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test431");
        com.lowagie.text.Phrase phrase1 = new com.lowagie.text.Phrase((float) 'Ã');
        com.lowagie.text.Anchor anchor2 = new com.lowagie.text.Anchor(phrase1);
        com.lowagie.text.HeaderFooter headerFooter4 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) anchor2, true);
        java.lang.String str5 = anchor2.getName();
        assertNull(str5);
    }

    @Test
    void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test432");
        com.lowagie.text.pdf.ByteBuffer byteBuffer1 = new com.lowagie.text.pdf.ByteBuffer(1564);
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields3 = new com.lowagie.text.pdf.PdfCopyFields((java.io.OutputStream) byteBuffer1, 'Ã');
        com.lowagie.text.pdf.ByteBuffer byteBuffer5 = byteBuffer1.append(24);
        com.lowagie.text.pdf.ByteBuffer byteBuffer7 = new com.lowagie.text.pdf.ByteBuffer(1564);
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields9 = new com.lowagie.text.pdf.PdfCopyFields((java.io.OutputStream) byteBuffer7, 'Ã');
        com.lowagie.text.pdf.PdfReader pdfReader11 = null;
        byte[] byte_array16 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream17 = new com.lowagie.text.pdf.PRStream(pdfReader11, byte_array16);
        com.lowagie.text.pdf.PdfReader pdfReader18 = null;
        byte[] byte_array23 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream24 = new com.lowagie.text.pdf.PRStream(pdfReader18, byte_array23);
        pRStream17.setData(byte_array23, false, (int) (byte) 100);
        byte[] byte_array28 = pRStream17.getBytes();
        com.lowagie.text.pdf.PdfReader pdfReader29 = null;
        byte[] byte_array34 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream35 = new com.lowagie.text.pdf.PRStream(pdfReader29, byte_array34);
        com.lowagie.text.pdf.PdfReader pdfReader36 = null;
        byte[] byte_array41 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream42 = new com.lowagie.text.pdf.PRStream(pdfReader36, byte_array41);
        pRStream35.setData(byte_array41, false, (int) (byte) 100);
        byte[] byte_array46 = pRStream35.getBytes();
        pRStream17.setData(byte_array46);
        com.lowagie.text.pdf.PdfName pdfName48 = com.lowagie.text.pdf.PdfName.FIRSTCHAR;
        java.lang.String str49 = com.lowagie.text.error_messages.MessageLocalization.getComposedMessage("listitem", (java.lang.Object) byte_array46, (java.lang.Object) pdfName48);
        byteBuffer7.write(byte_array46);
        com.lowagie.text.pdf.PdfReader pdfReader52 = null;
        byte[] byte_array57 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream58 = new com.lowagie.text.pdf.PRStream(pdfReader52, byte_array57);
        com.lowagie.text.pdf.PdfReader pdfReader59 = null;
        byte[] byte_array64 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream65 = new com.lowagie.text.pdf.PRStream(pdfReader59, byte_array64);
        pRStream58.setData(byte_array64, false, (int) (byte) 100);
        byte[] byte_array69 = pRStream58.getBytes();
        com.lowagie.text.pdf.PdfReader pdfReader70 = null;
        byte[] byte_array75 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream76 = new com.lowagie.text.pdf.PRStream(pdfReader70, byte_array75);
        com.lowagie.text.pdf.PdfReader pdfReader77 = null;
        byte[] byte_array82 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream83 = new com.lowagie.text.pdf.PRStream(pdfReader77, byte_array82);
        pRStream76.setData(byte_array82, false, (int) (byte) 100);
        byte[] byte_array87 = pRStream76.getBytes();
        pRStream58.setData(byte_array87);
        com.lowagie.text.pdf.PdfName pdfName89 = com.lowagie.text.pdf.PdfName.FIRSTCHAR;
        java.lang.String str90 = com.lowagie.text.error_messages.MessageLocalization.getComposedMessage("listitem", (java.lang.Object) byte_array87, (java.lang.Object) pdfName89);
        com.lowagie.text.pdf.PdfDashPattern pdfDashPattern93 = new com.lowagie.text.pdf.PdfDashPattern((float) 0L, (float) 8);
        byte[] byte_array94 = com.lowagie.text.pdf.PdfReader.decodePredictor(byte_array87, (com.lowagie.text.pdf.PdfObject) pdfDashPattern93);
        byteBuffer7.write(byte_array94);
        byteBuffer5.write(byte_array94, (int) 'h', 1564);
        assertNotNull(byteBuffer5);
        assertNotNull(byte_array16);
        assertNotNull(byte_array23);
        assertNotNull(byte_array28);
        assertNotNull(byte_array34);
        assertNotNull(byte_array41);
        assertNotNull(byte_array46);
        assertNotNull(pdfName48);
        assertEquals("No message found for listitem", str49, "'" + str49 + "' != '" + "No message found for listitem" + "'");
        assertNotNull(byte_array57);
        assertNotNull(byte_array64);
        assertNotNull(byte_array69);
        assertNotNull(byte_array75);
        assertNotNull(byte_array82);
        assertNotNull(byte_array87);
        assertNotNull(pdfName89);
        assertEquals("No message found for listitem", str90, "'" + str90 + "' != '" + "No message found for listitem" + "'");
        assertNotNull(byte_array94);
    }

    @Test
    void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test433");
        com.lowagie.text.Font font6 = com.lowagie.text.FontFactory.getFont("top", "absolutex", (float) (-1), 6);
        com.lowagie.text.Chunk chunk7 = com.lowagie.text.SpecialSymbol.get(' ', font6);
        com.lowagie.text.ListItem listItem8 = new com.lowagie.text.ListItem("application", font6);
        int i9 = listItem8.type();
        assertNotNull(font6);
        assertNotNull(chunk7);
        assertEquals(15, i9);
    }

    @Test
    void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test434");
        com.lowagie.text.Table table2 = new com.lowagie.text.Table(13, 1791);
        com.lowagie.text.Font font4 = null;
        com.lowagie.text.Footnote footnote5 = new com.lowagie.text.Footnote("", font4);
        com.lowagie.text.HeaderFooter headerFooter7 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote5, true);
        headerFooter7.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle10 = headerFooter7.rotate();
        com.lowagie.text.Rectangle rectangle11 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter7);
        com.lowagie.text.Document document12 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter7);
        java.io.OutputStream outputStream13 = null;
        com.lowagie.text.pdf.PdfCopy pdfCopy14 = new com.lowagie.text.pdf.PdfCopy(document12, outputStream13);
        boolean b15 = table2.process((com.lowagie.text.ElementListener) pdfCopy14);
        com.lowagie.text.Rectangle rectangle16 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) table2);
        java.awt.Point point18 = null;
        try {
            table2.addCell("dc:date", point18);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(rectangle10);
        assertEquals(false, b15);
    }

    @Test
    void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test435");
        boolean b0 = com.lowagie.text.Document.plainRandomAccess;
        assertEquals(false, b0);
    }

    @Test
    void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test436");
        java.io.OutputStream outputStream0 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields2 = new com.lowagie.text.pdf.PdfCopyFields(outputStream0, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = pdfCopyFields2.getWriter();
        int i4 = pdfWriter3.getCurrentPageNumber();
        pdfWriter3.setLinearPageMode();
        com.lowagie.text.pdf.PdfWriter pdfWriter6 = null;
        char[] char_array9 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font11 = new com.lowagie.text.pdf.Type3Font(pdfWriter6, char_array9, true);
        com.lowagie.text.pdf.Type3Font type3Font13 = new com.lowagie.text.pdf.Type3Font(pdfWriter3, char_array9, false);
        boolean b16 = type3Font13.setCharAdvance(13, 525);
        assertNotNull(pdfWriter3);
        assertEquals(1, i4);
        assertNotNull(char_array9);
        assertEquals(false, b16);
    }

    @Test
    void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test437");
        int i0 = com.lowagie.text.pdf.PdfTransition.SPLITHOUT;
        assertEquals(2, i0);
    }

    @Test
    void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test438");
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
        java.lang.String[] str_array44 = new java.lang.String[]{"bottom", "grayfill", "Helvetica-Oblique", "<?xpacket end=\"r\"?>", "sybp"};
        com.lowagie.text.pdf.PdfFormField pdfFormField46 = com.lowagie.text.pdf.PdfFormField.createCombo(pdfWriter4, false, str_array44, 1078);
        com.lowagie.text.pdf.PdfTemplate pdfTemplate47 = null;
        try {
            pdfFormField46.setMKRolloverIcon(pdfTemplate47);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertNotNull(pdfName35);
        assertNotNull(pdfName36);
        assertNotNull(str_array44);
        assertNotNull(pdfFormField46);
    }

    @Test
    void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test439");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte12 = type3Font5.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte12.fillStroke();
        pdfContentByte12.setLineDash((float) 'c', 2.0f);
        try {
            com.lowagie.text.pdf.PdfAppearance pdfAppearance19 = pdfContentByte12.createAppearance((-1.07374182E9f), (float) (short) 2561);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(char_array3);
        assertNotNull(pdfContentByte12);
    }

    @Test
    void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test440");
        com.lowagie.text.pdf.AcroFields.Item item0 = new com.lowagie.text.pdf.AcroFields.Item();
        com.lowagie.text.Font font2 = null;
        com.lowagie.text.Footnote footnote3 = new com.lowagie.text.Footnote("", font2);
        com.lowagie.text.HeaderFooter headerFooter5 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote3, true);
        com.lowagie.text.pdf.HyphenationAuto hyphenationAuto10 = new com.lowagie.text.pdf.HyphenationAuto("Default", "creationdate", (-1), 1785737760);
        footnote3.setHyphenation((com.lowagie.text.pdf.HyphenationEvent) hyphenationAuto10);
        item0.widgets = footnote3;
        com.lowagie.text.Font font14 = null;
        com.lowagie.text.Footnote footnote15 = new com.lowagie.text.Footnote("", font14);
        com.lowagie.text.HeaderFooter headerFooter17 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote15, true);
        headerFooter17.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph20 = headerFooter17.paragraph();
        com.lowagie.text.ChapterAutoNumber chapterAutoNumber21 = new com.lowagie.text.ChapterAutoNumber(paragraph20);
        com.lowagie.text.Font font23 = null;
        com.lowagie.text.Footnote footnote24 = new com.lowagie.text.Footnote("", font23);
        com.lowagie.text.HeaderFooter headerFooter26 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote24, true);
        com.lowagie.text.pdf.HyphenationAuto hyphenationAuto31 = new com.lowagie.text.pdf.HyphenationAuto("Default", "creationdate", (-1), 1785737760);
        footnote24.setHyphenation((com.lowagie.text.pdf.HyphenationEvent) hyphenationAuto31);
        com.lowagie.text.Paragraph paragraph35 = com.lowagie.text.Section.constructTitle(paragraph20, (java.util.ArrayList) footnote24, (int) (byte) 100, 15);
        item0.page = paragraph35;
        java.util.ArrayList arrayList37 = item0.widgets;
        com.lowagie.text.Chunk chunk38 = new com.lowagie.text.Chunk();
        com.lowagie.text.Image image39 = chunk38.getImage();
        com.lowagie.text.Chunk chunk41 = chunk38.setAnchor("");
        boolean b42 = arrayList37.contains((java.lang.Object) "");
        assertNotNull(paragraph20);
        assertNotNull(paragraph35);
        assertNotNull(arrayList37);
        assertNull(image39);
        assertNotNull(chunk41);
        assertEquals(false, b42);
    }

    @Test
    void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test441");
        com.lowagie.text.ZapfDingbatsNumberList zapfDingbatsNumberList2 = new com.lowagie.text.ZapfDingbatsNumberList(12, (int) (byte) 34);
        int i3 = zapfDingbatsNumberList2.getFirst();
        com.lowagie.text.Chunk chunk4 = zapfDingbatsNumberList2.getSymbol();
        assertEquals(1, i3);
        assertNotNull(chunk4);
    }

    @Test
    void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test442");
        java.lang.String[] str_array10 = new java.lang.String[]{"text-align", "listitem", "listitem", "listitem", "listitem", "hi!", "HeiseiKakuGo-W5", "UnicodeBig", "hi!", "xmp:Nickname"};
        java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str11, str_array10);
        java.util.stream.Stream<java.lang.String> stream_str13 = arraylist_str11.parallelStream();
        arraylist_str11.add(0, "absolutex");
        java.util.ListIterator<java.lang.String> listiterator_str18 = arraylist_str11.listIterator(8);
        java.util.function.UnaryOperator<java.lang.String> unaryoperator_str19 = null;
        try {
            arraylist_str11.replaceAll(unaryoperator_str19);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(str_array10);
        assertEquals(true, b12);
        assertNotNull(stream_str13);
        assertNotNull(listiterator_str18);
    }

    @Test
    void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test443");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DESTOUTPUTPROFILE;
        assertNotNull(pdfName0);
    }

    @Test
    void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test444");
        byte[] byte_array2 = null;
        com.lowagie.text.pdf.PdfReader pdfReader3 = null;
        byte[] byte_array8 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream9 = new com.lowagie.text.pdf.PRStream(pdfReader3, byte_array8);
        com.lowagie.text.pdf.PdfReader pdfReader10 = null;
        byte[] byte_array15 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream16 = new com.lowagie.text.pdf.PRStream(pdfReader10, byte_array15);
        pRStream9.setData(byte_array15, false, (int) (byte) 100);
        com.lowagie.text.ImgJBIG2 imgJBIG2_20 = new com.lowagie.text.ImgJBIG2(4, 1564, byte_array2, byte_array15);
        float f21 = imgJBIG2_20.getIndentationRight();
        com.lowagie.text.Annotation annotation27 = new com.lowagie.text.Annotation(0.0f, (float) 9, 29.0f, (float) 'Ã', "href");
        imgJBIG2_20.setAnnotation(annotation27);
        imgJBIG2_20.setInverted(true);
        assertNotNull(byte_array8);
        assertNotNull(byte_array15);
        assertEquals(0.0f, f21);
    }

    @Test
    void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test445");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfLayerMembership.ALLOFF;
        assertNotNull(pdfName0);
    }

    @Test
    void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test446");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TWOPAGELEFT;
        assertNotNull(pdfName0);
    }

    @Test
    void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test447");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PARENT;
        assertNotNull(pdfName0);
    }

    @Test
    void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test448");
        byte[] byte_array2 = null;
        com.lowagie.text.pdf.PdfReader pdfReader3 = null;
        byte[] byte_array8 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream9 = new com.lowagie.text.pdf.PRStream(pdfReader3, byte_array8);
        com.lowagie.text.pdf.PdfReader pdfReader10 = null;
        byte[] byte_array15 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream16 = new com.lowagie.text.pdf.PRStream(pdfReader10, byte_array15);
        pRStream9.setData(byte_array15, false, (int) (byte) 100);
        com.lowagie.text.ImgJBIG2 imgJBIG2_20 = new com.lowagie.text.ImgJBIG2(4, 1564, byte_array2, byte_array15);
        int i21 = imgJBIG2_20.getDpiY();
        com.lowagie.text.pdf.PdfDictionary pdfDictionary22 = imgJBIG2_20.getAdditional();
        int i23 = imgJBIG2_20.getDpiX();
        com.lowagie.text.pdf.PdfReader pdfReader24 = null;
        byte[] byte_array29 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream30 = new com.lowagie.text.pdf.PRStream(pdfReader24, byte_array29);
        com.lowagie.text.pdf.PdfReader pdfReader31 = null;
        byte[] byte_array36 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream37 = new com.lowagie.text.pdf.PRStream(pdfReader31, byte_array36);
        pRStream30.setData(byte_array36, false, (int) (byte) 100);
        byte[] byte_array41 = pRStream30.getBytes();
        boolean b42 = pRStream30.isPages();
        boolean b43 = pRStream30.isPage();
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper45 = new com.lowagie.text.pdf.PdfPageEventHelper();
        java.io.OutputStream outputStream46 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields48 = new com.lowagie.text.pdf.PdfCopyFields(outputStream46, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter49 = pdfCopyFields48.getWriter();
        com.lowagie.text.Font font51 = null;
        com.lowagie.text.Footnote footnote52 = new com.lowagie.text.Footnote("", font51);
        com.lowagie.text.HeaderFooter headerFooter54 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote52, true);
        headerFooter54.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle57 = headerFooter54.rotate();
        com.lowagie.text.Rectangle rectangle58 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter54);
        com.lowagie.text.Document document59 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter54);
        boolean b61 = document59.setMarginMirroringTopBottom(true);
        com.lowagie.text.Font font65 = null;
        com.lowagie.text.Footnote footnote66 = new com.lowagie.text.Footnote("", font65);
        com.lowagie.text.HeaderFooter headerFooter68 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote66, true);
        headerFooter68.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph71 = headerFooter68.paragraph();
        pdfPageEventHelper45.onSection(pdfWriter49, document59, (float) 7, 262144, paragraph71);
        pdfWriter49.setStrictImageSequence(false);
        pdfWriter49.setEncryption(false, "true", "bottom", 1336);
        com.lowagie.text.pdf.PdfName pdfName80 = com.lowagie.text.pdf.PdfName.NONE;
        com.lowagie.text.pdf.PdfName pdfName81 = com.lowagie.text.pdf.PdfName.XREF;
        pdfWriter49.setDefaultColorspace(pdfName80, (com.lowagie.text.pdf.PdfObject) pdfName81);
        pdfWriter49.setAtLeastPdfVersion('È');
        com.lowagie.text.pdf.PdfFormField pdfFormField86 = com.lowagie.text.pdf.PdfFormField.createRadioButton(pdfWriter49, true);
        com.lowagie.text.pdf.PdfLayer pdfLayer87 = com.lowagie.text.pdf.PdfLayer.createTitle("JustifyAll", pdfWriter49);
        com.lowagie.text.pdf.PdfObject pdfObject88 = pdfLayer87.getPdfObject();
        pdfLayer87.setExport(false);
        pRStream30.mergeDifferent((com.lowagie.text.pdf.PdfDictionary) pdfLayer87);
        imgJBIG2_20.setLayer((com.lowagie.text.pdf.PdfOCG) pdfLayer87);
        assertNotNull(byte_array8);
        assertNotNull(byte_array15);
        assertEquals(0, i21);
        assertNull(pdfDictionary22);
        assertEquals(0, i23);
        assertNotNull(byte_array29);
        assertNotNull(byte_array36);
        assertNotNull(byte_array41);
        assertEquals(false, b42);
        assertEquals(false, b43);
        assertNotNull(pdfWriter49);
        assertNotNull(rectangle57);
        assertEquals(true, b61);
        assertNotNull(paragraph71);
        assertNotNull(pdfName80);
        assertNotNull(pdfName81);
        assertNotNull(pdfFormField86);
        assertNotNull(pdfLayer87);
        assertNotNull(pdfObject88);
    }

    @Test
    void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test449");
        java.util.List<float[]> list_f_array6 = com.lowagie.text.pdf.PdfContentByte.bezierArc((float) 40, (float) 24, (float) 1046, (float) 23, (float) 23, (float) 24);
        assertNotNull(list_f_array6);
    }

    @Test
    void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test450");
        com.lowagie.text.Chapter chapter1 = new com.lowagie.text.Chapter((int) (short) -1);
        com.lowagie.text.MarkedSection markedSection2 = chapter1.addMarkedSection();
        com.lowagie.text.Font font8 = com.lowagie.text.FontFactory.getFont("page-break-after", "face", (float) 30);
        com.lowagie.text.ListItem listItem9 = new com.lowagie.text.ListItem("border-bottom-width", font8);
        float f10 = listItem9.getIndentationRight();
        com.lowagie.text.Section section11 = chapter1.addSection((float) 302, (com.lowagie.text.Paragraph) listItem9);
        listItem9.setExtraParagraphSpace((float) 2052);
        listItem9.setAlignment((int) (byte) 0);
        assertNotNull(markedSection2);
        assertNotNull(font8);
        assertEquals(0.0f, f10);
        assertNotNull(section11);
    }

    @Test
    void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test451");
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
        float f30 = pdfWriter4.getUserunit();
        pdfWriter4.setFullCompression();
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertEquals(0.0f, f30);
    }

    @Test
    void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test452");
        com.lowagie.text.pdf.PdfEncryption pdfEncryption0 = new com.lowagie.text.pdf.PdfEncryption();
        com.lowagie.text.pdf.PdfReader pdfReader2 = null;
        byte[] byte_array7 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream8 = new com.lowagie.text.pdf.PRStream(pdfReader2, byte_array7);
        com.lowagie.text.pdf.PdfReader pdfReader9 = null;
        byte[] byte_array14 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream15 = new com.lowagie.text.pdf.PRStream(pdfReader9, byte_array14);
        pRStream8.setData(byte_array14, false, (int) (byte) 100);
        byte[] byte_array19 = pRStream8.getBytes();
        com.lowagie.text.pdf.PdfReader pdfReader20 = null;
        byte[] byte_array25 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream26 = new com.lowagie.text.pdf.PRStream(pdfReader20, byte_array25);
        com.lowagie.text.pdf.PdfReader pdfReader27 = null;
        byte[] byte_array32 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream33 = new com.lowagie.text.pdf.PRStream(pdfReader27, byte_array32);
        pRStream26.setData(byte_array32, false, (int) (byte) 100);
        byte[] byte_array37 = pRStream26.getBytes();
        pRStream8.setData(byte_array37);
        com.lowagie.text.pdf.PdfName pdfName39 = com.lowagie.text.pdf.PdfName.FIRSTCHAR;
        java.lang.String str40 = com.lowagie.text.error_messages.MessageLocalization.getComposedMessage("listitem", (java.lang.Object) byte_array37, (java.lang.Object) pdfName39);
        try {
            byte[] byte_array41 = pdfEncryption0.encryptByteArray(byte_array37);
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (com.lowagie.text.ExceptionConverter e) {
        }
        assertNotNull(byte_array7);
        assertNotNull(byte_array14);
        assertNotNull(byte_array19);
        assertNotNull(byte_array25);
        assertNotNull(byte_array32);
        assertNotNull(byte_array37);
        assertNotNull(pdfName39);
        assertEquals("No message found for listitem", str40, "'" + str40 + "' != '" + "No message found for listitem" + "'");
    }

    @Test
    void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test453");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        byte[] byte_array5 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream6 = new com.lowagie.text.pdf.PRStream(pdfReader0, byte_array5);
        com.lowagie.text.pdf.PdfReader pdfReader7 = null;
        byte[] byte_array12 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream13 = new com.lowagie.text.pdf.PRStream(pdfReader7, byte_array12);
        pRStream6.setData(byte_array12, false, (int) (byte) 100);
        byte[] byte_array17 = pRStream6.getBytes();
        boolean b18 = pRStream6.isPages();
        com.lowagie.text.pdf.PdfReader pdfReader19 = null;
        byte[] byte_array24 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream25 = new com.lowagie.text.pdf.PRStream(pdfReader19, byte_array24);
        com.lowagie.text.pdf.PdfReader pdfReader26 = null;
        byte[] byte_array31 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream32 = new com.lowagie.text.pdf.PRStream(pdfReader26, byte_array31);
        pRStream25.setData(byte_array31, false, (int) (byte) 100);
        byte[] byte_array36 = pRStream25.getBytes();
        pRStream6.setData(byte_array36);
        byte[] byte_array40 = new byte[]{(byte) 100, (byte) 10};
        com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray41 = new com.lowagie.text.pdf.RandomAccessFileOrArray(byte_array40);
        byte[] byte_array42 = com.lowagie.text.pdf.PdfReader.getStreamBytes(pRStream6, randomAccessFileOrArray41);
        com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray43 = new com.lowagie.text.pdf.RandomAccessFileOrArray(byte_array42);
        boolean b44 = randomAccessFileOrArray43.readBoolean();
        randomAccessFileOrArray43.seek(260);
        assertNotNull(byte_array5);
        assertNotNull(byte_array12);
        assertNotNull(byte_array17);
        assertEquals(false, b18);
        assertNotNull(byte_array24);
        assertNotNull(byte_array31);
        assertNotNull(byte_array36);
        assertNotNull(byte_array40);
        assertNotNull(byte_array42);
        assertEquals(true, b44);
    }

    @Test
    void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test454");
        com.lowagie.text.ZapfDingbatsNumberList zapfDingbatsNumberList2 = new com.lowagie.text.ZapfDingbatsNumberList(12, (int) (byte) 34);
        int i3 = zapfDingbatsNumberList2.getFirst();
        zapfDingbatsNumberList2.setLettered(true);
        assertEquals(1, i3);
    }

    @Test
    void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test455");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.OBJ;
        assertNotNull(pdfName0);
    }

    @Test
    void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test456");
        com.lowagie.text.pdf.PdfTextArray pdfTextArray0 = new com.lowagie.text.pdf.PdfTextArray();
        pdfTextArray0.add("");
    }

    @Test
    void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test457");
        java.io.OutputStream outputStream0 = null;
        byte[] byte_array3 = new byte[]{(byte) 100, (byte) 10};
        com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray4 = new com.lowagie.text.pdf.RandomAccessFileOrArray(byte_array3);
        com.lowagie.text.pdf.OutputStreamEncryption outputStreamEncryption6 = new com.lowagie.text.pdf.OutputStreamEncryption(outputStream0, byte_array3, (int) (byte) -1);
        try {
            com.lowagie.text.Image image7 = com.lowagie.text.ImageLoader.getPngImage(byte_array3);
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (com.lowagie.text.ExceptionConverter e) {
        }
        assertNotNull(byte_array3);
    }

    @Test
    void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test458");
        com.lowagie.text.Font font1 = null;
        com.lowagie.text.Footnote footnote2 = new com.lowagie.text.Footnote("", font1);
        com.lowagie.text.HeaderFooter headerFooter4 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote2, true);
        headerFooter4.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph7 = headerFooter4.paragraph();
        headerFooter4.disableBorderSide((int) 'a');
        boolean b10 = headerFooter4.isNumbered();
        assertNotNull(paragraph7);
        assertEquals(true, b10);
    }

    @Test
    void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test459");
        com.lowagie.text.pdf.Barcode128 barcode128_0 = new com.lowagie.text.pdf.Barcode128();
        com.lowagie.text.pdf.BaseFont baseFont1 = barcode128_0.getFont();
        java.lang.String str2 = barcode128_0.getAltText();
        barcode128_0.setN((float) 100);
        assertNotNull(baseFont1);
        assertNull(str2);
    }

    @Test
    void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test460");
        com.lowagie.text.pdf.Barcode128 barcode128_0 = new com.lowagie.text.pdf.Barcode128();
        com.lowagie.text.pdf.Barcode39 barcode39_1 = new com.lowagie.text.pdf.Barcode39();
        barcode39_1.setCodeType(0);
        com.lowagie.text.pdf.BarcodeEANSUPP barcodeEANSUPP4 = new com.lowagie.text.pdf.BarcodeEANSUPP((com.lowagie.text.pdf.Barcode) barcode128_0, (com.lowagie.text.pdf.Barcode) barcode39_1);
        barcodeEANSUPP4.setGuardBars(true);
        barcodeEANSUPP4.setSize(100.0f);
        boolean b9 = barcodeEANSUPP4.isGuardBars();
        barcodeEANSUPP4.setSize((float) 10);
        com.lowagie.text.pdf.BaseFont baseFont12 = barcodeEANSUPP4.getFont();
        assertEquals(true, b9);
        assertNull(baseFont12);
    }

    @Test
    void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test461");
        java.lang.String str0 = com.lowagie.text.ElementTags.ROWSPAN;
        assertEquals("rowspan", str0, "'" + str0 + "' != '" + "rowspan" + "'");
    }

    @Test
    void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test462");
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
        java.io.OutputStream outputStream28 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields30 = new com.lowagie.text.pdf.PdfCopyFields(outputStream28, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter31 = pdfCopyFields30.getWriter();
        int i32 = pdfWriter31.getCurrentPageNumber();
        com.lowagie.text.Font font34 = null;
        com.lowagie.text.Footnote footnote35 = new com.lowagie.text.Footnote("", font34);
        com.lowagie.text.HeaderFooter headerFooter37 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote35, true);
        headerFooter37.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle40 = headerFooter37.rotate();
        com.lowagie.text.Rectangle rectangle41 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter37);
        com.lowagie.text.Document document42 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter37);
        boolean b44 = document42.setMarginMirroringTopBottom(true);
        com.lowagie.text.Rectangle rectangle45 = com.lowagie.text.PageSize.A4;
        pdfPageEventHelper0.onGenericTag(pdfWriter31, document42, rectangle45, "com/lowagie/text/pdf/fonts/");
        com.lowagie.text.pdf.PdfFileSpecification pdfFileSpecification49 = com.lowagie.text.pdf.PdfFileSpecification.fileExtern(pdfWriter31, "OpenPDF 1.2.12.SNAPSHOT");
        try {
            pdfWriter31.addJavaScript("underline", "ury", true);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertNotNull(pdfWriter31);
        assertEquals(1, i32);
        assertNotNull(rectangle40);
        assertEquals(true, b44);
        assertNotNull(rectangle45);
        assertNotNull(pdfFileSpecification49);
    }

    @Test
    void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test463");
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper0 = new com.lowagie.text.pdf.PdfPageEventHelper();
        com.lowagie.text.pdf.PdfWriter pdfWriter1 = null;
        com.lowagie.text.Document document2 = null;
        pdfPageEventHelper0.onChapterEnd(pdfWriter1, document2, (float) 262144);
        java.io.OutputStream outputStream5 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields7 = new com.lowagie.text.pdf.PdfCopyFields(outputStream5, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter8 = pdfCopyFields7.getWriter();
        int i9 = pdfWriter8.getCurrentPageNumber();
        com.lowagie.text.Font font11 = null;
        com.lowagie.text.Footnote footnote12 = new com.lowagie.text.Footnote("", font11);
        com.lowagie.text.HeaderFooter headerFooter14 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote12, true);
        headerFooter14.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle17 = headerFooter14.rotate();
        com.lowagie.text.Rectangle rectangle18 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter14);
        com.lowagie.text.Document document19 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter14);
        boolean b21 = document19.setMarginMirroringTopBottom(true);
        pdfPageEventHelper0.onParagraphEnd(pdfWriter8, document19, 0.0f);
        com.lowagie.text.pdf.PdfPTable pdfPTable25 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell26 = pdfPTable25.getDefaultCell();
        float f27 = pdfPCell26.getMaxHeight();
        float f28 = pdfPCell26.getMinimumHeight();
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation29 = new com.lowagie.text.pdf.PdfAnnotation(pdfWriter8, (com.lowagie.text.Rectangle) pdfPCell26);
        try {
            com.lowagie.text.pdf.PdfAction pdfAction31 = com.lowagie.text.pdf.PdfAction.createHide(pdfAnnotation29, true);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfWriter8);
        assertEquals(1, i9);
        assertNotNull(rectangle17);
        assertEquals(true, b21);
        assertNotNull(pdfPCell26);
        assertEquals(4.0f, f27);
        assertEquals(0.0f, f28);
    }

    @Test
    void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test464");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfAnnotation.AA_DOWN;
        assertNotNull(pdfName0);
    }

    @Test
    void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test465");
        com.lowagie.text.Table table2 = new com.lowagie.text.Table(13, 1791);
        com.lowagie.text.Font font4 = null;
        com.lowagie.text.Footnote footnote5 = new com.lowagie.text.Footnote("", font4);
        com.lowagie.text.HeaderFooter headerFooter7 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote5, true);
        headerFooter7.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle10 = headerFooter7.rotate();
        com.lowagie.text.Rectangle rectangle11 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter7);
        com.lowagie.text.Document document12 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter7);
        java.io.OutputStream outputStream13 = null;
        com.lowagie.text.pdf.PdfCopy pdfCopy14 = new com.lowagie.text.pdf.PdfCopy(document12, outputStream13);
        boolean b15 = table2.process((com.lowagie.text.ElementListener) pdfCopy14);
        com.lowagie.text.pdf.PdfReader pdfReader16 = null;
        try {
            com.lowagie.text.pdf.PdfImportedPage pdfImportedPage18 = pdfCopy14.getImportedPage(pdfReader16, 3379);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(rectangle10);
        assertEquals(false, b15);
    }

    @Test
    void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test466");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        float f3 = pdfPTable1.getRowHeight(1785737760);
        boolean b5 = pdfPTable1.isExtendLastRow(true);
        com.lowagie.text.pdf.PdfPTable pdfPTable7 = new com.lowagie.text.pdf.PdfPTable(1);
        pdfPTable1.addCell(pdfPTable7);
        java.util.ArrayList arrayList11 = pdfPTable7.getRows(23, 50);
        boolean b12 = pdfPTable7.isSkipLastFooter();
        assertEquals(0.0f, f3);
        assertEquals(false, b5);
        assertNotNull(arrayList11);
        assertEquals(false, b12);
    }

    @Test
    void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test467");
        com.lowagie.text.Chapter chapter2 = new com.lowagie.text.Chapter("CV", (-56509343));
        com.lowagie.text.Font font4 = null;
        com.lowagie.text.Footnote footnote5 = new com.lowagie.text.Footnote("", font4);
        int[] i_array10 = new int[]{(short) 1, 1785737760, 8, 100};
        com.lowagie.text.pdf.SimpleBookmark.eliminatePages((java.util.List) footnote5, i_array10);
        com.lowagie.text.pdf.SimpleBookmark.eliminatePages((java.util.List) chapter2, i_array10);
        assertNotNull(i_array10);
    }

    @Test
    void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test468");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfWriter pdfWriter5 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField6 = com.lowagie.text.pdf.PdfFormField.createCheckBox(pdfWriter5);
        com.lowagie.text.pdf.PdfAction pdfAction8 = new com.lowagie.text.pdf.PdfAction("Cp1250");
        pdfFormField6.setAction(pdfAction8);
        com.lowagie.text.pdf.PdfFormField pdfFormField10 = new com.lowagie.text.pdf.PdfFormField(pdfWriter0, (float) 7, (float) 1L, (float) 'a', (float) 30, pdfAction8);
        pdfFormField10.setMKTextPosition((int) (byte) 100);
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation13 = com.lowagie.text.pdf.PdfFormField.shallowDuplicate((com.lowagie.text.pdf.PdfAnnotation) pdfFormField10);
        assertNotNull(pdfFormField6);
        assertNotNull(pdfAnnotation13);
    }

    @Test
    void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test469");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        float f3 = pdfPTable1.getRowHeight(1785737760);
        boolean b5 = pdfPTable1.isExtendLastRow(true);
        com.lowagie.text.pdf.PdfPTable pdfPTable7 = new com.lowagie.text.pdf.PdfPTable(1);
        pdfPTable1.addCell(pdfPTable7);
        com.lowagie.text.pdf.PdfPTable pdfPTable10 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell11 = pdfPTable10.getDefaultCell();
        float f12 = pdfPCell11.getIndent();
        float f13 = pdfPCell11.getFollowingIndent();
        com.lowagie.text.pdf.PdfPTable pdfPTable15 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell16 = pdfPTable15.getDefaultCell();
        float f17 = pdfPCell16.getIndent();
        com.lowagie.text.pdf.PdfPTable pdfPTable18 = pdfPCell16.getTable();
        pdfPCell11.softCloneNonPositionParameters((com.lowagie.text.Rectangle) pdfPCell16);
        com.lowagie.text.pdf.PdfPCell pdfPCell20 = new com.lowagie.text.pdf.PdfPCell(pdfPTable1, pdfPCell11);
        boolean b21 = pdfPCell11.isUseDescender();
        int i22 = pdfPCell11.getRotation();
        assertEquals(0.0f, f3);
        assertEquals(false, b5);
        assertNotNull(pdfPCell11);
        assertEquals(0.0f, f12);
        assertEquals(0.0f, f13);
        assertNotNull(pdfPCell16);
        assertEquals(0.0f, f17);
        assertNull(pdfPTable18);
        assertEquals(false, b21);
        assertEquals(0, i22);
    }

    @Test
    void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test470");
        com.lowagie.text.pdf.PdfPageLabels.PdfPageLabelFormat pdfPageLabelFormat4 = new com.lowagie.text.pdf.PdfPageLabels.PdfPageLabelFormat(6, (-3), "margin", 526);
        java.lang.String str5 = pdfPageLabelFormat4.prefix;
        pdfPageLabelFormat4.prefix = "generictag";
        assertEquals("margin", str5, "'" + str5 + "' != '" + "margin" + "'");
    }

    @Test
    void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test471");
        com.lowagie.text.pdf.CMYKColor cMYKColor4 = new com.lowagie.text.pdf.CMYKColor(1791, 2071, 1685348972, 23);
    }

    @Test
    void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test472");
        com.lowagie.text.pdf.PdfPCell[] pdfPCell_array0 = new com.lowagie.text.pdf.PdfPCell[]{};
        com.lowagie.text.pdf.PdfPRow pdfPRow1 = new com.lowagie.text.pdf.PdfPRow(pdfPCell_array0);
        pdfPRow1.initExtraHeights();
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = null;
        float[] f_array10 = new float[]{100.0f, 8, 3, 7, 100.0f, 'a'};
        float[] f_array12 = new float[]{(byte) 10};
        float[] f_array18 = new float[]{64, 64, 100.0f, 4, 29};
        com.lowagie.text.pdf.PdfWriter pdfWriter19 = null;
        com.lowagie.text.Font font21 = null;
        com.lowagie.text.Footnote footnote22 = new com.lowagie.text.Footnote("", font21);
        com.lowagie.text.HeaderFooter headerFooter24 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote22, true);
        headerFooter24.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle27 = headerFooter24.rotate();
        float[] f_array32 = new float[]{6, 9};
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation33 = com.lowagie.text.pdf.PdfAnnotation.createMarkup(pdfWriter19, rectangle27, "Stream", 3, f_array32);
        com.lowagie.text.pdf.PdfFunction pdfFunction35 = com.lowagie.text.pdf.PdfFunction.type2(pdfWriter3, f_array10, f_array12, f_array18, f_array32, 561.0f);
        boolean b36 = pdfPRow1.setWidths(f_array10);
        float f37 = pdfPRow1.calculateHeights();
        com.lowagie.text.pdf.PdfWriter pdfWriter38 = null;
        float[] f_array45 = new float[]{100.0f, 8, 3, 7, 100.0f, 'a'};
        float[] f_array47 = new float[]{(byte) 10};
        float[] f_array53 = new float[]{64, 64, 100.0f, 4, 29};
        com.lowagie.text.pdf.PdfWriter pdfWriter54 = null;
        com.lowagie.text.Font font56 = null;
        com.lowagie.text.Footnote footnote57 = new com.lowagie.text.Footnote("", font56);
        com.lowagie.text.HeaderFooter headerFooter59 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote57, true);
        headerFooter59.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle62 = headerFooter59.rotate();
        float[] f_array67 = new float[]{6, 9};
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation68 = com.lowagie.text.pdf.PdfAnnotation.createMarkup(pdfWriter54, rectangle62, "Stream", 3, f_array67);
        com.lowagie.text.pdf.PdfFunction pdfFunction70 = com.lowagie.text.pdf.PdfFunction.type2(pdfWriter38, f_array45, f_array47, f_array53, f_array67, 561.0f);
        boolean b71 = pdfPRow1.setWidths(f_array47);
        com.lowagie.text.pdf.PdfPCell[] pdfPCell_array72 = pdfPRow1.getCells();
        assertNotNull(pdfPCell_array0);
        assertNotNull(f_array10);
        assertNotNull(f_array12);
        assertNotNull(f_array18);
        assertNotNull(rectangle27);
        assertNotNull(f_array32);
        assertNotNull(pdfAnnotation33);
        assertNotNull(pdfFunction35);
        assertEquals(false, b36);
        assertEquals(0.0f, f37);
        assertNotNull(f_array45);
        assertNotNull(f_array47);
        assertNotNull(f_array53);
        assertNotNull(rectangle62);
        assertNotNull(f_array67);
        assertNotNull(pdfAnnotation68);
        assertNotNull(pdfFunction70);
        assertEquals(false, b71);
        assertNotNull(pdfPCell_array72);
    }

    @Test
    void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test473");
        com.lowagie.text.Font font1 = null;
        com.lowagie.text.Footnote footnote2 = new com.lowagie.text.Footnote("", font1);
        com.lowagie.text.HeaderFooter headerFooter4 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote2, true);
        headerFooter4.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle7 = headerFooter4.rotate();
        com.lowagie.text.Rectangle rectangle8 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter4);
        com.lowagie.text.Document document9 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter4);
        java.io.OutputStream outputStream10 = null;
        com.lowagie.text.pdf.PdfCopy pdfCopy11 = new com.lowagie.text.pdf.PdfCopy(document9, outputStream10);
        com.lowagie.text.pdf.PdfFormField pdfFormField12 = com.lowagie.text.pdf.PdfFormField.createEmpty((com.lowagie.text.pdf.PdfWriter) pdfCopy11);
        java.awt.Color color17 = java.awt.Color.orange;
        com.lowagie.text.pdf.CMYKColor cMYKColor22 = new com.lowagie.text.pdf.CMYKColor(4096, 16, (int) (byte) 100, 8388608);
        try {
            com.lowagie.text.pdf.PdfShading pdfShading23 = com.lowagie.text.pdf.PdfShading.simpleAxial((com.lowagie.text.pdf.PdfWriter) pdfCopy11, (float) 6, (float) 100L, 22.677166f, 0.0f, color17, (java.awt.Color) cMYKColor22);
            fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        assertNotNull(rectangle7);
        assertNotNull(pdfFormField12);
        assertNotNull(color17);
    }

    @Test
    void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test474");
        com.lowagie.text.xml.XmlDomWriter xmlDomWriter1 = new com.lowagie.text.xml.XmlDomWriter(true);
        org.w3c.dom.Node node2 = null;
        xmlDomWriter1.write(node2);
    }

    @Test
    void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test475");
        com.lowagie.text.pdf.PdfNumber pdfNumber0 = com.lowagie.text.pdf.PdfPage.LANDSCAPE;
        double d1 = pdfNumber0.doubleValue();
        float f2 = pdfNumber0.floatValue();
        assertNotNull(pdfNumber0);
        assertEquals(90.0d, d1);
        assertEquals(90.0f, f2);
    }

    @Test
    void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test476");
        com.lowagie.text.pdf.PdfAction pdfAction2 = new com.lowagie.text.pdf.PdfAction("UTF-16LE", 1668246642);
    }

    @Test
    void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test477");
        byte[] byte_array5 = com.lowagie.text.pdf.crypto.IVGenerator.getIV(0);
        byte[] byte_array6 = null;
        try {
            com.lowagie.text.pdf.BaseFont baseFont7 = com.lowagie.text.pdf.BaseFont.createFont("unknown", "plainwidth", false, false, byte_array5, byte_array6);
            fail("Expected exception of type com.lowagie.text.DocumentException");
        } catch (com.lowagie.text.DocumentException e) {
        }
        assertNotNull(byte_array5);
    }

    @Test
    void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test478");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte12 = type3Font5.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte12.rectangle((float) (-3), (float) 'a', (float) (-1), (float) (byte) 0);
        com.lowagie.text.pdf.PdfWriter pdfWriter18 = pdfContentByte12.getPdfWriter();
        pdfContentByte12.fill();
        pdfContentByte12.resetRGBColorStroke();
        assertNotNull(char_array3);
        assertNotNull(pdfContentByte12);
        assertNull(pdfWriter18);
    }

    @Test
    void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test479");
        com.lowagie.text.pdf.ByteBuffer byteBuffer1 = new com.lowagie.text.pdf.ByteBuffer(1564);
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields3 = new com.lowagie.text.pdf.PdfCopyFields((java.io.OutputStream) byteBuffer1, 'Ã');
        com.lowagie.text.pdf.PdfReader pdfReader5 = null;
        byte[] byte_array10 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream11 = new com.lowagie.text.pdf.PRStream(pdfReader5, byte_array10);
        com.lowagie.text.pdf.PdfReader pdfReader12 = null;
        byte[] byte_array17 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream18 = new com.lowagie.text.pdf.PRStream(pdfReader12, byte_array17);
        pRStream11.setData(byte_array17, false, (int) (byte) 100);
        byte[] byte_array22 = pRStream11.getBytes();
        com.lowagie.text.pdf.PdfReader pdfReader23 = null;
        byte[] byte_array28 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream29 = new com.lowagie.text.pdf.PRStream(pdfReader23, byte_array28);
        com.lowagie.text.pdf.PdfReader pdfReader30 = null;
        byte[] byte_array35 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream36 = new com.lowagie.text.pdf.PRStream(pdfReader30, byte_array35);
        pRStream29.setData(byte_array35, false, (int) (byte) 100);
        byte[] byte_array40 = pRStream29.getBytes();
        pRStream11.setData(byte_array40);
        com.lowagie.text.pdf.PdfName pdfName42 = com.lowagie.text.pdf.PdfName.FIRSTCHAR;
        java.lang.String str43 = com.lowagie.text.error_messages.MessageLocalization.getComposedMessage("listitem", (java.lang.Object) byte_array40, (java.lang.Object) pdfName42);
        byteBuffer1.write(byte_array40);
        com.lowagie.text.pdf.PdfReader pdfReader46 = null;
        byte[] byte_array51 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream52 = new com.lowagie.text.pdf.PRStream(pdfReader46, byte_array51);
        com.lowagie.text.pdf.PdfReader pdfReader53 = null;
        byte[] byte_array58 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream59 = new com.lowagie.text.pdf.PRStream(pdfReader53, byte_array58);
        pRStream52.setData(byte_array58, false, (int) (byte) 100);
        byte[] byte_array63 = pRStream52.getBytes();
        com.lowagie.text.pdf.PdfReader pdfReader64 = null;
        byte[] byte_array69 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream70 = new com.lowagie.text.pdf.PRStream(pdfReader64, byte_array69);
        com.lowagie.text.pdf.PdfReader pdfReader71 = null;
        byte[] byte_array76 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream77 = new com.lowagie.text.pdf.PRStream(pdfReader71, byte_array76);
        pRStream70.setData(byte_array76, false, (int) (byte) 100);
        byte[] byte_array81 = pRStream70.getBytes();
        pRStream52.setData(byte_array81);
        com.lowagie.text.pdf.PdfName pdfName83 = com.lowagie.text.pdf.PdfName.FIRSTCHAR;
        java.lang.String str84 = com.lowagie.text.error_messages.MessageLocalization.getComposedMessage("listitem", (java.lang.Object) byte_array81, (java.lang.Object) pdfName83);
        com.lowagie.text.pdf.PdfDashPattern pdfDashPattern87 = new com.lowagie.text.pdf.PdfDashPattern((float) 0L, (float) 8);
        byte[] byte_array88 = com.lowagie.text.pdf.PdfReader.decodePredictor(byte_array81, (com.lowagie.text.pdf.PdfObject) pdfDashPattern87);
        byteBuffer1.write(byte_array88);
        try {
            com.lowagie.text.Image image90 = com.lowagie.text.ImageLoader.getBmpImage(byte_array88);
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (com.lowagie.text.ExceptionConverter e) {
        }
        assertNotNull(byte_array10);
        assertNotNull(byte_array17);
        assertNotNull(byte_array22);
        assertNotNull(byte_array28);
        assertNotNull(byte_array35);
        assertNotNull(byte_array40);
        assertNotNull(pdfName42);
        assertEquals("No message found for listitem", str43, "'" + str43 + "' != '" + "No message found for listitem" + "'");
        assertNotNull(byte_array51);
        assertNotNull(byte_array58);
        assertNotNull(byte_array63);
        assertNotNull(byte_array69);
        assertNotNull(byte_array76);
        assertNotNull(byte_array81);
        assertNotNull(pdfName83);
        assertEquals("No message found for listitem", str84, "'" + str84 + "' != '" + "No message found for listitem" + "'");
        assertNotNull(byte_array88);
    }

    @Test
    void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test480");
        int i0 = com.lowagie.text.pdf.BaseFont.BBOXURX;
        assertEquals(7, i0);
    }

    @Test
    void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test481");
        com.lowagie.text.SplitCharacter splitCharacter0 = com.lowagie.text.pdf.DefaultSplitCharacter.DEFAULT;
        assertNotNull(splitCharacter0);
    }

    @Test
    void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test482");
        com.lowagie.text.pdf.PdfEncryption pdfEncryption0 = new com.lowagie.text.pdf.PdfEncryption();
        com.lowagie.text.pdf.PdfDictionary pdfDictionary1 = pdfEncryption0.getEncryptionDictionary();
        int i2 = pdfEncryption0.getCryptoMode();
        assertNotNull(pdfDictionary1);
        assertEquals(0, i2);
    }

    @Test
    void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test483");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_POLYLINE;
        assertEquals(805, i0);
    }

    @Test
    void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test484");
        com.lowagie.text.RomanList romanList1 = new com.lowagie.text.RomanList(1651532643);
        float f2 = romanList1.getSymbolIndent();
        com.lowagie.text.Chunk chunk3 = romanList1.getSymbol();
        boolean b4 = chunk3.isNestable();
        assertEquals(1.65153267E9f, f2);
        assertNotNull(chunk3);
        assertEquals(true, b4);
    }

    @Test
    void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test485");
        com.lowagie.text.Font font5 = com.lowagie.text.FontFactory.getFont("listsymbol", "Center", true, 0.8f, 96);
        assertNotNull(font5);
    }

    @Test
    void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test486");
        byte[] byte_array2 = null;
        com.lowagie.text.pdf.PdfReader pdfReader3 = null;
        byte[] byte_array8 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream9 = new com.lowagie.text.pdf.PRStream(pdfReader3, byte_array8);
        com.lowagie.text.pdf.PdfReader pdfReader10 = null;
        byte[] byte_array15 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream16 = new com.lowagie.text.pdf.PRStream(pdfReader10, byte_array15);
        pRStream9.setData(byte_array15, false, (int) (byte) 100);
        com.lowagie.text.ImgJBIG2 imgJBIG2_20 = new com.lowagie.text.ImgJBIG2(4, 1564, byte_array2, byte_array15);
        int i21 = imgJBIG2_20.getDpiY();
        int[] i_array22 = imgJBIG2_20.getTransparency();
        float f23 = imgJBIG2_20.getScaledWidth();
        imgJBIG2_20.makeMask();
        com.lowagie.text.Image image25 = imgJBIG2_20.getImageMask();
        assertNotNull(byte_array8);
        assertNotNull(byte_array15);
        assertEquals(0, i21);
        assertNull(i_array22);
        assertEquals(4.0f, f23);
        assertNull(image25);
    }

    @Test
    void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test487");
        com.lowagie.text.pdf.PdfTransparencyGroup pdfTransparencyGroup0 = new com.lowagie.text.pdf.PdfTransparencyGroup();
    }

    @Test
    void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test488");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        byte[] byte_array5 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream6 = new com.lowagie.text.pdf.PRStream(pdfReader0, byte_array5);
        com.lowagie.text.pdf.PdfReader pdfReader7 = null;
        byte[] byte_array12 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream13 = new com.lowagie.text.pdf.PRStream(pdfReader7, byte_array12);
        pRStream6.setData(byte_array12, false, (int) (byte) 100);
        java.lang.String str17 = pRStream6.toString();
        int i18 = pRStream6.getOffset();
        try {
            byte[] byte_array19 = com.lowagie.text.pdf.PdfReader.getStreamBytes(pRStream6);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(byte_array5);
        assertNotNull(byte_array12);
        assertEquals("Stream", str17, "'" + str17 + "' != '" + "Stream" + "'");
        assertEquals(i18, (-1));
    }

    @Test
    void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test489");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        float f3 = pdfPCell2.getIndent();
        float f4 = pdfPCell2.getFollowingIndent();
        com.lowagie.text.pdf.PdfPTable pdfPTable6 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell7 = pdfPTable6.getDefaultCell();
        float f8 = pdfPCell7.getIndent();
        com.lowagie.text.pdf.PdfPTable pdfPTable9 = pdfPCell7.getTable();
        pdfPCell2.softCloneNonPositionParameters((com.lowagie.text.Rectangle) pdfPCell7);
        pdfPCell7.setIndent((float) 2097152);
        pdfPCell7.setVerticalAlignment(16384);
        float f15 = pdfPCell7.getGrayFill();
        float f16 = pdfPCell7.getPaddingTop();
        assertNotNull(pdfPCell2);
        assertEquals(0.0f, f3);
        assertEquals(0.0f, f4);
        assertNotNull(pdfPCell7);
        assertEquals(0.0f, f8);
        assertNull(pdfPTable9);
        assertEquals(0.0f, f15);
        assertEquals(2.0f, f16);
    }

    @Test
    void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test490");
        boolean b1 = com.lowagie.text.FontFactory.isRegistered("dc:relation");
        assertEquals(false, b1);
    }

    @Test
    void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test491");
        com.lowagie.text.pdf.CMYKColor cMYKColor4 = new com.lowagie.text.pdf.CMYKColor((float) (short) 100, (float) 1, 100.0f, (float) 0);
        float f5 = cMYKColor4.getYellow();
        assertEquals(1.0f, f5);
    }

    @Test
    void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test492");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte12 = type3Font5.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte12.fillStroke();
        com.lowagie.text.pdf.FontMapper fontMapper16 = null;
        java.awt.print.PrinterJob printerJob19 = null;
        java.awt.Graphics2D graphics2D20 = pdfContentByte12.createPrinterGraphics((-1.0f), (float) (-1), fontMapper16, true, (float) (byte) 1, printerJob19);
        com.lowagie.text.pdf.FontMapper fontMapper23 = null;
        java.awt.Graphics2D graphics2D24 = pdfContentByte12.createGraphics(29.0f, (float) 526, fontMapper23);
        graphics2D24.fill3DRect((int) '4', 496, 1768449138, 23, false);
        graphics2D24.fill3DRect((int) 'c', 55, 200, (int) (short) 0, false);
        assertNotNull(char_array3);
        assertNotNull(pdfContentByte12);
        assertNotNull(graphics2D20);
        assertNotNull(graphics2D24);
    }

    @Test
    void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test493");
        com.lowagie.text.pdf.PdfPublicKeySecurityHandler pdfPublicKeySecurityHandler0 = new com.lowagie.text.pdf.PdfPublicKeySecurityHandler();
        int i1 = pdfPublicKeySecurityHandler0.getRecipientsSize();
        assertEquals(0, i1);
    }

    @Test
    void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test494");
        int i0 = com.lowagie.text.pdf.BaseField.EDIT;
        assertEquals(262144, i0);
    }

    @Test
    void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test495");
        com.lowagie.text.pdf.codec.wmf.MetaState metaState0 = new com.lowagie.text.pdf.codec.wmf.MetaState();
        float f1 = metaState0.scalingY;
        com.lowagie.text.pdf.codec.wmf.MetaBrush metaBrush2 = metaState0.getCurrentBrush();
        com.lowagie.text.pdf.codec.wmf.MetaState metaState3 = new com.lowagie.text.pdf.codec.wmf.MetaState();
        float f4 = metaState3.scalingY;
        metaState3.setOffsetWy((int) (byte) 47);
        int i7 = metaState3.textAlign;
        metaState3.setExtentWy((int) 'd');
        metaState0.setMetaState(metaState3);
        assertEquals(0.0f, f1);
        assertNotNull(metaBrush2);
        assertEquals(0.0f, f4);
        assertEquals(0, i7);
    }

    @Test
    void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test496");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        byte[] byte_array5 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream6 = new com.lowagie.text.pdf.PRStream(pdfReader0, byte_array5);
        com.lowagie.text.pdf.PdfReader pdfReader7 = null;
        byte[] byte_array12 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream13 = new com.lowagie.text.pdf.PRStream(pdfReader7, byte_array12);
        pRStream6.setData(byte_array12, false, (int) (byte) 100);
        java.lang.String str17 = pRStream6.toString();
        byte[] byte_array18 = new byte[]{};
        pRStream6.setData(byte_array18, true);
        java.io.OutputStream outputStream21 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields23 = new com.lowagie.text.pdf.PdfCopyFields(outputStream21, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter24 = pdfCopyFields23.getWriter();
        int i25 = pdfWriter24.getCurrentPageNumber();
        com.lowagie.text.Rectangle rectangle26 = pdfWriter24.getPageSize();
        com.lowagie.text.pdf.PdfDashPattern pdfDashPattern28 = new com.lowagie.text.pdf.PdfDashPattern((float) 53);
        com.lowagie.text.pdf.PdfWriter pdfWriter29 = null;
        com.lowagie.text.pdf.ByteBuffer byteBuffer31 = new com.lowagie.text.pdf.ByteBuffer(1564);
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields33 = new com.lowagie.text.pdf.PdfCopyFields((java.io.OutputStream) byteBuffer31, 'Ã');
        com.lowagie.text.pdf.ByteBuffer byteBuffer35 = byteBuffer31.append('4');
        pdfDashPattern28.toPdf(pdfWriter29, (java.io.OutputStream) byteBuffer35);
        try {
            pRStream6.toPdf(pdfWriter24, (java.io.OutputStream) byteBuffer35);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(byte_array5);
        assertNotNull(byte_array12);
        assertEquals("Stream", str17, "'" + str17 + "' != '" + "Stream" + "'");
        assertNotNull(byte_array18);
        assertNotNull(pdfWriter24);
        assertEquals(1, i25);
        assertNotNull(rectangle26);
        assertNotNull(byteBuffer35);
    }

    @Test
    void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test497");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.FLAGS;
        assertNotNull(pdfName0);
    }

    @Test
    void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test498");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte12 = type3Font5.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte12.fillStroke();
        com.lowagie.text.pdf.FontMapper fontMapper16 = null;
        java.awt.print.PrinterJob printerJob19 = null;
        java.awt.Graphics2D graphics2D20 = pdfContentByte12.createPrinterGraphics((-1.0f), (float) (-1), fontMapper16, true, (float) (byte) 1, printerJob19);
        com.lowagie.text.pdf.FontMapper fontMapper23 = null;
        java.awt.Graphics2D graphics2D24 = pdfContentByte12.createGraphics(29.0f, (float) 526, fontMapper23);
        byte[] byte_array27 = null;
        com.lowagie.text.pdf.PdfReader pdfReader28 = null;
        byte[] byte_array33 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream34 = new com.lowagie.text.pdf.PRStream(pdfReader28, byte_array33);
        com.lowagie.text.pdf.PdfReader pdfReader35 = null;
        byte[] byte_array40 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream41 = new com.lowagie.text.pdf.PRStream(pdfReader35, byte_array40);
        pRStream34.setData(byte_array40, false, (int) (byte) 100);
        com.lowagie.text.ImgJBIG2 imgJBIG2_45 = new com.lowagie.text.ImgJBIG2(4, 1564, byte_array27, byte_array40);
        int i46 = imgJBIG2_45.getCompressionLevel();
        pdfContentByte12.rectangle((com.lowagie.text.Rectangle) imgJBIG2_45);
        com.lowagie.text.pdf.PdfWriter pdfWriter48 = pdfContentByte12.getPdfWriter();
        pdfContentByte12.eoFillStroke();
        com.lowagie.text.pdf.PdfAction pdfAction50 = null;
        try {
            pdfContentByte12.setAction(pdfAction50, (float) 224, (float) 247, 76.0f, (float) 'h');
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(char_array3);
        assertNotNull(pdfContentByte12);
        assertNotNull(graphics2D20);
        assertNotNull(graphics2D24);
        assertNotNull(byte_array33);
        assertNotNull(byte_array40);
        assertEquals(i46, (-1));
        assertNull(pdfWriter48);
    }

    @Test
    void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test499");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.EFF;
        assertNotNull(pdfName0);
    }

    @Test
    void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test500");
        java.lang.String str0 = com.lowagie.text.pdf.AsianFontMapper.ChineseTraditionalFont_MHei;
        assertEquals("MHei-Medium", str0, "'" + str0 + "' != '" + "MHei-Medium" + "'");
    }
}

