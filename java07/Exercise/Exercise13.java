public class Exercise13 {

    public static void Ispalindrome(int x){
        int rev =0;
        int copy = x;
        while(x>0){
            int rem = x%10;
            rev = (rev*10)+rem;
            x = x/10;
        }
        if(copy == rev ) System.out.println(copy + " is palindrome");
        else System.out.println(copy + " is not a palindrome");
    }
    public static void main(String[] args) {
        Ispalindrome(125);
    }
}
