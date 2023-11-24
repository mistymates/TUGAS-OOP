public abstract class Pakaian {
    private String merek;

    public Pakaian(String merek) {
        this.merek = merek;
    }

    public String getMerek() {
        return merek;
    }

    public abstract void deskripsi(); // Metode abstrak untuk memberikan informasi tentang pakaian
}