public class FibonacciSimple{
    public static void main(String[] args) {
        int n = 10;
        int a = 0,b = 1;

        System.out.println("費事數列前"+n+"項");
        for (int i = 0; i < n; i++) {
            System.out.print(a+" ");
            int temp = a + b;
            a = b;
            b = temp;

        }
    }
}
/*
費事數列前10項
0 1 1 2 3 5 8 13 21 34
*/