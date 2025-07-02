import java.util.Scanner;

public class q6fibonaccirec {
static int ops = 0;

public static int fib(int n) {
ops++;
if (n == 0) return 0;
if (n == 1) return 1;
return fib(n - 1) + fib(n - 2);
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("輸入n個整數:");
int n = sc.nextInt();
int result = fib(n);
System.out.println("F(n)="+result);
System.out.println("呼叫了"+ops+"次遞迴");
}
}
/*
輸入n個整數:7
F(n)=13
呼叫了41次遞迴
*/