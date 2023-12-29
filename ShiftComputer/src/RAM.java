public class RAM extends Part {
    private int gb;

    public RAM(String name, int price, int gb) {
        super(name, price);
        this.gb = gb;
    }

    public int getGb() {
        return gb;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Ram: " + gb + "GB.");
    }
}
