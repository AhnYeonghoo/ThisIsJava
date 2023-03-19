package Chapter6;

public class CardTest {
    public static void main(String[] args) {

        System.out.println(Card.width);
        System.out.println(Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println(c1.kind);
        System.out.println(c1.number);
        System.out.println(c2.kind);
        System.out.println(c2.number);
        System.out.println(c1.height);
        System.out.println(c1.width);
        System.out.println(c2.height);
        System.out.println(c2.width);

        c1.height = 80;
        c1.width = 50;
        System.out.println(c1.width);
        System.out.println(c1.height);
    }
}

class Card {
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}
