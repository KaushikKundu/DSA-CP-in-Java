package Recursion;

public class findMax {
    static int max(int[] arr, int i, int curMax){
        if(i == arr.length){
            return curMax;
        }else if(arr[i] > curMax) {
            curMax = arr[i];
        }
        i++;
        return max(arr,i,curMax);
    }
    public static void main(String[] args) {
        int[] arr = {2,4,9,0,3};
        int curMax = arr[0]; // taking the value
        int i = 1;
        int max = max(arr,i,curMax);
        System.out.println(max);
    }
}
