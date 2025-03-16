package pattern.abstractfactory;

public class PCFactory implements ComputerAbstractFactory{

    private String CPU;
    private String HDD;
    private String RAM;

    PCFactory(String CPU, String HDD, String RAM) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.HDD = HDD;
    }

    @Override
    public Computer createComputer() {
        return new PC(this.CPU, this.HDD, this.RAM);
    }
}
