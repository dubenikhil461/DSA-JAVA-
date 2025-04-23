
public class SubArray {
    public static void print(int arr[]) {
        int ts = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k < j; k++) {
                    System.out.print(k + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarray is " + ts);
    }
   // kadane algorithm
    public static int maxsum(int arr[]) {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for (int i = 0; i < arr.length; i++) {
           currsum += arr[i];
           maxsum = (currsum>maxsum)?currsum : maxsum;
           if(currsum<0) currsum =0;
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, -6, -1, 3 };
        // print(arr);
        System.out.println("maxium of subarray is " + maxsum(arr));
    }
}
