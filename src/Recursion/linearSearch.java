package Recursion;

public class linearSearch {
    static int linearSearch(int[] arr, int target,int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == target){
            return i;
        }else
            return linearSearch(arr,target,++i);

    }

    public static void main(String[] args) {
        int[] arr = {9,3,5,2,6};
        int target = 4;
        System.out.println(linearSearch(arr,target,0));
    }
}
