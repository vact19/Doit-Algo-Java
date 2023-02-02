package level2.p12909;

/**
 * 괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다.
 * 예를 들어
 * "()()" 또는 "(())()" 는 올바른 괄호입니다.
 * ")()(" 또는 "(()(" 는 올바르지 않은 괄호입니다.
 * '(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때,
 * 문자열 s가 올바른 괄호이면 true를 return 하고, 올바르지 않은 괄호이면 false를
 * return 하는 solution 함수를 완성해 주세요.
 */
public class 올바른괄호 {
    static boolean solution(String s) {
        char[] charArray = s.toCharArray();

        int left = 0; // 왼쪽 괄호
        int right = 0; // 오른쪽 괄호

        for (char bracket : charArray) {
            if (bracket == '(')
                left++;
            else
                right++;

            // 매 반복마다 검사해야 함.
            if (left < right) // 닫는 괄호가 더 많은 순간이 있다면 올바른 괄호가 아님.
                return false;
        }
        return left == right; // 괄호가 올바르게 닫혔는지
    }

    public static void main(String[] args) {
        System.err.println("안아줘요");
            System.out.println(solution("(())()"));
    }
}
