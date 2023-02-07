package level0.day22_23;

import java.util.Arrays;

/**
 * 선분 3개가 평행하게 놓여 있습니다. 세 선분의 시작과 끝 좌표가 [[start, end], [start, end], [start, end]]
 * 형태로 들어있는 2차원 배열 lines가 매개변수로 주어질 때,
 * 두 개 이상의 선분이 겹치는 부분의 길이를 return 하도록 solution 함수를 완성해보세요.
 *
 * lines가 [[0, 2], [-3, -1], [-2, 1]]일 때 그림으로 나타내면 다음과 같습니다.
 *
 * line_2.png
 *
 * 선분이 두 개 이상 겹친 곳은 [-2, -1], [0, 1]로 길이 2만큼 겹쳐있습니다.
 * 모든 선분은 길이가 1 이상입니다.
 *
 * [[0, 1], [2, 5], [3, 9]]	2
 *  2 33 44 55 6 7 8...
 */
public class Day22겹치는선분의길이 {
    public static int solution(int[][] lines) {
        int answer = 0;
        int[] arr = new int[200];

        for (int i = 0; i < lines.length; i++){
            // 각 행의 시작부터 끝까지 반복하며 선이 지나간 자리에 1을 더한다.
            for (int j = lines[i][0] + 100; j < lines[i][1] + 100; j++)
                arr[j]++;
        }
        // 2 이상인 자리 (선이 두 개 이상 지나간 자리)를 센다.
        return (int) Arrays.stream(arr).filter(n -> n >= 2).count();
    }
    public static void main(String[] args) {
            System.out.println(solution(new int[][]{{0, 2}, {-3, -1}, {-2, 1}}));
    }
}













