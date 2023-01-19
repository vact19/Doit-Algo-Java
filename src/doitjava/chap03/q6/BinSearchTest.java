package doitjava.chap03.q6;

import java.util.Arrays;

public class BinSearchTest {
    /**
     *  Q6. 검색 결과를 찾지 못한 경우 insertion point를 출력하라.
     *      insertion point : key보다 큰 가장 첫번째 원소
     *  Arrays.binarySearch() 메소드를 활용한다.
     */
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 7, 8, 9, 10};
        int key = 12;

        int idx = Arrays.binarySearch(arr, key);

        if (idx < 0 && idx > -arr.length){
            System.out.println("key에 해당하는 원소 없음");
            System.out.println("insertion point는 " + (-idx - 1 )); // insertion point -> 만약 key를 삽입한다면 삽입하기 알맞은 위치
        } else if (idx == -arr.length){
            System.out.println("key에 해당하는 원소 없음");
            System.out.println("insertion point는 " + (-idx)); // insertion point -> 만약 key를 삽입한다면 삽입하기 알맞은 위치
        } else {
            System.out.println("key " + key + "에 해당하는 원소의 인덱스값은");
            System.out.println(idx);
        }
    }




}
