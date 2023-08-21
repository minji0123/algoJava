package basic.object;

class AnimalFourLeg {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

// AnimalFourLeg 상속
class Dog extends AnimalFourLeg {  // AnimalFourLeg 클래스를 상속한다.
    void sleep() {
        System.out.println(this.name+" zzz");
    }
}

class HouseDog extends Dog {
}
public class InheritEx {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("poppy");
        System.out.println(dog.name);


        // IS-A 관계
        // 자식 클래스의 객체는 부모 클래스의 자료형인 것처럼 사용할 수 있다.
        Animal dog2 = new Animal();  // Dog is a Animal
        // dog 자식 메소드 사용 불가

    }

}
