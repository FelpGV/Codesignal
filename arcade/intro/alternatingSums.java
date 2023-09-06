import java.util.Arrays;

public class alternatingSums {
    static int[] solution(int[] a) {
        int[] b = new int[2];
        for (int i = 0; i < a.length; i++) {
//            if (i % 2 == 0) {
//                b[0] += a[i];
//            } else {
//                b[1] += a[i];
//            }
            b[i % 2] += a[i];
        }
        return b;
    }

    public static void main(String[] args) {
        int[] a = {50, 60, 60, 45, 70};
        System.out.println(Arrays.toString(solution(a)));

    }
}