package doitjava.chap02.q8_q9;

public class DayOfYear {

    // 각 달의 일수, 0행은 평년, 1행은 윤년
    static int[][] mdays = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
    };


    // 윤년 판단. 위의 2차원 배열에서 윤년이 1행이기 때문에 윤년 -> 1, 평년 -> 0 반환
    static int isLeap(int year){
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    static int dayOfYear(int y, int m, int d){

        int i = 1;
        while (i < m){
            d += mdays[isLeap(y)][i - 1];
            i++;
        }

        return d;
    }

    static int leftDayOfYear(int y, int m, int d){
        int i = 1;
        int isLeap = isLeap(y);
        while (i < m){
            d += mdays[isLeap][i - 1];
            i++;
        }

        return 365 + isLeap - d ;
    }

    public static void main(String[] args) {
        System.out.println("그 해 경과일수를 구합니다");
        int year = 2020;
        int month = 11;
        int day = 11;
        System.out.println(year + "년 " + month + "월 " + day + "일은 그 해의 " +
                dayOfYear(year, month, day) + "번째 날입니다.");
        System.out.println(year + "년 " + month + "월 " + day + "일의 그 해의 남은 일수는 " +
                leftDayOfYear(year, month, day) + "일입니다.");
    }
}

























