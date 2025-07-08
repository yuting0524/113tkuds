class GradeProcessor{
    public static void main(String[] args) {
        int[] grades = {78, 85, 92, 67, 88, 95, 73, 90};
        int total = 0;
        int max = grades[0], min = grades[0];
        int maxIndex = 0, minIndex = 0;

        for(int i = 0;i<grades.length;i++){
            total += grades[i];      
            if (grades[i] > max) {
                max = grades[i];
                maxIndex = i;
            }

            if (grades[i] < min) {
                min = grades[i];
                minIndex = i;
            }
        }

        double average = (double) total / grades.length;
        System.out.printf("總分: %d\n", total);
        System.out.printf("平均分數: %.2f\n", average);

        System.out.println("最高分: " + max + " (索引: " + maxIndex + ")");
        System.out.println("最低分: " + min + " (索引: " + minIndex + ")");

        int countAboveAverage = 0;
        for (int grade : grades) {
            if (grade > average) {
                countAboveAverage++;
            }
        }
        System.out.println("超過平均分的學生人數: " + countAboveAverage);

        System.out.println("學生成績列表:");
        for (int i = 0; i < grades.length; i++) {
            System.out.println("學生編號 " + i + ": " + grades[i]);
        }
    }
}

/*
總分: 668
平均分數: 83.50
最高分: 95 (索引: 5)
最低分: 67 (索引: 3)
超過平均分的學生人數: 5
學生成績列表:
學生編號 0: 78
學生編號 1: 85
學生編號 2: 92
學生編號 3: 67
學生編號 4: 88
學生編號 5: 95
學生編號 6: 73
學生編號 7: 90
*/