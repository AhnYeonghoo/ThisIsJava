package Chapter6.test02;

public class CarTest {

}

class Car {
    String color;
    String gt;
    int door;

    Car() {
        this("white", "auto", 4);
    }

    Car(Car c) {
        color = c.color;
        gt = c.gt;
        door = c.door;
    }

    Car(String color, String gt, int door) {
        this.color = color;
        this.gt = gt;
        this.door = door;
    }
}
