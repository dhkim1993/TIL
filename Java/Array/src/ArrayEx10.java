public class ArrayEx10 {
    public static void main(String[] args) {

        int[] numArr = new int[10];
        int i, j, k;
        int temp = 0;
        boolean changed;

        for (i = 0; i < numArr.length; i++) {
            System.out.print((numArr[i] = (int) (Math.random() * 10))); // 0~9 사이 랜덤값을 배열에 넣는다.
        }
        System.out.println();

        for (i = 0; i < numArr.length - 1; i++) {
            changed = false;
            for (j = 0; j < numArr.length - 1 - i; j++) {
                if (numArr[j] > numArr[j + 1]) {               //버블정렬을 이용한 코드이다.
                    temp = numArr[j];                           // 돌리는 횟수는 한번돌떄마다 맨끝 숫자가 정렬이 되기떄문에 -i가 붙어서
                    numArr[j] = numArr[j + 1];                  //돌떄마다 1번씩 더 돌필요가 없어지기떄문에 -i가 붙었다.
                    numArr[j + 1] = temp;
                    changed = true;                     //changed는 자리바꿈을 뜻하는 변수이다. true면 바뀌었다는 표시로 만든것.
                }
            } //end for j

            if (!changed) break;    //자리바꿈이없다는건 정렬완료라는것.

            for (k = 0; k < numArr.length; k++) {
                System.out.print(numArr[k]);            //배열출력
            }
            System.out.println();
        } //end for i
    }
}
/*
8686207931
6862078319
6620783189
6206731889
2066317889
0263167889
0231667889
0213667889
0123667889
 */