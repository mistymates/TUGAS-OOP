package model;

public class Mahasiswa {
    private String nim;
    public String getNim() {
        return nim;
    }

    private String nama;
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    private String idProdi;

    public String getIdProdi() {
        return idProdi;
    }

    public Mahasiswa(String nim, String nama, String idProdi) {
        this.nim = nim;
        this.nama = nama;
        this.idProdi = idProdi;

    }
}