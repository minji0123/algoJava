package basic.type;

import java.util.ArrayList;
import java.util.HashMap;

public class MapEx {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        // ==============================
        // put : 키-value 추가
        // ==============================
        map.put("people", "사람");
        map.put("baseball", "야구");

        // ==============================
        // get : 특정 value 값 출력
        // ==============================
        map.get("people");
        map.getOrDefault("people", "자바");

        // ==============================
        // contains : 맵에 해당 key가 있는지 판별
        // ==============================
        map.containsKey("people");

        // ==============================
        // remove : key와 value가 모두 삭제
        // ==============================
        map.remove("people");

        // ==============================
        // size : 맵 요소의 개수를 리턴
        // ==============================
        map.size();

        // ==============================
        // keySet : 맵의 모든 key를 모아서 리턴
        // ==============================
        // keySet() 메서드는 맵의 모든 key를 모아서 set 집합 자료형으로 리턴한다.
        map.keySet();

        // set 집합 자료형은 리스트 자료형으로 바꾸어 사용할 수도 있다.
        ArrayList<String> keyList = new ArrayList<>(map.keySet());

    }
}
/*
* 맵 map
키(key)와 값(value)을 한 쌍으로 갖는 자료형
 HashMap, LinkedHashMap, TreeMap

맵 특징
키(key)를 이용해 값(value)을 얻는다.
우리가 baseball이란 단어의 뜻을 찾을 때 사전의 1쪽부터 모두 읽지 않고 baseball이라는 단어가 있는 곳을 찾아 확인하는 것과 같다.
순서에 의존하지 않음.(인덱스 무의미)

LinkedHashMap : 입력된 순서대로 데이터를 저장한다.
TreeMap : 입력된 key의 오름차순으로 데이터를 저장한다.
* */
