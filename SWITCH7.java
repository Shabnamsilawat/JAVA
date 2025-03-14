import java.util.Scanner;
public class SWITCH7 {
   public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter number a: ");
    int a = sc.nextInt();
    System.out.println("Enter number b: ");
    int b = sc.nextInt();
    System.out.println("Enter an operator: ");
    int operator = sc.nextInt();
    switch (operator){
        case 1:
        System.out.println(a+b);
        break;
        case 2:
        System.out.println(a-b);
        break;
        case 3:
        System.out.println(a*b);
        break;
        case 4:
        if(b==0){
            System.out.println("Invalid division");
        }else{
            System.out.println(a/b);
        }
            break;
            case 5:
            if(b==0){
                System.out.println("Invalid division");
            }else{
                System.out.println(a%b);
            }
            break;
            default:
            System.out.println("Invalid input");
        }
        sc.close();
        }
    }
   

