public class Kucing extends Hewan {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " mengeluarkan suara: Meow!");
    }

    @Override
    public void makan() {
        System.out.println(nama + " sedang makan ikan.");
    }
}