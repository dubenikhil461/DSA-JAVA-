import java.util.*;

public class forloops {
    public static void main(String[] args) {
        // for(initialization; condition; updation)
        for (int i = 1; i < 10; i++) {
            System.out.println("hello coders");
        }

        System.out.println(); // just for spacing between outputs

        // Square pattern printing
        // n = 3
        // ***
        // ***
        // ***
        int n = 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
