import java.util.*;

class Part {
    protected String name;
    protected int price;

    public Part(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void displayDetails() {
        System.out.print(name + "(Rp. " + price + ")");
    }
}