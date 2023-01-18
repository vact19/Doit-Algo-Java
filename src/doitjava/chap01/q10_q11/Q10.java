package doitjava.chap01.q10_q11;

import java.util.Scanner;

public class Q10 {

    // Q10. 두 변수 a, b에 정수를 입력하고 b-a를 출력하는 프로그램을 작성.
    // b > a 어야 한다.
    // b <= a 면 다시 입력하게 한다.
    public static void main(String[] args) {
        System.out.println("b - a = "+bMinusA());
    }

    private static int bMinusA() {
        Scanner stdIn = new Scanner(System.in);

        int a =0; int b=0;
        System.out.println("두 정수 a, b 입력. b는 a보다 커야 한다.");


        do{
            System.out.print("a의 값 : ");
            a = stdIn.nextInt();
            System.out.print("b의 값 : ");
            b = stdIn.nextInt();
            if(b <= a)
                System.out.println("다시 입력해 주세요. b가 a보다 크지 않습니다.");
        }while(b <= a);
        return b-a;
    }
}




















