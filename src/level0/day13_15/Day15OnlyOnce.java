package level0.day13_15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/** 한 번만 등장한 문자
 *
 *  문자열 s가 매개변수로 주어집니다. s에서 한 번만 등장하는 문자를
 *  사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
 *  한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.
 */
public class Day15OnlyOnce {

    public static String solution(String s) {
        String[] splited = s.split("");

        List<String> onceList = Arrays.stream(splited)
                .filter(str -> containsOnlyOnce(splited, str))
                .collect(Collectors.toList());
//        onceList.sort(Comparator.naturalOrder());
        return onceList.stream()
                .sorted()
                .collect(Collectors.joining());
    }

    public static boolean containsOnlyOnce(String[] array, String element){
        int count = 0;
        for (String s : array) {
            if (s.equals(element))
                count++;
        }
        return count == 1;
    }

    public static void main(String[] args) {
            System.out.println(solution("abcabcadc"));
    }
}
