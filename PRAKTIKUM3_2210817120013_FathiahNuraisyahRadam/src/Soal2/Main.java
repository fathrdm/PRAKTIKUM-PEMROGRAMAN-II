package Soal2;
import java.util.LinkedList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Negara> negaraList = new LinkedList<>();
        int tanggalKemerdekaan = 0;
        int bulanKemerdekaan = 0;
        int tahunKemerdekaan = 0;
        int jumlahNegara = input.nextInt();
        input.nextLine();
        for (int i = 0; i < jumlahNegara; i++) {
            String nama = input.nextLine();
            String jenisKepemimpinan = input.nextLine();
            String namaPemimpin = input.nextLine();
            if (!jenisKepemimpinan.equalsIgnoreCase("monarki")) {
                tanggalKemerdekaan = input.nextInt();
                input.nextLine();
                bulanKemerdekaan = input.nextInt();
                input.nextLine();
                tahunKemerdekaan = input.nextInt();
                input.nextLine();
            }
            Negara negara = new Negara(nama, jenisKepemimpinan, namaPemimpin, tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan);
            negaraList.add(negara);
        }
        System.out.println();
        for (Negara negara : negaraList) {
            String jenisKepemimpinan = negara.getJenisKepemimpinan();
            String[] words = jenisKepemimpinan.split(" ");
            StringBuilder HurufBesar = new StringBuilder();
            for (String word : words) {
                word = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                HurufBesar.append(word).append(" ");
            }
            jenisKepemimpinan = HurufBesar.toString().trim();
            if (negara.getJenisKepemimpinan().equals("monarki")) {
                System.out.println("Negara "+negara.getNama()+" mempunyai Raja bernama "+negara.getNamaPemimpin());
            }
            else {
                System.out.println("Negara " + negara.getNama() + " mempunyai " + jenisKepemimpinan + " bernama " + negara.getNamaPemimpin());
                System.out.println("Deklarasi Kemerdekaan pada " + negara.getTanggalKemerdekaan());
            }
            System.out.println();
        }
    }
}