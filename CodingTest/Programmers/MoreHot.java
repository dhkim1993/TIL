import java.util.PriorityQueue;

/**
 * Created by kimdonghyun on 06/10/2019.
 */
public class MoreHot {
    public static void main(String[] args) {
        int[]scoville = {1, 2, 3, 9, 10, 12};
        int K=7;
        System.out.println(new MoreHot().solution(scoville,K));
    }
    public int solution(int[] scoville, int K) {

        PriorityQueue<Integer> pq = new PriorityQueue();
        int mixCnt = 0;
        for (int aScoville : scoville) pq.offer(aScoville);
        while (pq.peek() < K) {
            if (pq.size() == 1) {
                return -1;
            }
            int a = pq.poll();
            int b = pq.poll();
            pq.offer(a + (b * 2));
            mixCnt ++;
        }
        return mixCnt;
    }
}

