package doitjava.chap02.q6;

public class Q6 {

    // 10진수 x를 r진수로 바꿔 d 배열에 역순으로 저장하고 자릿수를 반환한다.
    static int cardConvR(int x, int r, char[] d){
        int digits = 0;
        String dchar = "0123456789ABCDEF"; // 16진수까지만

        do {
            d[digits++] = dchar.charAt(x % r); // 나머지를 배열 앞쪽부터 저장
            x = x / r; // 나눠지는 수 x를 r로 나눈 몫으로 저장
        } while (x != 0l);

        return digits;
    }
    public static void main(String[] args) {
        char[] d = new char[16];
        System.out.println("자릿수 : " + cardConvR(10, 8, d));
        for (char c : d) {
            System.out.print(c);
        }

    }
}
