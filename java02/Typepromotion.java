
public class Typepromotion {

    public static void main(String[] args) {
        short b = 1;
        int c = 3;
        byte m = 7;
        // byte l = b * c * m;
        //error: incompatible types: possible lossy conversion from int to byte byte l = b*c*m;  
        byte l = (byte) (b * c * m);  // loose data typecasting
        int lb = b * c * m;
        System.out.println(l + " " + lb);
        //  1] in java arithmetic all data type convert into INT 
        //  2] long data type takes place 
        int ab = 43;
        float fl = 76.232f;
        long lg = 87657;
        double db = 123.234;
        // int db1 = ab + fl + lg + db;
        //error: incompatible types: possible lossy conversion from double to int
        double db1 = ab + fl + lg + db;
        // byte -> short > int > float > long > double
        System.out.println(db1);
    }
}
