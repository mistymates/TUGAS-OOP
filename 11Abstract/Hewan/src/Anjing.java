public class Anjing extends Hewan {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " mengeluarkan suara: Woof!");
    }

    @Override
    public void makan() {
        System.out.println(nama + " sedang makan tulang.");
    }
}