package level0.day13_15;

import java.util.Arrays;

/**  삼각형의 완성조건
 *
 *  선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
 *
 * 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
 * 삼각형의 세 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다.
 * 세 변으로 삼각형을 만들 수 있다면 1, 만들 수 없다면 2를 return하도록 solution 함수를 완성해주세요.
 */
public class Day13Triangle {
    // 삼각형 만들 수 있으면 1, 없으면 2 반환
    public static int solution(int[] sides) {
        int max = Arrays.stream(sides).max().getAsInt();
        int sum = Arrays.stream(sides).sum();

        return max >= sum - max ? 2 : 1; // sum - max 는 다른 두 변의 길이의 합
    }
    public static void main(String[] args) {
            System.out.println(solution(new int[]{1, 2, 3}));
    }
}
