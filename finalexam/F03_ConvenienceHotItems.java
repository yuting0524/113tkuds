import java.util.*;

public class F03_ConvenienceHotItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Item> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().split(" ");
            String name = parts[0];
            int qty = Integer.parseInt(parts[1]);

            int j = 0;
            while (j < list.size() && list.get(j).qty >= qty) j++;
            list.add(j, new Item(name, qty));
        }

        for (int i = 0; i < Math.min(10, list.size()); i++) {
            System.out.println(list.get(i).name + " " + list.get(i).qty);
        }
    }

    static class Item {
        String name;
        int qty;
        Item(String n, int q) {
            name = n;
            qty = q;
        }
    }
}

/*
 * Time Complexity: O(n^2)
 * 說明：使用插入排序，每筆資料插入時可能需要比較與移動 O(n) 次，
 *      共 n 筆資料時，最壞時間為 O(n^2)。
 */
