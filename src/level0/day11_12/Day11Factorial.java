package level0.day11_12;

public class Day11Factorial {
    public static int solution(int n) {
        for (int i =1; i <= 11; i+=1){
            if (factorial(i) > n)
                return i - 1;
        }
        return -1;
    }
    public static int factorial(int n){
        int sum = 1;
        for (int i = 1; i <= n; i+=1){
            sum *= i;
        }
        return sum;
    }
    public static void main(String[] args) {
            System.out.println(solution(3628800));
    }
}
