package Chapter3;

public class InfinityAandNaNcheckExample {
    public static void main(String[] args) {
        int x = 5;
        double y = 0.0;
        double z = x / y;
        System.out.println(z + 2);

        if (Double.isInfinite(z) || Double.isNaN(z)) {
            System.out.println("갑 ㅅ산출 불가");
        } else {
            System.out.println(z + 2);
        }
    }
}
