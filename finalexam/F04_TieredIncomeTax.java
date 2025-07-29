import java.util.*;

public class F04_TieredIncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine()); // 輸入筆數
        double totalTax = 0;

        for (int i = 0; i < n; i++) {
            int income = Integer.parseInt(sc.nextLine()); // 每筆收入
            double tax = computeTax(income);
            totalTax += tax;
            System.out.printf("Tax: $%.0f\n", tax);
        }

        double average = totalTax / n;
        System.out.printf("Average: $%.0f\n", average);
    }

    public static double computeTax(int income) {
        int[] limits = {540000, 1210000, 2420000, 4530000}; // 稅級門檻
        double[] rates = {0.05, 0.12, 0.20, 0.30, 0.40};     // 各級稅率

        double tax = 0;
        int prev = 0;

        for (int i = 0; i < limits.length; i++) {
            if (income > limits[i]) {
                tax += (limits[i] - prev) * rates[i];
                prev = limits[i];
            } else {
                tax += (income - prev) * rates[i];
                return tax;
            }
        }

        // 超過最後一級
        tax += (income - prev) * rates[rates.length - 1];
        return tax;
    }
}

/*
 * Time Complexity: O(n)
 * 說明：每筆收入計算稅額為 O(1)，總共 n 筆資料，整體為 O(n)。
 */
