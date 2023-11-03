import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("NIM: ");
        String nim = input.nextLine();

        System.out.print("Nilai Tubes: ");
        double nilaiTubes = input.nextDouble();
        System.out.print("Nilai Quiz: ");
        double nilaiQuiz = input.nextDouble();
        System.out.print("Nilai Tugas: ");
        double nilaiTugas = input.nextDouble();
        System.out.print("Nilai UTS: ");
        double nilaiUTS = input.nextDouble();
        System.out.print("Nilai UAS: ");
        double nilaiUAS = input.nextDouble();

        Nilai nilaiMahasiswa = new Nilai(nama, nim, nilaiTubes, nilaiQuiz, nilaiTugas, nilaiUTS, nilaiUAS);
        double totalNilai = nilaiMahasiswa.hitungTotalNilai();

        System.out.println("\nNilai Matakuliah Pemrograman Berorientasi Objek:");
        System.out.println("Nama: " + nilaiMahasiswa.nama);
        System.out.println("NIM: " + nilaiMahasiswa.nim);
        System.out.println("Total Nilai: " + totalNilai);

        if (totalNilai >= 80) {
            System.out.println("Grade: A");
        } else if (totalNilai >= 75) {
            System.out.println("Grade: AB");
        } else if (totalNilai >= 65) {
            System.out.println("Grade: B");
        } else if (totalNilai >= 60) {
            System.out.println("Grade: BC");
        } else if (totalNilai >= 50) {
            System.out.println("grade: C");
        }else if (totalNilai >= 40) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: E");
        }
    }
}