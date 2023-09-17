package arcade.theCore.Corner;

public class Kill_Kth_Bit {
    static int solution(int n, int k) {
        return n & ~(1 << k - 1);
    }

    public static void main(String[] args) {
        int n = 37;
        int k = 4;
        int solution = solution(n, k);
        System.out.println(solution);
    }
}

