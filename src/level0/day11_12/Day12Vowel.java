package level0.day11_12;

import java.util.Arrays;

/** 모음 제거
 *
 * 영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.
 * 문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을
 * return하도록 solution 함수를 완성해주세요.
 *
 * 입력값은  공백과 소문자로만 이루어져 있음.
 */
public class Day12Vowel {

    public static String solution(String my_string) {
        String[] splited1 = my_string.split("a");
        String concated1 = concatArrStr(splited1);
        String[] splited2 = concated1.split("e");
        String concated2 = concatArrStr(splited2);
        String[] splited3 = concated2.split("i");
        String concated3 = concatArrStr(splited3);
        String[] splited4 = concated3.split("o");
        String concated4 = concatArrStr(splited4);
        String[] splited5 = concated4.split("u");
        String concated5 = concatArrStr(splited5);

        // replace 쓰면 됨
        return concated5;
    }

    public static String concatArrStr(String[] splited) {
        StringBuilder sb = new StringBuilder();
        Arrays.stream(splited).forEach(sb::append);
        return sb.toString();
    }

    public static void main(String[] args) {
            System.out.println(solution("bus"));
    }
}











