public class Sneaker extends Sepatu {
    public Sneaker(String merek) {
        super(merek);
    }

    @Override
    public void deskripsi() {
        System.out.println("Sneaker " + getMerek() + ": Cocok untuk gaya kasual dan santai.");
    }

    @Override
    public void ukuran() {
        System.out.println("Ukuran: Tersedia dalam berbagai ukuran.");
    }

    @Override
    public void tipePakai() {
        System.out.println("Tipe Pakai: Biasanya digunakan sehari hari.");
    }
}