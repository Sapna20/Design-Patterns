package pattern.singleton;

public class WaterTank {
    private static WaterTank waterTank = null;
    private int waterLevel;

    private WaterTank(){

    }

    public static synchronized WaterTank getInstanceOfWaterTank() {
        if(waterTank == null) {
            waterTank = new WaterTank();
        }
        return waterTank;
    }

    public int fillWater(int amount) {
        this.waterLevel += amount;
        return this.waterLevel;
    }

    public int takeWater(int amount) {
        if(this.waterLevel - amount >= 0) {
            this.waterLevel -= amount;
            return amount;
        }
        return this.waterLevel;
    }

    public void setWaterLevel(int waterLevel) {
        this.waterLevel = waterLevel;
    }

    public int getWaterLevel() {
        return this.waterLevel;
    }

}
