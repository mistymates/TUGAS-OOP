public abstract class Makanan {
    private String nama;

    public Makanan(String nama) {
        this.nama = nama;
    }

    public abstract void deskripsi();

    public String getNama() {
        return nama;
    }
}