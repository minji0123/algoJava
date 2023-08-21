package basic.type;

import java.util.Arrays;
import java.util.HashSet;

public class SetEx {
    public static void main(String[] args) {

        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));

        // 교집합 구하기
        HashSet<Integer> 교집합 = new HashSet<>(s1);
        교집합.retainAll(s2);  // 교집합 수행 => [4, 5, 6]

        // 합집합 구하기
        HashSet<Integer> 합집합 = new HashSet<>(s1);
        합집합.addAll(s2); // 합집합 수행 => [1, 2, 3, 4, 5, 6, 7, 8, 9]

        // 차집합 구하기
        HashSet<Integer> 차집합 = new HashSet<>(s1);
        차집합.removeAll(s2); // 차집합 수행 => [1, 2, 3]


        // 기타 많이 쓰는 메소드
        HashSet<String> set = new HashSet<>();
        set.add("Jump");
        set.addAll(Arrays.asList("To", "Java"));
        set.remove("To");
    }

}
/*
* Set
키(key)와 값(value)을 한 쌍으로 갖는 자료형
자료형의 중복을 제거하기 위한 필터 역할로 종종 사용



Set 특징
중복을 허용하지 않는다.
순서가 없다(unordered).
교집합, 합집합, 차집합을 구할 때 유용

TreeSet : 값을 오름차순으로 정렬해 저장한다.
LinkedHashSet : 값을 입력한 순서대로 정렬한다.
* */
