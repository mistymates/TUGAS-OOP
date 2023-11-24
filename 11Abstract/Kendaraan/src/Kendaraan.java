public abstract class Kendaraan {
    protected String merek;

    public Kendaraan(String merek) {
        this.merek = merek;
    }

    public abstract void start();
    public abstract void stop();
}