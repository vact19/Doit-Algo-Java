package level0.day19_21;

import java.util.Arrays;

/**
 * 문자열 my_string이 매개변수로 주어집니다. my_string은 소문자, 대문자, 자연수로만 구성되어있습니다.
 * my_string안의 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
 */
public class Day21숨어있는숫자의덧셈2 {
    public static int solution(String my_string) {
        return Arrays.stream(my_string.split("[a-zA-Z]"))
                .filter(s -> !s.isEmpty())
                .mapToInt(Integer::parseInt)
                .sum();
    }
    
    public static void main(String[] args) {
            System.out.println(solution("aAb1B2cC34oOp"));
    }
}
