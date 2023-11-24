public class Banjir extends BencanaAlam {
    public Banjir() {
        super("Banjir");
    }

    @Override
    public void deskripsi() {
        System.out.println("Bencana " + getJenis() + ": Kebanyakan Air dan melanda wilayah dataran rendah.");
    }
}