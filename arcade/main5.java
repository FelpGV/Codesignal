public class main5 {
    static int solution(int n) {
        if (n == 1) {
            return 1;
        }
        return (n - 1) * 4 + solution(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(solution(5));
    }

}
