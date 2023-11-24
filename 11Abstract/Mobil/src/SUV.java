// SUV.java
public class SUV extends Mobil {
    private boolean kemampuanOffRoad;

    public SUV(String merk, boolean kemampuanOffRoad) {
        super(merk);
        this.kemampuanOffRoad = kemampuanOffRoad;
    }

    @Override
    public void nyalakanMesin() {
        System.out.println("Menyalakan mesin mobil " + merk + ".");
    }

    @Override
    public void berkendara() {
        System.out.println("Mengendarai mobil " + merk + " dengan kemampuan off-road: " + kemampuanOffRoad + ".");
    }

    @Override
    public void berhenti() {
        System.out.println("Menghentikan mobil " + merk + ".");
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Mobil " + merk);
        System.out.println("Kemampuan Off-Road: " + kemampuanOffRoad);
    }
}
