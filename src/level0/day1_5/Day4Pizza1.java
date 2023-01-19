package level0.day1_5;

public class Day4Pizza1 {
    public static int solution(int n) {
        int quotient = n / 7; // 몫
        if (n % 7 != 0){
            return ++quotient;
        }
        return quotient;
    }

    public static void main(String[] args) {
        System.out.println(solution(14));
    }
}
