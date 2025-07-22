import java.util.Scanner;

public class StringReverse {

    public static String reverseString(String str) {
        // 停止條件：空字串或單字符
        if (str.length() <= 1) {
            return str;
        }
        // 遞迴：最後一個字元 + 前面子字串反轉
        return str.charAt(str.length() - 1) + 
               reverseString(str.substring(0, str.length() - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // 建立 Scanner 物件
        System.out.print("請輸入要反轉的字串：");
        String input = scanner.nextLine();         // 讀取使用者輸入
        String reversed = reverseString(input);    // 呼叫遞迴反轉
        System.out.println("反轉結果為：" + reversed);
        scanner.close();                           // 關閉 Scanner
    }
}
