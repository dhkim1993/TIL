# TIL - CodingTest Practice 
### 2019.10.13 Sun

## Programmers - H-INDEX (level 2)

문제 설명<br>
H-Index는 과학자의 생산성과 영향력을 나타내는 지표입니다. 어느 과학자의 H-Index를 나타내는 값인 h를 구하려고 합니다. 위키백과1에 따르면, H-Index는 다음과 같이 구합니다.<br>

어떤 과학자가 발표한 논문 n편 중, h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하 인용되었다면 h가 이 과학자의 H-Index입니다.<br>

어떤 과학자가 발표한 논문의 인용 횟수를 담은 배열 citations가 매개변수로 주어질 때, 이 과학자의 H-Index를 return 하도록 solution 함수를 작성해주세요.<br>

제한사항<br>
과학자가 발표한 논문의 수는 1편 이상 1,000편 이하입니다.<br>
논문별 인용 횟수는 0회 이상 10,000회 이하입니다.<br><br>
입출력 예<br>

|citations	|return|
|---|---|
|[3, 0, 6, 1, 5]|	3|

입출력 예 설명<br>
이 과학자가 발표한 논문의 수는 5편이고, 그중 3편의 논문은 3회 이상 인용되었습니다. 그리고 나머지 2편의 논문은 3회 이하 인용되었기 때문에 이 과학자의 H-Index는 3입니다.<br>


```
import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            if (citations.length-i <= citations[i]) {
                answer = citations.length-i;
                break;
            }
        }
        return answer;
    }
}

```

## Code Review

처음엔 중간 값을 구해서 그 값을 비교해서 ++,-- 해서 비교할려고 했지만 잘 안되서 그냥 처음부터 값을 올리면서 비교하는 방법을 선택했다.

“나머지 논문이 h번 이하 인용” 이 조건을 만족시키면 break; 

