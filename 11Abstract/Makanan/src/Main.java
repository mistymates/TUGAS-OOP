public class Main {
    public static void main(String[] args) {
        MakananRingan keripik = new MakananRingan("Klepon");
        MakananBerat nasiGoreng = new MakananBerat("Rendang");
        Minuman tehHijau = new Minuman("Teh Pucuk");

        keripik.deskripsi();
        nasiGoreng.deskripsi();
        tehHijau.deskripsi();
    }
}