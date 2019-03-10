package regression;

import com.lowagie.text.alignment.VerticalAlignment;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
class RegressionTest1 {

    static boolean debug = false;

    @Test
    void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test001");
        java.lang.String str0 = com.lowagie.text.pdf.AsianFontMapper.ChineseTraditionalEncoding_V;
        assertEquals("UniCNS-UCS2-V", str0, "'" + str0 + "' != '" + "UniCNS-UCS2-V" + "'");
    }

    @Test
    void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test002");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.LZWDECODE;
        assertNotNull(pdfName0);
    }

    @Test
    void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test003");
        int i0 = com.lowagie.text.pdf.PdfTransition.OUTBOX;
        assertEquals(8, i0);
    }

    @Test
    void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test004");
        int i0 = com.lowagie.text.pdf.parser.Vector.I3;
        assertEquals(2, i0);
    }

    @Test
    void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test005");
        com.lowagie.text.pdf.PdfName pdfName1 = new com.lowagie.text.pdf.PdfName("file");
    }

    @Test
    void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test006");
        java.net.URL uRL0 = null;
        try {
            com.lowagie.text.Image image1 = com.lowagie.text.ImageLoader.getJpegImage(uRL0);
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (com.lowagie.text.ExceptionConverter e) {
        }
    }

    @Test
    void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test007");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaState.TA_BASELINE;
        assertEquals(24, i0);
    }

    @Test
    void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test008");
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
        java.io.OutputStream outputStream37 = null;
        try {
            pRStream6.writeContent(outputStream37);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(byte_array5);
        assertNotNull(byte_array12);
        assertNotNull(byte_array17);
        assertNotNull(byte_array23);
        assertNotNull(byte_array30);
        assertNotNull(byte_array35);
    }

    @Test
    void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test009");
        java.lang.String str0 = com.lowagie.text.ElementTags.PAGE;
        assertEquals("page", str0, "'" + str0 + "' != '" + "page" + "'");
    }

    @Test
    void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test010");
        com.lowagie.text.Paragraph paragraph0 = null;
        com.lowagie.text.Chapter chapter2 = new com.lowagie.text.Chapter(paragraph0, 1785737760);
        float f3 = chapter2.getIndentationLeft();
        boolean b4 = chapter2.isContent();
        chapter2.setNotAddedYet(false);
        assertEquals(0.0f, f3);
        assertEquals(true, b4);
    }

    @Test
    void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test011");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_PATBLT;
        assertEquals(1565, i0);
    }

    @Test
    void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test012");
        com.lowagie.text.Table table0 = null;
        try {
            com.lowagie.text.Table table1 = new com.lowagie.text.Table(table0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test013");
        java.io.OutputStream outputStream0 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields2 = new com.lowagie.text.pdf.PdfCopyFields(outputStream0, ' ');
        com.lowagie.text.pdf.PdfReader pdfReader3 = null;
        try {
            pdfCopyFields2.addDocument(pdfReader3, "horizontalalign");
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test014");
        java.lang.String str0 = com.lowagie.text.xml.xmp.DublinCoreSchema.RELATION;
        assertEquals("dc:relation", str0, "'" + str0 + "' != '" + "dc:relation" + "'");
    }

    @Test
    void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test015");
        char char0 = com.lowagie.text.pdf.BaseFont.CID_NEWLINE;
        assertEquals('翿', char0);
    }

    @Test
    void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test016");
        com.lowagie.text.pdf.XfaForm xfaForm0 = new com.lowagie.text.pdf.XfaForm();
        java.io.InputStream inputStream1 = null;
        try {
            xfaForm0.fillXfaForm(inputStream1);
            fail("Expected exception of type java.net.MalformedURLException");
        } catch (java.net.MalformedURLException e) {
        }
    }

    @Test
    void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test017");
        boolean b0 = com.lowagie.text.List.NUMERICAL;
        assertEquals(false, b0);
    }

    @Test
    void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test018");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.VERISIGN_PPKVS;
        assertNotNull(pdfName0);
    }

    @Test
    void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test019");
        com.lowagie.text.xml.simpleparser.IanaEncodings ianaEncodings0 = new com.lowagie.text.xml.simpleparser.IanaEncodings();
    }

    @Test
    void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test020");
        java.lang.String str0 = com.lowagie.text.xml.xmp.XmpWriter.XPACKET_PI_END_R;
        assertEquals("<?xpacket end=\"r\"?>", str0, "'" + str0 + "' != '" + "<?xpacket end=\"r\"?>" + "'");
    }

    @Test
    void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test021");
        java.lang.String str0 = com.lowagie.text.pdf.PdfBoolean.TRUE;
        assertEquals("true", str0, "'" + str0 + "' != '" + "true" + "'");
    }

    @Test
    void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test022");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.RICHMEDIAWINDOW;
        assertNotNull(pdfName0);
    }

    @Test
    void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test023");
        java.lang.String str0 = com.lowagie.text.FontFactory.defaultEncoding;
        assertEquals("Cp1252", str0, "'" + str0 + "' != '" + "Cp1252" + "'");
    }

    @Test
    void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test024");
        byte[] byte_array2 = new byte[]{(byte) 100, (byte) 10};
        com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray3 = new com.lowagie.text.pdf.RandomAccessFileOrArray(byte_array2);
        short s4 = randomAccessFileOrArray3.readShortLE();
        java.io.OutputStream outputStream5 = null;
        try {
            com.lowagie.text.pdf.Pfm2afm.convert(randomAccessFileOrArray3, outputStream5);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(byte_array2);
        assertEquals(s4, (short) 2660);
    }

    @Test
    void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test025");
        java.lang.String str0 = com.lowagie.text.ElementTags.COLUMNS;
        assertEquals("columns", str0, "'" + str0 + "' != '" + "columns" + "'");
    }

    @Test
    void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test026");
        int i0 = com.lowagie.text.pdf.RadioCheckField.TYPE_SQUARE;
        assertEquals(5, i0);
    }

    @Test
    void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test027");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_CREATEBRUSHINDIRECT;
        assertEquals(764, i0);
    }

    @Test
    void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test028");
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
        try {
            byte[] byte_array43 = com.lowagie.text.pdf.PdfReader.getStreamBytes(pRStream6);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
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
    void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test029");
        java.lang.String str0 = com.lowagie.text.xml.xmp.DublinCoreSchema.TITLE;
        assertEquals("dc:title", str0, "'" + str0 + "' != '" + "dc:title" + "'");
    }

    @Test
    void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test030");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        java.util.Enumeration<java.lang.Object> enumeration_obj2 = properties1.elements();
        java.io.InputStream inputStream3 = null;
        try {
            properties1.loadFromXML(inputStream3);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(properties1);
        assertNotNull(enumeration_obj2);
    }

    @Test
    void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test031");
        int i0 = com.lowagie.text.Image.BX;
        assertEquals(2, i0);
    }

    @Test
    void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test032");
        byte[] byte_array0 = null;
        com.lowagie.text.pdf.PdfName pdfName1 = new com.lowagie.text.pdf.PdfName(byte_array0);
    }

    @Test
    void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test033");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.INKLIST;
        assertNotNull(pdfName0);
    }

    @Test
    void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test034");
        byte byte0 = com.lowagie.text.DocWriter.SPACE;
        assertEquals(byte0, (byte) 32);
    }

    @Test
    void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test035");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaBrush.BS_SOLID;
        assertEquals(0, i0);
    }

    @Test
    void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test036");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ORDERING;
        com.lowagie.text.pdf.PRIndirectReference pRIndirectReference1 = null;
        pdfName0.setIndRef(pRIndirectReference1);
        assertNotNull(pdfName0);
    }

    @Test
    void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test037");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.B;
        assertNotNull(pdfName0);
    }

    @Test
    void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test038");
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
            com.lowagie.text.Image image44 = com.lowagie.text.ImageLoader.getTiffImage(byte_array43);
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (com.lowagie.text.ExceptionConverter e) {
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
    void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test039");
        int i0 = com.lowagie.text.pdf.BaseFont.AWT_MAXADVANCE;
        assertEquals(12, i0);
    }

    @Test
    void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test040");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.CH;
        assertNotNull(pdfName0);
    }

    @Test
    void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test041");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.WIN_ANSI_ENCODING;
        assertNotNull(pdfName0);
    }

    @Test
    void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test042");
        com.lowagie.text.RectangleReadOnly rectangleReadOnly4 = new com.lowagie.text.RectangleReadOnly((float) (byte) 100, (float) 1336, (float) 'Ë', (float) 9);
        try {
            rectangleReadOnly4.setGrayFill((float) 496);
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
    }

    @Test
    void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test043");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TRANSFORMMETHOD;
        assertNotNull(pdfName0);
    }

    @Test
    void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test044");
        char char1 = com.lowagie.text.SpecialSymbol.getCorrespondingSymbol('c');
        assertEquals(' ', char1);
    }

    @Test
    void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test045");
        com.lowagie.text.pdf.PdfEncodings.clearCmap("xmp:BaseURL");
    }

    @Test
    void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test046");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.FDF;
        assertNotNull(pdfName0);
    }

    @Test
    void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test047");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfAnnotation.AA_JS_FORMAT;
        assertNotNull(pdfName0);
    }

    @Test
    void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test048");
        com.lowagie.text.pdf.XfaForm xfaForm0 = new com.lowagie.text.pdf.XfaForm();
        org.xml.sax.InputSource inputSource1 = null;
        try {
            xfaForm0.fillXfaForm(inputSource1);
            fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test049");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.FONTBBOX;
        assertNotNull(pdfName0);
    }

    @Test
    void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test050");
        com.lowagie.text.pdf.XfaForm xfaForm0 = new com.lowagie.text.pdf.XfaForm();
        boolean b1 = xfaForm0.isChanged();
        boolean b2 = xfaForm0.isChanged();
        assertEquals(false, b1);
        assertEquals(false, b2);
    }

    @Test
    void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test051");
        int i0 = com.lowagie.text.pdf.PdfDestination.FIT;
        assertEquals(1, i0);
    }

    @Test
    void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test052");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PARENTTREE;
        assertNotNull(pdfName0);
    }

    @Test
    void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test053");
        java.lang.String str0 = com.lowagie.text.html.Markup.HTML_VALUE_JAVASCRIPT;
        assertEquals("text/javascript", str0, "'" + str0 + "' != '" + "text/javascript" + "'");
    }

    @Test
    void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test054");
        com.lowagie.text.Paragraph paragraph0 = null;
        com.lowagie.text.Chapter chapter2 = new com.lowagie.text.Chapter(paragraph0, 1785737760);
        float f3 = chapter2.getIndentationLeft();
        boolean b4 = chapter2.isContent();
        float f5 = chapter2.getIndentationRight();
        boolean b6 = chapter2.isTriggerNewPage();
        assertEquals(0.0f, f3);
        assertEquals(true, b4);
        assertEquals(0.0f, f5);
        assertEquals(true, b6);
    }

    @Test
    void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test055");
        int i1 = com.lowagie.text.pdf.PRTokeniser.getHex(12);
        assertEquals(i1, (-1));
    }

    @Test
    void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test056");
        try {
            com.lowagie.text.pdf.BaseFont baseFont4 = com.lowagie.text.pdf.BaseFont.createFont("operation", "title", false, false);
            fail("Expected exception of type com.lowagie.text.DocumentException");
        } catch (com.lowagie.text.DocumentException e) {
        }
    }

    @Test
    void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test057");
        com.lowagie.text.pdf.PdfOCProperties pdfOCProperties0 = new com.lowagie.text.pdf.PdfOCProperties();
    }

    @Test
    void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test058");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.Off;
        assertNotNull(pdfName0);
    }

    @Test
    void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test059");
        java.lang.String str0 = com.lowagie.text.ElementTags.APPLICATION;
        assertEquals("application", str0, "'" + str0 + "' != '" + "application" + "'");
    }

    @Test
    void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test060");
        java.lang.String str1 = com.lowagie.text.factories.RomanAlphabetFactory.getString((int) ' ');
        assertEquals("af", str1, "'" + str1 + "' != '" + "af" + "'");
    }

    @Test
    void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test061");
        int i0 = com.lowagie.text.pdf.PdfWriter.PageModeUseAttachments;
        assertEquals(2048, i0);
    }

    @Test
    void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test062");
        int i0 = com.lowagie.text.pdf.BaseFont.FONT_TYPE_T3;
        assertEquals(5, i0);
    }

    @Test
    void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test063");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_CREATEPALETTE;
        assertEquals(247, i0);
    }

    @Test
    void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test064");
        int i0 = com.lowagie.text.Element.CCITT_ENDOFBLOCK;
        assertEquals(8, i0);
    }

    @Test
    void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test065");
        try {
            java.awt.Color color1 = com.lowagie.text.html.WebColors.getRGBColor("TAB");
            fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test066");
        java.io.OutputStream outputStream0 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields2 = new com.lowagie.text.pdf.PdfCopyFields(outputStream0, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = pdfCopyFields2.getWriter();
        com.lowagie.text.pdf.PdfAction pdfAction5 = new com.lowagie.text.pdf.PdfAction();
        try {
            pdfWriter3.addJavaScript("HeiseiKakuGo-W5", pdfAction5);
            fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        assertNotNull(pdfWriter3);
    }

    @Test
    void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test067");
        int i0 = com.lowagie.text.pdf.PdfFormField.FF_DONOTSCROLL;
        assertEquals(8388608, i0);
    }

    @Test
    void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test068");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfDictionary.FONT;
        assertNotNull(pdfName0);
    }

    @Test
    void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test069");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ALTERNATE;
        com.lowagie.text.pdf.PRIndirectReference pRIndirectReference1 = pdfName0.getIndRef();
        assertNotNull(pdfName0);
        assertNull(pRIndirectReference1);
    }

    @Test
    void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test070");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ALT;
        assertNotNull(pdfName0);
    }

    @Test
    void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test071");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.UHC;
        assertNotNull(pdfName0);
    }

    @Test
    void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test072");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.GROUP;
        assertNotNull(pdfName0);
    }

    @Test
    void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test073");
        java.lang.String str0 = com.lowagie.text.pdf.BaseFont.IDENTITY_H;
        assertEquals("Identity-H", str0, "'" + str0 + "' != '" + "Identity-H" + "'");
    }

    @Test
    void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test074");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ENDOFBLOCK;
        assertNotNull(pdfName0);
    }

    @Test
    void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test075");
        int i0 = com.lowagie.text.pdf.internal.PdfXConformanceImp.PDFXKEY_COLOR;
        assertEquals(1, i0);
    }

    @Test
    void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test076");
        java.awt.Color color2 = java.awt.Color.orange;
        com.lowagie.text.Font font3 = com.lowagie.text.FontFactory.getFont("hi!", (float) (byte) 47, color2);
        com.lowagie.text.pdf.fonts.FontsResourceAnchor fontsResourceAnchor4 = new com.lowagie.text.pdf.fonts.FontsResourceAnchor();
        int i5 = font3.compareTo((java.lang.Object) fontsResourceAnchor4);
        assertNotNull(color2);
        assertNotNull(font3);
        assertEquals(i5, (-3));
    }

    @Test
    void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test077");
        com.lowagie.text.alignment.VerticalAlignment verticalAlignment0 = com.lowagie.text.alignment.VerticalAlignment.TOP;
        assertEquals(verticalAlignment0, VerticalAlignment.TOP, "'" + verticalAlignment0 + "' != '" + VerticalAlignment.TOP + "'");
    }

    @Test
    void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test078");
        com.lowagie.text.pdf.Barcode128 barcode128_0 = new com.lowagie.text.pdf.Barcode128();
        com.lowagie.text.pdf.Barcode39 barcode39_1 = new com.lowagie.text.pdf.Barcode39();
        barcode39_1.setCodeType(0);
        com.lowagie.text.pdf.BarcodeEANSUPP barcodeEANSUPP4 = new com.lowagie.text.pdf.BarcodeEANSUPP((com.lowagie.text.pdf.Barcode) barcode128_0, (com.lowagie.text.pdf.Barcode) barcode39_1);
        com.lowagie.text.Rectangle rectangle5 = barcode128_0.getBarcodeSize();
        assertNotNull(rectangle5);
    }

    @Test
    void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test079");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        java.util.Enumeration<java.lang.Object> enumeration_obj2 = properties1.elements();
        java.io.PrintStream printStream3 = null;
        try {
            properties1.list(printStream3);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(properties1);
        assertNotNull(enumeration_obj2);
    }

    @Test
    void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test080");
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
        try {
            double d45 = randomAccessFileOrArray43.readDoubleLE();
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
        assertEquals(true, b44);
    }

    @Test
    void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test081");
        char char0 = com.lowagie.text.pdf.Barcode128.CODE_A;
        assertEquals('È', char0);
    }

    @Test
    void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test082");
        java.io.InputStream inputStream0 = null;
        try {
            java.util.HashMap hashMap1 = com.lowagie.text.pdf.SimpleNamedDestination.importFromXML(inputStream0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test083");
        int i0 = com.lowagie.text.pdf.BaseFont.UNDERLINE_POSITION;
        assertEquals(13, i0);
    }

    @Test
    void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test084");
        char char1 = com.lowagie.text.SpecialSymbol.getCorrespondingSymbol(' ');
        assertEquals(' ', char1);
    }

    @Test
    void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test085");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        byte[] byte_array5 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream6 = new com.lowagie.text.pdf.PRStream(pdfReader0, byte_array5);
        com.lowagie.text.pdf.PdfReader pdfReader7 = null;
        byte[] byte_array12 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream13 = new com.lowagie.text.pdf.PRStream(pdfReader7, byte_array12);
        pRStream6.setData(byte_array12, false, (int) (byte) 100);
        byte[] byte_array17 = pRStream6.getBytes();
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper18 = new com.lowagie.text.pdf.PdfPageEventHelper();
        java.io.OutputStream outputStream19 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields21 = new com.lowagie.text.pdf.PdfCopyFields(outputStream19, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter22 = pdfCopyFields21.getWriter();
        com.lowagie.text.Font font24 = null;
        com.lowagie.text.Footnote footnote25 = new com.lowagie.text.Footnote("", font24);
        com.lowagie.text.HeaderFooter headerFooter27 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote25, true);
        headerFooter27.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle30 = headerFooter27.rotate();
        com.lowagie.text.Rectangle rectangle31 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter27);
        com.lowagie.text.Document document32 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter27);
        boolean b34 = document32.setMarginMirroringTopBottom(true);
        com.lowagie.text.Font font38 = null;
        com.lowagie.text.Footnote footnote39 = new com.lowagie.text.Footnote("", font38);
        com.lowagie.text.HeaderFooter headerFooter41 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote39, true);
        headerFooter41.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph44 = headerFooter41.paragraph();
        pdfPageEventHelper18.onSection(pdfWriter22, document32, (float) 7, 262144, paragraph44);
        java.io.OutputStream outputStream46 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields48 = new com.lowagie.text.pdf.PdfCopyFields(outputStream46, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter49 = pdfCopyFields48.getWriter();
        int i50 = pdfWriter49.getCurrentPageNumber();
        com.lowagie.text.Font font52 = null;
        com.lowagie.text.Footnote footnote53 = new com.lowagie.text.Footnote("", font52);
        com.lowagie.text.HeaderFooter headerFooter55 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote53, true);
        headerFooter55.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle58 = headerFooter55.rotate();
        com.lowagie.text.Rectangle rectangle59 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter55);
        com.lowagie.text.Document document60 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter55);
        boolean b62 = document60.setMarginMirroringTopBottom(true);
        com.lowagie.text.Rectangle rectangle63 = com.lowagie.text.PageSize.A4;
        pdfPageEventHelper18.onGenericTag(pdfWriter49, document60, rectangle63, "com/lowagie/text/pdf/fonts/");
        java.io.OutputStream outputStream66 = null;
        try {
            pRStream6.toPdf(pdfWriter49, outputStream66);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(byte_array5);
        assertNotNull(byte_array12);
        assertNotNull(byte_array17);
        assertNotNull(pdfWriter22);
        assertNotNull(rectangle30);
        assertEquals(true, b34);
        assertNotNull(paragraph44);
        assertNotNull(pdfWriter49);
        assertEquals(1, i50);
        assertNotNull(rectangle58);
        assertEquals(true, b62);
        assertNotNull(rectangle63);
    }

    @Test
    void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test086");
        java.lang.String str0 = com.lowagie.text.html.Markup.CSS_KEY_PADDINGBOTTOM;
        assertEquals("padding-bottom", str0, "'" + str0 + "' != '" + "padding-bottom" + "'");
    }

    @Test
    void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test087");
        int i0 = com.lowagie.text.pdf.ExtendedColor.TYPE_SHADING;
        assertEquals(5, i0);
    }

    @Test
    void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test088");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        com.lowagie.text.pdf.PdfWriter pdfWriter7 = null;
        char[] char_array10 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font12 = new com.lowagie.text.pdf.Type3Font(pdfWriter7, char_array10, true);
        try {
            int i14 = com.lowagie.text.pdf.hyphenation.TernaryTree.strcmp(char_array3, (int) 'È', char_array10, 1565);
            fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        assertNotNull(char_array3);
        assertNotNull(char_array10);
    }

    @Test
    void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test089");
        java.util.Map<java.lang.String, com.lowagie.text.pdf.PdfName> map_str_pdfName0 = null;
        com.lowagie.text.pdf.PdfName.staticNames = map_str_pdfName0;
    }

    @Test
    void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test090");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.SPEED;
        assertNotNull(pdfName0);
    }

    @Test
    void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test091");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        com.lowagie.text.pdf.parser.PdfTextExtractor pdfTextExtractor2 = new com.lowagie.text.pdf.parser.PdfTextExtractor(pdfReader0, false);
        try {
            java.lang.String str4 = pdfTextExtractor2.getTextFromPage((int) 'a');
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test092");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.CROPBOX;
        assertNotNull(pdfName0);
    }

    @Test
    void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test093");
        java.lang.String str0 = com.lowagie.text.ElementTags.PARAGRAPH;
        assertEquals("paragraph", str0, "'" + str0 + "' != '" + "paragraph" + "'");
    }

    @Test
    void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test094");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.NAMES;
        assertNotNull(pdfName0);
    }

    @Test
    void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test095");
        int i0 = com.lowagie.text.pdf.PdfWriter.PageModeUseOC;
        assertEquals(1024, i0);
    }

    @Test
    void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test096");
        com.lowagie.text.PageSize pageSize0 = new com.lowagie.text.PageSize();
    }

    @Test
    void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test097");
        byte[] byte_array2 = com.lowagie.text.pdf.crypto.IVGenerator.getIV(0);
        try {
            java.lang.String str5 = com.lowagie.text.pdf.PdfEncodings.convertCmap("leading", byte_array2, (int) (byte) 9, 0);
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (com.lowagie.text.ExceptionConverter e) {
        }
        assertNotNull(byte_array2);
    }

    @Test
    void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test098");
        int i0 = com.lowagie.text.Element.ALIGN_CENTER;
        assertEquals(1, i0);
    }

    @Test
    void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test099");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.SEPARATION;
        assertNotNull(pdfName0);
    }

    @Test
    void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test100");
        com.lowagie.text.pdf.PdfBoolean pdfBoolean0 = com.lowagie.text.pdf.PdfBoolean.PDFFALSE;
        assertNotNull(pdfBoolean0);
    }

    @Test
    void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test101");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.AS;
        assertNotNull(pdfName0);
    }

    @Test
    void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test102");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.EXTEND;
        assertNotNull(pdfName0);
    }

    @Test
    void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test103");
        java.lang.String str0 = com.lowagie.text.xml.xmp.XmpWriter.UTF16BE;
        assertEquals("UTF-16BE", str0, "'" + str0 + "' != '" + "UTF-16BE" + "'");
    }

    @Test
    void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test104");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        float f3 = pdfPCell2.getIndent();
        float f4 = pdfPCell2.getRightIndent();
        pdfPCell2.setUseAscender(false);
        assertNotNull(pdfPCell2);
        assertEquals(0.0f, f3);
        assertEquals(0.0f, f4);
    }

    @Test
    void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test105");
        try {
            java.awt.Color color1 = com.lowagie.text.html.WebColors.getRGBColor("<?xpacket end=\"r\"?>");
            fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test106");
        byte[] byte_array2 = new byte[]{(byte) -1, (byte) 0};
        com.lowagie.text.pdf.PdfEFStream pdfEFStream3 = new com.lowagie.text.pdf.PdfEFStream(byte_array2);
        try {
            pdfEFStream3.writeLength();
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        assertNotNull(byte_array2);
    }

    @Test
    void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test107");
        int i0 = com.lowagie.text.Element.CCITTG4;
        assertEquals(256, i0);
    }

    @Test
    void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test108");
        java.lang.String str0 = com.lowagie.text.xml.xmp.XmpMMSchema.RENDITIONPARAMS;
        assertEquals("xmpMM:RenditionParams", str0, "'" + str0 + "' != '" + "xmpMM:RenditionParams" + "'");
    }

    @Test
    void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test109");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DIRECTION;
        assertNotNull(pdfName0);
    }

    @Test
    void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test110");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaObject.META_PEN;
        assertEquals(1, i0);
    }

    @Test
    void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test111");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.BASEENCODING;
        assertNotNull(pdfName0);
    }

    @Test
    void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test112");
        com.lowagie.text.pdf.collection.PdfCollectionField pdfCollectionField2 = new com.lowagie.text.pdf.collection.PdfCollectionField("ZapfDingbats", (int) '#');
        boolean b3 = pdfCollectionField2.isPages();
        assertEquals(false, b3);
    }

    @Test
    void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test113");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.FITWINDOW;
        assertNotNull(pdfName0);
    }

    @Test
    void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test114");
        com.lowagie.text.pdf.PdfSigGenericPKCS.PPKLite pPKLite1 = new com.lowagie.text.pdf.PdfSigGenericPKCS.PPKLite("COLOR");
    }

    @Test
    void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test115");
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
        com.lowagie.text.pdf.PdfReader pdfReader40 = null;
        byte[] byte_array45 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream46 = new com.lowagie.text.pdf.PRStream(pdfReader40, byte_array45);
        com.lowagie.text.pdf.PdfReader pdfReader47 = null;
        byte[] byte_array52 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream53 = new com.lowagie.text.pdf.PRStream(pdfReader47, byte_array52);
        pRStream46.setData(byte_array52, false, (int) (byte) 100);
        byte[] byte_array57 = pRStream46.getBytes();
        com.lowagie.text.pdf.PdfReader pdfReader58 = null;
        byte[] byte_array63 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream64 = new com.lowagie.text.pdf.PRStream(pdfReader58, byte_array63);
        com.lowagie.text.pdf.PdfReader pdfReader65 = null;
        byte[] byte_array70 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream71 = new com.lowagie.text.pdf.PRStream(pdfReader65, byte_array70);
        pRStream64.setData(byte_array70, false, (int) (byte) 100);
        byte[] byte_array75 = pRStream64.getBytes();
        pRStream46.setData(byte_array75);
        try {
            com.lowagie.text.pdf.PdfReader pdfReader77 = new com.lowagie.text.pdf.PdfReader(byte_array36, byte_array75);
            fail("Expected exception of type com.lowagie.text.exceptions.InvalidPdfException");
        } catch (com.lowagie.text.exceptions.InvalidPdfException e) {
        }
        assertNotNull(byte_array6);
        assertNotNull(byte_array13);
        assertNotNull(byte_array18);
        assertNotNull(byte_array24);
        assertNotNull(byte_array31);
        assertNotNull(byte_array36);
        assertNotNull(pdfName38);
        assertEquals("No message found for listitem", str39, "'" + str39 + "' != '" + "No message found for listitem" + "'");
        assertNotNull(byte_array45);
        assertNotNull(byte_array52);
        assertNotNull(byte_array57);
        assertNotNull(byte_array63);
        assertNotNull(byte_array70);
        assertNotNull(byte_array75);
    }

    @Test
    void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test116");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfWriter.PDF_VERSION_1_5;
        assertNotNull(pdfName0);
    }

    @Test
    void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test117");
        com.lowagie.text.Annotation annotation6 = new com.lowagie.text.Annotation("Times-Roman", "leading", (float) 262, (float) 8, (float) (short) 100, 10.0f);
        float f7 = annotation6.lly();
        assertEquals(8.0f, f7);
    }

    @Test
    void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test118");
        com.lowagie.text.Rectangle rectangle0 = com.lowagie.text.PageSize.LARGE_CROWN_OCTAVO;
        assertNotNull(rectangle0);
    }

    @Test
    void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test119");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DA;
        assertNotNull(pdfName0);
    }

    @Test
    void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test120");
        int i0 = com.lowagie.text.pdf.PdfAnnotation.FLAGS_INVISIBLE;
        assertEquals(1, i0);
    }

    @Test
    void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test121");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.C1;
        assertNotNull(pdfName0);
    }

    @Test
    void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test122");
        com.lowagie.text.RectangleReadOnly rectangleReadOnly4 = new com.lowagie.text.RectangleReadOnly((float) (byte) 100, (float) 1336, (float) 'Ë', (float) 9);
        try {
            rectangleReadOnly4.setLeft((float) 256);
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
    }

    @Test
    void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test123");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.RESETFORM;
        assertNotNull(pdfName0);
    }

    @Test
    void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test124");
        java.lang.String str0 = com.lowagie.text.pdf.AsianFontMapper.ChineseTraditionalEncoding_H;
        assertEquals("UniCNS-UCS2-H", str0, "'" + str0 + "' != '" + "UniCNS-UCS2-H" + "'");
    }

    @Test
    void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test125");
        com.lowagie.text.pdf.draw.DrawInterface drawInterface0 = null;
        com.lowagie.text.Chunk chunk2 = new com.lowagie.text.Chunk(drawInterface0, (float) 2368);
        com.lowagie.text.Footnote footnote3 = new com.lowagie.text.Footnote(chunk2);
        float f4 = chunk2.getCharacterSpacing();
        assertEquals(0.0f, f4);
    }

    @Test
    void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test126");
        int i0 = com.lowagie.text.pdf.parser.Vector.I1;
        assertEquals(0, i0);
    }

    @Test
    void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test127");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.GBK;
        assertNotNull(pdfName0);
    }

    @Test
    void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test128");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfWriter.PDF_VERSION_1_3;
        assertNotNull(pdfName0);
    }

    @Test
    void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test129");
        java.io.OutputStream outputStream0 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields2 = new com.lowagie.text.pdf.PdfCopyFields(outputStream0, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = pdfCopyFields2.getWriter();
        int i4 = pdfWriter3.getCurrentPageNumber();
        try {
            pdfWriter3.addJavaScript("plainwidth", false);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfWriter3);
        assertEquals(1, i4);
    }

    @Test
    void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test130");
        java.lang.String str0 = com.lowagie.text.xml.xmp.XmpMMSchema.DEFAULT_XPATH_URI;
        assertEquals("http://ns.adobe.com/xap/1.0/mm/", str0, "'" + str0 + "' != '" + "http://ns.adobe.com/xap/1.0/mm/" + "'");
    }

    @Test
    void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test131");
        com.lowagie.text.Rectangle rectangle0 = com.lowagie.text.PageSize.A9;
        assertNotNull(rectangle0);
    }

    @Test
    void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test132");
        int[] i_array1 = com.lowagie.text.pdf.GlyphList.nameToUnicode("convert2pdfp");
        assertNull(i_array1);
    }

    @Test
    void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test133");
        try {
            com.lowagie.text.ImgWMF imgWMF1 = new com.lowagie.text.ImgWMF("cellpadding");
            fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
    }

    @Test
    void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test134");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaState.OPAQUE;
        assertEquals(2, i0);
    }

    @Test
    void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test135");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TWOCOLUMNRIGHT;
        assertNotNull(pdfName0);
    }

    @Test
    void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test136");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TFOOT;
        assertNotNull(pdfName0);
    }

    @Test
    void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test137");
        com.lowagie.text.RectangleReadOnly rectangleReadOnly4 = new com.lowagie.text.RectangleReadOnly((float) (byte) 100, (float) 1336, (float) 'Ë', (float) 9);
        try {
            rectangleReadOnly4.setBorderWidthLeft(0.0f);
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
    }

    @Test
    void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test138");
        int i0 = com.lowagie.text.pdf.PdfBorderDictionary.STYLE_DASHED;
        assertEquals(1, i0);
    }

    @Test
    void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test139");
        int i0 = com.lowagie.text.pdf.BaseFont.FONT_TYPE_TTUNI;
        assertEquals(3, i0);
    }

    @Test
    void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test140");
        int i0 = com.lowagie.text.pdf.AcroFields.Item.WRITE_WIDGET;
        assertEquals(2, i0);
    }

    @Test
    void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test141");
        com.lowagie.text.RectangleReadOnly rectangleReadOnly4 = new com.lowagie.text.RectangleReadOnly((float) (byte) 100, (float) 1336, (float) 'Ë', (float) 9);
        com.lowagie.text.Font font6 = null;
        com.lowagie.text.Footnote footnote7 = new com.lowagie.text.Footnote("", font6);
        com.lowagie.text.HeaderFooter headerFooter9 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote7, true);
        headerFooter9.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle12 = headerFooter9.rotate();
        com.lowagie.text.Rectangle rectangle13 = com.lowagie.text.PageSize.PENGUIN_LARGE_PAPERBACK;
        float f14 = rectangle13.getHeight();
        rectangle12.softCloneNonPositionParameters(rectangle13);
        try {
            rectangleReadOnly4.cloneNonPositionParameters(rectangle12);
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        assertNotNull(rectangle12);
        assertNotNull(rectangle13);
        assertEquals(561.0f, f14);
    }

    @Test
    void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test142");
        byte[] byte_array1 = com.lowagie.text.pdf.crypto.IVGenerator.getIV(0);
        com.lowagie.text.pdf.PRTokeniser pRTokeniser2 = new com.lowagie.text.pdf.PRTokeniser(byte_array1);
        int i3 = pRTokeniser2.length();
        try {
            int i4 = pRTokeniser2.getStartxref();
            fail("Expected exception of type com.lowagie.text.exceptions.InvalidPdfException");
        } catch (com.lowagie.text.exceptions.InvalidPdfException e) {
        }
        assertNotNull(byte_array1);
        assertEquals(0, i3);
    }

    @Test
    void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test143");
        com.lowagie.text.Rectangle rectangle0 = com.lowagie.text.PageSize.A6;
        assertNotNull(rectangle0);
    }

    @Test
    void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test144");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.CREATOR;
        assertNotNull(pdfName0);
    }

    @Test
    void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test145");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.EVENT;
        assertNotNull(pdfName0);
    }

    @Test
    void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test146");
        java.security.cert.Certificate certificate0 = null;
        com.lowagie.text.pdf.PdfPublicKeyRecipient pdfPublicKeyRecipient2 = new com.lowagie.text.pdf.PdfPublicKeyRecipient(certificate0, 1651532643);
    }

    @Test
    void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test147");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfWriter.PDF_VERSION_1_6;
        assertNotNull(pdfName0);
    }

    @Test
    void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test148");
        java.lang.String str0 = com.lowagie.text.Chunk.GENERICTAG;
        assertEquals("GENERICTAG", str0, "'" + str0 + "' != '" + "GENERICTAG" + "'");
    }

    @Test
    void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test149");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.C0;
        assertNotNull(pdfName0);
    }

    @Test
    void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test150");
        com.lowagie.text.xml.xmp.XmpArray xmpArray1 = new com.lowagie.text.xml.xmp.XmpArray("false");
        try {
            java.lang.String str4 = xmpArray1.set((int) (short) 1, "italic");
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
    }

    @Test
    void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test151");
        int i0 = com.lowagie.text.pdf.PdfFormField.MK_CAPTION_OVERLAID;
        assertEquals(6, i0);
    }

    @Test
    void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test152");
        int i0 = com.lowagie.text.pdf.BarcodeDatamatrix.DM_TEST;
        assertEquals(64, i0);
    }

    @Test
    void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test153");
        java.lang.String str0 = com.lowagie.text.ElementTags.LETTERED;
        assertEquals("lettered", str0, "'" + str0 + "' != '" + "lettered" + "'");
    }

    @Test
    void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test154");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_SCALEVIEWPORTEXT;
        assertEquals(1042, i0);
    }

    @Test
    void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test155");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.FIRST;
        assertNotNull(pdfName0);
    }

    @Test
    void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test156");
        int i0 = com.lowagie.text.pdf.internal.PdfXConformanceImp.PDFXKEY_LAYER;
        assertEquals(7, i0);
    }

    @Test
    void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test157");
        int i0 = com.lowagie.text.pdf.PdfSignatureAppearance.SignatureRenderDescription;
        assertEquals(0, i0);
    }

    @Test
    void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test158");
        int i0 = com.lowagie.text.pdf.BaseField.VISIBLE;
        assertEquals(0, i0);
    }

    @Test
    void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test159");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PS;
        assertNotNull(pdfName0);
    }

    @Test
    void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test160");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.MEDIABOX;
        assertNotNull(pdfName0);
    }

    @Test
    void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test161");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.LIMITS;
        assertNotNull(pdfName0);
    }

    @Test
    void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test162");
        com.lowagie.text.Annotation annotation8 = new com.lowagie.text.Annotation((float) '4', (float) 1, (float) '4', (float) 29, "listitem", "absolutey", "hi!", "ZapfDingbats");
        float f9 = annotation8.ury();
        float f11 = annotation8.llx((float) 6);
        int i12 = annotation8.annotationType();
        float f14 = annotation8.lly((float) 224);
        assertEquals(29.0f, f9);
        assertEquals(52.0f, f11);
        assertEquals(6, i12);
        assertEquals(1.0f, f14);
    }

    @Test
    void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test163");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.GOTOE;
        assertNotNull(pdfName0);
    }

    @Test
    void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test164");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PDFDOCENCODING;
        assertNotNull(pdfName0);
    }

    @Test
    void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test165");
        java.lang.String str0 = com.lowagie.text.xml.xmp.XmpArray.ALTERNATIVE;
        assertEquals("rdf:Alt", str0, "'" + str0 + "' != '" + "rdf:Alt" + "'");
    }

    @Test
    void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test166");
        byte[] byte_array7 = null;
        com.lowagie.text.pdf.PdfReader pdfReader8 = null;
        byte[] byte_array13 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream14 = new com.lowagie.text.pdf.PRStream(pdfReader8, byte_array13);
        com.lowagie.text.pdf.PdfReader pdfReader15 = null;
        byte[] byte_array20 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream21 = new com.lowagie.text.pdf.PRStream(pdfReader15, byte_array20);
        pRStream14.setData(byte_array20, false, (int) (byte) 100);
        com.lowagie.text.ImgJBIG2 imgJBIG2_25 = new com.lowagie.text.ImgJBIG2(4, 1564, byte_array7, byte_array20);
        try {
            com.lowagie.text.Image image26 = com.lowagie.text.Image.getInstance((int) (short) 1, 53, false, 32, 4, byte_array7);
            fail("Expected exception of type com.lowagie.text.BadElementException");
        } catch (com.lowagie.text.BadElementException e) {
        }
        assertNotNull(byte_array13);
        assertNotNull(byte_array20);
    }

    @Test
    void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test167");
        int i0 = com.lowagie.text.pdf.PdfFormField.FF_PASSWORD;
        assertEquals(8192, i0);
    }

    @Test
    void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test168");
        java.util.Hashtable hashtable0 = null;
        java.util.Set set1 = com.lowagie.text.Utilities.getKeySet(hashtable0);
        assertNotNull(set1);
    }

    @Test
    void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test169");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.RICHMEDIACONFIGURATION;
        assertNotNull(pdfName0);
    }

    @Test
    void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test170");
        com.lowagie.text.pdf.PdfReader pdfReader5 = null;
        byte[] byte_array10 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream11 = new com.lowagie.text.pdf.PRStream(pdfReader5, byte_array10);
        com.lowagie.text.pdf.PdfReader pdfReader12 = null;
        byte[] byte_array17 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream18 = new com.lowagie.text.pdf.PRStream(pdfReader12, byte_array17);
        pRStream11.setData(byte_array17, false, (int) (byte) 100);
        try {
            com.lowagie.text.ImgCCITT imgCCITT22 = new com.lowagie.text.ImgCCITT((int) (short) 2660, (int) (byte) 47, false, (int) (short) 10, 301, byte_array17);
            fail("Expected exception of type com.lowagie.text.BadElementException");
        } catch (com.lowagie.text.BadElementException e) {
        }
        assertNotNull(byte_array10);
        assertNotNull(byte_array17);
    }

    @Test
    void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test171");
        com.lowagie.text.pdf.collection.PdfCollectionSort pdfCollectionSort1 = new com.lowagie.text.pdf.collection.PdfCollectionSort("Helvetica-Oblique");
    }

    @Test
    void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test172");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.USERPROPERTIES;
        assertNotNull(pdfName0);
    }

    @Test
    void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test173");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PLAYCOUNT;
        assertNotNull(pdfName0);
    }

    @Test
    void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test174");
        java.lang.String str0 = com.lowagie.text.html.Markup.CSS_KEY_BGCOLOR;
        assertEquals("background-color", str0, "'" + str0 + "' != '" + "background-color" + "'");
    }

    @Test
    void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test175");
        com.lowagie.text.pdf.collection.PdfTargetDictionary pdfTargetDictionary0 = null;
        com.lowagie.text.pdf.collection.PdfTargetDictionary pdfTargetDictionary1 = new com.lowagie.text.pdf.collection.PdfTargetDictionary(pdfTargetDictionary0);
    }

    @Test
    void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test176");
        com.lowagie.text.Paragraph paragraph0 = null;
        com.lowagie.text.Chapter chapter2 = new com.lowagie.text.Chapter(paragraph0, 1785737760);
        java.util.Collection collection3 = null;
        try {
            boolean b4 = chapter2.addAll(collection3);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test177");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.H4;
        assertNotNull(pdfName0);
    }

    @Test
    void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test178");
        com.lowagie.text.pdf.PdfDashPattern pdfDashPattern2 = new com.lowagie.text.pdf.PdfDashPattern((float) 0L, (float) 8);
        try {
            com.lowagie.text.pdf.PdfString pdfString4 = pdfDashPattern2.getAsString(24);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
    }

    @Test
    void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test179");
        int i0 = com.lowagie.text.pdf.Barcode.CODABAR;
        assertEquals(12, i0);
    }

    @Test
    void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test180");
        int i0 = com.lowagie.text.pdf.PdfWriter.PageLayoutTwoPageRight;
        assertEquals(32, i0);
    }

    @Test
    void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test181");
        java.io.OutputStream outputStream0 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields2 = new com.lowagie.text.pdf.PdfCopyFields(outputStream0, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = pdfCopyFields2.getWriter();
        int i4 = pdfWriter3.getCurrentPageNumber();
        com.lowagie.text.Chapter chapter6 = new com.lowagie.text.Chapter((int) (short) -1);
        pdfWriter3.setOutlines((java.util.List) chapter6);
        com.lowagie.text.pdf.PdfIndirectReference pdfIndirectReference8 = null;
        com.lowagie.text.xml.xmp.XmpArray xmpArray10 = new com.lowagie.text.xml.xmp.XmpArray("false");
        java.util.Spliterator<java.lang.String> spliterator_str11 = xmpArray10.spliterator();
        try {
            java.lang.Object[] obj_array13 = com.lowagie.text.pdf.SimpleBookmark.iterateOutlines(pdfWriter3, pdfIndirectReference8, (java.util.List) xmpArray10, true);
            fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        assertNotNull(pdfWriter3);
        assertEquals(1, i4);
        assertNotNull(spliterator_str11);
    }

    @Test
    void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test182");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DECODEPARMS;
        int i1 = pdfName0.type();
        assertNotNull(pdfName0);
        assertEquals(4, i1);
    }

    @Test
    void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test183");
        int i0 = com.lowagie.text.pdf.PdfContentByte.ALIGN_LEFT;
        assertEquals(0, i0);
    }

    @Test
    void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test184");
        int i0 = com.lowagie.text.Image.ORIGINAL_JPEG2000;
        assertEquals(8, i0);
    }

    @Test
    void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test185");
        java.lang.String str1 = com.lowagie.text.pdf.PdfEncryptor.getPermissionsVerbose(32);
        assertEquals("Allowed: Modify annotations", str1, "'" + str1 + "' != '" + "Allowed: Modify annotations" + "'");
    }

    @Test
    void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test186");
        int i0 = com.lowagie.text.Rectangle.UNDEFINED;
        assertEquals(i0, (-1));
    }

    @Test
    void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test187");
        int i0 = com.lowagie.text.pdf.PdfFormField.FF_MULTISELECT;
        assertEquals(2097152, i0);
    }

    @Test
    void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test188");
        com.lowagie.text.pdf.PdfRectangle pdfRectangle5 = new com.lowagie.text.pdf.PdfRectangle((float) 15, (float) 259, (float) 1L, (float) 10L, (int) (byte) 1);
        java.lang.String str6 = pdfRectangle5.toString();
        assertEquals("[15, 259, 1, 10]", str6, "'" + str6 + "' != '" + "[15, 259, 1, 10]" + "'");
    }

    @Test
    void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test189");
        com.lowagie.text.Font font5 = com.lowagie.text.FontFactory.getFont("top", "absolutex", (float) (-1), 6);
        com.lowagie.text.Chunk chunk6 = com.lowagie.text.SpecialSymbol.get(' ', font5);
        java.lang.String str7 = chunk6.toString();
        assertNotNull(font5);
        assertNotNull(chunk6);
        assertEquals(" ", str7, "'" + str7 + "' != '" + " " + "'");
    }

    @Test
    void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test190");
        java.net.URL uRL0 = null;
        try {
            com.lowagie.text.Image image1 = com.lowagie.text.ImageLoader.getPngImage(uRL0);
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (com.lowagie.text.ExceptionConverter e) {
        }
    }

    @Test
    void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test191");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Cell cell5 = com.lowagie.text.factories.ElementFactory.getCell(properties1);
        java.io.PrintStream printStream6 = null;
        try {
            properties1.list(printStream6);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(cell5);
    }

    @Test
    void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test192");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.RICHMEDIADEACTIVATION;
        assertNotNull(pdfName0);
    }

    @Test
    void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test193");
        int i0 = com.lowagie.text.pdf.PdfTransition.SPLITVOUT;
        assertEquals(1, i0);
    }

    @Test
    void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test194");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        java.lang.String[][] str_array_array6 = type3Font5.getAllNameEntries();
        int i8 = type3Font5.getUnicodeEquivalent(128);
        try {
            int i10 = type3Font5.getWidth((int) 'Ë');
            fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        assertNotNull(char_array3);
        assertNotNull(str_array_array6);
        assertEquals(128, i8);
    }

    @Test
    void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test195");
        java.lang.String str0 = com.lowagie.text.html.Markup.CSS_KEY_LINEHEIGHT;
        assertEquals("line-height", str0, "'" + str0 + "' != '" + "line-height" + "'");
    }

    @Test
    void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test196");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_ANIMATEPALETTE;
        assertEquals(1078, i0);
    }

    @Test
    void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test197");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.MCID;
        assertNotNull(pdfName0);
    }

    @Test
    void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test198");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ADBE_PKCS7_SHA1;
        assertNotNull(pdfName0);
    }

    @Test
    void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test199");
        java.lang.String str0 = com.lowagie.text.ElementTags.DEFAULTDIR;
        assertEquals("defaultdir", str0, "'" + str0 + "' != '" + "defaultdir" + "'");
    }

    @Test
    void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test200");
        java.lang.String str1 = com.lowagie.text.Utilities.convertFromUtf32(256);
        assertEquals("Ā", str1, "'" + str1 + "' != '" + "Ā" + "'");
    }

    @Test
    void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test201");
        com.lowagie.text.xml.simpleparser.EntitiesToSymbol entitiesToSymbol0 = new com.lowagie.text.xml.simpleparser.EntitiesToSymbol();
    }

    @Test
    void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test202");
        com.lowagie.text.Chunk chunk0 = new com.lowagie.text.Chunk();
        com.lowagie.text.Image image1 = chunk0.getImage();
        float f2 = chunk0.getCharacterSpacing();
        java.lang.String[] str_array15 = new java.lang.String[]{"dc:date", "Identity-V", "convert2pdfp", "widths", "class", "", "Right", "xmp:ModifyDate", "Right", "UnicodeBig"};
        java.util.ArrayList<java.lang.String> arraylist_str16 = new java.util.ArrayList<java.lang.String>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str16, str_array15);
        com.lowagie.text.pdf.PdfReader pdfReader18 = null;
        byte[] byte_array23 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream24 = new com.lowagie.text.pdf.PRStream(pdfReader18, byte_array23);
        com.lowagie.text.pdf.PdfReader pdfReader25 = null;
        byte[] byte_array30 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream31 = new com.lowagie.text.pdf.PRStream(pdfReader25, byte_array30);
        pRStream24.setData(byte_array30, false, (int) (byte) 100);
        java.lang.String str35 = pRStream24.toString();
        boolean b36 = arraylist_str16.contains((java.lang.Object) str35);
        com.lowagie.text.pdf.BaseFont baseFont37 = null;
        com.lowagie.text.Font font40 = new com.lowagie.text.Font(baseFont37, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont42 = font40.getCalculatedBaseFont(false);
        boolean b45 = baseFont42.setCharAdvance(9, 0);
        java.awt.Color color51 = java.awt.Color.getHSBColor(100.0f, (float) (short) 1, 100.0f);
        int i52 = com.lowagie.text.pdf.ExtendedColor.getType(color51);
        com.lowagie.text.Font font53 = new com.lowagie.text.Font(baseFont42, (float) (-1), (int) 'Ã', color51);
        int i54 = arraylist_str16.indexOf((java.lang.Object) color51);
        com.lowagie.text.pdf.PdfArray pdfArray55 = com.lowagie.text.pdf.PdfAnnotation.getMKColor(color51);
        com.lowagie.text.Chunk chunk56 = chunk0.setTextRenderMode((int) 'Æ', (float) (-1), color51);
        assertNull(image1);
        assertEquals(0.0f, f2);
        assertNotNull(str_array15);
        assertEquals(true, b17);
        assertNotNull(byte_array23);
        assertNotNull(byte_array30);
        assertEquals("Stream", str35, "'" + str35 + "' != '" + "Stream" + "'");
        assertEquals(false, b36);
        assertNotNull(baseFont42);
        assertEquals(true, b45);
        assertNotNull(color51);
        assertEquals(0, i52);
        assertEquals(i54, (-1));
        assertNotNull(pdfArray55);
        assertNotNull(chunk56);
    }

    @Test
    void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test203");
        java.lang.String str0 = com.lowagie.text.xml.xmp.XmpWriter.XPACKET_PI_BEGIN;
        assertEquals("<?xpacket begin=\"﻿\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?>\n", str0, "'" + str0 + "' != '" + "<?xpacket begin=\"﻿\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?>\n" + "'");
    }

    @Test
    void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test204");
        int i0 = com.lowagie.text.pdf.PdfContentByte.LINE_JOIN_ROUND;
        assertEquals(1, i0);
    }

    @Test
    void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test205");
        com.lowagie.text.Rectangle rectangle0 = com.lowagie.text.PageSize.PENGUIN_LARGE_PAPERBACK;
        try {
            rectangle0.setBorder((int) (short) -1);
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        assertNotNull(rectangle0);
    }

    @Test
    void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test206");
        java.awt.Color color0 = java.awt.Color.green;
        assertNotNull(color0);
    }

    @Test
    void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test207");
        char[] char_array2 = new char[]{'c', 'È'};
        com.lowagie.text.pdf.PdfWriter pdfWriter4 = null;
        char[] char_array7 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font9 = new com.lowagie.text.pdf.Type3Font(pdfWriter4, char_array7, true);
        try {
            com.lowagie.text.pdf.hyphenation.TernaryTree.strcpy(char_array2, (int) '翿', char_array7, 4096);
            fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        assertNotNull(char_array2);
        assertNotNull(char_array7);
    }

    @Test
    void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test208");
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
        com.lowagie.text.Font font36 = null;
        com.lowagie.text.Footnote footnote37 = new com.lowagie.text.Footnote("", font36);
        com.lowagie.text.HeaderFooter headerFooter39 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote37, true);
        headerFooter39.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle42 = headerFooter39.rotate();
        com.lowagie.text.pdf.PdfName pdfName43 = com.lowagie.text.pdf.PdfName.MAX_CAMEL_CASE;
        com.lowagie.text.pdf.PdfDestination pdfDestination47 = new com.lowagie.text.pdf.PdfDestination((int) (byte) 47, (float) 1);
        try {
            com.lowagie.text.pdf.PdfAnnotation pdfAnnotation48 = com.lowagie.text.pdf.PdfAnnotation.createLink(pdfWriter4, (com.lowagie.text.Rectangle) headerFooter39, pdfName43, 50, pdfDestination47);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertNotNull(rectangle42);
        assertNotNull(pdfName43);
    }

    @Test
    void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test209");
        int i0 = com.lowagie.text.Annotation.LAUNCH;
        assertEquals(6, i0);
    }

    @Test
    void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test210");
        java.lang.String str0 = com.lowagie.text.html.Markup.CSS_KEY_VISIBILITY;
        assertEquals("visibility", str0, "'" + str0 + "' != '" + "visibility" + "'");
    }

    @Test
    void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test211");
        int i0 = com.lowagie.text.Element.AUTHOR;
        assertEquals(4, i0);
    }

    @Test
    void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test212");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        try {
            com.lowagie.text.pdf.PdfObject pdfObject1 = com.lowagie.text.pdf.XfaForm.getXfaObject(pdfReader0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test213");
        int i0 = com.lowagie.text.pdf.internal.PdfXConformanceImp.PDFXKEY_FONT;
        assertEquals(4, i0);
    }

    @Test
    void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test214");
        java.lang.String[] str_array10 = new java.lang.String[]{"dc:date", "Identity-V", "convert2pdfp", "widths", "class", "", "Right", "xmp:ModifyDate", "Right", "UnicodeBig"};
        java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str11, str_array10);
        com.lowagie.text.pdf.PdfReader pdfReader13 = null;
        byte[] byte_array18 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream19 = new com.lowagie.text.pdf.PRStream(pdfReader13, byte_array18);
        com.lowagie.text.pdf.PdfReader pdfReader20 = null;
        byte[] byte_array25 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream26 = new com.lowagie.text.pdf.PRStream(pdfReader20, byte_array25);
        pRStream19.setData(byte_array25, false, (int) (byte) 100);
        java.lang.String str30 = pRStream19.toString();
        boolean b31 = arraylist_str11.contains((java.lang.Object) str30);
        com.lowagie.text.pdf.BaseFont baseFont32 = null;
        com.lowagie.text.Font font35 = new com.lowagie.text.Font(baseFont32, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont37 = font35.getCalculatedBaseFont(false);
        boolean b40 = baseFont37.setCharAdvance(9, 0);
        java.awt.Color color46 = java.awt.Color.getHSBColor(100.0f, (float) (short) 1, 100.0f);
        int i47 = com.lowagie.text.pdf.ExtendedColor.getType(color46);
        com.lowagie.text.Font font48 = new com.lowagie.text.Font(baseFont37, (float) (-1), (int) 'Ã', color46);
        int i49 = arraylist_str11.indexOf((java.lang.Object) color46);
        com.lowagie.text.pdf.PdfArray pdfArray50 = com.lowagie.text.pdf.PdfAnnotation.getMKColor(color46);
        com.lowagie.text.pdf.PdfName pdfName51 = com.lowagie.text.pdf.PdfName.FFILTER;
        boolean b52 = pdfArray50.add((com.lowagie.text.pdf.PdfObject) pdfName51);
        assertNotNull(str_array10);
        assertEquals(true, b12);
        assertNotNull(byte_array18);
        assertNotNull(byte_array25);
        assertEquals("Stream", str30, "'" + str30 + "' != '" + "Stream" + "'");
        assertEquals(false, b31);
        assertNotNull(baseFont37);
        assertEquals(true, b40);
        assertNotNull(color46);
        assertEquals(0, i47);
        assertEquals(i49, (-1));
        assertNotNull(pdfArray50);
        assertNotNull(pdfName51);
        assertEquals(true, b52);
    }

    @Test
    void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test215");
        int i0 = com.lowagie.text.pdf.PdfFormField.MK_CAPTION_ABOVE;
        assertEquals(3, i0);
    }

    @Test
    void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test216");
        com.lowagie.text.xml.simpleparser.SimpleXMLDocHandler simpleXMLDocHandler0 = null;
        java.io.InputStream inputStream1 = null;
        try {
            com.lowagie.text.xml.simpleparser.SimpleXMLParser.parse(simpleXMLDocHandler0, inputStream1);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test217");
        com.lowagie.text.Font font1 = null;
        com.lowagie.text.Footnote footnote2 = new com.lowagie.text.Footnote("", font1);
        com.lowagie.text.HeaderFooter headerFooter4 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote2, true);
        headerFooter4.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph7 = headerFooter4.paragraph();
        float f8 = paragraph7.getIndentationLeft();
        assertNotNull(paragraph7);
        assertEquals(0.0f, f8);
    }

    @Test
    void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test218");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.RICHMEDIAPRESENTATION;
        assertNotNull(pdfName0);
    }

    @Test
    void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test219");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.XD;
        assertNotNull(pdfName0);
    }

    @Test
    void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test220");
        java.lang.String str0 = com.lowagie.text.html.Markup.ITEXT_TAG;
        assertEquals("tag", str0, "'" + str0 + "' != '" + "tag" + "'");
    }

    @Test
    void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test221");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfGState.BM_OVERLAY;
        assertNotNull(pdfName0);
    }

    @Test
    void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test222");
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
        com.lowagie.text.Section section19 = chapterAutoNumber8.addSection("Identity-V");
        int i20 = section19.type();
        assertNotNull(paragraph7);
        assertNotNull(paragraph16);
        assertNotNull(section17);
        assertNotNull(section19);
        assertEquals(13, i20);
    }

    @Test
    void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test223");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.BL;
        assertNotNull(pdfName0);
    }

    @Test
    void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test224");
        org.w3c.dom.Node node0 = null;
        java.lang.String str1 = com.lowagie.text.pdf.XfaForm.getNodeText(node0);
        assertEquals("", str1, "'" + str1 + "' != '" + "" + "'");
    }

    @Test
    void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test225");
        try {
            java.awt.Color color1 = java.awt.Color.decode("application");
            fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test226");
        com.lowagie.text.pdf.PdfString pdfString1 = new com.lowagie.text.pdf.PdfString("text-align");
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper2 = new com.lowagie.text.pdf.PdfPageEventHelper();
        java.io.OutputStream outputStream3 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields5 = new com.lowagie.text.pdf.PdfCopyFields(outputStream3, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter6 = pdfCopyFields5.getWriter();
        com.lowagie.text.Font font8 = null;
        com.lowagie.text.Footnote footnote9 = new com.lowagie.text.Footnote("", font8);
        com.lowagie.text.HeaderFooter headerFooter11 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote9, true);
        headerFooter11.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle14 = headerFooter11.rotate();
        com.lowagie.text.Rectangle rectangle15 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter11);
        com.lowagie.text.Document document16 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter11);
        boolean b18 = document16.setMarginMirroringTopBottom(true);
        com.lowagie.text.Font font22 = null;
        com.lowagie.text.Footnote footnote23 = new com.lowagie.text.Footnote("", font22);
        com.lowagie.text.HeaderFooter headerFooter25 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote23, true);
        headerFooter25.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph28 = headerFooter25.paragraph();
        pdfPageEventHelper2.onSection(pdfWriter6, document16, (float) 7, 262144, paragraph28);
        pdfWriter6.setStrictImageSequence(false);
        pdfWriter6.setEncryption(false, "true", "bottom", 1336);
        com.lowagie.text.pdf.PdfName pdfName37 = com.lowagie.text.pdf.PdfName.NONE;
        com.lowagie.text.pdf.PdfName pdfName38 = com.lowagie.text.pdf.PdfName.XREF;
        pdfWriter6.setDefaultColorspace(pdfName37, (com.lowagie.text.pdf.PdfObject) pdfName38);
        java.io.OutputStream outputStream40 = null;
        try {
            pdfString1.toPdf(pdfWriter6, outputStream40);
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (com.lowagie.text.ExceptionConverter e) {
        }
        assertNotNull(pdfWriter6);
        assertNotNull(rectangle14);
        assertEquals(true, b18);
        assertNotNull(paragraph28);
        assertNotNull(pdfName37);
        assertNotNull(pdfName38);
    }

    @Test
    void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test227");
        boolean b1 = com.lowagie.text.pdf.PdfEncryptor.isPrintingAllowed(1024);
        assertEquals(false, b1);
    }

    @Test
    void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test228");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Cell cell5 = com.lowagie.text.factories.ElementFactory.getCell(properties1);
        cell5.setMaxLines(50);
        try {
            cell5.setBottom(247);
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(cell5);
    }

    @Test
    void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test229");
        com.lowagie.text.Phrase phrase0 = new com.lowagie.text.Phrase();
        com.lowagie.text.ListItem listItem1 = new com.lowagie.text.ListItem(phrase0);
    }

    @Test
    void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test230");
        int i0 = com.lowagie.text.pdf.PdfFormField.MK_CAPTION_RIGHT;
        assertEquals(4, i0);
    }

    @Test
    void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test231");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.REGISTRYNAME;
        assertNotNull(pdfName0);
    }

    @Test
    void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test232");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaState.WINDING;
        assertEquals(2, i0);
    }

    @Test
    void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test233");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        float f3 = pdfPCell2.getIndent();
        com.lowagie.text.pdf.PdfPTable pdfPTable4 = pdfPCell2.getTable();
        pdfPCell2.setHorizontalAlignment(0);
        assertNotNull(pdfPCell2);
        assertEquals(0.0f, f3);
        assertNull(pdfPTable4);
    }

    @Test
    void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test234");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.IRT;
        assertNotNull(pdfName0);
    }

    @Test
    void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test235");
        byte[] byte_array2 = new byte[]{(byte) 100, (byte) 10};
        com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray3 = new com.lowagie.text.pdf.RandomAccessFileOrArray(byte_array2);
        try {
            com.lowagie.text.Image image4 = com.lowagie.text.ImageLoader.getGifImage(byte_array2);
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (com.lowagie.text.ExceptionConverter e) {
        }
        assertNotNull(byte_array2);
    }

    @Test
    void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test236");
        com.lowagie.text.pdf.GlyphList glyphList0 = new com.lowagie.text.pdf.GlyphList();
    }

    @Test
    void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test237");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.QUOTE;
        assertNotNull(pdfName0);
    }

    @Test
    void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test238");
        java.lang.String str1 = com.lowagie.text.xml.simpleparser.EntitiesToUnicode.decodeString("visibility");
        assertEquals("visibility", str1, "'" + str1 + "' != '" + "visibility" + "'");
    }

    @Test
    void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test239");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.CONTENT;
        assertNotNull(pdfName0);
    }

    @Test
    void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test240");
        int i0 = com.lowagie.text.pdf.BaseFont.AWT_LEADING;
        assertEquals(11, i0);
    }

    @Test
    void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test241");
        float f0 = com.lowagie.text.pdf.PdfWriter.SPACE_CHAR_RATIO_DEFAULT;
        assertEquals(2.5f, f0);
    }

    @Test
    void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test242");
        com.lowagie.text.Font font1 = null;
        com.lowagie.text.Footnote footnote2 = new com.lowagie.text.Footnote("", font1);
        com.lowagie.text.HeaderFooter headerFooter4 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote2, true);
        headerFooter4.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle7 = headerFooter4.rotate();
        com.lowagie.text.Rectangle rectangle8 = com.lowagie.text.PageSize.PENGUIN_LARGE_PAPERBACK;
        float f9 = rectangle8.getHeight();
        rectangle7.softCloneNonPositionParameters(rectangle8);
        boolean b11 = rectangle7.isUseVariableBorders();
        assertNotNull(rectangle7);
        assertNotNull(rectangle8);
        assertEquals(561.0f, f9);
        assertEquals(false, b11);
    }

    @Test
    void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test243");
        int i0 = com.lowagie.text.pdf.BaseField.FILE_SELECTION;
        assertEquals(1048576, i0);
    }

    @Test
    void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test244");
        byte[] byte_array2 = new byte[]{(byte) 100, (byte) 10};
        com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray3 = new com.lowagie.text.pdf.RandomAccessFileOrArray(byte_array2);
        randomAccessFileOrArray3.seek(804);
        byte[] byte_array7 = com.lowagie.text.pdf.crypto.IVGenerator.getIV(0);
        com.lowagie.text.pdf.PRTokeniser pRTokeniser8 = new com.lowagie.text.pdf.PRTokeniser(byte_array7);
        try {
            com.lowagie.text.pdf.PdfReader pdfReader9 = new com.lowagie.text.pdf.PdfReader(randomAccessFileOrArray3, byte_array7);
            fail("Expected exception of type com.lowagie.text.exceptions.InvalidPdfException");
        } catch (com.lowagie.text.exceptions.InvalidPdfException e) {
        }
        assertNotNull(byte_array2);
        assertNotNull(byte_array7);
    }

    @Test
    void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test245");
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
        com.lowagie.text.Font font29 = null;
        com.lowagie.text.Footnote footnote30 = new com.lowagie.text.Footnote("", font29);
        com.lowagie.text.HeaderFooter headerFooter32 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote30, true);
        headerFooter32.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle35 = headerFooter32.rotate();
        com.lowagie.text.Rectangle rectangle36 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter32);
        com.lowagie.text.Document document37 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter32);
        com.lowagie.text.pdf.PdfName pdfName38 = com.lowagie.text.pdf.PdfName.TIME;
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation40 = com.lowagie.text.pdf.PdfAnnotation.createLink(pdfWriter4, (com.lowagie.text.Rectangle) headerFooter32, pdfName38, "<?xpacket end=\"r\"?>");
        try {
            com.lowagie.text.pdf.PdfLayerMembership pdfLayerMembership41 = new com.lowagie.text.pdf.PdfLayerMembership(pdfWriter4);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertNotNull(rectangle35);
        assertNotNull(pdfName38);
        assertNotNull(pdfAnnotation40);
    }

    @Test
    void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test246");
        java.lang.String str0 = com.lowagie.text.ElementTags.ENTITY;
        assertEquals("entity", str0, "'" + str0 + "' != '" + "entity" + "'");
    }

    @Test
    void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test247");
        int i0 = com.lowagie.text.pdf.PdfWriter.PageModeUseThumbs;
        assertEquals(256, i0);
    }

    @Test
    void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test248");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.HIDEWINDOWUI;
        assertNotNull(pdfName0);
    }

    @Test
    void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test249");
        java.security.cert.X509Certificate x509Certificate0 = null;
        try {
            com.lowagie.text.pdf.PdfPKCS7.X509Name x509Name1 = com.lowagie.text.pdf.PdfPKCS7.getSubjectFields(x509Certificate0);
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (com.lowagie.text.ExceptionConverter e) {
        }
    }

    @Test
    void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test250");
        int i0 = com.lowagie.text.pdf.PdfTransition.DISSOLVE;
        assertEquals(13, i0);
    }

    @Test
    void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test251");
        java.lang.String str1 = com.lowagie.text.pdf.PdfPKCS7.getAlgorithm("dc:relation");
        assertEquals("dc:relation", str1, "'" + str1 + "' != '" + "dc:relation" + "'");
    }

    @Test
    void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test252");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.LENGTH1;
        assertNotNull(pdfName0);
    }

    @Test
    void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test253");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfAnnotation.AA_EXIT;
        assertNotNull(pdfName0);
    }

    @Test
    void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test254");
        boolean b1 = com.lowagie.text.pdf.PdfEncodings.isPdfDocEncoding("class");
        assertEquals(true, b1);
    }

    @Test
    void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test255");
        java.lang.String str0 = com.lowagie.text.pdf.BaseFont.TIMES_ITALIC;
        assertEquals("Times-Italic", str0, "'" + str0 + "' != '" + "Times-Italic" + "'");
    }

    @Test
    void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test256");
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
        boolean b17 = pdfXConformanceImp0.isPdfA1();
        assertNotNull(rectangle9);
        assertNotNull(f_array14);
        assertNotNull(pdfAnnotation15);
        assertEquals(false, b17);
    }

    @Test
    void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test257");
        char char0 = com.lowagie.text.pdf.Barcode128.CODE_AC_TO_B;
        assertEquals('d', char0);
    }

    @Test
    void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test258");
        java.lang.String str0 = com.lowagie.text.Chunk.LOCALGOTO;
        assertEquals("LOCALGOTO", str0, "'" + str0 + "' != '" + "LOCALGOTO" + "'");
    }

    @Test
    void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test259");
        com.lowagie.text.pdf.PdfContentByte pdfContentByte0 = null;
        try {
            com.lowagie.text.pdf.PdfGraphics2D pdfGraphics2D3 = new com.lowagie.text.pdf.PdfGraphics2D(pdfContentByte0, (float) 1, (float) (byte) 60);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test260");
        java.lang.String str0 = com.lowagie.text.html.Markup.HTML_ATTR_CSS_ID;
        assertEquals("id", str0, "'" + str0 + "' != '" + "id" + "'");
    }

    @Test
    void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test261");
        java.lang.String str0 = com.lowagie.text.Chunk.HYPHENATION;
        assertEquals("HYPHENATION", str0, "'" + str0 + "' != '" + "HYPHENATION" + "'");
    }

    @Test
    void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test262");
        int i1 = com.lowagie.text.SpecialSymbol.index("line-height");
        assertEquals(i1, (-1));
    }

    @Test
    void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test263");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TWOPAGERIGHT;
        assertNotNull(pdfName0);
    }

    @Test
    void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test264");
        java.util.HashMap hashMap0 = com.lowagie.text.xml.simpleparser.EntitiesToSymbol.map;
        com.lowagie.text.pdf.PdfWriter pdfWriter1 = null;
        com.lowagie.text.pdf.PdfDictionary pdfDictionary2 = com.lowagie.text.pdf.SimpleNamedDestination.outputNamedDestinationAsNames(hashMap0, pdfWriter1);
        com.lowagie.text.pdf.PdfName pdfName3 = null;
        com.lowagie.text.pdf.PdfNumber pdfNumber4 = pdfDictionary2.getAsNumber(pdfName3);
        assertNotNull(hashMap0);
        assertNotNull(pdfDictionary2);
        assertNull(pdfNumber4);
    }

    @Test
    void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test265");
        java.lang.String str0 = com.lowagie.text.ElementTags.TABLE;
        assertEquals("table", str0, "'" + str0 + "' != '" + "table" + "'");
    }

    @Test
    void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test266");
        com.lowagie.text.pdf.XfaForm xfaForm0 = new com.lowagie.text.pdf.XfaForm();
        com.lowagie.text.pdf.XfaForm.AcroFieldsSearch acroFieldsSearch1 = null;
        xfaForm0.setAcroFieldsSom(acroFieldsSearch1);
        com.lowagie.text.pdf.PdfReader pdfReader3 = null;
        xfaForm0.setReader(pdfReader3);
    }

    @Test
    void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test267");
        byte[] byte_array1 = com.lowagie.text.pdf.crypto.IVGenerator.getIV(0);
        com.lowagie.text.pdf.PRTokeniser pRTokeniser2 = new com.lowagie.text.pdf.PRTokeniser(byte_array1);
        int i3 = pRTokeniser2.length();
        int i4 = pRTokeniser2.getFilePointer();
        pRTokeniser2.close();
        try {
            pRTokeniser2.throwError("defaultdir");
            fail("Expected exception of type com.lowagie.text.exceptions.InvalidPdfException");
        } catch (com.lowagie.text.exceptions.InvalidPdfException e) {
        }
        assertNotNull(byte_array1);
        assertEquals(0, i3);
        assertEquals(0, i4);
    }

    @Test
    void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test268");
        com.lowagie.text.pdf.Barcode39 barcode39_0 = new com.lowagie.text.pdf.Barcode39();
        barcode39_0.setCodeType(0);
        barcode39_0.setAltText("Times-Roman");
    }

    @Test
    void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test269");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        java.util.Set<java.lang.Object> set_obj2 = properties1.keySet();
        assertNotNull(properties1);
        assertNotNull(set_obj2);
    }

    @Test
    void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test270");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DISPLAYDOCTITLE;
        assertNotNull(pdfName0);
    }

    @Test
    void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test271");
        int i0 = com.lowagie.text.pdf.collection.PdfCollectionField.SIZE;
        assertEquals(7, i0);
    }

    @Test
    void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test272");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TIMES_ITALIC;
        assertNotNull(pdfName0);
    }

    @Test
    void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test273");
        int i0 = com.lowagie.text.pdf.ArabicLigaturizer.DIGIT_TYPE_AN;
        assertEquals(0, i0);
    }

    @Test
    void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test274");
        java.lang.String str1 = com.lowagie.text.pdf.XfaForm.Xml2Som.escapeSom("");
        assertEquals("", str1, "'" + str1 + "' != '" + "" + "'");
    }

    @Test
    void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test275");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        com.lowagie.text.pdf.ByteBuffer byteBuffer2 = new com.lowagie.text.pdf.ByteBuffer(1564);
        try {
            com.lowagie.text.pdf.PdfEncryptor.encrypt(pdfReader0, (java.io.OutputStream) byteBuffer2, 804, "SKEW", "urx", 32);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test276");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.CI;
        assertNotNull(pdfName0);
    }

    @Test
    void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test277");
        int i0 = com.lowagie.text.pdf.BarcodePDF417.PDF417_AUTO_ERROR_LEVEL;
        assertEquals(0, i0);
    }

    @Test
    void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test278");
        com.lowagie.text.pdf.BidiLine bidiLine0 = new com.lowagie.text.pdf.BidiLine();
        try {
            int i3 = bidiLine0.trimLeftEx((int) (byte) -1, 1565);
            fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test279");
        java.awt.Color color0 = java.awt.Color.black;
        assertNotNull(color0);
    }

    @Test
    void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test280");
        com.lowagie.text.RectangleReadOnly rectangleReadOnly4 = new com.lowagie.text.RectangleReadOnly((float) (byte) 100, (float) 1336, (float) 'Ë', (float) 9);
        java.awt.Color color5 = java.awt.Color.blue;
        try {
            rectangleReadOnly4.setBorderColorTop(color5);
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        assertNotNull(color5);
    }

    @Test
    void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test281");
        com.lowagie.text.pdf.PdfNumber pdfNumber1 = new com.lowagie.text.pdf.PdfNumber(29);
        float f2 = pdfNumber1.floatValue();
        boolean b3 = pdfNumber1.isStream();
        assertEquals(29.0f, f2);
        assertEquals(false, b3);
    }

    @Test
    void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test282");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_CREATEREGION;
        assertEquals(1791, i0);
    }

    @Test
    void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test283");
        int i0 = com.lowagie.text.pdf.PdfTransition.LRWIPE;
        assertEquals(9, i0);
    }

    @Test
    void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test284");
        int i0 = com.lowagie.text.pdf.ColumnText.DIGIT_TYPE_AN_EXTENDED;
        assertEquals(256, i0);
    }

    @Test
    void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test285");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        byte[] byte_array5 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream6 = new com.lowagie.text.pdf.PRStream(pdfReader0, byte_array5);
        com.lowagie.text.pdf.PdfReader pdfReader7 = null;
        byte[] byte_array12 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream13 = new com.lowagie.text.pdf.PRStream(pdfReader7, byte_array12);
        pRStream6.setData(byte_array12, false, (int) (byte) 100);
        java.lang.String str17 = pRStream6.toString();
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper18 = new com.lowagie.text.pdf.PdfPageEventHelper();
        java.io.OutputStream outputStream19 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields21 = new com.lowagie.text.pdf.PdfCopyFields(outputStream19, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter22 = pdfCopyFields21.getWriter();
        com.lowagie.text.Font font24 = null;
        com.lowagie.text.Footnote footnote25 = new com.lowagie.text.Footnote("", font24);
        com.lowagie.text.HeaderFooter headerFooter27 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote25, true);
        headerFooter27.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle30 = headerFooter27.rotate();
        com.lowagie.text.Rectangle rectangle31 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter27);
        com.lowagie.text.Document document32 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter27);
        boolean b34 = document32.setMarginMirroringTopBottom(true);
        com.lowagie.text.Font font38 = null;
        com.lowagie.text.Footnote footnote39 = new com.lowagie.text.Footnote("", font38);
        com.lowagie.text.HeaderFooter headerFooter41 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote39, true);
        headerFooter41.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph44 = headerFooter41.paragraph();
        pdfPageEventHelper18.onSection(pdfWriter22, document32, (float) 7, 262144, paragraph44);
        pdfWriter22.setStrictImageSequence(false);
        pdfWriter22.setEncryption(false, "true", "bottom", 1336);
        com.lowagie.text.pdf.PdfName pdfName53 = com.lowagie.text.pdf.PdfName.NONE;
        com.lowagie.text.pdf.PdfName pdfName54 = com.lowagie.text.pdf.PdfName.XREF;
        pdfWriter22.setDefaultColorspace(pdfName53, (com.lowagie.text.pdf.PdfObject) pdfName54);
        pdfWriter22.setAtLeastPdfVersion('È');
        com.lowagie.text.pdf.ByteBuffer byteBuffer59 = new com.lowagie.text.pdf.ByteBuffer(1564);
        try {
            pRStream6.toPdf(pdfWriter22, (java.io.OutputStream) byteBuffer59);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(byte_array5);
        assertNotNull(byte_array12);
        assertEquals("Stream", str17, "'" + str17 + "' != '" + "Stream" + "'");
        assertNotNull(pdfWriter22);
        assertNotNull(rectangle30);
        assertEquals(true, b34);
        assertNotNull(paragraph44);
        assertNotNull(pdfName53);
        assertNotNull(pdfName54);
    }

    @Test
    void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test286");
        com.lowagie.text.pdf.hyphenation.ByteVector byteVector1 = new com.lowagie.text.pdf.hyphenation.ByteVector((int) (byte) 60);
        try {
            byte byte3 = byteVector1.get(64);
            fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test287");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PREDICTOR;
        assertNotNull(pdfName0);
    }

    @Test
    void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test288");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.AUTHEVENT;
        assertNotNull(pdfName0);
    }

    @Test
    void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test289");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.SMASK;
        assertNotNull(pdfName0);
    }

    @Test
    void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test290");
        byte[] byte_array2 = null;
        com.lowagie.text.pdf.PdfReader pdfReader3 = null;
        byte[] byte_array8 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream9 = new com.lowagie.text.pdf.PRStream(pdfReader3, byte_array8);
        com.lowagie.text.pdf.PdfReader pdfReader10 = null;
        byte[] byte_array15 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream16 = new com.lowagie.text.pdf.PRStream(pdfReader10, byte_array15);
        pRStream9.setData(byte_array15, false, (int) (byte) 100);
        com.lowagie.text.ImgJBIG2 imgJBIG2_20 = new com.lowagie.text.ImgJBIG2(4, 1564, byte_array2, byte_array15);
        try {
            com.lowagie.text.pdf.StandardDecryption standardDecryption24 = new com.lowagie.text.pdf.StandardDecryption(byte_array2, 1024, (int) (byte) 0, 34);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(byte_array8);
        assertNotNull(byte_array15);
    }

    @Test
    void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test291");
        com.lowagie.text.pdf.codec.wmf.MetaObject metaObject0 = new com.lowagie.text.pdf.codec.wmf.MetaObject();
    }

    @Test
    void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test292");
        byte[] byte_array1 = com.lowagie.text.pdf.crypto.IVGenerator.getIV(0);
        com.lowagie.text.pdf.PRTokeniser pRTokeniser2 = new com.lowagie.text.pdf.PRTokeniser(byte_array1);
        byte[] byte_array3 = null;
        try {
            com.lowagie.text.pdf.PdfReader pdfReader4 = new com.lowagie.text.pdf.PdfReader(byte_array1, byte_array3);
            fail("Expected exception of type com.lowagie.text.exceptions.InvalidPdfException");
        } catch (com.lowagie.text.exceptions.InvalidPdfException e) {
        }
        assertNotNull(byte_array1);
    }

    @Test
    void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test293");
        int i0 = com.lowagie.text.pdf.PdfAction.SUBMIT_HTML_GET;
        assertEquals(8, i0);
    }

    @Test
    void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test294");
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
        com.lowagie.text.pdf.PdfWriter pdfWriter17 = null;
        com.lowagie.text.pdf.PdfAcroForm pdfAcroForm18 = new com.lowagie.text.pdf.PdfAcroForm(pdfWriter17);
        pdfXConformanceImp0.completeInfoDictionary((com.lowagie.text.pdf.PdfDictionary) pdfAcroForm18);
        assertNotNull(rectangle9);
        assertNotNull(f_array14);
        assertNotNull(pdfAnnotation15);
    }

    @Test
    void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test295");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.IMAGEMASK;
        assertNotNull(pdfName0);
    }

    @Test
    void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test296");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.VIEWSTATE;
        assertNotNull(pdfName0);
    }

    @Test
    void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test297");
        int i0 = com.lowagie.text.pdf.ColumnText.DIGIT_TYPE_AN;
        assertEquals(0, i0);
    }

    @Test
    void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test298");
        java.lang.String str0 = com.lowagie.text.ElementTags.AUTHOR;
        assertEquals("author", str0, "'" + str0 + "' != '" + "author" + "'");
    }

    @Test
    void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test299");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.BLINDS;
        assertNotNull(pdfName0);
    }

    @Test
    void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test300");
        com.lowagie.text.Font font4 = com.lowagie.text.FontFactory.getFont("page-break-after", "face", (float) 30);
        com.lowagie.text.ListItem listItem5 = new com.lowagie.text.ListItem("border-bottom-width", font4);
        com.lowagie.text.Paragraph paragraph6 = new com.lowagie.text.Paragraph((com.lowagie.text.Phrase) listItem5);
        assertNotNull(font4);
    }

    @Test
    void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test301");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfAcroForm pdfAcroForm1 = new com.lowagie.text.pdf.PdfAcroForm(pdfWriter0);
        pdfAcroForm1.setNeedAppearances(true);
        boolean b4 = pdfAcroForm1.isDictionary();
        pdfAcroForm1.setNeedAppearances(true);
        com.lowagie.text.pdf.BaseFont baseFont9 = null;
        com.lowagie.text.Font font12 = new com.lowagie.text.Font(baseFont9, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont14 = font12.getCalculatedBaseFont(false);
        boolean b17 = baseFont14.setCharAdvance(9, 0);
        int i18 = baseFont14.getCompressionLevel();
        int[] i_array19 = baseFont14.getWidths();
        java.lang.String[] str_array20 = baseFont14.getCodePagesSupported();
        try {
            com.lowagie.text.pdf.PdfFormField pdfFormField26 = pdfAcroForm1.addSingleLinePasswordField("Ā", "III", baseFont14, 0.0f, 8.0f, 561.0f, (float) 0, (float) (byte) 0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertEquals(true, b4);
        assertNotNull(baseFont14);
        assertEquals(true, b17);
        assertEquals(i18, (-1));
        assertNotNull(i_array19);
        assertNotNull(str_array20);
    }

    @Test
    void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test302");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TYPE3;
        assertNotNull(pdfName0);
    }

    @Test
    void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test303");
        int i0 = com.lowagie.text.Element.PHRASE;
        assertEquals(11, i0);
    }

    @Test
    void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test304");
        java.io.OutputStream outputStream0 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields2 = new com.lowagie.text.pdf.PdfCopyFields(outputStream0, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = pdfCopyFields2.getWriter();
        int i4 = pdfWriter3.getCurrentPageNumber();
        com.lowagie.text.Chapter chapter6 = new com.lowagie.text.Chapter((int) (short) -1);
        pdfWriter3.setOutlines((java.util.List) chapter6);
        com.lowagie.text.Table table8 = null;
        try {
            boolean b10 = pdfWriter3.fitsPage(table8, (float) 8388608);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfWriter3);
        assertEquals(1, i4);
    }

    @Test
    void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test305");
        int i0 = com.lowagie.text.pdf.PdfWriter.AllowCopy;
        assertEquals(16, i0);
    }

    @Test
    void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test306");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Cell cell5 = com.lowagie.text.factories.ElementFactory.getCell(properties1);
        int i6 = cell5.type();
        try {
            float f7 = cell5.getLeft();
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(cell5);
        assertEquals(20, i6);
    }

    @Test
    void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test307");
        java.lang.String str0 = com.lowagie.text.ElementTags.CONTENT;
        assertEquals("content", str0, "'" + str0 + "' != '" + "content" + "'");
    }

    @Test
    void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test308");
        com.lowagie.text.Font font1 = null;
        com.lowagie.text.Footnote footnote2 = new com.lowagie.text.Footnote("", font1);
        com.lowagie.text.HeaderFooter headerFooter4 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote2, true);
        com.lowagie.text.pdf.HyphenationAuto hyphenationAuto9 = new com.lowagie.text.pdf.HyphenationAuto("Default", "creationdate", (-1), 1785737760);
        footnote2.setHyphenation((com.lowagie.text.pdf.HyphenationEvent) hyphenationAuto9);
        java.lang.String str11 = hyphenationAuto9.getHyphenSymbol();
        assertEquals("-", str11, "'" + str11 + "' != '" + "-" + "'");
    }

    @Test
    void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test309");
        java.security.cert.X509Certificate x509Certificate0 = null;
        java.security.cert.X509Certificate x509Certificate1 = null;
        com.lowagie.text.pdf.OcspClientBouncyCastle ocspClientBouncyCastle3 = new com.lowagie.text.pdf.OcspClientBouncyCastle(x509Certificate0, x509Certificate1, "encoding");
    }

    @Test
    void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test310");
        com.lowagie.text.Phrase phrase1 = new com.lowagie.text.Phrase((float) 'Ã');
        com.lowagie.text.Anchor anchor2 = new com.lowagie.text.Anchor(phrase1);
        int i3 = anchor2.type();
        assertEquals(17, i3);
    }

    @Test
    void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test311");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfAcroForm pdfAcroForm1 = new com.lowagie.text.pdf.PdfAcroForm(pdfWriter0);
        boolean b2 = pdfAcroForm1.isOutlineTree();
        com.lowagie.text.pdf.PRIndirectReference pRIndirectReference3 = null;
        pdfAcroForm1.setIndRef(pRIndirectReference3);
        com.lowagie.text.pdf.PdfWriter pdfWriter5 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField6 = com.lowagie.text.pdf.PdfFormField.createCheckBox(pdfWriter5);
        pdfFormField6.setQuadding((int) (byte) 100);
        try {
            pdfAcroForm1.setButtonParams(pdfFormField6, 256, "com/lowagie/text/pdf/fonts/", "OpenPDF 1.2.12.SNAPSHOT");
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertEquals(false, b2);
        assertNotNull(pdfFormField6);
    }

    @Test
    void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test312");
        com.lowagie.text.pdf.PdfObject pdfObject0 = null;
        com.lowagie.text.pdf.PdfObject pdfObject1 = com.lowagie.text.pdf.PdfReader.getPdfObjectRelease(pdfObject0);
        assertNull(pdfObject1);
    }

    @Test
    void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test313");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.BORDER;
        assertNotNull(pdfName0);
    }

    @Test
    void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test314");
        int i0 = com.lowagie.text.pdf.PdfTemplate.TYPE_PATTERN;
        assertEquals(3, i0);
    }

    @Test
    void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test315");
        boolean b0 = com.lowagie.text.pdf.BaseFont.NOT_CACHED;
        assertEquals(false, b0);
    }

    @Test
    void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test316");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.URL;
        assertNotNull(pdfName0);
    }

    @Test
    void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test317");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfAcroForm pdfAcroForm1 = new com.lowagie.text.pdf.PdfAcroForm(pdfWriter0);
        pdfAcroForm1.setNeedAppearances(true);
        boolean b4 = pdfAcroForm1.isDictionary();
        com.lowagie.text.pdf.BaseFont baseFont7 = null;
        com.lowagie.text.Font font10 = new com.lowagie.text.Font(baseFont7, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont12 = font10.getCalculatedBaseFont(false);
        java.lang.String[] str_array13 = baseFont12.getDifferences();
        try {
            com.lowagie.text.pdf.PdfFormField pdfFormField19 = pdfAcroForm1.addMultiLineTextField("III", "dc:title", baseFont12, 2.5f, (float) (byte) 0, 136.0f, (float) (short) 100, 29.0f);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertEquals(true, b4);
        assertNotNull(baseFont12);
        assertNotNull(str_array13);
    }

    @Test
    void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test318");
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
        byte[] byte_array47 = new byte[]{(byte) -1, (byte) 0};
        com.lowagie.text.pdf.PdfEFStream pdfEFStream48 = new com.lowagie.text.pdf.PdfEFStream(byte_array47);
        try {
            com.lowagie.text.pdf.PdfReader pdfReader49 = new com.lowagie.text.pdf.PdfReader(randomAccessFileOrArray43, byte_array47);
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
        assertEquals(byte44, (byte) 1);
        assertNotNull(byte_array47);
    }

    @Test
    void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test319");
        com.lowagie.text.pdf.TSAClientBouncyCastle tSAClientBouncyCastle3 = new com.lowagie.text.pdf.TSAClientBouncyCastle("UTF-16", "", "xmpMM:Versions");
    }

    @Test
    void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test320");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_LINETO;
        assertEquals(531, i0);
    }

    @Test
    void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test321");
        com.lowagie.text.Font font1 = null;
        com.lowagie.text.Footnote footnote2 = new com.lowagie.text.Footnote("", font1);
        com.lowagie.text.HeaderFooter headerFooter4 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote2, true);
        headerFooter4.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle7 = headerFooter4.rotate();
        com.lowagie.text.Rectangle rectangle8 = com.lowagie.text.PageSize.PENGUIN_LARGE_PAPERBACK;
        float f9 = rectangle8.getHeight();
        rectangle7.softCloneNonPositionParameters(rectangle8);
        float f12 = rectangle7.getBottom((float) (short) 0);
        assertNotNull(rectangle7);
        assertNotNull(rectangle8);
        assertEquals(561.0f, f9);
        assertEquals(0.0f, f12);
    }

    @Test
    void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test322");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Cell cell5 = com.lowagie.text.factories.ElementFactory.getCell(properties1);
        boolean b6 = cell5.isUseBorderPadding();
        cell5.setShowTruncation("underline");
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(cell5);
        assertEquals(false, b6);
    }

    @Test
    void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test323");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.RICHMEDIAANIMATION;
        assertNotNull(pdfName0);
    }

    @Test
    void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test324");
        java.lang.String str0 = com.lowagie.text.Annotation.URY;
        assertEquals("ury", str0, "'" + str0 + "' != '" + "ury" + "'");
    }

    @Test
    void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test325");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_DIBSTRETCHBLT;
        assertEquals(2881, i0);
    }

    @Test
    void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test326");
        com.lowagie.text.Chapter chapter1 = new com.lowagie.text.Chapter((int) (short) -1);
        chapter1.setBookmarkOpen(false);
    }

    @Test
    void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test327");
        com.lowagie.text.RectangleReadOnly rectangleReadOnly4 = new com.lowagie.text.RectangleReadOnly((float) (byte) 100, (float) 1336, (float) 'Ë', (float) 9);
        try {
            rectangleReadOnly4.setBorder(2368);
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
    }

    @Test
    void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test328");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_SETPALENTRIES;
        assertEquals(55, i0);
    }

    @Test
    void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test329");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ACROFORM;
        assertNotNull(pdfName0);
    }

    @Test
    void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test330");
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
        com.lowagie.text.Font font29 = null;
        com.lowagie.text.Footnote footnote30 = new com.lowagie.text.Footnote("", font29);
        com.lowagie.text.HeaderFooter headerFooter32 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote30, true);
        headerFooter32.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle35 = headerFooter32.rotate();
        com.lowagie.text.Rectangle rectangle36 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter32);
        com.lowagie.text.Document document37 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter32);
        com.lowagie.text.pdf.PdfName pdfName38 = com.lowagie.text.pdf.PdfName.TIME;
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation40 = com.lowagie.text.pdf.PdfAnnotation.createLink(pdfWriter4, (com.lowagie.text.Rectangle) headerFooter32, pdfName38, "<?xpacket end=\"r\"?>");
        com.lowagie.text.pdf.PdfName pdfName41 = com.lowagie.text.pdf.PdfName.INFO;
        com.lowagie.text.pdf.PdfAction pdfAction44 = new com.lowagie.text.pdf.PdfAction("plainwidth", 3);
        try {
            pdfWriter4.setPageAction(pdfName41, pdfAction44);
            fail("Expected exception of type com.lowagie.text.DocumentException");
        } catch (com.lowagie.text.DocumentException e) {
        }
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertNotNull(rectangle35);
        assertNotNull(pdfName38);
        assertNotNull(pdfAnnotation40);
        assertNotNull(pdfName41);
    }

    @Test
    void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test331");
        com.lowagie.text.pdf.collection.PdfCollectionField pdfCollectionField2 = new com.lowagie.text.pdf.collection.PdfCollectionField("horizontalalign", 1970433056);
    }

    @Test
    void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test332");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.HOFFSET;
        assertNotNull(pdfName0);
    }

    @Test
    void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test333");
        com.lowagie.text.pdf.PdfDashPattern pdfDashPattern2 = new com.lowagie.text.pdf.PdfDashPattern((float) 0L, (float) 8);
        int i3 = pdfDashPattern2.size();
        try {
            com.lowagie.text.pdf.PdfStream pdfStream5 = pdfDashPattern2.getAsStream(4096);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        assertEquals(2, i3);
    }

    @Test
    void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test334");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.FITBH;
        assertNotNull(pdfName0);
    }

    @Test
    void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test335");
        java.lang.String str0 = com.lowagie.text.ElementTags.CELL;
        assertEquals("cell", str0, "'" + str0 + "' != '" + "cell" + "'");
    }

    @Test
    void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test336");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        try {
            int i7 = type3Font5.getWidth(2048);
            fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        assertNotNull(char_array3);
    }

    @Test
    void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test337");
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
        pdfPRow1.setExtraHeight(4096, 1.65153267E9f);
        assertNotNull(pdfPCell_array0);
        assertNotNull(f_array10);
        assertNotNull(f_array12);
        assertNotNull(f_array18);
        assertNotNull(rectangle27);
        assertNotNull(f_array32);
        assertNotNull(pdfAnnotation33);
        assertNotNull(pdfFunction35);
        assertEquals(false, b36);
    }

    @Test
    void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test338");
        boolean b0 = com.lowagie.text.pdf.PdfFormField.PLAINTEXT;
        assertEquals(false, b0);
    }

    @Test
    void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test339");
        java.lang.String str1 = com.lowagie.text.pdf.SimpleNamedDestination.escapeBinaryString("UniKS-UCS2-V");
        assertEquals("UniKS-UCS2-V", str1, "'" + str1 + "' != '" + "UniKS-UCS2-V" + "'");
    }

    @Test
    void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test340");
        java.lang.String str0 = com.lowagie.text.ElementTags.DESTINATION;
        assertEquals("destination", str0, "'" + str0 + "' != '" + "destination" + "'");
    }

    @Test
    void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test341");
        int i0 = com.lowagie.text.pdf.PdfFormField.Q_RIGHT;
        assertEquals(2, i0);
    }

    @Test
    void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test342");
        float f0 = com.lowagie.text.pdf.PdfPRow.BOTTOM_LIMIT;
        assertEquals(f0, (-1.07374182E9f));
    }

    @Test
    void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test343");
        java.lang.String str0 = com.lowagie.text.xml.xmp.DublinCoreSchema.CREATOR;
        assertEquals("dc:creator", str0, "'" + str0 + "' != '" + "dc:creator" + "'");
    }

    @Test
    void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test344");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PREV;
        assertNotNull(pdfName0);
    }

    @Test
    void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test345");
        java.lang.String str0 = com.lowagie.text.ElementTags.ANNOTATION;
        assertEquals("annotation", str0, "'" + str0 + "' != '" + "annotation" + "'");
    }

    @Test
    void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test346");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        float f3 = pdfPTable1.getRowHeight(1785737760);
        boolean b5 = pdfPTable1.isExtendLastRow(true);
        com.lowagie.text.pdf.PdfPCell[] pdfPCell_array6 = new com.lowagie.text.pdf.PdfPCell[]{};
        com.lowagie.text.pdf.PdfPRow pdfPRow7 = new com.lowagie.text.pdf.PdfPRow(pdfPCell_array6);
        pdfPRow7.initExtraHeights();
        com.lowagie.text.pdf.PdfWriter pdfWriter9 = null;
        float[] f_array16 = new float[]{100.0f, 8, 3, 7, 100.0f, 'a'};
        float[] f_array18 = new float[]{(byte) 10};
        float[] f_array24 = new float[]{64, 64, 100.0f, 4, 29};
        com.lowagie.text.pdf.PdfWriter pdfWriter25 = null;
        com.lowagie.text.Font font27 = null;
        com.lowagie.text.Footnote footnote28 = new com.lowagie.text.Footnote("", font27);
        com.lowagie.text.HeaderFooter headerFooter30 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote28, true);
        headerFooter30.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle33 = headerFooter30.rotate();
        float[] f_array38 = new float[]{6, 9};
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation39 = com.lowagie.text.pdf.PdfAnnotation.createMarkup(pdfWriter25, rectangle33, "Stream", 3, f_array38);
        com.lowagie.text.pdf.PdfFunction pdfFunction41 = com.lowagie.text.pdf.PdfFunction.type2(pdfWriter9, f_array16, f_array18, f_array24, f_array38, 561.0f);
        boolean b42 = pdfPRow7.setWidths(f_array16);
        byte[] byte_array45 = null;
        com.lowagie.text.pdf.PdfReader pdfReader46 = null;
        byte[] byte_array51 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream52 = new com.lowagie.text.pdf.PRStream(pdfReader46, byte_array51);
        com.lowagie.text.pdf.PdfReader pdfReader53 = null;
        byte[] byte_array58 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream59 = new com.lowagie.text.pdf.PRStream(pdfReader53, byte_array58);
        pRStream52.setData(byte_array58, false, (int) (byte) 100);
        com.lowagie.text.ImgJBIG2 imgJBIG2_63 = new com.lowagie.text.ImgJBIG2(4, 1564, byte_array45, byte_array58);
        int i64 = imgJBIG2_63.getDpiY();
        try {
            pdfPTable1.setWidthPercentage(f_array16, (com.lowagie.text.Rectangle) imgJBIG2_63);
            fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        assertEquals(0.0f, f3);
        assertEquals(false, b5);
        assertNotNull(pdfPCell_array6);
        assertNotNull(f_array16);
        assertNotNull(f_array18);
        assertNotNull(f_array24);
        assertNotNull(rectangle33);
        assertNotNull(f_array38);
        assertNotNull(pdfAnnotation39);
        assertNotNull(pdfFunction41);
        assertEquals(false, b42);
        assertNotNull(byte_array51);
        assertNotNull(byte_array58);
        assertEquals(0, i64);
    }

    @Test
    void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test347");
        int i0 = com.lowagie.text.pdf.PdfTransition.BLINDH;
        assertEquals(6, i0);
    }

    @Test
    void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test348");
        com.lowagie.text.pdf.collection.PdfCollectionSchema pdfCollectionSchema0 = new com.lowagie.text.pdf.collection.PdfCollectionSchema();
    }

    @Test
    void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test349");
        try {
            byte[] byte_array1 = com.lowagie.text.pdf.Barcode39.getBarsCode39("STSong-Light");
            fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test350");
        com.lowagie.text.pdf.PdfDashPattern pdfDashPattern2 = new com.lowagie.text.pdf.PdfDashPattern((float) 0L, (float) 8);
        java.util.ListIterator<com.lowagie.text.pdf.PdfObject> listiterator_pdfObject3 = pdfDashPattern2.listIterator();
        assertNotNull(listiterator_pdfObject3);
    }

    @Test
    void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test351");
        com.lowagie.text.pdf.PdfTransition pdfTransition2 = new com.lowagie.text.pdf.PdfTransition(7, (int) 'Ã');
        com.lowagie.text.pdf.PdfDictionary pdfDictionary3 = pdfTransition2.getTransitionDictionary();
        assertNotNull(pdfDictionary3);
    }

    @Test
    void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test352");
        java.lang.String str0 = com.lowagie.text.xml.xmp.PdfSchema.DEFAULT_XPATH_URI;
        assertEquals("http://ns.adobe.com/pdf/1.3/", str0, "'" + str0 + "' != '" + "http://ns.adobe.com/pdf/1.3/" + "'");
    }

    @Test
    void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test353");
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
        com.lowagie.text.Font font29 = null;
        com.lowagie.text.Footnote footnote30 = new com.lowagie.text.Footnote("", font29);
        com.lowagie.text.HeaderFooter headerFooter32 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote30, true);
        headerFooter32.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle35 = headerFooter32.rotate();
        com.lowagie.text.Rectangle rectangle36 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter32);
        com.lowagie.text.Document document37 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter32);
        com.lowagie.text.pdf.PdfName pdfName38 = com.lowagie.text.pdf.PdfName.TIME;
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation40 = com.lowagie.text.pdf.PdfAnnotation.createLink(pdfWriter4, (com.lowagie.text.Rectangle) headerFooter32, pdfName38, "<?xpacket end=\"r\"?>");
        headerFooter32.setBottom((float) (-56509343));
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertNotNull(rectangle35);
        assertNotNull(pdfName38);
        assertNotNull(pdfAnnotation40);
    }

    @Test
    void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test354");
        int i0 = com.lowagie.text.Image.DEFAULT;
        assertEquals(0, i0);
    }

    @Test
    void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test355");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfAnnotation.APPEARANCE_NORMAL;
        assertNotNull(pdfName0);
    }

    @Test
    void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test356");
        java.security.cert.Certificate certificate0 = null;
        java.security.cert.Certificate[] certificate_array1 = new java.security.cert.Certificate[]{certificate0};
        java.security.KeyStore keyStore2 = null;
        java.lang.String[] str_array13 = new java.lang.String[]{"text-align", "listitem", "listitem", "listitem", "listitem", "hi!", "HeiseiKakuGo-W5", "UnicodeBig", "hi!", "xmp:Nickname"};
        java.util.ArrayList<java.lang.String> arraylist_str14 = new java.util.ArrayList<java.lang.String>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str14, str_array13);
        java.util.stream.Stream<java.lang.String> stream_str16 = arraylist_str14.parallelStream();
        arraylist_str14.add(0, "absolutex");
        boolean b20 = arraylist_str14.isEmpty();
        java.util.Calendar calendar21 = null;
        try {
            java.lang.Object[] obj_array22 = com.lowagie.text.pdf.PdfPKCS7.verifyCertificates(certificate_array1, keyStore2, (java.util.Collection) arraylist_str14, calendar21);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(certificate_array1);
        assertNotNull(str_array13);
        assertEquals(true, b15);
        assertNotNull(stream_str16);
        assertEquals(false, b20);
    }

    @Test
    void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test357");
        java.lang.String str0 = com.lowagie.text.Chunk.SUBSUPSCRIPT;
        assertEquals("SUBSUPSCRIPT", str0, "'" + str0 + "' != '" + "SUBSUPSCRIPT" + "'");
    }

    @Test
    void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test358");
        try {
            com.lowagie.text.pdf.PdfAction pdfAction1 = new com.lowagie.text.pdf.PdfAction((-1));
            fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test359");
        com.lowagie.text.pdf.PdfGraphics2D.HyperLinkKey hyperLinkKey0 = com.lowagie.text.pdf.PdfGraphics2D.HyperLinkKey.KEY_INSTANCE;
        com.lowagie.text.pdf.PdfPTable pdfPTable2 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell3 = pdfPTable2.getDefaultCell();
        float f4 = pdfPCell3.getIndent();
        com.lowagie.text.pdf.PdfPTable pdfPTable5 = pdfPCell3.getTable();
        pdfPCell3.setRowspan(34);
        java.awt.Color color8 = java.awt.Color.GREEN;
        pdfPCell3.setBackgroundColor(color8);
        boolean b10 = hyperLinkKey0.equals((java.lang.Object) pdfPCell3);
        try {
            pdfPCell3.setRotation((int) '翿');
            fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        assertNotNull(hyperLinkKey0);
        assertNotNull(pdfPCell3);
        assertEquals(0.0f, f4);
        assertNull(pdfPTable5);
        assertNotNull(color8);
        assertEquals(false, b10);
    }

    @Test
    void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test360");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        pdfPTable1.setSpacingBefore((float) 15);
        pdfPTable1.setWidthPercentage((-11.660001f));
        assertNotNull(pdfPCell2);
    }

    @Test
    void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test361");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_DIBCREATEPATTERNBRUSH;
        assertEquals(322, i0);
    }

    @Test
    void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test362");
        int i0 = com.lowagie.text.pdf.PdfContentParser.COMMAND_TYPE;
        assertEquals(200, i0);
    }

    @Test
    void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test363");
        int i0 = com.lowagie.text.pdf.PdfWriter.GENERATION_MAX;
        assertEquals(65535, i0);
    }

    @Test
    void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test364");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        com.lowagie.text.pdf.ByteBuffer byteBuffer2 = new com.lowagie.text.pdf.ByteBuffer(1564);
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields4 = new com.lowagie.text.pdf.PdfCopyFields((java.io.OutputStream) byteBuffer2, 'Ã');
        com.lowagie.text.pdf.ByteBuffer byteBuffer6 = byteBuffer2.append(24);
        java.util.HashMap hashMap11 = com.lowagie.text.xml.simpleparser.EntitiesToSymbol.map;
        try {
            com.lowagie.text.pdf.PdfEncryptor.encrypt(pdfReader0, (java.io.OutputStream) byteBuffer6, false, "COLOR", "pdf:keywords", 1565, hashMap11);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(byteBuffer6);
        assertNotNull(hashMap11);
    }

    @Test
    void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test365");
        java.lang.String str0 = com.lowagie.text.FontFactory.TIMES;
        assertEquals("Times", str0, "'" + str0 + "' != '" + "Times" + "'");
    }

    @Test
    void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test366");
        java.lang.String str0 = com.lowagie.text.html.Markup.CSS_KEY_PADDINGLEFT;
        assertEquals("padding-left", str0, "'" + str0 + "' != '" + "padding-left" + "'");
    }

    @Test
    void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test367");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TOCI;
        assertNotNull(pdfName0);
    }

    @Test
    void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test368");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ORDER;
        assertNotNull(pdfName0);
    }

    @Test
    void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test369");
        com.lowagie.text.pdf.BaseFont baseFont0 = null;
        com.lowagie.text.Font font3 = new com.lowagie.text.Font(baseFont0, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont5 = font3.getCalculatedBaseFont(false);
        boolean b8 = baseFont5.setCharAdvance(9, 0);
        int i9 = baseFont5.getCompressionLevel();
        float f12 = baseFont5.getWidthPointKerned("xmpMM:ManageUI", 0.0f);
        assertNotNull(baseFont5);
        assertEquals(true, b8);
        assertEquals(i9, (-1));
        assertEquals(0.0f, f12);
    }

    @Test
    void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test370");
        int i0 = com.lowagie.text.pdf.collection.PdfCollectionField.DATE;
        assertEquals(1, i0);
    }

    @Test
    void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test371");
        com.lowagie.text.pdf.PdfDestination pdfDestination2 = new com.lowagie.text.pdf.PdfDestination((int) (byte) 9, (float) 50);
        com.lowagie.text.pdf.PdfIndirectReference pdfIndirectReference3 = null;
        boolean b4 = pdfDestination2.addPage(pdfIndirectReference3);
        assertEquals(true, b4);
    }

    @Test
    void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test372");
        com.lowagie.text.Rectangle rectangle0 = com.lowagie.text.PageSize.PENGUIN_LARGE_PAPERBACK;
        float f1 = rectangle0.getBottom();
        assertNotNull(rectangle0);
        assertEquals(0.0f, f1);
    }

    @Test
    void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test373");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Cell cell5 = com.lowagie.text.factories.ElementFactory.getCell(properties1);
        java.io.InputStream inputStream6 = null;
        try {
            properties1.loadFromXML(inputStream6);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(cell5);
    }

    @Test
    void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test374");
        java.lang.String str1 = com.lowagie.text.factories.RomanNumberFactory.getLowerCaseString(24);
        assertEquals("xxiv", str1, "'" + str1 + "' != '" + "xxiv" + "'");
    }

    @Test
    void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test375");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        float f3 = pdfPTable1.getRowHeight(1785737760);
        boolean b5 = pdfPTable1.isExtendLastRow(true);
        com.lowagie.text.pdf.PdfContentByte[] pdfContentByte_array12 = new com.lowagie.text.pdf.PdfContentByte[]{};
        try {
            float f13 = pdfPTable1.writeSelectedRows(53, (int) (short) 100, (int) ' ', (int) ' ', 0.0f, 4.0f, pdfContentByte_array12);
            fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        assertEquals(0.0f, f3);
        assertEquals(false, b5);
        assertNotNull(pdfContentByte_array12);
    }

    @Test
    void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test376");
        int i0 = com.lowagie.text.Jpeg.M_APP2;
        assertEquals(226, i0);
    }

    @Test
    void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test377");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfWriter.PDF_VERSION_1_2;
        assertNotNull(pdfName0);
    }

    @Test
    void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test378");
        int i0 = com.lowagie.text.Font.NORMAL;
        assertEquals(0, i0);
    }

    @Test
    void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test379");
        java.lang.String str0 = com.lowagie.text.Annotation.DESTINATION;
        assertEquals("destination", str0, "'" + str0 + "' != '" + "destination" + "'");
    }

    @Test
    void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test380");
        int i0 = com.lowagie.text.Font.ITALIC;
        assertEquals(2, i0);
    }

    @Test
    void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test381");
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
        com.lowagie.text.pdf.PdfIndirectReference pdfIndirectReference91 = null;
        com.lowagie.text.Font font93 = null;
        com.lowagie.text.Footnote footnote94 = new com.lowagie.text.Footnote("", font93);
        com.lowagie.text.HeaderFooter headerFooter96 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote94, true);
        com.lowagie.text.pdf.HyphenationEvent hyphenationEvent97 = footnote94.getHyphenation();
        try {
            java.lang.Object[] obj_array99 = com.lowagie.text.pdf.SimpleBookmark.iterateOutlines(pdfWriter9, pdfIndirectReference91, (java.util.List) footnote94, false);
            fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        assertNull(hyphenationEvent97);
    }

    @Test
    void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test382");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfAcroForm pdfAcroForm1 = new com.lowagie.text.pdf.PdfAcroForm(pdfWriter0);
        boolean b2 = pdfAcroForm1.isOutlineTree();
        java.util.HashMap hashMap3 = com.lowagie.text.xml.simpleparser.EntitiesToSymbol.map;
        com.lowagie.text.pdf.PdfWriter pdfWriter4 = null;
        com.lowagie.text.pdf.PdfDictionary pdfDictionary5 = com.lowagie.text.pdf.SimpleNamedDestination.outputNamedDestinationAsNames(hashMap3, pdfWriter4);
        com.lowagie.text.pdf.PdfPKCS7.X509Name.DefaultSymbols = hashMap3;
        pdfAcroForm1.addFieldTemplates(hashMap3);
        com.lowagie.text.pdf.BaseFont baseFont10 = null;
        com.lowagie.text.Font font13 = new com.lowagie.text.Font(baseFont10, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont15 = font13.getCalculatedBaseFont(false);
        java.lang.String[] str_array16 = baseFont15.getDifferences();
        try {
            com.lowagie.text.pdf.PdfFormField pdfFormField22 = pdfAcroForm1.addMultiLineTextField("<?xpacket begin=\"﻿\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?>\n", "application", baseFont15, (float) (byte) 10, (float) 301, (float) 302, (float) 1651532643, (float) 496);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertEquals(false, b2);
        assertNotNull(hashMap3);
        assertNotNull(pdfDictionary5);
        assertNotNull(baseFont15);
        assertNotNull(str_array16);
    }

    @Test
    void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test383");
        try {
            byte[] byte_array1 = com.lowagie.text.pdf.BarcodeEAN.getBarsSupplemental2("defaultdir");
            fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test384");
        com.lowagie.text.pdf.PdfContentByte pdfContentByte0 = null;
        com.lowagie.text.pdf.FontMapper fontMapper3 = null;
        try {
            com.lowagie.text.pdf.PdfGraphics2D pdfGraphics2D7 = new com.lowagie.text.pdf.PdfGraphics2D(pdfContentByte0, (float) (short) 1, 29.0f, fontMapper3, true, true, (float) (byte) 60);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test385");
        com.lowagie.text.pdf.PdfName[] pdfName_array0 = com.lowagie.text.pdf.internal.PdfViewerPreferencesImp.PRINTSCALING_PREFERENCES;
        assertNotNull(pdfName_array0);
    }

    @Test
    void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test386");
        com.lowagie.text.Chapter chapter1 = new com.lowagie.text.Chapter((int) (short) -1);
        com.lowagie.text.MarkedSection markedSection2 = chapter1.addMarkedSection();
        com.lowagie.text.Chapter chapter4 = new com.lowagie.text.Chapter((int) (short) -1);
        com.lowagie.text.MarkedSection markedSection5 = chapter4.addMarkedSection();
        markedSection5.setIndentation((float) (byte) -1);
        markedSection5.setIndentationRight((float) (byte) 10);
        markedSection2.setTitle((com.lowagie.text.MarkedObject) markedSection5);
        markedSection5.setIndentationLeft((-11.660001f));
        assertNotNull(markedSection2);
        assertNotNull(markedSection5);
    }

    @Test
    void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test387");
        java.lang.String str0 = com.lowagie.text.xml.xmp.PdfA1Schema.DEFAULT_XPATH_URI;
        assertEquals("http://www.aiim.org/pdfa/ns/id/", str0, "'" + str0 + "' != '" + "http://www.aiim.org/pdfa/ns/id/" + "'");
    }

    @Test
    void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test388");
        com.lowagie.text.pdf.ByteBuffer byteBuffer0 = new com.lowagie.text.pdf.ByteBuffer();
    }

    @Test
    void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test389");
        com.lowagie.text.pdf.IntHashtable intHashtable0 = new com.lowagie.text.pdf.IntHashtable();
        boolean b2 = intHashtable0.containsValue(1785737760);
        int i5 = intHashtable0.put(3, 5);
        assertEquals(false, b2);
        assertEquals(0, i5);
    }

    @Test
    void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test390");
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
        com.lowagie.text.pdf.ByteBuffer byteBuffer46 = new com.lowagie.text.pdf.ByteBuffer(1564);
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields48 = new com.lowagie.text.pdf.PdfCopyFields((java.io.OutputStream) byteBuffer46, 'Ã');
        com.lowagie.text.pdf.ByteBuffer byteBuffer50 = byteBuffer46.append(24);
        try {
            com.lowagie.text.pdf.Pfm2afm.convert(randomAccessFileOrArray43, (java.io.OutputStream) byteBuffer50);
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
        assertNotNull(byteBuffer50);
    }

    @Test
    void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test391");
        int i0 = com.lowagie.text.pdf.AcroFields.FIELD_TYPE_PUSHBUTTON;
        assertEquals(1, i0);
    }

    @Test
    void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test392");
        com.lowagie.text.Rectangle rectangle0 = com.lowagie.text.PageSize.B4;
        try {
            rectangle0.setBorderWidth((float) 12);
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        assertNotNull(rectangle0);
    }

    @Test
    void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test393");
        java.lang.String str1 = com.lowagie.text.pdf.XfaForm.Xml2Som.getShortName("http://ns.adobe.com/xap/1.0/mm/");
        assertEquals("http://ns.adobe.com/xap/1.0/mm/", str1, "'" + str1 + "' != '" + "http://ns.adobe.com/xap/1.0/mm/" + "'");
    }

    @Test
    void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test394");
        byte[] byte_array2 = com.lowagie.text.pdf.PdfEncodings.convertToBytes("", "UTF-16BE");
        try {
            com.lowagie.text.Jpeg jpeg5 = new com.lowagie.text.Jpeg(byte_array2, (float) 764, (float) 128);
            fail("Expected exception of type com.lowagie.text.BadElementException");
        } catch (com.lowagie.text.BadElementException e) {
        }
        assertNotNull(byte_array2);
    }

    @Test
    void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test395");
        com.lowagie.text.pdf.Barcode128 barcode128_0 = new com.lowagie.text.pdf.Barcode128();
        com.lowagie.text.pdf.PdfContentByte pdfContentByte1 = null;
        java.awt.Color color5 = java.awt.Color.blue;
        com.lowagie.text.Font font6 = new com.lowagie.text.Font(0, (float) 3, 0, color5);
        java.awt.Color color11 = java.awt.Color.GREEN;
        java.awt.Color color12 = java.awt.Color.getColor("UnicodeBig", color11);
        com.lowagie.text.Font font13 = new com.lowagie.text.Font(1, (float) (byte) -1, (-1), color12);
        try {
            com.lowagie.text.pdf.PdfTemplate pdfTemplate14 = barcode128_0.createTemplateWithBarcode(pdfContentByte1, color5, color12);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(color5);
        assertNotNull(color11);
        assertNotNull(color12);
    }

    @Test
    void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test396");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.OPENACTION;
        com.lowagie.text.pdf.PdfObject pdfObject1 = com.lowagie.text.pdf.PdfReader.killIndirect((com.lowagie.text.pdf.PdfObject) pdfName0);
        assertNotNull(pdfName0);
        assertNotNull(pdfObject1);
    }

    @Test
    void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test397");
        java.lang.String str2 = com.lowagie.text.factories.RomanNumberFactory.getString((int) (byte) 9, false);
        assertEquals("IX", str2, "'" + str2 + "' != '" + "IX" + "'");
    }

    @Test
    void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test398");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.IDENTITY;
        assertNotNull(pdfName0);
    }

    @Test
    void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test399");
        int i0 = com.lowagie.text.pdf.RadioCheckField.TYPE_CROSS;
        assertEquals(3, i0);
    }

    @Test
    void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test400");
        int i0 = com.lowagie.text.pdf.RadioCheckField.TYPE_STAR;
        assertEquals(6, i0);
    }

    @Test
    void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test401");
        int i0 = com.lowagie.text.pdf.collection.PdfCollectionField.NUMBER;
        assertEquals(2, i0);
    }

    @Test
    void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test402");
        int i0 = com.lowagie.text.pdf.BaseField.COMB;
        assertEquals(16777216, i0);
    }

    @Test
    void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test403");
        com.lowagie.text.pdf.PdfOutline pdfOutline0 = null;
        com.lowagie.text.pdf.PdfAction pdfAction3 = new com.lowagie.text.pdf.PdfAction("plainwidth", 3);
        com.lowagie.text.pdf.PdfString pdfString4 = new com.lowagie.text.pdf.PdfString();
        try {
            com.lowagie.text.pdf.PdfOutline pdfOutline6 = new com.lowagie.text.pdf.PdfOutline(pdfOutline0, pdfAction3, pdfString4, false);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test404");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        try {
            int i7 = type3Font5.getWidth("page-break-after");
            fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        assertNotNull(char_array3);
    }

    @Test
    void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test405");
        com.lowagie.text.Font font1 = null;
        com.lowagie.text.Footnote footnote2 = new com.lowagie.text.Footnote("", font1);
        com.lowagie.text.HeaderFooter headerFooter4 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote2, true);
        headerFooter4.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle7 = headerFooter4.rotate();
        com.lowagie.text.Rectangle rectangle8 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter4);
        com.lowagie.text.Document document9 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter4);
        boolean b11 = document9.addTitle("false");
        assertNotNull(rectangle7);
        assertEquals(false, b11);
    }

    @Test
    void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test406");
        java.io.InputStream inputStream0 = null;
        com.lowagie.text.pdf.PdfContentByte pdfContentByte1 = null;
        com.lowagie.text.pdf.codec.wmf.MetaDo metaDo2 = new com.lowagie.text.pdf.codec.wmf.MetaDo(inputStream0, pdfContentByte1);
        try {
            boolean b4 = metaDo2.isNullStrokeFill(true);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test407");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Cell cell5 = com.lowagie.text.factories.ElementFactory.getCell(properties1);
        boolean b6 = cell5.isUseBorderPadding();
        cell5.setUseAscender(false);
        try {
            cell5.setWidth("plainwidth");
            fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(cell5);
        assertEquals(false, b6);
    }

    @Test
    void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test408");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ONECOLUMN;
        assertNotNull(pdfName0);
    }

    @Test
    void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test409");
        com.lowagie.text.pdf.PdfReader pdfReader2 = null;
        byte[] byte_array7 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream8 = new com.lowagie.text.pdf.PRStream(pdfReader2, byte_array7);
        com.lowagie.text.pdf.PdfReader pdfReader9 = null;
        byte[] byte_array14 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream15 = new com.lowagie.text.pdf.PRStream(pdfReader9, byte_array14);
        pRStream8.setData(byte_array14, false, (int) (byte) 100);
        byte[] byte_array19 = pRStream8.getBytes();
        boolean b20 = pRStream8.isPages();
        com.lowagie.text.pdf.PdfReader pdfReader21 = null;
        byte[] byte_array26 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream27 = new com.lowagie.text.pdf.PRStream(pdfReader21, byte_array26);
        com.lowagie.text.pdf.PdfReader pdfReader28 = null;
        byte[] byte_array33 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream34 = new com.lowagie.text.pdf.PRStream(pdfReader28, byte_array33);
        pRStream27.setData(byte_array33, false, (int) (byte) 100);
        byte[] byte_array38 = pRStream27.getBytes();
        pRStream8.setData(byte_array38);
        byte[] byte_array42 = new byte[]{(byte) 100, (byte) 10};
        com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray43 = new com.lowagie.text.pdf.RandomAccessFileOrArray(byte_array42);
        byte[] byte_array44 = com.lowagie.text.pdf.PdfReader.getStreamBytes(pRStream8, randomAccessFileOrArray43);
        try {
            java.lang.Object[] obj_array45 = com.lowagie.text.pdf.BaseFont.getAllFontNames("defaultdir", "convert2pdfp", byte_array44);
            fail("Expected exception of type com.lowagie.text.DocumentException");
        } catch (com.lowagie.text.DocumentException e) {
        }
        assertNotNull(byte_array7);
        assertNotNull(byte_array14);
        assertNotNull(byte_array19);
        assertEquals(false, b20);
        assertNotNull(byte_array26);
        assertNotNull(byte_array33);
        assertNotNull(byte_array38);
        assertNotNull(byte_array42);
        assertNotNull(byte_array44);
    }

    @Test
    void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test410");
        com.lowagie.text.pdf.PdfOutline pdfOutline0 = null;
        com.lowagie.text.Chunk chunk1 = new com.lowagie.text.Chunk();
        com.lowagie.text.Image image2 = chunk1.getImage();
        float f3 = chunk1.getCharacterSpacing();
        com.lowagie.text.pdf.PdfAction pdfAction5 = new com.lowagie.text.pdf.PdfAction("Cp1250");
        com.lowagie.text.Chunk chunk6 = chunk1.setAction(pdfAction5);
        com.lowagie.text.pdf.PdfAction pdfAction9 = new com.lowagie.text.pdf.PdfAction("none", false);
        com.lowagie.text.Chunk chunk10 = chunk1.setAction(pdfAction9);
        try {
            com.lowagie.text.pdf.PdfOutline pdfOutline13 = new com.lowagie.text.pdf.PdfOutline(pdfOutline0, pdfAction9, "xmp:Thumbnails", true);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNull(image2);
        assertEquals(0.0f, f3);
        assertNotNull(chunk6);
        assertNotNull(chunk10);
    }

    @Test
    void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test411");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.CUEPOINTS;
        assertNotNull(pdfName0);
    }

    @Test
    void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test412");
        int i0 = com.lowagie.text.pdf.parser.Matrix.I33;
        assertEquals(8, i0);
    }

    @Test
    void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test413");
        int i0 = com.lowagie.text.pdf.RadioCheckField.TYPE_CHECK;
        assertEquals(1, i0);
    }

    @Test
    void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test414");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_SETTEXTCHAREXTRA;
        assertEquals(264, i0);
    }

    @Test
    void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test415");
        int i1 = com.lowagie.text.Meta.getType("grayfill");
        assertEquals(0, i1);
    }

    @Test
    void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test416");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PRINT;
        assertNotNull(pdfName0);
    }

    @Test
    void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test417");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.SHIFT_JIS;
        assertNotNull(pdfName0);
    }

    @Test
    void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test418");
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
        com.lowagie.text.Font font49 = null;
        com.lowagie.text.Footnote footnote50 = new com.lowagie.text.Footnote("", font49);
        com.lowagie.text.HeaderFooter headerFooter52 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote50, true);
        headerFooter52.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle55 = headerFooter52.rotate();
        com.lowagie.text.Rectangle rectangle56 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter52);
        com.lowagie.text.Document document57 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter52);
        com.lowagie.text.pdf.PdfFileSpecification pdfFileSpecification59 = null;
        try {
            com.lowagie.text.pdf.PdfAnnotation pdfAnnotation60 = com.lowagie.text.pdf.PdfAnnotation.createFileAttachment(pdfWriter31, (com.lowagie.text.Rectangle) headerFooter52, "page-break-before", pdfFileSpecification59);
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
        assertNotNull(rectangle55);
    }

    @Test
    void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test419");
        int i0 = com.lowagie.text.pdf.PdfContentByte.ALIGN_RIGHT;
        assertEquals(2, i0);
    }

    @Test
    void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test420");
        java.lang.String str0 = com.lowagie.text.pdf.XfaForm.XFA_DATA_SCHEMA;
        assertEquals("http://www.xfa.org/schema/xfa-data/1.0/", str0, "'" + str0 + "' != '" + "http://www.xfa.org/schema/xfa-data/1.0/" + "'");
    }

    @Test
    void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test421");
        java.io.OutputStream outputStream0 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields2 = new com.lowagie.text.pdf.PdfCopyFields(outputStream0, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = pdfCopyFields2.getWriter();
        pdfWriter3.setFullCompression();
        com.lowagie.text.pdf.PdfReader pdfReader5 = null;
        byte[] byte_array10 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream11 = new com.lowagie.text.pdf.PRStream(pdfReader5, byte_array10);
        com.lowagie.text.pdf.PdfReader pdfReader12 = null;
        byte[] byte_array17 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream18 = new com.lowagie.text.pdf.PRStream(pdfReader12, byte_array17);
        pRStream11.setData(byte_array17, false, (int) (byte) 100);
        com.lowagie.text.pdf.PdfWriter pdfWriter22 = null;
        com.lowagie.text.Font font24 = null;
        com.lowagie.text.Footnote footnote25 = new com.lowagie.text.Footnote("", font24);
        com.lowagie.text.HeaderFooter headerFooter27 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote25, true);
        headerFooter27.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle30 = headerFooter27.rotate();
        float[][] f_array_array32 = new float[][]{};
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation33 = com.lowagie.text.pdf.PdfAnnotation.createInk(pdfWriter22, (com.lowagie.text.Rectangle) headerFooter27, "widths", f_array_array32);
        boolean b34 = pdfAnnotation33.isOutlineTree();
        int i35 = pdfAnnotation33.getPlaceInPage();
        com.lowagie.text.pdf.PRStream pRStream36 = new com.lowagie.text.pdf.PRStream(pRStream11, (com.lowagie.text.pdf.PdfDictionary) pdfAnnotation33);
        try {
            pdfWriter3.addAnnotation(pdfAnnotation33);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfWriter3);
        assertNotNull(byte_array10);
        assertNotNull(byte_array17);
        assertNotNull(rectangle30);
        assertNotNull(f_array_array32);
        assertNotNull(pdfAnnotation33);
        assertEquals(false, b34);
        assertEquals(i35, (-1));
    }

    @Test
    void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test422");
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
        byte[] byte_array25 = null;
        com.lowagie.text.pdf.PdfReader pdfReader26 = null;
        byte[] byte_array31 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream32 = new com.lowagie.text.pdf.PRStream(pdfReader26, byte_array31);
        com.lowagie.text.pdf.PdfReader pdfReader33 = null;
        byte[] byte_array38 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream39 = new com.lowagie.text.pdf.PRStream(pdfReader33, byte_array38);
        pRStream32.setData(byte_array38, false, (int) (byte) 100);
        com.lowagie.text.ImgJBIG2 imgJBIG2_43 = new com.lowagie.text.ImgJBIG2(4, 1564, byte_array25, byte_array38);
        int i44 = imgJBIG2_43.getCompressionLevel();
        java.lang.String str45 = imgJBIG2_43.getAlt();
        imgJBIG2_43.setOriginalType((int) 'Ë');
        try {
            imgJBIG2_20.setImageMask((com.lowagie.text.Image) imgJBIG2_43);
            fail("Expected exception of type com.lowagie.text.DocumentException");
        } catch (com.lowagie.text.DocumentException e) {
        }
        assertNotNull(byte_array8);
        assertNotNull(byte_array15);
        assertEquals(0, i21);
        assertNull(i_array22);
        assertNotNull(byte_array31);
        assertNotNull(byte_array38);
        assertEquals(i44, (-1));
        assertNull(str45);
    }

    @Test
    void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test423");
        java.lang.String str1 = com.lowagie.text.factories.GreekAlphabetFactory.getLowerCaseString(262144);
        assertEquals("sybp", str1, "'" + str1 + "' != '" + "sybp" + "'");
    }

    @Test
    void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test424");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.Font font2 = null;
        com.lowagie.text.Footnote footnote3 = new com.lowagie.text.Footnote("", font2);
        com.lowagie.text.HeaderFooter headerFooter5 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote3, true);
        headerFooter5.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle8 = headerFooter5.rotate();
        float[][] f_array_array10 = new float[][]{};
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation11 = com.lowagie.text.pdf.PdfAnnotation.createInk(pdfWriter0, (com.lowagie.text.Rectangle) headerFooter5, "widths", f_array_array10);
        boolean b12 = pdfAnnotation11.isOutlineTree();
        com.lowagie.text.pdf.PdfBorderArray pdfBorderArray13 = null;
        pdfAnnotation11.setBorder(pdfBorderArray13);
        assertNotNull(rectangle8);
        assertNotNull(f_array_array10);
        assertNotNull(pdfAnnotation11);
        assertEquals(false, b12);
    }

    @Test
    void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test425");
        java.io.InputStream inputStream0 = null;
        com.lowagie.text.pdf.PdfContentByte pdfContentByte1 = null;
        com.lowagie.text.pdf.codec.wmf.MetaDo metaDo2 = new com.lowagie.text.pdf.codec.wmf.MetaDo(inputStream0, pdfContentByte1);
        try {
            metaDo2.outputText(1024, (int) '4', (int) (byte) 9, (int) (byte) 47, (int) 'c', 1791, (int) (byte) 47, "dc:title");
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test426");
        com.lowagie.text.Rectangle rectangle0 = com.lowagie.text.PageSize.FLSE;
        assertNotNull(rectangle0);
    }

    @Test
    void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test427");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.MK;
        assertNotNull(pdfName0);
    }

    @Test
    void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test428");
        com.lowagie.text.pdf.PdfWriter.PdfBody.PdfCrossReference pdfCrossReference3 = new com.lowagie.text.pdf.PdfWriter.PdfBody.PdfCrossReference(4, 531, 1785737760);
        com.lowagie.text.pdf.PdfWriter.PdfBody.PdfCrossReference pdfCrossReference7 = new com.lowagie.text.pdf.PdfWriter.PdfBody.PdfCrossReference(4, 531, 1785737760);
        int i8 = pdfCrossReference3.compareTo(pdfCrossReference7);
        assertEquals(0, i8);
    }

    @Test
    void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test429");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        float f3 = pdfPCell2.getIndent();
        com.lowagie.text.pdf.PdfPTable pdfPTable4 = pdfPCell2.getTable();
        pdfPCell2.setRowspan(34);
        float f7 = pdfPCell2.getLeading();
        assertNotNull(pdfPCell2);
        assertEquals(0.0f, f3);
        assertNull(pdfPTable4);
        assertEquals(0.0f, f7);
    }

    @Test
    void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test430");
        com.lowagie.text.Font font1 = null;
        com.lowagie.text.Footnote footnote2 = new com.lowagie.text.Footnote("", font1);
        com.lowagie.text.HeaderFooter headerFooter4 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote2, true);
        headerFooter4.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle7 = headerFooter4.rotate();
        com.lowagie.text.Rectangle rectangle8 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter4);
        float f9 = rectangle8.getGrayFill();
        assertNotNull(rectangle7);
        assertEquals(0.0f, f9);
    }

    @Test
    void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test431");
        int i0 = com.lowagie.text.pdf.parser.Matrix.I32;
        assertEquals(7, i0);
    }

    @Test
    void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test432");
        com.lowagie.text.pdf.PdfRectangle pdfRectangle3 = new com.lowagie.text.pdf.PdfRectangle((float) (short) -1, (float) '4', (int) (short) 1);
        try {
            com.lowagie.text.pdf.PdfStream pdfStream5 = pdfRectangle3.getAsStream(1564);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
    }

    @Test
    void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test433");
        com.lowagie.text.RectangleReadOnly rectangleReadOnly4 = new com.lowagie.text.RectangleReadOnly((float) (byte) 100, (float) 1336, (float) 'Ë', (float) 9);
        try {
            rectangleReadOnly4.setBorderWidthBottom(0.0f);
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
    }

    @Test
    void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test434");
        com.lowagie.text.Font font5 = com.lowagie.text.FontFactory.getFont("page-break-after", "face", (float) 30);
        com.lowagie.text.ListItem listItem6 = new com.lowagie.text.ListItem("border-bottom-width", font5);
        com.lowagie.text.Anchor anchor7 = new com.lowagie.text.Anchor("plainwidth", font5);
        float f9 = font5.getCalculatedLeading((float) (-1L));
        assertNotNull(font5);
        assertEquals(f9, (-30.0f));
    }

    @Test
    void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test435");
        com.lowagie.text.Rectangle rectangle0 = com.lowagie.text.PageSize.ID_2;
        float f2 = rectangle0.getTop((float) 16777216);
        assertNotNull(rectangle0);
        assertEquals(f2, (-1.6777006E7f));
    }

    @Test
    void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test436");
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
        com.lowagie.text.pdf.PdfArray pdfArray36 = new com.lowagie.text.pdf.PdfArray(f_array12);
        try {
            float[] f_array37 = java.awt.Color.RGBtoHSB(17, 16, (int) '#', f_array12);
            fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        assertNotNull(f_array10);
        assertNotNull(f_array12);
        assertNotNull(f_array18);
        assertNotNull(rectangle27);
        assertNotNull(f_array32);
        assertNotNull(pdfAnnotation33);
        assertNotNull(pdfFunction35);
    }

    @Test
    void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test437");
        com.lowagie.text.pdf.PdfEncodings.clearCmap("http://ns.adobe.com/pdf/1.3/");
    }

    @Test
    void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test438");
        java.awt.Color color7 = java.awt.Color.GREEN;
        java.awt.Color color8 = java.awt.Color.getColor("UnicodeBig", color7);
        com.lowagie.text.Font font9 = new com.lowagie.text.Font(1, (float) (byte) -1, (-1), color8);
        com.lowagie.text.Font font10 = new com.lowagie.text.Font(20, 1.0f, 55, color8);
        java.util.Properties properties13 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b14 = properties13.isEmpty();
        boolean b16 = properties13.contains((java.lang.Object) 14);
        com.lowagie.text.Cell cell17 = com.lowagie.text.factories.ElementFactory.getCell(properties13);
        try {
            float f20 = com.lowagie.text.pdf.PdfSignatureAppearance.fitText(font10, "Q", (com.lowagie.text.Rectangle) cell17, (float) 2048, (int) '#');
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (com.lowagie.text.ExceptionConverter e) {
        }
        assertNotNull(color7);
        assertNotNull(color8);
        assertNotNull(properties13);
        assertEquals(true, b14);
        assertEquals(false, b16);
        assertNotNull(cell17);
    }

    @Test
    void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test439");
        java.awt.Color color3 = java.awt.Color.getHSBColor(100.0f, (float) (short) 1, 100.0f);
        int i4 = color3.getBlue();
        assertNotNull(color3);
        assertEquals(0, i4);
    }

    @Test
    void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test440");
        int i0 = com.lowagie.text.pdf.BaseField.PASSWORD;
        assertEquals(8192, i0);
    }

    @Test
    void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test441");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DOCUMENT;
        assertNotNull(pdfName0);
    }

    @Test
    void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test442");
        int i0 = com.lowagie.text.pdf.PushbuttonField.SCALE_ICON_NEVER;
        assertEquals(2, i0);
    }

    @Test
    void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test443");
        com.lowagie.text.Paragraph paragraph0 = null;
        com.lowagie.text.Chapter chapter2 = new com.lowagie.text.Chapter(paragraph0, 1785737760);
        float f3 = chapter2.getIndentationLeft();
        java.util.Properties properties5 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b6 = properties5.isEmpty();
        com.lowagie.text.Section section7 = com.lowagie.text.factories.ElementFactory.getSection((com.lowagie.text.Section) chapter2, properties5);
        com.lowagie.text.pdf.PdfReader pdfReader8 = null;
        byte[] byte_array13 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream14 = new com.lowagie.text.pdf.PRStream(pdfReader8, byte_array13);
        com.lowagie.text.pdf.PdfReader pdfReader15 = null;
        byte[] byte_array20 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream21 = new com.lowagie.text.pdf.PRStream(pdfReader15, byte_array20);
        pRStream14.setData(byte_array20, false, (int) (byte) 100);
        boolean b25 = properties5.containsKey((java.lang.Object) (byte) 100);
        assertEquals(0.0f, f3);
        assertNotNull(properties5);
        assertEquals(true, b6);
        assertNotNull(section7);
        assertNotNull(byte_array13);
        assertNotNull(byte_array20);
        assertEquals(false, b25);
    }

    @Test
    void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test444");
        int i0 = com.lowagie.text.pdf.AcroFields.Item.WRITE_MERGED;
        assertEquals(1, i0);
    }

    @Test
    void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test445");
        int i0 = com.lowagie.text.pdf.BaseFont.SUPERSCRIPT_OFFSET;
        assertEquals(20, i0);
    }

    @Test
    void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test446");
        java.lang.String str1 = com.lowagie.text.factories.RomanAlphabetFactory.getLowerCaseString((int) (byte) 1);
        assertEquals("a", str1, "'" + str1 + "' != '" + "a" + "'");
    }

    @Test
    void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test447");
        java.net.URL uRL0 = null;
        try {
            com.lowagie.text.Image image1 = com.lowagie.text.ImageLoader.getTiffImage(uRL0);
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (com.lowagie.text.ExceptionConverter e) {
        }
    }

    @Test
    void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test448");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaPen.PS_DASHDOTDOT;
        assertEquals(4, i0);
    }

    @Test
    void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test449");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        byte[] byte_array5 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream6 = new com.lowagie.text.pdf.PRStream(pdfReader0, byte_array5);
        com.lowagie.text.pdf.PdfReader pdfReader7 = null;
        byte[] byte_array12 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream13 = new com.lowagie.text.pdf.PRStream(pdfReader7, byte_array12);
        pRStream6.setData(byte_array12, false, (int) (byte) 100);
        int i17 = pRStream6.getLength();
        try {
            pRStream6.writeLength();
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        assertNotNull(byte_array5);
        assertNotNull(byte_array12);
        assertEquals(4, i17);
    }

    @Test
    void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test450");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.NOTE;
        assertNotNull(pdfName0);
    }

    @Test
    void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test451");
        java.io.OutputStream outputStream0 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields2 = new com.lowagie.text.pdf.PdfCopyFields(outputStream0, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = pdfCopyFields2.getWriter();
        pdfWriter3.setPDFXConformance(262144);
        assertNotNull(pdfWriter3);
    }

    @Test
    void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test452");
        com.lowagie.text.pdf.PdfOutline pdfOutline0 = null;
        com.lowagie.text.Chunk chunk1 = new com.lowagie.text.Chunk();
        com.lowagie.text.Image image2 = chunk1.getImage();
        float f3 = chunk1.getCharacterSpacing();
        com.lowagie.text.pdf.PdfAction pdfAction5 = new com.lowagie.text.pdf.PdfAction("Cp1250");
        com.lowagie.text.Chunk chunk6 = chunk1.setAction(pdfAction5);
        com.lowagie.text.pdf.PdfAction pdfAction9 = new com.lowagie.text.pdf.PdfAction("none", false);
        com.lowagie.text.Chunk chunk10 = chunk1.setAction(pdfAction9);
        java.lang.String str11 = pdfAction9.toString();
        try {
            com.lowagie.text.pdf.PdfOutline pdfOutline13 = new com.lowagie.text.pdf.PdfOutline(pdfOutline0, pdfAction9, "Helvetica-Bold");
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNull(image2);
        assertEquals(0.0f, f3);
        assertNotNull(chunk6);
        assertNotNull(chunk10);
        assertEquals("Dictionary", str11, "'" + str11 + "' != '" + "Dictionary" + "'");
    }

    @Test
    void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test453");
        try {
            com.lowagie.text.pdf.PRTokeniser pRTokeniser1 = new com.lowagie.text.pdf.PRTokeniser("<?xpacket end=\"r\"?>");
            fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
    }

    @Test
    void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test454");
        int i0 = com.lowagie.text.pdf.PdfAction.PREVPAGE;
        assertEquals(2, i0);
    }

    @Test
    void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test455");
        java.awt.Color color5 = java.awt.Color.GREEN;
        float[] f_array6 = com.lowagie.text.pdf.PdfShading.getColorArray(color5);
        com.lowagie.text.Font font7 = com.lowagie.text.FontFactory.getFont("xmp:Nickname", "Helvetica-Oblique", true, (float) 24, 8388608, color5);
        assertNotNull(color5);
        assertNotNull(f_array6);
        assertNotNull(font7);
    }

    @Test
    void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test456");
        java.io.OutputStream outputStream0 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields2 = new com.lowagie.text.pdf.PdfCopyFields(outputStream0, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = pdfCopyFields2.getWriter();
        pdfWriter3.setDuration(302);
        assertNotNull(pdfWriter3);
    }

    @Test
    void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test457");
        com.lowagie.text.Font font1 = null;
        com.lowagie.text.Footnote footnote2 = new com.lowagie.text.Footnote("", font1);
        com.lowagie.text.HeaderFooter headerFooter4 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote2, true);
        headerFooter4.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle7 = headerFooter4.rotate();
        com.lowagie.text.Rectangle rectangle8 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter4);
        com.lowagie.text.Document document9 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter4);
        boolean b12 = document9.addHeader("xmp:Nickname", "columns");
        com.lowagie.text.Rectangle rectangle13 = document9.getPageSize();
        assertNotNull(rectangle7);
        assertEquals(false, b12);
        assertNotNull(rectangle13);
    }

    @Test
    void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test458");
        com.lowagie.text.Table table2 = new com.lowagie.text.Table(13, 1791);
        com.lowagie.text.Cell cell4 = new com.lowagie.text.Cell(false);
        try {
            table2.addCell(cell4, 17, 64);
            fail("Expected exception of type com.lowagie.text.BadElementException");
        } catch (com.lowagie.text.BadElementException e) {
        }
    }

    @Test
    void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test459");
        java.io.InputStream inputStream0 = null;
        com.lowagie.text.pdf.codec.wmf.InputMeta inputMeta1 = new com.lowagie.text.pdf.codec.wmf.InputMeta(inputStream0);
        try {
            java.awt.Color color2 = inputMeta1.readColor();
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test460");
        int i0 = com.lowagie.text.pdf.PdfBorderDictionary.STYLE_BEVELED;
        assertEquals(2, i0);
    }

    @Test
    void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test461");
        int i0 = com.lowagie.text.pdf.PdfWriter.STANDARD_ENCRYPTION_40;
        assertEquals(0, i0);
    }

    @Test
    void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test462");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.CONTACTINFO;
        assertNotNull(pdfName0);
    }

    @Test
    void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test463");
        java.lang.String str0 = com.lowagie.text.ElementTags.BGGREEN;
        assertEquals("bggreen", str0, "'" + str0 + "' != '" + "bggreen" + "'");
    }

    @Test
    void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test464");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.D;
        assertNotNull(pdfName0);
    }

    @Test
    void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test465");
        java.io.InputStream inputStream0 = null;
        com.lowagie.text.pdf.codec.wmf.InputMeta inputMeta1 = new com.lowagie.text.pdf.codec.wmf.InputMeta(inputStream0);
        try {
            int i2 = inputMeta1.readShort();
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test466");
        com.lowagie.text.pdf.codec.wmf.MetaFont metaFont0 = new com.lowagie.text.pdf.codec.wmf.MetaFont();
        java.io.InputStream inputStream1 = null;
        com.lowagie.text.pdf.codec.wmf.InputMeta inputMeta2 = new com.lowagie.text.pdf.codec.wmf.InputMeta(inputStream1);
        try {
            metaFont0.init(inputMeta2);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test467");
        com.lowagie.text.Chapter chapter1 = new com.lowagie.text.Chapter((int) (short) -1);
        com.lowagie.text.MarkedSection markedSection2 = chapter1.addMarkedSection();
        chapter1.setComplete(false);
        int i5 = chapter1.type();
        chapter1.setChapterNumber(2048);
        assertNotNull(markedSection2);
        assertEquals(16, i5);
    }

    @Test
    void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test468");
        int i0 = com.lowagie.text.Jpeg.VALID_MARKER;
        assertEquals(0, i0);
    }

    @Test
    void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test469");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        java.io.OutputStream outputStream7 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields9 = new com.lowagie.text.pdf.PdfCopyFields(outputStream7, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter10 = pdfCopyFields9.getWriter();
        int i11 = pdfWriter10.getCurrentPageNumber();
        pdfWriter10.setLinearPageMode();
        com.lowagie.text.pdf.PdfWriter pdfWriter13 = null;
        char[] char_array16 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font18 = new com.lowagie.text.pdf.Type3Font(pdfWriter13, char_array16, true);
        com.lowagie.text.pdf.Type3Font type3Font20 = new com.lowagie.text.pdf.Type3Font(pdfWriter10, char_array16, false);
        try {
            com.lowagie.text.pdf.hyphenation.TernaryTree.strcpy(char_array3, 322, char_array16, 16384);
            fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        assertNotNull(char_array3);
        assertNotNull(pdfWriter10);
        assertEquals(1, i11);
        assertNotNull(char_array16);
    }

    @Test
    void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test470");
        java.lang.String str0 = com.lowagie.text.ElementTags.LISTSYMBOL;
        assertEquals("listsymbol", str0, "'" + str0 + "' != '" + "listsymbol" + "'");
    }

    @Test
    void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test471");
        com.lowagie.text.pdf.XfaForm xfaForm0 = new com.lowagie.text.pdf.XfaForm();
        com.lowagie.text.pdf.XfaForm.Xml2SomDatasets xml2SomDatasets1 = null;
        xfaForm0.setDatasetsSom(xml2SomDatasets1);
        com.lowagie.text.pdf.AcroFields acroFields4 = null;
        try {
            java.lang.String str5 = xfaForm0.findFieldName("type", acroFields4);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test472");
        com.lowagie.text.pdf.Barcode128 barcode128_0 = new com.lowagie.text.pdf.Barcode128();
        com.lowagie.text.pdf.Barcode39 barcode39_1 = new com.lowagie.text.pdf.Barcode39();
        barcode39_1.setCodeType(0);
        com.lowagie.text.pdf.BarcodeEANSUPP barcodeEANSUPP4 = new com.lowagie.text.pdf.BarcodeEANSUPP((com.lowagie.text.pdf.Barcode) barcode128_0, (com.lowagie.text.pdf.Barcode) barcode39_1);
        barcodeEANSUPP4.setGuardBars(true);
        barcodeEANSUPP4.setSize(100.0f);
        boolean b9 = barcodeEANSUPP4.isGuardBars();
        barcodeEANSUPP4.setSize((float) 10);
        barcodeEANSUPP4.setAltText("tag");
        assertEquals(true, b9);
    }

    @Test
    void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test473");
        java.lang.String str0 = com.lowagie.text.xml.xmp.PdfA1Schema.PART;
        assertEquals("pdfaid:part", str0, "'" + str0 + "' != '" + "pdfaid:part" + "'");
    }

    @Test
    void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test474");
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
        com.lowagie.text.pdf.PdfName pdfName42 = com.lowagie.text.pdf.PdfName.FILESPEC;
        try {
            com.lowagie.text.pdf.PdfIndirectObject pdfIndirectObject44 = pdfWriter4.addToBody((com.lowagie.text.pdf.PdfObject) pdfName42, true);
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
        assertNotNull(pdfName42);
    }

    @Test
    void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test475");
        java.lang.String str0 = com.lowagie.text.pdf.AsianFontMapper.KoreanEncoding_H;
        assertEquals("UniKS-UCS2-H", str0, "'" + str0 + "' != '" + "UniKS-UCS2-H" + "'");
    }

    @Test
    void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test476");
        com.lowagie.text.pdf.parser.Matrix matrix6 = new com.lowagie.text.pdf.parser.Matrix((-1.0f), 22.677166f, (float) (short) 100, (float) 1L, (float) 1L, (float) 526);
        try {
            float f8 = matrix6.get((int) 'c');
            fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test477");
        java.lang.String str0 = com.lowagie.text.ElementTags.NAMED;
        assertEquals("named", str0, "'" + str0 + "' != '" + "named" + "'");
    }

    @Test
    void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test478");
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
        byte[] byte_array34 = new byte[]{(byte) 100, (byte) 10};
        com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray35 = new com.lowagie.text.pdf.RandomAccessFileOrArray(byte_array34);
        try {
            pdfWriter4.addFileAttachment("UTF-16", byte_array34, "lettered", "ZapfDingbats");
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertEquals(0.0f, f30);
        assertNotNull(byte_array34);
    }

    @Test
    void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test479");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        float f3 = pdfPCell2.getIndent();
        com.lowagie.text.pdf.ColumnText columnText4 = null;
        pdfPCell2.setColumn(columnText4);
        float f6 = pdfPCell2.getPaddingBottom();
        assertNotNull(pdfPCell2);
        assertEquals(0.0f, f3);
        assertEquals(2.0f, f6);
    }

    @Test
    void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test480");
        java.lang.String str0 = com.lowagie.text.ElementTags.ALIGN_BASELINE;
        assertEquals("Baseline", str0, "'" + str0 + "' != '" + "Baseline" + "'");
    }

    @Test
    void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test481");
        int i0 = com.lowagie.text.pdf.parser.Matrix.I31;
        assertEquals(6, i0);
    }

    @Test
    void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test482");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_SCALEWINDOWEXT;
        assertEquals(1040, i0);
    }

    @Test
    void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test483");
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
        com.lowagie.text.pdf.PdfDashPattern pdfDashPattern46 = new com.lowagie.text.pdf.PdfDashPattern((float) 0L, (float) 8);
        byte[] byte_array47 = com.lowagie.text.pdf.PdfReader.decodePredictor(byte_array40, (com.lowagie.text.pdf.PdfObject) pdfDashPattern46);
        com.lowagie.text.pdf.PdfReader pdfReader48 = null;
        byte[] byte_array53 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream54 = new com.lowagie.text.pdf.PRStream(pdfReader48, byte_array53);
        com.lowagie.text.pdf.PdfReader pdfReader55 = null;
        byte[] byte_array60 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream61 = new com.lowagie.text.pdf.PRStream(pdfReader55, byte_array60);
        pRStream54.setData(byte_array60, false, (int) (byte) 100);
        byte[] byte_array65 = pRStream54.getBytes();
        boolean b66 = pRStream54.isPages();
        com.lowagie.text.pdf.PdfReader pdfReader67 = null;
        byte[] byte_array72 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream73 = new com.lowagie.text.pdf.PRStream(pdfReader67, byte_array72);
        com.lowagie.text.pdf.PdfReader pdfReader74 = null;
        byte[] byte_array79 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream80 = new com.lowagie.text.pdf.PRStream(pdfReader74, byte_array79);
        pRStream73.setData(byte_array79, false, (int) (byte) 100);
        byte[] byte_array84 = pRStream73.getBytes();
        pRStream54.setData(byte_array84);
        byte[] byte_array88 = new byte[]{(byte) 100, (byte) 10};
        com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray89 = new com.lowagie.text.pdf.RandomAccessFileOrArray(byte_array88);
        byte[] byte_array90 = com.lowagie.text.pdf.PdfReader.getStreamBytes(pRStream54, randomAccessFileOrArray89);
        try {
            com.lowagie.text.pdf.BaseFont baseFont93 = com.lowagie.text.pdf.BaseFont.createFont("table", "Right", false, false, byte_array47, byte_array90, false, false);
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
        assertNotNull(byte_array47);
        assertNotNull(byte_array53);
        assertNotNull(byte_array60);
        assertNotNull(byte_array65);
        assertEquals(false, b66);
        assertNotNull(byte_array72);
        assertNotNull(byte_array79);
        assertNotNull(byte_array84);
        assertNotNull(byte_array88);
        assertNotNull(byte_array90);
    }

    @Test
    void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test484");
        int i0 = com.lowagie.text.pdf.PdfTransition.INBOX;
        assertEquals(7, i0);
    }

    @Test
    void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test485");
        java.lang.String str0 = com.lowagie.text.html.Markup.CSS_VALUE_TEXTALIGNRIGHT;
        assertEquals("right", str0, "'" + str0 + "' != '" + "right" + "'");
    }

    @Test
    void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test486");
        java.security.cert.X509Certificate x509Certificate0 = null;
        try {
            com.lowagie.text.pdf.PdfPKCS7.X509Name x509Name1 = com.lowagie.text.pdf.PdfPKCS7.getIssuerFields(x509Certificate0);
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (com.lowagie.text.ExceptionConverter e) {
        }
    }

    @Test
    void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test487");
        int i0 = com.lowagie.text.pdf.PdfWriter.RUN_DIRECTION_RTL;
        assertEquals(3, i0);
    }

    @Test
    void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test488");
        int i0 = com.lowagie.text.Element.ALIGN_UNDEFINED;
        assertEquals(i0, (-1));
    }

    @Test
    void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test489");
        boolean b0 = com.lowagie.text.pdf.PdfWriter.STRENGTH128BITS;
        assertEquals(true, b0);
    }

    @Test
    void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test490");
        com.lowagie.text.RectangleReadOnly rectangleReadOnly4 = new com.lowagie.text.RectangleReadOnly((float) (byte) 100, (float) 1336, (float) 'Ë', (float) 9);
        try {
            rectangleReadOnly4.setGrayFill((float) 322);
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
    }

    @Test
    void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test491");
        com.lowagie.text.pdf.collection.PdfCollectionField pdfCollectionField2 = new com.lowagie.text.pdf.collection.PdfCollectionField("table", 1078);
    }

    @Test
    void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test492");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_SETBKMODE;
        assertEquals(258, i0);
    }

    @Test
    void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test493");
        int i0 = com.lowagie.text.pdf.AcroFields.FIELD_TYPE_COMBO;
        assertEquals(6, i0);
    }

    @Test
    void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test494");
        java.lang.String str0 = com.lowagie.text.html.Markup.CSS_VALUE_INLINE;
        assertEquals("inline", str0, "'" + str0 + "' != '" + "inline" + "'");
    }

    @Test
    void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test495");
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
        boolean b28 = document19.setMargins((float) 2, 0.0f, (float) 200, (float) 17);
        assertNotNull(pdfWriter8);
        assertEquals(1, i9);
        assertNotNull(rectangle17);
        assertEquals(true, b21);
        assertEquals(true, b28);
    }

    @Test
    void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test496");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PO;
        assertNotNull(pdfName0);
    }

    @Test
    void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test497");
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
        com.lowagie.text.pdf.Barcode128 barcode128_64 = new com.lowagie.text.pdf.Barcode128();
        com.lowagie.text.pdf.BaseFont baseFont65 = barcode128_64.getFont();
        java.awt.Color color67 = java.awt.Color.GREEN;
        java.awt.Color color68 = java.awt.Color.getColor("UnicodeBig", color67);
        java.awt.Color color72 = java.awt.Color.getHSBColor(100.0f, (float) (short) 1, 100.0f);
        int i73 = com.lowagie.text.pdf.ExtendedColor.getType(color72);
        com.lowagie.text.pdf.PdfArray pdfArray74 = com.lowagie.text.pdf.PdfAnnotation.getMKColor(color72);
        java.awt.Image image75 = barcode128_64.createAwtImage(color67, color72);
        com.lowagie.text.Chunk chunk76 = chunk3.setTextRenderMode(1042, (float) 256, color67);
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
        assertNotNull(baseFont65);
        assertNotNull(color67);
        assertNotNull(color68);
        assertNotNull(color72);
        assertEquals(0, i73);
        assertNotNull(pdfArray74);
        assertNotNull(image75);
        assertNotNull(chunk76);
    }

    @Test
    void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test498");
        java.lang.String str0 = com.lowagie.text.html.Markup.CSS_KEY_BORDERWIDTHRIGHT;
        assertEquals("border-right-width", str0, "'" + str0 + "' != '" + "border-right-width" + "'");
    }

    @Test
    void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test499");
        try {
            java.lang.String[] str_array1 = com.lowagie.text.pdf.BaseFont.enumerateTTCNames("dc:date");
            fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
    }

    @Test
    void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test500");
        java.net.URL uRL0 = null;
        try {
            com.lowagie.text.Jpeg jpeg1 = new com.lowagie.text.Jpeg(uRL0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }
}

