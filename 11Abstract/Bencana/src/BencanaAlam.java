public abstract class BencanaAlam {
    private String jenis;

    public BencanaAlam(String jenis) {
        this.jenis = jenis;
    }

    public abstract void deskripsi(); // Metode abstrak untuk memberikan informasi tentang bencana

    public String getJenis() {
        return jenis;
    }
}