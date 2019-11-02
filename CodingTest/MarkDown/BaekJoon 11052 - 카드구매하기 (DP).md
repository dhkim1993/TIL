# TIL - CodingTest Practice 
### 2019.11.02 Sat

## BaekJoon 11052 - 카드구매하기 (DP)

```java
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;

public class Baek_11052 {
    public static void main(String[] args)   {
    	//1	
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] sArr = sc.nextLine().split(" ");
        int[] price = new int[n+1];
        Map<Integer, Double> map = new HashMap<>();

        for(int i=1; i<=n; i++) {
            price[i] = Integer.parseInt(sArr[i-1]);
            map.put(i,Double.parseDouble(sArr[i-1])/i);
        }
        //2
        List<Map.Entry<Integer, Double>> list = sortByValue(map);
        //3
        System.out.println(checkPrice(list, price, n));
    }
    static List<Map.Entry<Integer, Double>> sortByValue (Map<Integer, Double> map){
        List<Map.Entry<Integer, Double>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, (o1, o2) -> {
            int comparision = (int)(o1.getValue() - o2.getValue()) * -1;
            return comparision == 0 ? o1.getKey().compareTo(o2.getKey()) : comparision;
        });
        return list;
    }
    static int checkPrice(List<Map.Entry<Integer, Double>> list, int[] price, int n ){
        int result = 0;
        for (int i = 0; i <list.size(); i++) {
            int cardCnt = list.get(i).getKey();
            if(n < cardCnt) continue;
            result += (n/cardCnt) * price[cardCnt];
            if(n%cardCnt ==0)  break;
            n %= cardCnt;
        }
        return result;
    }
}

```




## Code Review
DP 문제이지만 요즘 DP만 풀어서 다른 방법으로 해봤다.<br><br>
1번 <br>
초기화하는 부분이다. n개의 카드가 필요하고 n번만큼 for문으로 가격배열과 가격/카드갯수 한값을 map에 put 해줘서 초기화 시킨다.
그럼 price[] , map 이렇게 두개를 초기화 시켰다.<br>

2번<br>
sortByValue 말그대로 value값으로 정렬해서 list를 리턴한다.
여기서 value값은 가격/카드갯수 이다.
그럼 갯수대비 가격이 비싼 순서대로 정렬이 된다.<br>

3번<br>
이제 가격이 비싼 순서대로 처음부터 필요로하는 카드갯수(n)를 나누면서 계산해준다. 그 비용을 리턴한다.


