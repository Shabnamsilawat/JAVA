import java.util.*;
public class GCDcalculator {
    public static int findGCD(int a, int b){
        while(b!=0){
            int temp=b;
            b = a%b;
            a = temp;

        }
     return a;

    }
    public static void main(String args[]){
        int num1 = 52;
        int num2 = 98;
        System.out.println("GCD Of " + num1+ " " + "and " + num2+ " "+ "is: " + findGCD(num1,num2));
    }
    
}
