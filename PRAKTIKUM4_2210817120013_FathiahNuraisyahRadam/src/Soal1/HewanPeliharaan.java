package Soal1;
import java.util.Scanner;
public class HewanPeliharaan {
    String nama;
    String ras;
    Scanner scanner = new Scanner(System.in);
    HewanPeliharaan(String nama, String ras) {
        this.nama = nama;
        this.ras = ras;
    }
    void display() {
        System.out.print("Nama Hewan Peliharaan: ");
        nama = scanner.nextLine();
        System.out.print("Ras: ");
        ras = scanner.nextLine();
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + nama);
        System.out.println("Dengan ras : " + ras);
    }
}
