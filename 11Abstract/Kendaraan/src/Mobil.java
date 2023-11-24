public class Mobil extends Kendaraan {
    public Mobil(String merek) {
        super(merek);
    }

    @Override
    public void start() {
        System.out.println("Mobil " + merek + " dinyalakan.");
    }

    @Override
    public void stop() {
        System.out.println("Mobil " + merek + " dimatikan.");
    }
}