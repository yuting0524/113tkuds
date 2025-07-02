import java.util.Scanner;

public class q7permutation {
    static int ops = 0;

    public static void permute(int[] arr, int l, int r) {
        if (l == r) {
            for (int i = 0; i <= r; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            ops++;
        } else {
            for (int i = l; i <= r; i++) {
                swap(arr, l, i);
                permute(arr, l + 1, r);
                swap(arr, l, i); // 回復原狀
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("輸入一個 <= 8 的整數:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = i + 1;
        permute(arr, 0, n - 1);
        System.out.println("操作次數"+ops);
    }
}
/*
輸入一個 <= 8 的整數:4
1 2 3 4
1 2 4 3
1 3 2 4
1 3 4 2
1 4 3 2
1 4 2 3
2 1 3 4
2 1 4 3
2 3 1 4
2 3 4 1
2 4 3 1
2 4 1 3
3 2 1 4
3 2 4 1
3 1 2 4
3 1 4 2
3 4 1 2
3 4 2 1
4 2 3 1
4 2 1 3
4 3 2 1
4 3 1 2
4 1 3 2
4 1 2 3
操作次數24
*/
