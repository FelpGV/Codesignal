package arcade.theCore.introGates;

public class MaxMultiple {
    static int solution(int divisor, int bound) {
        int max = 0;
        for (int i = bound - divisor; i <= bound; i++) {
            if (i % divisor == 0) {
                max = i;
            }
        }
        return max;
    }

    static int solution2(int divisor, int bound) {
        return bound - (bound % divisor);
    }

    static int solution3(int divisor, int bound) {
        return (bound / divisor) * divisor;
    }


    public static void main(String[] args) {
        int divisor = 3;
        int bound = 10;
        int solution = solution2(divisor, bound);
        System.out.println(solution);
    }


}
