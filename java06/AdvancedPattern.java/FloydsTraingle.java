import java.util.Scanner;

public class FloydsTraingle {

    public static void printfloyd(int x) {
        int a = 1;
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number for row");
        int n = sc.nextInt();
        printfloyd(n);
    }
}
