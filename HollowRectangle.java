import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the dimensions of the rectangle
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Generate the hollow rectangle
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                // Print '*' for the boundary, otherwise print space
                if (i == 1 || i == rows || j == 1 || j == columns) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
