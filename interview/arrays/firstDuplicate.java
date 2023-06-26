package interview.arrays;

public class firstDuplicate {
    static int solution(int[] a) {
        int i = 0;
        int duplicate = -1;
        int pos = a.length;
        while (i < a.length - 1) {
            int j = i + 1;
            while (j < a.length) {
                if (a[i] == a[j]) {
                    if (pos > j) {
                        pos = j;
                        duplicate = a[j];
                    }
                }
                j++;
            }
            i++;
        }
        return duplicate;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5, 3, 2, 3};
        System.out.println(solution(a));
    }

}
