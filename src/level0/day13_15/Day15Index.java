package level0.day13_15;

/** 인덱스 바꾸기
 *
 * 문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때, my_string에서
 * 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을 return 하도록
 * solution 함수를 완성해보세요
 *
 *  "hello"	1	2	"hlelo"
 */
public class Day15Index {
    public static String solution(String my_string, int num1, int num2) {
        char[] charArray = my_string.toCharArray();
        charArray[num1] = my_string.charAt(num2);
        charArray[num2] = my_string.charAt(num1);

        return String.valueOf(charArray);
//        // num1이 더 클 경우 바꾼다.
//        if (num1 > num2){
//            int temp = num1;
//            num1 = num2;
//            num2 = temp;
//        }
//        // num1, num2 추출
//        char num1Char = my_string.charAt(num1);
//        char num2Char = my_string.charAt(num2);
//
//        StringBuilder sb = new StringBuilder();
//        int i = 0;
//
//        // 0부터 num1의 직전까지
//        while (i < num1){
//            sb.append(my_string.charAt(i));
//            i+=1;
//        }
//        sb.append(num2Char); i+=1;
//        // num1부터 num2의 직전까지
//        while (i < num2){
//            sb.append(my_string.charAt(i));
//            i+=1;
//        }
//        sb.append(num1Char); i+=1;
//
//        // num2부터 끝까지
//        while (i < my_string.length()){
//            sb.append(my_string.charAt(i));
//            i+=1;
//        }
//        return sb.toString();
    }

    public static void main(String[] args) {
            System.out.println(solution("hello", 1, 2));
    }
}
