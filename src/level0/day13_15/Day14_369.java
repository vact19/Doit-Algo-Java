package level0.day13_15;

import java.util.Arrays;

/** 369게임
 *
 * 머쓱이는 친구들과 369게임을 하고 있습니다. 369게임은 1부터 숫자를 하나씩 대며
 * 3, 6, 9가 들어가는 숫자는 숫자 대신 3, 6, 9의 개수만큼 박수를 치는 게임입니다.
 * 머쓱이가 말해야하는 숫자 order가 매개변수로 주어질 때,
 * 머쓱이가 쳐야할 박수 횟수를 return 하도록 solution 함수를 완성해보세요.
 *
 * 29423	2
 */
public class Day14_369 {
    public static int solution(int order) {
        // 숫자를 문자열 한 글자의 배열로 바꾼다.
        String[] splited = String.valueOf(order).split("");
        return (int) Arrays.stream(splited).filter(s -> is369(s)).count();
    }
    private static boolean is369(String str){
        return str.equals("3") | str.equals("6") | str.equals("9");
    }
    public static void main(String[] args) {
            System.out.println(solution(29423));
    }

}
