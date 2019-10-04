# TIL - CodingTest Practice 
### 2019.10.04 Fri

## Programmers - 탐욕법(Greedy) 조이스틱 (level 2)



```

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

```

## Code Review
오늘 푼 문제에서 중점은 2가지 이다.<br>
1. 알파벳중 중간인 M 보다 큰지 작은지를 판단하여 조이스틱 up,down 
cnt를 정하기<br>
2. 첫번째 글자를 탐색후 이후 탐색을 왼쪽으로 할지 오른쪽으로 할지 정해야한다.<br><br>

일단 String 인 name을 char[] 로 변환해주고 첫글자는 cnt횟수를 체크한다. <br>
이후 DirectionCheck() 방향체크 라는 메소드를 실행시켜 첫번째 글자 기준으로 왼쪽, 오른쪽으로 ‘A’가 아닌 숫자를 찾아 탐색하여 <br>그 칸 이동 횟수만큼 leftCnt , rightCnt 로 값을 저장한다.<br> 
두개를 삼항연산자로 비교해 더 작은 쪽으로 방향이 결정되며 left : -1 right : 1 로 return 해서 <br>
방향별로 for문을 나눠서 맞는 for문을 돌면서 문자의 크기에 따라 cnt값을 계산해서 return 하게 만들었다.<br>
코드제출을 해봤는데 테스트케이스 11번은 이상하게 오류가 나서 통과를 못한다. <br>
다른분들도 그런거같던데 어떤 테스트 케이스인지 잘 모르겠다..