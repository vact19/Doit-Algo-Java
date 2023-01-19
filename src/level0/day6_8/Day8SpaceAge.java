package level0.day6_8;

import java.util.List;

/** 외계행성의 나이
 *
 *  입국심사에서 나이를 말해야 하는데, PROGRAMMERS-962 행성에서는
 *  나이를 알파벳으로 말하고 있습니다. a는 0, b는 1, c는 2, ..., j는 9입니다.
 *  예를 들어 23살은 cd, 51살은 fb로 표현합니다.
 *  나이 age가 매개변수로 주어질 때 PROGRAMMER-962식 나이를
 *  return하도록 solution 함수를 완성해주세요.
 */
public class Day8SpaceAge {

    public static String solution(int age) {
        // 초기화
        List<String> list = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j");
        StringBuffer sb = new StringBuffer();

        // 맨 앞부터 처리하기 위해 int age를 String 타입변환
        String ageString = String.valueOf(age);

        // ageString의 길이만큼 반복한다.
        // 나이를 숫자로 바꿔서 그 숫자를 리스트의 인덱스로 검색함.
        for (int i = 0; i < ageString.length(); i+=1){
            Integer num = Character.getNumericValue(ageString.charAt(i));
            sb.append(list.get(num));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
            System.out.println(solution(100));
    }
}
