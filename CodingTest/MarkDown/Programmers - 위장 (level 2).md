# TIL - CodingTest Practice 
### 2019.10.07 Mon

## Programmers - 위장 (level 2)

위장<br>
스파이들은 매일 다른 옷을 조합하여 입어 자신을 위장합니다.<br>

예를 들어 스파이가 가진 옷이 아래와 같고 오늘 스파이가 동그란 안경, 긴 코트, 파란색 티셔츠를 입었다면 다음날은 청바지를 추가로 입거나 동그란 안경 대신 검정 선글라스를 착용하거나 해야 합니다.<br>

|종류|	이름|
|---|---|
|얼굴	|동그란 안경, 검정 선글라스|
|상의	|파란색 티셔츠|
|하의	|청바지|
|겉옷	|긴 코트|

스파이가 가진 의상들이 담긴 2차원 배열 clothes가 주어질 때 서로 다른 옷의 조합의 수를 return 하도록 solution 함수를 작성해주세요.<br>

제한사항<br>
clothes의 각 행은 [의상의 이름, 의상의 종류]로 이루어져 있습니다.<br>
스파이가 가진 의상의 수는 1개 이상 30개 이하입니다.<br>
같은 이름을 가진 의상은 존재하지 않습니다.<br>
clothes의 모든 원소는 문자열로 이루어져 있습니다.<br>
모든 문자열의 길이는 1 이상 20 이하인 자연수이고 알파벳 소문자 또는 '_' 로만 이루어져 있습니다.<br>
스파이는 하루에 최소 한 개의 의상은 입습니다.<br><br>
입출력 예<br>

|clothes|	return|
|---|---|
|[[yellow_hat, headgear], [blue_sunglasses, eyewear], [green_turban, headgear]]	|5|
|[[crow_mask, face], [blue_sunglasses, face], [smoky_makeup, face]]|	3|


입출력 예 설명<br>
예제 #1<br>
headgear에 해당하는 의상이 yellowhat, greenturban이고 eyewear에 해당하는 의상이 blue_sunglasses이므로 아래와 같이 5개의 조합이 가능합니다.<br>

1. yellow_hat
2. blue_sunglasses
3. green_turban
4. yellow_hat + blue_sunglasses
5. green_turban + blue_sunglasses


예제 #2<br>
face에 해당하는 의상이 crowmask, bluesunglasses, smoky_makeup이므로 아래와 같이 3개의 조합이 가능합니다.

1. crow_mask
2. blue_sunglasses
3. smoky_makeup


```
import java.util.*;

/**
 * Created by kimdonghyun on 07/10/2019.
 */
public class Camouflage {
    public static void main(String[] args) {
        String[][] clothes ={{"yellow_hat", "headgear"}, {"blue_sunglasses","eyewear"}, {"green_turban","headgear"}};
        System.out.println(solution(clothes));
    }
    public static int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            if(!map.containsKey(clothes[i][1])){
                map.put(clothes[i][1], 1);
            }else{
                map.replace(clothes[i][1], map.get(clothes[i][1])+1);
            }
        }
        int answer = 1;
        for (int value : map.values())
            answer*=(value+1);
        answer-=1;
        return answer;
    }
}

```

## Code Review 
보자마자 map으로 key로 중복제거해서 넣고 value count만 나중에 뽑아서 계산하면 되겠다 라고 생각했다.<br>
해서 일단 HashMap으로 for문돌려서 if로 map에 해당 key가 있는지 없는지 검사후 없으면 value =1 로 넣고 있으면 replace해서 value를 +1 해준다. <br>
그리고 마지막에 (a의 value+1)*(b의 value+1)-1 으로 계산해서 return 한다. 