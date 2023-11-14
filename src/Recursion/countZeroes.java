package Recursion;

public class countZeroes {
    public static void main(String[] args) {
        System.out.println(countZeroes(2020));
    }
    static int countZeroes(int n){
        return helper( n, 0);
    }
    static int helper(int n, int count){
        if(n == 0 ){ // whether last digit one or the number itself is one
            return ++count;
        } else if (n/10 == 0) { // check if its one digit non-zero number
            return count;
        } else if(n % 10 == 0){ // whether remainder or right most digit equals zero
            ++count ;
        }
        return helper(n/10,count);
    }

}

