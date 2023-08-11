package search;

import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearch {

    public int SeqSearch(ArrayList<Integer> arr, int key){

        for (int i = 0; i<arr.size();i++){
            if (arr.get(i) == key){
//                System.out.println(arr.get(i)+" "+ i);
                return i;
            }
        }
        return -1;
    }

    public void LinerSearch1(int key){
        ArrayList<Integer> arr = new ArrayList();
        arr.add(10);arr.add(20);arr.add(3);arr.add(40);arr.add(50);
        int result = SeqSearch(arr,key);
        if (result != -1) {
            System.out.println("요소 " + key + "는 배열의 인덱스 " + result + " 에 있습니다.");
        } else {
            System.out.println("요소 " + key + "는 배열에 존재하지 않습니다.");
        }

    }

    public static void main(String[] args) {
        LinearSearch linearsearch = new LinearSearch();
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        linearsearch.LinerSearch1(key);
        sc.close();
    }



}
