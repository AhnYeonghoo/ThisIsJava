package Chapter6.sec08;

public class Calculator {

    double areaRectangle(double width) {
        return width * width;
    }

    double areaRectangle(double width, double height) {
        return width * height;
    }

    public static void main(String[] args) {

        Calculator c = new Calculator();

        double result1 = c.areaRectangle(10);
        double result2 = c.areaRectangle(10, 20);
        System.out.println(result1);
        System.out.println(result2);
    }
}
