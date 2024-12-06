package org.howard.edu.lsp.finalexam.question3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShapeRendererTest {

    @Test
    public void testRenderCircle() {
        ShapeRenderer renderer = new ShapeRenderer();
        assertDoesNotThrow(() -> renderer.renderShape("circle"));
    }

    @Test
    public void testRenderRectangle() {
        ShapeRenderer renderer = new ShapeRenderer();
        assertDoesNotThrow(() -> renderer.renderShape("rectangle"));
    }

    @Test
    public void testRenderTriangle() {
        ShapeRenderer renderer = new ShapeRenderer();
        assertDoesNotThrow(() -> renderer.renderShape("triangle"));
    }

    @Test
    public void testRenderUnknownShape() {
        ShapeRenderer renderer = new ShapeRenderer();
        assertDoesNotThrow(() -> renderer.renderShape("hexagon"));
    }

    @Test
    public void testSingletonShapeFactory() {
        ShapeFactory factory1 = ShapeFactory.getInstance();
        ShapeFactory factory2 = ShapeFactory.getInstance();
        assertSame(factory1, factory2, "ShapeFactory should be a singleton.");
    }

    @Test
    public void testFactoryCreatesCircle() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape circle = factory.createShape("circle");
        assertNotNull(circle, "Factory should create a circle.");
        assertTrue(circle instanceof Circle, "The created shape should be an instance of Circle.");
    }

    @Test
    public void testFactoryCreatesRectangle() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape rectangle = factory.createShape("rectangle");
        assertNotNull(rectangle, "Factory should create a rectangle.");
        assertTrue(rectangle instanceof Rectangle, "The created shape should be an instance of Rectangle.");
    }

    @Test
    public void testFactoryCreatesTriangle() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape triangle = factory.createShape("triangle");
        assertNotNull(triangle, "Factory should create a triangle.");
        assertTrue(triangle instanceof Triangle, "The created shape should be an instance of Triangle.");
    }

    @Test
    public void testFactoryCreatesUnknownShape() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape unknown = factory.createShape("hexagon");
        assertNull(unknown, "Factory should return null for an unknown shape.");
    }
}

