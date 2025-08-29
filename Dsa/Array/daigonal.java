public class daigonal {
    // method 1
    public static int sumDiagonalElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (i == j)
                    sum = sum + array[i][j];
                else
                    continue;
            }
        }
        return sum;
    }

    public static int sumofd(int[][] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 } ,{7,8,9}};
        System.out.println(sumDiagonalElements(arr));
        System.out.println(sumofd(arr));
    }
}
