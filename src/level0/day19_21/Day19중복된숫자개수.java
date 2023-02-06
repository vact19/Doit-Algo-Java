package level0.day19_21;

/**
 * 정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때,
 * array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.
 */
public class Day19중복된숫자개수 {
    public static int solution(int[] array, int n) {
        int count = 0;
        for (int i : array) {
            if (i == n)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
            System.out.println(solution(new int[]{1, 1, 2, 3, 4, 5}, 1));
    }
}
