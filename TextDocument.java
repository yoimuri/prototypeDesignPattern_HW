package prototypeDesignPattern;

public class TextDocument implements Document {
 private String filePath;
 private String encoding;
 private int wordCount;

 public TextDocument() {
     System.out.println("Creating a Text Document prototype.");
 }

 public void setProperties(String filePath, String encoding, int wordCount) {
     this.filePath = filePath;
     this.encoding = encoding;
     this.wordCount = wordCount;
 }

 @Override
 public Document clone() {
     TextDocument clone = new TextDocument();
     clone.filePath = this.filePath;
     clone.encoding = this.encoding;
     clone.wordCount = this.wordCount;
     return clone;
 }

 @Override
 public void open() {
     System.out.println("Opening Text Document: " + filePath + " with encoding: " + encoding + " (" + wordCount + " words)");
 }

 @Override
 public String getType() {
     return "Text";
 }

 @Override
 public String toString() {
     return "Type: Text, Path: " + filePath + ", Encoding: " + encoding + ", Words: " + wordCount;
 }
}
