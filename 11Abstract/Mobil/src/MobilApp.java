// AplikasiMobil.java
public class MobilApp {
    public static void main(String[] args) {
        Sedan sedanMobil = new Sedan("Toyota Camry", 5);
        SUV suvMobil = new SUV("Jeep Wrangler", true);

        System.out.println("Informasi Mobil Sedan:");
        sedanMobil.tampilkanInfo();
        sedanMobil.nyalakanMesin();
        sedanMobil.berkendara();
        sedanMobil.berhenti();
        System.out.println();

        System.out.println("Informasi Mobil SUV:");
        suvMobil.tampilkanInfo();
        suvMobil.nyalakanMesin();
        suvMobil.berkendara();
        suvMobil.berhenti();
    }
}
