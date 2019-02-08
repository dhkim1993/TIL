public class StaticBlockTest {
    static int[] arr = new int[10];

    static {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10) + 1;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] :" + arr[i]);
        }
    }
}
/*
arr[0] :6
arr[1] :5
arr[2] :7
arr[3] :6
arr[4] :3
arr[5] :7
arr[6] :7
arr[7] :2
arr[8] :3
arr[9] :5
 */