package prototypeDesignPattern;

public class SpreadsheetDocument implements Document {
 private String spreadsheetName;
 private int rowCount;
 private int columnCount;

 public SpreadsheetDocument() {
     System.out.println("Creating a Spreadsheet Document prototype.");
 }

 public void setProperties(String spreadsheetName, int rowCount, int columnCount) {
     this.spreadsheetName = spreadsheetName;
     this.rowCount = rowCount;
     this.columnCount = columnCount;
 }

 @Override
 public Document clone() {
     SpreadsheetDocument clone = new SpreadsheetDocument();
     clone.spreadsheetName = this.spreadsheetName;
     clone.rowCount = this.rowCount;
     clone.columnCount = this.columnCount;
     return clone;
 }

 @Override
 public void open() {
     System.out.println("Opening Spreadsheet Document: " + spreadsheetName + " (" + rowCount + " rows, " + columnCount + " columns)");
 }

 @Override
 public String getType() {
     return "Spreadsheet";
 }

 @Override
 public String toString() {
     return "Type: Spreadsheet, Name: " + spreadsheetName + ", Rows: " + rowCount + ", Columns: " + columnCount;
 }
}

