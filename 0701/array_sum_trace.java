public class array_sum_trace {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5}; // 預設輸入陣列
        int total = 0; // 初始化總和

        // 逐一加總並顯示過程
        for (int i = 0; i < arr.length; i++) {
            int previousTotal = total; // 儲存當前總和
            total += arr[i]; // 累加當前元素
            System.out.println("加總過程: total = " + previousTotal + " + " + arr[i] + " = " + total);
        }

        System.out.println("給予為: " + total);
    }
}
//Q1 演算法的時間複雜度為 O(n)，空間複雜度為 O(1)。