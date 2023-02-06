package level0.day19_21;

import java.util.Arrays;

/**
 * 다음 그림과 같이 지뢰가 있는 지역과 지뢰에 인접한 위, 아래, 좌, 우 대각선 칸을 모두 위험지역으로 분류합니다.
 * image.png
 * 지뢰는 2차원 배열 board에 1로 표시되어 있고 board에는 지뢰가 매설 된 지역 1과, 지뢰가 없는 지역 0만 존재합니다.
 * 지뢰가 매설된 지역의 지도 board가 매개변수로 주어질 때, 안전한 지역의 칸 수를 return하도록 solution 함수를 완성해주세요.
 *
 * // 배열은 무조건 정사각형
 */
public class Day21안전지대 {
    public static int solution(int[][] board) {

        System.out.println("작업 전");
        for (int i = 0; i < board.length ; i+=1){ // 가로
            for (int j = 0; j < board.length; j+=1){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        // 지뢰가 1이니까, 주변 위험지역을 2로 두고, filter 0 count 하자
        // board 타일은 정사각형이다.

        // 전체 순회
        for (int i = 0; i < board.length ; i+=1){ // 가로
            for (int j = 0; j < board.length; j+=1){
                if (board[i][j] == 1){
                    System.out.println(i + " " + j + " 에서 걸림");
                    dangerZone(board, i, j);
                }
            }
        }

        System.out.println("작업 후");
        for (int i = 0; i < board.length ; i+=1){ // 가로
            for (int j = 0; j < board.length; j+=1){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        // Function <int[], IntStream>
        return (int) Arrays.stream(board).flatMapToInt(Arrays::stream)
                .filter(i -> i == 0)
                .count();
    }

    /**
     *  13번(정중앙)이 지뢰라면
     *  7, 8, 9,
     *  12, 14,
     *  17, 18, 19  // 8칸이 위험지대 됨
     *  배열 인덱스로 치면
     *  -1 -1, -1 0, -1 +1
     *  0 -1, 0 +1
     *  +1 -1, +1 0, +1 +1
     */
    private static void dangerZone(int[][] board, int i, int j) {
        // 폭탄이 있는 자리가 board[i][j].
        // 주변에 있는 칸을 2로 만듬
        System.out.println(i + " " + j + "에서 위험지대 생성 시작");
        // -1행
        try {
            if (board[i -1][j -1] == 0)
                board[i -1][j -1] = 2;
        } catch (ArrayIndexOutOfBoundsException e){System.out.println((i - 1) + " " + (j - 1) + "범위 초과");}
        try {
            if (board[i -1][j] == 0)
                board[i -1][j] = 2;
        } catch (ArrayIndexOutOfBoundsException e){System.out.println((i - 1) + " " + (j ) + "범위 초과");}
        try {
            if (board[i -1][j +1] == 0)
                board[i -1][j +1] = 2;
        } catch (ArrayIndexOutOfBoundsException e){System.out.println((i - 1) + " " + (j + 1) + "범위 초과");}

        // 0행
        try {
            if (board[i][j - 1] == 0)
                board[i][j - 1] = 2;
        } catch (ArrayIndexOutOfBoundsException e){System.out.println((i) + " " + (j - 1) + "범위 초과");}
        try {
            if (board[i][j + 1] == 0)
                board[i][j + 1] = 2;
        } catch (ArrayIndexOutOfBoundsException e){System.out.println((i) + " " + (j + 1) + "범위 초과");}

        // 1행
        try {
            if (board[i + 1][j - 1] == 0)
                board[i + 1][j - 1] = 2;
        } catch (ArrayIndexOutOfBoundsException e){System.out.println((i + 1) + " " + (j - 1) + "범위 초과");}
        try {
            if (board[i + 1][j] == 0)
                board[i + 1][j] = 2;
        } catch (ArrayIndexOutOfBoundsException e){System.out.println((i + 1) + " " + (j) + "범위 초과");}
        try {
            if (board[i + 1][j + 1] == 0)
                board[i + 1][j + 1] = 2;
        } catch (ArrayIndexOutOfBoundsException e){System.out.println((i + 1) + " " + (j + 1) + "범위 초과");}
    }

    public static void main(String[] args) {
            System.out.println(solution(
                    new int[][]{
                            {0, 0, 0, 0, 0}
                            , {0, 0, 0, 0, 0}
                            , {0, 0, 0, 0, 0}
                            , {0, 0, 1, 0, 0}
                            , {0, 0, 1, 0, 0}
                    }));
    }
}
