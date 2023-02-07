package level0.day22_23;

import java.util.HashSet;

/**
 *  소수점 아래 숫자가 계속되지 않고 유한개인 소수를 유한소수라고 합니다.
 *  분수를 소수로 고칠 때 유한소수로 나타낼 수 있는 분수인지 판별하려고 합니다.
 *  유한소수가 되기 위한 분수의 조건은 다음과 같습니다.
 *
 * 기약분수로 나타내었을 때, 분모의 소인수가 2와 5만 존재해야 합니다.
 * 두 정수 a와 b가 매개변수로 주어질 때, a/b가 유한소수이면 1을,
 * 무한소수라면 2를 return하도록 solution 함수를 완성해주세요.
 *
 * 11	22	1
 * 12	21	2
 */
public class Day22유한소수판별하기 {
    public static int solution(int a, int b) {
        // 기약분수로 만든 분수의 분모만이 필요하다.
        b = b / getGcd(a, b); // 기약분수 분모 b
        if (b == 1) // b가 1일 때 (즉 a / b 자체가 정수일 때). 정수 == 유한소수
            return 1;

        // 소인수가 몇 번 등장하는지는 중요하지 않으므로 중복불허 Set
        HashSet<Integer> set = new HashSet<>();

        // 소인수를 구해서 set에 담는다.
        for (int i = 2; i <= b; i++){
            while (b % i == 0){
                set.add(i); // 소인수 add
                b /= i;
            }
            // 중복을 허용하지 않으므로 size가 3 이상이라는 것은
            // Set에 2와 5가 아닌 다른 소인수가 들어갔다는 것.
            if (set.size() >= 3)
                return 2;
        }

        if (set.size() == 1){
            if (set.contains(2) || set.contains(5))
                return 1;
        }
        // size가 2일 경우
        if (set.contains(2) && set.contains(5))
            return 1;

        return 2;
    }
    public static int getGcd(int a, int b) {
        if(a%b==0) {
            return b;
        }
        return getGcd(b, a%b);
    }
    public static void main(String[] args) {
            System.out.println(solution(7, 20));
    }
}











