package basic.object;

interface 육식동물 {
    // 인터페이스는 ‘규칙’
    // 인터페이스를 implements한 클래스들이 강제적으로 구현해야 하는 규칙
    String getFood();
}
class 동물I {
    String name;

    void setName(String name) {
        this.name = name;
    }
}
class 호랑이 extends 동물I implements 육식동물 {
    // 인터페이스의 메서드는 항상 public으로 구현해야 한다.
    public String getFood() {
        return "apple";
    }
}
class 사자 extends 동물I implements 육식동물 {
    public String getFood() {
        return "banana";
    }
}

class 사육사 {
    void feed(호랑이 tiger) {
        System.out.println("feed apple");
    }

    void feed(사자 lion) {
        System.out.println("feed banana");
    }

    // tiger: 호랑이 클래스의 객체, 육식동물 인터페이스의 객체
    // lion: 사자 클래스의 객체, 육식동물 인터페이스의 객체

    void feed(육식동물 predator) {
        System.out.println("feed apple");
    }
}

public class InterEx {
}
/*
* 난 동물원(zoo)의 사육사(zookeeper)이다.
육식동물(predator)이 들어오면 난 먹이를 던져준다(feed).
호랑이(tiger)가 오면 사과(apple)를 던져준다.
사자(lion)가 오면 바나나(banana)를 던져준다.
* */