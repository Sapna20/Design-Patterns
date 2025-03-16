package pattern.abstractfactory;

public class PC extends Computer {

    private String CPU;
    private String HDD;
    private String RAM;

    PC(String CPU, String HDD, String RAM) {
        this.CPU = CPU;
        this.HDD = HDD;
        this.RAM = RAM;
    }
    @Override
    public String getCPU() {
        return this.CPU;
    }

    @Override
    public String getHDD() {
        return this.HDD;
    }

    @Override
    public String getRAM() {
        return this.getRAM();
    }
}
