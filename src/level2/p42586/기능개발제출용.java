package level2.p42586;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** 기능개발
 *
 * 프로그래머스 팀에서는 기능 개선 작업을 수행 중입니다.
 * 각 기능은 진도가 100%일 때 서비스에 반영할 수 있습니다.
 *
 * 또, 각 기능의 개발속도는 모두 다르기 때문에 뒤에 있는 기능이 앞에 있는 기능보다
 * 먼저 개발될 수 있고, 이때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포됩니다.
 *
 * 먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses와
 * 각 작업의 개발 속도가 적힌 정수 배열 speeds가 주어질 때 각 배포마다 몇 개의 기능이 배포되는지를
 * return 하도록 solution 함수를 완성하세요.
 *
 * [93, 30, 55]	[1, 30, 5]	[2, 1]
 * [95, 90, 99, 99, 80, 99]	[1, 1, 1, 1, 1, 1]	[1, 3, 2]
 */
public class 기능개발제출용 {
    public static int[] solution(int[] progresses, int[] speeds) {
        // (100 - 진도) / 속도
        // (100 - 진도) % 속도가 0이 아니면 1을 더함.
        // 그게 완성까지의 소요일임

        // 첫번째 작업의 완성 소요일 * 속도를 작업에 모두 더함

        // 포인터를 하나 두고,
        // 1. 현재 포인터 작업 완성
        // 2. 현재 포인터의 바로 뒷칸도 완료되었는지 확인.
        // 3. 2번 작업을 반복하면서, 한 번 배포할 때 몇 개의 기능을 배포할 수 있는지 deployedFeats++
        int ptr = 0;
        int days = 0;
        int deployedFeats = 0;
        List<Integer> list = new ArrayList<>(); // 반환할 배열의 길이를 알 수 없으므로, 일단 리스트를 사용한다.

        while (ptr < progresses.length){
            // 맨 마지막 작업만이 남았다면, 아래 로직을 수행할 필요 없이 리스트에 1을 추가하고 break;
            if (ptr == progresses.length - 1){
                list.add(1);
                break;
            }
            deployedFeats = 1; // 아래 작업을 수행하면서 반드시 1개 이상의 작업이 배포된다.
            days = (100 - progresses[ptr]) / speeds[ptr];

            // 나머지가 존재하면 (5% 남았는데 속도는 4%라서 몫이 1이 나왔다면)
            if ( (100 - progresses[ptr]) % speeds[ptr] > 0)
                days++; // days 1 증가

            // 현재 ptr에 해당하는 진도가 100이 될 때까지 작업을 진행
            for (int i = 0; i < progresses.length; i+=1){
                progresses[i] += days * speeds[i];
            }


            while (true){
                if (ptr + deployedFeats >= progresses.length)
                    break;
                if (progresses[ptr + deployedFeats] >= 100){ // ptr 증가식
                    deployedFeats++;
                    continue;
                }
                break;
            }
            ptr += deployedFeats;
            list.add(deployedFeats);
            System.out.println(list);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public static void main(String[] args) {
            System.out.println(Arrays.toString(solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1})));
    }
}


















