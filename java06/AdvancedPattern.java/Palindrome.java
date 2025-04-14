import java.util.Scanner;

public class Palindrome {
    public static void print(int x){
        for(int i=1;i<=x;i++){
            for(int j=1;j<=x-i;j++){
                System.out.print(" ");
            }
            for(int k =i;k>=1;k--){
                System.out.print(k+"");
            }
            for(int l =2;l<=i;l++){
                System.out.print(l+"");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter a number for row");
        int n = sc.nextInt();
        print(n);
    }
}
