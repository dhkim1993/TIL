
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by kimdonghyun on 27/09/2019.
 * 메시지(message) 처리 시간
 * 최대 10개의 메시지를 처리하는 메시지 큐(message queue)가 있다. 메시지 큐에 메시지가 쌓이면 이를 순차적으로 최대 10개의 컨슈머(consumer)가 처리한다. 메시지마다 처리에 걸리는 시간은 다를 수 있고 하나의 메시지 처리에 걸리는 시간은 최대 100초이다.
 * 모든 메시지가 0초에 도착하고 입력받는 순서대로 처리한다고 가정하였을 때, 전체 메시지를 처리하는데 걸리는 시간을 계산하시오.
 * 단, 메시지의 개수, 컨슈머의 개수 모두 1개 이상이고 메시지를 메시지 큐에 넣거나 빼는 작업에는 아무런 오버헤드가 없다.
 * 예시
 * 5개의 메시지, 2개의 컨슈머가 있고 각각의 메시지 처리시간이 각각 4초, 3초, 5초, 2초, 8초 걸린다고 했을 때, 아래 표와 같이 총 14초가 소비된다.
 * 	1	2	3	4	5	6	7	8	9	10	11	12	13	14
 * Consumer1	m1	m1	m1	m1	m4	m4	m5	m5	m5	m5	m5	m5	m5	m5
 * Consumer2	m2	m2	m2	m3	m3	m3	m3	m3
 * 입력 형식
 * * 첫째 줄에 입력받을 메시지의 수와 컨슈머 개수가 정수로 입력된다
 * * 첫째 줄의 메시지의 수만큼 처리 소요 시간이 입력된다
 * 출력 형식
 * * 총 처리 시간을 출력한다
 * 입출력 예제
 * 입력
 * 5 2
 * 4
 * 3
 * 5
 * 2
 * 8
 * 출력
 * 14
 */
public class Message {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int consumers = sc.nextInt();
        int[] timeArr = new int[n];
        for (int i = 0; i < n; i++) {
            timeArr[i] = sc.nextInt();
        }
        System.out.println(solution(n, consumers, timeArr));
    }
    static int solution(int n, int consumers, int[] timeArr){
        ArrayList<Integer> consumerList = new ArrayList<>();
        for (int i = 0; i < consumers; i++) {
            consumerList.add(timeArr[i]);
        }
        for (int j = consumers; j < n; j++) {
            int min = Collections.min(consumerList);
            int idx = consumerList.indexOf(min);
            consumerList.set(idx,min+timeArr[j]);
        }
        return Collections.max(consumerList);
    }
}
