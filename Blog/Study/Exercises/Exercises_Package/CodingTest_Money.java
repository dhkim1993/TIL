package Exercises_Package;

public class CodingTest_Money {
    public static int[] solution(int money) {

        int[] moneyArr = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
        int[] answer = new int[moneyArr.length];
        int i = 0;
        while (money != 0) {
            if (money - moneyArr[i] >= 0) {
                money -= moneyArr[i];
                answer[i]++;
            } else {
                i++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int money = 246693;
        System.out.println(solution(money));
    }
}

