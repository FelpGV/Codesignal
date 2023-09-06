public class isLucky {
    static boolean solution(int n) {
        int sum1 = 0;
        int sum2 = 0;
        String nString = String.valueOf(n);
        for (int i = 0; i < nString.length() / 2; i++) {
            sum1 += nString.charAt(i);
            sum2 += nString.charAt(nString.length() - 1 - i);
        }
        return sum1 == sum2;
    }

    static boolean solution2(int n) {
        String s = n + "";
        int sum = 0;

        for (int i = 0; i < s.length() / 2; i++)
            sum += s.charAt(i) - s.charAt(s.length() - 1 - i);

        System.out.println(sum);
        return sum == 0;
    }

    public static void main(String[] args) {
        System.out.println(solution(1230));
//        System.out.println(solution(239017));
    }

}
