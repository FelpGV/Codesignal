package interview.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sudoku2 {
    static boolean solution(char[][] grid) {
        int row_ = 0;
        int i = 0;
        while (i < grid.length) {
            int j = 0;
            int column_ = 0;
            while (j < grid[0].length) {
                if (grid[i][j] != '.') {
                    int column = 0;
                    while (column < grid.length) {
                        if (column != j) {
                            if (grid[i][j] == grid[i][column]) {
                                return false;
                            }
                        }
                        column++;
                    }
                    int row = 0;
                    while (row < grid.length) {
                        if (row != i) {
                            if (grid[i][j] == grid[row][j]) {
                                return false;
                            }
                        }
                        row++;
                    }
                    int x = row_;
                    while (x < row_ + 3) {
                        int y = column_;
                        System.out.println(x + " " + y);

                        while (y < column_ + 3) {
                            if (x != i && y != j) {

                                if (grid[i][j] == grid[x][y]) {
                                    return false;
                                }
                            }
                            y++;
                        }
                        x++;
                    }
                }
                j++;
                if (j % 3 == 0) {
                    column_ += 3;

                }
            }
            i++;
            if (i % 3 == 0) {
                row_ += 3;
            }
        }
        return true;
    }

    static boolean solution2(char[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != '.') {
                    char tmp = grid[i][j];
                    for (int k = j + 1; k < grid[0].length; k++) {
                        if (tmp == grid[i][k]) {
                            return false;
                        }
                    }
                    for (int l = i + 1; l < grid.length; l++) {
                        if (tmp == grid[l][j]) {
                            return false;
                        }
                    }
                    int x = 0;
                    int y = 0;

                    if (i > 3 && i < 6) {
                        x = 3;
                    }
                    if (j > 3 && j < 6) {
                        y = 3;
                    }
                    if (i > 6) {
                        x = 6;
                    }
                    if (j > 6) {
                        y = 6;
                    }
                    int tmp2 = 0;
                    for (int p = x; p < x + 3; p++) {
                        for (int g = y; g < y + 3; g++) {
                            if (grid[p][g] == tmp) {
                                tmp2++;
                            }
                        }
                    }
                    if (tmp2 >= 2) {
                        return false;
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(grid));
        return true;
    }

    public static void main(String[] args) {
        char[][] grid = {
                {'.', '.', '.', '1', '4', '.', '.', '2', '.'},
                {'.', '.', '6', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},

                {'.', '.', '1', '.', '.', '.', '.', '.', '.'},
                {'.', '6', '7', '.', '.', '.', '.', '.', '9'},
                {'.', '.', '.', '.', '.', '.', '8', '1', '.'},

                {'.', '3', '.', '.', '.', '.', '.', '.', '6'},
                {'.', '.', '.', '.', '.', '7', '.', '.', '.'},
                {'.', '.', '.', '5', '.', '.', '.', '7', '.'}
        };
        char[][] grid2 = {
                {'.', '.', '5', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '5', '.', '.', '.', '.', '.', '.', '.'},
//
//                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
//                {'.', '.', '.', '.', '.', '.', '.', '.', '9'},
//                {'.', '.', '.', '.', '.', '.', '4', '.', '.'},
//
//                {'.', '.', '.', '.', '.', '.', '.', '.', '7'},
//                {'.', '1', '.', '.', '.', '.', '.', '.', '.'},
//                {'2', '4', '.', '.', '.', '.', '9', '.', '.'}
        };
        System.out.println(solution(grid2));
    }
}
