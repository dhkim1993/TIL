import java.util.*;

public class Practice_5_12 {
    public static void main(String[] args) {
        int QNum, cnt = 0;
        String input;
        String[][] str = {
                {"chair", "의자"},            // words[0][0], words[0][1]
                {"computer", "컴퓨터"},    // words[1][0], words[1][1]
                {"integer", "정수"}        // words[2][0], words[2][1]
        };
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < str.length; i++) {
            QNum = i + 1;
            System.out.print("Q" + QNum + "." + " " + str[i][0] + "의 의미는? : ");
            input = s.nextLine();
            if (input.equals(str[i][1])) {
                System.out.println("정답입니다.");
                cnt++;
            } else {
                System.out.println("틀렸습니다. 정답은 " + str[i][1] + "입니다.");
            }
        }
        System.out.println("전체 3문제 중 " + cnt + "문제 맞추셨습니다.");
    }
}
/*
[실행결과]
Q1. chair의 의미는? : ㅁㅁ
틀렸습니다. 정답은 의자입니다.
Q2. computer의 의미는? : 컴퓨터
정답입니다.
Q3. integer의 의미는? : 메롱
틀렸습니다. 정답은 정수입니다.
전체 3문제 중 1문제 맞추셨습니다.
 */