package Chapter5;

import java.util.regex.Pattern;

public class EqualsExample {
    public static void main(String[] args) {
        String strVar1 = "홍길동";
        String strVar2 = "홍길동";
        if (strVar1 == strVar2) {
            System.out.println("strVar1 == strVar2");
        } else {
            System.out.println("strVar1 != strVar2");
        }

        if (strVar1.equals(strVar2)) {
            System.out.println("strVar1과 strVar2는 문자열이 같음.");
        }

        String str3 = new String("홍길동");
        String str4 = new String("홍길동");
        if (str3 == str4) {
            System.out.println("str3 == str4");
        } else {
            System.out.println("str3 != str4");
        }

        if (str3.equals(str4)){
            System.out.println("str3.equals(str4)");
        }
    }
}
