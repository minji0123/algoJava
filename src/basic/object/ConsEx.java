package basic.object;

class 동물C {
    String name;

    void setName(String name) {
        this.name = name;
    }
}
class 개C extends 동물C {
    // [디폴트생성자]
    // 생성자의 입력 항목이 없고 생성자 내부에 아무 내용이 없는 생성자
    개C (){

    }
    void sleep() {
        System.out.println(this.name+" zzz");
    }
}
class 애완견C extends 개C {

    // [생성자]
    // 객체 변수에 값을 무조건 설정해야만 객체가 생성될 수 있도록 강제할수 있는 방법
    // 메서드명이 클래스명과 동일하고 리턴 자료형을 정의하지 않는 메서드
    애완견C(String name) {
        // 클래스명과 메서드명이 같다.
        // 리턴 타입을 정의하지 않는다(void도 사용하지 않는다.).
        this.setName(name);
    }
    // 생성자 오버로딩
    애완견C() {
        this.setName("poppy");
    }

    애완견C(int type) {
        if (type == 1) {
            this.setName("yorkshire");
        } else if (type == 2) {
            this.setName("bulldog");
        }
    }

    // 매서드
    void sleep() {
        System.out.println(this.name + " zzz in house");
    }

    void sleep(int hour) {
        System.out.println(this.name+" zzz in house for " + hour + " hours");
    }
}
public class ConsEx {
    public static void main(String[] args) {
        애완견C 말티즈 = new 애완견C("happy");
        애완견C 포메 = new 애완견C();
        애완견C 불독 = new 애완견C(2);

        말티즈.sleep();
        포메.sleep();
        불독.sleep();
    }

}
