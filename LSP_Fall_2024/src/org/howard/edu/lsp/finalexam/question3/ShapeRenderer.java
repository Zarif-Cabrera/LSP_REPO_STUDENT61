package org.howard.edu.lsp.finalexam.question3;

/**
 * ShapeRenderer class that uses ShapeFactory to render shapes.
 */
public class ShapeRenderer {
    private ShapeFactory shapeFactory;

    public ShapeRenderer() {
        this.shapeFactory = ShapeFactory.getInstance();
    }

    /**
     * Renders a shape by using the ShapeFactory to create it and then drawing it.
     * 
     * @param shapeType, the type of shape to render.
     */
    public void renderShape(String shapeType) {
        Shape shape = shapeFactory.createShape(shapeType);
        if (shape != null) {
            shape.draw();
        } else {
            System.out.println("Unknown shape type: " + shapeType);
        }
    }

    public static void main(String[] args) {
        ShapeRenderer renderer = new ShapeRenderer();

        // Render different shapes
        renderer.renderShape("circle");    // Output: Drawing a Circle
        renderer.renderShape("rectangle"); // Output: Drawing a Rectangle
        renderer.renderShape("triangle");  // Output: Drawing a Triangle
        renderer.renderShape("hexagon");   // Output: Unknown shape type: hexagon  
    }
}
