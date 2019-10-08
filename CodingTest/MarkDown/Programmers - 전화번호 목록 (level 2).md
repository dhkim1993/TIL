# TIL - CodingTest Practice 
### 2019.10.07 Mon

## Programmers - 전화번호 목록 (level 2)

전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.<br>
전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.<br>

구조대 : 119<br>
박준영 : 97 674 223<br>
지영석 : 11 9552 4421<br>
전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때, 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.<br>

제한 사항<br>
phone_book의 길이는 1 이상 1,000,000 이하입니다.<br>
각 전화번호의 길이는 1 이상 20 이하입니다.<br>
입출력 예제<br>

|phone_book|	return|
|---|---|
|[119, 97674223, 1195524421]|	false|
|[123,456,789]|	true|
|[12,123,1235,567,88]	|false|

입출력 예 설명<br>
입출력 예 #1<br>
앞에서 설명한 예와 같습니다.<br>

입출력 예 #2<br>
한 번호가 다른 번호의 접두사인 경우가 없으므로, 답은 true입니다.<br>

입출력 예 #3<br>
첫 번째 전화번호, “12”가 두 번째 전화번호 “123”의 접두사입니다. 따라서 답은 false입니다.<br>

```

/**
 * Created by kimdonghyun on 07/10/2019.
 */
public class PhoneNumberList {
    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};
        System.out.println(solution(phone_book));
    }
    public static boolean solution(String[] phone_book){
        if(phone_book.length==1) return true;
        for (int i = 0; i < phone_book.length-1; i++) {
            for (int j = i+1; j < phone_book.length; j++) {
                if(phone_book[i].startsWith(phone_book[j])) return false;
                if(phone_book[j].startsWith(phone_book[i])) return false;
            }
        }
        return true;
    }
}

```

## Code Review
진짜 여러가지 생각을 많이 해봐서 좋았다. 일단 처음풀이는 string 배열을 string 객체로 변환한다음, <br>
 for문을 돌리고 첫번째 배열 요소값을 replaceAll로 string 객체에서 지우고 난 후에 string.length()이랑 <br>
string에서 요소길이만큼 뺀거랑 비교를 한다.<br>
string.length()-phone_nunmber[i].length() 이거랑 string.replaceAll(phone_nunmber[i]).length 이거랑 비교를 한다. <br>
비교해서 길이가 다르면 false다. 근데 잘못생각했다.<br>
접두사면 문자열이 시작할때 비교할 문자열로 시작하는지를 판단하애햐는데 난 그냥 존재하는지만 여부를 판단했기 때문에.. <br>
다른방법을 찾았다.<br>
검색해보니 String에 startWith 라는 매우적합한 메소드가 있었다.<br>
startWith(“ “) “”문자열로 시작하는지 boolean 리턴해주는 메소드이다. 그냥 for문으로 쭉 돌면 답나온다.<br>
java를 더 deep 하게 다시 봐야겠다...