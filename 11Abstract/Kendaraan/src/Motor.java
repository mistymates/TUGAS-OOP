public class Motor extends Kendaraan {
    public Motor(String merek) {
        super(merek);
    }

    @Override
    public void start() {
        System.out.println("Sepeda motor " + merek + " dinyalakan.");
    }

    @Override
    public void stop() {
        System.out.println("Sepeda motor " + merek + " dimatikan.");
    }
}