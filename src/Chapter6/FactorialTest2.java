package Chapter6;

public class FactorialTest2 {
    public static void main(String[] args) {
        int n = 21;
        long result = 0;

        for (int i = 1; i <= n; i++) {
            result = factorial(i);
            if (result == -1) {
                System.out.printf("유호하지 않은 값 입니다");
                break;
            }
            System.out.printf("%2d!=%20d%n", i, result);
        }


    }

    static long factorial(int n) {
        if (n <= 0 || n > 20) return -1;
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
}
