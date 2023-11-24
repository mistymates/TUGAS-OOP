public abstract class Monster {
    public static String nama;
    private int kekuatan;

    public Monster(String nama, int kekuatan) {
        this.nama = nama;
        this.kekuatan = kekuatan;
    }

    public abstract void attack(); 

    public void displayInfo() {
        System.out.println("Monster " + nama + " memiliki kekuatan " + kekuatan);
    }

}