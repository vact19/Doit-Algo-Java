package level0.day9_10;

import java.util.Arrays;

/**
 *  정수 배열 num_list와 정수 n이 매개변수로 주어집니다. num_list를
 *  다음 설명과 같이 2차원 배열로 바꿔 return하도록 solution 함수를 완성해주세요.
 *
 * num_list가 [1, 2, 3, 4, 5, 6, 7, 8] 로 길이가 8이고 n이 2이므로 num_list를
 * 2 * 4 배열로 다음과 같이 변경합니다.
 * 2차원으로 바꿀 때에는 num_list의 원소들을 앞에서부터 n개씩 나눠 2차원 배열로 변경합니다.
 *
 * num_list / n / result
 * [1, 2, 3, 4, 5, 6, 7, 8]	2	[[1, 2], [3, 4], [5, 6], [7, 8]]
 */
public class Day10TwoDimension {
    public static int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n]; // 2차원 배열 사이즈 초기화

        int col_length = answer[0].length;
        int row_length = answer.length;

        int num_list_idx = 0;
        for (int row = 0; row < row_length; row+=1){
            for (int col = 0; col < col_length; col+=1){
                answer[row][col] = num_list[num_list_idx];
                num_list_idx ++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
            System.out.println(Arrays.deepToString(solution(new int[]{1, 2, 3, 4, 5, 6}, 2)));
    }
}
