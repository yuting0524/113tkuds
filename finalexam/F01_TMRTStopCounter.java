import java.util.*;

public class F01_TMRTStopCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> stops = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            stops.add(sc.next());
        }
        String start = sc.next();
        String end = sc.next();

        int idx1 = stops.indexOf(start);
        int idx2 = stops.indexOf(end);

        if (idx1 == -1 || idx2 == -1) {
            System.out.println("Invalid");
        } else {
            System.out.println(Math.abs(idx1 - idx2) + 1);
        }
    }
}

/*
 * Time Complexity: O(n)
 * 說明：最多需要掃描整個 stops list 一次來尋找 start 與 end。
 */
