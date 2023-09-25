package dataStructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class EPrefixSum {
    public static void main(String[] args) throws IOException {

        /*n개의 수 가 주어졌을 때 연속된 부분의 합이 m 으로 나누어떨어지는 구간의 개수를 구하는 프로그램 작성*/
        /*
        * 입력데이터
        * 5 3
        * 1 2 3 1 2
        * 출력데이터
        * 7
        * */

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 데이터 개수
        int M = sc.nextInt(); // 나누는 수

        long[] S = new long[N];
        long[] C = new long[M];


    }
}
