package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class moveZeroes {
    public static void main(String[] args) {
        int[] arr = {0,0,1};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
   static public void moveZeroes(int[] nums) {
        int temp = 0;
        for(int i=0; i<nums.length; i++){  //find zeroes
            if(nums[i] == 0  ){
                int k =1;
                for(int j=i; j<nums.length - k; j++){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
                k++;
                i--;
            }
        }
    }
}
