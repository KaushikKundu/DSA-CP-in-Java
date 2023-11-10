package Array;

class setMismatch {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        int[] arr = new int[2];
        while(i< nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex])
                swap(nums, i, correctIndex);
            else 
                i++;
        }
        for(int j=0; j<nums.length; j++){
            if(nums[j] != j+1){
                arr[0] = nums[j];
                arr[1] = j+1;
                break;
            
            }               
        }
        return arr;
    }

    void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}