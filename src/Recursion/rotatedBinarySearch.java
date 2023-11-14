package Recursion;

import java.util.ArrayList;

public class rotatedBinarySearch {
    public static void main(String[] args) {
        int[]   arr = {5,6,7,1,2,3,4};
        int target = 3;
        int result  = rotatedBinarySearch(arr,0,arr.length-1,target);
        System.out.println(result);
    }
    static int rotatedBinarySearch(int[] arr, int s, int e, int target){
        if(s > e){
            return -1;
        }
        int m = s + (e-s)/2;
        if(arr[m] == target){
            return m;
        }
        if (arr[s] <= arr[m]){
            if (target >= arr[s] && target <= arr[m]){
                return rotatedBinarySearch(arr,s,m-1,target);
            }
            else {
                return rotatedBinarySearch(arr,m+1,e,target);
            }
        }
        return rotatedBinarySearch(arr,s,e-1,target);
    }
}
