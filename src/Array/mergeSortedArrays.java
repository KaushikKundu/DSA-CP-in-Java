package Array;

import java.util.Arrays;

public class mergeSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
// space complexity: O(n) , can be O(1)
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m + n];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                arr[k] = nums1[i];
                i++;
                k++;
            } else {
                arr[k] = nums2[j];
                k++;
                j++;
            }
        }
        while (i < m) {
            arr[k] = nums1[i];
            k++;
            i++;
        }
        while (j < n) {
            arr[k] = nums2[j];
            k++;
            j++;
        }
        for (int x = 0; x < m + n; x++) {
            nums1[x] = arr[x];
        }
    }
}
