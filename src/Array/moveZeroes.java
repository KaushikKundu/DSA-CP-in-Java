package Array;
import java.lang.reflect.Array;
import java.util.Arrays;

public class moveZeroes {
    public static void main(String[] args) {
        int[] arr = {0,0,1};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void moveZeroes(int[] nums) {
        int temp = 0;
        int k = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                k++;
            }
        }
    }
}
