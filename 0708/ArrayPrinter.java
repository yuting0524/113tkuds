class ArrayPrinter {
    /**
     * 將整數陣列轉換為字串表示法
     * 模仿 Arrays.toString() 的功能
     * 這個方法展示了如何透過索引來循序存取陣列元素
     */
    static String arrayToString(int[] array) {
        // 處理空陣列的特殊情況
        if (array == null) {
            return "null";
        }
        
        if (array.length == 0) {
            return "[]";
        }
        
        StringBuilder sb = new StringBuilder("[");
        
        // 使用傳統 for 迴圈來控制格式輸出
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        
        sb.append("]");
        return sb.toString();
    }
    
    /**
     * 列印陣列的詳細資訊，包括索引和值的對應關係
     */
    static void printArrayWithIndex(int[] array) {
        System.out.println("索引\t值");
        System.out.println("----\t---");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d\t%d\n", i, array[i]);
        }
    }
    
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] emptyArray = {};
        int[] nullArray = null;
        
        System.out.println("一般陣列：" + arrayToString(numbers));
        System.out.println("空陣列：" + arrayToString(emptyArray));
        System.out.println("null 陣列：" + arrayToString(nullArray));
        
        System.out.println("\n詳細資訊：");
        printArrayWithIndex(numbers);
    }
}

/*
一般陣列：[1, 2, 3, 4, 5]
空陣列：[]
null 陣列：null

詳細資訊：
索引    值
----    ---
0       1
1       2
2       3
3       4
4       5
*/