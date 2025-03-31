 public class Compatibility{
    public static  void main(String[] args){
        int a = 21;
        long b = a;
        System.out.println(b);
        // long c =23; 
        // int s = c;
        // System.out.print(s);
        // not possible as long size is large to int
        // byte -> short > int > float > long > double
        // destination > source (widening conversion / implicite)
    }
 }