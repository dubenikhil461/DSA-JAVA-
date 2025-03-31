public class Typecasting{
    public static void main(String[] args) {
        // data loss but still do for practice
        int a = (int)(23.32);
        System.out.println(a);
        // 23.2323 (bydefault double)
        char ch = 'A';
        int o = ch;
        System.err.println(o);
        // A -> 65
        // a -> 97
    }
}