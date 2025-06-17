import java.util.Arrays;

public class Ar6 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9, 11, 11, 13};

        int index = Arrays.binarySearch(numbers, 7);
        System.out.println(index); // Should print 3

        index = Arrays.binarySearch(numbers, 8);
        System.out.println(index); // Should print -5

        index = Arrays.binarySearch(numbers, 11);
        System.out.println(index); // Should print 5 or 6
    }
}
