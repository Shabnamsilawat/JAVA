import java.util.Scanner;;
public class ForloopP11{
    public static void main (String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of rows: ");
       int n = sc.nextInt();
        for (int i = 1; i<=n; i++){
            //spaces
            for(int j=1;  j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j =1; j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
