package Recursion;

class powerofthree {
    public boolean isPowerOfThree(int n) {
        long result = 1;
        if(n == 1) return true;
        while(result <= n){
            result = result*3;
            if(result == n){
                return true;
            }
        }
        return false;
    }
}