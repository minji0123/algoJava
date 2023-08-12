package search;

import java.util.Scanner;

public class SentinelSearch {

    // 보초법
//    public static int 보초법(int[] 배열, int 찾을값) {
    public int 보초법(int[] 배열, int 찾을값) {

        // 1. 보초값 설정 (찐배열 > 짭배열)
        // 배열 끝값을 찾을값으로 변경 (자바 배열은 길이가 정해져 있어서, 배열 뒤에 추가로 못붙임)
        int 마지막값 = 배열[배열.length - 1];
        배열[배열.length - 1] = 찾을값;

        // 2. 짭배열에서 찾을 값 찾아서 위치 저장
        int i = 0;// 위치
        while (배열[i] != 찾을값) {
            // i 에는 =>  찾을값을 찾으면 인덱스(위치)가 저장됨 (맨 뒤에 찾을값 넣어놔서 무조건 저장됨)
            i++;
        }

        // 3. 찾을값 찾으면 배열 돌려놓기 (짭배열 > 찐배열)
        배열[배열.length - 1] = 마지막값;

        // 4. 위치 찾았는지 판단
        // 값이 있는 위치가 배열길이보다 작을 때 ||
        // 찐배열 마지막값이 찾을값일 때
        if (i < 배열.length - 1 || 배열[배열.length - 1] == 찾을값) {
            return i; // 찾은 경우 해당 인덱스를 반환
        } else {
            return -1; // 찾지 못한 경우 -1을 반환
        }
    }

    public static void main(String[] args) {
        SentinelSearch SM = new SentinelSearch();

//        int[] 배열 = {10, 25, 30, 15, 40, 50, 20};
        int[] 배열 = {1,2,3,4};
//        Scanner 콘솔입력 = new Scanner(System.in);
//        int 찾을값 = 콘솔입력.nextInt();
        int 찾을값 = 3;

        int 결과 = SM.보초법(배열, 찾을값);

        if (결과 != -1) {
            System.out.println( 찾을값 + "는 배열의 인덱스 " + 결과 + " 에 있습니다.");
        } else {
            System.out.println( 찾을값 + "는 배열에 존재하지 않습니다.");
        }
    }


}
