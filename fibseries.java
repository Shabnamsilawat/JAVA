import java.util.Scanner;
public class fibseries {
    public static void main (String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        System.out.println(" Fibonacci series upto " + n + " "+ "terms is");
        for (int i = 0; i<n ; i ++){
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        sc.close();
    }
    
}
