package Recursion;

public class palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1291));
    }

    static boolean isPalindrome(int n){
        int rev = reverse2(n);
        return n == rev;
    }
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
