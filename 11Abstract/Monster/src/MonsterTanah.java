public class MonsterTanah extends Monster {
    public MonsterTanah(String nama, int kekuatan) {
        super(nama, kekuatan);
    }

    @Override
    public void attack() {
        System.out.println("Monster tanah " + super.nama + " menyerang dengan menggempur tanah!");
    }

    public int getKekuatan() {
        return 0;
    }

    public String getNama() {
        return null;
    }
}