import java.util.Scanner;
public class PRAK103_2210817120013_FathiahNuraisyahRadam{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int input = scanner.nextInt();
        int i = 1;
        do {
            if (input % 2 == 0) {
                input += 1;
                continue;
            }
            if (i == N) {
                System.out.print(input);
            } else {
                System.out.print(input + ", ");
            }
            input += 2;
            i++;
        }
        while (i <= N);
    }
}
