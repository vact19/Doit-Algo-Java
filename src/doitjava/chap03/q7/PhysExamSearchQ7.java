package doitjava.chap03.q7;

import java.util.Arrays;
import java.util.Comparator;

public class PhysExamSearchQ7 {

    static class PhyscData{
        private String name;
        private int height;
        private double vision;

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
        @Override
        public String toString() {
            return name + " / " + height + " / " + vision;
        }

        // 함수형 인터페이스 Comparator를 구현하는 익명 클래스의 구현부분만 사용한 람다식
        public static final Comparator<PhyscData> VISION_ORDER = (o1, o2) -> (o1.vision > o2.vision) ? 1 : (o1.vision < o2.vision) ? -1 : 0;

        // <>Generic 으로 명시한 오브젝트 둘을 비교하는 Comparator
//        private static class VisionOrderComparator implements Comparator<PhyscData>{
//            // o1이 o2보다 작으면 음수, 같으면 0, 크면 양수 반환
//            @Override
//            public int compare(PhyscData o1, PhyscData o2) {
//                return (o1.vision > o2.vision) ? 1 :
//                        (o1.vision < o2.vision) ? -1 : 0;
//            }
//        }
    }
    public static void main(String[] args) {
        PhyscData[] x = {					// 배열 요소는 시력 오름차순으로 정렬
                new PhyscData("강민하", 162, 0.3),
                new PhyscData("이수연", 168, 0.4),
                new PhyscData("김찬우", 173, 0.7),
                new PhyscData("황지안", 169, 0.8),
                new PhyscData("장경오", 174, 1.2),
                new PhyscData("유서범", 171, 1.5),
                new PhyscData("박준서", 175, 2.0),
        };
        double vision = 1.5;
        System.out.println("시력이 " + vision + "인 사람을 찾습니다.");
        // binarySearch(arr, key, Comparator);
        int idx = Arrays.binarySearch(x, new PhyscData("", 0, vision), PhyscData.VISION_ORDER);

        if (idx < 0)
            System.out.println("원소가 없습니다.");
        else {
            System.out.println("index " + idx + " 에 있습니다.");
            System.out.println("값 : " + x[idx]);
        }
    }
}















