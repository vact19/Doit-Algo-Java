package doitjava.chap01.q15_q17;

public class Q15 {
    public static void main(String[] args) {
        // n단의 이등변삼각형
        int n = 5;

        triangleLB(n);
        triangleLU(n);
        triangleRU(n);
        triangleRB(n);
    }

    // 오른쪽 아래가 직각
    private static void triangleRB(int n) {
        class Foo{}
        System.out.println(Foo.class.getEnclosingMethod().getName());

        // n = 5일 때
        // i는 n부터 시작하여 1씩 줄어든다. 5, 4, 3, 2, 1
        // 공백은 1번, 2번, 3번, 4번, 5번으로 늘어나야 하므로
        // 1부터 시작하는 blankCount 를 사용한다. blankCount 는 1씩 n번 증가한다.
        int blankCount = n;
        for (int i = 1; i<=n; i+=1){

            for (int k=1 ; k<=blankCount; k+=1){
                System.out.print(" ");
            }


            for (int j = 1; j<=i; j+=1){
                System.out.print("*");
            }
            blankCount--;
            System.out.println();
        }
        System.out.println("---------");
    }

    // 오른쪽 위가 직각
    private static void triangleRU(int n) {
        class Foo{}
        System.out.println(Foo.class.getEnclosingMethod().getName());

        int blankCount=1;
        // n = 5일 때
        // i는 n부터 시작하여 1씩 줄어든다. 5, 4, 3, 2, 1
        // 공백은 1번, 2번, 3번, 4번, 5번으로 늘어나야 하므로
        // 1부터 시작하는 blankCount 를 사용한다. blankCount 는 1씩 n번 증가한다.
        for (int i = n; i>=1; i-=1){

            for (int k=1 ; k<=blankCount; k+=1){
                System.out.print(" ");
            }

            for (int j = i; j>=1; j-=1){
                System.out.print("*");
            }
            blankCount++;
            System.out.println();
        }
        System.out.println("---------");


//        int j=0;
//        long before = System.nanoTime();
//        System.out.println("현재 : " + before);
//        for (int i = 1; i<=5000000; i+=1){
//            for (j = 1; j==1; j+=1){
//                System.out.print(i);
//            }
//        }
//        System.out.println();
//        long after = System.nanoTime() - before;
//        System.out.println("완료시간 : " + after );


    }

    // 왼쪽 위가 직각
    private static void triangleLU(int n) {
        class Foo{}
        System.out.println(Foo.class.getEnclosingMethod().getName());

        int j = 0;
        for (int i = n; i>=1; i-=1){
            for (j = i; j>=1; j-=1){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------");
    }

    // 왼쪽 아래가 직각
    private static void triangleLB(int n) {
        class Foo{}
        System.out.println(Foo.class.getEnclosingMethod().getName());

        for (int i = 1; i<=n; i+=1){
            for (int j = 1; j<=i; j+=1){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------");
    }
}
