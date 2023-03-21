package Chapter6.sec08;

public class Car {
    int gas;

    void setGas(int gas) {
        this.gas = gas;
    }

    boolean isLeftGas() {
        if (gas == 0) {
            System.out.println("gas가 없습니다.");
            return false;
        }
        System.out.println("gas가 있습니다.");
        return true;
    }

    void run() {
        while (true) {
            if (gas > 0) {
                System.out.println("달립니다.(gas 잔량:" + gas + ")");
                gas -= 1;
            } else {
                System.out.println("멈춥니다. (gas 잔량:" + gas + ")");
                return;
            }
        }
    }

    public static void main(String[] args) {
        Car mc = new Car();
        mc.setGas(5);
        if (mc.isLeftGas()){
            System.out.println("출발");
            mc.run();
        }
        System.out.println("gas를 주입하세요.");
    }
}
