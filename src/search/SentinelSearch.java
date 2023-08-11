package search;

import java.util.Scanner;

public class SentinelSearch {


    // 선형 검색 함수 (보초법 활용)
//    public static int sentinelMethod(int[] arr, int key) {
    public int sentinelMethod(int[] arr, int key) {
        int n = arr.length;

        // 보초값 설정
        int lastElement = arr[n - 1];
        arr[n - 1] = key;

        int i = 0;
        while (arr[i] != key) {
            i++;
        }

        // 보초값 원래 값으로 되돌리기
        arr[n - 1] = lastElement;

        if (i < n - 1 || arr[n - 1] == key) {
            return i; // 찾은 경우 해당 인덱스를 반환
        } else {
            return -1; // 찾지 못한 경우 -1을 반환
        }
    }


    public static void main(String[] args) {
        SentinelSearch SM = new SentinelSearch();

        int[] array = {10, 25, 30, 15, 40, 50, 20};
        Scanner sc = new Scanner(System.in);
//        int key = sc.nextInt();
        int key = 30;

        int result = SM.sentinelMethod(array, key);

        if (result != -1) {
            System.out.println("요소 " + key + "는 배열의 인덱스 " + result + "에 있습니다.");
        } else {
            System.out.println("요소 " + key + "는 배열에 존재하지 않습니다.");
        }
    }


}
