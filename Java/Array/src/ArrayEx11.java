public class ArrayEx11 {
    public static void main(String[] args) {

        int numArr[] = new int[10];
        int[] counter = new int[10];
        int i;

        for (i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random() * 10);
            System.out.print(numArr[i]);
        }

        System.out.println();

        for (i = 0; i < numArr.length; i++) {
            counter[numArr[i]]++;                   // 인덱스 갑을 증가시킨다.
        }
        for (i = 0; i < numArr.length; i++) {
            System.out.println(i + "의 개수 : " + counter[i]);
        }
    }
}
