import java.util.Scanner;
public class ForloopP10 {
public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows: ");
    int n = sc.nextInt();
    //Printing stars for the upper left half
    for(int i =1; i<=n; i++){
        for(int j=1; j<=i;j++){
            System.out.print("*");
        }
        //Printing spaces for the first half
        for(int j=1; j<=2*(n-i); j++){
            System.out.print(" ");
        }
        //Printing stars in upper right half
        for(int j =1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    //Printing pattern in the lower left half
    for(int i = n; i>=1;i--){
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        //Printing the spaces in the lower half
        for(int j=1; j<=2*(n-i);j++){
            System.out.print(" ");
        }
        //Printing stars for the lower right half
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    sc.close();
}
    
}