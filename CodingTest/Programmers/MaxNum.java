import java.util.*;

/**
 * Created by kimdonghyun on 02/10/2019.
 */
public class MaxNum {
    public static void main(String[] args) {
        int[] numbers = {9, 30, 34, 5, 3};
        System.out.println(solution(numbers));
    }
    public static String solution(int[] numbers) {
        String[] sArr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            sArr[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(sArr, (o1, o2) -> (o2+o1).compareTo(o1+o2));
        if(sArr[0].equals("0")) return "0";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sArr.length; i++)
            sb.append(sArr[i]);
        return sb.toString();
    }
}
