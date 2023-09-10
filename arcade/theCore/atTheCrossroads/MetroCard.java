package arcade.theCore.atTheCrossroads;

import java.util.Arrays;

public class MetroCard {
    static int[] solution(int lastNumberOfDays) {
        int[] d = {28, 30, 31};
        if (lastNumberOfDays == 30 || lastNumberOfDays == 28) {
            d = new int[]{31};
        }
        return d;
    }

    public static void main(String[] args) {
        int lastNumberOfDays = 30;
        int[] solution = solution(lastNumberOfDays);
        System.out.println(Arrays.toString(solution));
    }

}
