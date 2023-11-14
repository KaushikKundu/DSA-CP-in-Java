package Recursion;

public class linearSearch {
    static int linearSearch(int[] arr, int target,int i){
        if(arr[i] == target){
            return i;
        }
        return linearSearch(arr,target,++i);

    }

    public static void main(String[] args) {
        int[] arr = {9,3,5,2,6,4};
        int target = 5;
        System.out.println(linearSearch(arr,target,0));
    }
}
