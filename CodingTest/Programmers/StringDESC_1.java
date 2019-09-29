import java.util.Arrays;

/**
 * Created by kimdonghyun on 25/09/2019.
 */
public class StringDESC_1 {
    public static void main(String[] args) {
        String s = "Zbcdefg";
        StringDESC_1 stringDESC1 = new StringDESC_1();
        System.out.println(stringDESC1.solution(s));
    }
    public String solution(String s){
        String answer ="";
        char[] cArr = s.toCharArray();
        Arrays.sort(cArr);
        //리버스로 tostring해서 리턴 할 수 도 있구나..
        //return new StringBuilder(new String(sol)).reverse().toString();

        for (int i = cArr.length-1; i >=0; i--) {
            answer += cArr[i];
        }
        return answer;
    }
}
