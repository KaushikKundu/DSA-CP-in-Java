package Recursion;
import java.util.ArrayList;

public class linearSearchForDuplicates {
    static ArrayList<Integer> linearSearch(int[] arr, int target, int i ){
        ArrayList<Integer> list = new ArrayList<>();
        if(i == arr.length){
            return list;
        }
        if(arr[i] == target){
            list.add(i);
        }
        ArrayList<Integer> ansFromBelowCalls=  linearSearch(arr,target,++i);
        list.addAll(ansFromBelowCalls);
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {9,3,5,2,6,5};
        int target = 5;
        ArrayList<Integer> result  = linearSearch(arr,target,0);
        System.out.println(result);
    }
}
