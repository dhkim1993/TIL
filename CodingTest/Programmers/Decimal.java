/**
 * Created by kimdonghyun on 25/09/2019.
 */
public class Decimal {
    public static void main(String[] args) {
        int n=10;
        Decimal decimal =new Decimal();
        System.out.println(decimal.solution(n));
    }
    public int solution(int n){
        int result =0;

        for (int j=2; j<=n; j++){
            if(j%2==0) continue;
            else if(j%3==0) continue;
            else if(j%5==0) continue;
            else result++;
        }
        return result;
    }

}
