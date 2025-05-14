import java.util.Scanner;
public class while3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n:");
        int n = sc.nextInt();
        System.out.println("Enter the number of i:");
        int i = sc.nextInt();
        int sum =0;
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println("Sum is:"+sum);
        sc.close();
    }
    
}
