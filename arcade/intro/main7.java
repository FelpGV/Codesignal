import java.util.stream.IntStream;

public class main7 {
    static boolean solution(int[] sequence) {
        int i = 0;
        int count = 0;
        while (i < sequence.length - 1) {
            if (sequence[i] >= sequence[i + 1]) {
                count++;
                if (i + 2 <= sequence.length - 1 && i - 1 >= 0
                        && sequence[i] >= sequence[i + 2]
                        && sequence[i - 1] >= sequence[i + 1]
                ) {
                    return false;
                }
            }
            i++;
        }
        return count <= 1;
    }

    static boolean solution2(int[] sequence) {
        int numErr = 0;
        for (int i = 0; i < sequence.length - 1; i++) {
            if (sequence[i] - sequence[i + 1] >= 0) {
                numErr += 1;
                if (i - 1 >= 0 && i + 2 <= sequence.length - 1
                        && sequence[i] - sequence[i + 2] >= 0
                        && sequence[i - 1] - sequence[i + 1] >= 0) {
                    return false;
                }
            }
        }


        return numErr <= 1;
    }


    public static void main(String[] args) {
        int[] sequence = {1, 3, 1, 4};
        System.out.println(solution(sequence));
    }
}
