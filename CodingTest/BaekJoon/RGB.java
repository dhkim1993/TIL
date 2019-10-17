import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by kimdonghyun on 17/10/2019.
 */
public class RGB {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s;
        String[] sArr = new String[3];
        for (int i = 1; i <= n; i++) {
            s = br.readLine();
            sArr = s.split(" ");
        }
        for(String ss : sArr) System.out.println(ss);
    }
}
