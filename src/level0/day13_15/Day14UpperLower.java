package level0.day13_15;

/** 대문자와 소문자
 *
 * 문자열 my_string이 매개변수로 주어질 때, 대문자는 소문자로 소문자는 대문자로
 * 변환한 문자열을 return하도록 solution 함수를 완성해주세요.
 */
public class Day14UpperLower {
    public static String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = my_string.toCharArray();
        for (char c : charArray) {
            if (c >= 97) // 소문자면
                sb.append((char) (c - 32));
            else // 대문자면
                sb.append((char) (c + 32));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
            System.out.println(solution("cccCCC"));
    }
}
