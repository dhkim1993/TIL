import java.util.*;


public class Stack {
    public static void main(String[] args) {

        String op, an, N = "n";  //  operator 명령어 라는 뜻 answer은 계속 동잘 할껀지 대답 요구 변수
        int stack[] = new int[5];   // 5만큼 크기의 배열 선언
        int loop, i, x, p, s, t, sum = 0, index = 0;     // x는 정수값 index는 배열 인덱스값


        do {
            System.out.print("명령어를 입력하세요 : ");
            Scanner input = new Scanner(System.in);
            op = input.nextLine();

            switch (op) {

                case "push":
                    System.out.print("정수를 입력하세요 : ");
                    x = input.nextInt();

                    for (i = 0; i < 5; i++) {
                        if (stack[index] == 0) {
                            stack[index] = x;
                            index++;
                            break;
                        }
                    }
                    break;

                case "pop":
                    for (p = 4; p >= 0; p--)
                        if (stack[p] != 0) {
                            System.out.println(stack[p]);
                            stack[p] = 0;
                            break;
                        }
                    break;

                case "size":
                    for (s = 0; s < 5; s++) {
                        if (stack[s] != 0) {
                            sum++;
                        }
                    }
                    System.out.println(sum);
                    break;

                case "top":
                    for (t = 4; t >= 0; t--) {
                        if (stack[t] != 0) {
                            System.out.println(stack[t]);
                            break;
                        }
                    }
                    break;

                default:
                    System.out.print("오류값입니다. push, pop, size, top 중에 입력하세요.");
            }
            for (loop = 4; loop >= 0; loop--) {
                System.out.println(stack[loop]);
            }
            System.out.print("계속할래? y or n : ");
            an = input.nextLine();
            if (an.equals(N)) {
                break;
            }
        } while (true);
    }
}
/*
push X: 정수 X를 스택에 넣는 연산이다.
pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 스택에 들어있는 정수의 개수를 출력한다.
empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 */