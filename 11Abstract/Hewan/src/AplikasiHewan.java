public class AplikasiHewan {
    public static void main(String[] args) {
        Kucing kucingKampung = new Kucing("Mpung");
        Anjing anjingGolden = new Anjing("Bobby");

        System.out.println("Informasi Kucing:");
        kucingKampung.bersuara();
        kucingKampung.makan();

        System.out.println("\nInformasi Anjing:");
        anjingGolden.bersuara();
        anjingGolden.makan();
    }
}