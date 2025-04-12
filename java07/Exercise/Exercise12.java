import java.util.*;
public class Exercise12 {

    public static boolean Isprime(int a){
        if(a==2) return true;
        else {
            for(int i =2;i<=Math.sqrt(a);i++){
                if(a%i==0) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("enter to check the prime number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Isprime(n));
    }
}
