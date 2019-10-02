/**
 * Created by kimdonghyun on 02/10/2019.
 */
public class Top {
    public static void main(String[] args) {
        int[] heights = {1,5,3,6,7,6,5};

        System.out.println(solution(heights));
    }
    static int[] solution(int[] heights){
        int[] answer = new int[heights.length];
        for (int i = heights.length - 1; i >= 1; i--) {
            loop2:for (int j = i - 1; j >= 0; j--) {
                if (heights[i] < heights[j]) {
                    answer[i] = j + 1;
                    break loop2;
                }
            }
        }
        return answer;
    }
}
