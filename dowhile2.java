import java.util.Scanner;
public class dowhile2 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum=0;
        do{
            int digit = num%10;
            sum+=digit;
            num/=10;
        }while(num!=0);
        System.out.println("The sum of the digits are"+ sum);
        sc.close();
    }
}
