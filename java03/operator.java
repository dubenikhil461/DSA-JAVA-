
public class operator {

    public static void main(String[] args) {
        int a = 76;
        int b = 876;
        boolean c = true;
        // binary  operator
        System.out.println("addition = " + (a + b));
        System.out.println("subtraction = " + (a - b));
        System.out.println("multiplication = " + (a * b));
        System.out.println("modulo = " + (a % b));

        // unary operator
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(--a);
        System.out.println(a--);
        System.out.println(a);

        // relational operator
        // give boolean value
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);

        // logical operator
        System.out.println(a == b && a != b);
        System.out.println(a == b || a != b);
        System.out.println(!c);

        //Assignment operator
        a = b; // value of b in a right to left
        System.out.println(a);
        System.out.println(b);
        a -= b; // a = a-b;
        System.out.println(a);
        a /= b;  // a = a/b (gives quotients)
        System.out.println(a);
        a %= b;   // a = a %b (gives remainder)
        System.out.println(a);
        a += b; // a = a+b;
        System.out.println(a);

// Java follows a strict execution flow:
// Compile-Time Errors (Syntax Errors) → Compilation Fails
// Runtime Errors (Exceptions) → Code Executes Until Error
// Logical Errors → Code Runs but Gives Wrong Output
    }
}
