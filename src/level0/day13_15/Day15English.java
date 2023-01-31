package level0.day13_15;

/** 영어가 싫어요
 *
 * 영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다.
 * 문자열 numbers가 매개변수로 주어질 때, numbers를 정수로 바꿔 return 하도록 solution 함수를 완성해 주세요.
 */
public class Day15English {
    public static long solution(String numbers) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i + 1 < numbers.length()){ // index + 1이 length 보다 작아야 함.
            String num = length3(numbers.substring(i, i + 3));
            if (! num.equals("좋아해요")){
                sb.append(num);
                i+=3;
                System.out.println(i + " length3");
                continue;
            } // default 값인 좋아해요가 나올 경우 아래 실행
            num = length4(numbers.substring(i, i + 4));
            if (! num.equals("좋아해요")){
                sb.append(num);
                i+=4;
                System.out.println(i + " length4");
                continue;
            } // default 값인 좋아해요가 나올 경우 아래 실행
            num = length5(numbers.substring(i, i + 5));
            if (! num.equals("좋아해요")){
                sb.append(num);
                i+=5;
                System.out.println(i + " length5");
            }
        }
        return Long.parseLong(sb.toString());
    }

    private static String length3(String str){
        if (str.length() != 3){
            return "안아줘요";
        }
        switch (str){
            case "one" : return "1";
            case "two" : return "2";
            case "six" :  return "6";
            case "ten" :  return "10";
            default: return "좋아해요";
        }
    }
    private static String length4(String str){
        if (str.length() != 4){
            return "안아줘요";
        }
        switch (str){
            case "zero" : return "0";
            case "four" : return "4";
            case "five" : return "5";
            case "nine" :  return "9";
            default: return "좋아해요";
        }
    }
    private static String length5(String str){
        if (str.length() != 5){
            return "안아줘요";
        }
        switch (str){
            case "three" : return "3";
            case "seven" : return "7";
            case "eight" :  return "8";
            default: return "좋아해요";
        }
    }
    public static void main(String[] args) {
        System.out.println(solution("onefourzerosixseven"));
    }
}
