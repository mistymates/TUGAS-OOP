import java.util.ArrayList;
import java.util.List;

public class SteamLibrary {
    private List<Game> daftarGame;

    public SteamLibrary() {
        this.daftarGame = new ArrayList<>();
    }

    public void tambahGame(Game game) {
        daftarGame.add(game);
    }

    public void tampilkanGame() {
        System.out.println("Daftar Game di Steam:");
        for (Game game : daftarGame) {
            System.out.println(game);
        }
    }

    public double hitungTotalHarga() {
        double totalHarga = 0;
        for (Game game : daftarGame) {
            totalHarga += game.getHarga();
        }
        return totalHarga;
    }
}
