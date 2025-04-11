import java.util.*;

public class whileloops {
    public static void main(String[] args) {
        // Print "namaste" 5 times
        int i = 0;
        while (i < 5) {
            System.out.println("namaste");
            i++;
        }

        System.out.println(); // spacing for clarity

        // Print numbers from 1 to 10
        int j = 1; // start from 1 instead of 0
        while (j <= 10) {
            System.out.println(j);
            j++;
        }

        System.out.println();

        // Print sum from 1 to n (user input)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find sum from 1 to n: ");
        int k = sc.nextInt();
        int i2 = 1; // start from 1, not 0, to match "1 to n"
        int sum = 0;
        while (i2 <= k) {
            sum += i2;
            i2++;
        }
        System.out.println("Sum from 1 to " + k + " is: " + sum);

        System.out.println();

        // Print reverse of a number
        int p = 10899;
        System.out.print("Reverse of " + p + " is: ");
        while (p > 0) {
            int rem = p % 10;
            System.out.print(rem);
            p = p / 10;
        }
        System.out.println();
        
        // reverse the number
        int rev =0;
        int q = 16899;
        System.out.print("Reverse of " + q + " is: ");
        while (q > 0) {
            int ld = q % 10;
            rev = (rev*10) + ld;
            q = q / 10;
        }
        System.out.println(rev);
        sc.close(); // Always close the scanner
    }
}
