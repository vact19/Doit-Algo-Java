package doitjava.chap01.q1_q3;

public class MaxMin {

    // 1. 네 값의 최댓값을 구하는 max4 메서드를 작성하세요.
    static int max4(int a, int b, int c, int d){
        // a, b 와 c, d 를 따로 구분할 것임.

        // a, b 중 큰 값이 abMax에 저장
        int abMax = a>=b ? a : b;
        // c, d 중 큰 값이 cdMax에 저장
        int cdMax = c<=d ? c : d;

        // abMax와 cdMax를 비교해서 큰 값 반환
        return abMax >= cdMax ? abMax : cdMax;
//         Math.max(int, int) 사용 가능
//         return Math.max(abMax, cdMax);
    }
    // 2. 세 값의 최솟값을 구하는 min3 메서드를 작성하세요.
    static int min3(int a, int b, int c){
        // 최소값을 a로 가정
        int min = a;

        // b, c중 최소값인 bcMin
        int bcMin = b <= c ? b : c;

        // min과 bdMin 중 작은 값 반환
        return min <= bcMin ? min : bcMin;
    }

    // 3. 네 값의 최솟값을 구하는 min4 메서드를 작성하세요.
    static int min4(int a, int b, int c, int d){
        int abMin = a <= b ? a : b;
        int cdMin = c <= d ? c : d;

        return abMin <= cdMin ? abMin : cdMin;
    }

    public static void main(String[] args) {
        System.out.println("1, 2, 3, 4 최대값 : " + max4(1, 2, 3, 4));
        System.out.println("4, 7, 1, 5 최대값 : " + max4(4, 7, 1, 5));

        System.out.println("1, 2, 3 최소값 : " + min3(1, 2, 3));
        System.out.println("4, 1, 5 최소값 : " + min3(4, 1, 5));

        System.out.println("1, 2, 3, 4 최소값 : " + min4(1, 2, 3, 4));
        System.out.println("4, 3, 1, 2 최소값 : " + min4(4, 3, 1, 2));
    }
}





















