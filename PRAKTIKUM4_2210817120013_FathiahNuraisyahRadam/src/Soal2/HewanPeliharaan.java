package Soal2;
public class HewanPeliharaan {
    String nama;
    String ras;
    HewanPeliharaan(String nama, String ras) {
        this.nama = nama;
        this.ras = ras;
    }
    void display() {
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + nama);
        System.out.println("Dengan ras : " + ras);
    }
}
