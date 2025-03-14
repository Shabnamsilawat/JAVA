import java.util.Scanner;
public class SWITCH5 {
    public  static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1-5");
        int greetings = sc.nextInt();
        switch(greetings){
            case 1:
            System.out.println("Hello");
            break;
            case 2:
            System.out.println("Namaste");
            break;
            case 3:
            System.out.println("Bonjour");
            break;
            case 4:
            System.out.println("Konichiwa");
            break;
            case 5:
            System.out.println("Annyeonghaseyo");
            break;
            default:
            System.out.println("Invalid input");
        }
        sc.close();
        }
    }

