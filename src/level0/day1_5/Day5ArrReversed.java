package level0.day1_5;

import java.util.Arrays;

/**
 * 정수가 들어 있는 배열 num_list가 매개변수로 주어집니다.
 * num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
 */
public class Day5ArrReversed {
    public static int[] solution(int[] num_list) {
        // 배열.length = 10일 경우
        // 1, 10 / 2, 9 / 3, 7 ... 교환
        for (int i = 0; i < num_list.length / 2; i++){
            int temp = num_list[i];
            num_list[i] = num_list[num_list.length - 1 - i];
            num_list[num_list.length - 1 - i] = temp;
        }
        return num_list;
    }

    public static void main(String[] args) {
            System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
    }
}
