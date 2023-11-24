public class MakananBerat extends Makanan {
    public MakananBerat(String nama) {
        super(nama);
    }

    @Override
    public void deskripsi() {
        System.out.println("Makanan Berat " + getNama() + ": Lauk paling enak di dunia");
    }
}