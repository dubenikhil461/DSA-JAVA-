import java.util.*;

public class Exercise10 {
    public static void main(String[] args) {
        // print sum of odd and even digit entered by user

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int evensum = 0, oddsum = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem % 2 == 0)
                evensum += rem;
            else
                oddsum += rem;
            n = n / 10;
        }
        System.out.println(evensum + " is sum of even digit \n" + oddsum + " is sum of odd digit");

        // FACTORIAL;

        System.out.print("Enter a non-negative number for factorial: ");
        int x = sc.nextInt();

        if (x < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int fact = 1;
            for (int i = 1; i <= x; i++) {
                fact *= i;
            }
            System.out.println("Factorial of " + x + " is " + fact);
        }
        
        // PROGRAM TO PRINT MULTIPLICATION GIVEN NUMBER
        System.out.println("enter the number for printing the table");
        int mult = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(mult + "*" + i + "=" + mult * i);
        }

    }
}
