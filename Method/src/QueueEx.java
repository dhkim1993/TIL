import java.util.*;
import java.util.Queue;
public class QueueEx {
    public static void main(String[] args) {

        Queue Myque = new LinkedList();

        String str1 = "1. 머루";
        String str2 = "2. 별머루";
        String str3 = "3. 산머루";
        String str4 = "4. 달머루";

        Myque.offer(str1);
        Myque.offer(str2);
        Myque.offer(str3);
        Myque.offer(str4);

        while (Myque.peek() != null) {
            String val = (String) Myque.poll();
            System.out.println("값은 " + val);
        }
    }
}
/*
메서드	설명
boolean offer()	Queue(큐)에 객체를 넣는다
poll()	Queue(큐)에서 데이터를 꺼내온다. 만일 Queue(큐)가 비어있다면 null 을 반환.
peek()	큐의 맨 아래 있는 객체를 반환한다. 이 때 객체를 큐에서 제거하진 않는다.

값은 1. 머루
값은 2. 별머루
값은 3. 산머루
값은 4. 달머루

 */
