package arcade.theCore.atTheCrossroads;

public class IsInfiniteProcess {
    static boolean solution(int a, int b) {

        return a > b || a % 2 != b % 2;
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 6;
        boolean solution = solution(a, b);
        System.out.println(solution);
    }

}
