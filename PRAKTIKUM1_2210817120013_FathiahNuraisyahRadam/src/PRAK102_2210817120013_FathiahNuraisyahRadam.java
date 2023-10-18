import java.util.Scanner;
public class PRAK102_2210817120013_FathiahNuraisyahRadam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int input = scanner.nextInt();
        while (i <= 10){
            int t;
            if (input % 5 == 0) {
                t = (input / 5) -1;
                if(i==10){
                    System.out.print(t);
                }
                else {
                    System.out.print(t+ ", ");
                }
            }
            else{
                if(i==10){
                    System.out.print(input);
                }
                else {
                    System.out.print(input+ ", ");
                }
            }
            input++;
            i++;
        }
    }
}