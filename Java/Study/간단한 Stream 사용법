# Stream 사용법 예제

배열의 원소를 가공하는데 있어 map, filter, sorted 등 이 있습니다.<br>

# Stream Test<br>
```
ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple","Banana","Melon","Grape","Strawberry","Grape"));
        
```
## map
> map은 요소들을 특정조건에 해당하는 값으로 변환해 줍니다.<br>
요소들을 대,소문자 변형 등 의 작업을 하고 싶을떄 사용 가능 합니다.<br>


```
//map
list.stream().map(s->s.toUpperCase());
list.stream().map(String::toUpperCase);
System.out.println(list.stream().map(s->s.toUpperCase()).collect(Collectors.joining(“ | “)));
System.out.println(list.stream().map(String::toUpperCase).collect(Collectors.toList()));
list.stream().map(String::toUpperCase).forEach(s -> System.out.println(s));
```
출력결과

```
APPLE | BANANA | MELON | GRAPE | STRAWBERRY | GRAPE
[APPLE, BANANA, MELON, GRAPE, STRAWBERRY, GRAPE]
APPLE
BANANA
MELON
GRAPE
STRAWBERRY
GRAPE
Banana Strawberry
```     
## filter
> filter는 요소들을 조건에 따라 걸러내는 작업을 해줍니다.<br>
길이의 제한, 특정문자포함 등 의 작업을 하고 싶을때 사용 가능합니다.<br>

```  
//filter
list.stream().filter(t->t.length()>5);
System.out.println(list.stream().filter(t->t.length()>5).collect(Collectors.joining(" ")));
System.out.println(list.stream().filter(t->t.length()>5).collect(Collectors.toList()));
```
출력결과

```
Banana Strawberry
[Banana, Strawberry]

```
     
## sorted
> sorted는 요소들을 정렬해주는 작업을 해줍니다.<br>
요소들의 가공이 끝났다면 리턴해줄 결과를 collect 를 통해 만들어줍니다. <br>
        
```   
//sorted
list.stream().sorted();
System.out.println(list.stream().sorted().collect(Collectors.toList()));
```
출력결과

```
[Apple, Banana, Grape, Grape, Melon, Strawberry]
```

출처 : https://dpdpwl.tistory.com/81

