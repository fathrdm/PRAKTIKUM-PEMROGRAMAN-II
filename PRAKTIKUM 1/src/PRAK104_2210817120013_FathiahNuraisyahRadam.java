import java.util.Scanner;
public class PRAK104_2210817120013_FathiahNuraisyahRadam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tangan Abu: ");
        String abu = scanner.nextLine();
        System.out.print("Tangan Bagas: ");
        String bagas= scanner.nextLine();
        int i=0, poinabu=0, poinbagas=0;
        while(i<3){
            char tanganabu = abu.charAt(i);
            char tanganbagas = bagas.charAt(i);
            tanganabu = Character.toUpperCase(tanganabu);
            tanganbagas = Character.toUpperCase(tanganbagas);
            if (tanganabu == tanganbagas) {
            } else if ((tanganabu == 'B' && tanganbagas == 'G') || (tanganabu == 'G' && tanganbagas == 'K') || (tanganabu == 'K' && tanganbagas == 'B')) {
                poinabu++;
            } else {
                poinbagas++;
            }
            i++;
        }
        if (poinabu > poinbagas) {
            System.out.println("Abu");}
        else if (poinabu < poinbagas) {
            System.out.println("Bagas");}
        else {
            System.out.println("Seri");}
    }
}