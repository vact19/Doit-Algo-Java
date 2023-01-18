package level0;

public class Temp {
    public static void main(String[] args) {
        System.out.println(solution("hello", 3));
    }

    public static String solution(String my_string, int n) {

        // 이게 일반적
        StringBuilder sb = new StringBuilder();
        // my_string 의 길이만큼 반복자가 증가하고, n만큼 반복해야 함
        for (int i=0; i<my_string.length(); i+=1){
            for (int j =0; j<n; j+=1){
                sb.append(my_string.charAt(i));
            }
        }
        return sb.toString();

//        /**
//         * 이렇게도 가능
//         */
//        String answer = "";
//        for (int i=0; i<my_string.length(); i+=1){
//            for (int j =0; j<n; j+=1){
//                answer += my_string.charAt(i);
//            }
//        }
//        return  answer;
    }
}
