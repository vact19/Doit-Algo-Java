package doitjava.chap02.q4_q5;

public class Q4_Q5 {
    public static void main(String[] args) {
        // Q4 배열 b의 모든 요소를 배열 a에 복사
        int[] arrA = new int[5];
        int[] arrB = {1, 2, 3, 4, 5};

        copy(arrA, arrB);

        // 출력
        System.out.println("Q4 배열복사 출력");
        for (int arr : arrA) {
            System.out.print(arr + " ");
        }
        System.out.println();

        // Q5 배열 b의 모든 요소를 배열 a에 역순으로 복사
        arrA = new int[5]; // 초기화
        rcopy(arrA, arrB);
        // 출력
        System.out.println("Q5 배열 거꾸로 복사 출력");
        for (int arr : arrA) {
            System.out.print(arr + " ");
        }
    }

    // Q5
    private static void rcopy(int[] arrA, int[] arrB) {
        // 배열 b의 모든 요소를 배열 a에 거꾸로 복사해야 한다.
        for (int i = 0; i<arrB.length; i+=1){
            arrA[i] = arrB[arrB.length - 1 - i];
        }
    }

    // Q4
    private static void copy(int[] arrA, int[] arrB) {
        // 배열 b의 모든 요소를 배열 a에 복사해야 한다.
        for (int i = 0; i<arrB.length; i+=1){
            arrA[i] = arrB[i];
        }

    }
}




















