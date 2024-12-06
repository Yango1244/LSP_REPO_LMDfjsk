package org.howard.edu.lsp.finalexam.question3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapeRendererTest {
	
    @Test
    void testCircleInstantiation() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape shape = factory.getShape("circle");
        assertNotNull(shape, "Shape should not be null");
        assertTrue(shape instanceof Circle, "Expected instance of circle");
    }

    @Test
    void testRectangleInstantiation() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape shape = factory.getShape("rectangle");
        assertNotNull(shape, "Shape should not be null");
        assertTrue(shape instanceof Rectangle, "Expected instance of rectangle");
    }

    @Test
    void testTriangleInstantiation() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape shape = factory.getShape("triangle");
        assertNotNull(shape, "Shape should not be null");
        assertTrue(shape instanceof Triangle, "Expected instance of triangle");
    }

}

// Resource used: https://www.w3schools.com/java/ref_keyword_instanceof.asp
