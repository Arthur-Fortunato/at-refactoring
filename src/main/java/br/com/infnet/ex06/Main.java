package br.com.infnet.ex06;

public class Main {
    public static void main(String[] args) {
        Document htmlDocument = new HtmlDocument();
        Document pdfDocument = new PdfDocument();
        Document txtDocument = new TxtDocument();

        htmlDocument.print();
        pdfDocument.print();
        txtDocument.print();
    }
}
