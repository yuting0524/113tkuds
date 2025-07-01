import java.util.HashMap;
import java.util.Map;

public class array_mode_count {
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 1, 3};
        Map<Integer, Integer> countMap = new HashMap<>();

        // 計數每個數字的出現次數
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            System.out.println("計數: " + num + " 出現 " + countMap.get(num) + " 次");
        }

        // 找出眾數
        int mode = arr[0];
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mode = entry.getKey();
            }
        }

        System.out.println("眾數為: " + mode);
    }
}
/*當前使用 HashMap 的實現時間複雜度為 O(n)，優於題目假設的 O(n²)。
若題目意指 O(n²) 的巢狀實現，則已通過 HashMap 改善至 O(n)，無法進一步降低時間複雜度，除非利用特定條件（如排序或眾數假設）。
建議：若無額外約束，當前實現已足夠高效；若需 O(1) 空間，可考慮摩爾投票法，但需驗證眾數條件。
*/