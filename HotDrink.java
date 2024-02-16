public class HotDrink extends BottleOfWater {
    private int temp;

    public HotDrink(String name, double cost, double volume, int temp) {
        super(name, cost, volume);
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
}
