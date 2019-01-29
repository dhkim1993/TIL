import java.util.*;

public class Stack {
    public static void main(String[] args) {

        String op, an, N = "n";  //  op = operator 명령어 라는 뜻 an = answer은 계속 동잘 할껀지 대답 요구 변수 N은 n을 넣어줌으로써 문자열 비교를 위함
        int stack[] = new int[5];   // 5만큼 크기의 배열 선언ㅇㅏ휴..
        int loop, i, x, p, s, t, e, sum = 0, index = 0;     // x는 정수값 index는 배열 인덱스값 sun은 size크기 축적용


        do {                                            // do while로 한번 쭉 실행하고 밑에서 while문 한번더 돌껀지 물어봄
            System.out.print("명령어를 입력하세요 : ");
            Scanner input = new Scanner(System.in);
            op = input.nextLine();

            switch (op) {           //switch 로 명령어 종류 나눠서 실행문 짬.

                case "push":
                    if (stack[4] != 0) {   // 스택 마지막칸만 조사를 해서 그게 0이 아니면 꽉찼다고 말해줌
                        System.out.println("스택이 꽉 찼습니다.");
                        break;
                    }
                    System.out.print("정수를 입력하세요 : ");
                    x = input.nextInt();

                    for (i = 0; i < 5; i++) {   //첫번째 배열 칸부터 안에 값이 있는지 없는지 검사
                        if (stack[index] == 0) {//없으면 입력받은 x를 집어넣음
                            stack[index] = x;
                            index++;        //그리고 인덱스 1증가
                            break;          //증가 했으면 for문 종료
                        }
                    }
                    break;  // switch 탈출


                case "pop":
                    for (p = 4; p >= 0; p--)    // 배열의 끝에 칸부터 검사한다.
                        if (stack[p] != 0) {    // 0이 아니면 값이 있는것이기 떄문에
                            System.out.println(stack[p]);   //값을 출력해주고
                            stack[p] = 0;                   //값을 0으로 만들어 뺴버린다.
                            break;                          //for문 탈출한다.
                        } else {
                            System.out.print("-1");         //값이 없으면 -1 출력
                            break;
                        }

                    break;


                case "size":
                    for (s = 0; s < 5; s++) {       //5칸 다 검사해서 0이 아니면 sum에 갯수를 세기위해 1씩 증가 축적
                        if (stack[s] != 0) {
                            sum++;
                        }
                    }
                    System.out.println(sum);        //축적된 값 출력
                    break;


                case "top":
                    for (t = 4; t >= 0; t--) {          //맨 끝 칸부터 검사한다. 0이 아니면 출력한다.
                        if (stack[t] != 0) {
                            System.out.println(stack[t]);
                            break;
                        }
                    }
                    break;


                case "empty":
                    for (e = 0; e < 5; e++) {
                        if (stack[e] != 0) {
                            System.out.println("0 (값이 있다)");    //첫번째 방부터 검사해서 0이 아니면 값이 있다 없으면 비어있다 출력
                        } else {
                            System.out.println("1 (비어있다)");
                            break;
                        }
                    }
                    break;


                default:
                    System.out.print("오류값입니다. push, pop, size, top 중에 입력하세요."); //이상한거 입력하면 오류라고 말하고 다시할꺼냐고 묻는다
            }

            for (loop = 4; loop >= 0; loop--) {     //이번 현재 베열에 뭐가 들어가있는지 실시간으로 보여줄려고 만들었다.
                System.out.println(stack[loop]);
            }

            Scanner input2 = new Scanner(System.in);    //새로운 객체 만들어서 다시 처음부터 반복할껀지 묻는 곳이다.
            System.out.print("계속할래? y or n : ");    // y 또는 n 입력하라고 헀고 n을 입력하면 프로그램이 끝나지만 그외 다른값을 입력하면 다시 while문 맨위로.
            an = input2.nextLine();
            if (an.equals(N)) {         // N == n 이라고 위에 선언해놨다. an을 N과 비교하는 문자열끼리 비교하는 eqauls함수이다.
                break;
            }
        } while (true); // 바로 위에 do while 을 탈출하는 break문이 있어서 true로 해놨다.
    }
}
/*
push X: 정수 X를 스택에 넣는 연산이다.
pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 스택에 들어있는 정수의 개수를 출력한다.
empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 */
