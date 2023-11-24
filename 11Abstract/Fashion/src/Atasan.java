public class Atasan extends Pakaian {
    private String model;

    public Atasan(String merek, String model) {
        super(merek);
        this.model = model;
    }

    @Override
    public void deskripsi() {
        System.out.println("Atasan " + getMerek() + " dengan model " + model);
    }

    public void kenakan() {
        System.out.println("Memakai atasan " + getMerek());
    }
}