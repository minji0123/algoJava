package dataStructor;

import java.util.Scanner;

public class FTwoPointer {

    /*
    * 백준 2018번 수들의 합 5
    * N(1~10,000,000)을 입력받아 연속된 자연수의 합으로 나타내는 가짓수 출력하기
    * 15 > 4개
    * 15  7+8  4+5+6  1+2+3+4+5
    * 10 > 2개
    * 10  1+2+3+4
    * */
    /*
    * 입력데이터
    * 15
    * 출력데이터
    * 4
    * */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int 입력 = sc.nextInt();
        int count = 1;
        int start_index = 1;
        int end_index = 1;
        int 연속합 = 1;

        while (end_index != 입력){
            if (연속합 == 입력){
                count++;
                end_index++;
                연속합 += end_index;
            }else if (연속합 < 입력){
                end_index++;
                연속합 += end_index;
            }else if (연속합 > 입력){
                연속합 -= start_index;
                start_index++;
            }
        }
        System.out.println(count);
    }
}
