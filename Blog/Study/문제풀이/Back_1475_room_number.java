import java.util.*;

public class Back_1475_room_number {
    public static void main(String[] args) {

        System.out.print("방번호입력 : ");
        Scanner input = new Scanner(System.in); //String으로 방숫자를 입력받는다.
        String rn = input.nextLine();

        String[] arr = rn.split("");    //입력받은 번호를 각 자리수마다 쪼개서 arr배열에 넣는다.

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");         //현재 arr배열을 출력해서 보여준다.

        System.out.println();

        String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};  //String으로 선언해놓고 equals로 비교할꺼다
        int[] cnt = new int[10];

        for (int i = 0; i < arr.length; i++) {    //입력수만큼
            for (int j = 0; j < num.length; j++) {    //10
                if (arr[i].equals(num[j])) {
                    cnt[j] += 1;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d:%d %n", i, cnt[i]);    //조건에 맞는 숫자가 몇개씩 증가했는지 보여준다.
        }

        System.out.println();

        int max = cnt[0];       //제일많이 중복된 값을 추출하기위해 선언하고 첫번째 값을 max에 넣는다.

        for (int i = 0; i < num.length; i++) {  //max와 차례차례 비교하여 제일큰값을 max에넣는다.
            if (max < cnt[i]) {
                max = cnt[i];
            }
            if ((max == cnt[i]) && (max == cnt[6] || max == cnt[9])) {   //6,9와 같은 크기의 숫자가 있으면 그 숫자를 max로 정한다
                max = cnt[i];
            }
        }
        System.out.printf("max :%d%n", max);

        if (max == cnt[6] || max == cnt[9]) { // 6이나9가 max이면
            if ((cnt[6] + cnt[9]) % 2 == 0) {     //6+9가 짝수면 /2 하고
                max = max / 2;
            } else if ((cnt[6] + cnt[9]) % 2 == 1) {
                max = max;                      //6+9가 홀수면 그냥 max그대로 ex) 6+9=3이면 2세트가 필요하니까.
            }
        }

        System.out.printf("필요한 셋트 갯수는 %d개 입니다.", max);
    }
}

