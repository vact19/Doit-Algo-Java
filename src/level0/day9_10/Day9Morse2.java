package level0.day9_10;

import java.util.HashMap;
import java.util.Map;

public class Day9Morse2 {
    static String solution(String letter){
        String[] morse = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Map<String, Character> map = new HashMap<>();
        /**
         *  1. Map에 모스부호를 채워넣는다.
         *  2. 입력받은 letter를 공백을 기준으로 나눈다.
         *  3. 한 문자씩 Map에서 찾아서 문자열을 완성하고 반환한다.
         */
        // Map에 모스부호를 채워넣는다. <모스부호, 알파벳>
        for (int i = 0; i < morse.length; i+=1){
            map.put(morse[i], (char)(i + 97));
        }

        // letter를 공백으로 나누어 배열화한다.
        String[] splited = letter.split(" ");

        // Map을 이용한다. 각 원소들을 key로 하여 문자를 반환
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i< splited.length; i+=1){
            sb.append(map.get(splited[i]));
        }

        return sb.toString();
    }
    public static void main(String[] args) {
            System.out.println(solution(".... . .-.. .-.. ---"));
    }
}
