package OOP_DZ_Seminar_1;

public class PackOfGum extends Product {
    private int gumNum;

    public int getNum() {
        return gumNum;
    }

    public boolean setNum(int num) {
        if (num == 5 || num == 10 || num == 20) {
            gumNum = num;
            return true;
        } else {
            return false;
        }
    }

    public PackOfGum(String brand, String name, double price, int gumNum) {
        super(brand, name, price);
        if (!setNum(gumNum))
            setNum(10);
    }

    @Override
    public String displayInfo() {
        return String.format(
                "Пачкаа жевательной резинки\n\t[Производитель: %s\n\tНаименование: %s\n\tСтоимость: %.2f\n\tКоличество подушечек или пластинок: %d]",
                brand, name, price, gumNum);
    }
}
