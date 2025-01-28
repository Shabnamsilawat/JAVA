//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros instead.
import java.util.Scanner; 
public class CountNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveCount = 0; 
        int negativeCount = 0; 
        int zeroCount = 0;     
        String choice;         
        do {
            System.out.print("Enter a number: "); 
            int number = scanner.nextInt();      
            if (number > 0) {
                positiveCount++; 
            } else if (number < 0) {
                negativeCount++; 
            } else {
                zeroCount++;     
            }
            System.out.print("Do you want to continue? (yes/no): ");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("yes")); 
        System.out.println("Positive numbers count: " + positiveCount);
        System.out.println("Negative numbers count: " + negativeCount);
        System.out.println("Zero count: " + zeroCount);
        scanner.close();
    }
}