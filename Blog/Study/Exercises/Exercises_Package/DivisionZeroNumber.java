package Exercises_Package;
import java.util.Arrays;
/**
 * Created by kimdonghyun on 23/09/2019.
 */
public class DivisionZeroNumber {
    public int[] divisible(int[] array, int divisor) {
        //ret에 array에 포함된 정수중, divisor로 나누어 떨어지는 숫자를 순서대로 넣으세요.
        return Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray();
    }
    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        DivisionZeroNumber div = new DivisionZeroNumber();
        int[] array = {5, 9, 7, 10};
        System.out.println( Arrays.toString( div.divisible(array, 5) ));
    }
}
