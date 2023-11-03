public class Nilai {
    String nama;
    String nim;
    double nilaiTubes;
    double nilaiQuiz;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;

    public Nilai(String nama, String nim, double nilaiTubes, double nilaiQuiz, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.nilaiTubes = nilaiTubes;
        this.nilaiQuiz = nilaiQuiz;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    public double hitungTotalNilai() {
        return (0.30 * nilaiTubes) + (0.10 * nilaiQuiz) + (0.10 * nilaiTugas) + (0.25 * nilaiUTS) + (0.25 * nilaiUAS);
    }
}