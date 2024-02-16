public class Main {
    public static void main(String[] args) {
    BottleOfWaterVendingMachine machine = new BottleOfWaterVendingMachine();
    machine.addProductList(new BottleOfWater("water1",24,3));
    machine.addProductList(new BottleOfWater("water2",22,5));
    machine.addProductList(new BottleOfWater("water3",21,6));
    machine.addProductList(new BottleOfWater("water4",100,7));
    machine.addProductList(new HotDrink("Hot1",200, 50, 50));
    printProductByName(machine, "water1");
    printProductByName(machine, "Hot1" );
    }
    public static void printProductByName(VendingMachine vendingMachine, String name){
        System.out.println(vendingMachine.getProductByName(name));

    }
}