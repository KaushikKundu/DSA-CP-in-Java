package Recursion;

public class reverseNum {
    public static void main(String[] args) {
         reverse(1234);
        System.out.println(rev);
    }
    static int rev = 0;
    static void reverse(int n){
        if(n == 0){
            return;
        }
        int r = n % 10;
        rev = rev * 10 + r;
         reverse(n/10);

    }
}
