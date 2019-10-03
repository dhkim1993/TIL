# TIL - 2019.10.03 Thu
# Coding Test Practice

## programmers - 가장 큰수 (level 2)

```
import java.util.*;

/**
 * Created by kimdonghyun on 02/10/2019.
 */
public class MaxNum {
    public static void main(String[] args) {
        int[] numbers = {9, 30, 34, 5, 3};
        System.out.println(solution(numbers));
    }
    public static String solution(int[] numbers) {
        String[] sArr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) 
            sArr[i] = String.valueOf(numbers[i]);
        
        Arrays.sort(sArr, (o1,o2)-> (o2+o1).compareTo(o1+o2));
        
        if(sArr[0].equals("0")) return "0";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sArr.length; i++)
            sb.append(sArr[i]);

        return sb.toString();
    }
}

// 결과값 9534330
```

## Code Review
배열값으로 만들수 있는 가장 큰값을 string으로 return하는 문제이다.<br>
이 문제의 핵심은 compareTo 이다.<br>

```
Arrays.sort(sArr, new Comparator<String>() {
	@Override
	public int compare(String o1, String o2) {
    	return (o2+o1).compareTo(o1+o2);
    }
});
        
```
현재 객체 < 인자로 넘어온 객체: return 음수<br>
현재 객체 == 인자로 넘어온 객체: return 0<br>
현재 객체 > 인자로 넘어온 객체: return 양수<br>
string은 compareTo 할때 사전적 순서로 정렬되는걸로 알고 있고 맨 처음 객체 부터 비교한다고 알고 있다.<br>
(o1+o2).compareTo(o2+o1) 으로하면 오름차순 정렬이되고 (o2+o1).compareTo(o1+o2)로 하면 내림차순 정렬이 된다.<br>
가장 큰수를 만들어야 하기떄문에 (o2+o1).compareTo(o1+o2)로 구현했다.<br>
간결하게 하기위해 람다로 구현했다.<br>
만약에 sort후에도 가장 큰값이 0일때는 그냥 0을 return 했고 
단일 쓰레드여서 StringBuffer 말고 StringBuilder로 결과값을 출력했다.