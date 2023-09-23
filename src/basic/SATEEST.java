package basic;

import java.util.*;

public class SATEEST {

    public static int solution(int n, int [][] nationality){
        int answer = -1;
        // n명의 학생들이 1~n번까지 번호가 매겨져있다.




        return answer;
    }

    // 팩토리얼 계산 함수
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // 조합 계산 함수
    public static int combination(int n, int k) {
        if (n < k) {
            return 0;
        }
        return factorial(n) / (factorial(k) * factorial(n - k));
    }


    public static void main(String[] args) {
//        int n = 4;
        int n = 5;

//        int[][]nationality = {{1,2},{2,3},{1,3}};
        int[][]nationality = {{1,2},{2,3}};

        // nationality 배열 데이터추출
        List<Integer> 국적데이터 = new ArrayList<>();

        for (int i = 0; i < nationality.length; i++) {
            for (int j = 0; j < nationality[i].length; j++) {
                국적데이터.add(nationality[i][j]);
            }
        }
        // 중복제거
        HashSet<Integer> uniqueSet = new HashSet<>(국적데이터);
        // 중복제거한 데이터를 리스트로 변환
        ArrayList<Integer> uniqueList = new ArrayList<>(uniqueSet);

        int 일차답 = uniqueList.size() * (n-uniqueList.size());
        int 이차답  = 0;
        if(n-uniqueList.size() == 1){
            이차답  = 0;
        }else{
            이차답 = combination(n-uniqueList.size(), 2);
        }

        System.out.println((일차답 + 이차답) < 0 ? 0 : 일차답 + 이차답);
//        if (일차답 + 이차답 <0) {
//            System.out.println(0);
//        }
    }
}
