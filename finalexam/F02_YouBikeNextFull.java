import java.util.*;

public class F02_YouBikeNextFull {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Integer> times = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().split(":");
            int mins = Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
            times.add(mins);
        }
        String[] q = sc.nextLine().split(":");
        int query = Integer.parseInt(q[0]) * 60 + Integer.parseInt(q[1]);

        int ans = -1;
        for (int t : times) {
            if (t >= query) {
                ans = t;
                break;
            }
        }

        if (ans == -1) {
            System.out.println("No bike");
        } else {
            System.out.printf("%02d:%02d\n", ans / 60, ans % 60);
        }
    }
}

/*
 * Time Complexity: O(n)
 * 說明：一次遍歷 n 筆補車時間找最早滿足條件者。
 *      若事先排序再用 binary search，可降為 O(log n)。
 */
