import java.util.Scanner;
public class dowhile3 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of digits:");
        int num = sc.nextInt();
        int reversed = 0;
        do{
            int digit = num%10;
            reversed = reversed*10+digit;
            num/=10;
        }while(num!=0);
        System.out.println("Reversed number of digits are: "+ reversed);
        sc.close();
    }
}
