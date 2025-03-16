package pattern.abstractfactory;

public abstract class Computer {
    public abstract String getCPU();
    public abstract String getHDD();
    public abstract String getRAM();

    @Override
    public String toString() {
        return "CPU=" + this.getCPU() + ", HDD=" + this.getHDD() + " , RAM=" + this.getRAM();
    }
}
