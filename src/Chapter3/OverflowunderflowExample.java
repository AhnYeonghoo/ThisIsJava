package Chapter3;

public class OverflowunderflowExample {
    public static void main(String[] args) {
        byte var1 = 125;
        for (int i = 0; i < 5; i++) {
            var1++;
            System.out.println(var1);
        }

        System.out.println("---------");

        byte var2 = -125;
        for (int i = 0; i < 5; i++) {
            var2--;
            System.out.println(var2);
        }
    }
}
