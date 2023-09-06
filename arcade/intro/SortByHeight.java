import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortByHeight {
    static int[] solution(int[] a) {
        int c;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] > a[i] && a[i] != -1 && a[j] != -1) {
                    c = a[i];
                    a[i] = a[j];
                    a[j] = c;
                }
            }

        }
        return a;
    }

    static int[] solution2(int[] a) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i : a) {
            if (i != -1) {
                list.add(i);
            }
        }

        Collections.sort(list);

        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != -1) {
                a[i] = list.get(index++);
            }
        }

        return a;
    }


    public static void main(String[] args) {
        int[] a = {-1, 150, 190, 170, -1, -1, 160, 180};
        System.out.println(Arrays.toString(solution(a)));
    }
}
