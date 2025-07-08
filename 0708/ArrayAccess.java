

class ArrayAccess{
    public static void main(String[] args) {
        int[] scores = {85,92,77,60,88};

        int firstScore = scores[0];
        int lastScore = scores[4];
        int middleScore = scores[2];

        System.out.println("第一個成績:"+firstScore);
        System.out.println("最後一個成績:"+lastScore);
        System.out.println("中間成績:"+middleScore);

        scores[0] = 90;
        scores[scores.length - 1] = 95;

        int arrayLength = scores.length;
        System.out.println("\n修改後的陣列");
        for(int i = 0;i<arrayLength;i++){
            System.out.printf("索引 %d:%d\n",i,scores[i]);
        }
    }
}

/*第一個成績:85
最後一個成績:88
中間成績:77

修改後的陣列
索引 0:90
索引 1:92
索引 2:77
索引 3:60
索引 4:95
*/