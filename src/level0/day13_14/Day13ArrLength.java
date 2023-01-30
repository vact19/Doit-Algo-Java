package level0.day13_14;

import java.util.Arrays;

/** 배열 원소의 길이
 *  문자열 배열 strlist가 매개변수로 주어집니다.
 *  strlist 각 원소의 길이를 담은 배열을 retrun하도록 solution 함수를 완성해주세요.
 *
 * ["We", "are", "the", "world!"]	[2, 3, 3, 6]
 */
public class Day13ArrLength {
    public static int[] solution(String[] strlist) {
        return Arrays.stream(strlist).mapToInt(String::length).toArray();
    }

    public static void main(String[] args) {
            System.out.println(Arrays.toString(solution(new String[]{"We", "are", "the", "world!"})));
    }


}
