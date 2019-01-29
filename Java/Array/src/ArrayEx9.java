import java.util.*;

public class ArrayEx9 {
    public static void main(String[] args) {

        int[] code = {-4, -1, 3, 6, 11};
        int[] arr = new int[10];
        int i, tmp = 0;

        for (i = 0; i < arr.length; i++) {
            tmp = (int) (Math.random() * code.length); // 0~4
            arr[i] = code[tmp];
        }

        System.out.println(Arrays.toString(arr));
    }
}
/*
[3, 11, -1, 3, 3, -1, -4, 6, 3, -1]
 */