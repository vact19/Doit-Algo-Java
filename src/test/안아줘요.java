package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 안아줘요 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        Stream<Integer> integerStream = list.stream().map(i -> i + 2);
        Stream<Integer> integerStream1 = integerStream.map(i -> i + 2);
        List<Integer> collected = integerStream1.collect(Collectors.toList());
        System.out.println(collected);

        List<Integer> collected2 = integerStream1.map(i -> i + 2).collect(Collectors.toList());
        System.out.println(collected2);
    }

}
