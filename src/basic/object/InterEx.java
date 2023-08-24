package basic.object;

interface 육식동물 {

    // [인터페이스메서드]
    // 인터페이스는 ‘규칙’
    // 인터페이스를 implements한 클래스들이 강제적으로 구현해야 하는 규칙
    String getFood();

    // [디폴트메서드]
    default void printFood() {
        System.out.printf("my food is %s\n", getFood());
    }
}
class 동물I {
    String name;

    void setName(String name) {
        this.name = name;
    }
}
class 호랑이 extends 동물I implements 육식동물 {
    // [인터페이스메서드]
    // 인터페이스의 메서드는 항상 public으로 구현해야 한다.
    public String getFood() {
        return "apple";
    }
}
class 사자 extends 동물I implements 육식동물 {
    // [인터페이스메서드]
    // 인터페이스의 메서드는 항상 public으로 구현해야 한다.
    public String getFood() {
        return "banana";
    }
}

class 사육사 {
    // 인터페이스를 쓰면 이렇게 써야되는걸 밑처럼 바꿀 수 있다.
    //  void feed(호랑이 tiger) {
    //      System.out.println("feed apple");
    //  }

    //  void feed(사자 lion) {
    //      System.out.println("feed banana");
    //  }

    void feed(육식동물 동물1) {
        System.out.println("feed "+동물1.getFood());
    }

}

public class InterEx {
}
/*
* 난 동물원(zoo)의 사육사(zookeeper)이다.
* 육식동물(predator)이 들어오면 난 먹이를 던져준다(feed).
* 호랑이(tiger)가 오면 사과(apple)를 던져준다.
* 사자(lion)가 오면 바나나(banana)를 던져준다.
*
* [interface 사용 이유]
* 1. 메소드 개수 줄이기
* 2. 사육사 클래스가 동물 클래스에 의존적인 클래스에서 동물 클래스와 상관없는 독립적인 클래스가 되었다는 점
* 3. 규칙 강제성 부여
*
* interface 에 메소드를 선언하면
* interface 를 implements 한 클래스들은 강제로 해당 메소드를 구현해야 한다.
*
* interface 에 디폴트 메소드를 선언하면
* 실제 구현된 형태의 메서드를 가질 수 있다.
* 상속관계의 메소드처럼 사용 가능하다. (자식이 사용가능, 오버라이딩 등)
* */