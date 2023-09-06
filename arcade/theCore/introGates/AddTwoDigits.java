package arcade.theCore.introGates;

public class AddTwoDigits {
    static int solution(int n) {
        return n / 10 + n % 10;
    }

    public static void main(String[] args) {
        int num = 29;
        int solution = solution(num);
        System.out.println(solution);
    }
}
