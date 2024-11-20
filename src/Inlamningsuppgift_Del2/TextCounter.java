package Inlamningsuppgift_Del2;
public class TextCounter {
    private int lineCount = 0;
    private int charCount = 0;

    // Method to add a line and update counts
    public void addLine(String line) {
        lineCount++;
        charCount += line.length();
    }

    // Method to retrieve the line count
    public int getLineCount() {
        return lineCount;
    }

    // Method to retrieve the character count
    public int getCharCount() {
        return charCount;
    }
}