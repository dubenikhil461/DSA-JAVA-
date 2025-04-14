import java.util.*;

public class DecToBin {

    public static int DB(int x) {
        int bin =0,
        power =0;
        if(x<0) {System.out.println("invalid number"); return -1;}
        while(x>0){
            int rem = x%2;
            bin += rem * Math.pow(10,power);
            x = x/2;
            power++;
        }
        return bin;

    }

    public static void main(String[] args) {
        System.out.println("Enter a decim number to decimal to Binary:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int result = DB(x);
        if (result != -1) {
            System.out.println("Binary value: " + result);
        }
    }
}
