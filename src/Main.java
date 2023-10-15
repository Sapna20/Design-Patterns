import pattern.factory.*;

public class Main {
    public static void main(String[] args) {

        //Factory design pattern
        ShapeFactory shapeFactory = new ShapeFactory();
        IShape triangle = shapeFactory.getShapeInstance("Triangle");
        triangle.draw();

        IShape square = shapeFactory.getShapeInstance("Square");
        square.draw();

        //Singleton design pattern


    }
}