public class Hollow {

    public static void printHollow(int x){
        for(int i=1;i<=x;i++){
            for (int j = 1; j <=x+1; j++) {
                if(i==1 || i==x || j==1 || j==x+1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printHollow(4);
    }
}
