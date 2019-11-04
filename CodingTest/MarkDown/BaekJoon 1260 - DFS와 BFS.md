# TIL - CodingTest Practice 
### 2019.11.04 Mon

## BaekJoon 1260 - DFS와 BFS


```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * Created by kimdonghyun on 04/11/2019.
 */
public class DFS_BFS {
    static boolean[] visited;
    static int[][] nodes;
    static int n,m,start;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer( br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());
        visited = new boolean[n+1];
        nodes = new int[n+1][n+1];
        for(int i=0; i<m; i++){
            StringTokenizer token = new StringTokenizer( br.readLine(), " ");
            int x = Integer.parseInt(token.nextToken());
            int y = Integer.parseInt(token.nextToken());
            nodes[x][y] = 1;
            nodes[y][x] = 1;
        }
        dfs(start);
        System.out.println();
        Arrays.fill(visited, false);
        bfs(start);
    }
    static void dfs(int target){
        visited[target] = true;
        System.out.print(target+" ");
        for (int i = 1; i <= n; i++) {
            if(nodes[target][i] !=0 && !visited[i]){
                dfs(i);
            }
        }
    }
    static void bfs(int start){
        Queue q = new LinkedList<Integer>();
        q.offer(start);
        visited[start]= true;
        while(!q.isEmpty()){
            int current = (int)q.poll();
            System.out.print(current+" ");
            for(int i=1; i<=n; i++){
                if(nodes[current][i] !=0 && !visited[i]){
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }
    }

}

```

## Code Review
기본적인 dfs,bfs를 구현했다.
