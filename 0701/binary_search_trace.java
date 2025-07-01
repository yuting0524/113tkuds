public class binary_search_trace {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        int target = 7;
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            System.out.println("搜尋中: left = " + left + ", right = " + right + ", mid = " + mid + ", arr[mid] = " + arr[mid]);
            if (arr[mid] == target) {
                System.out.println("找到目標值 " + target + " 於索引 " + mid);
                return;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("未找到目標值 " + target);
    }
}