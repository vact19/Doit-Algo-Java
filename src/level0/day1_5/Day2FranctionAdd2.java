package level0.day1_5;

public class Day2FranctionAdd2 {
    public static int gcd(int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        while (b > 1) {
            int r = a % b;
            if (r == 0) break;
            a = b;
            b = r;
        }
        return b;
    }

    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // X자로 곱하여 분자 계산, 분모끼리 곱하여 분모 계산
        int[] answer = new int[2];
        answer[0] = numer1 * denom2 + numer2 * denom1; // 분자
        answer[1] = denom1 * denom2; // 분모

        System.out.println("기약분수 확인 전 " + answer[0] + " " + answer[1]);

        // 이미 기약분수일 경우 최대공약수 gcd가 1이기 때문에 answer 배열은 변하지 않는다.
        // 그래서 기약분수인지 아닌지에 따라 분기하지 않는다.
        int gcd = gcd(answer[0], answer[1]);
        answer[0] /= gcd;
        answer[1] /= gcd;

        System.out.println("기약분수 확인 후 " + answer[0] + " " + answer[1]);
        return answer;
    }

    // 분수 덧셈 하기
    public static void main(String[] args) {
        solution(1, 2, 3, 4);
    }
}














