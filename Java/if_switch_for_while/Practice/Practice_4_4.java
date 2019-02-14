/*
[4-4] 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.<br><br>
 */
public class Practice_4_4 {
    public static void main(String[] args) {

        int sum=0, sum2=0;
        int i = 1;

        while (true) {
            if (i % 2 == 0) {
                sum += i;
            } else {
                sum2 -= i;
            }
            i++;
            if (sum + sum2 >= 100)
                break;
        }
        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(i);
    }
}
/*
10100
-10000
201
 */
