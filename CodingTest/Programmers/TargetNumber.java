/**
 * Created by kimdonghyun on 08/10/2019.
 */
public class TargetNumber {
    static int answer = 0;
    public int solution(int[] numbers, int target) {
        DFS(numbers,target,0);
        return answer;
    }
    public void DFS(int[] numbers, int target, int k) {
       if(k==numbers.length){
           int sum=0;
           for (int i : numbers) sum += i;
           if(sum==target)
               answer++;
           return;
       }else{
           numbers[k] *= 1;
           DFS(numbers,target,k+1);
           numbers[k] *= -1;
           DFS(numbers,target,k+1);
       }
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
        int target = 3;
        System.out.println(new TargetNumber().solution(arr, target));
    }
}
/*
class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        answer = dfs(numbers, 0, 0, target);
        return answer;
    }
    int dfs(int[] numbers, int n, int sum, int target) {
        if(n == numbers.length) {
            if(sum == target) {
                return 1;
            }
            return 0;
        }
        return dfs(numbers, n + 1, sum + numbers[n], target) + dfs(numbers, n + 1, sum - numbers[n], target);
    }
}
 */