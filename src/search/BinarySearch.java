package search;

public class BinarySearch {

    // 이진 검색 메서드
    public static int binarySearch(int[] arr, int 찾을값) {
        
        // 검색범위 맨 앞 인덱스
        int 맨앞 = 0;
        // 검색범위 맨 끝 인덱스
        int 맨끝 = arr.length - 1;


        while (맨앞 <= 맨끝) {
            // 검색범위 중간 인덱스
            int mid = 맨앞 + (맨끝 - 맨앞) / 2;

            // 중간 인덱스 VS 찾을값
            if (arr[mid] == 찾을값) {
                // 찾았을 때 : 찾은 값 인덱스 출력
                return mid;
            } else if (arr[mid] < 찾을값) {
                // 찾을값이 중간 값보다 크다면 큰쪽(오른쪽) 고려
                맨앞 = mid + 1;
            } else {
                // 찾을값이 중간 값보다 작다면 작은쪽(왼쪽) 고려
                맨끝 = mid - 1;
            }
        }

        return -1; // 찾지 못한 경우 -1
    }

    public static void main(String[] args) {
        
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int 찾을값 = 11;

        int resultIndex = binarySearch(sortedArray, 찾을값);

        if (resultIndex != -1) {
            System.out.println("->"+찾을값 + "<- 인덱스 " + resultIndex + " 에 위치합니다.");
        } else {
            System.out.println(찾을값 + "<- 찾을 수 없습니다.");
        }
    }
    
}
