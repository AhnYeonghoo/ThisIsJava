package Chapter3;

public class LogicalOperatorExample {
    public static void main(String[] args) {
        int charCode = 'A';

        if ((65 <= charCode) & (charCode <= 90)) {
            System.out.println("대문자");
        } else if ((97 <= charCode) && (charCode <= 122)) {
            System.out.println("소문자");
        } else if ((48 <= charCode) && (charCode <= 57)) {
            System.out.println("0-9숫자군요");
        } else {
            System.out.println("아무것도 ㅏ닙니다.");
        }

        int value = 6;

        if ((value % 2 == 0) | (value % 3 == 0)) {
            System.out.println("2 or 3의 배수군요.");
        }

        boolean result = (value % 2 == 0) || (value % 3 == 0);
        System.out.println(result);
    }
}
