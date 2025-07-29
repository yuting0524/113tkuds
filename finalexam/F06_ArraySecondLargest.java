import java.util.*;

public class F06_ArraySecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            if (val > max) {
                second = max;
                max = val;
            } else if (val > second && val < max) {
                second = val;
            }
        }

        System.out.println("SecondMax: " + second);
    }
}

/*
 * Time Complexity: O(n)
 * 說明：只需一次遍歷陣列，同時維護最大值與次大值即可。
 */
