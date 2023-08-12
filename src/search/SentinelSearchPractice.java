package search;

import java.util.Scanner;

public class SentinelSearchPractice {


    // 보초법
//    public static int 보초법(int[] 배열, int 찾을값) {
    public int 보초법(int[] 배열, int 찾을값) {
        // 1. 보초값 설정 (찐 > 짭)
        int 마지막값 = 배열[배열.length-1];
        배열[배열.length-1] = 찾을값;

        // 2. 찾을값 위치 찾을 때까지 짭배열 탐색
        int 위치 = 0;
        while (배열[위치] != 찾을값){
            위치++;
        }
        // 3. 짭 > 찐 돌려놓기
        배열[배열.length-1] = 마지막값;

        // 4. 맞는지 판단
        if(위치<배열.length-1 || 배열[배열.length-1] == 찾을값){
            return 위치;
        }else{
            return -1;
        }
    }


    public static void main(String[] args) {
        SentinelSearchPractice SM = new SentinelSearchPractice();

        int[] 배열 = {10, 25, 30, 15, 40, 50, 20};
        Scanner 콘솔입력 = new Scanner(System.in);
//        int 찾을값 = 콘솔입력.nextInt();
        int 찾을값 = 30;

        int 결과 = SM.보초법(배열, 찾을값);

        if (결과 != -1) {
            System.out.println( 찾을값 + "는 배열의 인덱스 " + 결과 + " 에 있습니다.");
        } else {
            System.out.println( 찾을값 + "는 배열에 존재하지 않습니다.");
        }
    }


}
