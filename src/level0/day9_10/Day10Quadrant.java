package level0.day9_10;

/** 점의 위치 구하기
 *
 * x 좌표 (x, y)를 차례대로 담은 정수 배열 dot이 매개변수로 주어집니다.
 * 좌표 dot이 사분면 중 어디에 속하는지 1, 2, 3, 4 중 하나를 r
 *  return 하도록 solution 함수를 완성해주세요.
 *
 *  [2, 4]	1
 */
public class Day10Quadrant {

    public static int solution(int[] dot) {
        int answer = 0;

        if (dot[0] * dot[1] <0){ // 2, 4분면일 경우
            answer = dot[0] > 0 ? 4 : 2;
        } else { // 1, 3분면일 경우
            answer = dot[0] > 0 ? 1 : 3;
        }

        return answer;
    }
    public static void main(String[] args) {
            System.out.println(solution(new int[]{2, 4}));
    }
}
























