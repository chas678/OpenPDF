package com.lowagie.text;

import com.lowagie.text.alignment.HorizontalAlignment;
import com.lowagie.text.alignment.VerticalAlignment;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
class RegressionTest0 {

    static boolean debug = false;

    @Test
    void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        int i0 = com.lowagie.text.pdf.ColumnText.AR_LIG;
        assertEquals(8, i0);
    }

    @Test
    void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.SIG;
        assertNotNull(pdfName0);
    }

    @Test
    void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PRIVATE;
        assertNotNull(pdfName0);
    }

    @Test
    void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.I;
        assertNotNull(pdfName0);
    }

    @Test
    void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        int i0 = com.lowagie.text.pdf.PdfTransition.DISSOLVE;
        assertEquals(13, i0);
    }

    @Test
    void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        Section section0 = null;
        try {
            MarkedSection markedSection1 = new MarkedSection(section0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ON;
        assertNotNull(pdfName0);
    }

    @Test
    void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.VOFFSET;
        assertNotNull(pdfName0);
    }

    @Test
    void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        int i0 = com.lowagie.text.pdf.PdfTransition.INBOX;
        assertEquals(7, i0);
    }

    @Test
    void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_SETBKMODE;
        assertEquals(258, i0);
    }

    @Test
    void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        Font font2 = null;
        Phrase phrase3 = new Phrase((float) (short) -1, "hi!", font2);
    }

    @Test
    void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        int i0 = com.lowagie.text.pdf.AcroFields.FIELD_TYPE_RADIOBUTTON;
        assertEquals(3, i0);
    }

    @Test
    void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        String str0 = Chunk.ACTION;
        assertEquals("ACTION", str0, "'" + str0 + "' != '" + "ACTION" + "'");
    }

    @Test
    void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        int i0 = com.lowagie.text.pdf.ExtendedColor.TYPE_CMYK;
        assertEquals(2, i0);
    }

    @Test
    void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.OUTPUTCONDITION;
        assertNotNull(pdfName0);
    }

    @Test
    void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier0 = com.lowagie.text.pdf.PdfPKCS7.X509Name.ST;
        assertNotNull(aSN1ObjectIdentifier0);
    }

    @Test
    void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.io.InputStream inputStream0 = null;
        try {
            com.lowagie.text.pdf.PdfReader pdfReader1 = new com.lowagie.text.pdf.PdfReader(inputStream0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.IMAGEB;
        assertNotNull(pdfName0);
    }

    @Test
    void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        int i0 = com.lowagie.text.pdf.PdfTransition.TBWIPE;
        assertEquals(12, i0);
    }

    @Test
    void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        int i0 = Image.ORIGINAL_JPEG;
        assertEquals(1, i0);
    }

    @Test
    void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.security.cert.X509Certificate x509Certificate0 = null;
        java.util.Collection collection1 = null;
        java.util.Calendar calendar2 = null;
        try {
            String str3 = com.lowagie.text.pdf.PdfPKCS7.verifyCertificate(x509Certificate0, collection1, calendar2);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        RectangleReadOnly rectangleReadOnly4 = new RectangleReadOnly((-1.0f), (float) (short) -1, (-1.0f), 0.0f);
        try {
            rectangleReadOnly4.disableBorderSide((int) (short) 100);
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }
    }

    @Test
    void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        int i0 = com.lowagie.text.pdf.PdfFormField.FF_NO_EXPORT;
        assertEquals(4, i0);
    }

    @Test
    void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        int i0 = com.lowagie.text.pdf.BaseField.MULTISELECT;
        assertEquals(2097152, i0);
    }

    @Test
    void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        int i0 = com.lowagie.text.pdf.ColumnText.DIGITS_EN2AN_INIT_AL;
        assertEquals(128, i0);
    }

    @Test
    void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        String str0 = Annotation.URX;
        assertEquals("urx", str0, "'" + str0 + "' != '" + "urx" + "'");
    }

    @Test
    void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.RENDITION;
        assertNotNull(pdfName0);
    }

    @Test
    void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        char char0 = com.lowagie.text.pdf.Barcode128.CODE_AC_TO_B;
        assertEquals('d', char0);
    }

    @Test
    void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        int i0 = com.lowagie.text.pdf.PdfTransition.BLINDH;
        assertEquals(6, i0);
    }

    @Test
    void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_INTERSECTCLIPRECT;
        assertEquals(1046, i0);
    }

    @Test
    void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        boolean b0 = com.lowagie.text.pdf.ByteBuffer.HIGH_PRECISION;
        assertEquals(false, b0);
    }

    @Test
    void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        int i0 = Font.DEFAULTSIZE;
        assertEquals(12, i0);
    }

    @Test
    void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PARENTTREE;
        assertNotNull(pdfName0);
    }

    @Test
    void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        String str0 = FontFactory.TIMES_ITALIC;
        assertEquals("Times-Italic", str0, "'" + str0 + "' != '" + "Times-Italic" + "'");
    }

    @Test
    void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        String[] str_array2 = new String[]{"Times-Italic", "Times-Italic"};
        java.util.ArrayList<String> arraylist_str3 = new java.util.ArrayList<String>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<String>) arraylist_str3, str_array2);
        try {
            String str7 = arraylist_str3.set(2, "");
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
        }
        assertNotNull(str_array2);
        assertEquals(true, b4);
    }

    @Test
    void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.STRUCTTREEROOT;
        assertNotNull(pdfName0);
    }

    @Test
    void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        java.io.OutputStream outputStream1 = null;
        try {
            com.lowagie.text.pdf.PdfStamper pdfStamper2 = new com.lowagie.text.pdf.PdfStamper(pdfReader0, outputStream1);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        int i0 = com.lowagie.text.pdf.PdfWriter.PageLayoutTwoColumnRight;
        assertEquals(8, i0);
    }

    @Test
    void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.LI;
        assertNotNull(pdfName0);
    }

    @Test
    void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier0 = com.lowagie.text.pdf.PdfPKCS7.X509Name.INITIALS;
        assertNotNull(aSN1ObjectIdentifier0);
    }

    @Test
    void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        String str0 = ElementTags.ABSOLUTEX;
        assertEquals("absolutex", str0, "'" + str0 + "' != '" + "absolutex" + "'");
    }

    @Test
    void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        boolean b2 = Utilities.isSurrogatePair("urx", 12);
        assertEquals(false, b2);
    }

    @Test
    void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.VIEW;
        assertNotNull(pdfName0);
    }

    @Test
    void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        String str1 = com.lowagie.text.factories.RomanNumberFactory.getUpperCaseString((int) '4');
        assertEquals("LII", str1, "'" + str1 + "' != '" + "LII" + "'");
    }

    @Test
    void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        int i0 = com.lowagie.text.pdf.BaseField.VISIBLE;
        assertEquals(0, i0);
    }

    @Test
    void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        String str1 = com.lowagie.text.pdf.XfaForm.Xml2Som.unescapeSom("hi!");
        assertEquals("hi!", str1, "'" + str1 + "' != '" + "hi!" + "'");
    }

    @Test
    void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        char char0 = com.lowagie.text.pdf.BaseFont.CID_NEWLINE;
        assertEquals('翿', char0);
    }

    @Test
    void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        String str1 = com.lowagie.text.pdf.PdfPKCS7.getDigest("urx");
        assertEquals("urx", str1, "'" + str1 + "' != '" + "urx" + "'");
    }

    @Test
    void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.lowagie.text.pdf.codec.wmf.MetaState metaState0 = null;
        try {
            com.lowagie.text.pdf.codec.wmf.MetaState metaState1 = new com.lowagie.text.pdf.codec.wmf.MetaState(metaState0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        int i0 = com.lowagie.text.pdf.RadioCheckField.TYPE_CROSS;
        assertEquals(3, i0);
    }

    @Test
    void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.SINGLEPAGE;
        assertNotNull(pdfName0);
    }

    @Test
    void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        int i0 = Element.CCITTG4;
        assertEquals(256, i0);
    }

    @Test
    void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        int i0 = com.lowagie.text.pdf.PRTokeniser.TK_NAME;
        assertEquals(3, i0);
    }

    @Test
    void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_SETMAPMODE;
        assertEquals(259, i0);
    }

    @Test
    void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        String str0 = ElementTags.URL;
        assertEquals("url", str0, "'" + str0 + "' != '" + "url" + "'");
    }

    @Test
    void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        int i0 = Element.JPEG;
        assertEquals(32, i0);
    }

    @Test
    void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        Document.compress = true;
    }

    @Test
    void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_SETMAPPERFLAGS;
        assertEquals(561, i0);
    }

    @Test
    void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        String str0 = com.lowagie.text.xml.xmp.XmpBasicSchema.ADVISORY;
        assertEquals("xmp:Advisory", str0, "'" + str0 + "' != '" + "xmp:Advisory" + "'");
    }

    @Test
    void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        String str0 = ElementTags.ENCODING;
        assertEquals("encoding", str0, "'" + str0 + "' != '" + "encoding" + "'");
    }

    @Test
    void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.FIELDS;
        assertNotNull(pdfName0);
    }

    @Test
    void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        Image image0 = null;
        try {
            ImgCCITT imgCCITT1 = new ImgCCITT(image0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaPen.PS_NULL;
        assertEquals(5, i0);
    }

    @Test
    void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        boolean b1 = com.lowagie.text.pdf.PdfEncryptor.isPrintingAllowed((int) ' ');
        assertEquals(false, b1);
    }

    @Test
    void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        byte byte0 = DocWriter.QUOTE;
        assertEquals(byte0, (byte) 34);
    }

    @Test
    void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        String str0 = ElementTags.BORDERCOLOR;
        assertEquals("bordercolor", str0, "'" + str0 + "' != '" + "bordercolor" + "'");
    }

    @Test
    void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfName pdfName2 = com.lowagie.text.pdf.PdfName.ORDER;
        com.lowagie.text.pdf.internal.PdfXConformanceImp.checkPDFXConformance(pdfWriter0, 2097152, (Object) pdfName2);
        assertNotNull(pdfName2);
    }

    @Test
    void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        int i0 = com.lowagie.text.pdf.PdfTransition.OUTBOX;
        assertEquals(8, i0);
    }

    @Test
    void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        int i0 = com.lowagie.text.pdf.collection.PdfCollectionField.SIZE;
        assertEquals(7, i0);
    }

    @Test
    void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.lowagie.text.pdf.PdfPTable pdfPTable0 = null;
        try {
            com.lowagie.text.pdf.PdfPTable pdfPTable1 = com.lowagie.text.pdf.PdfPTable.shallowCopy(pdfPTable0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.A;
        assertNotNull(pdfName0);
    }

    @Test
    void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        Rectangle rectangle0 = PageSize.B2;
        assertNotNull(rectangle0);
    }

    @Test
    void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.NONSTRUCT;
        assertNotNull(pdfName0);
    }

    @Test
    void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        RectangleReadOnly rectangleReadOnly4 = new RectangleReadOnly((-1.0f), (float) (short) -1, (-1.0f), 0.0f);
        java.awt.Color color5 = java.awt.Color.DARK_GRAY;
        try {
            rectangleReadOnly4.setBackgroundColor(color5);
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }
        assertNotNull(color5);
    }

    @Test
    void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        String str0 = com.lowagie.text.pdf.BaseFont.CP1252;
        assertEquals("Cp1252", str0, "'" + str0 + "' != '" + "Cp1252" + "'");
    }

    @Test
    void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        Rectangle rectangle0 = PageSize.ROYAL_OCTAVO;
        float f2 = rectangle0.getLeft((float) (short) 0);
        assertNotNull(rectangle0);
        assertEquals(0.0f, f2);
    }

    @Test
    void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_DIBSTRETCHBLT;
        assertEquals(2881, i0);
    }

    @Test
    void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        Font font2 = null;
        try {
            Phrase phrase3 = Phrase.getInstance((int) (byte) -1, "encoding", font2);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        int i0 = com.lowagie.text.pdf.PdfAction.PREVPAGE;
        assertEquals(2, i0);
    }

    @Test
    void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.CROPBOX;
        assertNotNull(pdfName0);
    }

    @Test
    void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfWriter.PDF_VERSION_1_2;
        assertNotNull(pdfName0);
    }

    @Test
    void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        String str0 = ElementTags.CONVERT2PDFP;
        assertEquals("convert2pdfp", str0, "'" + str0 + "' != '" + "convert2pdfp" + "'");
    }

    @Test
    void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        Section section0 = new Section();
        section0.numberStyle = (short) 0;
        boolean b3 = section0.isNestable();
        assertEquals(false, b3);
    }

    @Test
    void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        int i0 = com.lowagie.text.pdf.PdfWriter.PDFXNONE;
        assertEquals(0, i0);
    }

    @Test
    void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.HELVETICA_BOLD;
        assertNotNull(pdfName0);
    }

    @Test
    void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        try {
            com.lowagie.text.pdf.PdfPSXObject pdfPSXObject1 = new com.lowagie.text.pdf.PdfPSXObject(pdfWriter0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.STRUCTPARENT;
        assertNotNull(pdfName0);
    }

    @Test
    void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        String str0 = Chunk.REMOTEGOTO;
        assertEquals("REMOTEGOTO", str0, "'" + str0 + "' != '" + "REMOTEGOTO" + "'");
    }

    @Test
    void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        String str0 = com.lowagie.text.html.Markup.HTML_TAG_SPAN;
        assertEquals("span", str0, "'" + str0 + "' != '" + "span" + "'");
    }

    @Test
    void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        String str0 = ElementTags.TABLEFITSPAGE;
        assertEquals("tablefitspage", str0, "'" + str0 + "' != '" + "tablefitspage" + "'");
    }

    @Test
    void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.SW;
        assertNotNull(pdfName0);
    }

    @Test
    void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.BORDER;
        assertNotNull(pdfName0);
    }

    @Test
    void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        Rectangle rectangle0 = PageSize.HALFLETTER;
        assertNotNull(rectangle0);
    }

    @Test
    void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        int i0 = com.lowagie.text.pdf.PdfDestination.FITBH;
        assertEquals(6, i0);
    }

    @Test
    void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.MK;
        assertNotNull(pdfName0);
    }

    @Test
    void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        java.io.OutputStream outputStream1 = null;
        byte[] byte_array2 = null;
        byte[] byte_array3 = com.lowagie.text.pdf.crypto.IVGenerator.getIV();
        java.util.HashMap hashMap6 = com.lowagie.text.pdf.PdfPKCS7.X509Name.DefaultSymbols;
        try {
            com.lowagie.text.pdf.PdfEncryptor.encrypt(pdfReader0, outputStream1, byte_array2, byte_array3, (int) (short) 0, false, hashMap6);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        assertNotNull(byte_array3);
        assertNotNull(hashMap6);
    }

    @Test
    void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.awt.Color color0 = java.awt.Color.GREEN;
        assertNotNull(color0);
    }

    @Test
    void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.lowagie.text.alignment.HorizontalAlignment horizontalAlignment0 = com.lowagie.text.alignment.HorizontalAlignment.RIGHT;
        assertEquals(horizontalAlignment0, HorizontalAlignment.RIGHT, "'" + horizontalAlignment0 + "' != '" + HorizontalAlignment.RIGHT + "'");
    }

    @Test
    void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.lowagie.text.pdf.PdfLiteral pdfLiteral2 = new com.lowagie.text.pdf.PdfLiteral(7, "span");
    }

    @Test
    void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_SELECTCLIPREGION;
        assertEquals(300, i0);
    }

    @Test
    void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        String str0 = com.lowagie.text.html.Markup.CSS_VALUE_LINETHROUGH;
        assertEquals("line-through", str0, "'" + str0 + "' != '" + "line-through" + "'");
    }

    @Test
    void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PARENT;
        assertNotNull(pdfName0);
    }

    @Test
    void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.lowagie.text.pdf.PdfName[] pdfName_array0 = com.lowagie.text.pdf.internal.PdfViewerPreferencesImp.PRINTSCALING_PREFERENCES;
        assertNotNull(pdfName_array0);
    }

    @Test
    void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        String str0 = com.lowagie.text.xml.xmp.XmpWriter.UTF16BE;
        assertEquals("UTF-16BE", str0, "'" + str0 + "' != '" + "UTF-16BE" + "'");
    }

    @Test
    void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.awt.Color color1 = java.awt.Color.DARK_GRAY;
        com.lowagie.text.pdf.PdfSpotColor pdfSpotColor2 = new com.lowagie.text.pdf.PdfSpotColor("", color1);
        java.awt.color.ColorSpace colorSpace3 = null;
        float[] f_array4 = new float[]{};
        try {
            float[] f_array5 = color1.getColorComponents(colorSpace3, f_array4);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        assertNotNull(color1);
        assertNotNull(f_array4);
    }

    @Test
    void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.lowagie.text.factories.RomanAlphabetFactory romanAlphabetFactory0 = new com.lowagie.text.factories.RomanAlphabetFactory();
    }

    @Test
    void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        String str0 = com.lowagie.text.xml.xmp.PdfA1Schema.PART;
        assertEquals("pdfaid:part", str0, "'" + str0 + "' != '" + "pdfaid:part" + "'");
    }

    @Test
    void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        int i0 = Element.CCITT_ENDOFLINE;
        assertEquals(4, i0);
    }

    @Test
    void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        byte byte0 = DocWriter.FORWARD;
        assertEquals(byte0, (byte) 47);
    }

    @Test
    void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.COURIER_BOLD;
        assertNotNull(pdfName0);
    }

    @Test
    void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.JBIG2GLOBALS;
        assertNotNull(pdfName0);
    }

    @Test
    void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        int i0 = com.lowagie.text.pdf.PdfBorderDictionary.STYLE_SOLID;
        assertEquals(0, i0);
    }

    @Test
    void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_CHORD;
        assertEquals(2096, i0);
    }

    @Test
    void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        String str0 = com.lowagie.text.pdf.BaseFont.TIMES_ITALIC;
        assertEquals("Times-Italic", str0, "'" + str0 + "' != '" + "Times-Italic" + "'");
    }

    @Test
    void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        int i0 = com.lowagie.text.pdf.PdfPTable.BASECANVAS;
        assertEquals(0, i0);
    }

    @Test
    void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        String str2 = com.lowagie.text.factories.GreekAlphabetFactory.getString(2097152, false);
        assertEquals("ZHPFQ", str2, "'" + str2 + "' != '" + "ZHPFQ" + "'");
    }

    @Test
    void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        Section section0 = new Section();
        ElementListener elementListener1 = null;
        boolean b2 = section0.process(elementListener1);
        assertEquals(true, b2);
    }

    @Test
    void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        Annotation annotation8 = new Annotation((float) (short) 100, (float) 1L, (float) (byte) 1, (float) 10, "", "hi!", "", "ACTION");
        float f9 = annotation8.llx();
        assertEquals(100.0f, f9);
    }

    @Test
    void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        String[] str_array4 = new String[]{"", "", "hi!", "urx"};
        java.util.ArrayList<String> arraylist_str5 = new java.util.ArrayList<String>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<String>) arraylist_str5, str_array4);
        Object obj7 = arraylist_str5.clone();
        try {
            String str9 = arraylist_str5.get((int) '翿');
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
        }
        assertNotNull(str_array4);
        assertEquals(true, b6);
        assertNotNull(obj7);
    }

    @Test
    void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        byte[] byte_array0 = com.lowagie.text.pdf.crypto.IVGenerator.getIV();
        try {
            Jpeg2000 jpeg2000_1 = new Jpeg2000(byte_array0);
            fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        assertNotNull(byte_array0);
    }

    @Test
    void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.lowagie.text.pdf.PdfBoolean pdfBoolean0 = com.lowagie.text.pdf.PdfBoolean.PDFFALSE;
        assertNotNull(pdfBoolean0);
    }

    @Test
    void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        int i0 = com.lowagie.text.pdf.BaseFont.STRIKETHROUGH_POSITION;
        assertEquals(15, i0);
    }

    @Test
    void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.UF;
        assertNotNull(pdfName0);
    }

    @Test
    void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        String str0 = com.lowagie.text.html.Markup.CSS_KEY_BGCOLOR;
        assertEquals("background-color", str0, "'" + str0 + "' != '" + "background-color" + "'");
    }

    @Test
    void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        int i0 = com.lowagie.text.pdf.ColumnText.START_COLUMN;
        assertEquals(0, i0);
    }

    @Test
    void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.LINE;
        assertNotNull(pdfName0);
    }

    @Test
    void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        int i0 = com.lowagie.text.pdf.PdfFormField.FF_NO_TOGGLE_TO_OFF;
        assertEquals(16384, i0);
    }

    @Test
    void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_SETTEXTCOLOR;
        assertEquals(521, i0);
    }

    @Test
    void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        String str0 = ElementTags.ALIGN_JUSTIFIED_ALL;
        assertEquals("JustifyAll", str0, "'" + str0 + "' != '" + "JustifyAll" + "'");
    }

    @Test
    void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.lowagie.text.pdf.XfaForm.InverseStore inverseStore0 = new com.lowagie.text.pdf.XfaForm.InverseStore();
    }

    @Test
    void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        FontFactory.defaultEncoding = "convert2pdfp";
    }

    @Test
    void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        String str0 = com.lowagie.text.html.Markup.CSS_VALUE_TABLE;
        assertEquals("table", str0, "'" + str0 + "' != '" + "table" + "'");
    }

    @Test
    void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        int i0 = Image.ORIGINAL_PS;
        assertEquals(7, i0);
    }

    @Test
    void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        String str1 = com.lowagie.text.pdf.PdfPKCS7.getAlgorithm("hi!");
        assertEquals("hi!", str1, "'" + str1 + "' != '" + "hi!" + "'");
    }

    @Test
    void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.security.cert.Certificate certificate0 = null;
        com.lowagie.text.pdf.PdfPublicKeyRecipient pdfPublicKeyRecipient2 = new com.lowagie.text.pdf.PdfPublicKeyRecipient(certificate0, 259);
    }

    @Test
    void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_STRETCHBLT;
        assertEquals(2851, i0);
    }

    @Test
    void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        byte[] byte_array1 = com.lowagie.text.pdf.crypto.IVGenerator.getIV();
        com.lowagie.text.pdf.PRStream pRStream2 = new com.lowagie.text.pdf.PRStream(pdfReader0, byte_array1);
        try {
            com.lowagie.text.pdf.FdfReader fdfReader3 = new com.lowagie.text.pdf.FdfReader(byte_array1);
            fail("Expected exception of type com.lowagie.text.exceptions.InvalidPdfException");
        } catch (com.lowagie.text.exceptions.InvalidPdfException e) {
        }
        assertNotNull(byte_array1);
    }

    @Test
    void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DOMAIN;
        assertNotNull(pdfName0);
    }

    @Test
    void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.WS;
        assertNotNull(pdfName0);
    }

    @Test
    void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        String str0 = Chunk.HSCALE;
        assertEquals("HSCALE", str0, "'" + str0 + "' != '" + "HSCALE" + "'");
    }

    @Test
    void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        int i0 = com.lowagie.text.pdf.Barcode.POSTNET;
        assertEquals(7, i0);
    }

    @Test
    void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.lowagie.text.pdf.PdfWriter.PdfBody.PdfCrossReference pdfCrossReference4 = new com.lowagie.text.pdf.PdfWriter.PdfBody.PdfCrossReference((int) '4', (int) (byte) 0, 10, (int) ' ');
    }

    @Test
    void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.BG;
        assertNotNull(pdfName0);
    }

    @Test
    void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PRINTSTATE;
        assertNotNull(pdfName0);
    }

    @Test
    void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        int i0 = com.lowagie.text.pdf.PdfContentByte.TEXT_RENDER_MODE_INVISIBLE;
        assertEquals(3, i0);
    }

    @Test
    void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        String str0 = Annotation.MIMETYPE;
        assertEquals("mime", str0, "'" + str0 + "' != '" + "mime" + "'");
    }

    @Test
    void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.lowagie.text.pdf.fonts.cmaps.CMapParser cMapParser0 = new com.lowagie.text.pdf.fonts.cmaps.CMapParser();
    }

    @Test
    void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.GOTOR;
        assertNotNull(pdfName0);
    }

    @Test
    void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        String str0 = ElementTags.LASTHEADERROW;
        assertEquals("lastHeaderRow", str0, "'" + str0 + "' != '" + "lastHeaderRow" + "'");
    }

    @Test
    void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TOC;
        assertNotNull(pdfName0);
    }

    @Test
    void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        char char0 = com.lowagie.text.pdf.Barcode128.CODE_A;
        assertEquals('È', char0);
    }

    @Test
    void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TWOPAGERIGHT;
        boolean b1 = pdfName0.isIndirect();
        assertNotNull(pdfName0);
        assertEquals(false, b1);
    }

    @Test
    void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaBrush.HS_BDIAGONAL;
        assertEquals(3, i0);
    }

    @Test
    void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.M;
        assertNotNull(pdfName0);
    }

    @Test
    void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        String str0 = Footnote.CONTENT;
        assertEquals("content", str0, "'" + str0 + "' != '" + "content" + "'");
    }

    @Test
    void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        float f1 = Utilities.millimetersToInches((float) 521);
        assertEquals(20.511812f, f1);
    }

    @Test
    void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        String str1 = com.lowagie.text.pdf.SimpleNamedDestination.unEscapeBinaryString("table");
        assertEquals("table", str1, "'" + str1 + "' != '" + "table" + "'");
    }

    @Test
    void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.N0;
        assertNotNull(pdfName0);
    }

    @Test
    void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.LENGTH;
        assertNotNull(pdfName0);
    }

    @Test
    void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DESC;
        assertNotNull(pdfName0);
    }

    @Test
    void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.CAPTION;
        assertNotNull(pdfName0);
    }

    @Test
    void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.BACKGROUND;
        assertNotNull(pdfName0);
    }

    @Test
    void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        Section section0 = new Section();
        section0.setIndentationRight((float) 5);
        section0.setIndentationRight((float) 521);
    }

    @Test
    void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        int i0 = com.lowagie.text.pdf.PdfWriter.PDFX32002;
        assertEquals(2, i0);
    }

    @Test
    void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        int i0 = com.lowagie.text.pdf.PdfAnnotation.FLAGS_PRINT;
        assertEquals(4, i0);
    }

    @Test
    void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        int i0 = com.lowagie.text.pdf.PdfBorderDictionary.STYLE_INSET;
        assertEquals(3, i0);
    }

    @Test
    void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DATA;
        assertNotNull(pdfName0);
    }

    @Test
    void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        Rectangle rectangle2 = new Rectangle((float) (byte) 100, (float) '4');
        float f3 = rectangle2.borderWidthLeft;
        assertEquals(f3, (-1.0f));
    }

    @Test
    void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        float[] f_array3 = new float[]{(byte) 0, 'È'};
        float[] f_array4 = null;
        try {
            com.lowagie.text.pdf.PdfFunction pdfFunction6 = com.lowagie.text.pdf.PdfFunction.type4(pdfWriter0, f_array3, f_array4, "bordercolor");
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        assertNotNull(f_array3);
    }

    @Test
    void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        String str0 = Footnote.PAGE;
        assertEquals("page", str0, "'" + str0 + "' != '" + "page" + "'");
    }

    @Test
    void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.BASEVERSION;
        assertNotNull(pdfName0);
    }

    @Test
    void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        byte[] byte_array6 = com.lowagie.text.pdf.Barcode128.getBarsCode128Raw("hi!");
        try {
            ImgCCITT imgCCITT7 = new ImgCCITT(10, 1, false, 8, 3, byte_array6);
            fail("Expected exception of type com.lowagie.text.BadElementException");
        } catch (BadElementException e) {
        }
        assertNotNull(byte_array6);
    }

    @Test
    void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.w3c.dom.Node node0 = null;
        String str1 = com.lowagie.text.pdf.XfaForm.getNodeText(node0);
        assertEquals("", str1, "'" + str1 + "' != '" + "" + "'");
    }

    @Test
    void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        int i0 = Font.COURIER;
        assertEquals(0, i0);
    }

    @Test
    void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PROCSET;
        assertNotNull(pdfName0);
    }

    @Test
    void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        String str0 = com.lowagie.text.pdf.BaseFont.CP1250;
        assertEquals("Cp1250", str0, "'" + str0 + "' != '" + "Cp1250" + "'");
    }

    @Test
    void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        int i0 = Jpeg2000.JP2_JP;
        assertEquals(1783636000, i0);
    }

    @Test
    void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        int i0 = Jpeg2000.JP2_JP2H;
        assertEquals(1785737832, i0);
    }

    @Test
    void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        int i0 = Element.PTABLE;
        assertEquals(23, i0);
    }

    @Test
    void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.D;
        assertNotNull(pdfName0);
    }

    @Test
    void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        int i0 = com.lowagie.text.pdf.PdfPageLabels.LOWERCASE_ROMAN_NUMERALS;
        assertEquals(2, i0);
    }

    @Test
    void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DESTOUTPUTPROFILE;
        assertNotNull(pdfName0);
    }

    @Test
    void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.CALGRAY;
        assertNotNull(pdfName0);
    }

    @Test
    void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        byte byte0 = DocWriter.NEWLINE;
        assertEquals(byte0, (byte) 10);
    }

    @Test
    void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        char char0 = com.lowagie.text.pdf.Barcode128.CODE_C;
        assertEquals('Ç', char0);
    }

    @Test
    void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        ElementTags elementTags2 = new ElementTags();
        com.lowagie.text.pdf.internal.PdfXConformanceImp.checkPDFXConformance(pdfWriter0, (int) 'a', (Object) elementTags2);
    }

    @Test
    void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ENDOFLINE;
        assertNotNull(pdfName0);
    }

    @Test
    void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        Rectangle rectangle0 = PageSize.SMALL_PAPERBACK;
        assertNotNull(rectangle0);
    }

    @Test
    void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        int i0 = com.lowagie.text.pdf.PdfAnnotation.FLAGS_INVISIBLE;
        assertEquals(1, i0);
    }

    @Test
    void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.MAX_CAMEL_CASE;
        assertNotNull(pdfName0);
    }

    @Test
    void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        Table table0 = null;
        try {
            Table table1 = new Table(table0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        int i0 = com.lowagie.text.pdf.BaseField.HIDDEN;
        assertEquals(1, i0);
    }

    @Test
    void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.BINDINGMATERIALNAME;
        assertNotNull(pdfName0);
    }

    @Test
    void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.URL;
        assertNotNull(pdfName0);
    }

    @Test
    void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaBrush.HS_FDIAGONAL;
        assertEquals(2, i0);
    }

    @Test
    void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.BLEEDBOX;
        assertNotNull(pdfName0);
    }

    @Test
    void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        String str1 = com.lowagie.text.pdf.XfaForm.Xml2Som.getShortName("background-color");
        assertEquals("background-color", str1, "'" + str1 + "' != '" + "background-color" + "'");
    }

    @Test
    void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        com.lowagie.text.pdf.BarcodePDF417 barcodePDF417_1 = new com.lowagie.text.pdf.BarcodePDF417();
        String str2 = com.lowagie.text.error_messages.MessageLocalization.getComposedMessage("encoding", (Object) barcodePDF417_1);
        assertEquals("No message found for encoding", str2, "'" + str2 + "' != '" + "No message found for encoding" + "'");
    }

    @Test
    void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        String str0 = FontFactory.TIMES_BOLDITALIC;
        assertEquals("Times-BoldItalic", str0, "'" + str0 + "' != '" + "Times-BoldItalic" + "'");
    }

    @Test
    void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PLAYCOUNT;
        assertNotNull(pdfName0);
    }

    @Test
    void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.OFF;
        assertNotNull(pdfName0);
    }

    @Test
    void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        String str0 = com.lowagie.text.html.Markup.CSS_VALUE_INLINE;
        assertEquals("inline", str0, "'" + str0 + "' != '" + "inline" + "'");
    }

    @Test
    void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.util.Optional<com.lowagie.text.alignment.HorizontalAlignment> optional_horizontalAlignment1 = com.lowagie.text.alignment.HorizontalAlignment.of(5);
        assertNotNull(optional_horizontalAlignment1);
    }

    @Test
    void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        int i0 = com.lowagie.text.pdf.PdfWriter.AllowDegradedPrinting;
        assertEquals(4, i0);
    }

    @Test
    void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        String str0 = ElementTags.SCALEDWIDTH;
        assertEquals("scaledwidth", str0, "'" + str0 + "' != '" + "scaledwidth" + "'");
    }

    @Test
    void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        int i1 = Font.getStyleValue("JustifyAll");
        assertEquals(0, i1);
    }

    @Test
    void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        try {
            java.awt.Color color1 = com.lowagie.text.html.WebColors.getRGBColor("JustifyAll");
            fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        boolean b1 = com.lowagie.text.pdf.PRTokeniser.isWhitespace((int) 'a');
        assertEquals(false, b1);
    }

    @Test
    void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        double d2 = com.lowagie.text.pdf.PdfGraphics2D.asPoints((double) (short) 0, 561);
        assertEquals(0.0d, d2);
    }

    @Test
    void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.io.OutputStream outputStream0 = null;
        try {
            com.lowagie.text.pdf.codec.wmf.MetaDo.writeWord(outputStream0, (int) '翿');
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.util.Properties properties0 = null;
        try {
            Phrase phrase1 = com.lowagie.text.factories.ElementFactory.getPhrase(properties0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        byte[] byte_array0 = new byte[]{};
        try {
            Image image1 = ImageLoader.getTiffImage(byte_array0);
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (ExceptionConverter e) {
        }
        assertNotNull(byte_array0);
    }

    @Test
    void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        com.lowagie.text.pdf.PdfRectangle pdfRectangle2 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        com.lowagie.text.pdf.PdfName pdfName4 = com.lowagie.text.pdf.PdfName.FULLSCREEN;
        try {
            pdfRectangle2.add(16384, (com.lowagie.text.pdf.PdfObject) pdfName4);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
        }
        assertNotNull(pdfName4);
    }


    @Test
    void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        int i0 = com.lowagie.text.pdf.PdfWriter.PageLayoutSinglePage;
        assertEquals(1, i0);
    }

    @Test
    void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ROOT;
        assertNotNull(pdfName0);
    }

    @Test
    void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        int i0 = com.lowagie.text.pdf.BaseField.VISIBLE_BUT_DOES_NOT_PRINT;
        assertEquals(2, i0);
    }

    @Test
    void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        int i0 = com.lowagie.text.pdf.PdfFormField.Q_CENTER;
        assertEquals(1, i0);
    }

    @Test
    void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaPen.PS_INSIDEFRAME;
        assertEquals(6, i0);
    }

    @Test
    void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TWOPAGELEFT;
        assertNotNull(pdfName0);
    }

    @Test
    void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        com.lowagie.text.pdf.PdfBoolean pdfBoolean1 = new com.lowagie.text.pdf.PdfBoolean(true);
    }

    @Test
    void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        boolean b1 = com.lowagie.text.pdf.PdfEncodings.isPdfDocEncoding("content");
        assertEquals(true, b1);
    }

    @Test
    void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        java.awt.color.ICC_Profile iCC_Profile0 = null;
        try {
            com.lowagie.text.pdf.PdfICCBased pdfICCBased2 = new com.lowagie.text.pdf.PdfICCBased(iCC_Profile0, (int) (short) 100);
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (ExceptionConverter e) {
        }
    }

    @Test
    void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.KIDS;
        assertNotNull(pdfName0);
    }

    @Test
    void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        String str1 = com.lowagie.text.error_messages.MessageLocalization.getComposedMessage("Cp1250");
        assertEquals("No message found for Cp1250", str1, "'" + str1 + "' != '" + "No message found for Cp1250" + "'");
    }

    @Test
    void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        try {
            com.lowagie.text.pdf.PdfBorderDictionary pdfBorderDictionary2 = new com.lowagie.text.pdf.PdfBorderDictionary(10.0f, (int) '4');
            fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        String str0 = com.lowagie.text.html.Markup.CSS_VALUE_BLOCK;
        assertEquals("block", str0, "'" + str0 + "' != '" + "block" + "'");
    }

    @Test
    void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        int i0 = com.lowagie.text.pdf.PdfTemplate.TYPE_IMPORTED;
        assertEquals(2, i0);
    }

    @Test
    void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_INVERTREGION;
        assertEquals(298, i0);
    }

    @Test
    void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.B;
        assertNotNull(pdfName0);
    }

    @Test
    void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PATTERNTYPE;
        assertNotNull(pdfName0);
    }

    @Test
    void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        boolean b0 = com.lowagie.text.pdf.PdfFormField.PLAINTEXT;
        assertEquals(false, b0);
    }

    @Test
    void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        try {
            com.lowagie.text.pdf.PdfTemplate pdfTemplate3 = com.lowagie.text.pdf.PdfTemplate.createTemplate(pdfWriter0, (float) 1783636000, (-1.0f));
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        String str0 = com.lowagie.text.xml.xmp.XmpMMSchema.DERIVEDFROM;
        assertEquals("xmpMM:DerivedFrom", str0, "'" + str0 + "' != '" + "xmpMM:DerivedFrom" + "'");
    }

    @Test
    void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        VersionBean versionBean0 = new VersionBean();
        VersionBean.Version version1 = versionBean0.getVersion();
        VersionBean.Version version2 = versionBean0.getVersion();
        assertNotNull(version1);
        assertNotNull(version2);
    }

    @Test
    void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        String str0 = com.lowagie.text.xml.xmp.XmpMMSchema.VERSIONID;
        assertEquals("xmpMM:VersionID", str0, "'" + str0 + "' != '" + "xmpMM:VersionID" + "'");
    }

    @Test
    void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        int i0 = com.lowagie.text.pdf.PdfAction.SUBMIT_INCLUDE_NO_VALUE_FIELDS;
        assertEquals(2, i0);
    }

    @Test
    void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        java.util.Set set0 = FontFactory.getRegisteredFonts();
        assertNotNull(set0);
    }

    @Test
    void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfLayerMembership.ALLON;
        assertNotNull(pdfName0);
    }

    @Test
    void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        com.lowagie.text.pdf.hyphenation.HyphenationTree hyphenationTree2 = com.lowagie.text.pdf.hyphenation.Hyphenator.getHyphenationTree("line-through", "xmp:Advisory");
        assertNull(hyphenationTree2);
    }

    @Test
    void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        com.lowagie.text.pdf.Barcode barcode0 = null;
        com.lowagie.text.pdf.Barcode barcode1 = null;
        com.lowagie.text.pdf.BarcodeEANSUPP barcodeEANSUPP2 = new com.lowagie.text.pdf.BarcodeEANSUPP(barcode0, barcode1);
    }

    @Test
    void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        boolean b0 = com.lowagie.text.pdf.BaseFont.CACHED;
        assertEquals(true, b0);
    }

    @Test
    void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        Font font6 = FontFactory.getFont("REMOTEGOTO", "xmp:Advisory", true, (float) (short) -1, 2);
        Chunk chunk7 = new Chunk("JustifyAll", font6);
        float f8 = chunk7.getCharacterSpacing();
        assertNotNull(font6);
        assertEquals(0.0f, f8);
    }

    @Test
    void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        Font font5 = FontFactory.getFont("REMOTEGOTO", "xmp:Advisory", true, (float) (short) -1, 2);
        com.lowagie.text.pdf.BaseFont baseFont6 = font5.getBaseFont();
        assertNotNull(font5);
        assertNull(baseFont6);
    }

    @Test
    void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DESCENDANTFONTS;
        assertNotNull(pdfName0);
    }

    @Test
    void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.OCMD;
        assertNotNull(pdfName0);
    }

    @Test
    void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.R;
        assertNotNull(pdfName0);
    }

    @Test
    void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.EMBEDDEDFILE;
        assertNotNull(pdfName0);
    }

    @Test
    void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        com.lowagie.text.pdf.PdfNameTree pdfNameTree0 = new com.lowagie.text.pdf.PdfNameTree();
    }

    @Test
    void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfLayerMembership.ALLOFF;
        assertNotNull(pdfName0);
    }

    @Test
    void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        int i0 = com.lowagie.text.pdf.BarcodePDF417.PDF417_AUTO_ERROR_LEVEL;
        assertEquals(0, i0);
    }

    @Test
    void test252() throws Throwable {
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
            fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
        assertNotNull(byte_array2);
        assertNotNull(byte_array6);
        assertNotNull(byte_array11);
        assertNotNull(byte_array15);
        assertNotNull(byte_array21);
    }

    @Test
    void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        com.lowagie.text.pdf.PRAcroForm pRAcroForm1 = new com.lowagie.text.pdf.PRAcroForm(pdfReader0);
        com.lowagie.text.pdf.PRIndirectReference pRIndirectReference3 = pRAcroForm1.getRefByName("xmp:Advisory");
        com.lowagie.text.pdf.collection.PdfCollectionSort pdfCollectionSort5 = new com.lowagie.text.pdf.collection.PdfCollectionSort("UTF-16BE");
        boolean b6 = pdfCollectionSort5.isCatalog();
        try {
            pRAcroForm1.readAcroForm((com.lowagie.text.pdf.PdfDictionary) pdfCollectionSort5);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        assertNull(pRIndirectReference3);
        assertEquals(false, b6);
    }

    @Test
    void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.EFF;
        assertNotNull(pdfName0);
    }

    @Test
    void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField4 = com.lowagie.text.pdf.PdfFormField.createTextField(pdfWriter0, true, false, 258);
        com.lowagie.text.pdf.PdfTemplate pdfTemplate5 = null;
        try {
            pdfFormField4.setMKNormalIcon(pdfTemplate5);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        assertNotNull(pdfFormField4);
    }

    @Test
    void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        int i0 = com.lowagie.text.pdf.PRTokeniser.TK_REF;
        assertEquals(9, i0);
    }

    @Test
    void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        com.lowagie.text.pdf.PdfRectangle pdfRectangle2 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        float f3 = pdfRectangle2.bottom();
        assertEquals(0.0f, f3);
    }

    @Test
    void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.N;
        assertNotNull(pdfName0);
    }

    @Test
    void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.LZWDECODE;
        assertNotNull(pdfName0);
    }

    @Test
    void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_FLOODFILL;
        assertEquals(1049, i0);
    }

    @Test
    void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        java.net.URL uRL0 = null;
        try {
            com.lowagie.text.pdf.PdfAction pdfAction2 = new com.lowagie.text.pdf.PdfAction(uRL0, true);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier0 = com.lowagie.text.pdf.PdfPKCS7.X509Name.L;
        assertNotNull(aSN1ObjectIdentifier0);
    }

    @Test
    void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.RICHMEDIAINSTANCE;
        assertNotNull(pdfName0);
    }

    @Test
    void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_CREATEPENINDIRECT;
        assertEquals(762, i0);
    }

    @Test
    void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        int i0 = Font.NORMAL;
        assertEquals(0, i0);
    }

    @Test
    void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        com.lowagie.text.pdf.PdfRectangle pdfRectangle2 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle3 = pdfRectangle2.getRectangle();
        float[] f_array4 = new float[]{};
        boolean b5 = pdfRectangle2.add(f_array4);
        java.util.List<com.lowagie.text.pdf.PdfObject> list_pdfObject6 = pdfRectangle2.getElements();
        assertNotNull(rectangle3);
        assertNotNull(f_array4);
        assertEquals(false, b5);
        assertNotNull(list_pdfObject6);
    }

    @Test
    void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        try {
            String[] str_array1 = com.lowagie.text.pdf.PdfPageLabels.getPageLabels(pdfReader0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_ESCAPE;
        assertEquals(1574, i0);
    }

    @Test
    void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        java.net.URL uRL0 = null;
        try {
            com.lowagie.text.pdf.PdfAction pdfAction2 = new com.lowagie.text.pdf.PdfAction(uRL0, false);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        com.lowagie.text.alignment.VerticalAlignment verticalAlignment0 = com.lowagie.text.alignment.VerticalAlignment.CENTER;
        assertEquals(verticalAlignment0, VerticalAlignment.CENTER, "'" + verticalAlignment0 + "' != '" + VerticalAlignment.CENTER + "'");
    }

    @Test
    void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        int i0 = com.lowagie.text.pdf.PdfObject.ARRAY;
        assertEquals(5, i0);
    }

    @Test
    void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        char char0 = com.lowagie.text.pdf.Barcode128.FNC4;
        assertEquals('È', char0);
    }

    @Test
    void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        Anchor anchor0 = new Anchor();
        Paragraph paragraph1 = new Paragraph((Phrase) anchor0);
        Font font2 = paragraph1.getFont();
        assertNotNull(font2);
    }

    @Test
    void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        RectangleReadOnly rectangleReadOnly4 = new RectangleReadOnly((-1.0f), (float) (short) -1, (-1.0f), 0.0f);
        java.awt.Color color5 = rectangleReadOnly4.borderColorTop;
        try {
            rectangleReadOnly4.normalize();
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }
        assertNull(color5);
    }

    @Test
    void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        com.lowagie.text.pdf.GrayColor grayColor1 = new com.lowagie.text.pdf.GrayColor(4);
        com.lowagie.text.pdf.PdfRectangle pdfRectangle4 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle5 = pdfRectangle4.getRectangle();
        float[] f_array6 = new float[]{};
        boolean b7 = pdfRectangle4.add(f_array6);
        try {
            float[] f_array8 = grayColor1.getRGBColorComponents(f_array6);
            fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
        assertNotNull(rectangle5);
        assertNotNull(f_array6);
        assertEquals(false, b7);
    }

    @Test
    void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        int i0 = com.lowagie.text.pdf.PdfWriter.ALLOW_ASSEMBLY;
        assertEquals(1024, i0);
    }

    @Test
    void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        Document document0 = null;
        java.io.OutputStream outputStream1 = null;
        try {
            com.lowagie.text.pdf.PdfSmartCopy pdfSmartCopy2 = new com.lowagie.text.pdf.PdfSmartCopy(document0, outputStream1);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        int i0 = com.lowagie.text.pdf.PdfWriter.PageModeUseAttachments;
        assertEquals(2048, i0);
    }

    @Test
    void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        int i0 = com.lowagie.text.pdf.BarcodeDatamatrix.DM_ASCII;
        assertEquals(1, i0);
    }

    @Test
    void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.RV;
        assertNotNull(pdfName0);
    }

    @Test
    void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.IRT;
        assertNotNull(pdfName0);
    }

    @Test
    void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        com.lowagie.text.pdf.collection.PdfCollectionSort pdfCollectionSort1 = new com.lowagie.text.pdf.collection.PdfCollectionSort("UTF-16BE");
        boolean b2 = pdfCollectionSort1.isCatalog();
        boolean b3 = pdfCollectionSort1.isPages();
        boolean b4 = pdfCollectionSort1.isIndirect();
        assertEquals(false, b2);
        assertEquals(false, b3);
        assertEquals(false, b4);
    }

    @Test
    void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ADBE_X509_RSA_SHA1;
        assertNotNull(pdfName0);
    }

    @Test
    void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        java.awt.Color color6 = java.awt.Color.DARK_GRAY;
        com.lowagie.text.pdf.PdfSpotColor pdfSpotColor7 = new com.lowagie.text.pdf.PdfSpotColor("", color6);
        com.lowagie.text.pdf.GrayColor grayColor9 = new com.lowagie.text.pdf.GrayColor(4);
        try {
            com.lowagie.text.pdf.PdfShading pdfShading12 = com.lowagie.text.pdf.PdfShading.simpleAxial(pdfWriter0, (float) (byte) 10, (float) 0L, (float) (-1L), (float) 9, color6, (java.awt.Color) grayColor9, true, true);
            fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
        assertNotNull(color6);
    }

    @Test
    void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        int i0 = com.lowagie.text.pdf.PdfSignatureAppearance.SignatureRenderNameAndDescription;
        assertEquals(1, i0);
    }

    @Test
    void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        String str0 = com.lowagie.text.html.Markup.CSS_VALUE_TEXTALIGNJUSTIFY;
        assertEquals("justify", str0, "'" + str0 + "' != '" + "justify" + "'");
    }

    @Test
    void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        char char0 = com.lowagie.text.pdf.Barcode128.FNC1_INDEX;
        assertEquals('f', char0);
    }

    @Test
    void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfAnnotation.APPEARANCE_ROLLOVER;
        assertNotNull(pdfName0);
    }

    @Test
    void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        RectangleReadOnly rectangleReadOnly4 = new RectangleReadOnly((-1.0f), (float) (short) -1, (-1.0f), 0.0f);
        java.awt.Color color5 = rectangleReadOnly4.borderColorTop;
        java.awt.Color color7 = java.awt.Color.DARK_GRAY;
        com.lowagie.text.pdf.PdfSpotColor pdfSpotColor8 = new com.lowagie.text.pdf.PdfSpotColor("", color7);
        try {
            rectangleReadOnly4.setBorderColorRight(color7);
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }
        assertNull(color5);
        assertNotNull(color7);
    }

    @Test
    void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        Chunk chunk0 = Chunk.NEXTPAGE;
        Chunk chunk2 = chunk0.setTextRise((float) 2048);
        int i3 = chunk2.type();
        assertNotNull(chunk0);
        assertNotNull(chunk2);
        assertEquals(10, i3);
    }

    @Test
    void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        String str1 = com.lowagie.text.pdf.BarcodeCodabar.calculateChecksum("table");
        assertEquals("tabl2e", str1, "'" + str1 + "' != '" + "tabl2e" + "'");
    }

    @Test
    void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        RectangleReadOnly rectangleReadOnly4 = new RectangleReadOnly((-1.0f), (float) (short) -1, (-1.0f), 0.0f);
        java.awt.Color color5 = rectangleReadOnly4.borderColorTop;
        try {
            rectangleReadOnly4.setUseVariableBorders(true);
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }
        assertNull(color5);
    }

    @Test
    void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        String str0 = com.lowagie.text.html.Markup.CSS_KEY_TEXTDECORATION;
        assertEquals("text-decoration", str0, "'" + str0 + "' != '" + "text-decoration" + "'");
    }

    @Test
    void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        int i0 = java.awt.geom.PathIterator.SEG_CLOSE;
        assertEquals(4, i0);
    }

    @Test
    void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.KEYWORDS;
        assertNotNull(pdfName0);
    }

    @Test
    void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        com.lowagie.text.pdf.parser.Matrix matrix6 = new com.lowagie.text.pdf.parser.Matrix((float) 'È', 0.0f, (float) (short) 0, 10.0f, (float) 12, (float) 521);
    }

    @Test
    void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        int i0 = com.lowagie.text.pdf.PdfAction.SUBMIT_EXCL_NON_USER_ANNOTS;
        assertEquals(1024, i0);
    }


    @Test
    void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.H5;
        assertNotNull(pdfName0);
    }

    @Test
    void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        Rectangle rectangle0 = PageSize.FLSE;
        assertNotNull(rectangle0);
    }

    @Test
    void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.RUBY;
        assertNotNull(pdfName0);
    }

    @Test
    void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        com.lowagie.text.pdf.collection.PdfCollectionSort pdfCollectionSort1 = new com.lowagie.text.pdf.collection.PdfCollectionSort("UTF-16BE");
        boolean b2 = pdfCollectionSort1.isCatalog();
        pdfCollectionSort1.setSortOrder(true);
        assertEquals(false, b2);
    }

    @Test
    void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        float f0 = com.lowagie.text.pdf.PdfPRow.RIGHT_LIMIT;
        assertEquals(20000.0f, f0);
    }

    @Test
    void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_SETVIEWPORTORG;
        assertEquals(525, i0);
    }

    @Test
    void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TRUETYPE;
        assertNotNull(pdfName0);
    }

    @Test
    void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        String str0 = ElementTags.ANNOTATION;
        assertEquals("annotation", str0, "'" + str0 + "' != '" + "annotation" + "'");
    }

    @Test
    void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        Image image0 = null;
        try {
            ImgJBIG2 imgJBIG2_1 = new ImgJBIG2(image0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        Document.compress = false;
    }

    @Test
    void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DA;
        assertNotNull(pdfName0);
    }

    @Test
    void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PAGELAYOUT;
        assertNotNull(pdfName0);
    }

    @Test
    void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        Chunk chunk0 = Chunk.NEXTPAGE;
        Chunk chunk2 = chunk0.setTextRise((float) 2048);
        java.net.URL uRL3 = null;
        try {
            Chunk chunk4 = chunk0.setAnchor(uRL3);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        assertNotNull(chunk0);
        assertNotNull(chunk2);
    }

    @Test
    void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        int i0 = com.lowagie.text.pdf.PdfTransition.SPLITVIN;
        assertEquals(3, i0);
    }

    @Test
    void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        com.lowagie.text.pdf.GrayColor grayColor1 = new com.lowagie.text.pdf.GrayColor(4);
        int i2 = grayColor1.getBlue();
        assertEquals(4, i2);
    }

    @Test
    void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        Annotation annotation8 = new Annotation((float) (short) 100, (float) 1L, (float) (byte) 1, (float) 10, "", "hi!", "", "ACTION");
        float f9 = annotation8.llx;
        assertEquals(100.0f, f9);
    }

    @Test
    void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        com.lowagie.text.pdf.hyphenation.CharVector charVector1 = new com.lowagie.text.pdf.hyphenation.CharVector((int) (byte) 1);
    }

    @Test
    void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        boolean b1 = com.lowagie.text.pdf.ColumnText.hasMoreText((int) (byte) 1);
        assertEquals(false, b1);
    }

    @Test
    void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_POLYGON;
        assertEquals(804, i0);
    }

    @Test
    void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        RectangleReadOnly rectangleReadOnly4 = new RectangleReadOnly((-1.0f), (float) (short) -1, (-1.0f), 0.0f);
        float f5 = rectangleReadOnly4.getBorderWidthTop();
        try {
            rectangleReadOnly4.setTop((float) 3);
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }
        assertEquals(f5, (-1.0f));
    }

    @Test
    void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        int i0 = Font.STRIKETHRU;
        assertEquals(8, i0);
    }

    @Test
    void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        com.lowagie.text.pdf.ColumnText columnText0 = null;
        try {
            float f5 = com.lowagie.text.pdf.PdfPRow.setColumn(columnText0, (float) 100, (float) 256, (float) (byte) 100, (float) (byte) 10);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        Chunk chunk0 = Chunk.NEXTPAGE;
        Chunk chunk2 = chunk0.setTextRise((float) 2048);
        String str3 = chunk2.getContent();
        assertNotNull(chunk0);
        assertNotNull(chunk2);
        assertEquals("", str3, "'" + str3 + "' != '" + "" + "'");
    }

    @Test
    void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        String str0 = com.lowagie.text.xml.xmp.DublinCoreSchema.DATE;
        assertEquals("dc:date", str0, "'" + str0 + "' != '" + "dc:date" + "'");
    }

    @Test
    void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.INTERPOLATE;
        assertNotNull(pdfName0);
    }

    @Test
    void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        String str0 = com.lowagie.text.xml.xmp.DublinCoreSchema.PUBLISHER;
        assertEquals("dc:publisher", str0, "'" + str0 + "' != '" + "dc:publisher" + "'");
    }

    @Test
    void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        int i0 = com.lowagie.text.pdf.BaseFont.ASCENT;
        assertEquals(1, i0);
    }

    @Test
    void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        com.lowagie.text.pdf.ByteBuffer byteBuffer0 = new com.lowagie.text.pdf.ByteBuffer();
        try {
            byteBuffer0.setSize(15);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
        }
    }

    @Test
    void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        RectangleReadOnly rectangleReadOnly4 = new RectangleReadOnly((-1.0f), (float) (short) -1, (-1.0f), 0.0f);
        float f5 = rectangleReadOnly4.getBorderWidth();
        assertEquals(f5, (-1.0f));
    }

    @Test
    void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        String str0 = com.lowagie.text.xml.xmp.XmpMMSchema.MANAGEDFROM;
        assertEquals("xmpMM:ManagedFrom", str0, "'" + str0 + "' != '" + "xmpMM:ManagedFrom" + "'");
    }

    @Test
    void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        int i0 = com.lowagie.text.pdf.PdfContentParser.COMMAND_TYPE;
        assertEquals(200, i0);
    }

    @Test
    void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DESTS;
        assertNotNull(pdfName0);
    }

    @Test
    void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.GAMMA;
        assertNotNull(pdfName0);
    }

    @Test
    void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        String str0 = com.lowagie.text.html.Markup.HTML_ATTR_WIDTH;
        assertEquals("width", str0, "'" + str0 + "' != '" + "width" + "'");
    }

    @Test
    void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.SQUARE;
        assertNotNull(pdfName0);
    }

    @Test
    void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        String str0 = com.lowagie.text.html.Markup.HTML_ATTR_REL;
        assertEquals("rel", str0, "'" + str0 + "' != '" + "rel" + "'");
    }

    @Test
    void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        double d2 = com.lowagie.text.pdf.PdfGraphics2D.asPoints(0.0d, 12);
        assertEquals(0.0d, d2);
    }

    @Test
    void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        Font font3 = new Font(561);
        Phrase phrase4 = Phrase.getInstance(762, "No message found for encoding", font3);
        assertNotNull(phrase4);
    }

    @Test
    void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        int i0 = com.lowagie.text.pdf.PRTokeniser.TK_COMMENT;
        assertEquals(4, i0);
    }

    @Test
    void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        int i0 = com.lowagie.text.pdf.PdfFormField.FF_COMBO;
        assertEquals(131072, i0);
    }

    @Test
    void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        int i0 = com.lowagie.text.pdf.RadioCheckField.TYPE_DIAMOND;
        assertEquals(4, i0);
    }

    @Test
    void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        com.lowagie.text.pdf.PdfRectangle pdfRectangle2 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle3 = pdfRectangle2.getRectangle();
        float[] f_array4 = new float[]{};
        boolean b5 = pdfRectangle2.add(f_array4);
        float f6 = pdfRectangle2.left();
        assertNotNull(rectangle3);
        assertNotNull(f_array4);
        assertEquals(false, b5);
        assertEquals(0.0f, f6);
    }

    @Test
    void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        int i1 = com.lowagie.text.pdf.PRTokeniser.getHex((int) '#');
        assertEquals(i1, (-1));
    }

    @Test
    void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        Annotation annotation8 = new Annotation((float) (short) 100, (float) 1L, (float) (byte) 1, (float) 10, "", "hi!", "", "ACTION");
        float f9 = annotation8.lly();
        float f11 = annotation8.lly(0.0f);
        float f12 = annotation8.lly();
        assertEquals(1.0f, f9);
        assertEquals(1.0f, f11);
        assertEquals(1.0f, f12);
    }

    @Test
    void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        com.lowagie.text.pdf.PdfRectangle pdfRectangle2 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle3 = pdfRectangle2.getRectangle();
        try {
            com.lowagie.text.pdf.PdfIndirectReference pdfIndirectReference5 = pdfRectangle2.getAsIndirectObject((int) (byte) -1);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
        }
        assertNotNull(rectangle3);
    }

    @Test
    void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        int i0 = com.lowagie.text.pdf.internal.PdfXConformanceImp.PDFXKEY_LAYER;
        assertEquals(7, i0);
    }

    @Test
    void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        int i0 = com.lowagie.text.pdf.PdfContentByte.TEXT_RENDER_MODE_FILL;
        assertEquals(0, i0);
    }

    @Test
    void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        RomanList romanList1 = new RomanList(32);
        String str2 = romanList1.getPostSymbol();
        String str3 = romanList1.preSymbol;
        assertEquals(". ", str2, "'" + str2 + "' != '" + ". " + "'");
        assertEquals("", str3, "'" + str3 + "' != '" + "" + "'");
    }

    @Test
    void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        int i0 = com.lowagie.text.pdf.PdfContentByte.TEXT_RENDER_MODE_FILL_STROKE;
        assertEquals(2, i0);
    }

    @Test
    void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfAnnotation.AA_ENTER;
        assertNotNull(pdfName0);
    }

    @Test
    void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier0 = com.lowagie.text.pdf.PdfPKCS7.X509Name.C;
        assertNotNull(aSN1ObjectIdentifier0);
    }

    @Test
    void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        Rectangle rectangle0 = PageSize.A4;
        assertNotNull(rectangle0);
    }

    @Test
    void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        java.net.URL uRL0 = null;
        try {
            Image image1 = ImageLoader.getGifImage(uRL0);
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (ExceptionConverter e) {
        }
    }

    @Test
    void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.Off;
        assertNotNull(pdfName0);
    }

    @Test
    void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        String str1 = com.lowagie.text.pdf.GlyphList.unicodeToName((int) (short) 100);
        assertEquals("d", str1, "'" + str1 + "' != '" + "d" + "'");
    }

    @Test
    void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        int i0 = Element.ALIGN_LEFT;
        assertEquals(0, i0);
    }

    @Test
    void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        com.lowagie.text.pdf.PdfPCell pdfPCell0 = null;
        try {
            com.lowagie.text.pdf.PdfPCell pdfPCell1 = new com.lowagie.text.pdf.PdfPCell(pdfPCell0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        RectangleReadOnly rectangleReadOnly4 = new RectangleReadOnly((-1.0f), (float) (short) -1, (-1.0f), 0.0f);
        java.awt.Color color5 = rectangleReadOnly4.borderColorTop;
        Rectangle rectangle6 = null;
        try {
            rectangleReadOnly4.cloneNonPositionParameters(rectangle6);
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }
        assertNull(color5);
    }

    @Test
    void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        String str0 = ElementTags.INDENTATIONRIGHT;
        assertEquals("indentationright", str0, "'" + str0 + "' != '" + "indentationright" + "'");
    }

    @Test
    void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        int i0 = com.lowagie.text.pdf.PdfDestination.XYZ;
        assertEquals(0, i0);
    }

    @Test
    void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        String str0 = Footnote.FONT;
        assertEquals("font", str0, "'" + str0 + "' != '" + "font" + "'");
    }

    @Test
    void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        String str0 = ElementTags.IGNORE;
        assertEquals("ignore", str0, "'" + str0 + "' != '" + "ignore" + "'");
    }

    @Test
    void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        String str0 = ElementTags.PLAINWIDTH;
        assertEquals("plainwidth", str0, "'" + str0 + "' != '" + "plainwidth" + "'");
    }

    @Test
    void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        com.lowagie.text.pdf.collection.PdfCollectionSchema pdfCollectionSchema0 = new com.lowagie.text.pdf.collection.PdfCollectionSchema();
    }

    @Test
    void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.FONTNAME;
        assertNotNull(pdfName0);
    }

    @Test
    void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        RectangleReadOnly rectangleReadOnly4 = new RectangleReadOnly((-1.0f), (float) (short) -1, (-1.0f), 0.0f);
        try {
            rectangleReadOnly4.setRight((float) 25448);
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }
    }

    @Test
    void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.HELVETICA;
        assertNotNull(pdfName0);
    }

    @Test
    void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.JS;
        assertNotNull(pdfName0);
    }

    @Test
    void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        com.lowagie.text.pdf.ByteBuffer byteBuffer1 = new com.lowagie.text.pdf.ByteBuffer();
        String str2 = com.lowagie.text.pdf.ByteBuffer.formatDouble((double) 258, byteBuffer1);
        assertNull(str2);
    }

    @Test
    void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        com.lowagie.text.pdf.PdfNumber pdfNumber1 = new com.lowagie.text.pdf.PdfNumber(0.0f);
    }

    @Test
    void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        Chunk chunk0 = Chunk.NEXTPAGE;
        Chunk chunk2 = chunk0.setTextRise((float) 2048);
        java.net.URL uRL3 = null;
        try {
            Chunk chunk4 = chunk2.setAnchor(uRL3);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        assertNotNull(chunk0);
        assertNotNull(chunk2);
    }

    @Test
    void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.POPUP;
        assertNotNull(pdfName0);
    }

    @Test
    void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        int i0 = Jpeg2000.JPIP_JPIP;
        assertEquals(1785751920, i0);
    }

    @Test
    void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfGState.BM_SOFTLIGHT;
        assertNotNull(pdfName0);
    }

    @Test
    void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        int i0 = com.lowagie.text.pdf.PdfContentByte.ALIGN_RIGHT;
        assertEquals(2, i0);
    }

    @Test
    void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        float f0 = com.lowagie.text.pdf.PdfWriter.NO_SPACE_CHAR_RATIO;
        assertEquals(1.0E7f, f0);
    }

    @Test
    void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField4 = com.lowagie.text.pdf.PdfFormField.createTextField(pdfWriter0, true, false, 258);
        pdfFormField4.setButton(0);
        pdfFormField4.setName("HSCALE");
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation9 = com.lowagie.text.pdf.PdfFormField.shallowDuplicate((com.lowagie.text.pdf.PdfAnnotation) pdfFormField4);
        assertNotNull(pdfFormField4);
        assertNotNull(pdfAnnotation9);
    }

    @Test
    void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_CREATEPALETTE;
        assertEquals(247, i0);
    }

    @Test
    void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        com.lowagie.text.pdf.crypto.ARCFOUREncryption aRCFOUREncryption2 = new com.lowagie.text.pdf.crypto.ARCFOUREncryption();
        byte[] byte_array4 = com.lowagie.text.pdf.crypto.IVGenerator.getIV((int) (byte) 47);
        byte[] byte_array8 = com.lowagie.text.pdf.Barcode128.getBarsCode128Raw("hi!");
        aRCFOUREncryption2.encryptARCFOUR(byte_array4, (int) (byte) 1, (-1), byte_array8, 3);
        try {
            String[][] str_array_array11 = com.lowagie.text.pdf.BaseFont.getFullFontName("1.2.12.SNAPSHOT", "dc:date", byte_array8);
            fail("Expected exception of type com.lowagie.text.DocumentException");
        } catch (DocumentException e) {
        }
        assertNotNull(byte_array4);
        assertNotNull(byte_array8);
    }

    @Test
    void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        String str0 = com.lowagie.text.html.Markup.CSS_KEY_PADDINGLEFT;
        assertEquals("padding-left", str0, "'" + str0 + "' != '" + "padding-left" + "'");
    }

    @Test
    void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.SIGREF;
        assertNotNull(pdfName0);
    }

    @Test
    void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        String str0 = com.lowagie.text.html.Markup.CSS_KEY_FONTFAMILY;
        assertEquals("font-family", str0, "'" + str0 + "' != '" + "font-family" + "'");
    }

    @Test
    void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        com.lowagie.text.pdf.IntHashtable intHashtable2 = new com.lowagie.text.pdf.IntHashtable(0, (float) 561);
        int i4 = intHashtable2.get(32);
        Object obj5 = intHashtable2.clone();
        assertEquals(0, i4);
        assertNotNull(obj5);
    }

    @Test
    void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.OC;
        assertNotNull(pdfName0);
    }

    @Test
    void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.FITR;
        assertNotNull(pdfName0);
    }

    @Test
    void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier0 = com.lowagie.text.pdf.PdfPKCS7.X509Name.T;
        assertNotNull(aSN1ObjectIdentifier0);
    }

    @Test
    void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TABS;
        assertNotNull(pdfName0);
    }

    @Test
    void test387() throws Throwable {
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
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        assertNotNull(rectangle4);
        assertNotNull(pdfAnnotation9);
        assertNotNull(color13);
        assertNotNull(pdfName16);
    }

    @Test
    void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.VERISIGN_PPKVS;
        assertNotNull(pdfName0);
    }

    @Test
    void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.CHECKSUM;
        assertNotNull(pdfName0);
    }

    @Test
    void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        String str0 = ElementTags.SYMBOLINDENT;
        assertEquals("symbolindent", str0, "'" + str0 + "' != '" + "symbolindent" + "'");
    }

    @Test
    void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        String str0 = com.lowagie.text.xml.xmp.XmpMMSchema.MANAGERVARIANT;
        assertEquals("xmpMM:ManagerVariant", str0, "'" + str0 + "' != '" + "xmpMM:ManagerVariant" + "'");
    }

    @Test
    void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.O;
        assertNotNull(pdfName0);
    }

    @Test
    void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        String str0 = com.lowagie.text.html.Markup.CSS_KEY_FONTSIZE;
        assertEquals("font-size", str0, "'" + str0 + "' != '" + "font-size" + "'");
    }

    @Test
    void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        Rectangle rectangle1 = PageSize.ROYAL_QUARTO;
        com.lowagie.text.pdf.PdfName pdfName2 = null;
        try {
            com.lowagie.text.pdf.PdfAnnotation pdfAnnotation4 = com.lowagie.text.pdf.PdfAnnotation.createLink(pdfWriter0, rectangle1, pdfName2, "ignore");
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        assertNotNull(rectangle1);
    }

    @Test
    void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.MATERIAL;
        assertNotNull(pdfName0);
    }

    @Test
    void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        int i0 = com.lowagie.text.pdf.BaseFont.DESCENT;
        assertEquals(3, i0);
    }

    @Test
    void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        int i0 = com.lowagie.text.pdf.PdfAction.SUBMIT_XFDF;
        assertEquals(32, i0);
    }

    @Test
    void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        String str0 = ElementTags.PRODUCER;
        assertEquals("producer", str0, "'" + str0 + "' != '" + "producer" + "'");
    }

    @Test
    void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        Document document0 = new Document();
        document0.marginMirroring = false;
        boolean b4 = document0.addKeywords("xmpMM:DerivedFrom");
        int i5 = document0.pageN;
        assertEquals(false, b4);
        assertEquals(0, i5);
    }

    @Test
    void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.OPT;
        assertNotNull(pdfName0);
    }

    @Test
    void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        byte[] byte_array1 = com.lowagie.text.pdf.crypto.IVGenerator.getIV((int) (byte) 47);
        try {
            Image image2 = ImageLoader.getPngImage(byte_array1);
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (ExceptionConverter e) {
        }
        assertNotNull(byte_array1);
    }

    @Test
    void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.USERUNIT;
        assertNotNull(pdfName0);
    }

    @Test
    void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.GTS_PDFA1;
        assertNotNull(pdfName0);
    }

    @Test
    void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField4 = com.lowagie.text.pdf.PdfFormField.createTextField(pdfWriter0, true, false, 258);
        pdfFormField4.setButton(0);
        com.lowagie.text.pdf.PdfBorderDictionary pdfBorderDictionary7 = null;
        pdfFormField4.setBorderStyle(pdfBorderDictionary7);
        assertNotNull(pdfFormField4);
    }

    @Test
    void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        int i0 = com.lowagie.text.pdf.PdfFormField.FF_DONOTSPELLCHECK;
        assertEquals(4194304, i0);
    }

    @Test
    void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ART;
        com.lowagie.text.pdf.PdfObject pdfObject1 = com.lowagie.text.pdf.PdfReader.getPdfObject((com.lowagie.text.pdf.PdfObject) pdfName0);
        boolean b2 = pdfObject1.isDictionary();
        assertNotNull(pdfName0);
        assertNotNull(pdfObject1);
        assertEquals(false, b2);
    }

    @Test
    void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        com.lowagie.text.pdf.PRAcroForm pRAcroForm1 = new com.lowagie.text.pdf.PRAcroForm(pdfReader0);
        com.lowagie.text.pdf.PdfName pdfName2 = com.lowagie.text.pdf.PdfName.MIN_CAMEL_CASE;
        com.lowagie.text.pdf.PdfName pdfName3 = com.lowagie.text.pdf.PdfName.N2;
        pRAcroForm1.putEx(pdfName2, (com.lowagie.text.pdf.PdfObject) pdfName3);
        com.lowagie.text.pdf.PRAcroForm.FieldInformation fieldInformation6 = pRAcroForm1.getField("xmpMM:VersionID");
        assertNotNull(pdfName2);
        assertNotNull(pdfName3);
        assertNull(fieldInformation6);
    }

    @Test
    void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DISPLAYDOCTITLE;
        assertNotNull(pdfName0);
    }

    @Test
    void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        String[] str_array6 = new String[]{"annotation", "dc:publisher", "Times-Italic", "LII"};
        String[] str_array11 = new String[]{"annotation", "dc:publisher", "Times-Italic", "LII"};
        String[] str_array16 = new String[]{"annotation", "dc:publisher", "Times-Italic", "LII"};
        String[] str_array21 = new String[]{"annotation", "dc:publisher", "Times-Italic", "LII"};
        String[] str_array26 = new String[]{"annotation", "dc:publisher", "Times-Italic", "LII"};
        String[][] str_array_array27 = new String[][]{str_array6, str_array11, str_array16, str_array21, str_array26};
        com.lowagie.text.pdf.PdfFormField pdfFormField29 = com.lowagie.text.pdf.PdfFormField.createCombo(pdfWriter0, true, str_array_array27, 0);
        assertNotNull(str_array6);
        assertNotNull(str_array11);
        assertNotNull(str_array16);
        assertNotNull(str_array21);
        assertNotNull(str_array26);
        assertNotNull(str_array_array27);
        assertNotNull(pdfFormField29);
    }

    @Test
    void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        Rectangle rectangle0 = PageSize.B10;
        assertNotNull(rectangle0);
    }

    @Test
    void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_SETRELABS;
        assertEquals(261, i0);
    }

    @Test
    void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        Font font5 = FontFactory.getFont("REMOTEGOTO", "xmp:Advisory", true, (float) (short) -1, 2);
        float f6 = font5.getSize();
        assertNotNull(font5);
        assertEquals(f6, (-1.0f));
    }

    @Test
    void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        int i0 = com.lowagie.text.pdf.PdfSignatureAppearance.CERTIFIED_FORM_FILLING_AND_ANNOTATIONS;
        assertEquals(3, i0);
    }

    @Test
    void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        try {
            java.util.HashMap hashMap2 = com.lowagie.text.pdf.SimpleNamedDestination.getNamedDestination(pdfReader0, true);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        java.awt.Color color0 = java.awt.Color.RED;
        assertNotNull(color0);
    }

    @Test
    void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        String str0 = com.lowagie.text.pdf.BaseFont.RESOURCE_PATH;
        assertEquals("com/lowagie/text/pdf/fonts/", str0, "'" + str0 + "' != '" + "com/lowagie/text/pdf/fonts/" + "'");
    }

    @Test
    void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        com.lowagie.text.pdf.PdfShading pdfShading0 = null;
        try {
            com.lowagie.text.pdf.PdfShadingPattern pdfShadingPattern1 = new com.lowagie.text.pdf.PdfShadingPattern(pdfShading0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.WIN_ANSI_ENCODING;
        assertNotNull(pdfName0);
    }

    @Test
    void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        int i0 = com.lowagie.text.pdf.BaseFont.FONT_TYPE_TT;
        assertEquals(1, i0);
    }

    @Test
    void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        int i0 = com.lowagie.text.pdf.BaseFont.UNDERLINE_THICKNESS;
        assertEquals(14, i0);
    }

    @Test
    void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        int i0 = com.lowagie.text.pdf.internal.PdfXConformanceImp.PDFXKEY_RGB;
        assertEquals(3, i0);
    }

    @Test
    void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        java.util.List list2 = com.lowagie.text.pdf.SequenceList.expand("REMOTEGOTO", 13);
        com.lowagie.text.pdf.PdfArray pdfArray3 = new com.lowagie.text.pdf.PdfArray((java.util.List<com.lowagie.text.pdf.PdfObject>) list2);
        assertNotNull(list2);
    }

    @Test
    void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        String str0 = ElementTags.HEADER;
        assertEquals("header", str0, "'" + str0 + "' != '" + "header" + "'");
    }

    @Test
    void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        String str0 = ElementTags.ALIGN_RIGHT;
        assertEquals("Right", str0, "'" + str0 + "' != '" + "Right" + "'");
    }

    @Test
    void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PART;
        assertNotNull(pdfName0);
    }

    @Test
    void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        int i0 = Annotation.FILE_DEST;
        assertEquals(3, i0);
    }

    @Test
    void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        int i0 = com.lowagie.text.pdf.PdfWriter.ALLOW_FILL_IN;
        assertEquals(256, i0);
    }

    @Test
    void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ACTION;
        assertNotNull(pdfName0);
    }

    @Test
    void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        int i0 = com.lowagie.text.pdf.PdfWriter.PageModeFullScreen;
        assertEquals(512, i0);
    }

    @Test
    void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        String str0 = com.lowagie.text.xml.xmp.DublinCoreSchema.COVERAGE;
        assertEquals("dc:coverage", str0, "'" + str0 + "' != '" + "dc:coverage" + "'");
    }

    @Test
    void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.CFM;
        assertNotNull(pdfName0);
    }

    @Test
    void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        java.util.Properties properties0 = null;
        try {
            Paragraph paragraph1 = com.lowagie.text.factories.ElementFactory.getParagraph(properties0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        Exception exception0 = null;
        BadElementException badElementException1 = new BadElementException(exception0);
    }

    @Test
    void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        Image image0 = null;
        try {
            Jpeg2000 jpeg2000_1 = new Jpeg2000(image0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    void test437() throws Throwable {
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
    void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        int i0 = Section.NUMBERSTYLE_DOTTED_WITHOUT_FINAL_DOT;
        assertEquals(1, i0);
    }

    @Test
    void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        com.lowagie.text.pdf.PdfRectangle pdfRectangle2 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle3 = pdfRectangle2.getRectangle();
        com.lowagie.text.pdf.PdfName pdfName4 = com.lowagie.text.pdf.PdfName.GLITTER;
        boolean b5 = pdfRectangle2.contains((com.lowagie.text.pdf.PdfObject) pdfName4);
        assertNotNull(rectangle3);
        assertNotNull(pdfName4);
        assertEquals(false, b5);
    }

    @Test
    void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.COURIER_BOLDOBLIQUE;
        assertNotNull(pdfName0);
    }

    @Test
    void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        Object[] obj_array1 = com.lowagie.text.pdf.AcroFields.splitDAelements("ZHPFQ");
        assertNotNull(obj_array1);
    }

    @Test
    void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        Anchor anchor0 = new Anchor();
        ListItem listItem1 = new ListItem((Phrase) anchor0);
        int i2 = listItem1.getAlignment();
        Section section4 = new Section((Paragraph) listItem1, 804);
        section4.numberDepth = 2851;
        assertEquals(i2, (-1));
    }

    @Test
    void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        RectangleReadOnly rectangleReadOnly4 = new RectangleReadOnly((-1.0f), (float) (short) -1, (-1.0f), 0.0f);
        java.awt.Color color5 = rectangleReadOnly4.borderColorTop;
        Rectangle rectangle6 = PageSize.B3;
        try {
            rectangleReadOnly4.cloneNonPositionParameters(rectangle6);
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }
        assertNull(color5);
        assertNotNull(rectangle6);
    }

    @Test
    void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.STRIKEOUT;
        assertNotNull(pdfName0);
    }

    @Test
    void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        String str0 = ElementTags.ROW;
        assertEquals("row", str0, "'" + str0 + "' != '" + "row" + "'");
    }

    @Test
    void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PS;
        assertNotNull(pdfName0);
    }

    @Test
    void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        Chunk chunk0 = Chunk.NEXTPAGE;
        com.lowagie.text.pdf.PdfWriter pdfWriter1 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField5 = com.lowagie.text.pdf.PdfFormField.createTextField(pdfWriter1, true, false, 258);
        pdfFormField5.setButton(0);
        Chunk chunk8 = chunk0.setAnnotation((com.lowagie.text.pdf.PdfAnnotation) pdfFormField5);
        Chunk chunk10 = chunk0.setGenericTag("ignore");
        assertNotNull(chunk0);
        assertNotNull(pdfFormField5);
        assertNotNull(chunk8);
        assertNotNull(chunk10);
    }

    @Test
    void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TX;
        assertNotNull(pdfName0);
    }

    @Test
    void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        int i0 = Jpeg2000.JP2_FTYP;
        assertEquals(1718909296, i0);
    }

    @Test
    void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        Document document0 = new Document();
        boolean b1 = document0.addProducer();
        assertEquals(false, b1);
    }

    @Test
    void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.EXTENSIONLEVEL;
        assertNotNull(pdfName0);
    }

    @Test
    void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        int i0 = com.lowagie.text.pdf.PdfWriter.AllowPrinting;
        assertEquals(2052, i0);
    }

    @Test
    void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        int i0 = com.lowagie.text.pdf.ColumnText.DIGIT_TYPE_AN_EXTENDED;
        assertEquals(256, i0);
    }

    @Test
    void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        java.net.URL uRL0 = null;
        try {
            com.lowagie.text.pdf.PdfReader pdfReader1 = new com.lowagie.text.pdf.PdfReader(uRL0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        float f0 = com.lowagie.text.pdf.BaseField.BORDER_WIDTH_THICK;
        assertEquals(3.0f, f0);
    }

    @Test
    void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        Font font7 = FontFactory.getFont("REMOTEGOTO", "xmp:Advisory", true, (float) (short) -1, 2);
        Chunk chunk8 = new Chunk("JustifyAll", font7);
        Font font9 = chunk8.getFont();
        Chunk chunk10 = SpecialSymbol.get('Ç', font9);
        assertNotNull(font7);
        assertNotNull(font9);
        assertNotNull(chunk10);
    }

    @Test
    void test458() throws Throwable {
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
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        assertNotNull(byteBuffer3);
        assertNotNull(pdfWriter4);
        assertNotNull(byte_array8);
    }

    @Test
    void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS pPKMS0 = new com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS();
        byte[] byte_array1 = pPKMS0.getBytes();
        byte[] byte_array5 = new byte[]{(byte) 100, (byte) -1, (byte) 10};
        pPKMS0.setCert(byte_array5);
        assertNull(byte_array1);
        assertNotNull(byte_array5);
    }

    @Test
    void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        String str0 = Annotation.TITLE;
        assertEquals("title", str0, "'" + str0 + "' != '" + "title" + "'");
    }

    @Test
    void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        int i0 = com.lowagie.text.pdf.BaseFont.ITALICANGLE;
        assertEquals(4, i0);
    }

    @Test
    void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DEVICERGB;
        assertNotNull(pdfName0);
    }

    @Test
    void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        java.awt.Color color4 = java.awt.Color.gray;
        Font font5 = FontFactory.getFont("font-family", "hi!", (float) 561, 521, color4);
        assertNotNull(color4);
        assertNotNull(font5);
    }

    @Test
    void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.VIEWAREA;
        assertNotNull(pdfName0);
    }

    @Test
    void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        byte[] byte_array0 = null;
        try {
            Jpeg2000 jpeg2000_1 = new Jpeg2000(byte_array0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        int i0 = Element.ALIGN_UNDEFINED;
        assertEquals(i0, (-1));
    }

    @Test
    void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        String str0 = com.lowagie.text.html.Markup.CSS_KEY_PADDINGBOTTOM;
        assertEquals("padding-bottom", str0, "'" + str0 + "' != '" + "padding-bottom" + "'");
    }

    @Test
    void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        java.util.HashMap hashMap0 = com.lowagie.text.pdf.PdfPKCS7.X509Name.DefaultSymbols;
        Document document1 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer2 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer4 = byteBuffer2.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter5 = com.lowagie.text.pdf.PdfWriter.getInstance(document1, (java.io.OutputStream) byteBuffer4);
        try {
            com.lowagie.text.pdf.PdfDictionary pdfDictionary6 = com.lowagie.text.pdf.PdfNumberTree.writeTree((java.util.Map) hashMap0, pdfWriter5);
            fail("Expected exception of type java.lang.ArrayStoreException");
        } catch (ArrayStoreException e) {
        }
        assertNotNull(hashMap0);
        assertNotNull(byteBuffer4);
        assertNotNull(pdfWriter5);
    }

    @Test
    void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        Section section0 = new Section();
        boolean b1 = section0.isNotAddedYet();
        assertEquals(true, b1);
    }

    @Test
    void test470() throws Throwable {
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
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        assertNotNull(byteBuffer3);
        assertNotNull(pdfWriter4);
    }

    @Test
    void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        int i0 = com.lowagie.text.pdf.PdfFormField.FF_EDIT;
        assertEquals(262144, i0);
    }

    @Test
    void test472() throws Throwable {
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
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        assertNotNull(byteBuffer3);
        assertNotNull(pdfWriter4);
        assertNotNull(pdfFormField15);
    }

    @Test
    void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        byte[] byte_array1 = com.lowagie.text.pdf.crypto.IVGenerator.getIV();
        com.lowagie.text.pdf.PRStream pRStream2 = new com.lowagie.text.pdf.PRStream(pdfReader0, byte_array1);
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = null;
        com.lowagie.text.pdf.ByteBuffer byteBuffer4 = new com.lowagie.text.pdf.ByteBuffer();
        try {
            pRStream2.toPdf(pdfWriter3, (java.io.OutputStream) byteBuffer4);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        assertNotNull(byte_array1);
    }

    @Test
    void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        String str0 = Chunk.HYPHENATION;
        assertEquals("HYPHENATION", str0, "'" + str0 + "' != '" + "HYPHENATION" + "'");
    }

    @Test
    void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        com.lowagie.text.pdf.PdfContentByte pdfContentByte0 = null;
        Phrase phrase3 = new Phrase((float) (-1));
        try {
            com.lowagie.text.pdf.ColumnText.showTextAligned(pdfContentByte0, (int) (byte) 10, phrase3, (float) 10L, (float) 'f', 0.0f, 16384, 200);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        java.security.cert.X509Certificate x509Certificate0 = null;
        Section section1 = new Section();
        section1.setIndentationRight((float) 5);
        boolean b4 = section1.triggerNewPage;
        java.util.Calendar calendar5 = null;
        try {
            String str6 = com.lowagie.text.pdf.PdfPKCS7.verifyCertificate(x509Certificate0, (java.util.Collection) section1, calendar5);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        assertEquals(false, b4);
    }

    @Test
    void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.EXTEND;
        assertNotNull(pdfName0);
    }

    @Test
    void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        RomanList romanList1 = new RomanList(0);
        romanList1.symbolIndent = 14;
    }

    @Test
    void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        String[] str_array4 = new String[]{"", "urx", "hi!", "ACTION"};
        java.util.ArrayList<String> arraylist_str5 = new java.util.ArrayList<String>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<String>) arraylist_str5, str_array4);
        arraylist_str5.ensureCapacity(8);
        java.util.Iterator<String> iterator_str9 = arraylist_str5.iterator();
        java.util.Spliterator<String> spliterator_str10 = arraylist_str5.spliterator();
        assertNotNull(str_array4);
        assertEquals(true, b6);
        assertNotNull(iterator_str9);
        assertNotNull(spliterator_str10);
    }

    @Test
    void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        java.io.InputStream inputStream1 = com.lowagie.text.pdf.BaseFont.getResourceStream("hi!");
        assertNull(inputStream1);
    }

    @Test
    void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        Chunk chunk0 = Chunk.NEXTPAGE;
        com.lowagie.text.pdf.PdfWriter pdfWriter1 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField5 = com.lowagie.text.pdf.PdfFormField.createTextField(pdfWriter1, true, false, 258);
        pdfFormField5.setButton(0);
        Chunk chunk8 = chunk0.setAnnotation((com.lowagie.text.pdf.PdfAnnotation) pdfFormField5);
        try {
            pdfFormField5.setPage();
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        assertNotNull(chunk0);
        assertNotNull(pdfFormField5);
        assertNotNull(chunk8);
    }

    @Test
    void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.VIEWERPREFERENCES;
        assertNotNull(pdfName0);
    }

    @Test
    void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        int i0 = com.lowagie.text.pdf.PRTokeniser.TK_OTHER;
        assertEquals(10, i0);
    }

    @Test
    void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        com.lowagie.text.pdf.PdfRectangle pdfRectangle2 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle3 = pdfRectangle2.getRectangle();
        float[] f_array4 = new float[]{};
        boolean b5 = pdfRectangle2.add(f_array4);
        com.lowagie.text.pdf.PdfName pdfName6 = com.lowagie.text.pdf.PdfName.OUTLINES;
        pdfRectangle2.addFirst((com.lowagie.text.pdf.PdfObject) pdfName6);
        assertNotNull(rectangle3);
        assertNotNull(f_array4);
        assertEquals(false, b5);
        assertNotNull(pdfName6);
    }

    @Test
    void test485() throws Throwable {
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
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        assertNotNull(pdfFormField4);
        assertNotNull(pdfFormField15);
    }

    @Test
    void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TM;
        assertNotNull(pdfName0);
    }

    @Test
    void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        RomanList romanList1 = new RomanList(32);
        boolean b2 = romanList1.numbered;
        romanList1.preSymbol = "xmpMM:DerivedFrom";
        assertEquals(true, b2);
    }

    @Test
    void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        SplitCharacter splitCharacter0 = com.lowagie.text.pdf.DefaultSplitCharacter.DEFAULT;
        assertNotNull(splitCharacter0);
    }

    @Test
    void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        String str0 = com.lowagie.text.pdf.PdfObject.TEXT_UNICODE;
        assertEquals("UnicodeBig", str0, "'" + str0 + "' != '" + "UnicodeBig" + "'");
    }

    @Test
    void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        Section section0 = new Section();
        section0.setNotAddedYet(true);
        section0.setIndentationRight((float) 13);
        boolean b5 = section0.isNotAddedYet();
        assertEquals(true, b5);
    }

    @Test
    void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        com.lowagie.text.factories.GreekAlphabetFactory greekAlphabetFactory0 = new com.lowagie.text.factories.GreekAlphabetFactory();
    }

    @Test
    void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        Rectangle rectangle0 = PageSize.B3;
        java.awt.Color color2 = java.awt.Color.DARK_GRAY;
        com.lowagie.text.pdf.PdfSpotColor pdfSpotColor3 = new com.lowagie.text.pdf.PdfSpotColor("", color2);
        rectangle0.borderColorBottom = color2;
        assertNotNull(rectangle0);
        assertNotNull(color2);
    }

    @Test
    void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfWriter.DID_PRINT;
        assertNotNull(pdfName0);
    }

    @Test
    void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        com.lowagie.text.pdf.PdfRectangle pdfRectangle2 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle3 = pdfRectangle2.getRectangle();
        float[] f_array4 = new float[]{};
        boolean b5 = pdfRectangle2.add(f_array4);
        com.lowagie.text.pdf.PdfName pdfName6 = com.lowagie.text.pdf.PdfWriter.WILL_SAVE;
        boolean b7 = pdfRectangle2.add((com.lowagie.text.pdf.PdfObject) pdfName6);
        com.lowagie.text.pdf.PdfRectangle pdfRectangle11 = new com.lowagie.text.pdf.PdfRectangle((float) '4', 0.0f);
        Rectangle rectangle12 = pdfRectangle11.getRectangle();
        try {
            com.lowagie.text.pdf.PdfObject pdfObject13 = pdfRectangle2.set(9, (com.lowagie.text.pdf.PdfObject) pdfRectangle11);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
        }
        assertNotNull(rectangle3);
        assertNotNull(f_array4);
        assertEquals(false, b5);
        assertNotNull(pdfName6);
        assertEquals(false, b7);
        assertNotNull(rectangle12);
    }

    @Test
    void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        Document document0 = new Document();
        document0.marginMirroring = false;
        boolean b4 = document0.addKeywords("xmpMM:DerivedFrom");
        document0.javaScript_onUnLoad = "padding-bottom";
        assertEquals(false, b4);
    }

    @Test
    void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.XSTEP;
        com.lowagie.text.pdf.PRIndirectReference pRIndirectReference1 = pdfName0.getIndRef();
        assertNotNull(pdfName0);
        assertNull(pRIndirectReference1);
    }

    @Test
    void test498() throws Throwable {
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
        assertNotNull(rectangle4);
        assertNotNull(pdfAnnotation9);
        assertNotNull(pdfName12);
        assertNotNull(pdfName13);
    }

    @Test
    void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        java.awt.Color color2 = java.awt.Color.PINK;
        Font font3 = FontFactory.getFont("content", (float) 14, color2);
        assertNotNull(color2);
        assertNotNull(font3);
    }

    @Test
    void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        String str0 = com.lowagie.text.pdf.AsianFontMapper.ChineseTraditionalEncoding_V;
        assertEquals("UniCNS-UCS2-V", str0, "'" + str0 + "' != '" + "UniCNS-UCS2-V" + "'");
    }
}

