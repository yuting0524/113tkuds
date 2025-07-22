public class FibonacciFast {

    // 慢速：標準遞迴
    public static int fibonacciSlow(int n) {
        if (n <= 1) return n;
        return fibonacciSlow(n - 1) + fibonacciSlow(n - 2);
    }

    // 快速：記憶化版本
    public static int fibonacciFast(int n, int[] memo) {
        if (n <= 1) return n;
        if (memo[n] != 0) return memo[n];
        memo[n] = fibonacciFast(n - 1, memo) + fibonacciFast(n - 2, memo);
        return memo[n];
    }

    public static void main(String[] args) {
        int n = 10;

        System.out.println("Slow version:");
        System.out.println(fibonacciSlow(n)); // 預期輸出：55

        System.out.println("Fast version:");
        int[] memo = new int[n + 1];
        System.out.println(fibonacciFast(n, memo)); // 預期輸出：55
    }
}
