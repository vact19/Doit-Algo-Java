package level0.day16_18;

import java.util.Arrays;

/**
 * 두 배열이 얼마나 유사한지 확인해보려고 합니다.
 * 문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 return하도록 solution 함수를 완성해주세요.
 *
 * 1 ≤ s1, s2의 길이 ≤ 100
 * 1 ≤ s1, s2의 원소의 길이 ≤ 10
 * s1과 s2의 원소는 알파벳 소문자로만 이루어져 있습니다 
 * s1과 s2는 각각 중복된 원소를 갖지 않습니다.
 * 
 * ["a", "b", "c"]	["com", "b", "d", "p", "c"]	2
 */
public class Day16배열의유사도 {

    //
    public static int solution(String[] s1, String[] s2) {
        // Collection.contains() 사용하는 방법도 있으나, 이진탐색으로 풀어보았음.
        if (s1.length <= s2.length)
            return containingCount(s2, s1);
        return containingCount(s1, s2);
    }

    public static int containingCount(String[] shortArray, String[] longArray) {
        int count = 0;
        // String은 Comparable을 구현했으므로 정렬, 이진 탐색 가능
        Arrays.sort(longArray); // 길이가 더 긴 배열을 정렬
        for (int i = 0; i < shortArray.length; i+=1){
            boolean isContained = Arrays.binarySearch(longArray, shortArray[i]) >= 0; // 포함 여부 검사.
            if (isContained)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
            System.out.println(solution(new String[]{"a", "b", "c"}, new String[]{"com", "b", "d", "p", "c"}));
    }
}
