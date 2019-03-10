package com.lowagie.text;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        int i0 = com.lowagie.text.pdf.ColumnText.AR_LIG;
        org.junit.Assert.assertTrue(i0 == 8);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.SIG;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PRIVATE;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.I;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        int i0 = com.lowagie.text.pdf.PdfTransition.DISSOLVE;
        org.junit.Assert.assertTrue(i0 == 13);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        Section section0 = null;
        try {
            MarkedSection markedSection1 = new MarkedSection(section0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ON;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.VOFFSET;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        int i0 = com.lowagie.text.pdf.PdfTransition.INBOX;
        org.junit.Assert.assertTrue(i0 == 7);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_SETBKMODE;
        org.junit.Assert.assertTrue(i0 == 258);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        Font font2 = null;
        Phrase phrase3 = new Phrase((float) (short) -1, "hi!", font2);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        int i0 = com.lowagie.text.pdf.AcroFields.FIELD_TYPE_RADIOBUTTON;
        org.junit.Assert.assertTrue(i0 == 3);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        String str0 = Chunk.ACTION;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ACTION" + "'", str0.equals("ACTION"));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        int i0 = com.lowagie.text.pdf.ExtendedColor.TYPE_CMYK;
        org.junit.Assert.assertTrue(i0 == 2);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.OUTPUTCONDITION;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier0 = com.lowagie.text.pdf.PdfPKCS7.X509Name.ST;
        org.junit.Assert.assertNotNull(aSN1ObjectIdentifier0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.io.InputStream inputStream0 = null;
        try {
            com.lowagie.text.pdf.PdfReader pdfReader1 = new com.lowagie.text.pdf.PdfReader(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.IMAGEB;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        int i0 = com.lowagie.text.pdf.PdfTransition.TBWIPE;
        org.junit.Assert.assertTrue(i0 == 12);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        int i0 = Image.ORIGINAL_JPEG;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.security.cert.X509Certificate x509Certificate0 = null;
        java.util.Collection collection1 = null;
        java.util.Calendar calendar2 = null;
        try {
            String str3 = com.lowagie.text.pdf.PdfPKCS7.verifyCertificate(x509Certificate0, collection1, calendar2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        RectangleReadOnly rectangleReadOnly4 = new RectangleReadOnly((-1.0f), (float) (short) -1, (-1.0f), 0.0f);
        try {
            rectangleReadOnly4.disableBorderSide((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        int i0 = com.lowagie.text.pdf.PdfFormField.FF_NO_EXPORT;
        org.junit.Assert.assertTrue(i0 == 4);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        int i0 = com.lowagie.text.pdf.BaseField.MULTISELECT;
        org.junit.Assert.assertTrue(i0 == 2097152);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        int i0 = com.lowagie.text.pdf.ColumnText.DIGITS_EN2AN_INIT_AL;
        org.junit.Assert.assertTrue(i0 == 128);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        String str0 = Annotation.URX;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "urx" + "'", str0.equals("urx"));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.RENDITION;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        char char0 = com.lowagie.text.pdf.Barcode128.CODE_AC_TO_B;
        org.junit.Assert.assertTrue(char0 == 'd');
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        int i0 = com.lowagie.text.pdf.PdfTransition.BLINDH;
        org.junit.Assert.assertTrue(i0 == 6);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_INTERSECTCLIPRECT;
        org.junit.Assert.assertTrue(i0 == 1046);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        boolean b0 = com.lowagie.text.pdf.ByteBuffer.HIGH_PRECISION;
        org.junit.Assert.assertTrue(b0 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        int i0 = Font.DEFAULTSIZE;
        org.junit.Assert.assertTrue(i0 == 12);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PARENTTREE;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        String str0 = FontFactory.TIMES_ITALIC;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Times-Italic" + "'", str0.equals("Times-Italic"));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        String[] str_array2 = new String[] { "Times-Italic", "Times-Italic" };
        java.util.ArrayList<String> arraylist_str3 = new java.util.ArrayList<String>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<String>) arraylist_str3, str_array2);
        try {
            String str7 = arraylist_str3.set(2, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(str_array2);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.STRUCTTREEROOT;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        java.io.OutputStream outputStream1 = null;
        try {
            com.lowagie.text.pdf.PdfStamper pdfStamper2 = new com.lowagie.text.pdf.PdfStamper(pdfReader0, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        int i0 = com.lowagie.text.pdf.PdfWriter.PageLayoutTwoColumnRight;
        org.junit.Assert.assertTrue(i0 == 8);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.LI;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier0 = com.lowagie.text.pdf.PdfPKCS7.X509Name.INITIALS;
        org.junit.Assert.assertNotNull(aSN1ObjectIdentifier0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        String str0 = ElementTags.ABSOLUTEX;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "absolutex" + "'", str0.equals("absolutex"));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        boolean b2 = Utilities.isSurrogatePair("urx", 12);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.VIEW;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        String str1 = com.lowagie.text.factories.RomanNumberFactory.getUpperCaseString((int) '4');
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "LII" + "'", str1.equals("LII"));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        int i0 = com.lowagie.text.pdf.BaseField.VISIBLE;
        org.junit.Assert.assertTrue(i0 == 0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        String str1 = com.lowagie.text.pdf.XfaForm.Xml2Som.unescapeSom("hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        char char0 = com.lowagie.text.pdf.BaseFont.CID_NEWLINE;
        org.junit.Assert.assertTrue(char0 == '翿');
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        String str1 = com.lowagie.text.pdf.PdfPKCS7.getDigest("urx");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "urx" + "'", str1.equals("urx"));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.lowagie.text.pdf.codec.wmf.MetaState metaState0 = null;
        try {
            com.lowagie.text.pdf.codec.wmf.MetaState metaState1 = new com.lowagie.text.pdf.codec.wmf.MetaState(metaState0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        int i0 = com.lowagie.text.pdf.RadioCheckField.TYPE_CROSS;
        org.junit.Assert.assertTrue(i0 == 3);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.SINGLEPAGE;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        int i0 = Element.CCITTG4;
        org.junit.Assert.assertTrue(i0 == 256);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        int i0 = com.lowagie.text.pdf.PRTokeniser.TK_NAME;
        org.junit.Assert.assertTrue(i0 == 3);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_SETMAPMODE;
        org.junit.Assert.assertTrue(i0 == 259);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        String str0 = ElementTags.URL;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "url" + "'", str0.equals("url"));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        int i0 = Element.JPEG;
        org.junit.Assert.assertTrue(i0 == 32);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        Document.compress = true;
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_SETMAPPERFLAGS;
        org.junit.Assert.assertTrue(i0 == 561);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        String str0 = com.lowagie.text.xml.xmp.XmpBasicSchema.ADVISORY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "xmp:Advisory" + "'", str0.equals("xmp:Advisory"));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        String str0 = ElementTags.ENCODING;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "encoding" + "'", str0.equals("encoding"));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.FIELDS;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        Image image0 = null;
        try {
            ImgCCITT imgCCITT1 = new ImgCCITT(image0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaPen.PS_NULL;
        org.junit.Assert.assertTrue(i0 == 5);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        boolean b1 = com.lowagie.text.pdf.PdfEncryptor.isPrintingAllowed((int) ' ');
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        byte byte0 = DocWriter.QUOTE;
        org.junit.Assert.assertTrue(byte0 == (byte) 34);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        String str0 = ElementTags.BORDERCOLOR;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "bordercolor" + "'", str0.equals("bordercolor"));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfName pdfName2 = com.lowagie.text.pdf.PdfName.ORDER;
        com.lowagie.text.pdf.internal.PdfXConformanceImp.checkPDFXConformance(pdfWriter0, 2097152, (Object) pdfName2);
        org.junit.Assert.assertNotNull(pdfName2);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        int i0 = com.lowagie.text.pdf.PdfTransition.OUTBOX;
        org.junit.Assert.assertTrue(i0 == 8);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        int i0 = com.lowagie.text.pdf.collection.PdfCollectionField.SIZE;
        org.junit.Assert.assertTrue(i0 == 7);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.lowagie.text.pdf.PdfPTable pdfPTable0 = null;
        try {
            com.lowagie.text.pdf.PdfPTable pdfPTable1 = com.lowagie.text.pdf.PdfPTable.shallowCopy(pdfPTable0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.A;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        Rectangle rectangle0 = PageSize.B2;
        org.junit.Assert.assertNotNull(rectangle0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.NONSTRUCT;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        RectangleReadOnly rectangleReadOnly4 = new RectangleReadOnly((-1.0f), (float) (short) -1, (-1.0f), 0.0f);
        java.awt.Color color5 = java.awt.Color.DARK_GRAY;
        try {
            rectangleReadOnly4.setBackgroundColor(color5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        String str0 = com.lowagie.text.pdf.BaseFont.CP1252;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Cp1252" + "'", str0.equals("Cp1252"));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        Rectangle rectangle0 = PageSize.ROYAL_OCTAVO;
        float f2 = rectangle0.getLeft((float) (short) 0);
        org.junit.Assert.assertNotNull(rectangle0);
        org.junit.Assert.assertTrue(f2 == 0.0f);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_DIBSTRETCHBLT;
        org.junit.Assert.assertTrue(i0 == 2881);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        Font font2 = null;
        try {
            Phrase phrase3 = Phrase.getInstance((int) (byte) -1, "encoding", font2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        int i0 = com.lowagie.text.pdf.PdfAction.PREVPAGE;
        org.junit.Assert.assertTrue(i0 == 2);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.CROPBOX;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfWriter.PDF_VERSION_1_2;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        String str0 = ElementTags.CONVERT2PDFP;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "convert2pdfp" + "'", str0.equals("convert2pdfp"));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        Section section0 = new Section();
        section0.numberStyle = (short) 0;
        boolean b3 = section0.isNestable();
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        int i0 = com.lowagie.text.pdf.PdfWriter.PDFXNONE;
        org.junit.Assert.assertTrue(i0 == 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.HELVETICA_BOLD;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        try {
            com.lowagie.text.pdf.PdfPSXObject pdfPSXObject1 = new com.lowagie.text.pdf.PdfPSXObject(pdfWriter0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.STRUCTPARENT;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        String str0 = Chunk.REMOTEGOTO;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "REMOTEGOTO" + "'", str0.equals("REMOTEGOTO"));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        String str0 = com.lowagie.text.html.Markup.HTML_TAG_SPAN;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "span" + "'", str0.equals("span"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        String str0 = ElementTags.TABLEFITSPAGE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "tablefitspage" + "'", str0.equals("tablefitspage"));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.SW;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.BORDER;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        Rectangle rectangle0 = PageSize.HALFLETTER;
        org.junit.Assert.assertNotNull(rectangle0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        int i0 = com.lowagie.text.pdf.PdfDestination.FITBH;
        org.junit.Assert.assertTrue(i0 == 6);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.MK;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        java.io.OutputStream outputStream1 = null;
        byte[] byte_array2 = null;
        byte[] byte_array3 = com.lowagie.text.pdf.crypto.IVGenerator.getIV();
        java.util.HashMap hashMap6 = com.lowagie.text.pdf.PdfPKCS7.X509Name.DefaultSymbols;
        try {
            com.lowagie.text.pdf.PdfEncryptor.encrypt(pdfReader0, outputStream1, byte_array2, byte_array3, (int) (short) 0, false, hashMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array3);
        org.junit.Assert.assertNotNull(hashMap6);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.awt.Color color0 = java.awt.Color.GREEN;
        org.junit.Assert.assertNotNull(color0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.lowagie.text.alignment.HorizontalAlignment horizontalAlignment0 = com.lowagie.text.alignment.HorizontalAlignment.RIGHT;
        org.junit.Assert.assertTrue("'" + horizontalAlignment0 + "' != '" + com.lowagie.text.alignment.HorizontalAlignment.RIGHT + "'", horizontalAlignment0.equals(com.lowagie.text.alignment.HorizontalAlignment.RIGHT));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.lowagie.text.pdf.PdfLiteral pdfLiteral2 = new com.lowagie.text.pdf.PdfLiteral(7, "span");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_SELECTCLIPREGION;
        org.junit.Assert.assertTrue(i0 == 300);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        String str0 = com.lowagie.text.html.Markup.CSS_VALUE_LINETHROUGH;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "line-through" + "'", str0.equals("line-through"));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PARENT;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.lowagie.text.pdf.PdfName[] pdfName_array0 = com.lowagie.text.pdf.internal.PdfViewerPreferencesImp.PRINTSCALING_PREFERENCES;
        org.junit.Assert.assertNotNull(pdfName_array0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        String str0 = com.lowagie.text.xml.xmp.XmpWriter.UTF16BE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "UTF-16BE" + "'", str0.equals("UTF-16BE"));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.awt.Color color1 = java.awt.Color.DARK_GRAY;
        com.lowagie.text.pdf.PdfSpotColor pdfSpotColor2 = new com.lowagie.text.pdf.PdfSpotColor("", color1);
        java.awt.color.ColorSpace colorSpace3 = null;
        float[] f_array4 = new float[] {};
        try {
            float[] f_array5 = color1.getColorComponents(colorSpace3, f_array4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(f_array4);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.lowagie.text.factories.RomanAlphabetFactory romanAlphabetFactory0 = new com.lowagie.text.factories.RomanAlphabetFactory();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        String str0 = com.lowagie.text.xml.xmp.PdfA1Schema.PART;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "pdfaid:part" + "'", str0.equals("pdfaid:part"));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        int i0 = Element.CCITT_ENDOFLINE;
        org.junit.Assert.assertTrue(i0 == 4);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        byte byte0 = DocWriter.FORWARD;
        org.junit.Assert.assertTrue(byte0 == (byte) 47);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.COURIER_BOLD;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.JBIG2GLOBALS;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        int i0 = com.lowagie.text.pdf.PdfBorderDictionary.STYLE_SOLID;
        org.junit.Assert.assertTrue(i0 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_CHORD;
        org.junit.Assert.assertTrue(i0 == 2096);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        String str0 = com.lowagie.text.pdf.BaseFont.TIMES_ITALIC;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Times-Italic" + "'", str0.equals("Times-Italic"));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        int i0 = com.lowagie.text.pdf.PdfPTable.BASECANVAS;
        org.junit.Assert.assertTrue(i0 == 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        String str2 = com.lowagie.text.factories.GreekAlphabetFactory.getString(2097152, false);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ZHPFQ" + "'", str2.equals("ZHPFQ"));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        Section section0 = new Section();
        ElementListener elementListener1 = null;
        boolean b2 = section0.process(elementListener1);
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        Annotation annotation8 = new Annotation((float) (short) 100, (float) 1L, (float) (byte) 1, (float) 10, "", "hi!", "", "ACTION");
        float f9 = annotation8.llx();
        org.junit.Assert.assertTrue(f9 == 100.0f);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        String[] str_array4 = new String[] { "", "", "hi!", "urx" };
        java.util.ArrayList<String> arraylist_str5 = new java.util.ArrayList<String>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<String>) arraylist_str5, str_array4);
        Object obj7 = arraylist_str5.clone();
        try {
            String str9 = arraylist_str5.get((int) '翿');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(str_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        byte[] byte_array0 = com.lowagie.text.pdf.crypto.IVGenerator.getIV();
        try {
            Jpeg2000 jpeg2000_1 = new Jpeg2000(byte_array0);
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(byte_array0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.lowagie.text.pdf.PdfBoolean pdfBoolean0 = com.lowagie.text.pdf.PdfBoolean.PDFFALSE;
        org.junit.Assert.assertNotNull(pdfBoolean0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        int i0 = com.lowagie.text.pdf.BaseFont.STRIKETHROUGH_POSITION;
        org.junit.Assert.assertTrue(i0 == 15);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.UF;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        String str0 = com.lowagie.text.html.Markup.CSS_KEY_BGCOLOR;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "background-color" + "'", str0.equals("background-color"));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        int i0 = com.lowagie.text.pdf.ColumnText.START_COLUMN;
        org.junit.Assert.assertTrue(i0 == 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.LINE;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        int i0 = com.lowagie.text.pdf.PdfFormField.FF_NO_TOGGLE_TO_OFF;
        org.junit.Assert.assertTrue(i0 == 16384);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_SETTEXTCOLOR;
        org.junit.Assert.assertTrue(i0 == 521);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        String str0 = ElementTags.ALIGN_JUSTIFIED_ALL;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "JustifyAll" + "'", str0.equals("JustifyAll"));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.lowagie.text.pdf.XfaForm.InverseStore inverseStore0 = new com.lowagie.text.pdf.XfaForm.InverseStore();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        FontFactory.defaultEncoding = "convert2pdfp";
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        String str0 = com.lowagie.text.html.Markup.CSS_VALUE_TABLE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "table" + "'", str0.equals("table"));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        int i0 = Image.ORIGINAL_PS;
        org.junit.Assert.assertTrue(i0 == 7);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        String str1 = com.lowagie.text.pdf.PdfPKCS7.getAlgorithm("hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.security.cert.Certificate certificate0 = null;
        com.lowagie.text.pdf.PdfPublicKeyRecipient pdfPublicKeyRecipient2 = new com.lowagie.text.pdf.PdfPublicKeyRecipient(certificate0, 259);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_STRETCHBLT;
        org.junit.Assert.assertTrue(i0 == 2851);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        byte[] byte_array1 = com.lowagie.text.pdf.crypto.IVGenerator.getIV();
        com.lowagie.text.pdf.PRStream pRStream2 = new com.lowagie.text.pdf.PRStream(pdfReader0, byte_array1);
        try {
            com.lowagie.text.pdf.FdfReader fdfReader3 = new com.lowagie.text.pdf.FdfReader(byte_array1);
            org.junit.Assert.fail("Expected exception of type com.lowagie.text.exceptions.InvalidPdfException");
        } catch (com.lowagie.text.exceptions.InvalidPdfException e) {
        }
        org.junit.Assert.assertNotNull(byte_array1);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DOMAIN;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.WS;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        String str0 = Chunk.HSCALE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "HSCALE" + "'", str0.equals("HSCALE"));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        int i0 = com.lowagie.text.pdf.Barcode.POSTNET;
        org.junit.Assert.assertTrue(i0 == 7);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.lowagie.text.pdf.PdfWriter.PdfBody.PdfCrossReference pdfCrossReference4 = new com.lowagie.text.pdf.PdfWriter.PdfBody.PdfCrossReference((int) '4', (int) (byte) 0, 10, (int) ' ');
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.BG;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PRINTSTATE;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        int i0 = com.lowagie.text.pdf.PdfContentByte.TEXT_RENDER_MODE_INVISIBLE;
        org.junit.Assert.assertTrue(i0 == 3);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        String str0 = Annotation.MIMETYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "mime" + "'", str0.equals("mime"));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.lowagie.text.pdf.fonts.cmaps.CMapParser cMapParser0 = new com.lowagie.text.pdf.fonts.cmaps.CMapParser();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.GOTOR;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        String str0 = ElementTags.LASTHEADERROW;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "lastHeaderRow" + "'", str0.equals("lastHeaderRow"));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TOC;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        char char0 = com.lowagie.text.pdf.Barcode128.CODE_A;
        org.junit.Assert.assertTrue(char0 == 'È');
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TWOPAGERIGHT;
        boolean b1 = pdfName0.isIndirect();
        org.junit.Assert.assertNotNull(pdfName0);
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaBrush.HS_BDIAGONAL;
        org.junit.Assert.assertTrue(i0 == 3);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.M;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        String str0 = Footnote.CONTENT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "content" + "'", str0.equals("content"));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        float f1 = Utilities.millimetersToInches((float) 521);
        org.junit.Assert.assertTrue(f1 == 20.511812f);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        String str1 = com.lowagie.text.pdf.SimpleNamedDestination.unEscapeBinaryString("table");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "table" + "'", str1.equals("table"));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.N0;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.LENGTH;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DESC;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.CAPTION;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.BACKGROUND;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        Section section0 = new Section();
        section0.setIndentationRight((float) 5);
        section0.setIndentationRight((float) 521);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        int i0 = com.lowagie.text.pdf.PdfWriter.PDFX32002;
        org.junit.Assert.assertTrue(i0 == 2);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        int i0 = com.lowagie.text.pdf.PdfAnnotation.FLAGS_PRINT;
        org.junit.Assert.assertTrue(i0 == 4);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        int i0 = com.lowagie.text.pdf.PdfBorderDictionary.STYLE_INSET;
        org.junit.Assert.assertTrue(i0 == 3);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DATA;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        Rectangle rectangle2 = new Rectangle((float) (byte) 100, (float) '4');
        float f3 = rectangle2.borderWidthLeft;
        org.junit.Assert.assertTrue(f3 == (-1.0f));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        float[] f_array3 = new float[] { (byte) 0, 'È' };
        float[] f_array4 = null;
        try {
            com.lowagie.text.pdf.PdfFunction pdfFunction6 = com.lowagie.text.pdf.PdfFunction.type4(pdfWriter0, f_array3, f_array4, "bordercolor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(f_array3);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        String str0 = Footnote.PAGE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "page" + "'", str0.equals("page"));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.BASEVERSION;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        byte[] byte_array6 = com.lowagie.text.pdf.Barcode128.getBarsCode128Raw("hi!");
        try {
            ImgCCITT imgCCITT7 = new ImgCCITT(10, 1, false, 8, 3, byte_array6);
            org.junit.Assert.fail("Expected exception of type com.lowagie.text.BadElementException");
        } catch (BadElementException e) {
        }
        org.junit.Assert.assertNotNull(byte_array6);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.w3c.dom.Node node0 = null;
        String str1 = com.lowagie.text.pdf.XfaForm.getNodeText(node0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        int i0 = Font.COURIER;
        org.junit.Assert.assertTrue(i0 == 0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PROCSET;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        String str0 = com.lowagie.text.pdf.BaseFont.CP1250;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Cp1250" + "'", str0.equals("Cp1250"));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        int i0 = Jpeg2000.JP2_JP;
        org.junit.Assert.assertTrue(i0 == 1783636000);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        int i0 = Jpeg2000.JP2_JP2H;
        org.junit.Assert.assertTrue(i0 == 1785737832);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        int i0 = Element.PTABLE;
        org.junit.Assert.assertTrue(i0 == 23);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.D;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        int i0 = com.lowagie.text.pdf.PdfPageLabels.LOWERCASE_ROMAN_NUMERALS;
        org.junit.Assert.assertTrue(i0 == 2);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DESTOUTPUTPROFILE;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.CALGRAY;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        byte byte0 = DocWriter.NEWLINE;
        org.junit.Assert.assertTrue(byte0 == (byte) 10);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        char char0 = com.lowagie.text.pdf.Barcode128.CODE_C;
        org.junit.Assert.assertTrue(char0 == 'Ç');
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        ElementTags elementTags2 = new ElementTags();
        com.lowagie.text.pdf.internal.PdfXConformanceImp.checkPDFXConformance(pdfWriter0, (int) 'a', (Object) elementTags2);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ENDOFLINE;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        Rectangle rectangle0 = PageSize.SMALL_PAPERBACK;
        org.junit.Assert.assertNotNull(rectangle0);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        int i0 = com.lowagie.text.pdf.PdfAnnotation.FLAGS_INVISIBLE;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.MAX_CAMEL_CASE;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        Table table0 = null;
        try {
            Table table1 = new Table(table0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        int i0 = com.lowagie.text.pdf.BaseField.HIDDEN;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.BINDINGMATERIALNAME;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.URL;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaBrush.HS_FDIAGONAL;
        org.junit.Assert.assertTrue(i0 == 2);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.BLEEDBOX;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        String str1 = com.lowagie.text.pdf.XfaForm.Xml2Som.getShortName("background-color");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "background-color" + "'", str1.equals("background-color"));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        com.lowagie.text.pdf.BarcodePDF417 barcodePDF417_1 = new com.lowagie.text.pdf.BarcodePDF417();
        String str2 = com.lowagie.text.error_messages.MessageLocalization.getComposedMessage("encoding", (Object) barcodePDF417_1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "No message found for encoding" + "'", str2.equals("No message found for encoding"));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        String str0 = FontFactory.TIMES_BOLDITALIC;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Times-BoldItalic" + "'", str0.equals("Times-BoldItalic"));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PLAYCOUNT;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.OFF;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        String str0 = com.lowagie.text.html.Markup.CSS_VALUE_INLINE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "inline" + "'", str0.equals("inline"));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.util.Optional<com.lowagie.text.alignment.HorizontalAlignment> optional_horizontalAlignment1 = com.lowagie.text.alignment.HorizontalAlignment.of(5);
        org.junit.Assert.assertNotNull(optional_horizontalAlignment1);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        int i0 = com.lowagie.text.pdf.PdfWriter.AllowDegradedPrinting;
        org.junit.Assert.assertTrue(i0 == 4);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        String str0 = ElementTags.SCALEDWIDTH;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "scaledwidth" + "'", str0.equals("scaledwidth"));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        int i1 = Font.getStyleValue("JustifyAll");
        org.junit.Assert.assertTrue(i1 == 0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        try {
            java.awt.Color color1 = com.lowagie.text.html.WebColors.getRGBColor("JustifyAll");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        boolean b1 = com.lowagie.text.pdf.PRTokeniser.isWhitespace((int) 'a');
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        double d2 = com.lowagie.text.pdf.PdfGraphics2D.asPoints((double) (short) 0, 561);
        org.junit.Assert.assertTrue(d2 == 0.0d);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.io.OutputStream outputStream0 = null;
        try {
            com.lowagie.text.pdf.codec.wmf.MetaDo.writeWord(outputStream0, (int) '翿');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.util.Properties properties0 = null;
        try {
            Phrase phrase1 = com.lowagie.text.factories.ElementFactory.getPhrase(properties0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        byte[] byte_array0 = new byte[] {};
        try {
            Image image1 = ImageLoader.getTiffImage(byte_array0);
            org.junit.Assert.fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (ExceptionConverter e) {
        }
        org.junit.Assert.assertNotNull(byte_array0);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        com.lowagie.text.pdf.PdfRectangle pdfRectangle2 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        com.lowagie.text.pdf.PdfName pdfName4 = com.lowagie.text.pdf.PdfName.FULLSCREEN;
        try {
            pdfRectangle2.add(16384, (com.lowagie.text.pdf.PdfObject) pdfName4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(pdfName4);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray1 = new com.lowagie.text.pdf.RandomAccessFileOrArray("");
        int i3 = randomAccessFileOrArray1.skipBytes(3);
        double d4 = randomAccessFileOrArray1.readDoubleLE();
        boolean b5 = randomAccessFileOrArray1.isOpen();
        org.junit.Assert.assertTrue(i3 == 3);
        org.junit.Assert.assertTrue(d4 == 2.5171752293465407E180d);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        int i0 = com.lowagie.text.pdf.PdfWriter.PageLayoutSinglePage;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ROOT;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        int i0 = com.lowagie.text.pdf.BaseField.VISIBLE_BUT_DOES_NOT_PRINT;
        org.junit.Assert.assertTrue(i0 == 2);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        int i0 = com.lowagie.text.pdf.PdfFormField.Q_CENTER;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaPen.PS_INSIDEFRAME;
        org.junit.Assert.assertTrue(i0 == 6);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TWOPAGELEFT;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        com.lowagie.text.pdf.PdfBoolean pdfBoolean1 = new com.lowagie.text.pdf.PdfBoolean(true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        boolean b1 = com.lowagie.text.pdf.PdfEncodings.isPdfDocEncoding("content");
        org.junit.Assert.assertTrue(b1 == true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        java.awt.color.ICC_Profile iCC_Profile0 = null;
        try {
            com.lowagie.text.pdf.PdfICCBased pdfICCBased2 = new com.lowagie.text.pdf.PdfICCBased(iCC_Profile0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (ExceptionConverter e) {
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.KIDS;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        String str1 = com.lowagie.text.error_messages.MessageLocalization.getComposedMessage("Cp1250");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "No message found for Cp1250" + "'", str1.equals("No message found for Cp1250"));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        try {
            com.lowagie.text.pdf.PdfBorderDictionary pdfBorderDictionary2 = new com.lowagie.text.pdf.PdfBorderDictionary(10.0f, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        String str0 = com.lowagie.text.html.Markup.CSS_VALUE_BLOCK;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "block" + "'", str0.equals("block"));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        int i0 = com.lowagie.text.pdf.PdfTemplate.TYPE_IMPORTED;
        org.junit.Assert.assertTrue(i0 == 2);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_INVERTREGION;
        org.junit.Assert.assertTrue(i0 == 298);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.B;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PATTERNTYPE;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        boolean b0 = com.lowagie.text.pdf.PdfFormField.PLAINTEXT;
        org.junit.Assert.assertTrue(b0 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        try {
            com.lowagie.text.pdf.PdfTemplate pdfTemplate3 = com.lowagie.text.pdf.PdfTemplate.createTemplate(pdfWriter0, (float) 1783636000, (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        String str0 = com.lowagie.text.xml.xmp.XmpMMSchema.DERIVEDFROM;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "xmpMM:DerivedFrom" + "'", str0.equals("xmpMM:DerivedFrom"));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        VersionBean versionBean0 = new VersionBean();
        VersionBean.Version version1 = versionBean0.getVersion();
        VersionBean.Version version2 = versionBean0.getVersion();
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(version2);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        String str0 = com.lowagie.text.xml.xmp.XmpMMSchema.VERSIONID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "xmpMM:VersionID" + "'", str0.equals("xmpMM:VersionID"));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        int i0 = com.lowagie.text.pdf.PdfAction.SUBMIT_INCLUDE_NO_VALUE_FIELDS;
        org.junit.Assert.assertTrue(i0 == 2);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        java.util.Set set0 = FontFactory.getRegisteredFonts();
        org.junit.Assert.assertNotNull(set0);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfLayerMembership.ALLON;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        com.lowagie.text.pdf.hyphenation.HyphenationTree hyphenationTree2 = com.lowagie.text.pdf.hyphenation.Hyphenator.getHyphenationTree("line-through", "xmp:Advisory");
        org.junit.Assert.assertNull(hyphenationTree2);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        com.lowagie.text.pdf.Barcode barcode0 = null;
        com.lowagie.text.pdf.Barcode barcode1 = null;
        com.lowagie.text.pdf.BarcodeEANSUPP barcodeEANSUPP2 = new com.lowagie.text.pdf.BarcodeEANSUPP(barcode0, barcode1);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        boolean b0 = com.lowagie.text.pdf.BaseFont.CACHED;
        org.junit.Assert.assertTrue(b0 == true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        Font font6 = FontFactory.getFont("REMOTEGOTO", "xmp:Advisory", true, (float) (short) -1, 2);
        Chunk chunk7 = new Chunk("JustifyAll", font6);
        float f8 = chunk7.getCharacterSpacing();
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertTrue(f8 == 0.0f);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        Font font5 = FontFactory.getFont("REMOTEGOTO", "xmp:Advisory", true, (float) (short) -1, 2);
        com.lowagie.text.pdf.BaseFont baseFont6 = font5.getBaseFont();
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNull(baseFont6);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DESCENDANTFONTS;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.OCMD;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.R;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.EMBEDDEDFILE;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        com.lowagie.text.pdf.PdfNameTree pdfNameTree0 = new com.lowagie.text.pdf.PdfNameTree();
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfLayerMembership.ALLOFF;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        int i0 = com.lowagie.text.pdf.BarcodePDF417.PDF417_AUTO_ERROR_LEVEL;
        org.junit.Assert.assertTrue(i0 == 0);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        com.lowagie.text.pdf.crypto.ARCFOUREncryption aRCFOUREncryption0 = new com.lowagie.text.pdf.crypto.ARCFOUREncryption();
        byte[] byte_array2 = com.lowagie.text.pdf.crypto.IVGenerator.getIV((int) (byte) 47);
        byte[] byte_array6 = com.lowagie.text.pdf.Barcode128.getBarsCode128Raw("hi!");
        aRCFOUREncryption0.encryptARCFOUR(byte_array2, (int) (byte) 1, (-1), byte_array6, 3);
        com.lowagie.text.pdf.crypto.ARCFOUREncryption aRCFOUREncryption9 = new com.lowagie.text.pdf.crypto.ARCFOUREncryption();
        byte[] byte_array11 = com.lowagie.text.pdf.crypto.IVGenerator.getIV((int) (byte) 47);
        byte[] byte_array15 = com.lowagie.text.pdf.Barcode128.getBarsCode128Raw("hi!");
        aRCFOUREncryption9.encryptARCFOUR(byte_array11, (int) (byte) 1, (-1), byte_array15, 3);
        com.lowagie.text.pdf.PdfReader pdfReader20 = null;
        byte[] byte_array21 = com.lowagie.text.pdf.crypto.IVGenerator.getIV();
        com.lowagie.text.pdf.PRStream pRStream22 = new com.lowagie.text.pdf.PRStream(pdfReader20, byte_array21);
        try {
            aRCFOUREncryption0.encryptARCFOUR(byte_array15, 2097152, (int) (short) 100, byte_array21, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byte_array2);
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNotNull(byte_array15);
        org.junit.Assert.assertNotNull(byte_array21);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        com.lowagie.text.pdf.PRAcroForm pRAcroForm1 = new com.lowagie.text.pdf.PRAcroForm(pdfReader0);
        com.lowagie.text.pdf.PRIndirectReference pRIndirectReference3 = pRAcroForm1.getRefByName("xmp:Advisory");
        com.lowagie.text.pdf.collection.PdfCollectionSort pdfCollectionSort5 = new com.lowagie.text.pdf.collection.PdfCollectionSort("UTF-16BE");
        boolean b6 = pdfCollectionSort5.isCatalog();
        try {
            pRAcroForm1.readAcroForm((com.lowagie.text.pdf.PdfDictionary) pdfCollectionSort5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        org.junit.Assert.assertNull(pRIndirectReference3);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.EFF;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField4 = com.lowagie.text.pdf.PdfFormField.createTextField(pdfWriter0, true, false, 258);
        com.lowagie.text.pdf.PdfTemplate pdfTemplate5 = null;
        try {
            pdfFormField4.setMKNormalIcon(pdfTemplate5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(pdfFormField4);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        int i0 = com.lowagie.text.pdf.PRTokeniser.TK_REF;
        org.junit.Assert.assertTrue(i0 == 9);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        com.lowagie.text.pdf.PdfRectangle pdfRectangle2 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        float f3 = pdfRectangle2.bottom();
        org.junit.Assert.assertTrue(f3 == 0.0f);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.N;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.LZWDECODE;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_FLOODFILL;
        org.junit.Assert.assertTrue(i0 == 1049);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        java.net.URL uRL0 = null;
        try {
            com.lowagie.text.pdf.PdfAction pdfAction2 = new com.lowagie.text.pdf.PdfAction(uRL0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier0 = com.lowagie.text.pdf.PdfPKCS7.X509Name.L;
        org.junit.Assert.assertNotNull(aSN1ObjectIdentifier0);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.RICHMEDIAINSTANCE;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_CREATEPENINDIRECT;
        org.junit.Assert.assertTrue(i0 == 762);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        int i0 = Font.NORMAL;
        org.junit.Assert.assertTrue(i0 == 0);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        com.lowagie.text.pdf.PdfRectangle pdfRectangle2 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle3 = pdfRectangle2.getRectangle();
        float[] f_array4 = new float[] {};
        boolean b5 = pdfRectangle2.add(f_array4);
        java.util.List<com.lowagie.text.pdf.PdfObject> list_pdfObject6 = pdfRectangle2.getElements();
        org.junit.Assert.assertNotNull(rectangle3);
        org.junit.Assert.assertNotNull(f_array4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_pdfObject6);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        try {
            String[] str_array1 = com.lowagie.text.pdf.PdfPageLabels.getPageLabels(pdfReader0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_ESCAPE;
        org.junit.Assert.assertTrue(i0 == 1574);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        java.net.URL uRL0 = null;
        try {
            com.lowagie.text.pdf.PdfAction pdfAction2 = new com.lowagie.text.pdf.PdfAction(uRL0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        com.lowagie.text.alignment.VerticalAlignment verticalAlignment0 = com.lowagie.text.alignment.VerticalAlignment.CENTER;
        org.junit.Assert.assertTrue("'" + verticalAlignment0 + "' != '" + com.lowagie.text.alignment.VerticalAlignment.CENTER + "'", verticalAlignment0.equals(com.lowagie.text.alignment.VerticalAlignment.CENTER));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        int i0 = com.lowagie.text.pdf.PdfObject.ARRAY;
        org.junit.Assert.assertTrue(i0 == 5);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        char char0 = com.lowagie.text.pdf.Barcode128.FNC4;
        org.junit.Assert.assertTrue(char0 == 'È');
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        Anchor anchor0 = new Anchor();
        Paragraph paragraph1 = new Paragraph((Phrase) anchor0);
        Font font2 = paragraph1.getFont();
        org.junit.Assert.assertNotNull(font2);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        RectangleReadOnly rectangleReadOnly4 = new RectangleReadOnly((-1.0f), (float) (short) -1, (-1.0f), 0.0f);
        java.awt.Color color5 = rectangleReadOnly4.borderColorTop;
        try {
            rectangleReadOnly4.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNull(color5);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        com.lowagie.text.pdf.GrayColor grayColor1 = new com.lowagie.text.pdf.GrayColor(4);
        com.lowagie.text.pdf.PdfRectangle pdfRectangle4 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle5 = pdfRectangle4.getRectangle();
        float[] f_array6 = new float[] {};
        boolean b7 = pdfRectangle4.add(f_array6);
        try {
            float[] f_array8 = grayColor1.getRGBColorComponents(f_array6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(rectangle5);
        org.junit.Assert.assertNotNull(f_array6);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        int i0 = com.lowagie.text.pdf.PdfWriter.ALLOW_ASSEMBLY;
        org.junit.Assert.assertTrue(i0 == 1024);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        Document document0 = null;
        java.io.OutputStream outputStream1 = null;
        try {
            com.lowagie.text.pdf.PdfSmartCopy pdfSmartCopy2 = new com.lowagie.text.pdf.PdfSmartCopy(document0, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        int i0 = com.lowagie.text.pdf.PdfWriter.PageModeUseAttachments;
        org.junit.Assert.assertTrue(i0 == 2048);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        int i0 = com.lowagie.text.pdf.BarcodeDatamatrix.DM_ASCII;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.RV;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.IRT;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        com.lowagie.text.pdf.collection.PdfCollectionSort pdfCollectionSort1 = new com.lowagie.text.pdf.collection.PdfCollectionSort("UTF-16BE");
        boolean b2 = pdfCollectionSort1.isCatalog();
        boolean b3 = pdfCollectionSort1.isPages();
        boolean b4 = pdfCollectionSort1.isIndirect();
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ADBE_X509_RSA_SHA1;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        java.awt.Color color6 = java.awt.Color.DARK_GRAY;
        com.lowagie.text.pdf.PdfSpotColor pdfSpotColor7 = new com.lowagie.text.pdf.PdfSpotColor("", color6);
        com.lowagie.text.pdf.GrayColor grayColor9 = new com.lowagie.text.pdf.GrayColor(4);
        try {
            com.lowagie.text.pdf.PdfShading pdfShading12 = com.lowagie.text.pdf.PdfShading.simpleAxial(pdfWriter0, (float) (byte) 10, (float) 0L, (float) (-1L), (float) 9, color6, (java.awt.Color) grayColor9, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        int i0 = com.lowagie.text.pdf.PdfSignatureAppearance.SignatureRenderNameAndDescription;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        String str0 = com.lowagie.text.html.Markup.CSS_VALUE_TEXTALIGNJUSTIFY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "justify" + "'", str0.equals("justify"));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        char char0 = com.lowagie.text.pdf.Barcode128.FNC1_INDEX;
        org.junit.Assert.assertTrue(char0 == 'f');
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfAnnotation.APPEARANCE_ROLLOVER;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        RectangleReadOnly rectangleReadOnly4 = new RectangleReadOnly((-1.0f), (float) (short) -1, (-1.0f), 0.0f);
        java.awt.Color color5 = rectangleReadOnly4.borderColorTop;
        java.awt.Color color7 = java.awt.Color.DARK_GRAY;
        com.lowagie.text.pdf.PdfSpotColor pdfSpotColor8 = new com.lowagie.text.pdf.PdfSpotColor("", color7);
        try {
            rectangleReadOnly4.setBorderColorRight(color7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNull(color5);
        org.junit.Assert.assertNotNull(color7);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        Chunk chunk0 = Chunk.NEXTPAGE;
        Chunk chunk2 = chunk0.setTextRise((float) 2048);
        int i3 = chunk2.type();
        org.junit.Assert.assertNotNull(chunk0);
        org.junit.Assert.assertNotNull(chunk2);
        org.junit.Assert.assertTrue(i3 == 10);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        String str1 = com.lowagie.text.pdf.BarcodeCodabar.calculateChecksum("table");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "tabl2e" + "'", str1.equals("tabl2e"));
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        RectangleReadOnly rectangleReadOnly4 = new RectangleReadOnly((-1.0f), (float) (short) -1, (-1.0f), 0.0f);
        java.awt.Color color5 = rectangleReadOnly4.borderColorTop;
        try {
            rectangleReadOnly4.setUseVariableBorders(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNull(color5);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        String str0 = com.lowagie.text.html.Markup.CSS_KEY_TEXTDECORATION;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "text-decoration" + "'", str0.equals("text-decoration"));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        int i0 = java.awt.geom.PathIterator.SEG_CLOSE;
        org.junit.Assert.assertTrue(i0 == 4);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.KEYWORDS;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        com.lowagie.text.pdf.parser.Matrix matrix6 = new com.lowagie.text.pdf.parser.Matrix((float) 'È', 0.0f, (float) (short) 0, 10.0f, (float) 12, (float) 521);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        int i0 = com.lowagie.text.pdf.PdfAction.SUBMIT_EXCL_NON_USER_ANNOTS;
        org.junit.Assert.assertTrue(i0 == 1024);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray1 = new com.lowagie.text.pdf.RandomAccessFileOrArray("");
        int i3 = randomAccessFileOrArray1.skipBytes(3);
        int i4 = randomAccessFileOrArray1.readUnsignedShort();
        randomAccessFileOrArray1.pushBack((byte) 1);
        org.junit.Assert.assertTrue(i3 == 3);
        org.junit.Assert.assertTrue(i4 == 25448);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.H5;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        Rectangle rectangle0 = PageSize.FLSE;
        org.junit.Assert.assertNotNull(rectangle0);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.RUBY;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        com.lowagie.text.pdf.collection.PdfCollectionSort pdfCollectionSort1 = new com.lowagie.text.pdf.collection.PdfCollectionSort("UTF-16BE");
        boolean b2 = pdfCollectionSort1.isCatalog();
        pdfCollectionSort1.setSortOrder(true);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        float f0 = com.lowagie.text.pdf.PdfPRow.RIGHT_LIMIT;
        org.junit.Assert.assertTrue(f0 == 20000.0f);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_SETVIEWPORTORG;
        org.junit.Assert.assertTrue(i0 == 525);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TRUETYPE;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        String str0 = ElementTags.ANNOTATION;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "annotation" + "'", str0.equals("annotation"));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        Image image0 = null;
        try {
            ImgJBIG2 imgJBIG2_1 = new ImgJBIG2(image0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        Document.compress = false;
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DA;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray1 = new com.lowagie.text.pdf.RandomAccessFileOrArray("");
        int i3 = randomAccessFileOrArray1.skipBytes(3);
        int i4 = randomAccessFileOrArray1.readUnsignedShort();
        float f5 = randomAccessFileOrArray1.readFloat();
        org.junit.Assert.assertTrue(i3 == 3);
        org.junit.Assert.assertTrue(i4 == 25448);
        org.junit.Assert.assertTrue(f5 == 6.594297E22f);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PAGELAYOUT;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        Chunk chunk0 = Chunk.NEXTPAGE;
        Chunk chunk2 = chunk0.setTextRise((float) 2048);
        java.net.URL uRL3 = null;
        try {
            Chunk chunk4 = chunk0.setAnchor(uRL3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(chunk0);
        org.junit.Assert.assertNotNull(chunk2);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        int i0 = com.lowagie.text.pdf.PdfTransition.SPLITVIN;
        org.junit.Assert.assertTrue(i0 == 3);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        com.lowagie.text.pdf.GrayColor grayColor1 = new com.lowagie.text.pdf.GrayColor(4);
        int i2 = grayColor1.getBlue();
        org.junit.Assert.assertTrue(i2 == 4);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        Annotation annotation8 = new Annotation((float) (short) 100, (float) 1L, (float) (byte) 1, (float) 10, "", "hi!", "", "ACTION");
        float f9 = annotation8.llx;
        org.junit.Assert.assertTrue(f9 == 100.0f);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        com.lowagie.text.pdf.hyphenation.CharVector charVector1 = new com.lowagie.text.pdf.hyphenation.CharVector((int) (byte) 1);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        boolean b1 = com.lowagie.text.pdf.ColumnText.hasMoreText((int) (byte) 1);
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_POLYGON;
        org.junit.Assert.assertTrue(i0 == 804);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        RectangleReadOnly rectangleReadOnly4 = new RectangleReadOnly((-1.0f), (float) (short) -1, (-1.0f), 0.0f);
        float f5 = rectangleReadOnly4.getBorderWidthTop();
        try {
            rectangleReadOnly4.setTop((float) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }
        org.junit.Assert.assertTrue(f5 == (-1.0f));
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        int i0 = Font.STRIKETHRU;
        org.junit.Assert.assertTrue(i0 == 8);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        com.lowagie.text.pdf.ColumnText columnText0 = null;
        try {
            float f5 = com.lowagie.text.pdf.PdfPRow.setColumn(columnText0, (float) 100, (float) 256, (float) (byte) 100, (float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        Chunk chunk0 = Chunk.NEXTPAGE;
        Chunk chunk2 = chunk0.setTextRise((float) 2048);
        String str3 = chunk2.getContent();
        org.junit.Assert.assertNotNull(chunk0);
        org.junit.Assert.assertNotNull(chunk2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        String str0 = com.lowagie.text.xml.xmp.DublinCoreSchema.DATE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "dc:date" + "'", str0.equals("dc:date"));
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.INTERPOLATE;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        String str0 = com.lowagie.text.xml.xmp.DublinCoreSchema.PUBLISHER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "dc:publisher" + "'", str0.equals("dc:publisher"));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        int i0 = com.lowagie.text.pdf.BaseFont.ASCENT;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        com.lowagie.text.pdf.ByteBuffer byteBuffer0 = new com.lowagie.text.pdf.ByteBuffer();
        try {
            byteBuffer0.setSize(15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        RectangleReadOnly rectangleReadOnly4 = new RectangleReadOnly((-1.0f), (float) (short) -1, (-1.0f), 0.0f);
        float f5 = rectangleReadOnly4.getBorderWidth();
        org.junit.Assert.assertTrue(f5 == (-1.0f));
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        String str0 = com.lowagie.text.xml.xmp.XmpMMSchema.MANAGEDFROM;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "xmpMM:ManagedFrom" + "'", str0.equals("xmpMM:ManagedFrom"));
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        int i0 = com.lowagie.text.pdf.PdfContentParser.COMMAND_TYPE;
        org.junit.Assert.assertTrue(i0 == 200);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DESTS;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.GAMMA;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        String str0 = com.lowagie.text.html.Markup.HTML_ATTR_WIDTH;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "width" + "'", str0.equals("width"));
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.SQUARE;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        String str0 = com.lowagie.text.html.Markup.HTML_ATTR_REL;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "rel" + "'", str0.equals("rel"));
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        double d2 = com.lowagie.text.pdf.PdfGraphics2D.asPoints(0.0d, 12);
        org.junit.Assert.assertTrue(d2 == 0.0d);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        Font font3 = new Font(561);
        Phrase phrase4 = Phrase.getInstance(762, "No message found for encoding", font3);
        org.junit.Assert.assertNotNull(phrase4);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        int i0 = com.lowagie.text.pdf.PRTokeniser.TK_COMMENT;
        org.junit.Assert.assertTrue(i0 == 4);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        int i0 = com.lowagie.text.pdf.PdfFormField.FF_COMBO;
        org.junit.Assert.assertTrue(i0 == 131072);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        int i0 = com.lowagie.text.pdf.RadioCheckField.TYPE_DIAMOND;
        org.junit.Assert.assertTrue(i0 == 4);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        com.lowagie.text.pdf.PdfRectangle pdfRectangle2 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle3 = pdfRectangle2.getRectangle();
        float[] f_array4 = new float[] {};
        boolean b5 = pdfRectangle2.add(f_array4);
        float f6 = pdfRectangle2.left();
        org.junit.Assert.assertNotNull(rectangle3);
        org.junit.Assert.assertNotNull(f_array4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(f6 == 0.0f);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        int i1 = com.lowagie.text.pdf.PRTokeniser.getHex((int) '#');
        org.junit.Assert.assertTrue(i1 == (-1));
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        Annotation annotation8 = new Annotation((float) (short) 100, (float) 1L, (float) (byte) 1, (float) 10, "", "hi!", "", "ACTION");
        float f9 = annotation8.lly();
        float f11 = annotation8.lly(0.0f);
        float f12 = annotation8.lly();
        org.junit.Assert.assertTrue(f9 == 1.0f);
        org.junit.Assert.assertTrue(f11 == 1.0f);
        org.junit.Assert.assertTrue(f12 == 1.0f);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        com.lowagie.text.pdf.PdfRectangle pdfRectangle2 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle3 = pdfRectangle2.getRectangle();
        try {
            com.lowagie.text.pdf.PdfIndirectReference pdfIndirectReference5 = pdfRectangle2.getAsIndirectObject((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(rectangle3);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        int i0 = com.lowagie.text.pdf.internal.PdfXConformanceImp.PDFXKEY_LAYER;
        org.junit.Assert.assertTrue(i0 == 7);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        int i0 = com.lowagie.text.pdf.PdfContentByte.TEXT_RENDER_MODE_FILL;
        org.junit.Assert.assertTrue(i0 == 0);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        RomanList romanList1 = new RomanList(32);
        String str2 = romanList1.getPostSymbol();
        String str3 = romanList1.preSymbol;
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + ". " + "'", str2.equals(". "));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        int i0 = com.lowagie.text.pdf.PdfContentByte.TEXT_RENDER_MODE_FILL_STROKE;
        org.junit.Assert.assertTrue(i0 == 2);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfAnnotation.AA_ENTER;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier0 = com.lowagie.text.pdf.PdfPKCS7.X509Name.C;
        org.junit.Assert.assertNotNull(aSN1ObjectIdentifier0);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        Rectangle rectangle0 = PageSize.A4;
        org.junit.Assert.assertNotNull(rectangle0);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        java.net.URL uRL0 = null;
        try {
            Image image1 = ImageLoader.getGifImage(uRL0);
            org.junit.Assert.fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (ExceptionConverter e) {
        }
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.Off;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        String str1 = com.lowagie.text.pdf.GlyphList.unicodeToName((int) (short) 100);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "d" + "'", str1.equals("d"));
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        int i0 = Element.ALIGN_LEFT;
        org.junit.Assert.assertTrue(i0 == 0);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        com.lowagie.text.pdf.PdfPCell pdfPCell0 = null;
        try {
            com.lowagie.text.pdf.PdfPCell pdfPCell1 = new com.lowagie.text.pdf.PdfPCell(pdfPCell0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        RectangleReadOnly rectangleReadOnly4 = new RectangleReadOnly((-1.0f), (float) (short) -1, (-1.0f), 0.0f);
        java.awt.Color color5 = rectangleReadOnly4.borderColorTop;
        Rectangle rectangle6 = null;
        try {
            rectangleReadOnly4.cloneNonPositionParameters(rectangle6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNull(color5);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        String str0 = ElementTags.INDENTATIONRIGHT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "indentationright" + "'", str0.equals("indentationright"));
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        int i0 = com.lowagie.text.pdf.PdfDestination.XYZ;
        org.junit.Assert.assertTrue(i0 == 0);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        String str0 = Footnote.FONT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "font" + "'", str0.equals("font"));
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        String str0 = ElementTags.IGNORE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ignore" + "'", str0.equals("ignore"));
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        String str0 = ElementTags.PLAINWIDTH;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "plainwidth" + "'", str0.equals("plainwidth"));
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        com.lowagie.text.pdf.collection.PdfCollectionSchema pdfCollectionSchema0 = new com.lowagie.text.pdf.collection.PdfCollectionSchema();
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.FONTNAME;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        RectangleReadOnly rectangleReadOnly4 = new RectangleReadOnly((-1.0f), (float) (short) -1, (-1.0f), 0.0f);
        try {
            rectangleReadOnly4.setRight((float) 25448);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.HELVETICA;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.JS;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        com.lowagie.text.pdf.ByteBuffer byteBuffer1 = new com.lowagie.text.pdf.ByteBuffer();
        String str2 = com.lowagie.text.pdf.ByteBuffer.formatDouble((double) 258, byteBuffer1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        com.lowagie.text.pdf.PdfNumber pdfNumber1 = new com.lowagie.text.pdf.PdfNumber(0.0f);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        Chunk chunk0 = Chunk.NEXTPAGE;
        Chunk chunk2 = chunk0.setTextRise((float) 2048);
        java.net.URL uRL3 = null;
        try {
            Chunk chunk4 = chunk2.setAnchor(uRL3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(chunk0);
        org.junit.Assert.assertNotNull(chunk2);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.POPUP;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        int i0 = Jpeg2000.JPIP_JPIP;
        org.junit.Assert.assertTrue(i0 == 1785751920);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfGState.BM_SOFTLIGHT;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        int i0 = com.lowagie.text.pdf.PdfContentByte.ALIGN_RIGHT;
        org.junit.Assert.assertTrue(i0 == 2);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        float f0 = com.lowagie.text.pdf.PdfWriter.NO_SPACE_CHAR_RATIO;
        org.junit.Assert.assertTrue(f0 == 1.0E7f);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField4 = com.lowagie.text.pdf.PdfFormField.createTextField(pdfWriter0, true, false, 258);
        pdfFormField4.setButton(0);
        pdfFormField4.setName("HSCALE");
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation9 = com.lowagie.text.pdf.PdfFormField.shallowDuplicate((com.lowagie.text.pdf.PdfAnnotation) pdfFormField4);
        org.junit.Assert.assertNotNull(pdfFormField4);
        org.junit.Assert.assertNotNull(pdfAnnotation9);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_CREATEPALETTE;
        org.junit.Assert.assertTrue(i0 == 247);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        com.lowagie.text.pdf.crypto.ARCFOUREncryption aRCFOUREncryption2 = new com.lowagie.text.pdf.crypto.ARCFOUREncryption();
        byte[] byte_array4 = com.lowagie.text.pdf.crypto.IVGenerator.getIV((int) (byte) 47);
        byte[] byte_array8 = com.lowagie.text.pdf.Barcode128.getBarsCode128Raw("hi!");
        aRCFOUREncryption2.encryptARCFOUR(byte_array4, (int) (byte) 1, (-1), byte_array8, 3);
        try {
            String[][] str_array_array11 = com.lowagie.text.pdf.BaseFont.getFullFontName("1.2.12.SNAPSHOT", "dc:date", byte_array8);
            org.junit.Assert.fail("Expected exception of type com.lowagie.text.DocumentException");
        } catch (DocumentException e) {
        }
        org.junit.Assert.assertNotNull(byte_array4);
        org.junit.Assert.assertNotNull(byte_array8);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        String str0 = com.lowagie.text.html.Markup.CSS_KEY_PADDINGLEFT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "padding-left" + "'", str0.equals("padding-left"));
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.SIGREF;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        String str0 = com.lowagie.text.html.Markup.CSS_KEY_FONTFAMILY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "font-family" + "'", str0.equals("font-family"));
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        com.lowagie.text.pdf.IntHashtable intHashtable2 = new com.lowagie.text.pdf.IntHashtable(0, (float) 561);
        int i4 = intHashtable2.get(32);
        Object obj5 = intHashtable2.clone();
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.OC;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.FITR;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier0 = com.lowagie.text.pdf.PdfPKCS7.X509Name.T;
        org.junit.Assert.assertNotNull(aSN1ObjectIdentifier0);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TABS;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfRectangle pdfRectangle3 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle4 = pdfRectangle3.getRectangle();
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation9 = com.lowagie.text.pdf.PdfAnnotation.createText(pdfWriter0, rectangle4, "content", "ZHPFQ", false, "No message found for Cp1250");
        pdfAnnotation9.setMKNormalCaption("UTF-16BE");
        java.awt.Color color13 = java.awt.Color.DARK_GRAY;
        com.lowagie.text.pdf.PdfSpotColor pdfSpotColor14 = new com.lowagie.text.pdf.PdfSpotColor("", color13);
        pdfAnnotation9.setColor(color13);
        com.lowagie.text.pdf.PdfName pdfName16 = com.lowagie.text.pdf.PdfName.CIDSYSTEMINFO;
        com.lowagie.text.pdf.PdfTemplate pdfTemplate17 = null;
        try {
            pdfAnnotation9.setAppearance(pdfName16, pdfTemplate17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(rectangle4);
        org.junit.Assert.assertNotNull(pdfAnnotation9);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(pdfName16);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray1 = new com.lowagie.text.pdf.RandomAccessFileOrArray("");
        String str2 = randomAccessFileOrArray1.readLine();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "apache_license.txt" + "'", str2.equals("apache_license.txt"));
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.VERISIGN_PPKVS;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.CHECKSUM;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        String str0 = ElementTags.SYMBOLINDENT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "symbolindent" + "'", str0.equals("symbolindent"));
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        String str0 = com.lowagie.text.xml.xmp.XmpMMSchema.MANAGERVARIANT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "xmpMM:ManagerVariant" + "'", str0.equals("xmpMM:ManagerVariant"));
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.O;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        String str0 = com.lowagie.text.html.Markup.CSS_KEY_FONTSIZE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "font-size" + "'", str0.equals("font-size"));
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        Rectangle rectangle1 = PageSize.ROYAL_QUARTO;
        com.lowagie.text.pdf.PdfName pdfName2 = null;
        try {
            com.lowagie.text.pdf.PdfAnnotation pdfAnnotation4 = com.lowagie.text.pdf.PdfAnnotation.createLink(pdfWriter0, rectangle1, pdfName2, "ignore");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(rectangle1);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.MATERIAL;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        int i0 = com.lowagie.text.pdf.BaseFont.DESCENT;
        org.junit.Assert.assertTrue(i0 == 3);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        int i0 = com.lowagie.text.pdf.PdfAction.SUBMIT_XFDF;
        org.junit.Assert.assertTrue(i0 == 32);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        String str0 = ElementTags.PRODUCER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "producer" + "'", str0.equals("producer"));
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        Document document0 = new Document();
        document0.marginMirroring = false;
        boolean b4 = document0.addKeywords("xmpMM:DerivedFrom");
        int i5 = document0.pageN;
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.OPT;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        byte[] byte_array1 = com.lowagie.text.pdf.crypto.IVGenerator.getIV((int) (byte) 47);
        try {
            Image image2 = ImageLoader.getPngImage(byte_array1);
            org.junit.Assert.fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (ExceptionConverter e) {
        }
        org.junit.Assert.assertNotNull(byte_array1);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.USERUNIT;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.GTS_PDFA1;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField4 = com.lowagie.text.pdf.PdfFormField.createTextField(pdfWriter0, true, false, 258);
        pdfFormField4.setButton(0);
        com.lowagie.text.pdf.PdfBorderDictionary pdfBorderDictionary7 = null;
        pdfFormField4.setBorderStyle(pdfBorderDictionary7);
        org.junit.Assert.assertNotNull(pdfFormField4);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        int i0 = com.lowagie.text.pdf.PdfFormField.FF_DONOTSPELLCHECK;
        org.junit.Assert.assertTrue(i0 == 4194304);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ART;
        com.lowagie.text.pdf.PdfObject pdfObject1 = com.lowagie.text.pdf.PdfReader.getPdfObject((com.lowagie.text.pdf.PdfObject) pdfName0);
        boolean b2 = pdfObject1.isDictionary();
        org.junit.Assert.assertNotNull(pdfName0);
        org.junit.Assert.assertNotNull(pdfObject1);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        com.lowagie.text.pdf.PRAcroForm pRAcroForm1 = new com.lowagie.text.pdf.PRAcroForm(pdfReader0);
        com.lowagie.text.pdf.PdfName pdfName2 = com.lowagie.text.pdf.PdfName.MIN_CAMEL_CASE;
        com.lowagie.text.pdf.PdfName pdfName3 = com.lowagie.text.pdf.PdfName.N2;
        pRAcroForm1.putEx(pdfName2, (com.lowagie.text.pdf.PdfObject) pdfName3);
        com.lowagie.text.pdf.PRAcroForm.FieldInformation fieldInformation6 = pRAcroForm1.getField("xmpMM:VersionID");
        org.junit.Assert.assertNotNull(pdfName2);
        org.junit.Assert.assertNotNull(pdfName3);
        org.junit.Assert.assertNull(fieldInformation6);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        String str0 = Document.getVersion();
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "OpenPDF 1.2.12.SNAPSHOT" + "'", str0.equals("OpenPDF 1.2.12.SNAPSHOT"));
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DISPLAYDOCTITLE;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        String[] str_array6 = new String[] { "annotation", "dc:publisher", "Times-Italic", "LII" };
        String[] str_array11 = new String[] { "annotation", "dc:publisher", "Times-Italic", "LII" };
        String[] str_array16 = new String[] { "annotation", "dc:publisher", "Times-Italic", "LII" };
        String[] str_array21 = new String[] { "annotation", "dc:publisher", "Times-Italic", "LII" };
        String[] str_array26 = new String[] { "annotation", "dc:publisher", "Times-Italic", "LII" };
        String[][] str_array_array27 = new String[][] { str_array6, str_array11, str_array16, str_array21, str_array26 };
        com.lowagie.text.pdf.PdfFormField pdfFormField29 = com.lowagie.text.pdf.PdfFormField.createCombo(pdfWriter0, true, str_array_array27, 0);
        org.junit.Assert.assertNotNull(str_array6);
        org.junit.Assert.assertNotNull(str_array11);
        org.junit.Assert.assertNotNull(str_array16);
        org.junit.Assert.assertNotNull(str_array21);
        org.junit.Assert.assertNotNull(str_array26);
        org.junit.Assert.assertNotNull(str_array_array27);
        org.junit.Assert.assertNotNull(pdfFormField29);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        Rectangle rectangle0 = PageSize.B10;
        org.junit.Assert.assertNotNull(rectangle0);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_SETRELABS;
        org.junit.Assert.assertTrue(i0 == 261);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        Font font5 = FontFactory.getFont("REMOTEGOTO", "xmp:Advisory", true, (float) (short) -1, 2);
        float f6 = font5.getSize();
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertTrue(f6 == (-1.0f));
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        int i0 = com.lowagie.text.pdf.PdfSignatureAppearance.CERTIFIED_FORM_FILLING_AND_ANNOTATIONS;
        org.junit.Assert.assertTrue(i0 == 3);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        try {
            java.util.HashMap hashMap2 = com.lowagie.text.pdf.SimpleNamedDestination.getNamedDestination(pdfReader0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        java.awt.Color color0 = java.awt.Color.RED;
        org.junit.Assert.assertNotNull(color0);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        String str0 = com.lowagie.text.pdf.BaseFont.RESOURCE_PATH;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "com/lowagie/text/pdf/fonts/" + "'", str0.equals("com/lowagie/text/pdf/fonts/"));
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        com.lowagie.text.pdf.PdfShading pdfShading0 = null;
        try {
            com.lowagie.text.pdf.PdfShadingPattern pdfShadingPattern1 = new com.lowagie.text.pdf.PdfShadingPattern(pdfShading0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.WIN_ANSI_ENCODING;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        int i0 = com.lowagie.text.pdf.BaseFont.FONT_TYPE_TT;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        int i0 = com.lowagie.text.pdf.BaseFont.UNDERLINE_THICKNESS;
        org.junit.Assert.assertTrue(i0 == 14);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        int i0 = com.lowagie.text.pdf.internal.PdfXConformanceImp.PDFXKEY_RGB;
        org.junit.Assert.assertTrue(i0 == 3);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        java.util.List list2 = com.lowagie.text.pdf.SequenceList.expand("REMOTEGOTO", 13);
        com.lowagie.text.pdf.PdfArray pdfArray3 = new com.lowagie.text.pdf.PdfArray((java.util.List<com.lowagie.text.pdf.PdfObject>) list2);
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        String str0 = ElementTags.HEADER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "header" + "'", str0.equals("header"));
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        String str0 = ElementTags.ALIGN_RIGHT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Right" + "'", str0.equals("Right"));
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PART;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        int i0 = Annotation.FILE_DEST;
        org.junit.Assert.assertTrue(i0 == 3);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        int i0 = com.lowagie.text.pdf.PdfWriter.ALLOW_FILL_IN;
        org.junit.Assert.assertTrue(i0 == 256);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ACTION;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        int i0 = com.lowagie.text.pdf.PdfWriter.PageModeFullScreen;
        org.junit.Assert.assertTrue(i0 == 512);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        String str0 = com.lowagie.text.xml.xmp.DublinCoreSchema.COVERAGE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "dc:coverage" + "'", str0.equals("dc:coverage"));
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.CFM;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        java.util.Properties properties0 = null;
        try {
            Paragraph paragraph1 = com.lowagie.text.factories.ElementFactory.getParagraph(properties0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        Exception exception0 = null;
        BadElementException badElementException1 = new BadElementException(exception0);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        Image image0 = null;
        try {
            Jpeg2000 jpeg2000_1 = new Jpeg2000(image0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper0 = new com.lowagie.text.pdf.PdfPageEventHelper();
        com.lowagie.text.pdf.PdfWriter pdfWriter1 = null;
        Document document2 = new Document();
        document2.marginMirroring = false;
        pdfPageEventHelper0.onSectionEnd(pdfWriter1, document2, 10.0f);
        HeaderFooter headerFooter7 = null;
        document2.setFooter(headerFooter7);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        int i0 = Section.NUMBERSTYLE_DOTTED_WITHOUT_FINAL_DOT;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        com.lowagie.text.pdf.PdfRectangle pdfRectangle2 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle3 = pdfRectangle2.getRectangle();
        com.lowagie.text.pdf.PdfName pdfName4 = com.lowagie.text.pdf.PdfName.GLITTER;
        boolean b5 = pdfRectangle2.contains((com.lowagie.text.pdf.PdfObject) pdfName4);
        org.junit.Assert.assertNotNull(rectangle3);
        org.junit.Assert.assertNotNull(pdfName4);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.COURIER_BOLDOBLIQUE;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        Object[] obj_array1 = com.lowagie.text.pdf.AcroFields.splitDAelements("ZHPFQ");
        org.junit.Assert.assertNotNull(obj_array1);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        Anchor anchor0 = new Anchor();
        ListItem listItem1 = new ListItem((Phrase) anchor0);
        int i2 = listItem1.getAlignment();
        Section section4 = new Section((Paragraph) listItem1, 804);
        section4.numberDepth = 2851;
        org.junit.Assert.assertTrue(i2 == (-1));
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        RectangleReadOnly rectangleReadOnly4 = new RectangleReadOnly((-1.0f), (float) (short) -1, (-1.0f), 0.0f);
        java.awt.Color color5 = rectangleReadOnly4.borderColorTop;
        Rectangle rectangle6 = PageSize.B3;
        try {
            rectangleReadOnly4.cloneNonPositionParameters(rectangle6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNull(color5);
        org.junit.Assert.assertNotNull(rectangle6);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.STRIKEOUT;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        String str0 = ElementTags.ROW;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "row" + "'", str0.equals("row"));
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PS;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        Chunk chunk0 = Chunk.NEXTPAGE;
        com.lowagie.text.pdf.PdfWriter pdfWriter1 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField5 = com.lowagie.text.pdf.PdfFormField.createTextField(pdfWriter1, true, false, 258);
        pdfFormField5.setButton(0);
        Chunk chunk8 = chunk0.setAnnotation((com.lowagie.text.pdf.PdfAnnotation) pdfFormField5);
        Chunk chunk10 = chunk0.setGenericTag("ignore");
        org.junit.Assert.assertNotNull(chunk0);
        org.junit.Assert.assertNotNull(pdfFormField5);
        org.junit.Assert.assertNotNull(chunk8);
        org.junit.Assert.assertNotNull(chunk10);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TX;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        int i0 = Jpeg2000.JP2_FTYP;
        org.junit.Assert.assertTrue(i0 == 1718909296);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        VersionBean versionBean0 = new VersionBean();
        VersionBean.Version version1 = versionBean0.getVersion();
        String str2 = version1.getVersion();
        String str3 = version1.getScmTimestamp();
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.2.12.SNAPSHOT" + "'", str2.equals("1.2.12.SNAPSHOT"));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        Document document0 = new Document();
        boolean b1 = document0.addProducer();
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.EXTENSIONLEVEL;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        int i0 = com.lowagie.text.pdf.PdfWriter.AllowPrinting;
        org.junit.Assert.assertTrue(i0 == 2052);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        int i0 = com.lowagie.text.pdf.ColumnText.DIGIT_TYPE_AN_EXTENDED;
        org.junit.Assert.assertTrue(i0 == 256);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        java.net.URL uRL0 = null;
        try {
            com.lowagie.text.pdf.PdfReader pdfReader1 = new com.lowagie.text.pdf.PdfReader(uRL0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        float f0 = com.lowagie.text.pdf.BaseField.BORDER_WIDTH_THICK;
        org.junit.Assert.assertTrue(f0 == 3.0f);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        Font font7 = FontFactory.getFont("REMOTEGOTO", "xmp:Advisory", true, (float) (short) -1, 2);
        Chunk chunk8 = new Chunk("JustifyAll", font7);
        Font font9 = chunk8.getFont();
        Chunk chunk10 = SpecialSymbol.get('Ç', font9);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(chunk10);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        Document document0 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer1 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer3 = byteBuffer1.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter4 = com.lowagie.text.pdf.PdfWriter.getInstance(document0, (java.io.OutputStream) byteBuffer3);
        com.lowagie.text.pdf.PdfReader pdfReader7 = null;
        byte[] byte_array8 = com.lowagie.text.pdf.crypto.IVGenerator.getIV();
        com.lowagie.text.pdf.PRStream pRStream9 = new com.lowagie.text.pdf.PRStream(pdfReader7, byte_array8);
        com.lowagie.text.pdf.PdfDictionary pdfDictionary11 = null;
        try {
            com.lowagie.text.pdf.PdfFileSpecification pdfFileSpecification13 = com.lowagie.text.pdf.PdfFileSpecification.fileEmbedded(pdfWriter4, "UTF-16BE", "font", byte_array8, "", pdfDictionary11, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(pdfWriter4);
        org.junit.Assert.assertNotNull(byte_array8);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS pPKMS0 = new com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS();
        byte[] byte_array1 = pPKMS0.getBytes();
        byte[] byte_array5 = new byte[] { (byte) 100, (byte) -1, (byte) 10 };
        pPKMS0.setCert(byte_array5);
        org.junit.Assert.assertNull(byte_array1);
        org.junit.Assert.assertNotNull(byte_array5);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        String str0 = Annotation.TITLE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "title" + "'", str0.equals("title"));
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        int i0 = com.lowagie.text.pdf.BaseFont.ITALICANGLE;
        org.junit.Assert.assertTrue(i0 == 4);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DEVICERGB;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        java.awt.Color color4 = java.awt.Color.gray;
        Font font5 = FontFactory.getFont("font-family", "hi!", (float) 561, 521, color4);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(font5);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.VIEWAREA;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        byte[] byte_array0 = null;
        try {
            Jpeg2000 jpeg2000_1 = new Jpeg2000(byte_array0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        int i0 = Element.ALIGN_UNDEFINED;
        org.junit.Assert.assertTrue(i0 == (-1));
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        String str0 = com.lowagie.text.html.Markup.CSS_KEY_PADDINGBOTTOM;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "padding-bottom" + "'", str0.equals("padding-bottom"));
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        java.util.HashMap hashMap0 = com.lowagie.text.pdf.PdfPKCS7.X509Name.DefaultSymbols;
        Document document1 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer2 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer4 = byteBuffer2.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter5 = com.lowagie.text.pdf.PdfWriter.getInstance(document1, (java.io.OutputStream) byteBuffer4);
        try {
            com.lowagie.text.pdf.PdfDictionary pdfDictionary6 = com.lowagie.text.pdf.PdfNumberTree.writeTree((java.util.Map) hashMap0, pdfWriter5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException");
        } catch (ArrayStoreException e) {
        }
        org.junit.Assert.assertNotNull(hashMap0);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(pdfWriter5);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        Section section0 = new Section();
        boolean b1 = section0.isNotAddedYet();
        org.junit.Assert.assertTrue(b1 == true);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        Document document0 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer1 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer3 = byteBuffer1.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter4 = com.lowagie.text.pdf.PdfWriter.getInstance(document0, (java.io.OutputStream) byteBuffer3);
        pdfWriter4.setEncryption(true, "REMOTEGOTO", "xmpMM:VersionID", 561);
        com.lowagie.text.pdf.PdfReader pdfReader10 = null;
        try {
            boolean b12 = pdfWriter4.setOutputIntents(pdfReader10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(pdfWriter4);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        int i0 = com.lowagie.text.pdf.PdfFormField.FF_EDIT;
        org.junit.Assert.assertTrue(i0 == 262144);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        Document document0 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer1 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer3 = byteBuffer1.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter4 = com.lowagie.text.pdf.PdfWriter.getInstance(document0, (java.io.OutputStream) byteBuffer3);
        pdfWriter4.setEncryption(true, "REMOTEGOTO", "xmpMM:VersionID", 561);
        com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS pPKMS10 = new com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS();
        com.lowagie.text.pdf.PdfWriter pdfWriter11 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField15 = com.lowagie.text.pdf.PdfFormField.createTextField(pdfWriter11, true, false, 258);
        pdfFormField15.setButton(0);
        pdfFormField15.setName("HSCALE");
        pPKMS10.mergeDifferent((com.lowagie.text.pdf.PdfDictionary) pdfFormField15);
        try {
            com.lowagie.text.pdf.events.FieldPositioningEvents fieldPositioningEvents22 = new com.lowagie.text.pdf.events.FieldPositioningEvents(pdfWriter4, pdfFormField15, "absolutex");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(pdfWriter4);
        org.junit.Assert.assertNotNull(pdfFormField15);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        byte[] byte_array1 = com.lowagie.text.pdf.crypto.IVGenerator.getIV();
        com.lowagie.text.pdf.PRStream pRStream2 = new com.lowagie.text.pdf.PRStream(pdfReader0, byte_array1);
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = null;
        com.lowagie.text.pdf.ByteBuffer byteBuffer4 = new com.lowagie.text.pdf.ByteBuffer();
        try {
            pRStream2.toPdf(pdfWriter3, (java.io.OutputStream) byteBuffer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array1);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        String str0 = Chunk.HYPHENATION;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "HYPHENATION" + "'", str0.equals("HYPHENATION"));
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        com.lowagie.text.pdf.PdfContentByte pdfContentByte0 = null;
        Phrase phrase3 = new Phrase((float) (-1));
        try {
            com.lowagie.text.pdf.ColumnText.showTextAligned(pdfContentByte0, (int) (byte) 10, phrase3, (float) 10L, (float) 'f', 0.0f, 16384, 200);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        java.security.cert.X509Certificate x509Certificate0 = null;
        Section section1 = new Section();
        section1.setIndentationRight((float) 5);
        boolean b4 = section1.triggerNewPage;
        java.util.Calendar calendar5 = null;
        try {
            String str6 = com.lowagie.text.pdf.PdfPKCS7.verifyCertificate(x509Certificate0, (java.util.Collection) section1, calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.EXTEND;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        RomanList romanList1 = new RomanList(0);
        romanList1.symbolIndent = 14;
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        String[] str_array4 = new String[] { "", "urx", "hi!", "ACTION" };
        java.util.ArrayList<String> arraylist_str5 = new java.util.ArrayList<String>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<String>) arraylist_str5, str_array4);
        arraylist_str5.ensureCapacity(8);
        java.util.Iterator<String> iterator_str9 = arraylist_str5.iterator();
        java.util.Spliterator<String> spliterator_str10 = arraylist_str5.spliterator();
        org.junit.Assert.assertNotNull(str_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(iterator_str9);
        org.junit.Assert.assertNotNull(spliterator_str10);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        java.io.InputStream inputStream1 = com.lowagie.text.pdf.BaseFont.getResourceStream("hi!");
        org.junit.Assert.assertNull(inputStream1);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        Chunk chunk0 = Chunk.NEXTPAGE;
        com.lowagie.text.pdf.PdfWriter pdfWriter1 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField5 = com.lowagie.text.pdf.PdfFormField.createTextField(pdfWriter1, true, false, 258);
        pdfFormField5.setButton(0);
        Chunk chunk8 = chunk0.setAnnotation((com.lowagie.text.pdf.PdfAnnotation) pdfFormField5);
        try {
            pdfFormField5.setPage();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(chunk0);
        org.junit.Assert.assertNotNull(pdfFormField5);
        org.junit.Assert.assertNotNull(chunk8);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.VIEWERPREFERENCES;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        int i0 = com.lowagie.text.pdf.PRTokeniser.TK_OTHER;
        org.junit.Assert.assertTrue(i0 == 10);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        com.lowagie.text.pdf.PdfRectangle pdfRectangle2 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle3 = pdfRectangle2.getRectangle();
        float[] f_array4 = new float[] {};
        boolean b5 = pdfRectangle2.add(f_array4);
        com.lowagie.text.pdf.PdfName pdfName6 = com.lowagie.text.pdf.PdfName.OUTLINES;
        pdfRectangle2.addFirst((com.lowagie.text.pdf.PdfObject) pdfName6);
        org.junit.Assert.assertNotNull(rectangle3);
        org.junit.Assert.assertNotNull(f_array4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(pdfName6);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField4 = com.lowagie.text.pdf.PdfFormField.createTextField(pdfWriter0, true, false, 258);
        pdfFormField4.setButton(0);
        com.lowagie.text.pdf.PdfAction pdfAction9 = new com.lowagie.text.pdf.PdfAction("convert2pdfp", (int) (byte) 1);
        pdfFormField4.setAction(pdfAction9);
        com.lowagie.text.pdf.PdfWriter pdfWriter11 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField15 = com.lowagie.text.pdf.PdfFormField.createTextField(pdfWriter11, true, false, 258);
        pdfFormField15.setButton(0);
        com.lowagie.text.pdf.PdfAction pdfAction20 = new com.lowagie.text.pdf.PdfAction("convert2pdfp", (int) (byte) 1);
        pdfFormField15.setAction(pdfAction20);
        try {
            pdfFormField4.setPopup((com.lowagie.text.pdf.PdfAnnotation) pdfFormField15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(pdfFormField4);
        org.junit.Assert.assertNotNull(pdfFormField15);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TM;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        RomanList romanList1 = new RomanList(32);
        boolean b2 = romanList1.numbered;
        romanList1.preSymbol = "xmpMM:DerivedFrom";
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        SplitCharacter splitCharacter0 = com.lowagie.text.pdf.DefaultSplitCharacter.DEFAULT;
        org.junit.Assert.assertNotNull(splitCharacter0);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        String str0 = com.lowagie.text.pdf.PdfObject.TEXT_UNICODE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "UnicodeBig" + "'", str0.equals("UnicodeBig"));
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        Section section0 = new Section();
        section0.setNotAddedYet(true);
        section0.setIndentationRight((float) 13);
        boolean b5 = section0.isNotAddedYet();
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        com.lowagie.text.factories.GreekAlphabetFactory greekAlphabetFactory0 = new com.lowagie.text.factories.GreekAlphabetFactory();
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        Rectangle rectangle0 = PageSize.B3;
        java.awt.Color color2 = java.awt.Color.DARK_GRAY;
        com.lowagie.text.pdf.PdfSpotColor pdfSpotColor3 = new com.lowagie.text.pdf.PdfSpotColor("", color2);
        rectangle0.borderColorBottom = color2;
        org.junit.Assert.assertNotNull(rectangle0);
        org.junit.Assert.assertNotNull(color2);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        VersionBean versionBean0 = new VersionBean();
        VersionBean.Version version1 = versionBean0.getVersion();
        String str2 = version1.getVersion();
        String str3 = version1.getImplementationTitle();
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.2.12.SNAPSHOT" + "'", str2.equals("1.2.12.SNAPSHOT"));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfWriter.DID_PRINT;
        org.junit.Assert.assertNotNull(pdfName0);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        com.lowagie.text.pdf.PdfRectangle pdfRectangle2 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle3 = pdfRectangle2.getRectangle();
        float[] f_array4 = new float[] {};
        boolean b5 = pdfRectangle2.add(f_array4);
        com.lowagie.text.pdf.PdfName pdfName6 = com.lowagie.text.pdf.PdfWriter.WILL_SAVE;
        boolean b7 = pdfRectangle2.add((com.lowagie.text.pdf.PdfObject) pdfName6);
        com.lowagie.text.pdf.PdfRectangle pdfRectangle11 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle12 = pdfRectangle11.getRectangle();
        try {
            com.lowagie.text.pdf.PdfObject pdfObject13 = pdfRectangle2.set(9, (com.lowagie.text.pdf.PdfObject) pdfRectangle11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(rectangle3);
        org.junit.Assert.assertNotNull(f_array4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(pdfName6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(rectangle12);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        Document document0 = new Document();
        document0.marginMirroring = false;
        boolean b4 = document0.addKeywords("xmpMM:DerivedFrom");
        document0.javaScript_onUnLoad = "padding-bottom";
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.XSTEP;
        com.lowagie.text.pdf.PRIndirectReference pRIndirectReference1 = pdfName0.getIndRef();
        org.junit.Assert.assertNotNull(pdfName0);
        org.junit.Assert.assertNull(pRIndirectReference1);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfRectangle pdfRectangle3 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle4 = pdfRectangle3.getRectangle();
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation9 = com.lowagie.text.pdf.PdfAnnotation.createText(pdfWriter0, rectangle4, "content", "ZHPFQ", false, "No message found for Cp1250");
        pdfAnnotation9.setMKNormalCaption("UTF-16BE");
        com.lowagie.text.pdf.PdfName pdfName12 = com.lowagie.text.pdf.PdfName.XREFSTM;
        com.lowagie.text.pdf.PdfName pdfName13 = com.lowagie.text.pdf.PdfName.DC;
        pdfAnnotation9.setMKIconFit(pdfName12, pdfName13, (float) 247, (float) 4, false);
        org.junit.Assert.assertNotNull(rectangle4);
        org.junit.Assert.assertNotNull(pdfAnnotation9);
        org.junit.Assert.assertNotNull(pdfName12);
        org.junit.Assert.assertNotNull(pdfName13);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        java.awt.Color color2 = java.awt.Color.PINK;
        Font font3 = FontFactory.getFont("content", (float) 14, color2);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(font3);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        String str0 = com.lowagie.text.pdf.AsianFontMapper.ChineseTraditionalEncoding_V;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "UniCNS-UCS2-V" + "'", str0.equals("UniCNS-UCS2-V"));
    }
}

