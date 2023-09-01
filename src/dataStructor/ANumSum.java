package dataStructor;

import java.util.Scanner;

public class ANumSum {
    /*
    * [백준 11720]
    *     문제: N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
    *     입력: 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다.
    *           둘째 줄에 숫자 N개가 공백없이 주어진다.
    *     출력: 입력으로 주어진 숫자 N개의 합을 출력한다.
    */

    /*
    * [문제분석] - 입력 중심으로 분석한다.
    * 숫자 개수가 1부터 100개이기 때문에 숫자형 자료형 사용 불가.
    * */

    /*
    * [진행순서]
    * 1. 첫번째 숫자개수 입력받기
    * 2. 두번째 숫자 String 으로 입력받기
    * 3. 두번째 숫자를 char[] 에 넣기 -> int[] 안쓰는 이유는 toCharArray 쓰려구..
    * 4. [] 길이만큼 반복해서 더하고 출력하기
    *
    * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 첫번째 숫자개수 입력받기
        int 숫자개수 = sc.nextInt();

        // 2. 두번째 숫자 String 으로 입력받기
        String 숫자 = sc.next();

        // 3. 두번째 숫자를 [] 에 넣기
        char 숫자배열[] = 숫자.toCharArray();

        // 4. [] 길이만큼 반복해서 더하고 출력하기
        int 결과 = 0;
        for (int i = 0; i<숫자배열.length;i++){
            // 중요 *** char to int ***
            결과 += 숫자배열[i] - '0';
        }
        System.out.println(결과);
    }
}
