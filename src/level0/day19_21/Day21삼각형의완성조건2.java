package level0.day19_21;

/**
 *  선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
 *
 * 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
 * 삼각형의 두 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다.
 * 나머지 한 변이 될 수 있는 정수의 개수를 return하도록 solution 함수를 완성해주세요.
 *
 *  [11, 7]	13
 *
 *  - 11이 가장 클 경우, 다른 한 변은 11 부터 시작해서 1씩 내려가는, 7과 더했을 때 11보다 큰 모든 수이다.
 *      즉 11, 10, 9, 8, 7, 6, 5
 *  - 나머지 한 변이 가장 클 경우, 11보다 큰 수인 12부터, 11+7인 18보다 작은 수이다.
 *      즉 12, 13, 14, 15 ,16, 17
 */
public class Day21삼각형의완성조건2 {
    public static int solution(int[] sides) {
        // 작은 수가 sides[0], 큰 수가 sides[1]에 오게 함.
        if (sides[0] >= sides[1]){
            int temp = sides[0];
            sides[0] = sides[1];
            sides[1] = temp;
        } // 근데 그냥 min max 변수를 따로 선언하는게 가독성에 좋을듯
        int count = 0;
        // sides[1]이 가장 큰 변일 경우
        for (int i = sides[1] ; i + sides[0] > sides[1] ; i-=1)
            count+=1;

        // sides[0] sides[1]보다 더 큰 변이 있을 경우
        for (int i = sides[1] + 1 ; i < sides[0] + sides[1] ; i+=1)
            count+=1;

        return count;
    }
    public static void main(String[] args) {
            System.out.println(solution(new int[]{2, 2}));
    }
}















