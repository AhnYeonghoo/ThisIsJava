package Chapter2;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.print("x 값 입력: ");
        String str = scanner.nextLine();
        int x = Integer.parseInt(str);

        System.out.print(", 값 입력:");
        String strY = scanner.nextLine();
        int y = Integer.parseInt(strY);

        int result = x + y;
        System.out.println(result);
        System.out.println();

        while (true) {
            System.out.print("입력 문자열: ");
            String data = scanner.nextLine();
            if (data.equals("q")) break;
            System.out.println(data);
            System.out.println();
        }
        System.out.println("종료");

    }
}
