package level0.day1_5;

import java.util.Arrays;

public class Day2DoublingArray {
    public static int[] solution(int[] numbers) {
        return Arrays.stream(numbers)
                .map(num -> num * 2)
                .toArray();
    }
    public static void main(String[] args) {
        Arrays.stream(solution(new int[]{1, 2, 3, 4, 5}))
                .forEach(System.out::println);
    }
}
