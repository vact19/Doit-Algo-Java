package doitjava.chap03.q3;

public class SeqSentinelQ3 {
    static int seqSearchSen(int[] arr, int n, int key, int[] idxes){
        int i = 0; // 배열 arr를 순회하기 위함
        int j = 0; // idxes 배열에 값을 넣고, 일치 횟수를 세기 위함

        for ( ; i < n ; i++){ // 무조건 배열 끝까지 순회해야 하므로 보초를 사용하지 않는다.
            if (arr[i] == key)
                idxes[j++] = i;
        }

        return j;
    }

    public static void main(String[] args) {
        // 초기화
        int n = 10;  // 원소 수
        int key = 4; // 찾을 숫자
        int[] arr = new int[]{1, 2, key, key, key, 6, 7, key, 9, 10}; //실제 원소는 5개, 크기는 6칸 할당

        int[] idxes = new int[10]; // 중복해서 검출된 원소들의 인덱스 저장

        // 마지막 보초칸을 남겨두고 n크기만큼 초기화


        int resultIdx = seqSearchSen(arr, n, key, idxes);
        if (resultIdx < 0 ) // 못 찾아서 음수 반환
            System.out.println(n + "을 찾지 못했습니다.");
        else{
            System.out.println(key + "은 " + resultIdx + "번 찾았다. \n찾은 인덱스는 다음과 같다. \n");
            for (int idx : idxes) {
                System.out.print(idx + " ");
            }
        }



    }
}

















