import java.util.*;

public class Q2_NextTHSRDeparture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int[] times = new int[n];
        String[] timeStrs = new String[n];

        for (int i = 0; i < n; i++) {
            String time = sc.nextLine();
            timeStrs[i] = time;
            times[i] = toMinutes(time);
        }

        String query = sc.nextLine();
        int queryMin = toMinutes(query);

        int idx = binarySearchNext(times, queryMin);

        if (idx == n) {
            System.out.println("No train");
        } else {
            System.out.println(timeStrs[idx]);
        }
    }

    private static int toMinutes(String time) {
        String[] parts = time.split(":");
        int h = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        return h * 60 + m;
    }

    private static int binarySearchNext(int[] times, int queryMin) {
        int left = 0, right = times.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (times[mid] <= queryMin) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}

/*
Time Complexity: O(log n)
說明：
1. 轉換時間陣列需 O(n)，但題目核心操作為二分搜尋下一班車。
2. binarySearchNext 為 O(log n) 的二分搜尋，用於查找第一個大於 query 的時間。
3. 整體為 O(log n)，因為 n ≤ 80，轉換時間不影響主複雜度。
*/
