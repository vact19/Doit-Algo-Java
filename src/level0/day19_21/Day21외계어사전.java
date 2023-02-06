package level0.day19_21;

/**
 * PROGRAMMERS-962 행성에 불시착한 우주비행사 머쓱이는
 * 외계행성의 언어를 공부하려고 합니다.
 * 알파벳이 담긴 배열 spell과 외계어 사전 dic이 매개변수로 주어집니다.
 * spell에 담긴 알파벳을 한번씩만 모두 사용한 단어가 dic에 존재한다면 1,
 * 존재하지 않는다면 2를 return하도록 solution 함수를 완성해주세요.
 *
 * 중복된 문자나 단어는 등장하지 않는다.
 */
public class Day21외계어사전 {
    public static int solution(String[] spell, String[] dic) {

        for (String word : dic) {
            int count = 0;

            for (String character : spell) {
                if (word.contains(character))
                    count+=1;
            }
            // 해당 단어가 문자를 모두 포함하고 있는지?
            if (count == spell.length)
                return 1;
        }
        // spell을 모두 포함하는 단어를 찾지 못함.
        return 2;
    }
    
    public static void main(String[] args) {
            System.out.println(solution(new String[]{"p", "o", "s"}, new String[]{"sod", "oooopppsss", "qixm", "adio", "soo"}));
    }
}
