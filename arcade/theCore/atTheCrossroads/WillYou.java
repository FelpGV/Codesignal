package arcade.theCore.atTheCrossroads;

public class WillYou {
    static boolean solution(boolean young, boolean beautiful, boolean loved) {
        return (young && beautiful && !loved) || (loved && !young || !beautiful);
    }

    public static void main(String[] args) {
        boolean young = true;
        boolean beautiful = true;
        boolean loved = true;
        boolean solution = solution(young, beautiful, loved);
        System.out.println(solution);
    }
}
