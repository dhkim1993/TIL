import java.util.*;

public class Back_1475_room_number {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String n = input.nextLine();
        String[] arr = n.split("");
        String[] compareArr = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int[] countArr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < compareArr.length; j++) {
                if (arr[i].equals(Integer.toString(j))) {
                    countArr[j]++;
                }
            }
        }

        int cnt69;
        int set;
        set = countArr[0];

        for (int i = 1; i < countArr.length; i++) {
            if (i == 6 || i == 9) {
                continue;
            }
            if (set < countArr[i]) {
                set = countArr[i];
            }
        }
        cnt69 = countArr[6] + countArr[9];
        if (cnt69 % 2 == 1) {
            cnt69++;
        }
        cnt69 = cnt69 / 2;

        int result = cnt69 > set ? cnt69 : set;
        System.out.println(result);
    }
}
