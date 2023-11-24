public class Minuman extends Makanan {
    public Minuman(String nama) {
        super(nama);
    }

    @Override
    public void deskripsi() {
        System.out.println("Minuman " + getNama() + ": Menyegarkan dan cocok untuk diminum kapan saja.");
    }
}