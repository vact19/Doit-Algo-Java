package level0.day19_21;

import java.util.Arrays;

/**
 * 2차원 좌표 평면에 변이 축과 평행한 직사각형이 있습니다. 직사각형 네 꼭짓점의 좌표
 * [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]가 담겨있는 배열 dots가 매개변수로 주어질 때,
 * 직사각형의 넓이를 return 하도록 solution 함수를 완성해보세요.
 *
 * [[1, 1], [2, 1], [2, 2], [1, 2]]	1
 * [[-1, -1], [1, 1], [1, -1], [-1, 1]]	4
 */
public class Day20직사각형넓이구하기 {
    /**
     *  왼쪽아래부터 반시계로 1, 2, 3, 4
     *  x2 - x1, y3 - y2
     *
     */
    public static int solution(int[][] dots) {
        int[] xArr = new int[4];
        for (int i =0; i < xArr.length; i+=1)
            xArr[i] = dots[i][0];

        int[] yArr = new int[4];
        for (int i =0; i < yArr.length; i+=1)
            yArr[i] = dots[i][1];
        Arrays.sort(xArr); Arrays.sort(yArr);


        int width = xArr[xArr.length - 1] - xArr[0];
        int height = yArr[yArr.length - 1] - yArr[0];

        return Math.abs(width * height);
    }

    public static void main(String[] args) {
            System.out.println(solution(new int[][]{{1, 1}, {2, 1}, {2, 2}, {1, 2}}));
    }
}
