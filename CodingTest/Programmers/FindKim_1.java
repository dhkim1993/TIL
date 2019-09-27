import java.util.Arrays;

/**
 * Created by kimdonghyun on 25/09/2019.
 */
public class FindKim_1 {
    public static void main(String[] args) {
        FindKim_1 findKim_1 = new FindKim_1();
        String[] seoul = {"Jane","Kim"};
        System.out.println(findKim_1.solution(seoul));
    }
    public String solution(String[] seoul){
        //int x = Arrays.asList(seoul).indexOf("Kim");
        int x=0;
        for(int i =0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")) {
                x=i;
                break;
            }
        }
        return "김서방은 "+x+"에 있다.";
    }
}
