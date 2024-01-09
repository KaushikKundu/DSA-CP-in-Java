package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        int[] target = new int[n];
        for(int i=0; i<n; i++ ){
            list.add(index[i], nums[i]);
        }
        for(int i=0; i<n; i++ ){
            target[i] = list.get(i);
        }
        return target;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] ans = createTargetArray(nums, index);
        System.out.println(Arrays.toString(ans));
    }
}