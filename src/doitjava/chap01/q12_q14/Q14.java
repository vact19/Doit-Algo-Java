package doitjava.chap01.q12_q14;

import java.util.Scanner;

public class Q14 {
    // Q14. 입력한 수를 한 변으로 하는 정사각형을 출력
    // * 별찍기
    public static void main(String[] args) {
        System.out.println("정사각형 별 몇개");
        Scanner stdIn = new Scanner(System.in);
        int num = stdIn.nextInt();

        // 정사각형이므로 i와 j가 모두 num에 의해 반복된다
        for (int i = 1; i<=num; i+=1){
            for (int j = 1; j<=num; j +=1){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
