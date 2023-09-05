package arcade;

import java.util.Arrays;

public class AddBorder {

    static String[] solution(String[] picture) {
        String[] pictureWithBorder = new String[picture.length + 2];
        for (int i = 1; i <= picture.length; i++) {
            pictureWithBorder[i] = "*".concat(picture[i - 1]).concat("*");
        }
        pictureWithBorder[0] = pictureWithBorder[picture.length + 1] = "*".repeat(pictureWithBorder[1].length());
        return pictureWithBorder;
    }

    public static void main(String[] args) {
        String[] picture = {"abc", "ded"};
        solution(picture);


    }
}
