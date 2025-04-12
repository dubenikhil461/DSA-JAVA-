import java.util.*;

public class Exercise08 {
    public static void main(String[] args) {
        // LEAP YEAR FINDING
        System.out.println("Enter a year:");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if ((year % 400 == 0) || (year % 4 == 0 )&& (year % 100 != 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

    }
}
