package dataStructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CPrefixSum {

    public static void main(String[] args) throws IOException {

        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);

        // 데이터개수, 문제개수 입력
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int 데이터개수 = Integer.parseInt(stringTokenizer.nextToken());
        int 문제개수 = Integer.parseInt(stringTokenizer.nextToken());

        // 데이터개수만큼 배열 데이터 입력받기
        long[] S = new long[데이터개수 + 1];
        stringTokenizer = new StringTokenizer(br.readLine());
        for(int i = 1; i<= 데이터개수; i++){
            S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        // 구간합 구하기
        for (int q = 0; q<문제개수; q++){
            stringTokenizer = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[j] - S[i-1]);
        }

    }
}
