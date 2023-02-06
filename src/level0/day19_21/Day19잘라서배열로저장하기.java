package level0.day19_21;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 문자열 my_str과 n이 매개변수로 주어질 때,
 * my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.
 *
 * "abc1Addfggg4556b"	6	["abc1Ad", "dfggg4", "556b"]
 */
public class Day19잘라서배열로저장하기 {
    public static String[] solution(String my_str, int n) {
        // 배열의 크기는 my_str길이 / n + 1 이상일 필요 없다.
        ArrayList<String> resultList = new ArrayList<>();
        int index = 0; // 원본 문자열을 다루기 위한 인덱스

        // str.length / n 의 몫만큼 반복
        while (index <= my_str.length() - n){
            resultList.add(my_str.substring(index, index + n));
            index += n;
        }

        // str.length % n 의 나머지만큼 반복
        StringBuilder sb = new StringBuilder();
        while (index < my_str.length()){
            sb.append(my_str.charAt(index));
            index += 1;
        }
        if (sb.length() > 0)
            resultList.add(sb.toString());

        // toArray() 파라미터로 배열 크기 지정하지 않으면 알아서 리스트 사이즈에 맞춰서 만들어줌
        return resultList.toArray(new String[resultList.size()]);
    }
    
    public static void main(String[] args) {
            System.out.println(Arrays.toString(solution("abcdef123", 3)));
    }
}
