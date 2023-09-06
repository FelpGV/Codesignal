public class main8 {
    static int solution(int[][] matrix) {
        int count = 0;
        int i = 0;
        int j;
        while (i < matrix.length) {
            j = 0;
            while (j < matrix[i].length) {
                if (i == 0) {
                    if (matrix[i][j] != 0) {
                        count += matrix[i][j];
                    }
                }
                if (i > 0) {
                    if (matrix[i - 1][j] == 0) {
                        matrix[i][j] = 0;
                    } else {
                        System.out.println(matrix[i][j]);
                        count += matrix[i][j];
                    }
                }

                j++;
            }
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 1, 2},
                {0, 5, 0, 0},
                {2, 0, 3, 3}
        };
        System.out.println(solution(matrix));
    }

}
