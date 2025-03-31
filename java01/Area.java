
import java.util.*;

public  class Area{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        int r = sc.nextInt();
        float area = 3.14f * r* r;
        System.out.println(area);
    }
}