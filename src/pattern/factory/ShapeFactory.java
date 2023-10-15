package pattern.factory;

public class ShapeFactory {
    public Shape getShapeInstance(String type) {
        if(type.equals("Triangle")) {
            return new Triangle();
        } else if(type.equals("Rectangle")) {
            return new Rectangle();
        } else if(type.equals("Square")) {
            return new Square();
        }

        return null;

    }
}
