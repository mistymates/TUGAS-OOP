public abstract class BencanaAlam {
    private String jenis;

    public BencanaAlam(String jenis) {
        this.jenis = jenis;
    }

    public abstract void deskripsi(); 

    public String getJenis() {
        return jenis;
    }
}