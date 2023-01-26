package level0.day9_10;

/**
 * 머쓱이는 친구들과 동그랗게 서서 공 던지기 게임을 하고 있습니다.
 * 공은 1번부터 던지며 오른쪽으로 한 명을 건너뛰고
 * 그다음 사람에게만 던질 수 있습니다. 친구들의
 * 번호가 들어있는 정수 배열 numbers와 정수 K가 주어질 때, k번째로 공을 던지는 사람의 번호는
 * 무엇인지 return 하도록 solution 함수를 완성해보세요.
 *
 * [1, 2, 3, 4, 5, 6]	5	3
 */
public class Day10Ball {

    public static int solution2(int[] numbers, int k) {
        int answer = 0;
        int index = 0;

        for (int i = 1; i < k; i++){
            index +=2;
        }
        index %= numbers.length;
        answer = numbers[index];
        return answer;
    }


    public static int solution(int[] numbers, int k) {
        int nth = 0;
        if (numbers.length % 2 == 0){ // 배열 길이가 짝수일 때
            nth = k;
            if (k > numbers.length / 2)
                nth = k % (numbers.length / 2);

            // 1번째로 던지는 사람이면 1번이며, 5번째로 던지는 사람은 5 * 2 -1 번이다.
            return nth == 1 ? 1 : (nth * 2 - 1);
        }

        // 배열 길이가 홀수일 때
        /**
         *  배열 길이가 홀수일 경우, 배열 길이만큼의 사람수가 한 번씩 공을 던졌을 때
         *  다시 1부터 시작하는 사이클이 생긴다.
         */
        nth = k % numbers.length;
        if (nth == 0){
            // k가 배열 길이와 같을 시, 한 사이클에서 마지막으로 던지는 사람으로 취급
            return numbers[numbers.length - 2];
        }

        // 배열 길이가 5이며, nth번째의 nth가 5 / 2 + 1번째보다 뒤일 때, 그 사람의 번호는 nth * 2
        if (nth > numbers.length / 2 + 1){
            return nth * 2;
        }
        // 1번째로 던지는 사람이면 1번이며, 3번째로 던지는 사람은 3 * 2 -1 번이다.
        return nth == 1 ? 1 : (nth * 2 - 1);
    }

    public static void main(String[] args) {
            System.out.println(solution(new int[]{1, 2, 3}, 333));
    }
}



