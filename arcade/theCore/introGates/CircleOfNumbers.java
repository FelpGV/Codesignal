package arcade.theCore.introGates;

public class CircleOfNumbers {
    static int solution(int n, int firstNumber) {
        return (n / 2 + firstNumber) % n;
    }

    public static void main(String[] args) {
        int n = 10;
        int firstNumber = 2;
        int solution = solution(n, firstNumber);
        System.out.println(solution);
    }
}
