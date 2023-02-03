package level1.p12906;

import java.util.Arrays;
import java.util.Stack;

/** 같은 숫자는 싫어
 *
 * 배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다.
 * 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다.
 * 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 예를 들면,
 *
 * arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
 * arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
 * 배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.
 */
public class 같은숫자는싫어 {
    public static int[] solution(int []arr) {
        // 스택 안써도 되긴 할듯
        Stack<Integer> stack = new Stack<>();

        // EmptyStackException 방지용
        stack.push(arr[0]);

        // 1부터 반복 시작
        for (int i =1; i < arr.length; i+=1){
            if (stack.peek() != arr[i])
                stack.push(arr[i]);
            // 스택의 top과 arr[i]가 같으면 아무것도 하지 않는다.
        }

        //int는 Generic 불가. 그래서 배열로 변환하는 stack.toArray(T[] a) 사용 불가
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
            System.out.println(Arrays.toString(solution(new int[]{1, 1, 3, 3, 0, 1, 1})));
    }
}
