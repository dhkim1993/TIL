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
        for (int i = 0; i < iArr.length; i++)
            System.out.print(iArr[i] + " ");
        return iArr;
    }
}

class LineUp {
    public int[] lineUp(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] < iArr[i + 1]) {
                int temp = iArr[i];
                iArr[i] = iArr[i + 1];
                iArr[i + 1] = temp;
            }
        }
        for (int i = 0; i < iArr.length; i++)
            System.out.print(iArr[i] + " ");
        return iArr;
    }
}

public class Line_Up_Array {
    public static void main(String[] args) {

        GetArray g = new GetArray();
        SetArray s = new SetArray();
        LineUp l = new LineUp();
        try {
            System.out.print(l.lineUp(s.setArray(g.getArray())));
        } catch (Exception e) {
        }
    }
}
