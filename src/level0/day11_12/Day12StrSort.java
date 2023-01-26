package level0.day11_12;

import java.util.Arrays;

/** 문자열 정렬하기(1)
 *
 * 문자열 my_string이 매개변수로 주어질 때, my_string 안에 있는 숫자만 골라
 * 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.
 */
public class Day12StrSort {

    public static int[] solution(String my_string) {
        String replaced = my_string.replaceAll("[a-z]", "");


        char[] chars = replaced.toCharArray();

        int[] intArr = new int[chars.length];
        Arrays.setAll(intArr, i -> ((int) chars[i]) - 48); // ASCII '0' -> 48
        Arrays.sort(intArr); // 오름차 정렬

        return intArr;
//        return Arrays.stream(my_string.split("")).sorted().mapToInt(Integer::parseInt).toArray();
        // String.split("") 로 한글자 배열 만들기 가능
    }

    public static void main(String[] args) {
            System.out.println(Arrays.toString(solution("hi1238de")));
    }
}
