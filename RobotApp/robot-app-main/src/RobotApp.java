import java.util.Scanner;

import Model.Layout;
import Model.Position;
import Model.Robot;

public class RobotApp {
    private Layout layout;
    private Robot robot;
    private Scanner scanner;

    public RobotApp() {
        // contoh konfigurasi awal
        this.layout = new Layout(10, 10, '*');
        this.robot = new Robot('o', new Position(1, 1)); // posisi awal
        this.scanner = new Scanner(System.in);
        String instruction = "";
        System.out.println("-------- Permainan Dimulai --------");
        do {
            processInstruction(); // proses user instruction & updatye robot position
            draw();               // draw updated layout 
        } while (!instruction.equals("x"));
        System.out.println("-------- Permainan Selesai --------");
    }

    private String waitInstruction() {
        System.out.println("-------- Instruksi --------");
        System.out.println("Instruksi: {d=kanan/a=kiri/w=atas/s=bawah}{jumlah langkah}");
        System.out.println("Contoh: w3 berarti 'keatas 3 langkah'");
        System.out.print("Masukan instruksi: ");
        return scanner.nextLine();
    }

    private void draw() {
        System.out.println("------ Posisi Terbaru ------");
        char[][] area = layout.getArea();
        Position robotPosition = robot.getPosition();

        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area[i].length; j++) {
                if (i == robotPosition.getY() && j == robotPosition.getX()) {
                    System.out.print(robot.getIcon());
                } else {
                    System.out.print(area[i][j]);
                }
            }
            System.out.println();
        }
    }

    private void processInstruction() {
        String instruction = waitInstruction();

        if (instruction.equals("x")) {
            return;
        } else if (isValidInstruction(instruction)) {
            char direction = instruction.charAt(0);
            int steps = Integer.parseInt(instruction.substring(1));

            Position currentPosition = robot.getPosition();

            switch (direction) {
                case 'd':
                    currentPosition.setX(Math.min(layout.getMaxX() - 1, currentPosition.getX() + steps));
                    break;
                case 'a':
                    currentPosition.setX(Math.max(0, currentPosition.getX() - steps));
                    break;
                case 'w':
                    currentPosition.setY(Math.max(0, currentPosition.getY() - steps));
                    break;
                case 's':
                    currentPosition.setY(Math.min(layout.getMaxY() - 1, currentPosition.getY() + steps));
                    break;
            }
        } else {
            System.out.println("Instruksi tidak valid");
        }
    }

    private boolean isValidInstruction(String instruction) {
        return instruction.matches("[dawxs]\\d+");
    }

    public static void main(String[] args) {
        new RobotApp();
    }
}
