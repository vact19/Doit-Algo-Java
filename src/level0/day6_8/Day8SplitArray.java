package level0.day6_8;

import java.util.Arrays;

public class Day8SplitArray {
    public static int[] solution(int[] numbers, int num1, int num2) {
        int[] result = new int[num2 - num1 + 1];
        int idx = 0;
        for (int i = num1; i <= num2; i+=1){
            result[idx++] = numbers[i];
        }
        // Returns a sequential IntStream with the specified range of the specified array as its source.
//        return Arrays.stream(numbers, num1, num2 + 1).toArray();
//        return IntStream.rangeClosed(num1, num2).map(num -> numbers[num]).toArray();
        return result;
    }
    public static void main(String[] args) {
            System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5}, 2, 3)));
    }
}
