package Inlamningsuppgift_del3;

public class TextCounter {
    private int lineCount = 0;
    private int charCount = 0;
    private int wordCount = 0;
    private String longestWord = "";

    // Method to add a line and update counts
    public boolean addLine(String line) {
        if ("stop".equalsIgnoreCase(line)) {
            return true;  // Indicates to stop reading
        }

        lineCount++;
        charCount += line.length();

        // Split line by whitespace to count words and find the longest word
        String[] words = line.split("\\s+");
        wordCount += words.length;

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return false;  // Continue reading
    }

    public int getLineCount() {
        return lineCount;
    }

    public int getCharCount() {
        return charCount;
    }

    public int getWordCount() {
        return wordCount;
    }

    public String getLongestWord() {
        return longestWord;
    }
}

