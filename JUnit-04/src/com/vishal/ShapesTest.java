package com.vishal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapesTest {

    @Test
    void computeSquareArea() {
        Shapes shapes = new Shapes();
        assertEquals(576, shapes.computeSquareArea(24));
    }
    @Test
    void computeCircleArea() {
        Shapes shapes = new Shapes();
        assertEquals(78.5, shapes.computeCircleArea(5), "Area of Circle Calculation is failed");
    }
}