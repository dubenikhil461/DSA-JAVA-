import java.util.*;
public class Exercise06{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        if(a<0)System.out.println("it is negative");
        else System.out.println("it is positive");
    }
}