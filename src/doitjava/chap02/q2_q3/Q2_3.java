package doitjava.chap02.q2_q3;

public class Q2_3 {
    public static void main(String[] args) {

        // Q2
        System.out.println("Q2 ==================");
        reverse();

        // Q3
        System.out.println("Q3 ==================");
        System.out.println("배열의 총합은 "+sumOf(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}) + "이다.");

    }
    // Q3. 배열 a의 모든 요소의 합계를 구하여 반환한다.
    private static int sumOf(int[] arr) {
        // arr.length 만큼 반복해서 합 누적
        int result = 0;
        for (int i = 0; i< arr.length; i+=1){
            result += arr[i];
        }

        return result;
    }

    // Q2. 배열 요소를 역순으로 정렬하는 과정을 하나하나 나타내는 프로그램을 작성하세요.
    public static void reverse() {
        //  todo 배열 전체를 출력하고
        //  todo 배열에서 몇번 인덱스와 몇번 인덱스가 자리를 바꾸는지를 단계별로 콘솔에 출력한다.

        // 0. 10개의 숫자가 있다면 , 1과 10, 2와 9, 3과 7... 을 뒤집어서 순서를 바꾼다.
        // 1. 반복은 arr.length / 2 만큼 이루어진다. 배열 길이가 홀수일 경우 중간값은 바꾸지 않기 때문에 나머지는 버린다.
        // 2. 반복자 i는 1씩 증가한다. arr[i] arr[arr.length-i] 이렇게
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};

        for (int i = 0; i< arr.length / 2; i+=1){

            // 출력용
            for (int j = 0; j < arr.length; j+=1){
                System.out.print(arr[j] +" " );
            }
            System.out.println("\n arr[" + i + "]와 arr[" + (arr.length - 1 - i) +"]을 교환합니다.");

            // swap
            swap(arr, i);
        }
        // 출력용
        System.out.print("결과 => ");
        for (int i = 0; i < arr.length; i+=1){
            System.out.print(arr[i] +" " );
        }
        System.out.print("\n");
    }

    public static void swap(int[] arr, int i){
        int temp = arr[i];
        arr[i] = arr[arr.length - 1 - i];
        arr[arr.length - 1 - i] = temp;
    }
}



















