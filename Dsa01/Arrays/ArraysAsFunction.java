public class ArraysAsFunction {

    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i] += 1;
        }
    }
   public static void main(String[] args) {
       int marks[] = {1,2,3,4,5,6,7};
       System.out.println("array before update");
       for (int i = 0; i < marks.length; i++) {
        System.out.print(marks[i]+" ");
       }
       update(marks);
       System.out.println("\narray after update");
       for (int i = 0; i < marks.length; i++) {
        System.out.print(marks[i]+" ");
       }
   } 
}
