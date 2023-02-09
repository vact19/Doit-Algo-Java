package level2.p42587;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 일반적인 프린터는 인쇄 요청이 들어온 순서대로 인쇄합니다. 그렇기 때문에 중요한 문서가 나중에 인쇄될 수 있습니다.
 * 이런 문제를 보완하기 위해 중요도가 높은 문서를 먼저 인쇄하는 프린터를 개발했습니다.
 * 이 새롭게 개발한 프린터는 아래와 같은 방식으로 인쇄 작업을 수행합니다.
 *
 * 1. 인쇄 대기목록의 가장 앞에 있는 문서(J)를 대기목록에서 꺼냅니다.
 * 2. 나머지 인쇄 대기목록에서 J보다 중요도가 높은 문서가 한 개라도 존재하면 J를 대기목록의 가장 마지막에 넣습니다.
 * 3. 그렇지 않으면 J를 인쇄합니다.
 * 예를 들어, 4개의 문서(A, B, C, D)가 순서대로 인쇄 대기목록에 있고 중요도가 2 1 3 2 라면 C D A B 순으로 인쇄하게 됩니다.
 *
 * 내가 인쇄를 요청한 문서가 몇 번째로 인쇄되는지 알고 싶습니다. 위의 예에서 C는 1번째로, A는 3번째로 인쇄됩니다.
 * 현재 대기목록에 있는 문서의 중요도가 순서대로 담긴 배열 priorities와 내가 인쇄를 요청한 문서가
 * 현재 대기목록의 어떤 위치에 있는지를 알려주는 location이 매개변수로 주어질 때,
 * 내가 인쇄를 요청한 문서가 몇 번째로 인쇄되는지 return 하도록 solution 함수를 작성해주세요.
 *
 * 현재 대기목록에는 1개 이상 100개 이하의 문서가 있습니다.
 * 인쇄 작업의 중요도는 1~9로 표현하며 숫자가 클수록 중요하다는 뜻입니다.
 * location은 0 이상 (현재 대기목록에 있는 작업 수 - 1) 이하의 값을 가지며 대기목록의 가장 앞에 있으면 0,
 * 두 번째에 있으면 1로 표현합니다.
 *
 * [2, 1, 3, 2]	2	1
 */
public class 프린터로그제거 {
    // location 은 0-based index임
    public static int solution(int[] priorities, int location) {
        /**  같은 중요도면서 다른 문서가 있을 수 있으므로, location에 해당하는 문서는
         *  +10의 중요도로 저장하고, 중요도를 구할 땐  n % 10으로 구한다. 들어오는 중요도는 1 ~ 9이다.
         *
         *  1. 대기목록에서 poll
         *  2. 중요도 순회
         *      2.1 polled 가 중요도 단독 혹은 공동 1위라면 그대로 인쇄
         *          2.1.1 여기서 10으로 나눴을때 몫이 1 이상이다? 그러면 count를 바로 리턴
         *      2.2 polled 가 중요도 낮으면 queue.offer()
         */
        // 큐 초기화 작업. 배열의 요소들을 queue에 채운다.
        Queue<Integer> intQueue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++){
            if (i == location)
                intQueue.offer(priorities[i] + 10);
            else
                intQueue.offer(priorities[i]);
        } // 큐 초기화 작업 종료


        int count = 0;
        while (true){ // 출력작업 시작
            Integer polled = intQueue.poll();
            if (isMaxPriority(intQueue, polled)){ // 중요도가 단독 혹은 공동 1위일 때
                // 인쇄한다. 그런데 처음 낙인 찍어둔 그 숫자면 반복문 탈출한다.
                count++;
                if (polled / 10 >= 1)
                    return count;
            } else { // 우선순위가 밀릴 때
                // front 에서 가져온 값을 다시 rear 에 넣는다.
                intQueue.offer(polled);
            }
        }
    }

    // 아래에서 비교되는 Integer들은 0~9에 10을 더한 값이기 때문에 %= 10으로 연산한다.
    private static boolean isMaxPriority(Queue<Integer> intQueue, Integer polled) {
        polled %= 10;
        // Iterable을 구현한 클래스는 foreach 가능하다.
        for (Integer priority : intQueue) {
            priority %= 10;
            // 큐의 나머지 원소 중에서 우선순위가 더 높은 원소가 하나라도 있으면 false
            if (polled < priority)
                return false;
        }
        return true;
    }

    /**
     *  boolean Offer.
     *  E Poll (remove and return),
     *  E Peek
     */
    public static void main(String[] args) {
            System.out.println(solution(new int[]{2, 1, 3, 2}, 3) + "번째에 location 3이 출력됨");
    }

}
