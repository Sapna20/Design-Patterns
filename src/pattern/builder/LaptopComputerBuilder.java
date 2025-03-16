package pattern.builder;

public class LaptopComputerBuilder implements ComputerBuilder{
    private Computer computer;

    public LaptopComputerBuilder(Computer computer) {
        this.computer = computer;
    }

    @Override
    public ComputerBuilder buildProcessor(String processor) {
        computer.setProcessor((processor));
        return this;
    }

    @Override
    public ComputerBuilder buildStorage(int storage) {
        computer.setStorage(storage);
        return this;
    }

    @Override
    public ComputerBuilder buildMemory(int memory) {
        computer.setMemory(memory);
        return this;
    }

    @Override
    public ComputerBuilder buildGraphics(String graphics) {
        computer.setGraphicsCard(graphics);
        return this;
    }

    @Override
    public Computer buildComputer() {
        return this.computer;
    }
}
