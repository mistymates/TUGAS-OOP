public abstract class Sepatu {
    private String merek;

    public Sepatu(String merek) {
        this.merek = merek;
    }

    public abstract void deskripsi(); 

    public abstract void ukuran(); 

    public abstract void tipePakai(); 

    public String getMerek() {
        return merek;
    }
}
