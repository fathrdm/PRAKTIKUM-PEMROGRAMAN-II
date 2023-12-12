package Soal1;
import java.util.LinkedList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Dadu> daduList = new LinkedList<>();
        int totalNilai = 0;
        int jumlahDadu = input.nextInt();
        for (int i=0; i<jumlahDadu; i++) {
            Dadu dadu = new Dadu();
            daduList.add(dadu);
        }
        int i = 1;
        for (Dadu dadu : daduList) {
            int nilaiDadu = dadu.getNilai();
            totalNilai += nilaiDadu;
            System.out.println("Dadu ke-"+ i++ +" bernilai " + nilaiDadu);
        }
        System.out.println("Total nilai dadu keseluruhan " + totalNilai);
    }
}
