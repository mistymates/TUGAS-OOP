public class Boots extends Sepatu {
    public Boots(String merek) {
        super(merek);
    }

    @Override
    public void deskripsi() {
        System.out.println("Boots " + getMerek() + ": Cocok untuk anak metal dan bikers.");
    }

    @Override
    public void ukuran() {
        System.out.println("Ukuran: Tersedia dalam berbagai ukuran.");
    }

    @Override
    public void tipePakai() {
        System.out.println("Tipe Pakai: Cocok untuk kegiatan luar ruangan dan cuaca ekstrem.");
    }
}