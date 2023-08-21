package basic.type;

public class ArrayEx {


    public static void main(String[] args) {
        // 배열 : 자료형의 집합
        int[] 홀수 = {1, 3, 5, 7, 9};
        String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};


        String[] weeks2 = new String[7];
        weeks2[0] = "월";
        weeks2[1] = "화";
        weeks2[2] = "수";
        weeks2[3] = "목";
        weeks2[4] = "금";
        weeks2[5] = "토";
        weeks2[6] = "일";
    }
}
/*
*
* 배열 Array
자료형의 종류가 아니라 자료형의 집합
Int[] -> int 자료형을 모아놓음
String[] -> String 자료형을 모아놓음

배열 특징
배열 선언 시 길이를 지정해줘야 한다.

사용하는경우
적은 메모리로 패키지 import 없이
같은 자료형들을 모아놓고 싶을 때
*
* */
