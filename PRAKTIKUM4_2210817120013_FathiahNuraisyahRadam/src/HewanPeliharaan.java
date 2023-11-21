import java.util.Scanner;
public class HewanPeliharaan {
    String nama;
    String ras;
    Scanner scanner = new Scanner(System.in);
    // Konstruktor untuk inisiasi objek
    HewanPeliharaan(String nama, String ras) {
        this.nama = nama;
        this.ras = ras;
    }
    // Method display untuk menampilkan detail hewan peliharaan
    void display() {
        System.out.print("Masukkan nama hewan peliharaan: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan ras hewan peliharaan: ");
        String ras = scanner.nextLine();
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + nama);
        System.out.println("Dengan ras : " + ras);
    }
}
