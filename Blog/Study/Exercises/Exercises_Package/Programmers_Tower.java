package Exercises_Package;
public class Programmers_Tower {

    public static void main(String[] args) {
        int heights[] = {3, 9, 9, 3, 5, 7, 2};
        System.out.println(solution(heights));
    }

    static int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        for (int i = heights.length - 1; i >= 1; i--) {
            loop2:
            for (int j = i - 1; j >= 0; j--) {
                if (heights[i] < heights[j]) {
                    answer[i] = j + 1;
                    break loop2;
                }
            }
        }
        return answer;
    }
}

