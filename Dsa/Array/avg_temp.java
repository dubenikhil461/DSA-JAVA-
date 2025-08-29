import java.util.*;
public class avg_temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int numOfDay = sc.nextInt();
        int arr[]= new int[numOfDay];
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            System.out.println("day's of "  + i + "temperature");
            arr[i] = sc.nextInt();
            sum +=arr[i];
        }
        double avg = (double)sum/numOfDay;
        System.out.println("avg of given tempratures is " + avg);
        sc.close();

        // count temp above avg
        int countdayaboveavg=0;
        for (int i : arr) {
            if(i>avg) countdayaboveavg++;
        }
        System.out.println(countdayaboveavg);
    }
}
