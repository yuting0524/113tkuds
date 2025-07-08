public class ArraySearcher {

    public static int findElement(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1; //找不到傳這個
    }

    public static int countOccurrences(int[] array, int target) {
        int count = 0;

        //增強型for 只讀元素沒有索引
        for (int num : array) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int[] numbers = {12, 45, 23, 67, 34, 89, 56, 78, 91, 25};

        int index67 = findElement(numbers, 67);
        System.out.println("數字 67 的索引: " + index67);
        System.out.println("數字 67 出現次數: " + countOccurrences(numbers, 67));

        int index100 = findElement(numbers, 100);
        System.out.println("數字 100 的索引: " + index100);
        System.out.println("數字 100 出現次數: " + countOccurrences(numbers, 100));
    }
}

/*
數字 67 的索引: 3
數字 67 出現次數: 1
數字 100 的索引: -1
數字 100 出現次數: 0
*/
