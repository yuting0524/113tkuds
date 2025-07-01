import java.util.Scanner;

public class linear_search_trace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 輸入陣列大小
        System.out.print("請輸入陣列大小: ");
        int n = scanner.nextInt();

        // 輸入陣列元素
        int[] arr = new int[n];
        System.out.print("請輸入 " + n + " 個整數: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // 輸入目標值
        System.out.print("請輸入目標值: ");
        int target = scanner.nextInt();

        // 線性搜尋並顯示過程
        int index = -1;
        for (int i = 0; i < n; i++) {
            System.out.println("比對中: arr[" + i + "] = " + arr[i] + " vs " + target);
            if (arr[i] == target) {
                index = i;
                break;
            }
        }

        // 輸出結果
        if (index != -1) {
            System.out.println("找到目標值 " + target + " 於索引 " + index);
        } else {
            System.out.println("未找到目標值 " + target);
        }

        scanner.close();
    }
}