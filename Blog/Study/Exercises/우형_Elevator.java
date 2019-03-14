import java.util.HashSet;
class 우형_Elevator {
    static int solution(int[] A, int[] B, int M, int X, int Y) {
        HashSet<Integer> hs = new HashSet<>();
        int weight = 0;
        int stop = 0;

        for (int i = 0; i < X; i++) {
            weight += A[i];
            if (weight > Y) {
                weight = 0;
                i--;
                stop += hs.size() + 1;
                hs.clear();
                continue;
            }
            hs.add(B[i]);
        }
        stop += hs.size() + 1;
        return stop;
    }


    public static void main(String[] args) {
        int[] A = {40, 40, 100, 80, 20};
        int[] B = {3, 3, 2, 2, 3};
        int M = 3;
        int X = 5;
        int Y = 200;

        System.out.println(solution(A, B, M, X, Y));
    }
}

/*
클래스 솔루션 {public int solution (int [] A, int [] B, int M, int X, int Y); }
1.순서대로 몸무게 체크해서 Y 안넘게 태운다.
2.낮은 층수부터 내리게 한다. 다내리고 1층으로 복귀한다.
반복.

예를 들어, M = 3, X = 5, Y = 200 및 다음 배열을 사용하면 :

    A [0] = 40 B [0] = 3
    A [1] = 40 B [1] = 3
    A [2] = 100 B [2] = 2
    A [3] = 80 B [3] = 2
    A [4] = 20 B [4] = 3
이 함수는 엘리베이터가 2 단계로 이동함에 따라 6을 반환해야합니다.
처음 세 사람과 그 다음 나머지 두 사람과 함께 이동합니다. */

