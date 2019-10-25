# TIL - CodingTest Practice 
### 2019.10.24 Thr

## Programmers - 정수 삼각형 (level 3)
![image](https://user-images.githubusercontent.com/46931527/67457839-ae71b100-f66f-11e9-8b9b-28e9cfb2f56f.png)


```
public int solution(int[][] triangle) {
        int answer = 0,sum=0;
        int yLeng = triangle.length;
        for(int i =1; i<yLeng; i++){
            int xLeng = triangle[i].length;
            for(int j = 0; j<xLeng; j++){
                if(j==0){
                    triangle[i][j] += triangle[i-1][j];
                }else if(j==xLeng-1){
                    triangle[i][j] += triangle[i-1][j-1];
                }else{
                    triangle[i][j] += Math.max(triangle[i-1][j-1],triangle[i-1][j]);
                }
            }
        }
        answer = triangle[yLeng-1][0];
        for(int m =1; m<triangle[yLeng-1].length; m++){
            if(triangle[yLeng-1][m] > answer){
                answer = triangle[yLeng-1][m];
            }
        }
        return answer;
    }
}

```

## Code Review
[i][j]의 값은 상위노드 두개의 값중에서 큰값을 내려받아 더하면된다.<br>
여기서 예외가 있다.<br>
삼각형의 양쪽 끝 값은 상위노드의 값이 1개로 정해져있다는 것이다.<br>
예를 들어 사진에서 3번째 행의 8,0을 보면 3,8 로 값이 고정이다. <br>비교할 필요가없기에 저 두개의 예외를 if문으로 걸고 나머지 가운데값은 Math.max로 비교해서 값을 도출한다음에 <br>마지막 행의 값중에서 max값을 리턴했다.<br>
