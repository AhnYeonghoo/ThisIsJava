package Chapter7.sec04;

public class Calculator {

    public double areaCircle(double r) {
        System.out.println("Calculator 객체");
        return 3.14159 * r * r;
    }

    public static void main(String[] args) {
        int r = 10;
        Calculator c = new Calculator();
        System.out.println(c.areaCircle(r));
        System.out.println();
        Computer com = new Computer();
        System.out.println(com.areaCircle(r));
    }


}

class Computer extends Calculator {
    @Override
    public double areaCircle(double r) {
        System.out.println("computer 객체");
        return Math.PI * r * r;
    }
}
