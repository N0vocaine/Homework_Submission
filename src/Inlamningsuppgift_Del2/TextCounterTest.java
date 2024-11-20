package Inlamningsuppgift_Del2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TextCounterTest {

    @Test
    public void testNormalInput() {
        TextCounter counter = new TextCounter();
        counter.addLine("Hello World");
        counter.addLine("Java Programming");

        assertEquals(2, counter.getLineCount(), "Line count should be 2");
        assertEquals(27, counter.getCharCount(), "Character count should be 24");
    }
    @Test
    public void testEmptyInput() {
        TextCounter counter = new TextCounter();

        assertEquals(0, counter.getLineCount(), "Line count should be 0 for no input");
        assertEquals(0, counter.getCharCount(), "Character count should be 0 for no input");
    }
    @Test
    public void testMixedInputLength() {
        TextCounter counter = new TextCounter();
        counter.addLine("Short");
        counter.addLine("This is a longer line of text.");
        counter.addLine("");

        assertEquals(3, counter.getLineCount(), "Line count should match the number of lines added");
        assertEquals(35, counter.getCharCount(), "Character count should reflect total characters in non-empty lines");
    }
}