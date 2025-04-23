
public class BinarySearch {
    public static int print(int arr[], int key) {
        int start = 0, end = arr.length - 1;
        int mid = (start + end) / 2;

        // BINARY SEARCH WORK ON ONLY SORTED ARRAY
        
        while (start <= end) {

            if (arr[mid] == key)
                return mid;

            if (arr[mid] < key)
                start = mid + 1;
            else
                end = mid - 1;

            mid = (start + end) / 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5,21};
        int key = 21;
        System.out.println(key + " is present at index " + print(arr, key));
    }
}
