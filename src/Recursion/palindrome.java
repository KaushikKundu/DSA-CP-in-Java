package Recursion;

public class palindrome {
    public static void main(String[] args) {
        String str = Integer.toString(121);
        System.out.println(isPalindrome(str));

    }

    static boolean isPalindrome(String str){
        if(str.length() <= 1){
            return true;
        }
        if(str.charAt(0) == str.charAt(str.length() - 1)){
            return  isPalindrome(str.substring(1,str.length()-1));
        }else {
            return false;
        }
    }
}
