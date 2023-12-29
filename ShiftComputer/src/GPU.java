public class GPU extends Part {
    private int vram;

    public GPU(String name, int price, int vram) {
        super(name, price);
        this.vram = vram;
    }

    public int getVram() {
        return vram;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("VRAM: " + vram + "GB.");
    }
}
