import java.util.*;

public class Exercise12 {

    public static boolean Isprime(int x) {
        if (x < 2) return false;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) return false;
        }
        return true;
    }

    public static void Rangeofprime(int x) {
        for (int i = 1; i <= x; i++) {
            if (Isprime(i)) System.out.println(i);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a number to print all prime numbers up to that range:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Rangeofprime(n);
    }
}
