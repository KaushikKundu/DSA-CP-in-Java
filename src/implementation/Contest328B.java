import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int[] days = new int[n];
        for (int j = 0; j < n; j++) {
            int day = sc.nextInt();
            days[j] = day;
        }
        for (int m = 1; m <= 9; m++) {
            if (m <= n && days[m-1] >= m){
                count++;
            }
            if (m <= n && days[m-1] >= 11*m){
                count++;
            }
            if (m * 11 <= n && days[11* m-1] >= m){
                count++;
            }
            if (m*11 <= n && days[11*m-1] >= 11*m){
                count++;
            }
        }
        System.out.println(count);
    }

}
