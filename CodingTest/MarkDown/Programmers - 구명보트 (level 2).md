# TIL - CodingTest Practice 
### 2019.10.08 Tue

## Programmers - 구명보트 (level 2)

구명보트<br>
무인도에 갇힌 사람들을 구명보트를 이용하여 구출하려고 합니다.구명보트는 작아서 한 번에 최대 2명씩 밖에 탈 수 없고, 무게 제한도 있습니다.<br>

예를 들어, 사람들의 몸무게가 [70kg, 50kg, 80kg, 50kg]이고 구명보트의 무게 제한이 100kg이라면 2번째 사람과 4번째 사람은 같이 탈 수 있지만 1번째 사람과 3번째 사람의 무게의 합은 150kg이므로 구명보트의 무게 제한을 초과하여 같이 탈 수 없습니다.<br>

구명보트를 최대한 적게 사용하여 모든 사람을 구출하려고 합니다.<br>

사람들의 몸무게를 담은 배열 people과 구명보트의 무게 제한 limit가 매개변수로 주어질 때, 모든 사람을 구출하기 위해 필요한 구명보트 개수의 최솟값을 return 하도록 solution 함수를 작성해주세요.<br>

제한사항<br>
무인도에 갇힌 사람은 1명 이상 50,000명 이하입니다.<br>
각 사람의 몸무게는 40kg 이상 240kg 이하입니다.<br>
구명보트의 무게 제한은 40kg 이상 240kg 이하입니다.<br>
구명보트의 무게 제한은 항상 사람들의 몸무게 중 최댓값보다 크게 주어지므로 사람들을 구출할 수 없는 경우는 없습니다.<br><br>
입출력 예<br>


|people|	limit|	return|
|---|---|---|
|[70, 50, 80, 50]	|100	|3|
|[70, 80, 50]|	100|	3|


```
import java.util.*;

/**
 * Created by kimdonghyun on 07/10/2019.
 */
public class LifeBoat {
    public static void main(String[] args) {
        int[] people = {70, 50, 80, 50};
        int limit = 100;
        System.out.println(solution(people,limit));
    }
    static int solution(int[] people, int limit){
        Arrays.sort(people);
        int j=people.length-1, cnt=0;
        for (int i = 0; i <= j; i++) {
            if(people[i]+people[j] <= limit){
                j--; cnt++;
            }else{
                i--; j--; cnt++;
            }
        }
        return cnt;
    }
}

```

## Code Review 
처음에 문제 풀다가 좀 안풀리길래 문제를 다시 한번 읽어봤더니....<br>
무조건 2명씩 탈 수 있다는 조건을 봤다....
그럼 그냥 sort 정렬하고 제일 무거운사람이랑 가벼운 사람씩 태워서 보내면되고, <br>
제일 무거운 사람 + 제일 가벼운 사람 <= limit 해서 false이면 무거운 사람 혼자 태워 보낸다고 생각하면 쉽게 풀릴꺼같았다.
### point 
1. 2명씩 탈 수 있다.
2. 최대값과 최솟값을 더해 limit와 비교한다.
3. false이면 최솟값은 index +1 하지않고 그대로고 최댓값만 index -1 을 해준다.