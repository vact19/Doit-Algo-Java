package level0.day1_5;

public class Day4Pizza2 {
    public static int solution(int n) {
        for (int i = 6; i / 6 <= n; i+=6){
            if (i % n == 0)
                return i / 6;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(solution(17));
    }
}
