package Chapter6.test01;

public class CarTest {
    public static void main(String[] args) {

    }
}

class Car {
    String color;
    String gearType;
    int door;

    Car() {
        this("White", "auto", 4);
    }

    Car(String color) {
        this(color, "aauto", 4);
    }

    Car(String color, String gearType, int door) {
        this.color  = color;
        this.gearType = gearType;
        this.door = door;
    }
}
