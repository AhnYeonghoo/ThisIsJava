package Chapter4;

import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int speed = 0;

        while (run) {
            System.out.println("--------------");
            System.out.println("1. 증속 | 2. 감속 | 3. 중지");
            System.out.println("---------------");
            System.out.println("선택: ");

            String strNum = scanner.nextLine();

            if (strNum.equals("1")) {
                speed++;
                System.out.println(speed);
            } else if (strNum.equals("2")) {
                speed--;
                System.out.println(speed);
            } else if (strNum.equals("3")){
                run = false;
            }
        }

        System.out.println("program shutdown");
    }
}
