package level0.day1_5;

/**
 * 머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라줍니다.
 * 피자 조각 수 slice와 피자를 먹는 사람의 수 n이 매개변수로 주어질 때,
 * n명의 사람이 최소 한 조각 이상 피자를 먹으려면 최소 몇 판의 피자를 시켜야 하는지를
 * return 하도록 solution 함수를 완성해보세요.
 */
public class Day4Pizza3 {
    public static int solution(int slice, int n) {
        if (slice >= n) // n보다 slice가 더 크면 1판만 시켜도 된다.
            return 1;

        if (n % slice == 0)
            return n / slice;
        return n / slice + 1;

    }
    public static void main(String[] args) {
        System.out.println(solution(4, 12));
    }
}
