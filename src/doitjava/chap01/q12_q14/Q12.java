package doitjava.chap01.q12_q14;


public class Q12 {
    // Q12. 곱셈표 출력
    public static void main(String[] args) {
        // N1 * N2
        final int ROW = 9;
        final int COLUMN = 9;

        // COLUMN에 해당하는 숫자 출력
        System.out.print("   | ");
        for (int i = 1; i <= COLUMN; i+=1){
            System.out.printf("%3d", i);
        }
        System.out.println();

        // ROW에 해당하는 곱셈결과 출력
        for (int i = 1; i<=ROW; i+=1){
            //
            System.out.printf(i + " | ");

            // 곱셈 결과 표시
            for (int j = 1; j<=COLUMN; j+=1){
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }



    }
}













