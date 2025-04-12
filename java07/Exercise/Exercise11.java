import java.util.*;
public class Exercise11 {

    public static int fact(int n){
        int fact =1;
        for (int index = 1; index <=n; index++) {
            fact *=index;
        }
        return fact;
    }

    public static int ncr(int n ,int r){
        int x = fact(n);
        int y = fact(r);
        int z = fact(n-r);
        int ncr = x/(y*z);
        return ncr;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter n and r");
        int n = sc.nextInt();
        int r = sc.nextInt();
        int ncr = ncr(n,r);
        System.out.println("the coefficient of binomial is " + ncr);

    }
}
