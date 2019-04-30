package Lambda_Stream_Package;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class LambdaEx4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.forEach(i -> System.out.print(i + ","));
        System.out.println();

        list.removeIf(x -> x % 2 == 0 || x % 3 == 0);
        System.out.println(list);
        list.replaceAll(i -> i * 10); //list 각 요소에 10 곱한다.
        System.out.println(list);

        Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");

        map.forEach((k, v) -> System.out.println("{" + k + "," + v + "},"));
        System.out.println();

    }
}
/*
0,1,2,3,4,5,6,7,8,9,
[1, 5, 7]
[10, 50, 70]
{1,1},
{2,2},
{3,3},
{4,4},

 */

