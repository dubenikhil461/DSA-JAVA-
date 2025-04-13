import java.util.*;

public class DecToBin {

    public static int BD(int x) {
        int sum =0;
        int power = 0;
        if(x<0) {System.out.println("invalid number"); return -1;}
        while(x>0){
            int rem = x%10;
            if(rem!=0 && rem!=1){
                System.out.println("invalid binary digit found");
                return -1;
            }
            sum += rem * Math.pow(2,power);
            power++;
            x /=10;
        }
        return sum ;
    }

    public static void main(String[] args) {
        System.out.println("Enter a binary number to decimal to decimal:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int result = BD(x);
        if (result != -1) {
            System.out.println("Decimal value: " + result);
        }
    }
}
