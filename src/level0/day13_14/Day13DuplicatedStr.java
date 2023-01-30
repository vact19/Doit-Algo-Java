package level0.day13_14;

import java.util.Arrays;

/** 중복된 문자 제거
 *  문자열 my_string이 매개변수로 주어집니다. my_string에서 중복된 문자를 제거하고
 *  하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.
 *
 *  문자는 대문자, 소문자, 공백으로 구성되며 공백도 하나의 문자이다.
 *  중복된 문자 중 가장 앞에 있는 문자를 남긴다.
 */
public class Day13DuplicatedStr {

    public static String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        for (String s : my_string.split("")) {
            if (isContained(sb.toString(), s))
                continue;
            sb.append(s);
        }
        return sb.toString();

        // distinct() 사용
//       return  Arrays.stream(my_string.split("")).distinct().collect(Collectors.joining());
    }

    // target String 에 str이 포함되어 있는지
    private static boolean isContained(String target, String str) {
        long count = Arrays.stream(target.split("")).filter(targetChar -> targetChar.equals(str)).count();
        return count > 0; // 하나라도 중복되면 true
    }

    public static void main(String[] args) {
            System.out.println(solution("We are the world"));
    }
}
