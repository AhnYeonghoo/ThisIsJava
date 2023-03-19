package Chapter6;

public class PrimitiveParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println(d.x);
        change(d.x);
        System.out.println(d.x);
        change(d);
        System.out.println(d.x);
    }

    static void change(Data d) {
        d.x = 1000;
        System.out.println(d.x);
    }

    static void change(int x) {
        x = 1000;
        System.out.println(x);
    }
}

class Data {
    int x;
}
