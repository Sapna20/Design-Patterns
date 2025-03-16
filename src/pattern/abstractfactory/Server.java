package pattern.abstractfactory;

public class Server extends Computer{
    private String CPU;
    private String HDD;
    private String RAM;

    Server(String CPU, String HDD, String RAM ) {
        this.CPU = CPU;
        this.HDD = HDD;
        this.RAM = RAM;
    }

    @Override
    public String getCPU() {
        return CPU;
    }

    @Override
    public String getHDD() {
        return HDD;
    }

    @Override
    public String getRAM() {
        return RAM;
    }
}
