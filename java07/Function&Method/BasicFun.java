import java.util.*;

public class BasicFun {
    // function written in class known as methods (may)

    // syntax without return and formal parameters which is on defined
     public static void greet(){
        System.out.println("hello coders");
     }
     // Syntax with return and parameters
      public static int sum(int a,int b){
         return a+b;
      }
     public static void main(String[] args) {
        greet();
        int x = sum(34,234); // argument or actual parameters which is on call
        System.out.println(x);
     }

     
}
