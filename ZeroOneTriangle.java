import java.util.Scanner;

public class ZeroOneTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: Number of rows
        System.out.print("Enter the n4umber of rows: ");
        int rows = scanner.nextInt();
        
        // Logic to print the 0-1 triangle
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                // Alternate between 0 and 1
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
