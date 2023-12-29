public class Motherboard extends Part {
    private int ddr;

    public Motherboard(String name, int price, int ddr) {
        super(name, price);
        this.ddr = ddr;
    }

    public int getDDR() {
        return ddr;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("DDR: " + ddr);
    }
}
