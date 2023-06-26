public class main4 {
    static int solution(int[] inputArray) {

        int i = 0;
        int aux;
        int[] max = new int[inputArray.length - 1];

        while (i < inputArray.length - 1) {
            aux = inputArray[i] * inputArray[i + 1];
            max[i] = aux;
            i++;
        }

        int j = 0;
        int largest = max[0];
        while (j < max.length - 1) {
            if (max[j] > largest) {
                largest = max[j];
            }
            j++;
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] inputArray = {3, 6, -2, -5, 7, 3};
        System.out.println(solution(inputArray));
    }
}
