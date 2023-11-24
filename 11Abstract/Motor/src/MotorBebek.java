public class MotorBebek extends Motor {
    public MotorBebek(String merek) {
        super(merek);
    }

    @Override
    public void nyalakanMesin() {
        System.out.println("Menyalakan mesin motor sederhana " + merek + ".");
    }

    @Override
    public void kendarai() {
        System.out.println("Mengendarai motor sederhana " + merek + ".");
    }

    @Override
    public void hentikan() {
        System.out.println("Menghentikan motor sederhana " + merek + ".");
    }

    @Override
    public void displayInfo() {
        System.out.println("Motor Sederhana " + merek);
    }
}