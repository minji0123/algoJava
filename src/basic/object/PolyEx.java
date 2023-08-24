package basic.object;
// 다형성: 하나의 객체가 여러 개의 자료형 타입을 가질 수 있는 것
interface 동물들 {
    String getFood();

    default void printFood() {
        System.out.printf("my food is %s\n", getFood());
    }
}

interface 울음소리 {
    void bark();
}

interface 동물들울음소리 extends 동물들, 울음소리 {
}


class Tiger extends Animal implements 동물들, 울음소리 {
    public String getFood() {
        return "apple";
    }

    public void bark() {
        System.out.println("어흥");
    }
}

class Lion extends Animal implements 동물들울음소리 {
    public String getFood() {
        return "banana";
    }

    public void bark() {
        System.out.println("으르렁");
    }
}

class Bouncer {
    void barkAnimal(울음소리 울음소리1) {
        울음소리1.bark();
    }
}

public class PolyEx {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Lion lion = new Lion();

        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);
    }
}
