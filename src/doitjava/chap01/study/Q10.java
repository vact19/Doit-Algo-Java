package doitjava.chap01.study;

import java.util.Scanner;

public class Q10 {
    // 양의 정수를 입력받으면 자릿수 출력
    // 135 -> 3
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("양의 정수 입력");
        int num = stdIn.nextInt();

        // num / 10을 계산한 몫이 0이라면,
        // num은 일의 자리 수이다.

        // 자릿수는 int digit 이 기억한다.
        int digit = 1; // 양의 정수이므로 최소 한자리
        while (num / 10 != 0){
            num = num / 10; // 10으로 나눌 수 있으면 나눈 몫을 저장
            digit +=1;
        }
        System.out.println(digit);

    }
}
