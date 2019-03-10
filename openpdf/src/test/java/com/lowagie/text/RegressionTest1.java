package com.lowagie.text;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test001");
        String str0 = com.lowagie.text.pdf.BaseFont.COURIER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Courier" + "'", str0.equals("Courier"));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test002");
        int i0 = com.lowagie.text.pdf.PdfContentByte.LINE_CAP_PROJECTING_SQUARE;
        org.junit.Assert.assertTrue(i0 == 2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test003");
        int i0 = com.lowagie.text.pdf.BaseField.DO_NOT_SCROLL;
        org.junit.Assert.assertTrue(i0 == 8388608);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test004");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfFormField.IF_SCALE_SMALLER;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test005");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier0 = com.lowagie.text.pdf.PdfPKCS7.X509Name.GIVENNAME;
        org.junit.Assert.assertNotNull(aSN1ObjectIdentifier0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test006");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier0 = com.lowagie.text.pdf.PdfPKCS7.X509Name.UID;
        org.junit.Assert.assertNotNull(aSN1ObjectIdentifier0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test007");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PROPERTIES;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test008");
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper0 = new com.lowagie.text.pdf.PdfPageEventHelper();
        com.lowagie.text.pdf.PdfWriter pdfWriter1 = null;
        Document document2 = new Document();
        document2.marginMirroring = false;
        pdfPageEventHelper0.onSectionEnd(pdfWriter1, document2, 10.0f);
        boolean b7 = document2.close;
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test009");
        com.lowagie.text.pdf.collection.PdfTargetDictionary pdfTargetDictionary0 = null;
        com.lowagie.text.pdf.collection.PdfTargetDictionary pdfTargetDictionary1 = new com.lowagie.text.pdf.collection.PdfTargetDictionary(pdfTargetDictionary0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test010");
        String str0 = ElementTags.AUTO_INDENT_ITEMS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "autoindent" + "'", str0.equals("autoindent"));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test011");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.RESOURCES;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test012");
        com.lowagie.text.pdf.PdfName[] pdfName_array0 = com.lowagie.text.pdf.internal.PdfViewerPreferencesImp.NONFULLSCREENPAGEMODE_PREFERENCES;
        org.junit.Assert.assertNotNull(pdfName_array0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test013");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfRectangle pdfRectangle3 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle4 = pdfRectangle3.getRectangle();
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation9 = com.lowagie.text.pdf.PdfAnnotation.createText(pdfWriter0, rectangle4, "content", "ZHPFQ", false, "No message found for Cp1250");
        Document document10 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer11 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer13 = byteBuffer11.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter14 = com.lowagie.text.pdf.PdfWriter.getInstance(document10, (java.io.OutputStream) byteBuffer13);
        com.lowagie.text.pdf.ByteBuffer byteBuffer15 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer17 = byteBuffer15.appendHex((byte) -1);
        pdfAnnotation9.toPdf(pdfWriter14, (java.io.OutputStream) byteBuffer15);
        String[] str_array21 = new String[] { "rel" };
        String[] str_array23 = new String[] { "rel" };
        String[] str_array25 = new String[] { "rel" };
        String[] str_array27 = new String[] { "rel" };
        String[][] str_array_array28 = new String[][] { str_array21, str_array23, str_array25, str_array27 };
        try {
            com.lowagie.text.pdf.PdfFormField pdfFormField30 = com.lowagie.text.pdf.PdfFormField.createCombo(pdfWriter14, false, str_array_array28, 258);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(rectangle4);
        org.junit.Assert.assertNotNull(pdfAnnotation9);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(pdfWriter14);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(str_array21);
        org.junit.Assert.assertNotNull(str_array23);
        org.junit.Assert.assertNotNull(str_array25);
        org.junit.Assert.assertNotNull(str_array27);
        org.junit.Assert.assertNotNull(str_array_array28);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test014");
        int[] i_array0 = com.lowagie.text.pdf.BaseFont.CHAR_RANGE_HEBREW;
        org.junit.Assert.assertNotNull(i_array0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test015");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.FO;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test016");
        String str0 = ElementTags.FILE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "file" + "'", str0.equals("file"));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test017");
        char char0 = com.lowagie.text.pdf.Barcode128.FNC3;
        org.junit.Assert.assertTrue(char0 == 'Ä');
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test018");
        int i0 = com.lowagie.text.pdf.BaseFont.CAPHEIGHT;
        org.junit.Assert.assertTrue(i0 == 2);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test019");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.V2;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test020");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfRectangle pdfRectangle3 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle4 = pdfRectangle3.getRectangle();
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation9 = com.lowagie.text.pdf.PdfAnnotation.createText(pdfWriter0, rectangle4, "content", "ZHPFQ", false, "No message found for Cp1250");
        Document document10 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer11 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer13 = byteBuffer11.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter14 = com.lowagie.text.pdf.PdfWriter.getInstance(document10, (java.io.OutputStream) byteBuffer13);
        com.lowagie.text.pdf.ByteBuffer byteBuffer15 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer17 = byteBuffer15.appendHex((byte) -1);
        pdfAnnotation9.toPdf(pdfWriter14, (java.io.OutputStream) byteBuffer15);
        com.lowagie.text.pdf.PdfReader pdfReader19 = null;
        try {
            com.lowagie.text.pdf.PdfImportedPage pdfImportedPage21 = pdfWriter14.getImportedPage(pdfReader19, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(rectangle4);
        org.junit.Assert.assertNotNull(pdfAnnotation9);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(pdfWriter14);
        org.junit.Assert.assertNotNull(byteBuffer17);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test021");
        try {
            com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray3 = new com.lowagie.text.pdf.RandomAccessFileOrArray("table", true, true);
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test022");
        String str0 = Annotation.CONTENT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "content" + "'", str0.equals("content"));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test023");
        String str0 = com.lowagie.text.xml.xmp.DublinCoreSchema.DEFAULT_XPATH_URI;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://purl.org/dc/elements/1.1/" + "'", str0.equals("http://purl.org/dc/elements/1.1/"));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test024");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_SELECTOBJECT;
        org.junit.Assert.assertTrue(i0 == 301);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test025");
        com.lowagie.text.xml.simpleparser.SimpleXMLDocHandler simpleXMLDocHandler0 = null;
        java.io.InputStream inputStream1 = null;
        try {
            com.lowagie.text.xml.simpleparser.SimpleXMLParser.parse(simpleXMLDocHandler0, inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test026");
        Document document0 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer1 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer3 = byteBuffer1.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter4 = com.lowagie.text.pdf.PdfWriter.getInstance(document0, (java.io.OutputStream) byteBuffer3);
        pdfWriter4.setEncryption(true, "REMOTEGOTO", "xmpMM:VersionID", 561);
        com.lowagie.text.pdf.PdfDestination pdfDestination12 = null;
        try {
            pdfWriter4.addNamedDestination("Right", 100, pdfDestination12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(pdfWriter4);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test027");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_SETBKCOLOR;
        org.junit.Assert.assertTrue(i0 == 513);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test028");
        Section section0 = new Section();
        section0.setNotAddedYet(true);
        String str3 = section0.bookmarkTitle;
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test029");
        Chunk chunk0 = Chunk.NEXTPAGE;
        Chunk chunk2 = chunk0.setTextRise((float) 2048);
        Chunk chunk5 = chunk0.setUnderline((float) '#', (float) 1718909296);
        org.junit.Assert.assertNotNull(chunk0);
        org.junit.Assert.assertNotNull(chunk2);
        org.junit.Assert.assertNotNull(chunk5);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test030");
        com.lowagie.text.pdf.PdfDashPattern pdfDashPattern1 = new com.lowagie.text.pdf.PdfDashPattern((float) 2052);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test031");
        String[] str_array46 = new String[] { "xmpMM:ManagedFrom", "pdfaid:part", "font-size", "ZHPFQ", "autoindent", "JustifyAll", "Times-BoldItalic", "No message found for encoding", "title", "d", "Times-Italic", "d", "xmpMM:DerivedFrom", "inline", "scaledwidth", "UnicodeBig", "absolutex", "producer", "HYPHENATION", "row", "width", "padding-bottom", "Cp1252", "padding-left", "producer", "urx", "dc:publisher", "Times-Italic", "font", "font-size", "ACTION", "UnicodeBig", "page", "HYPHENATION", ". ", "producer", "bordercolor", "font", "Rectangle: 100.0x52.0 (rot: 0 degrees)", "dc:publisher", "Courier", "autoindent", "Right", "tablefitspage", "row", "encoding" };
        java.util.ArrayList<String> arraylist_str47 = new java.util.ArrayList<String>();
        boolean b48 = java.util.Collections.addAll((java.util.Collection<String>) arraylist_str47, str_array46);
        Object[] obj_array49 = arraylist_str47.toArray();
        org.junit.Assert.assertNotNull(str_array46);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(obj_array49);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test032");
        int i0 = com.lowagie.text.pdf.BarcodeDatamatrix.DM_ERROR_INVALID_SQUARE;
        org.junit.Assert.assertTrue(i0 == 3);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test033");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.FONTMATRIX;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test034");
        String str0 = ElementTags.DEFAULTDIR;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "defaultdir" + "'", str0.equals("defaultdir"));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test035");
        com.lowagie.text.pdf.PdfNumber pdfNumber1 = new com.lowagie.text.pdf.PdfNumber(1.0f);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test036");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ROTATE;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test037");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.COURIER_OBLIQUE;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test038");
        String str0 = Chunk.COLOR;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "COLOR" + "'", str0.equals("COLOR"));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test039");
        com.lowagie.text.pdf.PdfContentByte pdfContentByte0 = null;
        com.lowagie.text.pdf.VerticalText verticalText1 = new com.lowagie.text.pdf.VerticalText(pdfContentByte0);
        try {
            int i2 = verticalText1.go();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test040");
        int i0 = com.lowagie.text.pdf.PdfWriter.ALLOW_SCREENREADERS;
        org.junit.Assert.assertTrue(i0 == 512);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test041");
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper0 = new com.lowagie.text.pdf.PdfPageEventHelper();
        com.lowagie.text.pdf.PdfWriter pdfWriter1 = null;
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper2 = new com.lowagie.text.pdf.PdfPageEventHelper();
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = null;
        Document document4 = new Document();
        document4.marginMirroring = false;
        pdfPageEventHelper2.onSectionEnd(pdfWriter3, document4, 10.0f);
        RectangleReadOnly rectangleReadOnly13 = new RectangleReadOnly((-1.0f), (float) (short) -1, (-1.0f), 0.0f);
        java.awt.Color color14 = rectangleReadOnly13.borderColorTop;
        pdfPageEventHelper0.onGenericTag(pdfWriter1, document4, (Rectangle) rectangleReadOnly13, "Times-Italic");
        String str17 = document4.getHtmlStyleClass();
        org.junit.Assert.assertNull(color14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test042");
        int i0 = Element.CELL;
        org.junit.Assert.assertTrue(i0 == 20);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test043");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.SV;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test044");
        com.lowagie.text.pdf.MultiColumnText multiColumnText2 = new com.lowagie.text.pdf.MultiColumnText((float) 561, (float) 2048);
        multiColumnText2.setArabicOptions(1574);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test045");
        String[] str_array2 = new String[] { "padding-left", "com/lowagie/text/pdf/fonts/" };
        java.util.ArrayList<String> arraylist_str3 = new java.util.ArrayList<String>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<String>) arraylist_str3, str_array2);
        java.util.Iterator<String> iterator_str5 = arraylist_str3.iterator();
        org.junit.Assert.assertNotNull(str_array2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(iterator_str5);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test046");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PATTERN;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test047");
        String str0 = ElementTags.COLSPAN;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "colspan" + "'", str0.equals("colspan"));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test048");
        int i0 = com.lowagie.text.pdf.PdfTransition.LRWIPE;
        org.junit.Assert.assertTrue(i0 == 9);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test049");
        int i0 = com.lowagie.text.pdf.PdfWriter.PageLayoutTwoPageLeft;
        org.junit.Assert.assertTrue(i0 == 16);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test050");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfWriter.PAGE_CLOSE;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test051");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.NEAR;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test052");
        com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray1 = new com.lowagie.text.pdf.RandomAccessFileOrArray("");
        int i3 = randomAccessFileOrArray1.skipBytes(3);
        double d4 = randomAccessFileOrArray1.readDoubleLE();
        java.nio.ByteBuffer byteBuffer5 = randomAccessFileOrArray1.getNioByteBuffer();
        org.junit.Assert.assertTrue(i3 == 3);
        org.junit.Assert.assertTrue(d4 == 2.5171752293465407E180d);
        org.junit.Assert.assertNotNull(byteBuffer5);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test053");
        com.lowagie.text.pdf.draw.DrawInterface drawInterface0 = null;
        Chunk chunk1 = new Chunk(drawInterface0);
        boolean b2 = chunk1.hasAttributes();
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test054");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TOOLBAR;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test055");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.NAMES;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test056");
        Rectangle rectangle0 = PageSize.ROYAL_QUARTO;
        int i1 = rectangle0.getBorder();
        org.junit.Assert.assertNotNull(rectangle0);
        org.junit.Assert.assertTrue(i1 == (-1));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test057");
        com.lowagie.text.pdf.DefaultFontMapper.BaseFontParameters baseFontParameters1 = new com.lowagie.text.pdf.DefaultFontMapper.BaseFontParameters("Courier");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test058");
        int i2 = Utilities.convertToUtf32('Ç', '翿');
        org.junit.Assert.assertTrue(i2 == (-56377345));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test059");
        Footnote footnote0 = new Footnote();
        java.util.HashMap hashMap1 = footnote0.footnoteAttributes;
        Document document2 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer3 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer5 = byteBuffer3.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter6 = com.lowagie.text.pdf.PdfWriter.getInstance(document2, (java.io.OutputStream) byteBuffer5);
        com.lowagie.text.pdf.OutputStreamCounter outputStreamCounter7 = new com.lowagie.text.pdf.OutputStreamCounter((java.io.OutputStream) byteBuffer5);
        try {
            com.lowagie.text.pdf.SimpleNamedDestination.exportToXML(hashMap1, (java.io.OutputStream) byteBuffer5, "tablefitspage", true);
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException");
        } catch (java.io.UnsupportedEncodingException e) {
        }
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(pdfWriter6);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test060");
        Document document0 = new Document();
        document0.marginMirroring = false;
        int i3 = document0.chapternumber;
        boolean b4 = document0.newPage();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test061");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField4 = com.lowagie.text.pdf.PdfFormField.createTextField(pdfWriter0, true, false, 258);
        pdfFormField4.setButton(0);
        pdfFormField4.setName("HSCALE");
        com.lowagie.text.pdf.PdfName pdfName9 = null;
        com.lowagie.text.pdf.PdfString pdfString10 = pdfFormField4.getAsString(pdfName9);
        com.lowagie.text.pdf.PdfWriter pdfWriter11 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField15 = com.lowagie.text.pdf.PdfFormField.createTextField(pdfWriter11, true, false, 258);
        pdfFormField15.setButton(0);
        pdfFormField15.setName("HSCALE");
        com.lowagie.text.pdf.PdfName pdfName20 = null;
        com.lowagie.text.pdf.PdfString pdfString21 = pdfFormField15.getAsString(pdfName20);
        try {
            pdfFormField4.setPopup((com.lowagie.text.pdf.PdfAnnotation) pdfFormField15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(pdfFormField4);
        org.junit.Assert.assertNull(pdfString10);
        org.junit.Assert.assertNotNull(pdfFormField15);
        org.junit.Assert.assertNull(pdfString21);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test062");
        com.lowagie.text.factories.ElementFactory elementFactory0 = new com.lowagie.text.factories.ElementFactory();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test063");
        try {
            com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray1 = new com.lowagie.text.pdf.RandomAccessFileOrArray("Times-Italic");
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test064");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DEFAULTGRAY;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test065");
        String str0 = ElementTags.LISTSYMBOL;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "listsymbol" + "'", str0.equals("listsymbol"));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test066");
        try {
            byte[] byte_array1 = com.lowagie.text.pdf.BarcodeEAN.getBarsSupplemental2("xmpMM:DerivedFrom");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test067");
        com.lowagie.text.pdf.PdfDocument.Indentation indentation0 = new com.lowagie.text.pdf.PdfDocument.Indentation();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test068");
        int i0 = Element.CHUNK;
        org.junit.Assert.assertTrue(i0 == 10);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test069");
        com.lowagie.text.pdf.events.PdfPTableEventForwarder pdfPTableEventForwarder0 = new com.lowagie.text.pdf.events.PdfPTableEventForwarder();
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = null;
        float[] f_array6 = new float[] { (byte) 100, 10, (-1L), 0 };
        float[] f_array11 = new float[] { (byte) 100, 10, (-1L), 0 };
        float[] f_array16 = new float[] { (byte) 100, 10, (-1L), 0 };
        float[] f_array21 = new float[] { (byte) 100, 10, (-1L), 0 };
        float[] f_array26 = new float[] { (byte) 100, 10, (-1L), 0 };
        float[][] f_array_array27 = new float[][] { f_array6, f_array11, f_array16, f_array21, f_array26 };
        com.lowagie.text.pdf.PdfRectangle pdfRectangle30 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle31 = pdfRectangle30.getRectangle();
        float[] f_array32 = new float[] {};
        boolean b33 = pdfRectangle30.add(f_array32);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte36 = null;
        com.lowagie.text.pdf.PdfContentByte[] pdfContentByte_array37 = new com.lowagie.text.pdf.PdfContentByte[] { pdfContentByte36 };
        pdfPTableEventForwarder0.tableLayout(pdfPTable1, f_array_array27, f_array32, (int) (short) -1, 3, pdfContentByte_array37);
        org.junit.Assert.assertNotNull(f_array6);
        org.junit.Assert.assertNotNull(f_array11);
        org.junit.Assert.assertNotNull(f_array16);
        org.junit.Assert.assertNotNull(f_array21);
        org.junit.Assert.assertNotNull(f_array26);
        org.junit.Assert.assertNotNull(f_array_array27);
        org.junit.Assert.assertNotNull(rectangle31);
        org.junit.Assert.assertNotNull(f_array32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(pdfContentByte_array37);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test070");
        int i0 = com.lowagie.text.pdf.ArabicLigaturizer.DIGITS_EN2AN_INIT_AL;
        org.junit.Assert.assertTrue(i0 == 128);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test071");
        String str0 = Annotation.URL;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "url" + "'", str0.equals("url"));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test072");
        com.lowagie.text.pdf.PdfSigGenericPKCS.VeriSign veriSign0 = new com.lowagie.text.pdf.PdfSigGenericPKCS.VeriSign();
        veriSign0.setContact("text-decoration");
        int[] i_array3 = Jpeg.UNSUPPORTED_MARKERS;
        veriSign0.setByteRange(i_array3);
        org.junit.Assert.assertNotNull(i_array3);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test073");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.STRF;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test074");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PRESERVERB;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test075");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfRectangle pdfRectangle3 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle4 = pdfRectangle3.getRectangle();
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation9 = com.lowagie.text.pdf.PdfAnnotation.createText(pdfWriter0, rectangle4, "content", "ZHPFQ", false, "No message found for Cp1250");
        Document document10 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer11 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer13 = byteBuffer11.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter14 = com.lowagie.text.pdf.PdfWriter.getInstance(document10, (java.io.OutputStream) byteBuffer13);
        com.lowagie.text.pdf.ByteBuffer byteBuffer15 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer17 = byteBuffer15.appendHex((byte) -1);
        pdfAnnotation9.toPdf(pdfWriter14, (java.io.OutputStream) byteBuffer15);
        Rectangle rectangle21 = new Rectangle((float) (byte) 100, (float) '4');
        float[] f_array28 = new float[] { 200, (byte) 1, 2052, 1024, 128 };
        float[] f_array34 = new float[] { 200, (byte) 1, 2052, 1024, 128 };
        float[] f_array40 = new float[] { 200, (byte) 1, 2052, 1024, 128 };
        float[] f_array46 = new float[] { 200, (byte) 1, 2052, 1024, 128 };
        float[][] f_array_array47 = new float[][] { f_array28, f_array34, f_array40, f_array46 };
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation48 = com.lowagie.text.pdf.PdfAnnotation.createInk(pdfWriter14, rectangle21, "bordercolor", f_array_array47);
        int[] i_array49 = Jpeg.NOPARAM_MARKERS;
        try {
            int i50 = pdfWriter14.reorderPages(i_array49);
            org.junit.Assert.fail("Expected exception of type com.lowagie.text.DocumentException");
        } catch (DocumentException e) {
        }
        org.junit.Assert.assertNotNull(rectangle4);
        org.junit.Assert.assertNotNull(pdfAnnotation9);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(pdfWriter14);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(f_array28);
        org.junit.Assert.assertNotNull(f_array34);
        org.junit.Assert.assertNotNull(f_array40);
        org.junit.Assert.assertNotNull(f_array46);
        org.junit.Assert.assertNotNull(f_array_array47);
        org.junit.Assert.assertNotNull(pdfAnnotation48);
        org.junit.Assert.assertNotNull(i_array49);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test076");
        String str0 = FontFactory.TIMES_BOLD;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Times-Bold" + "'", str0.equals("Times-Bold"));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test077");
        int i0 = com.lowagie.text.pdf.Barcode.CODE128_RAW;
        org.junit.Assert.assertTrue(i0 == 11);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test078");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.CIDSET;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test079");
        com.lowagie.text.pdf.crypto.ARCFOUREncryption aRCFOUREncryption0 = new com.lowagie.text.pdf.crypto.ARCFOUREncryption();
        byte[] byte_array2 = com.lowagie.text.pdf.crypto.IVGenerator.getIV((int) (byte) 47);
        byte[] byte_array6 = com.lowagie.text.pdf.Barcode128.getBarsCode128Raw("hi!");
        aRCFOUREncryption0.encryptARCFOUR(byte_array2, (int) (byte) 1, (-1), byte_array6, 3);
        try {
            Jpeg jpeg9 = new Jpeg(byte_array2);
            org.junit.Assert.fail("Expected exception of type com.lowagie.text.BadElementException");
        } catch (BadElementException e) {
        }
        org.junit.Assert.assertNotNull(byte_array2);
        org.junit.Assert.assertNotNull(byte_array6);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test080");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DOCOPEN;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test081");
        int i0 = com.lowagie.text.pdf.collection.PdfCollectionField.DESC;
        org.junit.Assert.assertTrue(i0 == 4);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test082");
        com.lowagie.text.pdf.PdfOutline pdfOutline0 = null;
        com.lowagie.text.pdf.PdfDestination pdfDestination1 = null;
        Anchor anchor2 = new Anchor();
        ListItem listItem3 = new ListItem((Phrase) anchor2);
        int i4 = listItem3.getAlignment();
        listItem3.setSpacingBefore((float) 1785737832);
        boolean b7 = listItem3.isNestable();
        try {
            com.lowagie.text.pdf.PdfOutline pdfOutline9 = new com.lowagie.text.pdf.PdfOutline(pdfOutline0, pdfDestination1, (Paragraph) listItem3, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test083");
        int i0 = Rectangle.UNDEFINED;
        org.junit.Assert.assertTrue(i0 == (-1));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test084");
        try {
            com.lowagie.text.pdf.MappedRandomAccessFile mappedRandomAccessFile2 = new com.lowagie.text.pdf.MappedRandomAccessFile("Right", "rel");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test085");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.BLOCKQUOTE;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test086");
        Section section0 = new Section();
        boolean b1 = section0.isTriggerNewPage();
        section0.flushContent();
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test087");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TFOOT;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test088");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PRINTPAGERANGE;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test089");
        Section section0 = new Section();
        boolean b1 = section0.isTriggerNewPage();
        section0.setNotAddedYet(true);
        boolean b4 = section0.isSection();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test090");
        Rectangle rectangle0 = PageSize.ROYAL_OCTAVO;
        try {
            rectangle0.setRight((float) 4194304);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(rectangle0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test091");
        byte[][] byte_array_array0 = com.lowagie.text.pdf.PdfEncodings.CRLF_CID_NEWLINE;
        try {
            com.lowagie.text.pdf.PdfAction pdfAction2 = com.lowagie.text.pdf.PdfAction.createResetForm((Object[]) byte_array_array0, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(byte_array_array0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test092");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfFormField.IF_SCALE_PROPORTIONAL;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test093");
        try {
            com.lowagie.text.pdf.PdfBoolean pdfBoolean1 = new com.lowagie.text.pdf.PdfBoolean("Times-Italic");
            org.junit.Assert.fail("Expected exception of type com.lowagie.text.pdf.BadPdfFormatException");
        } catch (com.lowagie.text.pdf.BadPdfFormatException e) {
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test094");
        java.util.Properties properties0 = null;
        try {
            Anchor anchor1 = com.lowagie.text.factories.ElementFactory.getAnchor(properties0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test095");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_SETPIXEL;
        org.junit.Assert.assertTrue(i0 == 1055);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test096");
        int i0 = com.lowagie.text.pdf.BaseField.PASSWORD;
        org.junit.Assert.assertTrue(i0 == 8192);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test097");
        VersionBean versionBean0 = new VersionBean();
        VersionBean.Version version1 = versionBean0.getVersion();
        String str2 = versionBean0.getTitle();
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test098");
        com.lowagie.text.pdf.hyphenation.HyphenationTree hyphenationTree1 = com.lowagie.text.pdf.hyphenation.Hyphenator.getFileHyphenationTree("autoindent");
        org.junit.Assert.assertNull(hyphenationTree1);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test099");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.RANGE;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test100");
        com.lowagie.text.pdf.GlyphList glyphList0 = new com.lowagie.text.pdf.GlyphList();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test101");
        Section section0 = new Section();
        section0.setIndentationRight((float) 5);
        float f3 = section0.indentation;
        com.lowagie.text.pdf.PdfName pdfName4 = com.lowagie.text.pdf.PdfName.E;
        try {
            boolean b5 = section0.add((Object) pdfName4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (ClassCastException e) {
        }
        org.junit.Assert.assertTrue(f3 == 0.0f);
        org.junit.Assert.assertNotNull(pdfName4);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test102");
        String str0 = com.lowagie.text.xml.xmp.PdfA1Schema.DEFAULT_XPATH_URI;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.aiim.org/pdfa/ns/id/" + "'", str0.equals("http://www.aiim.org/pdfa/ns/id/"));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test103");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_SETTEXTALIGN;
        org.junit.Assert.assertTrue(i0 == 302);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test104");
        int i0 = com.lowagie.text.pdf.BarcodePDF417.PDF417_FORCE_BINARY;
        org.junit.Assert.assertTrue(i0 == 32);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test105");
        java.awt.color.ICC_Profile iCC_Profile0 = null;
        try {
            com.lowagie.text.pdf.PdfICCBased pdfICCBased1 = new com.lowagie.text.pdf.PdfICCBased(iCC_Profile0);
            org.junit.Assert.fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (ExceptionConverter e) {
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test106");
        com.lowagie.text.pdf.crypto.ARCFOUREncryption aRCFOUREncryption0 = new com.lowagie.text.pdf.crypto.ARCFOUREncryption();
        byte[] byte_array2 = com.lowagie.text.pdf.crypto.IVGenerator.getIV((int) (byte) 47);
        byte[] byte_array6 = com.lowagie.text.pdf.Barcode128.getBarsCode128Raw("hi!");
        aRCFOUREncryption0.encryptARCFOUR(byte_array2, (int) (byte) 1, (-1), byte_array6, 3);
        byte[] byte_array10 = com.lowagie.text.pdf.PdfName.encodeName("xmpMM:ManagedFrom");
        byte[] byte_array14 = com.lowagie.text.pdf.crypto.IVGenerator.getIV(0);
        try {
            aRCFOUREncryption0.encryptARCFOUR(byte_array10, (int) 'd', 2851, byte_array14, 262144);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byte_array2);
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertNotNull(byte_array10);
        org.junit.Assert.assertNotNull(byte_array14);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test107");
        com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS pPKMS0 = new com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS();
        byte[] byte_array1 = pPKMS0.getBytes();
        com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS pPKMS2 = new com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS();
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField7 = com.lowagie.text.pdf.PdfFormField.createTextField(pdfWriter3, true, false, 258);
        pdfFormField7.setButton(0);
        pdfFormField7.setName("HSCALE");
        pPKMS2.mergeDifferent((com.lowagie.text.pdf.PdfDictionary) pdfFormField7);
        com.lowagie.text.pdf.BaseField.moveFields((com.lowagie.text.pdf.PdfDictionary) pPKMS0, (com.lowagie.text.pdf.PdfDictionary) pPKMS2);
        org.junit.Assert.assertNull(byte_array1);
        org.junit.Assert.assertNotNull(pdfFormField7);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test108");
        Document document0 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer1 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer3 = byteBuffer1.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter4 = com.lowagie.text.pdf.PdfWriter.getInstance(document0, (java.io.OutputStream) byteBuffer3);
        pdfWriter4.setEncryption(true, "REMOTEGOTO", "xmpMM:VersionID", 561);
        pdfWriter4.resume();
        java.security.cert.Certificate[] certificate_array11 = new java.security.cert.Certificate[] {};
        int[] i_array12 = com.lowagie.text.pdf.BaseFont.CHAR_RANGE_ARABIC;
        pdfWriter4.setEncryption(certificate_array11, i_array12, 762);
        com.lowagie.text.pdf.PdfOCProperties pdfOCProperties15 = pdfWriter4.getOCProperties();
        com.lowagie.text.pdf.PdfFormField pdfFormField19 = com.lowagie.text.pdf.PdfFormField.createTextField(pdfWriter4, false, false, 300);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(pdfWriter4);
        org.junit.Assert.assertNotNull(certificate_array11);
        org.junit.Assert.assertNotNull(i_array12);
        org.junit.Assert.assertNotNull(pdfOCProperties15);
        org.junit.Assert.assertNotNull(pdfFormField19);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test109");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        byte[] byte_array1 = com.lowagie.text.pdf.crypto.IVGenerator.getIV();
        com.lowagie.text.pdf.PRStream pRStream2 = new com.lowagie.text.pdf.PRStream(pdfReader0, byte_array1);
        Document document3 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer4 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer6 = byteBuffer4.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter7 = com.lowagie.text.pdf.PdfWriter.getInstance(document3, (java.io.OutputStream) byteBuffer6);
        com.lowagie.text.pdf.OutputStreamCounter outputStreamCounter8 = new com.lowagie.text.pdf.OutputStreamCounter((java.io.OutputStream) byteBuffer6);
        Document document9 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer10 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer12 = byteBuffer10.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter13 = com.lowagie.text.pdf.PdfWriter.getInstance(document9, (java.io.OutputStream) byteBuffer12);
        com.lowagie.text.pdf.ByteBuffer byteBuffer14 = byteBuffer6.append(byteBuffer12);
        pRStream2.writeContent((java.io.OutputStream) byteBuffer12);
        org.junit.Assert.assertNotNull(byte_array1);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(pdfWriter7);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(pdfWriter13);
        org.junit.Assert.assertNotNull(byteBuffer14);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test110");
        com.lowagie.text.pdf.PdfOutline pdfOutline0 = null;
        com.lowagie.text.pdf.PdfDestination pdfDestination1 = null;
        com.lowagie.text.pdf.PdfString pdfString2 = null;
        try {
            com.lowagie.text.pdf.PdfOutline pdfOutline4 = new com.lowagie.text.pdf.PdfOutline(pdfOutline0, pdfDestination1, pdfString2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test111");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField4 = com.lowagie.text.pdf.PdfFormField.createTextField(pdfWriter0, true, false, 258);
        pdfFormField4.setButton(0);
        pdfFormField4.setName("HSCALE");
        com.lowagie.text.pdf.PdfName pdfName9 = null;
        com.lowagie.text.pdf.PdfString pdfString10 = pdfFormField4.getAsString(pdfName9);
        com.lowagie.text.pdf.PdfTemplate pdfTemplate11 = null;
        try {
            pdfFormField4.setMKRolloverIcon(pdfTemplate11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(pdfFormField4);
        org.junit.Assert.assertNull(pdfString10);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test112");
        char char0 = com.lowagie.text.pdf.Barcode128.START_C;
        org.junit.Assert.assertTrue(char0 == 'i');
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test113");
        String str2 = com.lowagie.text.factories.RomanAlphabetFactory.getString(1, false);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test114");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_SETROP2;
        org.junit.Assert.assertTrue(i0 == 260);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test115");
        Anchor anchor0 = new Anchor();
        Paragraph paragraph1 = new Paragraph((Phrase) anchor0);
        Phrase phrase2 = new Phrase((Phrase) anchor0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test116");
        Document document0 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer1 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer3 = byteBuffer1.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter4 = com.lowagie.text.pdf.PdfWriter.getInstance(document0, (java.io.OutputStream) byteBuffer3);
        pdfWriter4.setEncryption(true, "REMOTEGOTO", "xmpMM:VersionID", 561);
        pdfWriter4.resume();
        com.lowagie.text.pdf.PdfRectangle pdfRectangle13 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle14 = pdfRectangle13.getRectangle();
        java.awt.Color color15 = java.awt.Color.DARK_GRAY;
        rectangle14.borderColorRight = color15;
        com.lowagie.text.pdf.PdfName pdfName17 = com.lowagie.text.pdf.PdfName.INFO;
        com.lowagie.text.pdf.PdfWriter pdfWriter18 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField22 = com.lowagie.text.pdf.PdfFormField.createTextField(pdfWriter18, true, false, 258);
        pdfFormField22.setButton(0);
        com.lowagie.text.pdf.PdfAction pdfAction27 = new com.lowagie.text.pdf.PdfAction("convert2pdfp", (int) (byte) 1);
        pdfFormField22.setAction(pdfAction27);
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation29 = com.lowagie.text.pdf.PdfAnnotation.createLink(pdfWriter4, rectangle14, pdfName17, pdfAction27);
        try {
            com.lowagie.text.pdf.PdfPSXObject pdfPSXObject30 = new com.lowagie.text.pdf.PdfPSXObject(pdfWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(pdfWriter4);
        org.junit.Assert.assertNotNull(rectangle14);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(pdfName17);
        org.junit.Assert.assertNotNull(pdfFormField22);
        org.junit.Assert.assertNotNull(pdfAnnotation29);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test117");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TOUNICODE;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test118");
        String str0 = com.lowagie.text.xml.xmp.LangAlt.DEFAULT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "x-default" + "'", str0.equals("x-default"));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test119");
        com.lowagie.text.pdf.BarcodePDF417 barcodePDF417_0 = new com.lowagie.text.pdf.BarcodePDF417();
        barcodePDF417_0.setDefaultParameters();
        barcodePDF417_0.setYHeight((float) (short) 100);
        int i4 = barcodePDF417_0.getLenCodewords();
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test120");
        char char0 = com.lowagie.text.pdf.PdfWriter.VERSION_1_2;
        org.junit.Assert.assertTrue(char0 == '2');
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test121");
        float f1 = Utilities.pointsToInches((float) 'i');
        org.junit.Assert.assertTrue(f1 == 1.4583334f);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test122");
        Document document0 = new Document();
        document0.marginMirroring = false;
        float f3 = document0.left();
        document0.chapternumber = 5;
        org.junit.Assert.assertTrue(f3 == 36.0f);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test123");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.FRM;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test124");
        int i0 = com.lowagie.text.pdf.PdfFormField.MK_NO_CAPTION;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test125");
        int i1 = FontFactory.registerDirectory("Times-BoldItalic");
        org.junit.Assert.assertTrue(i1 == 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test126");
        com.lowagie.text.pdf.MultiColumnText multiColumnText2 = new com.lowagie.text.pdf.MultiColumnText(1.4583334f, (float) 32);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test127");
        char char0 = com.lowagie.text.pdf.PdfWriter.VERSION_1_7;
        org.junit.Assert.assertTrue(char0 == '7');
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test128");
        Phrase phrase2 = new Phrase((float) 1055, "No message found for encoding");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test129");
        String str1 = Utilities.unEscapeURL("width");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "width" + "'", str1.equals("width"));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test130");
        String str1 = com.lowagie.text.pdf.BarcodeCodabar.calculateChecksum("Rectangle: 100.0x52.0 (rot: 0 degrees)");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Rectangle: 100.0x52.0 (rot: 0 degrees6)" + "'", str1.equals("Rectangle: 100.0x52.0 (rot: 0 degrees6)"));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test131");
        com.lowagie.text.pdf.PdfDashPattern pdfDashPattern3 = new com.lowagie.text.pdf.PdfDashPattern(0.0f, (float) 260, (float) (-56377345));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test132");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        byte[] byte_array1 = com.lowagie.text.pdf.crypto.IVGenerator.getIV();
        com.lowagie.text.pdf.PRStream pRStream2 = new com.lowagie.text.pdf.PRStream(pdfReader0, byte_array1);
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = null;
        com.lowagie.text.pdf.PdfRectangle pdfRectangle6 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle7 = pdfRectangle6.getRectangle();
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation12 = com.lowagie.text.pdf.PdfAnnotation.createText(pdfWriter3, rectangle7, "content", "ZHPFQ", false, "No message found for Cp1250");
        Document document13 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer14 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer16 = byteBuffer14.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter17 = com.lowagie.text.pdf.PdfWriter.getInstance(document13, (java.io.OutputStream) byteBuffer16);
        com.lowagie.text.pdf.ByteBuffer byteBuffer18 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer20 = byteBuffer18.appendHex((byte) -1);
        pdfAnnotation12.toPdf(pdfWriter17, (java.io.OutputStream) byteBuffer18);
        Document document22 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer23 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer25 = byteBuffer23.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter26 = com.lowagie.text.pdf.PdfWriter.getInstance(document22, (java.io.OutputStream) byteBuffer25);
        com.lowagie.text.pdf.OutputStreamCounter outputStreamCounter27 = new com.lowagie.text.pdf.OutputStreamCounter((java.io.OutputStream) byteBuffer25);
        try {
            pRStream2.toPdf(pdfWriter17, (java.io.OutputStream) byteBuffer25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array1);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertNotNull(pdfAnnotation12);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(pdfWriter17);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(pdfWriter26);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test133");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.STDCF;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test134");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.SORT;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test135");
        int i0 = com.lowagie.text.pdf.AcroFields.Item.WRITE_MERGED;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test136");
        com.lowagie.text.pdf.PdfContentByte pdfContentByte0 = null;
        com.lowagie.text.pdf.VerticalText verticalText1 = new com.lowagie.text.pdf.VerticalText(pdfContentByte0);
        verticalText1.setHeight(0.0f);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test137");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.RICHMEDIA;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test138");
        int i0 = com.lowagie.text.pdf.PdfWriter.PageLayoutOneColumn;
        org.junit.Assert.assertTrue(i0 == 2);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test139");
        com.lowagie.text.pdf.IntHashtable intHashtable2 = new com.lowagie.text.pdf.IntHashtable(0, (float) 561);
        int i4 = intHashtable2.get(32);
        int[] i_array5 = intHashtable2.toOrderedKeys();
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(i_array5);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test140");
        String str0 = com.lowagie.text.xml.xmp.DublinCoreSchema.TITLE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "dc:title" + "'", str0.equals("dc:title"));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test141");
        com.lowagie.text.pdf.PdfRectangle pdfRectangle2 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle3 = pdfRectangle2.getRectangle();
        float f4 = rectangle3.llx;
        org.junit.Assert.assertNotNull(rectangle3);
        org.junit.Assert.assertTrue(f4 == 0.0f);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test142");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.RICHMEDIAPRESENTATION;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test143");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_EXTTEXTOUT;
        org.junit.Assert.assertTrue(i0 == 2610);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test144");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.CALRGB;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test145");
        java.net.URL uRL0 = null;
        try {
            com.lowagie.text.pdf.PdfAction pdfAction1 = new com.lowagie.text.pdf.PdfAction(uRL0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test146");
        java.io.InputStream inputStream0 = null;
        try {
            Utilities.skip(inputStream0, 260);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test147");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfRectangle pdfRectangle3 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle4 = pdfRectangle3.getRectangle();
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation9 = com.lowagie.text.pdf.PdfAnnotation.createText(pdfWriter0, rectangle4, "content", "ZHPFQ", false, "No message found for Cp1250");
        Document document10 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer11 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer13 = byteBuffer11.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter14 = com.lowagie.text.pdf.PdfWriter.getInstance(document10, (java.io.OutputStream) byteBuffer13);
        com.lowagie.text.pdf.ByteBuffer byteBuffer15 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer17 = byteBuffer15.appendHex((byte) -1);
        pdfAnnotation9.toPdf(pdfWriter14, (java.io.OutputStream) byteBuffer15);
        Rectangle rectangle21 = new Rectangle((float) (byte) 100, (float) '4');
        float[] f_array28 = new float[] { 200, (byte) 1, 2052, 1024, 128 };
        float[] f_array34 = new float[] { 200, (byte) 1, 2052, 1024, 128 };
        float[] f_array40 = new float[] { 200, (byte) 1, 2052, 1024, 128 };
        float[] f_array46 = new float[] { 200, (byte) 1, 2052, 1024, 128 };
        float[][] f_array_array47 = new float[][] { f_array28, f_array34, f_array40, f_array46 };
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation48 = com.lowagie.text.pdf.PdfAnnotation.createInk(pdfWriter14, rectangle21, "bordercolor", f_array_array47);
        boolean b49 = rectangle21.useVariableBorders;
        org.junit.Assert.assertNotNull(rectangle4);
        org.junit.Assert.assertNotNull(pdfAnnotation9);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(pdfWriter14);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(f_array28);
        org.junit.Assert.assertNotNull(f_array34);
        org.junit.Assert.assertNotNull(f_array40);
        org.junit.Assert.assertNotNull(f_array46);
        org.junit.Assert.assertNotNull(f_array_array47);
        org.junit.Assert.assertNotNull(pdfAnnotation48);
        org.junit.Assert.assertTrue(b49 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test148");
        String str2 = com.lowagie.text.pdf.Barcode128.getRawText("Times-Italic", true);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hf4IMES\r)TALIC" + "'", str2.equals("hf4IMES\r)TALIC"));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test149");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaState.TA_BOTTOM;
        org.junit.Assert.assertTrue(i0 == 8);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test150");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.HELV;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test151");
        String str0 = com.lowagie.text.pdf.AsianFontMapper.ChineseTraditionalEncoding_H;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "UniCNS-UCS2-H" + "'", str0.equals("UniCNS-UCS2-H"));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test152");
        List list2 = new List(false, (float) 11);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test153");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TRIMBOX;
        int i1 = pdfName0.type();
        org.junit.Assert.assertNotNull(pdfName0);
        org.junit.Assert.assertTrue(i1 == 4);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test154");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.OP;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test155");
        com.lowagie.text.pdf.BarcodePDF417 barcodePDF417_0 = new com.lowagie.text.pdf.BarcodePDF417();
        barcodePDF417_0.setDefaultParameters();
        barcodePDF417_0.setYHeight((float) (short) 100);
        barcodePDF417_0.setDefaultParameters();
        float f5 = barcodePDF417_0.getYHeight();
        org.junit.Assert.assertTrue(f5 == 3.0f);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test156");
        com.lowagie.text.pdf.codec.wmf.MetaObject metaObject0 = new com.lowagie.text.pdf.codec.wmf.MetaObject();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test157");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfGState.BM_COMPATIBLE;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test158");
        char char0 = com.lowagie.text.pdf.Barcode128.SHIFT;
        org.junit.Assert.assertTrue(char0 == 'Æ');
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test159");
        RectangleReadOnly rectangleReadOnly4 = new RectangleReadOnly((-1.0f), (float) (short) -1, (-1.0f), 0.0f);
        float f5 = rectangleReadOnly4.getBorderWidthTop();
        java.awt.Color color8 = java.awt.Color.getColor("LII", 804);
        try {
            rectangleReadOnly4.setBackgroundColor(color8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }
        org.junit.Assert.assertTrue(f5 == (-1.0f));
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test160");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        byte[] byte_array1 = com.lowagie.text.pdf.crypto.IVGenerator.getIV();
        com.lowagie.text.pdf.PRStream pRStream2 = new com.lowagie.text.pdf.PRStream(pdfReader0, byte_array1);
        pRStream2.setLength(25448);
        org.junit.Assert.assertNotNull(byte_array1);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test161");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfRectangle pdfRectangle3 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle4 = pdfRectangle3.getRectangle();
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation9 = com.lowagie.text.pdf.PdfAnnotation.createText(pdfWriter0, rectangle4, "content", "ZHPFQ", false, "No message found for Cp1250");
        Document document10 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer11 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer13 = byteBuffer11.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter14 = com.lowagie.text.pdf.PdfWriter.getInstance(document10, (java.io.OutputStream) byteBuffer13);
        com.lowagie.text.pdf.ByteBuffer byteBuffer15 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer17 = byteBuffer15.appendHex((byte) -1);
        pdfAnnotation9.toPdf(pdfWriter14, (java.io.OutputStream) byteBuffer15);
        com.lowagie.text.pdf.collection.PdfCollection pdfCollection19 = null;
        pdfWriter14.setCollection(pdfCollection19);
        com.lowagie.text.pdf.PdfReader pdfReader21 = null;
        try {
            boolean b23 = pdfWriter14.setOutputIntents(pdfReader21, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(rectangle4);
        org.junit.Assert.assertNotNull(pdfAnnotation9);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(pdfWriter14);
        org.junit.Assert.assertNotNull(byteBuffer17);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test162");
        String str0 = Annotation.DEFAULTDIR;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "defaultdir" + "'", str0.equals("defaultdir"));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test163");
        com.lowagie.text.pdf.AcroFields.Item item0 = new com.lowagie.text.pdf.AcroFields.Item();
        Anchor anchor1 = new Anchor();
        ListItem listItem2 = new ListItem((Phrase) anchor1);
        item0.widgets = listItem2;
        try {
            com.lowagie.text.pdf.PdfDictionary pdfDictionary5 = item0.getValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test164");
        int i0 = Element.ALIGN_RIGHT;
        org.junit.Assert.assertTrue(i0 == 2);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test165");
        int i0 = Jpeg2000.JP2_COLR;
        org.junit.Assert.assertTrue(i0 == 1668246642);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test166");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaBrush.BS_HATCHED;
        org.junit.Assert.assertTrue(i0 == 2);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test167");
        com.lowagie.text.pdf.internal.PdfXConformanceImp pdfXConformanceImp0 = new com.lowagie.text.pdf.internal.PdfXConformanceImp();
        boolean b1 = pdfXConformanceImp0.isPdfX1A2001();
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test168");
        String str0 = com.lowagie.text.pdf.PdfObject.TEXT_PDFDOCENCODING;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "PDF" + "'", str0.equals("PDF"));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test169");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.REGISTRY;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test170");
        com.lowagie.text.pdf.PdfSigGenericPKCS.VeriSign veriSign0 = new com.lowagie.text.pdf.PdfSigGenericPKCS.VeriSign();
        com.lowagie.text.pdf.PdfName pdfName1 = com.lowagie.text.pdf.PdfName.PERMS;
        com.lowagie.text.pdf.PdfNumber pdfNumber2 = veriSign0.getAsNumber(pdfName1);
        org.junit.Assert.assertNotNull(pdfName1);
        org.junit.Assert.assertNull(pdfNumber2);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test171");
        Font font2 = new Font(14, (float) (-56377345));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test172");
        Document document0 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer1 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer3 = byteBuffer1.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter4 = com.lowagie.text.pdf.PdfWriter.getInstance(document0, (java.io.OutputStream) byteBuffer3);
        boolean b6 = document0.addAuthor("Times-BoldItalic");
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(pdfWriter4);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test173");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.SUBTYPE;
        boolean b1 = pdfName0.isBoolean();
        org.junit.Assert.assertNotNull(pdfName0);
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test174");
        Document document0 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer1 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer3 = byteBuffer1.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter4 = com.lowagie.text.pdf.PdfWriter.getInstance(document0, (java.io.OutputStream) byteBuffer3);
        pdfWriter4.setEncryption(true, "REMOTEGOTO", "xmpMM:VersionID", 561);
        com.lowagie.text.pdf.PdfWriter pdfWriter10 = null;
        com.lowagie.text.pdf.PdfRectangle pdfRectangle13 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle14 = pdfRectangle13.getRectangle();
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation19 = com.lowagie.text.pdf.PdfAnnotation.createText(pdfWriter10, rectangle14, "content", "ZHPFQ", false, "No message found for Cp1250");
        Document document20 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer21 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer23 = byteBuffer21.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter24 = com.lowagie.text.pdf.PdfWriter.getInstance(document20, (java.io.OutputStream) byteBuffer23);
        com.lowagie.text.pdf.ByteBuffer byteBuffer25 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer27 = byteBuffer25.appendHex((byte) -1);
        pdfAnnotation19.toPdf(pdfWriter24, (java.io.OutputStream) byteBuffer25);
        Rectangle rectangle31 = new Rectangle((float) (byte) 100, (float) '4');
        float[] f_array38 = new float[] { 200, (byte) 1, 2052, 1024, 128 };
        float[] f_array44 = new float[] { 200, (byte) 1, 2052, 1024, 128 };
        float[] f_array50 = new float[] { 200, (byte) 1, 2052, 1024, 128 };
        float[] f_array56 = new float[] { 200, (byte) 1, 2052, 1024, 128 };
        float[][] f_array_array57 = new float[][] { f_array38, f_array44, f_array50, f_array56 };
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation58 = com.lowagie.text.pdf.PdfAnnotation.createInk(pdfWriter24, rectangle31, "bordercolor", f_array_array57);
        com.lowagie.text.pdf.PdfName pdfName59 = null;
        com.lowagie.text.pdf.PdfAction pdfAction62 = new com.lowagie.text.pdf.PdfAction("convert2pdfp", (int) (byte) 1);
        try {
            com.lowagie.text.pdf.PdfAnnotation pdfAnnotation63 = com.lowagie.text.pdf.PdfAnnotation.createLink(pdfWriter4, rectangle31, pdfName59, pdfAction62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(pdfWriter4);
        org.junit.Assert.assertNotNull(rectangle14);
        org.junit.Assert.assertNotNull(pdfAnnotation19);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(pdfWriter24);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(f_array38);
        org.junit.Assert.assertNotNull(f_array44);
        org.junit.Assert.assertNotNull(f_array50);
        org.junit.Assert.assertNotNull(f_array56);
        org.junit.Assert.assertNotNull(f_array_array57);
        org.junit.Assert.assertNotNull(pdfAnnotation58);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test175");
        RectangleReadOnly rectangleReadOnly7 = new RectangleReadOnly((-1.0f), (float) (short) -1, (-1.0f), 0.0f);
        float f8 = rectangleReadOnly7.getBorderWidthTop();
        java.awt.Color color11 = java.awt.Color.getColor("LII", 804);
        rectangleReadOnly7.borderColor = color11;
        Font font13 = FontFactory.getFont("tabl2e", 36.0f, 5, color11);
        org.junit.Assert.assertTrue(f8 == (-1.0f));
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(font13);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test176");
        int i0 = com.lowagie.text.pdf.ArabicLigaturizer.ar_nothing;
        org.junit.Assert.assertTrue(i0 == 0);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test177");
        int i0 = com.lowagie.text.pdf.BaseFont.FONT_TYPE_T3;
        org.junit.Assert.assertTrue(i0 == 5);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test178");
        int i0 = com.lowagie.text.pdf.PdfAnnotation.FLAGS_HIDDEN;
        org.junit.Assert.assertTrue(i0 == 2);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test179");
        com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray1 = new com.lowagie.text.pdf.RandomAccessFileOrArray("");
        int i3 = randomAccessFileOrArray1.skipBytes(3);
        int i4 = randomAccessFileOrArray1.readUnsignedShort();
        double d5 = randomAccessFileOrArray1.readDouble();
        org.junit.Assert.assertTrue(i3 == 3);
        org.junit.Assert.assertTrue(i4 == 25448);
        org.junit.Assert.assertTrue(d5 == 2.0373786303254718E180d);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test180");
        String str0 = Annotation.FILE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "file" + "'", str0.equals("file"));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test181");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DEFAULTRGB;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test182");
        String str0 = ElementTags.LIST;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "list" + "'", str0.equals("list"));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test183");
        Document document0 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer1 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer3 = byteBuffer1.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter4 = com.lowagie.text.pdf.PdfWriter.getInstance(document0, (java.io.OutputStream) byteBuffer3);
        com.lowagie.text.pdf.OutputStreamCounter outputStreamCounter5 = new com.lowagie.text.pdf.OutputStreamCounter((java.io.OutputStream) byteBuffer3);
        com.lowagie.text.pdf.PdfReader pdfReader6 = null;
        byte[] byte_array7 = com.lowagie.text.pdf.crypto.IVGenerator.getIV();
        com.lowagie.text.pdf.PRStream pRStream8 = new com.lowagie.text.pdf.PRStream(pdfReader6, byte_array7);
        com.lowagie.text.pdf.crypto.ARCFOUREncryption aRCFOUREncryption9 = new com.lowagie.text.pdf.crypto.ARCFOUREncryption();
        byte[] byte_array11 = com.lowagie.text.pdf.crypto.IVGenerator.getIV((int) (byte) 47);
        byte[] byte_array15 = com.lowagie.text.pdf.Barcode128.getBarsCode128Raw("hi!");
        aRCFOUREncryption9.encryptARCFOUR(byte_array11, (int) (byte) 1, (-1), byte_array15, 3);
        pRStream8.setData(byte_array11, true);
        outputStreamCounter5.write(byte_array11);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(pdfWriter4);
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNotNull(byte_array15);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test184");
        int i0 = com.lowagie.text.pdf.PdfAnnotation.MARKUP_STRIKEOUT;
        org.junit.Assert.assertTrue(i0 == 2);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test185");
        Anchor anchor0 = new Anchor();
        ListItem listItem1 = new ListItem((Phrase) anchor0);
        int i2 = listItem1.getAlignment();
        Section section4 = new Section((Paragraph) listItem1, 804);
        boolean b5 = section4.isAddedCompletely();
        org.junit.Assert.assertTrue(i2 == (-1));
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test186");
        char char0 = com.lowagie.text.pdf.Barcode128.CODE_BC_TO_A;
        org.junit.Assert.assertTrue(char0 == 'e');
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test187");
        com.lowagie.text.pdf.internal.PdfVersionImp pdfVersionImp0 = new com.lowagie.text.pdf.internal.PdfVersionImp();
        com.lowagie.text.pdf.OutputStreamCounter outputStreamCounter1 = null;
        try {
            pdfVersionImp0.writeHeader(outputStreamCounter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test188");
        com.lowagie.text.pdf.PdfRectangle pdfRectangle2 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle3 = pdfRectangle2.getRectangle();
        try {
            com.lowagie.text.pdf.PdfNumber pdfNumber5 = pdfRectangle2.getAsNumber(1046);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(rectangle3);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test189");
        try {
            GreekList greekList2 = new GreekList(true, (int) '2');
            org.junit.Assert.fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (ExceptionConverter e) {
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test190");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        com.lowagie.text.pdf.PRAcroForm pRAcroForm1 = new com.lowagie.text.pdf.PRAcroForm(pdfReader0);
        com.lowagie.text.pdf.PdfName pdfName2 = com.lowagie.text.pdf.PdfName.MIN_CAMEL_CASE;
        com.lowagie.text.pdf.PdfName pdfName3 = com.lowagie.text.pdf.PdfName.N2;
        pRAcroForm1.putEx(pdfName2, (com.lowagie.text.pdf.PdfObject) pdfName3);
        java.util.ArrayList arrayList5 = pRAcroForm1.getFields();
        int i6 = pRAcroForm1.size();
        org.junit.Assert.assertNotNull(pdfName2);
        org.junit.Assert.assertNotNull(pdfName3);
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test191");
        com.lowagie.text.pdf.crypto.ARCFOUREncryption aRCFOUREncryption5 = new com.lowagie.text.pdf.crypto.ARCFOUREncryption();
        byte[] byte_array7 = com.lowagie.text.pdf.crypto.IVGenerator.getIV((int) (byte) 47);
        byte[] byte_array11 = com.lowagie.text.pdf.Barcode128.getBarsCode128Raw("hi!");
        aRCFOUREncryption5.encryptARCFOUR(byte_array7, (int) (byte) 1, (-1), byte_array11, 3);
        byte[] byte_array15 = com.lowagie.text.pdf.Barcode128.getBarsCode128Raw("hi!");
        aRCFOUREncryption5.encryptARCFOUR(byte_array15);
        try {
            ImgCCITT imgCCITT17 = new ImgCCITT(259, 260, false, 16384, 200, byte_array15);
            org.junit.Assert.fail("Expected exception of type com.lowagie.text.BadElementException");
        } catch (BadElementException e) {
        }
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNotNull(byte_array15);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test192");
        RectangleReadOnly rectangleReadOnly4 = new RectangleReadOnly((-1.0f), (float) (short) -1, (-1.0f), 0.0f);
        float f5 = rectangleReadOnly4.getBorderWidthTop();
        java.awt.Color color8 = java.awt.Color.getColor("LII", 804);
        rectangleReadOnly4.borderColor = color8;
        int i10 = color8.getGreen();
        org.junit.Assert.assertTrue(f5 == (-1.0f));
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue(i10 == 3);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test193");
        String str0 = com.lowagie.text.html.Markup.CSS_KEY_PAGE_BREAK_AFTER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "page-break-after" + "'", str0.equals("page-break-after"));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test194");
        int i0 = com.lowagie.text.pdf.PdfEncryption.AES_128;
        org.junit.Assert.assertTrue(i0 == 4);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test195");
        Rectangle rectangle0 = PageSize.A3;
        org.junit.Assert.assertNotNull(rectangle0);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test196");
        java.net.URL uRL0 = null;
        try {
            Image image1 = ImageLoader.getJpeg2000Image(uRL0);
            org.junit.Assert.fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (ExceptionConverter e) {
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test197");
        int i0 = com.lowagie.text.pdf.BarcodeDatamatrix.DM_TEXT;
        org.junit.Assert.assertTrue(i0 == 3);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test198");
        java.security.cert.X509Certificate x509Certificate0 = null;
        String[] str_array5 = new String[] { "", "urx", "hi!", "ACTION" };
        java.util.ArrayList<String> arraylist_str6 = new java.util.ArrayList<String>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<String>) arraylist_str6, str_array5);
        arraylist_str6.ensureCapacity(8);
        java.util.Calendar calendar10 = null;
        try {
            String str11 = com.lowagie.text.pdf.PdfPKCS7.verifyCertificate(x509Certificate0, (java.util.Collection) arraylist_str6, calendar10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array5);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test199");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.SUBMITFORM;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test200");
        com.lowagie.text.pdf.collection.PdfCollectionSort pdfCollectionSort1 = new com.lowagie.text.pdf.collection.PdfCollectionSort("UTF-16BE");
        boolean[] b_array6 = new boolean[] { false, false, false, false };
        try {
            pdfCollectionSort1.setSortOrder(b_array6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(b_array6);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test201");
        com.lowagie.text.pdf.AcroFields.Item item0 = new com.lowagie.text.pdf.AcroFields.Item();
        Anchor anchor1 = new Anchor();
        ListItem listItem2 = new ListItem((Phrase) anchor1);
        item0.widgets = listItem2;
        com.lowagie.text.pdf.PdfName pdfName4 = com.lowagie.text.pdf.PdfAnnotation.AA_BLUR;
        Document document5 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer6 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer8 = byteBuffer6.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter9 = com.lowagie.text.pdf.PdfWriter.getInstance(document5, (java.io.OutputStream) byteBuffer8);
        pdfWriter9.setEncryption(true, "REMOTEGOTO", "xmpMM:VersionID", 561);
        pdfWriter9.resume();
        java.security.cert.Certificate[] certificate_array16 = new java.security.cert.Certificate[] {};
        int[] i_array17 = com.lowagie.text.pdf.BaseFont.CHAR_RANGE_ARABIC;
        pdfWriter9.setEncryption(certificate_array16, i_array17, 762);
        com.lowagie.text.pdf.PdfOCProperties pdfOCProperties20 = pdfWriter9.getOCProperties();
        item0.writeToAll(pdfName4, (com.lowagie.text.pdf.PdfObject) pdfOCProperties20, 298);
        java.util.ArrayList arrayList23 = item0.widgets;
        org.junit.Assert.assertNotNull(pdfName4);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(pdfWriter9);
        org.junit.Assert.assertNotNull(certificate_array16);
        org.junit.Assert.assertNotNull(i_array17);
        org.junit.Assert.assertNotNull(pdfOCProperties20);
        org.junit.Assert.assertNotNull(arrayList23);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test202");
        float f0 = com.lowagie.text.pdf.PdfWriter.SPACE_CHAR_RATIO_DEFAULT;
        org.junit.Assert.assertTrue(f0 == 2.5f);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test203");
        Meta meta2 = new Meta("defaultdir", "ZHPFQ");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test204");
        Anchor anchor0 = new Anchor();
        ListItem listItem1 = new ListItem((Phrase) anchor0);
        int i2 = anchor0.type();
        org.junit.Assert.assertTrue(i2 == 17);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test205");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfRectangle pdfRectangle3 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle4 = pdfRectangle3.getRectangle();
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation9 = com.lowagie.text.pdf.PdfAnnotation.createText(pdfWriter0, rectangle4, "content", "ZHPFQ", false, "No message found for Cp1250");
        Document document10 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer11 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer13 = byteBuffer11.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter14 = com.lowagie.text.pdf.PdfWriter.getInstance(document10, (java.io.OutputStream) byteBuffer13);
        com.lowagie.text.pdf.ByteBuffer byteBuffer15 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer17 = byteBuffer15.appendHex((byte) -1);
        pdfAnnotation9.toPdf(pdfWriter14, (java.io.OutputStream) byteBuffer15);
        Rectangle rectangle21 = new Rectangle((float) (byte) 100, (float) '4');
        float[] f_array28 = new float[] { 200, (byte) 1, 2052, 1024, 128 };
        float[] f_array34 = new float[] { 200, (byte) 1, 2052, 1024, 128 };
        float[] f_array40 = new float[] { 200, (byte) 1, 2052, 1024, 128 };
        float[] f_array46 = new float[] { 200, (byte) 1, 2052, 1024, 128 };
        float[][] f_array_array47 = new float[][] { f_array28, f_array34, f_array40, f_array46 };
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation48 = com.lowagie.text.pdf.PdfAnnotation.createInk(pdfWriter14, rectangle21, "bordercolor", f_array_array47);
        try {
            pdfWriter14.addJavaScript("JustifyAll", "rel");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(rectangle4);
        org.junit.Assert.assertNotNull(pdfAnnotation9);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(pdfWriter14);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(f_array28);
        org.junit.Assert.assertNotNull(f_array34);
        org.junit.Assert.assertNotNull(f_array40);
        org.junit.Assert.assertNotNull(f_array46);
        org.junit.Assert.assertNotNull(f_array_array47);
        org.junit.Assert.assertNotNull(pdfAnnotation48);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test206");
        Phrase phrase0 = null;
        try {
            ListItem listItem1 = new ListItem(phrase0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test207");
        com.lowagie.text.pdf.DefaultFontMapper defaultFontMapper0 = new com.lowagie.text.pdf.DefaultFontMapper();
        java.util.HashMap<String, com.lowagie.text.pdf.DefaultFontMapper.BaseFontParameters> hashmap_str_baseFontParameters1 = defaultFontMapper0.getMapper();
        org.junit.Assert.assertNotNull(hashmap_str_baseFontParameters1);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test208");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.WIPE;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test209");
        Paragraph paragraph2 = new Paragraph((float) (byte) 1, "convert2pdfp");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test210");
        java.net.URL uRL4 = null;
        Annotation annotation5 = new Annotation((float) '4', (float) 1, 1.0E7f, (float) 8192, uRL4);
        annotation5.lly = 100L;
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test211");
        Document document0 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer1 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer3 = byteBuffer1.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter4 = com.lowagie.text.pdf.PdfWriter.getInstance(document0, (java.io.OutputStream) byteBuffer3);
        pdfWriter4.setEncryption(true, "REMOTEGOTO", "xmpMM:VersionID", 561);
        pdfWriter4.resume();
        com.lowagie.text.pdf.PdfRectangle pdfRectangle13 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle14 = pdfRectangle13.getRectangle();
        java.awt.Color color15 = java.awt.Color.DARK_GRAY;
        rectangle14.borderColorRight = color15;
        com.lowagie.text.pdf.PdfName pdfName17 = com.lowagie.text.pdf.PdfName.INFO;
        com.lowagie.text.pdf.PdfWriter pdfWriter18 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField22 = com.lowagie.text.pdf.PdfFormField.createTextField(pdfWriter18, true, false, 258);
        pdfFormField22.setButton(0);
        com.lowagie.text.pdf.PdfAction pdfAction27 = new com.lowagie.text.pdf.PdfAction("convert2pdfp", (int) (byte) 1);
        pdfFormField22.setAction(pdfAction27);
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation29 = com.lowagie.text.pdf.PdfAnnotation.createLink(pdfWriter4, rectangle14, pdfName17, pdfAction27);
        float f30 = rectangle14.getTop();
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(pdfWriter4);
        org.junit.Assert.assertNotNull(rectangle14);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(pdfName17);
        org.junit.Assert.assertNotNull(pdfFormField22);
        org.junit.Assert.assertNotNull(pdfAnnotation29);
        org.junit.Assert.assertTrue(f30 == 0.0f);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test212");
        Document.plainRandomAccess = true;
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test213");
        Annotation annotation5 = new Annotation((float) 16384, (float) (short) 10, 6.594297E22f, (float) 1718909296, "Cp1252");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test214");
        java.util.Map<String, com.lowagie.text.pdf.PdfName> map_str_pdfName0 = com.lowagie.text.pdf.PdfAppearance.stdFieldFontNames;
        org.junit.Assert.assertNotNull(map_str_pdfName0);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test215");
        Document document0 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer1 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer3 = byteBuffer1.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter4 = com.lowagie.text.pdf.PdfWriter.getInstance(document0, (java.io.OutputStream) byteBuffer3);
        pdfWriter4.setEncryption(true, "REMOTEGOTO", "xmpMM:VersionID", 561);
        com.lowagie.text.pdf.PdfFileSpecification pdfFileSpecification11 = com.lowagie.text.pdf.PdfFileSpecification.fileExtern(pdfWriter4, "hi!");
        com.lowagie.text.pdf.PdfName pdfName12 = com.lowagie.text.pdf.PdfName.PERMS;
        com.lowagie.text.pdf.PdfIndirectReference pdfIndirectReference13 = null;
        try {
            com.lowagie.text.pdf.PdfIndirectObject pdfIndirectObject14 = pdfWriter4.addToBody((com.lowagie.text.pdf.PdfObject) pdfName12, pdfIndirectReference13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(pdfWriter4);
        org.junit.Assert.assertNotNull(pdfFileSpecification11);
        org.junit.Assert.assertNotNull(pdfName12);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test216");
        int i0 = com.lowagie.text.pdf.PdfWriter.ALLOW_DEGRADED_PRINTING;
        org.junit.Assert.assertTrue(i0 == 4);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test217");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.FORMTYPE;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test218");
        com.lowagie.text.pdf.events.PdfPCellEventForwarder pdfPCellEventForwarder0 = new com.lowagie.text.pdf.events.PdfPCellEventForwarder();
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test219");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        byte[] byte_array1 = com.lowagie.text.pdf.crypto.IVGenerator.getIV();
        com.lowagie.text.pdf.PRStream pRStream2 = new com.lowagie.text.pdf.PRStream(pdfReader0, byte_array1);
        com.lowagie.text.pdf.crypto.ARCFOUREncryption aRCFOUREncryption3 = new com.lowagie.text.pdf.crypto.ARCFOUREncryption();
        byte[] byte_array5 = com.lowagie.text.pdf.crypto.IVGenerator.getIV((int) (byte) 47);
        byte[] byte_array9 = com.lowagie.text.pdf.Barcode128.getBarsCode128Raw("hi!");
        aRCFOUREncryption3.encryptARCFOUR(byte_array5, (int) (byte) 1, (-1), byte_array9, 3);
        pRStream2.setData(byte_array5, true);
        try {
            Image image14 = ImageLoader.getPngImage(byte_array5);
            org.junit.Assert.fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (ExceptionConverter e) {
        }
        org.junit.Assert.assertNotNull(byte_array1);
        org.junit.Assert.assertNotNull(byte_array5);
        org.junit.Assert.assertNotNull(byte_array9);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test220");
        com.lowagie.text.pdf.ByteBuffer byteBuffer0 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.crypto.ARCFOUREncryption aRCFOUREncryption1 = new com.lowagie.text.pdf.crypto.ARCFOUREncryption();
        byte[] byte_array3 = com.lowagie.text.pdf.crypto.IVGenerator.getIV((int) (byte) 47);
        byte[] byte_array7 = com.lowagie.text.pdf.Barcode128.getBarsCode128Raw("hi!");
        aRCFOUREncryption1.encryptARCFOUR(byte_array3, (int) (byte) 1, (-1), byte_array7, 3);
        byteBuffer0.write(byte_array3);
        org.junit.Assert.assertNotNull(byte_array3);
        org.junit.Assert.assertNotNull(byte_array7);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test221");
        int i0 = com.lowagie.text.pdf.PdfFormField.FF_MULTILINE;
        org.junit.Assert.assertTrue(i0 == 4096);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test222");
        Chapter chapter1 = new Chapter(8);
        boolean b2 = chapter1.isNestable();
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test223");
        com.lowagie.text.pdf.DefaultFontMapper defaultFontMapper0 = new com.lowagie.text.pdf.DefaultFontMapper();
        int i2 = defaultFontMapper0.insertDirectory("row");
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test224");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.SPEED;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test225");
        Rectangle rectangle2 = new Rectangle((float) (byte) 100, (float) '4');
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = null;
        com.lowagie.text.pdf.PdfRectangle pdfRectangle6 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle7 = pdfRectangle6.getRectangle();
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation12 = com.lowagie.text.pdf.PdfAnnotation.createText(pdfWriter3, rectangle7, "content", "ZHPFQ", false, "No message found for Cp1250");
        float f14 = rectangle7.getLeft((float) 11);
        rectangle2.softCloneNonPositionParameters(rectangle7);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertNotNull(pdfAnnotation12);
        org.junit.Assert.assertTrue(f14 == 11.0f);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test226");
        char[] char_array5 = new char[] { 'Ç', 'Ç', '翿', 'Ç' };
        boolean b7 = Utilities.isSurrogatePair(char_array5, 1783636000);
        try {
            int i9 = com.lowagie.text.pdf.hyphenation.TernaryTree.strcmp("font", char_array5, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(char_array5);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test227");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PERCEPTUAL;
        Chunk chunk1 = Chunk.NEXTPAGE;
        Paragraph paragraph2 = new Paragraph(chunk1);
        try {
            int i3 = pdfName0.compareTo((Object) chunk1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(pdfName0);
        org.junit.Assert.assertNotNull(chunk1);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test228");
        int i0 = com.lowagie.text.pdf.PdfPageLabels.DECIMAL_ARABIC_NUMERALS;
        org.junit.Assert.assertTrue(i0 == 0);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test229");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.NAVIGATION;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test230");
        com.lowagie.text.pdf.internal.PdfVersionImp pdfVersionImp0 = new com.lowagie.text.pdf.internal.PdfVersionImp();
        pdfVersionImp0.setAtLeastPdfVersion('i');
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test231");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.WP;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test232");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.CMD;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test233");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TRANS;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test234");
        int i0 = Font.ZAPFDINGBATS;
        org.junit.Assert.assertTrue(i0 == 4);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test235");
        String str0 = com.lowagie.text.pdf.BaseFont.COURIER_BOLDOBLIQUE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Courier-BoldOblique" + "'", str0.equals("Courier-BoldOblique"));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test236");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.STEMV;
        com.lowagie.text.pdf.PRIndirectReference pRIndirectReference1 = null;
        pdfName0.setIndRef(pRIndirectReference1);
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test237");
        Document document1 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer2 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer4 = byteBuffer2.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter5 = com.lowagie.text.pdf.PdfWriter.getInstance(document1, (java.io.OutputStream) byteBuffer4);
        com.lowagie.text.pdf.OutputStreamCounter outputStreamCounter6 = new com.lowagie.text.pdf.OutputStreamCounter((java.io.OutputStream) byteBuffer4);
        Document document7 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer8 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer10 = byteBuffer8.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter11 = com.lowagie.text.pdf.PdfWriter.getInstance(document7, (java.io.OutputStream) byteBuffer10);
        com.lowagie.text.pdf.ByteBuffer byteBuffer12 = byteBuffer4.append(byteBuffer10);
        String str13 = com.lowagie.text.pdf.ByteBuffer.formatDouble((double) 1668246642, byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(pdfWriter5);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(pdfWriter11);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "1668246642" + "'", str13.equals("1668246642"));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test238");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        Document document1 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer2 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer4 = byteBuffer2.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter5 = com.lowagie.text.pdf.PdfWriter.getInstance(document1, (java.io.OutputStream) byteBuffer4);
        com.lowagie.text.pdf.OutputStreamCounter outputStreamCounter6 = new com.lowagie.text.pdf.OutputStreamCounter((java.io.OutputStream) byteBuffer4);
        Document document7 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer8 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer10 = byteBuffer8.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter11 = com.lowagie.text.pdf.PdfWriter.getInstance(document7, (java.io.OutputStream) byteBuffer10);
        com.lowagie.text.pdf.ByteBuffer byteBuffer12 = byteBuffer4.append(byteBuffer10);
        try {
            com.lowagie.text.pdf.PdfEncryptor.encrypt(pdfReader0, (java.io.OutputStream) byteBuffer4, 261, "background-color", "xmpMM:ManagedFrom", 16384);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(pdfWriter5);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(pdfWriter11);
        org.junit.Assert.assertNotNull(byteBuffer12);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test239");
        com.lowagie.text.pdf.PdfWriter.PdfBody.PdfCrossReference pdfCrossReference4 = new com.lowagie.text.pdf.PdfWriter.PdfBody.PdfCrossReference((int) (byte) 47, (-1), 7, 1785737832);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test240");
        int i0 = com.lowagie.text.pdf.ExtendedColor.TYPE_RGB;
        org.junit.Assert.assertTrue(i0 == 0);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test241");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PDFDOCENCODING;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test242");
        Anchor anchor0 = new Anchor();
        ListItem listItem1 = new ListItem((Phrase) anchor0);
        Section section3 = new Section((Paragraph) listItem1, 2097152);
        Font font9 = FontFactory.getFont("REMOTEGOTO", "xmp:Advisory", true, (float) (short) -1, 2);
        listItem1.setFont(font9);
        org.junit.Assert.assertNotNull(font9);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test243");
        Anchor anchor0 = new Anchor();
        ListItem listItem1 = new ListItem((Phrase) anchor0);
        Section section3 = new Section((Paragraph) listItem1, 2097152);
        listItem1.setKeepTogether(false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test244");
        Anchor anchor0 = new Anchor();
        ListItem listItem1 = new ListItem((Phrase) anchor0);
        float f2 = anchor0.getLeading();
        org.junit.Assert.assertTrue(f2 == 16.0f);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test245");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfRectangle pdfRectangle3 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle4 = pdfRectangle3.getRectangle();
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation9 = com.lowagie.text.pdf.PdfAnnotation.createText(pdfWriter0, rectangle4, "content", "ZHPFQ", false, "No message found for Cp1250");
        java.awt.Color color10 = rectangle4.getBorderColor();
        org.junit.Assert.assertNotNull(rectangle4);
        org.junit.Assert.assertNotNull(pdfAnnotation9);
        org.junit.Assert.assertNull(color10);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test246");
        MarkedObject markedObject0 = new MarkedObject();
        boolean b1 = markedObject0.isNestable();
        org.junit.Assert.assertTrue(b1 == true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test247");
        String str0 = ElementTags.REFERENCE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "reference" + "'", str0.equals("reference"));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test248");
        Anchor anchor0 = new Anchor();
        ListItem listItem1 = new ListItem((Phrase) anchor0);
        int i2 = listItem1.getAlignment();
        listItem1.setSpacingBefore((float) 1785737832);
        boolean b5 = listItem1.isNestable();
        int i6 = listItem1.type();
        org.junit.Assert.assertTrue(i2 == (-1));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i6 == 15);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test249");
        com.lowagie.text.pdf.DefaultFontMapper.BaseFontParameters baseFontParameters1 = new com.lowagie.text.pdf.DefaultFontMapper.BaseFontParameters("REMOTEGOTO");
        byte[] byte_array2 = baseFontParameters1.ttfAfm;
        org.junit.Assert.assertNull(byte_array2);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test250");
        String str0 = com.lowagie.text.xml.xmp.XmpBasicSchema.BASEURL;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "xmp:BaseURL" + "'", str0.equals("xmp:BaseURL"));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test251");
        String str0 = com.lowagie.text.xml.xmp.DublinCoreSchema.LANGUAGE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "dc:language" + "'", str0.equals("dc:language"));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test252");
        Annotation annotation8 = new Annotation((float) (short) 100, (float) 1L, (float) (byte) 1, (float) 10, "", "hi!", "", "ACTION");
        float f9 = annotation8.lly;
        java.util.HashMap hashMap10 = annotation8.annotationAttributes;
        org.junit.Assert.assertTrue(f9 == 1.0f);
        org.junit.Assert.assertNotNull(hashMap10);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test253");
        String str1 = com.lowagie.text.pdf.BarcodeEAN.convertUPCAtoUPCE("urx");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test254");
        String str0 = Chunk.ENCODING;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ENCODING" + "'", str0.equals("ENCODING"));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test255");
        String str0 = ElementTags.SUBSUPSCRIPT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "subsupscript" + "'", str0.equals("subsupscript"));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test256");
        int i0 = Annotation.FILE_PAGE;
        org.junit.Assert.assertTrue(i0 == 4);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test257");
        java.awt.Color color0 = java.awt.Color.blue;
        org.junit.Assert.assertNotNull(color0);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test258");
        Document document0 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer1 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer3 = byteBuffer1.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter4 = com.lowagie.text.pdf.PdfWriter.getInstance(document0, (java.io.OutputStream) byteBuffer3);
        pdfWriter4.setEncryption(true, "REMOTEGOTO", "xmpMM:VersionID", 561);
        pdfWriter4.resume();
        com.lowagie.text.pdf.PdfRectangle pdfRectangle13 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle14 = pdfRectangle13.getRectangle();
        java.awt.Color color15 = java.awt.Color.DARK_GRAY;
        rectangle14.borderColorRight = color15;
        com.lowagie.text.pdf.PdfName pdfName17 = com.lowagie.text.pdf.PdfName.INFO;
        com.lowagie.text.pdf.PdfWriter pdfWriter18 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField22 = com.lowagie.text.pdf.PdfFormField.createTextField(pdfWriter18, true, false, 258);
        pdfFormField22.setButton(0);
        com.lowagie.text.pdf.PdfAction pdfAction27 = new com.lowagie.text.pdf.PdfAction("convert2pdfp", (int) (byte) 1);
        pdfFormField22.setAction(pdfAction27);
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation29 = com.lowagie.text.pdf.PdfAnnotation.createLink(pdfWriter4, rectangle14, pdfName17, pdfAction27);
        com.lowagie.text.pdf.PdfFileSpecification pdfFileSpecification31 = com.lowagie.text.pdf.PdfFileSpecification.url(pdfWriter4, "title");
        com.lowagie.text.pdf.Type3Font type3Font33 = new com.lowagie.text.pdf.Type3Font(pdfWriter4, false);
        char[] char_array34 = type3Font33.getUnicodeDifferences();
        String[][] str_array_array35 = type3Font33.getFullFontName();
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(pdfWriter4);
        org.junit.Assert.assertNotNull(rectangle14);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(pdfName17);
        org.junit.Assert.assertNotNull(pdfFormField22);
        org.junit.Assert.assertNotNull(pdfAnnotation29);
        org.junit.Assert.assertNotNull(pdfFileSpecification31);
        org.junit.Assert.assertNotNull(char_array34);
        org.junit.Assert.assertNotNull(str_array_array35);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test259");
        byte[] byte_array6 = new byte[] { (byte) 10, (byte) 34, (byte) 34, (byte) 1, (byte) 0 };
        try {
            com.lowagie.text.pdf.PdfReader pdfReader7 = new com.lowagie.text.pdf.PdfReader("No message found for Cp1250", byte_array6);
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(byte_array6);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test260");
        RomanList romanList1 = new RomanList(32);
        boolean b2 = romanList1.lowercase;
        romanList1.lettered = true;
        romanList1.lettered = false;
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test261");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfGState.BM_COLORBURN;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test262");
        Document document0 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer1 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer3 = byteBuffer1.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter4 = com.lowagie.text.pdf.PdfWriter.getInstance(document0, (java.io.OutputStream) byteBuffer3);
        com.lowagie.text.pdf.PdfDictionary pdfDictionary5 = pdfWriter4.getDefaultColorspace();
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(pdfWriter4);
        org.junit.Assert.assertNotNull(pdfDictionary5);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test263");
        Document document0 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer1 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer3 = byteBuffer1.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter4 = com.lowagie.text.pdf.PdfWriter.getInstance(document0, (java.io.OutputStream) byteBuffer3);
        pdfWriter4.setEncryption(true, "REMOTEGOTO", "xmpMM:VersionID", 561);
        pdfWriter4.resume();
        com.lowagie.text.pdf.PdfRectangle pdfRectangle13 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle14 = pdfRectangle13.getRectangle();
        java.awt.Color color15 = java.awt.Color.DARK_GRAY;
        rectangle14.borderColorRight = color15;
        com.lowagie.text.pdf.PdfName pdfName17 = com.lowagie.text.pdf.PdfName.INFO;
        com.lowagie.text.pdf.PdfWriter pdfWriter18 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField22 = com.lowagie.text.pdf.PdfFormField.createTextField(pdfWriter18, true, false, 258);
        pdfFormField22.setButton(0);
        com.lowagie.text.pdf.PdfAction pdfAction27 = new com.lowagie.text.pdf.PdfAction("convert2pdfp", (int) (byte) 1);
        pdfFormField22.setAction(pdfAction27);
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation29 = com.lowagie.text.pdf.PdfAnnotation.createLink(pdfWriter4, rectangle14, pdfName17, pdfAction27);
        com.lowagie.text.pdf.PdfFileSpecification pdfFileSpecification31 = com.lowagie.text.pdf.PdfFileSpecification.url(pdfWriter4, "title");
        com.lowagie.text.pdf.Type3Font type3Font33 = new com.lowagie.text.pdf.Type3Font(pdfWriter4, false);
        char[] char_array34 = type3Font33.getUnicodeDifferences();
        int i36 = type3Font33.getAscent("bordercolor");
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(pdfWriter4);
        org.junit.Assert.assertNotNull(rectangle14);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(pdfName17);
        org.junit.Assert.assertNotNull(pdfFormField22);
        org.junit.Assert.assertNotNull(pdfAnnotation29);
        org.junit.Assert.assertNotNull(pdfFileSpecification31);
        org.junit.Assert.assertNotNull(char_array34);
        org.junit.Assert.assertTrue(i36 == 0);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test264");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        byte[] byte_array1 = com.lowagie.text.pdf.crypto.IVGenerator.getIV();
        com.lowagie.text.pdf.PRStream pRStream2 = new com.lowagie.text.pdf.PRStream(pdfReader0, byte_array1);
        try {
            Image image3 = Image.getInstance(byte_array1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(byte_array1);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test265");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfRectangle pdfRectangle3 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle4 = pdfRectangle3.getRectangle();
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation9 = com.lowagie.text.pdf.PdfAnnotation.createText(pdfWriter0, rectangle4, "content", "ZHPFQ", false, "No message found for Cp1250");
        Document document10 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer11 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer13 = byteBuffer11.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter14 = com.lowagie.text.pdf.PdfWriter.getInstance(document10, (java.io.OutputStream) byteBuffer13);
        com.lowagie.text.pdf.ByteBuffer byteBuffer15 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer17 = byteBuffer15.appendHex((byte) -1);
        pdfAnnotation9.toPdf(pdfWriter14, (java.io.OutputStream) byteBuffer15);
        com.lowagie.text.pdf.collection.PdfCollection pdfCollection19 = null;
        pdfWriter14.setCollection(pdfCollection19);
        pdfWriter14.setPageCount(302);
        java.awt.Color color25 = java.awt.Color.DARK_GRAY;
        com.lowagie.text.pdf.PdfSpotColor pdfSpotColor26 = new com.lowagie.text.pdf.PdfSpotColor("", color25);
        com.lowagie.text.pdf.PdfSpotColor pdfSpotColor27 = new com.lowagie.text.pdf.PdfSpotColor("text-decoration", color25);
        java.awt.Color color28 = pdfSpotColor27.altcs;
        com.lowagie.text.pdf.PdfRectangle pdfRectangle31 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        com.lowagie.text.pdf.PdfRectangle pdfRectangle34 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle35 = pdfRectangle34.getRectangle();
        float[] f_array36 = new float[] {};
        boolean b37 = pdfRectangle34.add(f_array36);
        boolean b38 = pdfRectangle31.add(f_array36);
        com.lowagie.text.pdf.PdfRectangle pdfRectangle41 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        com.lowagie.text.pdf.PdfRectangle pdfRectangle44 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle45 = pdfRectangle44.getRectangle();
        float[] f_array46 = new float[] {};
        boolean b47 = pdfRectangle44.add(f_array46);
        boolean b48 = pdfRectangle41.add(f_array46);
        com.lowagie.text.pdf.PdfFunction pdfFunction49 = null;
        try {
            com.lowagie.text.pdf.PdfShading pdfShading50 = com.lowagie.text.pdf.PdfShading.type1(pdfWriter14, color28, f_array36, f_array46, pdfFunction49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(rectangle4);
        org.junit.Assert.assertNotNull(pdfAnnotation9);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(pdfWriter14);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(rectangle35);
        org.junit.Assert.assertNotNull(f_array36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(rectangle45);
        org.junit.Assert.assertNotNull(f_array46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b48 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test266");
        String str0 = ElementTags.INDENTATIONLEFT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "indentationleft" + "'", str0.equals("indentationleft"));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test267");
        Footnote footnote0 = new Footnote();
        java.util.HashMap hashMap1 = footnote0.footnoteAttributes;
        com.lowagie.text.pdf.PdfWriter pdfWriter2 = null;
        com.lowagie.text.pdf.PdfRectangle pdfRectangle5 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle6 = pdfRectangle5.getRectangle();
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation11 = com.lowagie.text.pdf.PdfAnnotation.createText(pdfWriter2, rectangle6, "content", "ZHPFQ", false, "No message found for Cp1250");
        Document document12 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer13 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer15 = byteBuffer13.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter16 = com.lowagie.text.pdf.PdfWriter.getInstance(document12, (java.io.OutputStream) byteBuffer15);
        com.lowagie.text.pdf.ByteBuffer byteBuffer17 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer19 = byteBuffer17.appendHex((byte) -1);
        pdfAnnotation11.toPdf(pdfWriter16, (java.io.OutputStream) byteBuffer17);
        com.lowagie.text.pdf.collection.PdfCollection pdfCollection21 = null;
        pdfWriter16.setCollection(pdfCollection21);
        com.lowagie.text.pdf.PdfDictionary pdfDictionary23 = com.lowagie.text.pdf.SimpleNamedDestination.outputNamedDestinationAsStrings(hashMap1, pdfWriter16);
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(rectangle6);
        org.junit.Assert.assertNotNull(pdfAnnotation11);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(pdfWriter16);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNull(pdfDictionary23);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test268");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.SUBTYPE;
        com.lowagie.text.pdf.PdfDictionary pdfDictionary1 = new com.lowagie.text.pdf.PdfDictionary(pdfName0);
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test269");
        Rectangle rectangle2 = new Rectangle((float) (byte) 100, (float) '4');
        boolean b4 = rectangle2.hasBorder((int) (byte) -1);
        String str5 = rectangle2.toString();
        float f6 = rectangle2.lly;
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rectangle: 100.0x52.0 (rot: 0 degrees)" + "'", str5.equals("Rectangle: 100.0x52.0 (rot: 0 degrees)"));
        org.junit.Assert.assertTrue(f6 == 0.0f);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test270");
        int i0 = com.lowagie.text.pdf.PdfWriter.HideWindowUI;
        org.junit.Assert.assertTrue(i0 == 16384);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test271");
        Document document1 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer2 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer4 = byteBuffer2.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter5 = com.lowagie.text.pdf.PdfWriter.getInstance(document1, (java.io.OutputStream) byteBuffer4);
        pdfWriter5.setEncryption(true, "REMOTEGOTO", "xmpMM:VersionID", 561);
        pdfWriter5.resume();
        com.lowagie.text.pdf.PdfRectangle pdfRectangle14 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle15 = pdfRectangle14.getRectangle();
        java.awt.Color color16 = java.awt.Color.DARK_GRAY;
        rectangle15.borderColorRight = color16;
        com.lowagie.text.pdf.PdfName pdfName18 = com.lowagie.text.pdf.PdfName.INFO;
        com.lowagie.text.pdf.PdfWriter pdfWriter19 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField23 = com.lowagie.text.pdf.PdfFormField.createTextField(pdfWriter19, true, false, 258);
        pdfFormField23.setButton(0);
        com.lowagie.text.pdf.PdfAction pdfAction28 = new com.lowagie.text.pdf.PdfAction("convert2pdfp", (int) (byte) 1);
        pdfFormField23.setAction(pdfAction28);
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation30 = com.lowagie.text.pdf.PdfAnnotation.createLink(pdfWriter5, rectangle15, pdfName18, pdfAction28);
        com.lowagie.text.pdf.PdfFileSpecification pdfFileSpecification32 = com.lowagie.text.pdf.PdfFileSpecification.url(pdfWriter5, "title");
        com.lowagie.text.pdf.PdfIndirectReference pdfIndirectReference34 = null;
        try {
            com.lowagie.text.pdf.PdfAction pdfAction35 = com.lowagie.text.pdf.PdfAction.rendition("autoindent", pdfFileSpecification32, "Cp1252", pdfIndirectReference34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(pdfWriter5);
        org.junit.Assert.assertNotNull(rectangle15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(pdfName18);
        org.junit.Assert.assertNotNull(pdfFormField23);
        org.junit.Assert.assertNotNull(pdfAnnotation30);
        org.junit.Assert.assertNotNull(pdfFileSpecification32);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test272");
        com.lowagie.text.pdf.PdfPageLabels pdfPageLabels0 = new com.lowagie.text.pdf.PdfPageLabels();
        pdfPageLabels0.addPageLabel(4194304, (int) 'i', "font");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test273");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier0 = com.lowagie.text.pdf.PdfPKCS7.X509Name.O;
        org.junit.Assert.assertNotNull(aSN1ObjectIdentifier0);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test274");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PV;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test275");
        Document document0 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer1 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer3 = byteBuffer1.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter4 = com.lowagie.text.pdf.PdfWriter.getInstance(document0, (java.io.OutputStream) byteBuffer3);
        try {
            com.lowagie.text.pdf.PdfContentByte pdfContentByte5 = pdfWriter4.getDirectContent();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(pdfWriter4);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test276");
        int i0 = Rectangle.BOTTOM;
        org.junit.Assert.assertTrue(i0 == 2);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test277");
        float f1 = Utilities.inchesToPoints((float) 16384);
        org.junit.Assert.assertTrue(f1 == 1179648.0f);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test278");
        Rectangle rectangle0 = PageSize.TABLOID;
        org.junit.Assert.assertNotNull(rectangle0);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test279");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfRectangle pdfRectangle3 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle4 = pdfRectangle3.getRectangle();
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation9 = com.lowagie.text.pdf.PdfAnnotation.createText(pdfWriter0, rectangle4, "content", "ZHPFQ", false, "No message found for Cp1250");
        Document document10 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer11 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer13 = byteBuffer11.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter14 = com.lowagie.text.pdf.PdfWriter.getInstance(document10, (java.io.OutputStream) byteBuffer13);
        com.lowagie.text.pdf.ByteBuffer byteBuffer15 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer17 = byteBuffer15.appendHex((byte) -1);
        pdfAnnotation9.toPdf(pdfWriter14, (java.io.OutputStream) byteBuffer15);
        com.lowagie.text.pdf.collection.PdfCollection pdfCollection19 = null;
        pdfWriter14.setCollection(pdfCollection19);
        com.lowagie.text.pdf.PdfAcroForm pdfAcroForm21 = pdfWriter14.getAcroForm();
        org.junit.Assert.assertNotNull(rectangle4);
        org.junit.Assert.assertNotNull(pdfAnnotation9);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(pdfWriter14);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(pdfAcroForm21);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test280");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.RI;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test281");
        String[] str_array4 = new String[] { "", "urx", "hi!", "ACTION" };
        java.util.ArrayList<String> arraylist_str5 = new java.util.ArrayList<String>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<String>) arraylist_str5, str_array4);
        arraylist_str5.ensureCapacity(8);
        java.util.Iterator<String> iterator_str9 = arraylist_str5.iterator();
        arraylist_str5.ensureCapacity((int) 'Ä');
        org.junit.Assert.assertNotNull(str_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(iterator_str9);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test282");
        com.lowagie.text.pdf.AcroFields.Item item0 = new com.lowagie.text.pdf.AcroFields.Item();
        Anchor anchor1 = new Anchor();
        ListItem listItem2 = new ListItem((Phrase) anchor1);
        item0.widgets = listItem2;
        com.lowagie.text.pdf.PdfName pdfName4 = com.lowagie.text.pdf.PdfAnnotation.AA_BLUR;
        Document document5 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer6 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer8 = byteBuffer6.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter9 = com.lowagie.text.pdf.PdfWriter.getInstance(document5, (java.io.OutputStream) byteBuffer8);
        pdfWriter9.setEncryption(true, "REMOTEGOTO", "xmpMM:VersionID", 561);
        pdfWriter9.resume();
        java.security.cert.Certificate[] certificate_array16 = new java.security.cert.Certificate[] {};
        int[] i_array17 = com.lowagie.text.pdf.BaseFont.CHAR_RANGE_ARABIC;
        pdfWriter9.setEncryption(certificate_array16, i_array17, 762);
        com.lowagie.text.pdf.PdfOCProperties pdfOCProperties20 = pdfWriter9.getOCProperties();
        item0.writeToAll(pdfName4, (com.lowagie.text.pdf.PdfObject) pdfOCProperties20, 298);
        com.lowagie.text.pdf.internal.PdfViewerPreferencesImp pdfViewerPreferencesImp23 = com.lowagie.text.pdf.internal.PdfViewerPreferencesImp.getViewerPreferences((com.lowagie.text.pdf.PdfDictionary) pdfOCProperties20);
        org.junit.Assert.assertNotNull(pdfName4);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(pdfWriter9);
        org.junit.Assert.assertNotNull(certificate_array16);
        org.junit.Assert.assertNotNull(i_array17);
        org.junit.Assert.assertNotNull(pdfOCProperties20);
        org.junit.Assert.assertNotNull(pdfViewerPreferencesImp23);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test283");
        boolean b1 = com.lowagie.text.pdf.PdfEncryptor.isModifyContentsAllowed(6);
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test284");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfAnnotation.HIGHLIGHT_OUTLINE;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test285");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.X;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test286");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.AUTHEVENT;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test287");
        com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray1 = new com.lowagie.text.pdf.RandomAccessFileOrArray("");
        byte[] byte_array3 = com.lowagie.text.pdf.crypto.IVGenerator.getIV(0);
        int i4 = randomAccessFileOrArray1.read(byte_array3);
        int i5 = randomAccessFileOrArray1.getFilePointer();
        org.junit.Assert.assertNotNull(byte_array3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test288");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.FITBV;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test289");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.SETOCGSTATE;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test290");
        int i0 = com.lowagie.text.pdf.PdfTransition.SPLITHIN;
        org.junit.Assert.assertTrue(i0 == 4);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test291");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.AS;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test292");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_REALIZEPALETTE;
        org.junit.Assert.assertTrue(i0 == 53);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test293");
        String str0 = ElementTags.FONT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "font" + "'", str0.equals("font"));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test294");
        Annotation annotation5 = new Annotation((float) (short) 0, 0.0f, (float) ' ', (float) 2052, 2851);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test295");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfRectangle pdfRectangle3 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle4 = pdfRectangle3.getRectangle();
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation9 = com.lowagie.text.pdf.PdfAnnotation.createText(pdfWriter0, rectangle4, "content", "ZHPFQ", false, "No message found for Cp1250");
        Document document10 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer11 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer13 = byteBuffer11.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter14 = com.lowagie.text.pdf.PdfWriter.getInstance(document10, (java.io.OutputStream) byteBuffer13);
        com.lowagie.text.pdf.ByteBuffer byteBuffer15 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer17 = byteBuffer15.appendHex((byte) -1);
        pdfAnnotation9.toPdf(pdfWriter14, (java.io.OutputStream) byteBuffer15);
        Rectangle rectangle21 = new Rectangle((float) (byte) 100, (float) '4');
        float[] f_array28 = new float[] { 200, (byte) 1, 2052, 1024, 128 };
        float[] f_array34 = new float[] { 200, (byte) 1, 2052, 1024, 128 };
        float[] f_array40 = new float[] { 200, (byte) 1, 2052, 1024, 128 };
        float[] f_array46 = new float[] { 200, (byte) 1, 2052, 1024, 128 };
        float[][] f_array_array47 = new float[][] { f_array28, f_array34, f_array40, f_array46 };
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation48 = com.lowagie.text.pdf.PdfAnnotation.createInk(pdfWriter14, rectangle21, "bordercolor", f_array_array47);
        RectangleReadOnly rectangleReadOnly53 = new RectangleReadOnly((-1.0f), (float) (short) -1, (-1.0f), 0.0f);
        float f54 = rectangleReadOnly53.getBorderWidthTop();
        java.awt.Color color57 = java.awt.Color.getColor("LII", 804);
        rectangleReadOnly53.borderColor = color57;
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation61 = com.lowagie.text.pdf.PdfAnnotation.createStamp(pdfWriter14, (Rectangle) rectangleReadOnly53, "listsymbol", "hf4IMES\r)TALIC");
        com.lowagie.text.pdf.PdfPageEvent pdfPageEvent62 = pdfWriter14.getPageEvent();
        org.junit.Assert.assertNotNull(rectangle4);
        org.junit.Assert.assertNotNull(pdfAnnotation9);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(pdfWriter14);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(f_array28);
        org.junit.Assert.assertNotNull(f_array34);
        org.junit.Assert.assertNotNull(f_array40);
        org.junit.Assert.assertNotNull(f_array46);
        org.junit.Assert.assertNotNull(f_array_array47);
        org.junit.Assert.assertNotNull(pdfAnnotation48);
        org.junit.Assert.assertTrue(f54 == (-1.0f));
        org.junit.Assert.assertNotNull(color57);
        org.junit.Assert.assertNotNull(pdfAnnotation61);
        org.junit.Assert.assertNull(pdfPageEvent62);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test296");
        RomanList romanList1 = new RomanList(0);
        boolean b2 = romanList1.isNestable();
        float f3 = romanList1.symbolIndent;
        romanList1.setAutoindent(true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(f3 == 0.0f);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test297");
        com.lowagie.text.pdf.PdfOutline pdfOutline0 = null;
        com.lowagie.text.pdf.PdfDestination pdfDestination3 = new com.lowagie.text.pdf.PdfDestination(804, (float) 'È');
        com.lowagie.text.pdf.PdfString pdfString4 = null;
        try {
            com.lowagie.text.pdf.PdfOutline pdfOutline6 = new com.lowagie.text.pdf.PdfOutline(pdfOutline0, pdfDestination3, pdfString4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test298");
        Anchor anchor0 = new Anchor();
        Footnote footnote1 = new Footnote();
        HeaderFooter headerFooter2 = new HeaderFooter((Phrase) anchor0, (Phrase) footnote1);
        com.lowagie.text.pdf.PdfDocument pdfDocument3 = new com.lowagie.text.pdf.PdfDocument();
        boolean b4 = headerFooter2.process((ElementListener) pdfDocument3);
        float f5 = pdfDocument3.getLeading();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(f5 == 0.0f);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test299");
        java.awt.Color color0 = java.awt.Color.MAGENTA;
        org.junit.Assert.assertNotNull(color0);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test300");
        Document document0 = new Document();
        document0.marginMirroring = false;
        boolean b4 = document0.addKeywords("xmpMM:DerivedFrom");
        boolean b6 = document0.setMarginMirroring(false);
        float f8 = document0.top((float) 23);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(f8 == 783.0f);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test301");
        com.lowagie.text.pdf.PdfWriter pdfWriter1 = null;
        try {
            com.lowagie.text.pdf.PdfLayer pdfLayer2 = com.lowagie.text.pdf.PdfLayer.createTitle("rel", pdfWriter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test302");
        int i0 = com.lowagie.text.pdf.BarcodeDatamatrix.DM_X21;
        org.junit.Assert.assertTrue(i0 == 5);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test303");
        VersionBean.Version version0 = new VersionBean.Version();
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test304");
        com.lowagie.text.pdf.codec.wmf.MetaBrush metaBrush0 = new com.lowagie.text.pdf.codec.wmf.MetaBrush();
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test305");
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper0 = new com.lowagie.text.pdf.PdfPageEventHelper();
        com.lowagie.text.pdf.PdfWriter pdfWriter1 = null;
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper2 = new com.lowagie.text.pdf.PdfPageEventHelper();
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = null;
        Document document4 = new Document();
        document4.marginMirroring = false;
        pdfPageEventHelper2.onSectionEnd(pdfWriter3, document4, 10.0f);
        RectangleReadOnly rectangleReadOnly13 = new RectangleReadOnly((-1.0f), (float) (short) -1, (-1.0f), 0.0f);
        java.awt.Color color14 = rectangleReadOnly13.borderColorTop;
        pdfPageEventHelper0.onGenericTag(pdfWriter1, document4, (Rectangle) rectangleReadOnly13, "Times-Italic");
        float f18 = document4.top((float) 'È');
        org.junit.Assert.assertNull(color14);
        org.junit.Assert.assertTrue(f18 == 606.0f);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test306");
        String str0 = ElementTags.NAMED;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "named" + "'", str0.equals("named"));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test307");
        java.io.InputStream inputStream0 = null;
        com.lowagie.text.pdf.PdfWriter pdfWriter1 = null;
        com.lowagie.text.pdf.PdfRectangle pdfRectangle4 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle5 = pdfRectangle4.getRectangle();
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation10 = com.lowagie.text.pdf.PdfAnnotation.createText(pdfWriter1, rectangle5, "content", "ZHPFQ", false, "No message found for Cp1250");
        Document document11 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer12 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer14 = byteBuffer12.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter15 = com.lowagie.text.pdf.PdfWriter.getInstance(document11, (java.io.OutputStream) byteBuffer14);
        com.lowagie.text.pdf.ByteBuffer byteBuffer16 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer18 = byteBuffer16.appendHex((byte) -1);
        pdfAnnotation10.toPdf(pdfWriter15, (java.io.OutputStream) byteBuffer16);
        Rectangle rectangle22 = new Rectangle((float) (byte) 100, (float) '4');
        float[] f_array29 = new float[] { 200, (byte) 1, 2052, 1024, 128 };
        float[] f_array35 = new float[] { 200, (byte) 1, 2052, 1024, 128 };
        float[] f_array41 = new float[] { 200, (byte) 1, 2052, 1024, 128 };
        float[] f_array47 = new float[] { 200, (byte) 1, 2052, 1024, 128 };
        float[][] f_array_array48 = new float[][] { f_array29, f_array35, f_array41, f_array47 };
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation49 = com.lowagie.text.pdf.PdfAnnotation.createInk(pdfWriter15, rectangle22, "bordercolor", f_array_array48);
        boolean b51 = pdfWriter15.setMarginMirroringTopBottom(false);
        com.lowagie.text.pdf.PdfDictionary pdfDictionary52 = pdfWriter15.getGroup();
        com.lowagie.text.pdf.PdfFormField pdfFormField53 = com.lowagie.text.pdf.PdfFormField.createEmpty(pdfWriter15);
        try {
            com.lowagie.text.pdf.PdfStream pdfStream54 = new com.lowagie.text.pdf.PdfStream(inputStream0, pdfWriter15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(rectangle5);
        org.junit.Assert.assertNotNull(pdfAnnotation10);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(pdfWriter15);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(f_array29);
        org.junit.Assert.assertNotNull(f_array35);
        org.junit.Assert.assertNotNull(f_array41);
        org.junit.Assert.assertNotNull(f_array47);
        org.junit.Assert.assertNotNull(f_array_array48);
        org.junit.Assert.assertNotNull(pdfAnnotation49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNull(pdfDictionary52);
        org.junit.Assert.assertNotNull(pdfFormField53);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test308");
        com.lowagie.text.pdf.hyphenation.HyphenationTree hyphenationTree2 = com.lowagie.text.pdf.hyphenation.Hyphenator.getHyphenationTree("Right", "dc:date");
        org.junit.Assert.assertNull(hyphenationTree2);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test309");
        String str0 = ElementTags.ALIGN_CENTER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Center" + "'", str0.equals("Center"));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test310");
        Font font3 = FontFactory.getFont("JustifyAll", "padding-left", false);
        com.lowagie.text.pdf.BaseFont baseFont4 = font3.getBaseFont();
        org.junit.Assert.assertNotNull(font3);
        org.junit.Assert.assertNull(baseFont4);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test311");
        java.util.HashMap hashMap0 = com.lowagie.text.xml.simpleparser.EntitiesToSymbol.map;
        org.junit.Assert.assertNotNull(hashMap0);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test312");
        int i0 = Image.BX;
        org.junit.Assert.assertTrue(i0 == 2);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test313");
        com.lowagie.text.pdf.PdfPageLabels pdfPageLabels0 = new com.lowagie.text.pdf.PdfPageLabels();
        com.lowagie.text.pdf.PdfPageLabels.PdfPageLabelFormat pdfPageLabelFormat5 = new com.lowagie.text.pdf.PdfPageLabels.PdfPageLabelFormat(5, (int) 'Æ', "font-size", 262144);
        pdfPageLabels0.addPageLabel(pdfPageLabelFormat5);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test314");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfFormField.IF_SCALE_ALWAYS;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test315");
        Document document0 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer1 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer3 = byteBuffer1.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter4 = com.lowagie.text.pdf.PdfWriter.getInstance(document0, (java.io.OutputStream) byteBuffer3);
        pdfWriter4.setEncryption(true, "REMOTEGOTO", "xmpMM:VersionID", 561);
        com.lowagie.text.pdf.PdfFileSpecification pdfFileSpecification11 = com.lowagie.text.pdf.PdfFileSpecification.fileExtern(pdfWriter4, "hi!");
        com.lowagie.text.pdf.PdfName pdfName12 = com.lowagie.text.pdf.PdfAnnotation.AA_JS_CHANGE;
        pdfWriter4.setPdfVersion(pdfName12);
        int i14 = pdfWriter4.getPageNumber();
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(pdfWriter4);
        org.junit.Assert.assertNotNull(pdfFileSpecification11);
        org.junit.Assert.assertNotNull(pdfName12);
        org.junit.Assert.assertTrue(i14 == 0);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test316");
        List list1 = new List((float) 32);
        int i2 = list1.getFirst();
        org.junit.Assert.assertTrue(i2 == 1);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test317");
        int i1 = com.lowagie.text.pdf.PRTokeniser.getHex(4096);
        org.junit.Assert.assertTrue(i1 == (-1));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test318");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.SIMPLEX;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test319");
        String str0 = ElementTags.COLOR;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "color" + "'", str0.equals("color"));
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test320");
        Phrase phrase2 = new Phrase((float) 1785751920, "HSCALE");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test321");
        String str0 = com.lowagie.text.pdf.AsianFontMapper.ChineseTraditionalFont_MSung;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "MSung-Light" + "'", str0.equals("MSung-Light"));
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test322");
        com.lowagie.text.pdf.PdfRectangle pdfRectangle2 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle3 = pdfRectangle2.getRectangle();
        Rectangle rectangle6 = rectangle3.rectangle((float) 258, (float) (byte) 10);
        float f7 = rectangle6.getRight();
        org.junit.Assert.assertNotNull(rectangle3);
        org.junit.Assert.assertNotNull(rectangle6);
        org.junit.Assert.assertTrue(f7 == 52.0f);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test323");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfRectangle pdfRectangle3 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle4 = pdfRectangle3.getRectangle();
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation9 = com.lowagie.text.pdf.PdfAnnotation.createText(pdfWriter0, rectangle4, "content", "ZHPFQ", false, "No message found for Cp1250");
        Document document10 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer11 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer13 = byteBuffer11.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter14 = com.lowagie.text.pdf.PdfWriter.getInstance(document10, (java.io.OutputStream) byteBuffer13);
        com.lowagie.text.pdf.ByteBuffer byteBuffer15 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer17 = byteBuffer15.appendHex((byte) -1);
        pdfAnnotation9.toPdf(pdfWriter14, (java.io.OutputStream) byteBuffer15);
        try {
            pdfWriter14.addJavaScript("reference", "apache_license.txt", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(rectangle4);
        org.junit.Assert.assertNotNull(pdfAnnotation9);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(pdfWriter14);
        org.junit.Assert.assertNotNull(byteBuffer17);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test324");
        com.lowagie.text.pdf.PdfBoolean pdfBoolean0 = com.lowagie.text.pdf.PdfBoolean.PDFTRUE;
        org.junit.Assert.assertNotNull(pdfBoolean0);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test325");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfRectangle pdfRectangle3 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle4 = pdfRectangle3.getRectangle();
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation9 = com.lowagie.text.pdf.PdfAnnotation.createText(pdfWriter0, rectangle4, "content", "ZHPFQ", false, "No message found for Cp1250");
        Document document10 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer11 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer13 = byteBuffer11.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter14 = com.lowagie.text.pdf.PdfWriter.getInstance(document10, (java.io.OutputStream) byteBuffer13);
        com.lowagie.text.pdf.ByteBuffer byteBuffer15 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer17 = byteBuffer15.appendHex((byte) -1);
        pdfAnnotation9.toPdf(pdfWriter14, (java.io.OutputStream) byteBuffer15);
        Rectangle rectangle21 = new Rectangle((float) (byte) 100, (float) '4');
        float[] f_array28 = new float[] { 200, (byte) 1, 2052, 1024, 128 };
        float[] f_array34 = new float[] { 200, (byte) 1, 2052, 1024, 128 };
        float[] f_array40 = new float[] { 200, (byte) 1, 2052, 1024, 128 };
        float[] f_array46 = new float[] { 200, (byte) 1, 2052, 1024, 128 };
        float[][] f_array_array47 = new float[][] { f_array28, f_array34, f_array40, f_array46 };
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation48 = com.lowagie.text.pdf.PdfAnnotation.createInk(pdfWriter14, rectangle21, "bordercolor", f_array_array47);
        pdfAnnotation48.setAppearanceState("HYPHENATION");
        com.lowagie.text.pdf.PdfName pdfName51 = com.lowagie.text.pdf.PdfName.PERMS;
        com.lowagie.text.pdf.PdfBoolean pdfBoolean52 = pdfAnnotation48.getAsBoolean(pdfName51);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte53 = null;
        try {
            pdfAnnotation48.setDefaultAppearanceString(pdfContentByte53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(rectangle4);
        org.junit.Assert.assertNotNull(pdfAnnotation9);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(pdfWriter14);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(f_array28);
        org.junit.Assert.assertNotNull(f_array34);
        org.junit.Assert.assertNotNull(f_array40);
        org.junit.Assert.assertNotNull(f_array46);
        org.junit.Assert.assertNotNull(f_array_array47);
        org.junit.Assert.assertNotNull(pdfAnnotation48);
        org.junit.Assert.assertNotNull(pdfName51);
        org.junit.Assert.assertNull(pdfBoolean52);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test326");
        com.lowagie.text.pdf.AsianFontMapper asianFontMapper2 = new com.lowagie.text.pdf.AsianFontMapper("Rectangle: 100.0x52.0 (rot: 0 degrees6)", "dc:title");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test327");
        int i0 = com.lowagie.text.pdf.PdfAction.LASTPAGE;
        org.junit.Assert.assertTrue(i0 == 4);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test328");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TH;
        int i1 = pdfName0.type();
        org.junit.Assert.assertNotNull(pdfName0);
        org.junit.Assert.assertTrue(i1 == 4);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test329");
        String str0 = com.lowagie.text.html.Markup.CSS_KEY_MARGINRIGHT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "margin-right" + "'", str0.equals("margin-right"));
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test330");
        int i0 = Image.DEFAULT;
        org.junit.Assert.assertTrue(i0 == 0);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test331");
        Chunk chunk0 = Chunk.NEXTPAGE;
        Chunk chunk1 = new Chunk(chunk0);
        org.junit.Assert.assertNotNull(chunk0);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test332");
        int i0 = com.lowagie.text.pdf.BaseFont.SUBSCRIPT_SIZE;
        org.junit.Assert.assertTrue(i0 == 17);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test333");
        Section section0 = new Section();
        boolean b1 = section0.isTriggerNewPage();
        section0.setNotAddedYet(true);
        int i4 = section0.getNumberStyle();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test334");
        Image image0 = null;
        Image image1 = Image.getInstance(image0);
        org.junit.Assert.assertNull(image1);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test335");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ASSETS;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test336");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        Rectangle rectangle3 = new Rectangle((float) (byte) 100, (float) '4');
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation8 = com.lowagie.text.pdf.PdfAnnotation.createText(pdfWriter0, rectangle3, "xmpMM:VersionID", "ZHPFQ", false, "");
        com.lowagie.text.pdf.PdfName pdfName9 = com.lowagie.text.pdf.PdfName.EXPORTSTATE;
        com.lowagie.text.pdf.PdfStream pdfStream10 = pdfAnnotation8.getAsStream(pdfName9);
        org.junit.Assert.assertNotNull(pdfAnnotation8);
        org.junit.Assert.assertNotNull(pdfName9);
        org.junit.Assert.assertNull(pdfStream10);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test337");
        com.lowagie.text.pdf.PdfSigGenericPKCS.VeriSign veriSign0 = new com.lowagie.text.pdf.PdfSigGenericPKCS.VeriSign();
        veriSign0.setContact("text-decoration");
        com.lowagie.text.pdf.crypto.ARCFOUREncryption aRCFOUREncryption3 = new com.lowagie.text.pdf.crypto.ARCFOUREncryption();
        byte[] byte_array5 = com.lowagie.text.pdf.crypto.IVGenerator.getIV((int) (byte) 47);
        byte[] byte_array9 = com.lowagie.text.pdf.Barcode128.getBarsCode128Raw("hi!");
        aRCFOUREncryption3.encryptARCFOUR(byte_array5, (int) (byte) 1, (-1), byte_array9, 3);
        veriSign0.setCert(byte_array9);
        veriSign0.setLocation("com/lowagie/text/pdf/fonts/");
        com.lowagie.text.pdf.PdfReader pdfReader15 = null;
        byte[] byte_array16 = com.lowagie.text.pdf.crypto.IVGenerator.getIV();
        com.lowagie.text.pdf.PRStream pRStream17 = new com.lowagie.text.pdf.PRStream(pdfReader15, byte_array16);
        com.lowagie.text.pdf.crypto.ARCFOUREncryption aRCFOUREncryption18 = new com.lowagie.text.pdf.crypto.ARCFOUREncryption();
        byte[] byte_array20 = com.lowagie.text.pdf.crypto.IVGenerator.getIV((int) (byte) 47);
        byte[] byte_array24 = com.lowagie.text.pdf.Barcode128.getBarsCode128Raw("hi!");
        aRCFOUREncryption18.encryptARCFOUR(byte_array20, (int) (byte) 1, (-1), byte_array24, 3);
        pRStream17.setData(byte_array20, true);
        veriSign0.setCert(byte_array20);
        org.junit.Assert.assertNotNull(byte_array5);
        org.junit.Assert.assertNotNull(byte_array9);
        org.junit.Assert.assertNotNull(byte_array16);
        org.junit.Assert.assertNotNull(byte_array20);
        org.junit.Assert.assertNotNull(byte_array24);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test338");
        String[] str_array4 = new String[] { "", "convert2pdfp", "encoding", "UTF-16BE" };
        java.util.ArrayList<String> arraylist_str5 = new java.util.ArrayList<String>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<String>) arraylist_str5, str_array4);
        java.util.stream.Stream<String> stream_str7 = arraylist_str5.stream();
        arraylist_str5.trimToSize();
        org.junit.Assert.assertNotNull(str_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(stream_str7);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test339");
        try {
            Rectangle rectangle1 = PageSize.getRectangle("padding-bottom");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (RuntimeException e) {
        }
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test340");
        int i0 = com.lowagie.text.pdf.PdfTransition.SPLITVOUT;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test341");
        Rectangle rectangle0 = PageSize.ARCH_D;
        float f1 = rectangle0.lly;
        org.junit.Assert.assertNotNull(rectangle0);
        org.junit.Assert.assertTrue(f1 == 0.0f);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test342");
        char[] char_array3 = new char[] { 'Æ', 'i', 'Ä' };
        int i4 = com.lowagie.text.pdf.hyphenation.TernaryTree.strlen(char_array3);
        org.junit.Assert.assertNotNull(char_array3);
        org.junit.Assert.assertTrue(i4 == 3);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test343");
        Chunk chunk0 = Chunk.NEXTPAGE;
        com.lowagie.text.pdf.PdfWriter pdfWriter1 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField5 = com.lowagie.text.pdf.PdfFormField.createTextField(pdfWriter1, true, false, 258);
        pdfFormField5.setButton(0);
        Chunk chunk8 = chunk0.setAnnotation((com.lowagie.text.pdf.PdfAnnotation) pdfFormField5);
        Chunk chunk10 = chunk8.setLocalDestination("ZHPFQ");
        Chunk chunk12 = chunk10.setTextRise((float) 200);
        org.junit.Assert.assertNotNull(chunk0);
        org.junit.Assert.assertNotNull(pdfFormField5);
        org.junit.Assert.assertNotNull(chunk8);
        org.junit.Assert.assertNotNull(chunk10);
        org.junit.Assert.assertNotNull(chunk12);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test344");
        String str0 = ElementTags.APPLICATION;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "application" + "'", str0.equals("application"));
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test345");
        DocumentException documentException1 = new DocumentException("ENCODING");
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test346");
        int i0 = com.lowagie.text.pdf.BarcodePDF417.PDF417_FIXED_COLUMNS;
        org.junit.Assert.assertTrue(i0 == 2);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test347");
        Chunk chunk0 = Chunk.NEXTPAGE;
        com.lowagie.text.pdf.PdfWriter pdfWriter1 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField5 = com.lowagie.text.pdf.PdfFormField.createTextField(pdfWriter1, true, false, 258);
        pdfFormField5.setButton(0);
        Chunk chunk8 = chunk0.setAnnotation((com.lowagie.text.pdf.PdfAnnotation) pdfFormField5);
        boolean b9 = chunk8.isNestable();
        Chunk chunk11 = chunk8.setCharacterSpacing((float) 1718909296);
        org.junit.Assert.assertNotNull(chunk0);
        org.junit.Assert.assertNotNull(pdfFormField5);
        org.junit.Assert.assertNotNull(chunk8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(chunk11);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test348");
        Document document0 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer1 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer3 = byteBuffer1.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter4 = com.lowagie.text.pdf.PdfWriter.getInstance(document0, (java.io.OutputStream) byteBuffer3);
        pdfWriter4.setEncryption(true, "REMOTEGOTO", "xmpMM:VersionID", 561);
        pdfWriter4.resume();
        java.security.cert.Certificate[] certificate_array11 = new java.security.cert.Certificate[] {};
        int[] i_array12 = com.lowagie.text.pdf.BaseFont.CHAR_RANGE_ARABIC;
        pdfWriter4.setEncryption(certificate_array11, i_array12, 762);
        com.lowagie.text.pdf.PdfWriter pdfWriter15 = null;
        Rectangle rectangle18 = new Rectangle((float) (byte) 100, (float) '4');
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation23 = com.lowagie.text.pdf.PdfAnnotation.createText(pdfWriter15, rectangle18, "xmpMM:VersionID", "ZHPFQ", false, "");
        com.lowagie.text.pdf.PdfWriter pdfWriter25 = null;
        com.lowagie.text.pdf.PdfRectangle pdfRectangle28 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle29 = pdfRectangle28.getRectangle();
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation34 = com.lowagie.text.pdf.PdfAnnotation.createText(pdfWriter25, rectangle29, "content", "ZHPFQ", false, "No message found for Cp1250");
        Document document35 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer36 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer38 = byteBuffer36.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter39 = com.lowagie.text.pdf.PdfWriter.getInstance(document35, (java.io.OutputStream) byteBuffer38);
        com.lowagie.text.pdf.ByteBuffer byteBuffer40 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer42 = byteBuffer40.appendHex((byte) -1);
        pdfAnnotation34.toPdf(pdfWriter39, (java.io.OutputStream) byteBuffer40);
        Rectangle rectangle46 = new Rectangle((float) (byte) 100, (float) '4');
        float[] f_array53 = new float[] { 200, (byte) 1, 2052, 1024, 128 };
        float[] f_array59 = new float[] { 200, (byte) 1, 2052, 1024, 128 };
        float[] f_array65 = new float[] { 200, (byte) 1, 2052, 1024, 128 };
        float[] f_array71 = new float[] { 200, (byte) 1, 2052, 1024, 128 };
        float[][] f_array_array72 = new float[][] { f_array53, f_array59, f_array65, f_array71 };
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation73 = com.lowagie.text.pdf.PdfAnnotation.createInk(pdfWriter39, rectangle46, "bordercolor", f_array_array72);
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation74 = com.lowagie.text.pdf.PdfAnnotation.createInk(pdfWriter4, rectangle18, "row", f_array_array72);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(pdfWriter4);
        org.junit.Assert.assertNotNull(certificate_array11);
        org.junit.Assert.assertNotNull(i_array12);
        org.junit.Assert.assertNotNull(pdfAnnotation23);
        org.junit.Assert.assertNotNull(rectangle29);
        org.junit.Assert.assertNotNull(pdfAnnotation34);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(pdfWriter39);
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertNotNull(f_array53);
        org.junit.Assert.assertNotNull(f_array59);
        org.junit.Assert.assertNotNull(f_array65);
        org.junit.Assert.assertNotNull(f_array71);
        org.junit.Assert.assertNotNull(f_array_array72);
        org.junit.Assert.assertNotNull(pdfAnnotation73);
        org.junit.Assert.assertNotNull(pdfAnnotation74);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test349");
        Image image0 = null;
        try {
            ImgWMF imgWMF1 = new ImgWMF(image0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test350");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField4 = com.lowagie.text.pdf.PdfFormField.createTextField(pdfWriter0, true, false, 258);
        pdfFormField4.setButton(0);
        com.lowagie.text.pdf.PdfName pdfName7 = com.lowagie.text.pdf.PdfName.USEATTACHMENTS;
        com.lowagie.text.pdf.PdfObject pdfObject8 = pdfFormField4.getDirectObject(pdfName7);
        org.junit.Assert.assertNotNull(pdfFormField4);
        org.junit.Assert.assertNotNull(pdfName7);
        org.junit.Assert.assertNull(pdfObject8);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test351");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PRINTAREA;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test352");
        com.lowagie.text.pdf.BidiLine bidiLine0 = new com.lowagie.text.pdf.BidiLine();
        int i3 = bidiLine0.trimLeftEx(302, (int) 'È');
        org.junit.Assert.assertTrue(i3 == 302);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test353");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfRectangle pdfRectangle3 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle4 = pdfRectangle3.getRectangle();
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation9 = com.lowagie.text.pdf.PdfAnnotation.createText(pdfWriter0, rectangle4, "content", "ZHPFQ", false, "No message found for Cp1250");
        Document document10 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer11 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer13 = byteBuffer11.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter14 = com.lowagie.text.pdf.PdfWriter.getInstance(document10, (java.io.OutputStream) byteBuffer13);
        com.lowagie.text.pdf.ByteBuffer byteBuffer15 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer17 = byteBuffer15.appendHex((byte) -1);
        pdfAnnotation9.toPdf(pdfWriter14, (java.io.OutputStream) byteBuffer15);
        pdfWriter14.setOpenAction("width");
        com.lowagie.text.pdf.PdfStructureTreeRoot pdfStructureTreeRoot21 = pdfWriter14.getStructureTreeRoot();
        org.junit.Assert.assertNotNull(rectangle4);
        org.junit.Assert.assertNotNull(pdfAnnotation9);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(pdfWriter14);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNull(pdfStructureTreeRoot21);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test354");
        Anchor anchor0 = new Anchor();
        ListItem listItem1 = new ListItem((Phrase) anchor0);
        int i2 = listItem1.getAlignment();
        Section section4 = new Section((Paragraph) listItem1, 804);
        listItem1.leading = (short) 0;
        float f7 = listItem1.spacingBefore();
        org.junit.Assert.assertTrue(i2 == (-1));
        org.junit.Assert.assertTrue(f7 == 0.0f);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test355");
        com.lowagie.text.pdf.BidiLine bidiLine0 = new com.lowagie.text.pdf.BidiLine();
        com.lowagie.text.pdf.BidiLine bidiLine1 = new com.lowagie.text.pdf.BidiLine(bidiLine0);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test356");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfRectangle pdfRectangle3 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle4 = pdfRectangle3.getRectangle();
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation9 = com.lowagie.text.pdf.PdfAnnotation.createText(pdfWriter0, rectangle4, "content", "ZHPFQ", false, "No message found for Cp1250");
        Document document10 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer11 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer13 = byteBuffer11.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter14 = com.lowagie.text.pdf.PdfWriter.getInstance(document10, (java.io.OutputStream) byteBuffer13);
        com.lowagie.text.pdf.ByteBuffer byteBuffer15 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer17 = byteBuffer15.appendHex((byte) -1);
        pdfAnnotation9.toPdf(pdfWriter14, (java.io.OutputStream) byteBuffer15);
        Rectangle rectangle21 = new Rectangle((float) (byte) 100, (float) '4');
        float[] f_array28 = new float[] { 200, (byte) 1, 2052, 1024, 128 };
        float[] f_array34 = new float[] { 200, (byte) 1, 2052, 1024, 128 };
        float[] f_array40 = new float[] { 200, (byte) 1, 2052, 1024, 128 };
        float[] f_array46 = new float[] { 200, (byte) 1, 2052, 1024, 128 };
        float[][] f_array_array47 = new float[][] { f_array28, f_array34, f_array40, f_array46 };
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation48 = com.lowagie.text.pdf.PdfAnnotation.createInk(pdfWriter14, rectangle21, "bordercolor", f_array_array47);
        RectangleReadOnly rectangleReadOnly53 = new RectangleReadOnly((-1.0f), (float) (short) -1, (-1.0f), 0.0f);
        float f54 = rectangleReadOnly53.getBorderWidthTop();
        java.awt.Color color57 = java.awt.Color.getColor("LII", 804);
        rectangleReadOnly53.borderColor = color57;
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation61 = com.lowagie.text.pdf.PdfAnnotation.createStamp(pdfWriter14, (Rectangle) rectangleReadOnly53, "listsymbol", "hf4IMES\r)TALIC");
        byte[] byte_array63 = com.lowagie.text.pdf.PdfName.encodeName("xmpMM:ManagedFrom");
        pdfWriter14.setPageXmpMetadata(byte_array63);
        com.lowagie.text.pdf.PdfName pdfName65 = com.lowagie.text.pdf.PdfName.ITXT;
        com.lowagie.text.pdf.PdfAction pdfAction68 = new com.lowagie.text.pdf.PdfAction("convert2pdfp", (int) (byte) 1);
        try {
            pdfWriter14.setPageAction(pdfName65, pdfAction68);
            org.junit.Assert.fail("Expected exception of type com.lowagie.text.DocumentException");
        } catch (DocumentException e) {
        }
        org.junit.Assert.assertNotNull(rectangle4);
        org.junit.Assert.assertNotNull(pdfAnnotation9);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(pdfWriter14);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(f_array28);
        org.junit.Assert.assertNotNull(f_array34);
        org.junit.Assert.assertNotNull(f_array40);
        org.junit.Assert.assertNotNull(f_array46);
        org.junit.Assert.assertNotNull(f_array_array47);
        org.junit.Assert.assertNotNull(pdfAnnotation48);
        org.junit.Assert.assertTrue(f54 == (-1.0f));
        org.junit.Assert.assertNotNull(color57);
        org.junit.Assert.assertNotNull(pdfAnnotation61);
        org.junit.Assert.assertNotNull(byte_array63);
        org.junit.Assert.assertNotNull(pdfName65);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test357");
        int i0 = Element.ALIGN_MIDDLE;
        org.junit.Assert.assertTrue(i0 == 5);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test358");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.CENTERWINDOW;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test359");
        com.lowagie.text.pdf.PdfContentByte pdfContentByte0 = null;
        com.lowagie.text.pdf.DefaultFontMapper defaultFontMapper3 = new com.lowagie.text.pdf.DefaultFontMapper();
        java.awt.print.PrinterJob printerJob7 = null;
        try {
            com.lowagie.text.pdf.PdfPrinterGraphics2D pdfPrinterGraphics2D8 = new com.lowagie.text.pdf.PdfPrinterGraphics2D(pdfContentByte0, 783.0f, (float) 200, (com.lowagie.text.pdf.FontMapper) defaultFontMapper3, true, true, (float) (-56377345), printerJob7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test360");
        java.awt.Color color0 = java.awt.Color.gray;
        java.awt.image.ColorModel colorModel1 = null;
        java.awt.Rectangle rectangle2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        java.awt.geom.AffineTransform affineTransform4 = null;
        java.awt.RenderingHints renderingHints5 = null;
        java.awt.PaintContext paintContext6 = color0.createContext(colorModel1, rectangle2, rectangle2D3, affineTransform4, renderingHints5);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(paintContext6);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test361");
        boolean b0 = SimpleCell.ROW;
        org.junit.Assert.assertTrue(b0 == true);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test362");
        int i0 = com.lowagie.text.pdf.PdfFormField.FF_PUSHBUTTON;
        org.junit.Assert.assertTrue(i0 == 65536);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test363");
        boolean b0 = List.UNORDERED;
        org.junit.Assert.assertTrue(b0 == false);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test364");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.NOTE;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test365");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.HELVETICA_OBLIQUE;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test366");
        byte byte0 = DocWriter.GT;
        org.junit.Assert.assertTrue(byte0 == (byte) 62);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test367");
        com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS pPKMS0 = new com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS();
        pPKMS0.setName("Times-Italic");
        String str3 = pPKMS0.getName();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test368");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ENCODEDBYTEALIGN;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test369");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.GOTOE;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test370");
        float f0 = com.lowagie.text.pdf.PdfPRow.BOTTOM_LIMIT;
        org.junit.Assert.assertTrue(f0 == (-1.07374182E9f));
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test371");
        com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray1 = new com.lowagie.text.pdf.RandomAccessFileOrArray("");
        int i3 = randomAccessFileOrArray1.skipBytes(3);
        double d4 = randomAccessFileOrArray1.readDoubleLE();
        double d5 = randomAccessFileOrArray1.readDouble();
        org.junit.Assert.assertTrue(i3 == 3);
        org.junit.Assert.assertTrue(d4 == 2.5171752293465407E180d);
        org.junit.Assert.assertTrue(d5 == 1.121739341106367E224d);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test372");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.MCR;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test373");
        int i0 = Image.DY;
        org.junit.Assert.assertTrue(i0 == 7);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test374");
        java.awt.Color color0 = java.awt.Color.darkGray;
        org.junit.Assert.assertNotNull(color0);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test375");
        com.lowagie.text.xml.xmp.LangAlt langAlt1 = new com.lowagie.text.xml.xmp.LangAlt("indentationright");
        com.lowagie.text.pdf.PdfName pdfName2 = com.lowagie.text.pdf.PdfName.ITALICANGLE;
        java.util.List list5 = com.lowagie.text.pdf.SequenceList.expand("line-through", 3);
        com.lowagie.text.pdf.PdfArray pdfArray6 = new com.lowagie.text.pdf.PdfArray((java.util.List<com.lowagie.text.pdf.PdfObject>) list5);
        Rectangle rectangle7 = PageSize.ROYAL_OCTAVO;
        rectangle7.rotation = '2';
        boolean b10 = langAlt1.replace((Object) pdfName2, (Object) list5, (Object) '2');
        org.junit.Assert.assertNotNull(pdfName2);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test376");
        com.lowagie.text.pdf.PdfDashPattern pdfDashPattern3 = new com.lowagie.text.pdf.PdfDashPattern((float) 200, (float) 1L, 0.0f);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test377");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.VIEWSTATE;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test378");
        com.lowagie.text.pdf.PdfNumber pdfNumber0 = com.lowagie.text.pdf.PdfFormXObject.ONE;
        pdfNumber0.increment();
        org.junit.Assert.assertNotNull(pdfNumber0);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test379");
        RectangleReadOnly rectangleReadOnly4 = new RectangleReadOnly((-1.0f), (float) (short) -1, (-1.0f), 0.0f);
        java.awt.Color color5 = rectangleReadOnly4.getBorderColorLeft();
        org.junit.Assert.assertNull(color5);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test380");
        Chunk chunk0 = Chunk.NEXTPAGE;
        Paragraph paragraph1 = new Paragraph(chunk0);
        java.awt.Color color2 = null;
        Chunk chunk3 = chunk0.setBackground(color2);
        Chunk chunk4 = new Chunk(chunk3);
        org.junit.Assert.assertNotNull(chunk0);
        org.junit.Assert.assertNotNull(chunk3);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test381");
        com.lowagie.text.pdf.PdfAction pdfAction1 = new com.lowagie.text.pdf.PdfAction(3);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test382");
        com.lowagie.text.pdf.PdfRectangle pdfRectangle2 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle3 = pdfRectangle2.getRectangle();
        Rectangle rectangle6 = rectangle3.rectangle((float) 258, (float) (byte) 10);
        float f7 = rectangle3.getGrayFill();
        org.junit.Assert.assertNotNull(rectangle3);
        org.junit.Assert.assertNotNull(rectangle6);
        org.junit.Assert.assertTrue(f7 == 0.0f);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test383");
        RomanList romanList1 = new RomanList(32);
        java.util.ArrayList arrayList2 = romanList1.getItems();
        com.lowagie.text.pdf.PdfName pdfName3 = com.lowagie.text.pdf.PdfFormField.IF_SCALE_NEVER;
        boolean b4 = arrayList2.contains((Object) pdfName3);
        com.lowagie.text.pdf.PRIndirectReference pRIndirectReference5 = pdfName3.getIndRef();
        org.junit.Assert.assertNotNull(arrayList2);
        org.junit.Assert.assertNotNull(pdfName3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(pRIndirectReference5);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test384");
        List list1 = new List(true);
        float f2 = list1.getIndentationLeft();
        boolean b3 = list1.lowercase;
        list1.setIndentationRight((float) 1783636000);
        org.junit.Assert.assertTrue(f2 == 0.0f);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test385");
        com.lowagie.text.pdf.PdfEncryption pdfEncryption0 = null;
        try {
            com.lowagie.text.pdf.PdfEncryption pdfEncryption1 = new com.lowagie.text.pdf.PdfEncryption(pdfEncryption0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test386");
        RomanList romanList1 = new RomanList(32);
        boolean b2 = romanList1.lowercase;
        romanList1.postSymbol = "tablefitspage";
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test387");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_PATBLT;
        org.junit.Assert.assertTrue(i0 == 1565);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test388");
        java.awt.Color color7 = null;
        Font font9 = FontFactory.getFont("plainwidth", "No message found for encoding", false, (float) (short) 1, 2851, color7, false);
        Phrase phrase10 = Phrase.getInstance(804, "", font9);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(phrase10);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test389");
        char char0 = com.lowagie.text.pdf.Barcode128.STARTA;
        org.junit.Assert.assertTrue(char0 == 'Ë');
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test390");
        com.lowagie.text.pdf.PdfRectangle pdfRectangle2 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = null;
        com.lowagie.text.pdf.PdfRectangle pdfRectangle6 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle7 = pdfRectangle6.getRectangle();
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation12 = com.lowagie.text.pdf.PdfAnnotation.createText(pdfWriter3, rectangle7, "content", "ZHPFQ", false, "No message found for Cp1250");
        Document document13 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer14 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer16 = byteBuffer14.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter17 = com.lowagie.text.pdf.PdfWriter.getInstance(document13, (java.io.OutputStream) byteBuffer16);
        com.lowagie.text.pdf.ByteBuffer byteBuffer18 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer20 = byteBuffer18.appendHex((byte) -1);
        pdfAnnotation12.toPdf(pdfWriter17, (java.io.OutputStream) byteBuffer18);
        Rectangle rectangle24 = new Rectangle((float) (byte) 100, (float) '4');
        float[] f_array31 = new float[] { 200, (byte) 1, 2052, 1024, 128 };
        float[] f_array37 = new float[] { 200, (byte) 1, 2052, 1024, 128 };
        float[] f_array43 = new float[] { 200, (byte) 1, 2052, 1024, 128 };
        float[] f_array49 = new float[] { 200, (byte) 1, 2052, 1024, 128 };
        float[][] f_array_array50 = new float[][] { f_array31, f_array37, f_array43, f_array49 };
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation51 = com.lowagie.text.pdf.PdfAnnotation.createInk(pdfWriter17, rectangle24, "bordercolor", f_array_array50);
        RectangleReadOnly rectangleReadOnly56 = new RectangleReadOnly((-1.0f), (float) (short) -1, (-1.0f), 0.0f);
        float f57 = rectangleReadOnly56.getBorderWidthTop();
        java.awt.Color color60 = java.awt.Color.getColor("LII", 804);
        rectangleReadOnly56.borderColor = color60;
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation64 = com.lowagie.text.pdf.PdfAnnotation.createStamp(pdfWriter17, (Rectangle) rectangleReadOnly56, "listsymbol", "hf4IMES\r)TALIC");
        pdfRectangle2.addFirst((com.lowagie.text.pdf.PdfObject) pdfAnnotation64);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertNotNull(pdfAnnotation12);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(pdfWriter17);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(f_array31);
        org.junit.Assert.assertNotNull(f_array37);
        org.junit.Assert.assertNotNull(f_array43);
        org.junit.Assert.assertNotNull(f_array49);
        org.junit.Assert.assertNotNull(f_array_array50);
        org.junit.Assert.assertNotNull(pdfAnnotation51);
        org.junit.Assert.assertTrue(f57 == (-1.0f));
        org.junit.Assert.assertNotNull(color60);
        org.junit.Assert.assertNotNull(pdfAnnotation64);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test391");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.RBGROUPS;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test392");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.BIGFIVE;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test393");
        int i0 = com.lowagie.text.pdf.collection.PdfCollectionField.DATE;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test394");
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper0 = new com.lowagie.text.pdf.PdfPageEventHelper();
        com.lowagie.text.pdf.PdfWriter pdfWriter1 = null;
        Document document2 = new Document();
        document2.marginMirroring = false;
        pdfPageEventHelper0.onSectionEnd(pdfWriter1, document2, 10.0f);
        document2.javaScript_onLoad = "hi!";
        document2.marginMirroringTopBottom = false;
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test395");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaState.TA_BASELINE;
        org.junit.Assert.assertTrue(i0 == 24);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test396");
        int i0 = Element.ALIGN_CENTER;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test397");
        String str0 = ElementTags.BLUE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "blue" + "'", str0.equals("blue"));
    }
}

