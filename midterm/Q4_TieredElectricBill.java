import java.util.*;

public class Q4_TieredElectricBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] usages = new int[n];
        for (int i = 0; i < n; i++) {
            usages[i] = Integer.parseInt(sc.nextLine());
        }

        int total = 0;
        for (int i = 0; i < n; i++) {
            int bill = calc(usages[i]);
            total += bill;
            System.out.println("Bill: $" + bill);
        }

        int avg = Math.round((float) total / n);
        System.out.println("Total: $" + total);
        System.out.println("Average: $" + avg);
    }

    public static int calc(int kWh) {
        int bill = 0;
        int[] limits =    {120, 210, 170, 200, 300}; // 每區間的最大量（數量）
        double[] prices = {1.68, 2.45, 3.70, 5.04, 6.24, 8.46}; // 對應每一段單價
        int remain = kWh;

        for (int i = 0; i < limits.length; i++) {
            int use = Math.min(remain, limits[i]);
            bill += Math.round(use * prices[i]);
            remain -= use;
            if (remain == 0) break;
        }

        if (remain > 0) {
            bill += Math.round(remain * prices[prices.length - 1]);
        }

        return bill;
    }
}

/*
Time Complexity: O(n)
說明：
1. 對每筆電費呼叫一次 calc(kWh)，而每次計算只跑固定段數（最多 6 段），視為常數時間 O(1)。
2. 總共 n 筆輸入，整體為 O(n)。
3. 輸出與加總也為線性處理，不影響時間複雜度。
*/
