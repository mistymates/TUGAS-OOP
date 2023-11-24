    public class Tornado extends BencanaAlam {
    public Tornado() {
        super("Tornado");
    }

    @Override
    public void deskripsi() {
        System.out.println("Bencana " + getJenis() + ": Angin kencang berputar dan membentuk tornado.");
    }
}
