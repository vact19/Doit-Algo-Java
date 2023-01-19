package level0.day6_8;

import java.util.Arrays;

/** 진료 순서 정하기
 *
 * 외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다.
 * 정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로
 * 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요.
 * 중복된 원소는 없다.
 *
 * [3, 76, 24] //입력
 * [3, 1, 2] // 출력
 */
public class Day8Ordering {

    public static int[] solution(int[] emergency) {
        // 복사해서 반환할 배열
        int[] result = new int[emergency.length];
        // result 배열의 인덱스
        int idx = 0;

        /** 바깥쪽 반복이 실행될 때마다 i번째로 큰 수를 찾아서 result 배열에 그 순위를 삽입한다.
         */
        for (int i = 0; i < emergency.length; i+=1){
            int max = 0;
            for (int j = 0; j < emergency.length; j+=1){
                if (max < emergency[j]){
                    max = emergency[j];
                    idx = j;
                }
            }
            // 안쪽의 반복이 끝나면 우선순위를 해당 인덱스에 놓는다.
            // 0번째 순회일 경우 result[idx]에 0 + 1 (1순위) 가 입력된다.
            result[idx] = i + 1;

            emergency[idx] = 0; // 한 번 최대값을 찾았으면 0으로 한다.
        }

        return result;
    }
    public static void main(String[] args) {
            System.out.println(Arrays.toString(solution(new int[]{3, 76, 24})));
    }
}
