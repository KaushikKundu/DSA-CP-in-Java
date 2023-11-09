package Array;

class missingNumber {
    public int missingNumber(int[] nums) {
        int i=0;
       while (i < nums.length){
           int correctIndex = nums[i];
           if(nums[i] != i && correctIndex < nums.length){
               swap(nums, i, correctIndex);
           }else {
               i++;
           }
       }
        for( int j=0; j<nums.length; j++){
            if(nums[j] != j){
                return j;
            }
        }
        return nums.length;
    }
     void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}  