package level0.day6_8;

import java.util.Arrays;

/** 짝수 홀수 개수
 *
 *  정수가 담긴 리스트 num_list가 주어질 때,
 *  num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을
 *  return 하도록 solution 함수를 완성해보세요.
 */
public class Day6EvenOdd {

    public static int[] solution(int[] num_list) {
        int[] answer = new int[2]; // answer[0] -> Even, answer[1] -> Odd

        answer[0] = Arrays.stream(num_list).filter((num) -> num % 2 == 0).toArray().length;
        answer[1] = Arrays.stream(num_list).filter((num) -> num % 2 != 0).toArray().length;

        return answer;
    }
    public static void main(String[] args) {
            System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
    }

}
