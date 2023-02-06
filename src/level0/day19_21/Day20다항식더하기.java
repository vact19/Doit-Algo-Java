package level0.day19_21;

import java.util.Arrays;

/**
 *  한 개 이상의 항의 합으로 이루어진 식을 다항식이라고 합니다.
 *  다항식을 계산할 때는 동류항끼리 계산해 정리합니다. 덧셈으로 이루어진 다항식
 *  polynomial이 매개변수로 주어질 때, 동류항끼리 더한 결괏값을 문자열로
 *  return 하도록 solution 함수를 완성해보세요. 같은 식이라면 가장 짧은 수식을 return 합니다.
 *  결괏값에 상수항은 마지막에 둡니다.

 *  "3x + 7 + x"	"4x + 7"
 */
public class Day20다항식더하기 {
    public static String solution(String polynomial) {
        /**
         *  계수가 1인 x의 일차항의 수 +
         *  2이상의 계수가 있는 x의 계수를 더한 값 n이 있을 때, nx로 표현하면 된다.
         */
        String[] splited = polynomial.split(" ");
        // 상수항의 합
        int sumOfConstant = Arrays.stream(splited)
                .filter(s -> !s.contains("x")) // 3x와 x를 모두 거른다.
                .filter(s -> !s.equals("+"))
                .mapToInt(Integer::parseInt)
                .sum();

        // 계수가 1인 X의 일차항
        long singleXCount = Arrays.stream(splited)
                .filter(s -> "x".equals(s))
                .count();

        // 계수의 합
        int sumOfCoefficient = Arrays.stream(splited)
                .filter(s -> s.contains("x")) // x의 일차항만 찾는다.
                .filter(s -> s.length() >= 2) // 2 이상의 계수가 있는 X 일차항을 찾는다.
                .map(s -> s.split("x")[0]) // 첫 글자(숫자)만 추출
                .mapToInt(Integer::parseInt)
                .sum()
                + (int) singleXCount;

        if (sumOfCoefficient <= 0)
            return String.valueOf(sumOfConstant);
        else if (sumOfConstant <= 0)
            // 계수가 1일 경우 x를, 1보다 큰 n일 경우 nx를 출력하는 메소드
            return skipCoefficient1(sumOfCoefficient, "x");
        return skipCoefficient1(sumOfCoefficient, "x") + " + " + sumOfConstant;
    }

    private static String skipCoefficient1(int sumOfCoefficient, String x){
        return sumOfCoefficient == 1 ? "x" : sumOfCoefficient + x;
    }

    
    public static void main(String[] args) {
            System.out.println(solution("x"));
    }
}












