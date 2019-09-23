package Exercises_Package;

class Codility_5 {
    public static void main(String[] args) {
        int[] A = {0, 1, 3, -2, 0, 1, 0, -3, 2, 3};
        System.out.println(">>" + solution(A));
    }

    public static int solution(int A[]) {
        if (A.length < 1) {
            return 0;
        }

        int inflection = 0;
        int max = 0;
        int descent = 0;
        boolean ascending = true;

        for (int i = 1; i < A.length; i++) {
            boolean goingup = A[i] == A[i - 1] ? ascending : A[i] >= A[i - 1];
            if (goingup != ascending) {
                ascending = goingup;
                descent = ascending ? (A[inflection] - A[i - 1]) : 0;
                inflection = i - 1;
            }

            max = Math.max(max, Math.min(descent, A[i] - A[inflection]));
        }
        return max;
    }
}
/*
A[0] =  0
  A[1] =  1
  A[2] =  3
  A[3] = -2
  A[4] =  0
  A[5] =  1
  A[6] =  0
  A[7] = -3
  A[8] =  2
  A[9] =  3
 */