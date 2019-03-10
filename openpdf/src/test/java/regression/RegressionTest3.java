package regression;

import com.lowagie.text.alignment.HorizontalAlignment;
import com.lowagie.text.alignment.VerticalAlignment;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
class RegressionTest3 {

    static boolean debug = false;

    @Test
    void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test001");
        boolean b1 = com.lowagie.text.pdf.ColumnText.hasMoreText(64);
        assertEquals(true, b1);
    }

    @Test
    void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test002");
        com.lowagie.text.pdf.ByteBuffer byteBuffer1 = new com.lowagie.text.pdf.ByteBuffer(1564);
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields2 = new com.lowagie.text.pdf.PdfCopyFields((java.io.OutputStream) byteBuffer1);
        try {
            java.lang.String str4 = byteBuffer1.toString("author");
            fail("Expected exception of type java.io.UnsupportedEncodingException");
        } catch (java.io.UnsupportedEncodingException e) {
        }
    }

    @Test
    void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test003");
        com.lowagie.text.pdf.PdfReader pdfReader4 = null;
        byte[] byte_array9 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream10 = new com.lowagie.text.pdf.PRStream(pdfReader4, byte_array9);
        com.lowagie.text.pdf.PdfReader pdfReader11 = null;
        byte[] byte_array16 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream17 = new com.lowagie.text.pdf.PRStream(pdfReader11, byte_array16);
        pRStream10.setData(byte_array16, false, (int) (byte) 100);
        byte[] byte_array21 = pRStream10.getBytes();
        boolean b22 = pRStream10.isPages();
        com.lowagie.text.pdf.PdfReader pdfReader23 = null;
        byte[] byte_array28 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream29 = new com.lowagie.text.pdf.PRStream(pdfReader23, byte_array28);
        com.lowagie.text.pdf.PdfReader pdfReader30 = null;
        byte[] byte_array35 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream36 = new com.lowagie.text.pdf.PRStream(pdfReader30, byte_array35);
        pRStream29.setData(byte_array35, false, (int) (byte) 100);
        byte[] byte_array40 = pRStream29.getBytes();
        pRStream10.setData(byte_array40);
        byte[] byte_array43 = com.lowagie.text.pdf.crypto.IVGenerator.getIV(0);
        com.lowagie.text.pdf.PRTokeniser pRTokeniser44 = new com.lowagie.text.pdf.PRTokeniser(byte_array43);
        int i45 = pRTokeniser44.length();
        int i46 = pRTokeniser44.getFilePointer();
        pRTokeniser44.close();
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
        byte[] byte_array90 = com.lowagie.text.pdf.crypto.IVGenerator.getIV(0);
        com.lowagie.text.pdf.PRTokeniser pRTokeniser91 = new com.lowagie.text.pdf.PRTokeniser(byte_array90);
        com.lowagie.text.pdf.BaseFont baseFont94 = com.lowagie.text.pdf.BaseFont.createFont("xmp:Thumbnails", "widths", true, false, byte_array87, byte_array90, true, false);
        boolean b95 = pRTokeniser44.readLineSegment(byte_array90);
        try {
            com.lowagie.text.pdf.BaseFont baseFont96 = com.lowagie.text.pdf.BaseFont.createFont("dc:description", "top", true, true, byte_array40, byte_array90);
            fail("Expected exception of type com.lowagie.text.DocumentException");
        } catch (com.lowagie.text.DocumentException e) {
        }
        assertNotNull(byte_array9);
        assertNotNull(byte_array16);
        assertNotNull(byte_array21);
        assertEquals(false, b22);
        assertNotNull(byte_array28);
        assertNotNull(byte_array35);
        assertNotNull(byte_array40);
        assertNotNull(byte_array43);
        assertEquals(0, i45);
        assertEquals(0, i46);
        assertNotNull(byte_array57);
        assertNotNull(byte_array64);
        assertNotNull(byte_array69);
        assertNotNull(byte_array75);
        assertNotNull(byte_array82);
        assertNotNull(byte_array87);
        assertNotNull(byte_array90);
        assertNull(baseFont94);
        assertEquals(false, b95);
    }

    @Test
    void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test004");
        java.io.OutputStream outputStream0 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields2 = new com.lowagie.text.pdf.PdfCopyFields(outputStream0, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = pdfCopyFields2.getWriter();
        int i4 = pdfWriter3.getCurrentPageNumber();
        pdfWriter3.setLinearPageMode();
        com.lowagie.text.pdf.PdfWriter pdfWriter6 = null;
        char[] char_array9 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font11 = new com.lowagie.text.pdf.Type3Font(pdfWriter6, char_array9, true);
        com.lowagie.text.pdf.Type3Font type3Font13 = new com.lowagie.text.pdf.Type3Font(pdfWriter3, char_array9, false);
        java.lang.String[][] str_array_array14 = type3Font13.getFamilyFontName();
        try {
            int i16 = type3Font13.getWidth("xmp:BaseURL");
            fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        assertNotNull(pdfWriter3);
        assertEquals(1, i4);
        assertNotNull(char_array9);
        assertNotNull(str_array_array14);
    }

    @Test
    void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test005");
        try {
            com.lowagie.text.pdf.BaseFont baseFont3 = com.lowagie.text.pdf.BaseFont.createFont("com/lowagie/text/pdf/fonts/", "Cp1250", true);
            fail("Expected exception of type com.lowagie.text.DocumentException");
        } catch (com.lowagie.text.DocumentException e) {
        }
    }

    @Test
    void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test006");
        com.lowagie.text.pdf.BaseFont baseFont0 = null;
        com.lowagie.text.Font font3 = new com.lowagie.text.Font(baseFont0, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont5 = font3.getCalculatedBaseFont(false);
        boolean b8 = baseFont5.setCharAdvance(9, 0);
        int i9 = baseFont5.getCompressionLevel();
        boolean b10 = baseFont5.isSubset();
        java.lang.String[] str_array11 = baseFont5.getCodePagesSupported();
        com.lowagie.text.Font font13 = new com.lowagie.text.Font(baseFont5, 1.65153267E9f);
        assertNotNull(baseFont5);
        assertEquals(true, b8);
        assertEquals(i9, (-1));
        assertEquals(true, b10);
        assertNotNull(str_array11);
    }

    @Test
    void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test007");
        int i0 = com.lowagie.text.pdf.ArabicLigaturizer.DIGITS_EN2AN;
        assertEquals(32, i0);
    }

    @Test
    void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test008");
        int i0 = com.lowagie.text.pdf.PushbuttonField.LAYOUT_ICON_LEFT_LABEL_RIGHT;
        assertEquals(5, i0);
    }

    @Test
    void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test009");
        com.lowagie.text.Chapter chapter1 = new com.lowagie.text.Chapter((int) (short) -1);
        com.lowagie.text.MarkedSection markedSection2 = chapter1.addMarkedSection();
        int i3 = markedSection2.type();
        int i4 = markedSection2.type();
        markedSection2.setIndentation(8.0f);
        assertNotNull(markedSection2);
        assertEquals(50, i3);
        assertEquals(50, i4);
    }

    @Test
    void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test010");
        com.lowagie.text.pdf.PdfDestination pdfDestination2 = new com.lowagie.text.pdf.PdfDestination((int) (byte) 47, (float) 1);
        com.lowagie.text.pdf.PdfIndirectReference pdfIndirectReference3 = null;
        boolean b4 = pdfDestination2.addPage(pdfIndirectReference3);
        try {
            com.lowagie.text.pdf.PdfIndirectReference pdfIndirectReference6 = pdfDestination2.getAsIndirectObject(8);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        assertEquals(true, b4);
    }

    @Test
    void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test011");
        com.lowagie.text.Annotation annotation8 = new com.lowagie.text.Annotation((float) '4', (float) 1, (float) '4', (float) 29, "listitem", "absolutey", "hi!", "ZapfDingbats");
        float f9 = annotation8.ury();
        float f11 = annotation8.llx((float) 6);
        boolean b12 = annotation8.isNestable();
        assertEquals(29.0f, f9);
        assertEquals(52.0f, f11);
        assertEquals(true, b12);
    }

    @Test
    void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test012");
        java.util.Optional<com.lowagie.text.alignment.VerticalAlignment> optional_verticalAlignment1 = com.lowagie.text.alignment.VerticalAlignment.of(16384);
        assertNotNull(optional_verticalAlignment1);
    }

    @Test
    void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test013");
        com.lowagie.text.Rectangle rectangle3 = new com.lowagie.text.Rectangle((float) 'ਁ', (float) 29, 2052);
    }

    @Test
    void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test014");
        java.awt.Color color0 = java.awt.Color.WHITE;
        assertNotNull(color0);
    }

    @Test
    void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test015");
        boolean b1 = com.lowagie.text.pdf.PdfEncryptor.isCopyAllowed((int) '翿');
        assertEquals(true, b1);
    }

    @Test
    void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test016");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaBrush.BS_NULL;
        assertEquals(1, i0);
    }

    @Test
    void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test017");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DEVICEGRAY;
        assertNotNull(pdfName0);
    }

    @Test
    void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test018");
        com.lowagie.text.pdf.hyphenation.Hyphenation hyphenation5 = com.lowagie.text.pdf.hyphenation.Hyphenator.hyphenate("grayfill", "orientation", "text/javascript", (int) '4', 1024);
        assertNull(hyphenation5);
    }

    @Test
    void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test019");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.RI;
        assertNotNull(pdfName0);
    }

    @Test
    void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test020");
        com.lowagie.text.FontFactoryImp fontFactoryImp0 = new com.lowagie.text.FontFactoryImp();
        fontFactoryImp0.register("underline");
        boolean b3 = fontFactoryImp0.defaultEmbedding;
        assertEquals(false, b3);
    }

    @Test
    void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test021");
        com.lowagie.text.pdf.Barcode128 barcode128_0 = new com.lowagie.text.pdf.Barcode128();
        com.lowagie.text.pdf.Barcode39 barcode39_1 = new com.lowagie.text.pdf.Barcode39();
        barcode39_1.setCodeType(0);
        com.lowagie.text.pdf.BarcodeEANSUPP barcodeEANSUPP4 = new com.lowagie.text.pdf.BarcodeEANSUPP((com.lowagie.text.pdf.Barcode) barcode128_0, (com.lowagie.text.pdf.Barcode) barcode39_1);
        barcodeEANSUPP4.setX((float) 256);
        com.lowagie.text.Rectangle rectangle7 = barcodeEANSUPP4.getBarcodeSize();
        float f8 = barcodeEANSUPP4.getBarHeight();
        assertNotNull(rectangle7);
        assertEquals(0.0f, f8);
    }

    @Test
    void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test022");
        com.lowagie.text.pdf.TSAClientBouncyCastle tSAClientBouncyCastle1 = new com.lowagie.text.pdf.TSAClientBouncyCastle("text-align");
        int i2 = tSAClientBouncyCastle1.getTokenSizeEstimate();
        assertEquals(4096, i2);
    }

    @Test
    void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test023");
        com.lowagie.text.pdf.PdfOutline pdfOutline0 = null;
        com.lowagie.text.pdf.PdfDestination pdfDestination3 = new com.lowagie.text.pdf.PdfDestination((int) (byte) 47, (float) 1);
        com.lowagie.text.pdf.PdfIndirectReference pdfIndirectReference4 = null;
        boolean b5 = pdfDestination3.addPage(pdfIndirectReference4);
        boolean b6 = pdfDestination3.isEmpty();
        com.lowagie.text.Paragraph paragraph7 = null;
        try {
            com.lowagie.text.pdf.PdfOutline pdfOutline9 = new com.lowagie.text.pdf.PdfOutline(pdfOutline0, pdfDestination3, paragraph7, true);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertEquals(true, b5);
        assertEquals(false, b6);
    }

    @Test
    void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test024");
        java.io.OutputStream outputStream0 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields2 = new com.lowagie.text.pdf.PdfCopyFields(outputStream0, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = pdfCopyFields2.getWriter();
        pdfWriter3.setFullCompression();
        boolean b5 = pdfWriter3.isTagged();
        assertNotNull(pdfWriter3);
        assertEquals(false, b5);
    }

    @Test
    void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test025");
        com.lowagie.text.Font font4 = com.lowagie.text.FontFactory.getFont("href", "SUBSUPSCRIPT", false, (float) 737);
        assertNotNull(font4);
    }

    @Test
    void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test026");
        try {
            com.lowagie.text.pdf.PdfAction pdfAction1 = new com.lowagie.text.pdf.PdfAction(1970433056);
            fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test027");
        int i0 = java.awt.geom.PathIterator.SEG_QUADTO;
        assertEquals(2, i0);
    }

    @Test
    void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test028");
        com.lowagie.text.pdf.Barcode128 barcode128_0 = new com.lowagie.text.pdf.Barcode128();
        com.lowagie.text.pdf.Barcode39 barcode39_1 = new com.lowagie.text.pdf.Barcode39();
        barcode39_1.setCodeType(0);
        com.lowagie.text.pdf.BarcodeEANSUPP barcodeEANSUPP4 = new com.lowagie.text.pdf.BarcodeEANSUPP((com.lowagie.text.pdf.Barcode) barcode128_0, (com.lowagie.text.pdf.Barcode) barcode39_1);
        barcodeEANSUPP4.setGuardBars(true);
        barcodeEANSUPP4.setSize(100.0f);
        boolean b9 = barcodeEANSUPP4.isGuardBars();
        int i10 = barcodeEANSUPP4.getCodeType();
        assertEquals(true, b9);
        assertEquals(0, i10);
    }

    @Test
    void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test029");
        com.lowagie.text.pdf.PdfAction pdfAction4 = new com.lowagie.text.pdf.PdfAction("class", "urx", "￼", "table-cell");
    }

    @Test
    void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test030");
        byte[] byte_array1 = com.lowagie.text.pdf.crypto.IVGenerator.getIV(0);
        com.lowagie.text.pdf.PRTokeniser pRTokeniser2 = new com.lowagie.text.pdf.PRTokeniser(byte_array1);
        int i3 = pRTokeniser2.length();
        int i4 = pRTokeniser2.getFilePointer();
        pRTokeniser2.backOnePosition(1336);
        pRTokeniser2.seek(50);
        assertNotNull(byte_array1);
        assertEquals(0, i3);
        assertEquals(0, i4);
    }

    @Test
    void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test031");
        int i0 = com.lowagie.text.pdf.BaseFont.UNDERLINE_THICKNESS;
        assertEquals(14, i0);
    }

    @Test
    void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test032");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.CALRGB;
        assertNotNull(pdfName0);
    }

    @Test
    void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test033");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.STANDARD;
        assertNotNull(pdfName0);
    }

    @Test
    void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test034");
        try {
            com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray1 = new com.lowagie.text.pdf.RandomAccessFileOrArray("urx");
            fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
    }

    @Test
    void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test035");
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
        try {
            com.lowagie.text.Image image21 = com.lowagie.text.ImageLoader.getJpeg2000Image(byte_array18);
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (com.lowagie.text.ExceptionConverter e) {
        }
        assertNotNull(byte_array5);
        assertNotNull(byte_array12);
        assertEquals("Stream", str17, "'" + str17 + "' != '" + "Stream" + "'");
        assertNotNull(byte_array18);
    }

    @Test
    void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test036");
        int i0 = com.lowagie.text.pdf.PdfStream.DEFAULT_COMPRESSION;
        assertEquals(i0, (-1));
    }

    @Test
    void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test037");
        java.io.OutputStream outputStream1 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields3 = new com.lowagie.text.pdf.PdfCopyFields(outputStream1, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter4 = pdfCopyFields3.getWriter();
        int i5 = pdfWriter4.getCurrentPageNumber();
        pdfWriter4.setLinearPageMode();
        com.lowagie.text.pdf.PdfLayer pdfLayer7 = com.lowagie.text.pdf.PdfLayer.createTitle("title", pdfWriter4);
        try {
            pdfWriter4.flush();
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfWriter4);
        assertEquals(1, i5);
        assertNotNull(pdfLayer7);
    }

    @Test
    void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test038");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.WIDTH;
        assertNotNull(pdfName0);
    }

    @Test
    void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test039");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.C;
        assertNotNull(pdfName0);
    }

    @Test
    void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test040");
        try {
            byte[] byte_array1 = com.lowagie.text.pdf.BarcodeEAN.getBarsSupplemental5("JustifyAll");
            fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test041");
        com.lowagie.text.Rectangle rectangle0 = com.lowagie.text.PageSize.B3;
        assertNotNull(rectangle0);
    }

    @Test
    void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test042");
        com.lowagie.text.pdf.GrayColor grayColor1 = new com.lowagie.text.pdf.GrayColor(23);
    }

    @Test
    void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test043");
        com.lowagie.text.pdf.codec.wmf.MetaState metaState0 = new com.lowagie.text.pdf.codec.wmf.MetaState();
        float f1 = metaState0.scalingY;
        com.lowagie.text.pdf.PdfContentByte pdfContentByte2 = null;
        metaState0.setLineJoinPolygon(pdfContentByte2);
        assertEquals(0.0f, f1);
    }

    @Test
    void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test044");
        com.lowagie.text.pdf.BarcodePDF417 barcodePDF417_0 = new com.lowagie.text.pdf.BarcodePDF417();
        int i1 = barcodePDF417_0.getBitColumns();
        barcodePDF417_0.setLenCodewords((int) 'Ë');
        assertEquals(0, i1);
    }

    @Test
    void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test045");
        java.io.OutputStream outputStream0 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields2 = new com.lowagie.text.pdf.PdfCopyFields(outputStream0, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = pdfCopyFields2.getWriter();
        int i4 = pdfWriter3.getCurrentPageNumber();
        pdfWriter3.setLinearPageMode();
        int i6 = pdfWriter3.getPageNumber();
        try {
            pdfWriter3.addJavaScript("LOCALGOTO", "colspan", true);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfWriter3);
        assertEquals(1, i4);
        assertEquals(0, i6);
    }

    @Test
    void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test046");
        com.lowagie.text.Annotation annotation6 = new com.lowagie.text.Annotation((float) 1336, (float) 262, 80.0f, 52.0f, "af", "");
    }

    @Test
    void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test047");
        java.lang.String str0 = com.lowagie.text.xml.xmp.XmpWriter.EXTRASPACE;
        assertEquals("                                                                                                   \n", str0, "'" + str0 + "' != '" + "                                                                                                   \n" + "'");
    }

    @Test
    void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test048");
        int i0 = com.lowagie.text.pdf.BaseField.DO_NOT_SCROLL;
        assertEquals(8388608, i0);
    }

    @Test
    void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test049");
        com.lowagie.text.pdf.Barcode128 barcode128_0 = new com.lowagie.text.pdf.Barcode128();
        com.lowagie.text.pdf.BaseFont baseFont1 = barcode128_0.getFont();
        java.lang.String str2 = barcode128_0.getAltText();
        int i3 = barcode128_0.getCodeType();
        assertNotNull(baseFont1);
        assertNull(str2);
        assertEquals(9, i3);
    }

    @Test
    void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test050");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier0 = com.lowagie.text.pdf.PdfPKCS7.X509Name.SURNAME;
        assertNotNull(aSN1ObjectIdentifier0);
    }

    @Test
    void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test051");
        java.lang.String str0 = com.lowagie.text.ElementTags.DEFAULT;
        assertEquals("Default", str0, "'" + str0 + "' != '" + "Default" + "'");
    }

    @Test
    void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test052");
        com.lowagie.text.pdf.Barcode128 barcode128_0 = new com.lowagie.text.pdf.Barcode128();
        com.lowagie.text.pdf.Barcode39 barcode39_1 = new com.lowagie.text.pdf.Barcode39();
        barcode39_1.setCodeType(0);
        com.lowagie.text.pdf.BarcodeEANSUPP barcodeEANSUPP4 = new com.lowagie.text.pdf.BarcodeEANSUPP((com.lowagie.text.pdf.Barcode) barcode128_0, (com.lowagie.text.pdf.Barcode) barcode39_1);
        barcode39_1.setTextAlignment(224);
    }

    @Test
    void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test053");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TU;
        assertNotNull(pdfName0);
    }

    @Test
    void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test054");
        com.lowagie.text.RectangleReadOnly rectangleReadOnly4 = new com.lowagie.text.RectangleReadOnly((float) (byte) 100, (float) 1336, (float) 'Ë', (float) 9);
        try {
            rectangleReadOnly4.setBorderWidth((float) 525);
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
    }

    @Test
    void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test055");
        byte[] byte_array0 = null;
        com.lowagie.text.pdf.PdfLiteral pdfLiteral1 = new com.lowagie.text.pdf.PdfLiteral(byte_array0);
        int i2 = pdfLiteral1.getPosition();
        int i3 = pdfLiteral1.getPosLength();
        assertEquals(0, i2);
        assertEquals(0, i3);
    }

    @Test
    void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test056");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.FONTFILE2;
        assertNotNull(pdfName0);
    }

    @Test
    void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test057");
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
        com.lowagie.text.pdf.PdfDashPattern pdfDashPattern45 = new com.lowagie.text.pdf.PdfDashPattern((float) 0L, (float) 8);
        byte[] byte_array46 = com.lowagie.text.pdf.PdfReader.decodePredictor(byte_array39, (com.lowagie.text.pdf.PdfObject) pdfDashPattern45);
        boolean b47 = pdfDashPattern45.isEmpty();
        com.lowagie.text.pdf.PdfBorderArray pdfBorderArray48 = new com.lowagie.text.pdf.PdfBorderArray(0.0f, (float) (-1L), 52.0f, pdfDashPattern45);
        assertNotNull(byte_array9);
        assertNotNull(byte_array16);
        assertNotNull(byte_array21);
        assertNotNull(byte_array27);
        assertNotNull(byte_array34);
        assertNotNull(byte_array39);
        assertNotNull(pdfName41);
        assertEquals("No message found for listitem", str42, "'" + str42 + "' != '" + "No message found for listitem" + "'");
        assertNotNull(byte_array46);
        assertEquals(false, b47);
    }

    @Test
    void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test058");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Cell cell5 = com.lowagie.text.factories.ElementFactory.getCell(properties1);
        boolean b6 = cell5.isUseBorderPadding();
        int i7 = cell5.getRowspan();
        try {
            float f8 = cell5.getLeft();
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(cell5);
        assertEquals(false, b6);
        assertEquals(1, i7);
    }

    @Test
    void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test059");
        java.lang.String str0 = com.lowagie.text.pdf.BaseFont.COURIER_BOLDOBLIQUE;
        assertEquals("Courier-BoldOblique", str0, "'" + str0 + "' != '" + "Courier-BoldOblique" + "'");
    }

    @Test
    void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test060");
        com.lowagie.text.pdf.ExtraEncoding extraEncoding1 = null;
        try {
            com.lowagie.text.pdf.PdfEncodings.addExtraEncoding("dc:date", extraEncoding1);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test061");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        float f3 = pdfPCell2.getIndent();
        float f4 = pdfPCell2.getFollowingIndent();
        com.lowagie.text.pdf.PdfPTable pdfPTable6 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell7 = pdfPTable6.getDefaultCell();
        float f8 = pdfPCell7.getIndent();
        com.lowagie.text.pdf.PdfPTable pdfPTable9 = pdfPCell7.getTable();
        pdfPCell2.softCloneNonPositionParameters((com.lowagie.text.Rectangle) pdfPCell7);
        pdfPCell7.setFollowingIndent((float) '#');
        assertNotNull(pdfPCell2);
        assertEquals(0.0f, f3);
        assertEquals(0.0f, f4);
        assertNotNull(pdfPCell7);
        assertEquals(0.0f, f8);
        assertNull(pdfPTable9);
    }

    @Test
    void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test062");
        try {
            java.lang.String str1 = com.lowagie.text.factories.RomanAlphabetFactory.getString((int) (short) 0);
            fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test063");
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
        java.io.OutputStream outputStream42 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields44 = new com.lowagie.text.pdf.PdfCopyFields(outputStream42, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter45 = pdfCopyFields44.getWriter();
        pdfWriter45.setFullCompression();
        java.lang.String[] str_array52 = new java.lang.String[]{"phrase", "Right", "title", "itext"};
        java.lang.String[] str_array57 = new java.lang.String[]{"phrase", "Right", "title", "itext"};
        java.lang.String[] str_array62 = new java.lang.String[]{"phrase", "Right", "title", "itext"};
        java.lang.String[] str_array67 = new java.lang.String[]{"phrase", "Right", "title", "itext"};
        java.lang.String[][] str_array_array68 = new java.lang.String[][]{str_array52, str_array57, str_array62, str_array67};
        com.lowagie.text.pdf.PdfFormField pdfFormField70 = com.lowagie.text.pdf.PdfFormField.createCombo(pdfWriter45, false, str_array_array68, (int) (byte) 100);
        com.lowagie.text.pdf.PdfFormField pdfFormField72 = com.lowagie.text.pdf.PdfFormField.createList(pdfWriter4, str_array_array68, 737);
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertNotNull(pdfName35);
        assertNotNull(pdfName36);
        assertNotNull(pdfName40);
        assertNotNull(pdfWriter45);
        assertNotNull(str_array52);
        assertNotNull(str_array57);
        assertNotNull(str_array62);
        assertNotNull(str_array67);
        assertNotNull(str_array_array68);
        assertNotNull(pdfFormField70);
        assertNotNull(pdfFormField72);
    }

    @Test
    void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test064");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        pdfPTable1.setSpacingBefore((float) 15);
        com.lowagie.text.pdf.PdfPCell pdfPCell5 = pdfPTable1.getDefaultCell();
        pdfPCell5.setPaddingTop((float) 6);
        java.awt.Color color8 = java.awt.Color.orange;
        pdfPCell5.setBorderColor(color8);
        assertNotNull(pdfPCell2);
        assertNotNull(pdfPCell5);
        assertNotNull(color8);
    }

    @Test
    void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test065");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Cell cell5 = com.lowagie.text.factories.ElementFactory.getCell(properties1);
        boolean b6 = cell5.isUseBorderPadding();
        cell5.setHorizontalAlignment("");
        java.util.Iterator iterator9 = cell5.getElements();
        cell5.setHorizontalAlignment(5);
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(cell5);
        assertEquals(false, b6);
        assertNotNull(iterator9);
    }

    @Test
    void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test066");
        com.lowagie.text.Font font1 = null;
        com.lowagie.text.Footnote footnote2 = new com.lowagie.text.Footnote("", font1);
        com.lowagie.text.HeaderFooter headerFooter4 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote2, true);
        headerFooter4.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle7 = headerFooter4.rotate();
        com.lowagie.text.Rectangle rectangle8 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter4);
        com.lowagie.text.Document document9 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter4);
        boolean b11 = document9.setMarginMirroringTopBottom(true);
        float f13 = document9.bottom((float) 100L);
        boolean b15 = document9.setMarginMirroringTopBottom(false);
        boolean b18 = document9.addHeader("SKEW", "OpenPDF 1.2.12.SNAPSHOT");
        assertNotNull(rectangle7);
        assertEquals(true, b11);
        assertEquals(136.0f, f13);
        assertEquals(true, b15);
        assertEquals(false, b18);
    }

    @Test
    void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test067");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        pdfPTable1.setSpacingBefore((float) 15);
        boolean b5 = pdfPTable1.isHeadersInEvent();
        pdfPTable1.setSkipFirstHeader(true);
        assertNotNull(pdfPCell2);
        assertEquals(false, b5);
    }

    @Test
    void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test068");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfAcroForm pdfAcroForm1 = new com.lowagie.text.pdf.PdfAcroForm(pdfWriter0);
        pdfAcroForm1.setNeedAppearances(true);
        boolean b4 = pdfAcroForm1.isDictionary();
        boolean b5 = pdfAcroForm1.isCatalog();
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
        pdfWriter10.setAtLeastPdfVersion('È');
        com.lowagie.text.pdf.PdfFormField pdfFormField47 = com.lowagie.text.pdf.PdfFormField.createRadioButton(pdfWriter10, true);
        try {
            pdfAcroForm1.addCalculationOrder(pdfFormField47);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertEquals(true, b4);
        assertEquals(false, b5);
        assertNotNull(pdfWriter10);
        assertNotNull(rectangle18);
        assertEquals(true, b22);
        assertNotNull(paragraph32);
        assertNotNull(pdfName41);
        assertNotNull(pdfName42);
        assertNotNull(pdfFormField47);
    }

    @Test
    void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test069");
        com.lowagie.text.pdf.PdfDashPattern pdfDashPattern2 = new com.lowagie.text.pdf.PdfDashPattern((float) 0L, (float) 8);
        com.lowagie.text.pdf.PdfStream pdfStream4 = pdfDashPattern2.getAsStream((int) (short) 0);
        com.lowagie.text.pdf.PRIndirectReference pRIndirectReference5 = null;
        try {
            pdfStream4.setIndRef(pRIndirectReference5);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNull(pdfStream4);
    }

    @Test
    void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test070");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier0 = com.lowagie.text.pdf.PdfPKCS7.X509Name.DC;
        assertNotNull(aSN1ObjectIdentifier0);
    }

    @Test
    void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test071");
        com.lowagie.text.pdf.BarcodePDF417 barcodePDF417_0 = new com.lowagie.text.pdf.BarcodePDF417();
        int i1 = barcodePDF417_0.getBitColumns();
        float f2 = barcodePDF417_0.getAspectRatio();
        assertEquals(0, i1);
        assertEquals(0.5f, f2);
    }

    @Test
    void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test072");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Cell cell5 = com.lowagie.text.factories.ElementFactory.getCell(properties1);
        cell5.setMaxLines(50);
        try {
            float f8 = cell5.getRight();
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(cell5);
    }

    @Test
    void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test073");
        com.lowagie.text.pdf.PdfNumber pdfNumber0 = com.lowagie.text.pdf.PdfFormXObject.ZERO;
        assertNotNull(pdfNumber0);
    }

    @Test
    void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test074");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Cell cell5 = com.lowagie.text.factories.ElementFactory.getCell(properties1);
        boolean b6 = cell5.isUseBorderPadding();
        cell5.setUseAscender(false);
        try {
            cell5.setLeft(1565);
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(cell5);
        assertEquals(false, b6);
    }

    @Test
    void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test075");
        com.lowagie.text.pdf.PdfNumber pdfNumber1 = new com.lowagie.text.pdf.PdfNumber(2052);
    }

    @Test
    void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test076");
        com.lowagie.text.SimpleCell simpleCell1 = new com.lowagie.text.SimpleCell(true);
        simpleCell1.setSpacing_left((float) 0L);
    }

    @Test
    void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test077");
        com.lowagie.text.Rectangle rectangle0 = com.lowagie.text.PageSize.SMALL_PAPERBACK;
        assertNotNull(rectangle0);
    }

    @Test
    void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test078");
        java.io.OutputStream outputStream0 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields2 = new com.lowagie.text.pdf.PdfCopyFields(outputStream0, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = pdfCopyFields2.getWriter();
        int i4 = pdfWriter3.getCurrentPageNumber();
        pdfWriter3.setLinearPageMode();
        com.lowagie.text.pdf.PdfWriter pdfWriter6 = null;
        char[] char_array9 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font11 = new com.lowagie.text.pdf.Type3Font(pdfWriter6, char_array9, true);
        com.lowagie.text.pdf.Type3Font type3Font13 = new com.lowagie.text.pdf.Type3Font(pdfWriter3, char_array9, false);
        java.lang.String[][] str_array_array14 = type3Font13.getFamilyFontName();
        com.lowagie.text.pdf.hyphenation.HyphenationException hyphenationException16 = new com.lowagie.text.pdf.hyphenation.HyphenationException("ZapfDingbats");
        java.lang.Throwable[] throwable_array17 = hyphenationException16.getSuppressed();
        java.lang.Object[][] obj_array_array18 = com.lowagie.text.Utilities.addToArray((java.lang.Object[][]) str_array_array14, (java.lang.Object[]) throwable_array17);
        assertNotNull(pdfWriter3);
        assertEquals(1, i4);
        assertNotNull(char_array9);
        assertNotNull(str_array_array14);
        assertNotNull(throwable_array17);
        assertNotNull(obj_array_array18);
    }

    @Test
    void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test079");
        com.lowagie.text.pdf.Barcode128 barcode128_0 = new com.lowagie.text.pdf.Barcode128();
        com.lowagie.text.pdf.Barcode39 barcode39_1 = new com.lowagie.text.pdf.Barcode39();
        barcode39_1.setCodeType(0);
        com.lowagie.text.pdf.BarcodeEANSUPP barcodeEANSUPP4 = new com.lowagie.text.pdf.BarcodeEANSUPP((com.lowagie.text.pdf.Barcode) barcode128_0, (com.lowagie.text.pdf.Barcode) barcode39_1);
        barcodeEANSUPP4.setGuardBars(true);
        int i7 = barcodeEANSUPP4.getCodeType();
        boolean b8 = barcodeEANSUPP4.isGuardBars();
        assertEquals(0, i7);
        assertEquals(true, b8);
    }

    @Test
    void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test080");
        com.lowagie.text.pdf.codec.wmf.MetaFont metaFont0 = new com.lowagie.text.pdf.codec.wmf.MetaFont();
        float f1 = metaFont0.getAngle();
        boolean b2 = metaFont0.isUnderline();
        assertEquals(0.0f, f1);
        assertEquals(false, b2);
    }

    @Test
    void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test081");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_SELECTCLIPREGION;
        assertEquals(300, i0);
    }

    @Test
    void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test082");
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
        com.lowagie.text.pdf.PdfWriter pdfWriter15 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField16 = com.lowagie.text.pdf.PdfFormField.createCheckBox(pdfWriter15);
        com.lowagie.text.pdf.PdfAction pdfAction18 = new com.lowagie.text.pdf.PdfAction("Cp1250");
        pdfFormField16.setAction(pdfAction18);
        try {
            pdfWriter3.addCalculationOrder(pdfFormField16);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfWriter3);
        assertEquals(1, i4);
        assertNotNull(markedSection10);
        assertEquals(0, i13);
        assertNotNull(pdfFormField16);
    }

    @Test
    void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test083");
        java.lang.String str0 = com.lowagie.text.pdf.AsianFontMapper.KoreanFont_SMyeongJo;
        assertEquals("HYSMyeongJo-Medium", str0, "'" + str0 + "' != '" + "HYSMyeongJo-Medium" + "'");
    }

    @Test
    void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test084");
        try {
            byte[] byte_array1 = com.lowagie.text.pdf.BarcodeEAN.getBarsUPCE("pdf:keywords");
            fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test085");
        com.lowagie.text.pdf.PdfOutline pdfOutline0 = null;
        com.lowagie.text.pdf.PdfAction pdfAction3 = new com.lowagie.text.pdf.PdfAction("none", false);
        com.lowagie.text.pdf.PdfString pdfString4 = new com.lowagie.text.pdf.PdfString();
        java.lang.String str5 = pdfString4.toUnicodeString();
        com.lowagie.text.pdf.PdfString pdfString7 = pdfString4.setHexWriting(false);
        try {
            com.lowagie.text.pdf.PdfOutline pdfOutline9 = new com.lowagie.text.pdf.PdfOutline(pdfOutline0, pdfAction3, pdfString7, false);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertEquals("", str5, "'" + str5 + "' != '" + "" + "'");
        assertNotNull(pdfString7);
    }

    @Test
    void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test086");
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
        pPKMS0.setContact("Allowed: Modify contents");
        assertNotNull(byte_array6);
        assertNotNull(pdfName9);
        assertNull(pdfObject10);
        assertNotNull(rectangle19);
        assertNotNull(f_array_array21);
        assertNotNull(pdfAnnotation22);
        assertEquals(false, b23);
        assertEquals(i24, (-1));
    }

    @Test
    void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test087");
        int i0 = com.lowagie.text.Jpeg2000.JP2_IHDR;
        assertEquals(1768449138, i0);
    }

    @Test
    void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test088");
        java.lang.String str0 = com.lowagie.text.Annotation.FILE;
        assertEquals("file", str0, "'" + str0 + "' != '" + "file" + "'");
    }

    @Test
    void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test089");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfAcroForm pdfAcroForm1 = new com.lowagie.text.pdf.PdfAcroForm(pdfWriter0);
        pdfAcroForm1.setNeedAppearances(true);
        boolean b4 = pdfAcroForm1.isDictionary();
        pdfAcroForm1.setNeedAppearances(true);
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
        com.lowagie.text.pdf.PdfName pdfName42 = com.lowagie.text.pdf.PdfName.NONE;
        com.lowagie.text.pdf.PdfName pdfName43 = com.lowagie.text.pdf.PdfName.XREF;
        pdfWriter11.setDefaultColorspace(pdfName42, (com.lowagie.text.pdf.PdfObject) pdfName43);
        pdfWriter11.setAtLeastPdfVersion('È');
        com.lowagie.text.pdf.PdfFormField pdfFormField48 = com.lowagie.text.pdf.PdfFormField.createRadioButton(pdfWriter11, true);
        com.lowagie.text.pdf.BaseFont baseFont49 = null;
        com.lowagie.text.Font font52 = new com.lowagie.text.Font(baseFont49, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont54 = font52.getCalculatedBaseFont(false);
        java.lang.String[] str_array55 = baseFont54.getDifferences();
        com.lowagie.text.pdf.PdfFormField pdfFormField57 = com.lowagie.text.pdf.PdfFormField.createList(pdfWriter11, str_array55, (-56509343));
        com.lowagie.text.pdf.BaseFont baseFont59 = null;
        com.lowagie.text.Font font62 = new com.lowagie.text.Font(baseFont59, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont64 = font62.getCalculatedBaseFont(false);
        boolean b67 = baseFont64.setCharAdvance(9, 0);
        java.lang.String[] str_array68 = baseFont64.getCodePagesSupported();
        com.lowagie.text.Font font69 = new com.lowagie.text.Font(baseFont64);
        try {
            pdfAcroForm1.drawSingleLineOfText(pdfFormField57, "hi!", baseFont64, (float) 'c', (float) 2, (float) (byte) 47, (float) 'c', 22.677166f);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertEquals(true, b4);
        assertNotNull(pdfWriter11);
        assertNotNull(rectangle19);
        assertEquals(true, b23);
        assertNotNull(paragraph33);
        assertNotNull(pdfName42);
        assertNotNull(pdfName43);
        assertNotNull(pdfFormField48);
        assertNotNull(baseFont54);
        assertNotNull(str_array55);
        assertNotNull(pdfFormField57);
        assertNotNull(baseFont64);
        assertEquals(true, b67);
        assertNotNull(str_array68);
    }

    @Test
    void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test090");
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
        pdfPCell25.setRowspan(526);
        assertNotNull(byte_array8);
        assertNotNull(byte_array15);
        assertEquals(i21, (-1));
        assertNull(str22);
    }

    @Test
    void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test091");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.SETOCGSTATE;
        assertNotNull(pdfName0);
    }

    @Test
    void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test092");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TOGGLE;
        assertNotNull(pdfName0);
    }

    @Test
    void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test093");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        com.lowagie.text.pdf.ColumnText columnText3 = null;
        pdfPCell2.setColumn(columnText3);
        pdfPCell2.setColspan(25610);
        assertNotNull(pdfPCell2);
    }

    @Test
    void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test094");
        float f2 = com.lowagie.text.html.Markup.parseLength("alignindent", (float) 264);
        assertEquals(0.0f, f2);
    }

    @Test
    void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test095");
        char char0 = com.lowagie.text.pdf.Barcode128.FNC1;
        assertEquals('Ê', char0);
    }

    @Test
    void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test096");
        com.lowagie.text.ListItem listItem0 = new com.lowagie.text.ListItem();
        listItem0.setLeading((float) 804);
        com.lowagie.text.Chapter chapter4 = new com.lowagie.text.Chapter((com.lowagie.text.Paragraph) listItem0, 262);
        com.lowagie.text.Section section7 = chapter4.addSection("UniCNS-UCS2-V", 259);
        section7.flushContent();
        boolean b9 = section7.isSection();
        assertNotNull(section7);
        assertEquals(true, b9);
    }

    @Test
    void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test097");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_SETTEXTJUSTIFICATION;
        assertEquals(522, i0);
    }

    @Test
    void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test098");
        com.lowagie.text.pdf.PdfString pdfString1 = new com.lowagie.text.pdf.PdfString("anchor");
    }

    @Test
    void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test099");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ANNOT;
        assertNotNull(pdfName0);
    }

    @Test
    void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test100");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TYPE1;
        assertNotNull(pdfName0);
    }

    @Test
    void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test101");
        com.lowagie.text.Rectangle rectangle0 = com.lowagie.text.PageSize.A7;
        assertNotNull(rectangle0);
    }

    @Test
    void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test102");
        java.io.OutputStream outputStream0 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields2 = new com.lowagie.text.pdf.PdfCopyFields(outputStream0, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = pdfCopyFields2.getWriter();
        int i4 = pdfWriter3.getCurrentPageNumber();
        com.lowagie.text.Chapter chapter6 = new com.lowagie.text.Chapter((int) (short) -1);
        pdfWriter3.setOutlines((java.util.List) chapter6);
        pdfWriter3.setTagged();
        com.lowagie.text.pdf.PdfPTable pdfPTable10 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell11 = pdfPTable10.getDefaultCell();
        float f12 = pdfPCell11.getIndent();
        com.lowagie.text.pdf.PdfPTable pdfPTable13 = pdfPCell11.getTable();
        com.lowagie.text.pdf.PdfPCellEvent pdfPCellEvent14 = pdfPCell11.getCellEvent();
        byte[] byte_array17 = com.lowagie.text.pdf.crypto.IVGenerator.getIV(0);
        try {
            com.lowagie.text.pdf.PdfAnnotation pdfAnnotation20 = com.lowagie.text.pdf.PdfAnnotation.createFileAttachment(pdfWriter3, (com.lowagie.text.Rectangle) pdfPCell11, "image", byte_array17, "convert2pdfp", "");
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfWriter3);
        assertEquals(1, i4);
        assertNotNull(pdfPCell11);
        assertEquals(0.0f, f12);
        assertNull(pdfPTable13);
        assertNull(pdfPCellEvent14);
        assertNotNull(byte_array17);
    }

    @Test
    void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test103");
        int i0 = com.lowagie.text.pdf.PdfObject.BOOLEAN;
        assertEquals(1, i0);
    }

    @Test
    void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test104");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        com.lowagie.text.pdf.ByteBuffer byteBuffer2 = new com.lowagie.text.pdf.ByteBuffer(1564);
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields4 = new com.lowagie.text.pdf.PdfCopyFields((java.io.OutputStream) byteBuffer2, 'Ã');
        com.lowagie.text.pdf.ByteBuffer byteBuffer6 = byteBuffer2.append(24);
        java.io.File file8 = null;
        try {
            com.lowagie.text.pdf.PdfStamper pdfStamper9 = com.lowagie.text.pdf.PdfStamper.createSignature(pdfReader0, (java.io.OutputStream) byteBuffer2, 'È', file8);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(byteBuffer6);
    }

    @Test
    void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test105");
        try {
            com.lowagie.text.Table table2 = new com.lowagie.text.Table((-56509343), 1078);
            fail("Expected exception of type com.lowagie.text.BadElementException");
        } catch (com.lowagie.text.BadElementException e) {
        }
    }

    @Test
    void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test106");
        char char0 = com.lowagie.text.pdf.Barcode128.START_B;
        assertEquals('h', char0);
    }

    @Test
    void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test107");
        com.lowagie.text.RectangleReadOnly rectangleReadOnly4 = new com.lowagie.text.RectangleReadOnly((float) (byte) 100, (float) 1336, (float) 'Ë', (float) 9);
        com.lowagie.text.pdf.Barcode39 barcode39_5 = new com.lowagie.text.pdf.Barcode39();
        barcode39_5.setGuardBars(false);
        java.awt.Color color11 = java.awt.Color.getHSBColor(100.0f, (float) (short) 1, 100.0f);
        int i12 = com.lowagie.text.pdf.ExtendedColor.getType(color11);
        java.awt.Color color14 = java.awt.Color.GREEN;
        java.awt.Color color15 = java.awt.Color.getColor("UnicodeBig", color14);
        java.awt.Image image16 = barcode39_5.createAwtImage(color11, color14);
        try {
            rectangleReadOnly4.setBorderColor(color14);
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        assertNotNull(color11);
        assertEquals(0, i12);
        assertNotNull(color14);
        assertNotNull(color15);
        assertNotNull(image16);
    }

    @Test
    void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test108");
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
        java.lang.String str32 = pRStream6.toString();
        assertNotNull(byte_array5);
        assertNotNull(byte_array12);
        assertNotNull(rectangle25);
        assertNotNull(f_array_array27);
        assertNotNull(pdfAnnotation28);
        assertEquals(false, b29);
        assertEquals(i30, (-1));
        assertEquals("Stream", str32, "'" + str32 + "' != '" + "Stream" + "'");
    }

    @Test
    void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test109");
        com.lowagie.text.alignment.VerticalAlignment verticalAlignment0 = com.lowagie.text.alignment.VerticalAlignment.BASELINE;
        assertEquals(verticalAlignment0, VerticalAlignment.BASELINE, "'" + verticalAlignment0 + "' != '" + VerticalAlignment.BASELINE + "'");
    }

    @Test
    void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test110");
        java.lang.String str0 = com.lowagie.text.ElementTags.KEYWORDS;
        assertEquals("keywords", str0, "'" + str0 + "' != '" + "keywords" + "'");
    }

    @Test
    void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test111");
        int i0 = com.lowagie.text.FontFactory.registerDirectories();
        assertEquals(472, i0);
    }

    @Test
    void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test112");
        java.lang.String str1 = com.lowagie.text.xml.simpleparser.IanaEncodings.getJavaEncoding("visibility");
        assertEquals("visibility", str1, "'" + str1 + "' != '" + "visibility" + "'");
    }

    @Test
    void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test113");
        java.io.InputStream inputStream0 = null;
        try {
            com.lowagie.text.Utilities.skip(inputStream0, (int) 'h');
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test114");
        com.lowagie.text.pdf.parser.TextAssembler textAssembler0 = null;
        com.lowagie.text.pdf.parser.PdfContentStreamHandler pdfContentStreamHandler1 = new com.lowagie.text.pdf.parser.PdfContentStreamHandler(textAssembler0);
        java.util.Map<java.lang.String, com.lowagie.text.pdf.parser.ContentOperator> map_str_contentOperator2 = null;
        pdfContentStreamHandler1.operators = map_str_contentOperator2;
        com.lowagie.text.pdf.parser.Matrix matrix4 = pdfContentStreamHandler1.textMatrix;
        com.lowagie.text.pdf.parser.GraphicsState[] graphicsState_array5 = new com.lowagie.text.pdf.parser.GraphicsState[]{};
        java.util.Stack<com.lowagie.text.pdf.parser.GraphicsState> stack_graphicsState6 = new java.util.Stack<com.lowagie.text.pdf.parser.GraphicsState>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<com.lowagie.text.pdf.parser.GraphicsState>) stack_graphicsState6, graphicsState_array5);
        pdfContentStreamHandler1.gsStack = stack_graphicsState6;
        try {
            com.lowagie.text.pdf.parser.ContentOperator contentOperator10 = pdfContentStreamHandler1.lookupOperator("pdf:Producer");
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNull(matrix4);
        assertNotNull(graphicsState_array5);
        assertEquals(false, b7);
    }

    @Test
    void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test115");
        com.lowagie.text.pdf.PdfPCell pdfPCell0 = new com.lowagie.text.pdf.PdfPCell();
        float f1 = pdfPCell0.getMinimumHeight();
        assertEquals(0.0f, f1);
    }

    @Test
    void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test116");
        int i0 = com.lowagie.text.pdf.PdfAction.SUBMIT_INCLUDE_NO_VALUE_FIELDS;
        assertEquals(2, i0);
    }

    @Test
    void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test117");
        com.lowagie.text.pdf.XfaForm.InverseStore inverseStore0 = new com.lowagie.text.pdf.XfaForm.InverseStore();
        try {
            java.lang.String str1 = inverseStore0.getDefaultName();
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
    }

    @Test
    void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test118");
        java.lang.String str0 = com.lowagie.text.xml.xmp.XmpMMSchema.RENDITIONCLASS;
        assertEquals("xmpMM:RenditionClass", str0, "'" + str0 + "' != '" + "xmpMM:RenditionClass" + "'");
    }

    @Test
    void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test119");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.XA;
        assertNotNull(pdfName0);
    }

    @Test
    void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test120");
        java.security.PrivateKey privateKey0 = null;
        java.security.cert.Certificate[] certificate_array1 = new java.security.cert.Certificate[]{};
        java.security.cert.CRL[] cRL_array2 = new java.security.cert.CRL[]{};
        try {
            com.lowagie.text.pdf.PdfPKCS7 pdfPKCS7_6 = new com.lowagie.text.pdf.PdfPKCS7(privateKey0, certificate_array1, cRL_array2, "id", "offset", false);
            fail("Expected exception of type java.security.NoSuchAlgorithmException");
        } catch (java.security.NoSuchAlgorithmException e) {
        }
        assertNotNull(certificate_array1);
        assertNotNull(cRL_array2);
    }

    @Test
    void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test121");
        java.util.HashMap hashMap0 = com.lowagie.text.xml.simpleparser.EntitiesToSymbol.map;
        com.lowagie.text.pdf.PdfWriter pdfWriter1 = null;
        com.lowagie.text.pdf.PdfDictionary pdfDictionary2 = com.lowagie.text.pdf.SimpleNamedDestination.outputNamedDestinationAsNames(hashMap0, pdfWriter1);
        com.lowagie.text.pdf.PdfPKCS7.X509Name.DefaultSymbols = hashMap0;
        com.lowagie.text.pdf.ByteBuffer byteBuffer5 = new com.lowagie.text.pdf.ByteBuffer(1564);
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields7 = new com.lowagie.text.pdf.PdfCopyFields((java.io.OutputStream) byteBuffer5, 'Ã');
        com.lowagie.text.pdf.ByteBuffer byteBuffer9 = byteBuffer5.append(24);
        com.lowagie.text.pdf.PdfReader pdfReader14 = null;
        byte[] byte_array19 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream20 = new com.lowagie.text.pdf.PRStream(pdfReader14, byte_array19);
        com.lowagie.text.pdf.PdfReader pdfReader21 = null;
        byte[] byte_array26 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream27 = new com.lowagie.text.pdf.PRStream(pdfReader21, byte_array26);
        pRStream20.setData(byte_array26, false, (int) (byte) 100);
        byte[] byte_array31 = pRStream20.getBytes();
        com.lowagie.text.pdf.PdfReader pdfReader32 = null;
        byte[] byte_array37 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream38 = new com.lowagie.text.pdf.PRStream(pdfReader32, byte_array37);
        com.lowagie.text.pdf.PdfReader pdfReader39 = null;
        byte[] byte_array44 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream45 = new com.lowagie.text.pdf.PRStream(pdfReader39, byte_array44);
        pRStream38.setData(byte_array44, false, (int) (byte) 100);
        byte[] byte_array49 = pRStream38.getBytes();
        pRStream20.setData(byte_array49);
        byte[] byte_array52 = com.lowagie.text.pdf.crypto.IVGenerator.getIV(0);
        com.lowagie.text.pdf.PRTokeniser pRTokeniser53 = new com.lowagie.text.pdf.PRTokeniser(byte_array52);
        com.lowagie.text.pdf.BaseFont baseFont56 = com.lowagie.text.pdf.BaseFont.createFont("xmp:Thumbnails", "widths", true, false, byte_array49, byte_array52, true, false);
        byteBuffer5.write(byte_array52);
        try {
            com.lowagie.text.pdf.SimpleNamedDestination.exportToXML(hashMap0, (java.io.OutputStream) byteBuffer5, "xmp:BaseURL", false);
            fail("Expected exception of type java.io.UnsupportedEncodingException");
        } catch (java.io.UnsupportedEncodingException e) {
        }
        assertNotNull(hashMap0);
        assertNotNull(pdfDictionary2);
        assertNotNull(byteBuffer9);
        assertNotNull(byte_array19);
        assertNotNull(byte_array26);
        assertNotNull(byte_array31);
        assertNotNull(byte_array37);
        assertNotNull(byte_array44);
        assertNotNull(byte_array49);
        assertNotNull(byte_array52);
        assertNull(baseFont56);
    }

    @Test
    void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test122");
        try {
            byte[] byte_array2 = com.lowagie.text.pdf.PdfEncodings.convertToBytes('Ã', "indent");
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (com.lowagie.text.ExceptionConverter e) {
        }
    }

    @Test
    void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test123");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Paragraph paragraph5 = com.lowagie.text.factories.ElementFactory.getParagraph(properties1);
        int i6 = properties1.size();
        properties1.clear();
        java.io.Writer writer8 = null;
        try {
            properties1.store(writer8, "Ā");
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(paragraph5);
        assertEquals(0, i6);
    }

    @Test
    void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test124");
        com.lowagie.text.pdf.PdfNumber pdfNumber0 = com.lowagie.text.pdf.PdfPage.PORTRAIT;
        assertNotNull(pdfNumber0);
    }

    @Test
    void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test125");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfAnnotation.HIGHLIGHT_PUSH;
        assertNotNull(pdfName0);
    }

    @Test
    void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test126");
        com.lowagie.text.Chapter chapter1 = new com.lowagie.text.Chapter((int) (short) -1);
        com.lowagie.text.MarkedSection markedSection2 = chapter1.addMarkedSection();
        markedSection2.setIndentationRight((float) 1);
        boolean b5 = markedSection2.isContent();
        markedSection2.setIndentationLeft((float) (byte) 10);
        assertNotNull(markedSection2);
        assertEquals(true, b5);
    }

    @Test
    void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test127");
        com.lowagie.text.pdf.BarcodePDF417 barcodePDF417_0 = new com.lowagie.text.pdf.BarcodePDF417();
        int i1 = barcodePDF417_0.getBitColumns();
        int i2 = barcodePDF417_0.getCodeRows();
        barcodePDF417_0.setCodeColumns((int) 'e');
        assertEquals(0, i1);
        assertEquals(0, i2);
    }

    @Test
    void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test128");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfAcroForm pdfAcroForm1 = new com.lowagie.text.pdf.PdfAcroForm(pdfWriter0);
        pdfAcroForm1.setNeedAppearances(true);
        boolean b4 = pdfAcroForm1.isDictionary();
        pdfAcroForm1.setNeedAppearances(true);
        com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS pPKMS7 = new com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS();
        com.lowagie.text.Font font9 = null;
        com.lowagie.text.Footnote footnote10 = new com.lowagie.text.Footnote("", font9);
        int[] i_array15 = new int[]{(short) 1, 1785737760, 8, 100};
        com.lowagie.text.pdf.SimpleBookmark.eliminatePages((java.util.List) footnote10, i_array15);
        pPKMS7.setByteRange(i_array15);
        com.lowagie.text.pdf.PdfName pdfName18 = com.lowagie.text.pdf.PdfName.DC;
        com.lowagie.text.pdf.PdfWriter pdfWriter19 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField23 = com.lowagie.text.pdf.PdfFormField.createTextField(pdfWriter19, true, false, (int) (short) 10);
        pPKMS7.putEx(pdfName18, (com.lowagie.text.pdf.PdfObject) pdfFormField23);
        com.lowagie.text.pdf.BaseFont baseFont26 = null;
        com.lowagie.text.Font font29 = new com.lowagie.text.Font(baseFont26, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont31 = font29.getCalculatedBaseFont(false);
        try {
            pdfAcroForm1.drawSingleLineOfText(pdfFormField23, "defaultdir", baseFont31, (float) 4096, (float) 302, (float) 531, (float) (short) 25610, (float) 65535);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertEquals(true, b4);
        assertNotNull(i_array15);
        assertNotNull(pdfName18);
        assertNotNull(pdfFormField23);
        assertNotNull(baseFont31);
    }

    @Test
    void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test129");
        java.awt.Color color2 = java.awt.Color.orange;
        com.lowagie.text.Font font3 = com.lowagie.text.FontFactory.getFont("hi!", (float) (byte) 47, color2);
        com.lowagie.text.pdf.BaseFont baseFont5 = font3.getCalculatedBaseFont(false);
        baseFont5.correctArabicAdvance();
        float f9 = baseFont5.getAscentPoint("columns", (float) 2368);
        assertNotNull(color2);
        assertNotNull(font3);
        assertNotNull(baseFont5);
        assertEquals(1700.2241f, f9);
    }

    @Test
    void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test130");
        com.lowagie.text.factories.RomanNumberFactory romanNumberFactory0 = new com.lowagie.text.factories.RomanNumberFactory();
    }

    @Test
    void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test131");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_STRETCHDIB;
        assertEquals(3907, i0);
    }

    @Test
    void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test132");
        char char0 = com.lowagie.text.pdf.Barcode128.CODE_C;
        assertEquals('Ç', char0);
    }

    @Test
    void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test133");
        com.lowagie.text.pdf.IntHashtable intHashtable1 = new com.lowagie.text.pdf.IntHashtable();
        boolean b3 = intHashtable1.containsValue(1785737760);
        int[] i_array4 = intHashtable1.getKeys();
        com.lowagie.text.pdf.IntHashtable intHashtable5 = new com.lowagie.text.pdf.IntHashtable();
        com.lowagie.text.pdf.PdfName pdfName6 = com.lowagie.text.pdf.PdfName.ON;
        java.lang.String str7 = com.lowagie.text.error_messages.MessageLocalization.getComposedMessage("file", (java.lang.Object) intHashtable1, (java.lang.Object) intHashtable5, (java.lang.Object) pdfName6);
        int i9 = intHashtable5.remove((int) 'Ë');
        int[] i_array10 = intHashtable5.getKeys();
        assertEquals(false, b3);
        assertNotNull(i_array4);
        assertNotNull(pdfName6);
        assertEquals("No message found for file", str7, "'" + str7 + "' != '" + "No message found for file" + "'");
        assertEquals(0, i9);
        assertNotNull(i_array10);
    }

    @Test
    void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test134");
        com.lowagie.text.pdf.hyphenation.HyphenationException hyphenationException1 = new com.lowagie.text.pdf.hyphenation.HyphenationException("content");
    }

    @Test
    void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test135");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        float f3 = pdfPCell2.getIndent();
        float f4 = pdfPCell2.getFollowingIndent();
        pdfPCell2.setRightIndent((float) 1785737827);
        assertNotNull(pdfPCell2);
        assertEquals(0.0f, f3);
        assertEquals(0.0f, f4);
    }

    @Test
    void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test136");
        com.lowagie.text.pdf.PdfContentByte pdfContentByte0 = null;
        com.lowagie.text.pdf.ColumnText columnText1 = new com.lowagie.text.pdf.ColumnText(pdfContentByte0);
        float f2 = columnText1.getFilledWidth();
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper3 = new com.lowagie.text.pdf.PdfPageEventHelper();
        com.lowagie.text.pdf.PdfWriter pdfWriter4 = null;
        com.lowagie.text.Document document5 = null;
        pdfPageEventHelper3.onChapterEnd(pdfWriter4, document5, (float) 262144);
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper8 = new com.lowagie.text.pdf.PdfPageEventHelper();
        java.io.OutputStream outputStream9 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields11 = new com.lowagie.text.pdf.PdfCopyFields(outputStream9, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter12 = pdfCopyFields11.getWriter();
        com.lowagie.text.Font font14 = null;
        com.lowagie.text.Footnote footnote15 = new com.lowagie.text.Footnote("", font14);
        com.lowagie.text.HeaderFooter headerFooter17 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote15, true);
        headerFooter17.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle20 = headerFooter17.rotate();
        com.lowagie.text.Rectangle rectangle21 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter17);
        com.lowagie.text.Document document22 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter17);
        boolean b24 = document22.setMarginMirroringTopBottom(true);
        com.lowagie.text.Font font28 = null;
        com.lowagie.text.Footnote footnote29 = new com.lowagie.text.Footnote("", font28);
        com.lowagie.text.HeaderFooter headerFooter31 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote29, true);
        headerFooter31.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph34 = headerFooter31.paragraph();
        pdfPageEventHelper8.onSection(pdfWriter12, document22, (float) 7, 262144, paragraph34);
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper36 = new com.lowagie.text.pdf.PdfPageEventHelper();
        java.io.OutputStream outputStream37 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields39 = new com.lowagie.text.pdf.PdfCopyFields(outputStream37, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter40 = pdfCopyFields39.getWriter();
        com.lowagie.text.Font font42 = null;
        com.lowagie.text.Footnote footnote43 = new com.lowagie.text.Footnote("", font42);
        com.lowagie.text.HeaderFooter headerFooter45 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote43, true);
        headerFooter45.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle48 = headerFooter45.rotate();
        com.lowagie.text.Rectangle rectangle49 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter45);
        com.lowagie.text.Document document50 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter45);
        boolean b52 = document50.setMarginMirroringTopBottom(true);
        com.lowagie.text.Font font56 = null;
        com.lowagie.text.Footnote footnote57 = new com.lowagie.text.Footnote("", font56);
        com.lowagie.text.HeaderFooter headerFooter59 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote57, true);
        headerFooter59.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph62 = headerFooter59.paragraph();
        pdfPageEventHelper36.onSection(pdfWriter40, document50, (float) 7, 262144, paragraph62);
        java.io.OutputStream outputStream64 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields66 = new com.lowagie.text.pdf.PdfCopyFields(outputStream64, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter67 = pdfCopyFields66.getWriter();
        int i68 = pdfWriter67.getCurrentPageNumber();
        com.lowagie.text.Font font70 = null;
        com.lowagie.text.Footnote footnote71 = new com.lowagie.text.Footnote("", font70);
        com.lowagie.text.HeaderFooter headerFooter73 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote71, true);
        headerFooter73.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle76 = headerFooter73.rotate();
        com.lowagie.text.Rectangle rectangle77 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter73);
        com.lowagie.text.Document document78 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter73);
        boolean b80 = document78.setMarginMirroringTopBottom(true);
        com.lowagie.text.Rectangle rectangle81 = com.lowagie.text.PageSize.A4;
        pdfPageEventHelper36.onGenericTag(pdfWriter67, document78, rectangle81, "com/lowagie/text/pdf/fonts/");
        com.lowagie.text.Font font86 = null;
        com.lowagie.text.Footnote footnote87 = new com.lowagie.text.Footnote("", font86);
        com.lowagie.text.HeaderFooter headerFooter89 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote87, true);
        headerFooter89.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph92 = headerFooter89.paragraph();
        pdfPageEventHelper3.onChapter(pdfWriter12, document78, (float) 526, paragraph92);
        columnText1.setText((com.lowagie.text.Phrase) paragraph92);
        assertEquals(0.0f, f2);
        assertNotNull(pdfWriter12);
        assertNotNull(rectangle20);
        assertEquals(true, b24);
        assertNotNull(paragraph34);
        assertNotNull(pdfWriter40);
        assertNotNull(rectangle48);
        assertEquals(true, b52);
        assertNotNull(paragraph62);
        assertNotNull(pdfWriter67);
        assertEquals(1, i68);
        assertNotNull(rectangle76);
        assertEquals(true, b80);
        assertNotNull(rectangle81);
        assertNotNull(paragraph92);
    }

    @Test
    void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test137");
        com.lowagie.text.exceptions.InvalidPdfException invalidPdfException1 = new com.lowagie.text.exceptions.InvalidPdfException("phrase");
    }

    @Test
    void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test138");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.WIPE;
        assertNotNull(pdfName0);
    }

    @Test
    void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test139");
        com.lowagie.text.pdf.XfaForm xfaForm0 = new com.lowagie.text.pdf.XfaForm();
        com.lowagie.text.pdf.XfaForm.Xml2SomDatasets xml2SomDatasets1 = null;
        xfaForm0.setDatasetsSom(xml2SomDatasets1);
        com.lowagie.text.pdf.XfaForm.AcroFieldsSearch acroFieldsSearch3 = xfaForm0.getAcroFieldsSom();
        org.w3c.dom.Document document4 = null;
        try {
            xfaForm0.setDomDocument(document4);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNull(acroFieldsSearch3);
    }

    @Test
    void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test140");
        com.lowagie.text.Chapter chapter2 = new com.lowagie.text.Chapter("UTF-8", 2368);
    }

    @Test
    void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test141");
        java.io.InputStream inputStream0 = null;
        com.lowagie.text.pdf.codec.wmf.InputMeta inputMeta1 = new com.lowagie.text.pdf.codec.wmf.InputMeta(inputStream0);
        inputMeta1.skip((int) (short) 0);
    }

    @Test
    void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test142");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ENCODING;
        boolean b1 = pdfName0.isStream();
        assertNotNull(pdfName0);
        assertEquals(false, b1);
    }

    @Test
    void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test143");
        com.lowagie.text.Chunk chunk0 = new com.lowagie.text.Chunk();
        com.lowagie.text.Image image1 = chunk0.getImage();
        com.lowagie.text.Chunk chunk3 = chunk0.setAnchor("");
        java.lang.String[] str_array14 = new java.lang.String[]{"dc:date", "Identity-V", "convert2pdfp", "widths", "class", "", "Right", "xmp:ModifyDate", "Right", "UnicodeBig"};
        java.util.ArrayList<java.lang.String> arraylist_str15 = new java.util.ArrayList<java.lang.String>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str15, str_array14);
        com.lowagie.text.pdf.PdfReader pdfReader17 = null;
        byte[] byte_array22 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream23 = new com.lowagie.text.pdf.PRStream(pdfReader17, byte_array22);
        com.lowagie.text.pdf.PdfReader pdfReader24 = null;
        byte[] byte_array29 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream30 = new com.lowagie.text.pdf.PRStream(pdfReader24, byte_array29);
        pRStream23.setData(byte_array29, false, (int) (byte) 100);
        java.lang.String str34 = pRStream23.toString();
        boolean b35 = arraylist_str15.contains((java.lang.Object) str34);
        com.lowagie.text.pdf.BaseFont baseFont36 = null;
        com.lowagie.text.Font font39 = new com.lowagie.text.Font(baseFont36, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont41 = font39.getCalculatedBaseFont(false);
        boolean b44 = baseFont41.setCharAdvance(9, 0);
        java.awt.Color color50 = java.awt.Color.getHSBColor(100.0f, (float) (short) 1, 100.0f);
        int i51 = com.lowagie.text.pdf.ExtendedColor.getType(color50);
        com.lowagie.text.Font font52 = new com.lowagie.text.Font(baseFont41, (float) (-1), (int) 'Ã', color50);
        int i53 = arraylist_str15.indexOf((java.lang.Object) color50);
        com.lowagie.text.pdf.PdfArray pdfArray54 = com.lowagie.text.pdf.PdfAnnotation.getMKColor(color50);
        java.awt.Color color55 = java.awt.Color.orange;
        com.lowagie.text.pdf.PdfShading.checkCompatibleColors(color50, color55);
        com.lowagie.text.Chunk chunk61 = chunk3.setBackground(color50, (float) 1L, (float) 0L, (float) '#', 10.0f);
        boolean b62 = chunk3.isContent();
        assertNull(image1);
        assertNotNull(chunk3);
        assertNotNull(str_array14);
        assertEquals(true, b16);
        assertNotNull(byte_array22);
        assertNotNull(byte_array29);
        assertEquals("Stream", str34, "'" + str34 + "' != '" + "Stream" + "'");
        assertEquals(false, b35);
        assertNotNull(baseFont41);
        assertEquals(true, b44);
        assertNotNull(color50);
        assertEquals(0, i51);
        assertEquals(i53, (-1));
        assertNotNull(pdfArray54);
        assertNotNull(color55);
        assertNotNull(chunk61);
        assertEquals(true, b62);
    }

    @Test
    void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test144");
        com.lowagie.text.pdf.ByteBuffer byteBuffer1 = new com.lowagie.text.pdf.ByteBuffer(1564);
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields3 = new com.lowagie.text.pdf.PdfCopyFields((java.io.OutputStream) byteBuffer1, 'Ã');
        com.lowagie.text.pdf.ByteBuffer byteBuffer5 = byteBuffer1.append('4');
        com.lowagie.text.pdf.codec.wmf.MetaDo.writeWord((java.io.OutputStream) byteBuffer5, (int) (short) -1);
        assertNotNull(byteBuffer5);
    }

    @Test
    void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test145");
        java.lang.String str0 = com.lowagie.text.ElementTags.ALIGN_MIDDLE;
        assertEquals("Middle", str0, "'" + str0 + "' != '" + "Middle" + "'");
    }

    @Test
    void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test146");
        com.lowagie.text.pdf.BaseFont baseFont0 = null;
        com.lowagie.text.Font font3 = new com.lowagie.text.Font(baseFont0, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont5 = font3.getCalculatedBaseFont(false);
        int i7 = baseFont5.getCidCode(256);
        baseFont5.setSubset(true);
        assertNotNull(baseFont5);
        assertEquals(256, i7);
    }

    @Test
    void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test147");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        float f3 = pdfPCell2.getIndent();
        com.lowagie.text.pdf.PdfPTable pdfPTable4 = pdfPCell2.getTable();
        com.lowagie.text.pdf.PdfPCellEvent pdfPCellEvent5 = pdfPCell2.getCellEvent();
        int i6 = pdfPCell2.getRowspan();
        int i7 = pdfPCell2.getRotation();
        assertNotNull(pdfPCell2);
        assertEquals(0.0f, f3);
        assertNull(pdfPTable4);
        assertNull(pdfPCellEvent5);
        assertEquals(1, i6);
        assertEquals(0, i7);
    }

    @Test
    void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test148");
        com.lowagie.text.pdf.ByteBuffer byteBuffer1 = new com.lowagie.text.pdf.ByteBuffer(1564);
        byte[] byte_array4 = new byte[]{(byte) -1, (byte) 0};
        com.lowagie.text.pdf.PdfEFStream pdfEFStream5 = new com.lowagie.text.pdf.PdfEFStream(byte_array4);
        com.lowagie.text.pdf.OutputStreamEncryption outputStreamEncryption7 = new com.lowagie.text.pdf.OutputStreamEncryption((java.io.OutputStream) byteBuffer1, byte_array4, (int) (byte) 47);
        try {
            com.lowagie.text.xml.xmp.XmpWriter xmpWriter10 = new com.lowagie.text.xml.xmp.XmpWriter((java.io.OutputStream) byteBuffer1, "table", (int) 'Ê');
            fail("Expected exception of type java.io.UnsupportedEncodingException");
        } catch (java.io.UnsupportedEncodingException e) {
        }
        assertNotNull(byte_array4);
    }

    @Test
    void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test149");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.CIDFONTTYPE0;
        assertNotNull(pdfName0);
    }

    @Test
    void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test150");
        int i0 = com.lowagie.text.pdf.ArabicLigaturizer.ar_novowel;
        assertEquals(1, i0);
    }

    @Test
    void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test151");
        com.lowagie.text.pdf.hyphenation.ByteVector byteVector1 = new com.lowagie.text.pdf.hyphenation.ByteVector((int) (byte) 60);
        byteVector1.trimToSize();
    }

    @Test
    void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test152");
        com.lowagie.text.pdf.PdfOutline pdfOutline0 = null;
        com.lowagie.text.pdf.PdfDestination pdfDestination6 = new com.lowagie.text.pdf.PdfDestination(2368, 8.0f, (float) 1048576, 80.0f, 22.677166f);
        try {
            com.lowagie.text.pdf.PdfOutline pdfOutline9 = new com.lowagie.text.pdf.PdfOutline(pdfOutline0, pdfDestination6, "dc:relation", true);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test153");
        com.lowagie.text.Font font5 = com.lowagie.text.FontFactory.getFont("xmp:ModifyDate", "http://ns.adobe.com/xap/1.0/mm/", true, (float) 0L, 737);
        assertNotNull(font5);
    }

    @Test
    void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test154");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.HID;
        assertNotNull(pdfName0);
    }

    @Test
    void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test155");
        byte[] byte_array2 = com.lowagie.text.pdf.crypto.IVGenerator.getIV(0);
        com.lowagie.text.pdf.PRTokeniser pRTokeniser3 = new com.lowagie.text.pdf.PRTokeniser(byte_array2);
        int i4 = pRTokeniser3.getFilePointer();
        java.lang.String str6 = com.lowagie.text.error_messages.MessageLocalization.getComposedMessage("Center", (java.lang.Object) i4, (java.lang.Object) "page-break-after");
        assertNotNull(byte_array2);
        assertEquals(0, i4);
        assertEquals("No message found for Center", str6, "'" + str6 + "' != '" + "No message found for Center" + "'");
    }

    @Test
    void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test156");
        boolean b0 = com.lowagie.text.List.ALPHABETICAL;
        assertEquals(true, b0);
    }

    @Test
    void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test157");
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
        int i56 = radioCheckField51.getAlignment();
        radioCheckField51.setText("text-decoration");
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
        assertEquals(0, i56);
    }

    @Test
    void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test158");
        int i0 = com.lowagie.text.Jpeg2000.JP2_COLR;
        assertEquals(1668246642, i0);
    }

    @Test
    void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test159");
        java.security.cert.Certificate certificate0 = null;
        com.lowagie.text.pdf.PdfPublicKeyRecipient pdfPublicKeyRecipient2 = new com.lowagie.text.pdf.PdfPublicKeyRecipient(certificate0, (int) (byte) 100);
        java.security.cert.Certificate certificate3 = pdfPublicKeyRecipient2.getCertificate();
        assertNull(certificate3);
    }

    @Test
    void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test160");
        java.io.OutputStream outputStream0 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields2 = new com.lowagie.text.pdf.PdfCopyFields(outputStream0, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = pdfCopyFields2.getWriter();
        pdfWriter3.setFullCompression();
        java.lang.String[] str_array10 = new java.lang.String[]{"phrase", "Right", "title", "itext"};
        java.lang.String[] str_array15 = new java.lang.String[]{"phrase", "Right", "title", "itext"};
        java.lang.String[] str_array20 = new java.lang.String[]{"phrase", "Right", "title", "itext"};
        java.lang.String[] str_array25 = new java.lang.String[]{"phrase", "Right", "title", "itext"};
        java.lang.String[][] str_array_array26 = new java.lang.String[][]{str_array10, str_array15, str_array20, str_array25};
        com.lowagie.text.pdf.PdfFormField pdfFormField28 = com.lowagie.text.pdf.PdfFormField.createCombo(pdfWriter3, false, str_array_array26, (int) (byte) 100);
        com.lowagie.text.pdf.BaseFont baseFont29 = null;
        com.lowagie.text.Font font32 = new com.lowagie.text.Font(baseFont29, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont34 = font32.getCalculatedBaseFont(false);
        java.lang.String[] str_array35 = baseFont34.getDifferences();
        java.lang.Object[][] obj_array_array36 = com.lowagie.text.Utilities.addToArray((java.lang.Object[][]) str_array_array26, (java.lang.Object[]) str_array35);
        assertNotNull(pdfWriter3);
        assertNotNull(str_array10);
        assertNotNull(str_array15);
        assertNotNull(str_array20);
        assertNotNull(str_array25);
        assertNotNull(str_array_array26);
        assertNotNull(pdfFormField28);
        assertNotNull(baseFont34);
        assertNotNull(str_array35);
        assertNotNull(obj_array_array36);
    }

    @Test
    void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test161");
        com.lowagie.text.pdf.parser.TextAssembler textAssembler0 = null;
        com.lowagie.text.pdf.parser.PdfContentStreamHandler pdfContentStreamHandler1 = new com.lowagie.text.pdf.parser.PdfContentStreamHandler(textAssembler0);
        java.util.Map<java.lang.String, com.lowagie.text.pdf.parser.ContentOperator> map_str_contentOperator2 = null;
        pdfContentStreamHandler1.operators = map_str_contentOperator2;
        com.lowagie.text.pdf.parser.ContentOperator contentOperator4 = null;
        try {
            pdfContentStreamHandler1.registerContentOperator(contentOperator4);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test162");
        int i0 = com.lowagie.text.pdf.AcroFields.Item.WRITE_VALUE;
        assertEquals(4, i0);
    }

    @Test
    void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test163");
        com.lowagie.text.pdf.PdfAction pdfAction1 = new com.lowagie.text.pdf.PdfAction("http://ns.adobe.com/xap/1.0/mm/");
    }

    @Test
    void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test164");
        java.lang.String str0 = com.lowagie.text.xml.xmp.XmpMMSchema.HISTORY;
        assertEquals("xmpMM:History", str0, "'" + str0 + "' != '" + "xmpMM:History" + "'");
    }

    @Test
    void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test165");
        java.io.OutputStream outputStream0 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields2 = new com.lowagie.text.pdf.PdfCopyFields(outputStream0, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = pdfCopyFields2.getWriter();
        com.lowagie.text.Annotation annotation9 = new com.lowagie.text.Annotation(0.0f, (float) 9, 29.0f, (float) 'Ã', "href");
        com.lowagie.text.pdf.PdfWriter pdfWriter10 = null;
        com.lowagie.text.Font font12 = null;
        com.lowagie.text.Footnote footnote13 = new com.lowagie.text.Footnote("", font12);
        com.lowagie.text.HeaderFooter headerFooter15 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote13, true);
        headerFooter15.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle18 = headerFooter15.rotate();
        float[][] f_array_array20 = new float[][]{};
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation21 = com.lowagie.text.pdf.PdfAnnotation.createInk(pdfWriter10, (com.lowagie.text.Rectangle) headerFooter15, "widths", f_array_array20);
        float f22 = headerFooter15.getBorderWidthTop();
        com.lowagie.text.MarkedObject markedObject23 = new com.lowagie.text.MarkedObject((com.lowagie.text.Element) headerFooter15);
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation24 = com.lowagie.text.pdf.internal.PdfAnnotationsImp.convertAnnotation(pdfWriter3, annotation9, (com.lowagie.text.Rectangle) headerFooter15);
        assertNotNull(pdfWriter3);
        assertNotNull(rectangle18);
        assertNotNull(f_array_array20);
        assertNotNull(pdfAnnotation21);
        assertEquals(1.0f, f22);
        assertNotNull(pdfAnnotation24);
    }

    @Test
    void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test166");
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
        com.lowagie.text.pdf.PdfName pdfName45 = com.lowagie.text.pdf.PdfName.TH;
        com.lowagie.text.pdf.PdfName pdfName46 = pdfAnnotation44.getAsName(pdfName45);
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
        com.lowagie.text.Font font76 = null;
        com.lowagie.text.Footnote footnote77 = new com.lowagie.text.Footnote("", font76);
        com.lowagie.text.HeaderFooter headerFooter79 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote77, true);
        headerFooter79.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle82 = headerFooter79.rotate();
        com.lowagie.text.Rectangle rectangle83 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter79);
        com.lowagie.text.Document document84 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter79);
        com.lowagie.text.pdf.PdfName pdfName85 = com.lowagie.text.pdf.PdfName.TIME;
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation87 = com.lowagie.text.pdf.PdfAnnotation.createLink(pdfWriter51, (com.lowagie.text.Rectangle) headerFooter79, pdfName85, "<?xpacket end=\"r\"?>");
        com.lowagie.text.pdf.PdfName pdfName88 = com.lowagie.text.pdf.PdfName.RANGE;
        com.lowagie.text.pdf.PdfObject pdfObject89 = com.lowagie.text.pdf.PdfReader.getPdfObjectRelease((com.lowagie.text.pdf.PdfObject) pdfAnnotation87, (com.lowagie.text.pdf.PdfObject) pdfName88);
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation90 = com.lowagie.text.pdf.PdfFormField.shallowDuplicate(pdfAnnotation87);
        com.lowagie.text.pdf.PdfName pdfName91 = com.lowagie.text.pdf.PdfName.GTS_PDFX;
        com.lowagie.text.pdf.PdfAction pdfAction94 = new com.lowagie.text.pdf.PdfAction("table", "a");
        pdfAnnotation87.setAdditionalActions(pdfName91, pdfAction94);
        pdfAnnotation44.setAction(pdfAction94);
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertNotNull(pdfName35);
        assertNotNull(pdfName36);
        assertNotNull(rectangle38);
        assertNotNull(pdfAnnotation44);
        assertNotNull(pdfName45);
        assertNull(pdfName46);
        assertNotNull(pdfWriter51);
        assertNotNull(rectangle59);
        assertEquals(true, b63);
        assertNotNull(paragraph73);
        assertNotNull(rectangle82);
        assertNotNull(pdfName85);
        assertNotNull(pdfAnnotation87);
        assertNotNull(pdfName88);
        assertNotNull(pdfObject89);
        assertNotNull(pdfAnnotation90);
        assertNotNull(pdfName91);
    }

    @Test
    void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test167");
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
        pdfWriter4.setInitialLeading((float) 64);
        com.lowagie.text.pdf.PdfOutline pdfOutline30 = pdfWriter4.getRootOutline();
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertNull(pdfOutline30);
    }

    @Test
    void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test168");
        com.lowagie.text.pdf.PdfDashPattern pdfDashPattern2 = new com.lowagie.text.pdf.PdfDashPattern((float) 0L, (float) 8);
        com.lowagie.text.pdf.PdfStream pdfStream4 = pdfDashPattern2.getAsStream((int) (short) 0);
        com.lowagie.text.pdf.PdfBoolean pdfBoolean6 = pdfDashPattern2.getAsBoolean(0);
        assertNull(pdfStream4);
        assertNull(pdfBoolean6);
    }

    @Test
    void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test169");
        com.lowagie.text.Annotation annotation8 = new com.lowagie.text.Annotation((float) '4', (float) 1, (float) '4', (float) 29, "listitem", "absolutey", "hi!", "ZapfDingbats");
        java.util.HashMap hashMap9 = annotation8.attributes();
        boolean b10 = annotation8.isContent();
        assertNotNull(hashMap9);
        assertEquals(true, b10);
    }

    @Test
    void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test170");
        com.lowagie.text.Font font5 = com.lowagie.text.FontFactory.getFont("page-break-after", "face", (float) 30);
        com.lowagie.text.ListItem listItem6 = new com.lowagie.text.ListItem("border-bottom-width", font5);
        com.lowagie.text.Anchor anchor7 = new com.lowagie.text.Anchor("plainwidth", font5);
        java.util.ArrayList arrayList8 = anchor7.getChunks();
        java.lang.String str9 = anchor7.getName();
        java.net.URL uRL10 = anchor7.getUrl();
        assertNotNull(font5);
        assertNotNull(arrayList8);
        assertNull(str9);
        assertNull(uRL10);
    }

    @Test
    void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test171");
        com.lowagie.text.ZapfDingbatsNumberList zapfDingbatsNumberList2 = new com.lowagie.text.ZapfDingbatsNumberList((int) 'Æ', 526);
    }

    @Test
    void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test172");
        com.lowagie.text.pdf.draw.DrawInterface drawInterface0 = null;
        com.lowagie.text.pdf.draw.VerticalPositionMark verticalPositionMark2 = new com.lowagie.text.pdf.draw.VerticalPositionMark(drawInterface0, (float) (short) 10);
        com.lowagie.text.Chunk chunk4 = new com.lowagie.text.Chunk((com.lowagie.text.pdf.draw.DrawInterface) verticalPositionMark2, (float) 247);
    }

    @Test
    void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test173");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.USEOUTLINES;
        assertNotNull(pdfName0);
    }

    @Test
    void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test174");
        int i2 = com.lowagie.text.Utilities.convertToUtf32('Ç', 'h');
        assertEquals(i2, (-56410008));
    }

    @Test
    void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test175");
        int i0 = com.lowagie.text.Image.DY;
        assertEquals(7, i0);
    }

    @Test
    void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test176");
        java.lang.String str1 = com.lowagie.text.pdf.TextField.obfuscatePassword("bgred");
        assertEquals("*****", str1, "'" + str1 + "' != '" + "*****" + "'");
    }

    @Test
    void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test177");
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
        java.util.Set<com.lowagie.text.pdf.PdfName> set_pdfName43 = pRStream6.getKeys();
        assertNotNull(byte_array5);
        assertNotNull(byte_array12);
        assertNotNull(byte_array17);
        assertEquals(false, b18);
        assertNotNull(byte_array24);
        assertNotNull(byte_array31);
        assertNotNull(byte_array36);
        assertNotNull(byte_array40);
        assertNotNull(byte_array42);
        assertNotNull(set_pdfName43);
    }

    @Test
    void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test178");
        com.lowagie.text.pdf.hyphenation.HyphenationException hyphenationException1 = new com.lowagie.text.pdf.hyphenation.HyphenationException("ZapfDingbats");
        com.lowagie.text.BadElementException badElementException2 = new com.lowagie.text.BadElementException((java.lang.Exception) hyphenationException1);
        com.lowagie.text.ExceptionConverter exceptionConverter3 = new com.lowagie.text.ExceptionConverter((java.lang.Exception) badElementException2);
        java.lang.String str4 = exceptionConverter3.toString();
        assertEquals("com.lowagie.text.BadElementException: com.lowagie.text.pdf.hyphenation.HyphenationException: ZapfDingbats", str4, "'" + str4 + "' != '" + "com.lowagie.text.BadElementException: com.lowagie.text.pdf.hyphenation.HyphenationException: ZapfDingbats" + "'");
    }

    @Test
    void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test179");
        int i0 = java.awt.geom.PathIterator.WIND_EVEN_ODD;
        assertEquals(0, i0);
    }

    @Test
    void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test180");
        com.lowagie.text.factories.ElementFactory elementFactory0 = new com.lowagie.text.factories.ElementFactory();
    }

    @Test
    void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test181");
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
        boolean b21 = pdfCopyFields2.isFullCompression();
        pdfCopyFields2.setViewerPreferences(2881);
        com.lowagie.text.pdf.PdfReader pdfReader24 = null;
        com.lowagie.text.pdf.AcroFields.Item item25 = new com.lowagie.text.pdf.AcroFields.Item();
        com.lowagie.text.Font font27 = null;
        com.lowagie.text.Footnote footnote28 = new com.lowagie.text.Footnote("", font27);
        com.lowagie.text.HeaderFooter headerFooter30 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote28, true);
        com.lowagie.text.pdf.HyphenationAuto hyphenationAuto35 = new com.lowagie.text.pdf.HyphenationAuto("Default", "creationdate", (-1), 1785737760);
        footnote28.setHyphenation((com.lowagie.text.pdf.HyphenationEvent) hyphenationAuto35);
        item25.widgets = footnote28;
        com.lowagie.text.Font font39 = null;
        com.lowagie.text.Footnote footnote40 = new com.lowagie.text.Footnote("", font39);
        com.lowagie.text.HeaderFooter headerFooter42 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote40, true);
        headerFooter42.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph45 = headerFooter42.paragraph();
        com.lowagie.text.ChapterAutoNumber chapterAutoNumber46 = new com.lowagie.text.ChapterAutoNumber(paragraph45);
        com.lowagie.text.Font font48 = null;
        com.lowagie.text.Footnote footnote49 = new com.lowagie.text.Footnote("", font48);
        com.lowagie.text.HeaderFooter headerFooter51 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote49, true);
        com.lowagie.text.pdf.HyphenationAuto hyphenationAuto56 = new com.lowagie.text.pdf.HyphenationAuto("Default", "creationdate", (-1), 1785737760);
        footnote49.setHyphenation((com.lowagie.text.pdf.HyphenationEvent) hyphenationAuto56);
        com.lowagie.text.Paragraph paragraph60 = com.lowagie.text.Section.constructTitle(paragraph45, (java.util.ArrayList) footnote49, (int) (byte) 100, 15);
        item25.page = paragraph60;
        try {
            pdfCopyFields2.addDocument(pdfReader24, (java.util.List) paragraph60);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfName3);
        assertNotNull(pdfFormField5);
        assertEquals(0, i9);
        assertNotNull(font15);
        assertEquals(0.0f, f17);
        assertEquals(false, b21);
        assertNotNull(paragraph45);
        assertNotNull(paragraph60);
    }

    @Test
    void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test182");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte12 = type3Font5.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        try {
            com.lowagie.text.pdf.PdfOutline pdfOutline13 = pdfContentByte12.getRootOutline();
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(char_array3);
        assertNotNull(pdfContentByte12);
    }

    @Test
    void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test183");
        int i0 = com.lowagie.text.pdf.PdfWriter.DisplayDocTitle;
        assertEquals(131072, i0);
    }

    @Test
    void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test184");
        int i0 = com.lowagie.text.Image.LEFT;
        assertEquals(0, i0);
    }

    @Test
    void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test185");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        pdfPTable1.setSpacingBefore((float) 15);
        com.lowagie.text.pdf.PdfPCell pdfPCell5 = pdfPTable1.getDefaultCell();
        com.lowagie.text.pdf.PdfPCellEvent pdfPCellEvent6 = pdfPCell5.getCellEvent();
        pdfPCell5.setUseAscender(true);
        assertNotNull(pdfPCell2);
        assertNotNull(pdfPCell5);
        assertNull(pdfPCellEvent6);
    }

    @Test
    void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test186");
        byte[] byte_array1 = com.lowagie.text.pdf.crypto.IVGenerator.getIV(0);
        com.lowagie.text.pdf.PRTokeniser pRTokeniser2 = new com.lowagie.text.pdf.PRTokeniser(byte_array1);
        try {
            int i3 = pRTokeniser2.intValue();
            fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
        assertNotNull(byte_array1);
    }

    @Test
    void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test187");
        com.lowagie.text.pdf.PdfDashPattern pdfDashPattern2 = new com.lowagie.text.pdf.PdfDashPattern((float) 0L, (float) 8);
        com.lowagie.text.pdf.PdfStream pdfStream4 = pdfDashPattern2.getAsStream((int) (short) 0);
        com.lowagie.text.pdf.PdfName pdfName6 = com.lowagie.text.pdf.PdfName.EMBEDDEDFILE;
        try {
            pdfDashPattern2.add(1791, (com.lowagie.text.pdf.PdfObject) pdfName6);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        assertNull(pdfStream4);
        assertNotNull(pdfName6);
    }

    @Test
    void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test188");
        com.lowagie.text.ZapfDingbatsNumberList zapfDingbatsNumberList1 = new com.lowagie.text.ZapfDingbatsNumberList(8196);
        int i2 = zapfDingbatsNumberList1.getType();
        assertEquals(8196, i2);
    }

    @Test
    void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test189");
        com.lowagie.text.pdf.internal.PdfXConformanceImp pdfXConformanceImp0 = new com.lowagie.text.pdf.internal.PdfXConformanceImp();
        pdfXConformanceImp0.setPDFXConformance((int) '翿');
        boolean b3 = pdfXConformanceImp0.isPdfX1A2001();
        boolean b4 = pdfXConformanceImp0.isPdfX1A2001();
        assertEquals(false, b3);
        assertEquals(false, b4);
    }

    @Test
    void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test190");
        int i0 = com.lowagie.text.Element.ALIGN_BASELINE;
        assertEquals(7, i0);
    }

    @Test
    void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test191");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte12 = type3Font5.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte12.resetRGBColorStroke();
        assertNotNull(char_array3);
        assertNotNull(pdfContentByte12);
    }

    @Test
    void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test192");
        com.lowagie.text.pdf.PdfDestination pdfDestination1 = new com.lowagie.text.pdf.PdfDestination("");
    }

    @Test
    void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test193");
        com.lowagie.text.Font font1 = null;
        com.lowagie.text.Footnote footnote2 = new com.lowagie.text.Footnote("", font1);
        com.lowagie.text.HeaderFooter headerFooter4 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote2, true);
        headerFooter4.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle7 = headerFooter4.rotate();
        com.lowagie.text.Rectangle rectangle8 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter4);
        com.lowagie.text.Document document9 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter4);
        boolean b12 = document9.addHeader("xmp:Nickname", "columns");
        float f13 = document9.rightMargin();
        com.lowagie.text.Font font15 = null;
        com.lowagie.text.Footnote footnote16 = new com.lowagie.text.Footnote("", font15);
        com.lowagie.text.HeaderFooter headerFooter18 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote16, true);
        headerFooter18.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle21 = headerFooter18.rotate();
        com.lowagie.text.Rectangle rectangle22 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter18);
        document9.setFooter(headerFooter18);
        assertNotNull(rectangle7);
        assertEquals(false, b12);
        assertEquals(36.0f, f13);
        assertNotNull(rectangle21);
    }

    @Test
    void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test194");
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
        int i82 = pdfAnnotation28.size();
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
        assertEquals(5, i82);
    }

    @Test
    void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test195");
        com.lowagie.text.pdf.CMYKColor cMYKColor4 = new com.lowagie.text.pdf.CMYKColor((float) (short) 100, (float) 1, 100.0f, (float) 0);
        java.awt.Color color5 = cMYKColor4.darker();
        java.awt.image.ColorModel colorModel6 = null;
        com.lowagie.text.Font font8 = null;
        com.lowagie.text.Footnote footnote9 = new com.lowagie.text.Footnote("", font8);
        int[] i_array14 = new int[]{(short) 1, 1785737760, 8, 100};
        com.lowagie.text.pdf.SimpleBookmark.eliminatePages((java.util.List) footnote9, i_array14);
        int[] i_array22 = new int[]{(short) -1, 0, 'a', 10, 3, (byte) 100};
        com.lowagie.text.pdf.internal.PolylineShape polylineShape24 = new com.lowagie.text.pdf.internal.PolylineShape(i_array14, i_array22, 4);
        java.awt.Rectangle rectangle25 = polylineShape24.getBounds();
        com.lowagie.text.Font font27 = null;
        com.lowagie.text.Footnote footnote28 = new com.lowagie.text.Footnote("", font27);
        int[] i_array33 = new int[]{(short) 1, 1785737760, 8, 100};
        com.lowagie.text.pdf.SimpleBookmark.eliminatePages((java.util.List) footnote28, i_array33);
        int[] i_array41 = new int[]{(short) -1, 0, 'a', 10, 3, (byte) 100};
        com.lowagie.text.pdf.internal.PolylineShape polylineShape43 = new com.lowagie.text.pdf.internal.PolylineShape(i_array33, i_array41, 4);
        java.awt.Rectangle rectangle44 = polylineShape43.getBounds();
        java.awt.geom.AffineTransform affineTransform45 = null;
        java.awt.RenderingHints renderingHints46 = null;
        java.awt.PaintContext paintContext47 = color5.createContext(colorModel6, rectangle25, (java.awt.geom.Rectangle2D) rectangle44, affineTransform45, renderingHints46);
        assertNotNull(color5);
        assertNotNull(i_array14);
        assertNotNull(i_array22);
        assertNotNull(rectangle25);
        assertNotNull(i_array33);
        assertNotNull(i_array41);
        assertNotNull(rectangle44);
        assertNotNull(paintContext47);
    }

    @Test
    void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test196");
        com.lowagie.text.Font font1 = null;
        com.lowagie.text.Footnote footnote2 = new com.lowagie.text.Footnote("", font1);
        com.lowagie.text.HeaderFooter headerFooter4 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote2, true);
        headerFooter4.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle7 = headerFooter4.rotate();
        com.lowagie.text.Rectangle rectangle8 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter4);
        com.lowagie.text.Document document9 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter4);
        boolean b12 = document9.addHeader("xmp:Nickname", "columns");
        float f13 = document9.topMargin();
        java.lang.String str14 = document9.getJavaScript_onUnLoad();
        assertNotNull(rectangle7);
        assertEquals(false, b12);
        assertEquals(36.0f, f13);
        assertNull(str14);
    }

    @Test
    void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test197");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfLayerMembership.ANYOFF;
        assertNotNull(pdfName0);
    }

    @Test
    void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test198");
        com.lowagie.text.Anchor anchor1 = new com.lowagie.text.Anchor("alignindent");
    }

    @Test
    void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test199");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.EMBEDDED;
        assertNotNull(pdfName0);
    }

    @Test
    void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test200");
        com.lowagie.text.Chapter chapter1 = new com.lowagie.text.Chapter((int) (short) -1);
        com.lowagie.text.MarkedSection markedSection2 = chapter1.addMarkedSection();
        chapter1.setComplete(false);
        int i5 = chapter1.type();
        boolean b6 = chapter1.isBookmarkOpen();
        assertNotNull(markedSection2);
        assertEquals(16, i5);
        assertEquals(true, b6);
    }

    @Test
    void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test201");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfAcroForm pdfAcroForm1 = new com.lowagie.text.pdf.PdfAcroForm(pdfWriter0);
        java.io.OutputStream outputStream2 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields4 = new com.lowagie.text.pdf.PdfCopyFields(outputStream2, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter5 = pdfCopyFields4.getWriter();
        pdfWriter5.setFullCompression();
        com.lowagie.text.pdf.BaseFont baseFont7 = null;
        com.lowagie.text.Font font10 = new com.lowagie.text.Font(baseFont7, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont12 = font10.getCalculatedBaseFont(false);
        java.lang.String[] str_array13 = baseFont12.getCodePagesSupported();
        com.lowagie.text.pdf.PdfFormField pdfFormField15 = com.lowagie.text.pdf.PdfFormField.createList(pdfWriter5, str_array13, 4096);
        try {
            pdfAcroForm1.setCheckBoxParams(pdfFormField15, "page-break-after", "border-right-width", true, 0.0f, (float) 'h', (float) 30, (float) 16);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        assertNotNull(pdfWriter5);
        assertNotNull(baseFont12);
        assertNotNull(str_array13);
        assertNotNull(pdfFormField15);
    }

    @Test
    void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test202");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.AP;
        assertNotNull(pdfName0);
    }

    @Test
    void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test203");
        int i0 = com.lowagie.text.pdf.PdfFormField.MK_CAPTION_LEFT;
        assertEquals(5, i0);
    }

    @Test
    void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test204");
        int i0 = com.lowagie.text.pdf.BaseFont.STRIKETHROUGH_POSITION;
        assertEquals(15, i0);
    }

    @Test
    void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test205");
        com.lowagie.text.pdf.PdfPageLabels.PdfPageLabelFormat pdfPageLabelFormat4 = new com.lowagie.text.pdf.PdfPageLabels.PdfPageLabelFormat(6, (-3), "margin", 526);
        int i5 = pdfPageLabelFormat4.logicalPage;
        assertEquals(526, i5);
    }

    @Test
    void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test206");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfAnnotation.AA_JS_CHANGE;
        assertNotNull(pdfName0);
    }

    @Test
    void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test207");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Paragraph paragraph5 = com.lowagie.text.factories.ElementFactory.getParagraph(properties1);
        com.lowagie.text.Font font7 = null;
        com.lowagie.text.Footnote footnote8 = new com.lowagie.text.Footnote("", font7);
        com.lowagie.text.pdf.HyphenationEvent hyphenationEvent9 = footnote8.getHyphenation();
        boolean b10 = paragraph5.add((java.lang.Object) footnote8);
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(paragraph5);
        assertNull(hyphenationEvent9);
        assertEquals(true, b10);
    }

    @Test
    void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test208");
        int i0 = com.lowagie.text.pdf.PdfTemplate.TYPE_TEMPLATE;
        assertEquals(1, i0);
    }

    @Test
    void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test209");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ADBE_X509_RSA_SHA1;
        assertNotNull(pdfName0);
    }

    @Test
    void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test210");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.UNDERLINE;
        assertNotNull(pdfName0);
    }

    @Test
    void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test211");
        org.w3c.dom.Node node1 = null;
        byte[] byte_array2 = com.lowagie.text.pdf.XfaForm.serializeDoc(node1);
        try {
            java.lang.String str5 = com.lowagie.text.pdf.PdfEncodings.convertCmap("file", byte_array2, 512, (int) 'È');
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (com.lowagie.text.ExceptionConverter e) {
        }
        assertNotNull(byte_array2);
    }

    @Test
    void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test212");
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
        chapter9.setTriggerNewPage(true);
        assertNotNull(pdfWriter3);
        assertEquals(1, i4);
        assertNotNull(markedSection10);
        assertEquals(0, i13);
    }

    @Test
    void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test213");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.M;
        assertNotNull(pdfName0);
    }

    @Test
    void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test214");
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
        int i43 = randomAccessFileOrArray41.readUnsignedShort();
        try {
            float f44 = randomAccessFileOrArray41.readFloatLE();
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
        assertEquals(25610, i43);
    }

    @Test
    void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test215");
        com.lowagie.text.Paragraph paragraph0 = null;
        com.lowagie.text.Chapter chapter2 = new com.lowagie.text.Chapter(paragraph0, 1785737760);
        float f3 = chapter2.getIndentationLeft();
        boolean b4 = chapter2.isNestable();
        com.lowagie.text.MarkedSection markedSection5 = chapter2.addMarkedSection();
        markedSection5.setIndentationRight((float) 'Ã');
        assertEquals(0.0f, f3);
        assertEquals(false, b4);
        assertNotNull(markedSection5);
    }

    @Test
    void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test216");
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
        com.lowagie.text.pdf.PdfContentByte pdfContentByte29 = null;
        com.lowagie.text.pdf.ColumnText columnText30 = new com.lowagie.text.pdf.ColumnText(pdfContentByte29);
        com.lowagie.text.pdf.ColumnText columnText31 = columnText22.setACopy(columnText30);
        assertEquals(0.0f, f3);
        assertEquals(false, b5);
        assertNotNull(pdfPCell11);
        assertEquals(0.0f, f12);
        assertEquals(0.0f, f13);
        assertNotNull(pdfPCell16);
        assertEquals(0.0f, f17);
        assertNull(pdfPTable18);
        assertNull(pdfContentByte_array25);
        assertNotNull(columnText31);
    }

    @Test
    void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test217");
        com.lowagie.text.pdf.codec.wmf.MetaState metaState0 = new com.lowagie.text.pdf.codec.wmf.MetaState();
        float f1 = metaState0.scalingY;
        com.lowagie.text.pdf.parser.TextAssembler textAssembler2 = null;
        com.lowagie.text.pdf.parser.PdfContentStreamHandler pdfContentStreamHandler3 = new com.lowagie.text.pdf.parser.PdfContentStreamHandler(textAssembler2);
        java.util.Map<java.lang.String, com.lowagie.text.pdf.parser.ContentOperator> map_str_contentOperator4 = null;
        pdfContentStreamHandler3.operators = map_str_contentOperator4;
        com.lowagie.text.pdf.parser.Matrix matrix6 = pdfContentStreamHandler3.textMatrix;
        com.lowagie.text.pdf.parser.GraphicsState[] graphicsState_array7 = new com.lowagie.text.pdf.parser.GraphicsState[]{};
        java.util.Stack<com.lowagie.text.pdf.parser.GraphicsState> stack_graphicsState8 = new java.util.Stack<com.lowagie.text.pdf.parser.GraphicsState>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<com.lowagie.text.pdf.parser.GraphicsState>) stack_graphicsState8, graphicsState_array7);
        pdfContentStreamHandler3.gsStack = stack_graphicsState8;
        metaState0.savedStates = stack_graphicsState8;
        float f12 = metaState0.scalingY;
        assertEquals(0.0f, f1);
        assertNull(matrix6);
        assertNotNull(graphicsState_array7);
        assertEquals(false, b9);
        assertEquals(0.0f, f12);
    }

    @Test
    void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test218");
        com.lowagie.text.Font font1 = null;
        com.lowagie.text.Footnote footnote2 = new com.lowagie.text.Footnote("", font1);
        com.lowagie.text.HeaderFooter headerFooter4 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote2, true);
        headerFooter4.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle7 = headerFooter4.rotate();
        com.lowagie.text.Rectangle rectangle8 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter4);
        java.awt.Color color9 = java.awt.Color.GREEN;
        float[] f_array10 = com.lowagie.text.pdf.PdfShading.getColorArray(color9);
        java.awt.Color color11 = color9.darker();
        headerFooter4.setBorderColor(color9);
        com.lowagie.text.pdf.PdfWriter pdfWriter13 = null;
        float[] f_array20 = new float[]{100.0f, 8, 3, 7, 100.0f, 'a'};
        float[] f_array22 = new float[]{(byte) 10};
        float[] f_array28 = new float[]{64, 64, 100.0f, 4, 29};
        com.lowagie.text.pdf.PdfWriter pdfWriter29 = null;
        com.lowagie.text.Font font31 = null;
        com.lowagie.text.Footnote footnote32 = new com.lowagie.text.Footnote("", font31);
        com.lowagie.text.HeaderFooter headerFooter34 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote32, true);
        headerFooter34.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle37 = headerFooter34.rotate();
        float[] f_array42 = new float[]{6, 9};
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation43 = com.lowagie.text.pdf.PdfAnnotation.createMarkup(pdfWriter29, rectangle37, "Stream", 3, f_array42);
        com.lowagie.text.pdf.PdfFunction pdfFunction45 = com.lowagie.text.pdf.PdfFunction.type2(pdfWriter13, f_array20, f_array22, f_array28, f_array42, 561.0f);
        float[] f_array46 = color9.getColorComponents(f_array20);
        assertNotNull(rectangle7);
        assertNotNull(color9);
        assertNotNull(f_array10);
        assertNotNull(color11);
        assertNotNull(f_array20);
        assertNotNull(f_array22);
        assertNotNull(f_array28);
        assertNotNull(rectangle37);
        assertNotNull(f_array42);
        assertNotNull(pdfAnnotation43);
        assertNotNull(pdfFunction45);
        assertNotNull(f_array46);
    }

    @Test
    void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test219");
        com.lowagie.text.FontFactory.register("cell", "listsymbol");
    }

    @Test
    void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test220");
        java.lang.String str0 = com.lowagie.text.ElementTags.LASTHEADERROW;
        assertEquals("lastHeaderRow", str0, "'" + str0 + "' != '" + "lastHeaderRow" + "'");
    }

    @Test
    void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test221");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        float f3 = pdfPCell2.getIndent();
        com.lowagie.text.pdf.PdfPTable pdfPTable4 = pdfPCell2.getTable();
        com.lowagie.text.pdf.PdfPCellEvent pdfPCellEvent5 = pdfPCell2.getCellEvent();
        int i6 = pdfPCell2.getRowspan();
        float f7 = pdfPCell2.getPaddingRight();
        assertNotNull(pdfPCell2);
        assertEquals(0.0f, f3);
        assertNull(pdfPTable4);
        assertNull(pdfPCellEvent5);
        assertEquals(1, i6);
        assertEquals(2.0f, f7);
    }

    @Test
    void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test222");
        com.lowagie.text.pdf.PdfTextArray pdfTextArray0 = new com.lowagie.text.pdf.PdfTextArray();
        pdfTextArray0.add(4.0f);
    }

    @Test
    void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test223");
        try {
            java.awt.Color color1 = java.awt.Color.decode("padding-left");
            fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test224");
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
        com.lowagie.text.pdf.PdfName pdfName37 = com.lowagie.text.pdf.PdfName.COUNT;
        com.lowagie.text.pdf.PdfName pdfName38 = com.lowagie.text.pdf.PdfName.GAMMA;
        item0.writeToAll(pdfName37, (com.lowagie.text.pdf.PdfObject) pdfName38, 1564);
        java.util.ArrayList arrayList41 = item0.widgets;
        assertNotNull(paragraph20);
        assertNotNull(paragraph35);
        assertNotNull(pdfName37);
        assertNotNull(pdfName38);
        assertNotNull(arrayList41);
    }

    @Test
    void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test225");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ANTIALIAS;
        assertNotNull(pdfName0);
    }

    @Test
    void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test226");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.FLASHVARS;
        boolean b1 = pdfName0.isName();
        assertNotNull(pdfName0);
        assertEquals(true, b1);
    }

    @Test
    void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test227");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.VOFFSET;
        assertNotNull(pdfName0);
    }

    @Test
    void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test228");
        com.lowagie.text.SimpleCell simpleCell1 = new com.lowagie.text.SimpleCell(true);
        simpleCell1.setSpacing_top((float) 226);
        simpleCell1.setVerticalAlignment((int) (short) 0);
        com.lowagie.text.pdf.PdfPTable pdfPTable7 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell8 = pdfPTable7.getDefaultCell();
        pdfPTable7.setSpacingBefore((float) 15);
        com.lowagie.text.pdf.PdfPCell pdfPCell11 = pdfPTable7.getDefaultCell();
        pdfPCell11.setPaddingTop((float) 6);
        try {
            simpleCell1.addElement((com.lowagie.text.Element) pdfPCell11);
            fail("Expected exception of type com.lowagie.text.BadElementException");
        } catch (com.lowagie.text.BadElementException e) {
        }
        assertNotNull(pdfPCell8);
        assertNotNull(pdfPCell11);
    }

    @Test
    void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test229");
        com.lowagie.text.pdf.parser.TextAssembler textAssembler0 = null;
        com.lowagie.text.pdf.parser.PdfContentStreamHandler pdfContentStreamHandler1 = new com.lowagie.text.pdf.parser.PdfContentStreamHandler(textAssembler0);
        java.util.Map<java.lang.String, com.lowagie.text.pdf.parser.ContentOperator> map_str_contentOperator2 = null;
        pdfContentStreamHandler1.operators = map_str_contentOperator2;
        com.lowagie.text.pdf.parser.Matrix matrix4 = pdfContentStreamHandler1.textMatrix;
        com.lowagie.text.pdf.parser.GraphicsState[] graphicsState_array5 = new com.lowagie.text.pdf.parser.GraphicsState[]{};
        java.util.Stack<com.lowagie.text.pdf.parser.GraphicsState> stack_graphicsState6 = new java.util.Stack<com.lowagie.text.pdf.parser.GraphicsState>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<com.lowagie.text.pdf.parser.GraphicsState>) stack_graphicsState6, graphicsState_array5);
        pdfContentStreamHandler1.gsStack = stack_graphicsState6;
        com.lowagie.text.pdf.PdfLiteral pdfLiteral9 = null;
        com.lowagie.text.pdf.AcroFields.Item item10 = new com.lowagie.text.pdf.AcroFields.Item();
        com.lowagie.text.Font font12 = null;
        com.lowagie.text.Footnote footnote13 = new com.lowagie.text.Footnote("", font12);
        com.lowagie.text.HeaderFooter headerFooter15 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote13, true);
        com.lowagie.text.pdf.HyphenationAuto hyphenationAuto20 = new com.lowagie.text.pdf.HyphenationAuto("Default", "creationdate", (-1), 1785737760);
        footnote13.setHyphenation((com.lowagie.text.pdf.HyphenationEvent) hyphenationAuto20);
        item10.widgets = footnote13;
        com.lowagie.text.Font font24 = null;
        com.lowagie.text.Footnote footnote25 = new com.lowagie.text.Footnote("", font24);
        com.lowagie.text.HeaderFooter headerFooter27 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote25, true);
        headerFooter27.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph30 = headerFooter27.paragraph();
        com.lowagie.text.ChapterAutoNumber chapterAutoNumber31 = new com.lowagie.text.ChapterAutoNumber(paragraph30);
        com.lowagie.text.Font font33 = null;
        com.lowagie.text.Footnote footnote34 = new com.lowagie.text.Footnote("", font33);
        com.lowagie.text.HeaderFooter headerFooter36 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote34, true);
        com.lowagie.text.pdf.HyphenationAuto hyphenationAuto41 = new com.lowagie.text.pdf.HyphenationAuto("Default", "creationdate", (-1), 1785737760);
        footnote34.setHyphenation((com.lowagie.text.pdf.HyphenationEvent) hyphenationAuto41);
        com.lowagie.text.Paragraph paragraph45 = com.lowagie.text.Section.constructTitle(paragraph30, (java.util.ArrayList) footnote34, (int) (byte) 100, 15);
        item10.page = paragraph45;
        com.lowagie.text.pdf.PdfPTable pdfPTable48 = new com.lowagie.text.pdf.PdfPTable(1);
        float f50 = pdfPTable48.getRowHeight(1785737760);
        boolean b52 = pdfPTable48.isExtendLastRow(true);
        com.lowagie.text.pdf.PdfPTable pdfPTable54 = new com.lowagie.text.pdf.PdfPTable(1);
        pdfPTable48.addCell(pdfPTable54);
        java.util.ArrayList arrayList58 = pdfPTable54.getRows(23, 50);
        item10.page = arrayList58;
        com.lowagie.text.pdf.PdfWriter pdfWriter60 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField61 = com.lowagie.text.pdf.PdfFormField.createEmpty(pdfWriter60);
        pdfFormField61.setAppearanceState("[/FlashVars]");
        com.lowagie.text.pdf.PdfName pdfName64 = com.lowagie.text.pdf.PdfName.TI;
        boolean b65 = pdfFormField61.contains(pdfName64);
        try {
            pdfContentStreamHandler1.invokeOperator(pdfLiteral9, (java.util.ArrayList<com.lowagie.text.pdf.PdfObject>) arrayList58, (com.lowagie.text.pdf.PdfDictionary) pdfFormField61);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNull(matrix4);
        assertNotNull(graphicsState_array5);
        assertEquals(false, b7);
        assertNotNull(paragraph30);
        assertNotNull(paragraph45);
        assertEquals(0.0f, f50);
        assertEquals(false, b52);
        assertNotNull(arrayList58);
        assertNotNull(pdfFormField61);
        assertNotNull(pdfName64);
        assertEquals(false, b65);
    }

    @Test
    void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test230");
        java.lang.String str0 = com.lowagie.text.xml.xmp.DublinCoreSchema.RIGHTS;
        assertEquals("dc:rights", str0, "'" + str0 + "' != '" + "dc:rights" + "'");
    }

    @Test
    void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test231");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_CREATEFONTINDIRECT;
        assertEquals(763, i0);
    }

    @Test
    void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test232");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte12 = type3Font5.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        try {
            pdfContentByte12.restoreState();
            fail("Expected exception of type com.lowagie.text.exceptions.IllegalPdfSyntaxException");
        } catch (com.lowagie.text.exceptions.IllegalPdfSyntaxException e) {
        }
        assertNotNull(char_array3);
        assertNotNull(pdfContentByte12);
    }

    @Test
    void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test233");
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
        com.lowagie.text.pdf.internal.PdfAnnotationsImp pdfAnnotationsImp47 = new com.lowagie.text.pdf.internal.PdfAnnotationsImp(pdfWriter4);
        try {
            com.lowagie.text.pdf.events.FieldPositioningEvents fieldPositioningEvents49 = new com.lowagie.text.pdf.events.FieldPositioningEvents(pdfWriter4, "tag");
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
    void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test234");
        com.lowagie.text.xml.xmp.XmpArray xmpArray1 = new com.lowagie.text.xml.xmp.XmpArray("false");
        java.util.Spliterator<java.lang.String> spliterator_str2 = xmpArray1.spliterator();
        java.util.stream.Stream<java.lang.String> stream_str3 = xmpArray1.stream();
        assertNotNull(spliterator_str2);
        assertNotNull(stream_str3);
    }

    @Test
    void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test235");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        java.lang.String[][] str_array_array6 = type3Font5.getAllNameEntries();
        boolean b7 = type3Font5.hasKernPairs();
        int i10 = type3Font5.getKerning(1042, 53);
        boolean b11 = type3Font5.isFontSpecific();
        java.lang.String[][] str_array_array12 = type3Font5.getFullFontName();
        assertNotNull(char_array3);
        assertNotNull(str_array_array6);
        assertEquals(false, b7);
        assertEquals(0, i10);
        assertEquals(true, b11);
        assertNotNull(str_array_array12);
    }

    @Test
    void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test236");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte12 = type3Font5.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte12.rectangle((float) (-3), (float) 'a', (float) (-1), (float) (byte) 0);
        com.lowagie.text.pdf.PdfWriter pdfWriter18 = pdfContentByte12.getPdfWriter();
        pdfContentByte12.fill();
        java.awt.Color color21 = java.awt.Color.lightGray;
        com.lowagie.text.pdf.PdfSpotColor pdfSpotColor22 = new com.lowagie.text.pdf.PdfSpotColor("url", color21);
        try {
            pdfContentByte12.setColorStroke(pdfSpotColor22, (float) 32768);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(char_array3);
        assertNotNull(pdfContentByte12);
        assertNull(pdfWriter18);
        assertNotNull(color21);
    }

    @Test
    void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test237");
        com.lowagie.text.pdf.PdfXConformanceException pdfXConformanceException1 = new com.lowagie.text.pdf.PdfXConformanceException("");
    }

    @Test
    void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test238");
        com.lowagie.text.pdf.PdfSigGenericPKCS.PPKLite pPKLite0 = new com.lowagie.text.pdf.PdfSigGenericPKCS.PPKLite();
        com.lowagie.text.pdf.PdfDate pdfDate1 = null;
        pPKLite0.setDate(pdfDate1);
    }

    @Test
    void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test239");
        com.lowagie.text.pdf.IntHashtable intHashtable0 = new com.lowagie.text.pdf.IntHashtable();
        boolean b2 = intHashtable0.containsValue(1785737760);
        int[] i_array3 = intHashtable0.getKeys();
        int[] i_array4 = intHashtable0.getKeys();
        int i6 = intHashtable0.get(9);
        boolean b8 = intHashtable0.contains((int) (byte) 32);
        assertEquals(false, b2);
        assertNotNull(i_array3);
        assertNotNull(i_array4);
        assertEquals(0, i6);
        assertEquals(false, b8);
    }

    @Test
    void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test240");
        com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS pPKMS0 = new com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS();
        com.lowagie.text.Font font2 = null;
        com.lowagie.text.Footnote footnote3 = new com.lowagie.text.Footnote("", font2);
        int[] i_array8 = new int[]{(short) 1, 1785737760, 8, 100};
        com.lowagie.text.pdf.SimpleBookmark.eliminatePages((java.util.List) footnote3, i_array8);
        pPKMS0.setByteRange(i_array8);
        com.lowagie.text.pdf.PdfName pdfName11 = com.lowagie.text.pdf.PdfName.DC;
        com.lowagie.text.pdf.PdfWriter pdfWriter12 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField16 = com.lowagie.text.pdf.PdfFormField.createTextField(pdfWriter12, true, false, (int) (short) 10);
        pPKMS0.putEx(pdfName11, (com.lowagie.text.pdf.PdfObject) pdfFormField16);
        pdfFormField16.setAppearanceState("xmp:ModifyDate");
        assertNotNull(i_array8);
        assertNotNull(pdfName11);
        assertNotNull(pdfFormField16);
    }

    @Test
    void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test241");
        int i0 = com.lowagie.text.Jpeg2000.JP2_FTYP;
        assertEquals(1718909296, i0);
    }

    @Test
    void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test242");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ASCII85DECODE;
        assertNotNull(pdfName0);
    }

    @Test
    void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test243");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField1 = com.lowagie.text.pdf.PdfFormField.createCheckBox(pdfWriter0);
        pdfFormField1.setQuadding((int) (byte) 100);
        pdfFormField1.setMKTextPosition(30);
        try {
            com.lowagie.text.pdf.PdfAction pdfAction7 = com.lowagie.text.pdf.PdfAction.createHide((com.lowagie.text.pdf.PdfAnnotation) pdfFormField1, true);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfFormField1);
    }

    @Test
    void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test244");
        java.lang.String str0 = com.lowagie.text.xml.xmp.XmpBasicSchema.CREATORTOOL;
        assertEquals("xmp:CreatorTool", str0, "'" + str0 + "' != '" + "xmp:CreatorTool" + "'");
    }

    @Test
    void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test245");
        float[] f_array0 = null;
        try {
            com.lowagie.text.pdf.PdfArray pdfArray1 = new com.lowagie.text.pdf.PdfArray(f_array0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test246");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_OFFSETVIEWPORTORG;
        assertEquals(529, i0);
    }

    @Test
    void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test247");
        try {
            com.lowagie.text.pdf.PdfAction pdfAction1 = new com.lowagie.text.pdf.PdfAction((int) (byte) 32);
            fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test248");
        com.lowagie.text.pdf.hyphenation.HyphenationException hyphenationException1 = new com.lowagie.text.pdf.hyphenation.HyphenationException("rdf:Seq");
    }

    @Test
    void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test249");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        float f3 = pdfPCell2.getPaddingRight();
        com.lowagie.text.Phrase phrase4 = pdfPCell2.getPhrase();
        pdfPCell2.setLeft((float) (short) 0);
        pdfPCell2.setPaddingBottom((float) 100);
        assertNotNull(pdfPCell2);
        assertEquals(2.0f, f3);
        assertNull(phrase4);
    }

    @Test
    void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test250");
        com.lowagie.text.pdf.MultiColumnText multiColumnText2 = new com.lowagie.text.pdf.MultiColumnText((float) 14, 0.0f);
        com.lowagie.text.pdf.draw.DrawInterface drawInterface3 = null;
        com.lowagie.text.Chunk chunk5 = new com.lowagie.text.Chunk(drawInterface3, (float) 2368);
        multiColumnText2.addText(chunk5);
    }

    @Test
    void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test251");
        int i0 = com.lowagie.text.Element.ALIGN_JUSTIFIED_ALL;
        assertEquals(8, i0);
    }

    @Test
    void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test252");
        com.lowagie.text.pdf.PdfString pdfString0 = new com.lowagie.text.pdf.PdfString();
        java.lang.String str1 = pdfString0.toUnicodeString();
        com.lowagie.text.pdf.PdfString pdfString3 = pdfString0.setHexWriting(false);
        java.lang.String str4 = pdfString3.toString();
        assertEquals("", str1, "'" + str1 + "' != '" + "" + "'");
        assertNotNull(pdfString3);
        assertEquals("", str4, "'" + str4 + "' != '" + "" + "'");
    }

    @Test
    void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test253");
        com.lowagie.text.pdf.hyphenation.Hyphenation hyphenation5 = com.lowagie.text.pdf.hyphenation.Hyphenator.hyphenate("text-align", "xmpMM:ManagerVariant", "table-cell", (int) '4', (int) '6');
        assertNull(hyphenation5);
    }

    @Test
    void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test254");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ENCRYPT;
        assertNotNull(pdfName0);
    }

    @Test
    void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test255");
        com.lowagie.text.xml.xmp.DublinCoreSchema dublinCoreSchema0 = new com.lowagie.text.xml.xmp.DublinCoreSchema();
        int i1 = dublinCoreSchema0.size();
        com.lowagie.text.pdf.ByteBuffer byteBuffer3 = new com.lowagie.text.pdf.ByteBuffer(1564);
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields5 = new com.lowagie.text.pdf.PdfCopyFields((java.io.OutputStream) byteBuffer3, 'Ã');
        com.lowagie.text.pdf.ByteBuffer byteBuffer7 = byteBuffer3.append(24);
        com.lowagie.text.pdf.ByteBuffer byteBuffer9 = byteBuffer3.append((byte) 100);
        com.lowagie.text.pdf.codec.wmf.MetaDo.writeDWord((java.io.OutputStream) byteBuffer9, 4096);
        com.lowagie.text.pdf.ByteBuffer byteBuffer13 = byteBuffer9.append_i(1785737760);
        dublinCoreSchema0.save((java.io.OutputStream) byteBuffer9, "TAB");
        assertEquals(1, i1);
        assertNotNull(byteBuffer7);
        assertNotNull(byteBuffer9);
        assertNotNull(byteBuffer13);
    }

    @Test
    void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test256");
        com.lowagie.text.pdf.parser.TextAssembler textAssembler0 = null;
        com.lowagie.text.pdf.parser.PdfContentStreamHandler pdfContentStreamHandler1 = new com.lowagie.text.pdf.parser.PdfContentStreamHandler(textAssembler0);
        java.util.Map<java.lang.String, com.lowagie.text.pdf.parser.ContentOperator> map_str_contentOperator2 = null;
        pdfContentStreamHandler1.operators = map_str_contentOperator2;
        com.lowagie.text.pdf.parser.Matrix matrix4 = pdfContentStreamHandler1.textMatrix;
        com.lowagie.text.pdf.parser.GraphicsState[] graphicsState_array5 = new com.lowagie.text.pdf.parser.GraphicsState[]{};
        java.util.Stack<com.lowagie.text.pdf.parser.GraphicsState> stack_graphicsState6 = new java.util.Stack<com.lowagie.text.pdf.parser.GraphicsState>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<com.lowagie.text.pdf.parser.GraphicsState>) stack_graphicsState6, graphicsState_array5);
        pdfContentStreamHandler1.gsStack = stack_graphicsState6;
        java.util.Stack<com.lowagie.text.pdf.parser.GraphicsState> stack_graphicsState9 = pdfContentStreamHandler1.gsStack;
        com.lowagie.text.pdf.parser.Matrix matrix16 = new com.lowagie.text.pdf.parser.Matrix((-1.0f), 22.677166f, (float) (short) 100, (float) 1L, (float) 1L, (float) 526);
        pdfContentStreamHandler1.textMatrix = matrix16;
        assertNull(matrix4);
        assertNotNull(graphicsState_array5);
        assertEquals(false, b7);
        assertNotNull(stack_graphicsState9);
    }

    @Test
    void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test257");
        com.lowagie.text.Font font6 = com.lowagie.text.FontFactory.getFont("page-break-after", "face", (float) 30);
        com.lowagie.text.ListItem listItem7 = new com.lowagie.text.ListItem("border-bottom-width", font6);
        com.lowagie.text.Anchor anchor8 = new com.lowagie.text.Anchor("plainwidth", font6);
        com.lowagie.text.Anchor anchor9 = new com.lowagie.text.Anchor("file", font6);
        assertNotNull(font6);
    }

    @Test
    void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test258");
        float f1 = com.lowagie.text.Utilities.inchesToMillimeters((float) 24);
        assertEquals(609.6f, f1);
    }

    @Test
    void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test259");
        com.lowagie.text.pdf.events.PdfPCellEventForwarder pdfPCellEventForwarder0 = new com.lowagie.text.pdf.events.PdfPCellEventForwarder();
        com.lowagie.text.pdf.events.FieldPositioningEvents fieldPositioningEvents1 = new com.lowagie.text.pdf.events.FieldPositioningEvents();
        fieldPositioningEvents1.padding = ' ';
        pdfPCellEventForwarder0.addCellEvent((com.lowagie.text.pdf.PdfPCellEvent) fieldPositioningEvents1);
        fieldPositioningEvents1.padding = (-196.0f);
    }

    @Test
    void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test260");
        com.lowagie.text.Font font1 = null;
        com.lowagie.text.Footnote footnote2 = new com.lowagie.text.Footnote("", font1);
        com.lowagie.text.HeaderFooter headerFooter4 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote2, true);
        headerFooter4.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle7 = headerFooter4.rotate();
        com.lowagie.text.Rectangle rectangle8 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter4);
        com.lowagie.text.Document document9 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter4);
        document9.resetHeader();
        assertNotNull(rectangle7);
    }

    @Test
    void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test261");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.SIZE;
        com.lowagie.text.pdf.PdfObject pdfObject1 = com.lowagie.text.pdf.PdfReader.getPdfObjectRelease((com.lowagie.text.pdf.PdfObject) pdfName0);
        assertNotNull(pdfName0);
        assertNotNull(pdfObject1);
    }

    @Test
    void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test262");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.USEATTACHMENTS;
        assertNotNull(pdfName0);
    }

    @Test
    void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test263");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.SUBMITFORM;
        assertNotNull(pdfName0);
    }

    @Test
    void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test264");
        com.lowagie.text.pdf.PdfRectangle pdfRectangle3 = new com.lowagie.text.pdf.PdfRectangle((float) 2147483647, (float) 'Ë', 264);
    }

    @Test
    void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test265");
        java.io.InputStream inputStream0 = null;
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
        try {
            com.lowagie.text.pdf.PdfEFStream pdfEFStream43 = new com.lowagie.text.pdf.PdfEFStream(inputStream0, pdfWriter5);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfWriter5);
        assertNotNull(rectangle13);
        assertEquals(true, b17);
        assertNotNull(paragraph27);
        assertNotNull(pdfName36);
        assertNotNull(pdfName37);
        assertNotNull(pdfName41);
    }

    @Test
    void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test266");
        com.lowagie.text.RectangleReadOnly rectangleReadOnly4 = new com.lowagie.text.RectangleReadOnly((float) (byte) 100, (float) 1336, (float) 'Ë', (float) 9);
        try {
            rectangleReadOnly4.setBorderWidthLeft((float) '6');
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
    }

    @Test
    void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test267");
        java.lang.String str0 = com.lowagie.text.ElementTags.LOCALDESTINATION;
        assertEquals("localdestination", str0, "'" + str0 + "' != '" + "localdestination" + "'");
    }

    @Test
    void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test268");
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
        com.lowagie.text.Chunk chunk82 = new com.lowagie.text.Chunk();
        com.lowagie.text.Image image83 = chunk82.getImage();
        float f84 = chunk82.getCharacterSpacing();
        com.lowagie.text.pdf.PdfAction pdfAction86 = new com.lowagie.text.pdf.PdfAction("Cp1250");
        com.lowagie.text.Chunk chunk87 = chunk82.setAction(pdfAction86);
        pdfFormField80.setAction(pdfAction86);
        pdfFormField80.setMKRotation((int) (byte) 61);
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
        assertNull(image83);
        assertEquals(0.0f, f84);
        assertNotNull(chunk87);
    }

    @Test
    void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test269");
        java.lang.String str0 = com.lowagie.text.ElementTags.PARAMETERS;
        assertEquals("parameters", str0, "'" + str0 + "' != '" + "parameters" + "'");
    }

    @Test
    void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test270");
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
        int i52 = radioCheckField51.getAlignment();
        int i53 = radioCheckField51.getMaxCharacterLength();
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
        assertEquals(0, i52);
        assertEquals(0, i53);
    }

    @Test
    void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test271");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.RICHMEDIAEXECUTE;
        assertNotNull(pdfName0);
    }

    @Test
    void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test272");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.YSTEP;
        assertNotNull(pdfName0);
    }

    @Test
    void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test273");
        com.lowagie.text.pdf.BaseFont baseFont0 = null;
        com.lowagie.text.Font font3 = new com.lowagie.text.Font(baseFont0, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont5 = font3.getCalculatedBaseFont(false);
        int i7 = baseFont5.getCidCode(256);
        float f10 = baseFont5.getWidthPointKerned("defaultdir", (float) 17);
        assertNotNull(baseFont5);
        assertEquals(256, i7);
        assertEquals(69.411f, f10);
    }

    @Test
    void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test274");
        java.lang.String str0 = com.lowagie.text.Chunk.SEPARATOR;
        assertEquals("SEPARATOR", str0, "'" + str0 + "' != '" + "SEPARATOR" + "'");
    }

    @Test
    void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test275");
        com.lowagie.text.Chunk chunk0 = com.lowagie.text.Chunk.NEWLINE;
        assertNotNull(chunk0);
    }

    @Test
    void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test276");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Cell cell5 = com.lowagie.text.factories.ElementFactory.getCell(properties1);
        boolean b6 = cell5.isUseBorderPadding();
        cell5.setHorizontalAlignment("Times-Bold");
        int i9 = cell5.getColspan();
        cell5.setUseDescender(false);
        try {
            float f12 = cell5.getRight();
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(cell5);
        assertEquals(false, b6);
        assertEquals(1, i9);
    }

    @Test
    void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test277");
        com.lowagie.text.Chunk chunk0 = new com.lowagie.text.Chunk();
        com.lowagie.text.Image image1 = chunk0.getImage();
        com.lowagie.text.Chunk chunk3 = chunk0.setAnchor("");
        int i4 = chunk0.type();
        assertNull(image1);
        assertNotNull(chunk3);
        assertEquals(10, i4);
    }

    @Test
    void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test278");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.FULLSCREEN;
        boolean b1 = pdfName0.isName();
        assertNotNull(pdfName0);
        assertEquals(true, b1);
    }

    @Test
    void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test279");
        com.lowagie.text.pdf.parser.Matrix matrix6 = new com.lowagie.text.pdf.parser.Matrix(0.0f, (float) 100L, (float) '#', (-1.0f), 100.0f, (-1.0f));
        java.lang.String str7 = matrix6.toString();
        assertEquals("0.0\t100.0\t0.0\n35.0\t-1.0\t0.0\n100.0\t-1.0\t1.0", str7, "'" + str7 + "' != '" + "0.0\t100.0\t0.0\n35.0\t-1.0\t0.0\n100.0\t-1.0\t1.0" + "'");
    }

    @Test
    void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test280");
        com.lowagie.text.SimpleCell simpleCell1 = new com.lowagie.text.SimpleCell(true);
        simpleCell1.setSpacing_top((float) 226);
        simpleCell1.setVerticalAlignment((int) (short) 0);
        simpleCell1.setWidthpercentage((float) 1718909296);
    }

    @Test
    void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test281");
        com.lowagie.text.Font font1 = null;
        com.lowagie.text.Footnote footnote2 = new com.lowagie.text.Footnote("", font1);
        com.lowagie.text.HeaderFooter headerFooter4 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote2, true);
        headerFooter4.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph7 = headerFooter4.paragraph();
        com.lowagie.text.ChapterAutoNumber chapterAutoNumber8 = new com.lowagie.text.ChapterAutoNumber(paragraph7);
        com.lowagie.text.Font font10 = null;
        com.lowagie.text.Footnote footnote11 = new com.lowagie.text.Footnote("", font10);
        com.lowagie.text.HeaderFooter headerFooter13 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote11, true);
        headerFooter13.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph16 = headerFooter13.paragraph();
        com.lowagie.text.Section section17 = chapterAutoNumber8.addSection(paragraph16);
        chapterAutoNumber8.setNotAddedYet(true);
        assertNotNull(paragraph7);
        assertNotNull(paragraph16);
        assertNotNull(section17);
    }

    @Test
    void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test282");
        int i0 = com.lowagie.text.Image.ORIGINAL_NONE;
        assertEquals(0, i0);
    }

    @Test
    void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test283");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.Font font2 = null;
        com.lowagie.text.Footnote footnote3 = new com.lowagie.text.Footnote("", font2);
        com.lowagie.text.HeaderFooter headerFooter5 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote3, true);
        headerFooter5.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle8 = headerFooter5.rotate();
        float[][] f_array_array10 = new float[][]{};
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation11 = com.lowagie.text.pdf.PdfAnnotation.createInk(pdfWriter0, (com.lowagie.text.Rectangle) headerFooter5, "widths", f_array_array10);
        boolean b12 = pdfAnnotation11.isOutlineTree();
        com.lowagie.text.pdf.PdfName pdfName13 = com.lowagie.text.pdf.PdfName.BITSPERSAMPLE;
        com.lowagie.text.pdf.PdfAction pdfAction16 = com.lowagie.text.pdf.PdfAction.gotoLocalPage("operation", true);
        pdfAnnotation11.setAdditionalActions(pdfName13, pdfAction16);
        assertNotNull(rectangle8);
        assertNotNull(f_array_array10);
        assertNotNull(pdfAnnotation11);
        assertEquals(false, b12);
        assertNotNull(pdfName13);
        assertNotNull(pdfAction16);
    }

    @Test
    void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test284");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TABS;
        assertNotNull(pdfName0);
    }

    @Test
    void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test285");
        int i0 = com.lowagie.text.Jpeg.NOT_A_MARKER;
        assertEquals(i0, (-1));
    }

    @Test
    void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test286");
        int i0 = com.lowagie.text.pdf.PdfWriter.NonFullScreenPageModeUseNone;
        assertEquals(262144, i0);
    }

    @Test
    void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test288");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.H2;
        assertNotNull(pdfName0);
    }

    @Test
    void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test289");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Phrase phrase5 = com.lowagie.text.factories.ElementFactory.getPhrase(properties1);
        java.util.Set set6 = com.lowagie.text.Utilities.getKeySet((java.util.Hashtable) properties1);
        java.lang.String str9 = properties1.getProperty("face", "cell");
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(phrase5);
        assertNotNull(set6);
        assertEquals("cell", str9, "'" + str9 + "' != '" + "cell" + "'");
    }

    @Test
    void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test290");
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
        int i14 = table12.endHeaders();
        assertNotNull(pdfWriter3);
        assertEquals(1, i4);
        assertEquals(0, i6);
        assertEquals(true, b13);
        assertEquals(i14, (-1));
    }

    @Test
    void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test291");
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
        float f12 = pdfPCell8.getRightIndent();
        assertNotNull(pdfWriter3);
        assertEquals(1, i4);
        assertNotNull(pdfPCell8);
        assertEquals(0.0f, f9);
        assertEquals(0.0f, f10);
        assertEquals(0.0f, f12);
    }

    @Test
    void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test292");
        java.io.OutputStream outputStream0 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields2 = new com.lowagie.text.pdf.PdfCopyFields(outputStream0, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = pdfCopyFields2.getWriter();
        pdfWriter3.setFullCompression();
        com.lowagie.text.pdf.BaseFont baseFont5 = null;
        com.lowagie.text.Font font8 = new com.lowagie.text.Font(baseFont5, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont10 = font8.getCalculatedBaseFont(false);
        java.lang.String[] str_array11 = baseFont10.getCodePagesSupported();
        com.lowagie.text.pdf.PdfFormField pdfFormField13 = com.lowagie.text.pdf.PdfFormField.createList(pdfWriter3, str_array11, 4096);
        int i14 = pdfWriter3.getRunDirection();
        com.lowagie.text.pdf.PdfReader pdfReader15 = null;
        try {
            com.lowagie.text.pdf.PdfImportedPage pdfImportedPage17 = pdfWriter3.getImportedPage(pdfReader15, (int) (short) 1);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfWriter3);
        assertNotNull(baseFont10);
        assertNotNull(str_array11);
        assertNotNull(pdfFormField13);
        assertEquals(1, i14);
    }

    @Test
    void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test293");
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
        imgJBIG2_20.setDeflated(true);
        assertNotNull(byte_array8);
        assertNotNull(byte_array15);
        assertEquals(i21, (-1));
        assertNull(str22);
    }

    @Test
    void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test294");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Cell cell5 = com.lowagie.text.factories.ElementFactory.getCell(properties1);
        com.lowagie.text.Paragraph paragraph6 = com.lowagie.text.factories.ElementFactory.getParagraph(properties1);
        paragraph6.setAlignment(247);
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(cell5);
        assertNotNull(paragraph6);
    }

    @Test
    void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test295");
        java.lang.String str1 = com.lowagie.text.pdf.PdfPKCS7.getDigest("pdf:keywords");
        assertEquals("pdf:keywords", str1, "'" + str1 + "' != '" + "pdf:keywords" + "'");
    }

    @Test
    void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test296");
        com.lowagie.text.Font font3 = new com.lowagie.text.Font((int) (short) 10, 52.0f, (int) 'Ã');
    }

    @Test
    void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test297");
        java.lang.String str0 = com.lowagie.text.ElementTags.ALIGN_JUSTIFIED;
        assertEquals("Justify", str0, "'" + str0 + "' != '" + "Justify" + "'");
    }

    @Test
    void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test298");
        com.lowagie.text.pdf.hyphenation.CharVector charVector0 = new com.lowagie.text.pdf.hyphenation.CharVector();
    }

    @Test
    void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test299");
        int i1 = com.lowagie.text.Meta.getType("<rdf:Alt><rdf:li xml:lang=\"operation\" >&lt;?xpacket end=&quot;r&quot;?&gt;</rdf:li></rdf:Alt>");
        assertEquals(0, i1);
    }

    @Test
    void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test300");
        int i0 = com.lowagie.text.pdf.PdfObject.NAME;
        assertEquals(4, i0);
    }

    @Test
    void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test301");
        java.awt.Color color0 = java.awt.Color.darkGray;
        assertNotNull(color0);
    }

    @Test
    void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test302");
        float f0 = com.lowagie.text.pdf.PdfWriter.NO_SPACE_CHAR_RATIO;
        assertEquals(1.0E7f, f0);
    }

    @Test
    void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test303");
        com.lowagie.text.pdf.MultiColumnText multiColumnText0 = new com.lowagie.text.pdf.MultiColumnText();
        boolean b1 = multiColumnText0.isNestable();
        java.util.ArrayList arrayList2 = multiColumnText0.getChunks();
        int i3 = multiColumnText0.type();
        boolean b4 = multiColumnText0.isNestable();
        assertEquals(false, b1);
        assertNull(arrayList2);
        assertEquals(40, i3);
        assertEquals(false, b4);
    }

    @Test
    void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test304");
        int i0 = com.lowagie.text.pdf.parser.Matrix.I23;
        assertEquals(5, i0);
    }

    @Test
    void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test305");
        com.lowagie.text.pdf.internal.PdfXConformanceImp pdfXConformanceImp0 = new com.lowagie.text.pdf.internal.PdfXConformanceImp();
        com.lowagie.text.pdf.PdfWriter pdfWriter1 = null;
        com.lowagie.text.Font font3 = null;
        com.lowagie.text.Footnote footnote4 = new com.lowagie.text.Footnote("", font3);
        com.lowagie.text.HeaderFooter headerFooter6 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote4, true);
        headerFooter6.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle9 = headerFooter6.rotate();
        float[] f_array14 = new float[]{6, 9};
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation15 = com.lowagie.text.pdf.PdfAnnotation.createMarkup(pdfWriter1, rectangle9, "Stream", 3, f_array14);
        pdfXConformanceImp0.completeExtraCatalog((com.lowagie.text.pdf.PdfDictionary) pdfAnnotation15);
        com.lowagie.text.pdf.PdfDictionary pdfDictionary17 = null;
        pdfXConformanceImp0.completeExtraCatalog(pdfDictionary17);
        boolean b19 = pdfXConformanceImp0.isPdfX32002();
        assertNotNull(rectangle9);
        assertNotNull(f_array14);
        assertNotNull(pdfAnnotation15);
        assertEquals(false, b19);
    }

    @Test
    void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test306");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        boolean b9 = type3Font5.setKerning(55, (-3), 8388608);
        assertNotNull(char_array3);
        assertEquals(false, b9);
    }

    @Test
    void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test307");
        com.lowagie.text.pdf.parser.TextAssembler textAssembler0 = null;
        com.lowagie.text.pdf.parser.PdfContentStreamHandler pdfContentStreamHandler1 = new com.lowagie.text.pdf.parser.PdfContentStreamHandler(textAssembler0);
        java.util.Map<java.lang.String, com.lowagie.text.pdf.parser.ContentOperator> map_str_contentOperator2 = null;
        pdfContentStreamHandler1.operators = map_str_contentOperator2;
        com.lowagie.text.pdf.parser.Matrix matrix4 = pdfContentStreamHandler1.textMatrix;
        com.lowagie.text.pdf.parser.GraphicsState[] graphicsState_array5 = new com.lowagie.text.pdf.parser.GraphicsState[]{};
        java.util.Stack<com.lowagie.text.pdf.parser.GraphicsState> stack_graphicsState6 = new java.util.Stack<com.lowagie.text.pdf.parser.GraphicsState>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<com.lowagie.text.pdf.parser.GraphicsState>) stack_graphicsState6, graphicsState_array5);
        pdfContentStreamHandler1.gsStack = stack_graphicsState6;
        java.util.Stack<com.lowagie.text.pdf.parser.GraphicsState> stack_graphicsState9 = pdfContentStreamHandler1.gsStack;
        com.lowagie.text.pdf.parser.Matrix matrix10 = pdfContentStreamHandler1.textMatrix;
        assertNull(matrix4);
        assertNotNull(graphicsState_array5);
        assertEquals(false, b7);
        assertNotNull(stack_graphicsState9);
        assertNull(matrix10);
    }

    @Test
    void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test308");
        com.lowagie.text.Font font6 = com.lowagie.text.FontFactory.getFont("top", "absolutex", (float) (-1), 6);
        com.lowagie.text.Chunk chunk7 = com.lowagie.text.SpecialSymbol.get(' ', font6);
        com.lowagie.text.ListItem listItem8 = new com.lowagie.text.ListItem("application", font6);
        font6.setStyle("[/FlashVars]");
        assertNotNull(font6);
        assertNotNull(chunk7);
    }

    @Test
    void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test309");
        try {
            byte[] byte_array1 = com.lowagie.text.pdf.BarcodeEAN.getBarsEAN8("NEWPAGE");
            fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test310");
        com.lowagie.text.pdf.hyphenation.Hyphenator hyphenator4 = new com.lowagie.text.pdf.hyphenation.Hyphenator("xmp:Identifier", "destination", (int) 'c', 32);
        com.lowagie.text.pdf.PdfWriter pdfWriter5 = null;
        char[] char_array8 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font10 = new com.lowagie.text.pdf.Type3Font(pdfWriter5, char_array8, true);
        com.lowagie.text.pdf.hyphenation.Hyphenation hyphenation13 = hyphenator4.hyphenate(char_array8, 512, 100);
        int i14 = com.lowagie.text.pdf.hyphenation.TernaryTree.strlen(char_array8);
        assertNotNull(char_array8);
        assertNull(hyphenation13);
        assertEquals(2, i14);
    }

    @Test
    void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test311");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfAcroForm pdfAcroForm1 = new com.lowagie.text.pdf.PdfAcroForm(pdfWriter0);
        pdfAcroForm1.setNeedAppearances(true);
        boolean b4 = pdfAcroForm1.isDictionary();
        boolean b5 = pdfAcroForm1.isCatalog();
        java.lang.String str6 = pdfAcroForm1.toString();
        com.lowagie.text.pdf.PdfFormField pdfFormField7 = null;
        try {
            pdfAcroForm1.setSignatureParams(pdfFormField7, "named", (float) 17, (float) '搊', 0.0f, (float) (byte) 0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertEquals(true, b4);
        assertEquals(false, b5);
        assertEquals("Dictionary", str6, "'" + str6 + "' != '" + "Dictionary" + "'");
    }

    @Test
    void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test312");
        com.lowagie.text.Paragraph paragraph0 = null;
        com.lowagie.text.Chapter chapter2 = new com.lowagie.text.Chapter(paragraph0, 1785737760);
        float f3 = chapter2.getIndentationLeft();
        boolean b4 = chapter2.isContent();
        chapter2.setIndentationLeft((-90.0f));
        assertEquals(0.0f, f3);
        assertEquals(true, b4);
    }

    @Test
    void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test313");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        pdfPTable1.setSpacingBefore((float) 15);
        com.lowagie.text.pdf.PdfPTable pdfPTable5 = new com.lowagie.text.pdf.PdfPTable(pdfPTable1);
        int i6 = pdfPTable5.size();
        assertNotNull(pdfPCell2);
        assertEquals(0, i6);
    }

    @Test
    void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test314");
        com.lowagie.text.xml.XmlDomWriter xmlDomWriter1 = new com.lowagie.text.xml.XmlDomWriter(false);
        org.w3c.dom.Node node2 = null;
        xmlDomWriter1.write(node2);
    }

    @Test
    void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test315");
        java.lang.String str0 = com.lowagie.text.ElementTags.SECTION;
        assertEquals("section", str0, "'" + str0 + "' != '" + "section" + "'");
    }

    @Test
    void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test316");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.FDECODEPARMS;
        assertNotNull(pdfName0);
    }

    @Test
    void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test317");
        byte[] byte_array5 = null;
        com.lowagie.text.pdf.PdfReader pdfReader7 = null;
        byte[] byte_array12 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream13 = new com.lowagie.text.pdf.PRStream(pdfReader7, byte_array12);
        com.lowagie.text.pdf.PdfReader pdfReader14 = null;
        byte[] byte_array19 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream20 = new com.lowagie.text.pdf.PRStream(pdfReader14, byte_array19);
        pRStream13.setData(byte_array19, false, (int) (byte) 100);
        byte[] byte_array24 = pRStream13.getBytes();
        com.lowagie.text.pdf.PdfReader pdfReader25 = null;
        byte[] byte_array30 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream31 = new com.lowagie.text.pdf.PRStream(pdfReader25, byte_array30);
        com.lowagie.text.pdf.PdfReader pdfReader32 = null;
        byte[] byte_array37 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream38 = new com.lowagie.text.pdf.PRStream(pdfReader32, byte_array37);
        pRStream31.setData(byte_array37, false, (int) (byte) 100);
        byte[] byte_array42 = pRStream31.getBytes();
        pRStream13.setData(byte_array42);
        com.lowagie.text.pdf.PdfName pdfName44 = com.lowagie.text.pdf.PdfName.FIRSTCHAR;
        java.lang.String str45 = com.lowagie.text.error_messages.MessageLocalization.getComposedMessage("listitem", (java.lang.Object) byte_array42, (java.lang.Object) pdfName44);
        com.lowagie.text.pdf.PdfDashPattern pdfDashPattern48 = new com.lowagie.text.pdf.PdfDashPattern((float) 0L, (float) 8);
        byte[] byte_array49 = com.lowagie.text.pdf.PdfReader.decodePredictor(byte_array42, (com.lowagie.text.pdf.PdfObject) pdfDashPattern48);
        com.lowagie.text.pdf.BaseFont baseFont52 = com.lowagie.text.pdf.BaseFont.createFont("", "Allowed: Modify contents", false, false, byte_array5, byte_array49, true, false);
        com.lowagie.text.pdf.PdfLiteral pdfLiteral53 = new com.lowagie.text.pdf.PdfLiteral(804, byte_array5);
        assertNotNull(byte_array12);
        assertNotNull(byte_array19);
        assertNotNull(byte_array24);
        assertNotNull(byte_array30);
        assertNotNull(byte_array37);
        assertNotNull(byte_array42);
        assertNotNull(pdfName44);
        assertEquals("No message found for listitem", str45, "'" + str45 + "' != '" + "No message found for listitem" + "'");
        assertNotNull(byte_array49);
        assertNull(baseFont52);
    }

    @Test
    void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test318");
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
        com.lowagie.text.pdf.PdfAction pdfAction36 = new com.lowagie.text.pdf.PdfAction("plainwidth", 3);
        try {
            pdfContentByte25.setAction(pdfAction36, (float) (-3), Float.NaN, (float) 11, (float) 14);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfFormField6);
        assertNotNull(char_array16);
        assertNotNull(pdfContentByte25);
        assertNull(pdfWriter31);
    }

    @Test
    void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test319");
        com.lowagie.text.Meta meta2 = new com.lowagie.text.Meta("xmp:ModifyDate", "convert2pdfp");
        int i3 = meta2.type();
        java.lang.String str4 = meta2.getContent();
        assertEquals(0, i3);
        assertEquals("convert2pdfp", str4, "'" + str4 + "' != '" + "convert2pdfp" + "'");
    }

    @Test
    void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test320");
        java.io.OutputStream outputStream0 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields2 = new com.lowagie.text.pdf.PdfCopyFields(outputStream0, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = pdfCopyFields2.getWriter();
        com.lowagie.text.pdf.PdfReader pdfReader4 = null;
        try {
            pdfCopyFields2.addDocument(pdfReader4, "padding-left");
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfWriter3);
    }

    @Test
    void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test321");
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
        int i56 = radioCheckField51.getAlignment();
        radioCheckField51.setBorderWidth((float) (byte) 60);
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
        assertEquals(0, i56);
    }

    @Test
    void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test322");
        com.lowagie.text.pdf.MultiColumnText multiColumnText0 = new com.lowagie.text.pdf.MultiColumnText();
        boolean b1 = multiColumnText0.isNestable();
        java.util.ArrayList arrayList2 = multiColumnText0.getChunks();
        multiColumnText0.addSimpleColumn(1.0f, (float) 763);
        assertEquals(false, b1);
        assertNull(arrayList2);
    }

    @Test
    void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test323");
        com.lowagie.text.ZapfDingbatsList zapfDingbatsList2 = new com.lowagie.text.ZapfDingbatsList(2, 2368);
        boolean b3 = zapfDingbatsList2.isEmpty();
        zapfDingbatsList2.setLettered(false);
        float f6 = zapfDingbatsList2.getIndentationRight();
        assertEquals(true, b3);
        assertEquals(0.0f, f6);
    }

    @Test
    void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test324");
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
        com.lowagie.text.pdf.PdfName pdfName45 = com.lowagie.text.pdf.PdfName.TH;
        com.lowagie.text.pdf.PdfName pdfName46 = pdfAnnotation44.getAsName(pdfName45);
        pdfAnnotation44.setTitle("STSong-Light");
        com.lowagie.text.pdf.PdfName pdfName49 = com.lowagie.text.pdf.PdfName.PAGELABELS;
        com.lowagie.text.pdf.PdfName pdfName50 = com.lowagie.text.pdf.PdfName.N4;
        pdfAnnotation44.setMKIconFit(pdfName49, pdfName50, (float) (byte) 1, (float) 2147483647, false);
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertNotNull(pdfName35);
        assertNotNull(pdfName36);
        assertNotNull(rectangle38);
        assertNotNull(pdfAnnotation44);
        assertNotNull(pdfName45);
        assertNull(pdfName46);
        assertNotNull(pdfName49);
        assertNotNull(pdfName50);
    }

    @Test
    void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test325");
        java.lang.String str0 = com.lowagie.text.ElementTags.SIZE;
        assertEquals("size", str0, "'" + str0 + "' != '" + "size" + "'");
    }

    @Test
    void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test326");
        com.lowagie.text.SimpleCell simpleCell1 = new com.lowagie.text.SimpleCell(true);
        simpleCell1.setSpacing_top((float) 226);
        int i4 = simpleCell1.type();
        int i5 = simpleCell1.getColspan();
        simpleCell1.setSpacing_right((float) 32768);
        assertEquals(20, i4);
        assertEquals(1, i5);
    }

    @Test
    void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test327");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Cell cell5 = com.lowagie.text.factories.ElementFactory.getCell(properties1);
        boolean b6 = cell5.isUseBorderPadding();
        cell5.setHorizontalAlignment("Times-Bold");
        boolean b9 = cell5.isHeader();
        cell5.setHorizontalAlignment("top");
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(cell5);
        assertEquals(false, b6);
        assertEquals(false, b9);
    }

    @Test
    void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test328");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfAcroForm pdfAcroForm1 = new com.lowagie.text.pdf.PdfAcroForm(pdfWriter0);
        boolean b2 = pdfAcroForm1.isOutlineTree();
        com.lowagie.text.pdf.PRIndirectReference pRIndirectReference3 = null;
        pdfAcroForm1.setIndRef(pRIndirectReference3);
        com.lowagie.text.pdf.PdfWriter pdfWriter8 = null;
        char[] char_array11 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font13 = new com.lowagie.text.pdf.Type3Font(pdfWriter8, char_array11, true);
        java.lang.String[][] str_array_array14 = type3Font13.getAllNameEntries();
        boolean b15 = type3Font13.hasKernPairs();
        int i18 = type3Font13.getKerning(1042, 53);
        boolean b19 = type3Font13.isFontSpecific();
        try {
            com.lowagie.text.pdf.PdfFormField pdfFormField25 = pdfAcroForm1.addResetButton("xmpMM:ManagerVariant", "grayfill", "bgred", (com.lowagie.text.pdf.BaseFont) type3Font13, (float) 1, (float) 10, (float) 264, (float) (-56410008), (float) (byte) 32);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertEquals(false, b2);
        assertNotNull(char_array11);
        assertNotNull(str_array_array14);
        assertEquals(false, b15);
        assertEquals(0, i18);
        assertEquals(true, b19);
    }

    @Test
    void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test329");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfAnnotation.HIGHLIGHT_TOGGLE;
        assertNotNull(pdfName0);
    }

    @Test
    void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test330");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte12 = type3Font5.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte12.rectangle((float) (-3), (float) 'a', (float) (-1), (float) (byte) 0);
        com.lowagie.text.pdf.PdfWriter pdfWriter18 = pdfContentByte12.getPdfWriter();
        pdfContentByte12.fill();
        pdfContentByte12.setLineDash((float) 50, (float) 224);
        assertNotNull(char_array3);
        assertNotNull(pdfContentByte12);
        assertNull(pdfWriter18);
    }

    @Test
    void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test332");
        com.lowagie.text.ZapfDingbatsList zapfDingbatsList2 = new com.lowagie.text.ZapfDingbatsList(2, 2368);
        boolean b3 = zapfDingbatsList2.isLowercase();
        float f4 = zapfDingbatsList2.getIndentationRight();
        boolean b5 = zapfDingbatsList2.isLowercase();
        assertEquals(false, b3);
        assertEquals(0.0f, f4);
        assertEquals(false, b5);
    }

    @Test
    void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test333");
        com.lowagie.text.pdf.BaseFont baseFont1 = null;
        com.lowagie.text.Font font4 = new com.lowagie.text.Font(baseFont1, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont6 = font4.getCalculatedBaseFont(false);
        boolean b9 = baseFont6.setCharAdvance(9, 0);
        java.lang.String[] str_array10 = baseFont6.getCodePagesSupported();
        com.lowagie.text.Font font11 = new com.lowagie.text.Font(baseFont6);
        com.lowagie.text.pdf.PdfTextArray pdfTextArray12 = com.lowagie.text.pdf.PdfContentByte.getKernArray("url", baseFont6);
        pdfTextArray12.add((float) (byte) -1);
        assertNotNull(baseFont6);
        assertEquals(true, b9);
        assertNotNull(str_array10);
        assertNotNull(pdfTextArray12);
    }

    @Test
    void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test334");
        java.lang.String str1 = com.lowagie.text.xml.simpleparser.EntitiesToUnicode.decodeString("Dictionary");
        assertEquals("Dictionary", str1, "'" + str1 + "' != '" + "Dictionary" + "'");
    }

    @Test
    void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test335");
        com.lowagie.text.pdf.PdfShadingPattern pdfShadingPattern0 = null;
        com.lowagie.text.pdf.ShadingColor shadingColor1 = new com.lowagie.text.pdf.ShadingColor(pdfShadingPattern0);
        java.awt.image.ColorModel colorModel2 = null;
        com.lowagie.text.Font font4 = null;
        com.lowagie.text.Footnote footnote5 = new com.lowagie.text.Footnote("", font4);
        int[] i_array10 = new int[]{(short) 1, 1785737760, 8, 100};
        com.lowagie.text.pdf.SimpleBookmark.eliminatePages((java.util.List) footnote5, i_array10);
        int[] i_array18 = new int[]{(short) -1, 0, 'a', 10, 3, (byte) 100};
        com.lowagie.text.pdf.internal.PolylineShape polylineShape20 = new com.lowagie.text.pdf.internal.PolylineShape(i_array10, i_array18, 4);
        java.awt.Rectangle rectangle21 = polylineShape20.getBounds();
        com.lowagie.text.Font font23 = null;
        com.lowagie.text.Footnote footnote24 = new com.lowagie.text.Footnote("", font23);
        int[] i_array29 = new int[]{(short) 1, 1785737760, 8, 100};
        com.lowagie.text.pdf.SimpleBookmark.eliminatePages((java.util.List) footnote24, i_array29);
        int[] i_array37 = new int[]{(short) -1, 0, 'a', 10, 3, (byte) 100};
        com.lowagie.text.pdf.internal.PolylineShape polylineShape39 = new com.lowagie.text.pdf.internal.PolylineShape(i_array29, i_array37, 4);
        java.awt.Rectangle rectangle40 = polylineShape39.getBounds();
        java.awt.geom.AffineTransform affineTransform41 = null;
        java.awt.RenderingHints renderingHints42 = null;
        java.awt.PaintContext paintContext43 = shadingColor1.createContext(colorModel2, rectangle21, (java.awt.geom.Rectangle2D) rectangle40, affineTransform41, renderingHints42);
        int i44 = shadingColor1.getType();
        assertNotNull(i_array10);
        assertNotNull(i_array18);
        assertNotNull(rectangle21);
        assertNotNull(i_array29);
        assertNotNull(i_array37);
        assertNotNull(rectangle40);
        assertNotNull(paintContext43);
        assertEquals(5, i44);
    }

    @Test
    void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test336");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        pdfPTable1.setSpacingBefore((float) 15);
        com.lowagie.text.pdf.PdfPTable pdfPTable5 = new com.lowagie.text.pdf.PdfPTable(pdfPTable1);
        pdfPTable5.setFooterRows(14);
        pdfPTable5.setFooterRows(1024);
        pdfPTable5.deleteBodyRows();
        assertNotNull(pdfPCell2);
    }

    @Test
    void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test337");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte12 = type3Font5.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte12.fillStroke();
        com.lowagie.text.pdf.FontMapper fontMapper16 = null;
        java.awt.print.PrinterJob printerJob19 = null;
        java.awt.Graphics2D graphics2D20 = pdfContentByte12.createPrinterGraphics((-1.0f), (float) (-1), fontMapper16, true, (float) (byte) 1, printerJob19);
        com.lowagie.text.pdf.hyphenation.Hyphenator hyphenator25 = new com.lowagie.text.pdf.hyphenation.Hyphenator("xmp:Identifier", "destination", (int) 'c', 32);
        com.lowagie.text.pdf.PdfWriter pdfWriter26 = null;
        char[] char_array29 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font31 = new com.lowagie.text.pdf.Type3Font(pdfWriter26, char_array29, true);
        com.lowagie.text.pdf.hyphenation.Hyphenation hyphenation34 = hyphenator25.hyphenate(char_array29, 512, 100);
        try {
            graphics2D20.drawChars(char_array29, 262, (int) '搊', 25610, 301);
            fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        }
        assertNotNull(char_array3);
        assertNotNull(pdfContentByte12);
        assertNotNull(graphics2D20);
        assertNotNull(char_array29);
        assertNull(hyphenation34);
    }

    @Test
    void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test338");
        java.util.List list2 = com.lowagie.text.pdf.SequenceList.expand("operation", 65535);
        assertNotNull(list2);
    }

    @Test
    void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test339");
        boolean b1 = com.lowagie.text.pdf.PdfEncryptor.isAssemblyAllowed(4194304);
        assertEquals(false, b1);
    }

    @Test
    void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test340");
        com.lowagie.text.pdf.BaseFont baseFont0 = null;
        com.lowagie.text.Font font3 = new com.lowagie.text.Font(baseFont0, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont5 = font3.getCalculatedBaseFont(false);
        font3.setStyle("CV");
        com.lowagie.text.pdf.BaseFont baseFont8 = font3.getBaseFont();
        java.lang.String str9 = font3.getFamilyname();
        assertNotNull(baseFont5);
        assertNull(baseFont8);
        assertEquals("unknown", str9, "'" + str9 + "' != '" + "unknown" + "'");
    }

    @Test
    void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test341");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        java.util.Enumeration<?> enumeration_wildcard5 = properties1.propertyNames();
        java.util.Enumeration<java.lang.Object> enumeration_obj6 = properties1.keys();
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(enumeration_wildcard5);
        assertNotNull(enumeration_obj6);
    }

    @Test
    void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test342");
        com.lowagie.text.Meta meta2 = new com.lowagie.text.Meta("xmp:ModifyDate", "convert2pdfp");
        int i3 = meta2.type();
        java.lang.StringBuffer stringBuffer5 = meta2.append("dc:relation");
        assertEquals(0, i3);
        assertNotNull(stringBuffer5);
    }

    @Test
    void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test343");
        java.io.InputStream inputStream1 = com.lowagie.text.pdf.BaseFont.getResourceStream("pdf");
        assertNull(inputStream1);
    }

    @Test
    void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test344");
        com.lowagie.text.Rectangle rectangle0 = com.lowagie.text.PageSize.ROYAL_QUARTO;
        try {
            rectangle0.setLeft((-1.6777006E7f));
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        assertNotNull(rectangle0);
    }

    @Test
    void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test345");
        int i0 = com.lowagie.text.Element.CHUNK;
        assertEquals(10, i0);
    }

    @Test
    void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test346");
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
        try {
            pdfCopyFields2.addJavaScript("SEPARATOR");
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfName3);
        assertNotNull(pdfFormField5);
        assertEquals(0, i9);
        assertNotNull(font15);
        assertEquals(0.0f, f17);
    }

    @Test
    void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test347");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TOOLBAR;
        assertNotNull(pdfName0);
    }

    @Test
    void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test348");
        com.lowagie.text.ListItem listItem2 = new com.lowagie.text.ListItem(52.0f, "Allowed: Modify contents");
        float f3 = listItem2.getSpacingBefore();
        assertEquals(0.0f, f3);
    }

    @Test
    void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test349");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfGState.BM_LIGHTEN;
        assertNotNull(pdfName0);
    }

    @Test
    void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test350");
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
        java.lang.String str52 = radioCheckField51.getOnValue();
        java.lang.String str53 = radioCheckField51.getOnValue();
        com.lowagie.text.pdf.PdfWriter pdfWriter54 = null;
        char[] char_array57 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font59 = new com.lowagie.text.pdf.Type3Font(pdfWriter54, char_array57, true);
        int i61 = type3Font59.getCidCode((int) (short) 100);
        radioCheckField51.setFont((com.lowagie.text.pdf.BaseFont) type3Font59);
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
        assertEquals("operation", str52, "'" + str52 + "' != '" + "operation" + "'");
        assertEquals("operation", str53, "'" + str53 + "' != '" + "operation" + "'");
        assertNotNull(char_array57);
        assertEquals(100, i61);
    }

    @Test
    void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test351");
        java.lang.String str1 = com.lowagie.text.factories.GreekAlphabetFactory.getUpperCaseString(259);
        assertEquals("KT", str1, "'" + str1 + "' != '" + "KT" + "'");
    }

    @Test
    void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test352");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.FONTFILE;
        assertNotNull(pdfName0);
    }

    @Test
    void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test353");
        com.lowagie.text.pdf.BidiLine bidiLine0 = new com.lowagie.text.pdf.BidiLine();
        int i3 = bidiLine0.trimRightEx((int) 'c', 15);
        assertEquals(15, i3);
    }

    @Test
    void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test354");
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
        byte[] byte_array15 = null;
        com.lowagie.text.pdf.PdfReader pdfReader16 = null;
        byte[] byte_array21 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream22 = new com.lowagie.text.pdf.PRStream(pdfReader16, byte_array21);
        com.lowagie.text.pdf.PdfReader pdfReader23 = null;
        byte[] byte_array28 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream29 = new com.lowagie.text.pdf.PRStream(pdfReader23, byte_array28);
        pRStream22.setData(byte_array28, false, (int) (byte) 100);
        com.lowagie.text.ImgJBIG2 imgJBIG2_33 = new com.lowagie.text.ImgJBIG2(4, 1564, byte_array15, byte_array28);
        int i34 = imgJBIG2_33.getDpiY();
        int[] i_array35 = imgJBIG2_33.getTransparency();
        float f36 = imgJBIG2_33.getScaledWidth();
        imgJBIG2_33.setAlignment((int) (short) -1);
        imgJBIG2_33.setOriginalType(1);
        pdfCopy11.addPage((com.lowagie.text.Rectangle) imgJBIG2_33, (int) (byte) 10);
        assertNotNull(rectangle7);
        assertNotNull(byte_array21);
        assertNotNull(byte_array28);
        assertEquals(0, i34);
        assertNull(i_array35);
        assertEquals(4.0f, f36);
    }

    @Test
    void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test355");
        int i0 = com.lowagie.text.pdf.PdfAnnotation.FLAGS_HIDDEN;
        assertEquals(2, i0);
    }

    @Test
    void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test356");
        com.lowagie.text.pdf.IntHashtable intHashtable2 = new com.lowagie.text.pdf.IntHashtable(1078, (float) 1565);
    }

    @Test
    void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test357");
        com.lowagie.text.RectangleReadOnly rectangleReadOnly4 = new com.lowagie.text.RectangleReadOnly((float) 32768, (float) 259, (float) 258, (float) 'd');
        try {
            rectangleReadOnly4.setUseVariableBorders(true);
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
    }

    @Test
    void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test358");
        com.lowagie.text.pdf.BaseFont baseFont0 = null;
        com.lowagie.text.Font font3 = new com.lowagie.text.Font(baseFont0, (float) (short) 1, (int) (short) 0);
        font3.setSize((float) 100L);
        boolean b6 = font3.isStrikethru();
        java.awt.Color color10 = java.awt.Color.getHSBColor(100.0f, (float) (short) 1, 100.0f);
        int i11 = com.lowagie.text.pdf.ExtendedColor.getType(color10);
        com.lowagie.text.pdf.PdfArray pdfArray12 = com.lowagie.text.pdf.PdfAnnotation.getMKColor(color10);
        font3.setColor(color10);
        java.awt.color.ColorSpace colorSpace14 = null;
        com.lowagie.text.pdf.PdfWriter pdfWriter15 = null;
        float[] f_array22 = new float[]{100.0f, 8, 3, 7, 100.0f, 'a'};
        float[] f_array24 = new float[]{(byte) 10};
        float[] f_array30 = new float[]{64, 64, 100.0f, 4, 29};
        com.lowagie.text.pdf.PdfWriter pdfWriter31 = null;
        com.lowagie.text.Font font33 = null;
        com.lowagie.text.Footnote footnote34 = new com.lowagie.text.Footnote("", font33);
        com.lowagie.text.HeaderFooter headerFooter36 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote34, true);
        headerFooter36.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle39 = headerFooter36.rotate();
        float[] f_array44 = new float[]{6, 9};
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation45 = com.lowagie.text.pdf.PdfAnnotation.createMarkup(pdfWriter31, rectangle39, "Stream", 3, f_array44);
        com.lowagie.text.pdf.PdfFunction pdfFunction47 = com.lowagie.text.pdf.PdfFunction.type2(pdfWriter15, f_array22, f_array24, f_array30, f_array44, 561.0f);
        com.lowagie.text.pdf.PdfArray pdfArray48 = new com.lowagie.text.pdf.PdfArray(f_array24);
        try {
            float[] f_array49 = color10.getComponents(colorSpace14, f_array24);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertEquals(false, b6);
        assertNotNull(color10);
        assertEquals(0, i11);
        assertNotNull(pdfArray12);
        assertNotNull(f_array22);
        assertNotNull(f_array24);
        assertNotNull(f_array30);
        assertNotNull(rectangle39);
        assertNotNull(f_array44);
        assertNotNull(pdfAnnotation45);
        assertNotNull(pdfFunction47);
    }

    @Test
    void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test359");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        pdfPTable1.setSpacingBefore((float) 15);
        com.lowagie.text.pdf.PdfPTable pdfPTable5 = new com.lowagie.text.pdf.PdfPTable(pdfPTable1);
        pdfPTable1.setKeepTogether(false);
        assertNotNull(pdfPCell2);
    }

    @Test
    void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test360");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Phrase phrase5 = com.lowagie.text.factories.ElementFactory.getPhrase(properties1);
        boolean b6 = phrase5.isContent();
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(phrase5);
        assertEquals(true, b6);
    }

    @Test
    void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test361");
        com.lowagie.text.RectangleReadOnly rectangleReadOnly4 = new com.lowagie.text.RectangleReadOnly((float) 32768, (float) 259, (float) 258, (float) 'd');
        try {
            rectangleReadOnly4.setBorderWidthRight((-1.07374182E9f));
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
    }

    @Test
    void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test362");
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
        pdfLayer7.addChild(pdfLayer24);
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
    void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test363");
        int i0 = com.lowagie.text.pdf.PdfWriter.CenterWindow;
        assertEquals(65536, i0);
    }

    @Test
    void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test364");
        try {
            com.lowagie.text.pdf.FdfReader fdfReader1 = new com.lowagie.text.pdf.FdfReader("Right");
            fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
    }

    @Test
    void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test365");
        com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS pPKMS0 = new com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS();
        com.lowagie.text.pdf.PdfReader pdfReader1 = null;
        byte[] byte_array6 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream7 = new com.lowagie.text.pdf.PRStream(pdfReader1, byte_array6);
        pPKMS0.setCert(byte_array6);
        try {
            byte[] byte_array9 = pPKMS0.getSignerContents();
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(byte_array6);
    }

    @Test
    void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test366");
        int i0 = com.lowagie.text.pdf.BarcodeDatamatrix.DM_TEXT;
        assertEquals(3, i0);
    }

    @Test
    void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test367");
        com.lowagie.text.pdf.Barcode128 barcode128_0 = new com.lowagie.text.pdf.Barcode128();
        com.lowagie.text.pdf.Barcode39 barcode39_1 = new com.lowagie.text.pdf.Barcode39();
        barcode39_1.setCodeType(0);
        com.lowagie.text.pdf.BarcodeEANSUPP barcodeEANSUPP4 = new com.lowagie.text.pdf.BarcodeEANSUPP((com.lowagie.text.pdf.Barcode) barcode128_0, (com.lowagie.text.pdf.Barcode) barcode39_1);
        barcodeEANSUPP4.setX((float) 256);
        com.lowagie.text.pdf.PdfWriter pdfWriter7 = null;
        char[] char_array10 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font12 = new com.lowagie.text.pdf.Type3Font(pdfWriter7, char_array10, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte19 = type3Font12.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte19.rectangle((float) (-3), (float) 'a', (float) (-1), (float) (byte) 0);
        com.lowagie.text.pdf.PdfWriter pdfWriter25 = pdfContentByte19.getPdfWriter();
        pdfContentByte19.fill();
        java.awt.Color color27 = java.awt.Color.gray;
        com.lowagie.text.pdf.PdfArray pdfArray28 = com.lowagie.text.pdf.PdfAnnotation.getMKColor(color27);
        com.lowagie.text.pdf.PdfShadingPattern pdfShadingPattern29 = null;
        com.lowagie.text.pdf.ShadingColor shadingColor30 = new com.lowagie.text.pdf.ShadingColor(pdfShadingPattern29);
        try {
            com.lowagie.text.pdf.PdfTemplate pdfTemplate31 = barcodeEANSUPP4.createTemplateWithBarcode(pdfContentByte19, color27, (java.awt.Color) shadingColor30);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(char_array10);
        assertNotNull(pdfContentByte19);
        assertNull(pdfWriter25);
        assertNotNull(color27);
        assertNotNull(pdfArray28);
    }

    @Test
    void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test368");
        java.io.Reader reader0 = null;
        try {
            java.util.HashMap hashMap1 = com.lowagie.text.pdf.SimpleNamedDestination.importFromXML(reader0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test369");
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
        try {
            long long44 = randomAccessFileOrArray43.readLongLE();
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
    }

    @Test
    void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test370");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.RC;
        assertNotNull(pdfName0);
    }

    @Test
    void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test371");
        com.lowagie.text.pdf.hyphenation.Hyphenator hyphenator4 = new com.lowagie.text.pdf.hyphenation.Hyphenator("named", "Allowed: Modify contents", 224, 1);
        hyphenator4.setMinPushCharCount(16384);
        hyphenator4.setMinPushCharCount(1336);
        hyphenator4.setMinPushCharCount(322);
    }

    @Test
    void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test372");
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
        boolean b15 = simpleCell9.isUseDescender();
        assertEquals(20, i4);
        assertEquals((float) f5, Float.NaN, 0);
        assertEquals(20, i12);
        assertNotNull(cell13);
        assertNotNull(cell14);
        assertEquals(false, b15);
    }

    @Test
    void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test373");
        com.lowagie.text.pdf.XfaForm xfaForm0 = new com.lowagie.text.pdf.XfaForm();
        com.lowagie.text.pdf.XfaForm.Xml2SomDatasets xml2SomDatasets1 = null;
        xfaForm0.setDatasetsSom(xml2SomDatasets1);
        com.lowagie.text.pdf.PdfReader pdfReader3 = xfaForm0.getReader();
        assertNull(pdfReader3);
    }

    @Test
    void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test374");
        com.lowagie.text.alignment.HorizontalAlignment horizontalAlignment0 = com.lowagie.text.alignment.HorizontalAlignment.JUSTIFIED;
        assertEquals(horizontalAlignment0, HorizontalAlignment.JUSTIFIED, "'" + horizontalAlignment0 + "' != '" + HorizontalAlignment.JUSTIFIED + "'");
    }

    @Test
    void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test375");
        java.lang.String str0 = com.lowagie.text.ElementTags.LOWERCASE;
        assertEquals("lowercase", str0, "'" + str0 + "' != '" + "lowercase" + "'");
    }

    @Test
    void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test376");
        com.lowagie.text.ListItem listItem0 = new com.lowagie.text.ListItem();
        listItem0.setLeading((float) 804);
        com.lowagie.text.Chapter chapter4 = new com.lowagie.text.Chapter((com.lowagie.text.Paragraph) listItem0, 262);
        java.awt.Color color10 = java.awt.Color.blue;
        com.lowagie.text.Font font11 = new com.lowagie.text.Font(0, (float) 3, 0, color10);
        com.lowagie.text.Font font12 = com.lowagie.text.FontFactory.getFont("bottom", (float) (short) 10, color10);
        listItem0.setFont(font12);
        assertNotNull(color10);
        assertNotNull(font12);
    }

    @Test
    void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test377");
        com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS pPKMS0 = new com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS();
        com.lowagie.text.Font font2 = null;
        com.lowagie.text.Footnote footnote3 = new com.lowagie.text.Footnote("", font2);
        int[] i_array8 = new int[]{(short) 1, 1785737760, 8, 100};
        com.lowagie.text.pdf.SimpleBookmark.eliminatePages((java.util.List) footnote3, i_array8);
        pPKMS0.setByteRange(i_array8);
        com.lowagie.text.pdf.PdfName pdfName11 = com.lowagie.text.pdf.PdfName.DC;
        com.lowagie.text.pdf.PdfWriter pdfWriter12 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField16 = com.lowagie.text.pdf.PdfFormField.createTextField(pdfWriter12, true, false, (int) (short) 10);
        pPKMS0.putEx(pdfName11, (com.lowagie.text.pdf.PdfObject) pdfFormField16);
        java.util.HashMap<java.lang.String, com.lowagie.text.pdf.PdfObject> hashmap_str_pdfObject18 = com.lowagie.text.pdf.PdfNameTree.readTree((com.lowagie.text.pdf.PdfDictionary) pdfFormField16);
        assertNotNull(i_array8);
        assertNotNull(pdfName11);
        assertNotNull(pdfFormField16);
        assertNotNull(hashmap_str_pdfObject18);
    }

    @Test
    void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test378");
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
        try {
            java.lang.String str46 = com.lowagie.text.pdf.PdfEncodings.convertToString(byte_array40, "af");
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
    }

    @Test
    void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test379");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfGState.BM_MULTIPLY;
        assertNotNull(pdfName0);
    }

    @Test
    void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test380");
        int i0 = com.lowagie.text.pdf.PdfWriter.AllowAssembly;
        assertEquals(1024, i0);
    }

    @Test
    void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test381");
        com.lowagie.text.pdf.Barcode128 barcode128_0 = new com.lowagie.text.pdf.Barcode128();
        com.lowagie.text.pdf.BaseFont baseFont1 = barcode128_0.getFont();
        int i3 = baseFont1.getCidCode(472);
        assertNotNull(baseFont1);
        assertEquals(472, i3);
    }

    @Test
    void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test382");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ADBE_PKCS7_S4;
        assertNotNull(pdfName0);
    }

    @Test
    void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test383");
        com.lowagie.text.RomanList romanList1 = new com.lowagie.text.RomanList(1651532643);
        float f2 = romanList1.getSymbolIndent();
        com.lowagie.text.Chunk chunk3 = romanList1.getSymbol();
        java.lang.String str4 = romanList1.getPostSymbol();
        assertEquals(1.65153267E9f, f2);
        assertNotNull(chunk3);
        assertEquals(". ", str4, "'" + str4 + "' != '" + ". " + "'");
    }

    @Test
    void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test384");
        java.lang.String str0 = com.lowagie.text.xml.xmp.XmpWriter.UTF16LE;
        assertEquals("UTF-16LE", str0, "'" + str0 + "' != '" + "UTF-16LE" + "'");
    }

    @Test
    void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test385");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte12 = type3Font5.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte12.fillStroke();
        com.lowagie.text.pdf.FontMapper fontMapper16 = null;
        java.awt.print.PrinterJob printerJob19 = null;
        java.awt.Graphics2D graphics2D20 = pdfContentByte12.createPrinterGraphics((-1.0f), (float) (-1), fontMapper16, true, (float) (byte) 1, printerJob19);
        pdfContentByte12.resetRGBColorFill();
        com.lowagie.text.pdf.PdfTemplate pdfTemplate22 = null;
        try {
            pdfContentByte12.addTemplate(pdfTemplate22, (float) (short) -1, (float) 'ਁ', (float) 763, (float) 8388608, 20000.0f, (float) (byte) 32);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(char_array3);
        assertNotNull(pdfContentByte12);
        assertNotNull(graphics2D20);
    }

    @Test
    void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test386");
        boolean b1 = com.lowagie.text.pdf.PRTokeniser.isWhitespace((int) '6');
        assertEquals(false, b1);
    }

    @Test
    void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test387");
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
        com.lowagie.text.pdf.ByteBuffer byteBuffer45 = new com.lowagie.text.pdf.ByteBuffer(1564);
        byte[] byte_array48 = new byte[]{(byte) -1, (byte) 0};
        com.lowagie.text.pdf.PdfEFStream pdfEFStream49 = new com.lowagie.text.pdf.PdfEFStream(byte_array48);
        com.lowagie.text.pdf.OutputStreamEncryption outputStreamEncryption51 = new com.lowagie.text.pdf.OutputStreamEncryption((java.io.OutputStream) byteBuffer45, byte_array48, (int) (byte) 47);
        try {
            com.lowagie.text.pdf.BaseFont baseFont53 = com.lowagie.text.pdf.BaseFont.createFont("file", "", false, false, byte_array40, byte_array48, false);
            fail("Expected exception of type com.lowagie.text.DocumentException");
        } catch (com.lowagie.text.DocumentException e) {
        }
        assertNotNull(byte_array10);
        assertNotNull(byte_array17);
        assertNotNull(byte_array22);
        assertNotNull(byte_array28);
        assertNotNull(byte_array35);
        assertNotNull(byte_array40);
        assertNotNull(pdfName42);
        assertEquals("No message found for listitem", str43, "'" + str43 + "' != '" + "No message found for listitem" + "'");
        assertNotNull(byte_array48);
    }

    @Test
    void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test388");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.MCR;
        assertNotNull(pdfName0);
    }

    @Test
    void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test389");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.RESOURCES;
        assertNotNull(pdfName0);
    }

    @Test
    void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test390");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        java.io.OutputStream outputStream1 = null;
        try {
            com.lowagie.text.pdf.PdfStamper pdfStamper2 = new com.lowagie.text.pdf.PdfStamper(pdfReader0, outputStream1);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test391");
        java.io.OutputStream outputStream0 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields2 = new com.lowagie.text.pdf.PdfCopyFields(outputStream0, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = pdfCopyFields2.getWriter();
        int i4 = pdfWriter3.getCurrentPageNumber();
        pdfWriter3.setLinearPageMode();
        com.lowagie.text.pdf.PdfWriter pdfWriter6 = null;
        char[] char_array9 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font11 = new com.lowagie.text.pdf.Type3Font(pdfWriter6, char_array9, true);
        com.lowagie.text.pdf.Type3Font type3Font13 = new com.lowagie.text.pdf.Type3Font(pdfWriter3, char_array9, false);
        com.lowagie.text.pdf.PdfDictionary pdfDictionary14 = pdfWriter3.getGroup();
        com.lowagie.text.pdf.PdfPTable pdfPTable16 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell17 = pdfPTable16.getDefaultCell();
        float f18 = pdfPCell17.getIndent();
        float f19 = pdfPCell17.getFollowingIndent();
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper21 = new com.lowagie.text.pdf.PdfPageEventHelper();
        java.io.OutputStream outputStream22 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields24 = new com.lowagie.text.pdf.PdfCopyFields(outputStream22, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter25 = pdfCopyFields24.getWriter();
        com.lowagie.text.Font font27 = null;
        com.lowagie.text.Footnote footnote28 = new com.lowagie.text.Footnote("", font27);
        com.lowagie.text.HeaderFooter headerFooter30 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote28, true);
        headerFooter30.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle33 = headerFooter30.rotate();
        com.lowagie.text.Rectangle rectangle34 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter30);
        com.lowagie.text.Document document35 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter30);
        boolean b37 = document35.setMarginMirroringTopBottom(true);
        com.lowagie.text.Font font41 = null;
        com.lowagie.text.Footnote footnote42 = new com.lowagie.text.Footnote("", font41);
        com.lowagie.text.HeaderFooter headerFooter44 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote42, true);
        headerFooter44.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph47 = headerFooter44.paragraph();
        pdfPageEventHelper21.onSection(pdfWriter25, document35, (float) 7, 262144, paragraph47);
        java.io.OutputStream outputStream49 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields51 = new com.lowagie.text.pdf.PdfCopyFields(outputStream49, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter52 = pdfCopyFields51.getWriter();
        int i53 = pdfWriter52.getCurrentPageNumber();
        com.lowagie.text.Font font55 = null;
        com.lowagie.text.Footnote footnote56 = new com.lowagie.text.Footnote("", font55);
        com.lowagie.text.HeaderFooter headerFooter58 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote56, true);
        headerFooter58.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle61 = headerFooter58.rotate();
        com.lowagie.text.Rectangle rectangle62 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter58);
        com.lowagie.text.Document document63 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter58);
        boolean b65 = document63.setMarginMirroringTopBottom(true);
        com.lowagie.text.Rectangle rectangle66 = com.lowagie.text.PageSize.A4;
        pdfPageEventHelper21.onGenericTag(pdfWriter52, document63, rectangle66, "com/lowagie/text/pdf/fonts/");
        com.lowagie.text.pdf.PdfFileSpecification pdfFileSpecification70 = com.lowagie.text.pdf.PdfFileSpecification.fileExtern(pdfWriter52, "OpenPDF 1.2.12.SNAPSHOT");
        pdfFileSpecification70.setVolatile(false);
        try {
            com.lowagie.text.pdf.PdfAnnotation pdfAnnotation75 = com.lowagie.text.pdf.PdfAnnotation.createScreen(pdfWriter3, (com.lowagie.text.Rectangle) pdfPCell17, "1.2.12.SNAPSHOT", pdfFileSpecification70, "line-height", false);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        assertNotNull(pdfWriter3);
        assertEquals(1, i4);
        assertNotNull(char_array9);
        assertNull(pdfDictionary14);
        assertNotNull(pdfPCell17);
        assertEquals(0.0f, f18);
        assertEquals(0.0f, f19);
        assertNotNull(pdfWriter25);
        assertNotNull(rectangle33);
        assertEquals(true, b37);
        assertNotNull(paragraph47);
        assertNotNull(pdfWriter52);
        assertEquals(1, i53);
        assertNotNull(rectangle61);
        assertEquals(true, b65);
        assertNotNull(rectangle66);
        assertNotNull(pdfFileSpecification70);
    }

    @Test
    void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test392");
        int i0 = com.lowagie.text.Font.TIMES_ROMAN;
        assertEquals(2, i0);
    }

    @Test
    void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test393");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_SETMAPPERFLAGS;
        assertEquals(561, i0);
    }

    @Test
    void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test394");
        java.lang.String str0 = com.lowagie.text.xml.xmp.XmpMMSchema.DERIVEDFROM;
        assertEquals("xmpMM:DerivedFrom", str0, "'" + str0 + "' != '" + "xmpMM:DerivedFrom" + "'");
    }

    @Test
    void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test395");
        int i0 = java.awt.geom.PathIterator.SEG_MOVETO;
        assertEquals(0, i0);
    }

    @Test
    void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test396");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.SIG;
        assertNotNull(pdfName0);
    }

    @Test
    void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test397");
        int i0 = com.lowagie.text.pdf.PdfTransition.TBWIPE;
        assertEquals(12, i0);
    }

    @Test
    void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test398");
        com.lowagie.text.pdf.BaseFont baseFont7 = null;
        com.lowagie.text.Font font10 = new com.lowagie.text.Font(baseFont7, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont12 = font10.getCalculatedBaseFont(false);
        boolean b15 = baseFont12.setCharAdvance(9, 0);
        java.awt.Color color21 = java.awt.Color.getHSBColor(100.0f, (float) (short) 1, 100.0f);
        int i22 = com.lowagie.text.pdf.ExtendedColor.getType(color21);
        com.lowagie.text.Font font23 = new com.lowagie.text.Font(baseFont12, (float) (-1), (int) 'Ã', color21);
        int i24 = color21.getGreen();
        com.lowagie.text.Font font26 = com.lowagie.text.FontFactory.getFont("dc:date", "href", false, (float) 'a', (-3), color21, false);
        com.lowagie.text.Phrase phrase27 = com.lowagie.text.Phrase.getInstance(737, "JustifyAll", font26);
        assertNotNull(baseFont12);
        assertEquals(true, b15);
        assertNotNull(color21);
        assertEquals(0, i22);
        assertEquals(0, i24);
        assertNotNull(font26);
        assertNotNull(phrase27);
    }

    @Test
    void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test399");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.STRIKEOUT;
        assertNotNull(pdfName0);
    }

    @Test
    void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test400");
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
        com.lowagie.text.pdf.internal.PdfAnnotationsImp pdfAnnotationsImp47 = new com.lowagie.text.pdf.internal.PdfAnnotationsImp(pdfWriter4);
        boolean b48 = pdfAnnotationsImp47.hasValidAcroForm();
        pdfAnnotationsImp47.resetAnnotations();
        com.lowagie.text.pdf.PdfAcroForm pdfAcroForm50 = pdfAnnotationsImp47.getAcroForm();
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertNotNull(pdfName35);
        assertNotNull(pdfName36);
        assertNotNull(str_array44);
        assertNotNull(pdfFormField46);
        assertEquals(false, b48);
        assertNotNull(pdfAcroForm50);
    }

    @Test
    void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test401");
        com.lowagie.text.pdf.IntHashtable intHashtable0 = new com.lowagie.text.pdf.IntHashtable();
        boolean b2 = intHashtable0.containsKey(4096);
        java.util.Iterator iterator3 = intHashtable0.getEntryIterator();
        assertEquals(false, b2);
        assertNotNull(iterator3);
    }

    @Test
    void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test402");
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
        com.lowagie.text.pdf.hyphenation.SimplePatternParser simplePatternParser15 = new com.lowagie.text.pdf.hyphenation.SimplePatternParser();
        com.lowagie.text.Font font18 = null;
        com.lowagie.text.Footnote footnote19 = new com.lowagie.text.Footnote("", font18);
        com.lowagie.text.HeaderFooter headerFooter21 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote19, true);
        headerFooter21.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph24 = headerFooter21.paragraph();
        com.lowagie.text.ChapterAutoNumber chapterAutoNumber25 = new com.lowagie.text.ChapterAutoNumber(paragraph24);
        com.lowagie.text.Chapter chapter27 = new com.lowagie.text.Chapter(paragraph24, 262);
        simplePatternParser15.addException("Stream", (java.util.ArrayList) paragraph24);
        try {
            simplePatternParser0.parse(inputStream14, (com.lowagie.text.pdf.hyphenation.PatternConsumer) simplePatternParser15);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(paragraph9);
        assertNotNull(paragraph24);
    }

    @Test
    void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test403");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.CIDFONTTYPE2;
        assertNotNull(pdfName0);
    }

    @Test
    void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test404");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TRANSFORMPARAMS;
        assertNotNull(pdfName0);
    }

    @Test
    void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test405");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfAcroForm pdfAcroForm1 = new com.lowagie.text.pdf.PdfAcroForm(pdfWriter0);
        pdfAcroForm1.setNeedAppearances(true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte7 = null;
        try {
            com.lowagie.text.pdf.PdfFormField pdfFormField12 = pdfAcroForm1.addMap("line-height", "block", "", pdfContentByte7, (float) 0L, (float) 'Ã', 100.0f, 33.360004f);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test406");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Paragraph paragraph5 = com.lowagie.text.factories.ElementFactory.getParagraph(properties1);
        int i6 = properties1.size();
        com.lowagie.text.Table table7 = com.lowagie.text.factories.ElementFactory.getTable(properties1);
        float f8 = table7.getWidth();
        com.lowagie.text.Table table9 = new com.lowagie.text.Table(table7);
        java.util.Properties properties11 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b12 = properties11.isEmpty();
        boolean b14 = properties11.contains((java.lang.Object) 14);
        com.lowagie.text.Paragraph paragraph15 = com.lowagie.text.factories.ElementFactory.getParagraph(properties11);
        int i16 = properties11.size();
        com.lowagie.text.Table table17 = com.lowagie.text.factories.ElementFactory.getTable(properties11);
        boolean b18 = table17.isLocked();
        float f19 = table17.getWidth();
        table7.insertTable(table17);
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(paragraph5);
        assertEquals(0, i6);
        assertNotNull(table7);
        assertEquals(80.0f, f8);
        assertNotNull(properties11);
        assertEquals(true, b12);
        assertEquals(false, b14);
        assertNotNull(paragraph15);
        assertEquals(0, i16);
        assertNotNull(table17);
        assertEquals(false, b18);
        assertEquals(80.0f, f19);
    }

    @Test
    void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test407");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_SETROP2;
        assertEquals(260, i0);
    }

    @Test
    void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test408");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.FIELDS;
        assertNotNull(pdfName0);
    }

    @Test
    void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test409");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Paragraph paragraph5 = com.lowagie.text.factories.ElementFactory.getParagraph(properties1);
        int i6 = properties1.size();
        com.lowagie.text.Table table7 = com.lowagie.text.factories.ElementFactory.getTable(properties1);
        float f8 = table7.getWidth();
        com.lowagie.text.Table table9 = new com.lowagie.text.Table(table7);
        com.lowagie.text.pdf.PdfRectangle pdfRectangle10 = new com.lowagie.text.pdf.PdfRectangle((com.lowagie.text.Rectangle) table9);
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(paragraph5);
        assertEquals(0, i6);
        assertNotNull(table7);
        assertEquals(80.0f, f8);
    }

    @Test
    void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test410");
        com.lowagie.text.Table table2 = new com.lowagie.text.Table(13, 1791);
        float[] f_array5 = table2.getWidths((float) 804, (float) 1065);
        com.lowagie.text.pdf.PdfPTable pdfPTable6 = new com.lowagie.text.pdf.PdfPTable(f_array5);
        pdfPTable6.setHeadersInEvent(false);
        com.lowagie.text.pdf.PdfPTable pdfPTable10 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell11 = pdfPTable10.getDefaultCell();
        float f12 = pdfPCell11.getIndent();
        pdfPTable6.addCell(pdfPCell11);
        assertNotNull(f_array5);
        assertNotNull(pdfPCell11);
        assertEquals(0.0f, f12);
    }

    @Test
    void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test411");
        com.lowagie.text.pdf.AcroFields.Item item0 = new com.lowagie.text.pdf.AcroFields.Item();
        com.lowagie.text.Font font2 = null;
        com.lowagie.text.Footnote footnote3 = new com.lowagie.text.Footnote("", font2);
        com.lowagie.text.HeaderFooter headerFooter5 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote3, true);
        com.lowagie.text.pdf.HyphenationAuto hyphenationAuto10 = new com.lowagie.text.pdf.HyphenationAuto("Default", "creationdate", (-1), 1785737760);
        footnote3.setHyphenation((com.lowagie.text.pdf.HyphenationEvent) hyphenationAuto10);
        item0.widgets = footnote3;
        com.lowagie.text.Phrase phrase14 = new com.lowagie.text.Phrase("border-bottom-width");
        item0.merged = phrase14;
        com.lowagie.text.Font font17 = null;
        com.lowagie.text.Footnote footnote18 = new com.lowagie.text.Footnote("", font17);
        item0.tabOrder = footnote18;
        java.util.ArrayList arrayList20 = item0.page;
        com.lowagie.text.Phrase phrase22 = new com.lowagie.text.Phrase((float) 'Ã');
        com.lowagie.text.Anchor anchor23 = new com.lowagie.text.Anchor(phrase22);
        item0.tabOrder = anchor23;
        assertNotNull(arrayList20);
    }

    @Test
    void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test412");
        java.util.HashMap hashMap0 = com.lowagie.text.pdf.PdfPKCS7.X509Name.DefaultSymbols;
        java.io.OutputStream outputStream2 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields4 = new com.lowagie.text.pdf.PdfCopyFields(outputStream2, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter5 = pdfCopyFields4.getWriter();
        int i6 = pdfWriter5.getCurrentPageNumber();
        pdfWriter5.setLinearPageMode();
        com.lowagie.text.pdf.PdfLayer pdfLayer8 = com.lowagie.text.pdf.PdfLayer.createTitle("title", pdfWriter5);
        try {
            com.lowagie.text.pdf.PdfDictionary pdfDictionary9 = com.lowagie.text.pdf.PdfNameTree.writeTree(hashMap0, pdfWriter5);
            fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        assertNotNull(hashMap0);
        assertNotNull(pdfWriter5);
        assertEquals(1, i6);
        assertNotNull(pdfLayer8);
    }

    @Test
    void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test413");
        com.lowagie.text.pdf.GrayColor grayColor1 = new com.lowagie.text.pdf.GrayColor(2);
        java.lang.String str2 = grayColor1.toString();
        assertEquals("com.lowagie.text.pdf.GrayColor[r=2,g=2,b=2]", str2, "'" + str2 + "' != '" + "com.lowagie.text.pdf.GrayColor[r=2,g=2,b=2]" + "'");
    }

    @Test
    void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test414");
        byte[] byte_array1 = com.lowagie.text.pdf.crypto.IVGenerator.getIV(0);
        com.lowagie.text.pdf.PRTokeniser pRTokeniser2 = new com.lowagie.text.pdf.PRTokeniser(byte_array1);
        int i3 = pRTokeniser2.length();
        int i4 = pRTokeniser2.getFilePointer();
        pRTokeniser2.close();
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
        boolean b53 = pRTokeniser2.readLineSegment(byte_array48);
        int i54 = pRTokeniser2.getTokenType();
        int i55 = pRTokeniser2.length();
        assertNotNull(byte_array1);
        assertEquals(0, i3);
        assertEquals(0, i4);
        assertNotNull(byte_array15);
        assertNotNull(byte_array22);
        assertNotNull(byte_array27);
        assertNotNull(byte_array33);
        assertNotNull(byte_array40);
        assertNotNull(byte_array45);
        assertNotNull(byte_array48);
        assertNull(baseFont52);
        assertEquals(false, b53);
        assertEquals(0, i54);
        assertEquals(0, i55);
    }

    @Test
    void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test415");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_SETDIBTODEV;
        assertEquals(3379, i0);
    }

    @Test
    void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test416");
        com.lowagie.text.ZapfDingbatsList zapfDingbatsList2 = new com.lowagie.text.ZapfDingbatsList((int) 'ਁ', 1336);
    }

    @Test
    void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test417");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfAcroForm pdfAcroForm1 = new com.lowagie.text.pdf.PdfAcroForm(pdfWriter0);
        pdfAcroForm1.setNeedAppearances(true);
        com.lowagie.text.pdf.PdfFormField pdfFormField7 = pdfAcroForm1.getRadioGroup("top", "UTF-16", true);
        com.lowagie.text.Font font9 = null;
        com.lowagie.text.Footnote footnote10 = new com.lowagie.text.Footnote("", font9);
        com.lowagie.text.HeaderFooter headerFooter12 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote10, true);
        headerFooter12.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle15 = headerFooter12.rotate();
        com.lowagie.text.Rectangle rectangle16 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter12);
        com.lowagie.text.Document document17 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter12);
        java.io.OutputStream outputStream18 = null;
        com.lowagie.text.pdf.PdfCopy pdfCopy19 = new com.lowagie.text.pdf.PdfCopy(document17, outputStream18);
        com.lowagie.text.pdf.PdfFormField pdfFormField20 = com.lowagie.text.pdf.PdfFormField.createEmpty((com.lowagie.text.pdf.PdfWriter) pdfCopy19);
        try {
            pdfAcroForm1.addRadioGroup(pdfFormField20);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfFormField7);
        assertNotNull(rectangle15);
        assertNotNull(pdfFormField20);
    }

    @Test
    void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test418");
        com.lowagie.text.SimpleCell simpleCell1 = new com.lowagie.text.SimpleCell(true);
        com.lowagie.text.SimpleCell simpleCell3 = new com.lowagie.text.SimpleCell(true);
        simpleCell3.setSpacing_top((float) 226);
        int i6 = simpleCell3.type();
        com.lowagie.text.Cell cell7 = simpleCell1.createCell(simpleCell3);
        float f9 = simpleCell1.getBottom((float) (byte) 1);
        simpleCell1.setPadding_bottom(Float.NaN);
        assertEquals(20, i6);
        assertNotNull(cell7);
        assertEquals(1.0f, f9);
    }

    @Test
    void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test419");
        com.lowagie.text.GreekList greekList0 = new com.lowagie.text.GreekList();
        greekList0.setPostSymbol("dc:title");
        java.util.ArrayList arrayList3 = greekList0.getChunks();
        boolean b4 = greekList0.isNestable();
        assertNotNull(arrayList3);
        assertEquals(true, b4);
    }

    @Test
    void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test420");
        com.lowagie.text.pdf.codec.wmf.MetaState metaState0 = new com.lowagie.text.pdf.codec.wmf.MetaState();
        float f1 = metaState0.scalingY;
        metaState0.offsetWx = 512;
        com.lowagie.text.pdf.codec.wmf.MetaBrush metaBrush4 = metaState0.getCurrentBrush();
        assertEquals(0.0f, f1);
        assertNotNull(metaBrush4);
    }

    @Test
    void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test421");
        java.lang.String str0 = com.lowagie.text.FontFactory.TIMES_BOLDITALIC;
        assertEquals("Times-BoldItalic", str0, "'" + str0 + "' != '" + "Times-BoldItalic" + "'");
    }

    @Test
    void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test422");
        java.lang.String str0 = com.lowagie.text.pdf.AsianFontMapper.KoreanFont_GoThic;
        assertEquals("HYGoThic-Medium", str0, "'" + str0 + "' != '" + "HYGoThic-Medium" + "'");
    }

    @Test
    void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test423");
        com.lowagie.text.Rectangle rectangle2 = new com.lowagie.text.Rectangle((float) 247, (float) 1970433056);
        rectangle2.setGrayFill((float) 200);
    }

    @Test
    void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test424");
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
        com.lowagie.text.pdf.PdfContentByte pdfContentByte11 = columnText10.getCanvas();
        assertEquals(0.0f, f2);
        assertNull(pdfContentByte_array7);
        assertNotNull(columnText10);
        assertNull(pdfContentByte11);
    }

    @Test
    void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test425");
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
        try {
            com.lowagie.text.ImgWMF imgWMF21 = new com.lowagie.text.ImgWMF(byte_array18);
            fail("Expected exception of type com.lowagie.text.BadElementException");
        } catch (com.lowagie.text.BadElementException e) {
        }
        assertNotNull(byte_array5);
        assertNotNull(byte_array12);
        assertEquals("Stream", str17, "'" + str17 + "' != '" + "Stream" + "'");
        assertNotNull(byte_array18);
    }

    @Test
    void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test426");
        java.lang.String str0 = com.lowagie.text.pdf.AsianFontMapper.ChineseSimplifiedEncoding_H;
        assertEquals("UniGB-UCS2-H", str0, "'" + str0 + "' != '" + "UniGB-UCS2-H" + "'");
    }

    @Test
    void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test427");
        com.lowagie.text.ListItem listItem0 = new com.lowagie.text.ListItem();
        listItem0.setLeading((float) 804);
        com.lowagie.text.Chapter chapter4 = new com.lowagie.text.Chapter((com.lowagie.text.Paragraph) listItem0, 262);
        com.lowagie.text.Chunk chunk5 = listItem0.getListSymbol();
        float f6 = listItem0.getIndentationRight();
        assertNull(chunk5);
        assertEquals(0.0f, f6);
    }

    @Test
    void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test428");
        byte[][] byte_array_array0 = com.lowagie.text.pdf.PdfEncodings.CRLF_CID_NEWLINE;
        assertNotNull(byte_array_array0);
    }

    @Test
    void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test429");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.N2;
        boolean b1 = pdfName0.canBeInObjStm();
        com.lowagie.text.pdf.PdfArray pdfArray2 = new com.lowagie.text.pdf.PdfArray((com.lowagie.text.pdf.PdfObject) pdfName0);
        assertNotNull(pdfName0);
        assertEquals(true, b1);
    }

    @Test
    void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test430");
        com.lowagie.text.List list2 = new com.lowagie.text.List(true, true);
        list2.setIndentationRight((-30.0f));
        list2.setPostSymbol("com.lowagie.text.pdf.GrayColor[r=2,g=2,b=2]");
    }

    @Test
    void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test431");
        byte[] byte_array2 = new byte[]{(byte) -1, (byte) 0};
        com.lowagie.text.pdf.PdfEFStream pdfEFStream3 = new com.lowagie.text.pdf.PdfEFStream(byte_array2);
        pdfEFStream3.flateCompress();
        java.util.HashMap hashMap5 = com.lowagie.text.pdf.PdfNumberTree.readTree((com.lowagie.text.pdf.PdfDictionary) pdfEFStream3);
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
        com.lowagie.text.pdf.ByteBuffer byteBuffer91 = new com.lowagie.text.pdf.ByteBuffer(1564);
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields93 = new com.lowagie.text.pdf.PdfCopyFields((java.io.OutputStream) byteBuffer91, 'Ã');
        com.lowagie.text.pdf.ByteBuffer byteBuffer95 = byteBuffer91.append(24);
        com.lowagie.text.pdf.ByteBuffer byteBuffer97 = byteBuffer91.append((byte) 100);
        pdfEFStream3.toPdf(pdfWriter10, (java.io.OutputStream) byteBuffer97);
        assertNotNull(byte_array2);
        assertNotNull(hashMap5);
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
        assertNotNull(byteBuffer95);
        assertNotNull(byteBuffer97);
    }

    @Test
    void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test432");
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
        pdfPCell11.setIndent((float) 16384);
        float f25 = pdfPCell11.getMultipliedLeading();
        pdfPCell11.setRowspan((int) 'c');
        assertEquals(0.0f, f3);
        assertEquals(false, b5);
        assertNotNull(pdfPCell11);
        assertEquals(0.0f, f12);
        assertEquals(0.0f, f13);
        assertNotNull(pdfPCell16);
        assertEquals(0.0f, f17);
        assertNull(pdfPTable18);
        assertEquals(1.0f, f25);
    }

    @Test
    void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test433");
        java.net.URL uRL0 = null;
        try {
            com.lowagie.text.Image image1 = com.lowagie.text.ImageLoader.getGifImage(uRL0);
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (com.lowagie.text.ExceptionConverter e) {
        }
    }

    @Test
    void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test434");
        com.lowagie.text.pdf.PdfDictionary pdfDictionary0 = new com.lowagie.text.pdf.PdfDictionary();
    }

    @Test
    void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test435");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte12 = type3Font5.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte12.rectangle((float) (-3), (float) 'a', (float) (-1), (float) (byte) 0);
        try {
            com.lowagie.text.pdf.PdfAppearance pdfAppearance20 = pdfContentByte12.createAppearance((float) (byte) 9, (float) 8388608);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(char_array3);
        assertNotNull(pdfContentByte12);
    }

    @Test
    void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test436");
        com.lowagie.text.GreekList greekList0 = new com.lowagie.text.GreekList();
        greekList0.setPostSymbol("dc:title");
        int i3 = greekList0.size();
        java.lang.Object obj4 = null;
        boolean b5 = greekList0.add(obj4);
        assertEquals(0, i3);
        assertEquals(false, b5);
    }

    @Test
    void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test437");
        com.lowagie.text.pdf.PdfSigGenericPKCS.VeriSign veriSign1 = new com.lowagie.text.pdf.PdfSigGenericPKCS.VeriSign("text-decoration");
        boolean b2 = veriSign1.isBoolean();
        assertEquals(false, b2);
    }

    @Test
    void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test438");
        java.lang.String str0 = com.lowagie.text.xml.xmp.DublinCoreSchema.DEFAULT_XPATH_URI;
        assertEquals("http://purl.org/dc/elements/1.1/", str0, "'" + str0 + "' != '" + "http://purl.org/dc/elements/1.1/" + "'");
    }

    @Test
    void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test439");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.R;
        com.lowagie.text.pdf.PdfDictionary pdfDictionary1 = new com.lowagie.text.pdf.PdfDictionary(pdfName0);
        assertNotNull(pdfName0);
    }

    @Test
    void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test440");
        com.lowagie.text.pdf.PdfDeveloperExtension pdfDeveloperExtension0 = com.lowagie.text.pdf.PdfDeveloperExtension.ADOBE_1_7_EXTENSIONLEVEL3;
        assertNotNull(pdfDeveloperExtension0);
    }

    @Test
    void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test441");
        com.lowagie.text.Font font3 = new com.lowagie.text.Font(301, 2.0f, 1048576);
    }

    @Test
    void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test442");
        int i0 = com.lowagie.text.pdf.PdfAction.NEXTPAGE;
        assertEquals(3, i0);
    }

    @Test
    void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test443");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PRESERVERB;
        assertNotNull(pdfName0);
    }

    @Test
    void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test444");
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
        com.lowagie.text.pdf.PdfName pdfName35 = com.lowagie.text.pdf.PdfName.RENDITION;
        pdfWriter4.setTabs(pdfName35);
        byte[] byte_array37 = null;
        com.lowagie.text.pdf.PdfReader pdfReader38 = null;
        byte[] byte_array43 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream44 = new com.lowagie.text.pdf.PRStream(pdfReader38, byte_array43);
        com.lowagie.text.pdf.PdfReader pdfReader45 = null;
        byte[] byte_array50 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream51 = new com.lowagie.text.pdf.PRStream(pdfReader45, byte_array50);
        pRStream44.setData(byte_array50, false, (int) (byte) 100);
        byte[] byte_array55 = pRStream44.getBytes();
        pdfWriter4.setEncryption(byte_array37, byte_array55, 32768, true);
        com.lowagie.text.pdf.CMYKColor cMYKColor67 = new com.lowagie.text.pdf.CMYKColor(4096, 16, (int) (byte) 100, 8388608);
        java.awt.Color color68 = java.awt.Color.GREEN;
        float[] f_array69 = com.lowagie.text.pdf.PdfShading.getColorArray(color68);
        java.awt.Color color70 = color68.darker();
        try {
            com.lowagie.text.pdf.PdfShading pdfShading71 = com.lowagie.text.pdf.PdfShading.simpleAxial(pdfWriter4, (float) 302, (float) 2147483647, (float) 1042, (float) 'Ã', (java.awt.Color) cMYKColor67, color68);
            fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertNotNull(pdfName35);
        assertNotNull(byte_array43);
        assertNotNull(byte_array50);
        assertNotNull(byte_array55);
        assertNotNull(color68);
        assertNotNull(f_array69);
        assertNotNull(color70);
    }

    @Test
    void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test445");
        byte[][] byte_array_array1 = com.lowagie.text.pdf.internal.PdfVersionImp.HEADER;
        try {
            com.lowagie.text.pdf.PdfEncodings.loadCmap("OpenPDF 1.2.12.SNAPSHOT", byte_array_array1);
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (com.lowagie.text.ExceptionConverter e) {
        }
        assertNotNull(byte_array_array1);
    }

    @Test
    void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test446");
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
        byte[] byte_array46 = new byte[]{(byte) 32};
        byte[] byte_array47 = com.lowagie.text.pdf.PdfReader.LZWDecode(byte_array46);
        int i48 = randomAccessFileOrArray43.read(byte_array47);
        int i49 = randomAccessFileOrArray43.readUnsignedShortLE();
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
        assertNotNull(byte_array46);
        assertNotNull(byte_array47);
        assertEquals(0, i48);
        assertEquals(65535, i49);
    }

    @Test
    void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test447");
        java.lang.String str0 = com.lowagie.text.pdf.AsianFontMapper.JapaneseEncoding_HW_H;
        assertEquals("UniJIS-UCS2-HW-H", str0, "'" + str0 + "' != '" + "UniJIS-UCS2-HW-H" + "'");
    }

    @Test
    void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test448");
        java.lang.String str0 = com.lowagie.text.xml.xmp.XmpBasicSchema.DEFAULT_XPATH_URI;
        assertEquals("http://ns.adobe.com/xap/1.0/", str0, "'" + str0 + "' != '" + "http://ns.adobe.com/xap/1.0/" + "'");
    }

    @Test
    void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test449");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.JS;
        assertNotNull(pdfName0);
    }

    @Test
    void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test450");
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
        byte[] byte_array49 = com.lowagie.text.pdf.PdfEncodings.convertToBytes("", "UTF-16BE");
        codespaceRange0.setStart(byte_array49);
        com.lowagie.text.pdf.hyphenation.ByteVector byteVector52 = new com.lowagie.text.pdf.hyphenation.ByteVector(byte_array49, 64);
        assertNotNull(byte_array11);
        assertNotNull(byte_array18);
        assertNotNull(byte_array23);
        assertNotNull(byte_array29);
        assertNotNull(byte_array36);
        assertNotNull(byte_array41);
        assertNotNull(pdfName43);
        assertEquals("No message found for listitem", str44, "'" + str44 + "' != '" + "No message found for listitem" + "'");
        assertNotNull(byte_array49);
    }

    @Test
    void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test451");
        java.lang.String str0 = com.lowagie.text.xml.xmp.XmpMMSchema.MANAGER;
        assertEquals("xmpMM:Manager", str0, "'" + str0 + "' != '" + "xmpMM:Manager" + "'");
    }

    @Test
    void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test452");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        com.lowagie.text.pdf.ByteBuffer byteBuffer2 = new com.lowagie.text.pdf.ByteBuffer(1564);
        com.lowagie.text.pdf.ByteBuffer byteBuffer4 = byteBuffer2.append((double) 8192);
        try {
            com.lowagie.text.pdf.PdfEncryptor.encrypt(pdfReader0, (java.io.OutputStream) byteBuffer4, true, "destination", "com.lowagie.text.pdf.GrayColor[r=2,g=2,b=2]", 264);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(byteBuffer4);
    }

    @Test
    void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test453");
        java.lang.String str0 = com.lowagie.text.xml.xmp.DublinCoreSchema.PUBLISHER;
        assertEquals("dc:publisher", str0, "'" + str0 + "' != '" + "dc:publisher" + "'");
    }

    @Test
    void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test454");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DATA;
        assertNotNull(pdfName0);
    }

    @Test
    void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test455");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TABLEROW;
        assertNotNull(pdfName0);
    }

    @Test
    void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test456");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_BITBLT;
        assertEquals(2338, i0);
    }

    @Test
    void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test457");
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
        pdfWriter4.setAtLeastPdfVersion('d');
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertNotNull(pdfName35);
        assertNotNull(pdfName36);
        assertNotNull(pdfFormField41);
    }

    @Test
    void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test458");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaBrush.HS_DIAGCROSS;
        assertEquals(5, i0);
    }

    @Test
    void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test459");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DIFFERENCES;
        assertNotNull(pdfName0);
    }

    @Test
    void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test460");
        com.lowagie.text.Chapter chapter1 = new com.lowagie.text.Chapter((int) (short) -1);
        com.lowagie.text.MarkedSection markedSection2 = chapter1.addMarkedSection();
        markedSection2.setIndentation((float) (byte) -1);
        markedSection2.setIndentationRight((float) (byte) 10);
        java.util.ArrayList arrayList7 = markedSection2.getChunks();
        java.util.Properties properties8 = markedSection2.getMarkupAttributes();
        com.lowagie.text.MarkedSection markedSection10 = markedSection2.addSection(2338);
        assertNotNull(markedSection2);
        assertNotNull(arrayList7);
        assertNotNull(properties8);
        assertNotNull(markedSection10);
    }

    @Test
    void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test461");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ENDOFLINE;
        assertNotNull(pdfName0);
    }

    @Test
    void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test462");
        com.lowagie.text.Rectangle rectangle0 = com.lowagie.text.PageSize.B2;
        assertNotNull(rectangle0);
    }

    @Test
    void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test463");
        com.lowagie.text.pdf.events.FieldPositioningEvents fieldPositioningEvents0 = new com.lowagie.text.pdf.events.FieldPositioningEvents();
        fieldPositioningEvents0.padding = ' ';
        com.lowagie.text.Font font4 = null;
        com.lowagie.text.Footnote footnote5 = new com.lowagie.text.Footnote("", font4);
        com.lowagie.text.HeaderFooter headerFooter7 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote5, true);
        headerFooter7.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle10 = headerFooter7.rotate();
        com.lowagie.text.Rectangle rectangle11 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter7);
        com.lowagie.text.Document document12 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter7);
        java.io.OutputStream outputStream13 = null;
        com.lowagie.text.pdf.PdfCopy pdfCopy14 = new com.lowagie.text.pdf.PdfCopy(document12, outputStream13);
        com.lowagie.text.pdf.PdfFormField pdfFormField15 = com.lowagie.text.pdf.PdfFormField.createEmpty((com.lowagie.text.pdf.PdfWriter) pdfCopy14);
        com.lowagie.text.Document document16 = null;
        fieldPositioningEvents0.onOpenDocument((com.lowagie.text.pdf.PdfWriter) pdfCopy14, document16);
        assertNotNull(rectangle10);
        assertNotNull(pdfFormField15);
    }

    @Test
    void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test464");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte12 = type3Font5.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte12.rectangle((float) (-3), (float) 'a', (float) (-1), (float) (byte) 0);
        com.lowagie.text.pdf.PdfWriter pdfWriter18 = pdfContentByte12.getPdfWriter();
        pdfContentByte12.fill();
        com.lowagie.text.pdf.PdfWriter pdfWriter20 = null;
        char[] char_array23 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font25 = new com.lowagie.text.pdf.Type3Font(pdfWriter20, char_array23, true);
        int i27 = type3Font25.getCidCode((int) (short) 100);
        boolean b29 = type3Font25.charExists(1668246642);
        try {
            pdfContentByte12.setFontAndSize((com.lowagie.text.pdf.BaseFont) type3Font25, (float) 1651532643);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(char_array3);
        assertNotNull(pdfContentByte12);
        assertNull(pdfWriter18);
        assertNotNull(char_array23);
        assertEquals(100, i27);
        assertEquals(false, b29);
    }

    @Test
    void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test465");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.SW;
        assertNotNull(pdfName0);
    }

    @Test
    void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test466");
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
        boolean b13 = pdfCopy11.isTagged();
        com.lowagie.text.pdf.PdfTemplate pdfTemplate14 = null;
        try {
            pdfCopy11.releaseTemplate(pdfTemplate14);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(rectangle7);
        assertEquals(false, b13);
    }

    @Test
    void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test467");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.NAME;
        assertNotNull(pdfName0);
    }

    @Test
    void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test468");
        com.lowagie.text.pdf.MultiColumnText multiColumnText0 = new com.lowagie.text.pdf.MultiColumnText();
        boolean b1 = multiColumnText0.isNestable();
        java.util.ArrayList arrayList2 = multiColumnText0.getChunks();
        try {
            multiColumnText0.nextColumn();
            fail("Expected exception of type java.lang.ArithmeticException");
        } catch (java.lang.ArithmeticException e) {
        }
        assertEquals(false, b1);
        assertNull(arrayList2);
    }

    @Test
    void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test469");
        com.lowagie.text.Font font5 = com.lowagie.text.FontFactory.getFont("page-break-after", "face", (float) 30);
        com.lowagie.text.ListItem listItem6 = new com.lowagie.text.ListItem("border-bottom-width", font5);
        com.lowagie.text.Anchor anchor7 = new com.lowagie.text.Anchor("plainwidth", font5);
        int i8 = font5.getFamily();
        assertNotNull(font5);
        assertEquals(i8, (-1));
    }

    @Test
    void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test470");
        int i0 = com.lowagie.text.pdf.PdfGraphics2D.AFM_DIVISOR;
        assertEquals(1000, i0);
    }

    @Test
    void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test471");
        com.lowagie.text.Paragraph paragraph0 = null;
        com.lowagie.text.Chapter chapter2 = new com.lowagie.text.Chapter((int) (short) -1);
        com.lowagie.text.MarkedSection markedSection3 = chapter2.addMarkedSection();
        com.lowagie.text.Font font9 = com.lowagie.text.FontFactory.getFont("page-break-after", "face", (float) 30);
        com.lowagie.text.ListItem listItem10 = new com.lowagie.text.ListItem("border-bottom-width", font9);
        float f11 = listItem10.getIndentationRight();
        com.lowagie.text.Section section12 = chapter2.addSection((float) 302, (com.lowagie.text.Paragraph) listItem10);
        com.lowagie.text.Paragraph paragraph15 = com.lowagie.text.Section.constructTitle(paragraph0, (java.util.ArrayList) section12, (int) (byte) 47, 24);
        com.lowagie.text.pdf.AcroFields.Item item16 = new com.lowagie.text.pdf.AcroFields.Item();
        com.lowagie.text.Font font18 = null;
        com.lowagie.text.Footnote footnote19 = new com.lowagie.text.Footnote("", font18);
        com.lowagie.text.HeaderFooter headerFooter21 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote19, true);
        com.lowagie.text.pdf.HyphenationAuto hyphenationAuto26 = new com.lowagie.text.pdf.HyphenationAuto("Default", "creationdate", (-1), 1785737760);
        footnote19.setHyphenation((com.lowagie.text.pdf.HyphenationEvent) hyphenationAuto26);
        item16.widgets = footnote19;
        com.lowagie.text.Font font30 = null;
        com.lowagie.text.Footnote footnote31 = new com.lowagie.text.Footnote("", font30);
        com.lowagie.text.HeaderFooter headerFooter33 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote31, true);
        headerFooter33.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph36 = headerFooter33.paragraph();
        com.lowagie.text.ChapterAutoNumber chapterAutoNumber37 = new com.lowagie.text.ChapterAutoNumber(paragraph36);
        com.lowagie.text.Font font39 = null;
        com.lowagie.text.Footnote footnote40 = new com.lowagie.text.Footnote("", font39);
        com.lowagie.text.HeaderFooter headerFooter42 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote40, true);
        com.lowagie.text.pdf.HyphenationAuto hyphenationAuto47 = new com.lowagie.text.pdf.HyphenationAuto("Default", "creationdate", (-1), 1785737760);
        footnote40.setHyphenation((com.lowagie.text.pdf.HyphenationEvent) hyphenationAuto47);
        com.lowagie.text.Paragraph paragraph51 = com.lowagie.text.Section.constructTitle(paragraph36, (java.util.ArrayList) footnote40, (int) (byte) 100, 15);
        item16.page = paragraph51;
        com.lowagie.text.Section section54 = section12.addSection(paragraph51, 804);
        float f55 = section12.getIndentationLeft();
        assertNotNull(markedSection3);
        assertNotNull(font9);
        assertEquals(0.0f, f11);
        assertNotNull(section12);
        assertNull(paragraph15);
        assertNotNull(paragraph36);
        assertNotNull(paragraph51);
        assertNotNull(section54);
        assertEquals(0.0f, f55);
    }

    @Test
    void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test472");
        com.lowagie.text.ListItem listItem0 = new com.lowagie.text.ListItem();
        listItem0.setLeading((float) 804);
        com.lowagie.text.Chapter chapter4 = new com.lowagie.text.Chapter((com.lowagie.text.Paragraph) listItem0, 262);
        com.lowagie.text.Section section7 = chapter4.addSection("UniCNS-UCS2-V", 259);
        boolean b8 = section7.isBookmarkOpen();
        assertNotNull(section7);
        assertEquals(true, b8);
    }

    @Test
    void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test473");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        com.lowagie.text.pdf.parser.PdfTextExtractor pdfTextExtractor2 = new com.lowagie.text.pdf.parser.PdfTextExtractor(pdfReader0, true);
        try {
            java.lang.String str4 = pdfTextExtractor2.getTextFromPage((int) (byte) 0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test474");
        com.lowagie.text.Font font5 = com.lowagie.text.FontFactory.getFont("top", "absolutex", (float) (-1), 6);
        com.lowagie.text.Chunk chunk6 = com.lowagie.text.SpecialSymbol.get(' ', font5);
        com.lowagie.text.pdf.PdfWriter pdfWriter7 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField8 = com.lowagie.text.pdf.PdfFormField.createCheckBox(pdfWriter7);
        com.lowagie.text.pdf.PdfAction pdfAction10 = new com.lowagie.text.pdf.PdfAction("Cp1250");
        pdfFormField8.setAction(pdfAction10);
        com.lowagie.text.Chunk chunk12 = chunk6.setAction(pdfAction10);
        java.awt.Color color13 = java.awt.Color.GREEN;
        float[] f_array14 = com.lowagie.text.pdf.PdfShading.getColorArray(color13);
        java.awt.Color color15 = color13.darker();
        com.lowagie.text.Chunk chunk21 = chunk6.setUnderline(color13, (float) 55, 203.0f, (float) 2097152, (float) 1785737760, 200);
        assertNotNull(font5);
        assertNotNull(chunk6);
        assertNotNull(pdfFormField8);
        assertNotNull(chunk12);
        assertNotNull(color13);
        assertNotNull(f_array14);
        assertNotNull(color15);
        assertNotNull(chunk21);
    }

    @Test
    void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test475");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_INVERTREGION;
        assertEquals(298, i0);
    }

    @Test
    void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test476");
        java.awt.Color color3 = java.awt.Color.yellow;
        float[] f_array4 = null;
        float[] f_array5 = color3.getRGBComponents(f_array4);
        com.lowagie.text.Font font6 = new com.lowagie.text.Font(247, (float) 1785737760, 0, color3);
        assertNotNull(color3);
        assertNotNull(f_array5);
    }

    @Test
    void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test477");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfAcroForm pdfAcroForm1 = new com.lowagie.text.pdf.PdfAcroForm(pdfWriter0);
        pdfAcroForm1.setNeedAppearances(true);
        boolean b4 = pdfAcroForm1.isDictionary();
        boolean b5 = pdfAcroForm1.isCatalog();
        java.lang.String str6 = pdfAcroForm1.toString();
        try {
            com.lowagie.text.pdf.PdfFormField pdfFormField14 = pdfAcroForm1.addCheckBox("￼", "http://www.aiim.org/pdfa/ns/id/", true, 227.64f, (float) (short) 100, (float) 131072, (-172.0f));
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertEquals(true, b4);
        assertEquals(false, b5);
        assertEquals("Dictionary", str6, "'" + str6 + "' != '" + "Dictionary" + "'");
    }

    @Test
    void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test478");
        com.lowagie.text.pdf.PdfBoolean pdfBoolean0 = com.lowagie.text.pdf.PdfBoolean.PDFTRUE;
        boolean b1 = pdfBoolean0.booleanValue();
        assertNotNull(pdfBoolean0);
        assertEquals(true, b1);
    }

    @Test
    void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test479");
        com.lowagie.text.Font font1 = null;
        com.lowagie.text.Footnote footnote2 = new com.lowagie.text.Footnote("", font1);
        com.lowagie.text.HeaderFooter headerFooter4 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote2, true);
        headerFooter4.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle7 = headerFooter4.rotate();
        com.lowagie.text.Rectangle rectangle8 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter4);
        java.awt.Color color9 = java.awt.Color.GREEN;
        float[] f_array10 = com.lowagie.text.pdf.PdfShading.getColorArray(color9);
        java.awt.Color color11 = color9.darker();
        headerFooter4.setBorderColor(color9);
        com.lowagie.text.pdf.PdfRectangle pdfRectangle14 = new com.lowagie.text.pdf.PdfRectangle((com.lowagie.text.Rectangle) headerFooter4, 0);
        assertNotNull(rectangle7);
        assertNotNull(color9);
        assertNotNull(f_array10);
        assertNotNull(color11);
    }

    @Test
    void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test480");
        int i0 = com.lowagie.text.pdf.AcroFields.FIELD_TYPE_TEXT;
        assertEquals(4, i0);
    }

    @Test
    void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test481");
        com.lowagie.text.pdf.BarcodePDF417 barcodePDF417_0 = new com.lowagie.text.pdf.BarcodePDF417();
        barcodePDF417_0.setDefaultParameters();
    }

    @Test
    void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test482");
        com.lowagie.text.Annotation annotation8 = new com.lowagie.text.Annotation((float) '4', (float) 1, (float) '4', (float) 29, "listitem", "absolutey", "hi!", "ZapfDingbats");
        float f9 = annotation8.ury();
        float f10 = annotation8.llx();
        assertEquals(29.0f, f9);
        assertEquals(52.0f, f10);
    }

    @Test
    void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test483");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_INTERSECTCLIPRECT;
        assertEquals(1046, i0);
    }

    @Test
    void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test484");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField1 = com.lowagie.text.pdf.PdfFormField.createCheckBox(pdfWriter0);
        pdfFormField1.setQuadding((int) (byte) 100);
        int i5 = pdfFormField1.setFieldFlags((-56509343));
        pdfFormField1.setMKTextPosition(32);
        pdfFormField1.setMKAlternateCaption("listsymbol");
        pdfFormField1.setFlags(298);
        assertNotNull(pdfFormField1);
        assertEquals(0, i5);
    }

    @Test
    void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test485");
        com.lowagie.text.Chunk chunk1 = new com.lowagie.text.Chunk("table-cell");
        java.util.HashMap hashMap2 = com.lowagie.text.xml.simpleparser.EntitiesToSymbol.map;
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = null;
        com.lowagie.text.pdf.PdfDictionary pdfDictionary4 = com.lowagie.text.pdf.SimpleNamedDestination.outputNamedDestinationAsNames(hashMap2, pdfWriter3);
        com.lowagie.text.pdf.PdfPKCS7.X509Name.DefaultSymbols = hashMap2;
        chunk1.setAttributes(hashMap2);
        assertNotNull(hashMap2);
        assertNotNull(pdfDictionary4);
    }

    @Test
    void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test486");
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
        java.util.Properties properties15 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b16 = properties15.isEmpty();
        boolean b18 = properties15.contains((java.lang.Object) 14);
        com.lowagie.text.Paragraph paragraph19 = com.lowagie.text.factories.ElementFactory.getParagraph(properties15);
        int i20 = properties15.size();
        com.lowagie.text.Table table21 = com.lowagie.text.factories.ElementFactory.getTable(properties15);
        float f22 = table21.getWidth();
        com.lowagie.text.Table table23 = new com.lowagie.text.Table(table21);
        table12.insertTable(table23);
        assertNotNull(pdfWriter3);
        assertEquals(1, i4);
        assertEquals(0, i6);
        assertEquals(true, b13);
        assertNotNull(properties15);
        assertEquals(true, b16);
        assertEquals(false, b18);
        assertNotNull(paragraph19);
        assertEquals(0, i20);
        assertNotNull(table21);
        assertEquals(80.0f, f22);
    }

    @Test
    void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test487");
        int i0 = com.lowagie.text.pdf.BaseFont.CAPHEIGHT;
        assertEquals(2, i0);
    }

    @Test
    void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test488");
        int i0 = com.lowagie.text.pdf.PdfWriter.FitWindow;
        assertEquals(32768, i0);
    }

    @Test
    void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test489");
        com.lowagie.text.Font font4 = new com.lowagie.text.Font(8, (float) ' ');
        com.lowagie.text.Chunk chunk5 = new com.lowagie.text.Chunk('Æ', font4);
        com.lowagie.text.ListItem listItem6 = new com.lowagie.text.ListItem("background-color", font4);
    }

    @Test
    void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test490");
        try {
            com.lowagie.text.pdf.BaseFont baseFont3 = com.lowagie.text.pdf.BaseFont.createFont("dc:rights", "SKEW", true);
            fail("Expected exception of type com.lowagie.text.DocumentException");
        } catch (com.lowagie.text.DocumentException e) {
        }
    }

    @Test
    void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test491");
        int i0 = com.lowagie.text.pdf.PdfWriter.ALLOW_FILL_IN;
        assertEquals(256, i0);
    }

    @Test
    void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test492");
        byte[] byte_array1 = com.lowagie.text.pdf.crypto.IVGenerator.getIV(0);
        com.lowagie.text.pdf.PRTokeniser pRTokeniser2 = new com.lowagie.text.pdf.PRTokeniser(byte_array1);
        int i3 = pRTokeniser2.length();
        int i4 = pRTokeniser2.getFilePointer();
        pRTokeniser2.seek(301);
        pRTokeniser2.seek((int) (short) -1);
        assertNotNull(byte_array1);
        assertEquals(0, i3);
        assertEquals(0, i4);
    }

    @Test
    void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test493");
        com.lowagie.text.pdf.ByteBuffer byteBuffer1 = new com.lowagie.text.pdf.ByteBuffer(1564);
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields3 = new com.lowagie.text.pdf.PdfCopyFields((java.io.OutputStream) byteBuffer1, 'Ã');
        com.lowagie.text.pdf.ByteBuffer byteBuffer5 = byteBuffer1.append('4');
        com.lowagie.text.pdf.ByteBuffer byteBuffer7 = new com.lowagie.text.pdf.ByteBuffer(1564);
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields9 = new com.lowagie.text.pdf.PdfCopyFields((java.io.OutputStream) byteBuffer7, 'Ã');
        com.lowagie.text.pdf.ByteBuffer byteBuffer11 = byteBuffer7.append(24);
        com.lowagie.text.pdf.ByteBuffer byteBuffer13 = byteBuffer7.append((byte) 100);
        com.lowagie.text.pdf.codec.wmf.MetaDo.writeDWord((java.io.OutputStream) byteBuffer13, 4096);
        com.lowagie.text.pdf.ByteBuffer byteBuffer16 = byteBuffer5.append(byteBuffer13);
        com.lowagie.text.pdf.PdfReader pdfReader17 = null;
        byte[] byte_array22 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream23 = new com.lowagie.text.pdf.PRStream(pdfReader17, byte_array22);
        com.lowagie.text.pdf.PdfReader pdfReader24 = null;
        byte[] byte_array29 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream30 = new com.lowagie.text.pdf.PRStream(pdfReader24, byte_array29);
        pRStream23.setData(byte_array29, false, (int) (byte) 100);
        byte[] byte_array34 = pRStream23.getBytes();
        boolean b35 = pRStream23.isPages();
        com.lowagie.text.pdf.PdfReader pdfReader36 = null;
        byte[] byte_array41 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream42 = new com.lowagie.text.pdf.PRStream(pdfReader36, byte_array41);
        com.lowagie.text.pdf.PdfReader pdfReader43 = null;
        byte[] byte_array48 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream49 = new com.lowagie.text.pdf.PRStream(pdfReader43, byte_array48);
        pRStream42.setData(byte_array48, false, (int) (byte) 100);
        byte[] byte_array53 = pRStream42.getBytes();
        pRStream23.setData(byte_array53);
        byte[] byte_array57 = new byte[]{(byte) 100, (byte) 10};
        com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray58 = new com.lowagie.text.pdf.RandomAccessFileOrArray(byte_array57);
        byte[] byte_array59 = com.lowagie.text.pdf.PdfReader.getStreamBytes(pRStream23, randomAccessFileOrArray58);
        com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray60 = new com.lowagie.text.pdf.RandomAccessFileOrArray(byte_array59);
        char char61 = randomAccessFileOrArray60.readCharLE();
        byte[] byte_array63 = new byte[]{(byte) 32};
        byte[] byte_array64 = com.lowagie.text.pdf.PdfReader.LZWDecode(byte_array63);
        int i65 = randomAccessFileOrArray60.read(byte_array64);
        com.lowagie.text.pdf.ByteBuffer byteBuffer66 = byteBuffer5.append(byte_array64);
        assertNotNull(byteBuffer5);
        assertNotNull(byteBuffer11);
        assertNotNull(byteBuffer13);
        assertNotNull(byteBuffer16);
        assertNotNull(byte_array22);
        assertNotNull(byte_array29);
        assertNotNull(byte_array34);
        assertEquals(false, b35);
        assertNotNull(byte_array41);
        assertNotNull(byte_array48);
        assertNotNull(byte_array53);
        assertNotNull(byte_array57);
        assertNotNull(byte_array59);
        assertEquals('ਁ', char61);
        assertNotNull(byte_array63);
        assertNotNull(byte_array64);
        assertEquals(0, i65);
        assertNotNull(byteBuffer66);
    }

    @Test
    void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test494");
        java.lang.String str0 = com.lowagie.text.ElementTags.URL;
        assertEquals("url", str0, "'" + str0 + "' != '" + "url" + "'");
    }

    @Test
    void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test495");
        com.lowagie.text.pdf.BaseFont baseFont0 = null;
        com.lowagie.text.Font font3 = new com.lowagie.text.Font(baseFont0, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont5 = font3.getCalculatedBaseFont(false);
        font3.setStyle("CV");
        com.lowagie.text.pdf.BaseFont baseFont9 = font3.getCalculatedBaseFont(false);
        java.lang.String str10 = font3.getFamilyname();
        assertNotNull(baseFont5);
        assertNotNull(baseFont9);
        assertEquals("unknown", str10, "'" + str10 + "' != '" + "unknown" + "'");
    }

    @Test
    void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test496");
        com.lowagie.text.pdf.XfaForm xfaForm0 = new com.lowagie.text.pdf.XfaForm();
        com.lowagie.text.pdf.XfaForm.Xml2SomDatasets xml2SomDatasets1 = null;
        xfaForm0.setDatasetsSom(xml2SomDatasets1);
        com.lowagie.text.pdf.XfaForm.Xml2SomDatasets xml2SomDatasets3 = xfaForm0.getDatasetsSom();
        org.w3c.dom.Node node4 = null;
        try {
            xfaForm0.fillXfaForm(node4);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNull(xml2SomDatasets3);
    }

    @Test
    void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test497");
        com.lowagie.text.List list0 = new com.lowagie.text.List();
        list0.setIndentationRight((float) 200);
    }

    @Test
    void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test498");
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
        boolean b21 = pdfCopyFields2.isFullCompression();
        try {
            pdfCopyFields2.close();
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (com.lowagie.text.ExceptionConverter e) {
        }
        assertNotNull(pdfName3);
        assertNotNull(pdfFormField5);
        assertEquals(0, i9);
        assertNotNull(font15);
        assertEquals(0.0f, f17);
        assertEquals(false, b21);
    }

    @Test
    void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test499");
        java.lang.String str0 = com.lowagie.text.pdf.BaseFont.COURIER_BOLD;
        assertEquals("Courier-Bold", str0, "'" + str0 + "' != '" + "Courier-Bold" + "'");
    }

    @Test
    void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test500");
        int i0 = com.lowagie.text.Element.CELL;
        assertEquals(20, i0);
    }
}

