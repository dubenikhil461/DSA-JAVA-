 import java.util.*;
public class breakcont{
    public static void main(String args[]){
        // user enter until multiple of 10 
        // BREAK
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("enter a number");
            int next = sc.nextInt();
            if(next%10 ==0){
                break;
            }
        }while(true); // infinite

        //CONTINUE
        do{
            System.out.println("enter a number2");
            int next = sc.nextInt();
            if(next%10 ==0){
                continue;
            }
            System.out.println(next);
        }while(true); // infinite
    }
}