package Exercises_Package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by kimdonghyun on 23/09/2019.
 */
public class StramTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple","Banana","Melon","Grape","Strawberry","Grape"));
        System.out.println(list);
        //map
        list.stream().map(s->s.toUpperCase());
        list.stream().map(String::toUpperCase);
        System.out.println(list.stream().map(s->s.toUpperCase()).collect(Collectors.joining(" | ")));
        System.out.println(list.stream().map(String::toUpperCase).collect(Collectors.toList()));
        list.stream().map(String::toUpperCase).forEach(s -> System.out.println(s));
        //filter
        list.stream().filter(t->t.length()>5);
        System.out.println(list.stream().filter(t->t.length()>5).collect(Collectors.joining(" ")));
        System.out.println(list.stream().filter(t->t.length()>5).collect(Collectors.toList()));
        //sorted
        list.stream().sorted();
        System.out.println(list.stream().sorted().collect(Collectors.toList()));
    }
}
