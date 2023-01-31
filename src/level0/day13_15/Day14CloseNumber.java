package level0.day13_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** 가까운 수
 *
 *  정수 배열 array와 정수 n이 매개변수로 주어질 때,
 *  array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.
 *
 *
 */
public class Day14CloseNumber {
    public static int solution(int[] array, int n) {
        // (n - 배열원소)가 담긴, 차의 배열
        int[] diffArray = Arrays.stream(array).map(num -> Math.abs(n - num)).toArray();
        // 차의 배열에서 가장 작은 값
        int min = Arrays.stream(diffArray).min().getAsInt();

        List<Integer> list = new ArrayList<>();

        // 차의 배열에서 절대값이 가장 작은 값의 인덱스를 리스트에 추가
        for (int i = 0; i < diffArray.length; i+=1){
            if(diffArray[i] == min)//
                list.add(i); // 가장 가까운 수가 하나가 아닐 수도 있으므로 인덱스를 List에 담는다.
        }

        // 인덱스의 리스트를 얻었으므로, array의 원소들을 담은 스트림에서 가장 작은 값을 반환한다.
        return list.stream().map(i -> array[i]).mapToInt(Integer::intValue).min().getAsInt();
    }

    public static void main(String[] args) {
            System.out.println(solution(new int[]{3, 10, 28}, 20));
    }
}











