import java.util.Scanner;
public class Back_2385_Secret_Sharing {
    static String[] getShare() {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] sArr = new String[n];
        int[] iArr = new int[n];
        int[] zeroNum = new int[n];
        int zeroCnt = 0;

        for (int i = 0; i < n; i++) {
            sArr[i] = input.next();
            String[] Length = sArr[i].split("");
            if(Length.length>5){
                String str="INVALID";
                System.out.println(str);
                System.exit(0);
            }

            if (sArr[i].equals("0") || sArr[i].equals("00") || sArr[i].equals("000") || sArr[i].equals("0000") || sArr[i].equals("00000")) {
                zeroCnt++;
            } else {

                if (Integer.parseInt(sArr[i]) / 10000 != 0) {
                    zeroNum[i] = 1;
                    continue;
                }

                if (Integer.parseInt(sArr[i]) / 1000 != 0) {
                    iArr[i] = Integer.parseInt(sArr[i]) * 10;
                    sArr[i] = Integer.toString(iArr[i]);
                    zeroNum[i] = 10;
                    continue;
                }
                if (Integer.parseInt(sArr[i]) / 100 != 0) {
                    iArr[i] = Integer.parseInt(sArr[i]) * 100;
                    sArr[i] = Integer.toString(iArr[i]);
                    zeroNum[i] = 100;
                    continue;
                }
                if (Integer.parseInt(sArr[i]) / 10 != 0) {
                    iArr[i] = Integer.parseInt(sArr[i]) * 1000;
                    sArr[i] = Integer.toString(iArr[i]);
                    zeroNum[i] = 1000;
                    continue;
                }
                if (Integer.parseInt(sArr[i]) < 10) {
                    iArr[i] = Integer.parseInt(sArr[i]) * 10000;
                    sArr[i] = Integer.toString(iArr[i]);
                    zeroNum[i] = 10000;
                    continue;
                }
            }
        }
        if (zeroCnt == sArr.length) {
            String str="INVALID";
            System.out.println(str);
            System.exit(0);
        }
        return setShare(sArr, zeroNum);
    }

    static String[] setShare(String[] sArr, int[] zeroNum) {

        String temp;
        int temp2;
        for (int i = 0; i < sArr.length - 1; i++) {
            for (int j = 1 + i; j <= sArr.length - 1; j++) {
                if (Integer.parseInt(sArr[i]) > Integer.parseInt(sArr[j])) {
                    temp = sArr[i];
                    sArr[i] = sArr[j];
                    sArr[j] = temp;
                    temp2 = zeroNum[i];
                    zeroNum[i] = zeroNum[j];
                    zeroNum[j] = temp2;
                }
            }
        }
        int iArr[] = new int[sArr.length];
        for (int k = 0; k < sArr.length; k++) {
            if (sArr[k].equals("0") || sArr[k].equals("00") || sArr[k].equals("000") || sArr[k].equals("0000") || sArr[k].equals("00000")) {
                continue;
            }
            iArr[k] = Integer.parseInt(sArr[k]) / zeroNum[k];
            sArr[k] = Integer.toString(iArr[k]);
        }

        for (int a = 1; a < sArr.length; a++) {
            if (sArr[0].equals("0") || sArr[0].equals("00") || sArr[0].equals("000") || sArr[0].equals("0000") || sArr[0].equals("00000") && !sArr[a].equals("0")) {
                temp = sArr[0];
                sArr[0] = sArr[a];
                sArr[a] = temp;
            } else
                continue;
        }

        return sArr;
    }

    public static void main(String[] args) {
        String[] result = getShare();
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }
} //class end.


