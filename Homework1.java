/*Make a calculator. Take 2 numbers ( a &b) from the user and an operation as follows.
•	Addition (a+b)
•	Subtraction (a-b)
•	Multiplication(a*b)
•	Division(a/b)
•	Remainder (a%b)
Calculate the result according to the operation given and display it to the user.
 */
import java.util.*;
public class Homework1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int operator = sc.nextInt();
        switch (operator){
        case 1: System.out.println(a+b);
            break;
            case 2: System.out.println(a-b);
            break;
            case 3: System.out.println(a*b);
            break;
            case 4: if (b==0){
                System.out.println("Invalid division");
            }else{
                System.out.println(a/b);
            }
            break;
            case 5: if (b==0){
                System.out.println("Invalid division");
            }else{
                System.out.println(a%b);
            }
            break;
            default: System.out.println("Invalid operator");
        }
    }
    
}
