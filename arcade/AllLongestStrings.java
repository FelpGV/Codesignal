package arcade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class AllLongestStrings {
    static String[] solution(String[] inputArray) {
        int maxLength = 0;
        ArrayList<String> result = new ArrayList<String>();
        for (String s : inputArray) {
            if (s.length() > maxLength) {
                maxLength = s.length();
            }
        }
        for (String s : inputArray) {
            if (s.length() == maxLength) {
                result.add(s);
            }
        }
        String[] result_ = new String[result.size()];
        for (int i = 0; i < result.size(); i++) {
            result_[i] = result.get(i);
        }
        return result_;
    }

    static String[] solution2(String[] inputArray) {
        int longest = 0;
        for (String value : inputArray) {
            if (value.length() > longest) {
                longest = value.length();
            }
        }
        final int longestLength = longest;
        return Stream.of(inputArray)
                .filter(s -> s.length() == longestLength)
                .toArray(String[]::new);
    }

    public static void main(String[] args) {
        String[] inputArray = {"aba", "aa", "ad", "vcd", "aba"};
        String[] result = solution2(inputArray);
        System.out.println(Arrays.toString(result));
    }
}
