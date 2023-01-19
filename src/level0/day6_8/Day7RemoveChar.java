package level0.day6_8;

import java.util.Arrays;

/** 특정 문자 제거하기
 *
 * 문자열 my_string과 문자 letter이 매개변수로 주어집니다.
 * my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
 */
public class Day7RemoveChar {

    public static String solution(String my_string, String letter) {
        StringBuilder sb = new StringBuilder();
        String[] splited = my_string.split(letter); // split한 배열의 크기는 3 이상일 수도 있으니 전체 순회한다.
        Arrays.stream(splited).forEach(sb::append);

//        return my_string.replace(letter, "");
        return sb.toString();
    }
    public static void main(String[] args) {
            System.out.println(solution("BCBDbe", "F"));
    }
}
