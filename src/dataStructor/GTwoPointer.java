package dataStructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class GTwoPointer {

    /*
     * 백준 1940번 주몽
     *
     * 재료 개수 N, 갑옷을 만드는데 필요한 수 M
     * 몇개의 갑옷을 만들 수 있는지 구하라
     *
     * */

    public static void main(String[] args) throws IOException {

        // test
//        int 재료개수 = 6;
//        int 입력값 = 9;
//        int[] 재료들 = {2,7,4,1,5,3};

        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        int 재료개수 = Integer.parseInt(br.readLine());
        int 입력값 = Integer.parseInt(br.readLine());
        int[] 재료들 = new int[재료개수];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i<재료개수; i++){
            재료들[i] = Integer.parseInt(st.nextToken());
        }
        // 1. 정렬
        Arrays.sort(재료들);

        // 2. 투포인터 선언
        int count = 0;
        int start_index = 0;
        int end_index = 재료개수-1;

        // 3. 투포인터 알고리즘
        while (start_index < end_index){
            if (재료들[start_index] + 재료들[end_index] == 입력값){
                count++;
                start_index++;
                end_index--;
            }else if (재료들[start_index] + 재료들[end_index] < 입력값){
                start_index++;
            }else if (재료들[start_index] + 재료들[end_index] > 입력값){
                end_index--;
            }
        }
        System.out.println(count);
        br.close();
    }
}
