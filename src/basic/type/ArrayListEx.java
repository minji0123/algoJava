package basic.type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayListEx {

    public static void main(String[] args) {

        // 1. ArrayList 선언
        // 제네릭스를 사용하지 않으면 ArrayList에 추가하는 객체는 Object 자료형으로 인식
        ArrayList<String> 리스트 = new ArrayList<>();

        // 2. 기존 배열을 ArrayList에 할당
        String[] 배열 = {"138", "129", "142"};
        ArrayList<String> 리스트2 = new ArrayList<>(Arrays.asList(배열));

        // ==============================
        // add : 요솟값 추가
        // ==============================
        // add1 리스트 안에 값 넣기
        리스트.add("138");
        리스트.add("129");
        리스트.add("142");

        // add2 첫번째 위치에 133 삽입.
        리스트.add(0, "133");

        // ==============================
        // get : 특정 인덱스 값 출력
        // ==============================
        리스트.get(1);

        // ==============================
        // size : 특정 인덱스 값 출력
        // ==============================
        리스트.size();
        // ==============================
        // contains : 리스트 안에 해당 항목이 있는지 판별
        // ==============================
        리스트.contains("142");
        // ==============================
        // remove : 특정 인덱스/데이터 값 삭제
        // ==============================
        리스트.remove("129");  // 129를 리스트에서 삭제
        리스트.remove(0);

        // ==============================
        // sort : 리스트 정렬
        // ==============================
        리스트.sort(Comparator.naturalOrder()); // 오름차순
        리스트.sort(Comparator.reverseOrder()); // 내림차순

        // ==============================
        // String.join : 리스트 -> 문자열
        // ==============================
        String.join(",", 리스트);

    }

}

/*
* 리스트 list
자료형의 종류
ArrayList, Vector, LinkedList

리스트 특징
리스트 선언 시 길이를 지정해주지 않아도 된다.
리스트는 순서가 중요

사용하는경우
자료형의 개수가 계속 변하는 상황일 때
간편하게 편리한 기능의 메소드를 갖다 쓰고 싶을 때 (add, size 등등...)

* */