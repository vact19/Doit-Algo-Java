package level0.day13_15;

public class Day14Ciper {
    public static String solution(String cipher, int code) {
        String[] splited = cipher.split("");
        StringBuilder sb = new StringBuilder();
        for (int i = code-1; i < splited.length; i+=code){
            sb.append(splited[i]);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
            System.out.println(solution("dfjardstddetckdaccccdegk" , 4));
    }
}
