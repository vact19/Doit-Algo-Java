package level0.day9_10;

import java.util.Arrays;

/** 배열 회전시키기
 *  정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다.
 *  배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을
 *  return하도록 solution 함수를 완성해주세요.
 *
 *  [1, 2, 3]	"right"	[3, 1, 2]
 */
public class Day10TurningArray {

    public static int[] solution(int[] numbers, String direction) {
        int temp = 0;
        if (direction.equals("right")){
            temp = numbers[numbers.length - 1]; // 반복이 끝나고 배열 맨 앞에 채워넣을 값
            for (int i = numbers.length - 1; i > 0; i-=1){
                numbers[i] = numbers[i - 1];
            }
            numbers[0] = temp;

        } else { // direction left
            temp = numbers[0]; // 반복이 끝나고 배열 맨 끝에 채워넣을 값
            for (int i = 0; i < numbers.length - 1; i+=1){
                numbers[i] = numbers[i + 1];
            }
            numbers[numbers.length - 1] = temp;
        }

        return numbers;
    }

    public static void main(String[] args) {
            System.out.println(Arrays.toString(solution(new int[]{1, 2, 3}, "rignt")));
    }
}
