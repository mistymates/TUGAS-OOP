public class Game {
    private String judul;
    private String genre;
    private double harga;

    public Game(String judul, String genre, double harga) {
        this.judul = judul;
        this.genre = genre;
        this.harga = harga;
    }

    public String getJudul() {
        return judul;
    }

    public String getGenre() {
        return genre;
    }

    public double getHarga() {
        return harga;
    }

    @Override
    public String toString() {
        return judul + " - Genre: " + genre + " - Harga: Rp" + harga;
    }
}
// Game.java
