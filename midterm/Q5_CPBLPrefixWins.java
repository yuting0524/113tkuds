import java.util.*;

public class Q5_CPBLPrefixWins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] results = new int[n];
        for (int i = 0; i < n; i++) {
            results[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int[] prefix = new int[n + 1]; // prefix[0] = 0
        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + results[i - 1];
        }

        System.out.print("PrefixSum:");
        for (int i = 1; i <= k; i++) {
            System.out.print(" " + prefix[i]);
        }
        System.out.println();
    }
}

/*
Time Complexity: O(n)
說明：
1. 構建 prefix sum 陣列需遍歷原始 n 筆比賽紀錄，為 O(n)。
2. 輸出前 k 筆 prefix sum 為 O(k)，但 k <= n，整體仍為 O(n)。
3. 查詢任意一筆 prefix sum 為 O(1)，但此題只需一次遍歷。
*/
