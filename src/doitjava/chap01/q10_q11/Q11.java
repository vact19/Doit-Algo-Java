package doitjava.chap01.q10_q11;

import java.util.Scanner;

public class Q11 {
    /**
     * 양의 정수를 입력하고 자릿수를 출력.
     * 135를 입력하면 "3자리입니다"
     * 1314를 입력하면 "4자리입니다"
     */
    public static void main(String[] args ) {

        // 나누기 10을 했을 때
        // 11/10 = 1
        // 4 / 10 = 0

        // 즉, n / 10 = 0보다 크면 자릿수 1 증가
        Scanner stdIn = new Scanner(System.in);
        System.out.println("자릿수를 확인할 양의 정수 입력 :  ");
        int number = stdIn.nextInt();

        System.out.println(number + "의 자릿수는 " + getDigits(number));
    }

    private static int getDigits(int number) {

        int digits = 1;

        while (number / 10 > 0){
            number =  number / 10;
            digits++;
        }
        return digits;
    }

}
