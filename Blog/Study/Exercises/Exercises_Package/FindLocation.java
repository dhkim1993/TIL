/**
 * Created by kimdonghyun on 21/09/2019.
*/
public class FindLocation {
    public static void main(String[] args) {
        int[][] v = {{1,1},{3,1},{3,10}};
        System.out.println(solution(v));
    }

    static int[] solution(int[][] v){
        int[] answer = new int[2];
        answer[0] =  v[0][0]^v[1][0]^v[2][0];
        answer[1] = v[0][1]^v[1][1];
        System.out.println(answer[0]);
        System.out.println(answer[1]);
        return answer;
    }
}
