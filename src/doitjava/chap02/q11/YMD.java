package doitjava.chap02.q11;

public class YMD {
    int year;
    int month;
    int day;

    // 각 달의 일수, 0행은 평년, 1행은 윤년
    private final int[][] mdays = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
    };

    // 윤년 판단. 위의 2차원 배열에서 윤년이 1행이기 때문에 윤년 -> 1, 평년 -> 0 반환
    int isLeapYear(){
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    public int getDaysOfCurrentMonth(int isLeapYear){
        return mdays[isLeapYear][this.month - 1];
    }

    public int setNextMonth() {
        if(this.month == 12){
            this.year += 1;
            return this.month = 1;
        }
        return ++this.month;
    }

    public YMD after(int days) {
        /**
         *  해당 월의 최대일수보다 days가 더 큰지 확인한다.
         *  days가 더 크다면 days -= 최대일수, month 1 증가. 이 과정을 반복해야 한다.
         *
         *  윤년 여부는 month가 증가하며 연도가 바뀌면 그에 따라 바뀔 수 있기 때문에 매번 검사
         *  month가 증가하면서 연도도 바뀔 수 있기 때문에, month++ 대신 nextMonth() 사용한다.
         */
        // 해당월 최대일수보다 더해질 일수가 더 크다면 month를 증가(30 or 31진수의 둘째자리를 증가)
        while (getDaysOfCurrentMonth(isLeapYear()) < days){
            days -= getDaysOfCurrentMonth(isLeapYear());
            setNextMonth();
        } // 최대일수보다 더해질 일수가 적어질 때까지 month를 증가시키며 반복

        // 현재 x월 15일이고, 20일이 더해져야 한다면 다시 month를 증가시켜야 한다.
        if(this.day + days > getDaysOfCurrentMonth(isLeapYear())){
            days -= getDaysOfCurrentMonth(isLeapYear()); // days는 month를 증가시킨 다음의 나머지값
            setNextMonth();
        }
        // 위 식에서의 나머지값 day를 최종적으로 더한다.
        this.day += days;
        return this;
    }

    public YMD(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }


    public static void main(String[] args) {
        YMD ymd = new YMD(2013, 12, 11);
        YMD after = ymd.after(730);
        System.out.println("after.year = " + after.year);
        System.out.println("after.month = " + after.month);
        System.out.println("after.day = " + after.day);
    }

}



















