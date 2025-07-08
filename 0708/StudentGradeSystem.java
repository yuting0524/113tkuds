public class StudentGradeSystem {

    // 方法：根據分數回傳等級
    public static char getGrade(int score) {
        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else return 'D';
    }

    // 方法：顯示完整成績報告
    public static void printReport(int[] scores) {
        int total = 0;
        int max = scores[0], min = scores[0];
        int maxIndex = 0, minIndex = 0;
        int countA = 0, countB = 0, countC = 0, countD = 0;

        // 先算總和與統計等級
        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            total += score;

            if (score > max) {
                max = score;
                maxIndex = i;
            }
            if (score < min) {
                min = score;
                minIndex = i;
            }

            char grade = getGrade(score);
            switch (grade) {
                case 'A': countA++; break;
                case 'B': countB++; break;
                case 'C': countC++; break;
                case 'D': countD++; break;
            }
        }

        double average = (double) total / scores.length;

        // 統計高於平均的人數
        int aboveAvgCount = 0;
        for (int score : scores) {
            if (score > average) {
                aboveAvgCount++;
            }
        }

        double aboveAvgPercent = (double) aboveAvgCount / scores.length * 100;

        // 輸出報告
        System.out.println("====== 學生成績報告 ======");
        System.out.println("學生總數: " + scores.length);
        System.out.printf("平均分數: %.2f\n", average);
        System.out.println("最高分: " + max + "（學生編號: " + maxIndex + ")");
        System.out.println("最低分: " + min + "（學生編號: " + minIndex + ")");
        System.out.printf("高於平均人數: %d (%.2f%%)\n", aboveAvgCount, aboveAvgPercent);
        System.out.println("各等級人數: A=" + countA + ", B=" + countB + ", C=" + countC + ", D=" + countD);
        System.out.println("-----------------------------");
        System.out.println("編號\t分數\t等級");

        for (int i = 0; i < scores.length; i++) {
            System.out.println(i + "\t" + scores[i] + "\t" + getGrade(scores[i]));
        }

        System.out.println("=============================");
    }

    public static void main(String[] args) {
        int[] studentScores = {85, 92, 78, 96, 87, 73, 89, 94, 81, 88};
        printReport(studentScores);
    }
}

/*
====== 學生成績報告 ======
學生總數: 10
平均分數: 86.30
最高分: 96（學生編號: 3)
最低分: 73（學生編號: 5)
高於平均人數: 6 (60.00%)
各等級人數: A=3, B=5, C=2, D=0
-----------------------------
編號    分數    等級
0       85      B
1       92      A
2       78      C
3       96      A
4       87      B
5       73      C
6       89      B
7       94      A
8       81      B
9       88      B
=============================
*/