package Array;

import java.util.ArrayList;
import java.util.List;

class findAllDuplicate {
    public List<Integer> findDuplicates(int[] nums) {
        int i=0;
        List<Integer> list = new ArrayList<>();
        while(i< nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex])
                swap(nums, i, correctIndex);
            else 
                i++;
        }
        for(int j=0; j<nums.length; j++){
            if(nums[j] != j+1)
                list.add(nums[j]);
        }
        return list;
    }
    void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}