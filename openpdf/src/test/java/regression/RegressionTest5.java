package regression;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;


@TestMethodOrder(MethodOrderer.Alphanumeric.class)
class RegressionTest5 {

    static boolean debug = false;

    @Test
    void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test001");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Cell cell5 = com.lowagie.text.factories.ElementFactory.getCell(properties1);
        int i6 = cell5.type();
        com.lowagie.text.pdf.PdfPCell pdfPCell7 = cell5.createPdfPCell();
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(cell5);
        assertEquals(20, i6);
        assertNotNull(pdfPCell7);
    }

    @Test
    void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test002");
        com.lowagie.text.pdf.events.FieldPositioningEvents fieldPositioningEvents0 = new com.lowagie.text.pdf.events.FieldPositioningEvents();
        fieldPositioningEvents0.padding = 14;
        java.io.OutputStream outputStream3 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields5 = new com.lowagie.text.pdf.PdfCopyFields(outputStream3, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter6 = pdfCopyFields5.getWriter();
        int i7 = pdfWriter6.getCurrentPageNumber();
        pdfWriter6.setLinearPageMode();
        com.lowagie.text.Annotation annotation17 = new com.lowagie.text.Annotation((float) '4', (float) 1, (float) '4', (float) 29, "listitem", "absolutey", "hi!", "ZapfDingbats");
        com.lowagie.text.pdf.PdfPTable pdfPTable19 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell20 = pdfPTable19.getDefaultCell();
        com.lowagie.text.pdf.ColumnText columnText21 = null;
        pdfPCell20.setColumn(columnText21);
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation23 = com.lowagie.text.pdf.internal.PdfAnnotationsImp.convertAnnotation(pdfWriter6, annotation17, (com.lowagie.text.Rectangle) pdfPCell20);
        pdfWriter6.setSigFlags(513);
        pdfWriter6.setUserunit((float) 'Ë');
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper28 = new com.lowagie.text.pdf.PdfPageEventHelper();
        java.io.OutputStream outputStream29 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields31 = new com.lowagie.text.pdf.PdfCopyFields(outputStream29, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter32 = pdfCopyFields31.getWriter();
        com.lowagie.text.Font font34 = null;
        com.lowagie.text.Footnote footnote35 = new com.lowagie.text.Footnote("", font34);
        com.lowagie.text.HeaderFooter headerFooter37 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote35, true);
        headerFooter37.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle40 = headerFooter37.rotate();
        com.lowagie.text.Rectangle rectangle41 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter37);
        com.lowagie.text.Document document42 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter37);
        boolean b44 = document42.setMarginMirroringTopBottom(true);
        com.lowagie.text.Font font48 = null;
        com.lowagie.text.Footnote footnote49 = new com.lowagie.text.Footnote("", font48);
        com.lowagie.text.HeaderFooter headerFooter51 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote49, true);
        headerFooter51.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph54 = headerFooter51.paragraph();
        pdfPageEventHelper28.onSection(pdfWriter32, document42, (float) 7, 262144, paragraph54);
        float f56 = document42.left();
        document42.setJavaScript_onUnLoad("bottom");
        com.lowagie.text.Font font60 = null;
        com.lowagie.text.Footnote footnote61 = new com.lowagie.text.Footnote("", font60);
        com.lowagie.text.HeaderFooter headerFooter63 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote61, true);
        headerFooter63.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle66 = headerFooter63.rotate();
        try {
            fieldPositioningEvents0.onGenericTag(pdfWriter6, document42, rectangle66, "(/Filter=/Adobe.PPKMS, /Type=/Sig, /SubFilter=/adbe.pkcs7.sha1)");
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (com.lowagie.text.ExceptionConverter e) {
        }
        assertNotNull(pdfWriter6);
        assertEquals(1, i7);
        assertNotNull(pdfPCell20);
        assertNotNull(pdfAnnotation23);
        assertNotNull(pdfWriter32);
        assertNotNull(rectangle40);
        assertEquals(true, b44);
        assertNotNull(paragraph54);
        assertEquals(36.0f, f56);
        assertNotNull(rectangle66);
    }

    @Test
    void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test003");
        com.lowagie.text.pdf.codec.wmf.MetaState metaState0 = new com.lowagie.text.pdf.codec.wmf.MetaState();
        float f1 = metaState0.scalingY;
        metaState0.offsetWx = 512;
        try {
            metaState0.deleteMetaObject((int) 'Æ');
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        assertEquals(0.0f, f1);
    }

    @Test
    void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test004");
        com.lowagie.text.pdf.PdfDashPattern pdfDashPattern1 = new com.lowagie.text.pdf.PdfDashPattern((float) (byte) 9);
    }

    @Test
    void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test005");
        com.lowagie.text.pdf.XfaForm.Xml2Som xml2Som0 = new com.lowagie.text.pdf.XfaForm.Xml2Som();
        com.lowagie.text.Font font2 = null;
        com.lowagie.text.Footnote footnote3 = new com.lowagie.text.Footnote("", font2);
        com.lowagie.text.HeaderFooter headerFooter5 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote3, true);
        com.lowagie.text.pdf.HyphenationAuto hyphenationAuto10 = new com.lowagie.text.pdf.HyphenationAuto("Default", "creationdate", (-1), 1785737760);
        footnote3.setHyphenation((com.lowagie.text.pdf.HyphenationEvent) hyphenationAuto10);
        com.lowagie.text.Font font12 = footnote3.getFont();
        xml2Som0.setOrder((java.util.ArrayList) footnote3);
        try {
            xml2Som0.inverseSearchAdd("");
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNull(font12);
    }

    @Test
    void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test006");
        com.lowagie.text.pdf.draw.DottedLineSeparator dottedLineSeparator0 = new com.lowagie.text.pdf.draw.DottedLineSeparator();
        com.lowagie.text.Chunk chunk2 = new com.lowagie.text.Chunk((com.lowagie.text.pdf.draw.DrawInterface) dottedLineSeparator0, false);
    }

    @Test
    void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test007");
        com.lowagie.text.pdf.codec.wmf.MetaState metaState0 = new com.lowagie.text.pdf.codec.wmf.MetaState();
        float f1 = metaState0.scalingY;
        metaState0.scalingY = (byte) 60;
        com.lowagie.text.pdf.codec.wmf.MetaPen metaPen4 = null;
        metaState0.currentPen = metaPen4;
        assertEquals(0.0f, f1);
    }

    @Test
    void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test008");
        com.lowagie.text.pdf.PdfReader pdfReader2 = null;
        byte[] byte_array7 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream8 = new com.lowagie.text.pdf.PRStream(pdfReader2, byte_array7);
        com.lowagie.text.pdf.PdfReader pdfReader9 = null;
        byte[] byte_array14 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream15 = new com.lowagie.text.pdf.PRStream(pdfReader9, byte_array14);
        pRStream8.setData(byte_array14, false, (int) (byte) 100);
        int[] i_array19 = com.lowagie.text.pdf.PRTokeniser.checkObjectStart(byte_array14);
        com.lowagie.text.pdf.PdfReader pdfReader20 = null;
        byte[] byte_array25 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream26 = new com.lowagie.text.pdf.PRStream(pdfReader20, byte_array25);
        com.lowagie.text.pdf.PdfReader pdfReader27 = null;
        byte[] byte_array32 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream33 = new com.lowagie.text.pdf.PRStream(pdfReader27, byte_array32);
        pRStream26.setData(byte_array32, false, (int) (byte) 100);
        com.lowagie.text.Image image37 = com.lowagie.text.Image.getInstance(4194304, 0, byte_array14, byte_array32);
        com.lowagie.text.pdf.hyphenation.ByteVector byteVector39 = new com.lowagie.text.pdf.hyphenation.ByteVector(byte_array32, (int) '5');
        assertNotNull(byte_array7);
        assertNotNull(byte_array14);
        assertNull(i_array19);
        assertNotNull(byte_array25);
        assertNotNull(byte_array32);
        assertNotNull(image37);
    }

    @Test
    void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test009");
        com.lowagie.text.pdf.PdfPageLabels.PdfPageLabelFormat pdfPageLabelFormat4 = new com.lowagie.text.pdf.PdfPageLabels.PdfPageLabelFormat(6, (-3), "margin", 526);
        pdfPageLabelFormat4.physicalPage = 32768;
        int i7 = pdfPageLabelFormat4.numberStyle;
        pdfPageLabelFormat4.numberStyle = 'e';
        assertEquals(i7, (-3));
    }

    @Test
    void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test010");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfAcroForm pdfAcroForm1 = new com.lowagie.text.pdf.PdfAcroForm(pdfWriter0);
        pdfAcroForm1.setNeedAppearances(true);
        boolean b4 = pdfAcroForm1.isDictionary();
        boolean b5 = pdfAcroForm1.isCatalog();
        java.lang.String str6 = pdfAcroForm1.toString();
        com.lowagie.text.pdf.internal.PdfViewerPreferencesImp pdfViewerPreferencesImp7 = com.lowagie.text.pdf.internal.PdfViewerPreferencesImp.getViewerPreferences((com.lowagie.text.pdf.PdfDictionary) pdfAcroForm1);
        com.lowagie.text.pdf.PdfFormField pdfFormField11 = pdfAcroForm1.getRadioGroup("com.lowagie.text.pdf.hyphenation.HyphenationException: ZapfDingbats", "leading", true);
        assertEquals(true, b4);
        assertEquals(false, b5);
        assertEquals("Dictionary", str6, "'" + str6 + "' != '" + "Dictionary" + "'");
        assertNotNull(pdfViewerPreferencesImp7);
        assertNotNull(pdfFormField11);
    }

    @Test
    void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test011");
        double d2 = com.lowagie.text.pdf.PdfGraphics2D.asPoints((double) 262, 13);
        assertEquals(3.406d, d2);
    }

    @Test
    void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test012");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfAcroForm pdfAcroForm1 = new com.lowagie.text.pdf.PdfAcroForm(pdfWriter0);
        pdfAcroForm1.setNeedAppearances(true);
        boolean b4 = pdfAcroForm1.isDictionary();
        boolean b5 = pdfAcroForm1.isCatalog();
        java.lang.String str6 = pdfAcroForm1.toString();
        boolean b7 = pdfAcroForm1.isString();
        assertEquals(true, b4);
        assertEquals(false, b5);
        assertEquals("Dictionary", str6, "'" + str6 + "' != '" + "Dictionary" + "'");
        assertEquals(false, b7);
    }

    @Test
    void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test013");
        com.lowagie.text.pdf.PdfBorderArray pdfBorderArray3 = new com.lowagie.text.pdf.PdfBorderArray((float) 15, 0.0f, (float) (-56410008));
        com.lowagie.text.pdf.PdfName pdfName4 = com.lowagie.text.pdf.PdfName.NEAR;
        boolean b5 = pdfBorderArray3.contains((com.lowagie.text.pdf.PdfObject) pdfName4);
        assertNotNull(pdfName4);
        assertEquals(false, b5);
    }

    @Test
    void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test014");
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
        imgJBIG2_20.setRight((float) 14);
        assertNotNull(byte_array8);
        assertNotNull(byte_array15);
        assertEquals(false, b21);
        assertEquals(false, b24);
    }

    @Test
    void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test015");
        com.lowagie.text.pdf.TSAClientBouncyCastle tSAClientBouncyCastle1 = new com.lowagie.text.pdf.TSAClientBouncyCastle("symbolindent");
    }

    @Test
    void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test016");
        com.lowagie.text.pdf.MultiColumnText multiColumnText2 = new com.lowagie.text.pdf.MultiColumnText((float) 10, (float) 260);
    }

    @Test
    void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test017");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ALLPAGES;
        assertNotNull(pdfName0);
    }

    @Test
    void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test018");
        com.lowagie.text.Paragraph paragraph1 = new com.lowagie.text.Paragraph((float) 5);
    }

    @Test
    void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test019");
        com.lowagie.text.xml.xmp.LangAlt langAlt0 = new com.lowagie.text.xml.xmp.LangAlt();
        langAlt0.addLanguage("operation", "<?xpacket end=\"r\"?>");
        java.lang.String str4 = langAlt0.toString();
        com.lowagie.text.Table table5 = com.lowagie.text.factories.ElementFactory.getTable((java.util.Properties) langAlt0);
        com.lowagie.text.pdf.PdfName pdfName6 = com.lowagie.text.pdf.PdfName.SYMBOL;
        java.lang.Object obj7 = langAlt0.get((java.lang.Object) pdfName6);
        assertEquals("<rdf:Alt><rdf:li xml:lang=\"operation\" >&lt;?xpacket end=&quot;r&quot;?&gt;</rdf:li></rdf:Alt>", str4, "'" + str4 + "' != '" + "<rdf:Alt><rdf:li xml:lang=\"operation\" >&lt;?xpacket end=&quot;r&quot;?&gt;</rdf:li></rdf:Alt>" + "'");
        assertNotNull(table5);
        assertNotNull(pdfName6);
        assertNull(obj7);
    }

    @Test
    void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test020");
        java.io.InputStream inputStream0 = null;
        com.lowagie.text.pdf.PdfWriter pdfWriter1 = null;
        char[] char_array4 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font6 = new com.lowagie.text.pdf.Type3Font(pdfWriter1, char_array4, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte13 = type3Font6.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte13.rectangle((float) (-3), (float) 'a', (float) (-1), (float) (byte) 0);
        com.lowagie.text.pdf.PdfWriter pdfWriter19 = pdfContentByte13.getPdfWriter();
        pdfContentByte13.ellipse((-1048577.0f), (float) 258, (float) 11, 69.411f);
        com.lowagie.text.pdf.codec.wmf.MetaDo metaDo25 = new com.lowagie.text.pdf.codec.wmf.MetaDo(inputStream0, pdfContentByte13);
        java.io.InputStream inputStream26 = null;
        com.lowagie.text.pdf.PdfContentByte pdfContentByte27 = null;
        com.lowagie.text.pdf.codec.wmf.MetaDo metaDo28 = new com.lowagie.text.pdf.codec.wmf.MetaDo(inputStream26, pdfContentByte27);
        java.io.InputStream inputStream29 = null;
        com.lowagie.text.pdf.codec.wmf.InputMeta inputMeta30 = new com.lowagie.text.pdf.codec.wmf.InputMeta(inputStream29);
        int i31 = inputMeta30.getLength();
        metaDo28.in = inputMeta30;
        metaDo25.in = inputMeta30;
        assertNotNull(char_array4);
        assertNotNull(pdfContentByte13);
        assertNull(pdfWriter19);
        assertEquals(0, i31);
    }

    @Test
    void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test021");
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
        pdfAnnotation40.setMKRotation(224);
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertNotNull(rectangle35);
        assertNotNull(pdfName38);
        assertNotNull(pdfAnnotation40);
    }

    @Test
    void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test022");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.Font font2 = null;
        com.lowagie.text.Footnote footnote3 = new com.lowagie.text.Footnote("", font2);
        com.lowagie.text.HeaderFooter headerFooter5 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote3, true);
        headerFooter5.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle8 = headerFooter5.rotate();
        float[][] f_array_array10 = new float[][]{};
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation11 = com.lowagie.text.pdf.PdfAnnotation.createInk(pdfWriter0, (com.lowagie.text.Rectangle) headerFooter5, "widths", f_array_array10);
        boolean b12 = headerFooter5.isNumbered();
        assertNotNull(rectangle8);
        assertNotNull(f_array_array10);
        assertNotNull(pdfAnnotation11);
        assertEquals(true, b12);
    }

    @Test
    void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test023");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DEFAULTCRYPTFILTER;
        assertNotNull(pdfName0);
    }

    @Test
    void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test024");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.SATURATION;
        assertNotNull(pdfName0);
    }

    @Test
    void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test025");
        com.lowagie.text.pdf.Barcode128 barcode128_0 = new com.lowagie.text.pdf.Barcode128();
        com.lowagie.text.pdf.Barcode39 barcode39_1 = new com.lowagie.text.pdf.Barcode39();
        barcode39_1.setCodeType(0);
        com.lowagie.text.pdf.BarcodeEANSUPP barcodeEANSUPP4 = new com.lowagie.text.pdf.BarcodeEANSUPP((com.lowagie.text.pdf.Barcode) barcode128_0, (com.lowagie.text.pdf.Barcode) barcode39_1);
        barcodeEANSUPP4.setGuardBars(true);
        barcodeEANSUPP4.setSize(100.0f);
        float f9 = barcodeEANSUPP4.getX();
        barcodeEANSUPP4.setAltText("plainwidth");
        assertEquals(0.0f, f9);
    }

    @Test
    void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test026");
        com.lowagie.text.Chapter chapter1 = new com.lowagie.text.Chapter((int) (short) -1);
        com.lowagie.text.MarkedSection markedSection2 = chapter1.addMarkedSection();
        int i3 = markedSection2.type();
        int i4 = markedSection2.type();
        com.lowagie.text.MarkedSection markedSection5 = markedSection2.addSection();
        assertNotNull(markedSection2);
        assertEquals(50, i3);
        assertEquals(50, i4);
        assertNotNull(markedSection5);
    }

    @Test
    void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test027");
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
        pdfFileSpecification49.addDescription("absolutey", true);
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
    void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test028");
        com.lowagie.text.pdf.parser.TextAssembler textAssembler0 = null;
        com.lowagie.text.pdf.parser.PdfContentStreamHandler pdfContentStreamHandler1 = new com.lowagie.text.pdf.parser.PdfContentStreamHandler(textAssembler0);
        java.util.Map<java.lang.String, com.lowagie.text.pdf.parser.ContentOperator> map_str_contentOperator2 = null;
        pdfContentStreamHandler1.operators = map_str_contentOperator2;
        com.lowagie.text.pdf.parser.Matrix matrix4 = pdfContentStreamHandler1.textMatrix;
        com.lowagie.text.pdf.parser.TextAssembler textAssembler5 = null;
        com.lowagie.text.pdf.parser.PdfContentStreamHandler pdfContentStreamHandler6 = new com.lowagie.text.pdf.parser.PdfContentStreamHandler(textAssembler5);
        java.util.Map<java.lang.String, com.lowagie.text.pdf.parser.ContentOperator> map_str_contentOperator7 = pdfContentStreamHandler6.operators;
        pdfContentStreamHandler1.operators = map_str_contentOperator7;
        assertNull(matrix4);
        assertNotNull(map_str_contentOperator7);
    }

    @Test
    void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test029");
        try {
            com.lowagie.text.pdf.BaseFont baseFont3 = com.lowagie.text.pdf.BaseFont.createFont("Allowed: Modify contents", "SUBSUPSCRIPT", false);
            fail("Expected exception of type com.lowagie.text.DocumentException");
        } catch (com.lowagie.text.DocumentException e) {
        }
    }

    @Test
    void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test030");
        com.lowagie.text.Chapter chapter1 = new com.lowagie.text.Chapter((int) (short) -1);
        com.lowagie.text.MarkedSection markedSection2 = chapter1.addMarkedSection();
        int i3 = markedSection2.type();
        int i4 = markedSection2.type();
        markedSection2.setBookmarkTitle("");
        markedSection2.setNumberDepth(561);
        assertNotNull(markedSection2);
        assertEquals(50, i3);
        assertEquals(50, i4);
    }

    @Test
    void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test031");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.AC;
        assertNotNull(pdfName0);
    }

    @Test
    void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test032");
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
        java.lang.String str39 = pdfAcroForm38.toString();
        assertNotNull(pdfWriter4);
        assertNotNull(rectangle12);
        assertEquals(true, b16);
        assertNotNull(paragraph26);
        assertNotNull(pdfName35);
        assertNotNull(pdfName36);
        assertNotNull(pdfAcroForm38);
        assertEquals("Dictionary", str39, "'" + str39 + "' != '" + "Dictionary" + "'");
    }

    @Test
    void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test033");
        int i0 = com.lowagie.text.pdf.PdfWriter.PDFX1A2001;
        assertEquals(1, i0);
    }

    @Test
    void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test034");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaDo.META_STRETCHBLT;
        assertEquals(2851, i0);
    }

    @Test
    void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test035");
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
        pdfContentByte12.rectangle((-30.0f), (float) 29, 1.0f, (float) 16);
        try {
            pdfContentByte12.localGoto("text-decoration", 3.0f, (float) 262, (float) (short) 25610, (float) 96);
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
    }

    @Test
    void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test036");
        int i0 = com.lowagie.text.pdf.BaseFont.BBOXURY;
        assertEquals(8, i0);
    }

    @Test
    void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test037");
        com.lowagie.text.pdf.AcroFields.Item item0 = new com.lowagie.text.pdf.AcroFields.Item();
        com.lowagie.text.pdf.PdfName pdfName1 = com.lowagie.text.pdf.PdfFormField.IF_SCALE_NEVER;
        com.lowagie.text.pdf.PdfName pdfName2 = com.lowagie.text.pdf.PdfName.LAST;
        item0.writeToAll(pdfName1, (com.lowagie.text.pdf.PdfObject) pdfName2, 34);
        java.util.ArrayList arrayList5 = item0.tabOrder;
        int i6 = item0.size();
        assertNotNull(pdfName1);
        assertNotNull(pdfName2);
        assertNotNull(arrayList5);
        assertEquals(0, i6);
    }

    @Test
    void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test038");
        com.lowagie.text.pdf.BaseFont baseFont0 = null;
        com.lowagie.text.Font font3 = new com.lowagie.text.Font(baseFont0, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont5 = font3.getCalculatedBaseFont(false);
        boolean b8 = baseFont5.setCharAdvance(9, 0);
        int i9 = baseFont5.getCompressionLevel();
        boolean b10 = baseFont5.isSubset();
        float f13 = baseFont5.getWidthPoint("STSong-Light", 0.0f);
        float f16 = baseFont5.getWidthPoint((int) (short) 10, (float) 10);
        com.lowagie.text.Font font17 = new com.lowagie.text.Font(baseFont5);
        assertNotNull(baseFont5);
        assertEquals(true, b8);
        assertEquals(i9, (-1));
        assertEquals(true, b10);
        assertEquals(0.0f, f13);
        assertEquals(0.0f, f16);
    }

    @Test
    void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test039");
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
        graphics2D24.finalize();
        assertNotNull(char_array3);
        assertNotNull(pdfContentByte12);
        assertNotNull(graphics2D20);
        assertNotNull(graphics2D24);
    }

    @Test
    void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test040");
        com.lowagie.text.pdf.ByteBuffer byteBuffer1 = new com.lowagie.text.pdf.ByteBuffer(1564);
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields3 = new com.lowagie.text.pdf.PdfCopyFields((java.io.OutputStream) byteBuffer1, 'Ã');
        com.lowagie.text.pdf.ByteBuffer byteBuffer5 = byteBuffer1.append(24);
        com.lowagie.text.pdf.ByteBuffer byteBuffer7 = byteBuffer1.append((byte) 100);
        com.lowagie.text.pdf.ByteBuffer byteBuffer9 = byteBuffer1.appendHex((byte) 9);
        com.lowagie.text.pdf.PdfDictionary pdfDictionary10 = null;
        com.lowagie.text.xml.xmp.XmpWriter xmpWriter12 = new com.lowagie.text.xml.xmp.XmpWriter((java.io.OutputStream) byteBuffer1, pdfDictionary10, 1042);
        xmpWriter12.addRdfDescription("pdfaid", "");
        xmpWriter12.setAbout("bgred");
        xmpWriter12.close();
        try {
            xmpWriter12.close();
            fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        assertNotNull(byteBuffer5);
        assertNotNull(byteBuffer7);
        assertNotNull(byteBuffer9);
    }

    @Test
    void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test041");
        java.lang.String str1 = com.lowagie.text.factories.RomanNumberFactory.getString((int) '搊');
        assertEquals("|xxv|dcx", str1, "'" + str1 + "' != '" + "|xxv|dcx" + "'");
    }

    @Test
    void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test042");
        java.lang.String str0 = com.lowagie.text.html.Markup.HTML_ATTR_STYLESHEET;
        assertEquals("stylesheet", str0, "'" + str0 + "' != '" + "stylesheet" + "'");
    }

    @Test
    void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test043");
        com.lowagie.text.Annotation annotation8 = new com.lowagie.text.Annotation(69.411f, (float) 90L, (float) (-56410008), (float) 'ਁ', "<rdf:Alt><rdf:li xml:lang=\"operation\" >&lt;?xpacket end=&quot;r&quot;?&gt;</rdf:li></rdf:Alt>", "table-cell", "bgred", "id");
    }

    @Test
    void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test044");
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
        com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray46 = new com.lowagie.text.pdf.RandomAccessFileOrArray(randomAccessFileOrArray43);
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
    void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test045");
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
        table2.deleteAllRows();
        table2.setComplete(false);
        table2.flushContent();
        assertNotNull(rectangle10);
        assertEquals(false, b15);
    }

    @Test
    void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test046");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Paragraph paragraph5 = com.lowagie.text.factories.ElementFactory.getParagraph(properties1);
        int i6 = properties1.size();
        com.lowagie.text.Table table7 = com.lowagie.text.factories.ElementFactory.getTable(properties1);
        boolean b8 = table7.isLocked();
        float f9 = table7.getWidth();
        int i10 = table7.type();
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(paragraph5);
        assertEquals(0, i6);
        assertNotNull(table7);
        assertEquals(false, b8);
        assertEquals(80.0f, f9);
        assertEquals(22, i10);
    }

    @Test
    void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test047");
        int i2 = com.lowagie.text.FontFactory.registerDirectory("author", false);
        assertEquals(0, i2);
    }

    @Test
    void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test048");
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
        document19.setJavaScript_onUnLoad("cellpadding");
        assertNotNull(pdfWriter8);
        assertEquals(1, i9);
        assertNotNull(rectangle17);
        assertEquals(true, b21);
    }

    @Test
    void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test049");
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
        imgJBIG2_20.setBorderWidthTop(0.5f);
        assertNotNull(byte_array8);
        assertNotNull(byte_array15);
        assertEquals(0, i21);
    }

    @Test
    void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test050");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Cell cell5 = com.lowagie.text.factories.ElementFactory.getCell(properties1);
        boolean b6 = cell5.isUseBorderPadding();
        cell5.setHorizontalAlignment("Times-Bold");
        boolean b9 = cell5.isHeader();
        java.awt.Color color10 = cell5.getBorderColorLeft();
        try {
            float f11 = cell5.getBottom();
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(cell5);
        assertEquals(false, b6);
        assertEquals(false, b9);
        assertNull(color10);
    }

    @Test
    void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test051");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte12 = type3Font5.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte12.rectangle((float) (-3), (float) 'a', (float) (-1), (float) (byte) 0);
        byte[] byte_array20 = null;
        com.lowagie.text.pdf.PdfReader pdfReader21 = null;
        byte[] byte_array26 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream27 = new com.lowagie.text.pdf.PRStream(pdfReader21, byte_array26);
        com.lowagie.text.pdf.PdfReader pdfReader28 = null;
        byte[] byte_array33 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream34 = new com.lowagie.text.pdf.PRStream(pdfReader28, byte_array33);
        pRStream27.setData(byte_array33, false, (int) (byte) 100);
        com.lowagie.text.ImgJBIG2 imgJBIG2_38 = new com.lowagie.text.ImgJBIG2(4, 1564, byte_array20, byte_array33);
        int i39 = imgJBIG2_38.getAlignment();
        try {
            pdfContentByte12.addImage((com.lowagie.text.Image) imgJBIG2_38, (float) 23, (float) 260, (float) 561, (float) (short) 10, (float) 2851, (float) '6');
            fail("Expected exception of type com.lowagie.text.DocumentException");
        } catch (com.lowagie.text.DocumentException e) {
        }
        assertNotNull(char_array3);
        assertNotNull(pdfContentByte12);
        assertNotNull(byte_array26);
        assertNotNull(byte_array33);
        assertEquals(0, i39);
    }

    @Test
    void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test052");
        com.lowagie.text.pdf.GrayColor grayColor0 = com.lowagie.text.pdf.GrayColor.GRAYBLACK;
        assertNotNull(grayColor0);
    }

    @Test
    void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test053");
        com.lowagie.text.pdf.PdfArray pdfArray0 = null;
        try {
            com.lowagie.text.Rectangle rectangle1 = com.lowagie.text.pdf.PdfReader.getNormalizedRectangle(pdfArray0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test054");
        com.lowagie.text.Font font7 = com.lowagie.text.FontFactory.getFont("application", "Baseline", true, (float) 525, 1785737760);
        com.lowagie.text.ListItem listItem8 = new com.lowagie.text.ListItem(14.0f, "lettered", font7);
        assertNotNull(font7);
    }

    @Test
    void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test055");
        com.lowagie.text.pdf.hyphenation.Hyphenator hyphenator4 = new com.lowagie.text.pdf.hyphenation.Hyphenator("xmp:Identifier", "destination", (int) 'c', 32);
        com.lowagie.text.pdf.PdfWriter pdfWriter5 = null;
        char[] char_array8 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font10 = new com.lowagie.text.pdf.Type3Font(pdfWriter5, char_array8, true);
        com.lowagie.text.pdf.hyphenation.Hyphenation hyphenation13 = hyphenator4.hyphenate(char_array8, 1651532643, 30);
        com.lowagie.text.pdf.hyphenation.Hyphenation hyphenation15 = hyphenator4.hyphenate("urx");
        com.lowagie.text.pdf.hyphenation.Hyphenation hyphenation17 = hyphenator4.hyphenate("xmpMM:RenditionClass");
        assertNotNull(char_array8);
        assertNull(hyphenation13);
        assertNull(hyphenation15);
        assertNull(hyphenation17);
    }

    @Test
    void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test056");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Cell cell5 = com.lowagie.text.factories.ElementFactory.getCell(properties1);
        boolean b6 = cell5.isUseBorderPadding();
        cell5.setHorizontalAlignment("Times-Bold");
        boolean b9 = cell5.isHeader();
        java.awt.Color color10 = cell5.getBorderColorLeft();
        com.lowagie.text.MarkedObject markedObject11 = new com.lowagie.text.MarkedObject((com.lowagie.text.Element) cell5);
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(cell5);
        assertEquals(false, b6);
        assertEquals(false, b9);
        assertNull(color10);
    }

    @Test
    void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test057");
        com.lowagie.text.pdf.BarcodePDF417 barcodePDF417_0 = new com.lowagie.text.pdf.BarcodePDF417();
        int i1 = barcodePDF417_0.getBitColumns();
        int i2 = barcodePDF417_0.getCodeRows();
        com.lowagie.text.pdf.GrayColor grayColor4 = new com.lowagie.text.pdf.GrayColor(2);
        java.awt.Color color5 = java.awt.Color.blue;
        java.awt.Image image6 = barcodePDF417_0.createAwtImage((java.awt.Color) grayColor4, color5);
        barcodePDF417_0.setMacroSegmentCount(2097152);
        assertEquals(0, i1);
        assertEquals(0, i2);
        assertNotNull(color5);
        assertNotNull(image6);
    }

    @Test
    void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test058");
        com.lowagie.text.pdf.events.PdfPCellEventForwarder pdfPCellEventForwarder0 = new com.lowagie.text.pdf.events.PdfPCellEventForwarder();
        com.lowagie.text.pdf.events.FieldPositioningEvents fieldPositioningEvents1 = new com.lowagie.text.pdf.events.FieldPositioningEvents();
        fieldPositioningEvents1.padding = ' ';
        pdfPCellEventForwarder0.addCellEvent((com.lowagie.text.pdf.PdfPCellEvent) fieldPositioningEvents1);
        fieldPositioningEvents1.setPadding((float) 13);
    }

    @Test
    void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test059");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        float f3 = pdfPCell2.getIndent();
        float f4 = pdfPCell2.getFollowingIndent();
        pdfPCell2.setFollowingIndent((float) 9);
        pdfPCell2.setMinimumHeight(34.0f);
        assertNotNull(pdfPCell2);
        assertEquals(0.0f, f3);
        assertEquals(0.0f, f4);
    }

    @Test
    void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test060");
        com.lowagie.text.Font font1 = null;
        com.lowagie.text.Footnote footnote2 = new com.lowagie.text.Footnote("", font1);
        com.lowagie.text.HeaderFooter headerFooter4 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote2, true);
        headerFooter4.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph7 = headerFooter4.paragraph();
        com.lowagie.text.ChapterAutoNumber chapterAutoNumber8 = new com.lowagie.text.ChapterAutoNumber(paragraph7);
        com.lowagie.text.Section section12 = chapterAutoNumber8.addSection((float) 300, "margin", 2147483647);
        chapterAutoNumber8.setIndentationRight((float) 1040);
        assertNotNull(paragraph7);
        assertNotNull(section12);
    }

    @Test
    void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test061");
        com.lowagie.text.Chunk chunk1 = new com.lowagie.text.Chunk('d');
    }

    @Test
    void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test062");
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
        com.lowagie.text.pdf.PdfDictionary pdfDictionary48 = imgJBIG2_45.getAdditional();
        imgJBIG2_45.setGrayFill((float) 472);
        assertNotNull(char_array3);
        assertNotNull(pdfContentByte12);
        assertNotNull(graphics2D20);
        assertNotNull(graphics2D24);
        assertNotNull(byte_array33);
        assertNotNull(byte_array40);
        assertEquals(i46, (-1));
        assertNull(pdfDictionary48);
    }

    @Test
    void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test063");
        com.lowagie.text.Anchor anchor1 = new com.lowagie.text.Anchor((float) 527);
    }

    @Test
    void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test064");
        java.lang.String str0 = com.lowagie.text.FontFactory.COURIER;
        assertEquals("Courier", str0, "'" + str0 + "' != '" + "Courier" + "'");
    }

    @Test
    void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test065");
        com.lowagie.text.FontFactoryImp fontFactoryImp0 = new com.lowagie.text.FontFactoryImp();
        fontFactoryImp0.register("underline");
        java.util.Set set3 = fontFactoryImp0.getRegisteredFonts();
        java.util.Set set4 = fontFactoryImp0.getRegisteredFamilies();
        assertNotNull(set3);
        assertNotNull(set4);
    }

    @Test
    void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test066");
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = null;
        char[] char_array6 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font8 = new com.lowagie.text.pdf.Type3Font(pdfWriter3, char_array6, true);
        boolean b10 = com.lowagie.text.Utilities.isSurrogatePair(char_array6, 30);
        com.lowagie.text.pdf.hyphenation.CharVector charVector12 = new com.lowagie.text.pdf.hyphenation.CharVector(char_array6, 322);
        int i14 = charVector12.alloc(8196);
        charVector12.trimToSize();
        com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS pPKMS16 = new com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS();
        com.lowagie.text.pdf.PdfReader pdfReader17 = null;
        byte[] byte_array22 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream23 = new com.lowagie.text.pdf.PRStream(pdfReader17, byte_array22);
        pPKMS16.setCert(byte_array22);
        com.lowagie.text.pdf.PdfName pdfName25 = com.lowagie.text.pdf.PdfName.XFA;
        com.lowagie.text.pdf.PdfObject pdfObject26 = pPKMS16.get(pdfName25);
        java.lang.String str27 = com.lowagie.text.error_messages.MessageLocalization.getComposedMessage("xmpMM:ManageUI", (java.lang.Object) "numberdepth", (java.lang.Object) "padding-top", (java.lang.Object) charVector12, (java.lang.Object) pdfObject26);
        int i28 = charVector12.length();
        assertNotNull(char_array6);
        assertEquals(false, b10);
        assertEquals(2, i14);
        assertNotNull(byte_array22);
        assertNotNull(pdfName25);
        assertNull(pdfObject26);
        assertEquals("No message found for xmpMM:ManageUI", str27, "'" + str27 + "' != '" + "No message found for xmpMM:ManageUI" + "'");
        assertEquals(8198, i28);
    }

    @Test
    void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test067");
        com.lowagie.text.pdf.codec.wmf.MetaState metaState0 = new com.lowagie.text.pdf.codec.wmf.MetaState();
        float f1 = metaState0.scalingY;
        java.awt.Color color3 = java.awt.Color.orange;
        java.awt.Color color4 = java.awt.Color.getColor("block", color3);
        metaState0.setCurrentTextColor(color4);
        assertEquals(0.0f, f1);
        assertNotNull(color3);
        assertNotNull(color4);
    }

    @Test
    void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test068");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        pdfPTable1.setFooterRows((-1));
        pdfPTable1.setSpacingBefore((float) 20);
        pdfPTable1.setExtendLastRow(false, true);
        float f11 = pdfPTable1.getRowHeight(8192);
        pdfPTable1.setSkipFirstHeader(false);
        assertNotNull(pdfPCell2);
        assertEquals(0.0f, f11);
    }

    @Test
    void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test069");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        float f3 = pdfPCell2.getPaddingRight();
        com.lowagie.text.Image image4 = pdfPCell2.getImage();
        assertNotNull(pdfPCell2);
        assertEquals(2.0f, f3);
        assertNull(image4);
    }

    @Test
    void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test070");
        com.lowagie.text.exceptions.InvalidPdfException invalidPdfException1 = new com.lowagie.text.exceptions.InvalidPdfException("xmpMM:ManagerVariant");
    }

    @Test
    void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test071");
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
        boolean b17 = pdfXConformanceImp0.isPdfX1A2001();
        com.lowagie.text.pdf.PdfReader pdfReader18 = null;
        byte[] byte_array23 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream24 = new com.lowagie.text.pdf.PRStream(pdfReader18, byte_array23);
        com.lowagie.text.pdf.PdfReader pdfReader25 = null;
        byte[] byte_array30 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream31 = new com.lowagie.text.pdf.PRStream(pdfReader25, byte_array30);
        pRStream24.setData(byte_array30, false, (int) (byte) 100);
        byte[] byte_array35 = pRStream24.getBytes();
        boolean b36 = pRStream24.isPages();
        boolean b37 = pRStream24.isPage();
        pdfXConformanceImp0.completeExtraCatalog((com.lowagie.text.pdf.PdfDictionary) pRStream24);
        assertNotNull(rectangle9);
        assertNotNull(f_array14);
        assertNotNull(pdfAnnotation15);
        assertEquals(false, b17);
        assertNotNull(byte_array23);
        assertNotNull(byte_array30);
        assertNotNull(byte_array35);
        assertEquals(false, b36);
        assertEquals(false, b37);
    }

    @Test
    void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test072");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.PERMS;
        assertNotNull(pdfName0);
    }

    @Test
    void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test073");
        com.lowagie.text.Chapter chapter1 = new com.lowagie.text.Chapter((int) (short) -1);
        com.lowagie.text.MarkedSection markedSection2 = chapter1.addMarkedSection();
        java.io.OutputStream outputStream4 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields6 = new com.lowagie.text.pdf.PdfCopyFields(outputStream4, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter7 = pdfCopyFields6.getWriter();
        int i8 = pdfWriter7.getCurrentPageNumber();
        pdfWriter7.setLinearPageMode();
        com.lowagie.text.pdf.PdfWriter pdfWriter10 = null;
        char[] char_array13 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font15 = new com.lowagie.text.pdf.Type3Font(pdfWriter10, char_array13, true);
        com.lowagie.text.pdf.Type3Font type3Font17 = new com.lowagie.text.pdf.Type3Font(pdfWriter7, char_array13, false);
        java.lang.String[][] str_array_array18 = type3Font17.getFamilyFontName();
        try {
            markedSection2.add(20, (java.lang.Object) type3Font17);
            fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        assertNotNull(markedSection2);
        assertNotNull(pdfWriter7);
        assertEquals(1, i8);
        assertNotNull(char_array13);
        assertNotNull(str_array_array18);
    }

    @Test
    void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test074");
        com.lowagie.text.RectangleReadOnly rectangleReadOnly4 = new com.lowagie.text.RectangleReadOnly((float) (byte) 100, (float) 1336, (float) 'Ë', (float) 9);
        try {
            rectangleReadOnly4.setRight((float) 'Ç');
            fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
    }

    @Test
    void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test075");
        com.lowagie.text.pdf.events.FieldPositioningEvents fieldPositioningEvents0 = new com.lowagie.text.pdf.events.FieldPositioningEvents();
        fieldPositioningEvents0.padding = 14;
        com.lowagie.text.pdf.PdfPTable pdfPTable4 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell5 = pdfPTable4.getDefaultCell();
        float f6 = pdfPCell5.getIndent();
        float f7 = pdfPCell5.getFollowingIndent();
        com.lowagie.text.pdf.PdfPTable pdfPTable9 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell10 = pdfPTable9.getDefaultCell();
        float f11 = pdfPCell10.getIndent();
        com.lowagie.text.pdf.PdfPTable pdfPTable12 = pdfPCell10.getTable();
        pdfPCell5.softCloneNonPositionParameters((com.lowagie.text.Rectangle) pdfPCell10);
        com.lowagie.text.pdf.PdfPTable pdfPTable15 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell16 = pdfPTable15.getDefaultCell();
        float f17 = pdfPCell16.getMaxHeight();
        byte[] byte_array20 = null;
        com.lowagie.text.pdf.PdfReader pdfReader21 = null;
        byte[] byte_array26 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream27 = new com.lowagie.text.pdf.PRStream(pdfReader21, byte_array26);
        com.lowagie.text.pdf.PdfReader pdfReader28 = null;
        byte[] byte_array33 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream34 = new com.lowagie.text.pdf.PRStream(pdfReader28, byte_array33);
        pRStream27.setData(byte_array33, false, (int) (byte) 100);
        com.lowagie.text.ImgJBIG2 imgJBIG2_38 = new com.lowagie.text.ImgJBIG2(4, 1564, byte_array20, byte_array33);
        int i39 = imgJBIG2_38.getCompressionLevel();
        java.lang.String str40 = imgJBIG2_38.getAlt();
        imgJBIG2_38.setOriginalType((int) 'Ë');
        com.lowagie.text.pdf.PdfTemplate pdfTemplate43 = imgJBIG2_38.getTemplateData();
        pdfPCell16.setImage((com.lowagie.text.Image) imgJBIG2_38);
        com.lowagie.text.pdf.PdfPCell[] pdfPCell_array45 = new com.lowagie.text.pdf.PdfPCell[]{};
        com.lowagie.text.pdf.PdfPRow pdfPRow46 = new com.lowagie.text.pdf.PdfPRow(pdfPCell_array45);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte51 = null;
        com.lowagie.text.pdf.PdfContentByte[] pdfContentByte_array52 = new com.lowagie.text.pdf.PdfContentByte[]{pdfContentByte51};
        pdfPRow46.writeCells(526, 6, (float) (short) 1, (float) 53, pdfContentByte_array52);
        try {
            fieldPositioningEvents0.cellLayout(pdfPCell5, (com.lowagie.text.Rectangle) pdfPCell16, pdfContentByte_array52);
            fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        assertNotNull(pdfPCell5);
        assertEquals(0.0f, f6);
        assertEquals(0.0f, f7);
        assertNotNull(pdfPCell10);
        assertEquals(0.0f, f11);
        assertNull(pdfPTable12);
        assertNotNull(pdfPCell16);
        assertEquals(4.0f, f17);
        assertNotNull(byte_array26);
        assertNotNull(byte_array33);
        assertEquals(i39, (-1));
        assertNull(str40);
        assertNull(pdfTemplate43);
        assertNotNull(pdfPCell_array45);
        assertNotNull(pdfContentByte_array52);
    }

    @Test
    void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test076");
        com.lowagie.text.Document.plainRandomAccess = false;
    }

    @Test
    void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test077");
        com.lowagie.text.Annotation annotation8 = new com.lowagie.text.Annotation((float) '4', (float) 1, (float) '4', (float) 29, "listitem", "absolutey", "hi!", "ZapfDingbats");
        float f9 = annotation8.ury();
        java.lang.String str10 = annotation8.content();
        assertEquals(29.0f, f9);
        assertEquals("", str10, "'" + str10 + "' != '" + "" + "'");
    }

    @Test
    void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test078");
        java.io.InputStream inputStream0 = null;
        com.lowagie.text.pdf.PdfContentByte pdfContentByte1 = null;
        com.lowagie.text.pdf.codec.wmf.MetaDo metaDo2 = new com.lowagie.text.pdf.codec.wmf.MetaDo(inputStream0, pdfContentByte1);
        java.io.InputStream inputStream3 = null;
        com.lowagie.text.pdf.codec.wmf.InputMeta inputMeta4 = new com.lowagie.text.pdf.codec.wmf.InputMeta(inputStream3);
        int i5 = inputMeta4.getLength();
        metaDo2.in = inputMeta4;
        try {
            int i7 = inputMeta4.readByte();
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertEquals(0, i5);
    }

    @Test
    void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test079");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ASSETS;
        assertNotNull(pdfName0);
    }

    @Test
    void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test080");
        com.lowagie.text.pdf.codec.wmf.MetaState metaState0 = new com.lowagie.text.pdf.codec.wmf.MetaState();
        float f1 = metaState0.scalingY;
        metaState0.setOffsetWy((int) (byte) 47);
        int i4 = metaState0.textAlign;
        metaState0.setExtentWy((int) 'd');
        com.lowagie.text.pdf.codec.wmf.MetaObject metaObject8 = new com.lowagie.text.pdf.codec.wmf.MetaObject((int) (short) 100);
        metaState0.addMetaObject(metaObject8);
        float f11 = metaState0.transformX(1565);
        assertEquals(0.0f, f1);
        assertEquals(0, i4);
        assertEquals((float) f11, Float.NaN, 0);
    }

    @Test
    void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test081");
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
        pdfContentByte19.resetGrayStroke();
        assertEquals(0, i5);
        assertNotNull(char_array10);
        assertNotNull(pdfContentByte19);
    }

    @Test
    void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test082");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.LISTMODE;
        assertNotNull(pdfName0);
    }

    @Test
    void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test083");
        com.lowagie.text.Cell cell1 = new com.lowagie.text.Cell(false);
        cell1.setColspan(1040);
        cell1.setUseAscender(false);
        boolean b6 = cell1.isUseBorderPadding();
        assertEquals(false, b6);
    }

    @Test
    void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test084");
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
        com.lowagie.text.pdf.PdfName pdfName52 = com.lowagie.text.pdf.PdfName.AA;
        com.lowagie.text.pdf.PdfIndirectReference pdfIndirectReference53 = null;
        try {
            com.lowagie.text.pdf.PdfIndirectObject pdfIndirectObject55 = pdfWriter4.addToBody((com.lowagie.text.pdf.PdfObject) pdfName52, pdfIndirectReference53, false);
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
        assertNotNull(pdfPCell44);
        assertEquals(0.0f, f45);
        assertEquals(0.0f, f46);
        assertNotNull(pdfName52);
    }

    @Test
    void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test085");
        com.lowagie.text.pdf.BaseFont baseFont0 = null;
        com.lowagie.text.Font font3 = new com.lowagie.text.Font(baseFont0, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont5 = font3.getCalculatedBaseFont(false);
        boolean b8 = baseFont5.setCharAdvance(9, 0);
        java.lang.String[] str_array9 = baseFont5.getCodePagesSupported();
        int[] i_array11 = new int[]{763};
        baseFont5.addSubsetRange(i_array11);
        assertNotNull(baseFont5);
        assertEquals(true, b8);
        assertNotNull(str_array9);
        assertNotNull(i_array11);
    }

    @Test
    void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test086");
        java.io.OutputStream outputStream0 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields2 = new com.lowagie.text.pdf.PdfCopyFields(outputStream0, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = pdfCopyFields2.getWriter();
        int i4 = pdfWriter3.getCurrentPageNumber();
        pdfWriter3.setLinearPageMode();
        int i6 = pdfWriter3.getPageNumber();
        pdfWriter3.setDuration(0);
        assertNotNull(pdfWriter3);
        assertEquals(1, i4);
        assertEquals(0, i6);
    }

    @Test
    void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test087");
        com.lowagie.text.pdf.PdfPKCS7.X509NameTokenizer x509NameTokenizer1 = new com.lowagie.text.pdf.PdfPKCS7.X509NameTokenizer("");
    }

    @Test
    void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test088");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfAcroForm pdfAcroForm1 = new com.lowagie.text.pdf.PdfAcroForm(pdfWriter0);
        pdfAcroForm1.setNeedAppearances(true);
        boolean b4 = pdfAcroForm1.isDictionary();
        com.lowagie.text.pdf.PdfWriter pdfWriter5 = null;
        com.lowagie.text.pdf.PdfAcroForm pdfAcroForm6 = new com.lowagie.text.pdf.PdfAcroForm(pdfWriter5);
        pdfAcroForm6.setNeedAppearances(true);
        boolean b9 = pdfAcroForm6.isDictionary();
        com.lowagie.text.pdf.PdfFormField pdfFormField13 = pdfAcroForm6.getRadioGroup("", "bgblue", true);
        try {
            pdfAcroForm1.drawCheckBoxAppearences(pdfFormField13, "Times-BoldItalic", 0.0f, 0.0f, (float) 7, 0.0f);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertEquals(true, b4);
        assertEquals(true, b9);
        assertNotNull(pdfFormField13);
    }

    @Test
    void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test089");
        java.security.cert.Certificate certificate1 = null;
        java.security.Key key2 = null;
        try {
            com.lowagie.text.pdf.PdfReader pdfReader4 = new com.lowagie.text.pdf.PdfReader("xmpMM:History", certificate1, key2, "Middle");
            fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
    }

    @Test
    void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test090");
        com.lowagie.text.pdf.PdfPKCS7.X509NameTokenizer x509NameTokenizer1 = new com.lowagie.text.pdf.PdfPKCS7.X509NameTokenizer("destination");
    }

    @Test
    void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test091");
        com.lowagie.text.pdf.BarcodePDF417 barcodePDF417_0 = new com.lowagie.text.pdf.BarcodePDF417();
        int i1 = barcodePDF417_0.getBitColumns();
        int i2 = barcodePDF417_0.getCodeRows();
        int[] i_array3 = barcodePDF417_0.getCodewords();
        barcodePDF417_0.setLenCodewords(23);
        assertEquals(0, i1);
        assertEquals(0, i2);
        assertNotNull(i_array3);
    }

    @Test
    void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test092");
        com.lowagie.text.pdf.IntHashtable intHashtable0 = new com.lowagie.text.pdf.IntHashtable();
        boolean b2 = intHashtable0.containsValue(1785737760);
        int[] i_array3 = intHashtable0.getKeys();
        int[] i_array4 = intHashtable0.getKeys();
        int i6 = intHashtable0.get(9);
        int i8 = intHashtable0.remove((int) 'Ã');
        int[] i_array9 = intHashtable0.getKeys();
        int[] i_array10 = intHashtable0.toOrderedKeys();
        int[] i_array11 = intHashtable0.toOrderedKeys();
        java.util.Iterator iterator12 = intHashtable0.getEntryIterator();
        assertEquals(false, b2);
        assertNotNull(i_array3);
        assertNotNull(i_array4);
        assertEquals(0, i6);
        assertEquals(0, i8);
        assertNotNull(i_array9);
        assertNotNull(i_array10);
        assertNotNull(i_array11);
        assertNotNull(iterator12);
    }

    @Test
    void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test093");
        com.lowagie.text.RomanList romanList2 = new com.lowagie.text.RomanList(true, 247);
        boolean b3 = romanList2.isAutoindent();
        com.lowagie.text.pdf.PdfWriter pdfWriter4 = null;
        com.lowagie.text.Font font6 = null;
        com.lowagie.text.Footnote footnote7 = new com.lowagie.text.Footnote("", font6);
        com.lowagie.text.HeaderFooter headerFooter9 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote7, true);
        headerFooter9.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle12 = headerFooter9.rotate();
        float[][] f_array_array14 = new float[][]{};
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation15 = com.lowagie.text.pdf.PdfAnnotation.createInk(pdfWriter4, (com.lowagie.text.Rectangle) headerFooter9, "widths", f_array_array14);
        boolean b16 = romanList2.add((java.lang.Object) "widths");
        float f17 = romanList2.getSymbolIndent();
        assertEquals(false, b3);
        assertNotNull(rectangle12);
        assertNotNull(f_array_array14);
        assertNotNull(pdfAnnotation15);
        assertEquals(false, b16);
        assertEquals(247.0f, f17);
    }

    @Test
    void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test094");
        byte[] byte_array2 = null;
        com.lowagie.text.pdf.PdfReader pdfReader3 = null;
        byte[] byte_array8 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream9 = new com.lowagie.text.pdf.PRStream(pdfReader3, byte_array8);
        com.lowagie.text.pdf.PdfReader pdfReader10 = null;
        byte[] byte_array15 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream16 = new com.lowagie.text.pdf.PRStream(pdfReader10, byte_array15);
        pRStream9.setData(byte_array15, false, (int) (byte) 100);
        com.lowagie.text.ImgJBIG2 imgJBIG2_20 = new com.lowagie.text.ImgJBIG2(4, 1564, byte_array2, byte_array15);
        byte[] byte_array21 = null;
        imgJBIG2_20.setOriginalData(byte_array21);
        com.lowagie.text.Image image23 = imgJBIG2_20.getImageMask();
        imgJBIG2_20.setOriginalType(1791);
        com.lowagie.text.Chunk chunk28 = new com.lowagie.text.Chunk((com.lowagie.text.Image) imgJBIG2_20, (float) 4096, 20000.0f);
        assertNotNull(byte_array8);
        assertNotNull(byte_array15);
        assertNull(image23);
    }

    @Test
    void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test095");
        java.lang.String str1 = com.lowagie.text.pdf.BarcodeEAN.convertUPCAtoUPCE("page-break-before");
        assertNull(str1);
    }

    @Test
    void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test096");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        float f3 = pdfPTable1.getRowHeight(1785737760);
        pdfPTable1.setExtendLastRow(false);
        int i6 = pdfPTable1.size();
        java.util.ArrayList arrayList7 = pdfPTable1.getChunks();
        assertEquals(0.0f, f3);
        assertEquals(0, i6);
        assertNotNull(arrayList7);
    }

    @Test
    void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test097");
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
        short s44 = randomAccessFileOrArray41.readShort();
        java.lang.String str45 = randomAccessFileOrArray41.readLine();
        assertNotNull(byte_array5);
        assertNotNull(byte_array12);
        assertNotNull(byte_array17);
        assertEquals(false, b18);
        assertNotNull(byte_array24);
        assertNotNull(byte_array31);
        assertNotNull(byte_array36);
        assertNotNull(byte_array40);
        assertNotNull(byte_array42);
        assertEquals(s44, (short) 25610);
        assertNull(str45);
    }

    @Test
    void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test098");
        com.lowagie.text.Font font1 = null;
        com.lowagie.text.Footnote footnote2 = new com.lowagie.text.Footnote("", font1);
        com.lowagie.text.HeaderFooter headerFooter4 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote2, true);
        headerFooter4.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle7 = headerFooter4.rotate();
        com.lowagie.text.Rectangle rectangle8 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter4);
        com.lowagie.text.Document document9 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter4);
        boolean b11 = document9.setMarginMirroringTopBottom(true);
        com.lowagie.text.Rectangle rectangle12 = com.lowagie.text.PageSize.ID_2;
        boolean b13 = document9.setPageSize(rectangle12);
        float f15 = document9.right(33.360004f);
        float f17 = document9.left((float) 8192);
        assertNotNull(rectangle7);
        assertEquals(true, b11);
        assertNotNull(rectangle12);
        assertEquals(true, b13);
        assertEquals(227.64f, f15);
        assertEquals(8228.0f, f17);
    }

    @Test
    void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test099");
        int i0 = com.lowagie.text.Element.ROW;
        assertEquals(21, i0);
    }

    @Test
    void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test100");
        int i0 = com.lowagie.text.pdf.codec.wmf.MetaState.TA_LEFT;
        assertEquals(0, i0);
    }

    @Test
    void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test101");
        java.lang.String str0 = com.lowagie.text.ElementTags.BORDERWIDTH;
        assertEquals("borderwidth", str0, "'" + str0 + "' != '" + "borderwidth" + "'");
    }

    @Test
    void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test102");
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
        boolean b25 = imgJBIG2_20.isSmask();
        assertNotNull(byte_array8);
        assertNotNull(byte_array15);
        assertEquals(0, i21);
        assertNull(i_array22);
        assertEquals(4.0f, f23);
        assertEquals(false, b25);
    }

    @Test
    void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test103");
        java.lang.String str1 = com.lowagie.text.factories.RomanNumberFactory.getUpperCaseString(224);
        assertEquals("CCXXIV", str1, "'" + str1 + "' != '" + "CCXXIV" + "'");
    }

    @Test
    void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test104");
        com.lowagie.text.ZapfDingbatsList zapfDingbatsList2 = new com.lowagie.text.ZapfDingbatsList(2, 2368);
        zapfDingbatsList2.setAutoindent(false);
        zapfDingbatsList2.setFirst((int) (byte) -1);
        zapfDingbatsList2.setCharNumber((int) 'e');
        boolean b9 = zapfDingbatsList2.isEmpty();
        assertEquals(true, b9);
    }

    @Test
    void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test105");
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
        int i34 = pdfPTable33.getFooterRows();
        assertNotNull(f_array7);
        assertNotNull(f_array9);
        assertNotNull(f_array15);
        assertNotNull(rectangle24);
        assertNotNull(f_array29);
        assertNotNull(pdfAnnotation30);
        assertNotNull(pdfFunction32);
        assertEquals(0, i34);
    }

    @Test
    void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test106");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte12 = type3Font5.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte12.fillStroke();
        com.lowagie.text.pdf.FontMapper fontMapper16 = null;
        java.awt.print.PrinterJob printerJob19 = null;
        java.awt.Graphics2D graphics2D20 = pdfContentByte12.createPrinterGraphics((-1.0f), (float) (-1), fontMapper16, true, (float) (byte) 1, printerJob19);
        pdfContentByte12.resetRGBColorFill();
        try {
            pdfContentByte12.showText("[/FlashVars]");
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(char_array3);
        assertNotNull(pdfContentByte12);
        assertNotNull(graphics2D20);
    }

    @Test
    void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test107");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.EMBEDDEDFILES;
        assertNotNull(pdfName0);
    }

    @Test
    void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test108");
        com.lowagie.text.Font font4 = com.lowagie.text.FontFactory.getFont("embedded", "", false, (float) (byte) 48);
        assertNotNull(font4);
    }

    @Test
    void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test109");
        com.lowagie.text.FontFactoryImp fontFactoryImp0 = new com.lowagie.text.FontFactoryImp();
        fontFactoryImp0.register("underline");
        com.lowagie.text.Font font4 = fontFactoryImp0.getFont("￼");
        java.util.Set set5 = fontFactoryImp0.getRegisteredFamilies();
        com.lowagie.text.pdf.PdfShadingPattern pdfShadingPattern8 = null;
        com.lowagie.text.pdf.ShadingColor shadingColor9 = new com.lowagie.text.pdf.ShadingColor(pdfShadingPattern8);
        com.lowagie.text.Font font10 = fontFactoryImp0.getFont("destination", (float) 256, (java.awt.Color) shadingColor9);
        assertNotNull(font4);
        assertNotNull(set5);
        assertNotNull(font10);
    }

    @Test
    void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test110");
        com.lowagie.text.ZapfDingbatsNumberList zapfDingbatsNumberList2 = new com.lowagie.text.ZapfDingbatsNumberList(302, 302);
    }

    @Test
    void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test111");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.NAMED;
        assertNotNull(pdfName0);
    }

    @Test
    void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test112");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Cell cell5 = com.lowagie.text.factories.ElementFactory.getCell(properties1);
        boolean b6 = cell5.isUseBorderPadding();
        cell5.setHorizontalAlignment("Times-Bold");
        boolean b9 = cell5.isHeader();
        cell5.setUseBorderPadding(true);
        byte[] byte_array14 = null;
        com.lowagie.text.pdf.PdfReader pdfReader15 = null;
        byte[] byte_array20 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream21 = new com.lowagie.text.pdf.PRStream(pdfReader15, byte_array20);
        com.lowagie.text.pdf.PdfReader pdfReader22 = null;
        byte[] byte_array27 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream28 = new com.lowagie.text.pdf.PRStream(pdfReader22, byte_array27);
        pRStream21.setData(byte_array27, false, (int) (byte) 100);
        com.lowagie.text.ImgJBIG2 imgJBIG2_32 = new com.lowagie.text.ImgJBIG2(4, 1564, byte_array14, byte_array27);
        boolean b33 = imgJBIG2_32.isImgRaw();
        imgJBIG2_32.setRotationDegrees((float) 29);
        int i36 = imgJBIG2_32.getBpc();
        float f37 = imgJBIG2_32.getScaledHeight();
        cell5.addElement((com.lowagie.text.Element) imgJBIG2_32);
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(cell5);
        assertEquals(false, b6);
        assertEquals(false, b9);
        assertNotNull(byte_array20);
        assertNotNull(byte_array27);
        assertEquals(false, b33);
        assertEquals(1, i36);
        assertEquals(1369.8444f, f37);
    }

    @Test
    void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test113");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Phrase phrase5 = com.lowagie.text.factories.ElementFactory.getPhrase(properties1);
        java.util.Set set6 = com.lowagie.text.Utilities.getKeySet((java.util.Hashtable) properties1);
        java.util.Enumeration<?> enumeration_wildcard7 = properties1.propertyNames();
        com.lowagie.text.List list8 = com.lowagie.text.factories.ElementFactory.getList(properties1);
        float f9 = list8.getIndentationRight();
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(phrase5);
        assertNotNull(set6);
        assertNotNull(enumeration_wildcard7);
        assertNotNull(list8);
        assertEquals(0.0f, f9);
    }

    @Test
    void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test114");
        com.lowagie.text.pdf.PdfRectangle pdfRectangle4 = new com.lowagie.text.pdf.PdfRectangle((float) 4, (-172.0f), (float) 22, (float) (byte) 32);
    }

    @Test
    void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test115");
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
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper53 = new com.lowagie.text.pdf.PdfPageEventHelper();
        java.io.OutputStream outputStream54 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields56 = new com.lowagie.text.pdf.PdfCopyFields(outputStream54, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter57 = pdfCopyFields56.getWriter();
        com.lowagie.text.Font font59 = null;
        com.lowagie.text.Footnote footnote60 = new com.lowagie.text.Footnote("", font59);
        com.lowagie.text.HeaderFooter headerFooter62 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote60, true);
        headerFooter62.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle65 = headerFooter62.rotate();
        com.lowagie.text.Rectangle rectangle66 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter62);
        com.lowagie.text.Document document67 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter62);
        boolean b69 = document67.setMarginMirroringTopBottom(true);
        com.lowagie.text.Font font73 = null;
        com.lowagie.text.Footnote footnote74 = new com.lowagie.text.Footnote("", font73);
        com.lowagie.text.HeaderFooter headerFooter76 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote74, true);
        headerFooter76.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph79 = headerFooter76.paragraph();
        pdfPageEventHelper53.onSection(pdfWriter57, document67, (float) 7, 262144, paragraph79);
        pdfWriter57.setStrictImageSequence(false);
        pdfWriter57.setEncryption(false, "true", "bottom", 1336);
        com.lowagie.text.pdf.PdfName pdfName89 = com.lowagie.text.pdf.PdfName.TI;
        com.lowagie.text.pdf.internal.PdfXConformanceImp.checkPDFXConformance(pdfWriter57, 15, (java.lang.Object) pdfName89);
        radioCheckField51.setWriter(pdfWriter57);
        radioCheckField51.setOnValue("localdestination");
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
        assertNotNull(pdfWriter57);
        assertNotNull(rectangle65);
        assertEquals(true, b69);
        assertNotNull(paragraph79);
        assertNotNull(pdfName89);
    }

    @Test
    void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test116");
        com.lowagie.text.pdf.PdfDate pdfDate0 = new com.lowagie.text.pdf.PdfDate();
    }

    @Test
    void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test117");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        float f3 = pdfPCell2.getMaxHeight();
        float f4 = pdfPCell2.getMinimumHeight();
        pdfPCell2.setIndent((float) 531);
        assertNotNull(pdfPCell2);
        assertEquals(4.0f, f3);
        assertEquals(0.0f, f4);
    }

    @Test
    void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test118");
        int[] i_array0 = com.lowagie.text.pdf.BaseFont.CHAR_RANGE_ARABIC;
        com.lowagie.text.pdf.PdfArray pdfArray1 = new com.lowagie.text.pdf.PdfArray(i_array0);
        com.lowagie.text.pdf.PdfName pdfName2 = com.lowagie.text.pdf.PdfName.I;
        pdfArray1.addFirst((com.lowagie.text.pdf.PdfObject) pdfName2);
        assertNotNull(i_array0);
        assertNotNull(pdfName2);
    }

    @Test
    void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test119");
        com.lowagie.text.pdf.IntHashtable intHashtable1 = new com.lowagie.text.pdf.IntHashtable(298);
    }

    @Test
    void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test120");
        java.io.InputStream inputStream0 = null;
        com.lowagie.text.pdf.PdfContentByte pdfContentByte1 = null;
        com.lowagie.text.pdf.codec.wmf.MetaDo metaDo2 = new com.lowagie.text.pdf.codec.wmf.MetaDo(inputStream0, pdfContentByte1);
        try {
            metaDo2.strokeAndFill();
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test121");
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
        try {
            columnText4.setRunDirection((int) 'Ê');
            fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        assertEquals(0.0f, f2);
        assertNull(pdfContentByte_array7);
        assertNotNull(columnText10);
    }

    @Test
    void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test122");
        com.lowagie.text.List list3 = new com.lowagie.text.List(false, false, (float) 1718909296);
    }

    @Test
    void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test123");
        com.lowagie.text.pdf.ByteBuffer byteBuffer1 = new com.lowagie.text.pdf.ByteBuffer(1564);
        byte[] byte_array4 = new byte[]{(byte) -1, (byte) 0};
        com.lowagie.text.pdf.PdfEFStream pdfEFStream5 = new com.lowagie.text.pdf.PdfEFStream(byte_array4);
        com.lowagie.text.pdf.OutputStreamEncryption outputStreamEncryption7 = new com.lowagie.text.pdf.OutputStreamEncryption((java.io.OutputStream) byteBuffer1, byte_array4, (int) (byte) 47);
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields8 = new com.lowagie.text.pdf.PdfCopyFields((java.io.OutputStream) outputStreamEncryption7);
        byte[] byte_array9 = com.lowagie.text.Jpeg.JFIF_ID;
        try {
            outputStreamEncryption7.write(byte_array9, 8192, (int) 'Ã');
            fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        assertNotNull(byte_array4);
        assertNotNull(byte_array9);
    }

    @Test
    void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test124");
        com.lowagie.text.pdf.draw.DottedLineSeparator dottedLineSeparator0 = new com.lowagie.text.pdf.draw.DottedLineSeparator();
        int i1 = dottedLineSeparator0.getAlignment();
        float f2 = dottedLineSeparator0.getLineWidth();
        assertEquals(1, i1);
        assertEquals(1.0f, f2);
    }

    @Test
    void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test125");
        com.lowagie.text.pdf.MultiColumnText multiColumnText0 = new com.lowagie.text.pdf.MultiColumnText();
        boolean b1 = multiColumnText0.isNestable();
        multiColumnText0.addSimpleColumn(8.0f, (float) 1768449138);
        assertEquals(false, b1);
    }

    @Test
    void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test126");
        int i0 = com.lowagie.text.Element.ALIGN_JUSTIFIED;
        assertEquals(3, i0);
    }

    @Test
    void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test127");
        com.lowagie.text.FontFactoryImp fontFactoryImp0 = new com.lowagie.text.FontFactoryImp();
        java.util.Set set1 = fontFactoryImp0.getRegisteredFamilies();
        assertNotNull(set1);
    }

    @Test
    void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test128");
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
        float f16 = table2.getPadding();
        assertNotNull(rectangle10);
        assertEquals(false, b15);
        assertEquals(0.0f, f16);
    }

    @Test
    void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test129");
        java.io.OutputStream outputStream0 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields2 = new com.lowagie.text.pdf.PdfCopyFields(outputStream0, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = pdfCopyFields2.getWriter();
        int i4 = pdfWriter3.getCurrentPageNumber();
        pdfWriter3.setLinearPageMode();
        com.lowagie.text.pdf.PdfWriter pdfWriter6 = null;
        char[] char_array9 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font11 = new com.lowagie.text.pdf.Type3Font(pdfWriter6, char_array9, true);
        com.lowagie.text.pdf.Type3Font type3Font13 = new com.lowagie.text.pdf.Type3Font(pdfWriter3, char_array9, false);
        com.lowagie.text.pdf.PdfPTable pdfPTable15 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell16 = pdfPTable15.getDefaultCell();
        float f17 = pdfPCell16.getIndent();
        com.lowagie.text.pdf.PdfPTable pdfPTable18 = pdfPCell16.getTable();
        pdfPCell16.setRowspan(34);
        pdfPCell16.setMinimumHeight((float) 1048576);
        com.lowagie.text.pdf.PdfName pdfName23 = null;
        com.lowagie.text.pdf.PdfDestination pdfDestination27 = new com.lowagie.text.pdf.PdfDestination((int) (byte) 47, (float) 1);
        com.lowagie.text.pdf.PdfIndirectReference pdfIndirectReference28 = null;
        boolean b29 = pdfDestination27.addPage(pdfIndirectReference28);
        try {
            com.lowagie.text.pdf.PdfAnnotation pdfAnnotation30 = com.lowagie.text.pdf.PdfAnnotation.createLink(pdfWriter3, (com.lowagie.text.Rectangle) pdfPCell16, pdfName23, 4096, pdfDestination27);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(pdfWriter3);
        assertEquals(1, i4);
        assertNotNull(char_array9);
        assertNotNull(pdfPCell16);
        assertEquals(0.0f, f17);
        assertNull(pdfPTable18);
        assertEquals(true, b29);
    }

    @Test
    void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test130");
        int i0 = com.lowagie.text.pdf.PdfWriter.RUN_DIRECTION_NO_BIDI;
        assertEquals(1, i0);
    }

    @Test
    void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test131");
        boolean b1 = com.lowagie.text.Utilities.isSurrogateHigh('Ã');
        assertEquals(false, b1);
    }

    @Test
    void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test132");
        com.lowagie.text.pdf.PdfString pdfString0 = new com.lowagie.text.pdf.PdfString();
        byte[] byte_array1 = pdfString0.getOriginalBytes();
        byte[] byte_array2 = pdfString0.getOriginalBytes();
        java.lang.String str3 = pdfString0.toString();
        assertNotNull(byte_array1);
        assertNotNull(byte_array2);
        assertEquals("", str3, "'" + str3 + "' != '" + "" + "'");
    }

    @Test
    void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test133");
        com.lowagie.text.pdf.BarcodeInter25 barcodeInter25_0 = new com.lowagie.text.pdf.BarcodeInter25();
        barcodeInter25_0.setAltText("pdf:Producer");
    }

    @Test
    void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test134");
        java.io.OutputStream outputStream0 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields2 = new com.lowagie.text.pdf.PdfCopyFields(outputStream0, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = pdfCopyFields2.getWriter();
        pdfWriter3.setFullCompression();
        com.lowagie.text.pdf.BaseFont baseFont5 = null;
        com.lowagie.text.Font font8 = new com.lowagie.text.Font(baseFont5, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont10 = font8.getCalculatedBaseFont(false);
        java.lang.String[] str_array11 = baseFont10.getCodePagesSupported();
        com.lowagie.text.pdf.PdfFormField pdfFormField13 = com.lowagie.text.pdf.PdfFormField.createList(pdfWriter3, str_array11, 4096);
        pdfFormField13.setValueAsString("verticalalign");
        boolean b16 = pdfFormField13.isAnnotation();
        assertNotNull(pdfWriter3);
        assertNotNull(baseFont10);
        assertNotNull(str_array11);
        assertNotNull(pdfFormField13);
        assertEquals(false, b16);
    }

    @Test
    void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test135");
        com.lowagie.text.pdf.PdfString pdfString0 = new com.lowagie.text.pdf.PdfString();
        byte[] byte_array1 = pdfString0.getOriginalBytes();
        try {
            com.lowagie.text.Image image2 = com.lowagie.text.Image.getInstance(byte_array1);
            fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        assertNotNull(byte_array1);
    }

    @Test
    void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test136");
        com.lowagie.text.pdf.crypto.ARCFOUREncryption aRCFOUREncryption0 = new com.lowagie.text.pdf.crypto.ARCFOUREncryption();
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
        aRCFOUREncryption0.encryptARCFOUR(byte_array49);
        com.lowagie.text.pdf.PdfReader pdfReader54 = null;
        byte[] byte_array59 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream60 = new com.lowagie.text.pdf.PRStream(pdfReader54, byte_array59);
        com.lowagie.text.pdf.PdfReader pdfReader61 = null;
        byte[] byte_array66 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream67 = new com.lowagie.text.pdf.PRStream(pdfReader61, byte_array66);
        pRStream60.setData(byte_array66, false, (int) (byte) 100);
        byte[] byte_array71 = pRStream60.getBytes();
        com.lowagie.text.pdf.PdfReader pdfReader72 = null;
        byte[] byte_array77 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream78 = new com.lowagie.text.pdf.PRStream(pdfReader72, byte_array77);
        com.lowagie.text.pdf.PdfReader pdfReader79 = null;
        byte[] byte_array84 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream85 = new com.lowagie.text.pdf.PRStream(pdfReader79, byte_array84);
        pRStream78.setData(byte_array84, false, (int) (byte) 100);
        byte[] byte_array89 = pRStream78.getBytes();
        pRStream60.setData(byte_array89);
        try {
            aRCFOUREncryption0.prepareARCFOURKey(byte_array89, 522, 1564);
            fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        assertNull(baseFont52);
        assertNotNull(byte_array59);
        assertNotNull(byte_array66);
        assertNotNull(byte_array71);
        assertNotNull(byte_array77);
        assertNotNull(byte_array84);
        assertNotNull(byte_array89);
    }

    @Test
    void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test137");
        com.lowagie.text.pdf.parser.TextAssembler textAssembler0 = null;
        com.lowagie.text.pdf.parser.PdfContentStreamHandler pdfContentStreamHandler1 = new com.lowagie.text.pdf.parser.PdfContentStreamHandler(textAssembler0);
        java.util.Map<java.lang.String, com.lowagie.text.pdf.parser.ContentOperator> map_str_contentOperator2 = null;
        pdfContentStreamHandler1.operators = map_str_contentOperator2;
        com.lowagie.text.pdf.parser.Matrix matrix4 = pdfContentStreamHandler1.textMatrix;
        com.lowagie.text.pdf.CMapAwareDocumentFont cMapAwareDocumentFont5 = pdfContentStreamHandler1.getCurrentFont();
        java.lang.String str6 = pdfContentStreamHandler1.getResultantText();
        assertNull(matrix4);
        assertNull(cMapAwareDocumentFont5);
        assertEquals("", str6, "'" + str6 + "' != '" + "" + "'");
    }

    @Test
    void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test138");
        com.lowagie.text.pdf.PdfAction pdfAction2 = new com.lowagie.text.pdf.PdfAction("table", "a");
        com.lowagie.text.Table table5 = new com.lowagie.text.Table(13, 1791);
        com.lowagie.text.Font font7 = null;
        com.lowagie.text.Footnote footnote8 = new com.lowagie.text.Footnote("", font7);
        com.lowagie.text.HeaderFooter headerFooter10 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote8, true);
        headerFooter10.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle13 = headerFooter10.rotate();
        com.lowagie.text.Rectangle rectangle14 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter10);
        com.lowagie.text.Document document15 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter10);
        java.io.OutputStream outputStream16 = null;
        com.lowagie.text.pdf.PdfCopy pdfCopy17 = new com.lowagie.text.pdf.PdfCopy(document15, outputStream16);
        boolean b18 = table5.process((com.lowagie.text.ElementListener) pdfCopy17);
        com.lowagie.text.pdf.events.IndexEvents indexEvents19 = new com.lowagie.text.pdf.events.IndexEvents();
        pdfCopy17.setPageEvent((com.lowagie.text.pdf.PdfPageEvent) indexEvents19);
        com.lowagie.text.pdf.ByteBuffer byteBuffer22 = new com.lowagie.text.pdf.ByteBuffer(1564);
        com.lowagie.text.pdf.ByteBuffer byteBuffer24 = byteBuffer22.append((double) 8192);
        pdfAction2.toPdf((com.lowagie.text.pdf.PdfWriter) pdfCopy17, (java.io.OutputStream) byteBuffer24);
        assertNotNull(rectangle13);
        assertEquals(false, b18);
        assertNotNull(byteBuffer24);
    }

    @Test
    void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test139");
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
        int i23 = imgJBIG2_20.getBpc();
        imgJBIG2_20.setXYRatio((float) 32);
        imgJBIG2_20.setSmask(false);
        assertNotNull(byte_array8);
        assertNotNull(byte_array15);
        assertEquals(i21, (-1));
        assertNull(str22);
        assertEquals(1, i23);
    }

    @Test
    void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test140");
        com.lowagie.text.xml.xmp.DublinCoreSchema dublinCoreSchema0 = new com.lowagie.text.xml.xmp.DublinCoreSchema();
        java.io.PrintStream printStream1 = null;
        try {
            dublinCoreSchema0.list(printStream1);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test141");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte12 = type3Font5.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte12.fillStroke();
        pdfContentByte12.resetCMYKColorStroke();
        com.lowagie.text.pdf.PdfWriter pdfWriter15 = null;
        char[] char_array18 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font20 = new com.lowagie.text.pdf.Type3Font(pdfWriter15, char_array18, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte27 = type3Font20.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte27.fillStroke();
        com.lowagie.text.pdf.FontMapper fontMapper31 = null;
        java.awt.print.PrinterJob printerJob34 = null;
        java.awt.Graphics2D graphics2D35 = pdfContentByte27.createPrinterGraphics((-1.0f), (float) (-1), fontMapper31, true, (float) (byte) 1, printerJob34);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte36 = pdfContentByte27.getDuplicate();
        pdfContentByte12.add(pdfContentByte36);
        assertNotNull(char_array3);
        assertNotNull(pdfContentByte12);
        assertNotNull(char_array18);
        assertNotNull(pdfContentByte27);
        assertNotNull(graphics2D35);
        assertNotNull(pdfContentByte36);
    }

    @Test
    void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test142");
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
        java.util.ArrayList arrayList41 = pdfPTable1.getChunks();
        float f42 = pdfPTable1.getWidthPercentage();
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
        assertNotNull(arrayList41);
        assertEquals(80.0f, f42);
    }

    @Test
    void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test143");
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
        imgJBIG2_20.setTop((float) 764);
        com.lowagie.text.pdf.PdfOCG pdfOCG26 = imgJBIG2_20.getLayer();
        assertNotNull(byte_array8);
        assertNotNull(byte_array15);
        assertEquals(0, i21);
        assertNull(pdfDictionary22);
        assertEquals(0, i23);
        assertNull(pdfOCG26);
    }

    @Test
    void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test144");
        com.lowagie.text.Font font5 = com.lowagie.text.FontFactory.getFont("JustifyAll", "border-bottom-width", (float) 'a', (int) (byte) 1);
        com.lowagie.text.Anchor anchor6 = new com.lowagie.text.Anchor("pdf:Producer", font5);
        java.util.ArrayList arrayList7 = anchor6.getChunks();
        assertNotNull(font5);
        assertNotNull(arrayList7);
    }

    @Test
    void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test145");
        java.io.InputStream inputStream0 = null;
        com.lowagie.text.pdf.PdfWriter pdfWriter1 = null;
        char[] char_array4 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font6 = new com.lowagie.text.pdf.Type3Font(pdfWriter1, char_array4, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte13 = type3Font6.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte13.rectangle((float) (-3), (float) 'a', (float) (-1), (float) (byte) 0);
        com.lowagie.text.pdf.PdfWriter pdfWriter19 = pdfContentByte13.getPdfWriter();
        pdfContentByte13.ellipse((-1048577.0f), (float) 258, (float) 11, 69.411f);
        com.lowagie.text.pdf.codec.wmf.MetaDo metaDo25 = new com.lowagie.text.pdf.codec.wmf.MetaDo(inputStream0, pdfContentByte13);
        pdfContentByte13.resetCMYKColorFill();
        assertNotNull(char_array4);
        assertNotNull(pdfContentByte13);
        assertNull(pdfWriter19);
    }

    @Test
    void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test146");
        int i2 = com.lowagie.text.FontFactory.registerDirectory("paragraph", false);
        assertEquals(0, i2);
    }

    @Test
    void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test147");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        pdfPTable1.setSpacingBefore((float) 15);
        com.lowagie.text.pdf.PdfPTable pdfPTable5 = new com.lowagie.text.pdf.PdfPTable(pdfPTable1);
        com.lowagie.text.pdf.PdfPTable pdfPTable6 = new com.lowagie.text.pdf.PdfPTable(pdfPTable5);
        pdfPTable6.setSkipLastFooter(true);
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper9 = new com.lowagie.text.pdf.PdfPageEventHelper();
        com.lowagie.text.pdf.PdfWriter pdfWriter10 = null;
        com.lowagie.text.Document document11 = null;
        pdfPageEventHelper9.onChapterEnd(pdfWriter10, document11, (float) 262144);
        java.io.OutputStream outputStream14 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields16 = new com.lowagie.text.pdf.PdfCopyFields(outputStream14, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter17 = pdfCopyFields16.getWriter();
        int i18 = pdfWriter17.getCurrentPageNumber();
        com.lowagie.text.Font font20 = null;
        com.lowagie.text.Footnote footnote21 = new com.lowagie.text.Footnote("", font20);
        com.lowagie.text.HeaderFooter headerFooter23 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote21, true);
        headerFooter23.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle26 = headerFooter23.rotate();
        com.lowagie.text.Rectangle rectangle27 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter23);
        com.lowagie.text.Document document28 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter23);
        boolean b30 = document28.setMarginMirroringTopBottom(true);
        pdfPageEventHelper9.onParagraphEnd(pdfWriter17, document28, 0.0f);
        com.lowagie.text.pdf.PdfPTable pdfPTable34 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell35 = pdfPTable34.getDefaultCell();
        float f36 = pdfPCell35.getMaxHeight();
        float f37 = pdfPCell35.getMinimumHeight();
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation38 = new com.lowagie.text.pdf.PdfAnnotation(pdfWriter17, (com.lowagie.text.Rectangle) pdfPCell35);
        float f39 = pdfPCell35.getSpaceCharRatio();
        pdfPTable6.addCell(pdfPCell35);
        assertNotNull(pdfPCell2);
        assertNotNull(pdfWriter17);
        assertEquals(1, i18);
        assertNotNull(rectangle26);
        assertEquals(true, b30);
        assertNotNull(pdfPCell35);
        assertEquals(4.0f, f36);
        assertEquals(0.0f, f37);
        assertEquals(0.0f, f39);
    }

    @Test
    void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test148");
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
        int i37 = pRStream6.getOffset();
        assertNotNull(byte_array5);
        assertNotNull(byte_array12);
        assertNotNull(byte_array17);
        assertNotNull(byte_array23);
        assertNotNull(byte_array30);
        assertNotNull(byte_array35);
        assertEquals(i37, (-1));
    }

    @Test
    void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test149");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte12 = type3Font5.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte12.fillStroke();
        com.lowagie.text.pdf.FontMapper fontMapper16 = null;
        java.awt.print.PrinterJob printerJob19 = null;
        java.awt.Graphics2D graphics2D20 = pdfContentByte12.createPrinterGraphics((-1.0f), (float) (-1), fontMapper16, true, (float) (byte) 1, printerJob19);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte21 = pdfContentByte12.getDuplicate();
        pdfContentByte21.setCMYKColorFill((int) 'd', 53, 496, 64);
        assertNotNull(char_array3);
        assertNotNull(pdfContentByte12);
        assertNotNull(graphics2D20);
        assertNotNull(pdfContentByte21);
    }

    @Test
    void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test150");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.THUMB;
        assertNotNull(pdfName0);
    }

    @Test
    void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test151");
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
        radioCheckField51.setCheckType(1);
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
    }

    @Test
    void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test152");
        java.io.PrintStream printStream0 = null;
        com.lowagie.text.pdf.PdfLister pdfLister1 = new com.lowagie.text.pdf.PdfLister(printStream0);
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
            pdfLister1.listAnyObject((com.lowagie.text.pdf.PdfObject) pRStream8);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
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
    void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test153");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        com.lowagie.text.pdf.parser.PdfTextExtractor pdfTextExtractor2 = new com.lowagie.text.pdf.parser.PdfTextExtractor(pdfReader0, true);
        try {
            java.lang.String str5 = pdfTextExtractor2.getTextFromPage(2368, false);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test154");
        com.lowagie.text.pdf.CMYKColor cMYKColor4 = new com.lowagie.text.pdf.CMYKColor((float) (short) 100, (float) 1, 100.0f, (float) 0);
        int i5 = cMYKColor4.getAlpha();
        assertEquals(255, i5);
    }

    @Test
    void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test155");
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
        java.lang.String str46 = randomAccessFileOrArray43.readLine();
        com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray47 = new com.lowagie.text.pdf.RandomAccessFileOrArray(randomAccessFileOrArray43);
        java.lang.String str48 = randomAccessFileOrArray47.readLine();
        assertNotNull(byte_array5);
        assertNotNull(byte_array12);
        assertNotNull(byte_array17);
        assertEquals(false, b18);
        assertNotNull(byte_array24);
        assertNotNull(byte_array31);
        assertNotNull(byte_array36);
        assertNotNull(byte_array40);
        assertNotNull(byte_array42);
        assertEquals("d", str46, "'" + str46 + "' != '" + "d" + "'");
        assertEquals("", str48, "'" + str48 + "' != '" + "" + "'");
    }

    @Test
    void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test156");
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
        int i54 = radioCheckField51.getMaxCharacterLength();
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
        assertEquals(1768449138, i54);
    }

    @Test
    void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test157");
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
        int i51 = pdfArray50.size();
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
        assertEquals(3, i51);
    }

    @Test
    void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test158");
        com.lowagie.text.pdf.PdfReader pdfReader1 = null;
        byte[] byte_array6 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream7 = new com.lowagie.text.pdf.PRStream(pdfReader1, byte_array6);
        com.lowagie.text.pdf.PdfReader pdfReader8 = null;
        byte[] byte_array13 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream14 = new com.lowagie.text.pdf.PRStream(pdfReader8, byte_array13);
        pRStream7.setData(byte_array13, false, (int) (byte) 100);
        byte[] byte_array18 = pRStream7.getBytes();
        com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray19 = new com.lowagie.text.pdf.RandomAccessFileOrArray(byte_array18);
        try {
            com.lowagie.text.pdf.PdfReader pdfReader20 = new com.lowagie.text.pdf.PdfReader("", byte_array18);
            fail("Expected exception of type com.lowagie.text.exceptions.InvalidPdfException");
        } catch (com.lowagie.text.exceptions.InvalidPdfException e) {
        }
        assertNotNull(byte_array6);
        assertNotNull(byte_array13);
        assertNotNull(byte_array18);
    }

    @Test
    void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test159");
        com.lowagie.text.Font font1 = null;
        com.lowagie.text.Footnote footnote2 = new com.lowagie.text.Footnote("", font1);
        com.lowagie.text.HeaderFooter headerFooter4 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote2, true);
        headerFooter4.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle7 = headerFooter4.rotate();
        com.lowagie.text.Rectangle rectangle8 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter4);
        headerFooter4.disableBorderSide(262);
        int i11 = headerFooter4.alignment();
        assertNotNull(rectangle7);
        assertEquals(0, i11);
    }

    @Test
    void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test160");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.SINGLEPAGE;
        assertNotNull(pdfName0);
    }

    @Test
    void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test161");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfAcroForm pdfAcroForm1 = new com.lowagie.text.pdf.PdfAcroForm(pdfWriter0);
        pdfAcroForm1.setNeedAppearances(true);
        boolean b4 = pdfAcroForm1.isDictionary();
        com.lowagie.text.pdf.PdfFormField pdfFormField8 = pdfAcroForm1.getRadioGroup("", "bgblue", true);
        boolean b9 = pdfAcroForm1.isValid();
        assertEquals(true, b4);
        assertNotNull(pdfFormField8);
        assertEquals(false, b9);
    }

    @Test
    void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test162");
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
        boolean b82 = pdfAnnotation28.isCatalog();
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
        assertEquals(false, b82);
    }

    @Test
    void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test163");
        com.lowagie.text.pdf.collection.PdfTargetDictionary pdfTargetDictionary1 = new com.lowagie.text.pdf.collection.PdfTargetDictionary(false);
        boolean b2 = pdfTargetDictionary1.isFont();
        assertEquals(false, b2);
    }

    @Test
    void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test164");
        java.lang.String str1 = com.lowagie.text.xml.simpleparser.EntitiesToUnicode.decodeString("0.0\t100.0\t0.0\n35.0\t-1.0\t0.0\n100.0\t-1.0\t1.0");
        assertEquals("0.0\t100.0\t0.0\n35.0\t-1.0\t0.0\n100.0\t-1.0\t1.0", str1, "'" + str1 + "' != '" + "0.0\t100.0\t0.0\n35.0\t-1.0\t0.0\n100.0\t-1.0\t1.0" + "'");
    }

    @Test
    void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test165");
        com.lowagie.text.Cell cell1 = new com.lowagie.text.Cell("true");
        boolean b2 = cell1.isTable();
        assertEquals(false, b2);
    }

    @Test
    void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test166");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfFormField pdfFormField1 = com.lowagie.text.pdf.PdfFormField.createCheckBox(pdfWriter0);
        pdfFormField1.setValueAsName("SKEW");
        com.lowagie.text.pdf.PdfFormField pdfFormField4 = pdfFormField1.getParent();
        pdfFormField1.setDefaultValueAsName("top");
        assertNotNull(pdfFormField1);
        assertNull(pdfFormField4);
    }

    @Test
    void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test167");
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
        float f29 = pdfPTable22.getRowspanHeight(0, 1685348972);
        assertEquals(0.0f, f3);
        assertEquals(false, b5);
        assertNotNull(pdfPCell11);
        assertEquals(0.0f, f12);
        assertEquals(0.0f, f13);
        assertNotNull(pdfPCell16);
        assertEquals(0.0f, f17);
        assertNull(pdfPTable18);
        assertEquals(0.0f, f24);
        assertEquals(0.0f, f29);
    }

    @Test
    void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test168");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.N;
        assertNotNull(pdfName0);
    }

    @Test
    void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test169");
        int i0 = com.lowagie.text.Font.BOLD;
        assertEquals(1, i0);
    }

    @Test
    void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test170");
        java.lang.String str2 = com.lowagie.text.error_messages.MessageLocalization.getComposedMessage("Stream", (int) (byte) 100);
        assertEquals("No message found for Stream", str2, "'" + str2 + "' != '" + "No message found for Stream" + "'");
    }

    @Test
    void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test171");
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
        boolean b30 = pdfPTable22.isNestable();
        float f32 = pdfPTable22.getRowHeight(2147483647);
        pdfPTable22.setComplete(false);
        float f36 = pdfPTable22.calculateHeights(true);
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
        assertEquals(true, b30);
        assertEquals(0.0f, f32);
        assertEquals(0.0f, f36);
    }

    @Test
    void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test172");
        byte[] byte_array0 = com.lowagie.text.pdf.PdfEncryption.createDocumentId();
        assertNotNull(byte_array0);
    }

    @Test
    void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test173");
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
        com.lowagie.text.Font font25 = com.lowagie.text.FontFactory.getFont("page-break-after", "face", (float) 30);
        com.lowagie.text.ListItem listItem26 = new com.lowagie.text.ListItem("border-bottom-width", font25);
        com.lowagie.text.Anchor anchor27 = new com.lowagie.text.Anchor("plainwidth", font25);
        java.util.ArrayList arrayList28 = anchor27.getChunks();
        java.lang.String str29 = anchor27.getName();
        item0.values = anchor27;
        java.util.ArrayList arrayList31 = item0.tabOrder;
        assertNotNull(font25);
        assertNotNull(arrayList28);
        assertNull(str29);
        assertNotNull(arrayList31);
    }

    @Test
    void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test174");
        com.lowagie.text.pdf.draw.DrawInterface drawInterface0 = null;
        com.lowagie.text.Chunk chunk2 = new com.lowagie.text.Chunk(drawInterface0, (float) 2368);
        com.lowagie.text.Chunk chunk4 = chunk2.setTextRise((float) 'Ã');
        com.lowagie.text.ListItem listItem5 = new com.lowagie.text.ListItem(chunk2);
        listItem5.setExtraParagraphSpace((float) 531);
        assertNotNull(chunk4);
    }

    @Test
    void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test175");
        java.util.HashMap hashMap0 = com.lowagie.text.xml.simpleparser.EntitiesToSymbol.map;
        com.lowagie.text.pdf.PdfPKCS7.X509Name.DefaultSymbols = hashMap0;
        assertNotNull(hashMap0);
    }

    @Test
    void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test176");
        com.lowagie.text.Table table2 = new com.lowagie.text.Table(13, 1791);
        table2.setLocked(false);
    }

    @Test
    void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test177");
        java.lang.String str0 = com.lowagie.text.pdf.PdfObject.NOTHING;
        assertEquals("", str0, "'" + str0 + "' != '" + "" + "'");
    }

    @Test
    void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test178");
        java.lang.String str0 = com.lowagie.text.html.Markup.CSS_VALUE_TEXTALIGNCENTER;
        assertEquals("center", str0, "'" + str0 + "' != '" + "center" + "'");
    }

    @Test
    void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test179");
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
        int i82 = pdfFormField80.size();
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
        assertEquals(4, i82);
    }

    @Test
    void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test180");
        com.lowagie.text.pdf.PdfDestination pdfDestination1 = new com.lowagie.text.pdf.PdfDestination((int) (short) -1);
        try {
            com.lowagie.text.pdf.PdfIndirectReference pdfIndirectReference3 = pdfDestination1.getAsIndirectObject((int) '搁');
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
    }

    @Test
    void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test181");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        boolean b3 = pdfPTable1.isExtendLastRow();
        pdfPTable1.setSplitLate(false);
        com.lowagie.text.pdf.PdfWriter pdfWriter12 = null;
        char[] char_array15 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font17 = new com.lowagie.text.pdf.Type3Font(pdfWriter12, char_array15, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte24 = type3Font17.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte24.fillStroke();
        com.lowagie.text.pdf.FontMapper fontMapper28 = null;
        java.awt.print.PrinterJob printerJob31 = null;
        java.awt.Graphics2D graphics2D32 = pdfContentByte24.createPrinterGraphics((-1.0f), (float) (-1), fontMapper28, true, (float) (byte) 1, printerJob31);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte33 = pdfContentByte24.getDuplicate();
        try {
            float f34 = pdfPTable1.writeSelectedRows(1042, (int) (short) 28769, 527, (int) (byte) 60, 1369.8444f, (float) 128, pdfContentByte24);
            fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        assertNotNull(pdfPCell2);
        assertEquals(false, b3);
        assertNotNull(char_array15);
        assertNotNull(pdfContentByte24);
        assertNotNull(graphics2D32);
        assertNotNull(pdfContentByte33);
    }

    @Test
    void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test182");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.FONTDESCRIPTOR;
        assertNotNull(pdfName0);
    }

    @Test
    void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test183");
        com.lowagie.text.Chapter chapter1 = new com.lowagie.text.Chapter((int) (short) -1);
        com.lowagie.text.MarkedSection markedSection2 = chapter1.addMarkedSection();
        com.lowagie.text.MarkedSection markedSection3 = chapter1.addMarkedSection();
        markedSection3.setBookmarkOpen(false);
        assertNotNull(markedSection2);
        assertNotNull(markedSection3);
    }

    @Test
    void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test184");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfGState.BM_COLORDODGE;
        assertNotNull(pdfName0);
    }

    @Test
    void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test185");
        java.awt.Color color0 = java.awt.Color.gray;
        com.lowagie.text.pdf.PdfArray pdfArray1 = com.lowagie.text.pdf.PdfAnnotation.getMKColor(color0);
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
        com.lowagie.text.pdf.PdfPTable pdfPTable35 = new com.lowagie.text.pdf.PdfPTable(f_array9);
        com.lowagie.text.pdf.PdfArray pdfArray36 = new com.lowagie.text.pdf.PdfArray(f_array9);
        float[] f_array37 = color0.getColorComponents(f_array9);
        assertNotNull(color0);
        assertNotNull(pdfArray1);
        assertNotNull(f_array9);
        assertNotNull(f_array11);
        assertNotNull(f_array17);
        assertNotNull(rectangle26);
        assertNotNull(f_array31);
        assertNotNull(pdfAnnotation32);
        assertNotNull(pdfFunction34);
        assertNotNull(f_array37);
    }

    @Test
    void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test186");
        java.lang.String str0 = com.lowagie.text.xml.xmp.XmpMMSchema.DEFAULT_XPATH_ID;
        assertEquals("xmpMM", str0, "'" + str0 + "' != '" + "xmpMM" + "'");
    }

    @Test
    void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test187");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.DP;
        assertNotNull(pdfName0);
    }

    @Test
    void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test188");
        java.awt.Color color0 = java.awt.Color.BLACK;
        java.awt.Color color1 = java.awt.Color.gray;
        com.lowagie.text.pdf.PdfArray pdfArray2 = com.lowagie.text.pdf.PdfAnnotation.getMKColor(color1);
        com.lowagie.text.pdf.PdfShading.checkCompatibleColors(color0, color1);
        assertNotNull(color0);
        assertNotNull(color1);
        assertNotNull(pdfArray2);
    }

    @Test
    void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test189");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ABSOLUTECOLORIMETRIC;
        assertNotNull(pdfName0);
    }

    @Test
    void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test190");
        com.lowagie.text.Rectangle rectangle0 = com.lowagie.text.PageSize.ID_1;
        assertNotNull(rectangle0);
    }

    @Test
    void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test191");
        com.lowagie.text.FontFactoryImp fontFactoryImp0 = new com.lowagie.text.FontFactoryImp();
        fontFactoryImp0.register("underline");
        com.lowagie.text.Font font4 = fontFactoryImp0.getFont("￼");
        java.awt.Color color10 = java.awt.Color.blue;
        java.awt.Color color11 = color10.darker();
        com.lowagie.text.Font font13 = fontFactoryImp0.getFont("xmpMM:ManageUI", "LOCALGOTO", true, (float) 226, 1564, color11, true);
        assertNotNull(font4);
        assertNotNull(color10);
        assertNotNull(color11);
        assertNotNull(font13);
    }

    @Test
    void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test192");
        com.lowagie.text.Font font1 = null;
        com.lowagie.text.Footnote footnote2 = new com.lowagie.text.Footnote("", font1);
        com.lowagie.text.HeaderFooter headerFooter4 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote2, true);
        headerFooter4.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle7 = headerFooter4.rotate();
        com.lowagie.text.Rectangle rectangle8 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter4);
        com.lowagie.text.Document document9 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter4);
        java.io.OutputStream outputStream10 = null;
        com.lowagie.text.pdf.PdfCopy pdfCopy11 = new com.lowagie.text.pdf.PdfCopy(document9, outputStream10);
        com.lowagie.text.pdf.PdfName pdfName12 = com.lowagie.text.pdf.PdfName.H6;
        pdfCopy11.setTabs(pdfName12);
        boolean b14 = pdfCopy11.isStrictImageSequence();
        com.lowagie.text.pdf.PdfWriter pdfWriter15 = null;
        char[] char_array18 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font20 = new com.lowagie.text.pdf.Type3Font(pdfWriter15, char_array18, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte27 = type3Font20.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte27.fillStroke();
        com.lowagie.text.pdf.FontMapper fontMapper31 = null;
        java.awt.print.PrinterJob printerJob34 = null;
        java.awt.Graphics2D graphics2D35 = pdfContentByte27.createPrinterGraphics((-1.0f), (float) (-1), fontMapper31, true, (float) (byte) 1, printerJob34);
        com.lowagie.text.pdf.FontMapper fontMapper38 = null;
        java.awt.Graphics2D graphics2D39 = pdfContentByte27.createGraphics(29.0f, (float) 526, fontMapper38);
        byte[] byte_array42 = null;
        com.lowagie.text.pdf.PdfReader pdfReader43 = null;
        byte[] byte_array48 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream49 = new com.lowagie.text.pdf.PRStream(pdfReader43, byte_array48);
        com.lowagie.text.pdf.PdfReader pdfReader50 = null;
        byte[] byte_array55 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream56 = new com.lowagie.text.pdf.PRStream(pdfReader50, byte_array55);
        pRStream49.setData(byte_array55, false, (int) (byte) 100);
        com.lowagie.text.ImgJBIG2 imgJBIG2_60 = new com.lowagie.text.ImgJBIG2(4, 1564, byte_array42, byte_array55);
        int i61 = imgJBIG2_60.getCompressionLevel();
        pdfContentByte27.rectangle((com.lowagie.text.Rectangle) imgJBIG2_60);
        try {
            pdfCopy11.addPage((com.lowagie.text.Rectangle) imgJBIG2_60, 24);
            fail("Expected exception of type com.lowagie.text.ExceptionConverter");
        } catch (com.lowagie.text.ExceptionConverter e) {
        }
        assertNotNull(rectangle7);
        assertNotNull(pdfName12);
        assertEquals(false, b14);
        assertNotNull(char_array18);
        assertNotNull(pdfContentByte27);
        assertNotNull(graphics2D35);
        assertNotNull(graphics2D39);
        assertNotNull(byte_array48);
        assertNotNull(byte_array55);
        assertEquals(i61, (-1));
    }

    @Test
    void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test193");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Cell cell5 = com.lowagie.text.factories.ElementFactory.getCell(properties1);
        boolean b6 = cell5.isUseBorderPadding();
        cell5.setHorizontalAlignment("Times-Bold");
        boolean b9 = cell5.isHeader();
        cell5.setUseBorderPadding(true);
        cell5.setVerticalAlignment(2);
        cell5.setHorizontalAlignment("cellpadding");
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(cell5);
        assertEquals(false, b6);
        assertEquals(false, b9);
    }

    @Test
    void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test194");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell2 = pdfPTable1.getDefaultCell();
        pdfPTable1.setSpacingBefore((float) 15);
        com.lowagie.text.pdf.PdfPCell pdfPCell5 = new com.lowagie.text.pdf.PdfPCell(pdfPTable1);
        float f6 = pdfPCell5.getMaxHeight();
        assertNotNull(pdfPCell2);
        assertEquals(0.0f, f6);
    }

    @Test
    void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test195");
        com.lowagie.text.pdf.PdfReader pdfReader0 = null;
        com.lowagie.text.pdf.ByteBuffer byteBuffer2 = new com.lowagie.text.pdf.ByteBuffer(1564);
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields4 = new com.lowagie.text.pdf.PdfCopyFields((java.io.OutputStream) byteBuffer2, 'Ã');
        com.lowagie.text.pdf.ByteBuffer byteBuffer6 = byteBuffer2.append(24);
        try {
            com.lowagie.text.pdf.PdfStamper pdfStamper9 = new com.lowagie.text.pdf.PdfStamper(pdfReader0, (java.io.OutputStream) byteBuffer6, 'Ë', true);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(byteBuffer6);
    }

    @Test
    void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test196");
        com.lowagie.text.pdf.ByteBuffer byteBuffer1 = new com.lowagie.text.pdf.ByteBuffer(1564);
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields3 = new com.lowagie.text.pdf.PdfCopyFields((java.io.OutputStream) byteBuffer1, 'Ã');
        com.lowagie.text.pdf.ByteBuffer byteBuffer5 = byteBuffer1.append(24);
        com.lowagie.text.pdf.ByteBuffer byteBuffer7 = byteBuffer1.append((byte) 100);
        com.lowagie.text.pdf.ByteBuffer byteBuffer9 = byteBuffer1.appendHex((byte) 9);
        com.lowagie.text.pdf.PdfDictionary pdfDictionary10 = null;
        com.lowagie.text.xml.xmp.XmpWriter xmpWriter12 = new com.lowagie.text.xml.xmp.XmpWriter((java.io.OutputStream) byteBuffer1, pdfDictionary10, 1042);
        xmpWriter12.addRdfDescription("parameters", "inline");
        assertNotNull(byteBuffer5);
        assertNotNull(byteBuffer7);
        assertNotNull(byteBuffer9);
    }

    @Test
    void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test197");
        int i0 = com.lowagie.text.pdf.AcroFields.FIELD_TYPE_SIGNATURE;
        assertEquals(7, i0);
    }

    @Test
    void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test198");
        java.lang.String str0 = com.lowagie.text.pdf.AsianFontMapper.JapaneseFont_Min;
        assertEquals("HeiseiMin-W3", str0, "'" + str0 + "' != '" + "HeiseiMin-W3" + "'");
    }

    @Test
    void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test199");
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
        try {
            com.lowagie.text.pdf.PdfPSXObject pdfPSXObject92 = new com.lowagie.text.pdf.PdfPSXObject(pdfWriter9);
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
    void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test200");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte12 = type3Font5.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        float f13 = pdfContentByte12.getXTLM();
        assertNotNull(char_array3);
        assertNotNull(pdfContentByte12);
        assertEquals(0.0f, f13);
    }

    @Test
    void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test201");
        com.lowagie.text.pdf.PdfRectangle pdfRectangle3 = new com.lowagie.text.pdf.PdfRectangle((float) (short) -1, (float) '4', (int) (short) 1);
        float f5 = pdfRectangle3.bottom((int) 'Ë');
        com.lowagie.text.pdf.BarcodePDF417 barcodePDF417_6 = new com.lowagie.text.pdf.BarcodePDF417();
        int i7 = barcodePDF417_6.getBitColumns();
        int i8 = barcodePDF417_6.getCodeRows();
        int[] i_array9 = barcodePDF417_6.getCodewords();
        boolean b10 = pdfRectangle3.add(i_array9);
        assertEquals(203.0f, f5);
        assertEquals(0, i7);
        assertEquals(0, i8);
        assertNotNull(i_array9);
        assertEquals(false, b10);
    }

    @Test
    void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test202");
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
        com.lowagie.text.pdf.RandomAccessFileOrArray randomAccessFileOrArray24 = new com.lowagie.text.pdf.RandomAccessFileOrArray("", true, true);
        com.lowagie.text.pdf.PdfReader pdfReader29 = null;
        byte[] byte_array34 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream35 = new com.lowagie.text.pdf.PRStream(pdfReader29, byte_array34);
        com.lowagie.text.pdf.PdfReader pdfReader36 = null;
        byte[] byte_array41 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream42 = new com.lowagie.text.pdf.PRStream(pdfReader36, byte_array41);
        pRStream35.setData(byte_array41, false, (int) (byte) 100);
        byte[] byte_array46 = pRStream35.getBytes();
        com.lowagie.text.pdf.PdfReader pdfReader47 = null;
        byte[] byte_array52 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream53 = new com.lowagie.text.pdf.PRStream(pdfReader47, byte_array52);
        com.lowagie.text.pdf.PdfReader pdfReader54 = null;
        byte[] byte_array59 = new byte[]{(byte) 1, (byte) 10, (byte) -1, (byte) -1};
        com.lowagie.text.pdf.PRStream pRStream60 = new com.lowagie.text.pdf.PRStream(pdfReader54, byte_array59);
        pRStream53.setData(byte_array59, false, (int) (byte) 100);
        byte[] byte_array64 = pRStream53.getBytes();
        pRStream35.setData(byte_array64);
        byte[] byte_array67 = com.lowagie.text.pdf.crypto.IVGenerator.getIV(0);
        com.lowagie.text.pdf.PRTokeniser pRTokeniser68 = new com.lowagie.text.pdf.PRTokeniser(byte_array67);
        com.lowagie.text.pdf.BaseFont baseFont71 = com.lowagie.text.pdf.BaseFont.createFont("xmp:Thumbnails", "widths", true, false, byte_array64, byte_array67, true, false);
        int i72 = randomAccessFileOrArray24.read(byte_array67);
        try {
            com.lowagie.text.pdf.PdfReader pdfReader73 = new com.lowagie.text.pdf.PdfReader(byte_array18, byte_array67);
            fail("Expected exception of type com.lowagie.text.exceptions.InvalidPdfException");
        } catch (com.lowagie.text.exceptions.InvalidPdfException e) {
        }
        assertNotNull(byte_array5);
        assertNotNull(byte_array12);
        assertEquals("Stream", str17, "'" + str17 + "' != '" + "Stream" + "'");
        assertNotNull(byte_array18);
        assertNotNull(byte_array34);
        assertNotNull(byte_array41);
        assertNotNull(byte_array46);
        assertNotNull(byte_array52);
        assertNotNull(byte_array59);
        assertNotNull(byte_array64);
        assertNotNull(byte_array67);
        assertNull(baseFont71);
        assertEquals(0, i72);
    }

    @Test
    void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test203");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.NEWWINDOW;
        assertNotNull(pdfName0);
    }

    @Test
    void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test204");
        com.lowagie.text.Rectangle rectangle0 = com.lowagie.text.PageSize.DEMY_QUARTO;
        float f1 = rectangle0.getBorderWidthTop();
        assertNotNull(rectangle0);
        assertEquals(f1, (-1.0f));
    }

    @Test
    void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test205");
        com.lowagie.text.pdf.collection.PdfCollectionField pdfCollectionField2 = new com.lowagie.text.pdf.collection.PdfCollectionField("", 96);
    }

    @Test
    void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test206");
        java.lang.String str0 = com.lowagie.text.ElementTags.ROTATION;
        assertEquals("rotation", str0, "'" + str0 + "' != '" + "rotation" + "'");
    }

    @Test
    void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test207");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte12 = type3Font5.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte12.fillStroke();
        pdfContentByte12.resetCMYKColorStroke();
        com.lowagie.text.pdf.PdfWriter pdfWriter15 = pdfContentByte12.getPdfWriter();
        pdfContentByte12.clip();
        pdfContentByte12.setLineDash((float) (short) -1, (float) 3);
        assertNotNull(char_array3);
        assertNotNull(pdfContentByte12);
        assertNull(pdfWriter15);
    }

    @Test
    void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test208");
        int i0 = com.lowagie.text.pdf.PdfDestination.FITB;
        assertEquals(5, i0);
    }

    @Test
    void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test209");
        boolean b1 = com.lowagie.text.pdf.PdfEncryptor.isAssemblyAllowed(1000);
        assertEquals(false, b1);
    }

    @Test
    void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test210");
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
        java.net.URL uRL26 = null;
        imgJBIG2_20.setUrl(uRL26);
        assertNotNull(byte_array8);
        assertNotNull(byte_array15);
        assertEquals(0, i21);
        assertNull(i_array22);
        assertEquals(4.0f, f23);
    }

    @Test
    void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test211");
        float f1 = com.lowagie.text.Utilities.millimetersToInches((float) 529);
        assertEquals(20.826773f, f1);
    }

    @Test
    void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test212");
        com.lowagie.text.pdf.PdfPTable pdfPTable1 = new com.lowagie.text.pdf.PdfPTable(1);
        float f3 = pdfPTable1.getRowHeight(1785737760);
        boolean b5 = pdfPTable1.isExtendLastRow(true);
        com.lowagie.text.pdf.PdfPTable pdfPTable7 = new com.lowagie.text.pdf.PdfPTable(1);
        pdfPTable1.addCell(pdfPTable7);
        java.io.OutputStream outputStream9 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields11 = new com.lowagie.text.pdf.PdfCopyFields(outputStream9, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter12 = pdfCopyFields11.getWriter();
        int i13 = pdfWriter12.getCurrentPageNumber();
        pdfWriter12.setLinearPageMode();
        com.lowagie.text.pdf.PdfPTable pdfPTable16 = new com.lowagie.text.pdf.PdfPTable(1);
        com.lowagie.text.pdf.PdfPCell pdfPCell17 = pdfPTable16.getDefaultCell();
        float f18 = pdfPCell17.getIndent();
        float f19 = pdfPCell17.getExtraParagraphSpace();
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation20 = new com.lowagie.text.pdf.PdfAnnotation(pdfWriter12, (com.lowagie.text.Rectangle) pdfPCell17);
        com.lowagie.text.pdf.PdfPCell pdfPCell21 = new com.lowagie.text.pdf.PdfPCell(pdfPTable1, pdfPCell17);
        assertEquals(0.0f, f3);
        assertEquals(false, b5);
        assertNotNull(pdfWriter12);
        assertEquals(1, i13);
        assertNotNull(pdfPCell17);
        assertEquals(0.0f, f18);
        assertEquals(0.0f, f19);
    }

    @Test
    void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test213");
        com.lowagie.text.pdf.hyphenation.SimplePatternParser simplePatternParser0 = new com.lowagie.text.pdf.hyphenation.SimplePatternParser();
        simplePatternParser0.endDocument();
        simplePatternParser0.endElement("Times-Roman");
        simplePatternParser0.addClass("Justify");
    }

    @Test
    void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test214");
        com.lowagie.text.SimpleCell simpleCell1 = new com.lowagie.text.SimpleCell(true);
        com.lowagie.text.SimpleCell simpleCell3 = new com.lowagie.text.SimpleCell(true);
        simpleCell3.setSpacing_top((float) 226);
        int i6 = simpleCell3.type();
        com.lowagie.text.Cell cell7 = simpleCell1.createCell(simpleCell3);
        simpleCell1.setSpacing_bottom((float) 53);
        assertEquals(20, i6);
        assertNotNull(cell7);
    }

    @Test
    void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test215");
        com.lowagie.text.pdf.BarcodeInter25 barcodeInter25_0 = new com.lowagie.text.pdf.BarcodeInter25();
        java.awt.Color color4 = java.awt.Color.getHSBColor(100.0f, (float) (short) 1, 100.0f);
        int i5 = com.lowagie.text.pdf.ExtendedColor.getType(color4);
        com.lowagie.text.pdf.PdfArray pdfArray6 = com.lowagie.text.pdf.PdfAnnotation.getMKColor(color4);
        java.awt.Color color7 = java.awt.Color.pink;
        java.awt.Image image8 = barcodeInter25_0.createAwtImage(color4, color7);
        assertNotNull(color4);
        assertEquals(0, i5);
        assertNotNull(pdfArray6);
        assertNotNull(color7);
        assertNotNull(image8);
    }

    @Test
    void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test216");
        org.w3c.dom.Node node5 = null;
        byte[] byte_array6 = com.lowagie.text.pdf.XfaForm.serializeDoc(node5);
        com.lowagie.text.pdf.IntHashtable intHashtable7 = new com.lowagie.text.pdf.IntHashtable();
        boolean b9 = intHashtable7.containsValue(1785737760);
        int[] i_array10 = intHashtable7.getKeys();
        int[] i_array11 = intHashtable7.getKeys();
        int i13 = intHashtable7.get(9);
        int i15 = intHashtable7.remove((int) 'Ã');
        int[] i_array16 = intHashtable7.getKeys();
        int[] i_array17 = intHashtable7.toOrderedKeys();
        int[] i_array18 = intHashtable7.toOrderedKeys();
        try {
            com.lowagie.text.Image image19 = com.lowagie.text.Image.getInstance(1046, 1718909296, true, 16384, 1078, byte_array6, i_array18);
            fail("Expected exception of type com.lowagie.text.BadElementException");
        } catch (com.lowagie.text.BadElementException e) {
        }
        assertNotNull(byte_array6);
        assertEquals(false, b9);
        assertNotNull(i_array10);
        assertNotNull(i_array11);
        assertEquals(0, i13);
        assertEquals(0, i15);
        assertNotNull(i_array16);
        assertNotNull(i_array17);
        assertNotNull(i_array18);
    }

    @Test
    void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test217");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        com.lowagie.text.pdf.PdfAcroForm pdfAcroForm1 = new com.lowagie.text.pdf.PdfAcroForm(pdfWriter0);
        pdfAcroForm1.setNeedAppearances(true);
        boolean b4 = pdfAcroForm1.isDictionary();
        boolean b5 = pdfAcroForm1.isCatalog();
        java.lang.String str6 = pdfAcroForm1.toString();
        com.lowagie.text.pdf.internal.PdfViewerPreferencesImp pdfViewerPreferencesImp7 = com.lowagie.text.pdf.internal.PdfViewerPreferencesImp.getViewerPreferences((com.lowagie.text.pdf.PdfDictionary) pdfAcroForm1);
        com.lowagie.text.pdf.BaseFont baseFont10 = null;
        com.lowagie.text.Font font13 = new com.lowagie.text.Font(baseFont10, (float) (short) 1, (int) (short) 0);
        com.lowagie.text.pdf.BaseFont baseFont15 = font13.getCalculatedBaseFont(false);
        boolean b18 = baseFont15.setCharAdvance(9, 0);
        float f21 = baseFont15.getWidthPoint(53, (float) (byte) 60);
        int i23 = baseFont15.getCidCode((int) (short) 10);
        boolean b24 = baseFont15.isEmbedded();
        try {
            com.lowagie.text.pdf.PdfFormField pdfFormField30 = pdfAcroForm1.addSingleLinePasswordField("", "unknown", baseFont15, 0.0f, (float) 90L, (float) 100L, (-30.0f), 3.0f);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertEquals(true, b4);
        assertEquals(false, b5);
        assertEquals("Dictionary", str6, "'" + str6 + "' != '" + "Dictionary" + "'");
        assertNotNull(pdfViewerPreferencesImp7);
        assertNotNull(baseFont15);
        assertEquals(true, b18);
        assertEquals(33.360004f, f21);
        assertEquals(10, i23);
        assertEquals(false, b24);
    }

    @Test
    void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test218");
        java.lang.String str0 = com.lowagie.text.html.Markup.CSS_KEY_FONTWEIGHT;
        assertEquals("font-weight", str0, "'" + str0 + "' != '" + "font-weight" + "'");
    }

    @Test
    void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test219");
        com.lowagie.text.Font font1 = null;
        com.lowagie.text.Footnote footnote2 = new com.lowagie.text.Footnote("", font1);
        com.lowagie.text.HeaderFooter headerFooter4 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote2, true);
        headerFooter4.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph7 = headerFooter4.paragraph();
        com.lowagie.text.ChapterAutoNumber chapterAutoNumber8 = new com.lowagie.text.ChapterAutoNumber(paragraph7);
        com.lowagie.text.Chapter chapter10 = new com.lowagie.text.Chapter(paragraph7, 262);
        com.lowagie.text.pdf.XfaForm.AcroFieldsSearch acroFieldsSearch11 = new com.lowagie.text.pdf.XfaForm.AcroFieldsSearch((java.util.Collection) chapter10);
        com.lowagie.text.html.WebColors webColors12 = com.lowagie.text.html.WebColors.NAMES;
        acroFieldsSearch11.setName2Node((java.util.HashMap) webColors12);
        assertNotNull(paragraph7);
        assertNotNull(webColors12);
    }

    @Test
    void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test220");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfFormField.IF_SCALE_SMALLER;
        assertNotNull(pdfName0);
    }

    @Test
    void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test221");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        com.lowagie.text.pdf.PdfContentByte pdfContentByte12 = type3Font5.defineGlyph('4', 20000.0f, (float) 'Ê', (float) 200, 0.0f, (float) 2048);
        pdfContentByte12.fillStroke();
        com.lowagie.text.pdf.FontMapper fontMapper16 = null;
        java.awt.print.PrinterJob printerJob19 = null;
        java.awt.Graphics2D graphics2D20 = pdfContentByte12.createPrinterGraphics((-1.0f), (float) (-1), fontMapper16, true, (float) (byte) 1, printerJob19);
        com.lowagie.text.pdf.PdfName pdfName21 = com.lowagie.text.pdf.PdfName.BASEVERSION;
        com.lowagie.text.pdf.PdfName pdfName22 = com.lowagie.text.pdf.PdfName.SIMPLEX;
        pdfContentByte12.setDefaultColorspace(pdfName21, (com.lowagie.text.pdf.PdfObject) pdfName22);
        java.awt.print.PrinterJob printerJob26 = null;
        java.awt.Graphics2D graphics2D27 = pdfContentByte12.createPrinterGraphicsShapes((float) 512, (float) '翿', printerJob26);
        boolean b32 = graphics2D27.hitClip((int) (short) 0, 55, 8198, (int) 'Ã');
        assertNotNull(char_array3);
        assertNotNull(pdfContentByte12);
        assertNotNull(graphics2D20);
        assertNotNull(pdfName21);
        assertNotNull(pdfName22);
        assertNotNull(graphics2D27);
        assertEquals(true, b32);
    }

    @Test
    void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test222");
        com.lowagie.text.pdf.PdfPatternPainter pdfPatternPainter0 = null;
        com.lowagie.text.pdf.PatternColor patternColor1 = new com.lowagie.text.pdf.PatternColor(pdfPatternPainter0);
        com.lowagie.text.pdf.PdfName pdfName2 = com.lowagie.text.pdf.PdfName.PAGE;
        boolean b3 = patternColor1.equals((java.lang.Object) pdfName2);
        assertNotNull(pdfName2);
        assertEquals(false, b3);
    }

    @Test
    void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test223");
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
        randomAccessFileOrArray43.pushBack((byte) 0);
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
    }

    @Test
    void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test224");
        com.lowagie.text.SimpleTable simpleTable0 = new com.lowagie.text.SimpleTable();
        float f1 = simpleTable0.getWidthpercentage();
        assertEquals(0.0f, f1);
    }

    @Test
    void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test225");
        com.lowagie.text.Font font4 = com.lowagie.text.FontFactory.getFont("page-break-after", "face", (float) 30);
        com.lowagie.text.ListItem listItem5 = new com.lowagie.text.ListItem("border-bottom-width", font4);
        com.lowagie.text.Chapter chapter7 = new com.lowagie.text.Chapter((com.lowagie.text.Paragraph) listItem5, 255);
        chapter7.setIndentation(8.0f);
        int i10 = chapter7.type();
        assertNotNull(font4);
        assertEquals(16, i10);
    }

    @Test
    void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test226");
        com.lowagie.text.pdf.codec.CCITTG4Encoder cCITTG4Encoder1 = new com.lowagie.text.pdf.codec.CCITTG4Encoder((int) (short) 2660);
    }

    @Test
    void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test227");
        com.lowagie.text.pdf.codec.wmf.MetaState metaState0 = new com.lowagie.text.pdf.codec.wmf.MetaState();
        java.awt.Point point1 = null;
        metaState0.currentPoint = point1;
        java.awt.Point point3 = null;
        metaState0.setCurrentPoint(point3);
        com.lowagie.text.pdf.codec.wmf.MetaPen metaPen5 = null;
        metaState0.currentPen = metaPen5;
    }

    @Test
    void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test228");
        com.lowagie.text.pdf.CMYKColor cMYKColor4 = new com.lowagie.text.pdf.CMYKColor(25610, (int) (byte) 60, 299, 24);
        com.lowagie.text.Chapter chapter6 = new com.lowagie.text.Chapter((int) (short) -1);
        boolean b7 = cMYKColor4.equals((java.lang.Object) chapter6);
        com.lowagie.text.Section section9 = chapter6.addSection("dc:description");
        assertEquals(false, b7);
        assertNotNull(section9);
    }

    @Test
    void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test229");
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
        java.awt.Graphics2D graphics2D29 = pdfContentByte19.createGraphics((float) 14, (float) 20, false, (float) 100L);
        assertEquals(0, i5);
        assertNotNull(char_array10);
        assertNotNull(pdfContentByte19);
        assertNotNull(graphics2D29);
    }

    @Test
    void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test230");
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
        boolean b95 = document75.addAuthor("lly");
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
        assertEquals(false, b95);
    }

    @Test
    void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test231");
        com.lowagie.text.Chapter chapter1 = new com.lowagie.text.Chapter((int) (short) -1);
        com.lowagie.text.MarkedSection markedSection2 = chapter1.addMarkedSection();
        markedSection2.setIndentation((float) (byte) -1);
        markedSection2.setIndentationRight((float) (byte) 10);
        java.util.ArrayList arrayList7 = markedSection2.getChunks();
        java.util.Properties properties8 = markedSection2.getMarkupAttributes();
        java.util.Set set9 = com.lowagie.text.Utilities.getKeySet((java.util.Hashtable) properties8);
        java.lang.Object obj10 = properties8.clone();
        assertNotNull(markedSection2);
        assertNotNull(arrayList7);
        assertNotNull(properties8);
        assertNotNull(set9);
        assertNotNull(obj10);
    }

    @Test
    void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test232");
        com.lowagie.text.Phrase phrase1 = new com.lowagie.text.Phrase((float) 'Ã');
        com.lowagie.text.Anchor anchor2 = new com.lowagie.text.Anchor(phrase1);
        com.lowagie.text.HeaderFooter headerFooter4 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) anchor2, true);
        com.lowagie.text.Font font6 = null;
        com.lowagie.text.Footnote footnote7 = new com.lowagie.text.Footnote("", font6);
        com.lowagie.text.HeaderFooter headerFooter9 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote7, true);
        com.lowagie.text.pdf.HyphenationAuto hyphenationAuto14 = new com.lowagie.text.pdf.HyphenationAuto("Default", "creationdate", (-1), 1785737760);
        footnote7.setHyphenation((com.lowagie.text.pdf.HyphenationEvent) hyphenationAuto14);
        anchor2.setHyphenation((com.lowagie.text.pdf.HyphenationEvent) hyphenationAuto14);
        java.util.ArrayList arrayList17 = anchor2.getChunks();
        java.util.function.UnaryOperator<java.lang.String> unaryoperator_str18 = null;
        try {
            arrayList17.replaceAll(unaryoperator_str18);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        assertNotNull(arrayList17);
    }

    @Test
    void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test233");
        com.lowagie.text.pdf.PdfDestination pdfDestination2 = new com.lowagie.text.pdf.PdfDestination(1042, (float) '翿');
        int i3 = pdfDestination2.size();
        assertEquals(2, i3);
    }

    @Test
    void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test234");
        float f1 = com.lowagie.text.Utilities.pointsToMillimeters((float) (-56509343));
        assertEquals(f1, (-1.993524E7f));
    }

    @Test
    void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test235");
        int i0 = com.lowagie.text.pdf.PdfFormField.FF_DONOTSPELLCHECK;
        assertEquals(4194304, i0);
    }

    @Test
    void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test236");
        com.lowagie.text.ListItem listItem0 = new com.lowagie.text.ListItem();
        listItem0.setLeading((float) 804);
        listItem0.setSpacingAfter((float) (short) 1);
        java.util.ArrayList arrayList5 = listItem0.getChunks();
        listItem0.setIndentationLeft((float) 299, false);
        listItem0.setFirstLineIndent((float) (byte) 60);
        assertNotNull(arrayList5);
    }

    @Test
    void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test237");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Cell cell5 = com.lowagie.text.factories.ElementFactory.getCell(properties1);
        cell5.setWidth(0.0f);
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper8 = new com.lowagie.text.pdf.PdfPageEventHelper();
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper9 = new com.lowagie.text.pdf.PdfPageEventHelper();
        java.io.OutputStream outputStream10 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields12 = new com.lowagie.text.pdf.PdfCopyFields(outputStream10, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter13 = pdfCopyFields12.getWriter();
        com.lowagie.text.Font font15 = null;
        com.lowagie.text.Footnote footnote16 = new com.lowagie.text.Footnote("", font15);
        com.lowagie.text.HeaderFooter headerFooter18 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote16, true);
        headerFooter18.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle21 = headerFooter18.rotate();
        com.lowagie.text.Rectangle rectangle22 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter18);
        com.lowagie.text.Document document23 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter18);
        boolean b25 = document23.setMarginMirroringTopBottom(true);
        com.lowagie.text.Font font29 = null;
        com.lowagie.text.Footnote footnote30 = new com.lowagie.text.Footnote("", font29);
        com.lowagie.text.HeaderFooter headerFooter32 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote30, true);
        headerFooter32.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph35 = headerFooter32.paragraph();
        pdfPageEventHelper9.onSection(pdfWriter13, document23, (float) 7, 262144, paragraph35);
        pdfWriter13.setStrictImageSequence(false);
        float f39 = pdfWriter13.getUserunit();
        com.lowagie.text.pdf.PdfPageEventHelper pdfPageEventHelper40 = new com.lowagie.text.pdf.PdfPageEventHelper();
        java.io.OutputStream outputStream41 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields43 = new com.lowagie.text.pdf.PdfCopyFields(outputStream41, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter44 = pdfCopyFields43.getWriter();
        com.lowagie.text.Font font46 = null;
        com.lowagie.text.Footnote footnote47 = new com.lowagie.text.Footnote("", font46);
        com.lowagie.text.HeaderFooter headerFooter49 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote47, true);
        headerFooter49.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle52 = headerFooter49.rotate();
        com.lowagie.text.Rectangle rectangle53 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter49);
        com.lowagie.text.Document document54 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter49);
        boolean b56 = document54.setMarginMirroringTopBottom(true);
        com.lowagie.text.Font font60 = null;
        com.lowagie.text.Footnote footnote61 = new com.lowagie.text.Footnote("", font60);
        com.lowagie.text.HeaderFooter headerFooter63 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote61, true);
        headerFooter63.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph66 = headerFooter63.paragraph();
        pdfPageEventHelper40.onSection(pdfWriter44, document54, (float) 7, 262144, paragraph66);
        java.io.OutputStream outputStream68 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields70 = new com.lowagie.text.pdf.PdfCopyFields(outputStream68, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter71 = pdfCopyFields70.getWriter();
        int i72 = pdfWriter71.getCurrentPageNumber();
        com.lowagie.text.Font font74 = null;
        com.lowagie.text.Footnote footnote75 = new com.lowagie.text.Footnote("", font74);
        com.lowagie.text.HeaderFooter headerFooter77 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote75, true);
        headerFooter77.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Rectangle rectangle80 = headerFooter77.rotate();
        com.lowagie.text.Rectangle rectangle81 = new com.lowagie.text.Rectangle((com.lowagie.text.Rectangle) headerFooter77);
        com.lowagie.text.Document document82 = new com.lowagie.text.Document((com.lowagie.text.Rectangle) headerFooter77);
        boolean b84 = document82.setMarginMirroringTopBottom(true);
        com.lowagie.text.Rectangle rectangle85 = com.lowagie.text.PageSize.A4;
        pdfPageEventHelper40.onGenericTag(pdfWriter71, document82, rectangle85, "com/lowagie/text/pdf/fonts/");
        pdfPageEventHelper8.onOpenDocument(pdfWriter13, document82);
        boolean b89 = cell5.process((com.lowagie.text.ElementListener) pdfWriter13);
        cell5.setUseDescender(true);
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(cell5);
        assertNotNull(pdfWriter13);
        assertNotNull(rectangle21);
        assertEquals(true, b25);
        assertNotNull(paragraph35);
        assertEquals(0.0f, f39);
        assertNotNull(pdfWriter44);
        assertNotNull(rectangle52);
        assertEquals(true, b56);
        assertNotNull(paragraph66);
        assertNotNull(pdfWriter71);
        assertEquals(1, i72);
        assertNotNull(rectangle80);
        assertEquals(true, b84);
        assertNotNull(rectangle85);
        assertEquals(false, b89);
    }

    @Test
    void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test238");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.ACTIVATION;
        assertNotNull(pdfName0);
    }

    @Test
    void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test239");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.CFM;
        assertNotNull(pdfName0);
    }

    @Test
    void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test240");
        java.util.Properties properties1 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b2 = properties1.isEmpty();
        boolean b4 = properties1.contains((java.lang.Object) 14);
        com.lowagie.text.Cell cell5 = com.lowagie.text.factories.ElementFactory.getCell(properties1);
        boolean b6 = cell5.isUseBorderPadding();
        cell5.setHorizontalAlignment("Times-Bold");
        cell5.setUseDescender(true);
        assertNotNull(properties1);
        assertEquals(true, b2);
        assertEquals(false, b4);
        assertNotNull(cell5);
        assertEquals(false, b6);
    }

    @Test
    void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test241");
        java.lang.String str1 = com.lowagie.text.Utilities.unEscapeURL("named");
        assertEquals("named", str1, "'" + str1 + "' != '" + "named" + "'");
    }

    @Test
    void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test242");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfGState.BM_SCREEN;
        assertNotNull(pdfName0);
    }

    @Test
    void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test243");
        com.lowagie.text.Annotation annotation6 = new com.lowagie.text.Annotation((float) 20, 33.360004f, 609.6f, 1.0f, "Cp1250", "named");
    }

    @Test
    void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test244");
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
        pdfPTable22.setLockedWidth(true);
        int i29 = pdfPTable22.type();
        assertEquals(0.0f, f3);
        assertEquals(false, b5);
        assertNotNull(pdfPCell11);
        assertEquals(0.0f, f12);
        assertEquals(0.0f, f13);
        assertNotNull(pdfPCell16);
        assertEquals(0.0f, f17);
        assertNull(pdfPTable18);
        assertEquals(0.0f, f24);
        assertEquals(23, i29);
    }

    @Test
    void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test245");
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
        pdfWriter3.clearTextWrap();
        assertNotNull(pdfWriter3);
        assertEquals(1, i4);
        assertNotNull(pdfPCell8);
        assertEquals(0.0f, f9);
        assertEquals(0.0f, f10);
    }

    @Test
    void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test246");
        java.net.URL uRL0 = null;
        try {
            com.lowagie.text.pdf.FdfReader fdfReader1 = new com.lowagie.text.pdf.FdfReader(uRL0);
            fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test247");
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
        float f40 = document20.right();
        java.util.Properties properties42 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b43 = properties42.isEmpty();
        boolean b45 = properties42.contains((java.lang.Object) 14);
        com.lowagie.text.Paragraph paragraph46 = com.lowagie.text.factories.ElementFactory.getParagraph(properties42);
        int i47 = properties42.size();
        com.lowagie.text.Table table48 = com.lowagie.text.factories.ElementFactory.getTable(properties42);
        table48.setNotAddedYet(false);
        boolean b51 = table48.isComplete();
        try {
            boolean b52 = document20.add((com.lowagie.text.Element) table48);
            fail("Expected exception of type com.lowagie.text.DocumentException");
        } catch (com.lowagie.text.DocumentException e) {
        }
        assertNotNull(pdfWriter10);
        assertNotNull(rectangle18);
        assertEquals(true, b22);
        assertNotNull(paragraph32);
        assertEquals(false, b34);
        assertEquals(true, b39);
        assertEquals(f40, (-30.0f));
        assertNotNull(properties42);
        assertEquals(true, b43);
        assertEquals(false, b45);
        assertNotNull(paragraph46);
        assertEquals(0, i47);
        assertNotNull(table48);
        assertEquals(true, b51);
    }

    @Test
    void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test248");
        com.lowagie.text.pdf.PdfWriter pdfWriter0 = null;
        char[] char_array3 = new char[]{'Ã', ' '};
        com.lowagie.text.pdf.Type3Font type3Font5 = new com.lowagie.text.pdf.Type3Font(pdfWriter0, char_array3, true);
        java.lang.String[][] str_array_array6 = type3Font5.getAllNameEntries();
        int i8 = type3Font5.getUnicodeEquivalent(128);
        type3Font5.correctArabicAdvance();
        int i12 = type3Font5.getKerning((int) (short) -1, 53);
        type3Font5.correctArabicAdvance();
        assertNotNull(char_array3);
        assertNotNull(str_array_array6);
        assertEquals(128, i8);
        assertEquals(0, i12);
    }

    @Test
    void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test249");
        java.lang.String str0 = com.lowagie.text.xml.xmp.XmpMMSchema.DOCUMENTID;
        assertEquals("xmpMM:DocumentID", str0, "'" + str0 + "' != '" + "xmpMM:DocumentID" + "'");
    }

    @Test
    void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test250");
        int i0 = com.lowagie.text.pdf.PushbuttonField.SCALE_ICON_IS_TOO_BIG;
        assertEquals(3, i0);
    }

    @Test
    void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test251");
        com.lowagie.text.Chunk chunk0 = new com.lowagie.text.Chunk();
        com.lowagie.text.Image image1 = chunk0.getImage();
        float f2 = chunk0.getCharacterSpacing();
        com.lowagie.text.pdf.PdfAction pdfAction4 = new com.lowagie.text.pdf.PdfAction("Cp1250");
        com.lowagie.text.Chunk chunk5 = chunk0.setAction(pdfAction4);
        java.lang.StringBuffer stringBuffer7 = chunk5.append("xmpMM:Versions");
        com.lowagie.text.Chunk chunk8 = chunk5.setNewPage();
        com.lowagie.text.pdf.BarcodePDF417 barcodePDF417_9 = new com.lowagie.text.pdf.BarcodePDF417();
        int i10 = barcodePDF417_9.getBitColumns();
        int i11 = barcodePDF417_9.getCodeRows();
        com.lowagie.text.pdf.GrayColor grayColor13 = new com.lowagie.text.pdf.GrayColor(2);
        java.awt.Color color14 = java.awt.Color.blue;
        java.awt.Image image15 = barcodePDF417_9.createAwtImage((java.awt.Color) grayColor13, color14);
        com.lowagie.text.Chunk chunk21 = chunk8.setUnderline(color14, 227.64f, (float) 53, (float) (-56509343), Float.NaN, (int) '搁');
        assertNull(image1);
        assertEquals(0.0f, f2);
        assertNotNull(chunk5);
        assertNotNull(stringBuffer7);
        assertNotNull(chunk8);
        assertEquals(0, i10);
        assertEquals(0, i11);
        assertNotNull(color14);
        assertNotNull(image15);
        assertNotNull(chunk21);
    }

    @Test
    void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test252");
        com.lowagie.text.pdf.PdfContentByte pdfContentByte0 = null;
        com.lowagie.text.pdf.ColumnText columnText1 = new com.lowagie.text.pdf.ColumnText(pdfContentByte0);
        int i2 = columnText1.getAlignment();
        columnText1.setYLine((float) (byte) -1);
        columnText1.setAlignment(1564);
        assertEquals(0, i2);
    }

    @Test
    void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test253");
        com.lowagie.text.Font font1 = null;
        com.lowagie.text.Footnote footnote2 = new com.lowagie.text.Footnote("", font1);
        com.lowagie.text.HeaderFooter headerFooter4 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote2, true);
        headerFooter4.setBorderWidthBottom((float) (byte) 1);
        com.lowagie.text.Paragraph paragraph7 = headerFooter4.paragraph();
        com.lowagie.text.ChapterAutoNumber chapterAutoNumber8 = new com.lowagie.text.ChapterAutoNumber(paragraph7);
        com.lowagie.text.Chapter chapter10 = new com.lowagie.text.Chapter(paragraph7, 262);
        float f11 = paragraph7.spacingBefore();
        assertNotNull(paragraph7);
        assertEquals(0.0f, f11);
    }

    @Test
    void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test254");
        com.lowagie.text.pdf.PdfString pdfString0 = new com.lowagie.text.pdf.PdfString();
        boolean b1 = pdfString0.isHexWriting();
        char[] char_array2 = pdfString0.getOriginalChars();
        assertEquals(false, b1);
        assertNotNull(char_array2);
    }

    @Test
    void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test255");
        com.lowagie.text.Paragraph paragraph0 = null;
        com.lowagie.text.Chapter chapter2 = new com.lowagie.text.Chapter(paragraph0, 1785737760);
        float f3 = chapter2.getIndentationLeft();
        java.util.Properties properties5 = com.lowagie.text.html.Markup.parseAttributes("image");
        boolean b6 = properties5.isEmpty();
        com.lowagie.text.Section section7 = com.lowagie.text.factories.ElementFactory.getSection((com.lowagie.text.Section) chapter2, properties5);
        java.util.Set<java.lang.String> set_str8 = properties5.stringPropertyNames();
        assertEquals(0.0f, f3);
        assertNotNull(properties5);
        assertEquals(true, b6);
        assertNotNull(section7);
        assertNotNull(set_str8);
    }

    @Test
    void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test256");
        com.lowagie.text.pdf.hyphenation.ByteVector byteVector0 = new com.lowagie.text.pdf.hyphenation.ByteVector();
        byteVector0.put(10, (byte) 1);
    }

    @Test
    void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test257");
        java.io.OutputStream outputStream0 = null;
        com.lowagie.text.pdf.PdfCopyFields pdfCopyFields2 = new com.lowagie.text.pdf.PdfCopyFields(outputStream0, ' ');
        com.lowagie.text.pdf.PdfWriter pdfWriter3 = pdfCopyFields2.getWriter();
        com.lowagie.text.pdf.PdfFileSpecification pdfFileSpecification5 = com.lowagie.text.pdf.PdfFileSpecification.fileExtern(pdfWriter3, "UnicodeBig");
        assertNotNull(pdfWriter3);
        assertNotNull(pdfFileSpecification5);
    }

    @Test
    void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test258");
        com.lowagie.text.pdf.PdfName pdfName0 = com.lowagie.text.pdf.PdfName.CONFIGURATION;
        assertNotNull(pdfName0);
    }

    @Test
    void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test259");
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
        pdfWriter3.setOpenAction("rel");
        int i16 = pdfWriter3.getPDFXConformance();
        assertNotNull(pdfWriter3);
        assertEquals(1, i4);
        assertEquals(0, i6);
        assertEquals(true, b13);
        assertEquals(0, i16);
    }

    @Test
    void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test260");
        com.lowagie.text.Paragraph paragraph0 = null;
        com.lowagie.text.Chapter chapter2 = new com.lowagie.text.Chapter(paragraph0, 1785737760);
        float f3 = chapter2.getIndentationLeft();
        boolean b4 = chapter2.isNestable();
        com.lowagie.text.MarkedSection markedSection5 = chapter2.addMarkedSection();
        boolean b6 = chapter2.isNestable();
        assertEquals(0.0f, f3);
        assertEquals(false, b4);
        assertNotNull(markedSection5);
        assertEquals(false, b6);
    }

    @Test
    void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test261");
        java.lang.String str0 = com.lowagie.text.xml.xmp.PdfSchema.VERSION;
        assertEquals("pdf:PDFVersion", str0, "'" + str0 + "' != '" + "pdf:PDFVersion" + "'");
    }

    @Test
    void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test262");
        java.lang.String str1 = com.lowagie.text.pdf.Barcode128.getHumanReadableUCCEAN("borderwidth");
        assertEquals("borderwidth", str1, "'" + str1 + "' != '" + "borderwidth" + "'");
    }

    @Test
    void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test263");
        com.lowagie.text.pdf.PdfWriter.PdfBody.PdfCrossReference pdfCrossReference2 = new com.lowagie.text.pdf.PdfWriter.PdfBody.PdfCrossReference(0, (int) (short) 2660);
        com.lowagie.text.pdf.ByteBuffer byteBuffer5 = new com.lowagie.text.pdf.ByteBuffer(1564);
        com.lowagie.text.pdf.ByteBuffer byteBuffer7 = byteBuffer5.append((double) 8192);
        pdfCrossReference2.toPdf(496, (java.io.OutputStream) byteBuffer7);
        com.lowagie.text.pdf.PdfWriter.PdfBody.PdfCrossReference pdfCrossReference13 = new com.lowagie.text.pdf.PdfWriter.PdfBody.PdfCrossReference(505, (int) (short) 25610, (int) 'È', 525);
        int i14 = pdfCrossReference2.compareTo(pdfCrossReference13);
        assertNotNull(byteBuffer7);
        assertEquals(i14, (-1));
    }

    @Test
    void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test264");
        com.lowagie.text.GreekList greekList0 = new com.lowagie.text.GreekList();
        greekList0.setPostSymbol("dc:title");
        int i3 = greekList0.size();
        java.util.ArrayList arrayList4 = greekList0.getChunks();
        assertEquals(0, i3);
        assertNotNull(arrayList4);
    }

    @Test
    void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test265");
        com.lowagie.text.pdf.XfaForm.Xml2Som xml2Som0 = new com.lowagie.text.pdf.XfaForm.Xml2Som();
        com.lowagie.text.Font font2 = null;
        com.lowagie.text.Footnote footnote3 = new com.lowagie.text.Footnote("", font2);
        com.lowagie.text.HeaderFooter headerFooter5 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote3, true);
        com.lowagie.text.pdf.HyphenationAuto hyphenationAuto10 = new com.lowagie.text.pdf.HyphenationAuto("Default", "creationdate", (-1), 1785737760);
        footnote3.setHyphenation((com.lowagie.text.pdf.HyphenationEvent) hyphenationAuto10);
        com.lowagie.text.Font font12 = footnote3.getFont();
        xml2Som0.setOrder((java.util.ArrayList) footnote3);
        com.lowagie.text.Font font16 = null;
        com.lowagie.text.Footnote footnote17 = new com.lowagie.text.Footnote("", font16);
        com.lowagie.text.HeaderFooter headerFooter19 = new com.lowagie.text.HeaderFooter((com.lowagie.text.Phrase) footnote17, true);
        try {
            footnote3.add(1768449138, (java.lang.Object) footnote17);
            fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        assertNull(font12);
    }

    @Test
    void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test266");
        com.lowagie.text.pdf.PdfSigGenericPKCS.VeriSign veriSign0 = new com.lowagie.text.pdf.PdfSigGenericPKCS.VeriSign();
    }

    @Test
    void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test267");
        com.lowagie.text.pdf.codec.wmf.MetaState metaState0 = new com.lowagie.text.pdf.codec.wmf.MetaState();
        java.awt.Point point1 = null;
        metaState0.currentPoint = point1;
        java.awt.Color color3 = java.awt.Color.lightGray;
        metaState0.currentBackgroundColor = color3;
        com.lowagie.text.pdf.codec.wmf.MetaState metaState5 = new com.lowagie.text.pdf.codec.wmf.MetaState();
        float f6 = metaState5.scalingY;
        metaState5.setOffsetWy((int) (byte) 47);
        int i9 = metaState5.textAlign;
        metaState0.setMetaState(metaState5);
        int i11 = metaState0.getPolyFillMode();
        assertNotNull(color3);
        assertEquals(0.0f, f6);
        assertEquals(0, i9);
        assertEquals(1, i11);
    }

    @Test
    void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test268");
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
        java.lang.String str34 = imgJBIG2_20.getAlt();
        assertNotNull(byte_array8);
        assertNotNull(byte_array15);
        assertEquals(0, i21);
        assertNull(i_array22);
        assertEquals(4.0f, f23);
        assertNotNull(pdfWriter29);
        assertEquals(1, i30);
        assertNotNull(pdfLayer32);
        assertNull(str34);
    }

    @Test
    void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test269");
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
        com.lowagie.text.pdf.PdfContentByte pdfContentByte11 = columnText4.getCanvas();
        assertEquals(0.0f, f2);
        assertNull(pdfContentByte_array7);
        assertNotNull(columnText10);
        assertNull(pdfContentByte11);
    }
}

