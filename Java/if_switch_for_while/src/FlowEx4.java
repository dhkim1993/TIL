import java.util.*;

public class FlowEx4 {
    public static void main(String[] args) {

        int score = 0;
        char grade = ' ';

        System.out.print("점수를 입력해볼래? : ");
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        score = Integer.parseInt(tmp);

        if (score >= 90) {
            grade = 'A';
        }
        else if (score >= 80) {
            grade = 'B';
        }
        else if (score >= 70) {
            grade = 'C';
        }
        else {
            grade = 'D';
        }

        System.out.printf("당신의 학점은 %c 입니다.", grade);
    }
}
/*
점수를 입력해볼래? : 88
당신의 학점은 B 입니다.
 */