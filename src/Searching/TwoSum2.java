package Searching;
class TwoSum2 {
    static public int BinarySearch(int[] arr, int start, int end, int target){
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] < target){
                start  = mid+1;
            }else if(arr[mid] > target){
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        
        for(int i=0; i<n; i++){
            int newTarget = target - numbers[i];
            int index = BinarySearch(numbers,i+1,n-1,newTarget);
            if(index != -1){
                return new int[]{i+1,index+1};
                
            }
        }
        return new int[]{-1,-1};
    }
}