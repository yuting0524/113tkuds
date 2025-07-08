public class BasicArrayOperations {
    public static void main(String[] args) {
      
        int[] numbers = {15, 28, 7, 42, 91, 33, 66, 58, 24, 81};
  
        System.out.println("陣列長度: " + numbers.length);
        
        numbers[2] = 99;

        numbers[numbers.length - 1] = 100;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("索引 " + i + ": " + numbers[i]);
        }
    }
}

/*
陣列長度: 10
索引 0: 15
索引 1: 28
索引 2: 99
索引 3: 42
索引 4: 91
索引 5: 33
索引 6: 66
索引 7: 58
索引 8: 24
索引 9: 100
*/
