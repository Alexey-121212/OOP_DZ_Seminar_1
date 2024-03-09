package OOP_DZ_Seminar_1;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        Product product1 = new Product("Brand #1", "Name #1", 350);
        System.out.println(product1.displayInfo());

        product1.setPrice(-1400);
        product1.setName("~");
        System.out.println(product1.displayInfo());

        BottleOfWater bottleOfWater1 = new BottleOfWater("Brand #2", "Name #2", 210, 0.5);
        System.out.println(bottleOfWater1.displayInfo());

        Product bottleOfWater2 = new BottleOfWater("Brand #2", "Name #2", 210, 0.5);
        System.out.println(bottleOfWater2.displayInfo());

        BottleOfMilk bottleOfMilk1 = new BottleOfMilk("Brand #3", "Name #3", 310, 0.5, 10);
        System.out.println(bottleOfMilk1.displayInfo());

        Product bottleOfMilk2 = new BottleOfMilk("Brand #3", "Name #3", 310, 0.5, 10);
        System.out.println(bottleOfMilk2.displayInfo());

        Product packOfGum = new PackOfGum("Brand #5", "Name #5", 100, 13337);
        System.out.println(packOfGum.displayInfo());

        Product packOfGum2 = new PackOfGum("Brand #6", "Name #6", 150, 5);
        System.out.println(packOfGum2.displayInfo());

        Product packOfGum3 = new PackOfGum("Brand #5", "Name #5", 100, 20);
        System.out.println(packOfGum3.displayInfo());

        ArrayList<Product> list = new ArrayList<>();
        list.add(bottleOfMilk1);
        list.add(bottleOfWater1);
        list.add(bottleOfMilk2);
        list.add(bottleOfWater2);
        list.add(new BottleOfMilk("Brand #4", "Name #5", 310, 0.33, 1));
        list.add(packOfGum);
        list.add(packOfGum2);
        list.add(packOfGum3);

        VendingMachine vendingMachine = new VendingMachine(list);
        PackOfGum gum = vendingMachine.getPackOfGum(20);
        if (gum != null) {
            System.out.println("Вы купили: ");
            System.out.println(gum.displayInfo());
        } else {
            System.out.println("Такой жевачки нет в автомате.");
        }
    }
}
