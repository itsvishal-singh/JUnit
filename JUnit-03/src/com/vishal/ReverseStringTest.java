package com.vishal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void testReverseString_OneWord() {
        ReverseString reverse = new ReverseString();
        assertEquals("avaJ", reverse.reverseString("Java"));
    }
    @Test
    void testReverseString_MultipleWord() {
        ReverseString reverse = new ReverseString();
        assertEquals("ysae si avaJ", reverse.reverseString("Java is easy"));
    }
}