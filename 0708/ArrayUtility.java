import java.util.Arrays;

public class ArrayUtility {

    // 1. 列印陣列內容 [元素1, 元素2, ...]
    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    // 2. 原地反轉陣列
    public static void reverseArray(int[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    // 3. 複製陣列
    public static int[] copyArray(int[] array) {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    // 4. 找出第二大的數值
    public static int findSecondLargest(int[] array) {
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > max) {
                second = max;
                max = num;
            } else if (num > second && num < max) {
                second = num;
            }
        }

        return second;
    }

    public static void main(String[] args) {
        // 建立原始陣列
        int[] data = {3, 7, 1, 9, 4, 6, 8, 2, 5};

        // 原始陣列輸出
        System.out.print("原始陣列: ");
        printArray(data);

        // 測試複製陣列
        int[] copied = copyArray(data);
        System.out.print("複製陣列: ");
        printArray(copied);

        // 測試反轉陣列
        reverseArray(data);
        System.out.print("反轉後陣列: ");
        printArray(data);

        // 測試找第二大值（用複製陣列，避免影響原陣列）
        int secondLargest = findSecondLargest(copied);
        System.out.println("第二大的數值: " + secondLargest);
    }
}

/*
原始陣列: [3, 7, 1, 9, 4, 6, 8, 2, 5]
複製陣列: [3, 7, 1, 9, 4, 6, 8, 2, 5]
反轉後陣列: [5, 2, 8, 6, 4, 9, 1, 7, 3]
第二大的數值: 8
*/