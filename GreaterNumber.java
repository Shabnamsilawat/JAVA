//Write a function which takes in two numbers and returns the greater of those two 
public class GreaterNumber {
    // Function to find and return the greater of two numbers
    public static int findGreater(int a, int b) {
        return (a > b) ? a : b; // Use a ternary operator to determine the greater number
    }
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 25;

        int greater = findGreater(num1, num2);
        System.out.println("The greater number between " + num1 + " and " + num2 + " is: " + greater);
    }

}