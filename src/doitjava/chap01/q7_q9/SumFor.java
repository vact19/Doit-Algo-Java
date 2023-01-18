package doitjava.chap01.q7_q9;

public class SumFor {
    public static void main(String[] args) {
        int q7 = 7;
        int q8 = 10;
        int q9_1 = 1;
        int q9_2 = 5;
        System.out.println(addFrom1To(q7));
        System.out.println(getSumUsingGauss(q8));
        System.out.println(sumOf(q9_1, q9_2));
    }

    // Q9. 정수 a, b를 포함한 그 사이의 모든 정수의 합을 구하여 반환하는 아래 메서드를 작성하세요.
     static int sumOf(int a, int b) {
        int sum = 0;
        for (int i =a; i<=b; i+=1){
            sum +=i;
        }
        return sum;
    }

    // Q8. 1부터 n까지의 정수합 출력. n이 10이면 55. 가우스 공식 사용
    private static int getSumUsingGauss(int n) {
        int sum=0;
        // i는 n의 절반만큼만 1+10, 2+9, 3+7... 을 반복
        for (int i=0; i<n/2; i+=1){
            sum += (i + 1 + (n-i));
        }

        // n이 홀수일 경우 n/2 +1 의 숫자가 더해지지 못하고 남게 된다.
        // 홀수면 더해서 반환, 아니면 그냥 반환.
        if(n % 2 != 0)
            return sum + (n/2 + 1);

        return sum;
    }

    // Q7. n이 3이면 1+2+3=6 출력
    private static int addFrom1To(int n) {
        int sum =0;
        for (int i=1; i<n; i+=1){
            System.out.print(i + " + ");
            sum+=i; // 합 누적
        }
        return sum;
    }
}














