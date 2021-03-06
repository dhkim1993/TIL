import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by kimdonghyun on 25/09/2019.
 */
public class CustomString {
    public static void main(String[] args) {
        String[] strings = {"tcv", "yyye", "tcv", "qaz"};
        int n = 2;
        CustomString customString = new CustomString();
        String[] result = customString.solution(strings, n);
        for(String s : result) System.out.print(s+" ");
    }
    public String[] solution(String[] strings, int n){
        Arrays.sort(strings, (s1, s2) -> {
            if(s1.charAt(n) > s2.charAt(n)) return 1;
            else if(s1.charAt(n) < s2.charAt(n)) return 0;
            else if(s1.charAt(n) == s2.charAt(n)) return s1.compareTo(s2);
            else return 0;
        });
        return strings;
    }


}
