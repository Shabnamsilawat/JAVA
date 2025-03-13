import java.util.Scanner;
public class ELSEIF3 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a colour red, yellow or green ");
        String colour = sc.nextLine();
        if(colour=="Red"){
            System.out.println("STOP!");
        }else if(colour=="Yellow"){
            System.out.println("Get ready");
        }else{
            System.out.println("GO!");
        }
        sc.close();
    }
}
