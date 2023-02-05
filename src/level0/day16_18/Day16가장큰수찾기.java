package level0.day16_18;

import java.util.Arrays;

/**
 *
 * 정수 배열 array가 매개변수로 주어질 때, 가장 큰 수와 그 수의 인덱스를 담은
 * 배열을 return 하도록 solution 함수를 완성해보세요.
 *
 * 1 ≤ array의 길이 ≤ 100
 * 0 ≤ array 원소 ≤ 1,000
 * array에 중복된 숫자는 없습니다.
 *
 * [9, 10, 11, 8]	[11, 2]
 */
public class Day16가장큰수찾기 {
    public static int[] solution(int[] array) {
        // 정렬해서 최대값을 찾기 위해 원본 복사
        int[] clonedArray = array.clone();
        Arrays.sort(clonedArray);
        int maxVal = clonedArray[clonedArray.length - 1];

        // 원본 배열에서 해당 최대값을 찾아 인덱스 반환
        return new int[]{maxVal, Arrays.binarySearch(array, maxVal)};
    }

    public static void main(String[] args) {
            System.out.println(Arrays.toString(solution(new int[]{9, 10, 11, 8})));
    }
}













