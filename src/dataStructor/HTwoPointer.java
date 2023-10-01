package dataStructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class HTwoPointer {

    /*
    * 백준 1253번 좋다
    *
    * N개의 수 중에서 어떤 수가 다른 수 두 개의 합으로 나타낼 수 있다면 그 수를 “좋다(GOOD)”고 한다.
    * N개의 수가 주어지면 그 중에서 좋은 수의 개수는 몇 개인지 출력하라.
    * 수의 위치가 다르면 값이 같아도 다른 수이다.
    *
    * 입력
    * 10
    * 1 2 3 4 5 6 7 8 9 10
    * 출력
    * 8
    * */

    public static void main(String[] args) throws IOException {


        // test
//        int 입력값 = 10;
//        int 입력값 = 5;
//        long 입력배열[] = {1,2,3,4,5,6,7,8,9,10};
//        long 입력배열[] = {1,2,3,4,5};
//        int count = 0;


        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        int 입력값 = Integer.parseInt(br.readLine());
        int count = 0;
        long 입력배열[] = new long[입력값];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i<입력값; i++){
            입력배열[i] = Long.parseLong(st.nextToken());
        }

        // 1. 정렬
        Arrays.sort(입력배열);

        for (int i = 0; i<입력값; i++){
            // 2. 투포인터 선언
            int start_index = 0;
            int end_index = 입력값-1;
            long target = 입력배열[i];

            // 3. 투포인터 알고리즘
            while (start_index < end_index){
                if (입력배열[start_index] + 입력배열[end_index] == target){
                    if (start_index != i && end_index != i){
                        count++;
                        break;
                    }else if (start_index == i){
                        start_index++;
                    }else if (end_index == i){
                        end_index--;
                    }
                }else if (입력배열[start_index] + 입력배열[end_index] < target){
                    start_index++;
                }else if (입력배열[start_index] + 입력배열[end_index] > target){
                    end_index--;
                }
            }
        }
        System.out.println(count);
    }
}
