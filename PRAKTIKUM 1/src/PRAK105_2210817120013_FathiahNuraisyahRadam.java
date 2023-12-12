import java.util.Scanner;
public class PRAK105_2210817120013_FathiahNuraisyahRadam {
    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);
        final double PHI = 3.14;
        double r, t;
        double voltabung;
        System.out.print("Masukkan jari-jari: ");
        r = scanInput.nextDouble();
        System.out.print("Masukkan tinggi: ");
        t = scanInput.nextDouble();
        voltabung = (PHI * r * r) * t;
        System.out.print("Volume tabung dengan jari-jari "+r+"cm dan " +"tinggi "+t+" cm adalah "+ String.format("%.3f", voltabung)+" m3");
    }
}
