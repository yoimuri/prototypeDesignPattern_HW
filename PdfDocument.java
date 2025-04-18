package prototypeDesignPattern;

public class PdfDocument implements Document {
 private String fileName;
 private String author;
 private int pageCount;
 private String name;

 public PdfDocument() {
     System.out.println("Creating a PDF Document prototype.");
 }

 public void setProperties(String fileName, String author, int pageCount) {
     this.fileName = fileName;
     this.author = author;
     this.pageCount = pageCount;
 }

 @Override
 public Document clone() {
     PdfDocument clone = new PdfDocument();
     clone.fileName = this.fileName;
     clone.author = this.author;
     clone.pageCount = this.pageCount;
     clone.name = this.name;
     return clone;
 }

 @Override
 public void open() {
     System.out.println("Opening PDF Document: " + fileName + " by " + author + " (" + pageCount + " pages)");
 }

 @Override
 public String getType() {
     return "PDF";
 }

 @Override
 public String toString() {
     return "Type: PDF, File: " + fileName + ", Author: " + author + ", Pages: " + pageCount;
 }
}

