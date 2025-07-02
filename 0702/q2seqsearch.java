import java.util.Scanner;

public class q2seqsearch {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("輸入陣列中要多少個數:");
int n = sc.nextInt(); // 陣列大小
int[] arr = new int[n];
System.out.println("輸入陣列(用空格隔開):");
for (int i = 0; i < n; i++) {
arr[i] = sc.nextInt();
}
System.out.println("輸入要尋找的值:");
int key = sc.nextInt(); // 要找的值
int ops = 0;
boolean found = false;

for (int i = 0; i < n; i++) {
ops++;
if (arr[i] == key) {
found = true;
break;
}
}
System.out.print("是否有找到?:");
System.out.println(found ? "Yes" : "No");
System.out.println("比對次數:"+ops);
}
}
/*
輸入陣列中要多少個數:
5
輸入陣列(用空格隔開):
2 5 6 8 9
輸入要尋找的值:
2
是否有找到?:Yes
比對次數:1
*/
