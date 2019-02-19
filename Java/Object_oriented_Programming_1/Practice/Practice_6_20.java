
public class Practice_6_20 {

    static int[] shuffle(int[] arr) {

        int r;
        int w = 0;
        int tmp;
        while (w < arr.length) {
            r = (int) (Math.random() * arr.length) + 1;
            if (w != r) {
                tmp = arr[w];
                arr[w] = arr[r];
                arr[r] = tmp;
                w++;
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
/*
[1, 2, 3, 4, 5, 6, 7, 8, 9]
[3, 9, 6, 7, 4, 8, 1, 5, 2]
 */