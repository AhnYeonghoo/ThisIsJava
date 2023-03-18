package Chapter2;

public class PrintExample {
    public static void main(String[] args) {
        int value = 123;
        System.out.printf("%d\n", value);
        System.out.printf("%6d\n", value);
        System.out.printf("%-6d\n", value);
        System.out.printf("%06d\n", value);

        double area = 3.14159 * 10 * 10;
        System.out.printf("%10.2f\n",  area);
        String name = "홍길동";
        String job = "도적";
        System.out.printf("%6d | %-10s | %10s\n", 1, name, job);

    }
}
