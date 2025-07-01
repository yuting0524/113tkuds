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