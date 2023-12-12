package Soal2;
import java.util.HashMap;
class Negara {
    String nama;
    String jenisKepemimpinan;
    String namaPemimpin;
    int tanggalKemerdekaan;
    int bulanKemerdekaan;
    int tahunKemerdekaan;
    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin, int tanggalKemerdekaan, int bulanKemerdekaan, int tahunKemerdekaan) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggalKemerdekaan = tanggalKemerdekaan;
        this.bulanKemerdekaan = bulanKemerdekaan;
        this.tahunKemerdekaan = tahunKemerdekaan;
    }
     String namaBulan(int bulan) {
        HashMap<Integer, String> namaBulanMap = new HashMap<>();
        namaBulanMap.put(1, "Januari");
        namaBulanMap.put(2, "Februari");
        namaBulanMap.put(3, "Maret");
        namaBulanMap.put(4, "April");
        namaBulanMap.put(5, "Mei");
        namaBulanMap.put(6, "Juni");
        namaBulanMap.put(7, "Juli");
        namaBulanMap.put(8, "Agustus");
        namaBulanMap.put(9, "September");
        namaBulanMap.put(10, "Oktober");
        namaBulanMap.put(11, "November");
        namaBulanMap.put(12, "Desember");
        return namaBulanMap.get(bulan);
    }
    String getNama() {
        return nama;
    }
    String getJenisKepemimpinan() {
        return jenisKepemimpinan;
    }
    String getNamaPemimpin() {
        return namaPemimpin;
    }
    String getTanggalKemerdekaan() {
            return "Tanggal " + tanggalKemerdekaan + " " + namaBulan(bulanKemerdekaan) + " " + tahunKemerdekaan;
    }
}