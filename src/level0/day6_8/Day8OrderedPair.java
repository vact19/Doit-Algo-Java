package level0.day6_8;

import java.util.ArrayList;
import java.util.List;

/** 순서쌍의 개수
 *
 * 순서쌍이란 두 개의 숫자를 순서를 정하여 짝지어 나타낸 쌍으로 (a, b)로 표기합니다.
 * 자연수 n이 매개변수로 주어질 때 두 숫자의 곱이 n인 자연수 순서쌍의 개수를
 * return하도록 solution 함수를 완성해주세요.
 */
public class Day8OrderedPair {
    public static int numOfAliquot(int n) {

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
        return list.size();
    }

    public static int solution(int n) {
        return numOfAliquot(n);
    }

    public static void main(String[] args) {
            System.out.println(solution(100));
    }

}
