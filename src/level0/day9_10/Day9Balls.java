package level0.day9_10;

// 안해
public class Day9Balls {
    public static int fact(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static int solution(int balls, int share) {
        int numer = fact(balls);
        int i = numer / (fact(balls - share) * fact(share));
        return i;
    }
    
    public static void main(String[] args) {
            System.out.println(solution(30, 4));
    }
}
