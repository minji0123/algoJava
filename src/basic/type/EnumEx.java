package basic.type;

public class EnumEx {
    enum CoffeeType {
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    };
    /**
     * countSellCoffee는 판매된 커피의 갯수를 리턴하는 메서드이다.
     * @param type 커피의 종류 (CoffeType)
     */
    static int countSellCoffee(CoffeeType type) {
//    ... 생략 ...
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(CoffeeType.AMERICANO);  // AMERICANO 출력
        System.out.println(CoffeeType.ICE_AMERICANO);  // ICE_AMERICANO 출력
        System.out.println(CoffeeType.CAFE_LATTE);  // CAFE_LATTE 출력

        // 순서대로 AMERICANO, ICE_AMERICANO, CAFE_LATTE 출력
        for(CoffeeType type: CoffeeType.values()) {
            // CoffeeType.values() => 배열리턴
            System.out.println(type);
        }


        // 아메리카노의 판매갯수
        int americano = countSellCoffee(CoffeeType.AMERICANO);
        // 이렇게 갖다 쓰는 느낌!

    }


}
/*
* enum
서로 연관 있는 여러 개의 상수 집합을 정의할 때 사용
메뉴판, 게시판처럼 미리 정해놓고 꺼내씀
* */