//write a function to print the sum of all odd numbers from 1 to n
import java.util.*;
public class OddNumberSum {
    public static void printOddSum(int n){
        int sum = 0;
        for (int i = 1; i<=n; i+=2){
            sum +=i;
        }
        System.out.println("The sum of all odd number from 1 to " + n + " is: "+ sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("Enter a positive integer: ");
int n = sc.nextInt();
printOddSum(n);
        
    }
}
