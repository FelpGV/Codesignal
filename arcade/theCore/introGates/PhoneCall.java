package arcade.theCore.introGates;

public class PhoneCall {
    static int solution(int min1, int min2_10, int min11, int s) {
        int result = 0;
        if (s >= min1) {
            result += 1;
            s -= min1;
            if (s >= min2_10 * 9) {
                result += 9;
                s -= min2_10 * 9;
            } else {
                result += s / min2_10;
                s = 0;
            }
            if (s >= min11) {
                result += s / min11;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int min1 = 1;
        int min2_10 = 2;
        int min11 = 1;
        int s = 6;
        int solution = solution(min1, min2_10, min11, s);
        System.out.println(solution);
    }

}
