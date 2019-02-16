import java.util.*;

class GetArray {
    public static int[] getArray() {

        Scanner input = new Scanner(System.in);

        System.out.print("입력하실 숫자 갯수와 1~9999 사이 숫자를 입력하세요 : ");
        int iHowMany = input.nextInt();
        int iArr[] = new int[iHowMany];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = input.nextInt();
        }

        return iArr;
    }
}

class SetArray {
    public static int[] setArray(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] / 1000 != 0) {
                iArr[i] = (iArr[i] * 10000) / 10 / 10 / 10 / 10;
                continue;
            } else if (iArr[i] / 100 != 0) {
                iArr[i] = (iArr[i] * 10000) / 10 / 10 / 10;
                continue;
            } else if (iArr[i] / 10 != 0) {
                iArr[i] = (iArr[i] * 10000) / 10 / 10;
                continue;
            } else {
                iArr[i] = (iArr[i] * 10000) / 10;
                continue;
            }
        }
        return iArr;
    }
}

class LineUp {
    public static int[] lineUp(int[] iArr) {
        for (int i = 0; i < iArr.length - 1; i++) {
            for (int j = i + 1; j < iArr.length; j++) {
                if (iArr[i] < iArr[j]) {
                    int temp = iArr[i];
                    iArr[i] = iArr[j];
                    iArr[j] = temp;
                }
            }
        }
        return iArr;
    }
}

public class Line_Up_Array {
    public static void main(String[] args) {

        GetArray g = new GetArray();
        SetArray s = new SetArray();
        LineUp l = new LineUp();
        int[] result = {};

        try {
            result = (l.lineUp(s.setArray(g.getArray())));
        } catch (Exception e) {
        }

        System.out.println();

        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");
    }
}
/*
iArr
 */