/*Print the greeting
1-	Hello
2-	Namaste
3-	Bonjour(using switch statement)
 */

import java.util.*;
public class Practice9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch(button){
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("Namaste");
            break;
            case 3: System.out.println("Bonjour");
            break;
            default: System.out.println("Invalid input");
        }
    }
    
}
