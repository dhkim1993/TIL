import java.util.*;

class FlowEx28 {
    public static void main(String[] args) {

        int input  = 0;
        int answer = 0;

        answer = (int)(Math.random() * 100) + 1; // 1~100사이의 임의의 수를 저장
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("1과 100사이의 정수를 입력하세요.>");

            String tmp = scanner.nextLine();
            input = Integer.parseInt(tmp);

            if(input > answer) {
                System.out.println("더 작은 수로 다시 시도해보세요.");
            } else if(input < answer) {
                System.out.println("더 큰 수로 다시 시도해보세요.");
            }
        } while(input!=answer);

        System.out.println("정답입니다.");
    }
}
/*
1과 100사이의 정수를 입력하세요.>44
더 큰 수로 다시 시도해보세요.
1과 100사이의 정수를 입력하세요.>77
더 큰 수로 다시 시도해보세요.
1과 100사이의 정수를 입력하세요.>99
더 작은 수로 다시 시도해보세요.
1과 100사이의 정수를 입력하세요.>88
더 작은 수로 다시 시도해보세요.
1과 100사이의 정수를 입력하세요.>85
더 작은 수로 다시 시도해보세요.
1과 100사이의 정수를 입력하세요.>80
더 큰 수로 다시 시도해보세요.
1과 100사이의 정수를 입력하세요.>83
정답입니다.

 */