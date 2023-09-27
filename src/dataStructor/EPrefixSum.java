package dataStructor;

import java.io.IOException;
import java.util.Scanner;

public class EPrefixSum {
    public static void main(String[] args) throws IOException {

        /*
        * 백준 10986 나머지합
        * n개의 수 가 주어졌을 때 연속된 부분의 합이 m 으로 나누어떨어지는 구간의 개수를 구하라
        */
        /*
        * 입력데이터
        * 5 3
        * 1 2 3 1 2
        * 출력데이터
        * 7
        * */

        Scanner sc = new Scanner(System.in);
        int 데이터개수 = sc.nextInt(); // 데이터 개수
        int 나누는수 = sc.nextInt(); // 나누는 수(나눠떨어져야 하는 수)

        long[] S = new long[데이터개수]; // 합배열
        long[] C = new long[나누는수]; // 나머지배열

        long answer = 0;

        // 데이터개수만큼 배열 데이터 입력받기
        S[0] = sc.nextInt();
        for(int i = 1; i < 데이터개수; i++){
            S[i] = S[i-1] + sc.nextInt();
        }

        // 1. 합배열%나누는수 == 0 인거 count
        for (int i=0; i<데이터개수;i++){
            int 나머지 = (int)(S[i] % 나누는수);
            // 나머지 0인거 count
            if (나머지 == 0){
                answer++;
            }
            // 나머지 배열에 나머지 쌓기
            C[나머지]++;
        }

        // 2. 나머지 같은거끼리 조합(combination)
        for (int i=0; i<나누는수;i++){
            if (C[i] > 1){
                answer += C[i] * (C[i]-1) / 2;
            }
        }

        System.out.println(answer);
    }

}
