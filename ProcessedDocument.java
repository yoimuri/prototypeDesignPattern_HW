package prototypeDesignPattern;

public class ProcessedDocument {
 public static void main(String[] args) {
     DocumentRegistry registry = new DocumentRegistry();

     PdfDocument pdf = registry.createPdfDocument("annual_report_2024.pdf", "Acme Corp", 150);
     pdf.open();
     System.out.println(pdf);

     TextDocument text = registry.createTextDocument("meeting_notes.txt", "UTF-8", 250);
     text.open();
     System.out.println(text);

     SpreadsheetDocument sheet = registry.createSpreadsheetDocument("sales_data_q1.xlsx", 1000, 20);
     sheet.open();
     System.out.println(sheet);

     PdfDocument pdf2 = registry.createPdfDocument("summary_report.pdf", "Acme Corp", 30);
     pdf2.open();
 }
}

