import java.util.*;
public class CallbyValue {
    public static void swap(int a ,int b){
        int temp =a;
        a=b;
        b = temp;
        System.out.println("a is " + a + "\nb is " + b);
    }
    public static void main(String[] args) {
        // java always call by value
        // swaping
        int a = 123;
        int b= 81723;
        swap(a,b);
        System.out.println("a is " + a + "\nb is " + b);
     // only change in function original value cannot change and only pass copy of orignal value known as call by value

       
    }
}
