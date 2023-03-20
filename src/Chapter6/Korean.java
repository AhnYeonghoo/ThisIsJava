package Chapter6;

public class Korean {
    String nation = "대한민국";
    String name;
    String ssn;

    public Korean(String n, String s) {
        name = n;
        ssn = n;
    }

    public static void main(String[] args) {
        Korean k1 = new Korean("이자바", "011225-113456");
        System.out.println(k1.nation);
        System.out.println(k1.name);
        System.out.println(k1.ssn);
        System.out.println();

        Korean k2 = new Korean("김자바", "930525-0654321");
        System.out.println(k2.nation);
        System.out.println(k2.name);
        System.out.println(k2.ssn);
    }
}
