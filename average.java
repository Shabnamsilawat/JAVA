//Enter 3 numbers from the user and make a function to print their average
import java.util.*;
public class average {
    public static void  printAverage(int a, int b, int c){
     int average = (a+b+c)/3;
     System.out.println("The average of the three numbers is: "+ average);
        }
        public static void main (String args []){
            Scanner sc = new Scanner(System.in);
         System.out.println("Enter the first mumber: ");
         int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2= sc.nextInt();
        System.out.println("Enter the third number: ");
        int num3= sc.nextInt();
        printAverage(num1, num2, num3);
            }
        }
    

