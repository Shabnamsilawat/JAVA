import java.util.Scanner;
public class dowhile5 {
    public static void main(String args[]){
        Scanner sc =  new Scanner (System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int original = num;
        int reversed = 0;
        do{
            int digit = num%10;
            reversed = reversed *10+digit;
            num/=10;
        }while(num!=0);
        if(original==reversed){
            System.out.println(original+ " " + "is a plaindrome");
        }else{
            System.out.println(original+" "+ "is not a palindrome");
            sc.close();
        }
    }
    
}
