package level0.day1_5;

public class Day2FranctionAdd {
    private static int gcd(int n, int m) {
        int r;
        while(m > 0) {
            r = n % m;
            n = m;
            m = r;
        }
        return n;
    }

    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] solution = new int[2];

        int n = denom1;
        int m = denom2;
        // 두 수에서 더 큰 수를 denom1 으로 지정
        if(n < m) {
            int temp = n;
            n = m;
            m = temp;
        }

        // 최대공약수 구하기
        solution[0] = gcd(n, m);

        // 최소공배수 구하기
        solution[1] = denom1 * denom2 / solution[0];

        System.out.println(solution[0] + " 그리고 " + solution[1]);

        int multiplyNum1 = solution[1] / denom1;
        int multiplyNum2 = solution[1] / denom2;
        System.out.println("numer1에는 " + multiplyNum1 + " 를 곱한다");
        System.out.println("numer2에는 " + multiplyNum2 + " 를 곱한다");

        numer1 *= multiplyNum1;
        denom1 *= multiplyNum1;
        numer2 *= multiplyNum2;
//        denom2 *= multiplyNum2;

        int[] answer = new int[2];
        answer[0] = numer1 + numer2;
        answer[1] = denom1; // 이미 num1, num2가 공통분모이므로 더하지 않고 둘 중 하나만 가져온다.

        System.out.println("기약분수 확인 전 " + answer[0] + " " + answer[1]);

        n = answer[0];
        m = answer[1];
        // 두 수에서 더 큰 수를 denom1 으로 지정
        if(n < m) {
            int temp = n;
            n = m;
            m = temp;
        }
        int gcd = gcd(n, m);
        if(gcd != 1){
            answer[0] /= gcd;
            answer[1] /= gcd;
            System.out.println("기약분수 확인 후 " + answer[0] + " " + answer[1]);
            return answer;
        } else
            return answer;
    }

    // 분수 덧셈 하기
    public static void main(String[] args) {
        int[] answer = solution(4, 4, 4, 4);
    }
}














