import java.util.*;
public class XpowerN {
    public static double power(double x , int n){
        return Math.pow(x,n);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number (x): ");
        double x = sc.nextDouble();
        System.out.println("Enter the exponent(n): ");
        int n = sc.nextInt();
        double result = power(x,n);
        System.out.println(x + "raised to the power of " +n + "is " + result);
    }
    
}
