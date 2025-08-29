import java.util.ArrayList;
import java.util.Arrays;

public class middle {
    // method 1
    public int[] middle1(int[] array){
        if(array.length <=2) return new int[0];
        int result[] = new int[array.length-2];
        for (int i = 1; i < array.length-1; i++) {
            result[i-1] = array[i];
        }
        return result;
    }

    // method 2
    public static int[] middle2(int[] array){
        ArrayList<Integer> newarr = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if(i==0||i==array.length-1){
                continue;
            }
            else{
                newarr.add(array[i]);
            }
        }
        // because our return type is array not arraylist so we get error incompatible
        int result[] = new int[newarr.size()];
        for(int i=0;i<newarr.size();i++){
            result[i] = newarr.get(i);
        }
        return result;
    }

  public static void main(String[] args) {
    int arr[] = {21,21,332,43,34};
    middle m1 = new middle();
    // System.out.println(arr);
    // Output:
    // [I@3e25a5
    // This is not the array contents.
    // It prints the object reference (type + hashcode), because arrays in Java are objects.
    //System.out.println(Arrays.deepToString(arr2D)); // [[1, 2], [3, 4]]  for 2D
    System.out.println(Arrays.toString(m1.middle1(arr)));
  }
}
