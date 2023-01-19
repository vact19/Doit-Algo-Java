package level0.day9_10;

/** 가위 바위 보
 *
 *  가위는 2 바위는 0 보는 5로 표현합니다.
 *  가위 바위 보를 내는 순서대로 나타낸 문자열 rsp가 매개변수로 주어질 때,
 *  rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을
 *  return하도록 solution 함수를 완성해보세요.
 */
public class Day9RSP {
    /**
     *   1. 입력문자열을 char 배열로 바꾼다.
     *   2. 배열을 순회하며 이기는 수를 StringBuilder 이용하여 채워간다.
     */
    public static String solution(String rsp) {
        // 1. char 배열화
        char[] charArr = rsp.toCharArray();
        StringBuilder sb = new StringBuilder();

        // 2. 배열 순회
        for (char c : charArr) {
            // enhanced switch java14부터
            switch (c){
                case '2' : sb.append('0');
                    break;
                case '0' : sb.append('5');
                    break;
                case '5' : sb.append('2');
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
            System.out.println(solution("205"));
    }
}
