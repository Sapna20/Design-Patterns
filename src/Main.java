import pattern.builder.Computer;
import pattern.builder.ComputerBuilder;
import pattern.builder.ComputerDirector;
import pattern.builder.DesktopComputerBuilder;
import pattern.factory.*;
import pattern.singleton.WaterTank;

public class Main {

    private static void factoryDesignDemoBasic() {
        //Factory design pattern
        System.out.println("-------------------------Factory design pattern -------------------------");

        ShapeFactory shapeFactory = new ShapeFactory();
        IShape triangle = shapeFactory.getShapeInstance("Triangle");
        triangle.draw();

        IShape square = shapeFactory.getShapeInstance("Square");
        square.draw();

        IShape rectangle = shapeFactory.getShapeInstance("Rectangle");
        rectangle.draw();
    }

    private static void singletonDesignDemo() {
        //Singleton design pattern
        System.out.println("-------------------------Singleton design pattern -------------------------");

        WaterTank waterTank = WaterTank.getInstanceOfWaterTank();
        System.out.println("Water level: " + waterTank.getWaterLevel());
        waterTank.setWaterLevel(10);
        System.out.println("Reset water level to 10: " + waterTank.getWaterLevel());
        System.out.println("Take units water: " + waterTank.takeWater(5));
        System.out.println("Fill 2 units water: " + waterTank.fillWater(2));
    }

    private static void builderDesignDemo() {
        System.out.println("-------------------------builder design pattern -------------------------");
        ComputerBuilder desktopBuilder = new DesktopComputerBuilder();
        ComputerDirector director = new ComputerDirector(desktopBuilder);
        Computer desktop = director.constructComputer();

        // Access the constructed Computer object
        System.out.println(desktop.toString());

    }

    public static void main(String[] args) {

        factoryDesignDemoBasic();

        singletonDesignDemo();

        builderDesignDemo();

    }
}