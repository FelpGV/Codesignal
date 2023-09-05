package arcade;

public class ReverseInParentheses {
    static String solution(String inputString) {
        StringBuilder sb = new StringBuilder(inputString);
        int start = 0;
        int end = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '(') {
                start = i;
            }
            if (sb.charAt(i) == ')') {
                end = i;
                System.out.println(sb.substring(start + 1, end));
                return solution(sb.replace(start, end + 1, new StringBuilder(sb.substring(start + 1, end)).reverse().toString()).toString());
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("a(bc(def)gh)ij"));
    }


}
