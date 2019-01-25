import java.util.*;

public class FlowEx6 {
    public static void main(String[] args) {

        int month = 0;

        System.out.print("현재 월을 입력해볼까~? : ");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        month = Integer.parseInt(tmp);

        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.print("봄이다~");
                break;
            case 6:
            case 7:
            case 8:
                System.out.print("여름이다~");
                break;
            case 9:
            case 10:
            case 11:
                System.out.print("가울데스네~");
                break;
            case 12:
            case 1:
            case 2:
            default:
                System.out.print("겨울데스~");
                break;
        }
    }
}
/*
현재 월을 입력해볼까~? : 1
겨울데스~
 */
