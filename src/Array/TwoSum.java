package Array;

import java.util.Arrays;

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for(int i=0; i<nums.length; i++){
            int diff = target - nums[i];
            for(int j=i+1; j<nums.length; j++){
                if(diff == nums[j]){
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("no match found");
    }

    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int[] ans = twoSum(arr,6);
        System.out.println(Arrays.toString(ans));
    }
    
}