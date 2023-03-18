package Chapter3;

public class IncreaseDecreaseoperatorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        x++;
        ++x;
        System.out.println(x);
        y--;
        --y;
        System.out.println(y);
        System.out.println("------");

        z = x++;
        System.out.println(z);
        System.out.println(x);

        z = ++x;
        System.out.println(z);
        System.out.println(x);
        System.out.println("----");

        z = ++x + y++;
        System.out.println(z);
        System.out.println(x);
        System.out.println(y);

    }
}
