public class countloops{
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("第"+i+"次迴圈，sum="+sum+"+"+i);
            sum += i;
            count++;
        }
        System.out.println("總和為:"+sum);
        System.out.println("加法執行了"+count+"次");
    }
}
/*
第1次迴圈，sum=0+1
第2次迴圈，sum=1+2
第3次迴圈，sum=3+3
第4次迴圈，sum=6+4
第5次迴圈，sum=10+5
總和為:15
加法執行了5次
*/