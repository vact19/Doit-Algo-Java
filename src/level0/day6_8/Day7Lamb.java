package level0.day6_8;

/** 양꼬치
 *
 *  머쓱이네 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 줍니다.
 *  양꼬치는 1인분에 12,000원, 음료수는 2,000원입니다.
 *  정수 n과 k가 매개변수로 주어졌을 때, 양꼬치 n인분과 음료수 k개를 먹었다면
 *  총 얼마를 지불해야 하는지 return 하도록 solution 함수를 완성해보세요.
 *
 *  음료수는 무조건 n / 10 보다 크다.
 *  10	3	124,000
 */
public class Day7Lamb {
    public static int solution(int n, int k) {
        // 1. n인분 + 음료수 k개로 총 금액 구하기
        // 2. n인분으로 서비스 음료 수(의 가격) 구하기
        // => 1에서 2 빼기
        int total = n * 12000 + k * 2000; // 서비스 음료까지 계산한 총 금액
        int drinkPrice = n / 10 * 2000; // 서비스 음료 수
        return total - drinkPrice;
    }

    public static void main(String[] args) {
            System.out.println(solution(64, 6));
    }
}
