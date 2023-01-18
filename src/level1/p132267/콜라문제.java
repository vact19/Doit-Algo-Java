package level1.p132267;

public class 콜라문제 {

    public static int solution(int a, int b, int n){

        /**
             빈 병 a개를 가져다주면 콜라 b병을 가져다준다. n개를 가져다주면 총 몇 병을 받을 수 있는가?
             a :  교환을 위한 빈 콜라병의 수
             b :  a를 가져다주면 마트가 주는 콜라병의 수
             n :  상빈이가 교환할 빈 콜라병의 수
        */
        int remaining = n; // 현재 보유한 빈 병
        int answer = 0; // 교환받은 콜라병의 총 개수
        int remainingAfterTrade = 0;
        int newCola = 0;
        // 1. 빈 병 n개를 가져다준다.
        // 2. n / a * b 개만큼 콜라병을 받고, 나머지 빈 병을 기록한다.
        // 3. (나머지 빈 병) + (2에서 받은 콜라병) 이 현재 보유한 빈 병(remaining)이다.
        // 4. remaining 이 a보다 작을 경우 멈추고, 그렇지 않을 경우 1번부터 반복한다.

        // 1~3은 반복문 내부에 있어야 할 듯
        while (true){
            remainingAfterTrade = remaining % a; // 처음 교환 후 남은 병
            newCola = remaining / a * b; // 교환받은 콜라병
            answer += newCola; // 일단 누적하기
            remaining = newCola + remainingAfterTrade; // 3번 로직. 교환한 콜라병 + 나머지병이 현재 보유중인 빈 병
            if (remaining < a){
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int a = 2; // 교환을 위한 빈 콜라병의 수
        int b = 1; // a를 가져다주면 마트가 주는 콜라병의 수
        int n = 20; // 상빈이가 교환할 빈 콜라병의 수

        int result = solution(a, b, n);
        System.out.println("result = " + result);

    }
}
