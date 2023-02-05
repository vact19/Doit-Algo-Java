package level0.day16_18;

import java.util.Arrays;

/**
 * 덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는
 * 문자열 배열 quiz가 매개변수로 주어집니다. 수식이 옳다면 "O"를
 * 틀리다면 "X"를 순서대로 담은 배열을 return하도록 solution 함수를 완성해주세요.
 */
public class Day17OX퀴즈 {
    public static String[] solution(String[] quiz) {
        // quiz 배열 자리에 O, X를 덮어쓴다.
        for (int i = 0; i < quiz.length; i+=1)
            quiz[i] = isCorrectExpression(quiz[i]) ? "O" : "X";
        return quiz;
    }

    private static boolean isCorrectExpression(String quiz) {
        String[] splitedQuiz = quiz.split(" ");

        if ("+".equals(splitedQuiz[1]))
            return Integer.parseInt(splitedQuiz[0]) + Integer.parseInt(splitedQuiz[2]) == Integer.parseInt(splitedQuiz[4]);
        else
            return Integer.parseInt(splitedQuiz[0]) - Integer.parseInt(splitedQuiz[2]) == Integer.parseInt(splitedQuiz[4]);
    }

    public static void main(String[] args) {
            System.out.println(Arrays.toString(solution(new String[]{"3 - 4 = -3", "5 + 6 = 11"})));
    }
}
