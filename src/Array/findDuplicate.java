package Array;

class findDuplicate {
    public int findDuplicate(int[] nums) {
        int i=0;
        int dup = 0;
       while (i < nums.length){
           int correctIndex = nums[i] -1;
           if(nums[i] != nums[correctIndex]){
               swap(nums, i, correctIndex);
           }else {
               i++;
           }
       }
        for( int j=0; j<nums.length; j++){
            if(nums[j] != j+1){
                dup = nums[j];
            }
        }
        return dup;
        
    }
     void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}  
    