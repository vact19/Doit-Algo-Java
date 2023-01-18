package doitjava.chap03.q1_q2;

public class SeqSentinel {
    static int seqSearchSen(int[] arr, int n, int key){
        int i = 0;
        // 배열 길이가 5라면, n은 4이다.
        arr[n] = key; // 보초 세우기

        for ( ; ; i++){
            if (arr[i] == key)
                break;
        }
        return i == n ? -1 : i;
    }

    public static void main(String[] args) {
        int n = 5;  // 원소 수
        int arr[] = new int[n + 1]; //실제 원소는 5개, 크기는 6칸 할당
        int key = 4;
        // 마지막 보초칸을 남겨두고 n크기만큼 초기화
        for (int i =0; i < n; i++){
            arr[i] = i+2; // 초기화 숫자는 임의로 i + 2로 정함
        }

        int idx = seqSearchSen(arr, n, key);
        if (idx < 0 ) // 못 찾아서 음수 반환
            System.out.println(n + "을 찾지 못했습니다.");
        else
            System.out.println(key + "은 " + idx + " 에 있습니다.");
    }
}

















