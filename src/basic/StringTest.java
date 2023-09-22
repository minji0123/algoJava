package basic;

import java.util.ArrayList;
import java.util.Arrays;

public class StringTest {
    /*
    * 1. 양 끝 모든 a 제거
    *   문자열에 a 없으면 false
    * 2. 양 끝 b 추출
    *   b 개수가 다르면 false
    *
    * while 문으로 a 만 남을때까지 실행
    * */

    public static boolean[] solution(String[] 배열){

        boolean [] answer = {};
        for(int i = 0; i<배열.length;i++){
            if(배열[i].equals("a")){
//                answer
            }
            // while 문으로 a 만 남을때까지 실행
            while(!배열[i].equals("a")){
                // 1. 양 끝 모든 a 제거

                // 문자열의 길이가 0이거나 마지막 문자가 'a'가 아닌 경우에는 변경 없이 출력
                if (배열[i].length() >= 1) {
                    배열[i] = 배열[i].substring(0, 배열[i].length() - 1);
                }

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


