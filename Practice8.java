/*Print the greeting
1-	Hello
2-	Namaste
3-	Bonjour(using else if)
 */ 

import java.util.*;
public class Practice8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        if(button==1){
            System.out.println("Hello");
        }else if (button==2){
            System.out.println("Namaste");
        }else if (button==3){
            System.out.println("Bonjour");
        }else{
            System.out.println("Invalid input");
        }
    }
    
}
