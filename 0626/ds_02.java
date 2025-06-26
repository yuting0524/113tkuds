import java.util.Scanner;Add commentMore actions

public class ds_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("輸入半徑：");
        double radius = scanner.nextDouble();
        double area = 3.14 * radius * radius;
        System.out.println("面積：" + area);
        scanner.close();
    }
}