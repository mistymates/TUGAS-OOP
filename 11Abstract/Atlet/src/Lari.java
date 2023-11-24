// Lari.java
public class Lari extends Atlet {
    private int kecepatan;

    public Lari(String nama, int kecepatan) {
        super(nama);
        this.kecepatan = kecepatan;
    }

    @Override
    public void latihan() {
        System.out.println(nama + " sedang latihan lari.");
    }

    @Override
    public void berkompetisi() {
        System.out.println(nama + " sedang berkompetisi lari dengan kecepatan " + kecepatan + " km/jam.");
    }
}
