package arcade.theCore.introGates;

public class SeatsInTheater {
    static int solution(int nCols, int nRows, int col, int row) {
        return (nCols + 1 - col) * (nRows - row);
    }

    public static void main(String[] args) {
        int nCols = 60;
        int nRows = 100;
        int col = 60;
        int row = 1;
        int solution = solution(nCols, nRows, col, row);
        System.out.println(solution);
    }
}
