import java.util.*;

public class Q6_NightMarketMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = Integer.parseInt(sc.nextLine());
        char[][] map = new char[10][10];

        for (int i = 0; i < 10; i++) {
            Arrays.fill(map[i], '#');
        }

        for (int i = 0; i < m; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            if (r >= 0 && r < 10 && c >= 0 && c < 10) {
                map[r][c] = '*';
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
}
