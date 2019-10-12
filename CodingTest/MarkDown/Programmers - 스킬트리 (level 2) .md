# TIL - CodingTest Practice 
### 2019.10.11 Fri

## Programmers - 스킬트리 (level 2)

스킬트리<br>
선행 스킬이란 어떤 스킬을 배우기 전에 먼저 배워야 하는 스킬을 뜻합니다.<br>

예를 들어 선행 스킬 순서가 스파크 → 라이트닝 볼트 → 썬더일때, 썬더를 배우려면 먼저 라이트닝 볼트를 배워야 하고, 라이트닝 볼트를 배우려면 먼저 스파크를 배워야 합니다.<br>

위 순서에 없는 다른 스킬(힐링 등)은 순서에 상관없이 배울 수 있습니다. 따라서 스파크 → 힐링 → 라이트닝 볼트 → 썬더와 같은 스킬트리는 가능하지만, 썬더 → 스파크나 라이트닝 볼트 → 스파크 → 힐링 → 썬더와 같은 스킬트리는 불가능합니다.<br>

선행 스킬 순서 skill과 유저들이 만든 스킬트리1를 담은 배열<br> skill_trees가 매개변수로 주어질 때, 가능한 스킬트리 개수를 return 하는 solution 함수를 작성해주세요.<br>

제한 조건<br>
스킬은 알파벳 대문자로 표기하며, 모든 문자열은 알파벳 대문자로만 이루어져 있습니다.<br>
스킬 순서와 스킬트리는 문자열로 표기합니다.<br>
예를 들어, C → B → D 라면 CBD로 표기합니다<br>
선행 스킬 순서 skill의 길이는 1 이상 26 이하이며, 스킬은 중복해 주어지지 않습니다.<br>
skill_trees는 길이 1 이상 20 이하인 배열입니다.<br>
skill_trees의 원소는 스킬을 나타내는 문자열입니다.<br>
skill_trees의 원소는 길이가 2 이상 26 이하인 문자열이며, 스킬이 중복해 주어지지 않습니다.<br><br>
입출력 예<br>

|skill|	skill_trees|	return|
|---|---|---|
|"CBD"	|["BACDE", "CBADF", "AECB", "BDA”]|2|

입출력 예 설명<br>
BACDE: B 스킬을 배우기 전에 C 스킬을 먼저 배워야 합니다. 불가능한 스킬트립니다.<br>
CBADF: 가능한 스킬트리입니다.<br>
AECB: 가능한 스킬트리입니다.<br>
BDA: B 스킬을 배우기 전에 C 스킬을 먼저 배워야 합니다. 불가능한 스킬트리입니다.<br>

```
class Solution {
    public int solution(String skill, String[] skill_trees) {
        String[] sArr = skill.split("");
        int result=skill_trees.length;
        for(int i =0; i<skill_trees.length; i++){
            int index1 = skill_trees[i].indexOf(sArr[0]);
            for(int j =1; j<skill.length(); j++){
                int index2= skill_trees[i].indexOf(sArr[j]);
                if(index1== -1&&index2!= -1||
                   index1!= -1 && index1>index2 && index2 != -1){
                    result--;
                    break;
                } 
                index1 = index2;
            }     
        }
        return result;
    }
}
```

## Code Review
3가지 조건을 생각하면된다.

1. 첫번째 스킬이 존재하면서 다음 스킬의 인덱스가 더 클때
2. 첫번째 스킬이 존재하면서 두번째 스킬은 없는데 세번째이상 스킬이 존재할때
3. 첫번째 스킬이 없는데 다음 스킬이 존재할때


## 다른사람의 풀이 

```
import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        ArrayList<String> skillTrees = new ArrayList<String>(Arrays.asList(skill_trees));
        //ArrayList<String> skillTrees = new ArrayList<String>();
        Iterator<String> it = skillTrees.iterator();

        while (it.hasNext()) {
            if (skill.indexOf(it.next().replaceAll("[^" + skill + "]", "")) != 0) {
                it.remove();
            }
        }
        answer = skillTrees.size();
        return answer;
    }
}
```

천재이신가.. 정규표현식을 사용하셨다.. 나도 잘을 모른다..<br>

http://www.nextree.co.kr/p4327/


정규표현식(Regular Expression) 이란?<br>
정규표현식의 사전적인 의미로는 특정한 규칙을 가진 문자열의 집합을 표현하는데 사용하는 형식 언어입니다. 주로 Programming Language나 Text Editor 등 에서 문자열의 검색과 치환을 위한 용도로 쓰이고 있습니다. 입력한 문자열에서 특정한 조건을 표현할 경우 일반적인 조건문으로는 다소 복잡할 수도 있지만, 정규표현식을 이용하면 매우 간단하게 표현 할 수 있습니다. 하지만 코드가 간단한 만큼 가독성이 떨어져서 표현식을 숙지하지 않으면 이해하기 힘들다는 문제점이 있습니다.



