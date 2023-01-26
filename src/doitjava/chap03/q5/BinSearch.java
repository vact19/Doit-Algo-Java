package doitjava.chap03.q5;

public class BinSearch {
    // Q5. 이진검색으로 찾을 원소가 여러 개 있을 경우 맨 왼쪽 인덱스를 반환
    static int binSearchIdx(int[] arr, int n, int key){
        int pl = 0; // 왼쪽 끝
        int pr = n - 1; // 오른쪽 끝

        do {
            int pc = (pl + pr) / 2; // 가운데 인덱스 설정

            if (arr[pc] > key)
                pr = pc - 1; // pc위치의 수가 크니, pc를 포함하여 그 오른쪽의 인덱스는 검색결과 제외.
            else if (arr[pc] < key)
                pl = pc + 1; // pc위치의 수가 작으니, pc를 포함하여 그 왼쪽의 인덱스는 검색결과 제외.

            else{   // 일치할 경우 실행.일치하는 일이 가장 적기 때문에 맨 후순위에 둔다.
                // 배열은 정렬되어 있고, key의 위치를 찾았다. 가능한 한 가장 왼쪽의 원소를 반환한다.

                int resultIdx = pc; // 가장 왼쪽의 인덱스 반환해야 함. 일단 반환인덱스 저장

                for (int i = 1; ; i++){
                    if(arr[pc - i] == key) // 한 칸씩 왼쪽으로 가면서, 왼쪽 원소도 key와 일치하는지 검사
                        resultIdx = pc - i;
                    else
                        break;
                }

                return resultIdx;
            }
        }while (pl <= pr); // 원하는 값을 찾지 못하고 pl이 pr을 넘어가버리면 반복 종료 후 -1 리턴.

        return -1;
    }
    public static void main(String[] args) {

        // 찾을 배열 초기화
        int n = 10;
        int[] arr = new int[]{1, 2, 4, 5, 5, 5, 5, 8, 9, 10};    //원소는 n개
        int key = 5;    // 찾을 수
        // 초기화 끝


        // 찾은 후 인덱스 반환
        int resultIdx = binSearchIdx(arr, n, key);

        if (resultIdx < 0 ) // 못 찾아서 음수 반환
            System.out.println(key + "을 찾지 못했습니다.");
        else{
            System.out.println(key + "은 " + resultIdx + "에 있다.");
        }
    }
}

