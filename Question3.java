import java.util.*;
//To print numbers that are equal,lesser or greater than using if else
public class Question3 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b){
            System.out.println("equal");
        }else{
            if(a>b){
                System.out.println("A is greater than b");
            }else{
                System.out.println("A is lesser");
            }
        }

    }
    
}
