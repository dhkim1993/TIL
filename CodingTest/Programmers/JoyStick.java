
/**
 * Created by kimdonghyun on 03/10/2019.
 */
public class JoyStick {
    public static void main(String[] args) {
        String name="AAABAAAA";
        System.out.println(new JoyStick().solution(name));
    }
    public int solution(String name){
        char[] cArr = name.toCharArray();
        int moveCnt = cArr[0] < 78 ? cArr[0]-65 : 91-65-(cArr[0]-65);

        int[] iArr  = DirectionCheck(cArr,name);
        int direction = iArr[0], leftCnt =iArr[1], rightCnt =iArr[2];

        if(direction == -1){
            for (int l = name.length()-1; l >rightCnt; l--) {
                moveCnt +=1;
                moveCnt += cArr[l] < 78 ? cArr[l]-65 : 91-cArr[l];
            }
        }else{
            for (int r = 1; r <cArr.length-leftCnt; r++) {
                moveCnt+=1;
                moveCnt += cArr[r] < 78 ? cArr[r]-65 : 91-cArr[r];
            }
        }
        return moveCnt;
    }

    public int[] DirectionCheck(char[] cArr, String name){
        int leftCnt =0, rightCnt=0;
        for (int left = name.length()-1; left >=0; left--) {
            if(cArr[left] == 'A') leftCnt++;
            else break;
        }
        for (int right= 1; right < name.length(); right++) {
            if(cArr[right] == 'A') rightCnt++;
            else break;
        }
        int direction = leftCnt < rightCnt ? -1 : 1;
        int[] iArr = {direction,leftCnt,rightCnt};
        return iArr;
    }
}
