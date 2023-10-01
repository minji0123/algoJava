package codingTest.gabia;

public class Test {
    public static int countSquares(int n) {

        if (n < 2) {
            return 0;
        }
//        따라서 n이 3인 격자에서 서로 다른 네 점을 이어 만들 수 있는 정사각형 개수

        return ((n-1)*n*(n+1)*n)/12;
//        return squareCount / 2;  // 정사각형은 두 번 세어지므로 2로 나눠줍니다.
    }

    public static void main(String[] args) {
        int n = 3;  // 예를 들어 n = 3일 때
        int result = countSquares(n);
        System.out.println(n + " x " + n + " 그리드에서 만들 수 있는 정사각형 개수: " + result);
    }
}
/*
* 격자의 크기 n에서 서로 다른 네 점을 이어 만들 수 있는 정사각형 개수는 다음과 같이 구할 수 있습니다:

n x n 격자에서 한 정사각형의 모서리를 선택합니다. 이 격자의 오른쪽 상단 모서리라고 가정해 보겠습니다.

이제 오른쪽 상단 모서리에서 출발하여 가능한 모든 정사각형을 만들어 봅니다. 이때, 왼쪽 상단, 오른쪽 하단, 왼쪽 하단의 모서리를 선택하여 정사각형을 만들 수 있습니다.

정사각형을 만들 때마다 카운트를 증가시킵니다.

격자 전체를 탐색하면서 가능한 모든 정사각형을 세고, 그 총합을 구하면 됩니다.

격자의 크기 n에 따라서 정사각형 개수가 달라집니다. 그러나 일반적으로 이러한 정사각형 개수는 다음과 같이 계산할 수 있습니다:

정사각형 개수 = (n-1)^2 + (n-1)

예를 들어, n이 3인 경우:

정사각형 개수 = (3-1)^2 + (3-1) = 4 + 2 = 6

따라서 n이 3인 격자에서 서로 다른 네 점을 이어 만들 수 있는 정사각형 개수는 6개입니다.
* */