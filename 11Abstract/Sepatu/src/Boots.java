public class Boots extends Sepatu {
    public Boots(String merek) {
        super(merek);
    }

    @Override
    public void deskripsi() {
        System.out.println("Boots " + getMerek() + ": Ideal untuk cuaca dingin dan kondisi medan yang kasar.");
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