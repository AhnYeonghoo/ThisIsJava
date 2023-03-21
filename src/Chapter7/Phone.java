package Chapter7;

public class Phone {

    public String model;
    public String color;

    public Phone() {
        System.out.println("Phone 생성자 호출");
    }
    public void bell() {
        System.out.println("벨이 울립니다.");
    }

    public void sendVoice(String message) {
        System.out.println("자기: " + message);
    }

    public void receiveVoice(String message) {
        System.out.println("상대방: " + message);
    }

    public void hangUp() {
        System.out.println("전화를 끊습니다.");
    }

    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

        System.out.println(myPhone.model);
        System.out.println(myPhone.color);
        System.out.println(myPhone.wifi);
        System.out.println();

        myPhone.bell();
        myPhone.sendVoice("여보세요");
        myPhone.receiveVoice("안녕ㄹ하세요. 저는 홍길동인데요.");
        myPhone.sendVoice("아 네 반갑습니다.");
        myPhone.hangUp();

        myPhone.setWifi(true);
        myPhone.internet();
    }
}

class SmartPhone extends Phone {
    public boolean wifi;

    public SmartPhone(String model, String color) {
        super();
        this.model = model;
        this.color = color;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        System.out.println("와이파이 상태를 변경했습니다.");
    }

    public void internet() {
        System.out.println("인터넷에 연결합니다.");
    }


}
