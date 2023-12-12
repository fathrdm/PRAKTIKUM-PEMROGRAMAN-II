import java.util.Scanner;
public class PRAK101_2210817120013_FathiahNuraisyahRadam {
    public static void main (String [] args){
        Scanner input= new Scanner (System.in);
        System.out.print("Masukan Nama Lengkap: ");
        String Nama_Lengkap= input.nextLine();
        System.out.print("Masukan Tempat Lahir:  ");
        String Tempat_Lahir = input.nextLine();
        System.out.print("Masukan Tanggal Lahir:  ");
        String Tanggal_Lahir = input.nextLine();
        System.out.print("Masukan Bulan Lahir:  ");
        String Bulan_Lahir = input.nextLine();
        System.out.print("Masukan Tahun Lahir:  ");
        String Tahun_Lahir = input.nextLine();
        System.out.print("Masukan Tinggi Badan:  ");
        String Tinggi_Badan = input.nextLine();
        System.out.print("Masukan Berat Badan:  ");
        String Berat_Badan = input.nextLine();
        System.out.println("Nama Lengkap " + Nama_Lengkap + ", Lahir di " + Tempat_Lahir + " pada Tanggal " + Tanggal_Lahir + " " + Bulan_Lahir + " " +Tahun_Lahir);
        System.out.print( "Tinggi Badan "  + Tinggi_Badan + " cm" + " dan Berat Badan " + Berat_Badan + " kilogram");
    }
}