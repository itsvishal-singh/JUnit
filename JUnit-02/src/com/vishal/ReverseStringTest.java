package com.vishal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void reverseString() {
        ReverseString reverse = new ReverseString();
        assertEquals("avaj", reverse.reverseString("java"));
    }
}