// Sedan.java
public class Sedan extends Mobil {
    private int penumpang;

    public Sedan(String merk, int penumpang) {
        super(merk);
        this.penumpang = penumpang;
    }

    @Override
    public void nyalakanMesin() {
        System.out.println("Menyalakan mesin " + merk + ".");
    }

    @Override
    public void berkendara() {
        System.out.println("Mengendarai mobil " + merk + " dengan " + penumpang + " penumpang.");
    }

    @Override
    public void berhenti() {
        System.out.println("Menghentikan mobil " + merk + ".");
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Mobil " + merk);
        System.out.println("Kapasitas Penumpang: " + penumpang);
    }
}
