public class MakananRingan extends Makanan {
    public MakananRingan(String nama) {
        super(nama);
    }

    @Override
    public void deskripsi() {
        System.out.println("Makanan Ringan " + getNama() + ": Cocok untuk camilan di antara waktu makan.");
    }
}