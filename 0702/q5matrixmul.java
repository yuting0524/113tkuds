import java.util.Scanner;

public class q5matrixmul {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("輸入矩陣大小n(表nxn方陣):");
int n = sc.nextInt();
int[][] A = new int[n][n];
int[][] B = new int[n][n];
int[][] C = new int[n][n];
int ops = 0;

System.out.println("請依序輸入矩陣A的元素:");
for (int i = 0; i < n; i++)
for (int j = 0; j < n; j++)
A[i][j] = sc.nextInt();

System.out.println("請依序輸入矩陣B的元素:");
for (int i = 0; i < n; i++)
for (int j = 0; j < n; j++)
B[i][j] = sc.nextInt();

for (int i = 0; i < n; i++)
for (int j = 0; j < n; j++) {
for (int k = 0; k < n; k++) {
C[i][j] += A[i][k] * B[k][j];

ops++;
}
}
System.out.println("矩陣C為:");
for (int i = 0; i < n; i++) {
for (int j = 0; j < n; j++) {
System.out.print(C[i][j] + " ");
}
System.out.println();
}

System.out.println("操作次數"+ops);
}
}

/*
輸入矩陣大小n(表nxn方陣):
2
請依序輸入矩陣A的元素:
3 4
5 6
請依序輸入矩陣B的元素:
7 8 
9 5
矩陣C為:
57 44
89 70
操作次數8
*/