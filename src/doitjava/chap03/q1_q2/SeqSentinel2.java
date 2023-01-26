package doitjava.chap03.q1_q2;

/**
 * Q1. for문을 사용해 순차검색 구현
 */
public class SeqSentinel2 {
    static int seqSearchSen(int[] arr, int n, int key){
        int i = 0;
        // 배열 길이가 5라면, n은 4이다.

        for (i = 0; i < arr.length ; i++){
            if (arr[i] == key)
                break;
        }
        return i == n ? -1 : i;
    }

    public static void main(String[] args) {
        // 초기화
        int n = 5;  // 원소 수
        int arr[] = new int[n]; //실제 원소는 5개, 크기는 6칸 할당
        int key = 3;
        // 마지막 보초칸을 남겨두고 n크기만큼 초기화
        for (int i =0; i < n; i++){
            arr[i] = i+2; // 초기화 숫자는 임의로 i + 2로 정함
        } // 초기화 끝

        int idx = seqSearchSen(arr, n, key);
        if (idx < 0 ) // 못 찾아서 음수 반환
            System.out.println(key + "을 찾지 못했습니다.");
        else
            System.out.println(key + "은 " + idx + " 에 있습니다.");
    }
}

















