import java.util.Scanner;
public class while6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of num:");
        int num=sc.nextInt();
        int original = num;
        int reversed =0;
        while(num!=0){
            int digit = num%10;
            reversed = reversed*10+digit;
            num/=10;
        }
        if(original==reversed){
            System.out.println(original+ "is a plaindrome");
        }else{
            System.out.println(original+ "is not a plaindrome");
        }
        sc.close();
    }
    
}
