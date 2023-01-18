package doitjava.chap01.q4_q6;


// 5번은 풀이문제가 아니러
// 6번은 너무 간단해서 생략
public class Med {

    // 123, 132
    // 213, 231
    // 312, 321
    // 111, 122, 113, 322
    // Q4
    static int med3(int a, int b, int c){
        // ab의 최대값과 ac의 최대값 중 더 작은 수를 리턴하면 중간값이 반환될 것이다.
        // 다만 가운데값이 제일 클 경우는 abMax == acMax 가 되므로 따로 처리한다.
        int abMax = Math.max(a, b);
        int acMax = Math.max(b, c);


        // 만약 가운데값이 제일 커서 max1과 max2가 같다면
        if (abMax == acMax){
            return Math.max(a, c); // a와 c 중 더 큰 수가 가운데값이다.
        }
        return Math.min(abMax, acMax);
    }
    
    public static void main(String[] args) {
        System.out.println("med3(3,2,1) = " + med3(3,2,1));      // a＞b＞c
        System.out.println("med3(3,2,2) = " + med3(3,2,2));      // a＞b＝c
        System.out.println("med3(3,1,2) = " + med3(3,1,2));      // a＞c＞b
        System.out.println("med3(3,2,3) = " + med3(3,2,3));      // a＝c＞b
        System.out.println("med3(2,1,3) = " + med3(2,1,3));      // c＞a＞b
        System.out.println("med3(3,3,2) = " + med3(3,3,2));      // a＝b＞c
        System.out.println("med3(3,3,3) = " + med3(3,3,3));      // a＝b＝c
        System.out.println("med3(2,2,3) = " + med3(2,2,3));      // c＞a＝b
        System.out.println("med3(2,3,1) = " + med3(2,3,1));      // b＞a＞c
        System.out.println("med3(2,3,2) = " + med3(2,3,2));      // b＞a＝c
        System.out.println("med3(1,3,2) = " + med3(1,3,2));      // b＞c＞a
        System.out.println("med3(2,3,3) = " + med3(2,3,3));      // b＝c＞a
        System.out.println("med3(1,2,3) = " + med3(1,2,3));      // c＞b＞a
    }
}
