import java.util.*;

public class Exercise09 {
     // Problem based on prime number or not
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1 - Check if a number is prime");
            System.out.println("2 - Exit");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter a number: ");
                    int n = sc.nextInt();
                    boolean isPrime = true;

                    if (n <= 2) {
                        isPrime = false;
                    } else {
                        for (int i = 2; i <= Math.sqrt(n); i++) {
                            if (n % i == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                    }

                    if (isPrime)
                        System.out.println(n + " is a prime number.");
                    else
                        System.out.println(n + " is not a prime number.");
                    break;

                case 2:
                    System.out.println("Exiting program.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
