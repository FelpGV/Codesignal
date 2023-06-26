package interview.arrays;

import java.util.Arrays;

public class isCryptSolution {
    static boolean solution(String[] crypt, char[][] solution) {
        String[] crypt1 = new String[crypt[0].length()];
        String[] crypt2 = new String[crypt[1].length()];
        String solution_ = "";
        int i = 0;
        while (i < crypt[0].length()) {
            int j = 0;
            while (j < solution.length) {
                if (crypt[0].charAt(i) == solution[j][0]) {
                    crypt1[i] = String.valueOf(solution[j][1]);
                }
                j++;
            }
            i++;
        }
        int i2 = 0;
        while (i2 < crypt[1].length()) {
            int j2 = 0;
            while (j2 < solution.length) {
                if (crypt[1].charAt(i2) == solution[j2][0]) {
                    crypt2[i2] = String.valueOf(solution[j2][1]);
                }
                j2++;
            }
            i2++;
        }
        int crypt1_ = Integer.parseInt(String.join("", crypt1));
        int crypt2_ = Integer.parseInt(String.join("", crypt2));
        int solutionNumber = crypt1_ + crypt2_;
        String solutionNumberString = String.valueOf(solutionNumber);
        int k = 0;
        if (solutionNumberString.length() == crypt[2].length()) {
            while (k < solutionNumberString.length()) {
                int l = 0;
                while (l < solutionNumberString.length()) {
                    if (solutionNumberString.charAt(k) == solution[l][1]) {
                        solution_ = solution_.concat(String.valueOf(solution[l][0]));
                    }
                    l++;
                }

                k++;
            }
        }
        return solution_.equals(crypt[2]);
    }

    static boolean solution2(String[] crypt, char[][] solution) {
        for (char[] sol_ : solution) {
            for (int i = 0; i < crypt.length; i++) {
                crypt[i] = crypt[i].replace(sol_[0], sol_[1]);
            }
        }
        if ((crypt[0].charAt(0) == '0' || crypt[1].charAt(0) == '0') &&
                (crypt[0].length() > 1 || crypt[1].startsWith("0"))) {
            return false;
        }

        for (String s : crypt) {
            if (!s.equals("0") && s.startsWith("0")) {
                return false;
            }
        }

        return Long.parseLong(crypt[0]) + Long.parseLong(crypt[1]) == Long.parseLong(crypt[2]);
    }

    public static void main(String[] args) {
        String[] crypt = {"SEND", "MORE", "MONEY"};
        char[][] solution = {
                {'O', '0'}, {'M', '1'}, {'Y', '2'},
                {'E', '5'}, {'N', '6'}, {'D', '7'},
                {'R', '8'}, {'S', '9'}
        };
        String[] crypt2 = {"TEN", "TWO", "ONE"};
        char[][] solution2 = {
                {'O', '1'}, {'T', '0'}, {'W', '9'},
                {'E', '5'}, {'N', '4'}
        };

        String[] crypt3 = {"A", "A", "A"};
        char[][] solution3 = {
                {'A', '0'}
        };

        System.out.println(solution2(crypt, solution));
        System.out.println(solution2(crypt2, solution2));
        System.out.println(solution2(crypt3, solution3));
    }

}
