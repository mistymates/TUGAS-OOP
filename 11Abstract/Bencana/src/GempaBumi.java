public class GempaBumi extends BencanaAlam {
    public GempaBumi() {
        super("Gempa Bumi");
    }

    @Override
    public void deskripsi() {
        System.out.println("Bencana " + getJenis() + ": Getaran bumi yang disebabkan oleh pergeseran lempeng.");
    }
}
