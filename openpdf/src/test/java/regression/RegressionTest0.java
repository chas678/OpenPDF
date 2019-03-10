package regression;

import com.lowagie.text.alignment.HorizontalAlignment;
import com.lowagie.text.alignment.VerticalAlignment;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
class RegressionTest0 {

    public static boolean debug = false;

    @Test
    void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        int i0 = com.lowagie.text.pdf.PdfContentByte.LINE_CAP_ROUND;
        assertEquals(1, i0);
    }

    @Test
    void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.VIEWAREA;
        assertNotNull(pdfName0);
    }

    @Test
    void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        int i0 = com.lowagie.text.Element.ANNOTATION;
        assertEquals(29, i0);
    }

    @Test
    void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.lang.String str0 = com.lowagie.text.FontFactory.ZAPFDINGBATS;
        assertEquals("ZapfDingbats", str0, "'" + str0 + "' != '" + "ZapfDingbats" + "'");
    }

    @Test
    void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaBrush.BS_HATCHED;
        assertEquals(2, i0);
    }

    @Test
    void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.security.cert.X509Certificate x509Certificate0 = null;
        java.lang.String str1 = com.lowagie.text.pdf.PdfPKCS7.getOCSPURL(x509Certificate0);
        assertNull(str1);
    }

    @Test
    void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfIndirectReference pdfIndirectReference1 = null;
        java.util.List list2 = null;
        try {
            java.lang.Object[] obj_array4 = com.lowagie.text.pdf.SimpleBookmark.iterateOutlines(pdfWriter0, pdfIndirectReference1, list2, false);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DUPLEX;
        assertNotNull(pdfName0);
    }

    @Test
    void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DW;
        assertNotNull(pdfName0);
    }

    @Test
    void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        int i0 = com.lowagie.text.pdf.PdfWriter.ALLOW_MODIFY_ANNOTATIONS;
        assertEquals(32, i0);
    }

    @Test
    void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.String str0 = com.lowagie.text.xml.xmp.XmpMMSchema.VERSIONS;
        assertEquals("xmpMM:Versions", str0, "'" + str0 + "' != '" + "xmpMM:Versions" + "'");
    }

    @Test
    void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        int i0 = com.lowagie.text.pdf.PdfWriter.AllowModifyAnnotations;
        assertEquals(32, i0);
    }

    @Test
    void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.lang.String str0 = com.lowagie.text.pdf.PdfObject.TEXT_UNICODE;
        assertEquals("UnicodeBig", str0, "'" + str0 + "' != '" + "UnicodeBig" + "'");
    }

    @Test
    void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        int i0 = com.lowagie.text.pdf.PRTokeniser.TK_END_DIC;
        assertEquals(8, i0);
    }

    @Test
    void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.lang.String str0 = com.lowagie.text.pdf.BaseFont.CP1250;
        assertEquals("Cp1250", str0, "'" + str0 + "' != '" + "Cp1250" + "'");
    }

    @Test
    void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.LAUNCH;
        assertNotNull(pdfName0);
    }

    @Test
    void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.lang.String str0 = com.lowagie.text.ElementTags.ABSOLUTEY;
        assertEquals("absolutey", str0, "'" + str0 + "' != '" + "absolutey" + "'");
    }

    @Test
    void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.lang.String str0 = com.lowagie.text.html.Markup.HTML_ATTR_CSS_CLASS;
        assertEquals("class", str0, "'" + str0 + "' != '" + "class" + "'");
    }

    @Test
    void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.lang.String str0 = com.lowagie.text.ElementTags.WIDTHS;
        assertEquals("widths", str0, "'" + str0 + "' != '" + "widths" + "'");
    }

    @Test
    void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        int i0 = com.lowagie.text.pdf.BaseField.DO_NOT_SPELL_CHECK;
        assertEquals(4194304, i0);
    }

    @Test
    void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.OUTPUTINTENTS;
        assertNotNull(pdfName0);
    }

    @Test
    void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.lang.String str0 = com.lowagie.text.html.Markup.CSS_KEY_TEXTALIGN;
        assertEquals("text-align", str0, "'" + str0 + "' != '" + "text-align" + "'");
    }

    @Test
    void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfIndirectReference pdfIndirectReference1 = null;
        com.lowagie.text.Font font3 = null;
        com.lowagie.text.Footnote footnote4 = new com.lowagie.text.Footnote("", font3);
        com.lowagie.text.HeaderFooter headerFooter6 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote4, true);
        try {
            java.lang.Object[] obj_array8 = com.lowagie.text.pdf.SimpleBookmark.iterateOutlines(pdfWriter0, pdfIndirectReference1, (java.util.List) footnote4, false);
            fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.lowagie.text.Rectangle rectangle0 = com.lowagie.text.PageSize.CROWN_QUARTO;
        assertNotNull(rectangle0);
    }

    @Test
    void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.FO;
        assertNotNull(pdfName0);
    }

    @Test
    void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ROTATE;
        assertNotNull(pdfName0);
    }

    @Test
    void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.lang.String str0 = com.lowagie.text.ElementTags.LISTITEM;
        assertEquals("listitem", str0, "'" + str0 + "' != '" + "listitem" + "'");
    }

    @Test
    void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.lang.String str0 = com.lowagie.text.xml.xmp.XmpBasicSchema.NICKNAME;
        assertEquals("xmp:Nickname", str0, "'" + str0 + "' != '" + "xmp:Nickname" + "'");
    }

    @Test
    void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PREVPAGE;
        assertNotNull(pdfName0);
    }

    @Test
    void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        char[] char_array3 = new char[] { ' ', 'a', ' ' };
        char[] char_array10 = new char[] { ' ', 'a', 'a', '#', '#' };
        try {
            int i12 = com.lowagie.text.pdf.hyphenation.TernaryTree.strcmp(char_array3, (int) (short) -1, char_array10, (int) (short) 1);
            fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        assertNotNull(char_array3);
        assertNotNull(char_array10);
    }

    @Test
    void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.GLITTER;
        assertNotNull(pdfName0);
    }

    @Test
    void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        int i0 = com.lowagie.text.pdf.ExtendedColor.TYPE_RGB;
        assertEquals(0, i0);
    }

    @Test
    void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.lowagie.text.alignment.VerticalAlignment verticalAlignment0 = com.lowagie.text.alignment.VerticalAlignment.BOTTOM;
        assertEquals(verticalAlignment0, VerticalAlignment.BOTTOM, "'" + verticalAlignment0 + "' != '" + VerticalAlignment.BOTTOM + "'");
    }

    @Test
    void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        int i0 = com.lowagie.text.pdf.PdfDestination.FITR;
        assertEquals(4, i0);
    }

    @Test
    void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        int i0 = com.lowagie.text.Image.AY;
        assertEquals(1, i0);
    }

    @Test
    void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.lowagie.text.pdf.PdfEncodings.clearCmap("Cp1250");
    }

    @Test
    void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        int i1 = com.lowagie.text.ElementTags.alignmentValue("listitem");
        assertEquals(i1, (-1));
    }

    @Test
    void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.lang.String str0 = com.lowagie.text.html.Markup.CSS_KEY_BORDERWIDTHBOTTOM;
        assertEquals("border-bottom-width", str0, "'" + str0 + "' != '" + "border-bottom-width" + "'");
    }

    @Test
    void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.lowagie.text.alignment.HorizontalAlignment horizontalAlignment0 = com.lowagie.text.alignment.HorizontalAlignment.JUSTIFIED_ALL;
        assertEquals(horizontalAlignment0, HorizontalAlignment.JUSTIFIED_ALL, "'" + horizontalAlignment0 + "' != '" + HorizontalAlignment.JUSTIFIED_ALL + "'");
    }

    @Test
    void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.lowagie.text.pdf.PdfNumber pdfNumber1 = new com.lowagie.text.pdf.PdfNumber((double) 32);
    }

    @Test
    void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.WIDTHS;
        assertNotNull(pdfName0);
    }

    @Test
    void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.CALGRAY;
        assertNotNull(pdfName0);
    }

    @Test
    void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        java.io.OutputStream outputStream1 = null;
        try {
            com.lowagie.text.pdf.PdfEncryptor.encrypt(pdfReader0, outputStream1, true, "", "listitem", (int) '4');
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.H5;
        boolean b1 = pdfName0.isString();
        assertNotNull(pdfName0);
        assertEquals(false, b1);
    }

    @Test
    void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.lowagie.text.pdf.PdfReader pdfReader1 = null;
        byte[] byte_array6 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1 };
        com.lowagie.text.pdf.PRStream pRStream7 = new com.lowagie.text.pdf.PRStream(pdfReader1, byte_array6);
        try {
            java.lang.String str10 = com.lowagie.text.pdf.PdfEncodings.convertCmap("xmp:Nickname", byte_array6, 29, 0);
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (com.lowagie.text.ExceptionConverter e) {
        }
        assertNotNull(byte_array6);
    }

    @Test
    void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.lowagie.text.Font font2 = new com.lowagie.text.Font(0, (float) 'a');
    }

    @Test
    void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_SETPOLYFILLMODE;
        assertEquals(262, i0);
    }

    @Test
    void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        byte[] byte_array5 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1 };
        com.lowagie.text.pdf.PRStream pRStream6 = new com.lowagie.text.pdf.PRStream(pdfReader0, byte_array5);
        com.lowagie.text.pdf.PdfReader pdfReader7 = null;
        byte[] byte_array12 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1 };
        com.lowagie.text.pdf.PRStream pRStream13 = new com.lowagie.text.pdf.PRStream(pdfReader7, byte_array12);
        pRStream6.setData(byte_array12, false, (int) (byte) 100);
        try {
            com.lowagie.text.Image image17 = com.lowagie.text.ImageLoader.getTiffImage(byte_array12);
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (com.lowagie.text.ExceptionConverter e) {
        }
        assertNotNull(byte_array5);
        assertNotNull(byte_array12);
    }

    @Test
    void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_DIBBITBLT;
        assertEquals(2368, i0);
    }

    @Test
    void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.USER;
        assertNotNull(pdfName0);
    }

    @Test
    void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.lang.String str0 = com.lowagie.text.ElementTags.FACE;
        assertEquals("face", str0, "'" + str0 + "' != '" + "face" + "'");
    }

    @Test
    void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        int i0 = com.lowagie.text.Jpeg2000.JP2_JP2;
        assertEquals(1785737760, i0);
    }

    @Test
    void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.lang.String str0 = com.lowagie.text.html.Markup.CSS_KEY_PAGE_BREAK_AFTER;
        assertEquals("page-break-after", str0, "'" + str0 + "' != '" + "page-break-after" + "'");
    }

    @Test
    void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.lang.String str2 = com.lowagie.text.factories.RomanAlphabetFactory.getString((int) (short) 100, false);
        assertEquals("CV", str2, "'" + str2 + "' != '" + "CV" + "'");
    }

    @Test
    void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        boolean b1 = com.lowagie.text.pdf.PdfEncodings.isPdfDocEncoding("CV");
        assertEquals(true, b1);
    }

    @Test
    void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.io.OutputStream outputStream0 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields2 = new com.lowagie.text.pdf.PdfCopyFields(outputStream0, '#');
    }

    @Test
    void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        int i0 = com.lowagie.text.Annotation.URL_NET;
        assertEquals(1, i0);
    }

    @Test
    void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        int i0 = com.lowagie.text.pdf.PdfPTable.TEXTCANVAS;
        assertEquals(3, i0);
    }

    @Test
    void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.A;
        assertNotNull(pdfName0);
    }

    @Test
    void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.lang.String str0 = com.lowagie.text.html.Markup.CSS_KEY_PAGE_BREAK_BEFORE;
        assertEquals("page-break-before", str0, "'" + str0 + "' != '" + "page-break-before" + "'");
    }

    @Test
    void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.lowagie.text.pdf.PdfName[] pdfName_array0 = com.lowagie.text.pdf.internal.PdfViewerPreferencesImp.VIEWER_PREFERENCES;
        assertNotNull(pdfName_array0);
    }

    @Test
    void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfFormField.IF_SCALE_ANAMORPHIC;
        assertNotNull(pdfName0);
    }

    @Test
    void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.lowagie.text.Rectangle rectangle0 = com.lowagie.text.PageSize.ARCH_C;
        assertNotNull(rectangle0);
    }

    @Test
    void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ASCIIHEXDECODE;
        assertNotNull(pdfName0);
    }

    @Test
    void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfGState.BM_DIFFERENCE;
        assertNotNull(pdfName0);
    }

    @Test
    void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.lang.String str0 = com.lowagie.text.ElementTags.BORDERCOLOR;
        assertEquals("bordercolor", str0, "'" + str0 + "' != '" + "bordercolor" + "'");
    }

    @Test
    void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.awt.Color color3 = java.awt.Color.getHSBColor(100.0f, (float) (short) 1, 100.0f);
        java.awt.color.ColorSpace colorSpace4 = null;
        float[] f_array7 = new float[] { (byte) 1, (byte) 0 };
        try {
            float[] f_array8 = color3.getComponents(colorSpace4, f_array7);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(color3);
        assertNotNull(f_array7);
    }

    @Test
    void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_POLYGON;
        assertEquals(804, i0);
    }

    @Test
    void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.lang.String str0 = com.lowagie.text.ElementTags.ABSOLUTEX;
        assertEquals("absolutex", str0, "'" + str0 + "' != '" + "absolutex" + "'");
    }

    @Test
    void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        int i0 = com.lowagie.text.pdf.PdfWriter.DO_NOT_ENCRYPT_METADATA;
        assertEquals(8, i0);
    }

    @Test
    void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.EFOPEN;
        assertNotNull(pdfName0);
    }

    @Test
    void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        int i0 = com.lowagie.text.pdf.PRTokeniser.TK_REF;
        assertEquals(9, i0);
    }

    @Test
    void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        char[] char_array1 = new char[] { 'a' };
        try {
            int i3 = com.lowagie.text.pdf.hyphenation.TernaryTree.strlen(char_array1, (-1));
            fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        assertNotNull(char_array1);
    }

    @Test
    void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.lang.String str0 = com.lowagie.text.ElementTags.CONVERT2PDFP;
        assertEquals("convert2pdfp", str0, "'" + str0 + "' != '" + "convert2pdfp" + "'");
    }

    @Test
    void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.lang.String str0 = com.lowagie.text.pdf.AsianFontMapper.JapaneseFont_Go;
        assertEquals("HeiseiKakuGo-W5", str0, "'" + str0 + "' != '" + "HeiseiKakuGo-W5" + "'");
    }

    @Test
    void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.lowagie.text.Font font2 = null;
        try {
            com.lowagie.text.Phrase phrase3 = com.lowagie.text.Phrase.getInstance(10, "xmp:Nickname", font2);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.lang.String str2 = com.lowagie.text.xml.XMLUtil.escapeXML("face", false);
        assertEquals("face", str2, "'" + str2 + "' != '" + "face" + "'");
    }

    @Test
    void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.lang.String str0 = com.lowagie.text.xml.xmp.XmpBasicSchema.MODIFYDATE;
        assertEquals("xmp:ModifyDate", str0, "'" + str0 + "' != '" + "xmp:ModifyDate" + "'");
    }

    @Test
    void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.lang.String str1 = com.lowagie.text.factories.GreekAlphabetFactory.getUpperCaseString(8);
        assertEquals("Q", str1, "'" + str1 + "' != '" + "Q" + "'");
    }

    @Test
    void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        char[] char_array4 = new char[] { '4', 'a', '#', 'a' };
        char[] char_array10 = new char[] { 'a', '4', 'a', '4' };
        try {
            int i12 = com.lowagie.text.pdf.hyphenation.TernaryTree.strcmp(char_array4, (int) (byte) 1, char_array10, (int) (short) -1);
            fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        assertNotNull(char_array4);
        assertNotNull(char_array10);
    }

    @Test
    void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        int i0 = com.lowagie.text.Element.RECTANGLE;
        assertEquals(30, i0);
    }

    @Test
    void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        int i0 = com.lowagie.text.pdf.VerticalText.NO_MORE_COLUMN;
        assertEquals(2, i0);
    }

    @Test
    void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.CATALOG;
        assertNotNull(pdfName0);
    }

    @Test
    void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier0 = com.lowagie.text.pdf.PdfPKCS7.X509Name.EmailAddress;
        assertNotNull(aSN1ObjectIdentifier0);
    }

    @Test
    void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        int i0 = com.lowagie.text.Rectangle.NO_BORDER;
        assertEquals(0, i0);
    }

    @Test
    void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.OP;
        assertNotNull(pdfName0);
    }

    @Test
    void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.lang.String str0 = com.lowagie.text.Chunk.COLOR;
        assertEquals("COLOR", str0, "'" + str0 + "' != '" + "COLOR" + "'");
    }

    @Test
    void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.HIDE;
        assertNotNull(pdfName0);
    }

    @Test
    void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        try {
            java.security.KeyStore keyStore1 = com.lowagie.text.pdf.PdfPKCS7.loadCacertsKeyStore("absolutey");
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (com.lowagie.text.ExceptionConverter e) {
        }
    }

    @Test
    void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.LOCK;
        assertNotNull(pdfName0);
    }

    @Test
    void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        int i0 = com.lowagie.text.pdf.ColumnText.DIGITS_EN2AN;
        assertEquals(32, i0);
    }

    @Test
    void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        int i0 = com.lowagie.text.pdf.PdfWriter.RUN_DIRECTION_DEFAULT;
        assertEquals(0, i0);
    }

    @Test
    void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaBrush.BS_DIBPATTERN;
        assertEquals(5, i0);
    }

    @Test
    void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.lang.String[] str_array2 = new java.lang.String[] { "Q", "listitem" };
        java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str3, str_array2);
        try {
            java.lang.String str6 = arraylist_str3.remove((int) (short) 10);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        assertNotNull(str_array2);
        assertEquals(true, b4);
    }

    @Test
    void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        int i0 = com.lowagie.text.pdf.PdfWriter.ALLOW_COPY;
        assertEquals(16, i0);
    }

    @Test
    void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.lowagie.text.Rectangle rectangle0 = com.lowagie.text.PageSize.LEDGER;
        assertNotNull(rectangle0);
    }

    @Test
    void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.lang.String str0 = com.lowagie.text.pdf.BaseFont.IDENTITY_V;
        assertEquals("Identity-V", str0, "'" + str0 + "' != '" + "Identity-V" + "'");
    }

    @Test
    void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        int i0 = com.lowagie.text.pdf.PdfContentByte.ALIGN_CENTER;
        assertEquals(1, i0);
    }

    @Test
    void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        int i0 = java.awt.geom.PathIterator.SEG_LINETO;
        assertEquals(1, i0);
    }

    @Test
    void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        int i0 = java.awt.Transparency.BITMASK;
        assertEquals(2, i0);
    }

    @Test
    void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DESC;
        assertNotNull(pdfName0);
    }

    @Test
    void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.lang.String str0 = com.lowagie.text.xml.xmp.PdfSchema.KEYWORDS;
        assertEquals("pdf:keywords", str0, "'" + str0 + "' != '" + "pdf:keywords" + "'");
    }

    @Test
    void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.lang.String str0 = com.lowagie.text.ElementTags.NUMBERDEPTH;
        assertEquals("numberdepth", str0, "'" + str0 + "' != '" + "numberdepth" + "'");
    }

    @Test
    void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName._3D;
        assertNotNull(pdfName0);
    }

    @Test
    void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.lang.String str0 = com.lowagie.text.FontFactory.TIMES_ROMAN;
        assertEquals("Times-Roman", str0, "'" + str0 + "' != '" + "Times-Roman" + "'");
    }

    @Test
    void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.util.HashMap hashMap0 = com.lowagie.text.xml.simpleparser.EntitiesToSymbol.map;
        java.io.OutputStream outputStream1 = null;
        try {
            com.lowagie.text.pdf.SimpleNamedDestination.exportToXML(hashMap0, outputStream1, "", true);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(hashMap0);
    }

    @Test
    void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.lowagie.text.Rectangle rectangle0 = com.lowagie.text.PageSize.NOTE;
        assertNotNull(rectangle0);
    }

    @Test
    void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.lang.String str0 = com.lowagie.text.ElementTags.LEADING;
        assertEquals("leading", str0, "'" + str0 + "' != '" + "leading" + "'");
    }

    @Test
    void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        int i0 = com.lowagie.text.pdf.ArabicLigaturizer.DIGIT_TYPE_MASK;
        assertEquals(256, i0);
    }

    @Test
    void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        int i0 = com.lowagie.text.pdf.BaseField.VISIBLE_BUT_DOES_NOT_PRINT;
        assertEquals(2, i0);
    }

    @Test
    void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        int i0 = com.lowagie.text.pdf.PdfAction.SUBMIT_INCLUDE_APPEND_SAVES;
        assertEquals(64, i0);
    }

    @Test
    void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.lowagie.text.Font font1 = null;
        com.lowagie.text.Footnote footnote2 = new com.lowagie.text.Footnote("", font1);
        int[] i_array7 = new int[] { (short) 1, 1785737760, 8, 100 };
        com.lowagie.text.pdf.SimpleBookmark.eliminatePages((java.util.List) footnote2, i_array7);
        java.awt.Color color13 = java.awt.Color.getHSBColor(100.0f, (float) (short) 1, 100.0f);
        try {
            footnote2.add(8, (java.lang.Object) color13);
            fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        assertNotNull(i_array7);
        assertNotNull(color13);
    }

    @Test
    void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.FT;
        assertNotNull(pdfName0);
    }

    @Test
    void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        int i0 = com.lowagie.text.pdf.PdfAction.FIRSTPAGE;
        assertEquals(1, i0);
    }

    @Test
    void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.lang.String str0 = com.lowagie.text.ElementTags.ALIGN_RIGHT;
        assertEquals("Right", str0, "'" + str0 + "' != '" + "Right" + "'");
    }

    @Test
    void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        int i0 = com.lowagie.text.pdf.PdfSignatureAppearance.CERTIFIED_FORM_FILLING;
        assertEquals(2, i0);
    }

    @Test
    void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.lang.String str0 = com.lowagie.text.xml.xmp.DublinCoreSchema.DATE;
        assertEquals("dc:date", str0, "'" + str0 + "' != '" + "dc:date" + "'");
    }

    @Test
    void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        int i0 = com.lowagie.text.pdf.internal.PdfXConformanceImp.PDFXKEY_CMYK;
        assertEquals(2, i0);
    }

    @Test
    void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        int i0 = com.lowagie.text.pdf.PdfWriter.RUN_DIRECTION_LTR;
        assertEquals(2, i0);
    }

    @Test
    void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        int i0 = com.lowagie.text.pdf.PdfWriter.AllowDegradedPrinting;
        assertEquals(4, i0);
    }

    @Test
    void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        boolean b1 = com.lowagie.text.pdf.PRTokeniser.isWhitespace((int) (short) 1);
        assertEquals(false, b1);
    }

    @Test
    void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        int i0 = com.lowagie.text.pdf.Barcode.CODE128;
        assertEquals(9, i0);
    }

    @Test
    void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.lowagie.text.pdf.PdfName[] pdfName_array0 = com.lowagie.text.pdf.internal.PdfViewerPreferencesImp.DIRECTION_PREFERENCES;
        assertNotNull(pdfName_array0);
    }

    @Test
    void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        java.awt.Color color4 = java.awt.Color.getHSBColor(100.0f, (float) (short) 1, 100.0f);
        float[] f_array6 = new float[] { 10.0f };
        float[] f_array7 = new float[] {};
        com.lowagie.text.pdf.PdfFunction pdfFunction8 = null;
        boolean[] b_array13 = new boolean[] { false, false, true, false };
        try {
            com.lowagie.text.pdf.PdfShading pdfShading14 = com.lowagie.text.pdf.PdfShading.type2(pdfWriter0, color4, f_array6, f_array7, pdfFunction8, b_array13);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(color4);
        assertNotNull(f_array6);
        assertNotNull(f_array7);
        assertNotNull(b_array13);
    }

    @Test
    void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.io.OutputStream outputStream0 = null;
        try {
            com.lowagie.text.xml.xmp.XmpWriter xmpWriter1 = new com.lowagie.text.xml.xmp.XmpWriter(outputStream0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.lowagie.text.Chunk chunk1 = null;
        try {
            com.lowagie.text.ListItem listItem2 = new com.lowagie.text.ListItem((float) 1, chunk1);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.lang.String str1 = com.lowagie.text.pdf.BarcodeEAN.convertUPCAtoUPCE("Right");
        assertNull(str1);
    }

    @Test
    void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.CONDITION;
        assertNotNull(pdfName0);
    }

    @Test
    void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.SQUIGGLY;
        assertNotNull(pdfName0);
    }

    @Test
    void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        int i0 = com.lowagie.text.Annotation.NAMED_DEST;
        assertEquals(5, i0);
    }

    @Test
    void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfDictionary.PAGES;
        assertNotNull(pdfName0);
    }

    @Test
    void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.lowagie.text.html.Markup markup0 = new com.lowagie.text.html.Markup();
    }

    @Test
    void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.security.cert.Certificate certificate0 = null;
        com.lowagie.text.pdf.PdfPublicKeyRecipient pdfPublicKeyRecipient2 = new com.lowagie.text.pdf.PdfPublicKeyRecipient(certificate0, (int) (byte) 100);
        int i3 = pdfPublicKeyRecipient2.getPermission();
        assertEquals(100, i3);
    }

    @Test
    void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DOCMDP;
        assertNotNull(pdfName0);
    }

    @Test
    void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.lowagie.text.pdf.PdfPTable pdfPTable0 = null;
        try {
            com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(pdfPTable0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.lang.String str1 = com.lowagie.text.ElementTags.getAlignment((-1));
        assertEquals("Default", str1, "'" + str1 + "' != '" + "Default" + "'");
    }

    @Test
    void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.util.Optional<com.lowagie.text.alignment.VerticalAlignment> optional_verticalAlignment1 = com.lowagie.text.alignment.VerticalAlignment.of((int) '#');
        assertNotNull(optional_verticalAlignment1);
    }

    @Test
    void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.lowagie.text.pdf.BaseFont baseFont0 = null;
        com.lowagie.text.Font font3 = new com.lowagie.text.Font(baseFont0, (float) (short) 1, (int) (short) 0);
        font3.setSize((float) 100L);
        boolean b6 = font3.isUnderlined();
        assertEquals(false, b6);
    }

    @Test
    void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        int i0 = com.lowagie.text.Rectangle.LEFT;
        assertEquals(4, i0);
    }

    @Test
    void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.lang.String str0 = com.lowagie.text.ElementTags.VERTICALALIGN;
        assertEquals("verticalalign", str0, "'" + str0 + "' != '" + "verticalalign" + "'");
    }

    @Test
    void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        byte[] byte_array5 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1 };
        com.lowagie.text.pdf.PRStream pRStream6 = new com.lowagie.text.pdf.PRStream(pdfReader0, byte_array5);
        com.lowagie.text.pdf.PdfReader pdfReader7 = null;
        byte[] byte_array12 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1 };
        com.lowagie.text.pdf.PRStream pRStream13 = new com.lowagie.text.pdf.PRStream(pdfReader7, byte_array12);
        pRStream6.setData(byte_array12, false, (int) (byte) 100);
        try {
            com.lowagie.text.ImgWMF imgWMF17 = new com.lowagie.text.ImgWMF(byte_array12);
            fail("Expected exception of type com.lowagie.text.BadElementException");
        } catch (com.lowagie.text.BadElementException e) {
        }
        assertNotNull(byte_array5);
        assertNotNull(byte_array12);
    }

    @Test
    void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfDictionary.OUTLINES;
        assertNotNull(pdfName0);
    }

    @Test
    void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.lang.String str0 = com.lowagie.text.pdf.BaseFont.TIMES_ROMAN;
        assertEquals("Times-Roman", str0, "'" + str0 + "' != '" + "Times-Roman" + "'");
    }

    @Test
    void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.lang.String str0 = com.lowagie.text.ElementTags.GRAYFILL;
        assertEquals("grayfill", str0, "'" + str0 + "' != '" + "grayfill" + "'");
    }

    @Test
    void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.lowagie.text.pdf.PdfContentByte pdfContentByte0 = null;
        java.awt.Image image1 = null;
        try {
            com.lowagie.text.Image image3 = com.lowagie.text.Image.getInstance(pdfContentByte0, image1, (float) 8);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        int i0 = com.lowagie.text.Image.ORIGINAL_TIFF;
        assertEquals(5, i0);
    }

    @Test
    void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        byte byte0 = com.lowagie.text.DocWriter.FORWARD;
        assertEquals(byte0, (byte) 47);
    }

    @Test
    void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.lang.String[] str_array10 = new java.lang.String[] { "dc:date", "Identity-V", "convert2pdfp", "widths", "class", "", "Right", "xmp:ModifyDate", "Right", "UnicodeBig" };
        java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str11, str_array10);
        com.lowagie.text.pdf.PdfReader pdfReader13 = null;
        byte[] byte_array18 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1 };
        com.lowagie.text.pdf.PRStream pRStream19 = new com.lowagie.text.pdf.PRStream(pdfReader13, byte_array18);
        com.lowagie.text.pdf.PdfReader pdfReader20 = null;
        byte[] byte_array25 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1 };
        com.lowagie.text.pdf.PRStream pRStream26 = new com.lowagie.text.pdf.PRStream(pdfReader20, byte_array25);
        pRStream19.setData(byte_array25, false, (int) (byte) 100);
        java.lang.String str30 = pRStream19.toString();
        boolean b31 = arraylist_str11.contains((java.lang.Object) str30);
        java.io.Writer writer32 = null;
        try {
            com.lowagie.text.pdf.SimpleBookmark.exportToXML((java.util.List) arraylist_str11, writer32, "hi!", true);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(str_array10);
        assertEquals(true, b12);
        assertNotNull(byte_array18);
        assertNotNull(byte_array25);
        assertEquals("Stream", str30, "'" + str30 + "' != '" + "Stream" + "'");
        assertEquals(false, b31);
    }

    @Test
    void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.lowagie.text.Rectangle rectangle0 = com.lowagie.text.PageSize.A10;
        try {
            rectangle0.setBorderWidthBottom((float) 9);
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        assertNotNull(rectangle0);
    }

    @Test
    void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.awt.color.ICC_Profile iCC_Profile0 = null;
        try {
            com.lowagie.text.pdf.PdfICCBased pdfICCBased1 = new com.lowagie.text.pdf.PdfICCBased(iCC_Profile0);
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (com.lowagie.text.ExceptionConverter e) {
        }
    }

    @Test
    void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        boolean b1 = com.lowagie.text.Utilities.isSurrogateHigh(' ');
        assertEquals(false, b1);
    }

    @Test
    void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        char char0 = com.lowagie.text.pdf.Barcode128.DEL;
        assertEquals('Ã', char0);
    }

    @Test
    void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.util.Properties properties0 = null;
        try {
            com.lowagie.text.Table table1 = com.lowagie.text.factories.ElementFactory.getTable(properties0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.lowagie.text.pdf.PdfReader pdfReader2 = null;
        byte[] byte_array7 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1 };
        com.lowagie.text.pdf.PRStream pRStream8 = new com.lowagie.text.pdf.PRStream(pdfReader2, byte_array7);
        try {
            java.lang.Object[] obj_array9 = com.lowagie.text.pdf.BaseFont.getAllFontNames("bordercolor", "Times-Roman", byte_array7);
            fail("Expected exception of type com.lowagie.text.DocumentException");
        } catch (com.lowagie.text.DocumentException e) {
        }
        assertNotNull(byte_array7);
    }

    @Test
    void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TILINGTYPE;
        assertNotNull(pdfName0);
    }

    @Test
    void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        try {
            com.lowagie.text.pdf.PdfAppearance pdfAppearance3 = com.lowagie.text.pdf.PdfAppearance.createAppearance(pdfWriter0, (float) (byte) 0, (float) (byte) 47);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        int i0 = com.lowagie.text.pdf.parser.Matrix.I11;
        assertEquals(0, i0);
    }

    @Test
    void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.lowagie.text.xml.simpleparser.SimpleXMLDocHandler simpleXMLDocHandler0 = null;
        com.lowagie.text.xml.simpleparser.SimpleXMLDocHandlerComment simpleXMLDocHandlerComment1 = null;
        java.io.Reader reader2 = null;
        try {
            com.lowagie.text.xml.simpleparser.SimpleXMLParser.parse(simpleXMLDocHandler0, simpleXMLDocHandlerComment1, reader2, true);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.lang.String str0 = com.lowagie.text.html.Markup.CSS_VALUE_UNDERLINE;
        assertEquals("underline", str0, "'" + str0 + "' != '" + "underline" + "'");
    }

    @Test
    void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.lowagie.text.pdf.PdfBoolean pdfBoolean1 = new com.lowagie.text.pdf.PdfBoolean(true);
    }

    @Test
    void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.lang.String str0 = com.lowagie.text.html.Markup.CSS_VALUE_ALWAYS;
        assertEquals("always", str0, "'" + str0 + "' != '" + "always" + "'");
    }

    @Test
    void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.lang.String[] str_array10 = new java.lang.String[] { "text-align", "listitem", "listitem", "listitem", "listitem", "hi!", "HeiseiKakuGo-W5", "UnicodeBig", "hi!", "xmp:Nickname" };
        java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str11, str_array10);
        java.util.stream.Stream<java.lang.String> stream_str13 = arraylist_str11.parallelStream();
        java.util.stream.Stream<java.lang.String> stream_str14 = arraylist_str11.parallelStream();
        assertNotNull(str_array10);
        assertEquals(true, b12);
        assertNotNull(stream_str13);
        assertNotNull(stream_str14);
    }

    @Test
    void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        byte[] byte_array5 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1 };
        com.lowagie.text.pdf.PRStream pRStream6 = new com.lowagie.text.pdf.PRStream(pdfReader0, byte_array5);
        try {
            com.lowagie.text.Jpeg2000 jpeg2000_7 = new com.lowagie.text.Jpeg2000(byte_array5);
            fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        assertNotNull(byte_array5);
    }

    @Test
    void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.lang.String str0 = com.lowagie.text.ElementTags.CREATIONDATE;
        assertEquals("creationdate", str0, "'" + str0 + "' != '" + "creationdate" + "'");
    }

    @Test
    void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.lowagie.text.pdf.PdfWriter.PdfBody.PdfCrossReference pdfCrossReference2 = new com.lowagie.text.pdf.PdfWriter.PdfBody.PdfCrossReference(29, (int) (short) 1);
    }

    @Test
    void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.lowagie.text.pdf.PdfStructureElement pdfStructureElement0 = null;
        com.lowagie.text.pdf.PdfName pdfName1 = com.lowagie.text.pdf.PdfName.REFERENCE;
        try {
            com.lowagie.text.pdf.PdfStructureElement pdfStructureElement2 = new com.lowagie.text.pdf.PdfStructureElement(pdfStructureElement0, pdfName1);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfName1);
    }

    @Test
    void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        int i0 = com.lowagie.text.Image.MIDDLE;
        assertEquals(1, i0);
    }

    @Test
    void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.lang.String str0 = com.lowagie.text.Chunk.SKEW;
        assertEquals("SKEW", str0, "'" + str0 + "' != '" + "SKEW" + "'");
    }

    @Test
    void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        int i0 = com.lowagie.text.pdf.collection.PdfCollection.DETAILS;
        assertEquals(0, i0);
    }

    @Test
    void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        int i0 = com.lowagie.text.pdf.BaseFont.DESCENT;
        assertEquals(3, i0);
    }

    @Test
    void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.FRM;
        assertNotNull(pdfName0);
    }

    @Test
    void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TIMES_BOLD;
        assertNotNull(pdfName0);
    }

    @Test
    void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.lang.String str0 = com.lowagie.text.xml.xmp.XmpBasicSchema.IDENTIFIER;
        assertEquals("xmp:Identifier", str0, "'" + str0 + "' != '" + "xmp:Identifier" + "'");
    }

    @Test
    void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.lowagie.text.Rectangle rectangle0 = com.lowagie.text.PageSize.LARGE_CROWN_QUARTO;
        assertNotNull(rectangle0);
    }

    @Test
    void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        int i0 = com.lowagie.text.Element.ALIGN_BOTTOM;
        assertEquals(6, i0);
    }

    @Test
    void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.HALIGN;
        assertNotNull(pdfName0);
    }

    @Test
    void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        int i0 = com.lowagie.text.pdf.PdfPTable.BACKGROUNDCANVAS;
        assertEquals(1, i0);
    }

    @Test
    void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        float f0 = com.lowagie.text.pdf.BaseField.BORDER_WIDTH_THIN;
        assertEquals(1.0f, f0);
    }

    @Test
    void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        char char0 = com.lowagie.text.pdf.PdfWriter.VERSION_1_4;
        assertEquals('4', char0);
    }

    @Test
    void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.lang.String[] str_array10 = new java.lang.String[] { "dc:date", "Identity-V", "convert2pdfp", "widths", "class", "", "Right", "xmp:ModifyDate", "Right", "UnicodeBig" };
        java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str11, str_array10);
        com.lowagie.text.pdf.PdfReader pdfReader13 = null;
        byte[] byte_array18 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1 };
        com.lowagie.text.pdf.PRStream pRStream19 = new com.lowagie.text.pdf.PRStream(pdfReader13, byte_array18);
        com.lowagie.text.pdf.PdfReader pdfReader20 = null;
        byte[] byte_array25 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1 };
        com.lowagie.text.pdf.PRStream pRStream26 = new com.lowagie.text.pdf.PRStream(pdfReader20, byte_array25);
        pRStream19.setData(byte_array25, false, (int) (byte) 100);
        java.lang.String str30 = pRStream19.toString();
        boolean b31 = arraylist_str11.contains((java.lang.Object) str30);
        try {
            java.util.List<java.lang.String> list_str34 = arraylist_str11.subList(32, (int) (byte) 47);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        assertNotNull(str_array10);
        assertEquals(true, b12);
        assertNotNull(byte_array18);
        assertNotNull(byte_array25);
        assertEquals("Stream", str30, "'" + str30 + "' != '" + "Stream" + "'");
        assertEquals(false, b31);
    }

    @Test
    void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.lowagie.text.pdf.PdfOutline pdfOutline0 = null;
        com.lowagie.text.pdf.PdfDestination pdfDestination1 = null;
        com.lowagie.text.Font font3 = null;
        com.lowagie.text.Footnote footnote4 = new com.lowagie.text.Footnote("", font3);
        com.lowagie.text.HeaderFooter headerFooter6 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote4, true);
        headerFooter6.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph9 = headerFooter6.paragraph();
        try {
            com.lowagie.text.pdf.PdfOutline pdfOutline10 = new com.lowagie.text.pdf.PdfOutline(pdfOutline0, pdfDestination1, paragraph9);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(paragraph9);
    }

    @Test
    void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.lang.String str0 = com.lowagie.text.xml.xmp.XmpMMSchema.MANAGEUI;
        assertEquals("xmpMM:ManageUI", str0, "'" + str0 + "' != '" + "xmpMM:ManageUI" + "'");
    }

    @Test
    void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfWriter.DID_SAVE;
        assertNotNull(pdfName0);
    }

    @Test
    void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.HIDEMENUBAR;
        assertNotNull(pdfName0);
    }

    @Test
    void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.FORMTYPE;
        assertNotNull(pdfName0);
    }

    @Test
    void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.lang.String str0 = com.lowagie.text.pdf.PdfBoolean.FALSE;
        assertEquals("false", str0, "'" + str0 + "' != '" + "false" + "'");
    }

    @Test
    void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        boolean b1 = com.lowagie.text.pdf.PdfEncryptor.isScreenReadersAllowed(5);
        assertEquals(false, b1);
    }

    @Test
    void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        int i0 = com.lowagie.text.pdf.PdfTemplate.TYPE_IMPORTED;
        assertEquals(2, i0);
    }

    @Test
    void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        byte[] byte_array2 = new byte[] { (byte) 100, (byte) 10 };
        com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray3 = new com.lowagie.text.pdf.RandomAccessFileOrArray(byte_array2);
        try {
            long long4 = randomAccessFileOrArray3.readUnsignedIntLE();
            fail("Expected exception of type java.io.EOFException");
        } catch (java.io.EOFException e) {
        }
        assertNotNull(byte_array2);
    }

    @Test
    void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        int i0 = com.lowagie.text.Annotation.FILE_DEST;
        assertEquals(3, i0);
    }

    @Test
    void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        int i0 = com.lowagie.text.pdf.ArabicLigaturizer.ar_composedtashkeel;
        assertEquals(4, i0);
    }

    @Test
    void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.EXPORT;
        assertNotNull(pdfName0);
    }

    @Test
    void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PRINTPAGERANGE;
        assertNotNull(pdfName0);
    }

    @Test
    void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.XOBJECT;
        assertNotNull(pdfName0);
    }

    @Test
    void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        com.lowagie.text.pdf.ColumnText columnText0 = null;
        try {
            float f5 = com.lowagie.text.pdf.PdfPRow.setColumn(columnText0, 100.0f, (float) 1, (float) '#', (float) 16);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_REALIZEPALETTE;
        assertEquals(53, i0);
    }

    @Test
    void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        int i0 = com.lowagie.text.pdf.PdfFormField.FF_EDIT;
        assertEquals(262144, i0);
    }

    @Test
    void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        int i0 = com.lowagie.text.pdf.PRTokeniser.TK_START_DIC;
        assertEquals(7, i0);
    }

    @Test
    void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        com.lowagie.text.FontFactoryImp fontFactoryImp0 = null;
        try {
            com.lowagie.text.FontFactory.setFontImp(fontFactoryImp0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        int i0 = com.lowagie.text.Element.MARKED;
        assertEquals(50, i0);
    }

    @Test
    void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.util.Optional<com.lowagie.text.alignment.HorizontalAlignment> optional_horizontalAlignment1 = com.lowagie.text.alignment.HorizontalAlignment.of((int) '#');
        assertNotNull(optional_horizontalAlignment1);
    }

    @Test
    void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.lang.String str0 = com.lowagie.text.ElementTags.HORIZONTALALIGN;
        assertEquals("horizontalalign", str0, "'" + str0 + "' != '" + "horizontalalign" + "'");
    }

    @Test
    void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        byte[] byte_array3 = new byte[] { (byte) -1, (byte) 1 };
        byte[] byte_array6 = new byte[] { (byte) -1, (byte) 1 };
        byte[] byte_array9 = new byte[] { (byte) -1, (byte) 1 };
        byte[] byte_array12 = new byte[] { (byte) -1, (byte) 1 };
        byte[][] byte_array_array13 = new byte[][] { byte_array3, byte_array6, byte_array9, byte_array12 };
        try {
            com.lowagie.text.pdf.PdfEncodings.loadCmap("creationdate", byte_array_array13);
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (com.lowagie.text.ExceptionConverter e) {
        }
        assertNotNull(byte_array3);
        assertNotNull(byte_array6);
        assertNotNull(byte_array9);
        assertNotNull(byte_array12);
        assertNotNull(byte_array_array13);
    }

    @Test
    void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        int i0 = com.lowagie.text.pdf.PdfAnnotation.MARKUP_SQUIGGLY;
        assertEquals(3, i0);
    }

    @Test
    void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        int i0 = com.lowagie.text.pdf.ArabicLigaturizer.DIGIT_TYPE_AN_EXTENDED;
        assertEquals(256, i0);
    }

    @Test
    void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        byte[] byte_array5 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1 };
        com.lowagie.text.pdf.PRStream pRStream6 = new com.lowagie.text.pdf.PRStream(pdfReader0, byte_array5);
        try {
            byte[] byte_array7 = com.lowagie.text.pdf.PdfReader.getStreamBytes(pRStream6);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(byte_array5);
    }

    @Test
    void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        com.lowagie.text.pdf.hyphenation.TernaryTree ternaryTree0 = null;
        try {
            com.lowagie.text.pdf.hyphenation.TernaryTree.Iterator iterator1 = ternaryTree0.new Iterator();
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        com.lowagie.text.alignment.VerticalAlignment verticalAlignment0 = com.lowagie.text.alignment.VerticalAlignment.CENTER;
        assertEquals(verticalAlignment0, VerticalAlignment.CENTER, "'" + verticalAlignment0 + "' != '" + VerticalAlignment.CENTER + "'");
    }

    @Test
    void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ISMAP;
        assertNotNull(pdfName0);
    }

    @Test
    void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.lang.String str0 = com.lowagie.text.html.Markup.HTML_ATTR_REL;
        assertEquals("rel", str0, "'" + str0 + "' != '" + "rel" + "'");
    }

    @Test
    void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        com.lowagie.text.Rectangle rectangle0 = com.lowagie.text.PageSize.B9;
        assertNotNull(rectangle0);
    }

    @Test
    void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.XML;
        assertNotNull(pdfName0);
    }

    @Test
    void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.Font font2 = null;
        com.lowagie.text.Footnote footnote3 = new com.lowagie.text.Footnote("", font2);
        com.lowagie.text.HeaderFooter headerFooter5 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote3, true);
        headerFooter5.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle8 = headerFooter5.rotate();
        float[][] f_array_array10 = new float[][] {};
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation11 = com.lowagie.text.pdf.PdfAnnotation.createInk(pdfWriter0, (com.lowagie.text.Rectangle) headerFooter5, "widths", f_array_array10);
        com.lowagie.text.pdf.PdfWriter pdfWriter12 = null;
        com.lowagie.text.Font font14 = null;
        com.lowagie.text.Footnote footnote15 = new com.lowagie.text.Footnote("", font14);
        com.lowagie.text.HeaderFooter headerFooter17 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote15, true);
        headerFooter17.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle20 = headerFooter17.rotate();
        float[][] f_array_array22 = new float[][] {};
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation23 = com.lowagie.text.pdf.PdfAnnotation.createInk(pdfWriter12, (com.lowagie.text.Rectangle) headerFooter17, "widths", f_array_array22);
        try {
            pdfAnnotation11.setPopup(pdfAnnotation23);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(rectangle8);
        assertNotNull(f_array_array10);
        assertNotNull(pdfAnnotation11);
        assertNotNull(rectangle20);
        assertNotNull(f_array_array22);
        assertNotNull(pdfAnnotation23);
    }

    @Test
    void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.EXPORTSTATE;
        assertNotNull(pdfName0);
    }

    @Test
    void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        com.lowagie.text.pdf.PdfTemplate pdfTemplate0 = null;
        try {
            com.lowagie.text.ImgTemplate imgTemplate1 = new com.lowagie.text.ImgTemplate(pdfTemplate0);
            fail("Expected exception of type com.lowagie.text.BadElementException");
        } catch (com.lowagie.text.BadElementException e) {
        }
    }

    @Test
    void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        com.lowagie.text.pdf.XfaForm xfaForm0 = null;
        com.lowagie.text.pdf.PdfReader pdfReader1 = null;
        com.lowagie.text.pdf.PdfWriter pdfWriter2 = null;
        try {
            com.lowagie.text.pdf.XfaForm.setXfa(xfaForm0, pdfReader1, pdfWriter2);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.lowagie.text.Rectangle rectangle0 = com.lowagie.text.PageSize.LETTER;
        assertNotNull(rectangle0);
    }

    @Test
    void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.Font font2 = null;
        com.lowagie.text.Footnote footnote3 = new com.lowagie.text.Footnote("", font2);
        com.lowagie.text.HeaderFooter headerFooter5 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote3, true);
        headerFooter5.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle8 = headerFooter5.rotate();
        float[] f_array13 = new float[] { 6, 9 };
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation14 = com.lowagie.text.pdf.PdfAnnotation.createMarkup(pdfWriter0, rectangle8, "Stream", 3, f_array13);
        try {
            com.lowagie.text.pdf.PdfAction pdfAction16 = com.lowagie.text.pdf.PdfAction.createHide(pdfAnnotation14, false);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(rectangle8);
        assertNotNull(f_array13);
        assertNotNull(pdfAnnotation14);
    }

    @Test
    void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.USERUNIT;
        assertNotNull(pdfName0);
    }

    @Test
    void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.lang.String str0 = com.lowagie.text.pdf.BaseFont.HELVETICA_OBLIQUE;
        assertEquals("Helvetica-Oblique", str0, "'" + str0 + "' != '" + "Helvetica-Oblique" + "'");
    }

    @Test
    void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.COORDS;
        assertNotNull(pdfName0);
    }

    @Test
    void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.lang.String str0 = com.lowagie.text.xml.xmp.XmpWriter.UTF16;
        assertEquals("UTF-16", str0, "'" + str0 + "' != '" + "UTF-16" + "'");
    }

    @Test
    void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        int i0 = com.lowagie.text.pdf.BaseFont.AWT_DESCENT;
        assertEquals(10, i0);
    }

    @Test
    void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_SETTEXTALIGN;
        assertEquals(302, i0);
    }

    @Test
    void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        int i2 = com.lowagie.text.Utilities.convertToUtf32("face", 0);
        assertEquals(i2, (-56509343));
    }

    @Test
    void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.lang.String str0 = com.lowagie.text.html.Markup.CSS_VALUE_NONE;
        assertEquals("none", str0, "'" + str0 + "' != '" + "none" + "'");
    }

    @Test
    void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier0 = com.lowagie.text.pdf.PdfPKCS7.X509Name.CN;
        assertNotNull(aSN1ObjectIdentifier0);
    }

    @Test
    void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        float f1 = com.lowagie.text.Utilities.millimetersToPoints((float) 8);
        assertEquals(22.677166f, f1);
    }

    @Test
    void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        boolean b1 = com.lowagie.text.pdf.PdfEncryptor.isCopyAllowed(0);
        assertEquals(false, b1);
    }

    @Test
    void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        int i0 = com.lowagie.text.Font.BOLDITALIC;
        assertEquals(3, i0);
    }

    @Test
    void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        java.lang.String str0 = com.lowagie.text.Annotation.OPERATION;
        assertEquals("operation", str0, "'" + str0 + "' != '" + "operation" + "'");
    }

    @Test
    void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.CAPHEIGHT;
        assertNotNull(pdfName0);
    }

    @Test
    void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        java.lang.String str0 = com.lowagie.text.pdf.AsianFontMapper.ChineseSimplifiedFont;
        assertEquals("STSong-Light", str0, "'" + str0 + "' != '" + "STSong-Light" + "'");
    }

    @Test
    void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        int i0 = com.lowagie.text.pdf.PdfEncryption.STANDARD_ENCRYPTION_40;
        assertEquals(2, i0);
    }

    @Test
    void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        java.lang.String str0 = com.lowagie.text.html.Markup.CSS_KEY_TEXTDECORATION;
        assertEquals("text-decoration", str0, "'" + str0 + "' != '" + "text-decoration" + "'");
    }

    @Test
    void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfSignatureAppearance.WINCER_SIGNED;
        assertNotNull(pdfName0);
    }

    @Test
    void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        int i0 = com.lowagie.text.Element.JBIG2;
        assertEquals(36, i0);
    }

    @Test
    void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        java.lang.String str0 = com.lowagie.text.xml.xmp.XmpBasicSchema.BASEURL;
        assertEquals("xmp:BaseURL", str0, "'" + str0 + "' != '" + "xmp:BaseURL" + "'");
    }

    @Test
    void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        com.lowagie.text.pdf.BaseFont baseFont0 = null;
        com.lowagie.text.Font font3 = new com.lowagie.text.Font(baseFont0, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont5 = font3.getCalculatedBaseFont(false);
        boolean b8 = baseFont5.setCharAdvance(9, 0);
        float f11 = baseFont5.getWidthPoint(7, (float) (short) 10);
        assertNotNull(baseFont5);
        assertEquals(true, b8);
        assertEquals(0.0f, f11);
    }

    @Test
    void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        java.util.Set set0 = com.lowagie.text.FontFactory.getRegisteredFamilies();
        assertNotNull(set0);
    }

    @Test
    void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        java.nio.ByteBuffer byteBuffer0 = null;
        boolean b1 = com.lowagie.text.pdf.MappedRandomAccessFile.clean(byteBuffer0);
        assertEquals(false, b1);
    }

    @Test
    void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        int i0 = com.lowagie.text.pdf.BarcodeDatamatrix.DM_NO_ERROR;
        assertEquals(0, i0);
    }

    @Test
    void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        try {
            java.awt.Color color1 = com.lowagie.text.html.WebColors.getRGBColor("none");
            fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        java.util.Properties properties0 = null;
        try {
            com.lowagie.text.Cell cell1 = com.lowagie.text.factories.ElementFactory.getCell(properties0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        java.lang.String str1 = com.lowagie.text.pdf.PdfEncryptor.getPermissionsVerbose(10);
        assertEquals("Allowed: Modify contents", str1, "'" + str1 + "' != '" + "Allowed: Modify contents" + "'");
    }

    @Test
    void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaBrush.HS_VERTICAL;
        assertEquals(1, i0);
    }

    @Test
    void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.HELV;
        assertNotNull(pdfName0);
    }

    @Test
    void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.COLORSPACE;
        assertNotNull(pdfName0);
    }

    @Test
    void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        com.lowagie.text.FontFactory.defaultEmbedding = true;
    }

    @Test
    void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        int i0 = com.lowagie.text.pdf.BaseFont.FONT_TYPE_DOCUMENT;
        assertEquals(4, i0);
    }

    @Test
    void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        int i0 = com.lowagie.text.Footnote.TEXT;
        assertEquals(0, i0);
    }

    @Test
    void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.FS;
        assertNotNull(pdfName0);
    }

    @Test
    void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_SETMAPMODE;
        assertEquals(259, i0);
    }

    @Test
    void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.OCGS;
        assertNotNull(pdfName0);
    }

    @Test
    void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        int i0 = com.lowagie.text.pdf.PdfWriter.SIGNATURE_EXISTS;
        assertEquals(1, i0);
    }

    @Test
    void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        int i0 = com.lowagie.text.pdf.RadioCheckField.TYPE_DIAMOND;
        assertEquals(4, i0);
    }

    @Test
    void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        int i0 = com.lowagie.text.Jpeg.NOPARAM_MARKER;
        assertEquals(2, i0);
    }

    @Test
    void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        byte[] byte_array2 = new byte[] { (byte) -1, (byte) 0 };
        com.lowagie.text.pdf.PdfEFStream pdfEFStream3 = new com.lowagie.text.pdf.PdfEFStream(byte_array2);
        com.lowagie.text.pdf.PdfReader pdfReader4 = null;
        byte[] byte_array9 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1 };
        com.lowagie.text.pdf.PRStream pRStream10 = new com.lowagie.text.pdf.PRStream(pdfReader4, byte_array9);
        com.lowagie.text.pdf.PdfReader pdfReader11 = null;
        byte[] byte_array16 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1 };
        com.lowagie.text.pdf.PRStream pRStream17 = new com.lowagie.text.pdf.PRStream(pdfReader11, byte_array16);
        pRStream10.setData(byte_array16, false, (int) (byte) 100);
        try {
            com.lowagie.text.pdf.PdfPKCS7 pdfPKCS7_22 = new com.lowagie.text.pdf.PdfPKCS7(byte_array2, byte_array16, "grayfill");
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (com.lowagie.text.ExceptionConverter e) {
        }
        assertNotNull(byte_array2);
        assertNotNull(byte_array9);
        assertNotNull(byte_array16);
    }

    @Test
    void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        com.lowagie.text.Rectangle rectangle0 = com.lowagie.text.PageSize.PENGUIN_LARGE_PAPERBACK;
        float f1 = rectangle0.getHeight();
        try {
            rectangle0.setRight((float) 262144);
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        assertNotNull(rectangle0);
        assertEquals(561.0f, f1);
    }

    @Test
    void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.FIGURE;
        assertNotNull(pdfName0);
    }

    @Test
    void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TIMES_BOLDITALIC;
        assertNotNull(pdfName0);
    }

    @Test
    void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        int i0 = com.lowagie.text.Element.ALIGN_RIGHT;
        assertEquals(2, i0);
    }

    @Test
    void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        java.lang.String str0 = com.lowagie.text.ElementTags.ITEXT;
        assertEquals("itext", str0, "'" + str0 + "' != '" + "itext" + "'");
    }

    @Test
    void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        com.lowagie.text.Phrase phrase1 = new com.lowagie.text.Phrase("border-bottom-width");
        try {
            boolean b3 = phrase1.add((java.lang.Object) 30);
            fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @Test
    void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        int i0 = com.lowagie.text.pdf.PdfTransition.LRGLITTER;
        assertEquals(14, i0);
    }

    @Test
    void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        java.lang.String str0 = com.lowagie.text.html.Markup.CSS_VALUE_BLOCK;
        assertEquals("block", str0, "'" + str0 + "' != '" + "block" + "'");
    }

    @Test
    void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.MAXLEN;
        assertNotNull(pdfName0);
    }

    @Test
    void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.FIT;
        boolean b1 = pdfName0.isDictionary();
        assertNotNull(pdfName0);
        assertEquals(false, b1);
    }

    @Test
    void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        com.lowagie.text.pdf.PdfDashPattern pdfDashPattern2 = new com.lowagie.text.pdf.PdfDashPattern((float) 0L, (float) 8);
        com.lowagie.text.pdf.PdfName pdfName4 = com.lowagie.text.pdf.PdfName.JBIG2DECODE;
        try {
            com.lowagie.text.pdf.PdfObject pdfObject5 = pdfDashPattern2.set(16, (com.lowagie.text.pdf.PdfObject) pdfName4);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        assertNotNull(pdfName4);
    }

    @Test
    void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier0 = com.lowagie.text.pdf.PdfPKCS7.X509Name.UID;
        assertNotNull(aSN1ObjectIdentifier0);
    }

    @Test
    void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        char char0 = com.lowagie.text.pdf.Barcode128.SHIFT;
        assertEquals('Æ', char0);
    }

    @Test
    void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        java.lang.String str0 = com.lowagie.text.ElementTags.ENCODING;
        assertEquals("encoding", str0, "'" + str0 + "' != '" + "encoding" + "'");
    }

    @Test
    void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        java.lang.String str0 = com.lowagie.text.FontFactory.COURIER_OBLIQUE;
        assertEquals("Courier-Oblique", str0, "'" + str0 + "' != '" + "Courier-Oblique" + "'");
    }

    @Test
    void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        com.lowagie.text.pdf.PdfReader pdfReader1 = null;
        byte[] byte_array6 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1 };
        com.lowagie.text.pdf.PRStream pRStream7 = new com.lowagie.text.pdf.PRStream(pdfReader1, byte_array6);
        com.lowagie.text.pdf.PdfReader pdfReader8 = null;
        byte[] byte_array13 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1 };
        com.lowagie.text.pdf.PRStream pRStream14 = new com.lowagie.text.pdf.PRStream(pdfReader8, byte_array13);
        pRStream7.setData(byte_array13, false, (int) (byte) 100);
        try {
            java.lang.String str20 = com.lowagie.text.pdf.PdfEncodings.convertCmap("", byte_array13, 2, 8);
            fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        assertNotNull(byte_array6);
        assertNotNull(byte_array13);
    }

    @Test
    void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        java.lang.String str0 = com.lowagie.text.html.Markup.HTML_ATTR_TYPE;
        assertEquals("type", str0, "'" + str0 + "' != '" + "type" + "'");
    }

    @Test
    void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        com.lowagie.text.Font font1 = null;
        com.lowagie.text.Footnote footnote2 = new com.lowagie.text.Footnote("", font1);
        com.lowagie.text.HeaderFooter headerFooter4 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote2, true);
        headerFooter4.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph7 = headerFooter4.paragraph();
        float f8 = paragraph7.spacingAfter();
        try {
            float f9 = com.lowagie.text.pdf.ColumnText.getWidth((com.lowagie.text.Phrase) paragraph7);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(paragraph7);
        assertEquals(0.0f, f8);
    }

    @Test
    void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        java.lang.String str0 = com.lowagie.text.ElementTags.IMAGE;
        assertEquals("image", str0, "'" + str0 + "' != '" + "image" + "'");
    }

    @Test
    void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        java.util.HashMap hashMap0 = null;
        com.lowagie.text.pdf.PdfWriter pdfWriter1 = null;
        try {
            com.lowagie.text.pdf.PdfDictionary pdfDictionary2 = com.lowagie.text.pdf.SimpleNamedDestination.outputNamedDestinationAsStrings(hashMap0, pdfWriter1);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        char char0 = com.lowagie.text.pdf.Barcode128.STARTA;
        assertEquals('Ë', char0);
    }

    @Test
    void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.POSITION;
        assertNotNull(pdfName0);
    }

    @Test
    void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfIndirectReference pdfIndirectReference1 = null;
        com.lowagie.text.Font font3 = null;
        com.lowagie.text.Footnote footnote4 = new com.lowagie.text.Footnote("", font3);
        try {
            java.lang.Object[] obj_array6 = com.lowagie.text.pdf.SimpleBookmark.iterateOutlines(pdfWriter0, pdfIndirectReference1, (java.util.List) footnote4, true);
            fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier0 = com.lowagie.text.pdf.PdfPKCS7.X509Name.GIVENNAME;
        assertNotNull(aSN1ObjectIdentifier0);
    }

    @Test
    void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS pPKMS3 = new com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS();
        com.lowagie.text.Font font5 = null;
        com.lowagie.text.Footnote footnote6 = new com.lowagie.text.Footnote("", font5);
        int[] i_array11 = new int[] { (short) 1, 1785737760, 8, 100 };
        com.lowagie.text.pdf.SimpleBookmark.eliminatePages((java.util.List) footnote6, i_array11);
        pPKMS3.setByteRange(i_array11);
        try {
            pdfPTable1.setWidths(i_array11);
            fail("Expected exception of type com.lowagie.text.DocumentException");
        } catch (com.lowagie.text.DocumentException e) {
        }
        assertNotNull(pdfPCell2);
        assertNotNull(i_array11);
    }

    @Test
    void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        java.lang.String str1 = com.lowagie.text.factories.RomanNumberFactory.getUpperCaseString(3);
        assertEquals("III", str1, "'" + str1 + "' != '" + "III" + "'");
    }

    @Test
    void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaState.TA_BOTTOM;
        assertEquals(8, i0);
    }

    @Test
    void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        int i0 = com.lowagie.text.pdf.PdfPageLabels.EMPTY;
        assertEquals(5, i0);
    }

    @Test
    void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        int i0 = com.lowagie.text.pdf.PdfObject.INDIRECT;
        assertEquals(10, i0);
    }

    @Test
    void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        int i0 = com.lowagie.text.pdf.PdfEncryption.AES_128;
        assertEquals(4, i0);
    }

    @Test
    void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.T;
        assertNotNull(pdfName0);
    }

    @Test
    void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        int i0 = com.lowagie.text.pdf.BaseField.HIDDEN_BUT_PRINTABLE;
        assertEquals(3, i0);
    }

    @Test
    void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        java.lang.String str0 = com.lowagie.text.xml.xmp.XmpMMSchema.VERSIONID;
        assertEquals("xmpMM:VersionID", str0, "'" + str0 + "' != '" + "xmpMM:VersionID" + "'");
    }

    @Test
    void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        java.lang.String str0 = com.lowagie.text.Footnote.PAGE;
        assertEquals("page", str0, "'" + str0 + "' != '" + "page" + "'");
    }

    @Test
    void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        java.lang.String str0 = com.lowagie.text.Annotation.TITLE;
        assertEquals("title", str0, "'" + str0 + "' != '" + "title" + "'");
    }

    @Test
    void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        com.lowagie.text.pdf.parser.PdfTextExtractor pdfTextExtractor2 = new com.lowagie.text.pdf.parser.PdfTextExtractor(pdfReader0, false);
        try {
            java.lang.String str5 = pdfTextExtractor2.getTextFromPage((int) (byte) -1, false);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        byte[] byte_array2 = new byte[] { (byte) -1, (byte) 0 };
        com.lowagie.text.pdf.PdfEFStream pdfEFStream3 = new com.lowagie.text.pdf.PdfEFStream(byte_array2);
        try {
            com.lowagie.text.Image image4 = com.lowagie.text.Image.getInstance(byte_array2);
            fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        assertNotNull(byte_array2);
    }

    @Test
    void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        com.lowagie.text.pdf.PdfEncryption pdfEncryption0 = null;
        try {
            com.lowagie.text.pdf.PdfEncryption pdfEncryption1 = new com.lowagie.text.pdf.PdfEncryption(pdfEncryption0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        byte byte0 = com.lowagie.text.DocWriter.LT;
        assertEquals(byte0, (byte) 60);
    }

    @Test
    void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ROWS;
        assertNotNull(pdfName0);
    }

    @Test
    void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        int i0 = com.lowagie.text.pdf.PdfAnnotation.MARKUP_STRIKEOUT;
        assertEquals(2, i0);
    }

    @Test
    void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.NUMS;
        assertNotNull(pdfName0);
    }

    @Test
    void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        com.lowagie.text.pdf.PdfNumberTree pdfNumberTree0 = new com.lowagie.text.pdf.PdfNumberTree();
    }

    @Test
    void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        java.util.Properties properties0 = null;
        try {
            com.lowagie.text.List list1 = com.lowagie.text.factories.ElementFactory.getList(properties0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        int i0 = com.lowagie.text.Jpeg2000.JP2_URL;
        assertEquals(1970433056, i0);
    }

    @Test
    void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        try {
            com.lowagie.text.pdf.PdfLayerMembership pdfLayerMembership1 = new com.lowagie.text.pdf.PdfLayerMembership(pdfWriter0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        int[] i_array1 = com.lowagie.text.pdf.GlyphList.nameToUnicode("text-align");
        assertNull(i_array1);
    }

    @Test
    void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaPen.PS_NULL;
        assertEquals(5, i0);
    }

    @Test
    void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.NEXT;
        assertNotNull(pdfName0);
    }

    @Test
    void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        com.lowagie.text.Document document0 = null;
        java.io.OutputStream outputStream1 = null;
        com.lowagie.text.DocListener docListener2 = null;
        try {
            com.lowagie.text.pdf.PdfWriter pdfWriter3 = com.lowagie.text.pdf.PdfWriter.getInstance(document0, outputStream1, docListener2);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PRINTSTATE;
        assertNotNull(pdfName0);
    }

    @Test
    void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        int i0 = com.lowagie.text.Image.ORIGINAL_GIF;
        assertEquals(3, i0);
    }

    @Test
    void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        java.lang.String str0 = com.lowagie.text.Annotation.NAMED;
        assertEquals("named", str0, "'" + str0 + "' != '" + "named" + "'");
    }

    @Test
    void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        java.lang.String str0 = com.lowagie.text.ElementTags.ALIGN_INDENTATION_ITEMS;
        assertEquals("alignindent", str0, "'" + str0 + "' != '" + "alignindent" + "'");
    }

    @Test
    void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        java.lang.String str0 = com.lowagie.text.pdf.BaseFont.TIMES_BOLD;
        assertEquals("Times-Bold", str0, "'" + str0 + "' != '" + "Times-Bold" + "'");
    }

    @Test
    void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TA;
        assertNotNull(pdfName0);
    }

    @Test
    void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        com.lowagie.text.Chapter chapter1 = new com.lowagie.text.Chapter((int) (short) -1);
        java.io.Writer writer2 = null;
        try {
            com.lowagie.text.pdf.SimpleBookmark.exportToXML((java.util.List) chapter1, writer2, "hi!", false);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        java.util.Calendar calendar1 = com.lowagie.text.pdf.PdfDate.decode("horizontalalign");
        assertNull(calendar1);
    }

    @Test
    void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        int i0 = com.lowagie.text.pdf.PdfWriter.AllowModifyContents;
        assertEquals(8, i0);
    }

    @Test
    void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        java.lang.String str0 = com.lowagie.text.FontFactory.HELVETICA_BOLD;
        assertEquals("Helvetica-Bold", str0, "'" + str0 + "' != '" + "Helvetica-Bold" + "'");
    }

    @Test
    void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        int i0 = com.lowagie.text.pdf.PdfFormField.FF_RADIO;
        assertEquals(32768, i0);
    }

    @Test
    void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.INTERPOLATE;
        assertNotNull(pdfName0);
    }

    @Test
    void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        java.lang.String str0 = com.lowagie.text.ElementTags.ALIGN_JUSTIFIED_ALL;
        assertEquals("JustifyAll", str0, "'" + str0 + "' != '" + "JustifyAll" + "'");
    }

    @Test
    void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        int i0 = com.lowagie.text.pdf.PdfWriter.EMBEDDED_FILES_ONLY;
        assertEquals(24, i0);
    }

    @Test
    void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.SUPPLEMENT;
        assertNotNull(pdfName0);
    }

    @Test
    void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        java.net.URL uRL0 = null;
        try {
            com.lowagie.text.Image image1 = com.lowagie.text.ImageLoader.getBmpImage(uRL0);
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (com.lowagie.text.ExceptionConverter e) {
        }
    }

    @Test
    void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ART;
        assertNotNull(pdfName0);
    }

    @Test
    void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        java.lang.String str0 = com.lowagie.text.ElementTags.FILE;
        assertEquals("file", str0, "'" + str0 + "' != '" + "file" + "'");
    }

    @Test
    void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        com.lowagie.text.Rectangle rectangle5 = new com.lowagie.text.Rectangle((float) 5, (float) 32768, 10.0f, (float) 1L, 256);
    }

    @Test
    void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        int i0 = com.lowagie.text.pdf.PdfAnnotation.MARKUP_HIGHLIGHT;
        assertEquals(0, i0);
    }

    @Test
    void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        int i0 = com.lowagie.text.pdf.PdfAction.SUBMIT_HTML_FORMAT;
        assertEquals(4, i0);
    }

    @Test
    void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PREFERRED;
        assertNotNull(pdfName0);
    }

    @Test
    void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        int i0 = com.lowagie.text.pdf.PdfFormField.MK_NO_ICON;
        assertEquals(0, i0);
    }

    @Test
    void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        com.lowagie.text.pdf.PdfNull pdfNull0 = new com.lowagie.text.pdf.PdfNull();
    }

    @Test
    void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        com.lowagie.text.factories.RomanAlphabetFactory romanAlphabetFactory0 = new com.lowagie.text.factories.RomanAlphabetFactory();
    }

    @Test
    void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        java.lang.String str0 = com.lowagie.text.ElementTags.OPERATION;
        assertEquals("operation", str0, "'" + str0 + "' != '" + "operation" + "'");
    }

    @Test
    void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        com.lowagie.text.pdf.BaseFont baseFont1 = null;
        com.lowagie.text.Font font4 = new com.lowagie.text.Font(baseFont1, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont6 = font4.getCalculatedBaseFont(false);
        font4.setStyle("CV");
        com.lowagie.text.Chunk chunk9 = new com.lowagie.text.Chunk("type", font4);
        assertNotNull(baseFont6);
    }

    @Test
    void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        com.lowagie.text.pdf.PdfReader pdfReader1 = null;
        byte[] byte_array6 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1 };
        com.lowagie.text.pdf.PRStream pRStream7 = new com.lowagie.text.pdf.PRStream(pdfReader1, byte_array6);
        try {
            com.lowagie.text.pdf.PRStream pRStream9 = new com.lowagie.text.pdf.PRStream(pdfReader0, byte_array6, 259);
            fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        assertNotNull(byte_array6);
    }

    @Test
    void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaPen.PS_INSIDEFRAME;
        assertEquals(6, i0);
    }

    @Test
    void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        com.lowagie.text.Font font1 = null;
        com.lowagie.text.Footnote footnote2 = new com.lowagie.text.Footnote("", font1);
        com.lowagie.text.HeaderFooter headerFooter4 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote2, true);
        headerFooter4.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle7 = headerFooter4.rotate();
        int i8 = headerFooter4.alignment();
        assertNotNull(rectangle7);
        assertEquals(0, i8);
    }

    @Test
    void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        com.lowagie.text.Rectangle rectangle0 = com.lowagie.text.PageSize.PENGUIN_LARGE_PAPERBACK;
        rectangle0.setRotation(64);
        try {
            rectangle0.setBorder(50);
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        assertNotNull(rectangle0);
    }

    @Test
    void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        int i0 = com.lowagie.text.pdf.Barcode.UPCA;
        assertEquals(3, i0);
    }

    @Test
    void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PRIVATE;
        assertNotNull(pdfName0);
    }

    @Test
    void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.V2;
        assertNotNull(pdfName0);
    }

    @Test
    void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        java.lang.String[] str_array10 = new java.lang.String[] { "dc:date", "Identity-V", "convert2pdfp", "widths", "class", "", "Right", "xmp:ModifyDate", "Right", "UnicodeBig" };
        java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str11, str_array10);
        com.lowagie.text.pdf.PdfReader pdfReader13 = null;
        byte[] byte_array18 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1 };
        com.lowagie.text.pdf.PRStream pRStream19 = new com.lowagie.text.pdf.PRStream(pdfReader13, byte_array18);
        com.lowagie.text.pdf.PdfReader pdfReader20 = null;
        byte[] byte_array25 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1 };
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
        try {
            com.lowagie.text.pdf.PdfDictionary pdfDictionary52 = pdfArray50.getAsDict(32);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
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
    }

    @Test
    void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.EF;
        assertNotNull(pdfName0);
    }

    @Test
    void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        float f3 = pdfPCell2.getPaddingRight();
        try {
            pdfPCell2.setRunDirection(32);
            fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        assertNotNull(pdfPCell2);
        assertEquals(2.0f, f3);
    }

    @Test
    void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DEFAULTCMYK;
        assertNotNull(pdfName0);
    }

    @Test
    void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_POLYPOLYGON;
        assertEquals(1336, i0);
    }

    @Test
    void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        java.lang.String str0 = com.lowagie.text.Annotation.URX;
        assertEquals("urx", str0, "'" + str0 + "' != '" + "urx" + "'");
    }

    @Test
    void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        java.lang.String str0 = com.lowagie.text.ElementTags.STYLE;
        assertEquals("fontstyle", str0, "'" + str0 + "' != '" + "fontstyle" + "'");
    }

    @Test
    void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_SETVIEWPORTEXT;
        assertEquals(526, i0);
    }

    @Test
    void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        java.lang.String str0 = com.lowagie.text.pdf.BaseFont.HELVETICA_BOLD;
        assertEquals("Helvetica-Bold", str0, "'" + str0 + "' != '" + "Helvetica-Bold" + "'");
    }

    @Test
    void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        int i1 = com.lowagie.text.pdf.BarcodeEAN.calculateEANParity("urx");
        assertEquals(1, i1);
    }

    @Test
    void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        int i0 = com.lowagie.text.pdf.collection.PdfCollection.TILE;
        assertEquals(1, i0);
    }

    @Test
    void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        byte[] byte_array5 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1 };
        com.lowagie.text.pdf.PRStream pRStream6 = new com.lowagie.text.pdf.PRStream(pdfReader0, byte_array5);
        com.lowagie.text.pdf.PdfReader pdfReader7 = null;
        byte[] byte_array12 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1 };
        com.lowagie.text.pdf.PRStream pRStream13 = new com.lowagie.text.pdf.PRStream(pdfReader7, byte_array12);
        pRStream6.setData(byte_array12, false, (int) (byte) 100);
        int[] i_array17 = com.lowagie.text.pdf.PRTokeniser.checkObjectStart(byte_array12);
        try {
            com.lowagie.text.Image image18 = com.lowagie.text.ImageLoader.getJpegImage(byte_array12);
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (com.lowagie.text.ExceptionConverter e) {
        }
        assertNotNull(byte_array5);
        assertNotNull(byte_array12);
        assertNull(i_array17);
    }

    @Test
    void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        java.lang.String str0 = com.lowagie.text.ElementTags.KEEPTOGETHER;
        assertEquals("keeptogether", str0, "'" + str0 + "' != '" + "keeptogether" + "'");
    }

    @Test
    void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        float f3 = pdfPCell2.getPaddingRight();
        pdfPCell2.setBorderWidth((float) ' ');
        assertNotNull(pdfPCell2);
        assertEquals(2.0f, f3);
    }

    @Test
    void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        com.lowagie.text.Document document0 = null;
        java.io.OutputStream outputStream1 = null;
        try {
            com.lowagie.text.pdf.PdfCopy pdfCopy2 = new com.lowagie.text.pdf.PdfCopy(document0, outputStream1);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        try {
            java.util.HashMap hashMap2 = com.lowagie.text.pdf.SimpleNamedDestination.getNamedDestination(pdfReader0, true);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        boolean b0 = com.lowagie.text.SimpleCell.ROW;
        assertEquals(true, b0);
    }

    @Test
    void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        byte[] byte_array1 = com.lowagie.text.pdf.crypto.IVGenerator.getIV(0);
        try {
            com.lowagie.text.Image image2 = com.lowagie.text.ImageLoader.getBmpImage(byte_array1);
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (com.lowagie.text.ExceptionConverter e) {
        }
        assertNotNull(byte_array1);
    }

    @Test
    void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        int i0 = com.lowagie.text.Element.IMGRAW;
        assertEquals(34, i0);
    }

    @Test
    void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DESTS;
        assertNotNull(pdfName0);
    }

    @Test
    void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        int i0 = com.lowagie.text.pdf.PRTokeniser.TK_STRING;
        assertEquals(2, i0);
    }

    @Test
    void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        java.lang.String str0 = com.lowagie.text.ElementTags.BOTTOM;
        assertEquals("bottom", str0, "'" + str0 + "' != '" + "bottom" + "'");
    }

    @Test
    void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfWriter.PAGE_OPEN;
        assertNotNull(pdfName0);
    }

    @Test
    void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        int i0 = com.lowagie.text.Element.HEADER;
        assertEquals(0, i0);
    }

    @Test
    void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        int i0 = com.lowagie.text.Element.TITLE;
        assertEquals(1, i0);
    }

    @Test
    void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_SELECTOBJECT;
        assertEquals(301, i0);
    }

    @Test
    void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PART;
        assertNotNull(pdfName0);
    }

    @Test
    void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DM;
        assertNotNull(pdfName0);
    }

    @Test
    void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        com.lowagie.text.Annotation annotation6 = new com.lowagie.text.Annotation((float) (byte) 100, (float) 'Ë', (float) (byte) 0, (float) (short) 100, "III", 30);
    }

    @Test
    void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        com.lowagie.text.pdf.ArabicLigaturizer arabicLigaturizer0 = new com.lowagie.text.pdf.ArabicLigaturizer();
    }

    @Test
    void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        com.lowagie.text.pdf.parser.Matrix matrix0 = new com.lowagie.text.pdf.parser.Matrix();
    }

    @Test
    void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        java.util.Optional<com.lowagie.text.alignment.HorizontalAlignment> optional_horizontalAlignment1 = com.lowagie.text.alignment.HorizontalAlignment.of((int) '4');
        assertNotNull(optional_horizontalAlignment1);
    }

    @Test
    void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        com.lowagie.text.pdf.parser.PdfContentReaderTool pdfContentReaderTool0 = new com.lowagie.text.pdf.parser.PdfContentReaderTool();
    }

    @Test
    void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        int i0 = com.lowagie.text.Element.CREATOR;
        assertEquals(7, i0);
    }

    @Test
    void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        com.lowagie.text.Rectangle rectangle0 = com.lowagie.text.PageSize.DEMY_OCTAVO;
        assertNotNull(rectangle0);
    }

    @Test
    void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        int i0 = com.lowagie.text.pdf.BarcodeDatamatrix.DM_ERROR_EXTENSION;
        assertEquals(5, i0);
    }

    @Test
    void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        com.lowagie.text.pdf.ColumnText columnText0 = null;
        try {
            com.lowagie.text.pdf.ColumnText columnText1 = com.lowagie.text.pdf.ColumnText.duplicate(columnText0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        com.lowagie.text.pdf.PRIndirectReference pRIndirectReference0 = null;
        try {
            com.lowagie.text.pdf.CMapAwareDocumentFont cMapAwareDocumentFont1 = new com.lowagie.text.pdf.CMapAwareDocumentFont(pRIndirectReference0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        int i0 = com.lowagie.text.Rectangle.BOX;
        assertEquals(15, i0);
    }

    @Test
    void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        com.lowagie.text.pdf.parser.Matrix matrix6 = new com.lowagie.text.pdf.parser.Matrix(0.0f, (float) 100L, (float) '#', (-1.0f), 100.0f, (-1.0f));
        boolean b8 = matrix6.equals((java.lang.Object) 4);
        com.lowagie.text.pdf.parser.Matrix matrix9 = null;
        try {
            com.lowagie.text.pdf.parser.Matrix matrix10 = matrix6.multiply(matrix9);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertEquals(false, b8);
    }

    @Test
    void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        java.lang.String str0 = com.lowagie.text.html.Markup.HTML_ATTR_HEIGHT;
        assertEquals("height", str0, "'" + str0 + "' != '" + "height" + "'");
    }

    @Test
    void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        java.lang.String str0 = com.lowagie.text.xml.xmp.XmpBasicSchema.THUMBNAILS;
        assertEquals("xmp:Thumbnails", str0, "'" + str0 + "' != '" + "xmp:Thumbnails" + "'");
    }

    @Test
    void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.GOTO;
        assertNotNull(pdfName0);
    }

    @Test
    void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DEVICERGB;
        assertNotNull(pdfName0);
    }

    @Test
    void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PRINTCLIP;
        assertNotNull(pdfName0);
    }

    @Test
    void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaState.TA_NOUPDATECP;
        assertEquals(0, i0);
    }

    @Test
    void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.KIDS;
        assertNotNull(pdfName0);
    }

    @Test
    void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        java.lang.String[] str_array10 = new java.lang.String[] { "dc:date", "Identity-V", "convert2pdfp", "widths", "class", "", "Right", "xmp:ModifyDate", "Right", "UnicodeBig" };
        java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str11, str_array10);
        com.lowagie.text.pdf.PdfReader pdfReader13 = null;
        byte[] byte_array18 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1 };
        com.lowagie.text.pdf.PRStream pRStream19 = new com.lowagie.text.pdf.PRStream(pdfReader13, byte_array18);
        com.lowagie.text.pdf.PdfReader pdfReader20 = null;
        byte[] byte_array25 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1 };
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
        try {
            com.lowagie.text.pdf.PdfObject pdfObject52 = pdfArray50.remove(1785737760);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
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
    }

    @Test
    void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        com.lowagie.text.pdf.PdfNumber pdfNumber0 = com.lowagie.text.pdf.PdfPage.INVERTEDPORTRAIT;
        assertNotNull(pdfNumber0);
    }

    @Test
    void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        java.lang.String str0 = com.lowagie.text.ElementTags.CELLPADDING;
        assertEquals("cellpadding", str0, "'" + str0 + "' != '" + "cellpadding" + "'");
    }

    @Test
    void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        java.lang.String str0 = com.lowagie.text.ElementTags.ORIENTATION;
        assertEquals("orientation", str0, "'" + str0 + "' != '" + "orientation" + "'");
    }

    @Test
    void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        byte[] byte_array5 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1 };
        com.lowagie.text.pdf.PRStream pRStream6 = new com.lowagie.text.pdf.PRStream(pdfReader0, byte_array5);
        com.lowagie.text.pdf.PdfReader pdfReader7 = null;
        byte[] byte_array12 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1 };
        com.lowagie.text.pdf.PRStream pRStream13 = new com.lowagie.text.pdf.PRStream(pdfReader7, byte_array12);
        pRStream6.setData(byte_array12, false, (int) (byte) 100);
        byte[] byte_array17 = pRStream6.getBytes();
        boolean b18 = pRStream6.isPages();
        com.lowagie.text.pdf.PdfReader pdfReader19 = null;
        byte[] byte_array24 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1 };
        com.lowagie.text.pdf.PRStream pRStream25 = new com.lowagie.text.pdf.PRStream(pdfReader19, byte_array24);
        com.lowagie.text.pdf.PdfReader pdfReader26 = null;
        byte[] byte_array31 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1 };
        com.lowagie.text.pdf.PRStream pRStream32 = new com.lowagie.text.pdf.PRStream(pdfReader26, byte_array31);
        pRStream25.setData(byte_array31, false, (int) (byte) 100);
        byte[] byte_array36 = pRStream25.getBytes();
        pRStream6.setData(byte_array36);
        byte[] byte_array40 = new byte[] { (byte) 100, (byte) 10 };
        com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray41 = new com.lowagie.text.pdf.RandomAccessFileOrArray(byte_array40);
        byte[] byte_array42 = com.lowagie.text.pdf.PdfReader.getStreamBytes(pRStream6, randomAccessFileOrArray41);
        try {
            float f43 = randomAccessFileOrArray41.readFloat();
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
    void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        int i0 = com.lowagie.text.Element.LIST;
        assertEquals(14, i0);
    }

    @Test
    void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        com.lowagie.text.pdf.PdfContentByte pdfContentByte0 = null;
        com.lowagie.text.pdf.PdfContentByte[] pdfContentByte_array1 = new com.lowagie.text.pdf.PdfContentByte[] { pdfContentByte0 };
        try {
            com.lowagie.text.pdf.PdfPTable.endWritingRows(pdfContentByte_array1);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfContentByte_array1);
    }

    @Test
    void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        com.lowagie.text.pdf.Barcode128 barcode128_0 = new com.lowagie.text.pdf.Barcode128();
        com.lowagie.text.pdf.Barcode39 barcode39_1 = new com.lowagie.text.pdf.Barcode39();
        barcode39_1.setCodeType(0);
        com.lowagie.text.pdf.BarcodeEANSUPP barcodeEANSUPP4 = new com.lowagie.text.pdf.BarcodeEANSUPP((com.lowagie.text.pdf.Barcode) barcode128_0, (com.lowagie.text.pdf.Barcode) barcode39_1);
        boolean b5 = barcodeEANSUPP4.isExtended();
        boolean b6 = barcodeEANSUPP4.isStartStopText();
        assertEquals(false, b5);
        assertEquals(false, b6);
    }

    @Test
    void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        java.awt.Color color1 = java.awt.Color.getColor("operation");
        assertNull(color1);
    }

    @Test
    void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        com.lowagie.text.pdf.draw.DrawInterface drawInterface0 = null;
        com.lowagie.text.Chunk chunk3 = new com.lowagie.text.Chunk(drawInterface0, 1.0f, true);
    }

    @Test
    void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        int i0 = com.lowagie.text.Rectangle.RIGHT;
        assertEquals(8, i0);
    }

    @Test
    void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        int i0 = com.lowagie.text.pdf.ArabicLigaturizer.DIGITS_MASK;
        assertEquals(224, i0);
    }

    @Test
    void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        pdfPTable1.setFooterRows((-1));
        float f6 = pdfPTable1.calculateHeights(true);
        assertNotNull(pdfPCell2);
        assertEquals(0.0f, f6);
    }

    @Test
    void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        java.io.OutputStream outputStream0 = null;
        try {
            com.lowagie.text.pdf.codec.wmf.MetaDo.writeDWord(outputStream0, 34);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        char char0 = com.lowagie.text.pdf.Barcode128.CODE_AB_TO_C;
        assertEquals('c', char0);
    }

    @Test
    void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        com.lowagie.text.Chapter chapter1 = new com.lowagie.text.Chapter((int) (short) -1);
        com.lowagie.text.MarkedSection markedSection2 = chapter1.addMarkedSection();
        try {
            com.lowagie.text.pdf.PdfAction pdfAction4 = com.lowagie.text.pdf.PdfAction.setOCGstate((java.util.ArrayList) chapter1, true);
            fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        assertNotNull(markedSection2);
    }

    @Test
    void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        com.lowagie.text.pdf.hyphenation.Hyphenator.setHyphenDir("operation");
    }

    @Test
    void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ID;
        assertNotNull(pdfName0);
    }

    @Test
    void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        int i0 = com.lowagie.text.pdf.ColumnText.AR_COMPOSEDTASHKEEL;
        assertEquals(4, i0);
    }

    @Test
    void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        com.lowagie.text.RectangleReadOnly rectangleReadOnly4 = new com.lowagie.text.RectangleReadOnly((float) (byte) 100, (float) 1336, (float) 'Ë', (float) 9);
        try {
            rectangleReadOnly4.setBorder(30);
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
    }

    @Test
    void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ZOOM;
        assertNotNull(pdfName0);
    }

    @Test
    void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        int i0 = com.lowagie.text.pdf.AcroFields.FIELD_TYPE_LIST;
        assertEquals(5, i0);
    }

    @Test
    void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        java.lang.String str0 = com.lowagie.text.xml.xmp.DublinCoreSchema.DESCRIPTION;
        assertEquals("dc:description", str0, "'" + str0 + "' != '" + "dc:description" + "'");
    }

    @Test
    void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        com.lowagie.text.pdf.Barcode128 barcode128_0 = new com.lowagie.text.pdf.Barcode128();
        com.lowagie.text.pdf.Barcode39 barcode39_1 = new com.lowagie.text.pdf.Barcode39();
        barcode39_1.setCodeType(0);
        com.lowagie.text.pdf.BarcodeEANSUPP barcodeEANSUPP4 = new com.lowagie.text.pdf.BarcodeEANSUPP((com.lowagie.text.pdf.Barcode) barcode128_0, (com.lowagie.text.pdf.Barcode) barcode39_1);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte5 = null;
        com.lowagie.text.pdf.BaseFont baseFont6 = null;
        com.lowagie.text.Font font9 = new com.lowagie.text.Font(baseFont6, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont11 = font9.getCalculatedBaseFont(false);
        boolean b14 = baseFont11.setCharAdvance(9, 0);
        java.awt.Color color20 = java.awt.Color.getHSBColor(100.0f, (float) (short) 1, 100.0f);
        int i21 = com.lowagie.text.pdf.ExtendedColor.getType(color20);
        com.lowagie.text.Font font22 = new com.lowagie.text.Font(baseFont11, (float) (-1), (int) 'Ã', color20);
        com.lowagie.text.pdf.CMYKColor cMYKColor27 = new com.lowagie.text.pdf.CMYKColor((float) (short) 100, (float) 1, 100.0f, (float) 0);
        java.awt.Color color28 = cMYKColor27.darker();
        try {
            com.lowagie.text.Rectangle rectangle29 = barcodeEANSUPP4.placeBarcode(pdfContentByte5, color20, color28);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(baseFont11);
        assertEquals(true, b14);
        assertNotNull(color20);
        assertEquals(0, i21);
        assertNotNull(color28);
    }

    @Test
    void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        int i0 = com.lowagie.text.pdf.collection.PdfCollectionField.TEXT;
        assertEquals(0, i0);
    }

    @Test
    void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        int i0 = com.lowagie.text.pdf.PdfAction.SUBMIT_EMBED_FORM;
        assertEquals(8196, i0);
    }

    @Test
    void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        int i0 = com.lowagie.text.pdf.PdfAction.SUBMIT_COORDINATES;
        assertEquals(16, i0);
    }

    @Test
    void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.VIDEO;
        assertNotNull(pdfName0);
    }

    @Test
    void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        com.lowagie.text.pdf.TSAClientBouncyCastle tSAClientBouncyCastle4 = new com.lowagie.text.pdf.TSAClientBouncyCastle("border-bottom-width", "absolutey", "absolutex", 29);
        com.lowagie.text.pdf.PdfPKCS7 pdfPKCS7_5 = null;
        com.lowagie.text.pdf.PdfReader pdfReader7 = null;
        byte[] byte_array12 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1 };
        com.lowagie.text.pdf.PRStream pRStream13 = new com.lowagie.text.pdf.PRStream(pdfReader7, byte_array12);
        com.lowagie.text.pdf.PdfReader pdfReader14 = null;
        byte[] byte_array19 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1 };
        com.lowagie.text.pdf.PRStream pRStream20 = new com.lowagie.text.pdf.PRStream(pdfReader14, byte_array19);
        pRStream13.setData(byte_array19, false, (int) (byte) 100);
        byte[] byte_array24 = pRStream13.getBytes();
        com.lowagie.text.pdf.PdfReader pdfReader25 = null;
        byte[] byte_array30 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1 };
        com.lowagie.text.pdf.PRStream pRStream31 = new com.lowagie.text.pdf.PRStream(pdfReader25, byte_array30);
        com.lowagie.text.pdf.PdfReader pdfReader32 = null;
        byte[] byte_array37 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1 };
        com.lowagie.text.pdf.PRStream pRStream38 = new com.lowagie.text.pdf.PRStream(pdfReader32, byte_array37);
        pRStream31.setData(byte_array37, false, (int) (byte) 100);
        byte[] byte_array42 = pRStream31.getBytes();
        pRStream13.setData(byte_array42);
        com.lowagie.text.pdf.PdfName pdfName44 = com.lowagie.text.pdf.PdfName.FIRSTCHAR;
        java.lang.String str45 = com.lowagie.text.error_messages.MessageLocalization.getComposedMessage("listitem", (java.lang.Object) byte_array42, (java.lang.Object) pdfName44);
        com.lowagie.text.pdf.PdfDashPattern pdfDashPattern48 = new com.lowagie.text.pdf.PdfDashPattern((float) 0L, (float) 8);
        byte[] byte_array49 = com.lowagie.text.pdf.PdfReader.decodePredictor(byte_array42, (com.lowagie.text.pdf.PdfObject) pdfDashPattern48);
        try {
            byte[] byte_array50 = tSAClientBouncyCastle4.getTimeStampToken(pdfPKCS7_5, byte_array42);
            fail("Expected exception of type java.net.MalformedURLException");
        } catch (java.net.MalformedURLException e) {
        }
        assertNotNull(byte_array12);
        assertNotNull(byte_array19);
        assertNotNull(byte_array24);
        assertNotNull(byte_array30);
        assertNotNull(byte_array37);
        assertNotNull(byte_array42);
        assertNotNull(pdfName44);
        assertEquals("No message found for listitem", str45, "'" + str45 + "' != '" + "No message found for listitem" + "'");
        assertNotNull(byte_array49);
    }

    @Test
    void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        float f3 = pdfPCell2.getIndent();
        com.lowagie.text.pdf.ColumnText columnText4 = null;
        pdfPCell2.setColumn(columnText4);
        pdfPCell2.setPadding((float) 256);
        assertNotNull(pdfPCell2);
        assertEquals(0.0f, f3);
    }

    @Test
    void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        try {
            byte[] byte_array1 = com.lowagie.text.pdf.BarcodeEAN.getBarsSupplemental2("OpenPDF 1.2.12.SNAPSHOT");
            fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PATTERN;
        assertNotNull(pdfName0);
    }

    @Test
    void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        java.lang.String str0 = com.lowagie.text.xml.xmp.XmpMMSchema.MANAGERVARIANT;
        assertEquals("xmpMM:ManagerVariant", str0, "'" + str0 + "' != '" + "xmpMM:ManagerVariant" + "'");
    }

    @Test
    void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        com.lowagie.text.pdf.TSAClientBouncyCastle tSAClientBouncyCastle4 = new com.lowagie.text.pdf.TSAClientBouncyCastle("border-bottom-width", "absolutey", "absolutex", 29);
        com.lowagie.text.pdf.PdfPKCS7 pdfPKCS7_5 = null;
        byte[] byte_array7 = com.lowagie.text.pdf.crypto.IVGenerator.getIV(0);
        com.lowagie.text.pdf.PRTokeniser pRTokeniser8 = new com.lowagie.text.pdf.PRTokeniser(byte_array7);
        try {
            byte[] byte_array9 = tSAClientBouncyCastle4.getTimeStampToken(pdfPKCS7_5, byte_array7);
            fail("Expected exception of type java.net.MalformedURLException");
        } catch (java.net.MalformedURLException e) {
        }
        assertNotNull(byte_array7);
    }

    @Test
    void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        java.lang.String str0 = com.lowagie.text.Annotation.CONTENT;
        assertEquals("content", str0, "'" + str0 + "' != '" + "content" + "'");
    }

    @Test
    void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        java.lang.String str0 = com.lowagie.text.ElementTags.COLSPAN;
        assertEquals("colspan", str0, "'" + str0 + "' != '" + "colspan" + "'");
    }

    @Test
    void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.FUNCTIONS;
        assertNotNull(pdfName0);
    }

    @Test
    void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        java.security.cert.X509Certificate x509Certificate0 = null;
        java.security.cert.X509Certificate x509Certificate1 = null;
        com.lowagie.text.pdf.OcspClientBouncyCastle ocspClientBouncyCastle3 = new com.lowagie.text.pdf.OcspClientBouncyCastle(x509Certificate0, x509Certificate1, "dc:description");
    }

    @Test
    void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        java.lang.String str0 = com.lowagie.text.xml.xmp.PdfSchema.DEFAULT_XPATH_ID;
        assertEquals("pdf", str0, "'" + str0 + "' != '" + "pdf" + "'");
    }

    @Test
    void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        int i0 = com.lowagie.text.Jpeg2000.JP2_BPCC;
        assertEquals(1651532643, i0);
    }

    @Test
    void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.MIN_CAMEL_CASE;
        com.lowagie.text.pdf.PRIndirectReference pRIndirectReference1 = pdfName0.getIndRef();
        assertNotNull(pdfName0);
        assertNull(pRIndirectReference1);
    }

    @Test
    void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField1 = com.lowagie.text.pdf.PdfFormField.createCheckBox(pdfWriter0);
        pdfFormField1.setValueAsName("SKEW");
        try {
            pdfFormField1.setPage();
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfFormField1);
    }

    @Test
    void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        com.lowagie.text.factories.GreekAlphabetFactory greekAlphabetFactory0 = new com.lowagie.text.factories.GreekAlphabetFactory();
    }

    @Test
    void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TRANSPARENT;
        assertNotNull(pdfName0);
    }

    @Test
    void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        com.lowagie.text.Font font2 = com.lowagie.text.FontFactory.getFont("height", "Courier-Oblique");
        assertNotNull(font2);
    }

    @Test
    void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        java.lang.String str1 = com.lowagie.text.factories.GreekAlphabetFactory.getString(24);
        assertEquals("w", str1, "'" + str1 + "' != '" + "w" + "'");
    }

    @Test
    void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.REGISTRY;
        assertNotNull(pdfName0);
    }

    @Test
    void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaState.TRANSPARENT;
        assertEquals(1, i0);
    }

    @Test
    void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        float f3 = pdfPCell2.getIndent();
        com.lowagie.text.pdf.ColumnText columnText4 = null;
        pdfPCell2.setColumn(columnText4);
        try {
            int i6 = pdfPCell2.getArabicOptions();
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfPCell2);
        assertEquals(0.0f, f3);
    }

    @Test
    void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        float f1 = com.lowagie.text.Utilities.inchesToMillimeters(0.0f);
        assertEquals(0.0f, f1);
    }

    @Test
    void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        byte[] byte_array2 = new byte[] { (byte) 100, (byte) 10 };
        com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray3 = new com.lowagie.text.pdf.RandomAccessFileOrArray(byte_array2);
        randomAccessFileOrArray3.seek(804);
        int i6 = randomAccessFileOrArray3.length();
        assertNotNull(byte_array2);
        assertEquals(2, i6);
    }

    @Test
    void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        java.util.List<float[]> list_f_array6 = com.lowagie.text.pdf.PdfContentByte.bezierArc(0.0f, (float) '4', (float) 526, (float) 302, (float) (byte) 47, (float) 36);
        assertNotNull(list_f_array6);
    }

    @Test
    void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        int i0 = com.lowagie.text.Element.PTABLE;
        assertEquals(23, i0);
    }

    @Test
    void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        float f0 = com.lowagie.text.pdf.MultiColumnText.AUTOMATIC;
        assertEquals(f0, (-1.0f));
    }

    @Test
    void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        boolean b0 = com.lowagie.text.List.UPPERCASE;
        assertEquals(false, b0);
    }

    @Test
    void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        java.lang.String str0 = com.lowagie.text.Chunk.TAB;
        assertEquals("TAB", str0, "'" + str0 + "' != '" + "TAB" + "'");
    }

    @Test
    void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DL;
        assertNotNull(pdfName0);
    }

    @Test
    void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TRANSPARENCY;
        assertNotNull(pdfName0);
    }

    @Test
    void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        try {
            com.lowagie.text.pdf.BaseFont baseFont3 = com.lowagie.text.pdf.BaseFont.createFont("verticalalign", "text-align", true);
            fail("Expected exception of type com.lowagie.text.DocumentException");
        } catch (com.lowagie.text.DocumentException e) {
        }
    }

    @Test
    void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        java.lang.String str0 = com.lowagie.text.html.Markup.CSS_VALUE_ITALIC;
        assertEquals("italic", str0, "'" + str0 + "' != '" + "italic" + "'");
    }

    @Test
    void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfDictionary.PAGE;
        boolean b1 = pdfName0.isDictionary();
        assertNotNull(pdfName0);
        assertEquals(false, b1);
    }

    @Test
    void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_DELETEOBJECT;
        assertEquals(496, i0);
    }

    @Test
    void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        int i0 = com.lowagie.text.Element.JPEG;
        assertEquals(32, i0);
    }

    @Test
    void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        int i0 = com.lowagie.text.pdf.PdfObject.STREAM;
        assertEquals(7, i0);
    }

    @Test
    void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_ROUNDRECT;
        assertEquals(1564, i0);
    }

    @Test
    void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        int i0 = com.lowagie.text.pdf.PdfAnnotation.FLAGS_LOCKED;
        assertEquals(128, i0);
    }

    @Test
    void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        int i0 = com.lowagie.text.pdf.PdfEncryption.STANDARD_ENCRYPTION_128;
        assertEquals(3, i0);
    }

    @Test
    void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.FLASHVARS;
        com.lowagie.text.pdf.PdfArray pdfArray1 = new com.lowagie.text.pdf.PdfArray((com.lowagie.text.pdf.PdfObject) pdfName0);
        java.lang.String str2 = pdfArray1.toString();
        assertNotNull(pdfName0);
        assertEquals("[/FlashVars]", str2, "'" + str2 + "' != '" + "[/FlashVars]" + "'");
    }

    @Test
    void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        java.lang.String str0 = com.lowagie.text.pdf.BaseFont.RESOURCE_PATH;
        assertEquals("com/lowagie/text/pdf/fonts/", str0, "'" + str0 + "' != '" + "com/lowagie/text/pdf/fonts/" + "'");
    }

    @Test
    void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        try {
            com.lowagie.text.pdf.PdfAppearance pdfAppearance3 = com.lowagie.text.pdf.PdfAppearance.createAppearance(pdfWriter0, (float) 'c', (float) 24);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.RICHMEDIAPOSITION;
        assertNotNull(pdfName0);
    }

    @Test
    void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        java.awt.Color color0 = java.awt.Color.red;
        assertNotNull(color0);
    }

    @Test
    void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        int i0 = com.lowagie.text.pdf.BaseFont.STRIKETHROUGH_THICKNESS;
        assertEquals(16, i0);
    }

    @Test
    void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.RUNLENGTHDECODE;
        assertNotNull(pdfName0);
    }

    @Test
    void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        com.lowagie.text.pdf.Barcode39 barcode39_0 = new com.lowagie.text.pdf.Barcode39();
        barcode39_0.setCodeType(0);
        float f3 = barcode39_0.getSize();
        assertEquals(8.0f, f3);
    }

    @Test
    void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        java.io.InputStream inputStream0 = null;
        try {
            com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray1 = new com.lowagie.text.pdf.RandomAccessFileOrArray(inputStream0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaBrush.HS_HORIZONTAL;
        assertEquals(0, i0);
    }

    @Test
    void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        float f0 = com.lowagie.text.pdf.PdfPRow.RIGHT_LIMIT;
        assertEquals(20000.0f, f0);
    }

    @Test
    void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.RBGROUPS;
        assertNotNull(pdfName0);
    }

    @Test
    void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        java.lang.String str0 = com.lowagie.text.ElementTags.TOP;
        assertEquals("top", str0, "'" + str0 + "' != '" + "top" + "'");
    }

    @Test
    void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        java.lang.String str0 = com.lowagie.text.ElementTags.PLAINWIDTH;
        assertEquals("plainwidth", str0, "'" + str0 + "' != '" + "plainwidth" + "'");
    }

    @Test
    void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        com.lowagie.text.Font font1 = null;
        com.lowagie.text.Footnote footnote2 = new com.lowagie.text.Footnote("", font1);
        com.lowagie.text.HeaderFooter headerFooter4 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote2, true);
        headerFooter4.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph7 = headerFooter4.paragraph();
        float f8 = paragraph7.spacingAfter();
        try {
            float f11 = com.lowagie.text.pdf.ColumnText.getWidth((com.lowagie.text.Phrase) paragraph7, (int) (byte) 0, 1336);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(paragraph7);
        assertEquals(0.0f, f8);
    }

    @Test
    void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        java.lang.String str0 = com.lowagie.text.html.Markup.CSS_VALUE_TABLECELL;
        assertEquals("table-cell", str0, "'" + str0 + "' != '" + "table-cell" + "'");
    }

    @Test
    void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        pdfPTable1.setFooterRows((-1));
        com.lowagie.text.pdf.PdfPCell pdfPCell5 = pdfPTable1.getDefaultCell();
        assertNotNull(pdfPCell2);
        assertNotNull(pdfPCell5);
    }

    @Test
    void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        com.lowagie.text.pdf.BaseFont baseFont0 = null;
        com.lowagie.text.Font font3 = new com.lowagie.text.Font(baseFont0, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont5 = font3.getCalculatedBaseFont(false);
        boolean b8 = baseFont5.setCharAdvance(9, 0);
        java.awt.Color color14 = java.awt.Color.getHSBColor(100.0f, (float) (short) 1, 100.0f);
        int i15 = com.lowagie.text.pdf.ExtendedColor.getType(color14);
        com.lowagie.text.Font font16 = new com.lowagie.text.Font(baseFont5, (float) (-1), (int) 'Ã', color14);
        com.lowagie.text.Rectangle rectangle18 = com.lowagie.text.PageSize.PENGUIN_LARGE_PAPERBACK;
        float f19 = rectangle18.getHeight();
        try {
            float f22 = com.lowagie.text.pdf.PdfSignatureAppearance.fitText(font16, "w", rectangle18, (float) 1651532643, 256);
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (com.lowagie.text.ExceptionConverter e) {
        }
        assertNotNull(baseFont5);
        assertEquals(true, b8);
        assertNotNull(color14);
        assertEquals(0, i15);
        assertNotNull(rectangle18);
        assertEquals(561.0f, f19);
    }

    @Test
    void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        int i0 = com.lowagie.text.pdf.PdfAction.RESET_EXCLUDE;
        assertEquals(1, i0);
    }

    @Test
    void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        java.lang.String str0 = com.lowagie.text.html.Markup.HTML_ATTR_HREF;
        assertEquals("href", str0, "'" + str0 + "' != '" + "href" + "'");
    }

    @Test
    void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        byte[] byte_array1 = com.lowagie.text.pdf.crypto.IVGenerator.getIV(0);
        com.lowagie.text.pdf.PRTokeniser pRTokeniser2 = new com.lowagie.text.pdf.PRTokeniser(byte_array1);
        int i3 = pRTokeniser2.length();
        try {
            char char4 = pRTokeniser2.checkPdfHeader();
            fail("Expected exception of type com.lowagie.text.exceptions.InvalidPdfException");
        } catch (com.lowagie.text.exceptions.InvalidPdfException e) {
        }
        assertNotNull(byte_array1);
        assertEquals(0, i3);
    }

    @Test
    void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        com.lowagie.text.pdf.PdfDashPattern pdfDashPattern2 = new com.lowagie.text.pdf.PdfDashPattern((float) 302, (float) 9);
    }

    @Test
    void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.TBODY;
        assertNotNull(pdfName0);
    }

    @Test
    void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        int i0 = com.lowagie.text.pdf.PdfFormField.FF_NO_TOGGLE_TO_OFF;
        assertEquals(16384, i0);
    }

    @Test
    void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.BACKGROUND;
        assertNotNull(pdfName0);
    }

    @Test
    void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        int i0 = com.lowagie.text.pdf.PdfWriter.PageLayoutTwoColumnRight;
        assertEquals(8, i0);
    }

    @Test
    void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        int i0 = com.lowagie.text.pdf.PdfPageLabels.UPPERCASE_ROMAN_NUMERALS;
        assertEquals(1, i0);
    }

    @Test
    void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        try {
            com.lowagie.text.pdf.BaseFont baseFont4 = com.lowagie.text.pdf.BaseFont.createFont("file", "Default", true, true);
            fail("Expected exception of type com.lowagie.text.DocumentException");
        } catch (com.lowagie.text.DocumentException e) {
        }
    }

    @Test
    void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier0 = com.lowagie.text.pdf.PdfPKCS7.X509Name.OU;
        assertNotNull(aSN1ObjectIdentifier0);
    }

    @Test
    void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.EXTENSIONLEVEL;
        assertNotNull(pdfName0);
    }

    @Test
    void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        com.lowagie.text.GreekList greekList1 = new com.lowagie.text.GreekList((-56509343));
    }

    @Test
    void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        java.lang.String str0 = com.lowagie.text.ElementTags.BGBLUE;
        assertEquals("bgblue", str0, "'" + str0 + "' != '" + "bgblue" + "'");
    }

    @Test
    void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        int i0 = com.lowagie.text.pdf.ColumnText.NO_MORE_COLUMN;
        assertEquals(2, i0);
    }

    @Test
    void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        int i0 = com.lowagie.text.pdf.PdfFormField.FF_MULTILINE;
        assertEquals(4096, i0);
    }

    @Test
    void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        int i0 = com.lowagie.text.pdf.BarcodeDatamatrix.DM_ASCII;
        assertEquals(1, i0);
    }

    @Test
    void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        com.lowagie.text.pdf.PdfWriter.PdfBody.PdfCrossReference pdfCrossReference3 = new com.lowagie.text.pdf.PdfWriter.PdfBody.PdfCrossReference(1651532643, 6, 9);
    }

    @Test
    void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        com.lowagie.text.Font font2 = new com.lowagie.text.Font(8, (float) ' ');
        font2.setStyle(53);
    }

    @Test
    void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.EARLYCHANGE;
        assertNotNull(pdfName0);
    }

    @Test
    void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        java.lang.String str0 = com.lowagie.text.pdf.AsianFontMapper.KoreanEncoding_V;
        assertEquals("UniKS-UCS2-V", str0, "'" + str0 + "' != '" + "UniKS-UCS2-V" + "'");
    }

    @Test
    void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        byte byte0 = com.lowagie.text.DocWriter.TAB;
        assertEquals(byte0, (byte) 9);
    }

    @Test
    void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.VIEWS;
        assertNotNull(pdfName0);
    }

    @Test
    void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        java.lang.String str0 = com.lowagie.text.Annotation.URL;
        assertEquals("url", str0, "'" + str0 + "' != '" + "url" + "'");
    }
}

