package search;

import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearch {

    public int 인덱스알려줌(ArrayList<Integer> 배열, int 찾을값){

        for (int i = 0; i<배열.size();i++){
            if (배열.get(i) == 찾을값){
                return i;
            }
        }
        return -1;
    }

    public void 선형검색(int 찾을값){
        
        ArrayList<Integer> 배열 = new ArrayList();
        배열.add(10);배열.add(20);배열.add(3);배열.add(40);배열.add(50);
        int 결과 = 인덱스알려줌(배열,찾을값);
        
        if (결과 != -1) {
            System.out.println( 찾을값 + "는 배열의 인덱스 " + 결과 + " 에 있습니다.");
        } else {
            System.out.println( 찾을값 + "는 배열에 존재하지 않습니다.");
        }

    }

    public static void main(String[] args) {
        LinearSearch linearsearch = new LinearSearch();
        
        Scanner 콘솔입력 = new Scanner(System.in);
        int 찾을값 = 콘솔입력.nextInt();

        linearsearch.선형검색(찾을값);
        콘솔입력.close();
    }

}
