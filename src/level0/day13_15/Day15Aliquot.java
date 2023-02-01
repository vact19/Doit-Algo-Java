package level0.day13_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** 약수 구하기
 *
 *  정수 n이 매개변수로 주어질 때,
 *  n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
 */
public class Day15Aliquot {
    public static int[] solution(int n) {
        int sqrt = (int) Math.sqrt(n); // 100의 제곱근은 10
        List<Integer> list = new ArrayList<>(); // 약수 받을 ArrayList

        for(int i = 1; i <= sqrt; i++){
            if(n % i == 0){ // 약수 중 작은 수 저장
                list.add(i);
                if(n / i != i){ // 약수 중 큰 수 저장
                    list.add(n / i);
                }
            }
        }

        return list.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
            System.out.println(Arrays.toString(solution(24)));
    }

}
