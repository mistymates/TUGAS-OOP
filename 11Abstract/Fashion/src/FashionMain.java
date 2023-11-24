public class FashionMain {
    public static void main(String[] args) {
        Atasan kemeja = new Atasan("Kemeja", "Formal");
        Bawahan celanaJeans = new Bawahan("Celana Jeans", "Denim");

        kemeja.deskripsi();
        kemeja.kenakan();

        celanaJeans.deskripsi();
        celanaJeans.kenakan();
    }
}