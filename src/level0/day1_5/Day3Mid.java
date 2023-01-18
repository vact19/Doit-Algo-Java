package level0.day1_5;

import java.util.Arrays;

public class Day3Mid {
    public static int solution(int[] array) {
        // Sorts the specified array into ascending numerical order.
        Arrays.sort(array);
        return array[array.length / 2];
    }
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 5, 2, 3, 4}));
    }
}
