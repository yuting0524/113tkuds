import java.util.*;

public class Q1_THSRStopCounter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        String[] stops = new String[n];

        for (int i = 0; i < n; i++) {
            stops[i] = sc.next();
        }

        String start = sc.next();
        String end = sc.next();

        int startIdx = -1, endIdx = -1;
        
        for (int i = 0; i < n; i++) {
            if (stops[i].equals(start)) startIdx = i;
            if (stops[i].equals(end)) endIdx = i;
        }

        if (startIdx == -1 || endIdx == -1) {
            System.out.println("Invalid");
        } else {
            System.out.println(Math.abs(startIdx - endIdx) + 1);
        }
    }
}

/*
Time Complexity: O(n)
說明：
1. 需從長度為 n 的陣列中找出 start 與 end 站台的索引位置。
2. 最差情況下需要走訪完整陣列，因此為 O(n)。
3. 其餘操作皆為常數時間（比較、印出等），不影響整體複雜度。
*/
