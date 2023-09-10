package arcade.theCore.atTheCrossroads;

public class ArithmeticExpression {
    static boolean solution(int a, int b, int c) {
        return a + b == c || a - b == c || a * b == c || (a / b == c && a % b == 0);
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 5;
        boolean solution = solution(a, b, c);
        System.out.println(solution);
    }
}
