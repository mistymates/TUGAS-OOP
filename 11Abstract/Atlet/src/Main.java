public class Main {
    public static void main(String[] args) {
        Lari pelari = new Lari("Asep Kurniadi", 40);
        Renang perenang = new Renang("Budi Setiawan", 2);

        System.out.println("Latihan Atlet:");
        pelari.latihan();
        perenang.latihan();

        System.out.println("\nKompetisi Atlet:");
        pelari.berkompetisi();
        perenang.berkompetisi();
    }
}