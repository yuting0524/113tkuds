public class matrix_multiplication_trace {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        int[][] c = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                    System.out.println("計算 c[" + i + "][" + j + "] = a[" + i + "][" + k + "] * b[" + k + "][" + j + "] = " + a[i][k] + " * " + b[k][j] + " = " + c[i][j]);
                }
            }
        }

        // 輸出結果
        System.out.println("結果矩陣:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}