# TIL - CodingTest Practice 
### 2019.10.06 Sun

## Programmers - 더 맵게 (level 2)

더 맵게
매운 것을 좋아하는 Leo는 모든 음식의 스코빌 지수를 K 이상으로 만들고 싶습니다. 모든 음식의 스코빌 지수를 K 이상으로 만들기 위해 Leo는 스코빌 지수가 가장 낮은 두 개의 음식을 아래와 같이 특별한 방법으로 섞어 새로운 음식을 만듭니다.

섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
Leo는 모든 음식의 스코빌 지수가 K 이상이 될 때까지 반복하여 섞습니다.
Leo가 가진 음식의 스코빌 지수를 담은 배열 scoville과 원하는 스코빌 지수 K가 주어질 때, 모든 음식의 스코빌 지수를 K 이상으로 만들기 위해 섞어야 하는 최소 횟수를 return 하도록 solution 함수를 작성해주세요.<br>

제한 사항<br>
scoville의 길이는 1 이상 1,000,000 이하입니다.<br>
K는 0 이상 1,000,000,000 이하입니다.<br>
scoville의 원소는 각각 0 이상 1,000,000 이하입니다.<br>
모든 음식의 스코빌 지수를 K 이상으로 만들 수 없는 경우에는 -1을 return 합니다.<br>
입출력 예<br>

|scoville|	K|	return|
|---|---|---|
|[1, 2, 3, 9, 10, 12]|	7|	2|


입출력 예 설명<br>
스코빌 지수가 1인 음식과 2인 음식을 섞으면 음식의 스코빌 지수가 아래와 같이 됩니다.<br>
새로운 음식의 스코빌 지수 = 1 + (2 * 2) = 5<br>
가진 음식의 스코빌 지수 = [5, 3, 9, 10, 12]<br>

스코빌 지수가 3인 음식과 5인 음식을 섞으면 음식의 스코빌 지수가 아래와 같이 됩니다.<br>
새로운 음식의 스코빌 지수 = 3 + (5 * 2) = 13<br>
가진 음식의 스코빌 지수 = [13, 9, 10, 12]<br>

모든 음식의 스코빌 지수가 7 이상이 되었고 이때 섞은 횟수는 2회입니다.

```
import java.util.PriorityQueue;

/**
 * Created by kimdonghyun on 06/10/2019.
 */
public class MoreHot {
    public static void main(String[] args) {
        int[]scoville = {1, 2, 3, 9, 10, 12};
        int K=7;
        System.out.println(new MoreHot().solution(scoville,K));
    }
    public int solution(int[] scoville, int K) {

        PriorityQueue<Integer> pq = new PriorityQueue();
        int mixCnt = 0;
        for (int aScoville : scoville) pq.offer(aScoville);
        while (pq.peek() < K) {
            if (pq.size() == 1) {
                return -1;
            }
            int a = pq.poll();
            int b = pq.poll();
            pq.offer(a + (b * 2));
            mixCnt ++;
        }
        return mixCnt;
    }
}


```

## Code Review

검색해보니 PriorityQueue(우선순위 큐) 라는걸 알게됬다.<br>
우선순위를 결정하여 들어온 순서와 상관없이 내보내는 큐 이다.<br>
offer를 하면 자동으로 오름차순 정렬이 된다.<br>
해서 위 문제에선 가장 작은 값 2개를 추출해서 연산후 다시 배열에 넣고 K값보다 <= 까지 연산반복을 해야한다.<br>
그럼 정렬후 2개를 poll() 해서 연산후 offer()만 해주면 끝이다.<br>
이렇게 간편한 큐가 있는지 이제야 알다니.. 더빡공해야겠다...
