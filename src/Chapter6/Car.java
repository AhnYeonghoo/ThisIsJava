package Chapter6;

public class Car {
    String company = "현대자동차";
    String model = "그랜저";
    String color = "검정";
    int maxSpeed = 350;
    boolean start;
    int speed;

    Car(String model, String color, int maxSpeed) {

    }

    public static void main(String[] args) {
        Car myCar = new Car("그랜저", "검정", 250);

        System.out.println(myCar.model);
        System.out.println(myCar.start);
        System.out.println(myCar.speed);
        System.out.println(myCar.company);
        System.out.println(myCar.color);
        System.out.println(myCar.maxSpeed);

        myCar.speed = 60;
        System.out.println(myCar.speed);
    }
}
