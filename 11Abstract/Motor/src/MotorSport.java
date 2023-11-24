public class MotorSport extends Motor {
    public MotorSport(String merek) {
        super(merek);
    }

    @Override
    public void nyalakanMesin() {
        System.out.println("Menyalakan mesin motor sport " + merek + ".");
    }

    @Override
    public void kendarai() {
        System.out.println("Mengendarai motor sport " + merek + ".");
    }

    @Override
    public void hentikan() {
        System.out.println("Menghentikan motor sport " + merek + ".");
    }

    @Override
    public void displayInfo() {
        System.out.println("Motor Sport " + merek);
    }
}