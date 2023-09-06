package arcade.theCore.introGates;

public class LargestNumber {
    static int solution(int n) {
//        return Integer.parseInt("9".repeat(n));
        return (int) Math.pow(10, n) - 1;
    }

    public static void main(String[] args) {
        int number = 2;
        int solution = solution(number);
        System.out.println(solution);
    }
}
