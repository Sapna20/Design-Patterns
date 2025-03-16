package pattern.builder;

public interface ComputerBuilder {
    ComputerBuilder buildProcessor(String processor);
    ComputerBuilder buildStorage(int storage);
    ComputerBuilder buildMemory(int memory);
    ComputerBuilder buildGraphics(String graphics);
    Computer buildComputer();
}
