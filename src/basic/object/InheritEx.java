package basic.object;

class 동물 {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

// 동물 상속
class 개 extends 동물 {  // 동물 클래스를 상속한다.
    // [기능확장]
    // 부모 클래스를 상속받은 자식 클래스는 부모 클래스의 기능에 더하여 좀 더 많은 기능을 갖도록 작성할 수 있다.
    void sleep() {
        System.out.println(this.name+" zzz");
    }
}

// 동물 - 개 상속
class 애완견 extends 개 {
    // [메서드 오버라이딩]
    // 메서드 덮어쓰기
    // 부모 클래스의 메서드를 자식 클래스가 동일한 형태로 또다시 구현하는 행위
    void sleep() {
        System.out.println(this.name + " zzz in house");
    }
    // [메서드 오버로딩]
    // 입력 항목이 다른 경우 동일한 이름의 메서드 만들기
    void sleep(int hour) {
        System.out.println(this.name+" zzz in house for " + hour + " hours");
    }
}

public class InheritEx {
    public static void main(String[] args) {

        개 강아지 = new 개();
        강아지.setName("poppy");
        System.out.println(강아지.name);

        // [IS-A 관계]
        // ‘개 is a Animal(개는 동물이다)’과 같이 말할 수 있는 관계를 IS-A 관계 라고 한다.
        // 자식 클래스의 객체는 부모 클래스의 자료형인 것처럼 사용할 수 있다.
        동물 강아지2 = new 개();  // Dog is Animal
        // dog 자식 메서드 사용 불가

        애완견 말티즈 = new 애완견();
        말티즈.setName("happy");
        말티즈.sleep();// 메서드 오버라이딩 - 제일 마지막 자식의 메소드가 우선순위가 높다.
        말티즈.sleep(2);// 메서드 오버로딩
    }

}
