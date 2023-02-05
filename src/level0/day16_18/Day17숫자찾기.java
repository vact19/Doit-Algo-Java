package level0.day16_18;

import java.util.Arrays;

/**
 * 정수 num과 k가 매개변수로 주어질 때, num을 이루는 숫자 중에 k가 있으면
 * num의 그 숫자가 있는 자리 수를 return하고 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
 *
 * 29183	1	3
 */
public class Day17숫자찾기 {
    // 사실 String.indexOf() 쓰면 된다!
    public static int solution(int num, int k) {
        char[] numbers = String.valueOf(num).toCharArray();
        System.out.println("numbers = " + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i+=1){
            if (Integer.parseInt(String.valueOf(numbers[i])) ==  k)
                return i + 1; // index가 아닌 자릿수 반환임
        }
        return -1;
    }

    public static void main(String[] args) {
            System.out.println(solution(29183, 1));
    }
}
