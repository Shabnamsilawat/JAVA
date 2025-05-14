import java.util.Scanner;
public class dowhile4 {
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num;
    do{
        System.out.println("Enter the number of digit(0 to stop)");
        num = sc.nextInt();
        System.out.println("You have entered:"+num);
    }while(num!=0);
    sc.close();   
   } 
}
