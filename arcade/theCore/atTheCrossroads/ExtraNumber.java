package arcade.theCore.atTheCrossroads;

public class ExtraNumber {
    static int solution(int a, int b, int c) {
        return (a == b) ? c : (a == c) ? b : a;
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 7;
        int c = 2;
        int solution = solution(a, b, c);
        System.out.println(solution);
    }
}
