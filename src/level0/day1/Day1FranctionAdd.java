package level0.day1;

import java.util.Arrays;

public class Day1FranctionAdd {
    private static int gcd(int n, int m) {
        int r;
        while(m > 0) {
            r = n % m;
            n = m;
            m = r;
        }
        return n;
    }

    public static int[] solution(int n, int m) {
        int[] answer = new int[2];

        // 두 수에서 더 큰 수를 n으로 지정
        if(n < m) {
            int temp = n;
            n = m;
            m = temp;
        }

        // 최대공약수 구하기
        answer[0] = gcd(n, m);

        // 최소공배수 구하기
        answer[1] = n * m / answer[0];

        return answer;
    }

    // 분수 덧셈 하기
    public static void main(String[] args) {
        int denum1 = 1;
        int num1 = 2;
        int denum2 = 3; // 분자
        int num2 = 4; // 분모

        // 분모의 최소공배수가 solution[1]에 남겨있다.
        int[] solution = solution(num1, num2);

        System.out.println(solution[0] + " 그리고 " + solution[1]);

        int multiplyNum1 = solution[1] / num1;
        int multiplyNum2 = solution[1] / num2;
        System.out.println("num1에는 " + multiplyNum1 + " 를 곱한다");
        System.out.println("num2에는 " + multiplyNum2 + " 를 곱한다");

        denum1 *= multiplyNum1;
        num1 *= multiplyNum1;
        denum2 *= multiplyNum2;
        num2 *= multiplyNum2;

        int[] answer = new int[2];
        answer[0] = denum1 + denum2;
        answer[1] = num1; // 이미 num1, num2가 공통분모이므로 더하지 않고 둘 중 하나만 가져온다.

        Arrays.stream(answer).forEach((element) -> System.out.print(element+", "));
    }
}














