public class MonsterAir extends Monster {
    public MonsterAir(String nama, int kekuatan) {
        super(nama, kekuatan);
    }

    @Override
    public void attack() {
        System.out.println("Monster udara " + super.nama + " menyerang dengan membangkitkan badai!");
    }

    public int getKekuatan() {
        return 0;
    }

    public String getNama() {
        return null;
    }
}