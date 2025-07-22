public class IsSorted {
    public static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) return true;
        if (arr[index] > arr[index + 1]) return false;
        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 3, 2};
        System.out.println("arr1 is sorted: " + isSorted(arr1, 0)); // true
        System.out.println("arr2 is sorted: " + isSorted(arr2, 0)); // false
    }
}
