package org.howard.edu.lsp.finalexam.question3;

/**
 * Singleton ShapeFactory that creates instances of different shapes.
 */
public class ShapeFactory {
    private static ShapeFactory instance;

    private ShapeFactory() {}

    /**
     * Returns the singleton instance of ShapeFactory.
     * 
     * @return the singleton instance of ShapeFactory.
     */
    public static ShapeFactory getInstance() {
        if (instance == null) {
            instance = new ShapeFactory();
        }
        return instance;
    }

    /**
     * Creates a shape based on the provided shape type.
     * 
     * @param shapeType, the type of shape to create.
     * @return a shape object or null if the shape type is unknown.
     */
    public Shape createShape(String shapeType) {
        switch (shapeType.toLowerCase()) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "triangle":
                return new Triangle();
            default:
                return null;
        }
    }
}

