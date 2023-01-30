package level0.day13_14;

/** 컨트롤 제트
 *
 *  숫자와 "Z"가 공백으로 구분되어 담긴 문자열이 주어집니다.
 *  문자열에 있는 숫자를 차례대로 더하려고 합니다.
 *  이 때 "Z"가 나오면 바로 전에 더했던 숫자를 뺀다는 뜻입니다.
 *  숫자와 "Z"로 이루어진 문자열 s가 주어질 때, 머쓱이가 구한 값을 return 하도록 solution 함수를 완성해보세요.
 *
 *  Z는 연속으로 나오지 않는다. s는 Z로 시작하지 않는다.
 */
public class Day13CtrlZ {
    public static int solution(String s) {
        String[] arr = s.split(" ");
        int sum = 0;
        for (int i = 0; i < arr.length; i+=1){
            if (arr[i].equals("Z")){
                sum -= Integer.valueOf(arr[i - 1]);
            } else {
                sum += Integer.valueOf(arr[i]);
            }

        }
        // 합계, 최근 더한 수
        return sum;
    }

    public static void main(String[] args) {
            System.out.println(solution("1 2 Z 3"));
    }
}



















