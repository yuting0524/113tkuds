import java.util.Scanner;

public class q4paircount {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("輸入一個整數n:");
int n = sc.nextInt();
int[] arr = new int[n];
int ops = 0;
System.out.print("輸入n個整數:");
for (int i = 0; i < n; i++) {
arr[i] = sc.nextInt();
}

int count = 0;
for (int i = 0; i < n; i++) {
for (int j = i + 1; j < n; j++) {
count++;
ops++;
}
}

System.out.println("所有不同索引的配對數:"+count); // 總配對數
System.out.println("操作次數:"+ops); // 操作次數 跟配對數相同
}
}
/*
輸入一個整數n:5
輸入n個整數:1 4 7 9 0
所有不同索引的配對數:10
操作次數:10
*/
