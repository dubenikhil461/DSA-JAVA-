import java.util.Scanner;

public class InvertedRotated {

    public static void PrintStars(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void PrintNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number for row");
        int n = sc.nextInt();
        PrintStars(n);
        PrintNumbers(n);
        sc.close();
    }
}
