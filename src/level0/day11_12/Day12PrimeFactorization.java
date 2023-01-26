package level0.day11_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** 소인수분해
 *
 * 소인수분해란 어떤 수를 소수들의 곱으로 표현하는 것입니다.
 * 예를 들어 12를 소인수 분해하면 2 * 2 * 3 으로 나타낼 수 있습니다.
 * 따라서 12의 소인수는 2와 3입니다. 자연수 n이 매개변수로 주어질 때
 * n의 소인수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
 */
public class Day12PrimeFactorization {

    public static int[] solution(int n) {
        int i =2; // 가장 작은 소수

        List<Integer> list = new ArrayList<>(); // 소수가 몇 개가 생길지 알 수 없으므로 list

        while (n >= 2){
            if (n % i == 0){
                list.add(i);
                n /= i;
            } else {
                i++;
            }
        }
        return list.stream().distinct().mapToInt(num -> num.intValue()).toArray();
    }

    public static void main(String[] args) {
            System.out.println(Arrays.toString(solution(12)));
    }
}
