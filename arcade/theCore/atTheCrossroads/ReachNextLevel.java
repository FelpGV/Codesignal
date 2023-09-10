package arcade.theCore.atTheCrossroads;

public class ReachNextLevel {
    static boolean solution(int experience, int threshold, int reward) {
        return experience + reward >= threshold;
    }

    public static void main(String[] args) {
        int experience = 10;
        int threshold = 15;
        int reward = 5;
        boolean solution = solution(experience, threshold, reward);
        System.out.println(solution);
    }

}
