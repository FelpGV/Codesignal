package arcade.theCore.atTheCrossroads;

public class TennisSet {
    static boolean solution(int score1, int score2) {
        return score1 == 6 && score2 < 5 ||
                score2 == 6 && score1 < 5 ||
                (score1 == 7 && (score2 == 5 || score2 == 6)) ||
                (score2 == 7 && (score1 == 5 || score1 == 6));
    }

    public static void main(String[] args) {
        int score1 = 7;
        int score2 = 7;
        boolean solution = solution(score1, score2);
        System.out.println(solution);
    }

}
