package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        list.stream().map(x -> x * 10).forEach(System.out::println);

        System.out.println();
        Stream<String> st = Stream.of("Du", "Dudu", "Edu").map(x -> x.toUpperCase());
        System.out.println(Arrays.toString(st.toArray()));

        System.out.println();
        Stream<Integer> st2 = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(st2.limit(10).toArray()));

        System.out.println();
        Stream<Long> st3 = Stream.iterate(new Long[]{0L, 1L}, p -> new Long[]{p[1], p[0] + p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(st3.limit(10).toArray()));

        System.out.println();
        int sum = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println("Sum: " + sum);

        System.out.println();

        System.out.println(Arrays.toString(list.stream().filter(x -> x % 2 == 0).map(x -> x * 10).toArray()));


    }
}
