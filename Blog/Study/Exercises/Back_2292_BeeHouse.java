import java.util.*;

public class Back_2292_BeeHouse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int room = 1;
        int i = 2;
        int increaseNum = 1;
        int range = 0;

        if(N==1){
            System.out.println(room);
        }

        while (i <= N) {
            room++;
            increaseNum += 6;
            for (i = i; i <= range + increaseNum; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            range += increaseNum - 1;
        }

        System.out.println(room);
    }
}

/*      index1=1
        +6
        index2= 2,3,4,5,6,7
        +12
        intdex3= 8~19
        +18
        index4= 20~37
        +24
        index5= 38~61
        +30
        index6= 62~91
*/





