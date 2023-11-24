public class MotorApp {
    public static void main(String[] args) {
        MotorSport sportMotor = new MotorSport("Yamaha R1");
        MotorBebek sederhanaMotor = new MotorBebek("Honda Supra");

        System.out.println("Informasi Motor Sport:");
        sportMotor.displayInfo();
        sportMotor.nyalakanMesin();
        sportMotor.kendarai();
        sportMotor.hentikan();
        System.out.println();

        System.out.println("Informasi Motor Sederhana:");
        sederhanaMotor.displayInfo();
        sederhanaMotor.nyalakanMesin();
        sederhanaMotor.kendarai();
        sederhanaMotor.hentikan();
    }
}