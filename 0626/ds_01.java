import java.util.Scanner;
public class ds_01{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("輸入第一個整數");
        int num1 = scanner.nextInt();

        System.out.println("輸入第二個整數");
        int num2 = scanner.nextInt();

        int sum = num1+ num2;
        System.err.println("加起來總和是:" + sum );

        scanner.close();

    
    }


}