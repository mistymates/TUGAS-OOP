public class CPU extends Part {
    private int core;

    public CPU(String name, int price, int core) {
        super(name, price);
        this.core = core;
    }

    public int getCore() {
        return core;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Cores: " + core +" Cores");
    }
}
