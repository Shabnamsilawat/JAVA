import java.util.Scanner;
public class IFELSE5 {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the first side");
        int a = sc.nextInt();
        System.out.println("Enter the second side");
        int b = sc.nextInt();
        System.out.println("Enter the third side");   
        int c = sc.nextInt();
        if(a==b||b==c){
        System.out.println("The triangle is equilateral");
        }
        else if(a==b||b==c||a==c){
       System.out.println("The triangle is isosceles");
       }
       else{
        System.out.println("The traingle is scalene");
       }
       sc.close();
    }
}
