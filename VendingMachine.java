package OOP_DZ_Seminar_1;

import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(String name, double volume) {
        for (Product product : products) {
            if (product instanceof BottleOfWater) {
                BottleOfWater bottleOfWater = (BottleOfWater) product;
                if (bottleOfWater.getName().equals(name) && bottleOfWater.getVolume() == volume)
                    return bottleOfWater;
            }
        }
        return null;
    }

    public PackOfGum getPackOfGum(int gumNum) {
        for (Product product : products) {
            if (product instanceof PackOfGum) {
                PackOfGum gum = (PackOfGum) product;
                if (gum.getNum() == gumNum)
                    return gum;
            }
        }
        return null;
    }

}
