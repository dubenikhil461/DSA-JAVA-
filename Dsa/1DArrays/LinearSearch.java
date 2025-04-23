import java.util.*;
public class LinearSearch {

    public static int search(int arr[],int key){
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key) return i;
        }
        return -1;
    }

    public static void largesmall(int arr[]){
        int largest = Integer.MIN_VALUE; 
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]) largest = arr[i];
            if(smallest>arr[i]) smallest= arr[i];
        }
        System.out.println(largest + " is largest elemnt\n"+ smallest + " is smallest value");
    }
    public static void main(String args[]){
        int arr[]={2,3,5,42,24,5,3,143,212134,2,32};
        int key = 2;
        int index = search(arr, key);
        if(index ==-1) System.out.println("NOT FOUND");
        else System.out.println(key + " is founded at index " + index );
        largesmall(arr);
       
    }
}
