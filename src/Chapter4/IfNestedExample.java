package Chapter4;

import java.util.regex.Pattern;

public class IfNestedExample {
    public static void main(String[] args) {
        int score = (int)(Math.random()*20)+81;
        System.out.println(score);

        String grade;
        if (score>=90) {
            if (score>= 95) {
                grade = "A+";
            } else {
                grade = "B";
            }
        } else {
            if (score >= 85) {
                grade = "B+";
            } else {
                grade = "B";
            }
        }
        System.out.println(grade);
    }
}
