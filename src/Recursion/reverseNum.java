package Recursion;

public class reverseNum {
    public static void main(String[] args) {
         int rev = reverse2(1234);
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
    // second approach
    static int reverse2(int n){
        int digits = (int)(Math.log10(n) + 1);
        return helper(n,digits);
    }
    static int helper(int n, int arg){
        if(n % 10 == n){
           return n;
        }
        int rem = n % 10;
        return (int) (rem * Math.pow(10, arg - 1) + helper(n/10, arg -1));
    }

}
