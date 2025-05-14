import java.util.Scanner;
public class while4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of i:");
        int i = sc.nextInt();
        int factorial = 1;
        while(i<=n){
            factorial*=i;
            i++;
        }
        System.out.println("Factorial is:"+ factorial);
        sc.close();
    }
}
