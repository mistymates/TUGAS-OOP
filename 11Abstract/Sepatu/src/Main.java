public class Main {
    public static void main(String[] args) {
        Sneaker adidasTampa = new Sneaker("Adidas Tampa");
        Boots docmart1461 = new Boots("Doctor Martens");

        adidasTampa.deskripsi();
        adidasTampa.ukuran();
        adidasTampa.tipePakai();

        docmart1461.deskripsi();
        docmart1461.ukuran();
        docmart1461.tipePakai();
    }
}