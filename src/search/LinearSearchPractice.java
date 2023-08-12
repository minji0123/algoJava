package search;

import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearchPractice {

    public int 인덱스알려줌(ArrayList<Integer> 배열, int 찾을값){

        // 배열 길이만큼 포문을 돌면서 찾을값이 나오면 배열 인덱스 출력
        for (int i=0;i<배열.size();i++){
            if(찾을값 == 배열.get(i)){
                return i;
            }
        }
        return -1;
    }

    public void 선형검색(int 찾을값){

        ArrayList<Integer> 배열 = new ArrayList<>();
        배열.add(1);배열.add(2);배열.add(4);배열.add(8);배열.add(16);배열.add(32);

        int 결과 = 인덱스알려줌(배열,찾을값);
        // 1이면 찾은거
        if(결과 != -1){
            System.out.println(결과+"에 있음");
        }else{
            System.out.println("없음");
        }
        // -1이면 못찾은거

    }

    public static void main(String[] args) {
        LinearSearchPractice linearsearch = new LinearSearchPractice();
        
        Scanner 콘솔입력 = new Scanner(System.in);
        int 찾을값 = 콘솔입력.nextInt();
        linearsearch.선형검색(찾을값);

    }



}
