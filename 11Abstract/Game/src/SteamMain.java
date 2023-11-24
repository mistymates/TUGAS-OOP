public class SteamMain {
    public static void main(String[] args) {
        // Membuat beberapa game
        Game game1 = new Game("The Witcher 3", "RPG", 29.99);
        PremiumGame game2 = new PremiumGame("CS:GO", "FPS", 14.99, "Exclusive Skins");
        Game game3 = new Game("Among Us", "Social Deduction", 4.99);

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
// MainSteam.java
