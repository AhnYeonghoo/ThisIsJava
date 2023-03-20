package Chapter6;

public class Calculator {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        cal.powerOn();

        int result1 = cal.plus(5, 6);
        System.out.println(result1);

        double x = 10;
        double y = 4;

        double result2 = cal.divide(x , y);
        System.out.println(result2);
        cal.powerOff();
    }

    void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    void powerOff() {
        System.out.println("전원을 끕니다.");
    }

    int plus(int x, int y) {
        return x + y;
    }

    double divide(double a, double b) {
        return a / b;
    }


}
