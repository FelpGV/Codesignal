package arcade.theCore.atTheCrossroads;

public class KnapsackLight {
    static int solution(int value1, int weight1, int value2, int weight2, int maxW) {
        int maxValue = 0;
        if (weight1 + weight2 <= maxW) {
            maxValue = value1 + value2;
        } else {
            if (weight1 <= maxW && weight2 > maxW) {
                maxValue = value1;
            }
            if (weight2 <= maxW && weight1 > maxW) {
                maxValue = value2;
            }
            if (weight1 <= maxW && weight2 <= maxW) {
                maxValue = Math.max(value1, value2);
            }
        }
        return maxValue;
    }

    static int solution2(int value1, int weight1, int value2, int weight2, int maxW) {
        int maxValue = 0;
        if (weight1 <= maxW) maxValue = value1;
        if (weight2 <= maxW) maxValue = Math.max(maxValue, value2);
        if (weight1 + weight2 <= maxW) maxValue = Math.max(maxValue, value1 + value2);
        return maxValue;
    }

    public static void main(String[] args) {
        int value1 = 2;
        int weight1 = 5;
        int value2 = 3;
        int weight2 = 4;
        int maxW = 5;
        int solution = solution2(value1, weight1, value2, weight2, maxW);
        System.out.println(solution);
    }

}
