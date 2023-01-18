package doitjava.chap01.q15_q17;

public class Q17 {
    public static void main(String[] args) {
        int n = 4;
        starPira(n);
    }

    private static void starPira(int n) {
        // 맨 아래층의 별의 개수를 먼저 구한다.
        int maxStar = 1;
        for (int i = 1; i<n ; i+=1){
            maxStar = maxStar +2;
        }
        System.out.println("maxStar = " + maxStar);

        // 공백은 (maxStar - star) / 2 만큼 양쪽에 찍힌다.

        // star 1, 3, 5, 7
        int numberToPrint = 1;
        for (int star = 1; star<=maxStar; star+=2){

            int blank = (maxStar - star) / 2;

            // 왼쪽 공백
            for (int j = 1; j<=blank; j+=1){
                System.out.print(" ");
            }
            // 별 찍기
            for (int j = 1; j<=star; j+=1){
                System.out.print(numberToPrint % 10);
            }

            // 오른쪽 공백
            for (int j = 1; j<=blank; j+=1){
                System.out.print(" ");
            }
            numberToPrint +=1;

            // 줄바꿈
            System.out.println();


        }




    }
}
