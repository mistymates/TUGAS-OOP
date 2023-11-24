// AplikasiKendaraan.java
public class App {
    public static void main(String[] args) {
        Mobil toyotaSupra = new Mobil("Toyota");
        Motor yamahaNmax = new Motor ("Honda Beat");

        System.out.println("Informasi Mobil:");
        toyotaSupra.start();
        toyotaSupra.stop();

        System.out.println("\nInformasi Sepeda Motor:");
        yamahaNmax.start();
        yamahaNmax.stop();
    }
}