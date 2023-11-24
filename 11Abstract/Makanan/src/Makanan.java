public abstract class Makanan {
    private String nama;

    public Makanan(String nama) {
        this.nama = nama;
    }

    public abstract void deskripsi(); // Metode abstrak untuk memberikan informasi tentang makanan

    public String getNama() {
        return nama;
    }
}