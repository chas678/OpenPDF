package com.lowagie.text;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = true;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        Section section0 = new Section();
        section0.numberStyle = (short) 0;
        Paragraph paragraph3 = section0.getBookmarkTitle();
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        Anchor anchor0 = new Anchor();
        ListItem listItem1 = new ListItem((Phrase) anchor0);
        Section section3 = new Section((Paragraph) listItem1, 2097152);
        section3.setChapterNumber((int) '翿');
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        Section section0 = new Section();
        Section section4 = section0.addSection((float) (byte) 0, "xmp:Advisory", 16384);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        ImgJBIG2 imgJBIG2_0 = new ImgJBIG2();
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS pPKMS0 = new com.lowagie.text.pdf.PdfSigGenericPKCS.PPKMS();
        pPKMS0.setName("Times-Italic");
        byte[] byte_array3 = pPKMS0.getSignerContents();
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        Document document0 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer1 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer3 = byteBuffer1.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter4 = com.lowagie.text.pdf.PdfWriter.getInstance(document0, (java.io.OutputStream) byteBuffer3);
        pdfWriter4.setEncryption(true, "REMOTEGOTO", "xmpMM:VersionID", 561);
        com.lowagie.text.pdf.PdfFileSpecification pdfFileSpecification11 = com.lowagie.text.pdf.PdfFileSpecification.fileExtern(pdfWriter4, "hi!");
        Rectangle rectangle12 = PageSize.A9;
        Document document14 = new Document();
        com.lowagie.text.pdf.ByteBuffer byteBuffer15 = new com.lowagie.text.pdf.ByteBuffer();
        com.lowagie.text.pdf.ByteBuffer byteBuffer17 = byteBuffer15.appendHex((byte) -1);
        com.lowagie.text.pdf.PdfWriter pdfWriter18 = com.lowagie.text.pdf.PdfWriter.getInstance(document14, (java.io.OutputStream) byteBuffer17);
        pdfWriter18.setEncryption(true, "REMOTEGOTO", "xmpMM:VersionID", 561);
        com.lowagie.text.pdf.PdfFileSpecification pdfFileSpecification25 = com.lowagie.text.pdf.PdfFileSpecification.fileExtern(pdfWriter18, "hi!");
        com.lowagie.text.pdf.PdfAnnotation pdfAnnotation28 = com.lowagie.text.pdf.PdfAnnotation.createScreen(pdfWriter4, rectangle12, "dc:coverage", pdfFileSpecification25, "UniCNS-UCS2-V", false);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        Section section0 = new Section();
        section0.setIndentationRight((float) 5);
        float f3 = section0.indentation;
        Anchor anchor4 = new Anchor();
        ListItem listItem5 = new ListItem((Phrase) anchor4);
        int i6 = listItem5.getAlignment();
        Section section7 = section0.addSection((Paragraph) listItem5);
    }
}

