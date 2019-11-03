## 다익스트라 알고리즘(Dijkstra Algorithm)
다이나믹 프로그래밍을 활용한 대표적인 최단경로 탐색 알고리즘 입니다. 특정한 하나의 정점에서 다른 모든 정점으로 가는 최단 경로를 알려줍니다. 다만 음의 간선을 포함 할 수 없습니다. 

1. 출발노드를 설정한다.
2. 출발 노드를 기준으로 각 노드의 최소 비용을 지정한다.
3. 방문하지 않은 노드 중에서 가장 비용이 적은 노드를 선택한다.
4. 해당 노드를 거쳐서 노드로 가는 경우를 고려하여 최소 비용을 갱신한다.
5. 위 과정에서 3~4번을 반복한다.

```java
/**
 * Created by kimdonghyun on 09/10/2019.
 */
public class Dijkstra {
    static int number = 6;
    static int INF = 1000000000;

    //전체 그래프 초기화
    static int[][] a = {
            {0,2,5,1,INF,INF},
            {2,0,3,2,INF,INF},
            {5,3,0,3,1,5},
            {1,2,3,0,1,INF},
            {INF,INF,1,1,0,2},
            {INF,INF,5,INF,2,0},
    };
    static boolean[] v = new boolean[6];  //방문한 노드
    static int[] d = new int[6];  //최단거리


    public static void main(String[] args) {
        new Dijkstra().dijkstra(0);
        for (int i = 0; i < number; i++) {
            System.out.println(d[i]);
        }
    }
    // 가장 최소 거리를 가지는 정점을 반환
    int getSmallIndex(){
        int min = INF;
        int index =0;
        for (int i = 0; i < number; i++) {
            if(d[i] <min && !v[i]){
                min = d[i];
                index = i;
            }
        }
        return index;
    }
    
    void dijkstra(int start){
        for (int i = 0; i < number; i++) {
            d[i] =  a[start][i];
        }
        v[start] = true;
        for (int i = 0; i < number-2; i++) {
            int current = getSmallIndex();
            v[current] = true;
            for (int j = 0; j <6 ; j++) {
                if(!v[j]){
                    if(d[current]+a[current][j] < d[j]){
                        d[j] = d[current] + a[current][j];
                    }
                }
            }
        }
    }
}

```