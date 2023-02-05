package level0.day16_18;

import java.util.Arrays;

/**
 * 정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록
 * solution 함수를 완성해주세요
 *
 * 1234	10
 */
public class Day17자릿수더하기 {
    public static int solution(int n) {
        return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
        /**
         * while(n>0){
         *             answer+=n%10;
         *             n/=10;
            }
         n % 10 수행으로 맨 뒷자리를 더하게 된다.
         */
    }

    public static void main(String[] args) {
            System.out.println(solution(1234));
    }
}
