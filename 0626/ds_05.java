public class ds_05 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("總和：" + sum);
    }
}Add comment