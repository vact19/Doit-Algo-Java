package doitjava.chap01.study;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        // 정수 a, b 입력받기
        // b - a 를 출력하며,
        // b <= a 일 경우 다시 입력받는다.
        Scanner stdIn = new Scanner(System.in);
        int a, b = 0;
        do {
            System.out.print("a 입력 : ");
            a = stdIn.nextInt();
            System.out.print("b 입력 : ");
            b = stdIn.nextInt();
            if (b <= a){
                System.out.println("b가 a보다 커야 해요 다시 입력해");
            }
        }while (b <= a);

        System.out.println(b - a);


    }
}
