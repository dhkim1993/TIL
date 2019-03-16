package Exercises_Package;

import java.util.Arrays;

class Programmers_저울 {
    static int solution(int[] weight) {
        Arrays.sort(weight);
        int k = 1;
        int num = 0;

        while (true) {
            num = k;
            for (int i = weight.length - 1; i >= 0; i--) {
                if (num - weight[i] >= 0) {
                    num -= weight[i];
                }
            }
            if (num > 0) {
                break;
            }
            k++;
        }
        return k;
    }

    public static void main(String[] args) {
        int[] weight = {3, 1, 6, 2, 7, 30, 1};
        System.out.println(solution(weight));
    }
}



