// Main class untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        Banjir banjir = new Banjir();
        GempaBumi gempaBumi = new GempaBumi();
        Tornado tornado = new Tornado();

        banjir.deskripsi();
        gempaBumi.deskripsi();
        tornado.deskripsi();
    }
}
