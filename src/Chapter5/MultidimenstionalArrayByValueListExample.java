package Chapter5;

public class MultidimenstionalArrayByValueListExample {
    public static void main(String[] args) {
        int[][] scores = {
                { 80, 90, 95},
                { 76, 88}
        };
        System.out.println(scores.length);
        System.out.println(scores[0].length);
        System.out.println(scores[1].length);
        System.out.println(scores[0][2]);
        System.out.println(scores[1][1]);

        int classNum = 0;
        for (int i = 0; i < scores[0].length; i++) {
            classNum += scores[0][i];
        }
        double class1Avg = (double) classNum / scores[0].length;
        System.out.println(class1Avg);

        int class2Sum = 0;
        for (int i = 0; i < scores[1].length; i++) {
            class2Sum += scores[1][i];
        }
        double class2Avg = (double) class2Sum / scores[1].length;
        System.out.println(class2Avg);

        int totalStudent = 0;
        int totalSum = 0;
        for (int i = 0; i <scores.length; i++) {
            totalStudent += scores[i].length;
            for (int j = 0; j < scores[i].length; j++) {
                totalSum += scores[i][j];
            }
        }
        double totalAvg = (double) totalSum / totalStudent;
        System.out.println(totalAvg);
    }
}
