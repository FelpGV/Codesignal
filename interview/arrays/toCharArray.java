package interview.arrays;

import java.util.Arrays;

public class toCharArray {
    static int[][] solution(int[][] a) {
        int[][] b = new int[a.length][a.length];
        int i = a.length;
        int k = 0;
        while (i > 0) {
            int j = 0;
            while (j < a.length) {
                b[j][i - 1] = a[k][j];
                j++;
            }
            i--;
            k++;
        }
        return b;
    }

    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.deepToString(solution(a)));
    }

}
