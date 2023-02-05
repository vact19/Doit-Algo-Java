package level0.day16_18;

/**
 * my_string은 "3 + 5"처럼 문자열로 된 수식입니다.
 * 문자열 my_string이 매개변수로 주어질 때, 수식을 계산한 값을
 * return 하는 solution 함수를 완성해주세요.
 */
public class Day16문자열계산하기 {

    public static int solution(String my_string) {
        String[] splited = my_string.split(" ");
        int result = Integer.parseInt(splited[0]);

        for (int i = 1; i < splited.length; i+=2){
            if ("+".equals(splited[i])) // NPE 발생 가능한 변수를 equals 파라미터에 넣자
                result += Integer.parseInt(splited[i + 1]);
            else
                result -= Integer.parseInt(splited[i + 1]);
        }
        return result;
    }

    public static void main(String[] args) {
            System.out.println(solution("3 - 0 + 30 - 30"));
    }

    // 문제를 잘못 이해해서 아래 내용 폐기
//    public static int solution(String my_string) {
//        String trimed = my_string.replace(" ", ""); // 공백 제거
//
//        System.out.println("trimed = " + trimed);
//        // 정규식으로 +- 수식기호만을 제거한 숫자 목록
//        int[] intNumbers = Arrays.stream(trimed.split("[+|-]")).mapToInt(Integer::valueOf).toArray();
//        System.out.println("intNumbers = " + Arrays.toString(intNumbers));
//        // String의 첫 글자가 split의 대상이면 splited[0]은 공백 문자가 된다. 따라서 과정 하나를 더 거친다.
//        String[] splitedSymbols = trimed.split("[1-20000]"); // between 1 to 20000 을 구현해야 함 (이거 안해서 안돌아감)
//        System.out.println("splitedSymbols = " + Arrays.toString(splitedSymbols));
//        // 공백 문자를 뺀 값을 symbols 배열에 담는다.
//        String[] symbols = new String[splitedSymbols.length - 1];
//        System.out.println("symbols = " + Arrays.toString(symbols));
//        for (int i = 1; i < splitedSymbols.length; i+=1)
//            symbols[i - 1] = splitedSymbols[i];
//
//        // 맨 처음 숫자를 결과값에 놓고, 연산자에 따라 분기한다.
//        int result = intNumbers[0];
//        for (int i = 0; i <= symbols.length - 1; i+=1){
//            if ("+".equals(symbols[i]))
//                result += intNumbers[i + 1];
//            else
//                result -= intNumbers[i + 1];
//        }
//        return result;
//    }
}
