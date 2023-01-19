package level0.day6_8;

/** 문자열 뒤집기
 *
 * 문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로
 * 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
 */
public class Day6StringReversed {
    public static String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        int length = my_string.length();

        for (int i = 0; i < length; i+=1){
            sb.append(my_string.charAt(length - 1 - i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
            System.out.println(solution("json"));
    }
}
