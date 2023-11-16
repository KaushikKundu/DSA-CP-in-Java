package implementation;

import java.util.ArrayList;
import java.util.Scanner;

public class nextRound158A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>(50);
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            list.add(value);
        }
        int target = list.get(k-1);
        int count = 0;
        for (int j = 0; j < n; j++) {
            if(list.get(j) > 0 &&  list.get(j) >= target){
                count = count+1;
            }
        }
        System.out.println(count);
    }
}
