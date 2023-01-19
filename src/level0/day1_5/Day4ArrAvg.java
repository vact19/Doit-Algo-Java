package level0.day1_5;

public class Day4ArrAvg {
    public static double solution(int[] numbers) {
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        return (sum * 1.0) / numbers.length;
    }
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }
}
