package arcade.theCore.Corner;

public class MirrorBits {
    static int solution(int a) {
        String binaryString = Integer.toBinaryString(a);
        char[] binary = binaryString.toCharArray();
        int left = 0;
        int right = binary.length - 1;
        while (left < right) {
            char aux = binary[left];
            binary[left] = binary[right];
            binary[right] = aux;
            left++;
            right--;
        }
        String mirror = new String((binary));
        return Integer.parseInt(mirror, 2);
    }

    public static void main(String[] args) {
        int a = 97;
        int solution = solution(a);
        System.out.println(solution);
    }
}

