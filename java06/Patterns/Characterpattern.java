import java.util.*;
public class Characterpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row");
        int n = sc.nextInt();
        int ch = 64;
        for(int i=1;i<=n;i++){
            for (int j = 1; j <=i; j++) {
                System.out.print((char)(ch+j));
            }
            System.out.println();
        }
    }
}
