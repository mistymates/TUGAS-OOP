public class Renang extends Atlet {
    private int gaya;

    public Renang(String nama, int gaya) {
        super(nama);
        this.gaya = gaya;
    }

    @Override
    public void latihan() {
        System.out.println(nama + " sedang latihan renang.");
    }

    @Override
    public void berkompetisi() {
        System.out.println(nama + " sedang berkompetisi renang dengan gaya nomor " + gaya + ".");
    }
}