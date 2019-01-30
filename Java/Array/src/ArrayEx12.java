public class ArrayEx12 {
    public static void main(String[] args) {

        String[] names = {"Kim", "park", "Yi"};
        String tmp;
        int i;

        for (i = 0; i < names.length; i++) {
            System.out.println("names[" + i + "]:" + names[i]);
        }

        tmp = names[2];
        System.out.println("tmp:" + tmp);
        names[0] = "Yi";

        for (String str : names) {       //이 for문을 쓸떄는 선언을 ( ) 안에 하고 사용해야한다.
            System.out.println(str);
        }
    }
}
/*
names[0]:Kim
names[1]:park
names[2]:Yi
tmp:Yi
Yi
park
Yi
 */
