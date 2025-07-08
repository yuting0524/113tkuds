public class ArrayStatistics {

    public static void main(String[] args) {
    
        int[] data = {5, 12, 8, 15, 7, 23, 18, 9, 14, 6};

        // 初始化!
        int total = 0;
        int max = data[0], min = data[0];
        int maxIndex = 0, minIndex = 0;
        int countAboveAverage = 0;
        int evenCount = 0, oddCount = 0;

        for (int i = 0; i < data.length; i++) {
            int num = data[i];
            total += num;

            if (num > max) {
                max = num; //比max大就把數值設成max
                maxIndex = i;
            }
            if (num < min) {
                min = num;
                minIndex = i;
            }

            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        double average = (double) total / data.length;

        // 再次掃描，找出大於平均的數
        for (int num : data) {
            if (num > average) {
                countAboveAverage++;
            }
        }
        //%-20s中,%	格式化的開頭,-靠左對齊（預設是靠右）
        //20 固定寬度為 20 個字元（包含實際字串和空白）
        //s表示格式化的資料是 字串（String）

        System.out.println("===== 陣列統計分析結果 =====");
        System.out.printf("%-20s: %d\n", "總和 (Sum)", total);
        System.out.printf("%-20s: %.2f\n", "平均值 (Average)", average);
        System.out.printf("%-20s: %d (索引 %d)\n", "最大值 (Max)", max, maxIndex);
        System.out.printf("%-20s: %d (索引 %d)\n", "最小值 (Min)", min, minIndex);
        System.out.printf("%-20s: %d\n", "大於平均的數量", countAboveAverage);
        System.out.printf("%-20s: %d\n", "偶數個數", evenCount);
        System.out.printf("%-20s: %d\n", "奇數個數", oddCount);
    }
}
