package model;

public class Prodi {
    private String idProdi;
    private String namaProdi;

    public Prodi(String idProdi, String namaProdi){
        this.idProdi = idProdi;
        this.namaProdi = namaProdi;
    }

    public String getIdProdi(){
        return idProdi;
    }

    public String getNamaProdi() {
        return namaProdi;
    }
}