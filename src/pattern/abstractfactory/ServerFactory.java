package pattern.abstractfactory;

public class ServerFactory implements ComputerAbstractFactory{

    private String CPU;
    private String HDD;
    private String RAM;

    ServerFactory(String CPU, String RAM, String HDD) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.HDD = HDD;
    }

    @Override
    public Computer createComputer() {
        return new Server(this.CPU, this.RAM, this.HDD);
    }
}
