package Inlamningsuppgift_del3;

import java.util.Scanner;

public class TextReader {
    private TextCounter counter;
    private Scanner scanner;

    public TextReader(TextCounter counter) {
        this.counter = counter;
        this.scanner = new Scanner(System.in);
    }

    // Method to start reading input until "stop" is encountered
    public void startReading() {
        System.out.println("Enter text (type 'stop' to finish):");

        while (true) {
            String line = scanner.nextLine();
            if (counter.addLine(line)) {
                break;  // Stop reading if "stop" was entered
            }
        }
        printResults();
    }


    // Method to print results
    public void printResults() {
        System.out.println("Total lines (excluding 'stop'): " + counter.getLineCount());
        System.out.println("Total characters: " + counter.getCharCount());
        System.out.println("Total words: " + counter.getWordCount());
        System.out.println("Longest word: " + counter.getLongestWord());


    }
}






