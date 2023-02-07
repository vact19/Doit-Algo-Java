package level0.day22_23;

/**
 *  3x 마을 사람들은 3을 저주의 숫자라고 생각하기 때문에 3의 배수와 숫자 3을
 *  사용하지 않습니다. 3x 마을 사람들의 숫자는 다음과 같습니다.
 *
 *  10진법	3x 마을에서 쓰는 숫자	10진법	3x 마을에서 쓰는 숫자
 * 1	1	6	8
 * 2	2	7	10
 * 3	4	8	11
 * 4	5	9	14
 * 5	7	10	16
 *
 *  정수 n이 매개변수로 주어질 때, n을 3x 마을에서 사용하는 숫자로 바꿔 return하도록 solution 함수를 완성해주세요.
 *
 *  15	25
 */
public class Day22저주의숫자3 {
    /**
     *  수식 하나로 구현하긴 힘들듯
     *  i = 0부터 n까지 돌고
     *  예전 숫자를 기억해서 누적하는 식으로 하는게 나을듯
     */
    public static int solution(int n) {
        int x3 = 0;
        for (int i = 1; i <= n; i+=1){
            x3+=1;
            // 3의 배수 체크 || // 3이 들어있는지 체크
            while (x3 % 3 == 0 || String.valueOf(x3).contains("3"))
                x3+=1;
        }
        return x3;
    }
    public static void main(String[] args) {
            System.out.println(solution(8));
    }
}
