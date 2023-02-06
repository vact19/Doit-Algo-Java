package level0.day19_21;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 머쓱이는 행운의 숫자 7을 가장 좋아합니다. 정수 배열 array가 매개변수로 주어질 때,
 * 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.
 */
public class Day19_7의개수 {
    public static int solution(int[] array) {
        String joined = Arrays.stream(array).mapToObj(String::valueOf).collect(Collectors.joining());
        int count = 0;
        for (int i = 0; i < joined.length(); i+=1){
            if (Character.getNumericValue(joined.charAt(i)) ==  7)
                count+=1;
        }
        return count;
    }
    
    public static void main(String[] args) {
            System.out.println(solution(new int[]{7, 77, 17}));
    }
}
