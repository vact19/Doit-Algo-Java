package level0.day1_5;

public class Day1Divide     {
    public static int solution(int num1, int num2) {
        double n1 = (double) num1 / num2;
        return (int) (n1 * 1000);
    }
    public static void main(String[] args) {
        System.out.println(solution(3, 2));

    }
}
