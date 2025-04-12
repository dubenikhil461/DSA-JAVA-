public class Overloading {

   
    // Method 1: Adds two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method 2: Adds three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Adds two double values
    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("add(2, 3) = " + add(2, 3)); // Calls method 1
        System.out.println("add(2, 3, 4) = " + add(2, 3, 4)); // Calls method 2
        System.out.println("add(2.5, 3.1) = " + add(2.5, 3.1)); // Calls method 3
    }
}
