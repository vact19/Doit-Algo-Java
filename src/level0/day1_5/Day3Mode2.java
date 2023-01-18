package level0.day1_5;

import java.util.HashMap;
import java.util.Map;

// 배열의 최빈값 구하기

/**
 * 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
 * 정수 배열 array가 매개변수로 주어질 때,
 * 최빈값을 return 하도록 solution 함수를 완성해보세요.
 * 최빈값이 여러 개면 -1을 return 합니다.
 * 배열의 길이는 1이상 99이하.
 */
public class Day3Mode2 {

    public static int solution(int[] array) {
        /**
         *  Map<숫자, 빈도수>를 활용한다.
         *  1. 배열을 모두 순회하며 Map에 등록한다. 숫자와 빈도수가 정리된 HashMap이 만들어진다.
         *  2. keySet을 순회하며 가장 value가 높은 key를 찾는다.

         *      이 과정에서 중복된 최빈값도 찾는다.
             *  value가 일치한 경우, 해당 상황을 기억한다 (boolean flag = true).
             *  더 높은 수가 나오면 boolean flag를 해제한다(false).
             *  반복이 끝났을 때 true면 -1을 반환한다.
         */
        Map<Integer, Integer> map = new HashMap<>();
        if (array.length <= 1){ // 배열 길이 1인 경우는 특별취급하여 array[0] 반환
            return array[0];
        }

        // 1 ~ 2번
        for (int num : array) {
            // key에 등록된 값이 있으면 BiFunction을 실행한다. 없으면 등록한다. 가독성을 위해 Method Reference로 교체하지 않음
            map.merge(num, 1, (oldValue, newValue) -> oldValue + newValue);
        }

        // 3 ~ 4번
        int freq = 1; // 빈도수
        int key = array[0]; // 빈도수 freq만큼 일어난 key값. 배열 0번째로 초기화한다.
        boolean flag = false; // 최빈값이 여러개일 경우 false.

        // 1-2, 2-2
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();
            if (freq == value){ // 현재까지의 최대 빈도수와 같은 빈도수를 가진 Entry를 만났을 시
                flag = true;
            } else if (freq > value){ // 최대 빈도수가 여전히 유지될 경우
            } else { // 최대 빈도수가 경신될 경우
                freq = value;
                key = entry.getKey();
                flag = false;
            }
        }
        if (flag){
            return -1;
        }
        return key;
    }
    public static void main(String[] args) {
        System.out.println("최빈값은 " +solution(new int[]{5}));
    }
}
