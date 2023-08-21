package basic.object;

class Animal {
    // 객체변수(instance variable)
    String name;

    // 메소드(method): 클래스 내에 구현된 함수
    // setter 메서드
    public void setName(String name) {
        this.name = name; // this 는 객체 그 자체.
        // cat.name = 'boby'
        // dog.name = 'bibi'
    }
    public void setName(Animal Animal) {
        Animal.name = name; // 위랑 똑같은 의미
        // cat.name = 'boby'
        // dog.name = 'bibi'
    }
}

public class ClassEx {
    public static void main(String[] args) {

        // class: 객체(object)를 만드는 기능

        // 객체 만들기
        Animal cat = new Animal();
        Animal dog = new Animal();
        Animal horse = new Animal();
            // cat, dog, horse: 객체, Animal의 인스턴스


        // 객체변수 호출
        System.out.println(cat.name);

        // 메소드 호출
        cat.setName("boby");
        dog.setName("bibi");
        // 객체 변수의 값이 독립적으로 유지된다. (객체지향)

        // 이렇게도 쓸수있다.
        horse.name = "말말말";
        horse.setName(horse);
        System.out.println(horse.name);

    }
}
/*
* 용어정리
* 객체지향: class를 이용하여 재사용성과 확장성을 높이는 것이 목적
* class: 객체를 만드는 틀
* 객체, 인스턴스: class 로 만들어진 object
*   - 객체: object 그 자체
*   - 인스턴스: 어떤 클래스의 객체인지를 관계 위주로 설명
*   - cat: 객체, Animal의 인스턴스
* 결국 이 객체 변수의 값이 독립적으로 유지되기 때문에 객체지향이 이루어지는것
*
* */