

public class ArrayDemo{
    public static void main(String[] args) {
        double[] numbers = {1.11,2.22,3.33,4.44,5.55};
        for(int i = 0;i<numbers.length;i++){
            System.out.println(numbers[i]);
            System.out.println("Index:"+i);
            System.out.println("占用記憶體:"+Double.BYTES+"bytes");
        }
    } 
}
/*
1.11
Index:0
占用記憶體:8bytes
2.22
Index:1
占用記憶體:8bytes
3.33
Index:2
占用記憶體:8bytes
4.44
Index:3
占用記憶體:8bytes
5.55
Index:4
占用記憶體:8bytes
*/