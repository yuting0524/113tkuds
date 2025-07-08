class ArrayTraversal {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        
        System.out.println("方法一：傳統 for 迴圈（需要索引時使用）");
        // 適用於需要知道元素位置或需要修改元素的情況
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("索引 %d：值 %d，記憶體相對位址：%d\n", 
                            i, numbers[i], i * 4);
        }
        
        System.out.println("\n方法二：增強型 for 迴圈（只需要值時使用）");
        // 適用於只需要讀取元素值，不需要修改的情況
        int sum = 0;
        for (int num : numbers) {
            sum += num;
            System.out.println("目前處理的值：" + num + "，累計總和：" + sum);
        }
        
        System.out.println("\n方法三：反向走訪");
        // 有時候需要從後往前處理元素
        System.out.print("反向輸出：");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) System.out.print(" -> ");
        }
        System.out.println();
        
        System.out.println("\n方法四：跳躍式走訪");
        // 只處理偶數索引的元素
        System.out.print("偶數索引的元素：");
        for (int i = 0; i < numbers.length; i += 2) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}

/*
法一：傳統 for 迴圈（需要索引時使用）
索引 0：值 10，記憶體相對位址：0
索引 1：值 20，記憶體相對位址：4
索引 2：值 30，記憶體相對位址：8
索引 3：值 40，記憶體相對位址：12
索引 4：值 50，記憶體相對位址：16

方法二：增強型 for 迴圈（只需要值時使用）
目前處理的值：10，累計總和：10
目前處理的值：20，累計總和：30
目前處理的值：30，累計總和：60
目前處理的值：40，累計總和：100
目前處理的值：50，累計總和：150

方法三：反向走訪
反向輸出：50 -> 40 -> 30 -> 20 -> 10

方法四：跳躍式走訪
偶數索引的元素：10 30 50
*/