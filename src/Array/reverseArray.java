package Array;
import java.util.ArrayList;
import java.util.Collections;

public class reverseArray {
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        // Write your code here.
        int s = m+1;
        int e = arr.size() - 1;
        while(s <= e){
            Collections.swap(arr, s, e);
            s++;
            e--;
        }


    }
}
