package Exercises_Package;

/**
 * Created by kimdonghyun on 23/09/2019.
 */
public class PickMiddle {
    String getMiddle(String word){
        return word.substring((word.length()-1) / 2, word.length()/2 + 1);
    }
    public static void  main(String[] args){
        PickMiddle se = new PickMiddle();
        System.out.println(se.getMiddle("power"));
    }
    /*public String solution(String s) {
        String answer = "";
        String[] sArr = s.split("");
        int leng = s.length();
        int mid=0;
        if(leng%2==0){
            mid = leng/2-1;
            for(int i =mid; i<=mid+1; i++){
                answer += sArr[i];
            }
        }else {
            mid = leng/2;
            answer = sArr[mid];
        }
        return answer;
    }*/
}
