public class HalfPyramid {
    public static void main(String[] args) {
        int n = 4; // Number of rows in the pyramid
        
        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Inner loop for printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}

    
