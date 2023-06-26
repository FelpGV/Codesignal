package interview.arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class firstNotRepeatingCharacter {
    static char solution(String s) {
        char c = '_';
        int i = 0;
        while (i < s.length() && c == '_') {
            int j = 0;
            while (j < s.length()) {
                if (i != j) {
                    if (s.charAt(i) == s.charAt(j)) {
                        break;
                    }
                }
                j++;
            }
            if (j == s.length()) {
                c = s.charAt(i);
            }
            i++;
        }
        return c;
    }

    static char solution2(String s) {
        char c = '_';

        Map<Character, Integer> count = new LinkedHashMap<>();

        for (char ch : s.toCharArray()) {
            count.put(ch, count.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            if (entry.getValue() == 1) {
                c = entry.getKey();
                break;
            }
        }

        return c;
    }

    public static void main(String[] args) {
        String s = "abacabad";
        String z = "z";
        System.out.println(solution2(s));
        System.out.println(solution2(z));
    }
}
