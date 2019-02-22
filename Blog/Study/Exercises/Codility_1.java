import java.util.*;

class Codility_1 {
    public static void main(String[] args) {

        int N = 59;
        List<Integer> arr = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        while (true) {
            arr.add(N % 2);
            N = N / 2;
            if (N == 0) {
                break;
            }
        }
        int cnt = 0;
        int gap = 0;

        for (int i = arr.size() - 1; i >= 0; i--) {
            if (arr.get(i) == 0) {
                gap++;
                if (arr.get(i + 1) == 1) {
                    arr2.add(gap);
                    gap = 0;
                }
            }
            if (arr.get(i) == 1) {
                cnt++;
            }
        }

        for (int i = arr.size() - 1; i >= 0; i--) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

        int max = 0;
        max = arr2.get(0);

        for (int i = 0; i < arr2.size(); i++) {
            if (arr2.get(i) > max)
                max = arr2.get(i);
        }

        System.out.println();

        if(cnt >= 2)
            System.out.println("max : "+max);
        else
            System.out.println(0);
    }
}
/*
정수 N이 주어지고 2진수로 변환하였을때 1과1사이에 0이 최대 몇개 들어있고 그 길이가 가장 긴 0의 갯수를 리턴하는 문제이다
코딜리티 사이트에서 바로 문제를 푸는거지만 일단 연습을 위해 인텔리제이에서 만들어보았다.
int N = 59;
1 1 1 0 1 1

max : 1

 */