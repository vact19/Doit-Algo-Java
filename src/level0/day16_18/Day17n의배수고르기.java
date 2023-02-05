package level0.day16_18;

import java.util.Arrays;

/**
 * 정수 n과 정수 배열 numlist가 매개변수로 주어질 때,
 * numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.
 *
 *  3	[4, 5, 6, 7, 8, 9, 10, 11, 12]	[6, 9, 12]
 */
public class Day17n의배수고르기 {
    public static int[] solution(int n, int[] numlist) {
        return Arrays.stream(numlist).filter(num -> num % n == 0).toArray();
    }
    public static void main(String[] args) {
            System.out.println(Arrays.toString(solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12})));
    }
}
