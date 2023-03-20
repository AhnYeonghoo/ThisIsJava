package Chapter6.sec07;

public class Car {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    Car() {}

    Car(String model) {
        this.model = model;
    }

    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1.company);
        System.out.println();

        Car car2 = new Car("자가용");
        System.out.println(car2.company);
        System.out.println(car2.model);
        System.out.println();

        Car car3 = new Car("자가용", "빨강");
        System.out.println(car3.company);
        System.out.println(car3.model);
        System.out.println(car3.color);

        Car car4 = new Car("택시", "껌정", 200);
        System.out.println(car4.company);
        System.out.println(car4.model);
        System.out.println(car4.color);
        System.out.println(car4.maxSpeed);
    }

}
