package Array;

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[] = new int[n+n];
        int i=0;
        int j=0;
        while(i<n){
            arr[j] = nums[i];
            i++;
            j = j+2;
        }
        j=1;
        while(i<2*n){
            arr[j] = nums[i];
            i++;
            j = j+2;
        }
        return arr;
    }
}