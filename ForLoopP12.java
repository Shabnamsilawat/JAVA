import java.util.Scanner;
public class ForLoopP12 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        for(int i =1; i<=n; i++){
            //Printing the spaces first
            for(int j=1; j<=n-i; j++){
           System.out.print(" ");
        }
        //for printing numbers
        for(int j = 1; j<=i; j++){
            System.out.print(j+ " ");
        }
        System.out.println();
    }
    sc.close();
}
}