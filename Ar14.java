public class Ar14 {

    public static int[] findMinMax(int[] inputArray) {
        int min = inputArray[0];
        int max = inputArray[0];

       
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < min) {
                min = inputArray[i];
            }
            if (inputArray[i] > max) {
                max = inputArray[i];
            }
        }

       
        return new int[] {min, max};
    }

    public static void main(String[] args) {
        int[] numbers = {5, 1, 9, 3, 7};
        int[] result = findMinMax(numbers);

        System.out.println("Min: " + result[0]);
        System.out.println("Max: " + result[1]);
    }
}

    

