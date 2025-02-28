import java.util.Scanner;
public class Stringbuilders8 {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        String email = sc.next();
        StringBuilder username = new StringBuilder(email);
        System.out.println(username);
        System.out.println(username.length());
        username.delete(5,16);
        System.out.println("The username is: "+ username);
        sc.close();
    }
    
}
