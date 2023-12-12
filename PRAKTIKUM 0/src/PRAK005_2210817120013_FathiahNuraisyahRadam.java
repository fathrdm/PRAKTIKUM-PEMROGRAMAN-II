import java.util.Scanner;
public class PRAK005_2210817120013_FathiahNuraisyahRadam {
    public static void main (String [] args){
        Scanner input= new Scanner (System.in);
        System.out.print("Masukan Makanan Favorit: ");
        String makanan_favorit = input.nextLine();
        System.out.print("Masukan Hobi:  ");
        String hobi = input.nextLine();
        System.out.println("Aku Suka Makan " + makanan_favorit + ", dan Hobiku " + hobi);
    }
}
