package level0.day22_23;

/**
 * 네 개의 좌표를 담은 이차원 배열  dots가 다음과 같이 매개변수로 주어집니다.
 *
 * [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]
 * 주어진 네 개의 점을 두 개씩 이었을 때, 두 직선이 평행이 되는 경우가 있으면
 * 1을 없으면 0을 return 하도록 solution 함수를 완성해보세요.
 *
 * 0 ≤ x, y ≤ 100
 *
 * 점은 겹치지 않는다.
 * 직선이 겹치는 경우에도 1
 * 축 자체와 평행한 경우는 없음
 */
public class Day22평행 {
    // https://velog.io/@jsj3282/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%ED%8F%89%ED%96%89
    public static double findSlope(int[] dot1, int[] dot2) {
        // 기울기 구하는 공식 : (y2 - y1) / (x2 - x1)
        return (double) (dot2[1] - dot1[1]) / (dot2[0] - dot1[0]);
    }
    // 기울기가 같아야 한다
    // 12, 34
    // 13, 24
    // 14, 23 세 경우의 수에 대해.
    public static int solution(int[][] dots) {
        int answer = 0;

        // (0, 1), (2, 3)
        if (findSlope(dots[0], dots[1]) == findSlope(dots[2], dots[3])) {
            return 1;
        }

        // (0, 2), (1, 3)
        if (findSlope(dots[0], dots[2]) == findSlope(dots[1], dots[3])) {
            return 1;
        }

        // (0, 3), (1, 2)
        if (findSlope(dots[0], dots[3]) == findSlope(dots[1], dots[2])) {
            return 1;
        }

        return answer;
    }
    
    public static void main(String[] args) {
            System.out.println(solution(new int[][]{{1, 4}, {9, 2}, {3, 8}, {11, 6}}));
    }
}
