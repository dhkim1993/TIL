import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by kimdonghyun on 25/09/2019.
 */
public class pyCount_1 {
    public static void main(String[] args) {
        String s = "pyPPyY";
        System.out.println(solution(s));

    }
    static boolean solution(String s){
        String p = s.toUpperCase();
        String y = s.toLowerCase();
        String strP = p.replaceAll("P", "");
        String strY = y.replaceAll("y", "");
        if(strP.length() == strY.length()) return true;
        return false;
    }
}
