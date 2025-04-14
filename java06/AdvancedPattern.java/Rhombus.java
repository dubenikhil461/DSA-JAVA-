import java.util.Scanner;

public class Rhombus {
    public static void fillprint(int x){
        for(int i=1;i<=x;i++){
            for(int j=1;j<=x-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=x;k++){
                System.out.print("*");
            }
            System.out.println();
        }}

    public static void Hollowprint(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= x; k++) {
                if (i == 1 || i == x || k == 1 || k == x)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number for row");
        int n = sc.nextInt();
        fillprint(n);
        Hollowprint(n);
    }
}

