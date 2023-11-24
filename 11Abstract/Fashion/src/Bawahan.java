public class Bawahan extends Pakaian {
    private String jenis;

    public Bawahan(String merek, String jenis) {
        super(merek);
        this.jenis = jenis;
    }

    @Override
    public void deskripsi() {
        System.out.println("Bawahan " + getMerek() + " jenis " + jenis);
    }

    public void kenakan() {
        System.out.println("Memakai bawahan " + getMerek());
    }
}