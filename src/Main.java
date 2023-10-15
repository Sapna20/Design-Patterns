import pattern.factory.*;

public class Main {
    public static void main(String[] args) {

        //Factory design pattern
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape triangle = shapeFactory.getShapeInstance("Triangle");
        triangle.draw();

        //Singleton design pattern


    }
}