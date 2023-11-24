public class SteamApp {
    public static void main(String[] args) {
        // Membuat beberapa game
        Game game1 = new Game("The Witcher 3", "RPG", 325000);
        Game game2 = new Game("CS:GO", "FPS", 150000);
        Game game3 = new Game("Among Us", "Social Deduction", 65000);

        // Membuat koleksi game di Steam
        SteamLibrary steamLibrary = new SteamLibrary();
        steamLibrary.tambahGame(game1);
        steamLibrary.tambahGame(game2);
        steamLibrary.tambahGame(game3);

        // Menampilkan daftar game dan total harga
        steamLibrary.tampilkanGame();
        System.out.println("\nTotal Harga Game: Rp" + steamLibrary.hitungTotalHarga());
    }
}
