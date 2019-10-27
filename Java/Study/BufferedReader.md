# TIL - 2019.09.25 Wed
# BufferedReader
## BufferedReader 사용법

BufferedReader/BufferedWriter는 Buffer에 있는 IO 클래스입니다. 입력된 데이터가 바로 전달되지 않고 중간에 버퍼링이 된 후에 전달되됩니다. 출력도 마찬가지로 버퍼를 거쳐서 간접적으로 출력장치로 전달되기에 시스템의 데이터처리 효율성을 높여주며 버퍼스트림을InputStreamReader / OutputStreamWriter를 같이 사용하여 버퍼링을 하게 되면 입출력 스트림으로부터 미리 버퍼에 데이터를 갖다 놓기 때문에 보다 효율적인 입출력이 가능합니다.


java를 처음 접하시는 분들이 주로 받는 입력방식은 Scanner입니다. Scanner를 통해 입력을 받을경우 Space Enter를 모두 경계로 인식하기에 입력받은 데이터를 가공하기 매우 편리합니다. 하지만 그에비해 BufferedReader는 Enter만 경계로 인식하고 받은 데이터가 String으로 고정되기때문에 입력받은 데이터를 가공하는 작업이 필요할경우가 많습니다. Scanner에 비해 다소 사용하기 불편하죠. 하지만 많은 양의 데이터를 입력받을경우 BufferedReader를 통해 입력받는 것이 효율면에서 훨씬 낫습니다. 입력시 Buffer 메모리줌으로써 작업속도 차이가 많이납니다.

``` 
BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
String s = bf.readLine(); //String
int i = Integer.parseInt(bf.readLine()); //Int
```

선언은 위에 있는 예제와 같이 하시면 됩니다. 입력은 readLine();이라는 메서드를 활용하시면 되는데요. 여기서 주의할점이 두가지가 있습니다.<br> 첫번째는 readLine()시 리턴값을 String으로 고정되기에 String이 아닌 다른타입으로 입력을 받을려면 형변환을 꼭 해주어야한다는 점입니다. <br>두번째는 예외처리를 꼭 해주어야한다는 점입니다. readLine을 할때마다 try & catch를 활용하여 예외처리를 해주어도 되지만 대개 throws IOException을 통하여 작업합니다.


## Read한 데이터 가공

```
StringTokenizer st = new StringTokenizer(s); //StringTokenizer인자값에 입력 문자열 넣음
int a = Integer.parseInt(st.nextToken()); //첫번째 호출
int b = Integer.parseInt(st.nextToken()); //두번째 호출

String array[] = s.split(" "); //공백마다 데이터 끊어서 배열에 넣음

```

Read한 데이터는 Line단위로만 나눠지기에 공백단위로 데이터를 가공하려면 따로 작업을 해주어야하는데요. 위의 두가지 방법이 대표적입니다.<br>
첫번째 방법으로는 StringTokenizer에 nextToken()함수를 쓰면 readLine()을 통해 입력받은 값을 공백단위로 구분하여 순서대로 호출할 수 있습니다.<br>
두번째방법으로는 String.split()함수를 활용하여 배열에 공백단위로 끊어서 데이터를 넣고 사용하는 방식입니다.


<hr>
InputStreamReader는 입력을 character로 읽어들인다. 키보드로 입력하는 글자 한개에 해당된다고 할 수 있다. 하지만 한 글자가 아닌 줄단위의 문자열을 입력으로 받으려면 마찬가지로 불편하다. 그래서 생겨난 것이 BufferedReader이다.

BufferedReader는 InputStreamReader에 버퍼링 기능을 추가한 것으로 데이터를 사용자가 요청할때마다 매번 읽어오기 보다는 일정량사이즈로 한번에 읽어온 후 버퍼에 보관한다. 그리고 사용자가 요구할 때 버퍼에서 읽어오게 한다. 결국 BufferedReader를 이용하면 속도를 향상시키고 시간의 부하를 줄일수 있게 된다.

BufferedReader는 사용하기 위해 import도 BufferedReader와 InputStreamReader 2개를 불러와야 하지만 Scanner는 Scanner 하나만 불러오면 된다는 차이도 있다.

BufferedReader는 throws Exception을 선언해 주어야지만 에러 없이 사용 가능 하기 때문에 실질적으로 Scanner보다 손도 훨씬 많이 가고, 장점이 별로 없다 할 수 있다.


java.util.Scanner : 6.068<br>
java.io.BufferdReader(*) : 0.934

Scanner의 버퍼 사이즈는 1024 chars 이고, BufferedReader의 버퍼사이즈는 8192 chars이기 때문에 많은 입력이 있다면 BufferedReader가 성능 상 우위를 가질 수 밖에 없다. Scanner는 내부적으로 regex를 매우 많이 이용하기 때문인 것으로 보입니다.

# BufferedWriter

일반적으로 출력을할때 System.out.println(""); 방식을 사용하고는 합니다. 적은양의 출력일 경우 성능차이가 미미하겠지만 많은 양의 출력에서는 입력과 마찬가지로 Buffer를 활용해주시는것이 좋습니다.

## BufferedWriter사용법
```
BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//선언
String s = "abcdefg";//출력할 문자열
bw.write(s+"\n");//출력
bw.flush();//남아있는 데이터를 모두 출력시킴
bw.close();//스트림을 닫음
```

flush()란?
사용자가 원할 때 버퍼를 비워주는 것으로 버퍼를 비우는 것은 IO에서는 출력하는 것 이겠고, 네트워크에서는 버퍼의 내용을 
클라이언트나 서버로 보내는 것이겠지. 여기서 사용자가 원할 때라는 말이 포인트인 것 같다.

BufferedWriter 의 경우 버퍼를 잡아 놓았기 때문에 반드시 flush() / close() 를 반드시 호출해 주어 뒤처리를 해주어야합니다. 그리고 bw.write에는 System.out.println();과 같이 자동개행기능이 없기때문에 개행을 해주어야할 경우에는 \n를 통해 따로 처리해주어야합니다.<br><br>

REFERENCE<br>

- https://cocomo.tistory.com/507<br>
- https://coding-factory.tistory.com/251<br>
- https://vaert.tistory.com/160
