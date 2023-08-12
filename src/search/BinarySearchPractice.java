package search;

public class BinarySearchPractice {

    // 이진 검색 메서드
    public static int binarySearch(int[] arr, int 찾을값) {
        
        // 1. 맨앞 맨끝
        int 맨앞위치 = 0;
        int 맨끝위치 = arr.length-1;

        // 2. while
        while(맨앞위치 <= 맨끝위치){
            int 중간위치 = 맨앞위치 + (맨끝위치 -맨앞위치)/2;

            // 위치 vs
            if(arr[중간위치]==찾을값){
                return 중간위치;
            }else if(arr[중간위치] < 찾을값){
                맨앞위치 = 중간위치+1;
            }else{
                맨끝위치 = 중간위치-1;
            }
        }

        return -1; // 찾지 못한 경우 -1

    }

    public static void main(String[] args) {
        

    }
    
}
