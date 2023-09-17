package arcade.theCore.Corner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RangeBitCount {
    static int solution(int a, int b) {
        int[] numbers = new int[(b - a) + 1];
        for (int i = 0; i <= b - a; i++) {
            numbers[i] = i + a;
        }
        int result = 0;
        for (int number : numbers) {
            String binary = Integer.toBinaryString(number);
            for (int i = 0; i < binary.length(); i++) {
                if (binary.charAt(i) == '1') {
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 7;
        int solution = solution(a, b);
        System.out.println(solution);
    }
}
