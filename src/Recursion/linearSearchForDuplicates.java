package Recursion;

import java.util.ArrayList;
import java.util.List;

public class linearSearchForDuplicates {
    static List<Integer> linearSearch(int[] arr, int target, int i, List<Integer> list){

        if(i == arr.length){
            return list;
        }
        if(arr[i] == target){
            list.add(i);
        }
        return linearSearch(arr,target,++i,list);


    }

    public static void main(String[] args) {
        int[] arr = {9,3,5,2,6,5};
        int target = 5;
        List<Integer> result  = linearSearch(arr,target,0,new ArrayList<>());
        System.out.println(result);
    }
}
