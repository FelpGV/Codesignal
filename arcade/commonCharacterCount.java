public class commonCharacterCount {
    static int solution(String s1, String s2) {
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    count++;
                    s2 = s2.substring(0, j) + s2.substring(j + 1);
                    break;
                }
            }
        }
        return count;
    }

    static int solution2(String s1, String s2) {
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s2.contains(String.valueOf(s1.charAt(i)))) {
                count++;
                s2 = s2.replaceFirst(String.valueOf(s1.charAt(i)), "");
            }
        }
        return count;
    }


    public static void main(String[] args) {
        String s1 = "aabcc";
        String s2 = "adcad";
        int result = solution2(s1, s2);
        System.out.println(result);
    }

}
