import java.util.Scanner;

public class q3binsearch {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("輸入陣列長度:");
int n = sc.nextInt();
int[] arr = new int[n];
System.out.print("輸入由小到大排序的陣列(用空格隔開):");
for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
System.out.print("輸入要查詢的數字:");
int key = sc.nextInt();

int left = 0, right = n - 1, result = -1, ops = 0;

while (left <= right) {
ops++;
int mid = (left + right) / 2;
if (arr[mid] == key) {
result = mid;
break;
} else if (arr[mid] < key) {
left = mid + 1;
} else {
right = mid - 1;
}
}

System.out.println("顯示索引值:"+result);
System.out.println("共尋找了"+ops+"次");
}
}
/*
輸入陣列長度:5
輸入由小到大排序的陣列(用空格隔開):1 3 5 7 8
輸入要查詢的數字:5
顯示索引值:2
共尋找了1次
*/
