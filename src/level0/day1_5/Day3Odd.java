package level0.day1_5;

import java.util.Arrays;

public class Day3Odd {
    public static int[] solution(int n) {
        int odd = 0;

        if (n % 2 != 0){ // 홀수일 경우 배열 크기 odd(1)만큼 증가
            odd = 1;
        }
        int[] answer = new int[n / 2 + odd]; // 홀수의 경우 배열크기 n / 2 + 1로 초기화

        int idx = 0;
        for (int i = 1; i <= n; i +=2){ // i는 1, 3, 5... 이렇게 차례로 삽입
            answer[idx] = i;
            idx++;
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] solution = solution(9);
        Arrays.stream(solution).forEach(System.out::println);
    }
}
