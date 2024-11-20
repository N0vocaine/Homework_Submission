package Inlamningsuppgift_del3;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TextCountTest {
    @Test
    public void testNormalInput() {
        TextCounter counter = new TextCounter();
        counter.addLine("Hello world");
        counter.addLine("Java programming language");

        assertEquals(2, counter.getLineCount(), "Line count should be 2");
        assertEquals(36, counter.getCharCount(), "Character count should be 36");
        assertEquals(5, counter.getWordCount(), "Word count should be 5");
        assertEquals("programming", counter.getLongestWord(), "Longest word should be 'programming'");
    }
    @Test
    public void testEmptyInput() {
        TextCounter counter = new TextCounter();

        assertEquals(0, counter.getLineCount(), "Line count should be 0 for no input");
        assertEquals(0, counter.getCharCount(), "Character count should be 0 for no input");
        assertEquals(0, counter.getWordCount(), "Word count should be 0 for no input");
        assertEquals("", counter.getLongestWord(), "Longest word should be an empty string for no input");
    }
    @Test
    public void testMixedInputLength() {
        TextCounter counter = new TextCounter();
        counter.addLine("short");
        counter.addLine("This is a very long line of text");
        counter.addLine("");

        assertEquals(3, counter.getLineCount(), "Line count should be 3");
        assertEquals(37, counter.getCharCount(), "Character count should be 37");
        assertEquals(10, counter.getWordCount(), "Word count should be 10");
        assertEquals("short", counter.getLongestWord(), "Longest word should be 'short'");
    }
}


