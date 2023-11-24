public class PremiumGame extends Game {
    private String fiturPremium;

    public PremiumGame(String judul, String genre, double harga, String fiturPremium) {
        super(judul, genre, harga);
        this.fiturPremium = fiturPremium;
    }

    public String getFiturPremium() {
        return fiturPremium;
    }

    @Override
    public String toString() {
        return super.toString() + " - Fitur Premium: " + fiturPremium;
    }
}