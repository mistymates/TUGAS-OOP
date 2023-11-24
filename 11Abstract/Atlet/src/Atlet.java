public abstract class Atlet {
    protected String nama;

    public Atlet(String nama) {
        this.nama = nama;
    }

    public abstract void latihan();
    public abstract void berkompetisi();
}