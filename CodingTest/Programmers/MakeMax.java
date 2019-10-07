
/**
 * Created by kimdonghyun on 04/10/2019.
 */
public class MakeMax {
    public static void main(String[] args) {
        String number = "4177252841";
        int k = 4;
        System.out.println(new MakeMax().solution(number, k));
    }
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        char max;
        for (int i = 0; i < number.length() - k; i++) {
            max = '0';
            for (int j = idx; j <= i + k; j++) {
                if (max < number.charAt(j)) {
                    max = number.charAt(j);
                    idx = j + 1;
                }
            }
            sb.append(max);
        }
        return sb.toString();
    }
}
