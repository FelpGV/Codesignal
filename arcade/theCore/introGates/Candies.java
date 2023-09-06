package arcade.theCore.introGates;

public class Candies {
    static int solution(int n, int m) {
        return m - m % n;
    }

    public static void main(String[] args) {
        int numChildren = 10;
        int numCandies = 5;
        int solution = solution(numChildren, numCandies);
        System.out.println(solution);

    }
}
