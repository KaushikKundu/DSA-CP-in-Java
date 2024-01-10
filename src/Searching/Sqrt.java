package Searching;

class Sqrt{
    public int mySqrt(int x) {
        if(x<=1) return x;
        int start = 0;
        int end = x;
        int mid =-1;
        while(start <= end){
            mid = start +(end-start)/2;
            if((long)mid*mid <= x)
            {
                start = mid+1;    
            }else{
                end = mid-1;
            }
        }
        return end;
    }
}