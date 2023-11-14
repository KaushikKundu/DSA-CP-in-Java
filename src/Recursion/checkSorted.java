package Recursion;

import java.util.Arrays;

public class checkSorted {
    static boolean sorted(int[] arr,int i){
        if(i == arr.length-1){ // when reaches last index , means arr is sorted.
            return true;
        }
        return arr[i] < arr[i+1] && sorted(arr,i+1);
    }

    public static void main(String[] args) {
        int[] arr = {2,4,5,7,9};
        System.out.println(sorted(arr,0));
    }
}
