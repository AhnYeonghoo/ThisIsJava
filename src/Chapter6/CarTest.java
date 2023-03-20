package Chapter6;

public class CarTest {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        c1.color = "white";
        c1.gearType = "auto";
        c1.door = 4;

        Car2 c2 = new Car2("white", "aauto", 4);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}

class Car2 {
    String color;
    String gearType;
    int door;

    Car2() {

    }

    Car2(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

}
