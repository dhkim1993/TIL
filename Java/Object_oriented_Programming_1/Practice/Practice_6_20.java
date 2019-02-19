
public class Practice_6_20 {

    static int[] shuffle(int[] arr) {
        int result[] = {};
        for (int i = 0; i < arr.length; i++) {
            result[i] = (int) (Math.random() * arr.length) + 1;
            for (int j = 0; j <= i; j++) {
                if (result[j] == result[i]) {
                    i--;
                    continue;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}
