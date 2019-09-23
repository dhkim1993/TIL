package Exercises_Package;
import java.util.LinkedList;
import java.util.Queue;
public class Programmers_BridgeTruck {
    static int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> qArr = new LinkedList<>();

        for (int i = 0; i < truck_weights.length; i++) {
            if(truck_weights[i]<=weight){
                qArr.offer(truck_weights[i]);
            }
        }


        return 0;
    }

    public static void main(String[] args) {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7, 4, 5, 6};
        System.out.println(solution(bridge_length,weight,truck_weights));
    }
}
