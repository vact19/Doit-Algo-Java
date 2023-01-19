package level0.day9_10;

public class Day9Morse {
    static String solution(String letter){
        String[] morse = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] splited = letter.split(" ");
        int[] result = new int[splited.length];

        // result 배열은 morse의 인덱스를 가지고 있다.
        for (int i = 0; i < splited.length; i+=1){
            result[i] = sequentialSearch(morse, splited[i]);
        }

        StringBuilder sb = new StringBuilder();
        for (int i : result) {
            sb.append((char) (i + 97));
        }
        return sb.toString();
    }

    // 찾는 값이 있으면 해당 인덱스, 없으면 -1 반환
    private static int sequentialSearch(String[] arr, String s) {
        for (int i = 0; i < arr.length; i+=1){
            if (arr[i].equals(s)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
            System.out.println(solution(".... . .-.. .-.. ---"));
    }
}
