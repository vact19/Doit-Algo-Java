package doitjava.chap01.q7_q;

import java.util.Scanner;

public class SumFor {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값 : ");
        int n = stdIn.nextInt();

        printAddFrom1To(n);
    }

    // Q7. n이 3이면 1+2+3=6 출력
    private static void printAddFrom1To(int n) {
        int sum =0;
        for (int i=1; i<n; i+=1){
            System.out.print(i + " + ");
            sum+=i; // 합 누적
        }
        System.out.println(n + " = " + sum);

    }
}
