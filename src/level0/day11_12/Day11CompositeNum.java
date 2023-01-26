package level0.day11_12;

/** 합성수 찾기
 *
 *약수의 개수가 세 개 이상인 수를 합성수라고 합니다.
 * 자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를
 * return하도록 solution 함수를 완성해주세요.
 */
public class Day11CompositeNum {
    public static boolean isPrime(int num){
        if (num <= 3){
            return true;
        }
        if (num % 2 == 0){
            return false;
        }

        for(int i=3; i*i<=num; i+=2){ // num의 제곱근까지만 검사
            if(num % i == 0) return false;
        }
        return true;
    }
    public static int solution(int n) {
        int count = 0;
        for (int i = 1; i <= n; i+=1){
            if (isPrime(i) == false)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
            System.out.println(solution(15));
    }
}
