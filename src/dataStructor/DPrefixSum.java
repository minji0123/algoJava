package dataStructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DPrefixSum {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 배열크기, 문제개수 입력
        int 배열크기 = Integer.parseInt(st.nextToken());
        int 문제개수 = Integer.parseInt(st.nextToken());

        // 배열 크기만큼 배열 데이터 입력받기
        int A[][] = new int[배열크기 + 1][배열크기 + 1];
        for (int i = 1; i <= 배열크기; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 배열크기; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 배열 크기만큼 구간합 배열 만들기
        int D[][] = new int[배열크기 + 1][배열크기 + 1];
        for (int i = 1; i <= 배열크기; i++) {
            for (int j = 1; j <= 배열크기; j++) {
                D[i][j] = D[i - 1][j] + D[i][j - 1] - D[i - 1][j - 1] + A[i][j];
            }
        }

        // 구간합 구하기
        for (int i = 0; i<문제개수; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            System.out.println(D[x2][y2] - D[x1-1][y2] - D[x2][y1-1] + D[x1-1][y1-1] );
        }
    }
}
