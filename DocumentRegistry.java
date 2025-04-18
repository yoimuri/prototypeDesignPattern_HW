package prototypeDesignPattern;

public class DocumentRegistry {
 private PdfDocument pdfPrototype;
 private TextDocument textDocumentPrototype;
 private SpreadsheetDocument spreadsheetPrototype;

 public DocumentRegistry() {
     pdfPrototype = new PdfDocument();
     textDocumentPrototype = new TextDocument();
     spreadsheetPrototype = new SpreadsheetDocument();
 }

 public PdfDocument createPdfDocument(String fileName, String author, int pageCount) {
     PdfDocument clone = (PdfDocument) pdfPrototype.clone();
     clone.setProperties(fileName, author, pageCount);
     return clone;
 }

 public TextDocument createTextDocument(String path, String encoding, int wordCount) {
     TextDocument clone = (TextDocument) textDocumentPrototype.clone();
     clone.setProperties(path, encoding, wordCount);
     return clone;
 }

 public SpreadsheetDocument createSpreadsheetDocument(String name, int rows, int cols) {
     SpreadsheetDocument clone = (SpreadsheetDocument) spreadsheetPrototype.clone();
     clone.setProperties(name, rows, cols);
     return clone;
 }
}

