package regression;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
class RegressionTest2 {

    static boolean debug = false;

    @Test
    void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test001");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.N3;
        assertNotNull(pdfName0);
    }

    @Test
    void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test002");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaPen.PS_SOLID;
        assertEquals(0, i0);
    }

    @Test
    void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test003");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.JAVASCRIPT;
        int i1 = pdfName0.type();
        assertNotNull(pdfName0);
        assertEquals(4, i1);
    }

    @Test
    void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test004");
        boolean b1 = com.lowagie.text.pdf.ColumnText.hasMoreText(11);
        assertEquals(false, b1);
    }

    @Test
    void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test005");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.W;
        assertNotNull(pdfName0);
    }

    @Test
    void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test006");
        float f0 = com.lowagie.text.pdf.ColumnText.GLOBAL_SPACE_CHAR_RATIO;
        assertEquals(0.0f, f0);
    }

    @Test
    void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test007");
        com.lowagie.text.pdf.Barcode128 barcode128_0 = new com.lowagie.text.pdf.Barcode128();
        com.lowagie.text.pdf.Barcode39 barcode39_1 = new com.lowagie.text.pdf.Barcode39();
        barcode39_1.setCodeType(0);
        com.lowagie.text.pdf.BarcodeEANSUPP barcodeEANSUPP4 = new com.lowagie.text.pdf.BarcodeEANSUPP((com.lowagie.text.pdf.Barcode) barcode128_0, (com.lowagie.text.pdf.Barcode) barcode39_1);
        barcodeEANSUPP4.setGuardBars(true);
        int i7 = barcodeEANSUPP4.getCodeType();
        float f8 = barcodeEANSUPP4.getSize();
        assertEquals(0, i7);
        assertEquals(0.0f, f8);
    }

    @Test
    void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test008");
        int i0 = com.lowagie.text.pdf.collection.PdfCollectionField.MODDATE;
        assertEquals(5, i0);
    }

    @Test
    void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test009");
        int i0 = com.lowagie.text.Section.NUMBERSTYLE_DOTTED;
        assertEquals(0, i0);
    }

    @Test
    void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test010");
        int i0 = com.lowagie.text.Element.ALIGN_TOP;
        assertEquals(4, i0);
    }

    @Test
    void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test011");
        java.io.OutputStream outputStream0 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields2 = new com.lowagie.text.pdf.PdfCopyFields(outputStream0, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = pdfCopyFields2.getWriter();
        int i4 = pdfWriter3.getCurrentPageNumber();
        com.lowagie.text.Chapter chapter6 = new com.lowagie.text.Chapter((int) (short) -1);
        pdfWriter3.setOutlines((java.util.List) chapter6);
        java.awt.Color color17 = java.awt.Color.getHSBColor(100.0f, (float) (short) 1, 100.0f);
        int i18 = com.lowagie.text.pdf.ExtendedColor.getType(color17);
        com.lowagie.text.pdf.PdfArray pdfArray19 = com.lowagie.text.pdf.PdfAnnotation.getMKColor(color17);
        java.awt.Color color27 = java.awt.Color.GREEN;
        java.awt.Color color28 = java.awt.Color.getColor("UnicodeBig", color27);
        com.lowagie.text.Font font29 = new com.lowagie.text.Font(1, (float) (byte) -1, (-1), color28);
        com.lowagie.text.Font font30 = new com.lowagie.text.Font(20, 1.0f, 55, color28);
        try {
            com.lowagie.text.pdf.PdfShading pdfShading33 = com.lowagie.text.pdf.PdfShading.simpleRadial(pdfWriter3, (float) 16384, (float) 526, (float) 4096, 4.0f, 0.0f, (float) 256, color17, color28, false, true);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfWriter3);
        assertEquals(1, i4);
        assertNotNull(color17);
        assertEquals(0, i18);
        assertNotNull(pdfArray19);
        assertNotNull(color27);
        assertNotNull(color28);
    }

    @Test
    void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test012");
        java.lang.String str0 = com.lowagie.text.ElementTags.RIGHT;
        assertEquals("right", str0, "'" + str0 + "' != '" + "right" + "'");
    }

    @Test
    void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test013");
        com.lowagie.text.Table table2 = new com.lowagie.text.Table(13, 1791);
        float[] f_array4 = new float[]{804};
        try {
            table2.setWidths(f_array4);
            fail("Expected exception of type com.lowagie.text.BadElementException");
        } catch (com.lowagie.text.BadElementException e) {
        }
        assertNotNull(f_array4);
    }

    @Test
    void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test014");
        int i0 = com.lowagie.text.pdf.PdfWriter.AllowScreenReaders;
        assertEquals(512, i0);
    }

    @Test
    void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test015");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        byte[] byte_array5 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream6 = new com.lowagie.text.pdf.PRStream(pdfReader0, byte_array5);
        com.lowagie.text.pdf.PdfReader pdfReader7 = null;
        byte[] byte_array12 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream13 = new com.lowagie.text.pdf.PRStream(pdfReader7, byte_array12);
        pRStream6.setData(byte_array12, false, (int) (byte) 100);
        byte[] byte_array17 = pRStream6.getBytes();
        com.lowagie.text.pdf.PdfReader pdfReader18 = null;
        byte[] byte_array23 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream24 = new com.lowagie.text.pdf.PRStream(pdfReader18, byte_array23);
        com.lowagie.text.pdf.PdfReader pdfReader25 = null;
        byte[] byte_array30 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream31 = new com.lowagie.text.pdf.PRStream(pdfReader25, byte_array30);
        pRStream24.setData(byte_array30, false, (int) (byte) 100);
        byte[] byte_array35 = pRStream24.getBytes();
        pRStream6.setData(byte_array35);
        try {
            pRStream6.writeLength();
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        assertNotNull(byte_array5);
        assertNotNull(byte_array12);
        assertNotNull(byte_array17);
        assertNotNull(byte_array23);
        assertNotNull(byte_array30);
        assertNotNull(byte_array35);
    }

    @Test
    void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test016");
        com.lowagie.text.Paragraph paragraph0 = null;
        com.lowagie.text.Chapter chapter2 = new com.lowagie.text.Chapter(paragraph0, 1785737760);
        boolean b3 = chapter2.isSection();
        assertEquals(false, b3);
    }

    @Test
    void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test017");
        java.lang.String str0 = com.lowagie.text.ElementTags.TABLEFITSPAGE;
        assertEquals("tablefitspage", str0, "'" + str0 + "' != '" + "tablefitspage" + "'");
    }

    @Test
    void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test018");
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
        java.lang.String str44 = randomAccessFileOrArray43.readLine();
        com.lowagie.text.pdf.PdfReader pdfReader45 = null;
        byte[] byte_array50 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream51 = new com.lowagie.text.pdf.PRStream(pdfReader45, byte_array50);
        com.lowagie.text.pdf.PdfReader pdfReader52 = null;
        byte[] byte_array57 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream58 = new com.lowagie.text.pdf.PRStream(pdfReader52, byte_array57);
        pRStream51.setData(byte_array57, false, (int) (byte) 100);
        int[] i_array62 = com.lowagie.text.pdf.PRTokeniser.checkObjectStart(byte_array57);
        try {
            randomAccessFileOrArray43.readFully(byte_array57, 4096, 512);
            fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        assertEquals("", str44, "'" + str44 + "' != '" + "" + "'");
        assertNotNull(byte_array50);
        assertNotNull(byte_array57);
        assertNull(i_array62);
    }

    @Test
    void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test019");
        com.lowagie.text.pdf.PdfGraphics2D.HyperLinkKey hyperLinkKey0 = com.lowagie.text.pdf.PdfGraphics2D.HyperLinkKey.KEY_INSTANCE;
        com.lowagie.text.pdf.PdfPTable pdfPTable2 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell3 = pdfPTable2.getDefaultCell();
        float f4 = pdfPCell3.getIndent();
        com.lowagie.text.pdf.PdfPTable pdfPTable5 = pdfPCell3.getTable();
        pdfPCell3.setRowspan(34);
        java.awt.Color color8 = java.awt.Color.GREEN;
        pdfPCell3.setBackgroundColor(color8);
        boolean b10 = hyperLinkKey0.equals((java.lang.Object) pdfPCell3);
        float f11 = pdfPCell3.getPaddingTop();
        assertNotNull(hyperLinkKey0);
        assertNotNull(pdfPCell3);
        assertEquals(0.0f, f4);
        assertNull(pdfPTable5);
        assertNotNull(color8);
        assertEquals(false, b10);
        assertEquals(2.0f, f11);
    }

    @Test
    void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test020");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.RUBY;
        assertNotNull(pdfName0);
    }

    @Test
    void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test021");
        int i0 = com.lowagie.text.pdf.PdfWriter.ALLOW_ASSEMBLY;
        assertEquals(1024, i0);
    }

    @Test
    void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test022");
        int i0 = com.lowagie.text.Font.COURIER;
        assertEquals(0, i0);
    }

    @Test
    void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test023");
        com.lowagie.text.pdf.XfaForm xfaForm0 = new com.lowagie.text.pdf.XfaForm();
        com.lowagie.text.pdf.XfaForm.Xml2SomDatasets xml2SomDatasets1 = null;
        xfaForm0.setDatasetsSom(xml2SomDatasets1);
        com.lowagie.text.pdf.XfaForm.Xml2SomTemplate xml2SomTemplate3 = xfaForm0.getTemplateSom();
        assertNull(xml2SomTemplate3);
    }

    @Test
    void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test024");
        java.io.File file0 = null;
        java.io.PrintWriter printWriter1 = null;
        try {
            com.lowagie.text.pdf.parser.PdfContentReaderTool.listContentStream(file0, printWriter1);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test025");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        java.io.PrintWriter printWriter2 = null;
        try {
            com.lowagie.text.pdf.parser.PdfContentReaderTool.listContentStreamForPage(pdfReader0, 262144, printWriter2);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test026");
        int i0 = com.lowagie.text.pdf.PdfPageLabels.LOWERCASE_LETTERS;
        assertEquals(4, i0);
    }

    @Test
    void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test027");
        java.lang.String str1 = com.lowagie.text.factories.GreekAlphabetFactory.getString(1);
        assertEquals("a", str1, "'" + str1 + "' != '" + "a" + "'");
    }

    @Test
    void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test028");
        char char0 = com.lowagie.text.pdf.Barcode128.CODE_BC_TO_A;
        assertEquals('e', char0);
    }

    @Test
    void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test029");
        java.security.cert.Certificate certificate0 = null;
        com.lowagie.text.pdf.PdfPublicKeyRecipient pdfPublicKeyRecipient2 = new com.lowagie.text.pdf.PdfPublicKeyRecipient(certificate0, 17);
    }

    @Test
    void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test030");
        com.lowagie.text.pdf.PdfNumber pdfNumber0 = com.lowagie.text.pdf.PdfPage.SEASCAPE;
        assertNotNull(pdfNumber0);
    }

    @Test
    void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test031");
        java.lang.String str0 = com.lowagie.text.Footnote.DESTINATION;
        assertEquals("destination", str0, "'" + str0 + "' != '" + "destination" + "'");
    }

    @Test
    void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test032");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.NM;
        assertNotNull(pdfName0);
    }

    @Test
    void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test033");
        int i0 = com.lowagie.text.pdf.ColumnText.NO_MORE_TEXT;
        assertEquals(1, i0);
    }

    @Test
    void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test034");
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
        try {
            pdfWriter4.addJavaScript("No message found for listitem", "listitem");
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertNotNull(pdfName35);
        assertNotNull(pdfName36);
    }

    @Test
    void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test035");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PAGELAYOUT;
        assertNotNull(pdfName0);
    }

    @Test
    void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test036");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_SETVIEWPORTORG;
        assertEquals(525, i0);
    }

    @Test
    void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test037");
        int i0 = com.lowagie.text.pdf.PushbuttonField.LAYOUT_LABEL_TOP_ICON_BOTTOM;
        assertEquals(4, i0);
    }

    @Test
    void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test038");
        try {
            com.lowagie.text.pdf.PdfNumber pdfNumber1 = new com.lowagie.text.pdf.PdfNumber("table");
            fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test039");
        com.lowagie.text.pdf.PdfXConformanceException pdfXConformanceException0 = new com.lowagie.text.pdf.PdfXConformanceException();
    }

    @Test
    void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test040");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Cell cell5 = com.lowagie.text.factories.ElementFactory.getCell(properties1);
        cell5.setMaxLines(50);
        cell5.setWidth((float) (short) 2660);
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(cell5);
    }

    @Test
    void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test041");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfGState.BM_EXCLUSION;
        assertNotNull(pdfName0);
    }

    @Test
    void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test042");
        int i0 = com.lowagie.text.pdf.PRTokeniser.TK_NAME;
        assertEquals(3, i0);
    }

    @Test
    void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test043");
        com.lowagie.text.pdf.PdfTemplate pdfTemplate0 = null;
        try {
            com.lowagie.text.Image image1 = com.lowagie.text.Image.getInstance(pdfTemplate0);
            fail("Expected exception of type com.lowagie.text.BadElementException");
        } catch (com.lowagie.text.BadElementException e) {
        }
    }

    @Test
    void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test044");
        java.io.InputStream inputStream0 = null;
        com.lowagie.text.pdf.PdfContentByte pdfContentByte1 = null;
        com.lowagie.text.pdf.codec.wmf.MetaDo metaDo2 = new com.lowagie.text.pdf.codec.wmf.MetaDo(inputStream0, pdfContentByte1);
        try {
            metaDo2.readAll();
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test045");
        com.lowagie.text.RectangleReadOnly rectangleReadOnly4 = new com.lowagie.text.RectangleReadOnly((float) (byte) 100, (float) 1336, (float) 'Ë', (float) 9);
        try {
            rectangleReadOnly4.normalize();
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
    }

    @Test
    void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test046");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PANOSE;
        assertNotNull(pdfName0);
    }

    @Test
    void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test047");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.USEOC;
        assertNotNull(pdfName0);
    }

    @Test
    void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test048");
        com.lowagie.text.ZapfDingbatsList zapfDingbatsList2 = new com.lowagie.text.ZapfDingbatsList(2, 2368);
        zapfDingbatsList2.setAutoindent(false);
        float f5 = zapfDingbatsList2.getIndentationLeft();
        zapfDingbatsList2.setFirst((int) (short) 100);
        assertEquals(0.0f, f5);
    }

    @Test
    void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test049");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.V;
        assertNotNull(pdfName0);
    }

    @Test
    void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test050");
        com.lowagie.text.pdf.PdfNumber pdfNumber1 = new com.lowagie.text.pdf.PdfNumber(1336);
    }

    @Test
    void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test051");
        try {
            java.awt.Color color1 = java.awt.Color.decode("");
            fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test052");
        int i0 = com.lowagie.text.Element.LISTITEM;
        assertEquals(15, i0);
    }

    @Test
    void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test053");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ICCBASED;
        assertNotNull(pdfName0);
    }

    @Test
    void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test054");
        int i0 = com.lowagie.text.pdf.BaseField.HIDDEN;
        assertEquals(1, i0);
    }

    @Test
    void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test055");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.N0;
        assertNotNull(pdfName0);
    }

    @Test
    void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test056");
        com.lowagie.text.xml.xmp.PdfA1Schema pdfA1Schema0 = new com.lowagie.text.xml.xmp.PdfA1Schema();
    }

    @Test
    void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test057");
        com.lowagie.text.Annotation annotation5 = new com.lowagie.text.Annotation(0.0f, (float) 9, 29.0f, (float) 'Ã', "href");
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
        boolean b34 = annotation5.process((com.lowagie.text.ElementListener) document20);
        boolean b35 = annotation5.isContent();
        assertNotNull(pdfWriter10);
        assertNotNull(rectangle18);
        assertEquals(true, b22);
        assertNotNull(paragraph32);
        assertEquals(false, b34);
        assertEquals(true, b35);
    }

    @Test
    void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test058");
        com.lowagie.text.pdf.IntHashtable intHashtable2 = new com.lowagie.text.pdf.IntHashtable((int) (byte) 10, (float) (byte) 47);
    }

    @Test
    void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test059");
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
        com.lowagie.text.Font font31 = null;
        com.lowagie.text.Footnote footnote32 = new com.lowagie.text.Footnote("", font31);
        com.lowagie.text.HeaderFooter headerFooter34 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote32, true);
        headerFooter34.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle37 = headerFooter34.rotate();
        com.lowagie.text.Rectangle rectangle38 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter34);
        headerFooter34.disableBorderSide(262);
        com.lowagie.text.pdf.PdfFileSpecification pdfFileSpecification42 = null;
        try {
            com.lowagie.text.pdf.PdfAnnotation pdfAnnotation43 = com.lowagie.text.pdf.PdfAnnotation.createFileAttachment(pdfWriter8, (com.lowagie.text.Rectangle) headerFooter34, "UniCNS-UCS2-H", pdfFileSpecification42);
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
        assertNotNull(rectangle37);
    }

    @Test
    void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test060");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.OPM;
        assertNotNull(pdfName0);
    }

    @Test
    void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test061");
        char char0 = com.lowagie.text.pdf.PdfWriter.VERSION_1_6;
        assertEquals('6', char0);
    }

    @Test
    void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test062");
        com.lowagie.text.pdf.CMYKColor cMYKColor4 = new com.lowagie.text.pdf.CMYKColor((float) (short) 100, (float) 1, 100.0f, (float) 0);
        java.awt.Color color5 = cMYKColor4.darker();
        int i6 = com.lowagie.text.pdf.ExtendedColor.getType(color5);
        assertNotNull(color5);
        assertEquals(0, i6);
    }

    @Test
    void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test063");
        java.lang.String str0 = com.lowagie.text.pdf.BaseFont.MACROMAN;
        assertEquals("MacRoman", str0, "'" + str0 + "' != '" + "MacRoman" + "'");
    }

    @Test
    void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test064");
        boolean b1 = com.lowagie.text.pdf.PdfEncryptor.isDegradedPrintingAllowed(804);
        assertEquals(true, b1);
    }

    @Test
    void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test066");
        int i0 = com.lowagie.text.pdf.BarcodeDatamatrix.DM_C40;
        assertEquals(2, i0);
    }

    @Test
    void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test067");
        int i0 = com.lowagie.text.pdf.PdfContentByte.TEXT_RENDER_MODE_FILL_STROKE;
        assertEquals(2, i0);
    }

    @Test
    void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test068");
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
        com.lowagie.text.Rectangle rectangle91 = pdfWriter9.getPageSize();
        pdfWriter9.setUserProperties(false);
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
        assertNotNull(rectangle91);
    }

    @Test
    void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test069");
        float f0 = com.lowagie.text.html.Markup.DEFAULT_FONT_SIZE;
        assertEquals(12.0f, f0);
    }

    @Test
    void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test070");
        int i0 = com.lowagie.text.pdf.BaseFont.SUBSCRIPT_SIZE;
        assertEquals(17, i0);
    }

    @Test
    void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test071");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        java.lang.String[][] str_array_array6 = type3Font5.getAllNameEntries();
        int i8 = type3Font5.getUnicodeEquivalent(128);
        try {
            int i10 = type3Font5.getWidth("tag");
            fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        assertNotNull(char_array3);
        assertNotNull(str_array_array6);
        assertEquals(128, i8);
    }

    @Test
    void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test072");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TRANS;
        assertNotNull(pdfName0);
    }

    @Test
    void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test073");
        java.lang.String str0 = com.lowagie.text.ElementTags.SCALEDWIDTH;
        assertEquals("scaledwidth", str0, "'" + str0 + "' != '" + "scaledwidth" + "'");
    }

    @Test
    void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test074");
        com.lowagie.text.Font font1 = null;
        com.lowagie.text.Footnote footnote2 = new com.lowagie.text.Footnote("", font1);
        com.lowagie.text.HeaderFooter headerFooter4 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote2, true);
        headerFooter4.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph7 = headerFooter4.paragraph();
        float f8 = paragraph7.spacingAfter();
        boolean b9 = paragraph7.getKeepTogether();
        assertNotNull(paragraph7);
        assertEquals(0.0f, f8);
        assertEquals(false, b9);
    }

    @Test
    void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test075");
        java.net.URL uRL0 = null;
        try {
            com.lowagie.text.pdf.PdfAction pdfAction1 = new com.lowagie.text.pdf.PdfAction(uRL0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test076");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier0 = com.lowagie.text.pdf.PdfPKCS7.X509Name.O;
        assertNotNull(aSN1ObjectIdentifier0);
    }

    @Test
    void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test077");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.WC;
        assertNotNull(pdfName0);
    }

    @Test
    void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test078");
        com.lowagie.text.Font font5 = com.lowagie.text.FontFactory.getFont("page-break-after", "face", (float) 30);
        com.lowagie.text.ListItem listItem6 = new com.lowagie.text.ListItem("border-bottom-width", font5);
        com.lowagie.text.Anchor anchor7 = new com.lowagie.text.Anchor("plainwidth", font5);
        java.util.ArrayList arrayList8 = anchor7.getChunks();
        com.lowagie.text.RectangleReadOnly rectangleReadOnly13 = new com.lowagie.text.RectangleReadOnly((float) (byte) 100, (float) 1336, (float) 'Ë', (float) 9);
        boolean b14 = arrayList8.remove((java.lang.Object) 'Ë');
        assertNotNull(font5);
        assertNotNull(arrayList8);
        assertEquals(false, b14);
    }

    @Test
    void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test079");
        boolean b1 = com.lowagie.text.pdf.PRTokeniser.isWhitespace(64);
        assertEquals(false, b1);
    }

    @Test
    void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test080");
        com.lowagie.text.Chapter chapter2 = new com.lowagie.text.Chapter("", (int) 'Æ');
    }

    @Test
    void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test081");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Phrase phrase5 = com.lowagie.text.factories.ElementFactory.getPhrase(properties1);
        java.io.InputStream inputStream6 = null;
        try {
            properties1.load(inputStream6);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(phrase5);
    }

    @Test
    void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test082");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaPen.PS_DASH;
        assertEquals(1, i0);
    }

    @Test
    void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test083");
        com.lowagie.text.pdf.PdfRectangle pdfRectangle5 = new com.lowagie.text.pdf.PdfRectangle((float) 15, (float) 259, (float) 1L, (float) 10L, (int) (byte) 1);
        float f7 = pdfRectangle5.top(100);
        assertEquals(f7, (-90.0f));
    }

    @Test
    void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test084");
        int i1 = com.lowagie.text.Font.getStyleValue("TAB");
        assertEquals(0, i1);
    }

    @Test
    void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test085");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TI;
        boolean b1 = pdfName0.isIndirect();
        assertNotNull(pdfName0);
        assertEquals(false, b1);
    }

    @Test
    void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test086");
        com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS pPKMS0 = new com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS();
        com.lowagie.text.pdf.PdfReader pdfReader1 = null;
        byte[] byte_array6 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream7 = new com.lowagie.text.pdf.PRStream(pdfReader1, byte_array6);
        pPKMS0.setCert(byte_array6);
        com.lowagie.text.Font font10 = null;
        com.lowagie.text.Footnote footnote11 = new com.lowagie.text.Footnote("", font10);
        int[] i_array16 = new int[]{(short) 1, 1785737760, 8, 100};
        com.lowagie.text.pdf.SimpleBookmark.eliminatePages((java.util.List) footnote11, i_array16);
        int[] i_array24 = new int[]{(short) -1, 0, 'a', 10, 3, (byte) 100};
        com.lowagie.text.pdf.internal.PolylineShape polylineShape26 = new com.lowagie.text.pdf.internal.PolylineShape(i_array16, i_array24, 4);
        pPKMS0.setByteRange(i_array16);
        com.lowagie.text.pdf.BaseFont baseFont28 = null;
        com.lowagie.text.Font font31 = new com.lowagie.text.Font(baseFont28, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont33 = font31.getCalculatedBaseFont(false);
        boolean b36 = baseFont33.setCharAdvance(9, 0);
        int i37 = baseFont33.getCompressionLevel();
        int[] i_array38 = baseFont33.getWidths();
        pPKMS0.setByteRange(i_array38);
        try {
            byte[] byte_array40 = pPKMS0.getSignerContents();
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(byte_array6);
        assertNotNull(i_array16);
        assertNotNull(i_array24);
        assertNotNull(baseFont33);
        assertEquals(true, b36);
        assertEquals(i37, (-1));
        assertNotNull(i_array38);
    }

    @Test
    void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test087");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ADOBE_PPKLITE;
        assertNotNull(pdfName0);
    }

    @Test
    void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test088");
        com.lowagie.text.pdf.collection.PdfCollectionField pdfCollectionField2 = new com.lowagie.text.pdf.collection.PdfCollectionField("ZapfDingbats", (int) '#');
        boolean b3 = pdfCollectionField2.isCollectionItem();
        pdfCollectionField2.setOrder((int) (byte) -1);
        com.lowagie.text.pdf.PdfName pdfName6 = com.lowagie.text.pdf.PdfName.VIEWERPREFERENCES;
        com.lowagie.text.pdf.PdfArray pdfArray7 = pdfCollectionField2.getAsArray(pdfName6);
        com.lowagie.text.pdf.PdfName pdfName8 = com.lowagie.text.pdf.PdfName.SHADINGTYPE;
        pdfCollectionField2.remove(pdfName8);
        assertEquals(false, b3);
        assertNotNull(pdfName6);
        assertNull(pdfArray7);
        assertNotNull(pdfName8);
    }

    @Test
    void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test089");
        java.awt.color.ICC_Profile iCC_Profile0 = null;
        try {
            com.lowagie.text.pdf.PdfICCBased pdfICCBased2 = new com.lowagie.text.pdf.PdfICCBased(iCC_Profile0, 512);
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (com.lowagie.text.ExceptionConverter e) {
        }
    }

    @Test
    void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test090");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_FRAMEREGION;
        assertEquals(1065, i0);
    }

    @Test
    void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test091");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.COLLECTIONSORT;
        assertNotNull(pdfName0);
    }

    @Test
    void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test092");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        pdfPTable1.setFooterRows((-1));
        pdfPTable1.setSpacingBefore((float) 20);
        try {
            pdfPTable1.setRunDirection(20);
            fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        assertNotNull(pdfPCell2);
    }

    @Test
    void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test093");
        com.lowagie.text.Font font1 = null;
        com.lowagie.text.Footnote footnote2 = new com.lowagie.text.Footnote("", font1);
        com.lowagie.text.HeaderFooter headerFooter4 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote2, true);
        headerFooter4.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph7 = headerFooter4.paragraph();
        com.lowagie.text.ChapterAutoNumber chapterAutoNumber8 = new com.lowagie.text.ChapterAutoNumber(paragraph7);
        com.lowagie.text.Chapter chapter10 = new com.lowagie.text.Chapter(paragraph7, 262);
        com.lowagie.text.pdf.XfaForm.AcroFieldsSearch acroFieldsSearch11 = new com.lowagie.text.pdf.XfaForm.AcroFieldsSearch((java.util.Collection) chapter10);
        java.lang.String[] str_array22 = new java.lang.String[]{"dc:date", "Identity-V", "convert2pdfp", "widths", "class", "", "Right", "xmp:ModifyDate", "Right", "UnicodeBig"};
        java.util.ArrayList<java.lang.String> arraylist_str23 = new java.util.ArrayList<java.lang.String>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str23, str_array22);
        com.lowagie.text.pdf.PdfReader pdfReader25 = null;
        byte[] byte_array30 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream31 = new com.lowagie.text.pdf.PRStream(pdfReader25, byte_array30);
        com.lowagie.text.pdf.PdfReader pdfReader32 = null;
        byte[] byte_array37 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream38 = new com.lowagie.text.pdf.PRStream(pdfReader32, byte_array37);
        pRStream31.setData(byte_array37, false, (int) (byte) 100);
        java.lang.String str42 = pRStream31.toString();
        boolean b43 = arraylist_str23.contains((java.lang.Object) str42);
        com.lowagie.text.pdf.BaseFont baseFont44 = null;
        com.lowagie.text.Font font47 = new com.lowagie.text.Font(baseFont44, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont49 = font47.getCalculatedBaseFont(false);
        boolean b52 = baseFont49.setCharAdvance(9, 0);
        java.awt.Color color58 = java.awt.Color.getHSBColor(100.0f, (float) (short) 1, 100.0f);
        int i59 = com.lowagie.text.pdf.ExtendedColor.getType(color58);
        com.lowagie.text.Font font60 = new com.lowagie.text.Font(baseFont49, (float) (-1), (int) 'Ã', color58);
        int i61 = arraylist_str23.indexOf((java.lang.Object) color58);
        java.lang.String str62 = acroFieldsSearch11.inverseSearchGlobal((java.util.ArrayList) arraylist_str23);
        assertNotNull(paragraph7);
        assertNotNull(str_array22);
        assertEquals(true, b24);
        assertNotNull(byte_array30);
        assertNotNull(byte_array37);
        assertEquals("Stream", str42, "'" + str42 + "' != '" + "Stream" + "'");
        assertEquals(false, b43);
        assertNotNull(baseFont49);
        assertEquals(true, b52);
        assertNotNull(color58);
        assertEquals(0, i59);
        assertEquals(i61, (-1));
        assertNull(str62);
    }

    @Test
    void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test094");
        com.lowagie.text.Chunk chunk0 = new com.lowagie.text.Chunk();
        com.lowagie.text.Image image1 = chunk0.getImage();
        float f2 = chunk0.getCharacterSpacing();
        com.lowagie.text.pdf.PdfAction pdfAction4 = new com.lowagie.text.pdf.PdfAction("Cp1250");
        com.lowagie.text.Chunk chunk5 = chunk0.setAction(pdfAction4);
        com.lowagie.text.pdf.PdfAction pdfAction8 = new com.lowagie.text.pdf.PdfAction("none", false);
        com.lowagie.text.Chunk chunk9 = chunk0.setAction(pdfAction8);
        java.lang.String str10 = pdfAction8.toString();
        com.lowagie.text.pdf.PdfReader.releaseLastXrefPartial((com.lowagie.text.pdf.PdfObject) pdfAction8);
        assertNull(image1);
        assertEquals(0.0f, f2);
        assertNotNull(chunk5);
        assertNotNull(chunk9);
        assertEquals("Dictionary", str10, "'" + str10 + "' != '" + "Dictionary" + "'");
    }

    @Test
    void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test095");
        int i0 = com.lowagie.text.pdf.PdfFormField.Q_CENTER;
        assertEquals(1, i0);
    }

    @Test
    void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test096");
        boolean b1 = com.lowagie.text.pdf.BidiLine.isWS('È');
        assertEquals(false, b1);
    }

    @Test
    void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test097");
        int i0 = com.lowagie.text.Row.TABLE;
        assertEquals(2, i0);
    }

    @Test
    void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test098");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfAcroForm pdfAcroForm1 = new com.lowagie.text.pdf.PdfAcroForm(pdfWriter0);
        boolean b2 = pdfAcroForm1.isOutlineTree();
        java.util.HashMap hashMap3 = com.lowagie.text.xml.simpleparser.EntitiesToSymbol.map;
        com.lowagie.text.pdf.PdfWriter pdfWriter4 = null;
        com.lowagie.text.pdf.PdfDictionary pdfDictionary5 = com.lowagie.text.pdf.SimpleNamedDestination.outputNamedDestinationAsNames(hashMap3, pdfWriter4);
        com.lowagie.text.pdf.PdfPKCS7.X509Name.DefaultSymbols = hashMap3;
        pdfAcroForm1.addFieldTemplates(hashMap3);
        com.lowagie.text.pdf.PdfWriter pdfWriter8 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField9 = com.lowagie.text.pdf.PdfFormField.createEmpty(pdfWriter8);
        pdfFormField9.setAppearanceState("[/FlashVars]");
        try {
            pdfAcroForm1.addRadioGroup(pdfFormField9);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertEquals(false, b2);
        assertNotNull(hashMap3);
        assertNotNull(pdfDictionary5);
        assertNotNull(pdfFormField9);
    }

    @Test
    void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test099");
        com.lowagie.text.Font font1 = null;
        com.lowagie.text.Footnote footnote2 = new com.lowagie.text.Footnote("", font1);
        int[] i_array7 = new int[]{(short) 1, 1785737760, 8, 100};
        com.lowagie.text.pdf.SimpleBookmark.eliminatePages((java.util.List) footnote2, i_array7);
        int[] i_array15 = new int[]{(short) -1, 0, 'a', 10, 3, (byte) 100};
        com.lowagie.text.pdf.internal.PolylineShape polylineShape17 = new com.lowagie.text.pdf.internal.PolylineShape(i_array7, i_array15, 4);
        java.awt.geom.AffineTransform affineTransform18 = null;
        java.awt.geom.PathIterator pathIterator20 = polylineShape17.getPathIterator(affineTransform18, (double) 128);
        assertNotNull(i_array7);
        assertNotNull(i_array15);
        assertNotNull(pathIterator20);
    }

    @Test
    void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test100");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfWriter.DID_PRINT;
        assertNotNull(pdfName0);
    }

    @Test
    void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test101");
        java.awt.Color color0 = java.awt.Color.orange;
        int i1 = color0.getAlpha();
        assertNotNull(color0);
        assertEquals(255, i1);
    }

    @Test
    void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test102");
        com.lowagie.text.pdf.internal.PdfXConformanceImp pdfXConformanceImp0 = new com.lowagie.text.pdf.internal.PdfXConformanceImp();
        pdfXConformanceImp0.setPDFXConformance((int) '翿');
        boolean b3 = pdfXConformanceImp0.isPdfX32002();
        assertEquals(false, b3);
    }

    @Test
    void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test103");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfAnnotation.AA_ENTER;
        assertNotNull(pdfName0);
    }

    @Test
    void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test104");
        com.lowagie.text.SimpleCell simpleCell1 = new com.lowagie.text.SimpleCell(true);
        simpleCell1.setSpacing_top((float) 226);
        com.lowagie.text.Font font9 = com.lowagie.text.FontFactory.getFont("page-break-after", "face", (float) 30);
        com.lowagie.text.ListItem listItem10 = new com.lowagie.text.ListItem("border-bottom-width", font9);
        com.lowagie.text.Anchor anchor11 = new com.lowagie.text.Anchor("plainwidth", font9);
        java.util.ArrayList arrayList12 = anchor11.getChunks();
        java.lang.String str13 = anchor11.getReference();
        try {
            simpleCell1.addElement((com.lowagie.text.Element) anchor11);
            fail("Expected exception of type com.lowagie.text.BadElementException");
        } catch (com.lowagie.text.BadElementException e) {
        }
        assertNotNull(font9);
        assertNotNull(arrayList12);
        assertNull(str13);
    }

    @Test
    void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test105");
        java.lang.String str0 = com.lowagie.text.xml.xmp.XmpWriter.UTF8;
        assertEquals("UTF-8", str0, "'" + str0 + "' != '" + "UTF-8" + "'");
    }

    @Test
    void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test106");
        java.lang.String str0 = com.lowagie.text.ElementTags.GREEN;
        assertEquals("green", str0, "'" + str0 + "' != '" + "green" + "'");
    }

    @Test
    void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test107");
        int[] i_array0 = com.lowagie.text.Jpeg.NOPARAM_MARKERS;
        assertNotNull(i_array0);
    }

    @Test
    void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test108");
        java.io.InputStream inputStream0 = null;
        com.lowagie.text.pdf.codec.wmf.InputMeta inputMeta1 = new com.lowagie.text.pdf.codec.wmf.InputMeta(inputStream0);
        try {
            int i2 = inputMeta1.readWord();
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test109");
        java.lang.String str0 = com.lowagie.text.html.Markup.CSS_KEY_MARGIN;
        assertEquals("margin", str0, "'" + str0 + "' != '" + "margin" + "'");
    }

    @Test
    void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test110");
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
        com.lowagie.text.Rectangle rectangle91 = pdfWriter9.getPageSize();
        com.lowagie.text.pdf.PdfFileSpecification pdfFileSpecification92 = null;
        try {
            pdfWriter9.addFileAttachment(pdfFileSpecification92);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
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
        assertNotNull(rectangle91);
    }

    @Test
    void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test111");
        com.lowagie.text.Font font1 = null;
        com.lowagie.text.Footnote footnote2 = new com.lowagie.text.Footnote("", font1);
        com.lowagie.text.HeaderFooter headerFooter4 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote2, true);
        headerFooter4.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph7 = headerFooter4.paragraph();
        com.lowagie.text.ChapterAutoNumber chapterAutoNumber8 = new com.lowagie.text.ChapterAutoNumber(paragraph7);
        com.lowagie.text.Chapter chapter10 = new com.lowagie.text.Chapter(paragraph7, 262);
        com.lowagie.text.pdf.XfaForm.AcroFieldsSearch acroFieldsSearch11 = new com.lowagie.text.pdf.XfaForm.AcroFieldsSearch((java.util.Collection) chapter10);
        java.util.HashMap hashMap12 = acroFieldsSearch11.getInverseSearch();
        java.io.Writer writer13 = null;
        try {
            com.lowagie.text.pdf.SimpleNamedDestination.exportToXML(hashMap12, writer13, "scaledwidth", true);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(paragraph7);
        assertNotNull(hashMap12);
    }

    @Test
    void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test112");
        java.awt.Color color0 = java.awt.Color.MAGENTA;
        assertNotNull(color0);
    }

    @Test
    void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test113");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Phrase phrase5 = com.lowagie.text.factories.ElementFactory.getPhrase(properties1);
        java.io.Writer writer6 = null;
        try {
            com.lowagie.text.pdf.SimpleBookmark.exportToXML((java.util.List) phrase5, writer6, "rdf:Alt", false);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(phrase5);
    }

    @Test
    void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test114");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DEFAULT;
        assertNotNull(pdfName0);
    }

    @Test
    void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test115");
        java.lang.String str1 = com.lowagie.text.pdf.PdfPKCS7.getAlgorithm("SKEW");
        assertEquals("SKEW", str1, "'" + str1 + "' != '" + "SKEW" + "'");
    }

    @Test
    void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test116");
        int i0 = com.lowagie.text.Element.YMARK;
        assertEquals(55, i0);
    }

    @Test
    void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test117");
        try {
            com.lowagie.text.pdf.FdfReader fdfReader1 = new com.lowagie.text.pdf.FdfReader("background-color");
            fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
    }

    @Test
    void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test118");
        byte[] byte_array5 = new byte[]{(byte) 32};
        byte[] byte_array6 = com.lowagie.text.pdf.PdfReader.LZWDecode(byte_array5);
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
        com.lowagie.text.pdf.PdfDashPattern pdfDashPattern49 = new com.lowagie.text.pdf.PdfDashPattern((float) 0L, (float) 8);
        byte[] byte_array50 = com.lowagie.text.pdf.PdfReader.decodePredictor(byte_array43, (com.lowagie.text.pdf.PdfObject) pdfDashPattern49);
        try {
            com.lowagie.text.pdf.BaseFont baseFont51 = com.lowagie.text.pdf.BaseFont.createFont("UniKS-UCS2-V", "inline", true, false, byte_array6, byte_array50);
            fail("Expected exception of type com.lowagie.text.DocumentException");
        } catch (com.lowagie.text.DocumentException e) {
        }
        assertNotNull(byte_array5);
        assertNotNull(byte_array6);
        assertNotNull(byte_array13);
        assertNotNull(byte_array20);
        assertNotNull(byte_array25);
        assertNotNull(byte_array31);
        assertNotNull(byte_array38);
        assertNotNull(byte_array43);
        assertNotNull(pdfName45);
        assertEquals("No message found for listitem", str46, "'" + str46 + "' != '" + "No message found for listitem" + "'");
        assertNotNull(byte_array50);
    }

    @Test
    void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test119");
        int i0 = com.lowagie.text.Image.ORIGINAL_JPEG;
        assertEquals(1, i0);
    }

    @Test
    void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test120");
        com.lowagie.text.pdf.PdfAction pdfAction2 = new com.lowagie.text.pdf.PdfAction("none", false);
        com.lowagie.text.pdf.PdfAction pdfAction5 = new com.lowagie.text.pdf.PdfAction("plainwidth", 3);
        pdfAction2.next(pdfAction5);
    }

    @Test
    void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test121");
        com.lowagie.text.pdf.IntHashtable intHashtable0 = new com.lowagie.text.pdf.IntHashtable();
        boolean b2 = intHashtable0.containsValue(1785737760);
        int[] i_array3 = intHashtable0.getKeys();
        int[] i_array4 = intHashtable0.getKeys();
        int i6 = intHashtable0.get(9);
        int i8 = intHashtable0.remove((int) 'Ã');
        boolean b10 = intHashtable0.containsValue(804);
        assertEquals(false, b2);
        assertNotNull(i_array3);
        assertNotNull(i_array4);
        assertEquals(0, i6);
        assertEquals(0, i8);
        assertEquals(false, b10);
    }

    @Test
    void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test122");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        com.lowagie.text.pdf.parser.PdfTextExtractor pdfTextExtractor2 = new com.lowagie.text.pdf.parser.PdfTextExtractor(pdfReader0, false);
        try {
            java.lang.String str5 = pdfTextExtractor2.getTextFromPage(764, false);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test123");
        int i0 = com.lowagie.text.pdf.BaseFont.ASCENT;
        assertEquals(1, i0);
    }

    @Test
    void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test124");
        com.lowagie.text.ZapfDingbatsNumberList zapfDingbatsNumberList1 = new com.lowagie.text.ZapfDingbatsNumberList((int) (byte) 9);
    }

    @Test
    void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test125");
        com.lowagie.text.pdf.Barcode128 barcode128_0 = new com.lowagie.text.pdf.Barcode128();
        com.lowagie.text.pdf.Barcode39 barcode39_1 = new com.lowagie.text.pdf.Barcode39();
        barcode39_1.setCodeType(0);
        com.lowagie.text.pdf.BarcodeEANSUPP barcodeEANSUPP4 = new com.lowagie.text.pdf.BarcodeEANSUPP((com.lowagie.text.pdf.Barcode) barcode128_0, (com.lowagie.text.pdf.Barcode) barcode39_1);
        barcodeEANSUPP4.setGuardBars(true);
        int i7 = barcodeEANSUPP4.getCodeType();
        boolean b8 = barcodeEANSUPP4.isStartStopText();
        assertEquals(0, i7);
        assertEquals(false, b8);
    }

    @Test
    void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test126");
        com.lowagie.text.RectangleReadOnly rectangleReadOnly4 = new com.lowagie.text.RectangleReadOnly((float) (byte) 100, (float) 1336, (float) 'Ë', (float) 9);
        try {
            rectangleReadOnly4.setBorderWidthBottom((float) 525);
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
    }

    @Test
    void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test127");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.RELATIVECOLORIMETRIC;
        assertNotNull(pdfName0);
    }

    @Test
    void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test128");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_PAINTREGION;
        assertEquals(299, i0);
    }

    @Test
    void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test129");
        int i0 = com.lowagie.text.pdf.PdfObject.NUMBER;
        assertEquals(2, i0);
    }

    @Test
    void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test130");
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
        com.lowagie.text.pdf.PdfWriter pdfWriter31 = null;
        com.lowagie.text.pdf.PdfWriter pdfWriter36 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField37 = com.lowagie.text.pdf.PdfFormField.createCheckBox(pdfWriter36);
        com.lowagie.text.pdf.PdfAction pdfAction39 = new com.lowagie.text.pdf.PdfAction("Cp1250");
        pdfFormField37.setAction(pdfAction39);
        com.lowagie.text.pdf.PdfFormField pdfFormField41 = new com.lowagie.text.pdf.PdfFormField(pdfWriter31, (float) 7, (float) 1L, (float) 'a', (float) 30, pdfAction39);
        try {
            pdfWriter4.addAnnotation((com.lowagie.text.pdf.PdfAnnotation) pdfFormField41);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertEquals(0.0f, f30);
        assertNotNull(pdfFormField37);
    }

    @Test
    void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test131");
        com.lowagie.text.pdf.hyphenation.HyphenationException hyphenationException1 = new com.lowagie.text.pdf.hyphenation.HyphenationException("ZapfDingbats");
        com.lowagie.text.BadElementException badElementException2 = new com.lowagie.text.BadElementException((java.lang.Exception) hyphenationException1);
        java.lang.String str3 = hyphenationException1.toString();
        assertEquals("com.lowagie.text.pdf.hyphenation.HyphenationException: ZapfDingbats", str3, "'" + str3 + "' != '" + "com.lowagie.text.pdf.hyphenation.HyphenationException: ZapfDingbats" + "'");
    }

    @Test
    void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test132");
        java.lang.String str0 = com.lowagie.text.ElementTags.OFFSET;
        assertEquals("offset", str0, "'" + str0 + "' != '" + "offset" + "'");
    }

    @Test
    void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test133");
        com.lowagie.text.pdf.Barcode128 barcode128_0 = new com.lowagie.text.pdf.Barcode128();
        com.lowagie.text.pdf.Barcode39 barcode39_1 = new com.lowagie.text.pdf.Barcode39();
        barcode39_1.setCodeType(0);
        com.lowagie.text.pdf.BarcodeEANSUPP barcodeEANSUPP4 = new com.lowagie.text.pdf.BarcodeEANSUPP((com.lowagie.text.pdf.Barcode) barcode128_0, (com.lowagie.text.pdf.Barcode) barcode39_1);
        barcodeEANSUPP4.setGuardBars(true);
        int i7 = barcodeEANSUPP4.getCodeType();
        barcodeEANSUPP4.setCodeType((int) (short) 10);
        assertEquals(0, i7);
    }

    @Test
    void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test134");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        float f3 = pdfPCell2.getIndent();
        float f4 = pdfPCell2.getFollowingIndent();
        com.lowagie.text.pdf.PdfPTable pdfPTable6 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell7 = pdfPTable6.getDefaultCell();
        float f8 = pdfPCell7.getIndent();
        com.lowagie.text.pdf.PdfPTable pdfPTable9 = pdfPCell7.getTable();
        pdfPCell2.softCloneNonPositionParameters((com.lowagie.text.Rectangle) pdfPCell7);
        int i11 = pdfPCell2.getRowspan();
        assertNotNull(pdfPCell2);
        assertEquals(0.0f, f3);
        assertEquals(0.0f, f4);
        assertNotNull(pdfPCell7);
        assertEquals(0.0f, f8);
        assertNull(pdfPTable9);
        assertEquals(1, i11);
    }

    @Test
    void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test135");
        com.lowagie.text.pdf.PdfDestination pdfDestination1 = new com.lowagie.text.pdf.PdfDestination(0);
        com.lowagie.text.pdf.PdfIndirectReference pdfIndirectReference2 = null;
        boolean b3 = pdfDestination1.addPage(pdfIndirectReference2);
        assertEquals(true, b3);
    }

    @Test
    void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test136");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.INTENT;
        assertNotNull(pdfName0);
    }

    @Test
    void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test137");
        boolean b0 = com.lowagie.text.List.LOWERCASE;
        assertEquals(true, b0);
    }

    @Test
    void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test138");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
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
        com.lowagie.text.pdf.PdfName pdfName41 = com.lowagie.text.pdf.PdfName.FIRSTCHAR;
        java.lang.String str42 = com.lowagie.text.error_messages.MessageLocalization.getComposedMessage("listitem", (java.lang.Object) byte_array39, (java.lang.Object) pdfName41);
        try {
            com.lowagie.text.pdf.PdfFileSpecification pdfFileSpecification43 = com.lowagie.text.pdf.PdfFileSpecification.fileEmbedded(pdfWriter0, "margin", "xxiv", byte_array39);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(byte_array9);
        assertNotNull(byte_array16);
        assertNotNull(byte_array21);
        assertNotNull(byte_array27);
        assertNotNull(byte_array34);
        assertNotNull(byte_array39);
        assertNotNull(pdfName41);
        assertEquals("No message found for listitem", str42, "'" + str42 + "' != '" + "No message found for listitem" + "'");
    }

    @Test
    void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test139");
        java.lang.String str0 = com.lowagie.text.xml.xmp.PdfA1Schema.DEFAULT_XPATH_ID;
        assertEquals("pdfaid", str0, "'" + str0 + "' != '" + "pdfaid" + "'");
    }

    @Test
    void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test140");
        try {
            java.lang.String str1 = com.lowagie.text.factories.RomanAlphabetFactory.getUpperCaseString(0);
            fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test141");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Paragraph paragraph5 = com.lowagie.text.factories.ElementFactory.getParagraph(properties1);
        int i6 = properties1.size();
        try {
            com.lowagie.text.Image image7 = com.lowagie.text.factories.ElementFactory.getImage(properties1);
            fail("Expected exception of type java.net.MalformedURLException");
        } catch (java.net.MalformedURLException e) {
        }
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(paragraph5);
        assertEquals(0, i6);
    }

    @Test
    void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test142");
        java.lang.String str0 = com.lowagie.text.html.Markup.CSS_KEY_PADDINGRIGHT;
        assertEquals("padding-right", str0, "'" + str0 + "' != '" + "padding-right" + "'");
    }

    @Test
    void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test143");
        java.lang.String str0 = com.lowagie.text.pdf.BaseFont.COURIER_OBLIQUE;
        assertEquals("Courier-Oblique", str0, "'" + str0 + "' != '" + "Courier-Oblique" + "'");
    }

    @Test
    void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test144");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.FLASH;
        assertNotNull(pdfName0);
    }

    @Test
    void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test145");
        int i0 = java.awt.geom.PathIterator.SEG_CLOSE;
        assertEquals(4, i0);
    }

    @Test
    void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test146");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaState.TA_CENTER;
        assertEquals(6, i0);
    }

    @Test
    void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test147");
        java.lang.String str0 = com.lowagie.text.xml.xmp.PdfA1Schema.CONFORMANCE;
        assertEquals("pdfaid:conformance", str0, "'" + str0 + "' != '" + "pdfaid:conformance" + "'");
    }

    @Test
    void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test148");
        int i0 = com.lowagie.text.pdf.PRTokeniser.TK_NUMBER;
        assertEquals(1, i0);
    }

    @Test
    void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test149");
        java.lang.String str0 = com.lowagie.text.ElementTags.FONT;
        assertEquals("font", str0, "'" + str0 + "' != '" + "font" + "'");
    }

    @Test
    void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test150");
        com.lowagie.text.pdf.PdfDestination pdfDestination4 = new com.lowagie.text.pdf.PdfDestination((-1), (float) 1565, (float) 9, (float) 6);
    }

    @Test
    void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test151");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.MASK;
        assertNotNull(pdfName0);
    }

    @Test
    void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test152");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PROPERTIES;
        assertNotNull(pdfName0);
    }

    @Test
    void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test153");
        com.lowagie.text.Font font1 = null;
        com.lowagie.text.Footnote footnote2 = new com.lowagie.text.Footnote("", font1);
        com.lowagie.text.HeaderFooter headerFooter4 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote2, true);
        headerFooter4.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph7 = headerFooter4.paragraph();
        com.lowagie.text.ChapterAutoNumber chapterAutoNumber8 = new com.lowagie.text.ChapterAutoNumber(paragraph7);
        com.lowagie.text.Chapter chapter10 = new com.lowagie.text.Chapter(paragraph7, 262);
        com.lowagie.text.pdf.XfaForm.AcroFieldsSearch acroFieldsSearch11 = new com.lowagie.text.pdf.XfaForm.AcroFieldsSearch((java.util.Collection) chapter10);
        boolean b12 = chapter10.isNestable();
        assertNotNull(paragraph7);
        assertEquals(false, b12);
    }

    @Test
    void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test154");
        com.lowagie.text.pdf.PdfRectangle pdfRectangle3 = new com.lowagie.text.pdf.PdfRectangle((float) (short) -1, (float) '4', (int) (short) 1);
        float f5 = pdfRectangle3.top(224);
        com.lowagie.text.pdf.PdfName pdfName6 = com.lowagie.text.pdf.PdfName.VISIBLEPAGES;
        pdfRectangle3.addFirst((com.lowagie.text.pdf.PdfObject) pdfName6);
        try {
            com.lowagie.text.pdf.PdfDictionary pdfDictionary9 = pdfRectangle3.getAsDict(11);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        assertEquals(f5, (-172.0f));
        assertNotNull(pdfName6);
    }

    @Test
    void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test155");
        int i0 = com.lowagie.text.pdf.collection.PdfCollection.HIDDEN;
        assertEquals(2, i0);
    }

    @Test
    void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test156");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaBrush.HS_BDIAGONAL;
        assertEquals(3, i0);
    }

    @Test
    void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test157");
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
        com.lowagie.text.Rectangle rectangle38 = com.lowagie.text.PageSize.ID_3;
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation44 = com.lowagie.text.pdf.PdfAnnotation.createLine(pdfWriter4, rectangle38, "listitem", 10.0f, (float) 322, (float) 1042, (float) (-56509343));
        try {
            pdfAnnotation44.setPage((int) (short) 2660);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertNotNull(pdfName35);
        assertNotNull(pdfName36);
        assertNotNull(rectangle38);
        assertNotNull(pdfAnnotation44);
    }

    @Test
    void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test158");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField4 = com.lowagie.text.pdf.PdfFormField.createTextField(pdfWriter0, true, false, (int) (short) 10);
        pdfFormField4.setFieldName("http://ns.adobe.com/pdf/1.3/");
        java.util.HashMap<com.lowagie.text.pdf.PdfTemplate, java.lang.Object> hashmap_pdfTemplate_obj7 = pdfFormField4.getTemplates();
        com.lowagie.text.pdf.PdfName pdfName8 = com.lowagie.text.pdf.PdfName.FITBV;
        pdfFormField4.setHighlighting(pdfName8);
        assertNotNull(pdfFormField4);
        assertNull(hashmap_pdfTemplate_obj7);
        assertNotNull(pdfName8);
    }

    @Test
    void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test159");
        com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS pPKMS0 = new com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS();
        com.lowagie.text.pdf.PdfReader pdfReader1 = null;
        byte[] byte_array6 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream7 = new com.lowagie.text.pdf.PRStream(pdfReader1, byte_array6);
        pPKMS0.setCert(byte_array6);
        com.lowagie.text.pdf.PdfName pdfName9 = com.lowagie.text.pdf.PdfName.XFA;
        com.lowagie.text.pdf.PdfObject pdfObject10 = pPKMS0.get(pdfName9);
        com.lowagie.text.pdf.PdfName pdfName11 = com.lowagie.text.pdf.PdfName.CS;
        com.lowagie.text.pdf.PdfString pdfString12 = pPKMS0.getAsString(pdfName11);
        pPKMS0.setReason("HeiseiKakuGo-W5");
        assertNotNull(byte_array6);
        assertNotNull(pdfName9);
        assertNull(pdfObject10);
        assertNotNull(pdfName11);
        assertNull(pdfString12);
    }

    @Test
    void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test160");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        byte[] byte_array2 = com.lowagie.text.pdf.crypto.IVGenerator.getIV(0);
        com.lowagie.text.pdf.PRTokeniser pRTokeniser3 = new com.lowagie.text.pdf.PRTokeniser(byte_array2);
        try {
            com.lowagie.text.pdf.PRStream pRStream5 = new com.lowagie.text.pdf.PRStream(pdfReader0, byte_array2, 11);
            fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        assertNotNull(byte_array2);
    }

    @Test
    void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test161");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ST;
        assertNotNull(pdfName0);
    }

    @Test
    void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test162");
        java.lang.String str0 = com.lowagie.text.pdf.BaseFont.HELVETICA_BOLDOBLIQUE;
        assertEquals("Helvetica-BoldOblique", str0, "'" + str0 + "' != '" + "Helvetica-BoldOblique" + "'");
    }

    @Test
    void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test163");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        pdfPTable1.setFooterRows((-1));
        com.lowagie.text.pdf.PdfContentByte[] pdfContentByte_array11 = new com.lowagie.text.pdf.PdfContentByte[]{};
        try {
            float f12 = pdfPTable1.writeSelectedRows(5, 8196, 262144, (int) '#', (float) 525, (float) (byte) 60, pdfContentByte_array11);
            fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        assertNotNull(pdfPCell2);
        assertNotNull(pdfContentByte_array11);
    }

    @Test
    void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test164");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.COURIER_BOLD;
        assertNotNull(pdfName0);
    }

    @Test
    void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test165");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.IX;
        assertNotNull(pdfName0);
    }

    @Test
    void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test166");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfAcroForm pdfAcroForm1 = new com.lowagie.text.pdf.PdfAcroForm(pdfWriter0);
        pdfAcroForm1.setNeedAppearances(true);
        com.lowagie.text.pdf.PdfIndirectReference pdfIndirectReference4 = null;
        pdfAcroForm1.addDocumentField(pdfIndirectReference4);
        com.lowagie.text.pdf.PdfWriter pdfWriter6 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField7 = com.lowagie.text.pdf.PdfFormField.createEmpty(pdfWriter6);
        pdfFormField7.setAppearanceState("[/FlashVars]");
        com.lowagie.text.pdf.PdfName pdfName10 = com.lowagie.text.pdf.PdfName.TI;
        boolean b11 = pdfFormField7.contains(pdfName10);
        try {
            pdfAcroForm1.drawSignatureAppearences(pdfFormField7, (float) (short) 0, (float) 4096, 136.0f, (float) 262);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfFormField7);
        assertNotNull(pdfName10);
        assertEquals(false, b11);
    }

    @Test
    void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test167");
        com.lowagie.text.Chapter chapter1 = new com.lowagie.text.Chapter((int) (short) -1);
        com.lowagie.text.MarkedSection markedSection2 = chapter1.addMarkedSection();
        chapter1.setIndentationLeft((float) (short) 2660);
        chapter1.setChapterNumber(65535);
        assertNotNull(markedSection2);
    }

    @Test
    void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test168");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.W2;
        assertNotNull(pdfName0);
    }

    @Test
    void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test169");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.CIDSET;
        assertNotNull(pdfName0);
    }

    @Test
    void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test170");
        com.lowagie.text.Table table2 = new com.lowagie.text.Table(13, 1791);
        float[] f_array5 = table2.getWidths((float) 804, (float) 1065);
        com.lowagie.text.Table table8 = new com.lowagie.text.Table(13, 1791);
        float[] f_array11 = table8.getWidths((float) 804, (float) 1065);
        com.lowagie.text.pdf.PdfPTable pdfPTable12 = new com.lowagie.text.pdf.PdfPTable(f_array11);
        try {
            table2.setWidths(f_array11);
            fail("Expected exception of type com.lowagie.text.BadElementException");
        } catch (com.lowagie.text.BadElementException e) {
        }
        assertNotNull(f_array5);
        assertNotNull(f_array11);
    }

    @Test
    void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test171");
        com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS pPKMS0 = new com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS();
        java.lang.String str2 = com.lowagie.text.pdf.parser.PdfContentReaderTool.getDictionaryDetail((com.lowagie.text.pdf.PdfDictionary) pPKMS0, 36);
        assertEquals("(/Filter=/Adobe.PPKMS, /Type=/Sig, /SubFilter=/adbe.pkcs7.sha1)", str2, "'" + str2 + "' != '" + "(/Filter=/Adobe.PPKMS, /Type=/Sig, /SubFilter=/adbe.pkcs7.sha1)" + "'");
    }

    @Test
    void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test172");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.AESV2;
        assertNotNull(pdfName0);
    }

    @Test
    void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test173");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        float f3 = pdfPCell2.getMaxHeight();
        com.lowagie.text.pdf.PdfPTable pdfPTable5 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell6 = pdfPTable5.getDefaultCell();
        float f7 = pdfPCell6.getMaxHeight();
        com.lowagie.text.pdf.PdfPCell[] pdfPCell_array8 = new com.lowagie.text.pdf.PdfPCell[]{pdfPCell2, pdfPCell6};
        com.lowagie.text.pdf.PdfPRow pdfPRow9 = new com.lowagie.text.pdf.PdfPRow(pdfPCell_array8);
        assertNotNull(pdfPCell2);
        assertEquals(4.0f, f3);
        assertNotNull(pdfPCell6);
        assertEquals(4.0f, f7);
        assertNotNull(pdfPCell_array8);
    }

    @Test
    void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test174");
        com.lowagie.text.pdf.PdfAction pdfAction2 = com.lowagie.text.pdf.PdfAction.createHide("entity", true);
        assertNotNull(pdfAction2);
    }

    @Test
    void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test175");
        float f0 = com.lowagie.text.pdf.BaseField.BORDER_WIDTH_THICK;
        assertEquals(3.0f, f0);
    }

    @Test
    void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test176");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Paragraph paragraph5 = com.lowagie.text.factories.ElementFactory.getParagraph(properties1);
        int i6 = properties1.size();
        com.lowagie.text.Table table7 = com.lowagie.text.factories.ElementFactory.getTable(properties1);
        boolean b8 = table7.isLocked();
        table7.setWidth((float) 200);
        com.lowagie.text.SimpleCell simpleCell12 = new com.lowagie.text.SimpleCell(true);
        com.lowagie.text.SimpleCell simpleCell14 = new com.lowagie.text.SimpleCell(true);
        simpleCell14.setSpacing_top((float) 226);
        int i17 = simpleCell14.type();
        com.lowagie.text.Cell cell18 = simpleCell12.createCell(simpleCell14);
        java.awt.Point point19 = null;
        try {
            table7.addCell(cell18, point19);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(paragraph5);
        assertEquals(0, i6);
        assertNotNull(table7);
        assertEquals(false, b8);
        assertEquals(20, i17);
        assertNotNull(cell18);
    }

    @Test
    void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test177");
        com.lowagie.text.pdf.BaseFont baseFont0 = null;
        com.lowagie.text.Font font3 = new com.lowagie.text.Font(baseFont0, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont5 = font3.getCalculatedBaseFont(false);
        boolean b6 = font3.isBold();
        boolean b7 = font3.isStandardFont();
        boolean b8 = font3.isStrikethru();
        float f9 = font3.getSize();
        assertNotNull(baseFont5);
        assertEquals(false, b6);
        assertEquals(false, b7);
        assertEquals(false, b8);
        assertEquals(1.0f, f9);
    }

    @Test
    void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test178");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.OUTPUTCONDITION;
        assertNotNull(pdfName0);
    }

    @Test
    void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test179");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfWriter.WILL_SAVE;
        assertNotNull(pdfName0);
    }

    @Test
    void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test180");
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
        pdfPCell11.setRowspan(16384);
        assertEquals(0.0f, f3);
        assertEquals(false, b5);
        assertNotNull(pdfPCell11);
        assertEquals(0.0f, f12);
        assertEquals(0.0f, f13);
        assertNotNull(pdfPCell16);
        assertEquals(0.0f, f17);
        assertNull(pdfPTable18);
    }

    @Test
    void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test181");
        com.lowagie.text.pdf.PdfWriter.PdfBody.PdfCrossReference pdfCrossReference4 = new com.lowagie.text.pdf.PdfWriter.PdfBody.PdfCrossReference((int) (short) 1, 9, 301, 0);
    }

    @Test
    void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test182");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ZADB;
        assertNotNull(pdfName0);
    }

    @Test
    void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test183");
        com.lowagie.text.pdf.PdfContentByte pdfContentByte0 = null;
        com.lowagie.text.pdf.Barcode39 barcode39_1 = new com.lowagie.text.pdf.Barcode39();
        barcode39_1.setGuardBars(false);
        java.awt.Color color7 = java.awt.Color.getHSBColor(100.0f, (float) (short) 1, 100.0f);
        int i8 = com.lowagie.text.pdf.ExtendedColor.getType(color7);
        java.awt.Color color10 = java.awt.Color.GREEN;
        java.awt.Color color11 = java.awt.Color.getColor("UnicodeBig", color10);
        java.awt.Image image12 = barcode39_1.createAwtImage(color7, color10);
        try {
            com.lowagie.text.Image image14 = com.lowagie.text.Image.getInstance(pdfContentByte0, image12, (float) 1);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(color7);
        assertEquals(0, i8);
        assertNotNull(color10);
        assertNotNull(color11);
        assertNotNull(image12);
    }

    @Test
    void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test184");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.BOUNDS;
        assertNotNull(pdfName0);
    }

    @Test
    void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test185");
        com.lowagie.text.pdf.Barcode128 barcode128_0 = new com.lowagie.text.pdf.Barcode128();
        com.lowagie.text.pdf.Barcode39 barcode39_1 = new com.lowagie.text.pdf.Barcode39();
        barcode39_1.setCodeType(0);
        com.lowagie.text.pdf.BarcodeEANSUPP barcodeEANSUPP4 = new com.lowagie.text.pdf.BarcodeEANSUPP((com.lowagie.text.pdf.Barcode) barcode128_0, (com.lowagie.text.pdf.Barcode) barcode39_1);
        float f5 = barcode128_0.getX();
        assertEquals(0.8f, f5);
    }

    @Test
    void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test186");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.COLLECTIONSCHEMA;
        assertNotNull(pdfName0);
    }

    @Test
    void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test187");
        com.lowagie.text.pdf.PdfRectangle pdfRectangle3 = new com.lowagie.text.pdf.PdfRectangle((float) (short) -1, (float) '4', (int) (short) 1);
        float f5 = pdfRectangle3.top(224);
        com.lowagie.text.pdf.PdfName pdfName6 = com.lowagie.text.pdf.PdfName.VISIBLEPAGES;
        pdfRectangle3.addFirst((com.lowagie.text.pdf.PdfObject) pdfName6);
        float f9 = pdfRectangle3.right(1048576);
        assertEquals(f5, (-172.0f));
        assertNotNull(pdfName6);
        assertEquals(f9, (-1048577.0f));
    }

    @Test
    void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test188");
        int i0 = com.lowagie.text.Element.CCITT_ENCODEDBYTEALIGN;
        assertEquals(2, i0);
    }

    @Test
    void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test189");
        com.lowagie.text.pdf.PdfStructureTreeRoot pdfStructureTreeRoot0 = null;
        com.lowagie.text.pdf.PdfName pdfName1 = com.lowagie.text.pdf.PdfAnnotation.AA_FOCUS;
        try {
            com.lowagie.text.pdf.PdfStructureElement pdfStructureElement2 = new com.lowagie.text.pdf.PdfStructureElement(pdfStructureTreeRoot0, pdfName1);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfName1);
    }

    @Test
    void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test190");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.Font font2 = null;
        com.lowagie.text.Footnote footnote3 = new com.lowagie.text.Footnote("", font2);
        com.lowagie.text.HeaderFooter headerFooter5 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote3, true);
        headerFooter5.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle8 = headerFooter5.rotate();
        float[] f_array13 = new float[]{6, 9};
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation14 = com.lowagie.text.pdf.PdfAnnotation.createMarkup(pdfWriter0, rectangle8, "Stream", 3, f_array13);
        pdfAnnotation14.setAppearanceState("visibility");
        assertNotNull(rectangle8);
        assertNotNull(f_array13);
        assertNotNull(pdfAnnotation14);
    }

    @Test
    void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test191");
        com.lowagie.text.pdf.PdfContentByte pdfContentByte0 = null;
        com.lowagie.text.pdf.FontMapper fontMapper3 = null;
        java.awt.print.PrinterJob printerJob7 = null;
        try {
            com.lowagie.text.pdf.PdfPrinterGraphics2D pdfPrinterGraphics2D8 = new com.lowagie.text.pdf.PdfPrinterGraphics2D(pdfContentByte0, 0.0f, (float) 1048576, fontMapper3, true, false, (float) 526, printerJob7);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test192");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier0 = com.lowagie.text.pdf.PdfPKCS7.X509Name.UNIQUE_IDENTIFIER;
        assertNotNull(aSN1ObjectIdentifier0);
    }

    @Test
    void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test193");
        int i0 = com.lowagie.text.pdf.PdfWriter.NonFullScreenPageModeUseThumbs;
        assertEquals(1048576, i0);
    }

    @Test
    void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test194");
        boolean b1 = com.lowagie.text.pdf.PRTokeniser.isDelimiter(299);
        assertEquals(false, b1);
    }

    @Test
    void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test195");
        com.lowagie.text.RectangleReadOnly rectangleReadOnly4 = new com.lowagie.text.RectangleReadOnly((float) (byte) 100, (float) 1336, (float) 'Ë', (float) 9);
        try {
            rectangleReadOnly4.setBorderWidthRight((float) 12);
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
    }

    @Test
    void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test196");
        com.lowagie.text.pdf.GrayColor grayColor0 = com.lowagie.text.pdf.GrayColor.GRAYWHITE;
        float f1 = grayColor0.getGray();
        com.lowagie.text.pdf.PdfWriter pdfWriter2 = null;
        float[] f_array9 = new float[]{100.0f, 8, 3, 7, 100.0f, 'a'};
        float[] f_array11 = new float[]{(byte) 10};
        float[] f_array17 = new float[]{64, 64, 100.0f, 4, 29};
        com.lowagie.text.pdf.PdfWriter pdfWriter18 = null;
        com.lowagie.text.Font font20 = null;
        com.lowagie.text.Footnote footnote21 = new com.lowagie.text.Footnote("", font20);
        com.lowagie.text.HeaderFooter headerFooter23 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote21, true);
        headerFooter23.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle26 = headerFooter23.rotate();
        float[] f_array31 = new float[]{6, 9};
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation32 = com.lowagie.text.pdf.PdfAnnotation.createMarkup(pdfWriter18, rectangle26, "Stream", 3, f_array31);
        com.lowagie.text.pdf.PdfFunction pdfFunction34 = com.lowagie.text.pdf.PdfFunction.type2(pdfWriter2, f_array9, f_array11, f_array17, f_array31, 561.0f);
        try {
            float[] f_array35 = grayColor0.getComponents(f_array31);
            fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        assertNotNull(grayColor0);
        assertEquals(1.0f, f1);
        assertNotNull(f_array9);
        assertNotNull(f_array11);
        assertNotNull(f_array17);
        assertNotNull(rectangle26);
        assertNotNull(f_array31);
        assertNotNull(pdfAnnotation32);
        assertNotNull(pdfFunction34);
    }

    @Test
    void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test197");
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
        boolean b93 = document75.addHeader("UnicodeBig", "leading");
        boolean b94 = document75.addCreationDate();
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
        assertEquals(false, b93);
        assertEquals(false, b94);
    }

    @Test
    void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test198");
        double d2 = com.lowagie.text.pdf.PdfGraphics2D.asPoints((double) 52.0f, (int) 'Ã');
        assertEquals(10.14d, d2);
    }

    @Test
    void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test199");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PAINTTYPE;
        java.lang.String str1 = pdfName0.toString();
        assertNotNull(pdfName0);
        assertEquals("/PaintType", str1, "'" + str1 + "' != '" + "/PaintType" + "'");
    }

    @Test
    void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test200");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfSignatureAppearance.VERISIGN_SIGNED;
        assertNotNull(pdfName0);
    }

    @Test
    void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test201");
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
        com.lowagie.text.pdf.PdfFileSpecification pdfFileSpecification43 = null;
        try {
            pdfWriter4.addFileAttachment("encoding", pdfFileSpecification43);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertNotNull(pdfName35);
        assertNotNull(pdfName36);
        assertNotNull(pdfFormField41);
    }

    @Test
    void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test202");
        com.lowagie.text.Chunk chunk1 = new com.lowagie.text.Chunk();
        com.lowagie.text.Image image2 = chunk1.getImage();
        float f3 = chunk1.getCharacterSpacing();
        com.lowagie.text.pdf.PdfAction pdfAction5 = new com.lowagie.text.pdf.PdfAction("Cp1250");
        com.lowagie.text.Chunk chunk6 = chunk1.setAction(pdfAction5);
        java.lang.StringBuffer stringBuffer8 = chunk6.append("xmpMM:Versions");
        com.lowagie.text.Chunk chunk9 = chunk6.setNewPage();
        com.lowagie.text.Phrase phrase10 = new com.lowagie.text.Phrase((float) 'a', chunk6);
        assertNull(image2);
        assertEquals(0.0f, f3);
        assertNotNull(chunk6);
        assertNotNull(stringBuffer8);
        assertNotNull(chunk9);
    }

    @Test
    void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test203");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Cell cell5 = com.lowagie.text.factories.ElementFactory.getCell(properties1);
        cell5.setMaxLines(50);
        try {
            cell5.setWidth("");
            fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(cell5);
    }

    @Test
    void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test204");
        int i0 = com.lowagie.text.Jpeg.M_APP0;
        assertEquals(224, i0);
    }

    @Test
    void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test205");
        com.lowagie.text.pdf.PdfSigGenericPKCS.PPKLite pPKLite0 = new com.lowagie.text.pdf.PdfSigGenericPKCS.PPKLite();
        byte[] byte_array3 = null;
        com.lowagie.text.pdf.PdfReader pdfReader4 = null;
        byte[] byte_array9 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream10 = new com.lowagie.text.pdf.PRStream(pdfReader4, byte_array9);
        com.lowagie.text.pdf.PdfReader pdfReader11 = null;
        byte[] byte_array16 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream17 = new com.lowagie.text.pdf.PRStream(pdfReader11, byte_array16);
        pRStream10.setData(byte_array16, false, (int) (byte) 100);
        com.lowagie.text.ImgJBIG2 imgJBIG2_21 = new com.lowagie.text.ImgJBIG2(4, 1564, byte_array3, byte_array16);
        pPKLite0.setCert(byte_array3);
        java.security.PrivateKey privateKey23 = null;
        java.security.cert.Certificate certificate24 = null;
        java.security.cert.Certificate[] certificate_array25 = new java.security.cert.Certificate[]{certificate24};
        java.security.cert.CRL cRL26 = null;
        java.security.cert.CRL[] cRL_array27 = new java.security.cert.CRL[]{cRL26};
        try {
            pPKLite0.setSignInfo(privateKey23, certificate_array25, cRL_array27);
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (com.lowagie.text.ExceptionConverter e) {
        }
        assertNotNull(byte_array9);
        assertNotNull(byte_array16);
        assertNotNull(certificate_array25);
        assertNotNull(cRL_array27);
    }

    @Test
    void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test206");
        java.lang.String str1 = com.lowagie.text.factories.RomanNumberFactory.getString((int) (byte) 10);
        assertEquals("x", str1, "'" + str1 + "' != '" + "x" + "'");
    }

    @Test
    void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test207");
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
        com.lowagie.text.pdf.PdfName pdfName41 = com.lowagie.text.pdf.PdfName.FITV;
        pdfWriter5.setPdfVersion(pdfName41);
        com.lowagie.text.pdf.PdfAction pdfAction44 = com.lowagie.text.pdf.PdfAction.javaScript("UnicodeBig", pdfWriter5, true);
        assertNotNull(pdfWriter5);
        assertNotNull(rectangle13);
        assertEquals(true, b17);
        assertNotNull(paragraph27);
        assertNotNull(pdfName36);
        assertNotNull(pdfName37);
        assertNotNull(pdfName41);
        assertNotNull(pdfAction44);
    }

    @Test
    void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test208");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfAnnotation.AA_JS_OTHER_CHANGE;
        assertNotNull(pdfName0);
    }

    @Test
    void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test209");
        java.lang.String str0 = com.lowagie.text.ElementTags.ALIGN_CENTER;
        assertEquals("Center", str0, "'" + str0 + "' != '" + "Center" + "'");
    }

    @Test
    void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test210");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Cell cell5 = com.lowagie.text.factories.ElementFactory.getCell(properties1);
        com.lowagie.text.Paragraph paragraph6 = com.lowagie.text.factories.ElementFactory.getParagraph(properties1);
        com.lowagie.text.Anchor anchor7 = com.lowagie.text.factories.ElementFactory.getAnchor(properties1);
        java.lang.String str8 = anchor7.getReference();
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(cell5);
        assertNotNull(paragraph6);
        assertNotNull(anchor7);
        assertNull(str8);
    }

    @Test
    void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test211");
        com.lowagie.text.pdf.PdfReader pdfReader1 = null;
        byte[] byte_array6 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream7 = new com.lowagie.text.pdf.PRStream(pdfReader1, byte_array6);
        com.lowagie.text.pdf.PdfReader pdfReader8 = null;
        byte[] byte_array13 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream14 = new com.lowagie.text.pdf.PRStream(pdfReader8, byte_array13);
        pRStream7.setData(byte_array13, false, (int) (byte) 100);
        byte[] byte_array18 = pRStream7.getBytes();
        com.lowagie.text.pdf.PdfReader pdfReader19 = null;
        byte[] byte_array24 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream25 = new com.lowagie.text.pdf.PRStream(pdfReader19, byte_array24);
        com.lowagie.text.pdf.PdfReader pdfReader26 = null;
        byte[] byte_array31 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream32 = new com.lowagie.text.pdf.PRStream(pdfReader26, byte_array31);
        pRStream25.setData(byte_array31, false, (int) (byte) 100);
        byte[] byte_array36 = pRStream25.getBytes();
        pRStream7.setData(byte_array36);
        com.lowagie.text.pdf.PdfName pdfName38 = com.lowagie.text.pdf.PdfName.FIRSTCHAR;
        java.lang.String str39 = com.lowagie.text.error_messages.MessageLocalization.getComposedMessage("listitem", (java.lang.Object) byte_array36, (java.lang.Object) pdfName38);
        com.lowagie.text.pdf.PdfDashPattern pdfDashPattern42 = new com.lowagie.text.pdf.PdfDashPattern((float) 0L, (float) 8);
        byte[] byte_array43 = com.lowagie.text.pdf.PdfReader.decodePredictor(byte_array36, (com.lowagie.text.pdf.PdfObject) pdfDashPattern42);
        try {
            byte[] byte_array44 = com.lowagie.text.pdf.PdfReader.ASCII85Decode(byte_array43);
            fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        assertNotNull(byte_array6);
        assertNotNull(byte_array13);
        assertNotNull(byte_array18);
        assertNotNull(byte_array24);
        assertNotNull(byte_array31);
        assertNotNull(byte_array36);
        assertNotNull(pdfName38);
        assertEquals("No message found for listitem", str39, "'" + str39 + "' != '" + "No message found for listitem" + "'");
        assertNotNull(byte_array43);
    }

    @Test
    void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test212");
        java.lang.String str0 = com.lowagie.text.ElementTags.URY;
        assertEquals("ury", str0, "'" + str0 + "' != '" + "ury" + "'");
    }

    @Test
    void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test213");
        com.lowagie.text.pdf.PdfPublicKeySecurityHandler pdfPublicKeySecurityHandler0 = new com.lowagie.text.pdf.PdfPublicKeySecurityHandler();
        com.lowagie.text.pdf.PdfArray pdfArray1 = pdfPublicKeySecurityHandler0.getEncodedRecipients();
        com.lowagie.text.pdf.PdfName pdfName2 = com.lowagie.text.pdf.PdfName.OFF;
        pdfArray1.addFirst((com.lowagie.text.pdf.PdfObject) pdfName2);
        assertNotNull(pdfArray1);
        assertNotNull(pdfName2);
    }

    @Test
    void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test214");
        int i0 = com.lowagie.text.pdf.PdfTransition.SPLITHIN;
        assertEquals(4, i0);
    }

    @Test
    void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test215");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.STMF;
        assertNotNull(pdfName0);
    }

    @Test
    void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test216");
        com.lowagie.text.RectangleReadOnly rectangleReadOnly4 = new com.lowagie.text.RectangleReadOnly((float) (byte) 100, (float) 1336, (float) 'Ë', (float) 9);
        try {
            rectangleReadOnly4.setBorderWidthLeft((float) 128);
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
    }

    @Test
    void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test217");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PATTERNTYPE;
        assertNotNull(pdfName0);
    }

    @Test
    void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test218");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        java.lang.String[][] str_array_array6 = type3Font5.getAllNameEntries();
        int i8 = type3Font5.getUnicodeEquivalent(128);
        type3Font5.correctArabicAdvance();
        try {
            float f12 = type3Font5.getWidthPointKerned("class", (float) 255);
            fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        assertNotNull(char_array3);
        assertNotNull(str_array_array6);
        assertEquals(128, i8);
    }

    @Test
    void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test219");
        java.lang.String str0 = com.lowagie.text.ElementTags.LEFT;
        assertEquals("left", str0, "'" + str0 + "' != '" + "left" + "'");
    }

    @Test
    void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test220");
        com.lowagie.text.pdf.ByteBuffer byteBuffer1 = new com.lowagie.text.pdf.ByteBuffer(1564);
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields2 = new com.lowagie.text.pdf.PdfCopyFields((java.io.OutputStream) byteBuffer1);
        pdfCopyFields2.setEncryption(true, "SKEW", "text-align", 764);
    }

    @Test
    void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test221");
        com.lowagie.text.pdf.BaseFont baseFont0 = null;
        com.lowagie.text.Font font3 = new com.lowagie.text.Font(baseFont0, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont5 = font3.getCalculatedBaseFont(false);
        boolean b8 = baseFont5.setCharAdvance(9, 0);
        float f11 = baseFont5.getWidthPoint(53, (float) (byte) 60);
        int i13 = baseFont5.getCidCode((int) (short) 10);
        float f16 = baseFont5.getDescentPoint("keeptogether", (float) 53);
        float f19 = baseFont5.getDescentPoint("", (float) 224);
        float f22 = baseFont5.getWidthPointKerned("", (float) 224);
        int i23 = baseFont5.getFontType();
        assertNotNull(baseFont5);
        assertEquals(true, b8);
        assertEquals(33.360004f, f11);
        assertEquals(10, i13);
        assertEquals(f16, (-11.660001f));
        assertEquals(0.0f, f19);
        assertEquals(0.0f, f22);
        assertEquals(0, i23);
    }

    @Test
    void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test222");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.FAR;
        assertNotNull(pdfName0);
    }

    @Test
    void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test223");
        float f1 = com.lowagie.text.Utilities.millimetersToPoints((float) (short) 0);
        assertEquals(0.0f, f1);
    }

    @Test
    void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test224");
        com.lowagie.text.pdf.hyphenation.HyphenationException hyphenationException1 = new com.lowagie.text.pdf.hyphenation.HyphenationException("ZapfDingbats");
        java.lang.Throwable[] throwable_array2 = hyphenationException1.getSuppressed();
        com.lowagie.text.DocumentException documentException3 = new com.lowagie.text.DocumentException((java.lang.Exception) hyphenationException1);
        java.lang.RuntimeException runtimeException4 = com.lowagie.text.ExceptionConverter.convertException((java.lang.Exception) hyphenationException1);
        assertNotNull(throwable_array2);
        assertNotNull(runtimeException4);
    }

    @Test
    void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test225");
        com.lowagie.text.pdf.PdfNumber pdfNumber0 = com.lowagie.text.pdf.PdfFormXObject.ONE;
        assertNotNull(pdfNumber0);
    }

    @Test
    void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test226");
        com.lowagie.text.Annotation annotation5 = new com.lowagie.text.Annotation(0.0f, (float) 9, 29.0f, (float) 'Ã', "href");
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
        boolean b34 = annotation5.process((com.lowagie.text.ElementListener) document20);
        boolean b39 = document20.setMargins((float) 3, (float) 30, (float) (-56509343), (float) 200);
        boolean b41 = document20.addProducer("[/FlashVars]");
        assertNotNull(pdfWriter10);
        assertNotNull(rectangle18);
        assertEquals(true, b22);
        assertNotNull(paragraph32);
        assertEquals(false, b34);
        assertEquals(true, b39);
        assertEquals(false, b41);
    }

    @Test
    void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test227");
        java.lang.String str0 = com.lowagie.text.ElementTags.SYMBOLINDENT;
        assertEquals("symbolindent", str0, "'" + str0 + "' != '" + "symbolindent" + "'");
    }

    @Test
    void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test228");
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
        imgJBIG2_20.setDeflated(true);
        assertNotNull(byte_array8);
        assertNotNull(byte_array15);
        assertEquals(0, i21);
    }

    @Test
    void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test229");
        com.lowagie.text.RomanList romanList1 = new com.lowagie.text.RomanList(1651532643);
        boolean b2 = romanList1.isAlignindent();
        assertEquals(false, b2);
    }

    @Test
    void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test230");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.pdf.PdfName pdfName5 = com.lowagie.text.pdf.PdfName.XFA;
        boolean b6 = properties1.containsValue((java.lang.Object) pdfName5);
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(pdfName5);
        assertEquals(false, b6);
    }

    @Test
    void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test231");
        int i0 = com.lowagie.text.pdf.PdfFormField.Q_LEFT;
        assertEquals(0, i0);
    }

    @Test
    void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test232");
        com.lowagie.text.RectangleReadOnly rectangleReadOnly4 = new com.lowagie.text.RectangleReadOnly((float) (byte) 100, (float) 1336, (float) 'Ë', (float) 9);
        com.lowagie.text.pdf.GrayColor grayColor6 = new com.lowagie.text.pdf.GrayColor(2);
        com.lowagie.text.pdf.PdfLiteral pdfLiteral7 = com.lowagie.text.pdf.PdfFormXObject.MATRIX;
        boolean b8 = grayColor6.equals((java.lang.Object) pdfLiteral7);
        try {
            rectangleReadOnly4.setBackgroundColor((java.awt.Color) grayColor6);
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        assertNotNull(pdfLiteral7);
        assertEquals(false, b8);
    }

    @Test
    void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test233");
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
        java.security.cert.Certificate certificate30 = null;
        java.security.cert.Certificate[] certificate_array31 = new java.security.cert.Certificate[]{certificate30};
        com.lowagie.text.Font font33 = null;
        com.lowagie.text.Footnote footnote34 = new com.lowagie.text.Footnote("", font33);
        int[] i_array39 = new int[]{(short) 1, 1785737760, 8, 100};
        com.lowagie.text.pdf.SimpleBookmark.eliminatePages((java.util.List) footnote34, i_array39);
        try {
            pdfWriter8.setEncryption(certificate_array31, i_array39, 262144);
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (com.lowagie.text.ExceptionConverter e) {
        }
        assertNotNull(pdfWriter8);
        assertEquals(1, i9);
        assertNotNull(rectangle17);
        assertEquals(true, b21);
        assertNotNull(pdfPCell26);
        assertEquals(4.0f, f27);
        assertEquals(0.0f, f28);
        assertNotNull(certificate_array31);
        assertNotNull(i_array39);
    }

    @Test
    void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test234");
        int i0 = com.lowagie.text.pdf.BarcodePDF417.PDF417_FORCE_BINARY;
        assertEquals(32, i0);
    }

    @Test
    void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test235");
        int i0 = com.lowagie.text.pdf.PdfFormField.MK_NO_CAPTION;
        assertEquals(1, i0);
    }

    @Test
    void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test236");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.Font font2 = null;
        com.lowagie.text.Footnote footnote3 = new com.lowagie.text.Footnote("", font2);
        com.lowagie.text.HeaderFooter headerFooter5 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote3, true);
        headerFooter5.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle8 = headerFooter5.rotate();
        float[][] f_array_array10 = new float[][]{};
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation11 = com.lowagie.text.pdf.PdfAnnotation.createInk(pdfWriter0, (com.lowagie.text.Rectangle) headerFooter5, "widths", f_array_array10);
        boolean b12 = pdfAnnotation11.isOutlineTree();
        int i13 = pdfAnnotation11.getPlaceInPage();
        boolean b14 = pdfAnnotation11.isAnnotation();
        pdfAnnotation11.setMKTextPosition(525);
        assertNotNull(rectangle8);
        assertNotNull(f_array_array10);
        assertNotNull(pdfAnnotation11);
        assertEquals(false, b12);
        assertEquals(i13, (-1));
        assertEquals(true, b14);
    }

    @Test
    void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test237");
        int i0 = com.lowagie.text.Font.STRIKETHRU;
        assertEquals(8, i0);
    }

    @Test
    void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test238");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.FONTMATRIX;
        assertNotNull(pdfName0);
    }

    @Test
    void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test239");
        byte[] byte_array1 = new byte[]{(byte) 32};
        byte[] byte_array2 = com.lowagie.text.pdf.PdfReader.LZWDecode(byte_array1);
        try {
            com.lowagie.text.Image image3 = com.lowagie.text.ImageLoader.getBmpImage(byte_array1);
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (com.lowagie.text.ExceptionConverter e) {
        }
        assertNotNull(byte_array1);
        assertNotNull(byte_array2);
    }

    @Test
    void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test240");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Cell cell5 = com.lowagie.text.factories.ElementFactory.getCell(properties1);
        cell5.setMaxLines(50);
        cell5.setGroupChange(true);
        try {
            cell5.setTop(32);
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(cell5);
    }

    @Test
    void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test241");
        java.lang.String str0 = com.lowagie.text.ElementTags.PHRASE;
        assertEquals("phrase", str0, "'" + str0 + "' != '" + "phrase" + "'");
    }

    @Test
    void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test242");
        java.io.InputStream inputStream0 = null;
        try {
            byte[] byte_array1 = com.lowagie.text.pdf.RandomAccessFileOrArray.InputStreamToArray(inputStream0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test243");
        com.lowagie.text.pdf.PdfStructureTreeRoot pdfStructureTreeRoot0 = null;
        com.lowagie.text.pdf.PdfName pdfName1 = com.lowagie.text.pdf.PdfName.COURIER;
        try {
            com.lowagie.text.pdf.PdfStructureElement pdfStructureElement2 = new com.lowagie.text.pdf.PdfStructureElement(pdfStructureTreeRoot0, pdfName1);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfName1);
    }

    @Test
    void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test244");
        int i0 = com.lowagie.text.Image.ORIGINAL_PNG;
        assertEquals(2, i0);
    }

    @Test
    void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test245");
        com.lowagie.text.pdf.hyphenation.ByteVector byteVector1 = new com.lowagie.text.pdf.hyphenation.ByteVector((int) (byte) 60);
        int i2 = byteVector1.length();
        assertEquals(0, i2);
    }

    @Test
    void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test246");
        int i0 = com.lowagie.text.pdf.PdfFormField.FF_PUSHBUTTON;
        assertEquals(65536, i0);
    }

    @Test
    void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test247");
        java.io.OutputStream outputStream0 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields2 = new com.lowagie.text.pdf.PdfCopyFields(outputStream0, ' ');
        com.lowagie.text.pdf.PdfName pdfName3 = com.lowagie.text.pdf.PdfName.SHADING;
        com.lowagie.text.pdf.PdfWriter pdfWriter4 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField5 = com.lowagie.text.pdf.PdfFormField.createCheckBox(pdfWriter4);
        pdfFormField5.setQuadding((int) (byte) 100);
        int i9 = pdfFormField5.setFieldFlags((-56509343));
        pdfCopyFields2.addViewerPreference(pdfName3, (com.lowagie.text.pdf.PdfObject) pdfFormField5);
        com.lowagie.text.Font font15 = com.lowagie.text.FontFactory.getFont("page-break-after", "face", (float) 30);
        com.lowagie.text.ListItem listItem16 = new com.lowagie.text.ListItem("border-bottom-width", font15);
        float f17 = listItem16.getIndentationRight();
        listItem16.setKeepTogether(true);
        pdfCopyFields2.setOutlines((java.util.List) listItem16);
        float f21 = listItem16.getIndentationRight();
        assertNotNull(pdfName3);
        assertNotNull(pdfFormField5);
        assertEquals(0, i9);
        assertNotNull(font15);
        assertEquals(0.0f, f17);
        assertEquals(0.0f, f21);
    }

    @Test
    void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test248");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Cell cell5 = com.lowagie.text.factories.ElementFactory.getCell(properties1);
        boolean b6 = cell5.isUseBorderPadding();
        int i7 = cell5.getMaxLines();
        try {
            float f9 = cell5.top(100);
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(cell5);
        assertEquals(false, b6);
        assertEquals(2147483647, i7);
    }

    @Test
    void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test249");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.SOUND;
        java.lang.Object[] obj_array1 = new java.lang.Object[]{pdfName0};
        try {
            com.lowagie.text.pdf.PdfAction pdfAction3 = com.lowagie.text.pdf.PdfAction.createHide(obj_array1, false);
            fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        assertNotNull(pdfName0);
        assertNotNull(obj_array1);
    }

    @Test
    void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test250");
        com.lowagie.text.exceptions.BadPasswordException badPasswordException1 = new com.lowagie.text.exceptions.BadPasswordException("sybp");
    }

    @Test
    void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test251");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfAcroForm pdfAcroForm1 = new com.lowagie.text.pdf.PdfAcroForm(pdfWriter0);
        boolean b2 = pdfAcroForm1.isOutlineTree();
        com.lowagie.text.pdf.PRIndirectReference pRIndirectReference3 = null;
        pdfAcroForm1.setIndRef(pRIndirectReference3);
        com.lowagie.text.pdf.PdfWriter pdfWriter5 = null;
        com.lowagie.text.pdf.PdfWriter pdfWriter10 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField11 = com.lowagie.text.pdf.PdfFormField.createCheckBox(pdfWriter10);
        com.lowagie.text.pdf.PdfAction pdfAction13 = new com.lowagie.text.pdf.PdfAction("Cp1250");
        pdfFormField11.setAction(pdfAction13);
        com.lowagie.text.pdf.PdfFormField pdfFormField15 = new com.lowagie.text.pdf.PdfFormField(pdfWriter5, (float) 7, (float) 1L, (float) 'a', (float) 30, pdfAction13);
        pdfFormField15.setMappingName("LOCALGOTO");
        pdfFormField15.setUserName("");
        try {
            pdfAcroForm1.setSignatureParams(pdfFormField15, "Ā", (float) 8, (float) 1L, (float) 226, 52.0f);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertEquals(false, b2);
        assertNotNull(pdfFormField11);
    }

    @Test
    void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test252");
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
        com.lowagie.text.pdf.PdfName pdfName40 = com.lowagie.text.pdf.PdfName.FITV;
        pdfWriter4.setPdfVersion(pdfName40);
        pdfWriter4.setPdfVersion('c');
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertNotNull(pdfName35);
        assertNotNull(pdfName36);
        assertNotNull(pdfName40);
    }

    @Test
    void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test253");
        com.lowagie.text.Font font5 = com.lowagie.text.FontFactory.getFont("com.lowagie.text.pdf.hyphenation.HyphenationException: ZapfDingbats", "visibility", false, (-11.660001f), (int) '4');
        assertNotNull(font5);
    }

    @Test
    void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test254");
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
        pdfWriter8.setSigFlags(32768);
        assertNotNull(pdfWriter8);
        assertEquals(1, i9);
        assertNotNull(rectangle17);
        assertEquals(true, b21);
        assertNotNull(pdfPCell26);
        assertEquals(4.0f, f27);
        assertEquals(0.0f, f28);
    }

    @Test
    void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test255");
        byte[] byte_array2 = new byte[]{(byte) -1, (byte) 0};
        com.lowagie.text.pdf.PdfEFStream pdfEFStream3 = new com.lowagie.text.pdf.PdfEFStream(byte_array2);
        java.lang.String str4 = pdfEFStream3.toString();
        assertNotNull(byte_array2);
        assertEquals("Stream", str4, "'" + str4 + "' != '" + "Stream" + "'");
    }

    @Test
    void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test256");
        boolean b1 = com.lowagie.text.pdf.PdfEncodings.isPdfDocEncoding("keeptogether");
        assertEquals(true, b1);
    }

    @Test
    void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test257");
        com.lowagie.text.pdf.fonts.cmaps.CodespaceRange codespaceRange0 = new com.lowagie.text.pdf.fonts.cmaps.CodespaceRange();
        com.lowagie.text.pdf.ByteBuffer byteBuffer2 = new com.lowagie.text.pdf.ByteBuffer(1564);
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields4 = new com.lowagie.text.pdf.PdfCopyFields((java.io.OutputStream) byteBuffer2, 'Ã');
        com.lowagie.text.pdf.PdfReader pdfReader6 = null;
        byte[] byte_array11 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream12 = new com.lowagie.text.pdf.PRStream(pdfReader6, byte_array11);
        com.lowagie.text.pdf.PdfReader pdfReader13 = null;
        byte[] byte_array18 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream19 = new com.lowagie.text.pdf.PRStream(pdfReader13, byte_array18);
        pRStream12.setData(byte_array18, false, (int) (byte) 100);
        byte[] byte_array23 = pRStream12.getBytes();
        com.lowagie.text.pdf.PdfReader pdfReader24 = null;
        byte[] byte_array29 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream30 = new com.lowagie.text.pdf.PRStream(pdfReader24, byte_array29);
        com.lowagie.text.pdf.PdfReader pdfReader31 = null;
        byte[] byte_array36 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream37 = new com.lowagie.text.pdf.PRStream(pdfReader31, byte_array36);
        pRStream30.setData(byte_array36, false, (int) (byte) 100);
        byte[] byte_array41 = pRStream30.getBytes();
        pRStream12.setData(byte_array41);
        com.lowagie.text.pdf.PdfName pdfName43 = com.lowagie.text.pdf.PdfName.FIRSTCHAR;
        java.lang.String str44 = com.lowagie.text.error_messages.MessageLocalization.getComposedMessage("listitem", (java.lang.Object) byte_array41, (java.lang.Object) pdfName43);
        byteBuffer2.write(byte_array41);
        codespaceRange0.setEnd(byte_array41);
        byte[] byte_array47 = codespaceRange0.getStart();
        assertNotNull(byte_array11);
        assertNotNull(byte_array18);
        assertNotNull(byte_array23);
        assertNotNull(byte_array29);
        assertNotNull(byte_array36);
        assertNotNull(byte_array41);
        assertNotNull(pdfName43);
        assertEquals("No message found for listitem", str44, "'" + str44 + "' != '" + "No message found for listitem" + "'");
        assertNull(byte_array47);
    }

    @Test
    void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test258");
        com.lowagie.text.ListItem listItem0 = new com.lowagie.text.ListItem();
        listItem0.setLeading((float) 804);
        com.lowagie.text.pdf.ByteBuffer byteBuffer4 = new com.lowagie.text.pdf.ByteBuffer(1564);
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields6 = new com.lowagie.text.pdf.PdfCopyFields((java.io.OutputStream) byteBuffer4, 'Ã');
        com.lowagie.text.pdf.ByteBuffer byteBuffer8 = byteBuffer4.append(24);
        com.lowagie.text.pdf.PdfReader pdfReader13 = null;
        byte[] byte_array18 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream19 = new com.lowagie.text.pdf.PRStream(pdfReader13, byte_array18);
        com.lowagie.text.pdf.PdfReader pdfReader20 = null;
        byte[] byte_array25 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream26 = new com.lowagie.text.pdf.PRStream(pdfReader20, byte_array25);
        pRStream19.setData(byte_array25, false, (int) (byte) 100);
        byte[] byte_array30 = pRStream19.getBytes();
        com.lowagie.text.pdf.PdfReader pdfReader31 = null;
        byte[] byte_array36 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream37 = new com.lowagie.text.pdf.PRStream(pdfReader31, byte_array36);
        com.lowagie.text.pdf.PdfReader pdfReader38 = null;
        byte[] byte_array43 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream44 = new com.lowagie.text.pdf.PRStream(pdfReader38, byte_array43);
        pRStream37.setData(byte_array43, false, (int) (byte) 100);
        byte[] byte_array48 = pRStream37.getBytes();
        pRStream19.setData(byte_array48);
        byte[] byte_array51 = com.lowagie.text.pdf.crypto.IVGenerator.getIV(0);
        com.lowagie.text.pdf.PRTokeniser pRTokeniser52 = new com.lowagie.text.pdf.PRTokeniser(byte_array51);
        com.lowagie.text.pdf.BaseFont baseFont55 = com.lowagie.text.pdf.BaseFont.createFont("xmp:Thumbnails", "widths", true, false, byte_array48, byte_array51, true, false);
        byteBuffer4.write(byte_array51);
        try {
            boolean b57 = listItem0.add((java.lang.Object) byte_array51);
            fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        assertNotNull(byteBuffer8);
        assertNotNull(byte_array18);
        assertNotNull(byte_array25);
        assertNotNull(byte_array30);
        assertNotNull(byte_array36);
        assertNotNull(byte_array43);
        assertNotNull(byte_array48);
        assertNotNull(byte_array51);
        assertNull(baseFont55);
    }

    @Test
    void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test259");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.IMAGEI;
        assertNotNull(pdfName0);
    }

    @Test
    void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test260");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.LAST;
        com.lowagie.text.pdf.PdfName pdfName1 = com.lowagie.text.pdf.PdfName.KEYWORDS;
        com.lowagie.text.pdf.PdfDeveloperExtension pdfDeveloperExtension3 = new com.lowagie.text.pdf.PdfDeveloperExtension(pdfName0, pdfName1, (int) (short) 10);
        com.lowagie.text.pdf.PdfName pdfName4 = pdfDeveloperExtension3.getBaseversion();
        assertNotNull(pdfName0);
        assertNotNull(pdfName1);
        assertNotNull(pdfName4);
    }

    @Test
    void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test261");
        java.io.OutputStream outputStream0 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields2 = new com.lowagie.text.pdf.PdfCopyFields(outputStream0, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = pdfCopyFields2.getWriter();
        int i4 = pdfWriter3.getCurrentPageNumber();
        com.lowagie.text.pdf.PdfOutline pdfOutline5 = pdfWriter3.getRootOutline();
        com.lowagie.text.pdf.PdfAction pdfAction7 = new com.lowagie.text.pdf.PdfAction();
        try {
            pdfWriter3.addJavaScript("false", pdfAction7);
            fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        assertNotNull(pdfWriter3);
        assertEquals(1, i4);
        assertNull(pdfOutline5);
    }

    @Test
    void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test262");
        int i0 = com.lowagie.text.Annotation.SCREEN;
        assertEquals(7, i0);
    }

    @Test
    void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test263");
        com.lowagie.text.SpecialSymbol specialSymbol0 = new com.lowagie.text.SpecialSymbol();
    }

    @Test
    void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test264");
        com.lowagie.text.RectangleReadOnly rectangleReadOnly4 = new com.lowagie.text.RectangleReadOnly((float) (byte) 100, (float) 1336, (float) 'Ë', (float) 9);
        try {
            rectangleReadOnly4.disableBorderSide(17);
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
    }

    @Test
    void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test265");
        com.lowagie.text.Font font5 = com.lowagie.text.FontFactory.getFont("page-break-after", "face", (float) 30);
        com.lowagie.text.ListItem listItem6 = new com.lowagie.text.ListItem("border-bottom-width", font5);
        com.lowagie.text.Anchor anchor7 = new com.lowagie.text.Anchor("plainwidth", font5);
        java.util.ArrayList arrayList8 = anchor7.getChunks();
        java.lang.String str9 = anchor7.getName();
        boolean b10 = anchor7.isEmpty();
        assertNotNull(font5);
        assertNotNull(arrayList8);
        assertNull(str9);
        assertEquals(false, b10);
    }

    @Test
    void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test266");
        com.lowagie.text.Phrase phrase1 = com.lowagie.text.Phrase.getInstance("table-cell");
        assertNotNull(phrase1);
    }

    @Test
    void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test267");
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
        pdfWriter8.resetFooter();
        com.lowagie.text.pdf.PdfWriter pdfWriter25 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField26 = com.lowagie.text.pdf.PdfFormField.createCheckBox(pdfWriter25);
        pdfFormField26.setQuadding((int) (byte) 100);
        int i30 = pdfFormField26.setFieldFlags((-56509343));
        try {
            com.lowagie.text.pdf.events.FieldPositioningEvents fieldPositioningEvents32 = new com.lowagie.text.pdf.events.FieldPositioningEvents(pdfWriter8, pdfFormField26, "Right");
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfWriter8);
        assertEquals(1, i9);
        assertNotNull(rectangle17);
        assertEquals(true, b21);
        assertNotNull(pdfFormField26);
        assertEquals(0, i30);
    }

    @Test
    void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test268");
        java.lang.String str0 = com.lowagie.text.html.Markup.CSS_KEY_PADDINGTOP;
        assertEquals("padding-top", str0, "'" + str0 + "' != '" + "padding-top" + "'");
    }

    @Test
    void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test269");
        com.lowagie.text.pdf.AcroFields.Item item0 = new com.lowagie.text.pdf.AcroFields.Item();
        int i1 = item0.size();
        assertEquals(0, i1);
    }

    @Test
    void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test270");
        com.lowagie.text.pdf.PdfNull pdfNull0 = com.lowagie.text.pdf.PdfNull.PDFNULL;
        assertNotNull(pdfNull0);
    }

    @Test
    void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test271");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.NUMCOPIES;
        assertNotNull(pdfName0);
    }

    @Test
    void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test272");
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
        com.lowagie.text.pdf.PdfAcroForm pdfAcroForm38 = pdfWriter4.getAcroForm();
        com.lowagie.text.pdf.PdfWriter pdfWriter39 = null;
        com.lowagie.text.pdf.PdfWriter pdfWriter44 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField45 = com.lowagie.text.pdf.PdfFormField.createCheckBox(pdfWriter44);
        com.lowagie.text.pdf.PdfAction pdfAction47 = new com.lowagie.text.pdf.PdfAction("Cp1250");
        pdfFormField45.setAction(pdfAction47);
        com.lowagie.text.pdf.PdfFormField pdfFormField49 = new com.lowagie.text.pdf.PdfFormField(pdfWriter39, (float) 7, (float) 1L, (float) 'a', (float) 30, pdfAction47);
        com.lowagie.text.pdf.BaseFont baseFont51 = null;
        com.lowagie.text.Font font54 = new com.lowagie.text.Font(baseFont51, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont56 = font54.getCalculatedBaseFont(false);
        java.lang.String[] str_array57 = baseFont56.getDifferences();
        try {
            pdfAcroForm38.drawButton(pdfFormField49, "tablefitspage", baseFont56, (float) 764, (float) '翿', (float) 4096, 0.8f, (float) 0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertNotNull(pdfName35);
        assertNotNull(pdfName36);
        assertNotNull(pdfAcroForm38);
        assertNotNull(pdfFormField45);
        assertNotNull(baseFont56);
        assertNotNull(str_array57);
    }

    @Test
    void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test273");
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
        try {
            pdfWriter4.close();
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (com.lowagie.text.ExceptionConverter e) {
        }
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
    }

    @Test
    void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test274");
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
        com.lowagie.text.pdf.PdfName pdfName40 = com.lowagie.text.pdf.PdfName.FITV;
        pdfWriter4.setPdfVersion(pdfName40);
        boolean b42 = pdfWriter4.isPaused();
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertNotNull(pdfName35);
        assertNotNull(pdfName36);
        assertNotNull(pdfName40);
        assertEquals(false, b42);
    }

    @Test
    void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test275");
        byte byte0 = com.lowagie.text.DocWriter.QUOTE;
        assertEquals(byte0, (byte) 34);
    }

    @Test
    void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test276");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.UR3;
        com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS pPKMS1 = new com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS();
        com.lowagie.text.pdf.PdfReader pdfReader2 = null;
        byte[] byte_array7 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream8 = new com.lowagie.text.pdf.PRStream(pdfReader2, byte_array7);
        pPKMS1.setCert(byte_array7);
        com.lowagie.text.pdf.PdfName pdfName10 = com.lowagie.text.pdf.PdfName.XFA;
        com.lowagie.text.pdf.PdfObject pdfObject11 = pPKMS1.get(pdfName10);
        com.lowagie.text.pdf.PdfObject pdfObject12 = com.lowagie.text.pdf.PdfReader.getPdfObjectRelease((com.lowagie.text.pdf.PdfObject) pdfName0, pdfObject11);
        assertNotNull(pdfName0);
        assertNotNull(byte_array7);
        assertNotNull(pdfName10);
        assertNull(pdfObject11);
        assertNotNull(pdfObject12);
    }

    @Test
    void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test277");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DEFAULTGRAY;
        assertNotNull(pdfName0);
    }

    @Test
    void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test278");
        com.lowagie.text.pdf.hyphenation.Hyphenator hyphenator4 = new com.lowagie.text.pdf.hyphenation.Hyphenator("convert2pdfp", "af", (int) 'a', 526);
    }

    @Test
    void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test279");
        java.lang.String str0 = com.lowagie.text.FontFactory.HELVETICA_BOLDOBLIQUE;
        assertEquals("Helvetica-BoldOblique", str0, "'" + str0 + "' != '" + "Helvetica-BoldOblique" + "'");
    }

    @Test
    void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test280");
        int i0 = com.lowagie.text.Element.ALIGN_LEFT;
        assertEquals(0, i0);
    }

    @Test
    void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test281");
        int i0 = com.lowagie.text.pdf.PdfPageLabels.DECIMAL_ARABIC_NUMERALS;
        assertEquals(0, i0);
    }

    @Test
    void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test282");
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
        com.lowagie.text.pdf.PdfReader pdfReader32 = null;
        byte[] byte_array37 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream38 = new com.lowagie.text.pdf.PRStream(pdfReader32, byte_array37);
        com.lowagie.text.pdf.PdfReader pdfReader39 = null;
        byte[] byte_array44 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream45 = new com.lowagie.text.pdf.PRStream(pdfReader39, byte_array44);
        pRStream38.setData(byte_array44, false, (int) (byte) 100);
        java.lang.String str49 = pRStream38.toString();
        com.lowagie.text.pdf.PdfReader pdfReader50 = null;
        com.lowagie.text.pdf.PRStream pRStream51 = new com.lowagie.text.pdf.PRStream(pRStream31, (com.lowagie.text.pdf.PdfDictionary) pRStream38, pdfReader50);
        assertNotNull(byte_array5);
        assertNotNull(byte_array12);
        assertNotNull(rectangle25);
        assertNotNull(f_array_array27);
        assertNotNull(pdfAnnotation28);
        assertEquals(false, b29);
        assertEquals(i30, (-1));
        assertNotNull(byte_array37);
        assertNotNull(byte_array44);
        assertEquals("Stream", str49, "'" + str49 + "' != '" + "Stream" + "'");
    }

    @Test
    void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test283");
        org.w3c.dom.Node node0 = null;
        try {
            com.lowagie.text.pdf.XfaForm.Xml2SomDatasets xml2SomDatasets1 = new com.lowagie.text.pdf.XfaForm.Xml2SomDatasets(node0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test284");
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
        boolean b30 = pdfWriter8.isPdfX();
        assertNotNull(pdfWriter8);
        assertEquals(1, i9);
        assertNotNull(rectangle17);
        assertEquals(true, b21);
        assertNotNull(pdfPCell26);
        assertEquals(4.0f, f27);
        assertEquals(0.0f, f28);
        assertEquals(false, b30);
    }

    @Test
    void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test285");
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
        com.lowagie.text.pdf.PdfAcroForm pdfAcroForm38 = pdfWriter4.getAcroForm();
        com.lowagie.text.pdf.PdfWriter pdfWriter43 = null;
        char[] char_array46 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font48 = new com.lowagie.text.pdf.Type3Font(pdfWriter43, char_array46, true);
        java.lang.String[][] str_array_array49 = type3Font48.getAllNameEntries();
        try {
            com.lowagie.text.pdf.PdfFormField pdfFormField55 = pdfAcroForm38.addHtmlPostButton("title", "HeiseiKakuGo-W5", "a", "grayfill", (com.lowagie.text.pdf.BaseFont) type3Font48, 227.64f, (float) 10, (float) (byte) 32, (float) (byte) 34, (float) 16384);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertNotNull(pdfName35);
        assertNotNull(pdfName36);
        assertNotNull(pdfAcroForm38);
        assertNotNull(char_array46);
        assertNotNull(str_array_array49);
    }

    @Test
    void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test286");
        com.lowagie.text.Anchor anchor0 = new com.lowagie.text.Anchor();
    }

    @Test
    void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test287");
        try {
            com.lowagie.text.pdf.PdfDestination pdfDestination1 = new com.lowagie.text.pdf.PdfDestination("No message found for listitem");
            fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test288");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TRIMBOX;
        assertNotNull(pdfName0);
    }

    @Test
    void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test289");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        pdfPTable1.setSpacingBefore((float) 15);
        com.lowagie.text.pdf.PdfPCell pdfPCell5 = pdfPTable1.getDefaultCell();
        pdfPCell5.setUseAscender(false);
        assertNotNull(pdfPCell2);
        assertNotNull(pdfPCell5);
    }

    @Test
    void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test290");
        com.lowagie.text.xml.XMLUtil xMLUtil0 = new com.lowagie.text.xml.XMLUtil();
    }

    @Test
    void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test291");
        java.lang.String str0 = com.lowagie.text.ElementTags.ANCHOR;
        assertEquals("anchor", str0, "'" + str0 + "' != '" + "anchor" + "'");
    }

    @Test
    void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test292");
        com.lowagie.text.Rectangle rectangle5 = new com.lowagie.text.Rectangle((float) 531, (float) 1564, (float) (short) 0, Float.NaN, 1078);
    }

    @Test
    void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test293");
        com.lowagie.text.pdf.PdfContentByte pdfContentByte0 = null;
        com.lowagie.text.pdf.ColumnText columnText1 = new com.lowagie.text.pdf.ColumnText(pdfContentByte0);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte2 = null;
        columnText1.setCanvas(pdfContentByte2);
        com.lowagie.text.pdf.PdfContentByte[] pdfContentByte_array4 = columnText1.getCanvases();
        columnText1.setSpaceCharRatio(0.0f);
        com.lowagie.text.Font font11 = com.lowagie.text.FontFactory.getFont("page-break-after", "face", (float) 30);
        com.lowagie.text.ListItem listItem12 = new com.lowagie.text.ListItem("border-bottom-width", font11);
        float f13 = listItem12.getIndentationRight();
        listItem12.setKeepTogether(true);
        com.lowagie.text.Chunk chunk16 = new com.lowagie.text.Chunk();
        com.lowagie.text.Image image17 = chunk16.getImage();
        com.lowagie.text.Chunk chunk19 = chunk16.setAnchor("");
        java.lang.String[] str_array30 = new java.lang.String[]{"dc:date", "Identity-V", "convert2pdfp", "widths", "class", "", "Right", "xmp:ModifyDate", "Right", "UnicodeBig"};
        java.util.ArrayList<java.lang.String> arraylist_str31 = new java.util.ArrayList<java.lang.String>();
        boolean b32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str31, str_array30);
        com.lowagie.text.pdf.PdfReader pdfReader33 = null;
        byte[] byte_array38 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream39 = new com.lowagie.text.pdf.PRStream(pdfReader33, byte_array38);
        com.lowagie.text.pdf.PdfReader pdfReader40 = null;
        byte[] byte_array45 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream46 = new com.lowagie.text.pdf.PRStream(pdfReader40, byte_array45);
        pRStream39.setData(byte_array45, false, (int) (byte) 100);
        java.lang.String str50 = pRStream39.toString();
        boolean b51 = arraylist_str31.contains((java.lang.Object) str50);
        com.lowagie.text.pdf.BaseFont baseFont52 = null;
        com.lowagie.text.Font font55 = new com.lowagie.text.Font(baseFont52, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont57 = font55.getCalculatedBaseFont(false);
        boolean b60 = baseFont57.setCharAdvance(9, 0);
        java.awt.Color color66 = java.awt.Color.getHSBColor(100.0f, (float) (short) 1, 100.0f);
        int i67 = com.lowagie.text.pdf.ExtendedColor.getType(color66);
        com.lowagie.text.Font font68 = new com.lowagie.text.Font(baseFont57, (float) (-1), (int) 'Ã', color66);
        int i69 = arraylist_str31.indexOf((java.lang.Object) color66);
        com.lowagie.text.pdf.PdfArray pdfArray70 = com.lowagie.text.pdf.PdfAnnotation.getMKColor(color66);
        java.awt.Color color71 = java.awt.Color.orange;
        com.lowagie.text.pdf.PdfShading.checkCompatibleColors(color66, color71);
        com.lowagie.text.Chunk chunk77 = chunk19.setBackground(color66, (float) 1L, (float) 0L, (float) '#', 10.0f);
        listItem12.setListSymbol(chunk77);
        columnText1.addText(chunk77);
        assertNull(pdfContentByte_array4);
        assertNotNull(font11);
        assertEquals(0.0f, f13);
        assertNull(image17);
        assertNotNull(chunk19);
        assertNotNull(str_array30);
        assertEquals(true, b32);
        assertNotNull(byte_array38);
        assertNotNull(byte_array45);
        assertEquals("Stream", str50, "'" + str50 + "' != '" + "Stream" + "'");
        assertEquals(false, b51);
        assertNotNull(baseFont57);
        assertEquals(true, b60);
        assertNotNull(color66);
        assertEquals(0, i67);
        assertEquals(i69, (-1));
        assertNotNull(pdfArray70);
        assertNotNull(color71);
        assertNotNull(chunk77);
    }

    @Test
    void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test294");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.BC;
        assertNotNull(pdfName0);
    }

    @Test
    void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test295");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Paragraph paragraph5 = com.lowagie.text.factories.ElementFactory.getParagraph(properties1);
        int i6 = properties1.size();
        com.lowagie.text.Table table7 = com.lowagie.text.factories.ElementFactory.getTable(properties1);
        boolean b8 = table7.isLocked();
        table7.setWidth((float) 200);
        java.util.Properties properties12 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b13 = properties12.isEmpty();
        boolean b15 = properties12.contains((java.lang.Object) 14);
        com.lowagie.text.Cell cell16 = com.lowagie.text.factories.ElementFactory.getCell(properties12);
        cell16.setMaxLines(50);
        java.awt.Point point19 = null;
        try {
            table7.addCell(cell16, point19);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(paragraph5);
        assertEquals(0, i6);
        assertNotNull(table7);
        assertEquals(false, b8);
        assertNotNull(properties12);
        assertEquals(true, b13);
        assertEquals(false, b15);
        assertNotNull(cell16);
    }

    @Test
    void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test296");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField1 = com.lowagie.text.pdf.PdfFormField.createCheckBox(pdfWriter0);
        pdfFormField1.setValueAsName("SKEW");
        com.lowagie.text.pdf.PdfName pdfName4 = com.lowagie.text.pdf.PdfName.U;
        com.lowagie.text.pdf.PdfObject pdfObject5 = com.lowagie.text.pdf.PdfReader.getPdfObjectRelease((com.lowagie.text.pdf.PdfObject) pdfFormField1, (com.lowagie.text.pdf.PdfObject) pdfName4);
        java.util.Set<com.lowagie.text.pdf.PdfName> set_pdfName6 = pdfFormField1.getKeys();
        assertNotNull(pdfFormField1);
        assertNotNull(pdfName4);
        assertNotNull(pdfObject5);
        assertNotNull(set_pdfName6);
    }

    @Test
    void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test297");
        com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS pPKMS0 = new com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS();
        com.lowagie.text.Font font2 = null;
        com.lowagie.text.Footnote footnote3 = new com.lowagie.text.Footnote("", font2);
        int[] i_array8 = new int[]{(short) 1, 1785737760, 8, 100};
        com.lowagie.text.pdf.SimpleBookmark.eliminatePages((java.util.List) footnote3, i_array8);
        pPKMS0.setByteRange(i_array8);
        com.lowagie.text.pdf.PdfDate pdfDate11 = null;
        pPKMS0.setDate(pdfDate11);
        assertNotNull(i_array8);
    }

    @Test
    void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test298");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_SETBKCOLOR;
        assertEquals(513, i0);
    }

    @Test
    void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test299");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.WIN;
        assertNotNull(pdfName0);
    }

    @Test
    void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test300");
        com.lowagie.text.pdf.PdfPCell[] pdfPCell_array0 = new com.lowagie.text.pdf.PdfPCell[]{};
        com.lowagie.text.pdf.PdfPRow pdfPRow1 = new com.lowagie.text.pdf.PdfPRow(pdfPCell_array0);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte6 = null;
        com.lowagie.text.pdf.PdfContentByte[] pdfContentByte_array7 = new com.lowagie.text.pdf.PdfContentByte[]{pdfContentByte6};
        pdfPRow1.writeCells(526, 6, (float) (short) 1, (float) 53, pdfContentByte_array7);
        try {
            com.lowagie.text.pdf.PdfPTable.endWritingRows(pdfContentByte_array7);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfPCell_array0);
        assertNotNull(pdfContentByte_array7);
    }

    @Test
    void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test301");
        try {
            com.lowagie.text.pdf.FdfReader fdfReader1 = new com.lowagie.text.pdf.FdfReader("author");
            fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
    }

    @Test
    void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test302");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DCTDECODE;
        assertNotNull(pdfName0);
    }

    @Test
    void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test303");
        byte[] byte_array1 = com.lowagie.text.pdf.crypto.IVGenerator.getIV(0);
        com.lowagie.text.pdf.PRTokeniser pRTokeniser2 = new com.lowagie.text.pdf.PRTokeniser(byte_array1);
        int i3 = pRTokeniser2.length();
        int i4 = pRTokeniser2.getFilePointer();
        boolean b5 = pRTokeniser2.isHexString();
        assertNotNull(byte_array1);
        assertEquals(0, i3);
        assertEquals(0, i4);
        assertEquals(false, b5);
    }

    @Test
    void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test304");
        int i0 = com.lowagie.text.pdf.BarcodePDF417.PDF417_INVERT_BITMAP;
        assertEquals(128, i0);
    }

    @Test
    void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test305");
        com.lowagie.text.RomanList romanList2 = new com.lowagie.text.RomanList(true, 247);
        romanList2.setNumbered(true);
    }

    @Test
    void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test306");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        float f3 = pdfPCell2.getIndent();
        com.lowagie.text.pdf.PdfPTable pdfPTable4 = pdfPCell2.getTable();
        com.lowagie.text.pdf.PdfPCellEvent pdfPCellEvent5 = pdfPCell2.getCellEvent();
        int i6 = pdfPCell2.getRowspan();
        pdfPCell2.setNoWrap(true);
        boolean b9 = pdfPCell2.hasMinimumHeight();
        assertNotNull(pdfPCell2);
        assertEquals(0.0f, f3);
        assertNull(pdfPTable4);
        assertNull(pdfPCellEvent5);
        assertEquals(1, i6);
        assertEquals(false, b9);
    }

    @Test
    void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test307");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        float f3 = pdfPTable1.getTotalHeight();
        float f4 = pdfPTable1.spacingAfter();
        assertNotNull(pdfPCell2);
        assertEquals(0.0f, f3);
        assertEquals(0.0f, f4);
    }

    @Test
    void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test308");
        java.lang.String str0 = com.lowagie.text.ElementTags.INDENT;
        assertEquals("indent", str0, "'" + str0 + "' != '" + "indent" + "'");
    }

    @Test
    void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test309");
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
        float f11 = columnText10.getRightIndent();
        assertEquals(0.0f, f2);
        assertNull(pdfContentByte_array7);
        assertNotNull(columnText10);
        assertEquals(0.0f, f11);
    }

    @Test
    void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test310");
        int i0 = com.lowagie.text.pdf.PdfContentByte.TEXT_RENDER_MODE_FILL_CLIP;
        assertEquals(4, i0);
    }

    @Test
    void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test311");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfLayerMembership.ALLON;
        assertNotNull(pdfName0);
    }

    @Test
    void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test312");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.SIGREF;
        assertNotNull(pdfName0);
    }

    @Test
    void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test313");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaObject.META_BRUSH;
        assertEquals(2, i0);
    }

    @Test
    void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test314");
        com.lowagie.text.Rectangle rectangle0 = com.lowagie.text.PageSize.B4;
        float f2 = rectangle0.getBottom((float) 34);
        assertNotNull(rectangle0);
        assertEquals(34.0f, f2);
    }

    @Test
    void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test315");
        com.lowagie.text.pdf.PdfPublicKeySecurityHandler pdfPublicKeySecurityHandler0 = new com.lowagie.text.pdf.PdfPublicKeySecurityHandler();
        try {
            byte[] byte_array2 = pdfPublicKeySecurityHandler0.getEncodedRecipient(0);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
    }

    @Test
    void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test316");
        float f1 = com.lowagie.text.Utilities.inchesToMillimeters((float) 1651532643);
        assertEquals(4.194893E10f, f1);
    }

    @Test
    void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test317");
        byte[] byte_array1 = com.lowagie.text.pdf.crypto.IVGenerator.getIV(0);
        com.lowagie.text.pdf.PRTokeniser pRTokeniser2 = new com.lowagie.text.pdf.PRTokeniser(byte_array1);
        int i3 = pRTokeniser2.length();
        int i4 = pRTokeniser2.getFilePointer();
        pRTokeniser2.close();
        pRTokeniser2.backOnePosition((int) 'c');
        int i8 = pRTokeniser2.getGeneration();
        assertNotNull(byte_array1);
        assertEquals(0, i3);
        assertEquals(0, i4);
        assertEquals(0, i8);
    }

    @Test
    void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test318");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.XREFSTM;
        assertNotNull(pdfName0);
    }

    @Test
    void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test319");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField1 = com.lowagie.text.pdf.PdfFormField.createCheckBox(pdfWriter0);
        pdfFormField1.setValueAsName("SKEW");
        pdfFormField1.setDefaultValueAsName("itext");
        assertNotNull(pdfFormField1);
    }

    @Test
    void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test320");
        byte[] byte_array2 = new byte[]{(byte) 100, (byte) 10};
        com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray3 = new com.lowagie.text.pdf.RandomAccessFileOrArray(byte_array2);
        try {
            double d4 = randomAccessFileOrArray3.readDouble();
            fail("Expected exception of type java.io.EOFException");
        } catch (java.io.EOFException e) {
        }
        assertNotNull(byte_array2);
    }

    @Test
    void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test321");
        com.lowagie.text.pdf.XfaForm.Stack2 stack2_0 = new com.lowagie.text.pdf.XfaForm.Stack2();
    }

    @Test
    void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test322");
        java.awt.Color color2 = java.awt.Color.orange;
        com.lowagie.text.Font font3 = com.lowagie.text.FontFactory.getFont("hi!", (float) (byte) 47, color2);
        com.lowagie.text.pdf.BaseFont baseFont5 = font3.getCalculatedBaseFont(false);
        boolean b8 = baseFont5.setCharAdvance(36, 100);
        int i10 = baseFont5.getAscent("/PaintType");
        assertNotNull(color2);
        assertNotNull(font3);
        assertNotNull(baseFont5);
        assertEquals(true, b8);
        assertEquals(737, i10);
    }

    @Test
    void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test323");
        com.lowagie.text.pdf.collection.PdfTargetDictionary pdfTargetDictionary1 = new com.lowagie.text.pdf.collection.PdfTargetDictionary(false);
        pdfTargetDictionary1.setEmbeddedFileName("inline");
    }

    @Test
    void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test324");
        com.lowagie.text.Table table2 = new com.lowagie.text.Table(13, 1791);
        try {
            java.lang.Object obj5 = table2.getElement((int) '6', (int) '搊');
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
    }

    @Test
    void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test325");
        int i0 = com.lowagie.text.Jpeg2000.JP2_JP2C;
        assertEquals(1785737827, i0);
    }

    @Test
    void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test326");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        pdfPTable1.setSpacingBefore((float) 15);
        com.lowagie.text.pdf.PdfPTable pdfPTable5 = new com.lowagie.text.pdf.PdfPTable(pdfPTable1);
        pdfPTable5.setFooterRows(14);
        pdfPTable5.setTotalWidth((float) 264);
        assertNotNull(pdfPCell2);
    }

    @Test
    void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test327");
        java.security.cert.Certificate certificate1 = null;
        java.security.Key key2 = null;
        try {
            com.lowagie.text.pdf.PdfReader pdfReader4 = new com.lowagie.text.pdf.PdfReader("a", certificate1, key2, "pdfaid");
            fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
    }

    @Test
    void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test328");
        com.lowagie.text.Chapter chapter1 = new com.lowagie.text.Chapter((int) (short) -1);
        com.lowagie.text.MarkedSection markedSection2 = chapter1.addMarkedSection();
        com.lowagie.text.Font font8 = com.lowagie.text.FontFactory.getFont("page-break-after", "face", (float) 30);
        com.lowagie.text.ListItem listItem9 = new com.lowagie.text.ListItem("border-bottom-width", font8);
        float f10 = listItem9.getIndentationRight();
        com.lowagie.text.Section section11 = chapter1.addSection((float) 302, (com.lowagie.text.Paragraph) listItem9);
        int i12 = listItem9.type();
        assertNotNull(markedSection2);
        assertNotNull(font8);
        assertEquals(0.0f, f10);
        assertNotNull(section11);
        assertEquals(15, i12);
    }

    @Test
    void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test329");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.LINK;
        assertNotNull(pdfName0);
    }

    @Test
    void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test330");
        float f0 = com.lowagie.text.Document.wmfFontCorrection;
        assertEquals(0.86f, f0);
    }

    @Test
    void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test331");
        com.lowagie.text.pdf.PdfDestination pdfDestination2 = new com.lowagie.text.pdf.PdfDestination((int) (byte) 47, (float) 1);
        com.lowagie.text.pdf.PdfIndirectReference pdfIndirectReference3 = null;
        boolean b4 = pdfDestination2.addPage(pdfIndirectReference3);
        boolean b5 = pdfDestination2.isEmpty();
        com.lowagie.text.pdf.PdfIndirectReference pdfIndirectReference6 = null;
        boolean b7 = pdfDestination2.addPage(pdfIndirectReference6);
        assertEquals(true, b4);
        assertEquals(false, b5);
        assertEquals(false, b7);
    }

    @Test
    void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test332");
        java.lang.String str0 = com.lowagie.text.FontFactory.HELVETICA_OBLIQUE;
        assertEquals("Helvetica-Oblique", str0, "'" + str0 + "' != '" + "Helvetica-Oblique" + "'");
    }

    @Test
    void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test333");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.OUTPUTCONDITIONIDENTIFIER;
        assertNotNull(pdfName0);
    }

    @Test
    void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test334");
        java.lang.String str0 = com.lowagie.text.ElementTags.ALIGN_LEFT;
        assertEquals("Left", str0, "'" + str0 + "' != '" + "Left" + "'");
    }

    @Test
    void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test335");
        com.lowagie.text.ListItem listItem0 = new com.lowagie.text.ListItem();
        listItem0.setLeading((float) 804);
        com.lowagie.text.Chapter chapter4 = new com.lowagie.text.Chapter((com.lowagie.text.Paragraph) listItem0, 262);
        com.lowagie.text.Section section7 = chapter4.addSection("UniCNS-UCS2-V", 259);
        com.lowagie.text.Paragraph paragraph8 = chapter4.getBookmarkTitle();
        java.io.Writer writer9 = null;
        try {
            com.lowagie.text.pdf.SimpleBookmark.exportToXMLNode((java.util.List) paragraph8, writer9, (-1), true);
            fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        assertNotNull(section7);
        assertNotNull(paragraph8);
    }

    @Test
    void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test336");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.IMAGEC;
        assertNotNull(pdfName0);
    }

    @Test
    void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test337");
        com.lowagie.text.Font font1 = null;
        com.lowagie.text.Footnote footnote2 = new com.lowagie.text.Footnote("", font1);
        com.lowagie.text.HeaderFooter headerFooter4 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote2, true);
        headerFooter4.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle7 = headerFooter4.rotate();
        com.lowagie.text.Rectangle rectangle8 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter4);
        com.lowagie.text.Document document9 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter4);
        java.lang.String str10 = document9.getJavaScript_onUnLoad();
        assertNotNull(rectangle7);
        assertNull(str10);
    }

    @Test
    void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test338");
        int i0 = com.lowagie.text.Element.ANCHOR;
        assertEquals(17, i0);
    }

    @Test
    void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test339");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.CIDTOGIDMAP;
        assertNotNull(pdfName0);
    }

    @Test
    void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test340");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.CO;
        assertNotNull(pdfName0);
    }

    @Test
    void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test341");
        try {
            com.lowagie.text.pdf.PdfShading.throwColorSpaceError();
            fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test342");
        java.lang.String str0 = com.lowagie.text.xml.xmp.XmpArray.ORDERED;
        assertEquals("rdf:Seq", str0, "'" + str0 + "' != '" + "rdf:Seq" + "'");
    }

    @Test
    void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test343");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfAcroForm pdfAcroForm1 = new com.lowagie.text.pdf.PdfAcroForm(pdfWriter0);
        pdfAcroForm1.setNeedAppearances(true);
        com.lowagie.text.pdf.PdfFormField pdfFormField7 = pdfAcroForm1.getRadioGroup("top", "UTF-16", true);
        com.lowagie.text.pdf.PdfReader pdfReader8 = null;
        byte[] byte_array13 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream14 = new com.lowagie.text.pdf.PRStream(pdfReader8, byte_array13);
        com.lowagie.text.pdf.PdfReader pdfReader15 = null;
        byte[] byte_array20 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream21 = new com.lowagie.text.pdf.PRStream(pdfReader15, byte_array20);
        pRStream14.setData(byte_array20, false, (int) (byte) 100);
        com.lowagie.text.pdf.PdfWriter pdfWriter25 = null;
        com.lowagie.text.Font font27 = null;
        com.lowagie.text.Footnote footnote28 = new com.lowagie.text.Footnote("", font27);
        com.lowagie.text.HeaderFooter headerFooter30 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote28, true);
        headerFooter30.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle33 = headerFooter30.rotate();
        float[][] f_array_array35 = new float[][]{};
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation36 = com.lowagie.text.pdf.PdfAnnotation.createInk(pdfWriter25, (com.lowagie.text.Rectangle) headerFooter30, "widths", f_array_array35);
        boolean b37 = pdfAnnotation36.isOutlineTree();
        int i38 = pdfAnnotation36.getPlaceInPage();
        com.lowagie.text.pdf.PRStream pRStream39 = new com.lowagie.text.pdf.PRStream(pRStream14, (com.lowagie.text.pdf.PdfDictionary) pdfAnnotation36);
        com.lowagie.text.pdf.PdfName pdfName40 = com.lowagie.text.pdf.PdfName.PG;
        boolean b41 = pdfName40.isBoolean();
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper42 = new com.lowagie.text.pdf.PdfPageEventHelper();
        java.io.OutputStream outputStream43 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields45 = new com.lowagie.text.pdf.PdfCopyFields(outputStream43, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter46 = pdfCopyFields45.getWriter();
        com.lowagie.text.Font font48 = null;
        com.lowagie.text.Footnote footnote49 = new com.lowagie.text.Footnote("", font48);
        com.lowagie.text.HeaderFooter headerFooter51 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote49, true);
        headerFooter51.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle54 = headerFooter51.rotate();
        com.lowagie.text.Rectangle rectangle55 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter51);
        com.lowagie.text.Document document56 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter51);
        boolean b58 = document56.setMarginMirroringTopBottom(true);
        com.lowagie.text.Font font62 = null;
        com.lowagie.text.Footnote footnote63 = new com.lowagie.text.Footnote("", font62);
        com.lowagie.text.HeaderFooter headerFooter65 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote63, true);
        headerFooter65.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph68 = headerFooter65.paragraph();
        pdfPageEventHelper42.onSection(pdfWriter46, document56, (float) 7, 262144, paragraph68);
        pdfWriter46.setStrictImageSequence(false);
        pdfWriter46.setEncryption(false, "true", "bottom", 1336);
        com.lowagie.text.pdf.PdfName pdfName77 = com.lowagie.text.pdf.PdfName.NONE;
        com.lowagie.text.pdf.PdfName pdfName78 = com.lowagie.text.pdf.PdfName.XREF;
        pdfWriter46.setDefaultColorspace(pdfName77, (com.lowagie.text.pdf.PdfObject) pdfName78);
        java.lang.String[] str_array86 = new java.lang.String[]{"bottom", "grayfill", "Helvetica-Oblique", "<?xpacket end=\"r\"?>", "sybp"};
        com.lowagie.text.pdf.PdfFormField pdfFormField88 = com.lowagie.text.pdf.PdfFormField.createCombo(pdfWriter46, false, str_array86, 1078);
        pdfAnnotation36.put(pdfName40, (com.lowagie.text.pdf.PdfObject) pdfFormField88);
        try {
            com.lowagie.text.pdf.PdfFormField pdfFormField95 = pdfAcroForm1.addRadioButton(pdfFormField88, "/PaintType", (float) 32, (float) 1L, 4.0f, (-1048577.0f));
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfFormField7);
        assertNotNull(byte_array13);
        assertNotNull(byte_array20);
        assertNotNull(rectangle33);
        assertNotNull(f_array_array35);
        assertNotNull(pdfAnnotation36);
        assertEquals(false, b37);
        assertEquals(i38, (-1));
        assertNotNull(pdfName40);
        assertEquals(false, b41);
        assertNotNull(pdfWriter46);
        assertNotNull(rectangle54);
        assertEquals(true, b58);
        assertNotNull(paragraph68);
        assertNotNull(pdfName77);
        assertNotNull(pdfName78);
        assertNotNull(str_array86);
        assertNotNull(pdfFormField88);
    }

    @Test
    void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test344");
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
        try {
            com.lowagie.text.pdf.PdfPKCS7 pdfPKCS7_48 = new com.lowagie.text.pdf.PdfPKCS7(byte_array39, "Left");
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (com.lowagie.text.ExceptionConverter e) {
        }
        assertNotNull(byte_array9);
        assertNotNull(byte_array16);
        assertNotNull(byte_array21);
        assertNotNull(byte_array27);
        assertNotNull(byte_array34);
        assertNotNull(byte_array39);
        assertNotNull(byte_array42);
        assertNull(baseFont46);
    }

    @Test
    void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test345");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DOCOPEN;
        assertNotNull(pdfName0);
    }

    @Test
    void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test346");
        com.lowagie.text.pdf.BarcodePostnet barcodePostnet0 = new com.lowagie.text.pdf.BarcodePostnet();
    }

    @Test
    void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test347");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ASCENT;
        assertNotNull(pdfName0);
    }

    @Test
    void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test348");
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
            pdfCopy14.copyAcroForm(pdfReader16);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(rectangle10);
        assertEquals(false, b15);
    }

    @Test
    void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test349");
        int i0 = com.lowagie.text.pdf.parser.Matrix.I13;
        assertEquals(2, i0);
    }

    @Test
    void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test350");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.USETHUMBS;
        assertNotNull(pdfName0);
    }

    @Test
    void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test351");
        com.lowagie.text.pdf.GrayColor grayColor1 = new com.lowagie.text.pdf.GrayColor(2);
        com.lowagie.text.pdf.PdfLiteral pdfLiteral2 = com.lowagie.text.pdf.PdfFormXObject.MATRIX;
        boolean b3 = grayColor1.equals((java.lang.Object) pdfLiteral2);
        java.awt.Color color4 = java.awt.Color.gray;
        boolean b5 = grayColor1.equals((java.lang.Object) color4);
        assertNotNull(pdfLiteral2);
        assertEquals(false, b3);
        assertNotNull(color4);
        assertEquals(false, b5);
    }

    @Test
    void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test352");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.IMAGE;
        assertNotNull(pdfName0);
    }

    @Test
    void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test353");
        char char0 = com.lowagie.text.pdf.Barcode128.FNC4;
        assertEquals('È', char0);
    }

    @Test
    void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test354");
        com.lowagie.text.pdf.Barcode128 barcode128_0 = new com.lowagie.text.pdf.Barcode128();
        com.lowagie.text.pdf.Barcode39 barcode39_1 = new com.lowagie.text.pdf.Barcode39();
        barcode39_1.setCodeType(0);
        com.lowagie.text.pdf.BarcodeEANSUPP barcodeEANSUPP4 = new com.lowagie.text.pdf.BarcodeEANSUPP((com.lowagie.text.pdf.Barcode) barcode128_0, (com.lowagie.text.pdf.Barcode) barcode39_1);
        barcode39_1.setStartStopText(false);
        boolean b7 = barcode39_1.isGuardBars();
        assertEquals(false, b7);
    }

    @Test
    void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test355");
        byte[] byte_array1 = new byte[]{(byte) 32};
        byte[] byte_array2 = com.lowagie.text.pdf.PdfReader.LZWDecode(byte_array1);
        try {
            com.lowagie.text.Image image3 = com.lowagie.text.ImageLoader.getTiffImage(byte_array2);
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (com.lowagie.text.ExceptionConverter e) {
        }
        assertNotNull(byte_array1);
        assertNotNull(byte_array2);
    }

    @Test
    void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test356");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfWriter pdfWriter5 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField6 = com.lowagie.text.pdf.PdfFormField.createCheckBox(pdfWriter5);
        com.lowagie.text.pdf.PdfAction pdfAction8 = new com.lowagie.text.pdf.PdfAction("Cp1250");
        pdfFormField6.setAction(pdfAction8);
        com.lowagie.text.pdf.PdfFormField pdfFormField10 = new com.lowagie.text.pdf.PdfFormField(pdfWriter0, (float) 7, (float) 1L, (float) 'a', (float) 30, pdfAction8);
        java.lang.String str11 = pdfAction8.toString();
        assertNotNull(pdfFormField6);
        assertEquals("Dictionary", str11, "'" + str11 + "' != '" + "Dictionary" + "'");
    }

    @Test
    void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test357");
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
        float f11 = columnText4.getFilledWidth();
        assertEquals(0.0f, f2);
        assertNull(pdfContentByte_array7);
        assertNotNull(columnText10);
        assertEquals(0.0f, f11);
    }

    @Test
    void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test358");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Paragraph paragraph5 = com.lowagie.text.factories.ElementFactory.getParagraph(properties1);
        int i6 = properties1.size();
        com.lowagie.text.Table table7 = com.lowagie.text.factories.ElementFactory.getTable(properties1);
        boolean b8 = table7.isLocked();
        float[] f_array11 = table7.getWidths(33.360004f, 32.0f);
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(paragraph5);
        assertEquals(0, i6);
        assertNotNull(table7);
        assertEquals(false, b8);
        assertNotNull(f_array11);
    }

    @Test
    void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test359");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.MMTYPE1;
        assertNotNull(pdfName0);
    }

    @Test
    void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test360");
        byte byte0 = com.lowagie.text.DocWriter.EQUALS;
        assertEquals(byte0, (byte) 61);
    }

    @Test
    void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test361");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.STRUCTPARENTS;
        assertNotNull(pdfName0);
    }

    @Test
    void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test362");
        int i0 = com.lowagie.text.pdf.Barcode.EAN13;
        assertEquals(1, i0);
    }

    @Test
    void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test363");
        java.lang.String str0 = com.lowagie.text.xml.xmp.LangAlt.DEFAULT;
        assertEquals("x-default", str0, "'" + str0 + "' != '" + "x-default" + "'");
    }

    @Test
    void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test364");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.COLUMNS;
        assertNotNull(pdfName0);
    }

    @Test
    void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test365");
        com.lowagie.text.pdf.PdfOutline pdfOutline0 = null;
        com.lowagie.text.pdf.PdfAction pdfAction5 = com.lowagie.text.pdf.PdfAction.createLaunch("listitem", "bordercolor", "content", "italic");
        com.lowagie.text.ListItem listItem6 = new com.lowagie.text.ListItem();
        try {
            com.lowagie.text.pdf.PdfOutline pdfOutline8 = new com.lowagie.text.pdf.PdfOutline(pdfOutline0, pdfAction5, (com.lowagie.text.Paragraph) listItem6, false);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfAction5);
    }

    @Test
    void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test366");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.OPT;
        assertNotNull(pdfName0);
    }

    @Test
    void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test367");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.BINDING;
        assertNotNull(pdfName0);
    }

    @Test
    void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test368");
        boolean b0 = com.lowagie.text.pdf.ByteBuffer.HIGH_PRECISION;
        assertEquals(false, b0);
    }

    @Test
    void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test369");
        com.lowagie.text.pdf.MultiColumnText multiColumnText0 = new com.lowagie.text.pdf.MultiColumnText();
        multiColumnText0.setArabicOptions(1564);
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = null;
        com.lowagie.text.Font font5 = null;
        com.lowagie.text.Footnote footnote6 = new com.lowagie.text.Footnote("", font5);
        com.lowagie.text.HeaderFooter headerFooter8 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote6, true);
        headerFooter8.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle11 = headerFooter8.rotate();
        float[] f_array16 = new float[]{6, 9};
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation17 = com.lowagie.text.pdf.PdfAnnotation.createMarkup(pdfWriter3, rectangle11, "Stream", 3, f_array16);
        com.lowagie.text.pdf.PdfWriter pdfWriter18 = null;
        com.lowagie.text.Font font20 = null;
        com.lowagie.text.Footnote footnote21 = new com.lowagie.text.Footnote("", font20);
        com.lowagie.text.HeaderFooter headerFooter23 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote21, true);
        headerFooter23.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle26 = headerFooter23.rotate();
        float[] f_array31 = new float[]{6, 9};
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation32 = com.lowagie.text.pdf.PdfAnnotation.createMarkup(pdfWriter18, rectangle26, "Stream", 3, f_array31);
        multiColumnText0.addColumn(f_array16, f_array31);
        int i34 = multiColumnText0.getCurrentColumn();
        assertNotNull(rectangle11);
        assertNotNull(f_array16);
        assertNotNull(pdfAnnotation17);
        assertNotNull(rectangle26);
        assertNotNull(f_array31);
        assertNotNull(pdfAnnotation32);
        assertEquals(0, i34);
    }

    @Test
    void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test370");
        java.lang.String str1 = com.lowagie.text.pdf.SimpleNamedDestination.escapeBinaryString("GENERICTAG");
        assertEquals("GENERICTAG", str1, "'" + str1 + "' != '" + "GENERICTAG" + "'");
    }

    @Test
    void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test371");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.LAST;
        com.lowagie.text.pdf.PdfName pdfName1 = com.lowagie.text.pdf.PdfName.KEYWORDS;
        com.lowagie.text.pdf.PdfDeveloperExtension pdfDeveloperExtension3 = new com.lowagie.text.pdf.PdfDeveloperExtension(pdfName0, pdfName1, (int) (short) 10);
        int i4 = pdfDeveloperExtension3.getExtensionLevel();
        assertNotNull(pdfName0);
        assertNotNull(pdfName1);
        assertEquals(10, i4);
    }

    @Test
    void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test372");
        java.lang.String str0 = com.lowagie.text.Chunk.NEWPAGE;
        assertEquals("NEWPAGE", str0, "'" + str0 + "' != '" + "NEWPAGE" + "'");
    }

    @Test
    void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test373");
        try {
            byte[] byte_array1 = com.lowagie.text.pdf.BarcodeCodabar.getBarsCodabar("annotation");
            fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test374");
        java.net.URL uRL0 = null;
        try {
            com.lowagie.text.pdf.PdfAction pdfAction2 = new com.lowagie.text.pdf.PdfAction(uRL0, true);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test375");
        boolean b1 = com.lowagie.text.pdf.BidiLine.isWS('a');
        assertEquals(false, b1);
    }

    @Test
    void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test376");
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
        byte[] byte_array25 = imgJBIG2_20.getOriginalData();
        com.lowagie.text.Font font27 = null;
        com.lowagie.text.Footnote footnote28 = new com.lowagie.text.Footnote("", font27);
        int[] i_array33 = new int[]{(short) 1, 1785737760, 8, 100};
        com.lowagie.text.pdf.SimpleBookmark.eliminatePages((java.util.List) footnote28, i_array33);
        imgJBIG2_20.setTransparency(i_array33);
        assertNotNull(byte_array8);
        assertNotNull(byte_array15);
        assertEquals(0, i21);
        assertNull(i_array22);
        assertEquals(4.0f, f23);
        assertNull(byte_array25);
        assertNotNull(i_array33);
    }

    @Test
    void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test377");
        com.lowagie.text.pdf.codec.wmf.MetaState metaState0 = null;
        try {
            com.lowagie.text.pdf.codec.wmf.MetaState metaState1 = new com.lowagie.text.pdf.codec.wmf.MetaState(metaState0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test378");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier0 = com.lowagie.text.pdf.PdfPKCS7.X509Name.ST;
        assertNotNull(aSN1ObjectIdentifier0);
    }

    @Test
    void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test379");
        int i0 = com.lowagie.text.pdf.PdfAnnotation.FLAGS_NOZOOM;
        assertEquals(8, i0);
    }

    @Test
    void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test380");
        java.lang.String str0 = com.lowagie.text.html.Markup.CSS_KEY_MARGINRIGHT;
        assertEquals("margin-right", str0, "'" + str0 + "' != '" + "margin-right" + "'");
    }

    @Test
    void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test381");
        int i0 = com.lowagie.text.Jpeg.UNSUPPORTED_MARKER;
        assertEquals(1, i0);
    }

    @Test
    void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test382");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.O;
        assertNotNull(pdfName0);
    }

    @Test
    void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test383");
        int i0 = com.lowagie.text.pdf.PdfContentByte.LINE_JOIN_MITER;
        assertEquals(0, i0);
    }

    @Test
    void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test384");
        com.lowagie.text.pdf.PdfNumber pdfNumber1 = new com.lowagie.text.pdf.PdfNumber((double) (-3));
    }

    @Test
    void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test385");
        com.lowagie.text.ListItem listItem1 = new com.lowagie.text.ListItem(12.0f);
    }

    @Test
    void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test386");
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
        com.lowagie.text.pdf.PdfTemplate pdfTemplate30 = null;
        try {
            pdfAnnotation29.setMKRolloverIcon(pdfTemplate30);
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
    void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test387");
        java.io.InputStream inputStream0 = null;
        com.lowagie.text.pdf.PdfContentByte pdfContentByte1 = null;
        com.lowagie.text.pdf.codec.wmf.MetaDo metaDo2 = new com.lowagie.text.pdf.codec.wmf.MetaDo(inputStream0, pdfContentByte1);
        try {
            metaDo2.outputText((int) 'e', (int) 'e', (int) (byte) 1, 9, (int) 'È', 1042, 1065, "background-color");
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test388");
        com.lowagie.text.RectangleReadOnly rectangleReadOnly4 = new com.lowagie.text.RectangleReadOnly((float) (byte) 100, (float) 1336, (float) 'Ë', (float) 9);
        java.awt.Color color8 = java.awt.Color.getHSBColor(100.0f, (float) (short) 1, 100.0f);
        int i9 = com.lowagie.text.pdf.ExtendedColor.getType(color8);
        try {
            rectangleReadOnly4.setBorderColor(color8);
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        assertNotNull(color8);
        assertEquals(0, i9);
    }

    @Test
    void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test389");
        java.lang.String str0 = com.lowagie.text.ElementTags.ID;
        assertEquals("id", str0, "'" + str0 + "' != '" + "id" + "'");
    }

    @Test
    void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test390");
        int i0 = com.lowagie.text.pdf.PdfContentByte.TEXT_RENDER_MODE_INVISIBLE;
        assertEquals(3, i0);
    }

    @Test
    void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test391");
        java.lang.String str1 = com.lowagie.text.pdf.XfaForm.Xml2Som.unescapeSom("Dictionary");
        assertEquals("Dictionary", str1, "'" + str1 + "' != '" + "Dictionary" + "'");
    }

    @Test
    void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test392");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.COLLECTIONFIELD;
        assertNotNull(pdfName0);
    }

    @Test
    void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test393");
        java.io.OutputStream outputStream0 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields2 = new com.lowagie.text.pdf.PdfCopyFields(outputStream0, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = pdfCopyFields2.getWriter();
        int i4 = pdfWriter3.getCurrentPageNumber();
        pdfWriter3.setLinearPageMode();
        int i6 = pdfWriter3.getPageNumber();
        pdfWriter3.setStrictImageSequence(true);
        pdfWriter3.clearTextWrap();
        com.lowagie.text.pdf.PdfString pdfString13 = new com.lowagie.text.pdf.PdfString("text-align");
        boolean b14 = pdfString13.isHexWriting();
        byte[] byte_array15 = pdfString13.getBytes();
        try {
            com.lowagie.text.pdf.PdfFileSpecification pdfFileSpecification17 = com.lowagie.text.pdf.PdfFileSpecification.fileEmbedded(pdfWriter3, "convert2pdfp", "pdfaid:part", byte_array15, 53);
            fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        assertNotNull(pdfWriter3);
        assertEquals(1, i4);
        assertEquals(0, i6);
        assertEquals(false, b14);
        assertNotNull(byte_array15);
    }

    @Test
    void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test394");
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
        pdfWriter8.resetFooter();
        com.lowagie.text.pdf.PdfPTable pdfPTable26 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell27 = pdfPTable26.getDefaultCell();
        float f28 = pdfPCell27.getIndent();
        com.lowagie.text.pdf.PdfPTable pdfPTable29 = pdfPCell27.getTable();
        com.lowagie.text.pdf.PdfPCellEvent pdfPCellEvent30 = pdfPCell27.getCellEvent();
        boolean b31 = pdfWriter8.setPageSize((com.lowagie.text.Rectangle) pdfPCell27);
        com.lowagie.text.pdf.PdfReader pdfReader35 = null;
        byte[] byte_array40 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream41 = new com.lowagie.text.pdf.PRStream(pdfReader35, byte_array40);
        com.lowagie.text.pdf.PdfReader pdfReader42 = null;
        byte[] byte_array47 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream48 = new com.lowagie.text.pdf.PRStream(pdfReader42, byte_array47);
        pRStream41.setData(byte_array47, false, (int) (byte) 100);
        byte[] byte_array52 = pRStream41.getBytes();
        com.lowagie.text.pdf.PdfReader pdfReader53 = null;
        byte[] byte_array58 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream59 = new com.lowagie.text.pdf.PRStream(pdfReader53, byte_array58);
        com.lowagie.text.pdf.PdfReader pdfReader60 = null;
        byte[] byte_array65 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream66 = new com.lowagie.text.pdf.PRStream(pdfReader60, byte_array65);
        pRStream59.setData(byte_array65, false, (int) (byte) 100);
        byte[] byte_array70 = pRStream59.getBytes();
        pRStream41.setData(byte_array70);
        com.lowagie.text.pdf.PdfName pdfName72 = com.lowagie.text.pdf.PdfName.FIRSTCHAR;
        java.lang.String str73 = com.lowagie.text.error_messages.MessageLocalization.getComposedMessage("listitem", (java.lang.Object) byte_array70, (java.lang.Object) pdfName72);
        com.lowagie.text.pdf.PdfDashPattern pdfDashPattern76 = new com.lowagie.text.pdf.PdfDashPattern((float) 0L, (float) 8);
        byte[] byte_array77 = com.lowagie.text.pdf.PdfReader.decodePredictor(byte_array70, (com.lowagie.text.pdf.PdfObject) pdfDashPattern76);
        try {
            com.lowagie.text.pdf.PdfFileSpecification pdfFileSpecification79 = com.lowagie.text.pdf.PdfFileSpecification.fileEmbedded(pdfWriter8, "content", "encoding", byte_array77, false);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfWriter8);
        assertEquals(1, i9);
        assertNotNull(rectangle17);
        assertEquals(true, b21);
        assertNotNull(pdfPCell27);
        assertEquals(0.0f, f28);
        assertNull(pdfPTable29);
        assertNull(pdfPCellEvent30);
        assertEquals(true, b31);
        assertNotNull(byte_array40);
        assertNotNull(byte_array47);
        assertNotNull(byte_array52);
        assertNotNull(byte_array58);
        assertNotNull(byte_array65);
        assertNotNull(byte_array70);
        assertNotNull(pdfName72);
        assertEquals("No message found for listitem", str73, "'" + str73 + "' != '" + "No message found for listitem" + "'");
        assertNotNull(byte_array77);
    }

    @Test
    void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test395");
        byte[] byte_array2 = new byte[]{(byte) 100, (byte) 10};
        com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray3 = new com.lowagie.text.pdf.RandomAccessFileOrArray(byte_array2);
        randomAccessFileOrArray3.setStartOffset((int) '#');
        char char6 = randomAccessFileOrArray3.readChar();
        try {
            long long7 = randomAccessFileOrArray3.readUnsignedIntLE();
            fail("Expected exception of type java.io.EOFException");
        } catch (java.io.EOFException e) {
        }
        assertNotNull(byte_array2);
        assertEquals('搊', char6);
    }

    @Test
    void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test396");
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
        boolean b34 = imgJBIG2_20.isSmask();
        assertNotNull(byte_array8);
        assertNotNull(byte_array15);
        assertEquals(0, i21);
        assertNull(i_array22);
        assertEquals(4.0f, f23);
        assertNotNull(pdfWriter29);
        assertEquals(1, i30);
        assertNotNull(pdfLayer32);
        assertEquals(false, b34);
    }

    @Test
    void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test397");
        com.lowagie.text.RectangleReadOnly rectangleReadOnly4 = new com.lowagie.text.RectangleReadOnly((float) (byte) 100, (float) 1336, (float) 'Ë', (float) 9);
        try {
            rectangleReadOnly4.enableBorderSide((int) 'd');
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
    }

    @Test
    void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test398");
        java.lang.String str1 = com.lowagie.text.pdf.Barcode128.removeFNC1("visibility");
        assertEquals("visibility", str1, "'" + str1 + "' != '" + "visibility" + "'");
    }

    @Test
    void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test399");
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
        com.lowagie.text.pdf.PdfName pdfName43 = com.lowagie.text.pdf.PdfName.LAST;
        com.lowagie.text.pdf.PdfName pdfName44 = com.lowagie.text.pdf.PdfName.KEYWORDS;
        com.lowagie.text.pdf.PdfDeveloperExtension pdfDeveloperExtension46 = new com.lowagie.text.pdf.PdfDeveloperExtension(pdfName43, pdfName44, (int) (short) 10);
        pdfWriter4.addDeveloperExtension(pdfDeveloperExtension46);
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertNotNull(pdfName35);
        assertNotNull(pdfName36);
        assertNotNull(pdfFormField41);
        assertNotNull(pdfName43);
        assertNotNull(pdfName44);
    }

    @Test
    void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test400");
        boolean b1 = com.lowagie.text.FontFactory.isRegistered("height");
        assertEquals(false, b1);
    }

    @Test
    void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test401");
        java.net.URL uRL0 = null;
        try {
            com.lowagie.text.Image image1 = com.lowagie.text.Image.getInstance(uRL0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test402");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.BLOCKQUOTE;
        assertNotNull(pdfName0);
    }

    @Test
    void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test403");
        java.lang.String str0 = com.lowagie.text.Chunk.TEXTRENDERMODE;
        assertEquals("TEXTRENDERMODE", str0, "'" + str0 + "' != '" + "TEXTRENDERMODE" + "'");
    }

    @Test
    void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test404");
        int i0 = com.lowagie.text.pdf.BaseFont.FONT_TYPE_TT;
        assertEquals(1, i0);
    }

    @Test
    void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test405");
        int i0 = com.lowagie.text.pdf.BarcodeDatamatrix.DM_EDIFACT;
        assertEquals(6, i0);
    }

    @Test
    void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test406");
        com.lowagie.text.pdf.BidiLine bidiLine0 = new com.lowagie.text.pdf.BidiLine();
        float f3 = bidiLine0.getWidth((int) 'È', (-56509343));
        try {
            java.util.ArrayList arrayList6 = bidiLine0.createArrayOfPdfChunks(299, (int) (byte) 9);
            fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        assertEquals(0.0f, f3);
    }

    @Test
    void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test407");
        java.lang.String str0 = com.lowagie.text.Footnote.CONTENT;
        assertEquals("content", str0, "'" + str0 + "' != '" + "content" + "'");
    }

    @Test
    void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test408");
        boolean b1 = com.lowagie.text.pdf.PRTokeniser.isWhitespace(262);
        assertEquals(false, b1);
    }

    @Test
    void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test409");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier0 = com.lowagie.text.pdf.PdfPKCS7.X509Name.T;
        assertNotNull(aSN1ObjectIdentifier0);
    }

    @Test
    void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test410");
        java.lang.String str0 = com.lowagie.text.ElementTags.BGRED;
        assertEquals("bgred", str0, "'" + str0 + "' != '" + "bgred" + "'");
    }

    @Test
    void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test411");
        com.lowagie.text.List list3 = new com.lowagie.text.List(false, true, (float) 24);
    }

    @Test
    void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test412");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.THREADS;
        assertNotNull(pdfName0);
    }

    @Test
    void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test413");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        pdfPTable1.setSpacingBefore((float) 15);
        com.lowagie.text.pdf.PdfPTable pdfPTable5 = new com.lowagie.text.pdf.PdfPTable(pdfPTable1);
        pdfPTable5.setFooterRows(14);
        boolean b8 = pdfPTable5.isSplitRows();
        java.util.ArrayList arrayList11 = pdfPTable5.getRows((int) ' ', 1042);
        assertNotNull(pdfPCell2);
        assertEquals(true, b8);
        assertNotNull(arrayList11);
    }

    @Test
    void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test414");
        com.lowagie.text.pdf.MultiColumnText multiColumnText0 = new com.lowagie.text.pdf.MultiColumnText();
        boolean b1 = multiColumnText0.isNestable();
        multiColumnText0.resetCurrentColumn();
        assertEquals(false, b1);
    }

    @Test
    void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test415");
        com.lowagie.text.Font font1 = null;
        com.lowagie.text.Footnote footnote2 = new com.lowagie.text.Footnote("", font1);
        com.lowagie.text.HeaderFooter headerFooter4 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote2, true);
        headerFooter4.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph7 = headerFooter4.paragraph();
        com.lowagie.text.Phrase phrase8 = headerFooter4.getAfter();
        headerFooter4.setPageNumber(1040);
        com.lowagie.text.Phrase phrase11 = headerFooter4.getAfter();
        assertNotNull(paragraph7);
        assertNull(phrase8);
        assertNull(phrase11);
    }

    @Test
    void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test416");
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
        float f22 = imgJBIG2_20.getImageRotation();
        assertNotNull(byte_array8);
        assertNotNull(byte_array15);
        assertEquals(0, i21);
        assertEquals(0.0f, f22);
    }

    @Test
    void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test417");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.HELVETICA_BOLDOBLIQUE;
        assertNotNull(pdfName0);
    }

    @Test
    void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test418");
        com.lowagie.text.pdf.codec.wmf.MetaObject metaObject1 = new com.lowagie.text.pdf.codec.wmf.MetaObject(0);
        int i2 = metaObject1.type;
        assertEquals(0, i2);
    }

    @Test
    void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test419");
        com.lowagie.text.pdf.PdfContentByte pdfContentByte0 = null;
        com.lowagie.text.pdf.ColumnText columnText1 = new com.lowagie.text.pdf.ColumnText(pdfContentByte0);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte2 = null;
        columnText1.setCanvas(pdfContentByte2);
        com.lowagie.text.pdf.PdfContentByte[] pdfContentByte_array4 = columnText1.getCanvases();
        columnText1.setUseAscender(true);
        assertNull(pdfContentByte_array4);
    }

    @Test
    void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test420");
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
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper47 = new com.lowagie.text.pdf.PdfPageEventHelper();
        java.io.OutputStream outputStream48 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields50 = new com.lowagie.text.pdf.PdfCopyFields(outputStream48, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter51 = pdfCopyFields50.getWriter();
        com.lowagie.text.Font font53 = null;
        com.lowagie.text.Footnote footnote54 = new com.lowagie.text.Footnote("", font53);
        com.lowagie.text.HeaderFooter headerFooter56 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote54, true);
        headerFooter56.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle59 = headerFooter56.rotate();
        com.lowagie.text.Rectangle rectangle60 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter56);
        com.lowagie.text.Document document61 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter56);
        boolean b63 = document61.setMarginMirroringTopBottom(true);
        com.lowagie.text.Font font67 = null;
        com.lowagie.text.Footnote footnote68 = new com.lowagie.text.Footnote("", font67);
        com.lowagie.text.HeaderFooter headerFooter70 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote68, true);
        headerFooter70.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph73 = headerFooter70.paragraph();
        pdfPageEventHelper47.onSection(pdfWriter51, document61, (float) 7, 262144, paragraph73);
        pdfWriter51.setStrictImageSequence(false);
        pdfWriter51.setEncryption(false, "true", "bottom", 1336);
        com.lowagie.text.pdf.PdfName pdfName82 = com.lowagie.text.pdf.PdfName.NONE;
        com.lowagie.text.pdf.PdfName pdfName83 = com.lowagie.text.pdf.PdfName.XREF;
        pdfWriter51.setDefaultColorspace(pdfName82, (com.lowagie.text.pdf.PdfObject) pdfName83);
        pdfWriter51.setAtLeastPdfVersion('È');
        com.lowagie.text.pdf.PdfFormField pdfFormField88 = com.lowagie.text.pdf.PdfFormField.createRadioButton(pdfWriter51, true);
        com.lowagie.text.pdf.PdfPTable pdfPTable90 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell91 = pdfPTable90.getDefaultCell();
        float f92 = pdfPCell91.getIndent();
        float f93 = pdfPCell91.getRightIndent();
        pdfPCell91.setIndent((float) 302);
        com.lowagie.text.pdf.RadioCheckField radioCheckField98 = new com.lowagie.text.pdf.RadioCheckField(pdfWriter51, (com.lowagie.text.Rectangle) pdfPCell91, "pdf", "operation");
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation99 = new com.lowagie.text.pdf.PdfAnnotation(pdfWriter4, (com.lowagie.text.Rectangle) pdfPCell91);
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertNotNull(pdfName35);
        assertNotNull(pdfName36);
        assertNotNull(str_array44);
        assertNotNull(pdfFormField46);
        assertNotNull(pdfWriter51);
        assertNotNull(rectangle59);
        assertEquals(true, b63);
        assertNotNull(paragraph73);
        assertNotNull(pdfName82);
        assertNotNull(pdfName83);
        assertNotNull(pdfFormField88);
        assertNotNull(pdfPCell91);
        assertEquals(0.0f, f92);
        assertEquals(0.0f, f93);
    }

    @Test
    void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test421");
        int i0 = com.lowagie.text.pdf.PdfWriter.DirectionL2R;
        assertEquals(4194304, i0);
    }

    @Test
    void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test422");
        java.lang.String str0 = com.lowagie.text.xml.xmp.PdfSchema.PRODUCER;
        assertEquals("pdf:Producer", str0, "'" + str0 + "' != '" + "pdf:Producer" + "'");
    }

    @Test
    void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test423");
        com.lowagie.text.pdf.PdfOutline pdfOutline0 = null;
        com.lowagie.text.pdf.PdfWriter pdfWriter1 = null;
        com.lowagie.text.pdf.PdfWriter pdfWriter6 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField7 = com.lowagie.text.pdf.PdfFormField.createCheckBox(pdfWriter6);
        com.lowagie.text.pdf.PdfAction pdfAction9 = new com.lowagie.text.pdf.PdfAction("Cp1250");
        pdfFormField7.setAction(pdfAction9);
        com.lowagie.text.pdf.PdfFormField pdfFormField11 = new com.lowagie.text.pdf.PdfFormField(pdfWriter1, (float) 7, (float) 1L, (float) 'a', (float) 30, pdfAction9);
        try {
            com.lowagie.text.pdf.PdfOutline pdfOutline13 = new com.lowagie.text.pdf.PdfOutline(pdfOutline0, pdfAction9, "page");
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfFormField7);
    }

    @Test
    void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test424");
        java.lang.String str0 = com.lowagie.text.xml.xmp.DublinCoreSchema.DEFAULT_XPATH_ID;
        assertEquals("dc", str0, "'" + str0 + "' != '" + "dc" + "'");
    }

    @Test
    void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test425");
        int i0 = com.lowagie.text.pdf.ColumnText.DIGITS_AN2EN;
        assertEquals(64, i0);
    }

    @Test
    void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test426");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.RICHMEDIAINSTANCE;
        java.util.Properties properties2 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b3 = properties2.isEmpty();
        boolean b5 = properties2.contains((java.lang.Object) 14);
        com.lowagie.text.Paragraph paragraph6 = com.lowagie.text.factories.ElementFactory.getParagraph(properties2);
        int i7 = properties2.size();
        com.lowagie.text.Table table8 = com.lowagie.text.factories.ElementFactory.getTable(properties2);
        float f9 = table8.getWidth();
        com.lowagie.text.Table table10 = new com.lowagie.text.Table(table8);
        try {
            int i11 = pdfName0.compareTo((java.lang.Object) table10);
            fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        assertNotNull(pdfName0);
        assertNotNull(properties2);
        assertEquals(true, b3);
        assertEquals(false, b5);
        assertNotNull(paragraph6);
        assertEquals(0, i7);
        assertNotNull(table8);
        assertEquals(80.0f, f9);
    }

    @Test
    void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test427");
        com.lowagie.text.SimpleCell simpleCell1 = new com.lowagie.text.SimpleCell(true);
        com.lowagie.text.SimpleCell simpleCell3 = new com.lowagie.text.SimpleCell(true);
        simpleCell3.setSpacing_top((float) 226);
        int i6 = simpleCell3.type();
        com.lowagie.text.Cell cell7 = simpleCell1.createCell(simpleCell3);
        try {
            cell7.setTop(0);
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        assertEquals(20, i6);
        assertNotNull(cell7);
    }

    @Test
    void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test428");
        com.lowagie.text.pdf.PdfRectangle pdfRectangle4 = new com.lowagie.text.pdf.PdfRectangle(Float.NaN, (float) 804, (float) 513, (float) 24);
    }

    @Test
    void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test429");
        com.lowagie.text.pdf.ByteBuffer byteBuffer1 = new com.lowagie.text.pdf.ByteBuffer(1564);
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields3 = new com.lowagie.text.pdf.PdfCopyFields((java.io.OutputStream) byteBuffer1, 'Ã');
        pdfCopyFields3.setFullCompression();
        try {
            pdfCopyFields3.close();
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (com.lowagie.text.ExceptionConverter e) {
        }
    }

    @Test
    void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test430");
        com.lowagie.text.pdf.hyphenation.HyphenationException hyphenationException1 = new com.lowagie.text.pdf.hyphenation.HyphenationException("Stream");
    }

    @Test
    void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test431");
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
        byte[] byte_array38 = new byte[]{(byte) 32};
        byte[] byte_array39 = com.lowagie.text.pdf.PdfReader.LZWDecode(byte_array38);
        imgJBIG2_20.setOriginalData(byte_array39);
        com.lowagie.text.Chunk chunk44 = new com.lowagie.text.Chunk((com.lowagie.text.Image) imgJBIG2_20, (float) 1565, (float) 1336, true);
        assertNotNull(byte_array8);
        assertNotNull(byte_array15);
        assertEquals(0, i21);
        assertNull(i_array22);
        assertEquals(4.0f, f23);
        assertNotNull(pdfWriter29);
        assertEquals(1, i30);
        assertNotNull(pdfLayer32);
        assertEquals(36, i36);
        assertNotNull(byte_array38);
        assertNotNull(byte_array39);
    }

    @Test
    void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test432");
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
        com.lowagie.text.pdf.PdfAcroForm pdfAcroForm38 = pdfWriter4.getAcroForm();
        float f40 = pdfWriter4.getVerticalPosition(false);
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertNotNull(pdfName35);
        assertNotNull(pdfName36);
        assertNotNull(pdfAcroForm38);
        assertEquals(806.0f, f40);
    }

    @Test
    void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test433");
        com.lowagie.text.pdf.BaseFont baseFont0 = null;
        com.lowagie.text.Font font3 = new com.lowagie.text.Font(baseFont0, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont5 = font3.getCalculatedBaseFont(false);
        boolean b8 = baseFont5.setCharAdvance(9, 0);
        int i9 = baseFont5.getCompressionLevel();
        int[] i_array10 = baseFont5.getWidths();
        java.lang.String[] str_array11 = baseFont5.getCodePagesSupported();
        int i12 = baseFont5.getCompressionLevel();
        float f15 = baseFont5.getWidthPoint(1651532643, (float) 14);
        assertNotNull(baseFont5);
        assertEquals(true, b8);
        assertEquals(i9, (-1));
        assertNotNull(i_array10);
        assertNotNull(str_array11);
        assertEquals(i12, (-1));
        assertEquals(0.0f, f15);
    }

    @Test
    void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test434");
        com.lowagie.text.Font font1 = null;
        com.lowagie.text.Footnote footnote2 = new com.lowagie.text.Footnote("", font1);
        com.lowagie.text.HeaderFooter headerFooter4 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote2, true);
        headerFooter4.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph7 = headerFooter4.paragraph();
        float f8 = headerFooter4.getWidth();
        float f9 = headerFooter4.getBorderWidthRight();
        assertNotNull(paragraph7);
        assertEquals(0.0f, f8);
        assertEquals(0.0f, f9);
    }

    @Test
    void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test435");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        pdfPTable1.setFooterRows((-1));
        pdfPTable1.setSpacingBefore((float) 20);
        com.lowagie.text.pdf.PdfPTable pdfPTable7 = com.lowagie.text.pdf.PdfPTable.shallowCopy(pdfPTable1);
        try {
            com.lowagie.text.pdf.PdfPRow pdfPRow9 = pdfPTable7.getRow(247);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        assertNotNull(pdfPCell2);
        assertNotNull(pdfPTable7);
    }

    @Test
    void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test436");
        com.lowagie.text.pdf.PdfReader pdfReader1 = null;
        byte[] byte_array6 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream7 = new com.lowagie.text.pdf.PRStream(pdfReader1, byte_array6);
        com.lowagie.text.pdf.PdfReader pdfReader8 = null;
        byte[] byte_array13 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream14 = new com.lowagie.text.pdf.PRStream(pdfReader8, byte_array13);
        pRStream7.setData(byte_array13, false, (int) (byte) 100);
        byte[] byte_array18 = pRStream7.getBytes();
        com.lowagie.text.pdf.PdfReader pdfReader19 = null;
        byte[] byte_array24 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream25 = new com.lowagie.text.pdf.PRStream(pdfReader19, byte_array24);
        com.lowagie.text.pdf.PdfReader pdfReader26 = null;
        byte[] byte_array31 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream32 = new com.lowagie.text.pdf.PRStream(pdfReader26, byte_array31);
        pRStream25.setData(byte_array31, false, (int) (byte) 100);
        byte[] byte_array36 = pRStream25.getBytes();
        pRStream7.setData(byte_array36);
        com.lowagie.text.pdf.PdfName pdfName38 = com.lowagie.text.pdf.PdfName.FIRSTCHAR;
        java.lang.String str39 = com.lowagie.text.error_messages.MessageLocalization.getComposedMessage("listitem", (java.lang.Object) byte_array36, (java.lang.Object) pdfName38);
        com.lowagie.text.pdf.PdfDashPattern pdfDashPattern42 = new com.lowagie.text.pdf.PdfDashPattern((float) 0L, (float) 8);
        byte[] byte_array43 = com.lowagie.text.pdf.PdfReader.decodePredictor(byte_array36, (com.lowagie.text.pdf.PdfObject) pdfDashPattern42);
        com.lowagie.text.pdf.PdfLiteral pdfLiteral44 = new com.lowagie.text.pdf.PdfLiteral(byte_array36);
        assertNotNull(byte_array6);
        assertNotNull(byte_array13);
        assertNotNull(byte_array18);
        assertNotNull(byte_array24);
        assertNotNull(byte_array31);
        assertNotNull(byte_array36);
        assertNotNull(pdfName38);
        assertEquals("No message found for listitem", str39, "'" + str39 + "' != '" + "No message found for listitem" + "'");
        assertNotNull(byte_array43);
    }

    @Test
    void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test437");
        java.lang.String str0 = com.lowagie.text.ElementTags.TITLE;
        assertEquals("title", str0, "'" + str0 + "' != '" + "title" + "'");
    }

    @Test
    void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test438");
        java.lang.String str0 = com.lowagie.text.ElementTags.LIST;
        assertEquals("list", str0, "'" + str0 + "' != '" + "list" + "'");
    }

    @Test
    void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test439");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Paragraph paragraph5 = com.lowagie.text.factories.ElementFactory.getParagraph(properties1);
        int i6 = properties1.size();
        com.lowagie.text.Table table7 = com.lowagie.text.factories.ElementFactory.getTable(properties1);
        boolean b8 = table7.isLocked();
        table7.setWidth((float) 200);
        try {
            table7.addColumns((int) (byte) -1);
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
    void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test440");
        com.lowagie.text.pdf.BaseFont baseFont0 = null;
        com.lowagie.text.Font font3 = new com.lowagie.text.Font(baseFont0, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont5 = font3.getCalculatedBaseFont(false);
        boolean b8 = baseFont5.setCharAdvance(9, 0);
        int i9 = baseFont5.getCompressionLevel();
        boolean b10 = baseFont5.isForceWidthsOutput();
        assertNotNull(baseFont5);
        assertEquals(true, b8);
        assertEquals(i9, (-1));
        assertEquals(false, b10);
    }

    @Test
    void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test441");
        com.lowagie.text.pdf.XfaForm xfaForm0 = new com.lowagie.text.pdf.XfaForm();
        com.lowagie.text.pdf.XfaForm.Xml2SomDatasets xml2SomDatasets1 = null;
        xfaForm0.setDatasetsSom(xml2SomDatasets1);
        com.lowagie.text.pdf.XfaForm.Xml2SomDatasets xml2SomDatasets3 = xfaForm0.getDatasetsSom();
        boolean b4 = xfaForm0.isXfaPresent();
        com.lowagie.text.pdf.XfaForm.Xml2SomTemplate xml2SomTemplate5 = xfaForm0.getTemplateSom();
        assertNull(xml2SomDatasets3);
        assertEquals(false, b4);
        assertNull(xml2SomTemplate5);
    }

    @Test
    void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test442");
        com.lowagie.text.pdf.PdfRectangle pdfRectangle3 = new com.lowagie.text.pdf.PdfRectangle((float) (short) -1, (float) '4', (int) (short) 1);
        float f5 = pdfRectangle3.top(224);
        float f7 = pdfRectangle3.right((int) 'Ã');
        assertEquals(f5, (-172.0f));
        assertEquals(f7, (-196.0f));
    }

    @Test
    void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test443");
        com.lowagie.text.Paragraph paragraph0 = null;
        com.lowagie.text.Chapter chapter2 = new com.lowagie.text.Chapter(paragraph0, 1785737760);
        float f3 = chapter2.getIndentationLeft();
        boolean b4 = chapter2.isContent();
        java.util.Properties properties6 = com.lowagie.text.html.Markup.parseAttributes("image");
        com.lowagie.text.Section section7 = com.lowagie.text.factories.ElementFactory.getSection((com.lowagie.text.Section) chapter2, properties6);
        assertEquals(0.0f, f3);
        assertEquals(true, b4);
        assertNotNull(properties6);
        assertNotNull(section7);
    }

    @Test
    void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test444");
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
        try {
            com.lowagie.text.pdf.PdfIndirectReference pdfIndirectReference38 = item0.getWidgetRef(200);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        assertNotNull(paragraph20);
        assertNotNull(paragraph35);
    }

    @Test
    void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test445");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Paragraph paragraph5 = com.lowagie.text.factories.ElementFactory.getParagraph(properties1);
        int i6 = properties1.size();
        com.lowagie.text.Table table7 = com.lowagie.text.factories.ElementFactory.getTable(properties1);
        boolean b8 = table7.isLocked();
        float f9 = table7.getWidth();
        boolean b10 = table7.isNestable();
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(paragraph5);
        assertEquals(0, i6);
        assertNotNull(table7);
        assertEquals(false, b8);
        assertEquals(80.0f, f9);
        assertEquals(true, b10);
    }

    @Test
    void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test446");
        com.lowagie.text.Annotation annotation6 = new com.lowagie.text.Annotation("UnicodeBig", "UnicodeBig", (float) (short) 0, (float) (short) 10, 0.0f, (float) 32);
        boolean b7 = annotation6.isContent();
        float f9 = annotation6.urx(0.0f);
        com.lowagie.text.Annotation annotation10 = new com.lowagie.text.Annotation(annotation6);
        assertEquals(true, b7);
        assertEquals(0.0f, f9);
    }

    @Test
    void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test447");
        com.lowagie.text.pdf.XfaForm xfaForm0 = new com.lowagie.text.pdf.XfaForm();
        com.lowagie.text.pdf.XfaForm.Xml2SomDatasets xml2SomDatasets1 = null;
        xfaForm0.setDatasetsSom(xml2SomDatasets1);
        com.lowagie.text.pdf.XfaForm.Xml2SomDatasets xml2SomDatasets3 = xfaForm0.getDatasetsSom();
        boolean b4 = xfaForm0.isXfaPresent();
        com.lowagie.text.pdf.PdfReader pdfReader5 = null;
        java.io.OutputStream outputStream6 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields8 = new com.lowagie.text.pdf.PdfCopyFields(outputStream6, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter9 = pdfCopyFields8.getWriter();
        int i10 = pdfWriter9.getCurrentPageNumber();
        pdfWriter9.setLinearPageMode();
        com.lowagie.text.pdf.PdfWriter pdfWriter12 = null;
        char[] char_array15 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font17 = new com.lowagie.text.pdf.Type3Font(pdfWriter12, char_array15, true);
        com.lowagie.text.pdf.Type3Font type3Font19 = new com.lowagie.text.pdf.Type3Font(pdfWriter9, char_array15, false);
        try {
            com.lowagie.text.pdf.XfaForm.setXfa(xfaForm0, pdfReader5, pdfWriter9);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNull(xml2SomDatasets3);
        assertEquals(false, b4);
        assertNotNull(pdfWriter9);
        assertEquals(1, i10);
        assertNotNull(char_array15);
    }

    @Test
    void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test448");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TWOCOLUMNLEFT;
        assertNotNull(pdfName0);
    }

    @Test
    void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test449");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.LANG;
        assertNotNull(pdfName0);
    }

    @Test
    void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test450");
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
        com.lowagie.text.pdf.PdfPCell[] pdfPCell_array24 = new com.lowagie.text.pdf.PdfPCell[]{};
        com.lowagie.text.pdf.PdfPRow pdfPRow25 = new com.lowagie.text.pdf.PdfPRow(pdfPCell_array24);
        pdfPRow25.initExtraHeights();
        com.lowagie.text.pdf.PdfWriter pdfWriter27 = null;
        float[] f_array34 = new float[]{100.0f, 8, 3, 7, 100.0f, 'a'};
        float[] f_array36 = new float[]{(byte) 10};
        float[] f_array42 = new float[]{64, 64, 100.0f, 4, 29};
        com.lowagie.text.pdf.PdfWriter pdfWriter43 = null;
        com.lowagie.text.Font font45 = null;
        com.lowagie.text.Footnote footnote46 = new com.lowagie.text.Footnote("", font45);
        com.lowagie.text.HeaderFooter headerFooter48 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote46, true);
        headerFooter48.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle51 = headerFooter48.rotate();
        float[] f_array56 = new float[]{6, 9};
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation57 = com.lowagie.text.pdf.PdfAnnotation.createMarkup(pdfWriter43, rectangle51, "Stream", 3, f_array56);
        com.lowagie.text.pdf.PdfFunction pdfFunction59 = com.lowagie.text.pdf.PdfFunction.type2(pdfWriter27, f_array34, f_array36, f_array42, f_array56, 561.0f);
        boolean b60 = pdfPRow25.setWidths(f_array34);
        boolean b61 = pdfRectangle23.add(f_array34);
        assertNotNull(byte_array8);
        assertNotNull(byte_array15);
        assertEquals(0, i21);
        assertEquals(0.0f, f22);
        assertNotNull(pdfPCell_array24);
        assertNotNull(f_array34);
        assertNotNull(f_array36);
        assertNotNull(f_array42);
        assertNotNull(rectangle51);
        assertNotNull(f_array56);
        assertNotNull(pdfAnnotation57);
        assertNotNull(pdfFunction59);
        assertEquals(false, b60);
        assertEquals(false, b61);
    }

    @Test
    void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test451");
        com.lowagie.text.pdf.codec.wmf.MetaObject metaObject1 = new com.lowagie.text.pdf.codec.wmf.MetaObject(0);
        metaObject1.type = 247;
    }

    @Test
    void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test452");
        java.lang.String str0 = com.lowagie.text.xml.xmp.DublinCoreSchema.LANGUAGE;
        assertEquals("dc:language", str0, "'" + str0 + "' != '" + "dc:language" + "'");
    }

    @Test
    void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test453");
        com.lowagie.text.pdf.BaseFont baseFont0 = null;
        com.lowagie.text.Font font3 = new com.lowagie.text.Font(baseFont0, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont5 = font3.getCalculatedBaseFont(false);
        boolean b8 = baseFont5.setCharAdvance(9, 0);
        int i9 = baseFont5.getCompressionLevel();
        boolean b10 = baseFont5.isSubset();
        float f13 = baseFont5.getWidthPoint("STSong-Light", 0.0f);
        boolean b14 = baseFont5.isSubset();
        assertNotNull(baseFont5);
        assertEquals(true, b8);
        assertEquals(i9, (-1));
        assertEquals(true, b10);
        assertEquals(0.0f, f13);
        assertEquals(true, b14);
    }

    @Test
    void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test454");
        java.awt.Color color0 = java.awt.Color.PINK;
        assertNotNull(color0);
    }

    @Test
    void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test455");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfAcroForm pdfAcroForm1 = new com.lowagie.text.pdf.PdfAcroForm(pdfWriter0);
        com.lowagie.text.pdf.PdfWriter pdfWriter2 = null;
        com.lowagie.text.pdf.PdfWriter pdfWriter7 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField8 = com.lowagie.text.pdf.PdfFormField.createCheckBox(pdfWriter7);
        com.lowagie.text.pdf.PdfAction pdfAction10 = new com.lowagie.text.pdf.PdfAction("Cp1250");
        pdfFormField8.setAction(pdfAction10);
        com.lowagie.text.pdf.PdfFormField pdfFormField12 = new com.lowagie.text.pdf.PdfFormField(pdfWriter2, (float) 7, (float) 1L, (float) 'a', (float) 30, pdfAction10);
        pdfFormField12.setMappingName("LOCALGOTO");
        try {
            pdfAcroForm1.addCalculationOrder(pdfFormField12);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfFormField8);
    }

    @Test
    void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test456");
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
        float f30 = pdfPCell26.getPaddingBottom();
        assertNotNull(pdfWriter8);
        assertEquals(1, i9);
        assertNotNull(rectangle17);
        assertEquals(true, b21);
        assertNotNull(pdfPCell26);
        assertEquals(4.0f, f27);
        assertEquals(0.0f, f28);
        assertEquals(2.0f, f30);
    }

    @Test
    void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test457");
        com.lowagie.text.xml.xmp.XmpMMSchema xmpMMSchema0 = new com.lowagie.text.xml.xmp.XmpMMSchema();
        java.lang.Object obj3 = xmpMMSchema0.addProperty("class", "IX");
        assertNull(obj3);
    }

    @Test
    void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test458");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        pdfPTable1.setSpacingBefore((float) 15);
        com.lowagie.text.pdf.PdfPCell pdfPCell5 = pdfPTable1.getDefaultCell();
        pdfPCell5.setSpaceCharRatio((float) 262);
        assertNotNull(pdfPCell2);
        assertNotNull(pdfPCell5);
    }

    @Test
    void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test459");
        com.lowagie.text.pdf.BaseFont baseFont0 = null;
        com.lowagie.text.Font font3 = new com.lowagie.text.Font(baseFont0, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont5 = font3.getCalculatedBaseFont(false);
        boolean b8 = baseFont5.setCharAdvance(9, 0);
        int i9 = baseFont5.getCompressionLevel();
        boolean b10 = baseFont5.isSubset();
        baseFont5.setDirectTextToByte(false);
        int[] i_array13 = baseFont5.getWidths();
        assertNotNull(baseFont5);
        assertEquals(true, b8);
        assertEquals(i9, (-1));
        assertEquals(true, b10);
        assertNotNull(i_array13);
    }

    @Test
    void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test460");
        com.lowagie.text.Chunk chunk0 = new com.lowagie.text.Chunk();
        com.lowagie.text.Image image1 = chunk0.getImage();
        com.lowagie.text.Chunk chunk3 = chunk0.setLocalGoto("text-align");
        com.lowagie.text.Chunk chunk5 = chunk0.setLocalDestination("table-cell");
        assertNull(image1);
        assertNotNull(chunk3);
        assertNotNull(chunk5);
    }

    @Test
    void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test461");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        try {
            com.lowagie.text.pdf.PdfPageLabels.PdfPageLabelFormat[] pdfPageLabelFormat_array1 = com.lowagie.text.pdf.PdfPageLabels.getPageLabelFormats(pdfReader0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test462");
        int i0 = com.lowagie.text.pdf.Barcode.SUPP5;
        assertEquals(6, i0);
    }

    @Test
    void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test463");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ITALICANGLE;
        assertNotNull(pdfName0);
    }

    @Test
    void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test464");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Cell cell5 = com.lowagie.text.factories.ElementFactory.getCell(properties1);
        cell5.setMaxLines(50);
        try {
            cell5.setRight(36);
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(cell5);
    }

    @Test
    void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test465");
        int i0 = com.lowagie.text.pdf.PdfWriter.ALLOW_PRINTING;
        assertEquals(2052, i0);
    }

    @Test
    void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test466");
        java.io.File file0 = null;
        java.io.PrintWriter printWriter2 = null;
        try {
            com.lowagie.text.pdf.parser.PdfContentReaderTool.listContentStream(file0, (int) 'È', printWriter2);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test467");
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
        int i23 = imgJBIG2_20.type();
        assertNotNull(byte_array8);
        assertNotNull(byte_array15);
        assertEquals(0, i21);
        assertNull(i_array22);
        assertEquals(36, i23);
    }

    @Test
    void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test468");
        java.lang.String str0 = com.lowagie.text.FontFactory.TIMES_ITALIC;
        assertEquals("Times-Italic", str0, "'" + str0 + "' != '" + "Times-Italic" + "'");
    }

    @Test
    void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test469");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.MATERIAL;
        assertNotNull(pdfName0);
    }

    @Test
    void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test470");
        int i0 = com.lowagie.text.pdf.PdfWriter.PDFA1A;
        assertEquals(3, i0);
    }

    @Test
    void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test471");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.MARKED;
        assertNotNull(pdfName0);
    }

    @Test
    void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test472");
        com.lowagie.text.SimpleCell simpleCell1 = new com.lowagie.text.SimpleCell(true);
        simpleCell1.setWidthpercentage((float) 262144);
        float f4 = simpleCell1.getSpacing_right();
        assertEquals((float) f4, Float.NaN, 0);
    }

    @Test
    void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test473");
        java.io.OutputStream outputStream0 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields2 = new com.lowagie.text.pdf.PdfCopyFields(outputStream0, ' ');
        com.lowagie.text.pdf.PdfName pdfName3 = com.lowagie.text.pdf.PdfName.SHADING;
        com.lowagie.text.pdf.PdfWriter pdfWriter4 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField5 = com.lowagie.text.pdf.PdfFormField.createCheckBox(pdfWriter4);
        pdfFormField5.setQuadding((int) (byte) 100);
        int i9 = pdfFormField5.setFieldFlags((-56509343));
        pdfCopyFields2.addViewerPreference(pdfName3, (com.lowagie.text.pdf.PdfObject) pdfFormField5);
        com.lowagie.text.Font font15 = com.lowagie.text.FontFactory.getFont("page-break-after", "face", (float) 30);
        com.lowagie.text.ListItem listItem16 = new com.lowagie.text.ListItem("border-bottom-width", font15);
        float f17 = listItem16.getIndentationRight();
        listItem16.setKeepTogether(true);
        pdfCopyFields2.setOutlines((java.util.List) listItem16);
        com.lowagie.text.Chunk chunk21 = listItem16.getListSymbol();
        assertNotNull(pdfName3);
        assertNotNull(pdfFormField5);
        assertEquals(0, i9);
        assertNotNull(font15);
        assertEquals(0.0f, f17);
        assertNull(chunk21);
    }

    @Test
    void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test474");
        com.lowagie.text.pdf.PdfNameTree pdfNameTree0 = new com.lowagie.text.pdf.PdfNameTree();
    }

    @Test
    void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test475");
        com.lowagie.text.Font font1 = new com.lowagie.text.Font();
        com.lowagie.text.Chunk chunk2 = new com.lowagie.text.Chunk('È', font1);
    }

    @Test
    void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test476");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.COLLECTIONITEM;
        assertNotNull(pdfName0);
    }

    @Test
    void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test477");
        int i0 = com.lowagie.text.Font.UNDERLINE;
        assertEquals(4, i0);
    }

    @Test
    void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test478");
        java.lang.String str0 = com.lowagie.text.Chunk.ENCODING;
        assertEquals("ENCODING", str0, "'" + str0 + "' != '" + "ENCODING" + "'");
    }

    @Test
    void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test479");
        java.io.OutputStream outputStream0 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields2 = new com.lowagie.text.pdf.PdfCopyFields(outputStream0, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = pdfCopyFields2.getWriter();
        int i4 = pdfWriter3.getCurrentPageNumber();
        pdfWriter3.setLinearPageMode();
        int i6 = pdfWriter3.getPageNumber();
        pdfWriter3.setStrictImageSequence(true);
        pdfWriter3.clearTextWrap();
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper10 = new com.lowagie.text.pdf.PdfPageEventHelper();
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper11 = new com.lowagie.text.pdf.PdfPageEventHelper();
        java.io.OutputStream outputStream12 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields14 = new com.lowagie.text.pdf.PdfCopyFields(outputStream12, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter15 = pdfCopyFields14.getWriter();
        com.lowagie.text.Font font17 = null;
        com.lowagie.text.Footnote footnote18 = new com.lowagie.text.Footnote("", font17);
        com.lowagie.text.HeaderFooter headerFooter20 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote18, true);
        headerFooter20.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle23 = headerFooter20.rotate();
        com.lowagie.text.Rectangle rectangle24 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter20);
        com.lowagie.text.Document document25 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter20);
        boolean b27 = document25.setMarginMirroringTopBottom(true);
        com.lowagie.text.Font font31 = null;
        com.lowagie.text.Footnote footnote32 = new com.lowagie.text.Footnote("", font31);
        com.lowagie.text.HeaderFooter headerFooter34 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote32, true);
        headerFooter34.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph37 = headerFooter34.paragraph();
        pdfPageEventHelper11.onSection(pdfWriter15, document25, (float) 7, 262144, paragraph37);
        pdfWriter15.setStrictImageSequence(false);
        pdfWriter15.setEncryption(false, "true", "bottom", 1336);
        com.lowagie.text.Font font47 = null;
        com.lowagie.text.Footnote footnote48 = new com.lowagie.text.Footnote("", font47);
        com.lowagie.text.HeaderFooter headerFooter50 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote48, true);
        headerFooter50.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle53 = headerFooter50.rotate();
        com.lowagie.text.Rectangle rectangle54 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter50);
        com.lowagie.text.Document document55 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter50);
        boolean b57 = document55.setMarginMirroringTopBottom(true);
        float f59 = document55.bottom((float) 100L);
        boolean b61 = document55.setMarginMirroringTopBottom(false);
        byte[] byte_array64 = null;
        com.lowagie.text.pdf.PdfReader pdfReader65 = null;
        byte[] byte_array70 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream71 = new com.lowagie.text.pdf.PRStream(pdfReader65, byte_array70);
        com.lowagie.text.pdf.PdfReader pdfReader72 = null;
        byte[] byte_array77 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream78 = new com.lowagie.text.pdf.PRStream(pdfReader72, byte_array77);
        pRStream71.setData(byte_array77, false, (int) (byte) 100);
        com.lowagie.text.ImgJBIG2 imgJBIG2_82 = new com.lowagie.text.ImgJBIG2(4, 1564, byte_array64, byte_array77);
        int i83 = imgJBIG2_82.getDpiY();
        int[] i_array84 = imgJBIG2_82.getTransparency();
        pdfPageEventHelper10.onGenericTag(pdfWriter15, document55, (com.lowagie.text.Rectangle) imgJBIG2_82, "xxiv");
        pdfWriter3.setPageEvent((com.lowagie.text.pdf.PdfPageEvent) pdfPageEventHelper10);
        assertNotNull(pdfWriter3);
        assertEquals(1, i4);
        assertEquals(0, i6);
        assertNotNull(pdfWriter15);
        assertNotNull(rectangle23);
        assertEquals(true, b27);
        assertNotNull(paragraph37);
        assertNotNull(rectangle53);
        assertEquals(true, b57);
        assertEquals(136.0f, f59);
        assertEquals(true, b61);
        assertNotNull(byte_array70);
        assertNotNull(byte_array77);
        assertEquals(0, i83);
        assertNull(i_array84);
    }

    @Test
    void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test480");
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
        com.lowagie.text.pdf.PRTokeniser pRTokeniser43 = new com.lowagie.text.pdf.PRTokeniser(randomAccessFileOrArray41);
        int i44 = pRTokeniser43.getReference();
        try {
            int i45 = pRTokeniser43.getStartxref();
            fail("Expected exception of type com.lowagie.text.exceptions.InvalidPdfException");
        } catch (com.lowagie.text.exceptions.InvalidPdfException e) {
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
        assertEquals(0, i44);
    }

    @Test
    void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test481");
        int i0 = com.lowagie.text.pdf.PdfFormField.FF_FILESELECT;
        assertEquals(1048576, i0);
    }

    @Test
    void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test482");
        com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS pPKMS1 = new com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS("Helvetica-BoldOblique");
    }

    @Test
    void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test483");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DIV;
        assertNotNull(pdfName0);
    }

    @Test
    void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test484");
        com.lowagie.text.Rectangle rectangle0 = com.lowagie.text.PageSize.ARCH_D;
        assertNotNull(rectangle0);
    }

    @Test
    void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test485");
        com.lowagie.text.Paragraph paragraph0 = null;
        com.lowagie.text.Chapter chapter2 = new com.lowagie.text.Chapter(paragraph0, 1785737760);
        float f3 = chapter2.getIndentationLeft();
        java.util.Properties properties5 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b6 = properties5.isEmpty();
        com.lowagie.text.Section section7 = com.lowagie.text.factories.ElementFactory.getSection((com.lowagie.text.Section) chapter2, properties5);
        java.lang.String str9 = properties5.getProperty("id");
        java.lang.Object obj12 = properties5.setProperty("OpenPDF 1.2.12.SNAPSHOT", "UniKS-UCS2-V");
        assertEquals(0.0f, f3);
        assertNotNull(properties5);
        assertEquals(true, b6);
        assertNotNull(section7);
        assertNull(str9);
        assertNull(obj12);
    }

    @Test
    void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test486");
        com.lowagie.text.pdf.IntHashtable intHashtable0 = new com.lowagie.text.pdf.IntHashtable();
        boolean b1 = intHashtable0.isEmpty();
        assertEquals(true, b1);
    }

    @Test
    void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test487");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.SORT;
        assertNotNull(pdfName0);
    }

    @Test
    void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test488");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.CAPTION;
        assertNotNull(pdfName0);
    }

    @Test
    void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test489");
        com.lowagie.text.pdf.Barcode39 barcode39_0 = new com.lowagie.text.pdf.Barcode39();
        com.lowagie.text.Rectangle rectangle1 = barcode39_0.getBarcodeSize();
        assertNotNull(rectangle1);
    }

    @Test
    void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test490");
        com.lowagie.text.Phrase phrase1 = com.lowagie.text.Phrase.getInstance("face");
        phrase1.setLeading((float) 513);
        com.lowagie.text.HeaderFooter headerFooter5 = new com.lowagie.text.HeaderFooter(phrase1, false);
        assertNotNull(phrase1);
    }

    @Test
    void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test491");
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
        float f24 = pdfRectangle23.left();
        assertNotNull(byte_array8);
        assertNotNull(byte_array15);
        assertEquals(0, i21);
        assertEquals(0.0f, f22);
        assertEquals(0.0f, f24);
    }

    @Test
    void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test492");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.K;
        assertNotNull(pdfName0);
    }

    @Test
    void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test493");
        com.lowagie.text.Chunk chunk0 = new com.lowagie.text.Chunk();
        com.lowagie.text.Image image1 = chunk0.getImage();
        float f2 = chunk0.getCharacterSpacing();
        com.lowagie.text.Chunk chunk4 = chunk0.setLocalDestination("urx");
        float f5 = chunk4.getWidthPoint();
        assertNull(image1);
        assertEquals(0.0f, f2);
        assertNotNull(chunk4);
        assertEquals(0.0f, f5);
    }

    @Test
    void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test494");
        int i0 = com.lowagie.text.pdf.PdfWriter.PageModeFullScreen;
        assertEquals(512, i0);
    }

    @Test
    void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test495");
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
        java.io.OutputStream outputStream39 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields41 = new com.lowagie.text.pdf.PdfCopyFields(outputStream39, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter42 = pdfCopyFields41.getWriter();
        int i43 = pdfWriter42.getCurrentPageNumber();
        pdfWriter42.setLinearPageMode();
        int i45 = pdfWriter42.getPageNumber();
        pdfWriter42.setStrictImageSequence(true);
        pdfWriter42.clearTextWrap();
        com.lowagie.text.Table table51 = new com.lowagie.text.Table(13, 1791);
        boolean b52 = pdfWriter42.fitsPage(table51);
        pdfWriter42.setOpenAction("rel");
        com.lowagie.text.pdf.PdfAction pdfAction55 = com.lowagie.text.pdf.PdfAction.javaScript("HYPHENATION", pdfWriter42);
        pdfWriter4.setGroup((com.lowagie.text.pdf.PdfDictionary) pdfAction55);
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertNotNull(pdfName35);
        assertNotNull(pdfName36);
        assertNotNull(pdfWriter42);
        assertEquals(1, i43);
        assertEquals(0, i45);
        assertEquals(true, b52);
        assertNotNull(pdfAction55);
    }

    @Test
    void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test496");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        com.lowagie.text.pdf.ColumnText columnText3 = null;
        pdfPCell2.setColumn(columnText3);
        try {
            pdfPCell2.setRotation(14);
            fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        assertNotNull(pdfPCell2);
    }

    @Test
    void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test497");
        com.lowagie.text.pdf.PdfPCell[] pdfPCell_array0 = new com.lowagie.text.pdf.PdfPCell[]{};
        com.lowagie.text.pdf.PdfPRow pdfPRow1 = new com.lowagie.text.pdf.PdfPRow(pdfPCell_array0);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte6 = null;
        com.lowagie.text.pdf.PdfContentByte[] pdfContentByte_array7 = new com.lowagie.text.pdf.PdfContentByte[]{pdfContentByte6};
        pdfPRow1.writeCells(526, 6, (float) (short) 1, (float) 53, pdfContentByte_array7);
        pdfPRow1.setMaxHeights(0.8f);
        assertNotNull(pdfPCell_array0);
        assertNotNull(pdfContentByte_array7);
    }

    @Test
    void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test498");
        java.lang.String[] str_array10 = new java.lang.String[]{"text-align", "listitem", "listitem", "listitem", "listitem", "hi!", "HeiseiKakuGo-W5", "UnicodeBig", "hi!", "xmp:Nickname"};
        java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str11, str_array10);
        java.util.stream.Stream<java.lang.String> stream_str13 = arraylist_str11.parallelStream();
        arraylist_str11.add(0, "absolutex");
        java.util.ListIterator<java.lang.String> listiterator_str18 = arraylist_str11.listIterator(8);
        java.util.stream.Stream<java.lang.String> stream_str19 = arraylist_str11.parallelStream();
        try {
            java.lang.String str21 = arraylist_str11.remove((int) 'Æ');
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        assertNotNull(str_array10);
        assertEquals(true, b12);
        assertNotNull(stream_str13);
        assertNotNull(listiterator_str18);
        assertNotNull(stream_str19);
    }

    @Test
    void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test499");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        com.lowagie.text.pdf.PdfName pdfName3 = com.lowagie.text.pdf.PdfName.USAGE;
        boolean b4 = properties1.contains((java.lang.Object) pdfName3);
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertNotNull(pdfName3);
        assertEquals(false, b4);
    }

    @Test
    void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test500");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.HIGHLIGHT;
        assertNotNull(pdfName0);
    }
}

