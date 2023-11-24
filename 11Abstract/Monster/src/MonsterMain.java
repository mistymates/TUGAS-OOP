public class  MonsterMain {
    public static void main(String[] args) {
        MonsterAir monsterUdara = new MonsterAir("Budi", 90);
        MonsterTanah monsterTanah = new MonsterTanah("Asep", 40);

        monsterUdara.displayInfo();
        monsterUdara.attack();

        monsterTanah.displayInfo();
        monsterTanah.attack();

        if (monsterUdara.getKekuatan() > monsterTanah.getKekuatan()) {
            System.out.println("Monster " + monsterTanah.getNama() + " kalah!");
        } else if (monsterUdara.getKekuatan() < monsterTanah.getKekuatan()) {
            System.out.println("Monster " + monsterUdara.getNama() + " kalah!");
        } else {
            System.out.println("Kedua monster seri!");
        }
    }
}