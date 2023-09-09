package arcade.theCore.introGates;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LateRide {
    static int solution(int n) {
        int hour = n / 60;
        int minutes = n % 60;
        String time = String.valueOf(hour) + String.valueOf((minutes));
        String[] timeArray = time.split("");
        int sum = 0;
        for (String number : timeArray) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }

    static int solution2(int n) {
        int hours = n / 60;
        int minutes = n % 60;
        return hours / 10 + hours % 10 + minutes / 10 + minutes % 10;
    }

    public static void main(String[] args) {
        int minutes = 808;
        int solution = solution2(minutes);
        System.out.println(solution);
    }

}
