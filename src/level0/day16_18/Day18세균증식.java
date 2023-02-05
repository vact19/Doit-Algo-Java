package level0.day16_18;

/**
 * 어떤 세균은 1시간에 두배만큼 증식한다고 합니다. 처음 세균의 마리수 n과
 * 경과한 시간 t가 매개변수로 주어질 때 t시간 후 세균의 수를 return하도록 solution 함수를 완성해주세요.
 *
 * 2	10	2048
 *
 * 2, 4, 8, 16...
 */
public class Day18세균증식 {
    public static int solution(int n, int t) {
        int i = (int) Math.pow(2, t );
        return n * i;
//        int answer = 0;
//
//        answer = n << t;
//
//        return answer;
    }
    public static void main(String[] args) {
            System.out.println(solution(2, 10));
    }
}
