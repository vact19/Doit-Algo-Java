package level0.day11_12;

import java.util.Arrays;

/**  숨어있는 숫자의 덧셈(1)
 *
 * 문자열 my_string이 매개변수로 주어집니다.
 * my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
 */
public class Day12StrNum {
    public static int solution(String my_string) {
        return Arrays.stream(my_string.replaceAll("[a-z | A-Z]", "").split("")).mapToInt(Integer::parseInt).sum();
        //Character.isDigit() 문자가 숫자인지 판단 가능
    }
    public static void main(String[] args) {
            System.out.println(solution("aAb45234Op"));
    }
}
