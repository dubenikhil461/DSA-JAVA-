
import java.util.*;

public class Conditional {

    public static void main(String[] args) {
        int age = 21;
        if (age >= 18) {
            System.out.println("allowed to drive");
        } else {
            System.err.println("not allowed");
        }
        // print greater of two number
        int a = 4, b = 32;
        if (a > b) {
            System.out.println("a is greater");
        } else {
            System.out.println("b is greater");
        }

        // odd even check
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println("given number is even");
        } else {
            System.out.println("given number is odd");
        }

        // else if 
        if (age >= 18) {
            System.out.println("adult");
        } else if (age >= 13 && age < 18) {
            System.out.println("teenager");
        } else {
            System.out.println("child");
        }

        // income tax calculate
        System.out.println("Enter the income");
        int income = sc.nextInt();
        float tax = 0;
        if (income < 500000) {
            tax = 0;
        } else if (income > 500000 && income < 1000000) {
            tax = income * 0.2f;
        } else {
            tax = income * (0.3f);
        }
        System.out.println("your tax on given amount is " + tax);

        // print the largest of 3
        System.out.println("Enter the numbers :=>");
        System.out.println("Enter the 1st numbers");
        int a1 = sc.nextInt();
        System.out.println("Enter the 2nd numbers");
        int a2 = sc.nextInt();
        System.out.println("Enter the 3rd numbers");
        int a3 = sc.nextInt();

        if (a1 > a2 && a1 > a3) {
            System.out.println(a1 + " is greater");
        } else if (a2 > a1 && a2 > a3) {
            System.out.println(a2 + " is greater");
        } else {
            System.out.println(a3 + " is greater");
        }

        // Ternary Operator
        //    variable = condtion ? stment1 : stnment2;
        int larger = (5 > 3) ? 5 : 3;
        System.out.println(larger);
        String evod = (10 % 2 == 0) ? "even" : "odd";
        System.out.println(evod);

        // pass or fail
        int marks = 56;
        String status = (marks >= 33) ? "PASS" : "fAIL";
        System.out.println(status);

        //SWITCH STATEMENT
        System.out.println("Enter number to print days of week respectively");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("wrong input entered");
        }

        // CALCULATOR
        System.out.println("enter first number");
        int b1 = sc.nextInt();
        System.out.println("enter second number");
        int b2 = sc.nextInt();
        System.out.println("enter operator");
        char Operator = sc.next().charAt(0); // charAt() give only charchater as next() give strings;
        switch (Operator) {
            case '+':
                System.out.println(b1 + b2);
                break;
            case '-':
                System.out.println(b1 - b2);
                break;
            case '*':
                System.out.println(b1 * b2);
                break;
            case '/':
                System.out.println(b1 / b2);
                break;
            case '%':
                System.out.println(b1 % b2);
                break;
            default:
                System.out.println("wrong operator");
        }
    }
}
