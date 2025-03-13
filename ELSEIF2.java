import java.util.Scanner;
public class ELSEIF2 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        if(num==0){
            System.out.println("The number is zero");
        }
        else if(num>0){
            if(num%2==0){
                System.out.println("The entered number is positive and even");
            }else{
            System.out.println("The entered number is positive and odd");
            }
        }else {
            System.out.println("The number is negative");
        }
        sc.close();
    }
}
