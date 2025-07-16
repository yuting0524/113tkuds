class MatrixOperations {
    /**
     * 矩陣加法
     * 前提條件：兩個矩陣的維度必須相同
     * 時間複雜度：O(m × n)，其中 m 是行數，n 是列數
     */
    static int[][] addMatrix(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        
        // 檢查矩陣維度是否相同
        if (rows != matrixB.length || cols != matrixB[0].length) {
            System.out.println("錯誤：矩陣維度不匹配，無法進行加法運算");
            return null;
        }
        
        int[][] result = new int[rows][cols];
        
        System.out.println("矩陣加法運算過程：");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
                System.out.printf("result[%d][%d] = %d + %d = %d\n", 
                                i, j, matrixA[i][j], matrixB[i][j], result[i][j]);
            }
        }
        
        return result;
    }
    
    /**
     * 矩陣乘法
     * 前提條件：第一個矩陣的列數必須等於第二個矩陣的行數
     * 時間複雜度：O(m × n × p)
     */
    static int[][] multiplyMatrix(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int rowsB = matrixB.length;
        int colsB = matrixB[0].length;
        
        // 檢查矩陣是否可以相乘
        if (colsA != rowsB) {
            System.out.printf("錯誤：無法相乘 %dx%d 矩陣與 %dx%d 矩陣\n", 
                            rowsA, colsA, rowsB, colsB);
            return null;
        }
        
        int[][] result = new int[rowsA][colsB];
        
        System.out.println("矩陣乘法運算過程：");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                int sum = 0;
                System.out.printf("計算 result[%d][%d]: ", i, j);
                
                for (int k = 0; k < colsA; k++) {
                    sum += matrixA[i][k] * matrixB[k][j];
                    System.out.printf("%d×%d", matrixA[i][k], matrixB[k][j]);
                    if (k < colsA - 1) System.out.print(" + ");
                }
                
                result[i][j] = sum;
                System.out.printf(" = %d\n", sum);
            }
        }
        
        return result;
    }
    
    /**
     * 矩陣轉置
     * 將行與列互換
     * 時間複雜度：O(m × n)
     */
    static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];
        
        System.out.println("矩陣轉置過程：");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
                System.out.printf("transposed[%d][%d] = matrix[%d][%d] = %d\n", 
                                j, i, i, j, matrix[i][j]);
            }
        }
        
        return transposed;
    }
    
    /**
     * 列印矩陣，格式化輸出
     */
    static void printMatrix(String title, int[][] matrix) {
        if (matrix == null) {
            System.out.println(title + ": null");
            return;
        }
        
        System.out.println(title + ":");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%4d ", value);
            }
            System.out.println();
        }
        System.out.println();
    }
    
    /**
     * 檢查矩陣是否為方陣
     */
    static boolean isSquareMatrix(int[][] matrix) {
        return matrix.length == matrix[0].length;
    }
    
    public static void main(String[] args) {
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6}
        };
        
        int[][] matrixB = {
            {7, 8, 9},
            {10, 11, 12}
        };
        
        int[][] matrixC = {
            {1, 2},
            {3, 4},
            {5, 6}
        };
        
        System.out.println("=== 矩陣運算示範 ===");
        printMatrix("矩陣 A (2×3)", matrixA);
        printMatrix("矩陣 B (2×3)", matrixB);
        printMatrix("矩陣 C (3×2)", matrixC);
        
        // 矩陣加法
        System.out.println("=== 矩陣加法：A + B ===");
        int[][] sum = addMatrix(matrixA, matrixB);
        printMatrix("結果", sum);
        
        // 矩陣乘法
        System.out.println("=== 矩陣乘法：A × C ===");
        int[][] product = multiplyMatrix(matrixA, matrixC);
        printMatrix("結果", product);
        
        // 矩陣轉置
        System.out.println("=== 矩陣轉置：A^T ===");
        int[][] transposed = transposeMatrix(matrixA);
        printMatrix("結果", transposed);
        
        // 方陣檢查
        System.out.println("=== 方陣檢查 ===");
        System.out.printf("矩陣 A 是方陣嗎？%s\n", isSquareMatrix(matrixA) ? "是" : "否");
        System.out.printf("矩陣 C 是方陣嗎？%s\n", isSquareMatrix(matrixC) ? "是" : "否");
    }
}
