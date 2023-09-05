package arcade;

import java.util.ArrayList;
import java.util.List;

public class AreSimilar {
    static boolean solution(int[] a, int[] b) {
        boolean areSimilar;
        List<Integer> index = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                index.add(i);
            }
        }
        if (index.size() == 0) {
            areSimilar = true;
        } else if (index.size() == 2) {
            areSimilar = a[index.get(0)] == b[index.get(1)] && a[index.get(1)] == b[index.get(0)];
        } else {
            areSimilar = false;
        }
        return areSimilar;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 10, 2};
        boolean solution = solution(a, b);
        System.out.println(solution);
    }

}
