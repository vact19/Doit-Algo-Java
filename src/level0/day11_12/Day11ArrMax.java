package level0.day11_12;

/** 최댓값 만들기
 *
 * 정수 배열 numbers가 매개변수로 주어집니다.
 * numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을
 * return하도록 solution 함수를 완성해주세요.
 */
public class Day11ArrMax {

    public static int[] maxValOfArray(int[] arr){
        int max = arr[0];
        int idx = 0;
        for (int i = 0; i < arr.length; i+=1){
            if (max < arr[i]){
                max = arr[i];
                idx = i;
            }
        }
        return new int[]{idx, max};
    }

    public static int solution(int[] numbers) {
        int[] idx_max = maxValOfArray(numbers);
        int max1 = idx_max[1];

        numbers[idx_max[0]] = 0; // numbers의 현재 최대값 지우기
        int[] idx_max2 = maxValOfArray(numbers);
        int max2 = idx_max2[1];

        return max1 * max2;
    }

    public static void main(String[] args) {
            System.out.println(solution(new int[]{1, 2, 3, 4, 5}));
    }
}









