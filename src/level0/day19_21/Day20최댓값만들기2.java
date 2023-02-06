package level0.day19_21;

import java.util.Arrays;

/**
 * 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중
 * 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
 *
 * [1, 2, -3, 4, -5]	15
 * [0, -31, 24, 10, 1, 9]	240
 */
public class Day20최댓값만들기2 {
    public static int solution(int[] numbers) {
        /**
         *  정렬 후
         *  최소값 두개의 곱(음수끼리 곱)과 최대값 두개의 곱 중 큰 것 반환하면 될 듯
         */
        Arrays.sort(numbers);
        int multipliedNegatives = numbers[0] * numbers[1];
        int multipliedPositives = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        return Math.max(multipliedNegatives, multipliedPositives);
    }
    public static void main(String[] args) {
            System.out.println(solution(new int[]{1, 2, -3, 4, -5}));
    }
}















