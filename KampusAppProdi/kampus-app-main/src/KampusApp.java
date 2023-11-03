import java.util.Scanner;

import model.Mahasiswa;
import model.Prodi;
import repository.Database;

public class KampusApp {
    public static void main(String[] arg) {
        KampusApp kampusApp = new KampusApp();
        kampusApp.showMenu();
    }

    private Scanner scanner;
    private Database db;

    public KampusApp() {
        scanner = new Scanner(System.in);
        db = new Database();
    }

    public void showMenu() {
        System.out.println("---------------------------------");
        System.out.println("Selamat Datang di Aplikasi Kampus");
        System.out.println("Pilihan Menu:");
        System.out.println("1 -> Tambah Data Mahasiswa");
        System.out.println("2 -> Ubah Data Mahasiswa");
        System.out.println("3 -> Hapus Data Mahasiswa");
        System.out.println("4 -> Cari Data Mahasiswa");
        System.out.println("5 -> Tambah Data Prodi");
        System.out.println("6 -> Tampilkan Semua Data Mahasiswa");
        System.out.println("0 -> Keluar Aplikasi");
        System.out.print("Silahkan masukan menu yang dipilih: ");
        int menuYangDipilih = scanner.nextInt();
        scanner.nextLine();
        switch (menuYangDipilih) {
            case 1:
                menuTambah();
                break;
            case 2:
                menuUbah();
                break;
            case 3:
                menuHapus();
                break;
            case 4:
                menuCari();
                break;
            case 5:
                menuTambahProdi();
                break;
            case 6:
                menuTampilkanMahasiswa();
            default: {
                System.out.print("* Terimakasih sudah menggunakan Aplikasi Kampus *");
                System.exit(0);
            }
                break;
        }
        scanner.close();
    }

    public void menuTambah() {
        System.out.println("----- Menu Tambah Mahasiswa -----");
        System.out.print("Masukan NIM: ");
        String nim = scanner.nextLine();
        System.out.print("Masukan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Id Prodi: ");
        String idProdi = scanner.nextLine();
        Prodi prodi = db.prodiTbl.getProdiById(idProdi);

        if (prodi == null) {
            System.out.println("* Id Prodi tidak ditemukan *");
            System.out.println("Tekan Enter untuk melanjutkan...");
            scanner.nextLine();
            showMenu();
        } else {
            Mahasiswa mahasiswa = new Mahasiswa(nim, nama, idProdi);
            db.mahasiswaTbl.create(mahasiswa);
            System.out.println("* Data Mahasiswa berhasil ditambahkan *");

        }
        System.out.println("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
        showMenu();
    }

    public void menuUbah() {
        System.out.println("----- Menu Ubah Data Mahasiswa -----");
        System.out.print("Masukan NIM Sebelumnya: ");
        String nimLama = scanner.nextLine();
        System.out.print("Masukan NIM: ");
        String nimBaru = scanner.nextLine();
        System.out.print("Masukan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Id Prodi: ");
        String idProdi = scanner.nextLine();
        Mahasiswa mahasiswa = new Mahasiswa(nimBaru, nama, idProdi);
        db.mahasiswaTbl.update(nimLama, mahasiswa);
        System.out.println("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
        showMenu();
    }

    public void menuCari() {
        System.out.println("----- Menu Cari Data Mahasiswa -----");
        System.out.print("Masukan NIM: ");
        String nim = scanner.nextLine();
        Mahasiswa mahasiswa = db.mahasiswaTbl.getMahasiswaByNim(nim);
        Prodi prodi = db.prodiTbl.getProdiById(mahasiswa.getIdProdi());
        if (mahasiswa == null) {
            System.out.println("* NIM tidak ditemukan *");
        } else if (prodi.getIdProdi() == null) {
            System.out.println("* Id Prodi tidak ditemukan *");
        } else {
            System.out.println("* NIM: " + mahasiswa.getNim() + " *");
            System.out.println("* Nama: " + mahasiswa.getNama() + " *");
            System.out.println("* Prodi: " + prodi.getNamaProdi() + " *");
        }
        System.out.println("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
        showMenu();
    }

    public void menuHapus() {
        System.out.println("----- Menu Hapus Data Mahasiswa -----");
        System.out.print("Masukan NIM: ");
        String nim = scanner.nextLine();
        db.mahasiswaTbl.delete(nim);
        System.out.println("Mahasiswa dengan nim " + nim + " berhasil dihapus");
        scanner.nextLine();
        showMenu();
    }

    public void menuTambahProdi() {
        System.out.println("----- Menu Tambah Prodi -----");
        System.out.print("Masukan Id Prodi: ");
        String idProdi = scanner.nextLine();
        System.out.print("Masukan Nama Prodi: ");
        String namaProdi = scanner.nextLine();
        Prodi prodi = new Prodi(idProdi, namaProdi);
        db.prodiTbl.create(prodi);
        System.out.println("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
        showMenu();
    }

    public void menuTampilkanMahasiswa() {
        System.out.println("----- Menu Tampilkan Semua Data Mahasiswa -----");
        for (Mahasiswa mahasiswa : db.getTables().dataMahasiswa) {
            System.out.println("* NIM: " + mahasiswa.getNim() + " *");
            System.out.println("* Nama: " + mahasiswa.getNama() + " *");
            System.out.println("* Prodi: " + db.prodiTbl.getProdiById(mahasiswa.getIdProdi()).getNamaProdi() + " *");
            System.out.println("---------------------------------");
        }
        System.out.println("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
        showMenu();
    }
}