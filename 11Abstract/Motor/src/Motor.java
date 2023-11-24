public abstract class Motor {
    protected String merek;

    public Motor(String merek) {
        this.merek = merek;
    }

    public abstract void nyalakanMesin();
    public abstract void kendarai();
    public abstract void hentikan();
    public abstract void displayInfo();
}