package codingTest.gabia;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayTest {
    /*
    * 1. 양 끝 모든 a 제거
    *   문자열에 a 없으면 false
    * 2. 양 끝 b 추출
    *   b 개수가 다르면 false
    *
    * while 문으로 a 만 남을때까지 실행
    * */

    public static boolean[] solution(String[] a){

        boolean [] answer = {};
        ArrayList<String> 배열 = new ArrayList<>(Arrays.asList(a));
        for(int i = 0; i<배열.size();i++){

            // while 문으로 a 만 남을때까지 실행
            while(배열.get(i).equals("a")){
                // 1. 양 끝 모든 a 제거

                // 문자열에 a 없으면 false

                // 2. 양 끝 b 추출
                // b 개수가 다르면 false

            }
        }
        return answer;
    }

    public static void main(String[] args) {
//        String[] 배열 = {"abab", "bbaa", "bababa","bbbababababbbaa"};
        String[] 배열 = {"abab"};
        solution(배열);
    }

}


