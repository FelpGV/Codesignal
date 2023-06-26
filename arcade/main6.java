import java.util.Arrays;
import java.util.List;

public class main6 {
    static int solution(int[] statues) {
//        statues = Arrays.stream(statues)
//                .boxed()
//                .sorted()
//                .mapToInt(Integer::intValue)
//                .toArray();
        Arrays.sort(statues);
        int i = 0;
        int count = 0;
        while (i < statues.length - 1) {
            count += statues[i + 1] - statues[i] - 1;
            i++;
        }
        return count;
    }

    static int solution2(int[] statues) {
        Arrays.sort(statues);
        int n = statues[statues.length - 1] - statues[0];
        System.out.println(n - statues.length + 1);
        return 0;
    }

    public static void main(String[] args) {
        int[] statues = {15, 10, 5, 20, 25};
        System.out.println(solution(statues));
    }
}
