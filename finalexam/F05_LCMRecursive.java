import java.util.*;

public class F05_LCMRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = GCD(a, b);
        int lcm = a * b / gcd;
        System.out.println("LCM: " + lcm);
    }

    public static int GCD(int a, int b) {
        if (b == 0) return a;
        return GCD(b, a % b);
    }
}

/*
 * Time Complexity: O(log n)
 * 說明：使用輾轉相除法計算 GCD，其遞迴深度最多為 O(log n)，n 為輸入中較小者。
 */
