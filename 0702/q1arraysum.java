import java.util.Scanner;

public class q1arraysum {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("輸入陣列中要多少個數:");
int n = sc.nextInt(); // 輸入數量
int[] arr = new int[n];
int sum = 0, ops = 0;

System.out.print("輸入陣列:");
for (int i = 0; i < n; i++) {
arr[i] = sc.nextInt(); // 讀入整數
sum += arr[i]; // 加總
ops++; // 每加一次就 +1
}

System.out.println("陣列總和為:"+sum);
System.out.println("操作次數:"+ops); 
}
}
/*
輸入陣列中要多少個數:3
輸入陣列:1 2 3
陣列總和為:6
操作次數:3
*/